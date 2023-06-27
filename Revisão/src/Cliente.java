
import Enums.EstadoCivil;
import Enums.Genero;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Cliente extends Fisica{
    private int protcoloAtendimento;

    public Cliente(int protcoloAtendimento, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.protcoloAtendimento = protcoloAtendimento;
    }

    public int getProtcoloAtendimento() {
        return protcoloAtendimento;
    }

    public void setProtcoloAtendimento(int protcoloAtendimento) {
        this.protcoloAtendimento = protcoloAtendimento;
    }

    @Override
    public String toString() {
        return super.toString()+ 
                "\n protcoloAtendimento:" + protcoloAtendimento;
        
    }
    
    
}
