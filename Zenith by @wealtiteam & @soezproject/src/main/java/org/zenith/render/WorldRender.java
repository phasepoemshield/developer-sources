package org.zenith.render;

import org.zenith.core.NbtEditor;
import org.zenith.core.ColorAnimator;
import org.zenith.core.TextScanner;
import org.zenith.core.InventoryUtils;
import org.zenith.core.ServerConfigStore;
import org.zenith.event.Event18;
import org.zenith.event.Event19;
import org.zenith.event.Event49;
import org.zenith.module.Module;

import org.zenith.util.ArgbColor;
import org.zenith.core.ItemRegistry;
import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.util.ColorUtils;
import org.zenith.util.MathUtils;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.BlockPosEntry;
import org.zenith.core.HudPreviewItem;
import org.zenith.config.CosmeticManager;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.core.ClientProvider;
import org.zenith.core.AvatarRenderer;

import org.zenith.module.EntityESP;

import org.zenith.event.EventGetBasicProjectionMatrixHook;
import org.zenith.event.EventHookWorldRender;




import net.minecraft.client.MinecraftClient;
import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.MatrixStack.Entry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL11;

public final class WorldRender implements ClientProvider {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final List<WorldRender_Var7> list95 = new ArrayList<>();
   public static final List<WorldRender_Var160> list96 = new ArrayList<>();
   public static final List<WorldRender_Var159> list97 = new ArrayList<>();
   public static final List<WorldRender_Var159> list98 = new ArrayList<>();
   public static final List<WorldRender_Var165> list99 = new ArrayList<>();
   public static final List<WorldRender_Var165> list100 = new ArrayList<>();
   public static Tessellator tessellator = Tessellator.getInstance();
   public static Matrix4f matrix4f12 = new Matrix4f();
   public static Matrix4f matrix4f13 = new Matrix4f();
   public static Matrix4f matrix4f14 = new Matrix4f();
   public static final Identifier identifier11 = Identifier.of("zenith", "textures/capture.png");
   public static final Identifier identifier12 = Identifier.of("zenith", "textures/expensive.png");
   public static final Identifier identifier13 = Identifier.of("zenith", "textures/expensive2.png");
   public static final Identifier identifier14 = Identifier.of("zenith", "textures/glow.png");
   public static final float float276 = 25.0F;
   public static final float float277 = 0.5F;
   public static final float float278 = 0.15F;
   public static float float279 = 1.0F;
   public static float float280 = 1.0F;
   public static float float281 = 0.0F;
   public static float float282 = 0.0F;
   public static float float283 = 0.0F;
   public static boolean boolean179 = false;
   public static final Random random6 = new Random();
   static ArrayList<WorldRender_Var143> val213 = new ArrayList<>();

   public static void ItemRegistry(MatrixStack var0) {
      var entry = var0.peek();
      if (!list100.isEmpty()) {
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.disableDepthTest();
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         BufferBuilder bufferbuilder = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
         list100.forEach(
            var2x -> on23(
                  entry,
                  bufferbuilder,
                  var2x.vec3d12(),
                  var2x.vec3d13(),
                  var2x.vec3d14(),
                  var2x.vec3d15(),
                  var2x.int116(),
                  var2x.int117(),
                  var2x.int118(),
                  var2x.int119()
               )
         );
         BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
         RenderSystem.enableDepthTest();
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         list100.clear();
      }

      if (!list98.isEmpty()) {
         GL11.glEnable(2881);
         var set = list98.stream().map(var0x -> var0x.float54()).collect(Collectors.toCollection(LinkedHashSet::new));
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.disableDepthTest();
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
         RenderSystem.setShader(ShaderProgramKeys.RENDERTYPE_LINES);
         set.forEach(
            var1x -> {
               RenderSystem.lineWidth(var1x);
               BufferBuilder bufferbuilder2 = tessellator.begin(DrawMode.LINES, VertexFormats.LINES);
               list98.stream()
                  .filter(var1xx -> var1xx.float54() == var1x)
                  .forEach(
                     var2x -> on23(
                           var0, bufferbuilder2, var2x.vec3d10(), var2x.vec3d11(), var2x.int114(), var2x.int115()
                        )
                  );
               BufferRenderer.drawWithGlobalProgram(bufferbuilder2.end());
            }
         );
         RenderSystem.enableDepthTest();
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         list98.clear();
         GL11.glDisable(2881);
      }

      if (!list97.isEmpty()) {
         GL11.glEnable(2881);
         var set1 = list97.stream().map(var0x -> var0x.float54()).collect(Collectors.toCollection(LinkedHashSet::new));
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(false);
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
         RenderSystem.setShader(ShaderProgramKeys.RENDERTYPE_LINES);
         set1.forEach(
            var1x -> {
               RenderSystem.lineWidth(var1x);
               BufferBuilder bufferbuilder2 = tessellator.begin(DrawMode.LINES, VertexFormats.LINES);
               list97.stream()
                  .filter(var1xx -> var1xx.float54() == var1x)
                  .forEach(
                     var2x -> on23(
                           var0, bufferbuilder2, var2x.vec3d10(), var2x.vec3d11(), var2x.int114(), var2x.int115()
                        )
                  );
               BufferRenderer.drawWithGlobalProgram(bufferbuilder2.end());
            }
         );
         RenderSystem.depthMask(true);
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         list97.clear();
         GL11.glDisable(2881);
      }

      if (!list99.isEmpty()) {
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         BufferBuilder bufferbuilder1 = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
         list99.forEach(
            var2x -> on23(
                  entry,
                  bufferbuilder1,
                  var2x.vec3d12(),
                  var2x.vec3d13(),
                  var2x.vec3d14(),
                  var2x.vec3d15(),
                  var2x.int116(),
                  var2x.int117(),
                  var2x.int118(),
                  var2x.int119()
               )
         );
         BufferRenderer.drawWithGlobalProgram(bufferbuilder1.end());
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         list99.clear();
      }
   }

