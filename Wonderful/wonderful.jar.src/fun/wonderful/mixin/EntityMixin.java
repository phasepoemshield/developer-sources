package fun.wonderful.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import fun.wonderful.api.QClient;
import fun.wonderful.api.events.EventInvoker;
import fun.wonderful.api.events.implement.EventOnMovePost;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.client.modules.impl.player.NoPush;
import fun.wonderful.client.modules.impl.render.SeeInvisibles;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={Entity.class})
public abstract class EntityMixin
implements QClient {
    @ModifyExpressionValue(method={"move"}, at={@At(value="INVOKE", target="Lnet/minecraft/Entity;isControlledByPlayer()Z")})
    private boolean fixFallDistanceCalculation(boolean original) {
        if (this == EntityMixin.mc.player) {
            return false;
        }
        return original;
    }

    @Inject(method={"updateVelocity"}, at={@At(value="TAIL")})
    private void wonderful$onMovePost(float speed, Vec3d movementInput, CallbackInfo ci) {
        if (EntityMixin.mc.player != null && this == EntityMixin.mc.player && EventInvoker.hasListeners(EventOnMovePost.class)) {
            new EventOnMovePost(speed, movementInput).call();
        }
    }

    @Inject(method={"pushAwayFrom"}, at={@At(value="HEAD")}, cancellable=true)
    public void pushAwayFrom(CallbackInfo ci) {
        if (this != EntityMixin.mc.player || ModuleClass.INSTANCE == null) {
            return;
        }
        NoPush noPush = ModuleClass.noPush;
        if (noPush != null && noPush.isEnable() && noPush.getCollisionList().is("Игроки")) {
            ci.cancel();
        }
    }

    @Inject(method={"isPushedByFluids"}, at={@At(value="RETURN")}, cancellable=true)
    public void isPushedByFluids(CallbackInfoReturnable<Boolean> ci) {
        if (this != EntityMixin.mc.player || ModuleClass.INSTANCE == null) {
            return;
        }
        NoPush noPush = ModuleClass.noPush;
        if (noPush != null && noPush.isEnable() && noPush.getCollisionList().is("Вода")) {
            ci.setReturnValue((Object)false);
        }
    }

    @Inject(method={"isInvisibleTo"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$allowSeeInvisibles(PlayerEntity player, CallbackInfoReturnable<Boolean> cir) {
        PlayerEntity target;
        block5: {
            block4: {
                EntityMixin entityMixin = this;
                if (!(entityMixin instanceof PlayerEntity)) break block4;
                target = (PlayerEntity)entityMixin;
                if (ModuleClass.INSTANCE != null) break block5;
            }
            return;
        }
        SeeInvisibles seeInvisibles = ModuleClass.seeInvisibles;
        if (seeInvisibles != null && seeInvisibles.shouldRenderInvisible(target)) {
            cir.setReturnValue((Object)false);
        }
    }
}