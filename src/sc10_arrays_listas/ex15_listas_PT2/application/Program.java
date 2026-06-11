package sc10_arrays_listas.ex15_listas_PT2.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import sc10_arrays_listas.ex15_listas_PT2.entities.Funcionario;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //instanciando a lista do tipo funcionario
        List<Funcionario> listaFuncionarios = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();

       
        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Funcionário #"+ (i+1)+ ":");

            System.out.print("ID: ");
            Integer id = sc.nextInt();

            //validação para impedir ids repetidos
            while(buscarFuncionario(listaFuncionarios, id) != null){
                System.out.println("Esse ID já existe! tente outro: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine(); //limpeza do buffer
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            Double salario = sc.nextDouble();

            //instanciando o funncionario e guardando direto na lista
            Funcionario funcionarioN = new Funcionario(id, nome, salario);
            listaFuncionarios.add(funcionarioN);
            }
        
            //aplicando o aumento
             System.out.println();
             System.out.print("Digite o ID do funcionário que receberá o aumento: ");
             int idAumento = sc.nextInt();

             //buscando o funcionario
             Funcionario func = buscarFuncionario(listaFuncionarios, idAumento);
        
            if (func == null){
                System.out.println("Esse ID não eixste!");
            }
            else{
                System.out.print("Digite a porcentagem: ");
                double porcentagem = sc.nextDouble();
               func.aumentarSalario(porcentagem);
            }

            System.out.println();
            System.out.println("Lista atualizada dos funcionários");
            for (Funcionario f: listaFuncionarios){
                System.out.println(f);
            }
            sc.close();
        }

        //testando se o id já existe fora do main

        public static Funcionario buscarFuncionario(List<Funcionario> listaF, int id) {
            return listaF.stream()
            .filter(x-> x.getId() == id)
            .findFirst() //encontra o primeiro item da lista
            .orElse(null); //retorna null se nao encontrar nada
       
        }
    }
    
