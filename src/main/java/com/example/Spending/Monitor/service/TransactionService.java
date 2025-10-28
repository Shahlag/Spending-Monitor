package com.example.Spending.Monitor.service;

import com.example.Spending.Monitor.model.Transaction;

import java.util.List;

public interface TransactionService {
    Transaction addTransaction(Transaction transaction, String username);
    List<Transaction> getAllTransactions(String username);
    void deleteTransaction(Long id, String username);
}
