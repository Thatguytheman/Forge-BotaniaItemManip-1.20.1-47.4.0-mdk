package net.thatguytheman.botaniaitemmanipulation.item;

import net.minecraftforge.registries.RegistryObject;
import net.thatguytheman.botaniaitemmanipulation.BotaniaItemManipulation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.thatguytheman.botaniaitemmanipulation.BotaniaItemManipulation;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BotaniaItemManipulation.modID);

    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
