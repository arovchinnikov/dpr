package github.arovchinnikov.dpr.common.entity.client;

import github.arovchinnikov.dpr.Dpr;
import github.arovchinnikov.dpr.common.entity.mob.Ratman;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class RatmanModel extends GeoModel<Ratman> {
    @Override
    public ResourceLocation getModelResource(Ratman animatable) {
        return new ResourceLocation(Dpr.MOD_ID, "geo/ratman.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(Ratman animatable) {
        return new ResourceLocation(Dpr.MOD_ID, "textures/entity/ratman/ratman.png");
    }

    @Override
    public ResourceLocation getAnimationResource(Ratman animatable) {
        return new ResourceLocation(Dpr.MOD_ID, "animations/ratman.animation.json");
    }
}
