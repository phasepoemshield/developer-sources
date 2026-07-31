package l;

import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;

public class Helper338 implements Helper160 {
   private static final long ATTACK_COOLDOWN_MS = 500L;
   private static final float ATTACK_COOLDOWN_THRESHOLD = 0.9F;
   private long lastClickTime = System.currentTimeMillis();

   public Helper338() {
   }

   public boolean method3347(boolean var1, float var2) {
      return this.method3348(var1, false, var2);
   }

   public boolean method3348(boolean var1, boolean var2, float var3) {
      if (mc.player == null) {
         return false;
      } else if (this.method3350() < 500L) {
         return false;
      } else {
         boolean var4 = this.method3353();
         long var5 = Math.max(0L, (long)Math.round(Math.max(0.0F, this.method3352() * 0.82F - var3) * 50.0F));
         boolean var7 = this.method3350() >= var5;
         boolean var8 = var4 || mc.player.getAttackCooldownProgress(var3) > 0.9F;
         return var8 && var7;
      }
   }

   public boolean method3349(int var1) {
      return this.method3350() >= var1 * 50L;
   }

   public long method3350() {
      return System.currentTimeMillis() - this.lastClickTime;
   }

   public void method3351() {
      this.lastClickTime = System.currentTimeMillis();
   }

   private float method3352() {
      if (mc.player == null) {
         return 1.0F;
      } else {
         double var1 = mc.player.getAttributeValue(EntityAttributes.ATTACK_SPEED);
         return var1 <= 0.0 ? 1.0F : Math.max(1.0F, (float)(20.0 / var1));
      }
   }

   private boolean method3353() {
      if (mc.player == null) {
         return false;
      } else {
         ItemStack var1 = mc.player.getMainHandStack();
         return var1.getItem().getTranslationKey().toLowerCase().contains("mace");
      }
   }
}
