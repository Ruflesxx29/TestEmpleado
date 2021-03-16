/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadobr;

/**
 *
 * @author publico
 */
public class Empleados {

    public static double calculaSalarioBruto( String tipo, double ventasMes, double horasExtra){
        double total=0.0;
        double error=0;
        if (tipo==null || tipo==""){
            error = -1;
        }
        
        if (ventasMes<0){
            error = -2;
        }
        
        if (horasExtra<0)
            error = -3;
        
        if (tipo=="vendedor"){
            total = 1000;
        
        } else if (tipo=="encargado"){
            total = 1500;
        }
        if (ventasMes>1000) {
            total +=100;
        } else if (ventasMes>=1500){
            total +=200;
        }
        total += horasExtra*20;
        
        if (error<0){
            return error;
        } else {
            return total;
        }
    }

    public static double calculaSalarioNeto(double salarioBruto){
        if (salarioBruto <1000){
            return salarioBruto;
        } else if (salarioBruto<1500){
            return (salarioBruto-salarioBruto*16/100);
        } else {
            return (salarioBruto-salarioBruto*18/100);
        }
    }
    //el salario neto es el total (100%) - %retención
    //expresado según tanto por 1: (1-retencion/100)
    // si estamos en facturación y tenemos que aplicar 21% de IVA
    //entonces 100%+%IVA
    //si aplicamos a tanto por 1 1+21/100=1+0.21=1.21
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Introduce un salario");
        //Scanner entrada = new Scanner (System.in);
        
        
    }
    
}
