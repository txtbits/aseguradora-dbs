import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Christian Forcada Vitalla
 * @description Clase encargada de establecer el modelo de la tabla.
 * 
 */
public class HospitalTableModel extends AbstractTableModel{
       
    private List<String> columnNames=new ArrayList();
    private List<List> data=new ArrayList();
    
    {
        columnNames.add("CÓDIGO DE HOSPITAL");
        columnNames.add("NOMBRE de HOSPITAL");
        columnNames.add("NÚMERO DE CAMAS");
    }
    
    //Metodo que me añade una nueva fila.
    public void addRow(List rowData){
        data.add(rowData);
        fireTableRowsInserted(data.size()-1, data.size()-1); 
    }
    
    //Devuelve el numero de columns.
    @Override
    public int getColumnCount(){
        return columnNames.size();
    }
    
    //Devuelve el numero de rows.
    @Override
    public int getRowCount(){
        return data.size();
    }
    
    
    //Devuelve el nombre de la columna indicada por int col.
    @Override
    public String getColumnName(int col){
        try{
            return columnNames.get(col);
        }catch(Exception e){
            return null;  
        }
    }
    
    //Devuelve el valor que hay en (x,y)=(row, col)
    @Override
    public Object getValueAt(int row, int col){
        return data.get(row).get(col);
    }
    
    //Devuelve el tipo de dato que hay en esta columna
    @Override
    public Class getColumnClass(int c){
        return getValueAt(0, c).getClass();
    }
}