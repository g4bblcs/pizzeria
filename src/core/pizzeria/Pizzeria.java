/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.pizzeria;

import core.pedido.Pedido;
import core.person.Cliente;
import java.util.ArrayList;

/**
 *
 * @author glcampo
 */
public class Pizzeria {

    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Item> items;
    private ArrayList<Pedido> pedidos;

    public Pizzeria() {
        this.nombre = "papa johns";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    // metodos pedidos por el uml
    public boolean addPedido(Pedido pedido) {
        if (!this.pedidos.contains(pedido)) {
            this.pedidos.add(pedido);
            return true;
        }
        return false;
    }

    public boolean addCliente(Cliente cliente) {
        if (!this.clientes.contains(cliente)) {
            this.clientes.add(cliente);
            return true;
        }
        return false;
    }

    public boolean addItem(Item item) {
        if (!this.items.contains(item)) {
            this.items.add(item);
            return true;
        }
        return false;
    }

    public Cliente getCliente(int index) {
        return this.clientes.get(index);
    }

    public Item getItem(int index) {
        return this.items.get(index);
    }

    public int calcProdMasVendidoCliente(int numCliente) {
        return 0;
    }
}
