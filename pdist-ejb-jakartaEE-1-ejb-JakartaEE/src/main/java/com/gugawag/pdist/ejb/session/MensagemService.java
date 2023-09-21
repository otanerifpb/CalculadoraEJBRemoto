package com.gugawag.pdist.ejb.session;

import com.gugawag.pdist.modelo.Mensagem;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless(name = "mensagemService")
public class MensagemService {
    @EJB
    private MensagemDAO mensagemDAO;

    public void inserir(long id, String texto) {
        Mensagem novaMensagem = new Mensagem(id, texto);
        mensagemDAO.inserir(novaMensagem);
    }

    public List<Mensagem> listar() {
        return mensagemDAO.listar();
    }

    public Mensagem pesquisarPorId(Long id) {
        return mensagemDAO.pesquisarPorId(id);
    }
}
