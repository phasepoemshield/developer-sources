package fun.wonderful.mixin;

import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={LivingEntityRenderer.class})
public interface LivingEntityRendererAccessor {
    @Invoker(value="addFeature")
    public boolean wonderful$addFeature(FeatureRenderer<?, ?> var1);

    @Invoker(value="setupTransforms")
    public void wonderful$setupTransforms(LivingEntityRenderState var1, MatrixStack var2, float var3, float var4);

    @Invoker(value="scale")
    public void wonderful$scale(LivingEntityRenderState var1, MatrixStack var2);
}