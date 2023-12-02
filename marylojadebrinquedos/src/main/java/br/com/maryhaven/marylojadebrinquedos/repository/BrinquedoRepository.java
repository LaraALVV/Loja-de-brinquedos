package br.com.maryhaven.marylojadebrinquedos.repository;

import br.com.maryhaven.marylojadebrinquedos.model.Brinquedo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrinquedoRepository extends JpaRepository<Brinquedo, Long> {
    // Nenhum método adicional necessário por enquanto
}