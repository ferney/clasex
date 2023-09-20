/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animale;

public class Main {
    public static void main(String[] args) {
        Animal x= new Animal("felinos", "michi");
        Animal y= new Animal("canino", "firulais");
        
        System.out.println(""+x.toString());
        System.out.println(""+y.toString());
    }
}
