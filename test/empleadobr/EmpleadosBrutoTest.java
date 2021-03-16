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
 */

@RunWith(value=Parameterized.class)
public class EmpleadosBrutoTest {
    
    private double salario,exp;
    
    public EmpleadosBrutoTest(double salario, double exp) {
        this.salario=salario;
        this.exp=exp;
    }
    
    @Parameterized.Parameters
    public static ArrayList<Object[]> testEmpParametrizadas () {
        ArrayList<Object[]> obj = new ArrayList();
        obj.add(new Object[] {2000,1640});
        obj.add(new Object[] {1500,1230});
        obj.add(new Object[] {1499.99,1259.9916});
        obj.add(new Object[] {1250,1050});
        return obj;
    }
    
       
    @Test
    public void testCalculaSalarioNeto() {
        try {
            ArrayList<Object[]> obj = new ArrayList();
            obj=testEmpParametrizadas ();
            double result = Empleados.calculaSalarioNeto(salario);
            assertEquals(this.exp, result, 0.01);
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }
 
}
