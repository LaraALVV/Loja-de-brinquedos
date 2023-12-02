package br.com.maryhaven.marylojadebrinquedos.model;

import java.util.List;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "brinquedo")
public class Brinquedo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String categoria;
    private double preco;
    private String imagemCaminho;
    private String codigo;
    private String marca;
    private String descricao;

    @ElementCollection
    @CollectionTable(name = "beneficios", joinColumns = @JoinColumn(name = "brinquedo_id"))
    @Column(name = "beneficio")
    private List<String> beneficios;

    @ElementCollection
    @CollectionTable(name = "catalogos", joinColumns = @JoinColumn(name = "brinquedo_id"))
    @Column(name = "catalogo")
    private List<String> catalogos;

    // Getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getImagemCaminho() {
        return imagemCaminho;
    }

    public void setImagemCaminho(String imagemCaminho) {
        this.imagemCaminho = imagemCaminho;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(List<String> beneficios) {
        this.beneficios = beneficios;
    }

    public List<String> getCatalogos() {
        return catalogos;
    }

    public void setCatalogos(List<String> catalogos) {
        this.catalogos = catalogos;
    }

    @Override
    public String toString() {
        return "Brinquedo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", preco=" + preco +
                ", imagemCaminho='" + imagemCaminho + '\'' +
                ", codigo='" + codigo + '\'' +
                ", marca='" + marca + '\'' +
                ", descricao='" + descricao + '\'' +
                ", beneficios=" + beneficios +
                ", catalogos=" + catalogos +
                '}';
    }
}
