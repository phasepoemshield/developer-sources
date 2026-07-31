package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.Perspective;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Blink",
   O000000000 = "Замедляет пакеты имитируя пинг",
   O0000000000 = Category.Player,
   O00000000000 = {O0000000OO0OOO.RISKY, O0000000OO0OOO.GRIM}
)
public class Blink extends Module {
   private static final int O000000000O = -1258291201;
   private final List<Packet<?>> O000000000O0 = new ArrayList<>();
   private final BooleanSetting O000000000O00 = new BooleanSetting("Пульсировать", false);
   private final NumberSetting O000000000O000 = new NumberSetting("Задержка", 12.0F, 1.0F, 40.0F, 1.0F, false)
      .O00000000(() -> !this.O000000000O00.O0000000000());
   private final BooleanSetting O000000000O00O = new BooleanSetting("Сброс при ударе", false);
   private final BooleanSetting O000000000O0O = new BooleanSetting("Отображать модель", true);
   private final BooleanSetting O000000000O0O0 = new BooleanSetting("Убирать от первого лица", true).O00000000(() -> !this.O000000000O0O.O0000000000());
   private Vec3d O000000000O0OO;
   private boolean O000000000OO;
   private boolean O000000000OO0;
   private boolean O000000000OO00;
   private long O000000000OO0O;

   public Blink() {
      this.O00000000(new Setting[]{this.O000000000O00, this.O000000000O000, this.O000000000O00O, this.O000000000O0O, this.O000000000O0O0});
   }

   @Override
   public void O00000000() {
      if (!this.O0000000000O00()) {
         this.O00000000(false);
      } else {
         this.O000000000O0.clear();
         this.O000000000O0OO = O0000000000.player.getPos();
         this.O000000000OO = false;
         this.O000000000OO00 = false;
         this.O000000000OO0O = System.currentTimeMillis();
         super.O00000000();
      }
   }

   @Override
   public void O000000000() {
      if (!this.O000000000OO0) {
         this.O0000000000O0();
      }

      this.O000000000O0.clear();
      this.O000000000O0OO = null;
      this.O000000000OO = false;
      this.O000000000OO00 = false;
      this.O000000000OO0 = false;
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (o0000000O000OO.O0000000000() && !this.O000000000OO && this.O0000000000O00()) {
         if (this.O000000000OO00) {
            this.O000000000OO00 = false;
            if (o0000000O000OO.O00000000000() instanceof PlayerInteractEntityC2SPacket) {
               return;
            }
         }

         this.O000000000O0.add(o0000000O000OO.O00000000000());
         o0000000O000OO.O000000000();
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O0OO o0000000O0O0OO) {
      if (this.O000000000O00O.O0000000000()
         && this.O0000000000O00()
         && o0000000O0O0OO.O0000000000() instanceof PlayerEntity var2
         && var2 != O0000000000.player
         && !(var2 instanceof ClientPlayerEntity)) {
         this.O0000000000O0();
         this.O000000000O0.clear();
         this.O000000000O0OO = O0000000000.player.getPos();
         this.O000000000OO00 = true;
         this.O000000000OO0O = System.currentTimeMillis();
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O0O0 o0000000O0O0O0) {
      if (this.O000000000O00.O0000000000() && !this.O000000000O0.isEmpty()) {
         if (System.currentTimeMillis() - this.O000000000OO0O >= this.O0000000000O0O()) {
            this.O0000000000O0();
            this.O000000000O0.clear();
            this.O000000000O0OO = O0000000000.player != null ? O0000000000.player.getPos() : null;
            this.O000000000OO0O = System.currentTimeMillis();
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000OO0O0 o0000000OO0O0) {
      if (this.O000000000O0O.O0000000000() && this.O000000000O0OO != null && O0000000000.player != null && O0000000000.world != null) {
         if (O0000000000.options.getPerspective() != Perspective.FIRST_PERSON || !this.O000000000O0O0.O0000000000()) {
            Box var2 = O0000000000.player.getBoundingBox().offset(this.O000000000O0OO.subtract(O0000000000.player.getPos()));
            this.O00000000(o0000000OO0O0, var2, -1258291201);
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00OO0 o0000000O00OO0) {
      this.O000000000OO0 = true;
      this.O00000000(false);
   }

   @EventHandler
   public void O00000000(O0000000O000O o0000000O000O) {
      this.O000000000OO0 = true;
      this.O00000000(false);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O0000000000O0() {
      if (!this.O000000000O0.isEmpty() && O0000000000.getNetworkHandler() != null) {
         this.O000000000OO = true;
         boolean var5 = false /* VF: Semaphore variable */;

         try {
            var5 = true;

            for (Packet var2 : this.O000000000O0) {
               O0000000000.getNetworkHandler().sendPacket(var2);
            }

            var5 = false;
         } finally {
            if (var5) {
               this.O000000000OO = false;
            }
         }

         this.O000000000OO = false;
      }
   }

   private boolean O0000000000O00() {
      return O0000000000.player != null && O0000000000.world != null && O0000000000.getNetworkHandler() != null;
   }

   private long O0000000000O0O() {
      return Math.round(this.O000000000O000.O0000000000() * 50.0F);
   }

   private void O00000000(O0000000OO0O0 o0000000OO0O0, Box box, int i) {
      Vec3d var4 = new Vec3d(box.minX, box.minY, box.minZ);
      Vec3d var5 = new Vec3d(box.maxX, box.maxY, box.maxZ);
      Vec3d var6 = new Vec3d(var4.x, var4.y, var4.z);
      Vec3d var7 = new Vec3d(var4.x, var4.y, var5.z);
      Vec3d var8 = new Vec3d(var4.x, var5.y, var4.z);
      Vec3d var9 = new Vec3d(var4.x, var5.y, var5.z);
      Vec3d var10 = new Vec3d(var5.x, var4.y, var4.z);
      Vec3d var11 = new Vec3d(var5.x, var4.y, var5.z);
      Vec3d var12 = new Vec3d(var5.x, var5.y, var4.z);
      Vec3d var13 = new Vec3d(var5.x, var5.y, var5.z);
      o0000000OO0O0.O000000000000().O00000000(var6, var10, 1.0, i, false);
      o0000000OO0O0.O000000000000().O00000000(var10, var11, 1.0, i, false);
      o0000000OO0O0.O000000000000().O00000000(var11, var7, 1.0, i, false);
      o0000000OO0O0.O000000000000().O00000000(var7, var6, 1.0, i, false);
      o0000000OO0O0.O000000000000().O00000000(var8, var12, 1.0, i, false);
      o0000000OO0O0.O000000000000().O00000000(var12, var13, 1.0, i, false);
      o0000000OO0O0.O000000000000().O00000000(var13, var9, 1.0, i, false);
      o0000000OO0O0.O000000000000().O00000000(var9, var8, 1.0, i, false);
      o0000000OO0O0.O000000000000().O00000000(var6, var8, 1.0, i, false);
      o0000000OO0O0.O000000000000().O00000000(var10, var12, 1.0, i, false);
      o0000000OO0O0.O000000000000().O00000000(var11, var13, 1.0, i, false);
      o0000000OO0O0.O000000000000().O00000000(var7, var9, 1.0, i, false);
   }
}
