/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Controlador.TDA.listas.ListaEnlazada;
import modelo.Tramite;
import modelo.Ventanilla;

/**
 *
 * @author Usuario
 */
public class VentanillaControl {
    private Ventanilla ventanilla;
    private ListaEnlazada<Ventanilla> ventanillas;//lista Objeto

    //constructor 
    public VentanillaControl(){
        this.ventanillas = new ListaEnlazada<>();//inicializa
        this.ventanilla= new Ventanilla();
    }

    public ListaEnlazada<Ventanilla> getVentanillas() {
        return ventanillas;
    }

    public void setVentanillas(ListaEnlazada<Ventanilla> ventanillas) {
        this.ventanillas = ventanillas;
    }

     
    //guardar lista
    public Boolean guardar(){
        if(ventanilla !=null){
            ventanillas.add(ventanilla);
            return true;
        }
        return false;
    }
    //obtener objeto boleto
    public Ventanilla getVenVentanilla() {
        if (ventanilla == null) {
            ventanilla = new Ventanilla();
        }
        return ventanilla ;
    } 
    
    public void setVentanilla(Ventanilla ventanillas) {
        this.ventanilla = ventanillas;
    }
 
    
}
