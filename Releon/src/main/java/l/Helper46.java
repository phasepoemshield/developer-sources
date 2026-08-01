package l;

import fat.releon.Releon;
import net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket;
import net.minecraft.util.math.MathHelper;

public class Helper46 {
   private float TPS = 20.0F;
   private float adjustTicks = 0.0F;
   private long timestamp;

   public Helper46() {
      Releon.method71().method15().method1016(this);
   }

   @Helper104
   private void onPacket(Helper386 var1) {
      if (var1.method3895() instanceof WorldTimeUpdateS2CPacket) {
         this.method601();
      }
   }

   private void method601() {
      long var1 = System.nanoTime() - this.timestamp;
      float var3 = 20.0F;
      float var4 = var3 * (1.0E9F / (float)var1);
      float var5 = MathHelper.clamp(var4, 0.0F, var3);
      this.TPS = (float)this.method602(var5);
      this.adjustTicks = var5 - var3;
      this.timestamp = System.nanoTime();
   }

   public double method602(double var1) {
      return Math.round(var1 * 100.0) / 100.0;
   }

   public float method603() {
      return this.TPS;
   }

   public float method604() {
      return this.adjustTicks;
   }

   public long method605() {
      return this.timestamp;
   }
}
