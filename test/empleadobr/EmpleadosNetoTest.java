/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadobr;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author publico
 */@RunWith(value=Parameterized.class)

public class EmpleadosNetoTest {
    
    private String tipo;
    private double ventas;
    private int horas;
    private double exp;
    
    public EmpleadosNetoTest (String tipo, double ventas, int horas, double exp){
        this.tipo=tipo;
        this.ventas=ventas;
        this.horas=horas;
        this.exp=exp;
        
    }
    
    @Parameterized.Parameters
    public static ArrayList<Object[]> testNetoParametrizadas () {
        ArrayList<Object[]> obj = new ArrayList();
        obj.add(new Object[] {"vendedor",2000,8,1260});
        obj.add(new Object[] {"vendedor",1500,3,1160});
        obj.add(new Object[] {"vendedor",1499.99,0,1100});
        obj.add(new Object[] {"encargado",1250,8,1760});
        obj.add(new Object[] {"encargado",1000,0,1500});
        obj.add(new Object[] {"encargado",999.99,3,1560});
        obj.add(new Object[] {"encargado",500,0,1500});
        obj.add(new Object[] {"encargado",0,8,1660});
        obj.add(new Object[] {"vendedor",-1,8,-2});
        obj.add(new Object[] {"vendedor",1500,-1,-3});
        obj.add(new Object[] {null,1500,8,-1});
        return obj;
    }
    @Test
    public void testCalculaSalarioNeto() {
        System.out.println("calculaSalarioNeto");
         try {
            ArrayList<Object[]> obj = new ArrayList();
            obj=testNetoParametrizadas ();
            double result = Empleados.calculaSalarioBruto(tipo, ventas, horas);
            assertEquals(exp, result, 0.0);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
       
    }

    
}
