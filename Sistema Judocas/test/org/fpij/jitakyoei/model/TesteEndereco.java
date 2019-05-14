/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model;
import org.fpij.jitakyoei.model.beans.Endereco;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;
/**
 *
 * @author leona
 */
public class TesteEndereco {
    private static Endereco endereco;
    Endereco e = new Endereco();
    
    public static void setUp() {
        endereco = new Endereco();
        endereco.setBairro("Tatuape");
        endereco.setCep("03336-010");
        endereco.setCidade("Sao Paulo");
        endereco.setEstado("AA");
        endereco.setRua("Rua Candido Lacerda");
    
        endereco.getRua();
        endereco.getCep();
        endereco.getEstado();
        endereco.setEstado("SP");
        endereco.getEstado();
    }
    
    @Test
    public void verificaSeRuaPreenchida(){
        assertNull(endereco.getRua());
    }
    
    @Test
    public void verificaCEP(){
        assertEquals("03336-010", endereco.getCep());
    }
    
    @Test
    public void verificaBairroPreenchida(){
        assertNull(endereco.getBairro());
    }
    
    @Test
    public void verificaEstado(){
        assertEquals("AA",endereco.getEstado());
    }
    
}
