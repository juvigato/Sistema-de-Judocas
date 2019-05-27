/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model;
import org.fpij.jitakyoei.model.beans.Rg;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author leona
 */
public class TesteRg {
    
    @BeforeClass
    public static void setUp(){
        
    }
    
    @Test
    public void verificaRgEqualsNotNull(){
        Rg rg = new Rg("43434343", "SP");
        Object obj = null;
        boolean expResult = false;
        assertEquals(expResult,rg.equals(obj));
    }
    
    @Test
    public void verificaHashCodeRg(){
        Rg rg = new Rg("43434343", "SP");
        assertNotNull(rg.hashCode());
    }
    
    @Test
    public void verificaGetNumero(){
        Rg rg = new Rg("43434343", "SP");
        String expResult = "43434343";
        assertEquals(expResult, rg.getNumero());
    }
    
    @Test
    public void verificaSetNumero(){
        Rg rg = new Rg("43434343", "SP");
        String numero = "12121212";
        String numeroAntigo = rg.getNumero();
        rg.setNumero(numero);
        assertNotEquals(numeroAntigo, rg.getNumero());
    }
    
    @Test
    public void verificaGetOrgao(){
        Rg rg = new Rg("43434343", "SP");
        String expResult = "SP";
        assertEquals(expResult, rg.getOrgaoExpedidor());
    }
    
    @Test
    public void verificaSetOrgao(){
        Rg rg = new Rg("43434343", "SP");
        String orgao = "MG";
        String orgaoAntigo = rg.getNumero();
        rg.setOrgaoExpedidor(orgao);
        assertNotEquals(orgaoAntigo, rg.getOrgaoExpedidor());
    }
}
