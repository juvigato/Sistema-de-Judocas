/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model;
import org.fpij.jitakyoei.model.beans.Entidade;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author leona
 */
public class TesteEntidade {
    private static Entidade entidade;
    
    @BeforeClass
    public static void setUp(){
        entidade = new Entidade();
        entidade.setNome("Ju");
        entidade.setCnpj("501.165.658-61");
        entidade.setTelefone1("123456789");
        entidade.setTelefone2("987654321");
        //entidade.setEndereco(Endereco);
    }
    
    @Test
    public void verificaSeCnpjreenchida(){
        assertNull(entidade.getCnpj());
    }
    
    @Test
    public void verificaTelefone1(){
        assertNull(entidade.getTelefone1());
    }
    
    @Test
    public void verificaNomePreenchido(){
        assertEquals("Ju", entidade.getNome());
    }
}
