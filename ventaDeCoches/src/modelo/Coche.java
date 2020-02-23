/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author raul
 */
public class Coche {
    public enum CategoriaAmbiental{
    A, B, C, ECO, ZERO
}
    private CategoriaAmbiental categoriaAmbiental;
    private String marca;
    private String modelo;
    private String color;
    private String tipoDeCombustible;
    private int cilindrada;
    private int numeroDePlazas;
    
    private int numeroDePuertas;
    private boolean descapotable = true;
    
    public Coche(String marca, String modelo, String color, String combus, int cilindrada, int nPlazas, CategoriaAmbiental catAmb, int numPuer, boolean desc){
        this.marca = marca;
        this.modelo = modelo;
        this.color =color;
        this.tipoDeCombustible = combus;
        this.cilindrada = cilindrada;
        this.numeroDePlazas = nPlazas;
        this.categoriaAmbiental = catAmb;
        this.numeroDePuertas = numPuer;
        this.descapotable = desc;
    }
    public Coche() {
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.tipoDeCombustible = "";
        this.cilindrada = 0;
        this.numeroDePlazas = 0;
        this.categoriaAmbiental = null;
        this.numeroDePuertas = 0;
        this.descapotable = true;
    }

    public CategoriaAmbiental getCategoriaAmbiental() {
        return categoriaAmbiental;
    }

    public void setCategoriaAmbiental(CategoriaAmbiental categoriaAmbiental) {
        this.categoriaAmbiental = categoriaAmbiental;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getNumeroDePlazas() {
        return numeroDePlazas;
    }

    public void setNumeroDePlazas(int numeroDePlazas) {
        this.numeroDePlazas = numeroDePlazas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }


}
