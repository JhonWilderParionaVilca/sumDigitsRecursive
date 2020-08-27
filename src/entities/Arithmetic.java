/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author bh
 */
public class Arithmetic {

    public Arithmetic() {
    }

    public int getSumDigitsRecursive(int num) {
        if (num == 0) {
            return num;//si numero es cero lo retornamos
        }

        return (num % 10) + getSumDigitsRecursive(num / 10);
    }

}
