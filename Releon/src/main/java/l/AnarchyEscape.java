package l;

import java.util.Locale;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;

public class AnarchyEscape extends Helper242 {
   private final Setting6 targetAnarchy = new Setting6("Анархия", "Куда ливать через /an").method2407("201").method2408(1).method2409(4).method2402();
   private final Setting2 criticalHealth = new Setting2("Крит HP", "HP для мгновенного лива").method2086(2.0F).method2079(1, 20);
   private final Setting3 predictHit = new Setting3("Предугадывать удар", "Ливать раньше, если рядом игрок замахивается").method2201(true);
   private final Setting2 preHitHealth = new Setting2("HP при ударе", "HP для лива при замахе рядом")
      .method2086(6.0F)
      .method2079(1, 20)
      .method2081(this.predictHit::method2200);
   private final Setting2 threatRange = new Setting2("Дистанция", "Дистанция опасного игрока")
      .method2086(4.2F)
      .method2079(2, 8)
      .method2081(this.predictHit::method2200);
   private final Setting3 countAbsorption = new Setting3("Считать абсорб", "Учитывать золотые сердца как HP").method2201(true);
   private long lastEscapeAt;

   public AnarchyEscape() {
      super("AnarchyEscape", "Anarchy Escape", Helper269.MISC);
      this.setup(new Helper264[]{this.targetAnarchy, this.criticalHealth, this.predictHit, this.preHitHealth, this.threatRange, this.countAbsorption});
   }

   @Override
   public void activate() {
      this.lastEscapeAt = 0L;
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null && mc.getNetworkHandler() != null) {
         long var2 = System.currentTimeMillis();
         if (var2 - this.lastEscapeAt >= 8000L) {
            int var4 = this.method3665();
            if (var4 != -1 && Helper128.method1059() != var4) {
               float var5 = this.method3664();
               if (var5 <= this.criticalHealth.method2082()) {
                  this.method3661(var4, "critical hp " + this.method3666(var5));
               } else {
                  if (this.predictHit.method2200() && var5 <= this.preHitHealth.method2082() && this.method3662()) {
                     this.method3661(var4, "incoming hit at hp " + this.method3666(var5));
                  }
               }
            }
         }
      }
   }

   private void method3661(int var1, String var2) {
      this.lastEscapeAt = System.currentTimeMillis();
      Notifications.method1666().method1668("[AnarchyEscape] /an" + var1 + " - " + var2, 2500L);
      mc.getNetworkHandler().sendChatCommand("an" + var1);
   }

   private boolean method3662() {
      for (PlayerEntity var2 : mc.world.getPlayers()) {
         if (var2 != mc.player && !Helper309.method3075(var2) && !var2.isSpectator() && !var2.isCreative()) {
            double var3 = mc.player.distanceTo(var2);
            if (!(var3 > this.threatRange.method2082()) && (var3 <= 3.1 || this.method3663(var2))) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean method3663(PlayerEntity var1) {
      if (!var1.handSwinging) {
         return false;
      } else {
         Vec3d var2 = mc.player.getEyePos().subtract(var1.getEyePos()).normalize();
         Vec3d var3 = var1.getRotationVec(1.0F).normalize();
         return var3.dotProduct(var2) > 0.55;
      }
   }

   private float method3664() {
      float var1 = mc.player.getHealth();
      if (this.countAbsorption.method2200()) {
         var1 += mc.player.getAbsorptionAmount();
      }

      return var1;
   }

   private int method3665() {
      try {
         return Integer.parseInt(this.targetAnarchy.method2403());
      } catch (Exception var2) {
         return -1;
      }
   }

   private String method3666(float var1) {
      return String.format(Locale.ROOT, "%.1f", var1);
   }
}
