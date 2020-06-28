package me.silver.silvermap.chunk;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ChunkHandler {

    //  TODO: Multi-thread this process?
    public void loadChunk(net.minecraft.world.chunk.Chunk chunk) {
        Chunk mapChunk = new Chunk(chunk.x, chunk.z);

        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                Column column = new Column();
                Material currentMaterial = chunk.getBlockState(x, 255, z).getMaterial();
                int count = 0;

                for (int y = 254; y >= 0; y--) {
                    Material material = chunk.getBlockState(x, y, z).getMaterial();

                    if (material != currentMaterial) {
                        BlockStack stack = new BlockStack(currentMaterial, y + 1, count);

                        currentMaterial = material;
                        count = 0;
                    } else {
                        count++;
                    }
                }
            }
        }
    }
}
