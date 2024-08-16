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
public class FinancialService
{
    ICurrencyConverter converter;

    public FinancialService(ICurrencyConverter converter) {
        this.converter = converter;
    }

    public void performTransaction(Double money)
    {
        converter.convertToDollar(money);
        converter.convertToReal(money);
    }
    
}
