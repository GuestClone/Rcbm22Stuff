package com.rclonebm22.rcbm22stuff;

import com.rclonebm22.rcbm22stuff.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class rcbm22stuff
{


    @Mod.Instance(Reference.MODID)
    public static rcbm22stuff instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
    public static CommonProxy proxy;



    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // MinecraftForge.EVENT_BUS.register();
        proxy.init(event);
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);
    }

    @Mod.EventHandler
    public void serverInit(FMLServerStartingEvent event) {
        proxy.serverInit(event);
    }
    static { FluidRegistry.enableUniversalBucket(); }
}
