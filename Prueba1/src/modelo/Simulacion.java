/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Controlador.TDA.listas.ListaEnlazada;

/**
 *
 * @author Estefania , Jean 
 */
public class Simulacion {
    private ListaEnlazada<Ventanilla> ventanilla;
    private Integer id;
    private Integer codigo;
    private String descripcion;

    public ListaEnlazada<Ventanilla> getVentanilla() {
        return ventanilla;
    }

    public void setVentanilla(ListaEnlazada<Ventanilla> ventanilla) {
        this.ventanilla = ventanilla;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
    
    
    
}
