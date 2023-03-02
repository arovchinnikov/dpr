package github.arovchinnikov.dpr;

import github.arovchinnikov.dpr.init.ModBlocks;
import github.arovchinnikov.dpr.init.ModCreativeTabs;
import github.arovchinnikov.dpr.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Dpr.MOD_ID)
public class Dpr {
    public static final String MOD_ID = "dpr";

    private final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public Dpr() {
        initBase();
    }

    private void initBase() {
        ModBlocks.REGISTRY.register(modEventBus);
        ModItems.REGISTRY.register(modEventBus);
        modEventBus.addListener(ModCreativeTabs::addCreative);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
