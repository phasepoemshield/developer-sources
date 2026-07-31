package ru.metaculture.protection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleAccess(
   O0000000000 = {"lichoday"}
)
@ModuleRegister(
   O00000000 = "TargetPearl",
   O000000000 = "Кидает эндер-перл вслед за перлом ближайшего игрока",
   O0000000000 = Category.Combat
)
public class TargetPearl extends Module {
   private static final double O000000000O = 0.03;
   private static final double O000000000O0 = 0.99;
   private static final double O000000000O00 = 0.8;
   private static final double O000000000O000 = 1.5;
   private static final int O000000000O00O = 240;
   private static final int O000000000O0O = 160;
   private static final String O000000000O0O0 = "TargetPearl";
   private final NumberSetting O000000000O0OO = new NumberSetting("Радиус реакции", 48.0F, 8.0F, 128.0F, 1.0F, false);
   private final BooleanSetting O000000000OO = new BooleanSetting("Использовать ротацию", true);
   private final NumberSetting O000000000OO0 = new NumberSetting("Скорость поворота", 40.0F, 5.0F, 180.0F, 1.0F, false)
      .O00000000(() -> !this.O000000000OO.O0000000000());
   private final NumberSetting O000000000OO00 = new NumberSetting("Точность прицела", 2.5F, 0.5F, 10.0F, 0.1F, false)
      .O00000000(() -> !this.O000000000OO.O0000000000());
   private final NumberSetting O000000000OO0O = new NumberSetting("Макс. промах (блоки)", 2.5F, 0.5F, 8.0F, 0.1F, false);
   private final NumberSetting O000000000OOO = new NumberSetting("Задержка броска (мс)", 600.0F, 0.0F, 3000.0F, 50.0F, false);
   private final BooleanSetting O000000000OOO0 = new BooleanSetting("Только из хотбара", false);
   private final BooleanSetting O000000000OOOO = new BooleanSetting("Только из инвентаря", false);
   private final BooleanSetting O00000000O = new BooleanSetting("Игнорировать друзей", true);
   private final BooleanSetting O00000000O0 = new BooleanSetting("Требовать владельца", false);
   private static final double O00000000O00 = 3.0;
   private final Set<Integer> O00000000O000 = new HashSet<>();
   private final Set<Integer> O00000000O0000 = new HashSet<>();
   private final Map<Integer, Vec3d> O00000000O000O = new HashMap<>();
   private final Map<Integer, Vec3d> O00000000O00O = new HashMap<>();
   private long O00000000O00O0;
   private int O00000000O00OO = -1;
   private int O00000000O0O;
   private int O00000000O0O0;
   private int O00000000O0O00 = -1;
   private int O00000000O0O0O = -1;
   private float O00000000O0OO;
   private float O00000000O0OO0;
   private float O00000000O0OOO;
   private float O00000000OO;

