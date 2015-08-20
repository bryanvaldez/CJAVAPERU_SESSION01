/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cjava.beans;

/**
 *
 * @author miguel Alumno
 */
public class Operacion extends Conversion {
    public String sumar(String e1, String e2){
        return aCadena(aReal(e1)+aReal(e2));
    }

}
