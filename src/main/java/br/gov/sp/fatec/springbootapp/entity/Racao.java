package br.gov.sp.fatec.springbootapp.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "rac_racao")
public class Racao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rac_id")
    private Long id;

    @Column(name = "rac_marca", unique = true, nullable = false)
    private String marca;

    @Column(name = "rac_data_hora_ultima_compra", nullable = false)
    private LocalDateTime dataHoraUltimaCompra;

    @Column(name = "rac_quantidade_estoque")
    private Float quantidadeEstoque;

    @Column(name = "rac_nota", nullable = false)
    private Integer nota;

    public Racao() {

    }

    public Racao(String marca, LocalDateTime dataHoraUltimaCompra, Float quantidadeEstoque, Integer nota) {
        this.marca = marca;
        this.dataHoraUltimaCompra = dataHoraUltimaCompra;
        this.quantidadeEstoque = quantidadeEstoque;
        this.nota = nota;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDateTime getDataHoraUltimaCompra() {
        return dataHoraUltimaCompra;
    }

    public void setDataHoraUltimaCompra(LocalDateTime dataHoraUltimaCompra) {
        this.dataHoraUltimaCompra = dataHoraUltimaCompra;
    }

    public Float getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Float quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
}
