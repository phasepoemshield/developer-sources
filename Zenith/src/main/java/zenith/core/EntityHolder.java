package zenith;

import net.minecraft.entity.Entity;

public final class EntityHolder extends EventImpl_33 {
   private final Entity I1l1l111lI1111;
   private final ZenithInternal005$Helper l11llIIll11l11I1IIllIll1;

   public EntityHolder(Entity Entity, ZenithInternal005$Helper i11l111illlill$ii1il11l111ii11iil) {
      this.I1l1l111lI1111 = Entity;
      this.l11llIIll11l11I1IIllIll1 = i11l111illlill$ii1il11l111ii11iil;
   }

   public Entity Autoloot() {
      return this.I1l1l111lI1111;
   }

   public ZenithInternal005$Helper AutoMine() {
      return this.l11llIIll11l11I1IIllIll1;
   }
}
