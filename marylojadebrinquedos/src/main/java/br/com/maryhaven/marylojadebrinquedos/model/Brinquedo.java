package main.java.br.com.maryhaven.marylojadebrinquedos.model;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Brinquedo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double preco;
    private String imagemCaminho;
    private String marca;
    private String descricao;

    // Relacionamento muitos-para-muitos com a entidade Beneficio
    @ManyToMany
    @JoinTable(
        name = "brinquedo_beneficio",
        joinColumns = @JoinColumn(name = "brinquedo_id"),
        inverseJoinColumns = @JoinColumn(name = "beneficio_id"))
    private List<Beneficio> beneficios;

    // Relacionamento muitos-para-muitos com a entidade Categoria
    @ManyToMany
    @JoinTable(
        name = "brinquedo_categoria",
        joinColumns = @JoinColumn(name = "brinquedo_id"),
        inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    private List<Categoria> categorias;
}

