package Cliente;

import java.util.Objects;

public class Cliente {
    private  String dni, nombre;
    private int edad;

    @Override
    public boolean equals (Object obj){
        boolean salir = false;
        if (obj instanceof Cliente o){
            salir= dni == o.dni;
        }
        return salir;
    }
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public Cliente(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
