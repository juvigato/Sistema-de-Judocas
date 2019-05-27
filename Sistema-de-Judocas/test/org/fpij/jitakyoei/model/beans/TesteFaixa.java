/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;
import org.fpij.jitakyoei.model.beans.Faixa;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Date;

import org.fpij.jitakyoei.util.CorFaixa;
/**
 *
 * @author leona
 */
public class TesteFaixa {
    
    @BeforeClass
    public static void setUp(){
        
    }
    
    @Test
    public void verificaCor(){
        Faixa faixa = new Faixa();
        CorFaixa cor = CorFaixa.AMARELA;
        faixa.setCor(cor);
        faixa.setDataEntrega(new Date());
        assertEquals(cor, faixa.getCor());
    } 
    
    @Test
    public void verificaData(){
        Faixa faixa = new Faixa();
        Date date = new Date();
        faixa.setDataEntrega(date);
        assertEquals(date, faixa.getDataEntrega());
    }
    
    @Test
    public void verificaToString(){
        Faixa faixa = new Faixa();
        CorFaixa cor = CorFaixa.AMARELA;
        Date dataEntrega = new Date();
        faixa.setCor(cor);
        faixa.setDataEntrega(dataEntrega);
        String expResult = faixa.getCor() + " - " + faixa.getDataEntrega();
        String result = faixa.toString();
        assertEquals(expResult, result);
    }
}