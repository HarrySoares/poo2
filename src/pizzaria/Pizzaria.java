/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzaria;

public class Pizzaria {

    public static void main(String [] args) {

        Pizza massaFina = new MassaFinaPizza();
        Pizza mar = new Ovo(massaFina);

        System.out.println(mar.custo());
        System.err.println(mar.getDescricao());
    }

}
