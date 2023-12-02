package main.java.br.com.maryhaven.marylojadebrinquedos.service;

import br.com.maryhaven.marylojadebrinquedos.model.Brinquedo;
import br.com.maryhaven.marylojadebrinquedos.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrinquedoServiceImpl implements BrinquedoService {

    private final BrinquedoRepository brinquedoRepository;

    @Autowired
    public BrinquedoServiceImpl(BrinquedoRepository brinquedoRepository) {
        this.brinquedoRepository = brinquedoRepository;
    }

    @Override
    public List<Brinquedo> listarBrinquedos() {
        return brinquedoRepository.findAll();
    }

    @Override
    public Brinquedo encontrarPorId(Long id) {
        return brinquedoRepository.findById(id).orElse(null);
    }

    @Override
    public Brinquedo salvarBrinquedo(Brinquedo brinquedo) {
        return brinquedoRepository.save(brinquedo);
    }

    @Override
    public void excluirBrinquedo(Long id) {
        brinquedoRepository.deleteById(id);
    }
}

