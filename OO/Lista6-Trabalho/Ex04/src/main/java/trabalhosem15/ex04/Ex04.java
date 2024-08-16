/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package trabalhosem15.ex04;

import trabalhosem15.ex04.Classes.DollarConverter;
import trabalhosem15.ex04.Classes.FinancialService;
import trabalhosem15.ex04.Classes.RealConverter;
import trabalhosem15.ex04.Interface.ICurrencyConverter;

/**
 *
 * @author 14731424666
 */
public class Ex04 {

    public static void main(String[] args) {
        ICurrencyConverter convertDollar = new DollarConverter();
        ICurrencyConverter convertReal = new RealConverter();
        
        FinancialService doll = new FinancialService(convertDollar);
        FinancialService real = new FinancialService(convertReal);
        
        real.performTransaction(10.0);
        doll.performTransaction(10.0);
    }
}
