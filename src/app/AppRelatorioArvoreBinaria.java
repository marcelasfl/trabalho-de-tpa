/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
//Ajuste esse importe para que importe sua classe de Árvore binária
import lib.ArvoreBinariaExemplo;
import lib.IArvoreBinaria;

/**
 *
 * @author victoriocarvalho
 * 
 * Classe principal do aplicativo a ser utilizado para fazer o relatório do trabalho 
 * de árvore binária
 */
public class AppRelatorioArvoreBinaria {
    public static void main(String[] args) {
        //Instancio o meu gerador de árvores (que também foi fornecido)
        GeradorDeArvores gerador = new GeradorDeArvores();
        //Instancio um comparador de alunos por matricula (também fornecido)
        ComparadorAlunoPorMatricula comparador = new ComparadorAlunoPorMatricula();
        IArvoreBinaria<Aluno> arv;
        

//------Início do trecho citado nas questões 1, 2 e 3 do relatório-------------------------------
        //Instancio uma árvore binária. Lembre de ajustar o import para sua classe de árvore binária
        arv = new ArvoreBinariaExemplo(comparador);

        //Chamo o gerador para inserir 100 elementos nessa árvore de forma que fique degenerada
        gerador.geraArvoreDegenerada(100, arv); //essa parada usa o método adicionar (comentário victor)
        System.out.println("Árvore Degenerada Criada");

        String resultado = arv.caminharEmNivel();
        System.out.println("caminhar em nivel:");
        System.out.println(resultado);
        System.out.println("caminhar em ordem:");
        resultado = arv.caminharEmOrdem();
        System.out.println(resultado);
        /*
        //Imprimo a quantidade de nós e a altura da árvore resultante
        System.out.println("Quantidade de Nós: " + arv.quantidadeNos()+ " Altura: " + arv.altura());
        arv = new ArvoreBinariaExemplo(comparador);
        gerador.geraArvoreDegenerada(200, arv);
        System.out.println("Árvore Degenerada Criada");
        System.out.println("Quantidade de Nós: " + arv.quantidadeNos()+ " Altura: " + arv.altura());
        arv = new ArvoreBinariaExemplo(comparador);
        gerador.geraArvoreDegenerada(1000, arv);
        System.out.println("Árvore Degenerada Criada");
        System.out.println("Quantidade de Nós: " + arv.quantidadeNos()+ " Altura: " + arv.altura());
//------Fim do trecho citado nas questões 1, 2 e 3 do relatório-------------------------------

//------Início do trecho citado nas questões 5, 6 e 7 do relatório-------------------------------
        arv = new ArvoreBinariaExemplo(comparador);
        //Chamo o gerador para inserir 100 elementos nessa árvore de forma que ela fique perfeitamente balanceada
        gerador.geraArvorePerfeitamenteBalanceada(1,100,arv);
        System.out.println("Árvore Perfeitamente Balanceada Criada");
        System.out.println("Quantidade de Nós: " + arv.quantidadeNos()+ " Altura: " + arv.altura());
        arv = new ArvoreBinariaExemplo(comparador);
        gerador.geraArvorePerfeitamenteBalanceada(1,200,arv);
        System.out.println("Árvore Perfeitamente Balanceada Criada");
        System.out.println("Quantidade de Nós: " + arv.quantidadeNos()+ " Altura: " + arv.altura());
        arv = new ArvoreBinariaExemplo(comparador);
        gerador.geraArvorePerfeitamenteBalanceada(1,1000,arv);
        System.out.println("Árvore Perfeitamente Balanceada Criada");
        System.out.println("Quantidade de Nós: " + arv.quantidadeNos()+ " Altura: " + arv.altura());
//------Fim do trecho citado nas questões 5, 6 e 7 do relatório-------------------------------

//------Início do trecho citado na questão 9 do relatório-------------------------------
        arv = new ArvoreBinariaExemplo(comparador);
        gerador.geraArvorePerfeitamenteBalanceada(1,50000,arv);
        System.out.println("Árvore Perfeitamente Balanceada Criada");
        System.out.println("Altura: " + arv.altura());
        arv = new ArvoreBinariaExemplo(comparador);
        gerador.geraArvoreDegenerada(50000, arv);
        System.out.println("Árvore Degenerada Criada");
        System.out.println(" Altura: " + arv.altura());
//------Fim do trecho citado na questão 9 do relatório-------------------------------
*/
    }
}
