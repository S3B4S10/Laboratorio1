package org.mypackage.hello;

import java.time.Clock;

public class NameHandler {
    private String nombre;
    private String nacimiento;
    private String ingreso;
    private String semestreIngreso;
    private String semestresCursados;
    
    public NameHandler(){
        nombre = null;
        nacimiento = null;
        ingreso = null;
        semestreIngreso = null;
        semestresCursados = null;
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nacimiento
     */
    public String getNacimiento() {
        return String.valueOf(2020-Integer.parseInt(nacimiento));
    }

    /**
     * @param nacimiento the nacimiento to set
     */
    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * @return the ingreso
     */
    public String getIngreso() {
        return ingreso;
    }

    /**
     * @param ingreso the ingreso to set
     */
    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    /**
     * @return the semestreIngreso
     */
    public String getSemestreIngreso() {
        return semestreIngreso;
    }

    /**
     * @param semestreIngreso the semestreIngreso to set
     */
    public void setSemestreIngreso(String semestreIngreso) {
        this.semestreIngreso = semestreIngreso;
    }
    
    /**
     * @return the semestresCursados
     */
    public String getSemestresCursados() {
        return calcularSemestre(ingreso, semestreIngreso);
    }

    /**
     * @param semestresCursados the semestresCursados to set
     */
    public void setSemestresCursados(String semestresCursados) {
        this.semestresCursados = semestresCursados;
    }
    
    private String calcularSemestre(String añoIngreso, String semestreIngreso){
        if(semestreIngreso.equals("1")){
            return (2020-Integer.parseInt(añoIngreso))*2+1+"";
        } else{
            return (2020-Integer.parseInt(añoIngreso))*2+"";
        }
    }
 
}
