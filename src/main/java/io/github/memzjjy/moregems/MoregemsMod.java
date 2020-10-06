package io.github.memzjjy.moregems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MoregemsMod implements ModInitializer {
    public static final Item BLUE_GEM = new Item(new Item.Settings()); //创建没屁用的蓝宝石物品石粒(doge)
    public static final ItemGroup MOREGEMS_GROUP = FabricItemGroupBuilder.create(
            new Identifier("moregems", "moregems_group"))
            .icon(() -> new ItemStack(BLUE_GEM))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(BLUE_GEM));
            })
            .build();
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("moregems", "blue_gem"), BLUE_GEM);//注册物品
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        System.out.println("Load moregems main class");
        System.out.println("这是一个恶臭的mod");
        System.out.println(           "\n" +
                "           ▃▆█▇▄▖\n" +
                "　 　 　 ▟◤▖　　　◥█▎\n" +
                "   　 ◢◤　 ▐　　　 　▐▉\n" +
                "　 ▗◤　　　▂　▗▖　　▕█▎\n" +
                "　◤　▗▅▖◥▄　▀◣　　█▊\n" +
                "▐　▕▎◥▖◣◤　　　　◢██\n" +
                "█◣　◥▅█▀　　　　▐██◤\n" +
                "▐█▙▂　　     　◢██◤\n" +
                "◥██◣　　　　◢▄◤\n" +
                " 　　▀██▅▇▀");
    }
}
