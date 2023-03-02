package github.arovchinnikov.dpr.init;

import github.arovchinnikov.dpr.Dpr;
import github.arovchinnikov.dpr.common.block.ObsidianBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Dpr.MOD_ID);
    public static final RegistryObject<Block> POLISHED_OBSIDIAN = register(
            "polished_obsidian",
            ObsidianBlock::new
    );
    public static final RegistryObject<Block> POLISHED_OBSIDIAN_SLAB = register(
            "polished_obsidian_slab",
            () -> new SlabBlock(ObsidianBlock.getDefaultProperties())
    );
    public static final RegistryObject<Block> POLISHED_OBSIDIAN_STAIRS = register(
            "polished_obsidian_stairs",
            () -> new StairBlock(
                    () -> POLISHED_OBSIDIAN.get().defaultBlockState(),
                    ObsidianBlock.getDefaultProperties()
            )
    );

    public static final RegistryObject<Block> OBSIDIAN_BRICKS = register(
            "obsidian_bricks",
            ObsidianBlock::new
    );
    public static final RegistryObject<Block> OBSIDIAN_BRICK_SLAB = register(
            "obsidian_brick_slab",
            () -> new SlabBlock(ObsidianBlock.getDefaultProperties())
    );
    public static final RegistryObject<Block> OBSIDIAN_BRICK_STAIRS = register(
            "obsidian_brick_stairs",
            () -> new StairBlock(
                    () -> OBSIDIAN_BRICKS.get().defaultBlockState(),
                    ObsidianBlock.getDefaultProperties()
            )
    );
    public static final RegistryObject<Block> OBSIDIAN_CHISELED_BRICKS = register(
            "obsidian_chiseled_bricks",
            ObsidianBlock::new
    );

    private static RegistryObject<Block> register(final String name, final Supplier<Block> sup) {
        RegistryObject<Block> block = REGISTRY.register(name, sup);

        ModItems.block(block);

        return block;
    }
}
