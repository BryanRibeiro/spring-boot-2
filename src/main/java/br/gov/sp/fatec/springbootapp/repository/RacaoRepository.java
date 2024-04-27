package br.gov.sp.fatec.springbootapp.repository;

import br.gov.sp.fatec.springbootapp.entity.Racao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RacaoRepository extends JpaRepository<Racao, Long> {

    List<Racao> findByQuantidadeEstoqueLessThanAndNotaGreaterThan(Float estoqueParam, Integer notaParam);
}
