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
public class RealConverter implements ICurrencyConverter
{
    private Double cambio;
    private Double converted;

    @Override
    public void convertToReal(Double Dollar) {
        throw new Error("Not implemented");
    }
    
    @Override
    public void convertToDollar(Double Real)
    {
        this.cambio = 5.44;
        this.converted = Real/cambio;
        
        System.out.println(converted);
    }
}
