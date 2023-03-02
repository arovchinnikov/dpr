package github.arovchinnikov.dpr.event;

import github.arovchinnikov.dpr.Dpr;
import github.arovchinnikov.dpr.common.entity.mob.Ratman;
import github.arovchinnikov.dpr.init.ModEntityTypes;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Dpr.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.RATMAN.get(), Ratman.setAttributes());
    }
}
