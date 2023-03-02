package github.arovchinnikov.dpr.common.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class ObsidianBlock extends Block {
    public static Properties getDefaultProperties() {
        return BlockBehaviour
                .Properties
                .of(Material.STONE)
                .strength(35f)
                .explosionResistance(1200)
                .requiresCorrectToolForDrops();
    }
    public ObsidianBlock() {
        super(getDefaultProperties());
    }
}
