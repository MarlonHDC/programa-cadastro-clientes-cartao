package Poo;

import PooModel.Cliente;
import PooModel.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {

    public static void main(String[] args) {
        Endereco endereco  = new Endereco();
        // dados do endereço;
        endereco.cep = "52390123";
        Cliente cliente = new Cliente();
        // dados do cliente;


        cliente.adicionaEndereco(endereco);
        System.out.println("Endereço adicionado com sucesso!");
    }
}
