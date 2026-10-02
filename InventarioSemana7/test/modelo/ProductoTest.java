package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoTest {

	
	  @Test
	    void debeRechazarStockNegativo() {
	        Producto producto = new Producto("Teclado", 10);
	        assertThrows(IllegalArgumentException.class, () -> {
	            producto.setStock(-5);
	        });
	    }
	  
	

}
