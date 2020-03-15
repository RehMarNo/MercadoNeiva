/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

public class Debito extends Pagamento{
    
    public Debito(String valorTotal, String troco, double limite, String total) {
        super(valorTotal, troco, limite, total);
    }
    public Debito(){
        
    }
    public void pagarDebito(){
        if(isLimite()){
            diminuirLimite(Double.parseDouble(calcularTotal()));
        }else {
            setInsuficiente();
        }
    }
    public String toString() {
        return String.valueOf(getLimite());
    }
}
