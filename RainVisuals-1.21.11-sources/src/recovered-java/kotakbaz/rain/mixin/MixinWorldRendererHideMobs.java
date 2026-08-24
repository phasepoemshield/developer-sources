/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.WorldRenderer
 *  net.minecraft.client.render.entity.state.EntityRenderState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.mob.MobEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package kotakbaz.rain.mixin;

import java.util.List;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.MobEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import oxxxde.\u0635\u0650;

@Mixin(value={WorldRenderer.class})
public abstract class MixinWorldRendererHideMobs {
    @Redirect(method={"method_72917"}, at=@At(value="INVOKE", target="Ljava/util/List;add(Ljava/lang/Object;)Z"))
    private boolean rain$addVisibleEntityState(List<EntityRenderState> states, Object state) {
        EntityRenderState entityState;
        return state instanceof EntityRenderState && states.add(entityState = (EntityRenderState)state);
    }

    @Redirect(method={"method_72917"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_761;method_72914(Lnet/minecraft/class_1297;F)Lnet/minecraft/class_10017;"))
    private EntityRenderState rain$extractVisibleEntity(WorldRenderer renderer, Entity entity, float tickProgress) {
        return this.rain$shouldHide(entity) ? null : this.getAndUpdateRenderState(entity, tickProgress);
    }

    @Redirect(method={"method_72917"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_10017;method_72997()Z"))
    private boolean rain$appearsGlowing(EntityRenderState state) {
        return state != null && state.hasOutline();
    }

    private boolean rain$shouldHide(Entity entity) {
        return \u0635\u0650.INSTANCE.isEnabled() && (Boolean)\u0635\u0650.INSTANCE.getHideMobs().getValue() != false && entity instanceof MobEntity;
    }

    @Shadow
    private EntityRenderState getAndUpdateRenderState(Entity entity, float tickProgress) {
        throw new AssertionError();
    }
}

