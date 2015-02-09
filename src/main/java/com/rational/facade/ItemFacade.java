package com.rational.facade;

import com.rational.model.entities.Weapon;
import com.rational.service.ItemService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class ItemFacade {

    @Resource
    private ItemService itemService;

    public List<Weapon> getWeaponsInGroup(String weaponGroup){
        return itemService.findWeaponsInGroup(weaponGroup);
    }

    public List<String> getWeaponGroupsForCharacter(String character){
        List<Weapon> weaponGroups = itemService.findWeaponGroupsForCharacter(character);
        List<String> weaponGroupNames = new ArrayList<String>();

        for(Weapon weapon : weaponGroups){
            weaponGroupNames.add(weapon.getName());
        }

        return weaponGroupNames;
    }
}
