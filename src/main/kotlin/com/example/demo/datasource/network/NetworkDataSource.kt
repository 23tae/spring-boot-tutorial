package com.example.demo.datasource.network

import com.example.demo.datasource.BankDataSource
import com.example.demo.model.Bank
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.web.client.RestTemplate

@Repository("network")
class NetworkDataSource(
    @Autowired private val restTemplate: RestTemplate
) : BankDataSource {
    override fun retrieveBanks(): Collection<Bank> {
        TODO("Not yet implemented")
    }

    override fun retrieveBank(accountNumber: String): Bank {
        TODO("Not yet implemented")
    }

    override fun createBank(bank: Bank): Bank {
        TODO("Not yet implemented")
    }

    override fun updateBank(bank: Bank): Bank {
        TODO("Not yet implemented")
    }

    override fun deleteBank(accountNumber: String) {
        TODO("Not yet implemented")
    }
}