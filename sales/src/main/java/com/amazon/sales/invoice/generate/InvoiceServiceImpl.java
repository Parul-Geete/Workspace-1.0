package com.amazon.sales.invoice.generate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	private InvoiceRepo invoiceRepo;

	@Override
	public void genrateInvoice(List<InvoiceDto> invoiceDtos) {
		List<InvoiceEntity> InvoiceEntites = convertToInvoice(invoiceDtos);
		invoiceRepo.saveAll(InvoiceEntites);

	}

	private List<InvoiceEntity> convertToInvoice(List<InvoiceDto> invoiceDtos) {
		List<InvoiceEntity> EntityList = new ArrayList<InvoiceEntity>();

		for (InvoiceDto inDto : invoiceDtos) {

			InvoiceEntity entity = new InvoiceEntity();
			entity.setDueDate(inDto.getDueDate());
			entity.setBalance(inDto.getBalance());
			entity.setDocNumber(inDto.getDocNumber());
			entity.setStatus(inDto.getStatus());
			entity.setDescription(inDto.getDescription());
			entity.setDetailType(inDto.getDetailType());
			EntityList.add(entity);

		}
		return EntityList;
	}
}
