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
import oxxxde.صِ;

// $VF: Compiled from MixinWorldRendererHideMobs.java
@Mixin(WorldRenderer.class)
public abstract class MixinWorldRendererHideMobs {
   @Redirect(method = "method_72917", at = @At(value = "INVOKE", target = "Ljava/util/List;add(Ljava/lang/Object;)Z"))
   private boolean rain$addVisibleEntityState(List<EntityRenderState> states, Object state) {
      return state instanceof EntityRenderState entityState && states.add(entityState);
   }

   @Redirect(
      method = "method_72917",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_761;method_72914(Lnet/minecraft/class_1297;F)Lnet/minecraft/class_10017;")
   )
   private EntityRenderState rain$extractVisibleEntity(WorldRenderer renderer, Entity tickProgress, float entity) {
      return this.rain$shouldHide(entity) ? null : this.getAndUpdateRenderState(entity, tickProgress);
   }

   @Redirect(method = "method_72917", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_10017;method_72997()Z"))
   private boolean rain$appearsGlowing(EntityRenderState state) {
      return state != null && state.hasOutline();
   }

   private boolean rain$shouldHide(Entity entity) {
      return صِ.INSTANCE.isEnabled() && صِ.INSTANCE.getHideMobs().getValue() && entity instanceof MobEntity;
   }

   @Shadow
   private EntityRenderState getAndUpdateRenderState(Entity entity, float tickProgress) {
      throw new AssertionError();
   }
}
