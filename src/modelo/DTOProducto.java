/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class DTOProducto {
    private int idProducto;
    private String nombreProd;
    private String descripcionprod;
    private double precioprod;
    private int stock;
    private double medidas;
    private boolean resultadoEncontrado;

    public DTOProducto() {
    }

    public DTOProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public DTOProducto(int idProducto, String nombreProd, String descripcionprod, double precioprod, int stock, double medidas) {
        this.idProducto = idProducto;
        this.nombreProd = nombreProd;
        this.descripcionprod = descripcionprod;
        this.precioprod = precioprod;
        this.stock = stock;
        this.medidas = medidas;
    }
    
    public DTOProducto(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public String getDescripcionprod() {
        return descripcionprod;
    }

    public void setDescripcionprod(String descripcionprod) {
        this.descripcionprod = descripcionprod;
    }

    public double getPrecioprod() {
        return precioprod;
    }

    public void setPrecioprod(double precioprod) {
        this.precioprod = precioprod;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getMedidas() {
        return medidas;
    }

    public void setMedidas(double medidas) {
        this.medidas = medidas;
    }
    
    public boolean isResultadoEncontrado() {
        return resultadoEncontrado;
    }

    public void setResultadoEncontrado(boolean resultadoEncontrado) {
        this.resultadoEncontrado = resultadoEncontrado;
    }
}