package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.ElytraFly;

import org.zenith.module.ElytraFly;
import org.zenith.ZenithClient;
import org.zenith.core.ItemServiceBase;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;


import com.darkmagician6.eventapi.events.Event;
import net.minecraft.entity.Entity;

public class Event37 implements Event {
   public Entity entity;
   public float size;

   public Entity ElytraFly() {
      return this.entity;
   }

   public float getSize() {
      return this.size;
   }

   public void on23(Entity var1) {
      this.entity = var1;
   }

   public void ItemServiceBase(float var1) {
      this.size = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Event37 li1ll11ilil1ii1lilll1i)) {
         return false;
      } else if (!li1ll11ilil1ii1lilll1i.canEqual(this)) {
         return false;
      } else if (Float.compare(this.getSize(), li1ll11ilil1ii1lilll1i.getSize()) != 0) {
         return false;
      } else {
         Entity entity = this.ElytraFly();
         Entity entity1 = li1ll11ilil1ii1lilll1i.ElytraFly();
         return entity == null ? entity1 == null : entity.equals(entity1);
      }
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof Event37;
   }

   @Override
   public int hashCode() {
      byte b0 = 59;
      int i = 1;
      i = i * 59 + Float.floatToIntBits(this.getSize());
      Entity entity = this.ElytraFly();
      return i * 59 + (entity == null ? 43 : entity.hashCode());
   }

   @Override
   public String toString() {
      return "EventEntityHitBox(entity=" + this.ElytraFly() + ", size=" + this.getSize() + ")";
   }

   public Event37(Entity var1, float var2) {
      this.entity = var1;
      this.size = var2;
   }
}
