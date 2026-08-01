package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.RenderPhase.Texture;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "TargetESP",
   O000000000 = "Жозки таргет есп",
   O0000000000 = Category.Visuals
)
public class TargetESP extends Module implements O000000O00000 {
   private static final String O000000000O0OO = "target_esp";
   public static ModeSetting O000000000O = new ModeSetting("Текстура", "Картинка", "Картинка", "Призраки", "Кольцо", "Кубики", "Сфера");
   public static ModeSetting O000000000O0 = new ModeSetting("Режим призраков", "Обычный", "Обычный", "Новый", "Старый", "Орбита", "Спираль")
      .O00000000(() -> !O000000000O.O000000000("Призраки"));
   public static ModeSetting O000000000O00 = new ModeSetting("Режим картинки", "Клиент", "Клиент", "Ромб", "Ромб 2")
      .O00000000(() -> !O000000000O.O000000000("Картинка"));
   public static ModeSetting O000000000O000 = new ModeSetting("Режим кубиков", "Новый", "Новый", "Старый", "Орбита")
      .O00000000(() -> !O000000000O.O000000000("Кубики"));
   public static O000000O00 O000000000O00O = new O000000O00("Foundry Shader", O00000OOOO00O.ESP);
   private static final Identifier O000000000OO = Identifier.of("wild", "textures/world/target.png");
   private static final Identifier O000000000OO0 = Identifier.of("wild", "textures/world/targetn2.png");
   private static final Identifier O000000000OO00 = Identifier.of("wild", "textures/world/targetn.png");
   private static final Identifier O000000000OO0O = Identifier.of("wild", "textures/world/glow.png");
   private static final Identifier O000000000OOO = Identifier.of("wild", "textures/world/dashbloom.png");
   public static O0000O00OOOOOO O000000000O0O = new O0000O00OOOOOO();
   public static O0000O00OOOOOO O000000000O0O0 = new O0000O00OOOOOO();
   private LivingEntity O000000000OOO0 = null;
   private final Predicate<Entity> O000000000OOOO = entity -> entity == AttackAura.O00000000OO0 || entity == this.O000000000OOO0;
   private static long O00000000O = 0L;
   private float O00000000O0 = 0.0F;
   private long O00000000O00 = 0L;
   private final ArrayList<TargetESP.W188> O00000000O000 = new ArrayList<>();
   private static long O00000000O0000 = System.currentTimeMillis();
   static float O00000000O000O = 0.0F;
   private static final long O00000000O00O = 1000L;
   private static final int O00000000O00O0 = 1;
   private static final float O00000000O00OO = 0.02F;
   private static final int O00000000O0O = 50;
   private float O00000000O0O0 = 0.0F;
   private static final int O00000000O0O00 = 1024;
   private static final String O00000000O0O0O = "wild";
   private static final RenderPipeline O00000000O0OO = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_TEX_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/world/textured_quads"))
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderPipeline O00000000O0OO0 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_TEX_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/world/textured_quads"))
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O00000000O0OOO = O00000000(O000000000OO, O00000000O0OO0);
   private static final RenderLayer O00000000OO = O00000000(O000000000OO00, O00000000O0OO0);
   private static final RenderLayer O00000000OO0 = O00000000(O000000000OO0, O00000000O0OO0);
   private static final RenderLayer O00000000OO00 = O00000000(O000000000OO0O, O00000000O0OO);
   private static final RenderLayer O00000000OO000 = O00000000(O000000000OOO, O00000000O0OO);
   private static final RenderPipeline O00000000OO00O = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("minecraft", "rendertype_lequal_depth_test"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.TRIANGLE_STRIP)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderPipeline O00000000OO0O = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("minecraft", "rendertype_lines"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.DEBUG_LINE_STRIP)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O00000000OO0O0 = RenderLayer.of(
      "ring_strip", 1024, false, true, O00000000OO00O, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O00000000OO0OO = RenderLayer.of("ring_line", 1024, false, true, O00000000OO0O, MultiPhaseParameters.builder().build(false));
   private static final RenderPipeline O00000000OOO = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/world/color_quads"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O00000000OOO0 = RenderLayer.of("color_quads", 1024, false, true, O00000000OOO, MultiPhaseParameters.builder().build(false));
   private static final RenderPipeline O00000000OOO00 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("minecraft", "rendertype_lines"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.LINES)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderPipeline O00000000OOO0O = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "targetesp_cube_lines"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.DEBUG_LINES)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O00000000OOOO = RenderLayer.of(
      "targetesp_cube_lines", 1024, false, true, O00000000OOO0O, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderPipeline O00000000OOOO0 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "targetesp_cube_fill"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   static final RenderLayer O00000000OOOOO = RenderLayer.of(
      "targetesp_cube_fill", 1024, false, true, O00000000OOOO0, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderPipeline O0000000O = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "targetesp_cube_outline"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.DEBUG_LINES)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   static final RenderLayer O0000000O0 = RenderLayer.of("targetesp_cube_outline", 1024, false, true, O0000000O, MultiPhaseParameters.builder().build(false));

   public TargetESP() {
      this.O00000000(new Setting[]{O000000000O, O000000000O0, O000000000O00, O000000000O000, O000000000O00O});
   }

   @Override
   public O00000OOOO00O O0000000000() {
      return O00000OOOO00O.ESP;
   }

   @Override
   public String O00000000000() {
      String var1 = O0000000000O0();
      return var1 != null && !var1.isBlank() ? var1 : null;
   }

   public static String O0000000000O0() {
      String var0 = O000000000O00O == null ? "" : O000000000O00O.O0000000000O0();
      return var0 == null ? "" : var0;
   }

   @Override
   public boolean O000000000000() {
      return true;
   }

   @Override
   public void O00000000() {
      super.O00000000();
      O000000O000000.O00000000().O00000000(this, this);
      this.O0000000000O00();
   }

   @Override
   public void O000000000() {
      O0000O00OO000.O00000000().O00000000("target_esp");
      O000000O000000.O00000000().O00000000(this);
      this.O00000000O000.clear();
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      O000000O000000.O00000000().O000000000(this, this);
      this.O0000000000O00();
      O000000000O0O.O00000000();
      LivingEntity var2 = AttackAura.O00000000OO0 != null ? AttackAura.O00000000OO0 : TriggerBot.O0000000000O0();
      if (O0000000000.world != null && O0000000000.player != null) {
         AttackAura var3 = (AttackAura)WildClient.O00000000.O000000000.O000000000(AttackAura.class);
         if (var3 != null) {
            O000000000O0O.O00000000(var2 == null ? 0.0 : 1.0, 0.35F, O0000O0O00.O0000000000O0O);
            if (O000000000O0O.O0000000000O() > 0.0) {
               if (var2 != null) {
                  if (this.O000000000OOO0 != var2) {
                     O00000000O = 0L;
                     this.O00000000O00 = 0L;
                     this.O00000000O0 = 0.0F;
                  }

                  this.O000000000OOO0 = var2;
               }

               if (this.O000000000OOO0 != null && !O000000000O.O000000000("Не отображать")) {
                  Immediate var4 = O0000O00O0O00.O00000000();

                  try {
                     if (O000000000O.O000000000("Картинка") && O000000000O00.O000000000("Ромб")) {
                        this.O00000000(o0000000OO0000.O0000000000(), var4, this.O000000000OOO0, o0000000OO0000.O00000000000());
                     }

                     if (O000000000O.O000000000("Картинка") && O000000000O00.O000000000("Клиент")) {
                        this.O000000000(o0000000OO0000.O0000000000(), var4, this.O000000000OOO0, o0000000OO0000.O00000000000());
                     }

                     if (O000000000O.O000000000("Картинка") && O000000000O00.O000000000("Ромб 2")) {
                        this.O0000000000(o0000000OO0000.O0000000000(), var4, this.O000000000OOO0, o0000000OO0000.O00000000000());
                     }

                     if (O000000000O.O000000000("Призраки") && O000000000O0.O000000000("Обычный")) {
                        this.O0000000000O(o0000000OO0000.O0000000000(), var4, this.O000000000OOO0, o0000000OO0000.O00000000000());
                     }

                     if (O000000000O.O000000000("Призраки") && O000000000O0.O000000000("Новый")) {
                        this.O000000000000(o0000000OO0000.O0000000000(), var4, this.O000000000OOO0, o0000000OO0000.O00000000000());
                     }

                     if (O000000000O.O000000000("Призраки") && O000000000O0.O000000000("Старый")) {
                        this.O0000000000000(o0000000OO0000.O0000000000(), var4, this.O000000000OOO0, o0000000OO0000.O00000000000());
                     }

                     if (O000000000O.O000000000("Призраки") && O000000000O0.O000000000("Орбита")) {
                        this.O000000000000O(o0000000OO0000.O0000000000(), var4, this.O000000000OOO0, o0000000OO0000.O00000000000());
                     }

                     if (O000000000O.O000000000("Призраки") && O000000000O0.O000000000("Спираль")) {
                        this.O00000000000O(o0000000OO0000.O0000000000(), var4, this.O000000000OOO0, o0000000OO0000.O00000000000());
                     }

                     if (O000000000O.O000000000("Кольцо")) {
                        this.O00000000000(o0000000OO0000.O0000000000(), var4, this.O000000000OOO0, o0000000OO0000.O00000000000());
                     }

                     if (O000000000O.O000000000("Кубики") && O000000000O000.O000000000("Новый")) {
                        this.O0000000000O0(o0000000OO0000.O0000000000(), var4, this.O000000000OOO0, o0000000OO0000.O00000000000());
                     }

                     if (O000000000O.O000000000("Кубики") && O000000000O000.O000000000("Старый")) {
                        this.O0000000000O00(o0000000OO0000.O0000000000(), var4, this.O000000000OOO0, o0000000OO0000.O00000000000());
                     }

                     if (O000000000O.O000000000("Кубики") && O000000000O000.O000000000("Орбита")) {
                        this.O00000000000O0(o0000000OO0000.O0000000000(), var4, this.O000000000OOO0, o0000000OO0000.O00000000000());
                     }

                     if (O000000000O.O000000000("Сфера")) {
                        this.O00000000000OO(o0000000OO0000.O0000000000(), var4, this.O000000000OOO0, o0000000OO0000.O00000000000());
                     }
                  } finally {
                     O0000O00O0O00.O000000000();
                  }
               }
            } else {
               this.O000000000OOO0 = null;
               O00000000O = 0L;
               this.O00000000O00 = 0L;
               this.O00000000O0 = 0.0F;
               this.O00000000O000.clear();
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O o0000000O00O) {
      if (O0000000000.world != null && O0000000000.player != null && o0000000O00O != null && o0000000O00O.O0000000000() != null) {
         String var2 = O0000000000O0();
         if (!var2.isBlank() && this.O000000000OOO0 != null && !(O000000000O0O.O0000000000O() <= 0.001F)) {
            float var3 = o0000000O00O.O0000000000().getRenderTickCounter().getDynamicDeltaTicks();
            TargetESP.W189 var4 = this.O00000000(this.O000000000OOO0, var3, o0000000O00O.O0000000000000(), o0000000O00O.O000000000000O());
            if (var4 != null) {
               RenderManager var5 = o0000000O00O.O00000000000();
               if (var5 != null) {
                  var5.O0000000000();
               }

               float var6 = (float)Math.min(0.92, O000000000O0O.O0000000000O() * 0.78);
               float var7 = var4.x + var4.w * 0.5F;
               float var8 = var4.y + var4.h * 0.5F;
               int var9 = O0000O00OO000.O00000000().O00000000000();
               boolean var10 = O00000OOOO00O0.O00000000(
                  var2, var9, var4.x, var4.y, var4.w, var4.h, o0000000O00O.O0000000000000(), o0000000O00O.O000000000000O(), var7, var8, O0000000000O0O(), var6
               );
               if (var10 && var5 != null) {
                  var5.O0000000000();
               }
            }
         }
      }
   }

   private void O0000000000O00() {
      O0000O00OO000.O00000000().O00000000("target_esp", this.O0000000000000 && !O0000000000O0().isBlank(), this.O000000000OOOO);
   }

   private TargetESP.W189 O00000000(LivingEntity livingEntity, float f, int i, int j) {
      if (livingEntity != null
         && !livingEntity.isRemoved()
         && i > 1
         && j > 1
         && O0000000000.gameRenderer != null
         && O0000000000.gameRenderer.getCamera() != null) {
         Vec3d var5 = livingEntity.getLerpedPos(f);
         Vec3d var6 = livingEntity.getPos();
         Box var7 = livingEntity.getBoundingBox()
            .offset(var5.x - var6.x, var5.y - var6.y, var5.z - var6.z)
            .expand(0.05, Math.max(0.05, livingEntity.getHeight() * 0.035), 0.05);
         float var8 = Float.POSITIVE_INFINITY;
         float var9 = Float.POSITIVE_INFINITY;
         float var10 = Float.NEGATIVE_INFINITY;
         float var11 = Float.NEGATIVE_INFINITY;

         for (int var12 = 0; var12 < 2; var12++) {
            double var13 = var12 == 0 ? var7.minX : var7.maxX;

            for (int var15 = 0; var15 < 2; var15++) {
               double var16 = var15 == 0 ? var7.minY : var7.maxY;

               for (int var18 = 0; var18 < 2; var18++) {
                  double var19 = var18 == 0 ? var7.minZ : var7.maxZ;
                  Vec3d var21 = O0000O000OOOOO.O00000000(new Vec3d(var13, var16, var19));
                  if (var21 == null || var21.z <= 0.001F || var21.z > 1.0) {
                     return null;
                  }

                  var8 = Math.min(var8, (float)var21.x);
                  var9 = Math.min(var9, (float)var21.y);
                  var10 = Math.max(var10, (float)var21.x);
                  var11 = Math.max(var11, (float)var21.y);
               }
            }
         }

         if (!Float.isFinite(var8) || !Float.isFinite(var9) || !Float.isFinite(var10) || !Float.isFinite(var11)) {
            return null;
         } else if (!(var10 < 0.0F) && !(var11 < 0.0F) && !(var8 > i) && !(var9 > j)) {
            float var22 = Math.max(1.0F, var10 - var8);
            float var23 = Math.max(1.0F, var11 - var9);
            float var14 = Math.min(96.0F, Math.max(18.0F, var22 * 0.28F));
            float var24 = Math.min(96.0F, Math.max(18.0F, var23 * 0.18F));
            float var25 = Math.max(0.0F, var8 - var14);
            float var17 = Math.max(0.0F, var9 - var24);
            float var26 = Math.min((float)i, var10 + var14);
            float var27 = Math.min((float)j, var11 + var24);
            float var20 = var26 - var25;
            float var28 = var27 - var17;
            return var20 > 2.0F && var28 > 2.0F ? new TargetESP.W189(var25, var17, var20, var28) : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static ColorScheme O0000000000O0O() {
      Theme var0 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.WILD;
      return ColorScheme.O00000000(var0, O00000OOOO00O0.O00000000000());
   }

   private void O00000000(MatrixStack matrixStack, Immediate immediate, LivingEntity livingEntity, float f) {
      Vec3d var5 = livingEntity.getLerpedPos(f);
      double var6 = var5.x;
      double var8 = var5.y;
      double var10 = var5.z;
      Vec3d var12 = O0000000000.gameRenderer.getCamera().getPos();
      matrixStack.push();
      matrixStack.translate(var6 - var12.x, var8 - var12.y + livingEntity.getHeight() / 1.75F, var10 - var12.z);
      matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-O0000000000.gameRenderer.getCamera().getYaw()));
      matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(O0000000000.gameRenderer.getCamera().getPitch()));
      long var13 = System.currentTimeMillis();
      float var15 = (float)O0000O000OOOOO.O00000000000(0.0, 720.0, (Math.sin(var13 / 900.0) + 1.0) / 2.0 * 360.0 * 2.0);
      matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var15));
      O000000000O0O0.O00000000();
      int var16 = livingEntity.hurtTime;
      float var17 = (float)Math.sin(var16 * (Math.PI / 20));
      O000000000O0O0.O00000000(var17, 0.4F, O0000O0O00.O0000000000O0O);
      float var18 = O000000000O0O0.O000000000000();
      float var19 = (float)O000000000O0O.O0000000000O();
      int var20 = O0000O000OO000.O0000000000(200, 70, 70, (int)(255.0F * var19));
      int var21 = O0000O000OO000.O000000000000(O0000O000OO000.O0000000000(O0000O000OO000.O00000000(), var19), var20, O000000000O0O0.O000000000000());
      float var22 = 1.7F - 0.9F * var19 + (0.35F - 0.35F * var18);
      matrixStack.scale(var22, var22, 1.0F);
      RenderLayer var23 = O00000000O0OOO;
      Matrix4f var24 = matrixStack.peek().getPositionMatrix();
      VertexConsumer var25 = immediate.getBuffer(var23);
      O00000000(var25, var24, var21, (int)(255.0F * var19));
      matrixStack.pop();
   }

   private void O000000000(MatrixStack matrixStack, Immediate immediate, LivingEntity livingEntity, float f) {
      Vec3d var5 = livingEntity.getLerpedPos(f);
      double var6 = var5.x;
      double var8 = var5.y;
      double var10 = var5.z;
      Vec3d var12 = O0000000000.gameRenderer.getCamera().getPos();
      matrixStack.push();
      matrixStack.translate(var6 - var12.x, var8 - var12.y + livingEntity.getHeight() / 1.75F, var10 - var12.z);
      matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-O0000000000.gameRenderer.getCamera().getYaw()));
      matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(O0000000000.gameRenderer.getCamera().getPitch()));
      long var13 = System.currentTimeMillis();
      float var15 = (float)O0000O000OOOOO.O00000000000(0.0, 720.0, (Math.sin(var13 / 1600.0) + 1.0) / 2.0 * 360.0 * 2.0);
      matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var15));
      O000000000O0O0.O00000000();
      int var16 = livingEntity.hurtTime;
      float var17 = (float)Math.sin(var16 * (Math.PI / 20));
      O000000000O0O0.O00000000(var17, 0.4F, O0000O0O00.O0000000000O0O);
      float var18 = O000000000O0O0.O000000000000();
      float var19 = (float)O000000000O0O.O0000000000O();
      int var20 = O0000O000OO000.O0000000000(200, 70, 70, (int)(255.0F * var19));
      int var21 = O0000O000OO000.O000000000000(O0000O000OO000.O0000000000(O0000O000OO000.O00000000(), var19), var20, O000000000O0O0.O000000000000());
      float var22 = 1.5F - 0.9F * var19 + (0.35F - 0.35F * var18);
      matrixStack.scale(var22, var22, 1.0F);
      RenderLayer var23 = O00000000OO;
      Matrix4f var24 = matrixStack.peek().getPositionMatrix();
      VertexConsumer var25 = immediate.getBuffer(var23);
      O00000000(var25, var24, var21, (int)(255.0F * var19));
      matrixStack.pop();
   }

   private void O0000000000(MatrixStack matrixStack, Immediate immediate, LivingEntity livingEntity, float f) {
      Vec3d var5 = livingEntity.getLerpedPos(f);
      double var6 = var5.x;
      double var8 = var5.y;
      double var10 = var5.z;
      Vec3d var12 = O0000000000.gameRenderer.getCamera().getPos();
      matrixStack.push();
      matrixStack.translate(var6 - var12.x, var8 - var12.y + livingEntity.getHeight() / 1.75F, var10 - var12.z);
      matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-O0000000000.gameRenderer.getCamera().getYaw()));
      matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(O0000000000.gameRenderer.getCamera().getPitch()));
      long var13 = System.currentTimeMillis();
      float var15 = (float)O0000O000OOOOO.O00000000000(0.0, 720.0, (Math.sin(var13 / 1000.0) + 1.0) / 2.0 * 360.0 * 2.0);
      matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var15));
      O000000000O0O0.O00000000();
      int var16 = livingEntity.hurtTime;
      float var17 = (float)Math.sin(var16 * (Math.PI / 20));
      O000000000O0O0.O00000000(var17, 0.4F, O0000O0O00.O0000000000O0O);
      float var18 = O000000000O0O0.O000000000000();
      float var19 = (float)O000000000O0O.O0000000000O();
      int var20 = O0000O000OO000.O0000000000(200, 70, 70, (int)(255.0F * var19));
      int var21 = O0000O000OO000.O000000000000(O0000O000OO000.O0000000000(O0000O000OO000.O00000000(), var19), var20, O000000000O0O0.O000000000000());
      float var22 = 1.25F - 0.6F * var19 + (0.35F - 0.35F * var18);
      matrixStack.scale(var22, var22, 1.0F);
      RenderLayer var23 = O00000000OO0;
      Matrix4f var24 = matrixStack.peek().getPositionMatrix();
      VertexConsumer var25 = immediate.getBuffer(var23);
      O00000000(var25, var24, var21, (int)(255.0F * var19));
      matrixStack.pop();
   }

   private void O00000000000(MatrixStack matrixStack, Immediate immediate, LivingEntity livingEntity, float f) {
      if (livingEntity != null) {
         Vec3d var5 = O0000000000.gameRenderer.getCamera().getPos();
         double var6 = livingEntity.lastRenderX + (livingEntity.getX() - livingEntity.lastRenderX) * f;
         double var8 = livingEntity.lastRenderY + (livingEntity.getY() - livingEntity.lastRenderY) * f;
         double var10 = livingEntity.lastRenderZ + (livingEntity.getZ() - livingEntity.lastRenderZ) * f;
         matrixStack.push();
         matrixStack.translate(var6 - var5.x, var8 - var5.y, var10 - var5.z);
         float var12 = (float)O000000000O0O.O0000000000O();
         float var13 = livingEntity.getHeight();
         double var14 = livingEntity.getWidth() * 1.0F - 0.2F * O000000000O0O0.O000000000000();
         int var16 = O0000O000OO000.O0000000000(200, 70, 70, (int)(255.0F * var12));
         O000000000O0O0.O00000000();
         int var17 = livingEntity.hurtTime;
         float var18 = (float)Math.sin(var17 * (Math.PI / 20));
         O000000000O0O0.O00000000(var18, 0.4F, O0000O0O00.O0000000000O0O);
         Matrix4f var19 = matrixStack.peek().getPositionMatrix();
         double var20 = 1800.0;
         double var22 = System.currentTimeMillis() % var20;
         boolean var24 = var22 > var20 / 2.0;
         double var25 = var22 / (var20 / 2.0);
         var25 = var24 ? var25 - 1.0 : 1.0 - var25;
         var25 = var25 < 0.5 ? 2.0 * var25 * var25 : 1.0 - Math.pow(-2.0 * var25 + 2.0, 2.0) / 2.0;
         double var27 = var13 / 1.25F * (var25 > 0.5 ? 1.0 - var25 : var25) * (var24 ? -1 : 1);
         VertexConsumer var29 = immediate.getBuffer(O00000000OO0O0);

         for (byte var30 = 0; var30 <= 360; var30 += 5) {
            double var31 = Math.toRadians(var30);
            float var33 = (float)(Math.cos(var31) * var14);
            float var34 = (float)(Math.sin(var31) * var14);
            int var35 = O0000O000OO000.O000000000000(
               O0000O000OO000.O0000000000(
                  O0000O000OO000.O000000000(
                     O0000O000OO000.O000000000000(O0000O000OO000.O00000000(), 0.5F),
                     O0000O000OO000.O000000000000(O0000O000OO000.O00000000(), 1.0F),
                     var30 * 4,
                     1
                  ),
                  var12
               ),
               var16,
               O000000000O0O0.O000000000000()
            );
            int var36 = var35 >> 16 & 0xFF;
            int var37 = var35 >> 8 & 0xFF;
            int var38 = var35 & 0xFF;
            var29.vertex(var19, var33, (float)(var13 * var25), var34).color(var36, var37, var38, (int)(180.0F * var12));
            var29.vertex(var19, var33, (float)(var13 * var25 + var27), var34).color(var36, var37, var38, 0);
         }

         VertexConsumer var41 = immediate.getBuffer(O00000000OO0OO);

         for (byte var42 = 0; var42 <= 360; var42 += 5) {
            double var32 = Math.toRadians(var42);
            float var43 = (float)(Math.cos(var32) * var14);
            float var44 = (float)(Math.sin(var32) * var14);
            int var45 = O0000O000OO000.O000000000000(
               O0000O000OO000.O0000000000(
                  O0000O000OO000.O000000000(
                     O0000O000OO000.O000000000000(O0000O000OO000.O00000000(), 0.5F),
                     O0000O000OO000.O000000000000(O0000O000OO000.O00000000(), 1.0F),
                     var42 * 4,
                     1
                  ),
                  var12
               ),
               var16,
               O000000000O0O0.O000000000000()
            );
            var41.vertex(var19, var43, (float)(var13 * var25), var44).color(O0000O000OO000.O000000000000(var45, (int)(255.0F * var12)));
         }

         matrixStack.pop();
      }
   }

   private void O000000000000(MatrixStack matrixStack, Immediate immediate, LivingEntity livingEntity, float f) {
      if (livingEntity != null) {
         long var5 = System.currentTimeMillis();
         if (this.O00000000O00 == 0L) {
            this.O00000000O00 = var5;
         }

         long var7 = var5 - this.O00000000O00;
         if (var7 > 0L) {
            this.O00000000O0 += (float)(5L * var7) / 900.0F;
         }

         this.O00000000O00 = var5;
         Vec3d var9 = livingEntity.getLerpedPos(f);
         Vec3d var10 = O0000000000.gameRenderer.getCamera().getPos();
         double var11 = var9.x - var10.x;
         double var13 = var9.y - var10.y;
         double var15 = var9.z - var10.z;
         float var17 = (float)O000000000O0O.O0000000000O();
         O000000000O0O0.O00000000();
         int var18 = livingEntity.hurtTime;
         float var19 = (float)Math.sin(var18 * (Math.PI / 20));
         O000000000O0O0.O00000000(var19, 0.4F, O0000O0O00.O0000000000O0O);
         float var20 = O000000000O0O0.O000000000000();
         int var21 = O0000O000OO000.O00000000();
         int var22 = O0000O000OO000.O0000000000(200, 70, 70, (int)(255.0F * var17));
         int var23 = O0000O000OO000.O000000000000(O0000O000OO000.O0000000000(var21, var17), var22, var20);
         RenderLayer var24 = O00000000OO00;
         byte var25 = 3;
         byte var26 = 12;
         int var27 = 3 * var25;
         matrixStack.push();
         Camera var28 = O0000000000.gameRenderer.getCamera();

         for (byte var29 = 0; var29 < var27; var29 += var25) {
            for (int var30 = 0; var30 < var26; var30++) {
               float var31 = this.O00000000O0 + var30 * 0.1F;
               float var32 = 0.75F;
               float var33 = 0.5F;
               int var34 = (int)Math.pow(var29, 2.0);
               matrixStack.push();
               double var35 = var11 + var32 * Math.sin(var31 + var34);
               double var37 = var13 + var33 + 0.3F * Math.sin(this.O00000000O0 + var30 * 0.2F) + 0.2F * var29;
               double var39 = var15 + var32 * Math.cos(var31 - var34);
               matrixStack.translate(var35, var37, var39);
               float var41 = 0.005F + var30 / 2000.0F;
               matrixStack.scale(var41, var41, var41);
               matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var28.getYaw()));
               matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var28.getPitch()));
               Matrix4f var42 = matrixStack.peek().getPositionMatrix();
               VertexConsumer var43 = immediate.getBuffer(var24);
               int var45 = var23 >> 16 & 0xFF;
               int var46 = var23 >> 8 & 0xFF;
               int var47 = var23 & 0xFF;
               int var48 = (int)(var17 * 255.0F);
               byte var49 = -25;
               byte var50 = 50;
               var43.vertex(var42, var49, var49 + var50, 0.0F)
                  .color(var45, var46, var47, var48)
                  .texture(0.0F, 1.0F)
                  .overlay(OverlayTexture.DEFAULT_UV)
                  .light(15728880)
                  .normal(0.0F, 0.0F, 1.0F);
               var43.vertex(var42, var49 + var50, var49 + var50, 0.0F)
                  .color(var45, var46, var47, var48)
                  .texture(1.0F, 1.0F)
                  .overlay(OverlayTexture.DEFAULT_UV)
                  .light(15728880)
                  .normal(0.0F, 0.0F, 1.0F);
               var43.vertex(var42, var49 + var50, var49, 0.0F)
                  .color(var45, var46, var47, var48)
                  .texture(1.0F, 0.0F)
                  .overlay(OverlayTexture.DEFAULT_UV)
                  .light(15728880)
                  .normal(0.0F, 0.0F, 1.0F);
               var43.vertex(var42, var49, var49, 0.0F)
                  .color(var45, var46, var47, var48)
                  .texture(0.0F, 0.0F)
                  .overlay(OverlayTexture.DEFAULT_UV)
                  .light(15728880)
                  .normal(0.0F, 0.0F, 1.0F);
               matrixStack.pop();
            }
         }

         matrixStack.pop();
      }
   }

   private void O0000000000000(MatrixStack matrixStack, Immediate immediate, LivingEntity livingEntity, float f) {
      if (livingEntity != null) {
         long var5 = System.currentTimeMillis();
         if (this.O00000000O00 == 0L) {
            this.O00000000O00 = var5;
         }

         long var7 = var5 - this.O00000000O00;
         if (var7 > 0L) {
            this.O00000000O0 += (float)(5L * var7) / 200.0F;
         }

         this.O00000000O00 = var5;
         Vec3d var9 = livingEntity.getLerpedPos(f);
         Vec3d var10 = O0000000000.gameRenderer.getCamera().getPos();
         double var11 = var9.x - var10.x;
         double var13 = var9.y + 1.1F - var10.y;
         double var15 = var9.z - var10.z;
         float var17 = (float)O000000000O0O.O0000000000O();
         RenderLayer var18 = O00000000OO00;
         byte var19 = 17;
         byte var20 = 6;
         float var21 = 1.25F;
         float var22 = 1.1F;
         float var23 = this.O00000000O0;
         Camera var24 = O0000000000.gameRenderer.getCamera();
         double var25 = livingEntity.getWidth() + 0.12F;
         boolean var27 = O0000000000.player.canSee(livingEntity);
         VertexConsumer var28 = immediate.getBuffer(var18);
         O000000000O0O0.O00000000();
         int var29 = livingEntity.hurtTime;
         float var30 = (float)Math.sin(var29 * (Math.PI / 20));
         O000000000O0O0.O00000000(var30, 0.4F, O0000O0O00.O0000000000O0O);
         float var31 = O000000000O0O0.O000000000000();
         int var32 = O00000000(255, var31);

         for (int var33 = 0; var33 < 3; var33++) {
            for (int var34 = 0; var34 <= var19; var34++) {
               double var35 = Math.toRadians(((var34 / 1.5F + var23) * var20 + var33 * 120) % (var20 * 360));
               double var37 = Math.sin(Math.toRadians(var23 * 2.0F + var34 * (var33 + 1)) * var22) / var21;
               float var39 = (float)var34 / var19;
               matrixStack.push();
               matrixStack.translate(var11 + Math.cos(var35) * var25, var13 + var37, var15 + Math.sin(var35) * var25);
               matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var24.getYaw()));
               matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var24.getPitch()));
               Matrix4f var40 = matrixStack.peek().getPositionMatrix();
               int var41 = O00000000(var32, (int)(255.0F * var39 * var17));
               int var42 = var41 >> 16 & 0xFF;
               int var43 = var41 >> 8 & 0xFF;
               int var44 = var41 & 0xFF;
               int var45 = var41 >> 24 & 0xFF;
               float var46 = Math.max(0.25F * var39, 0.22F);
               var28.vertex(var40, -var46, var46, 0.0F)
                  .color(var42, var43, var44, var45)
                  .texture(0.0F, 1.0F)
                  .overlay(OverlayTexture.DEFAULT_UV)
                  .light(15728880)
                  .normal(0.0F, 0.0F, 1.0F);
               var28.vertex(var40, var46, var46, 0.0F)
                  .color(var42, var43, var44, var45)
                  .texture(1.0F, 1.0F)
                  .overlay(OverlayTexture.DEFAULT_UV)
                  .light(15728880)
                  .normal(0.0F, 0.0F, 1.0F);
               var28.vertex(var40, var46, -var46, 0.0F)
                  .color(var42, var43, var44, var45)
                  .texture(1.0F, 0.0F)
                  .overlay(OverlayTexture.DEFAULT_UV)
                  .light(15728880)
                  .normal(0.0F, 0.0F, 1.0F);
               var28.vertex(var40, -var46, -var46, 0.0F)
                  .color(var42, var43, var44, var45)
                  .texture(0.0F, 0.0F)
                  .overlay(OverlayTexture.DEFAULT_UV)
                  .light(15728880)
                  .normal(0.0F, 0.0F, 1.0F);
               matrixStack.pop();
            }
         }
      }
   }

   private static float O0000000000OO() {
      return (float)(System.currentTimeMillis() % 1000000L) / 1000.0F;
   }

   private float O00000000(LivingEntity livingEntity) {
      O000000000O0O0.O00000000();
      int var2 = livingEntity.hurtTime;
      float var3 = (float)Math.sin(var2 * (Math.PI / 20));
      O000000000O0O0.O00000000(var3, 0.4F, O0000O0O00.O0000000000O0O);
      return O000000000O0O0.O000000000000();
   }

   private void O00000000(
      MatrixStack matrixStack, Immediate immediate, Camera camera, RenderLayer renderLayer, double d, double e, double f, float g, int i, int j
   ) {
      if (j > 0) {
         matrixStack.push();
         matrixStack.translate(d, e, f);
         matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getYaw()));
         matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));
         matrixStack.scale(g, g, g);
         O00000000(immediate.getBuffer(renderLayer), matrixStack.peek().getPositionMatrix(), i, j);
         matrixStack.pop();
      }
   }

   private void O000000000000O(MatrixStack matrixStack, Immediate immediate, LivingEntity livingEntity, float f) {
      if (livingEntity != null) {
         Camera var5 = O0000000000.gameRenderer.getCamera();
         Vec3d var6 = var5.getPos();
         Vec3d var7 = livingEntity.getLerpedPos(f);
         float var8 = (float)O000000000O0O.O0000000000O();
         float var9 = this.O00000000(livingEntity);
         int var10 = O00000000(255, var9) & 16777215;
         double var11 = var7.x - var6.x;
         double var13 = var7.z - var6.z;
         double var15 = var7.y - var6.y + livingEntity.getHeight() * 0.5;
         double var17 = livingEntity.getWidth() / 2.0 + 0.5;
         double var19 = livingEntity.getHeight() * 0.18;
         byte var21 = 16;
         float var22 = O0000000000OO();

         for (int var23 = 0; var23 < var21; var23++) {
            double var24 = (Math.PI * 2) / var21 * var23 + var22 * 1.4;
            double var26 = var11 + Math.cos(var24) * var17;
            double var28 = var13 + Math.sin(var24) * var17;
            double var30 = var15 + Math.sin(var22 * 2.2 + var23 * 0.6) * var19;
            float var32 = 0.55F + 0.45F * (float)Math.sin(var22 * 2.0 + var23);
            int var33 = (int)(215.0F * var8 * var32);
            float var34 = 0.3F + 0.06F * (float)Math.sin(var22 * 3.0 + var23);
            this.O00000000(matrixStack, immediate, var5, O00000000OO00, var26, var30, var28, var34, var10, var33);
         }
      }
   }

   private void O00000000000O(MatrixStack matrixStack, Immediate immediate, LivingEntity livingEntity, float f) {
      if (livingEntity != null) {
         Camera var5 = O0000000000.gameRenderer.getCamera();
         Vec3d var6 = var5.getPos();
         Vec3d var7 = livingEntity.getLerpedPos(f);
         float var8 = (float)O000000000O0O.O0000000000O();
         float var9 = this.O00000000(livingEntity);
         int var10 = O00000000(255, var9) & 16777215;
         double var11 = var7.x - var6.x;
         double var13 = var7.z - var6.z;
         double var15 = var7.y - var6.y - 0.1;
         double var17 = livingEntity.getWidth() / 2.0 + 0.32;
         double var19 = livingEntity.getHeight() + 0.2;
         double var21 = 2.5;
         byte var23 = 18;
         float var24 = O0000000000OO();

         for (int var25 = 0; var25 < 2; var25++) {
            for (int var26 = 0; var26 <= var23; var26++) {
               double var27 = (double)var26 / var23;
               double var29 = var27 * var21 * Math.PI * 2.0 + var24 * 2.0 + var25 * Math.PI;
               double var31 = var11 + Math.cos(var29) * var17;
               double var33 = var13 + Math.sin(var29) * var17;
               double var35 = var15 + var27 * var19;
               int var37 = (int)(220.0F * var8 * (0.3 + 0.7 * Math.sin(var27 * Math.PI)));
               this.O00000000(matrixStack, immediate, var5, O00000000OO00, var31, var35, var33, 0.24F, var10, var37);
            }
         }
      }
   }

   private void O00000000000O0(MatrixStack matrixStack, Immediate immediate, LivingEntity livingEntity, float f) {
      if (livingEntity != null) {
         Camera var5 = O0000000000.gameRenderer.getCamera();
         Vec3d var6 = var5.getPos();
         Vec3d var7 = livingEntity.getLerpedPos(f);
         float var8 = (float)O000000000O0O.O0000000000O();
         float var9 = this.O00000000(livingEntity);
         int var10 = O00000000(255, var9) & 16777215;
         double var11 = var7.x - var6.x;
         double var13 = var7.z - var6.z;
         double var15 = var7.y - var6.y + livingEntity.getHeight() * 0.5;
         double var17 = livingEntity.getWidth() / 2.0 + 0.55;
         byte var19 = 14;
         float var20 = O0000000000OO();

         for (int var21 = 0; var21 < var19; var21++) {
            double var22 = (Math.PI * 2) / var19 * var21 + var20 * 1.1;
            double var24 = var11 + Math.cos(var22) * var17;
            double var26 = var13 + Math.sin(var22) * var17;
            double var28 = var15 + Math.sin(var20 * 2.0 + var21) * 0.12;
            matrixStack.push();
            matrixStack.translate(var24, var28, var26);
            matrixStack.push();
            float var30 = (var20 * 50.0F + var21 * 28.0F) % 360.0F;
            matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var30));
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var30 * 0.7F));
            Matrix4f var31 = matrixStack.peek().getPositionMatrix();
            float var32 = 0.16F + 0.02F * (float)Math.sin(var20 * 3.0 + var21);
            O00000OO00OOO0$W226$W227.O00000000(immediate.getBuffer(O00000000OOOOO), var31, O00000000(var10, (int)(70.0F * var8)), var32);
            O00000OO00OOO0$W226$W227.O000000000(immediate.getBuffer(O0000000O0), var31, O00000000(var10, (int)(230.0F * var8)), var32);
            matrixStack.pop();
            matrixStack.push();
            matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var5.getYaw()));
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var5.getPitch()));
            float var33 = var32 * 2.4F;
            matrixStack.scale(var33, var33, var33);
            O00000000(immediate.getBuffer(O00000000OO000), matrixStack.peek().getPositionMatrix(), var10, (int)(60.0F * var8));
            matrixStack.pop();
            matrixStack.pop();
         }
      }
   }

   private void O00000000000OO(MatrixStack matrixStack, Immediate immediate, LivingEntity livingEntity, float f) {
      if (livingEntity != null) {
         Camera var5 = O0000000000.gameRenderer.getCamera();
         Vec3d var6 = var5.getPos();
         Vec3d var7 = livingEntity.getLerpedPos(f);
         float var8 = (float)O000000000O0O.O0000000000O();
         float var9 = this.O00000000(livingEntity);
         int var10 = O00000000(O00000000(255, var9) & 16777215, (int)(220.0F * var8));
         double var11 = var7.x - var6.x;
         double var13 = var7.y - var6.y + livingEntity.getHeight() * 0.5;
         double var15 = var7.z - var6.z;
         float var17 = (float)(Math.max((double)livingEntity.getWidth(), livingEntity.getHeight() * 0.5) * 0.72 + 0.3 + var9 * 0.2);
         float var18 = O0000000000OO();
         matrixStack.push();
         matrixStack.translate(var11, var13, var15);
         matrixStack.push();
         matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var18 * 38.0F));
         O00000000(immediate.getBuffer(O0000000O0), matrixStack.peek().getPositionMatrix(), var17, 40, var10);
         matrixStack.pop();
         matrixStack.push();
         matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var18 * 30.0F));
         matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0F));
         O00000000(immediate.getBuffer(O0000000O0), matrixStack.peek().getPositionMatrix(), var17, 40, var10);
         matrixStack.pop();
         matrixStack.push();
         matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var18 * 26.0F + 90.0F));
         matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(90.0F));
         O00000000(immediate.getBuffer(O0000000O0), matrixStack.peek().getPositionMatrix(), var17, 40, var10);
         matrixStack.pop();
         matrixStack.pop();
      }
   }

   private static void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, int i, int j) {
      int var5 = j >> 16 & 0xFF;
      int var6 = j >> 8 & 0xFF;
      int var7 = j & 0xFF;
      int var8 = j >>> 24 & 0xFF;

      for (int var9 = 0; var9 < i; var9++) {
         double var10 = (Math.PI * 2) / i * var9;
         double var12 = (Math.PI * 2) / i * (var9 + 1);
         vertexConsumer.vertex(matrix4f, (float)(Math.cos(var10) * f), 0.0F, (float)(Math.sin(var10) * f)).color(var5, var6, var7, var8);
         vertexConsumer.vertex(matrix4f, (float)(Math.cos(var12) * f), 0.0F, (float)(Math.sin(var12) * f)).color(var5, var6, var7, var8);
      }
   }

   static void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, int i, int j) {
      int var4 = i >> 16 & 0xFF;
      int var5 = i >> 8 & 0xFF;
      int var6 = i & 0xFF;
      vertexConsumer.vertex(matrix4f, -0.5F, -0.5F, 0.0F)
         .color(var4, var5, var6, j)
         .texture(0.0F, 1.0F)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(15728880)
         .normal(0.0F, 0.0F, 1.0F);
      vertexConsumer.vertex(matrix4f, 0.5F, -0.5F, 0.0F)
         .color(var4, var5, var6, j)
         .texture(1.0F, 1.0F)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(15728880)
         .normal(0.0F, 0.0F, 1.0F);
      vertexConsumer.vertex(matrix4f, 0.5F, 0.5F, 0.0F)
         .color(var4, var5, var6, j)
         .texture(1.0F, 0.0F)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(15728880)
         .normal(0.0F, 0.0F, 1.0F);
      vertexConsumer.vertex(matrix4f, -0.5F, 0.5F, 0.0F)
         .color(var4, var5, var6, j)
         .texture(0.0F, 0.0F)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(15728880)
         .normal(0.0F, 0.0F, 1.0F);
   }

   private static RenderLayer O00000000(Identifier identifier, RenderPipeline renderPipeline) {
      return RenderLayer.of(
         identifier.toString(), 1024, false, true, renderPipeline, MultiPhaseParameters.builder().texture(new Texture(identifier, false)).build(false)
      );
   }

   private static int O00000000(int i, float f) {
      int var2 = 6061311;

      try {
         Theme var3 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.WILD;
         if (var3 == Theme.CUSTOM && WildClient.O00000000.O0000000000O.O000000000 != null) {
            var2 = WildClient.O00000000.O0000000000O.O000000000.O00000000000O() & 16777215;
         } else if (var3 != null && var3.O00000000() != null) {
            var2 = var3.O00000000().getRGB() & 16777215;
         }
      } catch (Throwable var11) {
      }

      float var12 = f < 0.0F ? 0.0F : Math.min(f, 1.0F);
      int var4 = var2 >> 16 & 0xFF;
      int var5 = var2 >> 8 & 0xFF;
      int var6 = var2 & 0xFF;
      int var7 = Math.round(var4 + (235 - var4) * var12);
      int var8 = Math.round(var5 + (70 - var5) * var12);
      int var9 = Math.round(var6 + (70 - var6) * var12);
      int var10 = Math.max(0, Math.min(255, i));
      return var10 << 24 | var7 << 16 | var8 << 8 | var9;
   }

   static int O00000000(int i, int j) {
      return Math.max(0, Math.min(255, j)) << 24 | i & 16777215;
   }

   private void O0000000000O(MatrixStack matrixStack, Immediate immediate, LivingEntity livingEntity, float f) {
      MinecraftClient var5 = MinecraftClient.getInstance();
      if (livingEntity != null) {
         double var6 = 0.3 + livingEntity.getWidth() / 2.0F;
         O000000000O0O0.O00000000();
         int var8 = livingEntity.hurtTime;
         float var9 = (float)Math.sin(var8 * (Math.PI / 20));
         O000000000O0O0.O00000000(var9, 0.4F, O0000O0O00.O0000000000O0O);
         float var10 = O000000000O0O0.O000000000000();
         float var11 = 30.0F;
         float var12 = 0.4F - 0.1F * var10;
         double var13 = 6 - (int)(1.0F * var10);
         int var15 = 40 - (int)(12.0F * var10);
         Vec3d var16 = var5.gameRenderer.getCamera().getPos();
         Camera var17 = var5.gameRenderer.getCamera();
         if (O00000000O == 0L) {
            O00000000O = System.currentTimeMillis();
         }

         long var18 = System.currentTimeMillis();
         Vec3d var20 = livingEntity.getLerpedPos(f);
         var20 = new Vec3d(var20.x, var20.y + 0.32 + livingEntity.getHeight() / 2.0F, var20.z);
         double var21 = var20.x + 0.2;
         double var23 = var20.y;
         double var25 = var20.z;
         RenderLayer var27 = O00000000OO00;
         VertexConsumer var28 = immediate.getBuffer(var27);
         float var29 = (float)O000000000O0O.O0000000000O();
         int var30 = O00000000((int)(255.0F * var29), var10);
         int var31 = var30;
         int var32 = O00000000(var30, (int)(210.0F * var29));
         int var33 = O00000000(var30, (int)(150.0F * var29));
         int var34 = O00000000(var30, (int)(90.0F * var29));
         matrixStack.push();
         matrixStack.translate(var21 - var16.x, var23 - var16.y, var25 - var16.z);
         float var35 = 0.3F;

         for (int var36 = 0; var36 < var15; var36++) {
            double var37 = 0.05F * (var18 - O00000000O - var36 * var13) / var11;
            double var39 = Math.sin(var37 * Math.PI) * var6;
            double var41 = Math.cos(var37 * Math.PI) * var6;
            double var43 = Math.cos(var37 * Math.PI) * var6;
            float var45 = (float)var36 / (var15 - 1);
            float var46 = 1.0F - var45 * var35;
            float var47 = var12 * var46;
            matrixStack.push();
            matrixStack.translate(var39, var43, -var41);
            matrixStack.translate(-var47 / 2.0F, -var47 / 2.0F, 0.0F);
            matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var17.getYaw()));
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var17.getPitch()));
            matrixStack.translate(var47 / 2.0F, var47 / 2.0F, 0.0F);
            Matrix4f var48 = matrixStack.peek().getPositionMatrix();
            this.O00000000(var28, var48, var31, var32, var33, var34, var47);
            matrixStack.pop();
         }

         for (int var50 = 0; var50 < var15; var50++) {
            double var52 = 0.05F * (var18 - O00000000O - var50 * var13) / var11;
            double var54 = Math.sin(var52 * Math.PI) * var6;
            double var56 = Math.cos(var52 * Math.PI) * var6;
            double var58 = Math.sin(var52 * Math.PI) * var6;
            float var60 = (float)var50 / (var15 - 1);
            float var62 = 1.0F - var60 * var35;
            float var64 = var12 * var62;
            matrixStack.push();
            matrixStack.translate(-var54, var58, -var56);
            matrixStack.translate(-var64 / 2.0F, -var64 / 2.0F, 0.0F);
            matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var17.getYaw()));
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var17.getPitch()));
            matrixStack.translate(var64 / 2.0F, var64 / 2.0F, 0.0F);
            Matrix4f var66 = matrixStack.peek().getPositionMatrix();
            this.O00000000(var28, var66, var31, var32, var33, var34, var64);
            matrixStack.pop();
         }

         for (int var51 = 0; var51 < var15; var51++) {
            double var53 = 0.05F * (var18 - O00000000O - var51 * var13) / var11;
            double var55 = Math.sin(var53 * Math.PI) * var6;
            double var57 = Math.cos(var53 * Math.PI) * var6;
            double var59 = Math.sin(var53 * Math.PI) * var6;
            float var61 = (float)var51 / (var15 - 1);
            float var63 = 1.0F - var61 * var35;
            float var65 = var12 * var63;
            matrixStack.push();
            matrixStack.translate(var55, var59, var57);
            matrixStack.translate(-var65 / 2.0F, -var65 / 2.0F, 0.0F);
            matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var17.getYaw()));
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var17.getPitch()));
            matrixStack.translate(var65 / 2.0F, var65 / 2.0F, 0.0F);
            Matrix4f var67 = matrixStack.peek().getPositionMatrix();
            this.O00000000(var28, var67, var31, var32, var33, var34, var65);
            matrixStack.pop();
         }

         matrixStack.pop();
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, int i, int j, int k, int l, float f) {
      int var8 = i >> 16 & 0xFF;
      int var9 = i >> 8 & 0xFF;
      int var10 = i & 0xFF;
      int var11 = i >> 24 & 0xFF;
      int var12 = j >> 16 & 0xFF;
      int var13 = j >> 8 & 0xFF;
      int var14 = j & 0xFF;
      int var15 = j >> 24 & 0xFF;
      int var16 = k >> 16 & 0xFF;
      int var17 = k >> 8 & 0xFF;
      int var18 = k & 0xFF;
      int var19 = k >> 24 & 0xFF;
      int var20 = l >> 16 & 0xFF;
      int var21 = l >> 8 & 0xFF;
      int var22 = l & 0xFF;
      int var23 = l >> 24 & 0xFF;
      vertexConsumer.vertex(matrix4f, 0.0F, -f, 0.0F).texture(0.0F, 0.0F).color(var8, var9, var10, var11);
      vertexConsumer.vertex(matrix4f, -f, -f, 0.0F).texture(0.0F, 1.0F).color(var12, var13, var14, var15);
      vertexConsumer.vertex(matrix4f, -f, 0.0F, 0.0F).texture(1.0F, 1.0F).color(var16, var17, var18, var19);
      vertexConsumer.vertex(matrix4f, 0.0F, 0.0F, 0.0F).texture(1.0F, 0.0F).color(var20, var21, var22, var23);
   }

   private void O0000000000O0(MatrixStack matrixStack, Immediate immediate, LivingEntity livingEntity, float f) {
      if (livingEntity != null) {
         Vec3d var5 = O0000000000.gameRenderer.getCamera().getPos();
         long var6 = System.currentTimeMillis();
         byte var8 = 24;
         double var9 = 0.4 + livingEntity.getWidth() / 2.0F + 0.35F - 0.35F * O000000000O0O.O000000000000();
         double var11 = livingEntity.getHeight();
         Vec3d var13 = livingEntity.getLerpedPos(f);
         float var14 = (float)O000000000O0O.O0000000000O();
         O000000000O0O0.O00000000();
         int var15 = livingEntity.hurtTime;
         float var16 = (float)Math.sin(var15 * (Math.PI / 20));
         O000000000O0O0.O00000000(var16, 0.4F, O0000O0O00.O0000000000O0O);
         float var17 = O000000000O0O0.O000000000000();
         int var18 = O00000000(Math.round(70.0F * var14), var17);
         int var19 = O00000000(Math.round(225.0F * var14), var17);
         int var20 = O00000000(255, var17);

         for (int var21 = 0; var21 < var8; var21++) {
            double var22 = Math.sin(var21 * 132.12 + 4.12);
            double var24 = Math.cos(var21 * 453.21 + 1.23);
            double var26 = Math.sin(var21 * 789.34 + 9.87);
            double var30 = 1.0;
            double var32 = (Math.PI * 2) / var8 * var21;
            double var34 = var6 / 6000.0 * (Math.PI * 2) * var30;
            double var36 = var34 + var32;
            double var38 = Math.cos(var36) * var9;
            double var40 = Math.sin(var36) * var9;
            double var42 = 1.0 + var22 * 0.2;
            double var44 = var32 + var26 * 2.0;
            double var46 = Math.sin(var6 / 9000.0 * (Math.PI * 2) * var42 + var44) * 0.45 + 0.55;
            double var48 = var46 * var11;
            double var50 = var13.x + var38 - var5.x;
            double var52 = var13.y + var48 - var5.y;
            double var54 = var13.z + var40 - var5.z;
            matrixStack.push();
            matrixStack.translate(var50, var52, var54);
            float var56 = 1.0F + 0.15F * (float)Math.sin(var6 / 400.0 + var21 * 1.5);
            float var57 = 0.19F * var56;
            double var58 = var17 * (0.5 + 0.5 * Math.sin(var21 * 123.45));
            if (var58 > 0.05) {
               var57 = (float)(var57 * (1.0 - var58 * 0.2));
               double var60 = var58 * 0.4;
               matrixStack.translate(Math.cos(var36) * var60, 0.0, Math.sin(var36) * var60);
            }

            matrixStack.push();
            float var68 = 12000.0F + (float)var26 * 2000.0F;
            float var61 = (float)(var6 % (long)Math.abs(var68)) / Math.abs(var68) * 360.0F;
            if (var21 % 3 == 0) {
               matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var61));
               matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var61));
            } else if (var21 % 3 == 1) {
               matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var61));
               matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var61));
            } else {
               matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var61));
               matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var61));
            }

            VertexConsumer var62 = immediate.getBuffer(O00000000OOOOO);
            Matrix4f var63 = matrixStack.peek().getPositionMatrix();
            O00000OO00OOO0$W226$W227.O00000000(var62, var63, var18, var57);
            VertexConsumer var64 = immediate.getBuffer(O0000000O0);
            O00000OO00OOO0$W226$W227.O000000000(var64, var63, var19, var57);
            matrixStack.pop();
            matrixStack.push();
            matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-O0000000000.gameRenderer.getCamera().getYaw()));
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(O0000000000.gameRenderer.getCamera().getPitch()));
            VertexConsumer var65 = immediate.getBuffer(O00000000OO000);
            Matrix4f var66 = matrixStack.peek().getPositionMatrix();
            float var67 = var57 * 2.0F;
            matrixStack.scale(var67, var67, var67);
            O00000000(var65, var66, var20, (int)(70.0F * var14));
            matrixStack.pop();
            matrixStack.pop();
         }
      }
   }

   private void O0000000000O00(MatrixStack matrixStack, Immediate immediate, LivingEntity livingEntity, float f) {
      if (livingEntity == null) {
         this.O00000000O000.clear();
      } else {
         Iterator var5 = this.O00000000O000.iterator();

         while (var5.hasNext()) {
            TargetESP.W188 var6 = (TargetESP.W188)var5.next();
            if (var6.O0000000000O0.O0000000000000() != O0000O00OOO0OO.FORWARDS && var6.O0000000000O0.O00000000000O0() <= 0.0F) {
               var5.remove();
            }
         }

         long var19 = System.currentTimeMillis();
         O00000000O000O = Math.max(0.001F, Math.min(0.1F, (float)(var19 - O00000000O0000) / 1000.0F));
         O00000000O0000 = var19;
         if (this.O00000000O000.size() < 50) {
            this.O00000000O0O0 = this.O00000000O0O0 + O00000000O000O;

            while (this.O00000000O0O0 >= 0.02F && this.O00000000O000.size() < 50) {
               this.O00000000O0O0 -= 0.02F;

               for (int var8 = 0; var8 < 1 && this.O00000000O000.size() < 50; var8++) {
                  double var9 = O0000O00OO0OO0.O00000000(0.0F, 360.0F);
                  double var11 = Math.cos(var9 * Math.PI / 180.0) * 0.7F;
                  double var13 = O0000O00OO0OO0.O0000000000O0(0.04F, 0.2F);
                  double var15 = Math.sin(var9 * Math.PI / 180.0) * 0.7F;
                  this.O00000000O000.add(new TargetESP.W188(livingEntity, var11, var13, var15));
               }
            }
         }

         if (!this.O00000000O000.isEmpty()) {
            float var20 = (float)O000000000O0O.O0000000000O();
            O000000000O0O0.O00000000();
            int var21 = livingEntity.hurtTime;
            float var10 = (float)Math.sin(var21 * (Math.PI / 20));
            O000000000O0O0.O00000000(var10, 0.4F, O0000O0O00.O0000000000O0O);
            float var22 = O000000000O0O0.O000000000000();
            int var12 = O00000000(255, var22);
            int var23 = O00000000(255, var22);
            Vec3d var14 = O0000000000.gameRenderer.getCamera().getPos();
            float var24 = O0000000000.gameRenderer.getCamera().getPitch();
            float var16 = O0000000000.gameRenderer.getCamera().getYaw();

            for (TargetESP.W188 var18 : this.O00000000O000) {
               var18.O00000000(f);
               var18.O00000000(matrixStack, immediate, var12, var23, var20, var22, f, var14, var24, var16, O00000000OO000);
            }
         }
      }
   }

   static class W188 {
      double O00000000;
      double O000000000;
      double O0000000000;
      double O00000000000;
      double O000000000000;
      double O0000000000000;
      double O000000000000O;
      double O00000000000O;
      double O00000000000O0;
      long O00000000000OO;
      LivingEntity O0000000000O;
      O0000O00OOO00 O0000000000O0 = new O0000O0O0000O(500, 1.0);
      private double O0000000000O00;

      public W188(LivingEntity livingEntity, double d, double e, double f) {
         this.O00000000 = d;
         this.O000000000 = e;
         this.O0000000000 = f;
         this.O0000000000O = livingEntity;
         this.O00000000000OO = System.currentTimeMillis();
         this.O0000000000O00 = O0000O00OO0OO0.O0000000000O0(0.01F, 0.04F);
      }

      public long O00000000() {
         return this.O00000000000OO;
      }

      public void O00000000(float f) {
         long var2 = System.currentTimeMillis();
         long var4 = var2 - this.O00000000();
         this.O0000000000O0.O000000000(var4 <= 800L ? O0000O00OOO0OO.FORWARDS : O0000O00OOO0OO.BACKWARDS);
         this.O000000000 = this.O000000000 + this.O0000000000O00 * (TargetESP.O00000000O000O * 60.0F);
         if (this.O0000000000O != null) {
            Vec3d var6 = this.O0000000000O.getLerpedPos(f);
            this.O000000000000O = this.O00000000 + var6.x;
            this.O00000000000O = this.O000000000 + var6.y;
            this.O00000000000O0 = this.O0000000000 + var6.z;
         }
      }

      public void O00000000(
         MatrixStack matrixStack, Immediate immediate, int i, int j, float f, float g, float h, Vec3d vec3d, float k, float l, RenderLayer renderLayer
      ) {
         long var12 = System.currentTimeMillis();
         double var14 = (var12 - this.O00000000()) / 10.0;
         double var16 = O0000O00OO0OO0.O000000000000O(0.2F);
         this.O00000000000 = O0000O00OO0OO0.O0000000000(this.O00000000000, this.O000000000000O - vec3d.x, var16);
         this.O000000000000 = O0000O00OO0OO0.O0000000000(this.O000000000000, this.O00000000000O - vec3d.y, var16);
         this.O0000000000000 = O0000O00OO0OO0.O0000000000(this.O0000000000000, this.O00000000000O0 - vec3d.z, var16);
         float var18 = this.O0000000000O0.O00000000000O0();
         if (!(var18 <= 0.0F)) {
            float var19 = 1.0F + 0.15F * (float)Math.sin((var12 - this.O00000000()) / 400.0);
            float var20 = 0.12F + 0.04F * var18;
            matrixStack.push();
            matrixStack.translate(this.O00000000000, this.O000000000000, this.O0000000000000);
            matrixStack.push();
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees((float)var14));
            matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees((float)var14));
            matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees((float)var14));
            Matrix4f var21 = matrixStack.peek().getPositionMatrix();
            int var22 = TargetESP.O00000000(i, (int)(70.0F * f * var18));
            VertexConsumer var23 = immediate.getBuffer(TargetESP.O00000000OOOOO);
            O00000OO00OOO0$W226$W227.O00000000(var23, var21, var22, var20);
            int var24 = TargetESP.O00000000(i, (int)(225.0F * f * var18));
            VertexConsumer var25 = immediate.getBuffer(TargetESP.O0000000O0);
            O00000OO00OOO0$W226$W227.O000000000(var25, var21, var24, var20);
            matrixStack.pop();
            matrixStack.push();
            matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-l));
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(k));
            VertexConsumer var26 = immediate.getBuffer(renderLayer);
            Matrix4f var27 = matrixStack.peek().getPositionMatrix();
            float var28 = var20 * 2.0F;
            matrixStack.scale(var28, var28, var28);
            TargetESP.O00000000(var26, var27, j, (int)(70.0F * f * var18));
            matrixStack.pop();
            matrixStack.pop();
         }
      }
   }

   record W189(float x, float y, float w, float h) {
   }
}
