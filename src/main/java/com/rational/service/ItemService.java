package com.rational.service;

import com.rational.model.entities.Item;
import com.rational.model.entities.Weapon;
import com.rational.repository.ItemRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ItemService {

    @Resource
    private ItemRepository itemRepository;

    public Item findItem(int id){
        return itemRepository.findOne(id);
    }

    public List<Item> findAllItems(){
        return itemRepository.findAll();
    }

    public Weapon findWeaponWithName(String weapon){
        return itemRepository.findWeaponFromName(weapon);
    }

    public List<Weapon> findAllWeapons(){
        return itemRepository.findAllWeapons();
    }

    public List<Weapon> findWeaponsInGroup(String weaponGroup){
        return itemRepository.findWeaponsForGroup(weaponGroup);
    }

    public List<Weapon> findWeaponGroupsForCharacter(String character) {
        return itemRepository.findWeaponGroupsForCharacter(character);
    }
}
