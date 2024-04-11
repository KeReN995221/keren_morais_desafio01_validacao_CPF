package servicos;

import classes.Cpf;

import java.util.List;

public class Validacao {

    public boolean ehApenasOnze(Cpf cpfs){

        if (cpfs.getCpf().length() == 11){return true;}
        return false;
    }
    public boolean ehApenasNum(Cpf cpfs){

       try{
            long cpf = Long.parseLong(cpfs.getCpf());
            return true;
       }catch (RuntimeException e){System.out.println(e.getMessage());}
       return false;
    }

    public  boolean temCaracterEspecial(Cpf cpfs){
         cpfs.setCpf(cpfs.getCpf().replace(".",""));
         cpfs.setCpf(cpfs.getCpf().replace("-",""));
         return ehApenasOnze(cpfs);
    }
}
