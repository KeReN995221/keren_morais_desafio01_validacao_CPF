package principal;

import classes.Cpf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("12345678900", "987654210", "11122233344", "1111111111111111111111111111111");

        Cpf cpfs = new Cpf();
        cpfs.verificarQuantidade(list);

    }
}