package org.dmontes.salango.controller_;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.dmontes.salango.model.Items;
import org.dmontes.salango.service.ItemsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/items") 
public class ItemsController {

	private ItemsService itemService;

	public ItemsController(ItemsService itemService) {
		super();
		this.itemService = itemService;
	}

	// build create item REST API
	@PostMapping
	public ResponseEntity<Items> saveItem(@RequestBody Items item) {
		return new ResponseEntity<Items>(itemService.saveItems(item), HttpStatus.CREATED);
	}

	// build get all items REST API
	@GetMapping
	public List<Items> getAllItems() {
		return itemService.getAllItems();
	}

	// build get Item by Id REST API
	// http://localhost:8080/api/items/1
	@GetMapping("{itemId}")
	public ResponseEntity<Items> getItemsById(@PathVariable("itemId") Integer itemId) {
		return new ResponseEntity<Items>(itemService.getItemsById(itemId), HttpStatus.OK);
	}

	// build update Item by Id REST API
	// http://localhost:8080/api/items/1
	@PutMapping("{itemId}")
	public ResponseEntity<Items> updateItem(@PathVariable("itemId") Integer itemId, @RequestBody Items item) {
		return new ResponseEntity<Items>(itemService.updateItem(item, itemId), HttpStatus.OK);
	}

	// build update Item by Id REST API
	// http://localhost:8080/api/items/1
	@DeleteMapping("{itemId}")
	public ResponseEntity<String> deleteItem(@PathVariable("itemId") Integer itemId) {
		itemService.deleteItem(itemId);
		return new ResponseEntity<String>("Item Deleted successfully!", HttpStatus.OK);
	}
	
}
