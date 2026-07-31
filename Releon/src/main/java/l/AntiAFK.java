package l;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class AntiAFK extends Helper242 {
   Helper339 timer = new Helper339();
   Setting8 multiSetting = new Setting8("Режим", "Выберите, что будет происходить").method2585("Jump", "Rotation change");
   Setting2 time = new Setting2("Время выполнения", "пиф").method2086(10.0F).method2078(1.0F, 25.0F);
   private double yawTarget = 0.0;
   private boolean rotating = false;
   private Vec3d walkStartPos = null;
   private boolean walking = false;
   private BlockPos breakingBlockPos = null;

   public AntiAFK() {
      super("AntiAFK", "Anti AFK", Helper269.PLAYER);
      this.setup(new Helper264[]{this.multiSetting, this.time});
   }

   @Override
   public void activate() {
      this.timer.method3358();
   }

   @Override
   public void deactivate() {
      this.rotating = false;
   }

   @Helper104
   public void method2376(Event28 var1) {
      if (this.rotating) {
         double var2 = this.yawTarget - mc.player.getYaw();
         double var4 = this.yawTarget - mc.player.getPitch();
         if (Math.abs(var2) > 1.0) {
            mc.player.setYaw((float)(mc.player.getYaw() + var2 * 0.1));
            mc.player.setPitch((float)(mc.player.getPitch() + var2 * 0.1));
         } else {
            this.rotating = false;
         }
      }
   }

   @Helper104
   public void tick(Event8 var1) {
      if (!Helper38.method549()) {
         long var2 = (long)(this.time.method2082() * 60.0F * 100.0F);
         if (this.timer.method3357(var2)) {
            for (String var6 : this.multiSetting.method2590()) {
               switch (var6) {
                  case "Jump":
                     if (mc.player.isOnGround()) {
                        mc.options.jumpKey.setPressed(true);
                     }
                     break;
                  case "Rotation change":
                     this.method2379();
                     break;
                  case "Break Block":
                     this.method2380();
               }
            }
         }
      }
   }

   private void method2377() {
      if (!this.walking) {
         this.walkStartPos = mc.player.getPos();
         this.walking = true;
      }

      mc.options.backKey.setPressed(false);
      mc.options.leftKey.setPressed(false);
      mc.options.rightKey.setPressed(false);
      Vec3d var1 = mc.player.getRotationVector();
      BlockPos var2 = mc.player.getBlockPos().add((int)var1.x * 5, 0, (int)var1.z * 5);
      double var3 = mc.player.getPos().distanceTo(this.walkStartPos);
      if (var3 >= 5.0) {
         mc.options.forwardKey.setPressed(false);
         mc.options.backKey.setPressed(false);
         mc.options.leftKey.setPressed(false);
         mc.options.rightKey.setPressed(false);
         this.walking = false;
         this.walkStartPos = null;
      } else {
         if (!mc.world.getBlockState(var2).isAir()) {
            mc.options.backKey.setPressed(true);
         } else {
            mc.options.forwardKey.setPressed(true);
         }
      }
   }

   private void method2378() {
      this.yawTarget = mc.player.getYaw() + 360.0F;
      this.rotating = true;
   }

   private void method2379() {
      this.yawTarget = mc.player.getYaw() + (Math.random() * 360.0 - 180.0);
      this.rotating = true;
   }

   private void method2380() {
      BlockPos var1 = mc.player.getBlockPos().down();
      BlockState var2 = mc.world.getBlockState(var1);
      if (var2.isAir()) {
         mc.options.attackKey.setPressed(false);
         this.breakingBlockPos = null;
      } else {
         if (!var1.equals(this.breakingBlockPos)) {
            this.breakingBlockPos = var1;
         }

         mc.options.attackKey.setPressed(true);
      }
   }
}
