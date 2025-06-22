package org.bedu.s6reto1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class InventarioApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventarioApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ProductoRepository repo) {
        return args -> {

            repo.save(new Producto("Laptop Lenovo", "Laptop con 16GB RAM", 12500));
            repo.save(new Producto("Mouse Logitech", "Mouse inalámbrico", 350));
            repo.save(new Producto("Teclado Mecánico", "Teclado RGB switches azules", 950));
            repo.save(new Producto("Monitor", "Monitor 27 pulgadas", 3200));

            System.out.println("📦 Productos con precio mayor a 500:");
            repo.findByPrecioGreaterThan(500)
                    .forEach(System.out::println);

            System.out.println("\n🔍 Productos que contienen 'lap':");
            repo.findByNombreContainingIgnoreCase("lap")
                    .forEach(System.out::println);

            System.out.println("\n🎯 Productos con precio entre 400 y 1000:");
            repo.findByPrecioBetween(400, 1000)
                    .forEach(System.out::println);

            System.out.println("\n📘 Productos cuyo nombre empieza con 'm':");
            repo.findByNombreStartingWithIgnoreCase("m")
                    .forEach(System.out::println);
        };
    }
}
