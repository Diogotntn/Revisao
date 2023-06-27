/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author Aluno
 */
public enum Setorr {
    TECNOLOGIA ("Tecnologia"),
    MATERIAL_CONSTRUCAO ("Material Construção"),
    MATERIA_PRIMA ("Materia prima"),
    ALIMENTICIO ("Alimenticio");
    private String nome;

    private Setorr(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}
