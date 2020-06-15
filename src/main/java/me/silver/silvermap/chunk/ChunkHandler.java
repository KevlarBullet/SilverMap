package me.silver.silvermap.chunk;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ChunkHandler {

    // Multi-thread this process?
    public void loadChunk(net.minecraft.world.chunk.Chunk chunk) {
        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                Material currentMaterial;

                for (int y = 255; y >= 0; y--) {
                    Material material = chunk.getBlockState(x, y, z).getMaterial();

                }
            }
        }
    }
}
