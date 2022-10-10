/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author fhugo
 */
public class Autor {

    private String nome;
    private boolean solo;

    public Autor(String nome, boolean solo) {
        this.nome = nome;
        this.solo = solo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isSolo() {
        return solo;
    }

    public void setSolo(boolean solo) {
        this.solo = solo;
    }
    
    @Override
    public String toString(){
        return "Autor: " + getNome() +
               "\n Em carreira solo: " + isSolo();
    }
}
