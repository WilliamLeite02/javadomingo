/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0612;

import java.util.Scanner;



/**
 *
 * @author entra21
 */
public class Aula0612 {

    public static void main(String[] args) {
        //variaveis();
        //operadoresMatematicos();
       // operadoresComparacao();
       //desvios();
      // lerScaner();
     // calculaIdade();
     //calcularIMC();
     boletim();
    }
    
    public static void boletim(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o nome do aluno: "); 
        String nome = leitor.next();
        
        System.out.print("Informe percentual de frequência: ");
        float freq = leitor.nextFloat();
        float nota=0;
        for(int i=0;i<3;i++){
        System.out.print("Informe nota 1: ");
          nota += leitor.nextFloat(); 
        }
        float media = nota/3;
       /* System.out.print("Informe nota 1: ");
        float nota1 = leitor.nextFloat();
        
        System.out.print("Informe nota 2: ");
        float nota2 = leitor.nextFloat();
        
        System.out.print("Informe nota 3: ");
        float nota3 = leitor.nextFloat();
        
        float media = (nota1 + nota2 + nota3)/3;
        /*
        //ou se um dos testes for verdadeiro, então o teste é verdadeiro
        //V F = V
        //V V = V
        //F V = V
        //F F = F
        /*if((freq < 75)||(media < 7)){
            System.out.println("Reprovado");
        }else{
           System.out.println("Aprovado"); 
        }*/
        
        //todos os testes devem ser verdadeiros para a expressão ser verdadeira
        // V V = V
        // F V = F
        // V F = F
        // F F = F
        if((media>=7)&&(freq>=75)){
           System.out.println("Aprovado"); 
        }else{
            System.out.println("Reprovado");
        }
                
    }
    public static void calcularIMC(){
        String msg = "Calculando peso";
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe seu nome: "); 
        String nome = leitor.next();
        
        System.out.print("Informe sua altura: ");
        float altura = leitor.nextFloat();
        
        System.out.print("Informe o peso: ");
        float peso = leitor.nextFloat();
        
        float imc = peso/(altura * altura);
        //Primeira forma
        if(imc < 18.5){
            msg = "Abaixo do peso";
        }else if(imc < 24.9){
            msg = "Peso normal";
        } else if(imc < 29.9){
            msg = "sobrepeso";
        }else if(imc < 34.9){
            msg = "Obesidade grau I";
        }else if(imc < 39.9){
            msg = "Obesidade grau II";
        }else{
            msg = "Obesidade grau III";
        }
        
        //outra forma
       /* if(imc < 18.5){
            msg = "Abaixo do peso";
        }
        
        if((imc >= 18.5)&&(imc < 24.9)){
            msg = "Peso normal";
        }
        
        if((imc > 25 )&&(imc < 29.9)){
            msg = "sobrepeso";
        }  
        
        if((imc > 30 )&&(imc < 34.9)){
            msg = "Obesidade grau I";
        } 
        
        if((imc >= 35 )&&(imc < 39.9)){
            msg = "Obesidade grau II";
        }else{
          msg = "Obesidade grau III";
        }*/
        
        System.out.println("Seu IMC: " + imc);        
        System.out.println(nome + " vc está " + msg);
    }
    
    public static void calculaIdade(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe seu nome");
        String nome = leitor.next();
        
        System.out.println("Informe sua idade");
        int idade = leitor.nextInt();
        
        if(idade < 18){
            System.out.println(nome + " vc é menor de idade, tem "
                    + idade + " anos.");
        }else{
            System.out.println(nome + " vc é maior de idade, tem "
                    + idade + " anos.");
        }
        
    }
    public static void lerScaner(){
        int idade;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o nome da pessoa: ");
        String nome = leitor.next();
        
        System.out.println("Digite a idade da pessoa: ");
        idade = leitor.nextInt();
        
        System.out.println("Digite o peso da pessoa: ");
        float peso = leitor.nextFloat();
        
        System.out.println("Ola " + nome );
    }
    
    public static void desvios(){
       int n1 = 2;
       int n2 = 10;
       
       if(n1 > n2){
           System.out.println(n1 + " é maior que " + n2);
       }else{
           System.out.println(n1 + " é menor que " + n2);
       }
       
    }
    
    public static void operadoresComparacao(){
        int n1 = 10;
        int n2 = 2;
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(n1 < n2);
        System.out.println(n1 > n2);
        System.out.println(n1 <= n2);
        System.out.println(n1 >= n2);
    }
    
    public static void operadoresMatematicos(){
        int n1 = 10;
        int n2 = 3;
        System.out.println("Soma " + (n1 + n2));
        System.out.println("Sutração " + (n1 - n2));
        System.out.println("Multiplicação " + (n1 * n2));
        System.out.println("Divisão " + (n1 / n2));
        System.out.println("Resto " + (n1 % n2));
        
        n1++;
        System.out.println(n1);
        n1 = n1 + 1;
        System.out.println(n1);
        
        n2--;
        System.out.println(n2);
        n2 = n2 - 1;
        System.out.println(n2);
        
    }
    
    public static void variaveis(){
        //variaveis primitivas
        String nome = "José da Silva";
        int idade = 127;
        float peso = 59.5f;
        double altura = 1.75;
        boolean autorizado = false;
        char sexo = 'F';
        
        //       
        String precoProduto = "10.99";
        String quantidadeProduto = "10";
        String desconto = "10.5";

        //converte tipo String para float        
        Float preco = Float.parseFloat(precoProduto);
       
        //converte tipo String para Integer
        Integer qtde = Integer.parseInt(quantidadeProduto);
        
        //conversão do tipo String para double
        double bonus = Double.parseDouble(desconto);
        
        float resultado = preco * qtde;
        float valorfinal = (resultado *  (float)bonus)/100;
               
        System.out.println("Total R$ " + String.format("%.2f", resultado));
        System.out.println("Desconto R$ " + String.format("%.2f", valorfinal));
    }
    
    
    
}
