/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Model.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class Controlador /* implements Serealizador */ {

    private List<Veiculos> listaVeiculo;
    private List<Pessoa> listaPessoa;

    public Controlador() {
        listaPessoa = new ArrayList<Pessoa>();
        listaVeiculo = new ArrayList<Veiculos>();
    }

    public void cadastrarCliente(String nome, String telefone, String cpf, String valorMax, String valorMin, String tipoVeiculo) {
        listaPessoa.add(new Cliente(nome, telefone, cpf, valorMax, valorMin, tipoVeiculo));
    }
}
