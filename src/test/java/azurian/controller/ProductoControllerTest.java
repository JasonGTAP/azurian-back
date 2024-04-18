package azurian.controller;

import azurian.modelo.Producto;
import azurian.service.ProductoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ProductoControllerTest {

    @Mock
    private ProductoService productoService;

    @InjectMocks
    private ProductoController productoController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void obtenerProductos() {

        Producto producto1 = new Producto(1, "Producto 1", 10.0, 100);
        Producto producto2 = new Producto(2, "Producto 2", 20.0, 200);
        List<Producto> productos = Arrays.asList(producto1, producto2);


        when(productoService.listarProductos()).thenReturn(productos);


        List<Producto> productosObtenidos = productoController.obtenerProductos();


        assertEquals(2, productosObtenidos.size());
        assertEquals(producto1, productosObtenidos.get(0));
        assertEquals(producto2, productosObtenidos.get(1));
        System.out.println("Pase sin ERROR al implementar la prueba");
    }



    @Test
    void obtenerProductos_listaVacia() {
        // Configuración
        List<Producto> productosVacios = Collections.emptyList();
        when(productoService.listarProductos()).thenReturn(productosVacios);

        // Ejecución
        List<Producto> productosObtenidos = productoController.obtenerProductos();

        // Verificación
        assertTrue(productosObtenidos.isEmpty());
        System.out.println("La prueba de lista vacía pasó sin errores.");
    }

    @Test
    void obtenerProductos_productoInexistente() {
        // Configuración
        Producto productoInexistente = new Producto(3, "Producto Inexistente", 15.0, 150);
        List<Producto> productos = Arrays.asList(
                new Producto(1, "Producto 1", 10.0, 100),
                new Producto(2, "Producto 2", 20.0, 200)
        );
        when(productoService.listarProductos()).thenReturn(productos);

        // Ejecución
        List<Producto> productosObtenidos = productoController.obtenerProductos();

        // Verificación
        assertEquals(2, productosObtenidos.size());
        assertFalse(productosObtenidos.contains(productoInexistente));
        System.out.println("La prueba de producto inexistente pasó sin errores.");
    }



}
