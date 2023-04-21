/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

/**
 *
 * @author EMNA
 */
public class ErreurRang extends Exception {
    private int RangE;
    public ErreurRang (int n )
    {
        RangE=n;
    }
    public int getRangE(){
        return RangE;
    }
    
}
