package org.zenith.event;

import org.zenith.module.Module;

import org.zenith.module.GrimGlide;
import org.zenith.module.GuiWalk;

import org.zenith.module.GrimGlide;
import org.zenith.module.GuiWalk;
import org.zenith.core.SimpleItemBuilder;
import org.zenith.core.EnchantItemSpec;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;


import com.darkmagician6.eventapi.events.Event;

public class Event05 implements Event {
   public float yaw;
   public float pitch;

   public float GrimGlide() {
      return this.yaw;
   }

   public float GuiWalk() {
      return this.pitch;
   }

   public void EnchantItemSpec(float var1) {
      this.yaw = var1;
   }

   public void SimpleItemBuilder(float var1) {
      this.pitch = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Event05 i1iiilll11l1llil1ll)) {
         return false;
      } else if (!i1iiilll11l1llil1ll.canEqual(this)) {
         return false;
      } else {
         return Float.compare(this.GrimGlide(), i1iiilll11l1llil1ll.GrimGlide()) != 0
            ? false
            : Float.compare(this.GuiWalk(), i1iiilll11l1llil1ll.GuiWalk()) == 0;
      }
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof Event05;
   }

   @Override
   public int hashCode() {
      byte b0 = 59;
      int i = 1;
      i = i * 59 + Float.floatToIntBits(this.GrimGlide());
      return i * 59 + Float.floatToIntBits(this.GuiWalk());
   }

   @Override
   public String toString() {
      return "EventDirection(yaw=" + this.GrimGlide() + ", pitch=" + this.GuiWalk() + ")";
   }

   public Event05(float var1, float var2) {
      this.yaw = var1;
      this.pitch = var2;
   }
}
