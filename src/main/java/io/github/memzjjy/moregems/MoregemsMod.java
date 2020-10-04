package io.github.memzjjy.moregems;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MoregemsMod implements ModInitializer {
    public static final Item BLUE_GEM = new Item(new Item.Settings().group(ItemGroup.MISC)); //创建蓝宝石物品石粒(doge)
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("moregems", "blue_gem"), BLUE_GEM);//注册物品
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        System.out.println("Load moregems main class");
    }
}
