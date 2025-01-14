package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
<<<<<<< HEAD
		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
=======
		Seller seller = sellerDao.findById(2);
>>>>>>> 090a597db1bd61aeb1c610ff5a454143f52b0ba1
		
		System.out.println(seller);

	}

}
