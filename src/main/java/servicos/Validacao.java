package servicos;

import classes.Cpf;

import java.util.List;

public class Validacao {

    public boolean verificarQuantidade(Cpf cpfs){
        if (cpfs.getCpf().length() == 11){
            return true;
        }
        return false;
    }

   

}
