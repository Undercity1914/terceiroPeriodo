/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhosem15.ex04.Classes;

import trabalhosem15.ex04.Interface.ICurrencyConverter;

/**
 *
 * @author 14731424666
 */
public class DollarConverter implements ICurrencyConverter
{
    private Double cambio;
    private Double converted;

    @Override
    public void convertToDollar(Double Real) {
        this.cambio = 0.18;
        this.converted = Real/cambio;
        
        System.out.println(converted);
    }
    
    @Override
    public void convertToReal(Double Dollar)
    {
        throw new Error("Not Implemented!");
    }
}
