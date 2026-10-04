/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucas
 */
    public class Livro {
        
    private String titulo;
    private String autor;
    private String genero;
    private int ano;
    private int exemplares;
    private String codigo;

    public Livro(String titulo, String autor, String genero, int ano, int exemplares, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
        this.exemplares = exemplares;
        this.codigo = codigo;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getGenero() { return genero; }
    public int getAno() { return ano; }
    public int getExemplares() { return exemplares; }
    public String getCodigo() { return codigo; }
    
    }
    
