package com.megathirio.thekingdom.item;

import com.megathirio.thekingdom.utilities.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by TheJackyl on 11/7/2015.
 */
public class ModItems {

    public static Item tutorialItem;

    public static final void init() {
        tutorialItem = new Item().setUnlocalizedName("tutorialItem").setCreativeTab(CreativeTabs.tabMisc).setTextureName(Reference.MOD_ID + ":tutorialItem");
        GameRegistry.registerItem(tutorialItem, "tutorialItem");
    }

}
