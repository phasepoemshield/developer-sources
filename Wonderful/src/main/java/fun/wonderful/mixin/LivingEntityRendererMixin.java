package fun.wonderful.mixin;

import fun.wonderful.api.QClient;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.client.modules.impl.render.Chams;
import fun.wonderful.client.modules.impl.render.SeeInvisibles;
import fun.wonderful.client.modules.impl.render.SeeInvisiblesRenderState;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={LivingEntityRenderer.class})
public abstract class LivingEntityRendererMixin<T extends LivingEntity, S extends LivingEntityRenderState, M extends EntityModel<? super S>>
implements QClient {
    @Inject(method={"updateRenderState"}, at={@At(value="TAIL")})
    private void wonderful$updateSeeInvisiblesState(T entity, S state, float tickDelta, CallbackInfo ci) {
        boolean shouldRenderInvisible = this.wonderful$shouldRenderInvisible(entity);
        ((SeeInvisiblesRenderState)state).wonderful$setSeeInvisiblesTarget(shouldRenderInvisible);
        if (shouldRenderInvisible) {
            ((LivingEntityRenderState)state).invisible = true;
            ((LivingEntityRenderState)state).invisibleToPlayer = false;
        }
    }

    @ModifyConstant(method={"render"}, constant={@Constant(intValue=0x26FFFFFF)})
    private int wonderful$changeInvisibleAlpha(int original, S state, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        return ((SeeInvisiblesRenderState)state).wonderful$isSeeInvisiblesTarget() ? SeeInvisibles.INVISIBLE_COLOR : original;
    }

    @Inject(method={"getRenderLayer"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$hideOriginalModel(S state, boolean showBody, boolean translucent, boolean showOutline, CallbackInfoReturnable<RenderLayer> cir) {
        Chams chams;
        Chams chams2 = chams = ModuleClass.INSTANCE != null ? ModuleClass.chams : null;
        if (chams == null || !chams.isEnable()) {
            return;
        }
        PlayerEntity player = this.wonderful$resolvePlayer(state);
        if (player != null && chams.shouldHideBaseModel(player)) {
            cir.setReturnValue(null);
        }
    }

    @Unique
    private boolean wonderful$shouldRenderInvisible(T entity) {
        PlayerEntity player;
        block3: {
            block2: {
                if (!(entity instanceof PlayerEntity)) break block2;
                player = (PlayerEntity)entity;
                if (ModuleClass.INSTANCE != null) break block3;
            }
            return false;
        }
        SeeInvisibles seeInvisibles = ModuleClass.seeInvisibles;
        return seeInvisibles != null && seeInvisibles.shouldRenderInvisible(player);
    }

    @Unique
    private PlayerEntity wonderful$resolvePlayer(S state) {
        PlayerEntity player;
        PlayerEntityRenderState playerState;
        block3: {
            block2: {
                if (!(state instanceof PlayerEntityRenderState)) break block2;
                playerState = (PlayerEntityRenderState)state;
                if (LivingEntityRendererMixin.mc.world != null) break block3;
            }
            return null;
        }
        Entity entity = LivingEntityRendererMixin.mc.world.getEntityById(playerState.id);
        return entity instanceof PlayerEntity ? (player = (PlayerEntity)entity) : null;
    }
}