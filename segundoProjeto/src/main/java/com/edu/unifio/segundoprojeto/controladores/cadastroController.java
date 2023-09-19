package com.edu.unifio.segundoprojeto.controladores;

import com.edu.unifio.segundoprojeto.entidades.Cadastro;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.omnifaces.util.Messages;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class cadastroController {
    private Cadastro cadastro = new Cadastro();

    public void salvar(){ Messages.addFlashGlobalInfo("Registro salvo com sucesso!");}
}
