package project.demo.bootmicroservices.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import project.demo.bootmicroservices.model.ProductDetail;

@Component
public class ProductDetailValidator implements Validator {
	
//	private final InventoryService inventoryService;

//	@Autowired
	public ProductDetailValidator() {
	//	this.inventoryService = inventoryService;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return ProductDetail.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
//		ProductDetail detail = (ProductDetail) target;
//		if (!inventoryService.isValidInventory(detail.getInventoryId())) {
//			errors.rejectValue("inventoryId", "inventory.id.invalid",
//					"Inventory ID is invalid");
//		}
	}
}