package ru.metaculture.protection;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AttackEffect",
   O000000000 = "Красивые эффекты в точке удара",
   O0000000000 = Category.Visuals
)
public class AttackEffect extends Module {
   private static final String O000000000OO00 = "Торус";
   private static final String O000000000OO0O = "Плазма";
   private static final int O000000000OOO = 6061311;
   private static final int O000000000OOO0 = 6748116;
   private static final long O000000000OOOO = 30L;
   private static final double O00000000O = 9.0;
   public final ModeSetting O000000000O = new ModeSetting("Режим", "Торус", "Торус", "Плазма");
   public final NumberSetting O000000000O0 = new NumberSetting("Радиус волны", 1.8F, 0.1F, 3.5F, 0.05F, false)
      .O00000000(() -> !this.O000000000O.O000000000("Торус"));
   public final NumberSetting O000000000O00 = new NumberSetting("Сила преломления", 0.06F, 0.01F, 0.16F, 0.001F, false)
      .O00000000(() -> !this.O000000000O.O000000000("Торус"));
   public final NumberSetting O000000000O000 = new NumberSetting("Длительность", 420.0F, 200.0F, 1600.0F, 10.0F, false)
      .O00000000(() -> !this.O000000000O.O000000000("Торус"));
   public final BooleanSetting O000000000O00O = new BooleanSetting("Спектральная дисперсия", true).O00000000(() -> !this.O000000000O.O000000000("Торус"));
   public final BooleanSetting O000000000O0O = new BooleanSetting("Не сквозь игрока", true).O00000000(() -> !this.O000000000O.O000000000("Торус"));
   public final NumberSetting O000000000O0O0 = new NumberSetting("Радиус плазмы", 1.4F, 1.0F, 3.0F, 0.05F, false)
      .O00000000(() -> !this.O000000000O.O000000000("Плазма"));
   public final NumberSetting O000000000O0OO = new NumberSetting("Температура плазмы", 1.0F, 0.5F, 2.0F, 0.05F, false)
      .O00000000(() -> !this.O000000000O.O000000000("Плазма"));
   public final NumberSetting O000000000OO = new NumberSetting("Яркость плазмы", 0.8F, 0.3F, 1.6F, 0.02F, false)
      .O00000000(() -> !this.O000000000O.O000000000("Плазма"));
   public final NumberSetting O000000000OO0 = new NumberSetting("Длительность плазмы", 480.0F, 220.0F, 900.0F, 10.0F, false)
      .O00000000(() -> !this.O000000000O.O000000000("Плазма"));
   private final List<O00000O0O0OOOO> O00000000O0 = new CopyOnWriteArrayList<>();
   private final List<O00000O0OO00> O00000000O00 = new CopyOnWriteArrayList<>();
   private long O00000000O000;
   private int O00000000O0000 = Integer.MIN_VALUE;
   private int O00000000O000O;

   public AttackEffect() {
      this.O00000000(
         new Setting[]{
            this.O000000000O,
            this.O000000000O0,
            this.O000000000O00,
            this.O000000000O000,
            this.O000000000O00O,
            this.O000000000O0O,
            this.O000000000O0O0,
            this.O000000000O0OO,
            this.O000000000OO,
            this.O000000000OO0
         }
      );
   }

   @EventHandler
   public void O00000000(O0000000O0O0OO o0000000O0O0OO) {
      if (o0000000O0O0OO != null) {
         this.O00000000(o0000000O0O0OO.O0000000000());
      }
   }

   public void O00000000(Entity entity) {
      if (this.O0000000000000 && entity != null && O0000000000.player != null && O0000000000.world != null) {
         if (entity != O0000000000.player) {
            long var2 = System.currentTimeMillis();
            if (entity.getId() != this.O00000000O0000 || var2 - this.O00000000O000 >= 30L) {
               this.O00000000O0000 = entity.getId();
               this.O00000000O000 = var2;
               Vec3d var4 = O0000000000.player.getRotationVec(1.0F).normalize();
               if (this.O000000000O.O000000000("Плазма")) {
                  this.O000000000(entity, var4, var2);
               } else {
                  this.O00000000(entity, var4, var2);
               }
            }
         }
      }
   }

