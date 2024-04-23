/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5.ex02.Manager;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lista5.ex02.Classes.Product;
import lista5.ex02.File.FilePersistence;
import lista5.ex02.File.XMLSerializer;

/**
 *
 * @author marco
 */

@XmlRootElement(name = "Products")
public class ProductManagement 
{
    @XmlElement(name = "Product")
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
        XMLSerializer serializer = new XMLSerializer();
        String csvData = serializer.toXML(this);
        
        FilePersistence filePersistence = new FilePersistence();
        
        filePersistence.saveToFile(csvData, pathFile);
    }
    
    public void loadFromFile(String pathFile)
    {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(pathFile);
        
        XMLSerializer serializer = new XMLSerializer();
        this.products = serializer.fromXML(csvData).products;
    }
}
