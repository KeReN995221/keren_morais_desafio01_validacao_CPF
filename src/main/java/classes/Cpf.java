package classes;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Cpf {
    private List<String> cpf;
    private List<String> cpfValidos = new ArrayList<>();
    private List<String> cpfInvalidos = new ArrayList<>();

    public Cpf(){
    }
    public Cpf(List<String> cpf) {
        this.cpf = cpf;
    }

    public void verificarQuantidade(List<String> cpfs){
        for (String cpf : cpfs){
            if (cpf.length() == 11){
                cpfValidos.add(cpf);
            }
            else{
                cpfInvalidos.add(cpf);
            }
        }

        System.out.println("CPFs com a quantidade numérica válida: ");
        for (String cpfV : cpfValidos) {

            System.out.println(cpfV);
        }
        System.out.println("CPFs com a quantidade numérica inválida: ");
        for (String cpfI : cpfInvalidos){
            System.out.println(cpfI);
        }
    }


}
