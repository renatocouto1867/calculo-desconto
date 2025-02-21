package com.manoelcampos.desconto;

public class DescontoProgressivo implements DescontoStrategy{

    @Override
    public double calcularDesconto(Venda venda) {
        double desconto = ((venda.getValorTotal() / 25)/100)* venda.getValorTotal();
        double maxDesconto = venda.getValorTotal() * 0.20;
        return Math.min(desconto, maxDesconto);
    }
}
