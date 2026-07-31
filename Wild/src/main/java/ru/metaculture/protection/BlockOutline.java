package ru.metaculture.protection;

import net.minecraft.block.BlockState;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "BlockOutline",
   O0000000000 = Category.Visuals,
   O000000000 = "Плавная светящаяся обводка блока под прицелом"
)
public final class BlockOutline extends Module implements O000000O00000 {
   private static final double O00000000O = 0.0022;
   private static final int[] O00000000O0 = new int[]{0, 1, 1, 5, 5, 4, 4, 0, 2, 3, 3, 7, 7, 6, 6, 2, 0, 2, 1, 3, 5, 7, 4, 6};
   private static final int[] O00000000O00 = new int[]{0, 1, 5, 4, 2, 6, 7, 3, 0, 4, 6, 2, 1, 3, 7, 5, 0, 2, 3, 1, 4, 5, 7, 6};
   public final NumberSetting O000000000O = new NumberSetting("Плавность", 0.55F, 0.0F, 1.0F, 0.01F, true);
   public final NumberSetting O000000000O0 = new NumberSetting("Прозрачность", 1.0F, 0.05F, 1.0F, 0.01F, true);
   public final NumberSetting O000000000O00 = new NumberSetting("Толщина", 2.0F, 0.5F, 6.0F, 0.1F, false);
   public final NumberSetting O000000000O000 = new NumberSetting("Расширение", 0.0F, 0.0F, 0.2F, 0.005F, false);
   public final BooleanSetting O000000000O00O = new BooleanSetting("Свечение", true);
   public final NumberSetting O000000000O0O = new NumberSetting("Сила свечения", 1.2F, 0.2F, 3.0F, 0.05F, false)
      .O00000000(() -> !this.O000000000O00O.O0000000000());
   public final BooleanSetting O000000000O0O0 = new BooleanSetting("Заливка", false);
   public final NumberSetting O000000000O0OO = new NumberSetting("Прозрачность заливки", 0.22F, 0.02F, 0.8F, 0.01F, true)
      .O00000000(() -> !this.O000000000O0O0.O0000000000());
   public final BooleanSetting O000000000OO = new BooleanSetting("Пульсация", false);
   public final NumberSetting O000000000OO0 = new NumberSetting("Скорость пульсации", 2.0F, 0.2F, 6.0F, 0.1F, false)
      .O00000000(() -> !this.O000000000OO.O0000000000());
   public final BooleanSetting O000000000OO00 = new BooleanSetting("Сквозь стены", false);
   public final ModeSetting O000000000OO0O = new ModeSetting("Цвет", "Тема", "Тема", "Свой", "Радуга");
   public final ColorSetting O000000000OOO = new ColorSetting("Свой цвет", 50.0F, 0.82F, 1.0F).O000000000(() -> !this.O000000000OO0O.O000000000("Свой"));
   public final NumberSetting O000000000OOO0 = new NumberSetting("Скорость радуги", 1.0F, 0.1F, 4.0F, 0.1F, false)
      .O00000000(() -> !this.O000000000OO0O.O000000000("Радуга"));
   public final O000000O00 O000000000OOOO = new O000000O00("Foundry Shader", O00000OOOO00O.ESP);
   private final double[] O00000000O000 = new double[6];
   private final double[] O00000000O0000 = new double[6];
   private final double[] O00000000O000O = new double[24];
   private boolean O00000000O00O;
   private float O00000000O00O0;
   private long O00000000O00OO;