   public static void on23(BlockPos var0, VoxelShape var1, int var2, float var3) {
      on23(var0, var1, var2, var3, true, false);
   }

   public static void on23(BlockPos var0, VoxelShape var1, int var2, float var3, boolean var4, boolean var5) {
      if (ScreenProjection.NbtEditor(var1.getBoundingBox().offset(var0))) {
         list96.stream()
            .filter(var1x -> var1x.voxelShape().equals(var1))
            .findFirst()
            .ifPresentOrElse(
               var5x -> var5x.list37().forEach(var5xx -> on23(var5xx.offset(var0), var2, var3, true, var4, var5)),
               () -> list96.add(new WorldRender_Var160(var1, var1.getBoundingBoxes()))
            );
      }
   }

   public static void UiAnimation(BlockPos var0, VoxelShape var1, int var2, float var3, boolean var4, boolean var5) {
      Vec3d vec3d = Vec3d.of(var0);
      if (ScreenProjection.NbtEditor(var1.getBoundingBox().offset(vec3d))) {
         var list = var1.getBoundingBoxes();
         list95.stream()
            .filter(var1x -> var1x.list39().equals(list))
            .findFirst()
            .ifPresentOrElse(
               var5x -> {
                  var5x.list39().forEach(var5xx -> on23(var5xx.offset(vec3d), var2, var3, false, var4, var5));
                  var5x.list38()
                     .forEach(var4xx -> on23(var4xx.vec3d10().add(vec3d), var4xx.vec3d11().add(vec3d), var2, var3, var5));
               },
               () -> {
                  var arraylist = new ArrayList();
                  var1.forEachEdge(
                     (var1x, var3x, var5x, var7x, var9, var11) -> arraylist.add(
                           new WorldRender_Var159(new Vec3d(var1x, var3x, var5x), new Vec3d(var7x, var9, var11), 0, 0, 0.0F)
                        )
                  );
                  list95.add(new WorldRender_Var7(var1, arraylist, var1.getBoundingBoxes()));
               }
            );
      }
   }

   public static void on23(Box var0, int var1, float var2) {
      on23(var0, var1, var1, var2);
   }

   public static void on23(Box var0, int var1, int var2, float var3) {
      on23(var0, var1, var2, var3, true, true, false);
   }

   public static void on23(Box var0, int var1, float var2, boolean var3, boolean var4, boolean var5) {
      on23(var0, var1, var1, var2, var3, var4, var5);
   }

