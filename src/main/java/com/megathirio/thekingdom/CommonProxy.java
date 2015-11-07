package com.megathirio.thekingdom;

import com.megathirio.thekingdom.block.ModBlocks;
import com.megathirio.thekingdom.item.ModItems;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by TheJackyl on 11/7/2015.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        ModItems.init();
        ModBlocks.init();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
