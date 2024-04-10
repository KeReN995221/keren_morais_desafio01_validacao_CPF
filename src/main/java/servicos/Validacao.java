package servicos;

import classes.Cpf;

public class Validacao {

    public boolean verificarQuantidade(Cpf cpfs){

        if (cpfs.getCpf().length() == 11){return true;}
        return false;
    }
    public boolean verificarNumeros(Cpf cpfs){

       try{
            long cpf = Long.parseLong(cpfs.getCpf());
            return true;
       }catch (RuntimeException e){System.out.println(e.getMessage());}
       return false;
    }
}
