
import Enums.Setor;
import Enums.Setorr;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Fornecedor extends Juridica{
    private Setorr setor;
    private Produto produto;

    public Fornecedor(Setorr setor, Produto produto, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.setor = setor;
        this.produto = produto;
    }

    public Setorr getSetor() {
        return setor;
    }

    public void setSetor(Setorr setor) {
        this.setor = setor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n setor:" + setor + 
                "\n produto:" + produto ;
    }
    
    
}
