package com.picpaysimplicado.repositories;

import com.picpaysimplicado.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITransactionRepository extends JpaRepository<Transaction, Long> {
}
