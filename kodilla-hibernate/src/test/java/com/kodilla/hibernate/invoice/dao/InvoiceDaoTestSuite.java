package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Item item = new Item(new BigDecimal(10), 2);
        Item item2 = new Item(new BigDecimal(8), 5);


        Invoice invoice = new Invoice("AD/23");

        invoice.getItems().add(item);
        item.setInvoice(invoice);

        invoice.getItems().add(item2);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        int qty = invoice.getItems().size();

        //Then
        assertNotEquals(0, id);
        assertEquals(2, qty);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
