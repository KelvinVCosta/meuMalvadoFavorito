package edu.logging;

import com.sun.org.apache.bcel.internal.generic.LOOKUPSWITCH;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {

    private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());

    public static void main (String[] args){
        LOGGER.info("Logger name: " + LOGGER.getName());
        LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");

        //Array de tamanho 3
        int[] lista = {1,2,3};
        int index = 4;
        LOGGER.config("Index configurado com valor: " + index);

        try{
            System.out.print(lista[index]);
        } catch (ArrayIndexOutOfBoundsException ex){
            LOGGER.log(Level.SEVERE, "Ocorreu uma execeção", ex);
        }
    }
}
