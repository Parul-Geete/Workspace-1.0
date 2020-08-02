package com.amazon.sales.invoice.generate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepo extends JpaRepository<InvoiceEntity, Integer> {

}
