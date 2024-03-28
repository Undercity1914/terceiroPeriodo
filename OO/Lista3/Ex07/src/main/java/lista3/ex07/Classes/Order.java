/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.ex07.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author marco
 */
public class Order 
{
    private List<Product> products;
    private Cliente client;

    public Order(List<Product> products, Cliente client) {
        this.products = products;
        this.client = new Cliente(client);
    }
    
    public Order()
    {
        this.products = new ArrayList<Product>();
        this.client = new Cliente();
    }
    
    public Order(Order other)
    {
        this.products = other.getProducts();
        this.client = other.getClient();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }
    
    public void fill()
    {
        Product p = new Product();
        p.fill();
        this.products.add(p);
        
        if(this.client != null)
            this.client.fill();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.products);
        hash = 73 * hash + Objects.hashCode(this.client);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        if (!Objects.equals(this.products, other.products)) {
            return false;
        }
        return Objects.equals(this.client, other.client);
    }

    @Override
    public String toString() {
        return "Order{" + "products=" + products + ", client=" + client + '}';
    }
}
