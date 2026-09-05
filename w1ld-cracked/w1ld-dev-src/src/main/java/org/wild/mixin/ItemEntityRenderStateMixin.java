package org.wild.mixin;

import net.minecraft.class_10039;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import ru.metaculture.protection.nvnNNunvv;

@Mixin({class_10039.class})
public abstract class ItemEntityRenderStateMixin implements nvnNNunvv {
   @Unique
   private boolean wild$itemPhysicOnGround;

   @Override
   public void wild$setItemPhysicOnGround(boolean var1) {
      this.wild$itemPhysicOnGround = var1;
   }

   @Override
   public boolean wild$isItemPhysicOnGround() {
      return this.wild$itemPhysicOnGround;
   }
}
