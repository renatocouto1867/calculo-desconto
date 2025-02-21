package com.manoelcampos.desconto;

import java.time.LocalDate;

/**
 * Venda realizada para um {@link Cliente}.
 * @author Manoel Campos da Silva Filho
 */
public class Venda {
    private long id;
    private Cliente cliente;
    private LocalDate data;
    private double valorTotal;
    private DescontoStrategy descontoStrategy;

    public Venda() {/**/}

    public Venda(Cliente cliente, LocalDate data, double valorTotal) {
        this.cliente = cliente;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularDesconto(){
        if (descontoStrategy!=null){
            return descontoStrategy.calcularDesconto(this);
        }
        return 0;
    }

    public long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
