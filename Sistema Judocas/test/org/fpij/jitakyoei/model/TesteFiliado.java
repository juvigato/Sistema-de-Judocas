/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model;
import java.util.Date;
import org.fpij.jitakyoei.model.beans.Filiado;
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
public class TesteFiliado {
    
    @BeforeClass
    public static void setUp(){
        Filiado filiado = new Filiado();
        filiado.setNome("Leo");
        filiado.setRegistroCbj("AAA111");
        filiado.setCpf("501.165.658-61");
        filiado.setDataNascimento(new Date());
        filiado.setDataCadastro(new Date());
        filiado.setId(1111L);
        filiado.setRg(new Rg("2879132-0", "SP"));
        filiado.setTelefone1("99200-1231");
        filiado.setEmail("leo@h.com");
        filiado.setObservacoes("Alguma coisa");
    }
    
    @Test
    public void verificaToString(){
        Filiado filiado = new Filiado();
        filiado.setNome("Leo");
        filiado.setRegistroCbj("AAA111");
        filiado.setCpf("501.165.658-61");
        filiado.setDataNascimento(new Date());
        filiado.setDataCadastro(new Date());
        filiado.setId(1111L);
        filiado.setRg(new Rg("2879132-0", "SP"));
        filiado.setTelefone1("99200-1231");
        filiado.setEmail("leo@h.com");
        filiado.setObservacoes("Alguma coisa");
        String result = filiado.toString();
        assertNotNull(result);
    }
    
    @Test
    public void verificaHashCode(){
        Filiado filiado = new Filiado();
        filiado.setNome("Leo");
        filiado.setRegistroCbj("AAA111");
        filiado.setCpf("501.165.658-61");
        filiado.setDataNascimento(new Date());
        filiado.setDataCadastro(new Date());
        filiado.setId(1111L);
        filiado.setRg(new Rg("2879132-0", "SP"));
        filiado.setTelefone1("99200-1231");
        filiado.setEmail("leo@h.com");
        filiado.setObservacoes("Alguma coisa");
        int result = filiado.hashCode();
        assertNotNull(result);
    }
    
    @Test
    public void verificaGetNome(){
        Filiado filiado = new Filiado();
        filiado.setNome("Leo");
        String expResult = "Leo";
        assertEquals(expResult, filiado.getNome());
    }
    
    @Test
    public void verificaSetNome(){
        Filiado filiado = new Filiado();
        filiado.setNome("Ju");
        assertNotNull(filiado.getNome());
    }
    
    @Test
    public void verificaGetCbj(){
        Filiado filiado = new Filiado();
        filiado.setRegistroCbj("BBB222");
        String expResult = "BBB222";
        assertEquals(expResult, filiado.getRegistroCbj());
    }
    
    @Test
    public void verificaSetCbj(){
        Filiado filiado = new Filiado();
        filiado.setRegistroCbj("CCC333");
        assertNotNull(filiado.getRegistroCbj());
    }
    
    @Test
    public void verificaGetCpf(){
        Filiado filiado = new Filiado();
        filiado.setCpf("501.213.543-65");
        String expResult = "501.213.543-65";
        assertEquals(expResult, filiado.getCpf());
    }
    
    @Test
    public void verificaSetCpf(){
        Filiado filiado = new Filiado();
        filiado.setCpf("901.123.112-54");
        assertNotNull(filiado.getCpf());
    }
    
    @Test
    public void verificaGetDataNascimento(){
        Filiado filiado = new Filiado();
        Date date = new Date();
        filiado.setDataNascimento(date);
        assertEquals(date, filiado.getDataNascimento());
    }
    
    @Test
    public void verificaSetDataNascimento(){
        Filiado filiado = new Filiado();
        Date date = new Date();
        filiado.setDataNascimento(date);
        assertNotNull(filiado.getDataNascimento());
    }
    
    @Test
    public void verificaGetDataCadastro(){
        Filiado filiado = new Filiado();
        Date date = new Date();
        filiado.setDataCadastro(date);
        assertEquals(date, filiado.getDataCadastro());
    }
    
    @Test
    public void verificaSetDataCadastro(){
        Filiado filiado = new Filiado();
        Date date = new Date();
        filiado.setDataCadastro(date);
        assertNotNull(filiado.getDataCadastro());
    }
    
    @Test
    public void verificaGetId(){
        Filiado filiado = new Filiado();
        filiado.setId(2222L);
        Long expResult = 2222L;
        assertEquals(expResult, filiado.getId());
    }
    
    @Test
    public void verificaSetId(){
        Filiado filiado = new Filiado();
        filiado.setId(2222L);
        assertNotNull(filiado.getId());
    }
    
    @Test
    public void verificaGetTelefone1(){
        Filiado filiado = new Filiado();
        filiado.setTelefone1("99200-1234");
        String expResult = "99200-1234";
        assertEquals(expResult, filiado.getTelefone1());
    }
    
    @Test
    public void verificaSetTelefone1(){
        Filiado filiado = new Filiado();
        filiado.setTelefone1("99200-1234");
        assertNotNull(filiado.getTelefone1());
    }
    
    @Test
    public void verificaGetEmail(){
        Filiado filiado = new Filiado();
        filiado.setEmail("leo@l.com");
        String expResult = "leo@l.com";
        assertEquals(expResult, filiado.getEmail());
    }
    
    @Test
    public void verificaSetEmail(){
        Filiado filiado = new Filiado();
        filiado.setEmail("leo@l.com");
        String resultAntigo = filiado.getEmail();
        filiado.setEmail("ju@j.com");
        String result = filiado.getEmail();
        assertNotNull(result);
        assertNotEquals(resultAntigo, result);
    }
    
    @Test
    public void verificaEmailInvalido(){
        Filiado filiado = new Filiado();
        filiado.setEmail("errado");
        String result = filiado.getEmail();
        assertNotNull(result);
    }
    
    @Test
    public void verificaGetObservacoes(){
        Filiado filiado = new Filiado();
        filiado.setObservacoes("alguma coisa");
        String expResult = "alguma coisa";
        assertEquals(expResult, filiado.getObservacoes());
    }
    
    @Test
    public void verificaSetObservacoes(){
        Filiado filiado = new Filiado();
        filiado.setObservacoes("algo");
        assertNotNull(filiado.getObservacoes());
    }
    
}
