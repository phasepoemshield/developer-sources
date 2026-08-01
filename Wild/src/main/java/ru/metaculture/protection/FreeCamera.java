package ru.metaculture.protection;

import net.minecraft.client.option.Perspective;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "FreeCamera",
   O0000000000 = Category.Player,
   O000000000 = "Свободная камера",
   O00000000000 = {O0000000OO0OOO.RISKY}
)
public class FreeCamera extends Module {
   private static FreeCamera O000000000O00O;
   public final NumberSetting O000000000O = new NumberSetting("Скорость", 2.0F, 0.5F, 5.0F, 0.1F, false);
   public final BooleanSetting O000000000O0 = new BooleanSetting("Отменять пакет", false);
   public Vec3d O000000000O00;
   public Vec3d O000000000O000;
   private Vec3d O000000000O0O;

   public static FreeCamera O0000000000O0() {
      if (O000000000O00O == null && WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         O000000000O00O = WildClient.O00000000.O000000000.O00000000(FreeCamera.class);
      }

      return O000000000O00O;
   }

   public FreeCamera() {
      O000000000O00O = this;
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0});
   }

   @Override
   public void O00000000() {
      if (O0000000000.player != null && O0000000000.world != null) {
         Vec3d var1 = O0000000000.getEntityRenderDispatcher().camera != null
            ? O0000000000.getEntityRenderDispatcher().camera.getPos()
            : O0000000000.player.getEyePos();
         this.O000000000O000 = this.O000000000O00 = var1;
         this.O000000000O0O = null;
         super.O00000000();
      } else {
         this.a_();
      }
   }

   @Override
   public void O000000000() {
      this.O000000000O0O = null;
      this.O000000000O00 = null;
      this.O000000000O000 = null;
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      Packet var2 = o0000000O000OO.O00000000000();
      if (!(var2 instanceof PlayerRespawnS2CPacket) && !(var2 instanceof GameJoinS2CPacket)) {
         if (o0000000O000OO.O0000000000() && this.O000000000O0.O0000000000() && var2 instanceof PlayerMoveC2SPacket) {
            o0000000O000OO.O000000000();
         }
      } else {
         this.O00000000(false);
      }
   }

   @EventHandler
   public void O00000000(O0000000OO0O0 o0000000OO0O0) {
      if (O0000000000.player != null && O0000000000.world != null) {
         Vec3d var2 = O0000000000.player.getLerpedPos(o0000000OO0O0.O00000000000O0());
         Box var3 = O0000000000.player.getBoundingBox().offset(var2.subtract(O0000000000.player.getPos()));
         this.O00000000(o0000000OO0O0, var3, O0000O000OO000.O00000000());
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null) {
         if (O0000000000.options != null) {
            O0000000000.options.setPerspective(Perspective.FIRST_PERSON);
         }

         this.O0000000000O00();
      } else {
         this.O00000000(false);
      }
   }

   @EventHandler
   public void O00000000(O0000000O0OOO o0000000O0OOO) {
      if (O0000000000.player != null && this.O000000000O0.O0000000000()) {
         if (this.O000000000O0O == null) {
            this.O000000000O0O = O0000000000.player.getPos();
         }

         o0000000O0OOO.O00000000(this.O000000000O0O.x);
         o0000000O0OOO.O000000000(this.O000000000O0O.y);
         o0000000O0OOO.O0000000000(this.O000000000O0O.z);
         O0000000000.player.setVelocity(Vec3d.ZERO);
         O0000000000.player.fallDistance = 0.0;
      }
   }

   @EventHandler
   public void O00000000(O0000000O0OO0 o0000000O0OO0) {
      if (O0000000000.player != null && O0000000000.world != null && this.O000000000O00 != null) {
         float var2 = this.O000000000O.O0000000000();
         double[] var3 = O0000O00O000OO.O00000000(o0000000O0OO0.O0000000000(), o0000000O0OO0.O00000000000(), (double)var2);
         this.O000000000O000 = this.O000000000O00;
         this.O000000000O00 = this.O000000000O00.add(var3[0], o0000000O0OO0.O000000000000() ? var2 : (o0000000O0OO0.O0000000000000() ? -var2 : 0.0), var3[1]);
         o0000000O0OO0.O00000000(0.0F);
         o0000000O0OO0.O000000000(0.0F);
         o0000000O0OO0.O00000000(false);
         o0000000O0OO0.O000000000(false);
      }
   }

   public Vec3d O00000000(float f) {
      if (this.O0000000000000 && this.O000000000O000 != null && this.O000000000O00 != null) {
         if (O0000000000.options != null) {
            O0000000000.options.setPerspective(Perspective.FIRST_PERSON);
         }

         return this.O000000000O000.lerp(this.O000000000O00, f);
      } else {
         return null;
      }
   }

   private void O0000000000O00() {
      if (O0000000000.player != null) {
         if (!this.O000000000O0.O0000000000()) {
            this.O000000000O0O = null;
         } else {
            if (this.O000000000O0O == null) {
               this.O000000000O0O = O0000000000.player.getPos();
            }

            O0000000000.player.setVelocity(Vec3d.ZERO);
            O0000000000.player.fallDistance = 0.0;
            O0000000000.player
               .refreshPositionAndAngles(
                  this.O000000000O0O.x, this.O000000000O0O.y, this.O000000000O0O.z, O0000000000.player.getYaw(), O0000000000.player.getPitch()
               );
            O0000000000.player.lastX = this.O000000000O0O.x;
            O0000000000.player.lastY = this.O000000000O0O.y;
            O0000000000.player.lastZ = this.O000000000O0O.z;
         }
      }
   }

   private void O00000000(O0000000OO0O0 o0000000OO0O0, Box box, int i) {
      int var4 = O0000O000OO000.O00000000(i, 220);
      Vec3d var5 = new Vec3d(box.minX, box.minY, box.minZ);
      Vec3d var6 = new Vec3d(box.maxX, box.maxY, box.maxZ);
      Vec3d var7 = new Vec3d(var5.x, var5.y, var5.z);
      Vec3d var8 = new Vec3d(var5.x, var5.y, var6.z);
      Vec3d var9 = new Vec3d(var5.x, var6.y, var5.z);
      Vec3d var10 = new Vec3d(var5.x, var6.y, var6.z);
      Vec3d var11 = new Vec3d(var6.x, var5.y, var5.z);
      Vec3d var12 = new Vec3d(var6.x, var5.y, var6.z);
      Vec3d var13 = new Vec3d(var6.x, var6.y, var5.z);
      Vec3d var14 = new Vec3d(var6.x, var6.y, var6.z);
      o0000000OO0O0.O000000000000().O00000000(var7, var11, 1.0, var4, false);
      o0000000OO0O0.O000000000000().O00000000(var11, var12, 1.0, var4, false);
      o0000000OO0O0.O000000000000().O00000000(var12, var8, 1.0, var4, false);
      o0000000OO0O0.O000000000000().O00000000(var8, var7, 1.0, var4, false);
      o0000000OO0O0.O000000000000().O00000000(var9, var13, 1.0, var4, false);
      o0000000OO0O0.O000000000000().O00000000(var13, var14, 1.0, var4, false);
      o0000000OO0O0.O000000000000().O00000000(var14, var10, 1.0, var4, false);
      o0000000OO0O0.O000000000000().O00000000(var10, var9, 1.0, var4, false);
      o0000000OO0O0.O000000000000().O00000000(var7, var9, 1.0, var4, false);
      o0000000OO0O0.O000000000000().O00000000(var11, var13, 1.0, var4, false);
      o0000000OO0O0.O000000000000().O00000000(var12, var14, 1.0, var4, false);
      o0000000OO0O0.O000000000000().O00000000(var8, var10, 1.0, var4, false);
   }
}
