package com.devsenior.svacca;

import org.apache.logging.log4j.*;

public class Empleado {
     private static final Logger logger = LogManager.getLogger(Empleado.class);

    private String nombre;
    private Integer edad;
    private Double salario;

    public Empleado(String nombre, Integer edad, Double salario){
        this.nombre = nombre;
        this.edad = edad;
        this. salario = salario;

        if (edad < 18) {
            logger.warn("El empleado " + nombre + "es menor de edad.");
        }
    }

    public void aumentarSalario(Double cantidad){
        if (salario < 0) {
            logger.warn("No se puede aumentar el salario es una cantidad negativa: " + cantidad);
            return;
        }
        this.salario += cantidad;       
    }

    @Override
    public String toString() {
        return "Empleado{" + 
                "nombre='" + nombre + '\'' +
                ", edad=" + edad + 
                ". salario=" + salario + 
                '}';
    }
    
}
