package org.bedu.s6reto2;

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
    public CommandLineRunner demo(ProductoRepository productoRepo, MarcaRepository marcaRepo) {
        return args -> {
            Marca apple = marcaRepo.save(new Marca("Apple"));
            Marca samsung = marcaRepo.save(new Marca("Samsung"));

            productoRepo.save(new Producto("iPhone 15", "Teléfono Apple", 23000, apple));
            productoRepo.save(new Producto("iPad Pro", "Tablet Apple", 28000, apple));
            productoRepo.save(new Producto("Galaxy S23", "Teléfono Samsung", 21000, samsung));
            productoRepo.save(new Producto("Smart TV", "Televisión Samsung", 15000, samsung));

            System.out.println("\n📚 Productos por marca:");
            marcaRepo.findAll().forEach(marca -> {
                System.out.println("🏷️ " + marca.getNombre() + ":");
                productoRepo.findAll().stream()
                        .filter(p -> p.getMarca().getId().equals(marca.getId()))
                        .forEach(p -> System.out.println("   - " + p.getNombre()));
            });
        };
    }
}
