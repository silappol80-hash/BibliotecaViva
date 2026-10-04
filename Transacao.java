/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucas
 */
public class Transacao {
    
     private String usuario;
    private String livro;
    private String tipoOperacao;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String codigo;

    public Transacao(String usuario, String livro, String tipoOperacao,
                     String dataEmprestimo, String dataDevolucao, String codigo) {
        this.usuario = usuario;
        this.livro = livro;
        this.tipoOperacao = tipoOperacao;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.codigo = codigo;
    }
    
    public String getUsuario() { return usuario; }
    public String getLivro() { return livro; }
    public String getTipoOperacao() { return tipoOperacao; }
    public String getDataEmprestimo() { return dataEmprestimo; }
    public String getDataDevolucao() { return dataDevolucao; }
    public String getCodigo() { return codigo; }
    
}
