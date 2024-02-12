/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

/**
 *
 * @author AnthonyBrr
 */
public class Tarea {

    public static int length;
    //Atributos 
    private int idTarea;
    private String descripcion;
    private int prioridad;
    
    // 
    
    public Tarea(){
        
    }
    public Tarea(int idTarea, String descripcion, int prioridad){
        this.idTarea=idTarea;
        this.descripcion=descripcion;
        this.prioridad=prioridad;
        
    }

    public int getIdTarea() {
        return idTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    
    
}

