package github.arovchinnikov.dpr.init;

import github.arovchinnikov.dpr.Dpr;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Dpr.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTabs {
    public static CreativeModeTab BLOCKS_TAB;
    public static CreativeModeTab ITEMS_TAB;

    public static void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == BLOCKS_TAB) {
            event.accept(ModBlocks.POLISHED_OBSIDIAN);
            event.accept(ModBlocks.POLISHED_OBSIDIAN_STAIRS);
            event.accept(ModBlocks.POLISHED_OBSIDIAN_SLAB);
            event.accept(ModBlocks.OBSIDIAN_BRICKS);
            event.accept(ModBlocks.OBSIDIAN_BRICK_STAIRS);
            event.accept(ModBlocks.OBSIDIAN_BRICK_SLAB);
            event.accept(ModBlocks.OBSIDIAN_CHISELED_BRICKS);
        }

        if (event.getTab() == ITEMS_TAB) {
            event.accept(ModItems.OBSIDIAN_BRICK);
            event.accept(ModItems.RATMAN_SPAWN_EGG);
        }
    }

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        BLOCKS_TAB = event.registerCreativeModeTab(new ResourceLocation(Dpr.MOD_ID, "blocks"), builder ->
                builder.title(Component.translatable("item_group." + Dpr.MOD_ID + ".blocks"))
                        .icon(() -> new ItemStack(ModItems.block(ModBlocks.POLISHED_OBSIDIAN.getId().getPath()).get()))
        );

        ITEMS_TAB = event.registerCreativeModeTab(new ResourceLocation(Dpr.MOD_ID, "items"), builder ->
                builder.title(Component.translatable("item_group." + Dpr.MOD_ID + ".items"))
                        .icon(() -> new ItemStack(ModItems.OBSIDIAN_BRICK.get()))
        );
    }
}
