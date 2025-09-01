package com.devsenior.svacca;

public class Gerente extends Empleado {
    private String departamento;
    
    public Gerente(String nombre, Integer edad, Double salario, String departamento){
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
       
        return "Gerente{" + 
                "departamento='" + departamento + '\'' +
                "} " + super.toString();
    }
}
