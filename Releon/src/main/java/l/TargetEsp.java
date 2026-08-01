package l;

import com.mojang.blaze3d.systems.RenderSystem;
import fat.releon.Releon;
import fat.releon.teremok.impl.combat.Aura;
import fat.releon.teremok.impl.combat.TriggerBot;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;

public class TargetEsp extends Helper242 {
   private static TargetEsp instance;
   private static final Identifier CHAIN_TEXTURE = Identifier.of("textures/teremok/targetesp/chain.png");
   private static final Identifier GLOW_TEXTURE = Identifier.of("textures/particles/glow.png");
   public LivingEntity lastTarget;
   private Helper467 esp_anim = new Animation2().method5003(400).method5004(1.0);
   private Setting5 targetEspType = new Setting5("Отображения таргета", "Выбирает тип цели esp")
      .method2381("Cube", "Circle", "Ghosts", "Crystals")
      .method2383("Circle");
   private Setting5 cubeType = new Setting5("Картинка для куба", "Выбирает тип куба")
      .method2381("1", "2")
      .method2382(() -> this.targetEspType.method2385("Cube"));
   public Setting7 colorSetting = new Setting7("Цвет", "Выберите цвет для esp").method2555(new Color(255, 101, 57, 255).getRGB());
   public Setting3 damageRed = new Setting3("Краснеть при ударе", "Красит TargetESP в красный при ударе").method2201(true);
   private Setting5 CircleType = new Setting5("Тип круга", "Выбирает режим круга")
      .method2381("1", "2", "3", "4")
      .method2382(() -> this.targetEspType.method2385("Circle"));
   private Setting5 GhostType = new Setting5("Тип призраков", "Выбирает режим призраков")
      .method2381("1", "2", "3")
      .method2382(() -> this.targetEspType.method2385("Ghosts"));
   public static final CopyOnWriteArrayList<Helper243> targetPositionHistory = new CopyOnWriteArrayList<>();
   private final long spiritsStartTime = System.currentTimeMillis();
   private long spiritsFrameTime = System.nanoTime();
   private float spiritsHurtOffset = 0.0F;
   private float spiritsTrackTime = 0.0F;
   private long lastSpiritsTrackTime = System.currentTimeMillis();
   private static final int GHOST_TRAIL_STEPS = 4;
   private Entity lastRenderedTarget = null;
   private final List<Helper244> crystalList = new ArrayList<>();
   private float rotationAngle = 0.0F;

   public static TargetEsp method2330() {
      if (instance != null) {
         return instance;
      } else {
         return Releon.method71() != null && Releon.method71().method25() != null ? Helper222.method1979(TargetEsp.class) : null;
      }
   }

   public TargetEsp() {
      super("TargetEsp", "Target Esp", Helper269.RENDER);
      instance = this;
      this.setup(new Helper264[]{this.targetEspType, this.cubeType, this.CircleType, this.GhostType, this.colorSetting, this.damageRed});
   }

   public int method2331(float var1) {
      int var2 = this.colorSetting.method2553();
      return this.damageRed.method2200() ? Helper133.method1123(var2, new Color(255, 0, 0, 255).getRGB(), var1) : var2;
   }

   public int method2332(float var1, float var2) {
      return Helper133.method1108(this.method2331(var1), var2);
   }

   public void method2333() {
      this.lastTarget = null;
      this.lastRenderedTarget = null;
      targetPositionHistory.clear();
      this.crystalList.clear();
      this.esp_anim.method4997(Helper450.BACKWARDS);
   }