   public static void on23(Box var0, int var1, int var2, float var3, boolean var4, boolean var5, boolean var6) {
      var0 = var0.expand(0.001);
      if (ScreenProjection.NbtEditor(var0)) {
         double d0 = var0.minX;
         double d1 = var0.minY;
         double d2 = var0.minZ;
         double d3 = var0.maxX;
         double d4 = var0.maxY;
         double d5 = var0.maxZ;
         boolean flag = EntityESP.entityESP.box4();
         int i = flag ? ColorUtils.ColorAnimator(var1, 0.9F) : ColorUtils.ColorAnimator(var1, 0.1F);
         int j = flag ? ColorUtils.ColorAnimator(var2, 0.1F) : i;
         int k = flag ? ColorUtils.ColorAnimator(var1, 0.5F) : var1;
         int l = flag ? ColorUtils.ColorAnimator(var2, 1.0F) : var1;
         if (var5) {
            on23(new Vec3d(d0, d1, d2), new Vec3d(d3, d1, d2), new Vec3d(d3, d1, d5), new Vec3d(d0, d1, d5), i, i, i, i, var6);
            on23(new Vec3d(d0, d1, d2), new Vec3d(d0, d4, d2), new Vec3d(d3, d4, d2), new Vec3d(d3, d1, d2), i, j, j, i, var6);
            on23(new Vec3d(d3, d1, d2), new Vec3d(d3, d4, d2), new Vec3d(d3, d4, d5), new Vec3d(d3, d1, d5), i, j, j, i, var6);
            on23(new Vec3d(d0, d1, d5), new Vec3d(d3, d1, d5), new Vec3d(d3, d4, d5), new Vec3d(d0, d4, d5), i, i, j, j, var6);
            on23(new Vec3d(d0, d1, d2), new Vec3d(d0, d1, d5), new Vec3d(d0, d4, d5), new Vec3d(d0, d4, d2), i, i, j, j, var6);
            on23(new Vec3d(d0, d4, d2), new Vec3d(d0, d4, d5), new Vec3d(d3, d4, d5), new Vec3d(d3, d4, d2), j, j, j, j, var6);
         }

         if (var4) {
            on23(d0, d1, d2, d3, d1, d2, k, var3, var6);
            on23(d3, d1, d2, d3, d1, d5, k, var3, var6);
            on23(d3, d1, d5, d0, d1, d5, k, var3, var6);
            on23(d0, d1, d5, d0, d1, d2, k, var3, var6);
            on23(new Vec3d(d0, d1, d5), new Vec3d(d0, d4, d5), k, l, var3, var6);
            on23(new Vec3d(d0, d1, d2), new Vec3d(d0, d4, d2), k, l, var3, var6);
            on23(new Vec3d(d3, d1, d5), new Vec3d(d3, d4, d5), k, l, var3, var6);
            on23(new Vec3d(d3, d1, d2), new Vec3d(d3, d4, d2), k, l, var3, var6);
            on23(d0, d4, d2, d3, d4, d2, l, var3, var6);
            on23(d3, d4, d2, d3, d4, d5, l, var3, var6);
            on23(d3, d4, d5, d0, d4, d5, l, var3, var6);
            on23(d0, d4, d5, d0, d4, d2, l, var3, var6);
         }
      }
   }

   public static void on23(MatrixStack var0, VertexConsumer var1, Vec3d var2, Vec3d var3, int var4) {
      on23(var0, var1, var2.toVector3f(), var3.toVector3f(), var4, var4);
   }

   public static void on23(MatrixStack var0, VertexConsumer var1, Vec3d var2, Vec3d var3, int var4, int var5) {
      on23(var0, var1, var2.toVector3f(), var3.toVector3f(), var4, var5);
   }

   public static void on23(MatrixStack var0, VertexConsumer var1, Vector3f var2, Vector3f var3, int var4, int var5) {
      var0.push();
      var entry = var0.peek();
      Vector3f vector3f = UiAnimation(var2.x, var2.y, var2.z, var3.x, var3.y, var3.z);
      var1.vertex(entry, var2).color(var4).normal(entry, vector3f.x(), vector3f.y(), vector3f.z());
      var1.vertex(entry, var3).color(var5).normal(entry, vector3f.x(), vector3f.y(), vector3f.z());
      var0.pop();
   }

   public static void on23(Entry var0, VertexConsumer var1, Vec3d var2, Vec3d var3, Vec3d var4, Vec3d var5, int var6) {
      on23(var0, var1, var2.toVector3f(), var3.toVector3f(), var4.toVector3f(), var5.toVector3f(), var6, var6, var6, var6);
   }

   public static void on23(Entry var0, VertexConsumer var1, Vector3f var2, Vector3f var3, Vector3f var4, Vector3f var5, int var6) {
      on23(var0, var1, var2, var3, var4, var5, var6, var6, var6, var6);
   }

