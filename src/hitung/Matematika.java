/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitung;

/**
 *
 * @author adria
 */
public class Matematika {
    //membuat variable
    private double bil1, bil2;
    
    //membuat constructor
    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    //membuat method setPenjumlahan
    public double setPenjumlahan() {
        return bil1 + bil2;
    }
    
    //membuat method setPengurangan
    public double setPengurangan() {
        return bil1 + bil2;
    }
    
    //membuat method setPerkalian
    public double setPerkalian() {
        return bil1 * bil2;
    }
    
    //membuat method setPembagian
    public double setPembagian() {
        return bil1 / bil2;
    }
}
