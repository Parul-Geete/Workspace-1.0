package com.amazon.sales.invoice.generate;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface InvoiceService {

	public void genrateInvoice(List<InvoiceDto> invoiceDto);

}