   public BlockOutline() {
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
            this.O000000000OOO0,
            this.O000000000OOOO
         }
      );
   }

   @Override
   public void O00000000() {
      super.O00000000();
      O000000O000000.O00000000().O00000000(this, this);
   }

   @Override
   public void O000000000() {
      O000000O000000.O00000000().O00000000(this);
      this.O0000000000OO0();
      super.O000000000();
   }

   @Override
   public O00000OOOO00O O0000000000() {
      return O00000OOOO00O.ESP;
   }

   @Override
   public String O00000000000() {
      String var1 = this.O000000000OOOO == null ? "" : this.O000000000OOOO.O0000000000O0();
      return var1 != null && !var1.isBlank() ? var1 : null;
   }

   @Override
   public boolean O000000000000() {
      return true;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      O000000O000000.O00000000().O000000000(this, this);
      if (O0000000000.world != null && O0000000000.player != null && O0000000000.gameRenderer != null) {
         boolean var2 = this.O0000000000O0();
         float var3 = this.O0000000000(var2);
         if (this.O00000000O00O && !(var3 <= 0.003F)) {
            Camera var4 = O0000000000.gameRenderer.getCamera();
            if (var4 != null) {
               Vec3d var5 = var4.getPos();
               Matrix4f var6 = o0000000OO0000.O0000000000().peek().getPositionMatrix();
               this.O00000000(var5);
               float var7 = this.O000000000OO.O0000000000()
                  ? 0.78F + 0.22F * (float)Math.sin(O0000000000OO() * this.O000000000OO0.O0000000000() * Math.PI)
                  : 1.0F;
               float var8 = MathHelper.clamp(var3 * this.O000000000O0.O0000000000() * var7, 0.0F, 1.0F);
               if (!(var8 <= 0.003F)) {
                  int var9 = this.O0000000000O00();
                  int var10 = var9 >> 16 & 0xFF;
                  int var11 = var9 >> 8 & 0xFF;
                  int var12 = var9 & 0xFF;
                  boolean var13 = !this.O000000000OO00.O0000000000();
                  float var14 = this.O000000000O00.O0000000000();
                  Immediate var15 = O0000O00O0O00.O00000000();
                  boolean var20 = false /* VF: Semaphore variable */;

                  try {
                     var20 = true;
                     if (this.O000000000O0O0.O0000000000()) {
                        int var16 = O00000000(this.O000000000O0OO.O0000000000() * var8 * 255.0F);
                        if (var16 > 0) {
                           RenderLayer var17 = var13 ? O0000O0O0O.O00000000000() : O0000O0O0O.O000000000000();
                           this.O000000000(var15.getBuffer(var17), var6, var10, var11, var12, var16);
                        }
                     }

                     if (this.O000000000O00O.O0000000000()) {
                        float var22 = var14 * (2.4F + this.O000000000O0O.O0000000000());
                        int var24 = O00000000(0.16F * this.O000000000O0O.O0000000000() * var8 * 255.0F);
                        if (var24 > 0) {
                           this.O00000000(var15.getBuffer(O00000000(var22, var13)), var6, var10, var11, var12, var24);
                        }
                     }

                     int var23 = O00000000(var8 * 255.0F);
                     this.O00000000(var15.getBuffer(O00000000(var14, var13)), var6, var10, var11, var12, var23);
                     var20 = false;
                  } finally {
                     if (var20) {
                        O0000O00O0O00.O000000000();
                     }
                  }

                  O0000O00O0O00.O000000000();
               }
            }
         }
      } else {
         this.O0000000000OO0();
      }
   }

   private boolean O0000000000O0() {
      HitResult var1 = O0000000000.crosshairTarget;
      if (var1 instanceof BlockHitResult var2 && var1.getType() == Type.BLOCK) {
         BlockPos var3 = var2.getBlockPos();
         if (var3 == null) {
            return false;
         } else {
            BlockState var4 = O0000000000.world.getBlockState(var3);
            if (var4 != null && !var4.isAir()) {
               VoxelShape var5 = var4.getOutlineShape(O0000000000.world, var3);
               if (var5 != null && !var5.isEmpty()) {
                  Box var6 = var5.getBoundingBox();
                  double var7 = this.O000000000O000.O0000000000() + 0.0022;
                  this.O00000000O0000[0] = var3.getX() + var6.minX - var7;
                  this.O00000000O0000[1] = var3.getY() + var6.minY - var7;
                  this.O00000000O0000[2] = var3.getZ() + var6.minZ - var7;
                  this.O00000000O0000[3] = var3.getX() + var6.maxX + var7;
                  this.O00000000O0000[4] = var3.getY() + var6.maxY + var7;
                  this.O00000000O0000[5] = var3.getZ() + var6.maxZ + var7;
                  return true;
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private float O0000000000(boolean bl) {
      long var2 = System.nanoTime();
      float var4 = this.O00000000O00OO == 0L ? 0.0F : Math.min((float)(var2 - this.O00000000O00OO) / 1.0E9F, 0.1F);
      this.O00000000O00OO = var2;
      this.O00000000O00O0 = this.O00000000O00O0 + ((bl ? 1.0F : 0.0F) - this.O00000000O00O0) * O00000000(16.0F, var4);
      if (!bl && this.O00000000O00O0 < 0.01F) {
         this.O00000000O00O0 = 0.0F;
         this.O00000000O00O = false;
         return 0.0F;
      } else if (!bl) {
         return this.O00000000O00O0;
      } else {
         if (!this.O00000000O00O) {
            System.arraycopy(this.O00000000O0000, 0, this.O00000000O000, 0, 6);
            this.O00000000O00O = true;
         } else {
            float var5 = MathHelper.lerp(MathHelper.clamp(this.O000000000O.O0000000000(), 0.0F, 1.0F), 42.0F, 4.5F);
            float var6 = O00000000(var5, var4);

            for (int var7 = 0; var7 < 6; var7++) {
               this.O00000000O000[var7] = this.O00000000O000[var7] + (this.O00000000O0000[var7] - this.O00000000O000[var7]) * var6;
            }
         }

         return this.O00000000O00O0;
      }
   }

   private void O00000000(Vec3d vec3d) {
      double var2 = this.O00000000O000[0] - vec3d.x;
      double var4 = this.O00000000O000[1] - vec3d.y;
      double var6 = this.O00000000O000[2] - vec3d.z;
      double var8 = this.O00000000O000[3] - vec3d.x;
      double var10 = this.O00000000O000[4] - vec3d.y;
      double var12 = this.O00000000O000[5] - vec3d.z;

      for (int var14 = 0; var14 < 8; var14++) {
         int var15 = var14 * 3;
         this.O00000000O000O[var15] = (var14 & 1) == 0 ? var2 : var8;
         this.O00000000O000O[var15 + 1] = (var14 & 2) == 0 ? var4 : var10;
         this.O00000000O000O[var15 + 2] = (var14 & 4) == 0 ? var6 : var12;
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, int i, int j, int k, int l) {
      for (byte var7 = 0; var7 < O00000000O0.length; var7 += 2) {
         int var8 = O00000000O0[var7] * 3;
         int var9 = O00000000O0[var7 + 1] * 3;
         double var10 = this.O00000000O000O[var8];
         double var12 = this.O00000000O000O[var8 + 1];
         double var14 = this.O00000000O000O[var8 + 2];
         double var16 = this.O00000000O000O[var9];
         double var18 = this.O00000000O000O[var9 + 1];
         double var20 = this.O00000000O000O[var9 + 2];
         double var22 = var16 - var10;
         double var24 = var18 - var12;
         double var26 = var20 - var14;
         double var28 = Math.sqrt(var22 * var22 + var24 * var24 + var26 * var26);
         if (!(var28 < 1.0E-6)) {
            float var30 = (float)(var22 / var28);
            float var31 = (float)(var24 / var28);
            float var32 = (float)(var26 / var28);
            vertexConsumer.vertex(matrix4f, (float)var10, (float)var12, (float)var14).color(i, j, k, l).normal(var30, var31, var32);
            vertexConsumer.vertex(matrix4f, (float)var16, (float)var18, (float)var20).color(i, j, k, l).normal(var30, var31, var32);
         }
      }
   }

   private void O000000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, int i, int j, int k, int l) {
      for (byte var7 = 0; var7 < O00000000O00.length; var7 += 4) {
         for (int var8 = 0; var8 < 4; var8++) {
            int var9 = O00000000O00[var7 + var8] * 3;
            vertexConsumer.vertex(matrix4f, (float)this.O00000000O000O[var9], (float)this.O00000000O000O[var9 + 1], (float)this.O00000000O000O[var9 + 2])
               .color(i, j, k, l);
         }
      }
   }

   private static RenderLayer O00000000(double d, boolean bl) {
      return bl ? O0000O0O0O.O00000000(d) : O0000O0O0O.O000000000(d);
   }

   private int O0000000000O00() {
      if (this.O000000000OO0O.O000000000("Радуга")) {
         float var1 = O0000000000OO() * this.O000000000OOO0.O0000000000() * 0.12F % 1.0F;
         return O00000000(var1 < 0.0F ? var1 + 1.0F : var1, 0.85F, 1.0F);
      } else {
         return this.O000000000OO0O.O000000000("Свой") ? this.O000000000OOO.O00000000000O() & 16777215 : O0000000000O0O();
      }
   }

   private static int O0000000000O0O() {
      try {
         if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null) {
            Theme var0 = WildClient.O00000000.O0000000000O.O000000000();
            if (var0 == Theme.CUSTOM && WildClient.O00000000.O0000000000O.O000000000 != null) {
               return WildClient.O00000000.O0000000000O.O000000000.O00000000000O() & 16777215;
            }

            if (var0 != null && var0.O00000000() != null) {
               return var0.O00000000().getRGB() & 16777215;
            }
         }
      } catch (Throwable var1) {
      }

      return 6061311;
   }

   private static int O00000000(float f, float g, float h) {
      float var3 = (float)Math.floor(f * 6.0F);
      float var4 = f * 6.0F - var3;
      float var5 = h * (1.0F - g);
      float var6 = h * (1.0F - var4 * g);
      float var7 = h * (1.0F - (1.0F - var4) * g);
      float var8;
      float var9;
      float var10;
      switch ((int)var3 % 6) {
         case 0:
            var8 = h;
            var9 = var7;
            var10 = var5;
            break;
         case 1:
            var8 = var6;
            var9 = h;
            var10 = var5;
            break;
         case 2:
            var8 = var5;
            var9 = h;
            var10 = var7;
            break;
         case 3:
            var8 = var5;
            var9 = var6;
            var10 = h;
            break;
         case 4:
            var8 = var7;
            var9 = var5;
            var10 = h;
            break;
         default:
            var8 = h;
            var9 = var5;
            var10 = var6;
      }

      return Math.round(var8 * 255.0F) << 16 | Math.round(var9 * 255.0F) << 8 | Math.round(var10 * 255.0F);
   }

   private static int O00000000(float f) {
      return MathHelper.clamp(Math.round(f), 0, 255);
   }

   private static float O00000000(float f, float g) {
      return 1.0F - (float)Math.exp(-f * g);
   }

   private static float O0000000000OO() {
      return (float)(System.nanoTime() % 1000000000000L) / 1.0E9F;
   }

   private void O0000000000OO0() {
      this.O00000000O00O = false;
      this.O00000000O00O0 = 0.0F;
      this.O00000000O00OO = 0L;
   }
}