   public static void on23(
      Entry var0, VertexConsumer var1, Vec3d var2, Vec3d var3, Vec3d var4, Vec3d var5, int var6, int var7, int var8, int var9
   ) {
      on23(var0, var1, var2.toVector3f(), var3.toVector3f(), var4.toVector3f(), var5.toVector3f(), var6, var7, var8, var9);
   }

   public static void on23(
      Entry var0, VertexConsumer var1, Vector3f var2, Vector3f var3, Vector3f var4, Vector3f var5, int var6, int var7, int var8, int var9
   ) {
      var1.vertex(var0, var2).color(var6);
      var1.vertex(var0, var3).color(var7);
      var1.vertex(var0, var4).color(var8);
      var1.vertex(var0, var5).color(var9);
   }

   public static Vector3f UiAnimation(float var0, float var1, float var2, float var3, float var4, float var5) {
      float f = var3 - var0;
      float f1 = var4 - var1;
      float f2 = var5 - var2;
      float f3 = MathHelper.sqrt(f * f + f1 * f1 + f2 * f2);
      return new Vector3f(f / f3, f1 / f3, f2 / f3);
   }

   public static void EventGetBasicProjectionMatrixHook(float var0) {
      float281 = float279;
      float279 = float279 + float280 * var0;
      float f = float280;
      if (f > 25.0F || f < -25.0F) {
         boolean179 = f > 25.0F;
      }

      float280 = boolean179 ? f - 0.5F : f + 0.5F;
      float282 = float283;
      float283 += 0.15F * var0;
      if (!val213.isEmpty()) {
         val213.removeIf(WorldRender_Var143::var1434);
      }
   }

   public static void on23(double var0, double var2, double var4, double var6, double var8, double var10, int var12, float var13, boolean var14) {
      on23(var0, var2, var4, var6, var8, var10, var12, var12, var13, var14);
   }

   public static void on23(
      double var0, double var2, double var4, double var6, double var8, double var10, int var12, int var13, float var14, boolean var15
   ) {
      on23(new Vec3d(var0, var2, var4), new Vec3d(var6, var8, var10), var12, var13, var14, var15);
   }

   public static void on23(Vec3d var0, Vec3d var1, int var2, float var3, boolean var4) {
      on23(var0, var1, var2, var2, var3, var4);
   }

   public static void on23(Vec3d var0, Vec3d var1, int var2, int var3, float var4, boolean var5) {
      Vec3d vec3d = minecraftClient3.getEntityRenderDispatcher().camera.getPos();
      WorldRender_Var159 i1li1li11i11l1111_ii1il11l111ii11iil = new WorldRender_Var159(
         var0.subtract(vec3d), var1.subtract(vec3d), var2, var3, var4
      );
      if (var5) {
         list97.add(i1li1li11i11l1111_ii1il11l111ii11iil);
      } else {
         list98.add(i1li1li11i11l1111_ii1il11l111ii11iil);
      }
   }

   public static void on23(Vec3d var0, Vec3d var1, Vec3d var2, Vec3d var3, int var4, boolean var5) {
      on23(var0, var1, var2, var3, var4, var4, var4, var4, var5);
   }

   public static void on23(Vec3d var0, Vec3d var1, Vec3d var2, Vec3d var3, int var4, int var5, int var6, int var7, boolean var8) {
      Vec3d vec3d = minecraftClient3.getEntityRenderDispatcher().camera.getPos();
      WorldRender_Var165 i1li1li11i11l1111_illi1l1l1 = new WorldRender_Var165(
         var0.subtract(vec3d), var1.subtract(vec3d), var2.subtract(vec3d), var3.subtract(vec3d), var4, var5, var6, var7
      );
      if (var8) {
         list99.add(i1li1li11i11l1111_illi1l1l1);
      } else {
         list100.add(i1li1li11i11l1111_illi1l1l1);
      }
   }

