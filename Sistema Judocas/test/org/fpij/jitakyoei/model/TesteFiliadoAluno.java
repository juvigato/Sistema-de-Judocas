/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model;
import org.fpij.jitakyoei.model.beans.Filiado;
import java.util.Date;
import org.fpij.jitakyoei.model.beans.Rg;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
/**
 *
 * @author leona
 */
public class TesteFiliadoAluno {
    private static Filiado filiadoAluno;
    
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
    public void verificaSeCPFPreenchida(){
        assertNull(filiadoAluno.getCpf());
    }
    
    @Test
    public void verificaId(){
        assertNull(filiadoAluno.getId());
    }
    
    @Test
    public void verificaBairroPreenchida(){
        assertEquals("Leo", filiadoAluno.getNome());
    }
}
