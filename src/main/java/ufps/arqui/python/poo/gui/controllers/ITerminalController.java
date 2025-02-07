package ufps.arqui.python.poo.gui.controllers;

import java.io.IOException;
import ufps.arqui.python.poo.gui.exceptions.Exceptions;

/**
 * Controlador de la terminal del proyecto.
 *
 * Donde el usuario puede ejecutar metodos de python.
 * @author Omar Ramón Montes
 */
public interface ITerminalController {

    /**
     * Metodo para ejecutar comando en python.     *
     * @param commando comando de python para ejecutar.
     */
    void ejecutarComando(String commando) throws Exceptions;

    /**
     * Metodo para reiniciar la terminal
     * @throws java.io.IOException
     */
    void reiniciarTerminal() throws Exceptions;
}
