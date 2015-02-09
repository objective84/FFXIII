package com.rational.repository;

import com.rational.model.entities.Item;
import com.rational.model.entities.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    @Query("Select w From Weapon w where w.name=:name")
    Weapon findWeaponFromName(String name);

    @Query("Select w From Weapon w")
    List<Weapon> findAllWeapons();

    @Query("Select w From Weapon w where w.character=:character and w.itemGroup=null")
    List<Weapon> findWeaponGroupsForCharacter(@Param("character") String character);

    @Query("Select w From Weapon w where w.itemGroup=:weaponGroup or w.name=:weaponGroup")
    List<Weapon> findWeaponsForGroup(@Param("weaponGroup") String weaponGroup);

}
