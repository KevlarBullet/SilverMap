package me.silver.silvermap.chunk;

import net.minecraft.block.material.Material;

import java.util.Stack;

public class Column {

    private Stack<BlockStack> stackStack = new Stack<>();

    public void addBlockStack(BlockStack stack) {
        stackStack.push(stack);
    }

}
