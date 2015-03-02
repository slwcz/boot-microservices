package project.demo.bootmicroservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import project.demo.bootmicroservices.model.ProductDetail;

/**
 *
 * @author novaks
 */
@Repository
public interface ProductDetailRepository extends PagingAndSortingRepository<ProductDetail, String> {
	
	@Query("select p from ProductDetail p where UPPER(p.productName) like UPPER(?1) or " + "UPPER(p.longDescription) like UPPER(?1)") 
	List<ProductDetail> search(String term);
}