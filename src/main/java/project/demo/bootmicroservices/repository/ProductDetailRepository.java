package project.demo.bootmicroservices.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project.demo.bootmicroservices.model.ProductDetail;

/**
 *
 * @author novaks
 */
@Repository
public interface ProductDetailRepository extends CrudRepository<ProductDetail, String> {
	
}