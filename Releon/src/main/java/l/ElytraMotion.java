package l;

import antidaunleak.api.annotation.Native;
import fat.releon.teremok.impl.combat.Aura;
import java.util.Random;
import net.minecraft.util.math.Vec3d;

public class ElytraMotion extends Helper242 {
   private Helper339 timer = new Helper339();
   private Vec3d targetPosition = null;
   private Random random = new Random();
   private double rotationAngle = 0.0;

   public static Fly method4398() {
      return Helper222.method1979(Fly.class);
   }

   public ElytraMotion() {
      super("ElytraMotion", "Elytra Motion", Helper269.MOVEMENT);
      this.setup(new Helper264[0]);
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginUltra
   )
   public void onTick(Event8 var1) {
      if (this.state && mc.player != null && mc.world != null && mc.player.isGliding()) {
         Aura var2 = Helper222.method1979(Aura.class);
         if (var2.isState() && var2.isState() && var2.getTarget() != null && mc.player.distanceTo(var2.getTarget()) < var2.getAttackRange().method2082() - 1.0F
            )
          {
            mc.player.setVelocity(0.0, 0.02, 0.0);
         }
      }
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      Aura var2 = Helper222.method1979(Aura.class);
      if (var2.isState() && var2.getTarget() != null && mc.player.distanceTo(var2.getTarget()) < var2.getAttackRange().method2082() - 1.0F) {
      }
   }

   @Override
   public void deactivate() {
      super.deactivate();
   }

   public Helper339 method4399() {
      return this.timer;
   }

   public Vec3d method4400() {
      return this.targetPosition;
   }

   public Random method4401() {
      return this.random;
   }

   public double method4402() {
      return this.rotationAngle;
   }
}