   public static void on23(LivingEntity var0, float var1, float var2, float var3, Identifier var4) {
      float f = (2.2F - var2) * var1;
      Camera camera = minecraftClient3.getEntityRenderDispatcher().camera;
      Vec3d vec3d = MathUtils.CloudResponse(var0).subtract(camera.getPos());
      MatrixStack matrixstack = new MatrixStack();
      matrixstack.push();
      matrixstack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));
      matrixstack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(camera.getYaw() + 180.0F));
      matrixstack.translate(vec3d.x, vec3d.y + var0.getBoundingBox().getLengthY() / 2.0, vec3d.z);
      matrixstack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getYaw()));
      matrixstack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));
      matrixstack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(MathUtils.Event49(float281, float279)));
      on23(1.0F, 1.0F - var3, 1.0F - var3, var2, () -> {
         RenderSystem.enableBlend();
         RenderSystem.disableDepthTest();
         RenderSystem.disableCull();
         RenderSystem.setShaderTexture(0, var4);
         matrixstack.translate((double)(-f / 2.0F), (double)(-f / 2.0F), -0.01);
         Matrix4f matrix4f = matrixstack.peek().getPositionMatrix();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         BufferBuilder bufferbuilder = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         bufferbuilder.vertex(matrix4f, 0.0F, f, 0.0F).texture(0.0F, 1.0F).color(ColorUtils.ServerConfigStore(0));
         bufferbuilder.vertex(matrix4f, f, f, 0.0F).texture(1.0F, 1.0F).color(ColorUtils.ServerConfigStore(0));
         bufferbuilder.vertex(matrix4f, f, 0.0F, 0.0F).texture(1.0F, 0.0F).color(ColorUtils.ServerConfigStore(90));
         bufferbuilder.vertex(matrix4f, 0.0F, 0.0F, 0.0F).texture(0.0F, 0.0F).color(ColorUtils.ServerConfigStore(180));
         BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
         RenderSystem.enableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.disableBlend();
      });
      matrixstack.pop();
   }

   public static void on23(MatrixStack var0, LivingEntity var1, UiAnimation var2, float var3) {
      double d0 = (double)MathUtils.Event49(float282, float283);
      Vec3d vec3d = MathUtils.CloudResponse(var1);
      boolean flag = Objects.requireNonNull(minecraftClient3.player).canSee(var1);
      float f = var1.getWidth() * Math.min(1.8F, 0.9F / (var2.Event19() == 1.0F ? var2.Event18() : 1.0F));
      float f1 = var1.getHeight();
      float f2 = (float)(MathUtils.InventoryUtils(d0) * (double)f1);
      on23(vec3d, f, (double)f2, 30);
      GL11.glEnable(2881);
      if (flag) {
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(false);
      } else {
         RenderSystem.disableDepthTest();
      }

      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(SrcFactor.SRC_ALPHA, DstFactor.ONE, SrcFactor.ZERO, DstFactor.ONE);
      RenderSystem.disableCull();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderTexture(0, identifier14);
      BufferBuilder bufferbuilder = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      Camera camera = minecraftClient3.getEntityRenderDispatcher().camera;
      val213.forEach(var4x -> var4x.on23(var0, var3, var2.Event18(), bufferbuilder));
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      int i = ColorUtils.ColorAnimator(
         ZenithClient.on23().TextScanner().getClientColor(90).Easing(ArgbColor.var11937, var3).call001(),
         var2.Event18()
      );
      float f3 = 0.0F;

      for (float f4 = 90.0F; f3 <= f4; f3++) {
         Vec3d vec3d1 = MathUtils.on23(f3, f4, (double)f);
         Vec3d vec3d2 = MathUtils.on23(f3 + 1.0F, f4, (double)f);
         on23(vec3d.add(vec3d1.x, vec3d1.y + (double)f2, vec3d1.z), vec3d.add(vec3d2.x, vec3d2.y + (double)f2, vec3d2.z), i, 3.0F, flag);
      }

      if (flag) {
         RenderSystem.depthMask(true);
         RenderSystem.disableDepthTest();
      } else {
         RenderSystem.enableDepthTest();
      }

      GL11.glDisable(2881);
   }

   public static void on23(Vec3d var0, float var1, double var2, int var4) {
      for (int i = 0; i < var4; i++) {
         double d0 = random6.nextDouble() * Math.PI * 2.0;
         double d1 = random6.nextDouble();
         double d2 = (double)var1;
         double d3 = var0.x + Math.cos(d0) * d2;
         double d4 = var0.z + Math.sin(d0) * d2;
         double d5 = var0.y + var2;
         val213.add(new WorldRender_Var143(d3, d5, d4));
      }
   }

   public static void on23(
      EventHookWorldRender var0, float var1, float var2, int var3, int var4, float var5, float var6, float var7, float var8, LivingEntity var9
   ) {
      try {
         Camera camera = minecraftClient3.gameRenderer.getCamera();
         boolean flag = Objects.requireNonNull(minecraftClient3.player).canSee(var9);
         double d0 = AvatarRenderer.NbtEditor(var9.prevX, var9.getX(), (double)getTickDelta()) - camera.getPos().x;
         double d1 = AvatarRenderer.NbtEditor(var9.prevY, var9.getY(), (double)getTickDelta()) - camera.getPos().y;
         double d2 = AvatarRenderer.NbtEditor(var9.prevZ, var9.getZ(), (double)getTickDelta()) - camera.getPos().z;
         float f = (float)AvatarRenderer.NbtEditor((double)(var9.age - 1), (double)var9.age, (double)getTickDelta()) * var8;
         if (flag) {
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(false);
         } else {
            RenderSystem.disableDepthTest();
         }

         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(SrcFactor.SRC_ALPHA, DstFactor.ONE, SrcFactor.ZERO, DstFactor.ONE);
         RenderSystem.setShaderTexture(0, identifier14);
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         BufferBuilder bufferbuilder = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         if (flag) {
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(false);
         } else {
            RenderSystem.disableDepthTest();
         }

         float[] afloat = new float[]{1.0F, 1.0F, 1.0F};
         float[] afloat1 = new float[]{223.0F, 259.0F, 223.0F};
         float[] afloat2 = new float[]{1.0F, 1.18F, 0.74F};
         float f1 = 0.43F;

         for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= var3; j++) {
               float f2 = (float)j / (float)var3;
               float f3 = 0.5F * var7;
               f3 = MathHelper.lerp(f2, 0.0F, f3);
               double d3 = (double)(
                  (((float)j * f1 / 1.5F / 8.0F * afloat[i] + f * afloat[i] + afloat1[i]) * (float)var4 + (float)(i * 120)) % (float)(var4 * 360)
               );
               long k = 2000L;
               double d4 = Math.toRadians(d3);
               double d5 = Math.sin(Math.toRadians((double)(f * 2.0F * afloat2[i] + (float)j * f1 / 8.0F * (float)(i + 1))) * (double)var6) / (double)var5;
               MatrixStack matrixstack = new MatrixStack();
               matrixstack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));
               matrixstack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(camera.getYaw() + 180.0F));
               matrixstack.translate(
                  d0 + Math.cos(d4) * (double)var9.getWidth(),
                  d1 + (double)(var9.getHeight() / 2.5F) + d5 + (double)((float)i * 0.3F),
                  d2 + Math.sin(d4) * (double)var9.getWidth()
               );
               matrixstack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-camera.getYaw()));
               matrixstack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));
               Matrix4f matrix4f = matrixstack.peek().getPositionMatrix();
               int l = ColorUtils.ColorAnimator(
                  ZenithClient.on23()
                     .TextScanner()
                     .getClientColor(90)
                     .Easing(ArgbColor.var11937, var2)
                     .call001(),
                  f2 * var1
               );
               AvatarRenderer.Easing(matrix4f, bufferbuilder, -f3 / 2.0F, -f3 / 2.0F, f3, f3, l);
            }
         }

         BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
         RenderSystem.disableBlend();
         if (flag) {
            RenderSystem.depthMask(true);
            RenderSystem.disableDepthTest();
         } else {
            RenderSystem.enableDepthTest();
         }
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   public static void on23(float var0, float var1, float var2, float var3, Runnable var4) {
      RenderSystem.setShaderColor(
         MathHelper.clamp(var0, 0.0F, 1.0F), MathHelper.clamp(var1, 0.0F, 1.0F), MathHelper.clamp(var2, 0.0F, 1.0F), MathHelper.clamp(var3, 0.0F, 1.0F)
      );
      var4.run();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static float getTickDelta() {
      return minecraftClient3.getRenderTickCounter().getTickDelta(false);
   }

   public WorldRender() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public static void on23(Matrix4f var0) {
      matrix4f12 = var0;
   }

   public static void UiAnimation(Matrix4f var0) {
      matrix4f13 = var0;
   }

   public static void Easing(Matrix4f var0) {
      matrix4f14 = var0;
   }

   public static Matrix4f string39() {
      return matrix4f12;
   }

   public static Matrix4f int141() {
      return matrix4f13;
   }

   public static Matrix4f itemStack7() {
      return matrix4f14;
   }
}
