package kotakbaz.rain.mixin;

import net.minecraft.client.render.entity.state.ItemEntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import oxxxde.بر;

// $VF: Compiled from MixinItemEntityRenderStatePhysics.java
@Mixin(ItemEntityRenderState.class)
public class MixinItemEntityRenderStatePhysics implements بر {
   @Unique
   private boolean rain$additionalOffset;
   @Unique
   private float rain$xRot;
   @Unique
   private boolean rain$isBlock;
   @Unique
   private float rain$yRot;

   @Override
   public void rain$setXRot(float value) {
      this.rain$xRot = value;
   }

   @Override
   public boolean rain$isBlock() {
      return this.rain$isBlock;
   }

   @Override
   public void rain$setAdditionalOffset(boolean value) {
      this.rain$additionalOffset = value;
   }

   @Override
   public float rain$getXRot() {
      return this.rain$xRot;
   }

   @Override
   public float rain$getYRot() {
      return this.rain$yRot;
   }

   @Override
   public void rain$setBlock(boolean value) {
      this.rain$isBlock = value;
   }

   @Override
   public void rain$setYRot(float value) {
      this.rain$yRot = value;
   }

   @Override
   public boolean rain$hasAdditionalOffset() {
      return this.rain$additionalOffset;
   }
}
