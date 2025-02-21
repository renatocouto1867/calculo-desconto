package com.manoelcampos.desconto;

import java.time.LocalDate;

public class DescontoAniversario implements DescontoStrategy{
    @Override
    public double calcularDesconto(Venda venda) {
        LocalDate dataNascimento = venda.getCliente().getDataNascimento();
        LocalDate dataAtual = LocalDate.now();

        boolean isAniversario = dataNascimento.getMonth() == dataAtual.getMonth() &&
                dataNascimento.getDayOfMonth() == dataAtual.getDayOfMonth();

        if (isAniversario) {
            return venda.getValorTotal() * 0.15; // 15% de desconto
        }
        return 0;

    }
}
