package com.megathirio.thekingdom;

import com.megathirio.thekingdom.utilities.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by TheJackyl on 11/7/2015.
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Main {
    @Mod.Instance
    public static Main instance = new Main();

    @SidedProxy(clientSide=Reference.CLIENT_PROXY, serverSide=Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        System.out.println("Called method: preInit");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        System.out.println("Called method: init");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        System.out.println("Called method: postInit");

    }
}
