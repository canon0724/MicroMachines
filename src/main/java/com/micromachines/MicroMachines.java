package com.micromachines;


import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = MicroMachines.MODID, name = MicroMachines.NAME, version = MicroMachines.VERSION)
public class MicroMachines {
    public static final String MODID = "micromachines";
    public static final String NAME = "Micro Machines";
    public static final String VERSION = "1.0.0";

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        //比如在这里做一些更改 from canon
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
