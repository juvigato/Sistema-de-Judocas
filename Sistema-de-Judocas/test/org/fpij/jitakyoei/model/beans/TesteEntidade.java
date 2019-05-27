/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;
import org.fpij.jitakyoei.model.beans.Endereco;
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
    }
    
    @Test
    public void verificaEquals(){
        Object obj = null;
        Entidade entidade = new Entidade();
        boolean expResult = false;
        boolean result = entidade.equals(obj);
        assertEquals(expResult, result);
    }
    
    @Test
    public void verificaHashCode(){
        Entidade entidade = new Entidade();
        assertNotNull(entidade.hashCode());
    }
    
    @Test
    public void verificaNome(){
        Entidade entidade = new Entidade();
        entidade.setNome("Jubs");
        assertEquals("Jubs", entidade.getNome());
    }
    
    @Test
    public void verificaTelefone1(){
        Entidade entidade = new Entidade();
        entidade.setTelefone1("4213-5426");
        assertEquals("4213-5426", entidade.getTelefone1());
    }
    
    @Test
    public void verificaTelefone2(){
        Entidade entidade = new Entidade();
        entidade.setTelefone2("1313-6626");
        assertEquals("1313-6626", entidade.getTelefone2());
    }
    
    @Test
    public void verificaGetEndereco(){
        Entidade entidade = new Entidade();
        Endereco expResult = null;
        Endereco result = entidade.getEndereco();
        assertEquals(expResult, result);
    }
    
    @Test
    public void verificaSetEndereco(){
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Candido Lacerda");
        endereco.setNumero("210");
        endereco.setBairro("Tatuape");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setCep("03336-010");
        Entidade entidade = new Entidade();
        entidade.setEndereco(endereco);
        assertNotNull(entidade.getEndereco());
    }
    
    @Test
    public void verificaCnpj(){
        Entidade entidade = new Entidade();
        entidade.setCnpj("501.165.658-61");
        assertNotNull(entidade.getCnpj());
    }
    
    @Test
    public void verificaToString(){
        Entidade entidade = new Entidade();
        entidade.setNome("Leo");
        String result = entidade.toString();
        assertEquals(result, entidade.getNome());
    }
    
    @Test
    public void verificaCopyProperties(){
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Candido Lacerda");
        endereco.setNumero("210");
        endereco.setBairro("Tatuape");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setCep("03336-010");
        
        Entidade entidade = null;
        Entidade entidade1 = new Entidade();
        entidade1.setNome("JL");
        entidade1.setCnpj("43.876.975/0001-74");
        entidade1.setTelefone1("9876-5432");
        entidade1.setTelefone2("8844-7698");
        entidade1.setEndereco(endereco);
        
        Entidade entidade2 = new Entidade();
        entidade2.copyProperties(entidade1);
        assertEquals(entidade1.getNome(), entidade2.getNome());
        assertEquals(entidade1.getCnpj(), entidade2.getCnpj());
        assertEquals(entidade1.getTelefone1(), entidade2.getTelefone1());
        assertEquals(entidade1.getTelefone2(), entidade2.getTelefone2());
        assertEquals(entidade1.getEndereco(), entidade2.getEndereco());
    }
}
