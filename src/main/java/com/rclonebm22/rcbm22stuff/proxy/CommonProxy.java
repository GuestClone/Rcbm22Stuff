package com.rclonebm22.rcbm22stuff.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {

    }



    public void init(FMLInitializationEvent event) {

    }



    public void postInit(FMLPostInitializationEvent event) {

    }



    public void serverInit(FMLServerStartingEvent event) {

    }

    public void registerItemRenderer(Item item, int meta, String id) {

    }
    public EntityPlayer getPlayerClient() {
        return null;
    }
}
