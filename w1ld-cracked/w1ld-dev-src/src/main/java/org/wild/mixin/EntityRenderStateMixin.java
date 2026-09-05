package org.wild.mixin;

import net.minecraft.class_10017;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import ru.metaculture.protection.uuUUunvVVu;

@Mixin({class_10017.class})
public abstract class EntityRenderStateMixin implements uuUUunvVVu {
   @Unique
   private int wild$entityId = Integer.MIN_VALUE;

   @Override
   public int wild$getEntityId() {
      return this.wild$entityId;
   }

   @Override
   public void wild$setEntityId(int var1) {
      this.wild$entityId = var1;
   }
}
