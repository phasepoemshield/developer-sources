package l;

import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;

public class Event19 implements Helper41 {
   private final Entity entity;
   private final DamageSource source;

   public Event19(Entity var1, DamageSource var2) {
      this.entity = var1;
      this.source = var2;
   }

   public Entity method3920() {
      return this.entity;
   }

   public DamageSource method3921() {
      return this.source;
   }
}
