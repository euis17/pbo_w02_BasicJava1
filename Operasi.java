/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w02_basicjava;

/**
 *
 * @author ewiss
 */
interface Operasi {
    int  tambah(int a,int b);

}
class Kalkulator implements Operasi{
    public int tambah (int a,int b){return a+b; }
}