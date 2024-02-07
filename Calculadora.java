/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import javax.swing.*;
import java.lang.*;

public class Calculadora {
    public static void main(String[] args) {
        JOptionPane p = new JOptionPane();
        String expressao = p.showInputDialog("Coloque sua expressão \n Ex: 12 + 34 ou 12 * 34");
        String exvet[] = expressao.split(" ");
        int n1 = Integer.parseInt(exvet[0]);
        int n2 = Integer.parseInt(exvet[2]);
        float resposta = 0;
        switch (exvet[1]){
            case "/":
                    resposta = n1 / n2;
                break;
            case "+":
                    resposta = n1 + n2;
                break;    
            case "-":
                    resposta = n1 - n2;
                break;
            case "*":
                    resposta = n1 * n2;
                break;
            
        }
        p.showMessageDialog(null,resposta);
    }
}
