package org.ufv.pro2.Back.de.proyectos2;

public class Usuario {
    private String nombre;
    private String contra;
    private int punto;


    public Usuario(String nombre, String contra, int punto) {
        this.nombre = nombre;
        this.contra = contra;
        this.punto = punto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getPunto() {
        return punto;
    }

    public void setPunto(int punto) {
        this.punto = punto;
    }
}
