/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *La clase Micompra servirá para realizar una lista de la compra
 * @author paula
 * @version 13.2
 */
public class Micompra {
    
      private int pantalones;
	private int camisas;
	private int sudaderas;
	
        
     
	public void realizarCompra() {
		pantalones++;
		camisas++;
		sudaderas++;
	}
        
        /**
         * El metodo getPantalones nos devuelve la cantidad de pantalones
         * @return cantidad de pantalones
         */
	public int getPantalones() {
		return pantalones;
	}
       /**
        * El metodo getCamisas nos devuelve la cantidad de camisas
        * @return cantidad de camisas
        */
	public int getCamisas() {
		return camisas;
	}
        /**
         * El metodo getSudaderas nos devuelve la cantidad de sudaderas
         * @return cantidad de sudaderas
         */
        
	public int getSudaderas() {
		return sudaderas;
	}
        
       /**
        * El metodo sumaCamisasyPantalones nos devuelve el valor de la suma entre pantalones y camisas
        * @param pantalones cantidad de pantalones
        * @param camisas canntidad de camisas
        * @return la suma entre pantalones y camisas
        */
        public int sumaCamisasyPantalones(int pantalones, int camisas){
            return pantalones+camisas;
        }
    
}
