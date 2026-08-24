package kotakbaz.rain.mixin;

import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import oxxxde.ضذ;

// $VF: Compiled from MixinLivingEntityRenderStateHitColor.java
@Mixin(LivingEntityRenderState.class)
public class MixinLivingEntityRenderStateHitColor implements ضذ {
   @Unique
   private int rain$entityId = Integer.MIN_VALUE;

   @Override
   public int rain$getEntityId() {
      return this.rain$entityId;
   }

   @Override
   public void rain$setEntityId(int entityId) {
      this.rain$entityId = entityId;
   }
}
