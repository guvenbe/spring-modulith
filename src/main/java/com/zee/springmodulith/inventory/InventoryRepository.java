package com.zee.springmodulith.inventory;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

interface InventoryRepository extends CrudRepository<Inventory, Long> {
    Optional<Inventory> getInventoriesByName(String name);
    List<Inventory> getInventoriesByNameIn(List<String> names);
}
