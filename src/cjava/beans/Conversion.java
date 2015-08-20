/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cjava.beans;

/**
 *
 * @author miguel Alumno
 * @version 1.0
 */
public class Conversion {
    public String aCadena(int i){
        return String.valueOf(i);
    }
    public String aCadena(double d){
        return String.valueOf(d);
    }
    public int aEntero(String e){
        return Integer.parseInt(e);
    }
    public Double aReal(String r){
        return Double.parseDouble(r);
    }

}
