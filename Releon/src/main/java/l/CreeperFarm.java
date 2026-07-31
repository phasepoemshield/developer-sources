package l;

import java.util.Comparator;
import java.util.List;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;

public class CreeperFarm extends Helper242 {
   private final Setting5 mode = new Setting5("Режим", "Как фармить криперов").method2381("На месте", "Бегать").method2383("Бегать");
   private final Helper339 attackTimer = new Helper339();
   private BlockPos anchorPos;
   private CreeperEntity target;

   public CreeperFarm() {
      super("CreeperFarm", "Creeper Farm", Helper269.MISC);
      this.setup(new Helper264[]{this.mode});
   }

   @Override
   public void activate() {
      super.activate();
      this.anchorPos = mc.player != null ? mc.player.getBlockPos() : null;
      this.target = null;
      this.attackTimer.method3360(500L);
   }

   @Override
   public void deactivate() {
      super.deactivate();
      this.method3692();
      this.target = null;
      this.anchorPos = null;
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null && mc.interactionManager != null) {
         if (this.anchorPos == null) {
            this.anchorPos = mc.player.getBlockPos();
         }

         this.target = this.method3690();
         if (this.target == null) {
            this.method3692();
         } else {
            double var2 = mc.player.squaredDistanceTo(this.target);
            double var4 = 6.0;
            if (var2 <= var4 * var4 && this.method3693(this.target)) {
               this.method3692();
               if (mc.player.getAttackCooldownProgress(0.5F) >= 0.92F && this.attackTimer.method3356(500.0)) {
                  mc.interactionManager.attackEntity(mc.player, this.target);
                  mc.player.swingHand(mc.player.getActiveHand() == null ? Hand.MAIN_HAND : Hand.MAIN_HAND);
                  this.attackTimer.method3358();
               }
            } else {
               if (this.mode.method2385("Бегать")) {
                  this.method3691(this.target);
               } else {
                  this.method3692();
               }
            }
         }
      }
   }

   private CreeperEntity method3690() {
      double var1 = 60.0;
      Box var3 = new Box(
         mc.player.getX() - var1, mc.player.getY() - 4.0, mc.player.getZ() - var1, mc.player.getX() + var1, mc.player.getY() + 4.0, mc.player.getZ() + var1
      );
      List<CreeperEntity> var4 = mc.world.getEntitiesByClass(CreeperEntity.class, var3, var0 -> var0.isAlive() && !var0.isRemoved() && !var0.isInvisible());
      double var5 = 100.0;
      double var7 = var5 * var5;
      return var4.stream()
         .filter(var3x -> var3x.getBlockPos().getSquaredDistance(this.anchorPos) <= var7)
         .min(Comparator.comparingDouble(var0 -> mc.player.squaredDistanceTo(var0)))
         .orElse(null);
   }

   private void method3691(CreeperEntity var1) {
      double var2 = mc.player.squaredDistanceTo(var1);
      double var4 = 6.0;
      if (var2 <= var4 * var4) {
         this.method3692();
      } else {
         mc.options.forwardKey.setPressed(true);
         mc.player.setSprinting(true);
      }
   }

   private void method3692() {
      if (mc.options != null) {
         mc.options.forwardKey.setPressed(false);
      }
   }

   private boolean method3693(CreeperEntity var1) {
      return mc.player.canSee(var1);
   }
}
