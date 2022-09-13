/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab.pv;

/**
 *
 * @author Administrator
 */
public class Encomenda {
    private String produto;
    private String cliente;
    private String data;
    private boolean entregue;
    
    public Encomenda(String produto, String cliente, String data, boolean entregue){
        this.produto = produto;
        this.cliente = cliente;
        this.data = data;
        this.entregue = entregue;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean getEntregue(){
        return entregue;
    }
    
    public void setEntregue(boolean entregue){
        this.entregue = entregue;
    }

    @Override
    public String toString() {
      return "Encomenda{" + "Produto=" + produto + ", Cliente=" + cliente + ", "
              + "Data=" + data + ", Entregue=" + entregue +'}';
    }
}