   public TargetPearl() {
      this.O00000000(
         new Setting[]{
            this.O000000000O0OO,
            this.O000000000OO,
            this.O000000000OO0,
            this.O000000000OO00,
            this.O000000000OO0O,
            this.O000000000OOO,
            this.O000000000OOO0,
            this.O000000000OOOO,
            this.O00000000O,
            this.O00000000O0
         }
      );
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         this.O0000000000OO0();
         if (this.O00000000O0O > 0) {
            this.O0000000000O00();
         } else {
            this.O000000000O0();
            EnderPearlEntity var2 = this.O0000000000OOO();
            if (var2 != null) {
               Vec3d var3 = this.O00000000(var2, this.O00000000(var2));
               if (var3 != null) {
                  Vec3d var4 = O0000000000.player.getEyePos().subtract(0.0, 0.1, 0.0);
                  TargetPearl.W32 var5 = this.O00000000(var4, var3);
                  if (var5 != null && !(var5.O0000000000 > this.O000000000OO0O.O0000000000())) {
                     if (this.O000000000OO.O0000000000()) {
                        float var6 = this.O000000000OO0.O0000000000();
                        O000000O0O0O0.O00000000(new O000000O0O00OO(var5.O00000000, var5.O000000000), var6, var6, 6, 5);
                     }

                     if (!this.O00000000O000.contains(var2.getId())) {
                        if (System.currentTimeMillis() - this.O00000000O00O0 >= (long)this.O000000000OOO.O0000000000()) {
                           if (this.O000000000OO.O0000000000()) {
                              float var7 = new O000000O0O00OO(O0000000000.player).O00000000(new O000000O0O00OO(var5.O00000000, var5.O000000000));
                              if (var7 > this.O000000000OO00.O0000000000()) {
                                 return;
                              }
                           }

                           int var8 = this.O000000000O();
                           if (var8 != -1) {
                              this.O00000000(var8, var5, var2.getId());
                              this.O00000000O000.add(var2.getId());
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void O00000000(int i, TargetPearl.W32 o00000000, int j) {
      this.O00000000O0O00 = i;
      this.O00000000O00OO = j;
      this.O00000000O0OO = o00000000.O00000000;
      this.O00000000O0OO0 = o00000000.O000000000;
      this.O00000000O0O0O = -1;
      this.O00000000O0O0 = 0;
      this.O00000000O0O = 1;
      this.O0000000000O00();
   }

   private void O0000000000O0() {
      if (this.O00000000O00OO != -1 && O0000000000.world != null) {
         if (O0000000000.world.getEntityById(this.O00000000O00OO) instanceof EnderPearlEntity var1) {
            Vec3d var5 = this.O00000000(var1, this.O00000000(var1));
            if (var5 != null) {
               Vec3d var3 = O0000000000.player.getEyePos().subtract(0.0, 0.1, 0.0);
               TargetPearl.W32 var4 = this.O00000000(var3, var5);
               if (var4 != null && var4.O0000000000 <= this.O000000000OO0O.O0000000000()) {
                  this.O00000000O0OO = var4.O00000000;
                  this.O00000000O0OO0 = var4.O000000000;
               }
            }
         }
      }
   }

   private void O0000000000O00() {
      boolean var1 = this.O00000000(this.O00000000O0O00);
      if (!var1) {
         Sprint.O000000000O000 = 2;
         O0000000000.options.sprintKey.setPressed(false);
         O0000000000.player.setSprinting(false);
         O0000O00O00O.O00000000().O00000000("TargetPearl");
      }

      if (this.O00000000O0O0 > 0) {
         this.O00000000O0O0--;
      } else if (var1) {
         int var2 = this.O000000000(this.O00000000O0O00);
         switch (this.O00000000O0O) {
            case 1:
               this.O00000000O0O0O = O0000000000.player.getInventory().getSelectedSlot();
               if (this.O00000000O0O0O != var2) {
                  O0000000000.player.getInventory().setSelectedSlot(var2);
               }

               this.O0000000000O0O();
               this.O00000000O0O = 2;
               this.O00000000O0O0 = 1;
               break;
            case 2:
               if (this.O00000000O0O0O != var2) {
                  O0000000000.player.getInventory().setSelectedSlot(this.O00000000O0O0O);
               }

               this.O0000000000OO();
         }
      } else {
         switch (this.O00000000O0O) {
            case 1:
               this.O00000000O0O = 2;
               this.O00000000O0O0 = 3;
               break;
            case 2:
               this.O00000000O0O0O = O0000000000.player.getInventory().getSelectedSlot();
               if (!O0000000000.player.isSprinting()) {
                  O0000000000.interactionManager
                     .clickSlot(
                        O0000000000.player.playerScreenHandler.syncId, this.O00000000O0O00, this.O00000000O0O0O, SlotActionType.SWAP, O0000000000.player
                     );
               }

               this.O00000000O0O = 3;
               this.O00000000O0O0 = 1;
               break;
            case 3:
               this.O0000000000O0O();
               this.O00000000O0O = 4;
               this.O00000000O0O0 = 1;
               break;
            case 4:
               if (!O0000000000.player.isSprinting()) {
                  O0000000000.interactionManager
                     .clickSlot(
                        O0000000000.player.playerScreenHandler.syncId, this.O00000000O0O00, this.O00000000O0O0O, SlotActionType.SWAP, O0000000000.player
                     );
               }

               if (O0000000000.getNetworkHandler() != null) {
                  O0000000000.getNetworkHandler().sendPacket(new CloseHandledScreenC2SPacket(O0000000000.player.playerScreenHandler.syncId));
               }

               this.O00000000O0O = 5;
               this.O00000000O0O0 = 1;
               break;
            case 5:
               O0000O00O00O.O00000000().O000000000("TargetPearl");
               this.O0000000000OO();
         }
      }
   }

   private void O0000000000O0O() {
      this.O0000000000O0();
      this.O00000000O0OOO = O0000000000.player.getYaw();
      this.O00000000OO = O0000000000.player.getPitch();
      O0000000000.player.setYaw(this.O00000000O0OO);
      O0000000000.player.headYaw = this.O00000000O0OO;
      O0000000000.player.setPitch(this.O00000000O0OO0);
      O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
      O0000000000.player.swingHand(Hand.MAIN_HAND);
      O0000000000.player.setYaw(this.O00000000O0OOO);
      O0000000000.player.headYaw = this.O00000000O0OOO;
      O0000000000.player.setPitch(this.O00000000OO);
   }

   private void O0000000000OO() {
      this.O00000000O00O0 = System.currentTimeMillis();
      this.O00000000O0O = 0;
      this.O00000000O0O0 = 0;
      this.O00000000O0O00 = -1;
      this.O00000000O00OO = -1;
      this.O00000000O0O0O = -1;
   }

   private void O0000000000OO0() {
      this.O00000000O00O.clear();
      HashSet var1 = new HashSet();

      for (Entity var3 : O0000000000.world.getEntities()) {
         if (var3 instanceof EnderPearlEntity var4) {
            int var5 = var4.getId();
            var1.add(var5);
            Vec3d var6 = var4.getPos();
            Vec3d var7 = this.O00000000O000O.get(var5);
            if (var7 == null && O0000000000.player.getEyePos().squaredDistanceTo(var6) < 9.0) {
               this.O00000000O0000.add(var5);
            }

            this.O00000000O00O.put(var5, var7 != null ? var6.subtract(var7) : var4.getVelocity());
            this.O00000000O000O.put(var5, var6);
         }
      }

      this.O00000000O000O.keySet().retainAll(var1);
      this.O00000000O0000.retainAll(var1);
   }

   private Vec3d O00000000(EnderPearlEntity enderPearlEntity) {
      Vec3d var2 = enderPearlEntity.getVelocity();
      if (var2.lengthSquared() > 0.001) {
         return var2;
      } else {
         Vec3d var3 = this.O00000000O00O.get(enderPearlEntity.getId());
         return var3 != null ? var3 : var2;
      }
   }

   private EnderPearlEntity O0000000000OOO() {
      EnderPearlEntity var1 = null;
      double var2 = Double.MAX_VALUE;
      double var4 = this.O000000000O0OO.O0000000000() * this.O000000000O0OO.O0000000000();

      for (Entity var7 : O0000000000.world.getEntities()) {
         if (var7 instanceof EnderPearlEntity var8 && !(this.O00000000(var8).lengthSquared() < 0.001) && !this.O00000000O0000.contains(var8.getId())) {
            PlayerEntity var10 = var8.getOwner() instanceof PlayerEntity var11 ? var11 : null;
            if (var10 != O0000000000.player
               && (var10 == null ? !this.O00000000O0.O0000000000() : !this.O00000000O.O0000000000() || !FriendCommand.O00000000(var10.getName().getString()))) {
               double var13 = O0000000000.player.squaredDistanceTo(var8);
               if (!(var13 > var4) && var13 < var2) {
                  var2 = var13;
                  var1 = var8;
               }
            }
         }
      }

      return var1;
   }

   private Vec3d O00000000(EnderPearlEntity enderPearlEntity, Vec3d vec3d) {
      double var3 = enderPearlEntity.getFinalGravity();
      if (var3 <= 0.0) {
         var3 = 0.03;
      }

      double var5 = enderPearlEntity.isTouchingWater() ? 0.8 : 0.99;
      return this.O00000000(enderPearlEntity.getPos(), vec3d, var3, var5, enderPearlEntity, 240);
   }

   private TargetPearl.W32 O00000000(Vec3d vec3d, Vec3d vec3d2) {
      double var3 = vec3d2.x - vec3d.x;
      double var5 = vec3d2.z - vec3d.z;
      float var7 = (float)Math.toDegrees(Math.atan2(-var3, var5));
      TargetPearl.W32 var8 = null;

      for (float var9 = -10.0F; var9 <= 10.0F; var9 += 2.0F) {
         float var10 = var7 + var9;

         for (float var11 = -90.0F; var11 <= 90.0F; var11++) {
            TargetPearl.W32 var12 = this.O00000000(vec3d, vec3d2, var10, var11);
            if (var12 != null && (var8 == null || var12.O0000000000 < var8.O0000000000)) {
               var8 = var12;
            }
         }
      }

      if (var8 == null) {
         return null;
      } else {
         TargetPearl.W32 var13 = var8;

         for (float var14 = var8.O00000000 - 2.0F; var14 <= var8.O00000000 + 2.0F; var14 += 0.5F) {
            for (float var15 = var8.O000000000 - 2.0F; var15 <= var8.O000000000 + 2.0F; var15 += 0.3F) {
               TargetPearl.W32 var16 = this.O00000000(vec3d, vec3d2, var14, var15);
               if (var16 != null && var16.O0000000000 < var13.O0000000000) {
                  var13 = var16;
               }
            }
         }

         return var13;
      }
   }

   private TargetPearl.W32 O00000000(Vec3d vec3d, Vec3d vec3d2, float f, float g) {
      Vec3d var5 = this.O00000000(f, g);
      Vec3d var6 = this.O00000000(vec3d, var5, 0.03, 0.99, O0000000000.player, 160);
      if (var6 == null) {
         return null;
      } else {
         double var7 = Math.sqrt(var6.squaredDistanceTo(vec3d2));
         return new TargetPearl.W32(MathHelper.wrapDegrees(f), MathHelper.clamp(g, -90.0F, 90.0F), var7);
      }
   }

   private Vec3d O00000000(float f, float g) {
      float var3 = f * (float) (Math.PI / 180.0);
      float var4 = g * (float) (Math.PI / 180.0);
      double var5 = -MathHelper.sin(var3) * MathHelper.cos(var4);
      double var7 = -MathHelper.sin(var4);
      double var9 = MathHelper.cos(var3) * MathHelper.cos(var4);
      Vec3d var11 = new Vec3d(var5, var7, var9).normalize().multiply(1.5);
      Vec3d var12 = O0000000000.player.getMovement();
      return var11.add(var12.x, O0000000000.player.isOnGround() ? 0.0 : var12.y, var12.z);
   }

   private Vec3d O00000000(Vec3d vec3d, Vec3d vec3d2, double d, double e, Entity entity, int i) {
      if (O0000000000.world == null) {
         return null;
      } else {
         Vec3d var9 = vec3d;
         Vec3d var10 = vec3d2;

         for (int var11 = 0; var11 < i; var11++) {
            var10 = var10.subtract(0.0, d, 0.0).multiply(e);
            Vec3d var12 = var9.add(var10);
            BlockHitResult var13 = O0000000000.world.raycast(new RaycastContext(var9, var12, ShapeType.COLLIDER, FluidHandling.NONE, entity));
            if (var13.getType() != Type.MISS) {
               return var13.getPos();
            }

            Box var14 = new Box(var9, var12).expand(1.0);
            double var15 = Double.MAX_VALUE;
            Vec3d var17 = null;

            for (Entity var19 : O0000000000.world
               .getOtherEntities(entity, var14, entityx -> entityx.isAlive() && !entityx.isSpectator() && entityx instanceof PlayerEntity)) {
               Box var20 = var19.getBoundingBox().expand(0.3);
               Optional var21 = var20.raycast(var9, var12);
               if (var21.isPresent()) {
                  double var22 = var9.squaredDistanceTo((Vec3d)var21.get());
                  if (var22 < var15) {
                     var15 = var22;
                     var17 = (Vec3d)var21.get();
                  }
               }
            }

            if (var17 != null) {
               return var17;
            }

            var9 = var12;
         }

         return var9;
      }
   }

   private int O000000000O() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (O0000000000.player.getInventory().getStack(var1).getItem() == Items.ENDER_PEARL) {
            boolean var2 = var1 < 9;
            if ((!this.O000000000OOOO.O0000000000() || !var2) && (!this.O000000000OOO0.O0000000000() || var2)) {
               return var2 ? var1 + 36 : var1;
            }
         }
      }

      return -1;
   }

   private boolean O00000000(int i) {
      return i >= 0 && i <= 8 || i >= 36 && i <= 44;
   }

   private int O000000000(int i) {
      if (i >= 0 && i <= 8) {
         return i;
      } else {
         return i >= 36 && i <= 44 ? i - 36 : -1;
      }
   }

   private void O000000000O0() {
      if (!this.O00000000O000.isEmpty()) {
         this.O00000000O000.removeIf(integer -> O0000000000.world.getEntityById(integer) == null);
      }
   }

   @Override
   public void O000000000() {
      if (this.O00000000O0O > 0 && !this.O00000000(this.O00000000O0O00)) {
         O0000O00O00O.O00000000().O000000000("TargetPearl");
      }

      this.O00000000O000.clear();
      this.O00000000O0000.clear();
      this.O00000000O000O.clear();
      this.O00000000O00O.clear();
      this.O00000000O0O = 0;
      this.O00000000O0O0 = 0;
      this.O00000000O0O00 = -1;
      this.O00000000O00OO = -1;
      O000000O0O00O.O00000000 = O000000O0O00O.O000000000;
      super.O000000000();
   }

   static final class W32 {
      final float O00000000;
      final float O000000000;
      final double O0000000000;

      W32(float f, float g, double d) {
         this.O00000000 = f;
         this.O000000000 = g;
         this.O0000000000 = d;
      }
   }
}
