package me.silver.silvermap;

import net.minecraft.client.Minecraft;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class EventHandler {

    private MapHandler silverMap = MapHandler.getInstance();

    @SubscribeEvent
    public void onTick(TickEvent.WorldTickEvent event) {
        // TODO: Find a better event for this to live in
        if (Minecraft.getMinecraft().world != null) {
            silverMap.load();
        } else {
            silverMap.unload();
        }
    }

    @SubscribeEvent
    public void onChunkLoad(ChunkEvent.Load event) {

    }

    @SubscribeEvent
    public void onChunkUnload(ChunkEvent.Unload event) {

    }

    // Not particularly useful because it's not necessarily called after a world is unloaded
    @SubscribeEvent
    public void onWorldLoad(WorldEvent.Load event) {

    }

    // Possibly a better place for the unload() method
    @SubscribeEvent
    public void onWorldUnload(WorldEvent.Unload event) {

    }

}
