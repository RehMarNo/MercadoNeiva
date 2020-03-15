/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

public class Dinheiro extends Pagamento{
    public Dinheiro(String valorTotal, String troco, double limite, String total) {
        super(valorTotal, troco, limite, total);
    }
    public Dinheiro(){
        
    }

    public String pagarDinheiro(double valorTotal) {
        if(valorTotal>=Double.parseDouble(getValorTotal())){
            return calcularTroco(valorTotal, Double.parseDouble(getValorTotal()));
        }else{
            return "Valor Insuficiente!!";
        }
        
    }
}
