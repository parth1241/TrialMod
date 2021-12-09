package com.example.examplemod.item;

import com.example.examplemod.TrialMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TrialMod.MOD_ID);

    public static final RegistryObject<Item>  SID = ITEMS.register("sid",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));


public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}
}