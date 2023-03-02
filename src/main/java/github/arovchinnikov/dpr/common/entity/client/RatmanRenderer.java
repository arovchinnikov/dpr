package github.arovchinnikov.dpr.common.entity.client;

import github.arovchinnikov.dpr.Dpr;
import github.arovchinnikov.dpr.common.entity.mob.Ratman;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class RatmanRenderer extends GeoEntityRenderer<Ratman> {
    public RatmanRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RatmanModel());
        this.shadowRadius = 0.9f;
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull Ratman instance) {
        return new ResourceLocation(Dpr.MOD_ID, "textures/entity/ratman/ratman.png");
    }

    @Override
    public RenderType getRenderType(
            Ratman animatable,
            ResourceLocation textureLocation,
            MultiBufferSource renderTypeBuffer,
            float partialTicks
    ) {
        scaleHeight = 0.58f;
        scaleWidth = 0.58f;

        return super.getRenderType(animatable, textureLocation, renderTypeBuffer, partialTicks);
    }
}
