package l;

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.MatrixStack.Entry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4i;
import org.lwjgl.opengl.GL11;

public final class Helper183 implements Helper160 {
   private static final Map<VoxelShape, Pair<List<Box>, List<Helper180>>> SHAPE_OUTLINES = new HashMap<>();
   private static final Map<VoxelShape, List<Box>> SHAPE_BOXES = new HashMap<>();
   public static final List<Helper181> TEXTURE_DEPTH = new ArrayList<>();
   public static final List<Helper181> TEXTURE = new ArrayList<>();
   public static final List<Helper180> LINE_DEPTH = new ArrayList<>();
   public static final List<Helper180> LINE = new ArrayList<>();
   public static final List<Helper179> QUAD_DEPTH = new ArrayList<>();
   public static final List<Helper179> QUAD = new ArrayList<>();
   public static Matrix4f lastProjMat = new Matrix4f();
   public static Entry lastWorldSpaceMatrix = new MatrixStack().peek();
   private static final Identifier captureId = Identifier.of("textures/capture1.png");
   public static final Identifier bloom = Identifier.of("textures/teremok/particles/bloom.png");
   public static final List<Helper182> crystalList = new ArrayList<>();
   private static float prevCubeSize = 0.0F;
   private static final Random random = new Random();
   private static final List<Vec3d> particles = new ArrayList<>();
   private static final int GHOST_ORBIT_COUNT = 3;
   private static final int GHOST_ORBIT_TRAIL_LENGTH = 100;
   private static final List<Vec3d>[] ghostOrbitTrails = method1556();
   private static float ghostOrbitAngle;
   private static long lastGhostOrbitTime;
   private static float espValue = 1.0F;
   private static float espSpeed = 1.0F;
   private static float prevEspValue;
   private static float circleStep;
   private static float jelloMoving;
   private static boolean flipSpeed;

