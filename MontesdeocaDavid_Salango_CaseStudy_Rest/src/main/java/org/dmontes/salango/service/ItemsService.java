package org.dmontes.salango.service;

import java.util.List;

import org.dmontes.salango.model.Items;

public interface ItemsService {
  Items saveItems(Items item);
  List<Items> getAllItems();
  Items getItemsById(Integer itemId);
  Items updateItem(Items item , Integer itemId);
  public void deleteItem(Integer itemId);
} 
