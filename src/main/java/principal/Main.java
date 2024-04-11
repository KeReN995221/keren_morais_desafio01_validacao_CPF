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
        cpfs.add(new Cpf("111.222.333-44"));
        cpfs.add(new Cpf("12345678910"));
        cpfs.add(new Cpf("55566677788"));
        cpfs.add(new Cpf("12345678912312"));
        cpfs.add(new Cpf("123.123.12"));
        cpfs.add(new Cpf("12"));
        cpfs.add(new Cpf("12345678944BVC"));
        cpfs.add(new Cpf("A12547"));
        Validacao validacao = new Validacao();

        for (Cpf cpf : cpfs) {

                if (validacao.temCaracterEspecial(cpf) == true) {
                    if (validacao.ehApenasNum(cpf) == true) {
                        cpfValidos.add(cpf);
                    }
                } else {
                    cpfInvalidos.add(cpf);
                }

        }

        System.out.println("CPF válidos numericamente e pela quantidade de caracter : ");
        for (Cpf cpf : cpfValidos){
            System.out.println(cpf.toString());
        }
        System.out.println("CPF inválidos numericamente e pela quantidade de caracter: ");
        for (Cpf cpf : cpfInvalidos){
            System.out.println(cpf.toString());
        }
    }
}