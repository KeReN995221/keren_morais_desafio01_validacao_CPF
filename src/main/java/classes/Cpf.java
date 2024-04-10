package classes;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Cpf {
    private String cpf;

    public Cpf(){
    }

    public Cpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return  cpf;
    }
}
