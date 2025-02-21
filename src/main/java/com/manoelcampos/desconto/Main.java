package com.manoelcampos.desconto;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "João", LocalDate.of(1990, 2, 21));
        Venda venda = new Venda(cliente, LocalDate.now(), 1000.0);

        venda.setDescontoStrategy(new DescontoAniversario());
        System.out.println("Desconto aniversário: "+venda.calcularDesconto());

        venda.setDescontoStrategy(new DescontoFixo(10));
        System.out.println("Desconto Fixo: "+venda.calcularDesconto());

        venda.setDescontoStrategy(new DescontoProgressivo());
        System.out.println("Desconto progressivo: "+venda.calcularDesconto());

    }
}
