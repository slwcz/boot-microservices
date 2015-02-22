package project.demo.bootmicroservices.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author novaks
 */
@Entity
public class ProductDetail {
	
	@Id
	private String productId;
	
	private String productName;
	private String shortDescription;
	private String longDescription;
	private String inventoryId;

	/**
	 * @return
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @return
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * @param shortDescription
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	/**
	 * @return
	 */
	public String getLongDescription() {
		return longDescription;
	}

	/**
	 * @param longDescription
	 */
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	/**
	 * @return
	 */
	public String getInventoryId() {
		return inventoryId;
	}

	/**
	 * @param inventoryId
	 */
	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}
}