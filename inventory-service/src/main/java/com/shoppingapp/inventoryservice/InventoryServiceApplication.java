package com.shoppingapp.inventoryservice;

import com.shoppingapp.inventoryservice.model.Inventory;
import com.shoppingapp.inventoryservice.repo.InventoryRepo;
import com.shoppingapp.inventoryservice.service.InventoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class InventoryServiceApplication {
	private final InventoryRepo inventoryRepo;

	public InventoryServiceApplication(InventoryRepo inventoryRepo) {
		this.inventoryRepo = inventoryRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryService inventoryService){
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("iphone14");
			inventory.setQuantity(100);

			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("iphone15");
			inventory1.setQuantity(200);

			inventoryRepo.save(inventory);
			inventoryRepo.save(inventory1);
		};
	}

}
