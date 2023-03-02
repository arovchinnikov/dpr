package github.arovchinnikov.dpr;

import github.arovchinnikov.dpr.common.entity.client.RatmanRenderer;
import github.arovchinnikov.dpr.init.ModBlocks;
import github.arovchinnikov.dpr.init.ModCreativeTabs;
import github.arovchinnikov.dpr.init.ModEntityTypes;
import github.arovchinnikov.dpr.init.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib.GeckoLib;

@Mod(Dpr.MOD_ID)
public class Dpr {
    public static final String MOD_ID = "dpr";

    private final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public Dpr() {
        initBase();
    }

    private void initBase() {
        GeckoLib.initialize();

        ModBlocks.REGISTRY.register(modEventBus);
        ModItems.REGISTRY.register(modEventBus);
        ModEntityTypes.REGISTRY.register(modEventBus);

        modEventBus.addListener(this::clientSetup);
        modEventBus.addListener(ModCreativeTabs::addCreative);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        EntityRenderers.register(ModEntityTypes.RATMAN.get(), RatmanRenderer::new);
    }
}
