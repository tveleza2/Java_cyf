package Enums.modelos;

import Enums.enums.EstadoPedido;

public class Pedido {
    private int numeroPedido;
    private String cliente;
    private EstadoPedido status;
    private String[] listaProductos;



    public Pedido(){}
    public Pedido(int num, String cliente, EstadoPedido status, String[] list){
        this.cliente = cliente;
        this.listaProductos = list;
        this.status = status;
        this.numeroPedido = num;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public void setListaProductos(String[] listaProductos) {
        this.listaProductos = listaProductos;
    }
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    public void setStatus(EstadoPedido status) {
        this.status = status;
    }
    public String getCliente() {
        return cliente;
    }
    public String[] getListaProductos() {
        return listaProductos;
    }
    public int getNumeroPedido() {
        return numeroPedido;
    }
    public EstadoPedido getStatus() {
        return status;
    }



}
