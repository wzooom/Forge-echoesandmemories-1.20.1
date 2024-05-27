package net.telluricwalk.echoesandmemories.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.telluricwalk.echoesandmemories.Echoesandmemories;
import net.telluricwalk.echoesandmemories.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Echoesandmemories.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ECHOESANDMEMORIES_TAB = CREATIVE_MODE_TABS.register("echoesandmemories_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.echoesandmemories_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // List all items in custom tab, can add vanilla ones if I want
                        pOutput.accept(Moditems.SAPPHIRE.get());
                        pOutput.accept(Moditems.RAW_SAPPHIRE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventbus){
        CREATIVE_MODE_TABS.register(eventbus);
    }
}
