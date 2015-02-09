package com.rational.controller;

import com.rational.facade.ItemFacade;
import com.rational.model.entities.Weapon;
import com.rational.model.enums.CharactersEnum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sun.misc.CharacterEncoder;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class WeaponController {

    private static final String WEAPONS = "weapons";

    @Resource
    ItemFacade itemFacade;

    @RequestMapping(value="/weapons", method = RequestMethod.GET)
    public ModelAndView weapons(final Model model){
        ModelAndView mav = new ModelAndView(WEAPONS);
        mav.addObject("characters", CharactersEnum.getValues());
        return mav;
    }

    //AJAX methods
    @RequestMapping(value="/weapons/{character}", method = RequestMethod.GET)
    public List<String> getWeaponGroupsForCharacter(@PathVariable String character){
        return itemFacade.getWeaponGroupsForCharacter(character);
    }

    @RequestMapping(value="/weapons/{weaponGroup}", method = RequestMethod.GET)
    public List<Weapon> getWeaponsInGroup(@PathVariable String weaponGroup){
        return itemFacade.getWeaponsInGroup(weaponGroup);
    }
}
