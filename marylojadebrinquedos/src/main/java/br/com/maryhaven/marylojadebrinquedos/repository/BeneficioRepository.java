package main.java.br.com.maryhaven.marylojadebrinquedos.repository;

import br.com.maryhaven.marylojadebrinquedos.model.Beneficio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficioRepository extends JpaRepository<Beneficio, Long> {
    // Nenhum método adicional necessário por enquanto
}

