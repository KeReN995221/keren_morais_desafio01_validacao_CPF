package principal;

import classes.Cpf;
import servicos.Validacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<Cpf> cpfValidos = new ArrayList<>();
        List<Cpf> cpfInvalidos = new ArrayList<>();
        List<Cpf> cpfs = new ArrayList<>();
        cpfs.add(new Cpf("98765432100"));
        cpfs.add(new Cpf("11122233344"));
        cpfs.add(new Cpf("12345678910"));
        cpfs.add(new Cpf("55566677788"));
        cpfs.add(new Cpf("12345678912312"));
        cpfs.add(new Cpf("12312312"));
        cpfs.add(new Cpf("12"));
        cpfs.add(new Cpf("12345678944"));
        cpfs.add(new Cpf("A12547"));
        cpfs.add(new Cpf("A1231231232"));
        cpfs.add(new Cpf("A12547"));
        cpfs.add(new Cpf("123.123.123-22"));
        cpfs.add(new Cpf("123.123.123-23"));
        cpfs.add(new Cpf("123.123.123-24"));
        cpfs.add(new Cpf("123.123.123-241"));
        cpfs.add(new Cpf("123.123.123-2"));
        cpfs.add(new Cpf("123.123.123-2411"));


        Validacao validacao = new Validacao();

        for (Cpf cpf : cpfs) {

                if (validacao.temCaracterEspecial(cpf) == true) {
                        cpfValidos.add(cpf);
                } else {
                    cpfInvalidos.add(cpf);
                }

        }

       System.out.println("\nCPF válidos: \n");
        for (Cpf cpf : cpfValidos){
            System.out.println(cpf.toString());
        }
        System.out.println("\nCPF inválidos: \n");
        for (Cpf cpf : cpfInvalidos){
            System.out.println(cpf.toString());
        }
    }
}