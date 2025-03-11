package net.thatguytheman.botaniaitemmanipulation.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thatguytheman.botaniaitemmanipulation.BotaniaItemManipulation;
import net.thatguytheman.botaniaitemmanipulation.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVEmODEtABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BotaniaItemManipulation.modID);
    public static final RegistryObject<CreativeModeTab> botaniaItemManipTab = CREATIVEmODEtABS.register("botaniaitemmaniptab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TESTITEM.get()))
                    .title(Component.translatable("creativetab.addon_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.TESTITEM.get());
                        output.accept(ModBlocks.TestFlower.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVEmODEtABS.register(eventBus);
    }
}
