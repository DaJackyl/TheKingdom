package com.megathirio.thekingdom.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by TheJackyl on 11/7/2015.
 */
public class ModBlocks {

    public static Block tutorialBlock;

    public static final void init() {
        GameRegistry.registerBlock(tutorialBlock = new BasicBlock("tutorialBlock", Material.iron), "tutorialBlock");
    }

}
