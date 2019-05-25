/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model;
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
   private static Faixa faixa;
   private static CorFaixa cor;
    
    @BeforeClass
    public static void setUp(){
        faixa = new Faixa();
        CorFaixa AMARELA = cor.AMARELA;
        faixa.setDataEntrega(new Date());
    }
    
    @Test
    public void verificaNomePreenchido(){
        //assertEquals("Ju", entidade.getNome());
    } 
    
    @Test
    public void verificaSeDatareenchida(){
        assertNull(faixa.getDataEntrega());
    }
    
    @Test
    public void verificaCor(){
        assertEquals("AMARELA", cor.AMARELA);
    }
}