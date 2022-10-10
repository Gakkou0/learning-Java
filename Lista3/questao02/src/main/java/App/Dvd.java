/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author fhugo
 */
public class Dvd {
    private String titulo;
    private int codigo;
    private int anoLancamento;
    private String genero;
    private double valorPago;
    private String gravadora;
    private Autor autor;

    public Dvd(String titulo, int codigo, int anoLancamento, String genero, double valorPago, String gravadora, Autor autor) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.valorPago = valorPago;
        this.gravadora = gravadora;
        this.autor = autor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    @Override
    public String toString(){
        return "";
    }
}
