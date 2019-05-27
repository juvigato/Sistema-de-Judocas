/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;
import org.fpij.jitakyoei.model.beans.Filiado;
import java.util.Date;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.model.beans.Rg;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author leona
 */
public class AlunoTest {
    private static Filiado filiadoAluno;
    
    @BeforeClass
    public static void setUp(){
        filiadoAluno = new Filiado();
        filiadoAluno.setNome("Leo");
        filiadoAluno.setCpf("501.165.658-61");
        filiadoAluno.setDataNascimento(new Date());
        filiadoAluno.setDataCadastro(new Date());
        filiadoAluno.setId(1111L);
        filiadoAluno.setRg(new Rg("7654321-0", "SP"));
    }
    
    @Test
    public void verificaFiliado(){
        Aluno aluno = new Aluno();
        aluno.setFiliado(filiadoAluno);
        assertNotNull(aluno.getFiliado());
    }
    
    @Test
    public void verificaEntidade(){
        Aluno aluno = new Aluno();
        Entidade entidade = new Entidade();
        aluno.setEntidade(entidade);
        assertNotNull(aluno.getEntidade());
    }
    
    @Test
    public void verificaProfessor(){
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        aluno.setProfessor(professor);
        assertNotNull(aluno.getProfessor());
    }
    
    @Test
    public void verificaToString(){
        Aluno aluno = new Aluno();
        assertNotNull(aluno.toString());
    }
    
    @Test
    public void verificaHashCode(){
        Aluno aluno = new Aluno();
        assertNotNull(aluno.hashCode());
    }
    
    @Test
    public void verificaNomePreenchida(){
        assertNotNull(filiadoAluno.getNome());
    }
    
    @Test
    public void verificaCPFPreenchida(){
        assertNotNull(filiadoAluno.getCpf());
    }
    
    @Test
    public void verificaDataNascimentoPreenchida(){
        assertNotNull(filiadoAluno.getDataNascimento());
    }
    
    @Test
    public void verificaDataCadastroPreenchida(){
        assertNotNull(filiadoAluno.getDataCadastro());
    }
    
    @Test
    public void verificaId(){
        assertNotNull(filiadoAluno.getId());
    }
    
    @Test
    public void verificaNome(){
        assertEquals("Leo", filiadoAluno.getNome());
    }
    
    @Test
    public void verificaCPF(){
        assertEquals("501.165.658-61", filiadoAluno.getCpf());
    }
    
}
