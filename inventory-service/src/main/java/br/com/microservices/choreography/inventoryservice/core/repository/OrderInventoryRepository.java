package br.com.microservices.choreography.inventoryservice.core.repository;

import br.com.microservices.choreography.inventoryservice.core.model.OrderInventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderInventoryRepository extends JpaRepository<OrderInventory, Integer> {

    Boolean existsByOrderIdAndTransactionId(String orderId, String transactionId);
    List<OrderInventory> findByOrderIdAndTransactionId(String orderId, String transactionId);

}
