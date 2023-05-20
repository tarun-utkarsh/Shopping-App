package com.shoppingapp.inventoryservice.repo;

import com.shoppingapp.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Integer> {
    Optional<Inventory> findBySkuCode(String skuCode);
}
