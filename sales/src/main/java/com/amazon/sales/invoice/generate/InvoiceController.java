package com.amazon.sales.invoice.generate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {

	@Autowired
	private InvoiceService invoiceService;

	@RequestMapping(value = "/invoice", method = RequestMethod.POST)
	public void generateInvoice(@RequestBody List<InvoiceDto> invoiceDto) {
		invoiceService.genrateInvoice(invoiceDto);
	}

}
