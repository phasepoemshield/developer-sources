package l;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.MatrixStack.Entry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.joml.Vector4i;

public class Trails extends Helper242 {
   private static final Identifier BLOOM_TEXTURE = Identifier.of("textures/teremok/particles/bloom.png");
   private final Setting8 targetsSetting = new Setting8("Отрисовывать на", "Кому рисовать следы")
      .method2585("Себе", "Друзьях", "Игроках")
      .method2586("Себе", "Друзьях");
   private final Setting2 lengthSetting = new Setting2("Длина", "Время жизни следа в секундах").method2078(0.1F, 5.0F).method2086(2.5F);
   private final Setting5 renderMode = new Setting5("Режим", "Тип отрисовки следа").method2381("Line", "Glow").method2383("Line");
   private final Setting2 glowSizeSetting = new Setting2("Размер glow", "Размер glow-частиц")
      .method2078(0.1F, 1.5F)
      .method2086(0.35F)
      .method2081(() -> this.renderMode.method2385("Glow"));
   private final Setting7 customColor = new Setting7("Кастомный цвет", "Цвет следа").method2550(Helper133.method1116(255, 101, 57));
   private final Map<Integer, List<Helper246>> trailsByEntity = new HashMap<>();

   public Trails() {
      super("Trails", "Trails", Helper269.RENDER);
      this.setup(new Helper264[]{this.targetsSetting, this.lengthSetting, this.renderMode, this.glowSizeSetting, this.customColor});
   }

   @Override
   public void deactivate() {
      this.trailsByEntity.clear();
      super.deactivate();
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      if (mc.world != null && mc.player != null) {
         float var2 = var1.method3709();
         long var3 = (long)(this.lengthSetting.method2082() * 1000.0F);
         int var5 = this.customColor.method2553();
         ArrayList<Helper245> var6 = new ArrayList<>();
         ArrayList<Helper247> var7 = new ArrayList<>();
         ArrayList<net.minecraft.client.network.AbstractClientPlayerEntity> var8 = new ArrayList<>(mc.world.getPlayers());
         if (!var8.contains(mc.player)) {
            var8.add(mc.player);
         }

         for (Entity var10 : var8) {
            if (this.method2367(var10) && (var10 != mc.player || !mc.options.getPerspective().isFirstPerson()) && var10 instanceof LivingEntity var11) {
               double var12 = MathHelper.lerp((double)var2, var11.prevX, var11.getX());
               double var14 = MathHelper.lerp((double)var2, var11.prevY, var11.getY()) + 0.05 - (var11.isGliding() ? 0.15 : 0.0);
               double var16 = MathHelper.lerp((double)var2, var11.prevZ, var11.getZ());
               List var18 = this.trailsByEntity.computeIfAbsent(var11.getId(), var0 -> new ArrayList<>());
               if (var18.isEmpty() || ((Helper246)var18.get(var18.size() - 1)).method2362(var12, var14, var16) > 4.0E-4) {
                  var18.add(new Helper246(var12, var14, var16));
               }

               float var19 = var11.getHeight() * (var11.isInSneakingPose() ? 0.8F : 1.0F);
               Helper246 var20 = null;
               boolean var21 = true;
               int var22 = 0;
               Iterator var23 = var18.iterator();

               while (var23.hasNext()) {
                  Helper246 var24 = (Helper246)var23.next();
                  long var25 = System.currentTimeMillis() - var24.time;
                  if (var25 > var3) {
                     var23.remove();
                  } else {
                     float var27 = 1.0F - MathHelper.clamp((float)var25 / (float)var3, 0.0F, 1.0F);
                     var24.alpha = var27;
                     int var28 = this.method2368(var5, (int)(255.0F * var27));
                     if (this.renderMode.method2385("Glow")) {
                        var7.add(new Helper247(new Vec3d(var24.x, var24.y + var19 * 0.45F, var24.z), var28, var27));
                     } else if (!var21 && var20 != null) {
                        var6.add(
                           new Helper245(
                              var20.x,
                              var20.y,
                              var20.z,
                              var20.x,
                              var20.y + var19,
                              var20.z,
                              var24.x,
                              var24.y + var19,
                              var24.z,
                              var24.x,
                              var24.y,
                              var24.z,
                              var22,
                              var28
                           )
                        );
                     }

                     var21 = false;
                     var20 = var24;
                     var22 = var28;
                  }
               }

               if (var18.isEmpty()) {
                  this.trailsByEntity.remove(var11.getId());
               }
            }
         }

         if (this.renderMode.method2385("Glow")) {
            this.method2366(var7);
         } else if (!var6.isEmpty()) {
            Entry var29 = var1.method3708().peek();
            RenderSystem.enableBlend();
            RenderSystem.disableCull();
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(false);
            RenderSystem.defaultBlendFunc();
            RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
            BufferBuilder var30 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);

            for (Helper245 var32 : var6) {
               var30.vertex(var29.getPositionMatrix(), (float)var32.x0, (float)var32.y0, (float)var32.z0).color(var32.color1);
               var30.vertex(var29.getPositionMatrix(), (float)var32.x1, (float)var32.y1, (float)var32.z1).color(var32.color1);
               var30.vertex(var29.getPositionMatrix(), (float)var32.x2, (float)var32.y2, (float)var32.z2).color(var32.color2);
               var30.vertex(var29.getPositionMatrix(), (float)var32.x3, (float)var32.y3, (float)var32.z3).color(var32.color2);
            }

            BufferRenderer.drawWithGlobalProgram(var30.end());
            RenderSystem.depthMask(true);
            RenderSystem.disableBlend();
            RenderSystem.enableCull();
         }
      }
   }

   private void method2366(List<Helper247> var1) {
      if (!var1.isEmpty()) {
         Camera var2 = mc.gameRenderer.getCamera();

         for (Helper247 var4 : var1) {
            if (!(var4.fade <= 0.02F)) {
               Vec3d var5 = var4.pos.subtract(var2.getPos());
               MatrixStack var6 = new MatrixStack();
               var6.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var2.getPitch()));
               var6.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var2.getYaw() + 180.0F));
               var6.translate(var5.x, var5.y, var5.z);
               var6.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var2.getYaw()));
               var6.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var2.getPitch()));
               Entry var7 = var6.peek().copy();
               float var8 = this.glowSizeSetting.method2082() * (0.55F + var4.fade * 0.8F);
               Helper183.method1568(
                  var7, BLOOM_TEXTURE, -var8 / 2.0F, -var8 / 2.0F, var8, var8, new Vector4i(var4.color, var4.color, var4.color, var4.color), true
               );
               int var9 = Helper133.method1108(var4.color, 0.45F);
               float var10 = var8 * 1.65F;
               Helper183.method1568(var7, BLOOM_TEXTURE, -var10 / 2.0F, -var10 / 2.0F, var10, var10, new Vector4i(var9, var9, var9, var9), true);
            }
         }
      }
   }

   private boolean method2367(Entity var1) {
      if (var1 instanceof PlayerEntity var2) {
         if (var1 == mc.player) {
            return this.targetsSetting.method2588("Себе");
         } else {
            return Helper309.method3075(var2) ? this.targetsSetting.method2588("Друзьях") : this.targetsSetting.method2588("Игроках");
         }
      } else {
         return false;
      }
   }

   private int method2368(int var1, int var2) {
      return MathHelper.clamp(var2, 0, 255) << 24 | var1 & 16777215;
   }

   public static Trails method2369() {
      return Helper222.method1979(Trails.class);
   }
}
