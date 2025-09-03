package com.devsenior.svacca;
 
import org.apache.logging.log4j.*;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        logger.info("Inciando la aplicación");

        //Cración de empleados y gerentes
        Empleado emp1 = new Empleado("Juan", 30, 3000.0);
        Gerente ger1 = new Gerente("Carlos", 40, 5000.0, "Ventas");
        
        logger.info("Informacion del empleado: " + emp1);
        logger.info("Información del gerente: " + ger1 );

        //aumntar el salario
        emp1.aumentarSalario(10d);
        ger1.aumentarSalario(15d);

        logger.info("Información del empleado despúes del aumento: " + emp1);
        logger.info("Salario del gerente despúes del aumento: " + ger1);

        logger.info("Finalizando la aplicación");
        logger.trace("Este es un mensaje de traza");
        logger.debug("Este es un mensje de depuración");
        logger.error("Este es un mensaje de error");
        logger.fatal("Este es un mensaje fatal");
    }
}