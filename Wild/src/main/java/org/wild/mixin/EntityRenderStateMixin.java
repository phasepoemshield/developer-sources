package org.wild.mixin;

import net.minecraft.client.render.entity.state.EntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import ru.metaculture.protection.O0000O00OO000O;

@Mixin({EntityRenderState.class})
public abstract class EntityRenderStateMixin implements O0000O00OO000O {
   @Unique
   private int wild$entityId = Integer.MIN_VALUE;

   @Override
   public int wild$getEntityId() {
      return this.wild$entityId;
   }

   @Override
   public void wild$setEntityId(int i) {
      this.wild$entityId = i;
   }
}
