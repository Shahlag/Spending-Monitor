package com.example.Spending.Monitor.repository;

import com.example.Spending.Monitor.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUserUsername(String username);
    Transaction findByIdAndUserUsername(Long id, String username);
}
