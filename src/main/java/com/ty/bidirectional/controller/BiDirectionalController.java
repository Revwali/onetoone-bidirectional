package com.ty.bidirectional.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.bidirectional.dto.Invoice;
import com.ty.bidirectional.dto.Item;

public class BiDirectionalController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
	/*	Item item = new Item();
		Item item2 = new Item();
		Invoice invoice = new Invoice();
		Invoice invoice2 = new Invoice();
		invoice.setBillingAdress("ssfsd");
		invoice.setGetNumber("as56l032");
		invoice.setId(1);
		invoice.setName("aseds");
		invoice.setTax(15.0);
		item.setId(1);
		item.setName("pen");
		item.setPrice(5.0);
		item.setQuantity(5);
		invoice.setItem(item);
		// ------------------------
		invoice2.setBillingAdress("redfs");
		invoice2.setGetNumber("re4587l");
		invoice2.setId(2);
		invoice2.setName("fees");
		invoice2.setTax(25.0);
		item2.setId(2);
		item2.setName("ball");
		item2.setPrice(15.0);
		item2.setQuantity(55);
		invoice2.setItem(item2);
		entityTransaction.begin();
		entityManager.persist(invoice);
		entityManager.persist(invoice2);
		entityTransaction.commit();  */
		Item item2 = new Item();
		item2.setId(2);
		item2.setName("football");
		item2.setPrice(15.0);
		item2.setQuantity(55);
		Invoice invoice=new Invoice();
		invoice.setBillingAdress("bernabeu");
		invoice.setGetNumber("santiago");
		invoice.setId(1);
		invoice.setItem(item2);
		entityTransaction.begin();
		entityManager.remove(entityManager.find(Invoice.class, invoice.getId()));
		entityTransaction.commit();
	}

}
