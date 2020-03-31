package cl.ubb.fastfood;

import android.widget.ImageView;

import java.io.Serializable;

public class Sandwich implements Serializable {

    String nombre, descripcion, precio;
    int img;

    public Sandwich(String nombre, String descripcion, String precio, int img) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.img = img;
    }
}
