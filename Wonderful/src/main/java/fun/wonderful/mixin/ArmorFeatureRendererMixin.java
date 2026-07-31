package fun.wonderful.mixin;

import fun.wonderful.api.QClient;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.client.modules.impl.render.Chams;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={ArmorFeatureRenderer.class})
public class ArmorFeatureRendererMixin
implements QClient {
    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$hideArmor(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, EntityRenderState state, float limbAngle, float limbDistance, CallbackInfo ci) {
        PlayerEntity player;
        PlayerEntityRenderState playerState;
        block6: {
            block5: {
                if (!(state instanceof PlayerEntityRenderState)) break block5;
                playerState = (PlayerEntityRenderState)state;
                if (ModuleClass.INSTANCE != null && ArmorFeatureRendererMixin.mc.world != null) break block6;
            }
            return;
        }
        Chams chams = ModuleClass.chams;
        if (chams == null || !chams.isEnable()) {
            return;
        }
        Entity entity = ArmorFeatureRendererMixin.mc.world.getEntityById(playerState.id);
        if (entity instanceof PlayerEntity && chams.shouldHideItemsAndCape(player = (PlayerEntity)entity)) {
            ci.cancel();
        }
    }
}