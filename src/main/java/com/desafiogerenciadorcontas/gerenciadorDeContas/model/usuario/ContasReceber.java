package com.desafiogerenciadorcontas.gerenciadorDeContas.model.usuario;

import com.desafiogerenciadorcontas.gerenciadorDeContas.Enum.TipoRecebido;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "contas_a_receber")
public class ContasReceber implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contasAReceber_id;
    @Column
    private String recebimento;

    private String status;
    @Column
    private BigDecimal valorRecebimento;
    @Column @NotNull
    private TipoRecebido tipoRecebido;
    @Column @NotNull
    private LocalDate dataDeVencimento;
    @Column
    private LocalDateTime dataDeRecebimento;
    @Column
    private Long usuario_id; // observar se esta certo

    @ManyToOne
    @JoinColumn(name = "usuarioModel", referencedColumnName = "id")
    private UsuarioModel usuarioModel;
}
