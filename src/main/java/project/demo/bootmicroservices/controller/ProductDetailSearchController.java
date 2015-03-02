package project.demo.bootmicroservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import project.demo.bootmicroservices.model.ProductDetail;
import project.demo.bootmicroservices.repository.ProductDetailRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/search")
public class ProductDetailSearchController {
	
	private final ProductDetailRepository repository;

	@Autowired
	public ProductDetailSearchController(ProductDetailRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<ProductDetail> search(@RequestParam("q") String queryTerm) {
		List<ProductDetail> productDetails = repository.search("%" + queryTerm + "%");
		return productDetails == null ? new ArrayList<>() : productDetails;
	}
}