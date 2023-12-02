package main.java.br.com.maryhaven.marylojadebrinquedos.repository;
import br.com.maryhaven.marylojadebrinquedos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    // Nenhum método adicional necessário por enquanto
}
