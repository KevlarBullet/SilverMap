package me.silver.silvermap;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = SilverMap.MODID, name = SilverMap.NAME, version = SilverMap.VERSION)
public class SilverMap {
    public static final String MODID = "silvermap";
    public static final String NAME = "SilverMap";
    public static final String VERSION = "-1";

    public static Logger LOGGER;

    @Mod.Instance(MODID)
    private static SilverMap INSTANCE;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new EventHandler());
    }

    // TODO: Make this server-specific instead of universal
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
