package com.example.Spending.Monitor.controller;

import com.example.Spending.Monitor.model.Transaction;
import com.example.Spending.Monitor.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/SpendMon/transactions")
@CrossOrigin
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    // Add transaction for given username
    @PostMapping("/{username}")
    public Transaction addTransaction(@RequestBody Transaction transaction, @PathVariable String username) {
        return transactionService.addTransaction(transaction, username);
    }

    // Get all transactions for given username
    @GetMapping("/{username}")
    public List<Transaction> getAllTransactions(@PathVariable String username) {
        return transactionService.getAllTransactions(username);
    }

    // Delete specific transaction by id and username
    @DeleteMapping("/{username}/{id}")
    public void deleteTransaction(@PathVariable String username, @PathVariable Long id) {
        transactionService.deleteTransaction(id, username);
    }
}
