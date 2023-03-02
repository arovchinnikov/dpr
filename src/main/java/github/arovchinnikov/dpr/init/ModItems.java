package github.arovchinnikov.dpr.init;

import github.arovchinnikov.dpr.Dpr;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;

public class ModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Dpr.MOD_ID);
    public static HashMap<String, RegistryObject<Item>> blocks = new HashMap<>();

    public static final RegistryObject<Item> OBSIDIAN_BRICK = item("obsidian_brick");

    public static final RegistryObject<ForgeSpawnEggItem> RATMAN_SPAWN_EGG = REGISTRY.register(
            "ratman_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    ModEntityTypes.RATMAN,
                    0x94e8d,
                    0x3b3635,
                    new Item.Properties()
            )
    );

    public static void block(RegistryObject<Block> block) {
        String blockName = block.getId().getPath();

        blocks.put(blockName, REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties())));
    }

    public static RegistryObject<Item> block(String name) {
        return blocks.get(name);
    }

    private static RegistryObject<Item> item(String name) {
        return REGISTRY.register(name, () -> new Item(new Item.Properties()));
    }
}
