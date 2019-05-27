/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;
import java.util.List;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Professor;
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
public class TesteProfessor {
    
    @BeforeClass
    public static void setUp(){
        
    }
    
    @Test
    public void verificaEquals(){
        Object obj = null;
        Professor professor = new Professor();
        boolean expResult = false;
        assertEquals(expResult, professor.equals(obj));
    }
    
    @Test
    public void verificaHashCode(){
        Professor professor = new Professor();
        int expResult = 0;
        assertNotEquals(expResult, professor.hashCode());
    }
    
    @Test
    public void verificaGetFiliado(){
        Filiado filiado = new Filiado();
        filiado.setNome("Leo");
        Professor professor = new Professor();
        professor.setFiliado(filiado);
        assertEquals(filiado, professor.getFiliado());
    }
    
    @Test
    public void verificaSetFiliado(){
        Filiado filiado = new Filiado();
        Professor professor = new Professor();
        professor.setFiliado(filiado);
        assertNotNull(professor.getFiliado());
    }
    
    @Test
    public void verificaGetEntidade(){
        Professor professor = new Professor();
        List<Entidade> expResult = null;
        List<Entidade> result = professor.getEntidades();
        assertNotEquals(expResult, result);
    }
    
    @Test
    public void verificaSetEntidades(){
        List<Entidade> entidades = null;
        Professor professor = new Professor();
        professor.setEntidades(entidades);
        assertNull(professor.getEntidades());
    }
    
    @Test
    public void verificaToString(){
        Professor professor = new Professor();
        Filiado filiado = new Filiado();
        filiado.setNome(null);
        String result = professor.toString();
        assertEquals(result, filiado.getNome());
    }
    
}
