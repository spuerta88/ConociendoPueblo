package com.example.conociendopueblo;

import java.io.Serializable;

public class Pueblo implements Serializable {

    String titulo, desc,imagen;


    public Pueblo(String titulo, String desc, String imagen) {
        this.titulo = titulo;
        this.desc = desc;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
