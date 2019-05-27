/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.model.beans.ProfessorEntidade;
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
public class TesteProfessorEntidade {
    
    @BeforeClass
    public static void setUp(){
        
    }
    
    @Test
    public void verificaEquals(){
        Object obj = null;
        ProfessorEntidade proent = null;
        boolean expResult = false;
        assertEquals(expResult, proent.equals(obj));
    }
    
    @Test
    public void verificaHashCode(){
        ProfessorEntidade proent = null;
        int expResult = 0;
        assertNotEquals(expResult, proent.hashCode());
    }
    
    @Test
    public void verificaGetProfessor(){
        Entidade entidade = new Entidade();
        Professor professor = new Professor();
        ProfessorEntidade proent = new ProfessorEntidade(professor, entidade);
        Professor result = proent.getProfessor();
        assertEquals(professor, result);
    }
    
    @Test
    public void verificaSetProfessor(){
        Entidade entidade = new Entidade();
        Professor professor = new Professor();
        ProfessorEntidade proent = new ProfessorEntidade(professor, entidade);
        proent.setProfessor(professor);
        assertNotNull(proent.getProfessor());
    }
    
    @Test
    public void verificaGetEntidade(){
        Entidade entidade = new Entidade();
        Professor professor = new Professor();
        ProfessorEntidade proent = new ProfessorEntidade(professor, entidade);
        Entidade result = proent.getEntidade();
        assertEquals(entidade, result);
    }
    
    @Test
    public void verificaSetEntidade(){
        Entidade entidade = new Entidade();
        Professor professor = new Professor();
        ProfessorEntidade proent = new ProfessorEntidade(professor, entidade);
        proent.setEntidade(entidade);
        assertNotNull(proent.getEntidade());
    }
    
}
