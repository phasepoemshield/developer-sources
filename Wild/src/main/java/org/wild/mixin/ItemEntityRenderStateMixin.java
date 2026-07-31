package org.wild.mixin;

import net.minecraft.client.render.entity.state.ItemEntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import ru.metaculture.protection.O000000000;

@Mixin({ItemEntityRenderState.class})
public abstract class ItemEntityRenderStateMixin implements O000000000 {
   @Unique
   private boolean wild$itemPhysicOnGround;

   @Override
   public void wild$setItemPhysicOnGround(boolean bl) {
      this.wild$itemPhysicOnGround = bl;
   }

   @Override
   public boolean wild$isItemPhysicOnGround() {
      return this.wild$itemPhysicOnGround;
   }
}
