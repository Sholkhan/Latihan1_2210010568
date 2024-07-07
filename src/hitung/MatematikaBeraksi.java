/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung;

/**
 *
 * @author adria
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat object
        Matematika sholkhan = new Matematika(6,8);
        
        System.out.println("hasil penjumlahan: "+sholkhan.setPenjumlahan());
        System.out.println("hasil pengurangan: "+sholkhan.setPengurangan());
        System.out.println("hasil perkalian: "+sholkhan.setPerkalian());
        System.out.println("hasil pembagian: "+sholkhan.setPembagian());
    }
}
