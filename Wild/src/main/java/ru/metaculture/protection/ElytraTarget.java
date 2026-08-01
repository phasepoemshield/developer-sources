package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.util.OptionalDouble;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.RenderPhase.LineWidth;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleAccess(
   O0000000000 = {"lichoday"}
)
@ModuleRegister(
   O00000000 = "ElytraTarget",
   O000000000 = "Преследует таргета на элитре",
   O0000000000 = Category.Combat,
   O00000000000 = {O0000000OO0OOO.RISKY}
)
public class ElytraTarget extends Module {
   public final BooleanSetting O000000000O = new BooleanSetting("Перегонять", true);
   public final ModeSetting O000000000O0 = new ModeSetting("Режим предикта", "ReallyWorld", "ReallyWorld", "ReallyWorld - 2", "Default");
   public final NumberSetting O000000000O00 = new NumberSetting("Сила предикта", 2.7F, 1.0F, 5.0F, 0.1F, false);
   public static final NumberSetting O000000000O000 = new NumberSetting("Радиус обнаружения элитры", 20.0F, 5.0F, 60.0F, 1.0F, false)
      .O00000000(() -> !O0000000000O0());
   public final NumberSetting O000000000O00O = new NumberSetting("Растояние преследования", 30.0F, 10.0F, 100.0F, 5.0F, false);
   public final BooleanSetting O000000000O0O = new BooleanSetting("Разворот на 180", false);
   public final BooleanSetting O000000000O0O0 = new BooleanSetting("Рисовать предикт", true);
   public final NumberSetting O000000000O0OO = new NumberSetting("Прозрачность", 40.0F, 0.0F, 255.0F, 1.0F, false)
      .O00000000(() -> !this.O000000000O0O0.O0000000000());
   public final BooleanSetting O000000000OO = new BooleanSetting("От темы", true).O00000000(() -> !this.O000000000O0O0.O0000000000());
   public final ModeSetting O000000000OO0 = new ModeSetting("Вид квадрата", "Обычный", "Обычный", "Пунктир", "Диагонали")
      .O00000000(() -> !this.O000000000O0O0.O0000000000());
   private static final double O000000000OO00 = 0.35;
   private static final float O000000000OO0O = 2.5F;
   private Vec3d O000000000OOO = null;
   private boolean O000000000OOO0 = false;
   private LivingEntity O000000000OOOO = null;
   private static final int O00000000O = 2048;
   private static final RenderPipeline O00000000O0 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("minecraft", "rendertype_lequal_depth_test"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderPipeline O00000000O00 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("minecraft", "rendertype_lines"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.DEBUG_LINES)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O00000000O000 = RenderLayer.of(
      "elytra_target_fill", 2048, false, true, O00000000O0, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O00000000O0000 = RenderLayer.of(
      "elytra_target_line", 2048, false, true, O00000000O00, MultiPhaseParameters.builder().lineWidth(new LineWidth(OptionalDouble.of(2.0))).build(false)
   );

   public ElytraTarget() {
      this.O00000000(
         new Setting[]{
            this.O000000000O,
            this.O000000000O0,
            this.O000000000O00,
            O000000000O000,
            this.O000000000O00O,
            this.O000000000O0O,
            this.O000000000O0O0,
            this.O000000000O0OO,
            this.O000000000OO,
            this.O000000000OO0
         }
      );
   }

   public static boolean O0000000000O0() {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         ElytraTarget var0 = WildClient.O00000000.O000000000.O00000000(ElytraTarget.class);
         return var0 != null && var0.O0000000000000;
      } else {
         return false;
      }
   }

   @Override
   public void O000000000() {
      this.O000000000OOO = null;
      this.O000000000OOO0 = false;
      this.O000000000OOOO = null;
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      this.O000000000OOO = null;
      if (!O0000O00O00O0.O00000000() && O0000000000.player != null && O0000000000.world != null) {
         if (this.O000000000O.O0000000000() && O0000000000.player.isGliding()) {
            LivingEntity var2 = this.O0000000000O00();
            if (var2 == null) {
               this.O000000000OOO0 = false;
            } else {
               float var3 = O0000000000.player.distanceTo(var2);
               Vec3d var4 = this.O000000000(var2);
               this.O000000000OOO = var4;
               Vec3d var5 = var4.subtract(O0000000000.player.getEyePos());
               if (!(var5.lengthSquared() < 1.0E-7)) {
                  float var6 = (float)Math.toDegrees(Math.atan2(-var5.x, var5.z));
                  float var7 = (float)MathHelper.clamp(-Math.toDegrees(Math.atan2(var5.y, Math.hypot(var5.x, var5.z))), -90.0, 90.0);
                  if (this.O00000000(var3)) {
                     var6 = MathHelper.wrapDegrees(var6 + 180.0F);
                  }

                  O000000O0O0O0.O00000000(new O000000O0O00OO(var6, var7), 32.0F, 32.0F, 360.0F, 360.0F, 0, 12, true);
               }
            }
         } else {
            this.O000000000OOO0 = false;
            this.O000000000OOOO = null;
         }
      }
   }

   private LivingEntity O0000000000O00() {
      float var1 = O000000000O000.O0000000000();
      float var2 = Math.max(this.O000000000O00O.O0000000000(), var1);
      if (this.O00000000(this.O000000000OOOO) && O0000000000.player.distanceTo(this.O000000000OOOO) <= var2) {
         return this.O000000000OOOO;
      } else {
         this.O000000000OOOO = null;
         LivingEntity var3 = AttackAura.O00000000OO0;
         if (this.O00000000(var3) && O0000000000.player.distanceTo(var3) <= var2) {
            this.O000000000OOOO = var3;
            return this.O000000000OOOO;
         } else {
            LivingEntity var4 = null;
            double var5 = var1 * var1;

            for (Entity var8 : O0000000000.world.getEntities()) {
               if (var8 instanceof LivingEntity var9 && this.O00000000(var9)) {
                  double var10 = O0000000000.player.squaredDistanceTo(var9);
                  if (var10 <= var5) {
                     var5 = var10;
                     var4 = var9;
                  }
               }
            }

            this.O000000000OOOO = var4;
            return var4;
         }
      }
   }

   private boolean O00000000(LivingEntity livingEntity) {
      return livingEntity != null
         && livingEntity.isAlive()
         && livingEntity != O0000000000.player
         && !(livingEntity instanceof ClientPlayerEntity)
         && livingEntity.isGliding();
   }

   private Vec3d O000000000(LivingEntity livingEntity) {
      Vec3d var2 = livingEntity.getPos().add(0.0, livingEntity.getHeight() * 0.5, 0.0);
      Vec3d var3 = livingEntity.getVelocity();
      double var4 = this.O000000000O00.O0000000000();
      if (this.O000000000O0.O000000000("Default")) {
         return var2;
      } else if (this.O000000000O0.O000000000("ReallyWorld - 2")) {
         Vec3d var6 = livingEntity.getRotationVector().normalize().multiply(2.0);
         return var2.add(var6).add(var3.multiply(var4));
      } else {
         return var2.add(var3.multiply(var4));
      }
   }

   private boolean O00000000(float f) {
      if (!this.O000000000O0O.O0000000000()) {
         this.O000000000OOO0 = false;
         return false;
      } else {
         float var2 = Math.max(2.5F, this.O000000000O00.O0000000000());
         float var3 = var2 + 3.0F;
         if (!this.O000000000OOO0 && f <= 2.5F) {
            this.O000000000OOO0 = true;
         }

         if (this.O000000000OOO0 && f >= var3) {
            this.O000000000OOO0 = false;
         }

         return this.O000000000OOO0;
      }
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      if (this.O000000000O0O0.O0000000000() && this.O000000000OOO != null && O0000000000.world != null) {
         Vec3d var2 = O0000000000.gameRenderer.getCamera().getPos();
         double var3 = this.O000000000OOO.x - 0.35 - var2.x;
         double var5 = this.O000000000OOO.y - 0.35 - var2.y;
         double var7 = this.O000000000OOO.z - 0.35 - var2.z;
         double var9 = this.O000000000OOO.x + 0.35 - var2.x;
         double var11 = this.O000000000OOO.y + 0.35 - var2.y;
         double var13 = this.O000000000OOO.z + 0.35 - var2.z;
         int var15 = this.O000000000OO.O0000000000() ? O0000O000OO000.O00000000() : O0000O000OO000.O0000000000(255, 255, 255, 255);
         int[] var16 = new int[]{var15, var15, var15, var15};
         int var17 = (int)this.O000000000O0OO.O0000000000();
         boolean var18 = this.O000000000OO0.O000000000("Диагонали");
         double var19 = this.O000000000OO0.O000000000("Пунктир") ? 0.12 : 0.5;
         double var21 = this.O000000000OO0.O000000000("Пунктир") ? 0.1 : 0.0;
         Immediate var23 = O0000O00O0O00.O00000000();

         try {
            MatrixStack var24 = o0000000OO0000.O0000000000();
            Matrix4f var25 = var24.peek().getPositionMatrix();
            if (var17 > 0) {
               VertexConsumer var26 = var23.getBuffer(O00000000O000);
               O0000O0O0O0.O00000000(var26, var25, var3, var5, var7, var9, var11, var13, var16, var17);
            }

            VertexConsumer var30 = var23.getBuffer(O00000000O0000);
            O0000O0O0O0.O00000000(var30, var25, var3, var5, var7, var9, var11, var13, var16, 255, var19, var21);
            if (var18) {
               this.O00000000(var30, var25, var15, var3, var5, var7, var9, var11, var13);
            }
         } finally {
            O0000O00O0O00.O000000000();
         }
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, int i, double d, double e, double f, double g, double h, double j) {
      int var16 = i >> 16 & 0xFF;
      int var17 = i >> 8 & 0xFF;
      int var18 = i & 0xFF;
      short var19 = 255;
      double[][] var20 = new double[][]{{d, e, f, g, h, j}, {g, e, f, d, h, j}, {d, e, j, g, h, f}, {g, e, j, d, h, f}};

      for (double[] var24 : var20) {
         vertexConsumer.vertex(matrix4f, (float)var24[0], (float)var24[1], (float)var24[2]).color(var16, var17, var18, var19);
         vertexConsumer.vertex(matrix4f, (float)var24[3], (float)var24[4], (float)var24[5]).color(var16, var17, var18, var19);
      }
   }
}
