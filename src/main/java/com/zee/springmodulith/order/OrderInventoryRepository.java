package com.zee.springmodulith.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface  OrderInventoryRepository  extends CrudRepository<OrderInventory, Long> {
    @Query(nativeQuery = true, value = "SELECT SUM(oi.total_qty_price) from order_inventory oi where io .order_id = ?1")
    long orderIdAmount(long orderId);
}
