package br.com.maryhaven.marylojadebrinquedos.service;

import br.com.maryhaven.marylojadebrinquedos.model.Brinquedo;

import java.util.List;

public interface BrinquedoService {
    List<Brinquedo> listarBrinquedos();

    Brinquedo encontrarPorId(Long id);

    Brinquedo salvarBrinquedo(Brinquedo brinquedo);

    void excluirBrinquedo(Long id);
}