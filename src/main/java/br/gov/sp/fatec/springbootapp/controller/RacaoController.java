package br.gov.sp.fatec.springbootapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.gov.sp.fatec.springbootapp.entity.Racao;
import br.gov.sp.fatec.springbootapp.service.RacaoService;

@RestController
@RequestMapping("/racao")
@CrossOrigin
public class RacaoController {

    @Autowired
    private RacaoService racaoService;

    @PostMapping("/cadastrar")
    public ResponseEntity<Racao> cadastrarRacao(@RequestBody Racao racao) {
        Racao novaRacao = racaoService.cadastrarRacao(racao);
        return new ResponseEntity<>(novaRacao, HttpStatus.CREATED);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Racao>> listarTodasRacoes() {
        List<Racao> racoes = racaoService.listarTodasRacoes();
        return new ResponseEntity<>(racoes, HttpStatus.OK);
    }

    @GetMapping("/buscar-por-estoque-nota")
    public ResponseEntity<List<Racao>> buscarRacoesPorEstoqueENota(@RequestParam("estoque") Float estoqueParam, @RequestParam("nota") Integer notaParam) {
        List<Racao> racoes = racaoService.buscarRacoesPorEstoqueENota(estoqueParam, notaParam);
        return new ResponseEntity<>(racoes, HttpStatus.OK);
    }
}

