/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author lsilv
 */
import java.util.ArrayList;
public class App {
    ArrayList<Pessoa> listapessoas = new ArrayList<>();

public int totalPessoasCadastradas() {
    return listapessoas.size();
}

public void pessoaCadastrada(Pessoa pessoa){
    listapessoas.add(pessoa);
}
}
