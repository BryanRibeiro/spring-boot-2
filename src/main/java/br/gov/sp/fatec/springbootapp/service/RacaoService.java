package br.gov.sp.fatec.springbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.gov.sp.fatec.springbootapp.entity.Racao;
import br.gov.sp.fatec.springbootapp.repository.RacaoRepository;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class RacaoService {

    @Autowired
    private RacaoRepository racaoRepository;

    public Racao cadastrarRacao(Racao racao) {
        if (racao.getDataHoraUltimaCompra() == null) {
            racao.setDataHoraUltimaCompra(LocalDateTime.now());
        }
        return racaoRepository.save(racao);
    }

    public List<Racao> listarTodasRacoes() {
        return racaoRepository.findAll();
    }

    public List<Racao> buscarRacoesPorEstoqueENota(Float estoqueParam, Integer notaParam) {
        return racaoRepository.findByQuantidadeEstoqueLessThanAndNotaGreaterThan(estoqueParam, notaParam);
    }
}