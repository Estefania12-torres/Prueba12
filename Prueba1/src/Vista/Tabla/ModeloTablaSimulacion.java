/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Tabla;

import Controlador.TDA.listas.ListaEnlazada;
import javax.swing.table.AbstractTableModel;
import modelo.Simulacion;

/**
 *
 * @author Estefania Jean Encalada
 */
public class ModeloTablaSimulacion extends AbstractTableModel{
        private ListaEnlazada <Simulacion> simulaciones ;
  
    //get and set de la Lista del Objeto Boleto    
    public ListaEnlazada<Simulacion> getSimulaciones() {
        return simulaciones;
    }

    public void setBoletos(ListaEnlazada<Simulacion> simulaciones) {
        this.simulaciones = simulaciones;
    }
    
    //obtener cantidad de filas
    public int getRowCount() {
        return simulaciones.getLength();
    }
     
    //obtener el numero de columna
    public int getColumnCount() {
        return 4;
    }

    //Obtener el valor para una celda específica en la tabla
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            if (simulaciones == null || simulaciones.isEmpty()) {
                System.out.println("fallo");
                return null;
            }
            Simulacion b = simulaciones.getInfo(rowIndex);

            return switch (columnIndex) {
                case 0 -> (b != null) ? b.getId(): "";
                case 1 -> (b != null) ? b.getCodigo():"";
                case 2 -> (b != null) ? b.getDescripcion(): "";
                        
                 
                default -> null;
            };
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //Obtener el nombre de la columna
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "CODIGO";
            case 2:
                return "DESCRIPCION";
           
            default:
                return null;
        }
    }

    
}
