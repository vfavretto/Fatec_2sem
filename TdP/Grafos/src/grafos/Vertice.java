/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafos;

import java.util.ArrayList;

/**
 *
 * @author Alunos
 */
public class Vertice {
    private String nome;
    private int distancia = 0;
    private Vertice pai;
    private ArrayList<Aresta> incidentes = new ArrayList<Aresta>();
    private ArrayList<Vertice> vizinhos = new ArrayList<Vertice>();

}
