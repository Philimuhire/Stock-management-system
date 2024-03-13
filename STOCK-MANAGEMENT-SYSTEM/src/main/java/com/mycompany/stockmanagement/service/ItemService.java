package com.mycompany.stockmanagement.service;

import com.mycompany.stockmanagement.entities.ITEM;
import com.mycompany.stockmanagement.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<ITEM> getAllItems() {
        return itemRepository.findAll();
    }

    public ITEM getItemById(int id) {
        return itemRepository.findById(id).orElse(null);
    }

    public ITEM createItem(ITEM item) {
        return itemRepository.save(item);
    }

    public ITEM updateItem(int id, ITEM updatedItem) {
        if (itemRepository.existsById(id)) {
            updatedItem.setItemID(id);
            return itemRepository.save(updatedItem);
        } else {
            return null;
        }
    }

    public boolean deleteItem(int id) {
        if (itemRepository.existsById(id)) {
            itemRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
