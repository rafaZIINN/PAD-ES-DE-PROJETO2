/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author Rafael
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      FactoryFabrica factory = new FactoryFabrica();
      String modelo = "Redmi 4A";
      String marca = "xiaomi";
      factory.getFabricaCelular(marca, modelo);
      
      
      FactoryFabrica factory1 = new FactoryFabrica();
      String modelo1 = "iPhone XS";
      String marca1 = "apple";
      factory1.getFabricaCelular(marca1, modelo1);
    }
    
}
