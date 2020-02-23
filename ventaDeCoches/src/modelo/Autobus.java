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
public class Autobus {
    
     public enum CategoriaAmbiental{
    A, B, C, ECO, ZERO
    }
     
    private String marca;
    private String modelo;
    private String color;
    private String tipoDeCombustible;
    private int cilindrada;
    private int numeroDePlazas;
    private  CategoriaAmbiental categoriaAmbiental;
    private boolean publicoPrivado = true;
    private boolean articuladoNoArticulado = true;
    private boolean UrbanoNoUrbano = true;
    
    public Autobus(String marca, String modelo, String color, String combus, int cilindrada, int nPlazas, CategoriaAmbiental  catAmb, boolean publicoPrivado, boolean articuladoNoArticulado, boolean UrbanoNoUrbano ){
        this.marca = marca;
        this.modelo = modelo;
        this.color =color;
        this.tipoDeCombustible = combus;
        this.cilindrada = cilindrada;
        this.numeroDePlazas = nPlazas;
        this.categoriaAmbiental = catAmb;
        this.publicoPrivado = publicoPrivado;
        this.articuladoNoArticulado = articuladoNoArticulado;
        this.UrbanoNoUrbano = UrbanoNoUrbano;
    }
    public Autobus() {
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.tipoDeCombustible = "";
        this.cilindrada = 0;
        this.numeroDePlazas = 0;
        this.categoriaAmbiental = null;
        this.publicoPrivado = true;
        this.articuladoNoArticulado = true;
        this.UrbanoNoUrbano = true;
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

    public CategoriaAmbiental getCategoriaAmbiental() {
        return categoriaAmbiental;
    }

    public void setCategoriaAmbiental(CategoriaAmbiental categoriaAmbiental) {
        this.categoriaAmbiental = categoriaAmbiental;
    }

    public boolean isPublicoPrivado() {
        return publicoPrivado;
    }

    public void setPublicoPrivado(boolean publicoPrivado) {
        this.publicoPrivado = publicoPrivado;
    }

    public boolean isArticuladoNoArticulado() {
        return articuladoNoArticulado;
    }

    public void setArticuladoNoArticulado(boolean articuladoNoArticulado) {
        this.articuladoNoArticulado = articuladoNoArticulado;
    }

    public boolean isUrbanoNoUrbano() {
        return UrbanoNoUrbano;
    }

    public void setUrbanoNoUrbano(boolean UrbanoNoUrbano) {
        this.UrbanoNoUrbano = UrbanoNoUrbano;
    }



    
}
