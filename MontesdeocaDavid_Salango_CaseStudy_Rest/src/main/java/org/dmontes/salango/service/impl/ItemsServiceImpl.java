package org.dmontes.salango.service.impl;

import java.util.List;

import org.dmontes.salango.exception.ResourceNoFoundException;
import org.dmontes.salango.model.Items;
import org.dmontes.salango.repository.ItemsRepository;
import org.dmontes.salango.service.ItemsService;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

	private ItemsRepository itemRepository;

	public ItemsServiceImpl(ItemsRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}

	@Override
	public Items saveItems(Items item) {
		// TODO Auto-generated method stub
		return itemRepository.save(item);
	}

	@Override
	public List<Items> getAllItems() {
		return itemRepository.findAll();
	}

	@Override
	public Items getItemsById(Integer itemId) {
//		Optional<Items> item = itemRepository.findById((long) itemId);
//		 if (item.isPresent()) {
//			 return item.get();
//		 }
//		 else {
//			 throw new ResourceNoFoundException("Items", "Id", itemId);
//		 }
		return itemRepository.findById(itemId)
				.orElseThrow(() -> new ResourceNoFoundException("Items", "itemId", itemId));
	}

	@Override
	public Items updateItem(Items item, Integer itemId) {
		// check whether item with given Id exists in the DB or not
		Items existingItem = itemRepository.findById(itemId)
				.orElseThrow(() -> new ResourceNoFoundException("Items", "itemId", itemId));
		existingItem.setName(item.getName());
		existingItem.setDescription(item.getDescription());
		existingItem.setPrice(item.getPrice());
		existingItem.setType(item.getType());
		existingItem.setImage(item.getImage());
		existingItem.setDeleted(item.getDeleted());
		itemRepository.save(existingItem);
		return existingItem;
	}

	@Override
	public void deleteItem(Integer itemId) {
		// check whether item with given Id exists in the DB or not
		itemRepository.findById(itemId)
				.orElseThrow(() -> new ResourceNoFoundException("Items", "itemId", itemId));
		itemRepository.deleteById(itemId);
	}
}
