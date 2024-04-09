package com.example.demo.datasource.mock

import com.example.demo.datasource.BankDataSource
import com.example.demo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("1234", 3.0, 17),
        Bank("1010", 12.0, 10),
        Bank("5678", 23.0, 100)
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}