   @Helper104
   public void onRotationUpdate(Event28 var1) {
      if (var1.method4225() == 2) {
         Helper183.method1561();
      }
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      float var2 = var1.method3709();
      LivingEntity var3 = null;
      LivingEntity var4 = null;
      if (Aura.getInstance().isState()) {
         var3 = Aura.getInstance().getTarget();
         var4 = Aura.getInstance().getLastTarget();
      } else if (TriggerBot.getInstance().isState()) {
         var3 = TriggerBot.getInstance().target;
         var4 = TriggerBot.getInstance().target;
      }

      this.lastTarget = var4;
      if (var3 != null) {
         Vec3d var5 = new Vec3d(
            MathHelper.lerp((double)var2, var3.prevX, var3.getX()),
            MathHelper.lerp((double)var2, var3.prevY, var3.getY()),
            MathHelper.lerp((double)var2, var3.prevZ, var3.getZ())
         );
         long var6 = System.currentTimeMillis();
         if (targetPositionHistory.isEmpty() || var5.distanceTo(targetPositionHistory.get(0).position) > 0.05) {
            targetPositionHistory.add(0, new Helper243(var5));
         }

         targetPositionHistory.removeIf(var2x -> var6 - var2x.timestamp > 1000L);

         while (targetPositionHistory.size() > 200) {
            targetPositionHistory.remove(targetPositionHistory.size() - 1);
         }
      } else if (!targetPositionHistory.isEmpty()) {
         targetPositionHistory.clear();
      }

      Helper331 var13 = Releon.method71().method33().method3250();
      Helper339 var14 = var13.method3288();
      this.esp_anim.method4997(var3 != null ? Helper450.FORWARDS : Helper450.BACKWARDS);
      float var7 = this.esp_anim.method5000().floatValue();
      if (var4 != null && !this.esp_anim.method4995(Helper450.BACKWARDS)) {
         float var8 = MathHelper.clamp((var4.hurtTime - tickCounter.getTickDelta(false)) / 10.0F, 0.0F, 1.0F);
         String var9 = this.targetEspType.method2386();
         switch (var9) {
            case "Cube":
               Helper183.method1554(var4, var7, var8, this.cubeType.method2386());
               break;
            case "Circle":
               Helper183.method1555(var1.method3708(), var4, var7, var8, this.CircleType.method2386());
               break;
            case "Ghosts":
               String var11 = this.GhostType.method2386();
               switch (var11) {
                  case "1":
                     this.method2338(var1, var4, var7, var8);
                     return;
                  case "2":
                     this.method2334(var1, var4, var7, var8);
                     return;
                  case "3":
                     this.method2336(var1, var4, var7, var8);
                     return;
                  default:
                     return;
               }
            case "Crystals":
               if (this.crystalList.isEmpty() || var4 != this.lastRenderedTarget) {
                  this.method2345(var4);
                  this.lastRenderedTarget = var4;
               }

               this.method2346(var1.method3708(), var4, var7, var8);
         }
      }
   }

   private void method2334(Event10 var1, LivingEntity var2, float var3, float var4) {
      MatrixStack var5 = var1.method3708();
      double var6 = MathHelper.lerp((double)var1.method3709(), var2.prevX, var2.getX());
      double var8 = MathHelper.lerp((double)var1.method3709(), var2.prevY, var2.getY()) + var2.getHeight() / 2.0;
      double var10 = MathHelper.lerp((double)var1.method3709(), var2.prevZ, var2.getZ());
      float var12 = -0.15F * var3 + 0.65F;
      long var13 = (long)((float)(System.currentTimeMillis() - this.spiritsStartTime) / 4.0F);
      var5.push();
      var5.translate(var6, var8, var10);
      var5.scale(1.5F, 1.5F, 1.5F);
      this.method2341();
      BufferBuilder var15 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);

      for (int var16 = 0; var16 < 4; var16++) {
         for (int var17 = 0; var17 < 14; var17++) {
            for (int var18 = 4; var18 >= 1; var18--) {
               float var19 = 1.0F - var18 / 5.0F;
               this.method2335(var5, var15, var16, var17, var3, var4, var12, var13 - var18 * 4L, var19 * 0.35F, 0.92F);
            }

            this.method2335(var5, var15, var16, var17, var3, var4, var12, var13, 1.0F, 1.0F);
         }
      }

