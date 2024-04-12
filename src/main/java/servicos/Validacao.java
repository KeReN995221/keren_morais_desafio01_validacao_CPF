package servicos;

import classes.Cpf;

import java.util.List;

public class Validacao {

    public boolean ehApenasOnze(String cpfs){

        if (cpfs.length() == 11){
            return ehApenasNum(cpfs);
        }
        return false;
    }
    public boolean ehApenasNum(String cpf){
       try{
            long cpfInt = Long.parseLong(cpf);
            return true;
       }
       catch (RuntimeException e){System.out.println(e.getMessage());}
       return false;
    }

    public  boolean temCaracterEspecial(Cpf cpf){
         String aux = cpf.getCpf().replace(".", "");
         aux = aux.replace("-", "");
         return ehApenasOnze(aux);
    }
}
