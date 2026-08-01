package zenith.zov.client.screens.builder;

import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;

@FunctionalInterface
public interface PlayerPreview3D$PreviewOverlay {
   void render(MatrixStack MatrixStack, VertexConsumerProvider VertexConsumerProvider, int i, LivingEntity LivingEntity, float f);
}