      BufferRenderer.drawWithGlobalProgram(var15.end());
      this.method2342();
      var5.pop();
   }

   private void method2335(MatrixStack var1, BufferBuilder var2, int var3, int var4, float var5, float var6, float var7, long var8, float var10, float var11) {
      var1.push();
      float var12 = var4 / 13.0F;
      float var13 = (0.35F * (1.0F - var12) + 0.2F * var12) * var5 * var11;
      double var14 = 0.2F * ((float)var8 - var4 * 7.0F) / 15.0F;
      boolean var16 = var12 < 0.5F;
      float var17 = var16 ? var12 * 2.0F : (1.0F - var12) * 2.0F;
      double var18 = Math.sin(var17 * Math.PI) * 2.0;
      Random var20 = new Random(var4 * 12345L);
      double var21 = (var20.nextDouble() - 0.5) * var18;
      double var23 = (var20.nextDouble() - 0.5) * var18;
      double var25 = (var20.nextDouble() - 0.5) * var18;
      double var27 = var21 * var5 - var21;
      double var29 = var23 * var5 - var23;
      double var31 = var25 * var5 - var25;
      double var33 = -Math.sin(var14) * var7;
      double var35 = -Math.cos(var14) * var7;
      switch (var3) {
         case 0:
            var29 += var4 * 0.02;
            var1.translate(var33 + var27, var35 + var29, -var35 + var31);
            break;
         case 1:
            var29 -= var4 * 0.02;
            var1.translate(-var33 + var27, var33 + var29, -var35 + var31);
            break;
         case 2:
            var29 -= var4 * 0.02;
            var1.translate(-var33 + var27, -var33 + var29, var35 + var31);
            break;
         case 3:
            var29 += Math.cos(var14) * 0.12;
            var1.translate(var35 + var27, var33 * 0.5 + var29, var33 + var31);
      }

      var1.multiply(mc.gameRenderer.getCamera().getRotation());
      Matrix4f var37 = var1.peek().getPositionMatrix();
      this.method2343(var2, var37, var13 * 0.5F, this.method2344(var6, 600.0F * var5 * var10));
      int var38 = MathHelper.clamp((int)(255.0F * var5 * (1.0F - var12) * var10), 0, 255);
      this.method2343(var2, var37, var13 * 0.3F, new Color(255, 255, 255, var38).getRGB());
      var1.pop();
   }

   private void method2336(Event10 var1, LivingEntity var2, float var3, float var4) {
      MatrixStack var5 = var1.method3708();
      double var6 = MathHelper.lerp((double)var1.method3709(), var2.prevX, var2.getX());
      double var8 = MathHelper.lerp((double)var1.method3709(), var2.prevY, var2.getY()) + var2.getHeight() / 2.0;
      double var10 = MathHelper.lerp((double)var1.method3709(), var2.prevZ, var2.getZ());
      float var12 = (float)(System.currentTimeMillis() - this.spiritsStartTime) / 1100.0F;
      float var13 = var12 * 360.0F;
      float var14 = 0.8F;
      this.method2341();
      BufferBuilder var15 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);

      for (int var16 = 0; var16 < 4; var16++) {
         float var17 = (var16 - 1) * 0.4F;
         float var18 = -1.0F;

         for (float var19 = 0.0F; var19 < 130.0F; var19++) {
            float var20 = var13 + var19 + var17 * 180.0F;
            double var21 = Math.toRadians(-var20);
            double var23 = Math.sin(var21 + 1114.0) * var17;
            float var25 = var14 * (var19 / 160.0F);
            float var26 = var18 >= 0.0F ? (var18 + var25) / 2.0F : var25;
            var18 = var25;
            var26 *= var3;
            float var27 = MathHelper.clamp(var26, 0.0F, 1.0F);

            for (int var28 = 4; var28 >= 1; var28--) {
               float var29 = 1.0F - var28 / 5.0F;
               double var30 = Math.toRadians(-(var20 - var28 * 6.0F));
               double var32 = Math.sin(var30 + 1114.0) * var17;
               this.method2337(var5, var15, var6, var8 + var32, var10, var30, var14, var26 * 0.86F, var27, var4, var3, var29 * 0.42F);
            }

            this.method2337(var5, var15, var6, var8 + var23, var10, var21, var14, var26, var27, var4, var3, 1.0F);
         }
      }

      BufferRenderer.drawWithGlobalProgram(var15.end());
      this.method2342();
   }

   private void method2337(
      MatrixStack var1,
      BufferBuilder var2,
      double var3,
      double var5,
      double var7,
      double var9,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      int var17 = this.method2344(var14, 600.0F * var15 * var13 * var16);
      var1.push();
      var1.translate(var3, var5, var7);
      var1.multiply(mc.gameRenderer.getCamera().getRotation());
      float var18 = var12 / 2.0F;
      double var19 = Math.cos(var9) * var11 - var18;
      double var21 = Math.sin(var9) * var11 - var18;
      Matrix4f var23 = var1.peek().getPositionMatrix();
      var2.vertex(var23, (float)var19, -var18, (float)var21).texture(0.0F, 1.0F).color(var17);
      var2.vertex(var23, (float)(var19 + var12), -var18, (float)var21).texture(1.0F, 1.0F).color(var17);
      var2.vertex(var23, (float)(var19 + var12), var18, (float)var21).texture(1.0F, 0.0F).color(var17);
      var2.vertex(var23, (float)var19, var18, (float)var21).texture(0.0F, 0.0F).color(var17);
      float var24 = var12 * 0.36F;
      float var25 = (float)var19 + var24;
      float var26 = (float)(var19 + var12) - var24;
      float var27 = -var18 + var24;
      float var28 = var18 - var24;
      float var29 = (float)var21;
      int var30 = MathHelper.clamp((int)(240.0F * var15 * (0.35F + var13 * 0.65F) * var16), 0, 255);
      int var31 = new Color(255, 255, 255, var30).getRGB();
      var2.vertex(var23, var25, var27, var29).texture(0.0F, 1.0F).color(var31);
      var2.vertex(var23, var26, var27, var29).texture(1.0F, 1.0F).color(var31);
      var2.vertex(var23, var26, var28, var29).texture(1.0F, 0.0F).color(var31);
      var2.vertex(var23, var25, var28, var29).texture(0.0F, 0.0F).color(var31);
      var1.pop();
   }

   private void method2338(Event10 var1, LivingEntity var2, float var3, float var4) {
      MatrixStack var5 = var1.method3708();
      long var6 = System.currentTimeMillis();
      this.spiritsTrackTime = this.spiritsTrackTime + (float)(var6 - this.lastSpiritsTrackTime) / 180.0F;
      this.lastSpiritsTrackTime = var6;
      double var8 = MathHelper.lerp((double)var1.method3709(), var2.prevX, var2.getX());
      double var10 = MathHelper.lerp((double)var1.method3709(), var2.prevY, var2.getY());
      double var12 = MathHelper.lerp((double)var1.method3709(), var2.prevZ, var2.getZ());
      this.method2341();
      BufferBuilder var14 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      var5.push();
      byte var15 = 3;
      byte var16 = 12;

      for (byte var17 = 0; var17 < var15 * 3; var17 += var15) {
         for (int var18 = 0; var18 < var16; var18++) {
            for (int var19 = 4; var19 >= 1; var19--) {
               float var20 = 1.0F - var19 / 5.0F;
               this.method2339(var5, var14, var8, var10, var12, var17, var18, this.spiritsTrackTime - var19 * 0.16F, var3, var4, var20 * 0.42F, 0.86F);
            }

            this.method2339(var5, var14, var8, var10, var12, var17, var18, this.spiritsTrackTime, var3, var4, 1.0F, 1.0F);
         }
      }

      BufferRenderer.drawWithGlobalProgram(var14.end());
      var5.pop();
      this.method2342();
   }

   private void method2339(
      MatrixStack var1,
      BufferBuilder var2,
      double var3,
      double var5,
      double var7,
      int var9,
      int var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15
   ) {
      float var16 = var11 + var10 * 0.1F;
      int var17 = (int)Math.pow(var9, 2.0);
      var1.push();
      var1.translate(
         var3 + 0.8F * MathHelper.sin(var16 + var17),
         var5 + 0.5 + 0.3F * MathHelper.sin(var11 + var10 * 0.2F) + 0.2F * var9,
         var7 + 0.8F * MathHelper.cos(var16 - var17)
      );
      float var18 = var12 * (0.005F + var10 / 2000.0F) * var15;
      var1.scale(var18, var18, var18);
      var1.multiply(mc.gameRenderer.getCamera().getRotation());
      Matrix4f var19 = var1.peek().getPositionMatrix();
      int var20 = this.method2344(var13, var12 * 600.0F * var14);
      var2.vertex(var19, -25.0F, 25.0F, 0.0F).texture(0.0F, 1.0F).color(var20);
      var2.vertex(var19, 25.0F, 25.0F, 0.0F).texture(1.0F, 1.0F).color(var20);
      var2.vertex(var19, 25.0F, -25.0F, 0.0F).texture(1.0F, 0.0F).color(var20);
      var2.vertex(var19, -25.0F, -25.0F, 0.0F).texture(0.0F, 0.0F).color(var20);
      var1.pop();
   }

   private void method2340(float var1) {
      long var2 = System.nanoTime();
      float var4 = (float)(var2 - this.spiritsFrameTime) / 2000000.0F;
      this.spiritsFrameTime = var2;
      this.spiritsHurtOffset += var1 * var4;
   }

   private void method2341() {
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderTexture(0, GLOW_TEXTURE);
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(770, 1, 0, 1);
      RenderSystem.disableCull();
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
   }

   private void method2342() {
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      RenderSystem.blendFunc(770, 771);
      RenderSystem.enableCull();
   }

   private void method2343(BufferBuilder var1, Matrix4f var2, float var3, int var4) {
      var1.vertex(var2, -var3, -var3, 0.0F).texture(1.0F, 1.0F).color(var4);
      var1.vertex(var2, var3, -var3, 0.0F).texture(0.0F, 1.0F).color(var4);
      var1.vertex(var2, var3, var3, 0.0F).texture(0.0F, 0.0F).color(var4);
      var1.vertex(var2, -var3, var3, 0.0F).texture(1.0F, 0.0F).color(var4);
   }

   private int method2344(float var1, float var2) {
      return Helper133.method1120(this.method2331(var1), MathHelper.clamp((int)var2, 0, 255));
   }

   private void method2345(Entity var1) {
      this.crystalList.clear();
      this.crystalList.add(new Helper244(var1, new Vec3d(0.0, 0.85, 0.8), new Vec3d(-49.0, 0.0, 40.0)));
      this.crystalList.add(new Helper244(var1, new Vec3d(0.2, 0.85, -0.675), new Vec3d(35.0, 0.0, -30.0)));
      this.crystalList.add(new Helper244(var1, new Vec3d(0.6, 1.35, 0.6), new Vec3d(-30.0, 0.0, 35.0)));
      this.crystalList.add(new Helper244(var1, new Vec3d(-0.74, 1.05, 0.4), new Vec3d(-25.0, 0.0, -30.0)));
      this.crystalList.add(new Helper244(var1, new Vec3d(0.74, 0.95, -0.4), new Vec3d(0.0, 0.0, 0.0)));
      this.crystalList.add(new Helper244(var1, new Vec3d(-0.475, 0.85, -0.375), new Vec3d(30.0, 0.0, -25.0)));
      this.crystalList.add(new Helper244(var1, new Vec3d(0.0, 1.35, -0.6), new Vec3d(45.0, 0.0, 0.0)));
      this.crystalList.add(new Helper244(var1, new Vec3d(0.85, 0.7, 0.1), new Vec3d(-30.0, 0.0, 30.0)));
      this.crystalList.add(new Helper244(var1, new Vec3d(-0.7, 1.35, -0.3), new Vec3d(0.0, 0.0, 0.0)));
      this.crystalList.add(new Helper244(var1, new Vec3d(-0.3, 1.35, 0.55), new Vec3d(0.0, 0.0, 0.0)));
      this.crystalList.add(new Helper244(var1, new Vec3d(-0.5, 0.7, 0.7), new Vec3d(0.0, 0.0, 0.0)));
      this.crystalList.add(new Helper244(var1, new Vec3d(0.5, 0.7, 0.7), new Vec3d(0.0, 0.0, 0.0)));
      this.crystalList.add(new Helper244(var1, new Vec3d(-0.7, 0.75, 0.0), new Vec3d(0.0, 0.0, 0.0)));
      this.crystalList.add(new Helper244(var1, new Vec3d(-0.2, 0.65, -0.7), new Vec3d(0.0, 0.0, 0.0)));
   }

   private void method2346(MatrixStack var1, Entity var2, float var3, float var4) {
      if (var2 != null && !this.crystalList.isEmpty()) {
         RenderSystem.enableDepthTest();
         Vec3d var5 = Helper149.method1259(var2);
         this.rotationAngle = (this.rotationAngle + 0.5F) % 360.0F;
         var1.push();
         var1.translate(var5.x, var5.y, var5.z);
         var1.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(this.rotationAngle));
         Camera var6 = mc.gameRenderer.getCamera();

         for (Helper244 var8 : this.crystalList) {
            var8.method2325(var1, var3, var4, var6);
         }

         var1.pop();
         RenderSystem.enableDepthTest();
      }
   }
}
