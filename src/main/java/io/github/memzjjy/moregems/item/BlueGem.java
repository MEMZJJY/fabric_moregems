package io.github.memzjjy.moregems.item;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class BlueGem implements ModInitializer {
    public  static final Item BLUE_GEM =new Item(new Item.Settings().group(ItemGroup.MISC));
    @Override
    public void onInitialize()
    {
        Registry.register(Registry.ITEM,new Identifier("moregems","blue_gem"),BLUE_GEM);

    }
}
