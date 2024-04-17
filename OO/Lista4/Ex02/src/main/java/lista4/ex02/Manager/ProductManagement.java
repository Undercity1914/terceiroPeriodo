/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.ex02.Manager;

import java.util.ArrayList;
import java.util.List;
import lista4.ex02.Classes.Product;
import lista4.ex02.file.CSVSerializer;
import lista4.ex02.file.FilePersistence;

/**
 *
 * @author marco
 */
public class ProductManagement 
{
    private List<Product> products;
    
    public ProductManagement()
    {
        this.products = new ArrayList<>();
    }
    
    public void addProduct(Product product)
    {
        this.products.add(product);
        System.out.println("Filed!");
    }
    
    public void removeProduct(String name)
    {
        Product product = new Product();
        int size = this.products.size();
        
        for(int i = 0;i < size;i++)
        {
            product = this.products.get(i);
            if(product.getName().equals(name))
            {
                this.products.remove(product);
                System.out.println("Removed!");
                i = size;
            }
        }
    }
    
    public Product findProduct(String name)
    {
        Product product = new Product();
        int size = this.products.size();
        
        for(int i = 0;i < size;i++)
        {
            product = this.products.get(i);
            if(product.getName().equals(name))
                return product;
        }
        
        return null;
    }
    
    public void updateProduct(String oldName, Product newProduct)
    {
        Product product = this.findProduct(oldName);
        if(product != null)
        {
            int index = this.products.indexOf(product);
            this.products.set(index, newProduct);
        }
        else
            System.out.println("Not found!");
    }
    
    @Override
    public String toString() {
        StringBuilder print = new StringBuilder();
        for(Product product : this.products)
            print.append(product.toString()).append("\n");
        
        return print.toString();
    }
    
    public void saveToFile(String pathFile)
    {
        CSVSerializer serializer = new CSVSerializer();
        String csvData = serializer.toCSV(this.products);
        
        FilePersistence filePersistence = new FilePersistence();
        
        filePersistence.saveToFile(csvData, pathFile);
    }
    
    public void loadFromFile(String pathFile)
    {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(pathFile);
        
        CSVSerializer serializer = new CSVSerializer();
        this.products = serializer.fromCSV(csvData);
    }
}
