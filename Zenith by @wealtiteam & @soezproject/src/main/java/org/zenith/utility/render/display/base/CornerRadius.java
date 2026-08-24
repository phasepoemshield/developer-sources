package org.zenith.utility.render.display.base;

import org.zenith.event.Event09;
import org.zenith.event.Event13;
import org.zenith.event.Event14;
import org.zenith.event.Event18Ext;
import org.zenith.event.Event20;
import org.zenith.event.Event26;
import org.zenith.event.Event29;
import org.zenith.event.EventHookPacketProcess2;
import org.zenith.event.EventUpdateHealth2;
import org.zenith.event.MovementInputEvent;
import org.zenith.event.VelocityChangeEvent;

import org.zenith.event.Event09;
import org.zenith.event.Event13;
import org.zenith.event.Event14;
import org.zenith.event.Event18Ext;
import org.zenith.event.Event20;
import org.zenith.event.Event26;
import org.zenith.event.Event29;
import org.zenith.event.EventHookPacketProcess2;
import org.zenith.event.EventUpdateHealth2;
import org.zenith.event.MovementInputEvent;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.event.VelocityChangeEvent;














public record CornerRadius(float float396, float float397, float float398, float float399) {

   public static final CornerRadius var159 = new CornerRadius(0.0F, 0.0F, 0.0F, 0.0F);

   public static CornerRadius MovementInputEvent(float var0) {
      return new CornerRadius(var0, var0, var0, var0);
   }

   public static CornerRadius Event14(float var0) {
      return new CornerRadius(var0, 0.0F, 0.0F, 0.0F);
   }

   public static CornerRadius EventUpdateHealth2(float var0) {
      return new CornerRadius(0.0F, var0, 0.0F, 0.0F);
   }

   public static CornerRadius EventHookPacketProcess2(float var0) {
      return new CornerRadius(0.0F, 0.0F, var0, 0.0F);
   }

   public static CornerRadius Event18Ext(float var0) {
      return new CornerRadius(0.0F, 0.0F, 0.0F, var0);
   }

   public static CornerRadius Event20(float var0, float var1) {
      return new CornerRadius(var0, var1, 0.0F, 0.0F);
   }

   public static CornerRadius Event29(float var0) {
      return new CornerRadius(var0, var0, 0.0F, 0.0F);
   }

   public static CornerRadius Event09(float var0, float var1) {
      return new CornerRadius(0.0F, 0.0F, var1, var0);
   }

   public static CornerRadius Event26(float var0) {
      return new CornerRadius(0.0F, 0.0F, var0, var0);
   }

   public static CornerRadius Event13(float var0, float var1) {
      return new CornerRadius(var0, 0.0F, 0.0F, var1);
   }

   public static CornerRadius VelocityChangeEvent(float var0, float var1) {
      return new CornerRadius(0.0F, var0, var1, 0.0F);
   }

   @Override
   public String toString() {
      return "BorderRadius{topLeftRadius="
         + this.float396
         + ", topRightRadius="
         + this.float397
         + ", bottomRightRadius="
         + this.float398
         + ", bottomLeftRadius="
         + this.float399
         + "}";
   }

   public float var14311() {
      return this.float396;
   }

   public float var14312() {
      return this.float397;
   }

   public float itemStack9() {
      return this.float398;
   }

   public float string63() {
      return this.float399;
   }
}
