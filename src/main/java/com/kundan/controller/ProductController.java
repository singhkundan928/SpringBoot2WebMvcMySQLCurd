package com.kundan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kundan.model.Product;
import com.kundan.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	//1. Show Register Page here
	// ..../product/register
	@GetMapping("/add")
	public String addProduct() {
		return "AddProduct";
	}
	
	//2. On click submit button
	/**
	 * 
	 * Read from data as ModelAtribute
	 * save in database using productService(product)
	 * return message to UI page (ProductRegisterpage)
	 */
	@PostMapping("/save")
	public String saveProduct(@ModelAttribute Product product,Model model) {
		Product p= productService.addProduct(product);
		model.addAttribute("message", "SAVED WITH ID"+p.getProdId());
		return "AddProduct";
		
	}
	
	//3. Display all row at UI
	/**
	 * If we enter URL: product/add in browser
	 * then gets all rows as List from database
	 * send to UI using model memory
	 * @param model
	 * @return
	 */
	@GetMapping("/all")
	public String getAllProduct(Model model){
		List<Product> productList= productService.getAllProduct();
		model.addAttribute("list", productList);
		return "ShowProduct";
	}
	
	//4. Remove one row by id
	
	//....product/delete?id=__
	@GetMapping("/delete")
	public String remove(@RequestParam("id") Integer prodId,Model model) {
		productService.deleteProduct(prodId);
		List<Product> productList =  productService.getAllProduct();
		model.addAttribute("list", productList);
		model.addAttribute("message","Product '"+prodId+"' Deleted");
		return "ShowProduct";
	}
	
	//5. Show edit page
	@GetMapping("/edit")
	public String showEdit(@RequestParam("id") Integer prodId, Model model) {
		// Call ProductService to get one Object
		Product product = productService.getOneProduct(prodId);
		// Send data to Form for edit
		model.addAttribute("product", product);
		
		return "ProductEdit";
	}
	
	//6. Click on Update
	@PostMapping("/update")
	public String update(@ModelAttribute Product product, Model model) {
		productService.updateProduct(product);
		List<Product> productList =productService.getAllProduct();
		model.addAttribute("list", productList);
		model.addAttribute("message", "Product '"+product.getProdId()+"' updated");
		return "ShowProduct";
	}
}


