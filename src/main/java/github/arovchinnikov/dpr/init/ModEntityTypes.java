package github.arovchinnikov.dpr.init;

import github.arovchinnikov.dpr.Dpr;
import github.arovchinnikov.dpr.common.entity.mob.Ratman;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Dpr.MOD_ID);

    public static final RegistryObject<EntityType<Ratman>> RATMAN = REGISTRY.register(
            "ratman",
            () -> EntityType
                    .Builder
                    .of(Ratman::new, MobCategory.MONSTER)
                    .sized(1.9f, 1.2f)
                    .canSpawnFarFromPlayer()
                    .build(new ResourceLocation(Dpr.MOD_ID, "ratman").toString())
    );
}