   private void O00000000(Entity entity, Vec3d vec3d, long l) {
      Vec3d var5 = entity.getBoundingBox().getCenter();
      O00000O0O0OOOO var6 = new O00000O0O0OOOO(
         var5, vec3d, l, (long)this.O000000000O000.O00000000000, this.O000000000O0.O00000000000, this.O000000000O00.O00000000000, this.O0000000000O00()
      );
      this.O00000000O0.add(var6);

      while (this.O00000000O0.size() > 10) {
         this.O00000000O0.remove(0);
      }
   }

   private void O000000000(Entity entity, Vec3d vec3d, long l) {
      Vec3d var5 = this.O00000000(entity, vec3d);
      this.O00000000O000O = this.O00000000O000O + 1 & 1023;
      float var6 = this.O00000000O000O * 7.31F % 41.0F;
      O00000O0OO00 var7 = new O00000O0OO00(
         var5,
         vec3d,
         l,
         (long)this.O000000000OO0.O00000000000,
         this.O000000000O0O0.O00000000000,
         this.O000000000O0OO.O00000000000,
         this.O000000000OO.O00000000000,
         var6,
         this.O0000000000O0()
      );
      this.O00000000O00.add(var7);

      while (this.O00000000O00.size() > 12) {
         this.O00000000O00.remove(0);
      }
   }

   private Vec3d O00000000(Entity entity, Vec3d vec3d) {
      if (O0000000000.crosshairTarget instanceof EntityHitResult var4 && var4.getEntity() == entity) {
         return var4.getPos();
      } else {
         Box var7 = entity.getBoundingBox();
         Vec3d var5 = O0000000000.player.getEyePos();
         Vec3d var6 = var5.add(vec3d.multiply(9.0));
         return var7.raycast(var5, var6).orElse(var7.getCenter());
      }
   }

   @EventHandler
   public void O00000000(O0000000OO0O0 o0000000OO0O0) {
      if (this.O0000000000000 && o0000000OO0O0 != null) {
         long var2 = System.currentTimeMillis();
         this.O00000000O0.removeIf(o00000O0O0OOOO -> o00000O0O0OOOO.O000000000(var2));
         this.O00000000O00.removeIf(o00000O0OO00 -> o00000O0OO00.O000000000(var2));
         if (!this.O00000000O0.isEmpty() || !this.O00000000O00.isEmpty()) {
            Camera var4 = o0000000OO0O0.O000000000000().O00000000();
            if (var4 != null) {
               Vec3d var5 = var4.getPos();
               Matrix4f var6 = o0000000OO0O0.O000000000000O();
               Matrix4f var7 = o0000000OO0O0.O00000000000O();
               float var8 = (float)(var2 % 100000L) / 1000.0F;
               if (!this.O00000000O0.isEmpty()) {
                  O00000O0O0OOO0.O00000000()
                     .O00000000(O0000000000, this.O00000000O0, var6, var7, var5, this.O000000000O00O.O0000000000(), this.O000000000O0O.O0000000000(), var8);
               }

               if (!this.O00000000O00.isEmpty()) {
                  O00000O0OO0.O00000000().O00000000(O0000000000, this.O00000000O00, var6, var7, var5, var8);
               }
            }
         }
      }
   }

   @Override
   public void O000000000() {
      super.O000000000();
      this.O00000000O0.clear();
      this.O00000000O00.clear();
   }

   private int O0000000000O0() {
      return this.O00000000(6748116);
   }

   private int O0000000000O00() {
      return this.O00000000(6061311);
   }

   private int O00000000(int i) {
      try {
         if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null) {
            Theme var2 = WildClient.O00000000.O0000000000O.O000000000();
            if (var2 == Theme.CUSTOM) {
               return WildClient.O00000000.O0000000000O.O000000000.O00000000000O() & 16777215;
            }

            if (var2 != null && var2.O00000000() != null) {
               return var2.O00000000().getRGB() & 16777215;
            }
         }
      } catch (Throwable var3) {
      }

      return i;
   }

   private boolean O00000000(int i, int j) {
      int var3 = Math.abs((i >> 16 & 0xFF) - (j >> 16 & 0xFF));
      int var4 = Math.abs((i >> 8 & 0xFF) - (j >> 8 & 0xFF));
      int var5 = Math.abs((i & 0xFF) - (j & 0xFF));
      return var3 <= 3 && var4 <= 3 && var5 <= 3;
   }
}