   public static void method1541(Entity var0, Vec3d var1, float var2, int var3, MatrixStack var4, float var5) {
      if (var0 instanceof LivingEntity var6) {
         var4.push();
         var4.translate(var1.x, var1.y, var1.z);
         var4.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var2));
         var4.scale(1.0F, 1.0F, 1.0F);
         RenderSystem.enableBlend();
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_SRC_ALPHA);
         RenderSystem.enableDepthTest();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var3 / 255.0F);
         EntityRenderer var7 = mc.getEntityRenderDispatcher().getRenderer(var0);
         if (var7 != null) {
            int var8 = var7.getLight(var6, var5);
            Immediate var9 = mc.getBufferBuilders().getEntityVertexConsumers();
            EntityRenderState var10 = var7.getAndUpdateRenderState(var6, var5);
            if (var10 != null) {
               var7.render(var10, var4, var9, var8);
            }

            var9.draw();
         }

         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.disableBlend();
         var4.pop();
      }
   }

   public static void onWorldRender(Event10 var0) {
      if (!TEXTURE.isEmpty()) {
         Set<net.minecraft.util.Identifier> var1 = TEXTURE.stream().map(var0x -> var0x.id).collect(Collectors.toCollection(LinkedHashSet::new));
         RenderSystem.enableBlend();
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
         var1.forEach(
            var0x -> {
               RenderSystem.setShaderTexture(0, var0x);
               RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
               BufferBuilder var1x = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
               TEXTURE.stream()
                  .filter(var1xx -> var1xx.id.equals(var0x))
                  .forEach(var1xx -> method1552(var1xx.entry, var1x, var1xx.x, var1xx.y, var1xx.width, var1xx.height, var1xx.color));
               BufferRenderer.drawWithGlobalProgram(var1x.end());
            }
         );
         RenderSystem.disableBlend();
         TEXTURE.clear();
      }

      if (!TEXTURE_DEPTH.isEmpty()) {
         Set<net.minecraft.util.Identifier> var2 = TEXTURE_DEPTH.stream().map(var0x -> var0x.id).collect(Collectors.toCollection(LinkedHashSet::new));
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(false);
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
         var2.forEach(
            var0x -> {
               RenderSystem.setShaderTexture(0, var0x);
               RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
               BufferBuilder var1x = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
               TEXTURE_DEPTH.stream()
                  .filter(var1xx -> var1xx.id.equals(var0x))
                  .forEach(var1xx -> method1552(var1xx.entry, var1x, var1xx.x, var1xx.y, var1xx.width, var1xx.height, var1xx.color));
               BufferRenderer.drawWithGlobalProgram(var1x.end());
            }
         );
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         TEXTURE_DEPTH.clear();
      }

      if (!LINE.isEmpty()) {
         GL11.glEnable(2881);
         Set<Float> var3 = LINE.stream().map(var0x -> var0x.width).collect(Collectors.toCollection(LinkedHashSet::new));
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.disableDepthTest();
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
         RenderSystem.setShader(ShaderProgramKeys.RENDERTYPE_LINES);
         var3.forEach(
            var0x -> {
               RenderSystem.lineWidth(var0x);
               BufferBuilder var1x = tessellator.begin(DrawMode.LINES, VertexFormats.LINES);
               LINE.stream()
                  .filter(var1xx -> var1xx.width == var0x.floatValue())
                  .forEach(var1xx -> method1549(var1xx.entry, var1x, var1xx.start.toVector3f(), var1xx.end.toVector3f(), var1xx.colorStart, var1xx.colorEnd));
               BufferRenderer.drawWithGlobalProgram(var1x.end());
            }
         );
         RenderSystem.enableDepthTest();
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         LINE.clear();
         GL11.glDisable(2881);
      }

      if (!QUAD.isEmpty()) {
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.disableDepthTest();
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         BufferBuilder var4 = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
         QUAD.forEach(var1x -> method1550(var1x.entry, var4, var1x.x, var1x.y, var1x.w, var1x.z, var1x.color));
         BufferRenderer.drawWithGlobalProgram(var4.end());
         RenderSystem.enableDepthTest();
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         QUAD.clear();
      }

      if (!LINE_DEPTH.isEmpty()) {
         GL11.glEnable(2881);
         Set<Float> var5 = LINE_DEPTH.stream().map(var0x -> var0x.width).collect(Collectors.toCollection(LinkedHashSet::new));
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(false);
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
         RenderSystem.setShader(ShaderProgramKeys.RENDERTYPE_LINES);
         var5.forEach(
            var0x -> {
               RenderSystem.lineWidth(var0x);
               BufferBuilder var1x = tessellator.begin(DrawMode.LINES, VertexFormats.LINES);
               LINE_DEPTH.stream()
                  .filter(var1xx -> var1xx.width == var0x.floatValue())
                  .forEach(var1xx -> method1549(var1xx.entry, var1x, var1xx.start.toVector3f(), var1xx.end.toVector3f(), var1xx.colorStart, var1xx.colorEnd));
               BufferRenderer.drawWithGlobalProgram(var1x.end());
            }
         );
         RenderSystem.depthMask(true);
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         LINE_DEPTH.clear();
         GL11.glDisable(2881);
      }

      if (!QUAD_DEPTH.isEmpty()) {
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         BufferBuilder var6 = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
         QUAD_DEPTH.forEach(var1x -> method1550(var1x.entry, var6, var1x.x, var1x.y, var1x.w, var1x.z, var1x.color));
         BufferRenderer.drawWithGlobalProgram(var6.end());
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         QUAD_DEPTH.clear();
      }
   }

   public static void method1542(BlockPos var0, VoxelShape var1, int var2, float var3) {
      method1543(var0, var1, var2, var3, true, false);
   }

   public static void method1543(BlockPos var0, VoxelShape var1, int var2, float var3, boolean var4, boolean var5) {
      if (SHAPE_BOXES.containsKey(var1)) {
         SHAPE_BOXES.get(var1).forEach(var5x -> {
            var5x = var5x.offset(var0);
            if (Helper148.method1256(var5x)) {
               method1546(var5x, var2, var3, true, var4, var5);
            }
         });
      } else {
         SHAPE_BOXES.put(var1, var1.getBoundingBoxes());
      }
   }

   public static void method1544(BlockPos var0, VoxelShape var1, int var2, float var3, boolean var4, boolean var5) {
      Vec3d var6 = Vec3d.of(var0);
      if (Helper148.method1256(new Box(var0))) {
         if (SHAPE_OUTLINES.containsKey(var1)) {
            Pair<List<net.minecraft.util.math.Box>, List<Helper180>> var8 = SHAPE_OUTLINES.get(var1);
            if (var4) {
               var8.getLeft().forEach(var4x -> method1546(var4x.offset(var6), var2, var3, false, true, var5));
            }

            var8.getRight().forEach(var4x -> method1563(var4x.start.add(var6), var4x.end.add(var6), var2, var3, var5));
            return;
         }

         ArrayList var7 = new ArrayList();
         var1.forEachEdge(
            (var1x, var3x, var5x, var7x, var9, var11) -> var7.add(
               new Helper180(null, new Vec3d(var1x, var3x, var5x), new Vec3d(var7x, var9, var11), 0, 0, 0.0F)
            )
         );
         SHAPE_OUTLINES.put(var1, new Pair<>(var1.getBoundingBoxes(), var7));
      }
   }

   public static void method1545(Box var0, int var1, float var2) {
      method1546(var0, var1, var2, true, true, false);
   }

   public static void method1546(Box var0, int var1, float var2, boolean var3, boolean var4, boolean var5) {
      method1547(null, var0, var1, var2, var3, var4, var5);
   }

   public static void method1547(Entry var0, Box var1, int var2, float var3, boolean var4, boolean var5, boolean var6) {
      var1 = var1.expand(0.001);
      double var7 = var1.minX;
      double var9 = var1.minY;
      double var11 = var1.minZ;
      double var13 = var1.maxX;
      double var15 = var1.maxY;
      double var17 = var1.maxZ;
      if (var5) {
         int var19 = Helper133.method1108(var2, 0.1F);
         method1567(var0, new Vec3d(var7, var9, var11), new Vec3d(var13, var9, var11), new Vec3d(var13, var9, var17), new Vec3d(var7, var9, var17), var19, var6);
         method1567(
            var0, new Vec3d(var7, var9, var11), new Vec3d(var7, var15, var11), new Vec3d(var13, var15, var11), new Vec3d(var13, var9, var11), var19, var6
         );
         method1567(
            var0, new Vec3d(var13, var9, var11), new Vec3d(var13, var15, var11), new Vec3d(var13, var15, var17), new Vec3d(var13, var9, var17), var19, var6
         );
         method1567(
            var0, new Vec3d(var7, var9, var17), new Vec3d(var13, var9, var17), new Vec3d(var13, var15, var17), new Vec3d(var7, var15, var17), var19, var6
         );
         method1567(var0, new Vec3d(var7, var9, var11), new Vec3d(var7, var9, var17), new Vec3d(var7, var15, var17), new Vec3d(var7, var15, var11), var19, var6);
         method1567(
            var0, new Vec3d(var7, var15, var11), new Vec3d(var7, var15, var17), new Vec3d(var13, var15, var17), new Vec3d(var13, var15, var11), var19, var6
         );
      }

      if (var4) {
         method1562(var0, var7, var9, var11, var13, var9, var11, var2, var3, var6);
         method1562(var0, var13, var9, var11, var13, var9, var17, var2, var3, var6);
         method1562(var0, var13, var9, var17, var7, var9, var17, var2, var3, var6);
         method1562(var0, var7, var9, var17, var7, var9, var11, var2, var3, var6);
         method1562(var0, var7, var9, var17, var7, var15, var17, var2, var3, var6);
         method1562(var0, var7, var9, var11, var7, var15, var11, var2, var3, var6);
         method1562(var0, var13, var9, var17, var13, var15, var17, var2, var3, var6);
         method1562(var0, var13, var9, var11, var13, var15, var11, var2, var3, var6);
         method1562(var0, var7, var15, var11, var13, var15, var11, var2, var3, var6);
         method1562(var0, var13, var15, var11, var13, var15, var17, var2, var3, var6);
         method1562(var0, var13, var15, var17, var7, var15, var17, var2, var3, var6);
         method1562(var0, var7, var15, var17, var7, var15, var11, var2, var3, var6);
      }
   }

   public static void method1548(MatrixStack var0, VertexConsumer var1, Vec3d var2, Vec3d var3, int var4, int var5) {
      method1549(var0.peek(), var1, var2.toVector3f(), var3.toVector3f(), var4, var5);
   }

   public static void method1549(Entry var0, VertexConsumer var1, Vector3f var2, Vector3f var3, int var4, int var5) {
      if (var0 == null) {
         var0 = lastWorldSpaceMatrix;
      }

      Vector3f var6 = method1553(var2, var3);
      var1.vertex(var0, var2).color(var4).normal(var0, var6);
      var1.vertex(var0, var3).color(var5).normal(var0, var6);
   }

   public static void method1550(Entry var0, VertexConsumer var1, Vec3d var2, Vec3d var3, Vec3d var4, Vec3d var5, int var6) {
      method1551(var0, var1, var2.toVector3f(), var3.toVector3f(), var4.toVector3f(), var5.toVector3f(), var6);
   }

   public static void method1551(Entry var0, VertexConsumer var1, Vector3f var2, Vector3f var3, Vector3f var4, Vector3f var5, int var6) {
      if (var0 == null) {
         var0 = lastWorldSpaceMatrix;
      }

      var1.vertex(var0, var2).color(var6);
      var1.vertex(var0, var3).color(var6);
      var1.vertex(var0, var4).color(var6);
      var1.vertex(var0, var5).color(var6);
   }

   public static void method1552(Entry var0, BufferBuilder var1, float var2, float var3, float var4, float var5, Vector4i var6) {
      var1.vertex(var0, var2, var3 + var5, 0.0F).texture(0.0F, 0.0F).color(var6.x);
      var1.vertex(var0, var2 + var4, var3 + var5, 0.0F).texture(0.0F, 1.0F).color(var6.y);
      var1.vertex(var0, var2 + var4, var3, 0.0F).texture(1.0F, 1.0F).color(var6.w);
      var1.vertex(var0, var2, var3, 0.0F).texture(1.0F, 0.0F).color(var6.z);
   }

   public static Vector3f method1553(Vector3f var0, Vector3f var1) {
      Vector3f var2 = new Vector3f(var0).sub(var1);
      float var3 = MathHelper.sqrt(var2.lengthSquared());
      return var2.div(var3);
   }

   public static void method1554(LivingEntity var0, float var1, float var2, String var3) {
      float var4 = var2 - var1 - 0.17F;
      float var5 = var4;
      if (var3 != null) {
         if ("2".equals(var3)) {
            var5 = var2 - var1 - 0.05F;
         } else if ("4".equals(var3)) {
            var5 = var2 - var1 + 0.05F;
         } else if ("5".equals(var3)) {
            var5 = var2 - var1 + 0.07F;
         }
      }

      float var6 = Helper147.method1245(prevCubeSize, var5, 0.2F);
      prevCubeSize = var6;
      Camera var7 = mc.getEntityRenderDispatcher().camera;
      Vec3d var8 = Helper147.method1247(var0).subtract(var7.getPos());
      MatrixStack var9 = new MatrixStack();
      var9.push();
      var9.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var7.getPitch()));
      var9.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var7.getYaw() + 180.0F));
      var9.translate(var8.x, var8.y + var0.getBoundingBox().getLengthY() / 2.0, var8.z);
      var9.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var7.getYaw()));
      var9.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var7.getPitch()));
      var9.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(Helper147.method1248(prevEspValue, espValue)));
      Entry var10 = var9.peek().copy();
      int var11 = TargetEsp.method2330().method2332(var2, var1);
      method1568(
         var10,
         Identifier.of("textures/teremok/targetesp/capture" + var3 + ".png"),
         -var6 / 2.0F,
         -var6 / 2.0F,
         var6,
         var6,
         new Vector4i(var11, var11, var11, var11),
         false
      );
      var9.pop();
   }

   public static void method1555(MatrixStack var0, LivingEntity var1, float var2, float var3, String var4) {
      Vec3d var5 = Helper147.method1247(var1);
      boolean var6 = Objects.requireNonNull(mc.player).canSee(var1);
      Camera var7 = mc.getEntityRenderDispatcher().camera;
      Vec3d var8 = var7.getPos();
      float var9 = var1.getHeight() / 2.0F;
      float var10 = var1.getWidth() * 0.8F;
      float var11 = var10;
      float var12 = circleStep * 9.0F;
      double var13 = Helper147.method1249(circleStep - 0.17, circleStep);
      double var15 = Helper147.method1243(var13) * var1.getHeight() * 0.6;
      float var17 = -0.5F;
      double[] var18 = new double[]{var9 + var15 + var17};
      int var19 = TargetEsp.method2330().method2331(var3);
      if ("1".equals(var4)) {
         var13 = Helper147.method1249(circleStep - 0.17, circleStep);
         var5 = Helper147.method1247(var1);
         var6 = Objects.requireNonNull(mc.player).canSee(var1);
         GL11.glEnable(2881);
         if (var6) {
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(false);
         } else {
            RenderSystem.disableDepthTest();
         }

         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         BufferBuilder var54 = tessellator.begin(DrawMode.TRIANGLE_STRIP, VertexFormats.POSITION_COLOR);
         byte var55 = 64;

         for (int var56 = 0; var56 <= var55; var56++) {
            float var57 = var1.getWidth();
            var9 = var1.getHeight();
            var15 = Helper147.method1243(var13) * var9;
            double var59 = Helper147.method1243(var13 - 0.45) * var9;
            Vec3d var60 = Helper147.method1242(var56, var55, var57);
            Vec3d var27 = Helper147.method1242(var56 + 1, var55, var57);
            int var61 = TargetEsp.method2330().method2331(var3);
            Vec3d var62 = var5.add(var60.x, var60.y + var15, var60.z);
            Vec3d var63 = var5.add(var60.x, var60.y + var59, var60.z);
            method1548(var0, var54, var62, var63, Helper133.method1108(var61, 0.76F * var2), Helper133.method1108(var61, 0.0F));
            method1563(
               var5.add(var60.x, var60.y + var15, var60.z), var5.add(var27.x, var27.y + var15, var27.z), Helper133.method1108(var61, var2), 2.0F, var6
            );
         }

         BufferRenderer.drawWithGlobalProgram(var54.end());
         if (var6) {
            RenderSystem.depthMask(true);
            RenderSystem.disableDepthTest();
         } else {
            RenderSystem.enableDepthTest();
         }

         GL11.glDisable(2881);
      } else if ("3".equals(var4)) {
         method1558(var1, var2, var3);
      } else if ("4".equals(var4)) {
         method1557(var1, var2, var3);
      } else {
         byte var20 = 50;
         float var21 = 0.35F;
         byte var22 = 0;
         switch (var4) {
            case "2":
               var21 = 0.4F;
               break;
            case "3":
               var21 = 0.45F;
               var22 = 4;
               break;
            case "5":
               var21 = 0.6F;
               var22 = 7;
         }

         for (double var26 : var18) {
            float var28 = var2;
            if (!(var2 <= 0.02F)) {
               float var29 = var12;

               for (int var30 = 0; var30 < var20; var30++) {
                  double var31 = Math.toRadians(var29 + var30 * 360.0 / var20);
                  double var33 = Math.cos(var31) * var11;
                  double var35 = Math.sin(var31) * var11;
                  Vec3d var37 = var5.add(var33, var26, var35);
                  Vec3d var38 = var37.subtract(var8);
                  MatrixStack var39 = new MatrixStack();
                  var39.push();
                  var39.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var7.getPitch()));
                  var39.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var7.getYaw() + 180.0F));
                  var39.translate(var38.x, var38.y, var38.z);
                  var39.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var7.getYaw()));
                  var39.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var7.getPitch()));
                  Entry var40 = var39.peek();
                  float var41 = var21 * var2;
                  int var42 = Helper133.method1120(var19, (int)(var28 * 255.0F));
                  Vector4i var43 = new Vector4i(var42, var42, var42, var42);
                  method1568(var40, bloom, -var41 / 2.0F, -var41 / 2.0F, var41, var41, var43, false);

                  for (int var44 = 1; var44 <= var22; var44++) {
                     float var45 = var41 * (1.0F + var44 * 0.55F);
                     float var46 = var28 * (1.0F - var44 * 0.18F);
                     int var47 = Helper133.method1120(var19, (int)(var46 * 255.0F));
                     Vector4i var48 = new Vector4i(var47, var47, var47, var47);
                     method1568(var40, bloom, -var45 / 2.0F, -var45 / 2.0F, var45, var45, var48, false);
                  }

                  var39.pop();
               }
            }
         }
      }
   }

   private static List<Vec3d>[] method1556() {
      List[] var0 = new List[3];

      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = new ArrayList();
      }

      return var0;
   }

   private static void method1557(LivingEntity var0, float var1, float var2) {
      if (!(var1 <= 0.02F)) {
         Camera var3 = mc.getEntityRenderDispatcher().camera;
         Vec3d var4 = Helper147.method1247(var0);
         Vec3d var5 = var3.getPos();
         long var6 = System.currentTimeMillis();
         if (lastGhostOrbitTime == 0L) {
            lastGhostOrbitTime = var6;
         }

         ghostOrbitAngle = ghostOrbitAngle + (float)(var6 - lastGhostOrbitTime) * 0.2F;
         lastGhostOrbitTime = var6;

         for (int var8 = 0; var8 < 3; var8++) {
            float var9 = ghostOrbitAngle + var8 * 120.0F;
            double var10 = Math.toRadians(var9);
            double var12 = Math.cos(var10) * 0.7;
            double var14 = Math.sin(var10) * 0.7;
            double var16 = Math.sin(ghostOrbitAngle * 0.02) * 0.5 + 0.5;
            double var18 = var16 * var0.getHeight();
            List var20 = ghostOrbitTrails[var8];
            var20.add(0, var4.add(var12, var18, var14));

            while (var20.size() > 100) {
               var20.remove(100);
            }

            for (int var21 = 0; var21 < var20.size(); var21++) {
               float var22 = (float)Math.pow(1.0F - var21 / 100.0F, 1.5);
               float var23 = 0.34F * var22 * var1;
               if (!(var23 <= 0.02F)) {
                  Vec3d var24 = ((Vec3d)var20.get(var21)).subtract(var5);
                  MatrixStack var25 = new MatrixStack();
                  var25.push();
                  var25.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var3.getPitch()));
                  var25.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var3.getYaw() + 180.0F));
                  var25.translate(var24.x, var24.y, var24.z);
                  var25.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var3.getYaw()));
                  var25.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var3.getPitch()));
                  int var26 = TargetEsp.method2330().method2332(var2, 1.0F * var22 * var1);
                  method1568(var25.peek().copy(), bloom, -var23, -var23, var23 * 2.0F, var23 * 2.0F, new Vector4i(var26, var26, var26, var26), false);
                  var25.pop();
               }
            }
         }
      }
   }

   private static void method1558(LivingEntity var0, float var1, float var2) {
      if (!(var1 <= 0.0F)) {
         jelloMoving += 2.0F;
         Camera var3 = mc.getEntityRenderDispatcher().camera;
         Vec3d var4 = Helper147.method1247(var0);
         Vec3d var5 = var3.getPos();
         float var6 = var0.getWidth() * 1.65F;
         float var7 = var0.getHeight() - 0.15F;
         float var8 = 1.0F - (float)Math.pow(1.0F - var1, 3.0);
         int var9 = TargetEsp.method2330().method2331(var2);
         method1559(var3, var4, var5, var9, var8, var6, var7, false);
         method1559(var3, var4, var5, var9, var8, var6, var7, true);
      }
   }

   private static void method1559(Camera var0, Vec3d var1, Vec3d var2, int var3, float var4, float var5, float var6, boolean var7) {
      for (byte var8 = 0; var8 < 360; var8 += 2) {
         float var9 = Math.max(0.5F, 0.7F - 0.2F * var4);
         double var10 = Math.toRadians(var8 + jelloMoving);
         float var12 = (float)(Math.cos(var10) * var5 * var9);
         float var13 = (float)(Math.sin(var10) * var5 * var9);
         int var14 = var7 ? 1 : 15;

         for (int var15 = 0; var15 < var14; var15++) {
            float var16 = var7
               ? var6 / 1.75F + var6 / 2.0F * (float)Math.cos(Math.toRadians(jelloMoving / 1.5F + 30.0F))
               : var6 / 1.7F + var6 / 2.0F * (float)Math.cos(Math.toRadians(jelloMoving / 1.5F + var15 * 2.0F));
            float var17 = 0.2F;
            int var18 = var7 ? (int)(255.0F * var4 * 0.2F) : (int)(255.0F * var4 * (var15 / 15.0F) * 0.05F);
            if (var18 > 0) {
               Vec3d var19 = var1.add(var12, var16, var13).subtract(var2);
               MatrixStack var20 = new MatrixStack();
               var20.push();
               var20.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var0.getPitch()));
               var20.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var0.getYaw() + 180.0F));
               var20.translate(var19.x, var19.y, var19.z);
               var20.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var0.getYaw()));
               var20.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var0.getPitch()));
               Entry var21 = var20.peek();
               int var22 = Helper133.method1120(var3, var18);
               method1568(var21, bloom, -var17 / 2.0F, -var17 / 2.0F, var17, var17, new Vector4i(var22, var22, var22, var22), false);
               var20.pop();
            }
         }
      }
   }

   public static void method1560(LivingEntity var0, float var1, float var2, float var3) {
      Camera var4 = mc.getEntityRenderDispatcher().camera;
      Vec3d var5 = Helper147.method1247(var0).subtract(var4.getPos());
      boolean var6 = mc.player.canSee(var0);
      double var7 = Helper147.method1248(mc.player.age - 1, mc.player.age);
      float var9 = var0.getHeight() / 2.0F + 0.2F;
      float var10 = var0.getWidth() + 0.2F;
      float var11 = 0.2F;
      float var12 = var0.getHeight() - 0.2F;
      float var13 = Math.min(var2 * 2.0F, 2.0F);
      float var14 = (float)Math.sin(var13 * Math.PI) * 0.18F;
      float var15 = (float)Math.sin(var13 * Math.PI) * -0.04F;

      for (int var16 = 0; var16 < 4; var16++) {
         int var17 = 0;

         for (byte var18 = 10; var17 <= var18; var17++) {
            double var19 = ((var17 / 2.0F + var7 * var3 * 2.0) * var18 + var16 * 90) % (var18 * 180);
            double var21 = Math.toRadians(var19);
            float var23 = 1.04F;
            float var24 = 1.0F + var14;
            double var25 = Math.sin(Math.toRadians(var7 * 0.7 + var17 * (var16 + var9)) * 1.1) / 2.0;
            double var27 = var16 % 2 == 0 ? var25 : -var25;
            double var29 = var11 + (var27 + 0.5) * (var12 - var11);
            float var31 = (float)(var17 + var18) / (var18 + var18);
            MatrixStack var32 = new MatrixStack();
            var32.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var4.getPitch()));
            var32.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var4.getYaw() + 180.0F));
            double var33 = var10 * var24 * var23;
            var32.translate(var5.x + Math.cos(var21) * var33, var5.y + var29, var5.z + Math.sin(var21) * var33);
            var32.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var4.getYaw()));
            var32.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var4.getPitch()));
            Entry var35 = var32.peek().copy();
            int var36 = TargetEsp.method2330().method2332(var2, var31 * var1);
            float var37 = 0.6F * var31 * (0.6F + var3 * 0.1F) + var15;
            method1568(
               var35,
               Identifier.of("textures/teremok/particles/bloom.png"),
               -var37 / 2.0F,
               -var37 / 2.0F,
               var37,
               var37,
               new Vector4i(var36, var36, var36, var36),
               var6
            );
            byte var38 = 5;
            float var39 = 0.45F;
            float var40 = 0.22F;

            for (int var41 = 1; var41 <= var38; var41++) {
               float var42 = var37 * (1.0F + var41 * var39);
               float var43 = 1.0F - var41 * var40;
               if (var43 <= 0.05F) {
                  break;
               }

               int var44 = Helper133.method1108(var36, var43);
               Vector4i var45 = new Vector4i(var44, var44, var44, var44);
               method1568(var35, Identifier.of("textures/teremok/particles/bloom.png"), -var42 / 2.0F, -var42 / 2.0F, var42, var42, var45, var6);
            }
         }
      }

      if (TargetEsp.method2330() != null && !TargetEsp.targetPositionHistory.isEmpty()) {
         long var46 = System.currentTimeMillis();
         Vec3d var47 = var4.getPos();
         int var48 = 0;

         for (byte var20 = 0; var20 < TargetEsp.targetPositionHistory.size() && var48 < 32; var20 += 2) {
            Helper243 var49 = TargetEsp.targetPositionHistory.get(var20);
            float var22 = (float)(var46 - var49.timestamp) / 1000.0F;
            if (!(var22 > 1.0F)) {
               float var50 = (1.0F - var22) * var1;
               if (!(var50 <= 0.02F)) {
                  Vec3d var51 = var49.position.subtract(var47).add(0.0, var0.getHeight() * 0.45, 0.0);
                  MatrixStack var52 = new MatrixStack();
                  var52.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var4.getPitch()));
                  var52.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var4.getYaw() + 180.0F));
                  var52.translate(var51.x, var51.y, var51.z);
                  var52.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var4.getYaw()));
                  var52.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var4.getPitch()));
                  Entry var26 = var52.peek().copy();
                  int var53 = TargetEsp.method2330().method2332(var2, var50 * 0.7F);
                  float var28 = 0.2F + var50 * 0.34F;
                  method1568(
                     var26,
                     Identifier.of("textures/teremok/particles/bloom.png"),
                     -var28 / 2.0F,
                     -var28 / 2.0F,
                     var28,
                     var28,
                     new Vector4i(var53, var53, var53, var53),
                     var6
                  );
                  int var54 = Helper133.method1108(var53, 0.45F);
                  float var30 = var28 * 1.65F;
                  method1568(
                     var26,
                     Identifier.of("textures/teremok/particles/bloom.png"),
                     -var30 / 2.0F,
                     -var30 / 2.0F,
                     var30,
                     var30,
                     new Vector4i(var54, var54, var54, var54),
                     var6
                  );
                  var48++;
               }
            }
         }
      }
   }

   public static void method1561() {
      prevEspValue = espValue;
      espValue = espValue + espSpeed;
      if (espSpeed > 25.0F) {
         flipSpeed = true;
      }

      if (espSpeed < -25.0F) {
         flipSpeed = false;
      }

      espSpeed = flipSpeed ? espSpeed - 0.5F : espSpeed + 0.5F;
      circleStep += 0.15F;
   }

   public static void method1562(
      Entry var0, double var1, double var3, double var5, double var7, double var9, double var11, int var13, float var14, boolean var15
   ) {
      method1564(var0, new Vec3d(var1, var3, var5), new Vec3d(var7, var9, var11), var13, var13, var14, var15);
   }

   public static void method1563(Vec3d var0, Vec3d var1, int var2, float var3, boolean var4) {
      method1564(null, var0, var1, var2, var2, var3, var4);
   }

   public static void method1564(Entry var0, Vec3d var1, Vec3d var2, int var3, int var4, float var5, boolean var6) {
      Helper180 var7 = new Helper180(var0, var1, var2, var3, var4, var5);
      if (var6) {
         LINE_DEPTH.add(var7);
      } else {
         LINE.add(var7);
      }
   }

   public static void method1565(BufferBuilder var0, Entry var1, Vec3d var2, double var3, int var5, int var6) {
      var0.vertex(var1, (float)var2.x, (float)var2.y, (float)var2.z).color(var5);

      for (int var7 = 0; var7 <= var6; var7++) {
         double var8 = (Math.PI * 2) * var7 / var6;
         double var10 = Math.cos(var8) * var3;
         double var12 = Math.sin(var8) * var3;
         var0.vertex(var1, (float)(var2.x + var10), (float)var2.y, (float)(var2.z + var12)).color(var5);
      }
   }

   public static void method1566(Vec3d var0, Vec3d var1, Vec3d var2, Vec3d var3, int var4, boolean var5) {
      method1567(null, var0, var1, var2, var3, var4, var5);
   }

   public static void method1567(Entry var0, Vec3d var1, Vec3d var2, Vec3d var3, Vec3d var4, int var5, boolean var6) {
      Helper179 var7 = new Helper179(var0, var1, var2, var3, var4, var5);
      if (var6) {
         QUAD_DEPTH.add(var7);
      } else {
         QUAD.add(var7);
      }
   }

   public static void method1568(Entry var0, Identifier var1, float var2, float var3, float var4, float var5, Vector4i var6, boolean var7) {
      Helper181 var8 = new Helper181(var0, var1, var2, var3, var4, var5, var6);
      if (var7) {
         TEXTURE_DEPTH.add(var8);
      } else {
         TEXTURE.add(var8);
      }
   }

   private Helper183() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public static void method1569(Matrix4f var0) {
      lastProjMat = var0;
   }

   public static void method1570(Entry var0) {
      lastWorldSpaceMatrix = var0;
   }
}
