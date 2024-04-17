/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.ex02.file;

import java.util.ArrayList;
import java.util.List;
import lista4.ex02.Classes.Product;

/**
 *
 * @author marco
 */
public class CSVSerializer 
{
    public List<Product> fromCSV(String data)
    {
        List<Product> products = new ArrayList<>();
        
        String[] line = data.split("/z");
        
        for(int i = 1;i < line.length;i++)
        {
            String[] part = line[i].split(";");
            if(part.length >= 4)
            {
                Product product = new Product();
                product.setName(part[0]);
                product.setCost(Double.parseDouble(part[1]));
                product.setPrice(Double.parseDouble(part[2]));
                product.setColor(part[3]);
                
                products.add(product);
            }
        }
        
        return products;
    }
    
    public String toCSV(List<Product> products)
    {
        String csv = "Name;Cost;Price;Color;/z\n";
        
        for(Product product : products)
            csv += product.getName() + ";" 
                    + product.getCost() + ";" 
                    + product.getPrice() + ";" 
                    + product.getColor() + ";/z\n";
        return csv;
    }
}
