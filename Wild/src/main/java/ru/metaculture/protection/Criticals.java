package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos.Mutable;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Criticals",
   O000000000 = "Критический удар под плавным падением или в паутине",
   O0000000000 = Category.Combat,
   O00000000000 = {O0000000OO0OOO.RISKY, O0000000OO0OOO.GRIM}
)
public class Criticals extends Module {
   public static boolean O000000000O;
   public final GroupSetting O000000000O0 = new GroupSetting("Условия", new BooleanSetting("Паутина", true), new BooleanSetting("Плавное падение", true));

   public Criticals() {
      this.O00000000(new Setting[]{this.O000000000O0});
   }

   @EventHandler
   public void O00000000(O0000000O0O0OO o0000000O0O0OO) {
      if (!O000000000O) {
         if (!O0000O00O00O0.O00000000() && O0000000000.player != null && O0000000000.world != null) {
            if (O0000000000.player.networkHandler != null) {
               if (!O0000000000.player.isGliding()) {
                  Entity var2 = o0000000O0O0OO.O0000000000();
                  if (var2 != null && var2 != O0000000000.player && !(var2 instanceof EndCrystalEntity)) {
                     boolean var3 = this.O000000000O0.O000000000("Паутина") && this.O0000000000O0();
                     boolean var4 = this.O000000000O0.O000000000("Плавное падение") && O0000000000.player.hasStatusEffect(StatusEffects.SLOW_FALLING);
                     if (var3 || var4) {
                        float var5 = MathHelper.lerp(ThreadLocalRandom.current().nextFloat(), 1.0E-7F, 1.0E-6F);
                        O0000000000.player.fallDistance = var5;
                        O0000000000.player
                           .networkHandler
                           .sendPacket(
                              new Full(
                                 O0000000000.player.getX(),
                                 O0000000000.player.getY() - var5,
                                 O0000000000.player.getZ(),
                                 O0000000000.player.getYaw(),
                                 O0000000000.player.getPitch(),
                                 false,
                                 O0000000000.player.horizontalCollision
                              )
                           );
                     }
                  }
               }
            }
         }
      }
   }

   private boolean O0000000000O0() {
      Box var1 = O0000000000.player.getBoundingBox().contract(1.0E-7);
      int var2 = MathHelper.floor(var1.minX);
      int var3 = MathHelper.floor(var1.maxX);
      int var4 = MathHelper.floor(var1.minY);
      int var5 = MathHelper.floor(var1.maxY);
      int var6 = MathHelper.floor(var1.minZ);
      int var7 = MathHelper.floor(var1.maxZ);
      Mutable var8 = new Mutable();

      for (int var9 = var2; var9 <= var3; var9++) {
         for (int var10 = var4; var10 <= var5; var10++) {
            for (int var11 = var6; var11 <= var7; var11++) {
               var8.set(var9, var10, var11);
               if (O0000000000.world.getBlockState(var8).isOf(Blocks.COBWEB)) {
                  return true;
               }
            }
         }
      }

      return false;
   }
}
