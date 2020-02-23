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
public class Camion {
    public enum CategoriaAmbiental{
    A, B, C, ECO, ZERO
    }
    
    private String marca;
    private String modelo;
    private String color;
    private String tipoDeCombustible;
    private int cilindrada;
    private int numeroDePlazas;
    private CategoriaAmbiental categoriaAmbiental;
    private int tara;
    private int galibo;
    
    public Camion(String marca, String modelo, String color, String combus, int cilindrada, int nPlazas, CategoriaAmbiental catAmb, int tara, int galibo){
        this.marca = marca;
        this.modelo = modelo;
        this.color =color;
        this.tipoDeCombustible = combus;
        this.cilindrada = cilindrada;
        this.numeroDePlazas = nPlazas;
        this.categoriaAmbiental = catAmb;
        this.tara = tara;
        this.galibo = galibo;
    }
    public Camion() {
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.tipoDeCombustible = "";
        this.cilindrada = 0;
        this.numeroDePlazas = 0;
        this.categoriaAmbiental = null;
        this.tara = 0;
        this.galibo = 0;
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

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public int getGalibo() {
        return galibo;
    }

    public void setGalibo(int galibo) {
        this.galibo = galibo;
    }


    
}
