package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Predicate;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.glfw.GLFW;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "GlowESP",
   O000000000 = "Шейдерная градиентная обводка игроков",
   O0000000000 = Category.Visuals
)
public final class GlowESP extends Module {
   private static final String O000000000OOOO = "glow_esp";
   private static final String O00000000O = "glow_esp_friends";
   private static final O0000O0O000O0O.W389 O00000000O0 = new O0000O0O000O0O.W389(0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
   public final GroupSetting O000000000O = new GroupSetting(
      "Цели", new BooleanSetting("Игроки", true), new BooleanSetting("Мобы", false), new BooleanSetting("Предметы", false), new BooleanSetting("Себя", false)
   );
   public final BooleanSetting O000000000O0 = new BooleanSetting("Невидимые", true);
   public final NumberSetting O000000000O00 = new NumberSetting("Дистанция", 96.0F, 8.0F, 256.0F, 1.0F, false);
   public final ModeSetting O000000000O000 = new ModeSetting("Эффект", "Свечение + контур", "Свечение + контур", "Свечение", "Контур");
   public final NumberSetting O000000000O00O = new NumberSetting("Размер свечения", 10.0F, 2.0F, 32.0F, 1.0F, false).O00000000(this::O0000000000OO);
   public final NumberSetting O000000000O0O = new NumberSetting("Яркость свечения", 2.0F, 0.25F, 5.0F, 0.05F, false).O00000000(this::O0000000000OO);
   public final NumberSetting O000000000O0O0 = new NumberSetting("Толщина контура", 2.0F, 0.5F, 6.0F, 0.5F, false).O00000000(this::O0000000000O0O);
   public final NumberSetting O000000000O0OO = new NumberSetting("Прозрачность", 0.92F, 0.05F, 1.0F, 0.01F, true);
   public final ModeSetting O000000000OO = new ModeSetting("Режим цвета", "Градиент", "Градиент", "Статичный");
   public final ModeSetting O000000000OO0 = new ModeSetting("Источник цвета", "Тема", "Тема", "Свой");
   public final ColorSetting O000000000OO00 = new ColorSetting("Основной цвет", 55.0F, 0.72F, 1.0F).O000000000(() -> this.O000000000OO0.O000000000("Тема"));
   public final ColorSetting O000000000OO0O = new ColorSetting("Второй цвет", 76.0F, 0.78F, 1.0F)
      .O000000000(() -> this.O000000000OO0.O000000000("Тема") || this.O000000000OO.O000000000("Статичный"));
   public final BooleanSetting O000000000OOO = new BooleanSetting("Выделять друзей", true);
   public final ColorSetting O000000000OOO0 = new ColorSetting("Цвет друзей", 40.0F, 0.8F, 1.0F).O000000000(() -> !this.O000000000OOO.O0000000000());
   private final Predicate<Entity> O00000000O00 = this::O00000000;
   private final Predicate<Entity> O00000000O000 = entity -> this.O00000000(entity) && this.O000000000(entity);
   private O0000O0O000O0O O00000000O0000;
   private static final int O00000000O000O = 0;
   private static final int O00000000O00O = 1;
   private static final int O00000000O00O0 = 2;
   private final Matrix4f O00000000O00OO = new Matrix4f();
   private final Matrix4f O00000000O0O = new Matrix4f();
   private final Vector4f O00000000O0O0 = new Vector4f();
   private final Vector3f O00000000O0O00 = new Vector3f();
   private final int[] O00000000O0O0O = new int[]{0, 0, 0, 0};
   private final float[] O00000000O0OO = new float[4];
   private final float[] O00000000O0OO0 = new float[3];
   private final float[] O00000000O0OOO = new float[3];
   private final float[] O00000000OO = new float[3];
   private final float[] O00000000OO0 = new float[4];
   private boolean O00000000OO00;
   private O0000O0O000O0O.W389 O00000000OO000;

   public GlowESP() {
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
            this.O000000000OO0,
            this.O000000000OO00,
            this.O000000000OO0O,
            this.O000000000OOO,
            this.O000000000OOO0
         }
      );
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O0000000000O00();
   }

   @Override
   public void O000000000() {
      O0000O00OO000 var1 = O0000O00OO000.O00000000();
      var1.O000000000("glow_esp_friends");
      var1.O00000000("glow_esp");
      this.O0000000000OO0();
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      this.O0000000000O00();
   }

   @EventHandler(
      O00000000 = 0
   )
   public void O00000000(O0000000O00O o0000000O00O) {
      this.O0000000000O00();
      if (!O0000O00OO00O.O00000000()) {
         if (o0000000O00O != null
            && o0000000O00O.O0000000000() != null
            && O0000000000.world != null
            && O0000000000.player != null
            && O0000000000.getWindow() != null
            && !O0000000000.getWindow().hasZeroWidthOrHeight()) {
            int var2 = o0000000O00O.O0000000000000();
            int var3 = o0000000O00O.O000000000000O();
            if (var2 > 0 && var3 > 0) {
               this.O00000000(var2, var3, o0000000O00O.O00000000000());
            }
         }
      }
   }

   public void O0000000000O0() {
      if (this.O0000000000000
         && O0000O00OO00O.O00000000()
         && O0000000000.world != null
         && O0000000000.player != null
         && O0000000000.getWindow() != null
         && !O0000000000.getWindow().hasZeroWidthOrHeight()) {
         int var1 = O0000000000.getWindow().getFramebufferWidth();
         int var2 = O0000000000.getWindow().getFramebufferHeight();
         if (var1 > 0 && var2 > 0) {
            this.O00000000(var1, var2, null);
         }
      }
   }

   private void O00000000(int i, int j, RenderManager o0000O00OO0O0) {
      O0000O00OO000 var4 = O0000O00OO000.O00000000();
      int var5 = var4.O00000000000();
      int var6 = var4.O000000000000();
      if (var5 > 0) {
         int var7 = 0;
         int var8 = 0;
         if (this.O000000000OOO.O0000000000() && var6 > 0) {
            var7 = var4.O000000000000O();
            var8 = var4.O00000000000O();
         }

         boolean var9 = var7 > 0 && var8 > 0;
         float var10 = this.O000000000O00O.O0000000000() * 2.0F;
         float var11 = this.O000000000O0O0.O0000000000();
         O0000O0O000O0O.W389 var12 = this.O00000000(i, j, this.O0000000000OO() ? 0.0F : var10, this.O0000000000O0O() ? 0.0F : var11);
         if (var12 != null) {
            O0000O0O000O0O.W389 var13 = var12 == O00000000O0 ? null : var12;
            if (this.O00000000O0000 == null) {
               this.O00000000O0000 = new O0000O0O000O0O();
            }

            if (o0000O00OO0O0 != null) {
               o0000O00OO0O0.O0000000000();
            }

            this.O000000000(this.O00000000O0OO0, this.O00000000O0OOO);
            this.O00000000O0000.O00000000(var5, var6, i, j, this.O00000000(this.O00000000O0OO0, this.O00000000O0OOO), var13, var7, var8, var9 ? 1 : 0);
            if (var9) {
               O00000000(this.O000000000OOO0.O0000000000().getRGB(), this.O00000000OO);
               this.O00000000O0000.O00000000(var5, var6, i, j, this.O00000000(this.O00000000OO, this.O00000000OO), this.O00000000OO000, var7, var8, 2);
            }

            if (o0000O00OO0O0 != null) {
               o0000O00OO0O0.O0000000000();
            }
         }
      }
   }

   private O0000O0O000O0O.W390 O00000000(float[] fs, float[] gs) {
      return new O0000O0O000O0O.W390(
         this.O000000000O00O.O0000000000() * 2.0F,
         this.O000000000O0O0.O0000000000(),
         this.O0000000000OO() ? 0.0F : this.O000000000O0O.O0000000000() * 2.0F,
         this.O0000000000O0O() ? 0.0F : 1.35F,
         this.O000000000O0OO.O0000000000(),
         0,
         this.O000000000OO.O000000000("Статичный") ? 1 : 0,
         0,
         fs[0],
         fs[1],
         fs[2],
         gs[0],
         gs[1],
         gs[2]
      );
   }

   private boolean O00000000(Entity entity) {
      if (!this.O0000000000000 || O0000000000.player == null || entity == null || !entity.isAlive() || entity.isRemoved()) {
         return false;
      } else if (entity.isInvisible() && !this.O000000000O0.O0000000000()) {
         return false;
      } else {
         float var2 = Math.max(1.0F, this.O000000000O00.O0000000000());
         if (O0000000000.player.squaredDistanceTo(entity) > var2 * var2) {
            return false;
         } else if (entity == O0000000000.player) {
            return this.O000000000O.O000000000("Себя");
         } else if (entity instanceof PlayerEntity) {
            return this.O000000000O.O000000000("Игроки");
         } else {
            return entity instanceof ItemEntity
               ? this.O000000000O.O000000000("Предметы")
               : entity instanceof LivingEntity && this.O000000000O.O000000000("Мобы");
         }
      }
   }

   private O0000O0O000O0O.W389 O00000000(int i, int j, float f, float g) {
      this.O00000000OO000 = null;
      this.O00000000OO00 = false;
      if (O0000000000.world != null && O0000000000.gameRenderer != null && i > 0 && j > 0) {
         Camera var5 = O0000000000.gameRenderer.getCamera();
         if (var5 == null) {
            return O00000000O0;
         } else {
            Vec3d var6 = var5.getPos();
            this.O00000000O00OO.set(O0000O000OOOOO.O0000000000);
            this.O00000000O0O.set(O0000O000OOOOO.O00000000).mul(O0000O000OOOOO.O000000000);
            this.O00000000O0O0O[0] = 0;
            this.O00000000O0O0O[1] = 0;
            this.O00000000O0O0O[2] = i;
            this.O00000000O0O0O[3] = j;
            float var7 = O0000000000.getRenderTickCounter().getTickProgress(true);
            boolean var8 = this.O000000000OOO.O0000000000();
            float var9 = Float.POSITIVE_INFINITY;
            float var10 = Float.POSITIVE_INFINITY;
            float var11 = Float.NEGATIVE_INFINITY;
            float var12 = Float.NEGATIVE_INFINITY;
            boolean var13 = false;

            for (Entity var15 : O0000000000.world.getEntities()) {
               if (this.O00000000(var15)) {
                  int var16 = this.O00000000(var15, var7, i, j, var6);
                  if (var16 == 2) {
                     return O00000000O0;
                  }

                  if (var16 != 1) {
                     var9 = Math.min(var9, this.O00000000O0OO[0]);
                     var10 = Math.min(var10, this.O00000000O0OO[1]);
                     var11 = Math.max(var11, this.O00000000O0OO[2]);
                     var12 = Math.max(var12, this.O00000000O0OO[3]);
                     var13 = true;
                     if (var8 && this.O000000000(var15)) {
                        if (this.O00000000OO00) {
                           this.O00000000OO0[0] = Math.min(this.O00000000OO0[0], this.O00000000O0OO[0]);
                           this.O00000000OO0[1] = Math.min(this.O00000000OO0[1], this.O00000000O0OO[1]);
                           this.O00000000OO0[2] = Math.max(this.O00000000OO0[2], this.O00000000O0OO[2]);
                           this.O00000000OO0[3] = Math.max(this.O00000000OO0[3], this.O00000000O0OO[3]);
                        } else {
                           this.O00000000OO0[0] = this.O00000000O0OO[0];
                           this.O00000000OO0[1] = this.O00000000O0OO[1];
                           this.O00000000OO0[2] = this.O00000000O0OO[2];
                           this.O00000000OO0[3] = this.O00000000O0OO[3];
                           this.O00000000OO00 = true;
                        }
                     }
                  }
               }
            }

            if (this.O00000000OO00) {
               this.O00000000OO000 = this.O00000000(this.O00000000OO0, i, j, f, g);
            }

            if (var13 && Float.isFinite(var9) && Float.isFinite(var10) && Float.isFinite(var11) && Float.isFinite(var12)) {
               int var21 = (int)Math.ceil(Math.max(8.0F, f + g * 4.0F + 18.0F));
               int var22 = Math.max(0, (int)Math.floor(var9) - var21);
               int var23 = Math.max(0, (int)Math.floor(var10) - var21);
               int var17 = Math.min(i, (int)Math.ceil(var11) + var21);
               int var18 = Math.min(j, (int)Math.ceil(var12) + var21);
               int var19 = var17 - var22;
               int var20 = var18 - var23;
               return var19 > 2 && var20 > 2 ? new O0000O0O000O0O.W389(var22, var23, var19, var20) : O00000000O0;
            } else {
               return null;
            }
         }
      } else {
         return O00000000O0;
      }
   }

   private int O00000000(Entity entity, float f, int i, int j, Vec3d vec3d) {
      Vec3d var6 = entity.getLerpedPos(f);
      Vec3d var7 = entity.getPos();
      double var8 = var6.x - var7.x;
      double var10 = var6.y - var7.y;
      double var12 = var6.z - var7.z;
      double var14 = entity instanceof ItemEntity ? 0.45 : 0.18;
      double var16 = Math.max(0.1, var14 * 0.65);
      Box var18 = entity.getBoundingBox();
      double var19 = var18.minX + var8 - var14;
      double var21 = var18.maxX + var8 + var14;
      double var23 = var18.minY + var10 - var16;
      double var25 = var18.maxY + var10 + var16;
      double var27 = var18.minZ + var12 - var14;
      double var29 = var18.maxZ + var12 + var14;
      float var31 = Float.POSITIVE_INFINITY;
      float var32 = Float.POSITIVE_INFINITY;
      float var33 = Float.NEGATIVE_INFINITY;
      float var34 = Float.NEGATIVE_INFINITY;

      for (int var35 = 0; var35 < 2; var35++) {
         double var36 = var35 == 0 ? var19 : var21;

         for (int var38 = 0; var38 < 2; var38++) {
            double var39 = var38 == 0 ? var23 : var25;

            for (int var41 = 0; var41 < 2; var41++) {
               double var42 = var41 == 0 ? var27 : var29;
               if (!this.O00000000(var36, var39, var42, vec3d)) {
                  return 2;
               }

               float var44 = this.O00000000O0O00.z;
               if (var44 <= 0.001F || var44 > 1.0F) {
                  return 2;
               }

               float var45 = this.O00000000O0O00.x;
               float var46 = j - this.O00000000O0O00.y;
               var31 = Math.min(var31, var45);
               var32 = Math.min(var32, var46);
               var33 = Math.max(var33, var45);
               var34 = Math.max(var34, var46);
            }
         }
      }

      if (!Float.isFinite(var31) || !Float.isFinite(var32) || !Float.isFinite(var33) || !Float.isFinite(var34)) {
         return 1;
      } else if (!(var33 < 0.0F) && !(var34 < 0.0F) && !(var31 > i) && !(var32 > j)) {
         int var47 = Math.max(0, (int)Math.floor(var31));
         int var48 = Math.max(0, (int)Math.floor(var32));
         int var37 = Math.min(i, (int)Math.ceil(var33));
         int var49 = Math.min(j, (int)Math.ceil(var34));
         if (var37 - var47 > 0 && var49 - var48 > 0) {
            this.O00000000O0OO[0] = var47;
            this.O00000000O0OO[1] = var48;
            this.O00000000O0OO[2] = var37;
            this.O00000000O0OO[3] = var49;
            return 0;
         } else {
            return 1;
         }
      } else {
         return 1;
      }
   }

   private boolean O00000000(double d, double e, double f, Vec3d vec3d) {
      this.O00000000O0O0.set((float)(d - vec3d.x), (float)(e - vec3d.y), (float)(f - vec3d.z), 1.0F).mul(this.O00000000O00OO);
      this.O00000000O0O.project(this.O00000000O0O0.x(), this.O00000000O0O0.y(), this.O00000000O0O0.z(), this.O00000000O0O0O, this.O00000000O0O00);
      return Float.isFinite(this.O00000000O0O00.x) && Float.isFinite(this.O00000000O0O00.y) && Float.isFinite(this.O00000000O0O00.z);
   }

   private void O0000000000O00() {
      O0000O00OO000 var1 = O0000O00OO000.O00000000();
      var1.O00000000("glow_esp", this.O0000000000000, this.O00000000O00);
      boolean var2 = this.O0000000000000 && this.O000000000OOO.O0000000000() && !FriendCommand.O00000000000().isEmpty();
      var1.O000000000("glow_esp_friends", var2, this.O00000000O000);
   }

   private boolean O0000000000O0O() {
      return this.O000000000O000.O000000000("Свечение");
   }

   private boolean O0000000000OO() {
      return this.O000000000O000.O000000000("Контур");
   }

   private boolean O000000000(Entity entity) {
      if (entity instanceof PlayerEntity var2 && entity != O0000000000.player) {
         String var3 = var2.getGameProfile() != null ? var2.getGameProfile().getName() : var2.getName().getString();
         return FriendCommand.O00000000(var3);
      } else {
         return false;
      }
   }

   private O0000O0O000O0O.W389 O00000000(float[] fs, int i, int j, float f, float g) {
      int var6 = (int)Math.ceil(Math.max(8.0F, f + g * 4.0F + 18.0F));
      int var7 = Math.max(0, (int)Math.floor(fs[0]) - var6);
      int var8 = Math.max(0, (int)Math.floor(fs[1]) - var6);
      int var9 = Math.min(i, (int)Math.ceil(fs[2]) + var6);
      int var10 = Math.min(j, (int)Math.ceil(fs[3]) + var6);
      int var11 = var9 - var7;
      int var12 = var10 - var8;
      return var11 > 2 && var12 > 2 ? new O0000O0O000O0O.W389(var7, var8, var11, var12) : null;
   }

   private void O000000000(float[] fs, float[] gs) {
      if (this.O000000000OO0.O000000000("Свой")) {
         O00000000(this.O000000000OO00.O0000000000().getRGB(), fs);
         O00000000(this.O000000000OO0O.O0000000000().getRGB(), gs);
      } else {
         Theme var3 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.WILD;
         ColorScheme var4 = ColorScheme.O00000000(var3, O00000OOOO00O0.O00000000000());
         O00000000(var4.O000000000O0(), fs);
         O00000000(var4.O000000000O00(), gs);
      }
   }

   private static void O00000000(int i, float[] fs) {
      fs[0] = (i >> 16 & 0xFF) / 255.0F;
      fs[1] = (i >> 8 & 0xFF) / 255.0F;
      fs[2] = (i & 0xFF) / 255.0F;
   }

   private void O0000000000OO0() {
      O0000O0O000O0O var1 = this.O00000000O0000;
      this.O00000000O0000 = null;
      if (var1 != null) {
         if (RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L) {
            var1.close();
         } else {
            if (O0000000000 != null) {
               O0000000000.execute(var1::close);
            }
         }
      }
   }
}
