package zenith;

import zenith.hud.*;

import com.mojang.blaze3d.platform.GlStateManager.AdvancementTabType4;
import com.mojang.blaze3d.platform.GlStateManager.AdvancementTabType5;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.client.render.VertexFormat.LootPool96;
import net.minecraft.client.util.math.MatrixStack.BeaconScreen5;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL11;

public final class ListHolder_2 implements ZenithInternal076 {
   private static final List<VoxelShapeHolder$Event> lIlIlI1111IllI1lII11Il1l1I1 = new ArrayList<>();
   private static final List<VoxelShapeHolder$Helper> lIll1II1III1I1 = new ArrayList<>();
   public static final List<Vec3dHolder$Helper> l11l1111I1I11I1Il = new ArrayList<>();
   public static final List<Vec3dHolder$Helper> IlI11lI1I1lII1 = new ArrayList<>();
   public static final List<Vec3dHolder$EventTarget> l1l1II1lllll1Il1111I1ll1Ill1l = new ArrayList<>();
   public static final List<Vec3dHolder$EventTarget> I1ll1IIlIl11111lIlIIIIIIlllI1l = new ArrayList<>();
   private static net.minecraft.client.render.Tessellator l1lIIlIl1I11lI11lI1l111I = net.minecraft.client.render.Tessellator.getInstance();
   private static Matrix4f l11lllI1IIl1lI1II1lI1l1I1l1lII = new Matrix4f();
   private static Matrix4f II11111I1IlIIII1l1l1l = new Matrix4f();
   private static Matrix4f l1lllI1llI1l = new Matrix4f();
   public static final Identifier III1l1l11IIIl111lIl1Il = Identifier.of("zenith", "textures/capture.png");
   public static final Identifier l1IIlll11ll1II1IlII11IlI1 = Identifier.of("zenith", "textures/expensive.png");
   public static final Identifier lllIlIlIl1I11IIlIl1ll1Il1I1 = Identifier.of("zenith", "textures/expensive2.png");
   public static final Identifier l1llII11lIIIll11Ill111IlIl = Identifier.of("zenith", "textures/glow.png");
   private static float l1IlIl11IIlII111I = 1.0F;
   private static float l11l11I111I1lIIl1 = 1.0F;
   private static float I11Il1lI11l1IlllIllIl1IIl = 0.0F;
   private static float lIlII11Ill1ll1I1llllIllIlIl1 = 0.0F;
   private static float III1l1lllI1lI1I1l1l1II1 = 0.0F;
   private static boolean lll11IIl1lI1IlllI1ll1Il1 = false;
   private static final Random l11lI1I11lIl = new Random();
   static ArrayList<I1lIIIll1lIIl1IllllIlIll11$EventBus> ll11llI11I1IlllIlIl1I11I1I = new ArrayList<>();

   public static void Event(MatrixStack MatrixStack) {
      BeaconScreen5 BeaconScreen5 = MatrixStack.peek();
      if (!I1ll1IIlIl11111lIlIIIIIIlllI1l.isEmpty()) {
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.disableDepthTest();
         RenderSystem.blendFunc(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE_MINUS_CONSTANT_ALPHA);
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         net.minecraft.client.render.BufferBuilder BufferBuilderx = l1lIIlIl1I11lI11lI1l111I.begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
         I1ll1IIlIl11111lIlIIIIIIlllI1l.forEach(
            i1liiill1liil1illllilill11$illi1l1l1 -> StringHolder_8(
                  BeaconScreen5,
                  BufferBuilderx,
                  i1liiill1liil1illllilill11$illi1l1l1.llI1lIl1lIll,
                  i1liiill1liil1illllilill11$illi1l1l1.lI11Il1I1lIII1lIlI11,
                  i1liiill1liil1illllilill11$illi1l1l1.I111I1I11I11Il1lll1Illll11l,
                  i1liiill1liil1illllilill11$illi1l1l1.I11I11lIlIll1I1,
                  i1liiill1liil1illllilill11$illi1l1l1.Il1II1I1l1IIlllllll,
                  i1liiill1liil1illllilill11$illi1l1l1.ll11lI11IIIl1I1lllllIl11I1lI,
                  i1liiill1liil1illllilill11$illi1l1l1.IlIIIIlIlI,
                  i1liiill1liil1illllilill11$illi1l1l1.Il1II11lIII11l11Ill11I1I1I
               )
         );
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilderx.end());
         RenderSystem.enableDepthTest();
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         I1ll1IIlIl11111lIlIIIIIIlllI1l.clear();
      }

      if (!IlI11lI1I1lII1.isEmpty()) {
         GL11.glEnable(2881);
         Set set = IlI11lI1I1lII1.stream()
            .map(i1liiill1liil1illllilill11$ii1il11l111ii11iil -> i1liiill1liil1illllilill11$ii1il11l111ii11iil.l1l1llIIl1I1lI)
            .collect(Collectors.toCollection(LinkedHashSet::new));
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.disableDepthTest();
         RenderSystem.blendFunc(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE_MINUS_CONSTANT_ALPHA);
         RenderSystem.setShader(ShaderProgramKeys.RENDERTYPE_LINES);
         set.forEach(
            f -> {
               RenderSystem.lineWidth(f);
               net.minecraft.client.render.BufferBuilder BufferBuilderxx = l1lIIlIl1I11lI11lI1l111I.begin(LootPool96.LINES, net.minecraft.client.render.VertexFormats.LINES);
               IlI11lI1I1lII1.stream()
                  .filter(i1liiill1liil1illllilill11$ii1il11l111ii11iil -> i1liiill1liil1illllilill11$ii1il11l111ii11iil.l1l1llIIl1I1lI == f)
                  .forEach(
                     i1liiill1liil1illllilill11$ii1il11l111ii11iil -> StringHolder_8(
                           MatrixStack,
                           BufferBuilderxx,
                           i1liiill1liil1illllilill11$ii1il11l111ii11iil.I1I1lIl1I1l,
                           i1liiill1liil1illllilill11$ii1il11l111ii11iil.I1IIIlIlI1l11llIlII1,
                           i1liiill1liil1illllilill11$ii1il11l111ii11iil.lI1lIl1IIlI11l11Ill,
                           i1liiill1liil1illllilill11$ii1il11l111ii11iil.II11l1IllI111II1l11l1
                        )
                  );
               net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilderxx.end());
            }
         );
         RenderSystem.enableDepthTest();
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         IlI11lI1I1lII1.clear();
         GL11.glDisable(2881);
      }

      if (!l11l1111I1I11I1Il.isEmpty()) {
         GL11.glEnable(2881);
         Set set1 = l11l1111I1I11I1Il.stream()
            .map(i1liiill1liil1illllilill11$ii1il11l111ii11iil -> i1liiill1liil1illllilill11$ii1il11l111ii11iil.l1l1llIIl1I1lI)
            .collect(Collectors.toCollection(LinkedHashSet::new));
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(false);
         RenderSystem.blendFunc(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE_MINUS_CONSTANT_ALPHA);
         RenderSystem.setShader(ShaderProgramKeys.RENDERTYPE_LINES);
         set1.forEach(
            f -> {
               RenderSystem.lineWidth(f);
               net.minecraft.client.render.BufferBuilder BufferBuilderxx = l1lIIlIl1I11lI11lI1l111I.begin(LootPool96.LINES, net.minecraft.client.render.VertexFormats.LINES);
               l11l1111I1I11I1Il.stream()
                  .filter(i1liiill1liil1illllilill11$ii1il11l111ii11iil -> i1liiill1liil1illllilill11$ii1il11l111ii11iil.l1l1llIIl1I1lI == f)
                  .forEach(
                     i1liiill1liil1illllilill11$ii1il11l111ii11iil -> StringHolder_8(
                           MatrixStack,
                           BufferBuilderxx,
                           i1liiill1liil1illllilill11$ii1il11l111ii11iil.I1I1lIl1I1l,
                           i1liiill1liil1illllilill11$ii1il11l111ii11iil.I1IIIlIlI1l11llIlII1,
                           i1liiill1liil1illllilill11$ii1il11l111ii11iil.lI1lIl1IIlI11l11Ill,
                           i1liiill1liil1illllilill11$ii1il11l111ii11iil.II11l1IllI111II1l11l1
                        )
                  );
               net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilderxx.end());
            }
         );
         RenderSystem.depthMask(true);
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         l11l1111I1I11I1Il.clear();
         GL11.glDisable(2881);
      }

      if (!l1l1II1lllll1Il1111I1ll1Ill1l.isEmpty()) {
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFunc(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE_MINUS_CONSTANT_ALPHA);
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         net.minecraft.client.render.BufferBuilder BufferBuilder = l1lIIlIl1I11lI11lI1l111I.begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
         l1l1II1lllll1Il1111I1ll1Ill1l.forEach(
            i1liiill1liil1illllilill11$illi1l1l1 -> StringHolder_8(
                  BeaconScreen5,
                  BufferBuilder,
                  i1liiill1liil1illllilill11$illi1l1l1.llI1lIl1lIll,
                  i1liiill1liil1illllilill11$illi1l1l1.lI11Il1I1lIII1lIlI11,
                  i1liiill1liil1illllilill11$illi1l1l1.I111I1I11I11Il1lll1Illll11l,
                  i1liiill1liil1illllilill11$illi1l1l1.I11I11lIlIll1I1,
                  i1liiill1liil1illllilill11$illi1l1l1.Il1II1I1l1IIlllllll,
                  i1liiill1liil1illllilill11$illi1l1l1.ll11lI11IIIl1I1lllllIl11I1lI,
                  i1liiill1liil1illllilill11$illi1l1l1.IlIIIIlIlI,
                  i1liiill1liil1illllilill11$illi1l1l1.Il1II11lIII11l11Ill11I1I1I
               )
         );
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         l1l1II1lllll1Il1111I1ll1Ill1l.clear();
      }
   }

   public static void StringHolder_8(BlockPos BlockPos, net.minecraft.util.shape.VoxelShape VoxelShape, int i, float f) {
      StringHolder_8(BlockPos, VoxelShape, i, f, true, false);
   }

   public static void StringHolder_8(BlockPos BlockPos, net.minecraft.util.shape.VoxelShape VoxelShape, int i, float f, boolean flag, boolean flag1) {
      if (ZenithInternal094.EventImpl_24(VoxelShape.getBoundingBox().offset(BlockPos))) {
         lIll1II1III1I1.stream()
            .filter(i1liiill1liil1illllilill11$l1lll11l1l -> i1liiill1liil1illllilill11$l1lll11l1l.Il11l1llIll1Ill1lI1I11l1lIlIl.equals(VoxelShape))
            .findFirst()
            .ifPresentOrElse(
               i1liiill1liil1illllilill11$l1lll11l1l -> i1liiill1liil1illllilill11$l1lll11l1l.I11IIlIlII
                     .forEach(Box -> StringHolder_8(Box.offset(BlockPos), i, f, true, flag, flag1)),
               () -> lIll1II1III1I1.add(new VoxelShapeHolder$Helper(VoxelShape, VoxelShape.getBoundingBoxes()))
            );
      }
   }

   public static void EventBus(BlockPos BlockPos, net.minecraft.util.shape.VoxelShape VoxelShape, int i, float f, boolean flag, boolean flag1) {
      net.minecraft.util.math.Vec3d Vec3d = net.minecraft.util.math.Vec3d.of(BlockPos);
      if (ZenithInternal094.EventImpl_24(VoxelShape.getBoundingBox().offset(Vec3d))) {
         List list = VoxelShape.getBoundingBoxes();
         lIlIlI1111IllI1lII11Il1l1I1.stream()
            .filter(i1liiill1liil1illllilill11$liil11l111liil1ll -> i1liiill1liil1illllilill11$liil11l111liil1ll.ll1IllI11IlIlIl111I1lIl.equals(list))
            .findFirst()
            .ifPresentOrElse(
               i1liiill1liil1illllilill11$liil11l111liil1ll -> {
                  i1liiill1liil1illllilill11$liil11l111liil1ll.ll1IllI11IlIlIl111I1lIl
                     .forEach(Box -> StringHolder_8(Box.offset(Vec3d), i, f, false, flag, flag1));
                  i1liiill1liil1illllilill11$liil11l111liil1ll.lII11ll111lll1llII1l1I1IlIl1l1
                     .forEach(
                        i1liiill1liil1illllilill11$ii1il11l111ii11iil -> StringHolder_8(
                              i1liiill1liil1illllilill11$ii1il11l111ii11iil.I1I1lIl1I1l.add(Vec3d),
                              i1liiill1liil1illllilill11$ii1il11l111ii11iil.I1IIIlIlI1l11llIlII1.add(Vec3d),
                              i,
                              f,
                              flag1
                           )
                     );
               },
               () -> {
                  ArrayList arraylist = new ArrayList();
                  VoxelShape.forEachEdge(
                     (d0, d1, d2, d3, d4, d5) -> arraylist.add(
                           new Vec3dHolder$Helper(
                              new net.minecraft.util.math.Vec3d(d0, d1, d2), new net.minecraft.util.math.Vec3d(d3, d4, d5), 0, 0, 0.0F
                           )
                        )
                  );
                  lIlIlI1111IllI1lII11Il1l1I1.add(new VoxelShapeHolder$Event(VoxelShape, arraylist, VoxelShape.getBoundingBoxes()));
               }
            );
      }
   }

   public static void StringHolder_8(net.minecraft.util.math.Box Box, int i, float f) {
      StringHolder_8(Box, i, i, f);
   }

   public static void StringHolder_8(net.minecraft.util.math.Box Box, int i, int j, float f) {
      StringHolder_8(Box, i, j, f, true, true, false);
   }

   public static void StringHolder_8(net.minecraft.util.math.Box Box, int i, float f, boolean flag, boolean flag1, boolean flag2) {
      StringHolder_8(Box, i, i, f, flag, flag1, flag2);
   }

   public static void StringHolder_8(net.minecraft.util.math.Box Box, int i, int j, float f, boolean flag, boolean flag1, boolean flag2) {
      Box = Box.expand(0.001);
      if (ZenithInternal094.EventImpl_24(Box)) {
         double d0 = Box.minX;
         double d1 = Box.minY;
         double d2 = Box.minZ;
         double d3 = Box.maxX;
         double d4 = Box.maxY;
         double d5 = Box.maxZ;
         boolean flag3 = Entityesp.lIIlIlIII1ll11.lIIlIll1l1llllll1III111l();
         int k = flag3 ? PatternHolder.EventBus(i, 0.9F) : PatternHolder.EventBus(i, 0.1F);
         int l = flag3 ? PatternHolder.EventBus(j, 0.1F) : k;
         int i1 = flag3 ? PatternHolder.EventBus(i, 0.5F) : i;
         int j1 = flag3 ? PatternHolder.EventBus(j, 1.0F) : i;
         if (flag1) {
            StringHolder_8(
               new net.minecraft.util.math.Vec3d(d0, d1, d2),
               new net.minecraft.util.math.Vec3d(d3, d1, d2),
               new net.minecraft.util.math.Vec3d(d3, d1, d5),
               new net.minecraft.util.math.Vec3d(d0, d1, d5),
               k,
               k,
               k,
               k,
               flag2
            );
            StringHolder_8(
               new net.minecraft.util.math.Vec3d(d0, d1, d2),
               new net.minecraft.util.math.Vec3d(d0, d4, d2),
               new net.minecraft.util.math.Vec3d(d3, d4, d2),
               new net.minecraft.util.math.Vec3d(d3, d1, d2),
               k,
               l,
               l,
               k,
               flag2
            );
            StringHolder_8(
               new net.minecraft.util.math.Vec3d(d3, d1, d2),
               new net.minecraft.util.math.Vec3d(d3, d4, d2),
               new net.minecraft.util.math.Vec3d(d3, d4, d5),
               new net.minecraft.util.math.Vec3d(d3, d1, d5),
               k,
               l,
               l,
               k,
               flag2
            );
            StringHolder_8(
               new net.minecraft.util.math.Vec3d(d0, d1, d5),
               new net.minecraft.util.math.Vec3d(d3, d1, d5),
               new net.minecraft.util.math.Vec3d(d3, d4, d5),
               new net.minecraft.util.math.Vec3d(d0, d4, d5),
               k,
               k,
               l,
               l,
               flag2
            );
            StringHolder_8(
               new net.minecraft.util.math.Vec3d(d0, d1, d2),
               new net.minecraft.util.math.Vec3d(d0, d1, d5),
               new net.minecraft.util.math.Vec3d(d0, d4, d5),
               new net.minecraft.util.math.Vec3d(d0, d4, d2),
               k,
               k,
               l,
               l,
               flag2
            );
            StringHolder_8(
               new net.minecraft.util.math.Vec3d(d0, d4, d2),
               new net.minecraft.util.math.Vec3d(d0, d4, d5),
               new net.minecraft.util.math.Vec3d(d3, d4, d5),
               new net.minecraft.util.math.Vec3d(d3, d4, d2),
               l,
               l,
               l,
               l,
               flag2
            );
         }

         if (flag) {
            StringHolder_8(d0, d1, d2, d3, d1, d2, i1, f, flag2);
            StringHolder_8(d3, d1, d2, d3, d1, d5, i1, f, flag2);
            StringHolder_8(d3, d1, d5, d0, d1, d5, i1, f, flag2);
            StringHolder_8(d0, d1, d5, d0, d1, d2, i1, f, flag2);
            StringHolder_8(new net.minecraft.util.math.Vec3d(d0, d1, d5), new net.minecraft.util.math.Vec3d(d0, d4, d5), i1, j1, f, flag2);
            StringHolder_8(new net.minecraft.util.math.Vec3d(d0, d1, d2), new net.minecraft.util.math.Vec3d(d0, d4, d2), i1, j1, f, flag2);
            StringHolder_8(new net.minecraft.util.math.Vec3d(d3, d1, d5), new net.minecraft.util.math.Vec3d(d3, d4, d5), i1, j1, f, flag2);
            StringHolder_8(new net.minecraft.util.math.Vec3d(d3, d1, d2), new net.minecraft.util.math.Vec3d(d3, d4, d2), i1, j1, f, flag2);
            StringHolder_8(d0, d4, d2, d3, d4, d2, j1, f, flag2);
            StringHolder_8(d3, d4, d2, d3, d4, d5, j1, f, flag2);
            StringHolder_8(d3, d4, d5, d0, d4, d5, j1, f, flag2);
            StringHolder_8(d0, d4, d5, d0, d4, d2, j1, f, flag2);
         }
      }
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack, VertexConsumer VertexConsumer, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, int i
   ) {
      StringHolder_8(MatrixStack, VertexConsumer, Vec3dx.toVector3f(), Vec3d.toVector3f(), i, i);
   }

   public static void StringHolder_8(
      MatrixStack MatrixStack, VertexConsumer VertexConsumer, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, int i, int j
   ) {
      StringHolder_8(MatrixStack, VertexConsumer, Vec3dx.toVector3f(), Vec3d.toVector3f(), i, j);
   }

   public static void StringHolder_8(MatrixStack MatrixStack, VertexConsumer VertexConsumer, Vector3f vector3f, Vector3f vector3f1, int i, int j) {
      MatrixStack.push();
      BeaconScreen5 BeaconScreen5 = MatrixStack.peek();
      Vector3f vector3f2 = EventBus(vector3f.x, vector3f.y, vector3f.z, vector3f1.x, vector3f1.y, vector3f1.z);
      VertexConsumer.vertex(BeaconScreen5, vector3f).color(i).normal(BeaconScreen5, vector3f2.x(), vector3f2.y(), vector3f2.z());
      VertexConsumer.vertex(BeaconScreen5, vector3f1).color(j).normal(BeaconScreen5, vector3f2.x(), vector3f2.y(), vector3f2.z());
      MatrixStack.pop();
   }

   public static void StringHolder_8(
      BeaconScreen5 BeaconScreen5,
      VertexConsumer VertexConsumer,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      int i
   ) {
      StringHolder_8(
         BeaconScreen5, VertexConsumer, Vec3dxxx.toVector3f(), Vec3dxx.toVector3f(), Vec3dx.toVector3f(), Vec3d.toVector3f(), i, i, i, i
      );
   }

   public static void StringHolder_8(
      BeaconScreen5 BeaconScreen5, VertexConsumer VertexConsumer, Vector3f vector3f, Vector3f vector3f1, Vector3f vector3f2, Vector3f vector3f3, int i
   ) {
      StringHolder_8(BeaconScreen5, VertexConsumer, vector3f, vector3f1, vector3f2, vector3f3, i, i, i, i);
   }

   public static void StringHolder_8(
      BeaconScreen5 BeaconScreen5,
      VertexConsumer VertexConsumer,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      int i,
      int j,
      int k,
      int l
   ) {
      StringHolder_8(
         BeaconScreen5, VertexConsumer, Vec3dxxx.toVector3f(), Vec3dxx.toVector3f(), Vec3dx.toVector3f(), Vec3d.toVector3f(), i, j, k, l
      );
   }

   public static void StringHolder_8(
      BeaconScreen5 BeaconScreen5, VertexConsumer VertexConsumer, Vector3f vector3f, Vector3f vector3f1, Vector3f vector3f2, Vector3f vector3f3, int i, int j, int k, int l
   ) {
      VertexConsumer.vertex(BeaconScreen5, vector3f).color(i);
      VertexConsumer.vertex(BeaconScreen5, vector3f1).color(j);
      VertexConsumer.vertex(BeaconScreen5, vector3f2).color(k);
      VertexConsumer.vertex(BeaconScreen5, vector3f3).color(l);
   }

   public static Vector3f EventBus(float f, float f1, float f2, float f3, float f4, float f5) {
      float f6 = f3 - f;
      float f7 = f4 - f1;
      float f8 = f5 - f2;
      float f9 = MathHelper.sqrt(f6 * f6 + f7 * f7 + f8 * f8);
      return new Vector3f(f6 / f9, f7 / f9, f8 / f9);
   }

   public static void IIIlII1I1I() {
      I11Il1lI11l1IlllIllIl1IIl = l1IlIl11IIlII111I;
      l1IlIl11IIlII111I = l1IlIl11IIlII111I + l11l11I111I1lIIl1;
      if (l11l11I111I1lIIl1 > 25.0F) {
         lll11IIl1lI1IlllI1ll1Il1 = true;
      }

      if (l11l11I111I1lIIl1 < -25.0F) {
         lll11IIl1lI1IlllI1ll1Il1 = false;
      }

      l11l11I111I1lIIl1 = lll11IIl1lI1IlllI1ll1Il1 ? l11l11I111I1lIIl1 - 0.5F : l11l11I111I1lIIl1 + 0.5F;
      lIlII11Ill1ll1I1llllIllIlIl1 = III1l1lllI1lI1I1l1l1II1;
      III1l1lllI1lI1I1l1l1II1 += 0.15F;
      ll11llI11I1IlllIlIl1I11I1I.removeIf(I1lIIIll1lIIl1IllllIlIll11$EventBus::lII1lIlI11l1IIl111I1l1I1Illll);
   }

   public static void StringHolder_8(double d0, double d1, double d2, double d3, double d4, double d5, int i, float f, boolean flag) {
      StringHolder_8(d0, d1, d2, d3, d4, d5, i, i, f, flag);
   }

   public static void StringHolder_8(double d0, double d1, double d2, double d3, double d4, double d5, int i, int j, float f, boolean flag) {
      StringHolder_8(new net.minecraft.util.math.Vec3d(d0, d1, d2), new net.minecraft.util.math.Vec3d(d3, d4, d5), i, j, f, flag);
   }

   public static void StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, int i, float f, boolean flag) {
      StringHolder_8(Vec3d, Vec3dx, i, i, f, flag);
   }

   public static void StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, int i, int j, float f, boolean flag) {
      net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera.getPos();
      Vec3dHolder$Helper i1liiill1liil1illllilill11$ii1il11l111ii11iil = new Vec3dHolder$Helper(
         Vec3d.subtract(Vec3dx), Vec3dxx.subtract(Vec3dx), i, j, f
      );
      if (flag) {
         l11l1111I1I11I1Il.add(i1liiill1liil1illllilill11$ii1il11l111ii11iil);
      } else {
         IlI11lI1I1lII1.add(i1liiill1liil1illllilill11$ii1il11l111ii11iil);
      }
   }

   public static void StringHolder_8(
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      int i,
      boolean flag
   ) {
      StringHolder_8(Vec3d, Vec3dxxx, Vec3dxx, Vec3dx, i, i, i, i, flag);
   }

   public static void StringHolder_8(
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      int i,
      int j,
      int k,
      int l,
      boolean flag
   ) {
      net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera.getPos();
      Vec3dHolder$EventTarget i1liiill1liil1illllilill11$illi1l1l1 = new Vec3dHolder$EventTarget(
         Vec3d.subtract(Vec3dx),
         Vec3dxxxx.subtract(Vec3dx),
         Vec3dxxx.subtract(Vec3dx),
         Vec3dxx.subtract(Vec3dx),
         i,
         j,
         k,
         l
      );
      if (flag) {
         l1l1II1lllll1Il1111I1ll1Ill1l.add(i1liiill1liil1illllilill11$illi1l1l1);
      } else {
         I1ll1IIlIl11111lIlIIIIIIlllI1l.add(i1liiill1liil1illllilill11$illi1l1l1);
      }
   }

   public static void StringHolder_8(LivingEntity LivingEntity, float f, float f1, float f2, Identifier Identifier) {
      float f3 = (2.2F - f1) * f;
      Camera Camera = l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera;
      net.minecraft.util.math.Vec3d Vec3d = doubleHolder_3.ZenithInternal021(LivingEntity).subtract(Camera.getPos());
      MatrixStack MatrixStack = new MatrixStack();
      MatrixStack.push();
      MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(Camera.getPitch()));
      MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(Camera.getYaw() + 180.0F));
      MatrixStack.translate(Vec3d.x, Vec3d.y + LivingEntity.getBoundingBox().getLengthY() / 2.0, Vec3d.z);
      MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-Camera.getYaw()));
      MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(Camera.getPitch()));
      MatrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(doubleHolder_3.ZenithInternal084(I11Il1lI11l1IlllIllIl1IIl, l1IlIl11IIlII111I)));
      StringHolder_8(1.0F, 1.0F - f2, 1.0F - f2, f1, () -> {
         RenderSystem.enableBlend();
         RenderSystem.disableDepthTest();
         RenderSystem.disableCull();
         RenderSystem.setShaderTexture(0, Identifier);
         MatrixStack.translate((double)(-f3 / 2.0F), (double)(-f3 / 2.0F), -0.01);
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         net.minecraft.client.render.BufferBuilder BufferBuilder = l1lIIlIl1I11lI11lI1l111I.begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
         BufferBuilder.vertex(matrix4f, 0.0F, f3, 0.0F).texture(0.0F, 1.0F).color(PatternHolder.ZenithInternal127(0));
         BufferBuilder.vertex(matrix4f, f3, f3, 0.0F).texture(1.0F, 1.0F).color(PatternHolder.ZenithInternal127(0));
         BufferBuilder.vertex(matrix4f, f3, 0.0F, 0.0F).texture(1.0F, 0.0F).color(PatternHolder.ZenithInternal127(90));
         BufferBuilder.vertex(matrix4f, 0.0F, 0.0F, 0.0F).texture(0.0F, 0.0F).color(PatternHolder.ZenithInternal127(180));
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         RenderSystem.enableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.disableBlend();
      });
      MatrixStack.pop();
   }

   public static void StringHolder_8(MatrixStack MatrixStack, LivingEntity LivingEntity, GetStartTimeHandler li1liiliill1, float f) {
      double d0 = (double)doubleHolder_3.ZenithInternal084(lIlII11Ill1ll1I1llllIllIlIl1, III1l1lllI1lI1I1l1l1II1);
      net.minecraft.util.math.Vec3d Vec3dxx = doubleHolder_3.ZenithInternal021(LivingEntity);
      boolean flag = Objects.requireNonNull(l11I1I1ll1Illll1I1l1111l1II.player).canSee(LivingEntity);
      float f1 = LivingEntity.getWidth() * Math.min(1.8F, 0.9F / (li1liiliill1.HootBar() == 1.0F ? li1liiliill1.CloudFriendInfo() : 1.0F));
      float f2 = LivingEntity.getHeight();
      float f3 = (float)(doubleHolder_3.CallableImpl(d0) * (double)f2);
      StringHolder_8(Vec3dxx, f1, (double)f3, 30);
      GL11.glEnable(2881);
      if (flag) {
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(false);
      } else {
         RenderSystem.disableDepthTest();
      }

      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE, AdvancementTabType5.ZERO, AdvancementTabType4.ONE);
      RenderSystem.disableCull();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderTexture(0, l1llII11lIIIll11Ill111IlIl);
      net.minecraft.client.render.BufferBuilder BufferBuilder = l1lIIlIl1I11lI11lI1l111I.begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
      Camera Camera = l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera;
      ll11llI11I1IlllIlIl1I11I1I.forEach(
         i1liiill1liil1illllilill11$l1i1illlili -> i1liiill1liil1illllilill11$l1i1illlili.StringHolder_8(
               MatrixStack, f, li1liiliill1.CloudFriendInfo(), BufferBuilder
            )
      );
      net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
      int i = PatternHolder.EventBus(
         ZenithClient.getInstance()
            .floatHolder_3()
            .getClientColor(90)
            .StringHolder_8(ByteBufferHolder.lIlll1llI1l11I1ll11llIll111I, f)
            .lllIlll1Ill111l111Il11II11lII(),
         li1liiliill1.CloudFriendInfo()
      );
      float f4 = 0.0F;

      for (float f5 = 90.0F; f4 <= f5; f4++) {
         net.minecraft.util.math.Vec3d Vec3dx = doubleHolder_3.StringHolder_8(f4, f5, (double)f1);
         net.minecraft.util.math.Vec3d Vec3dxx = doubleHolder_3.StringHolder_8(f4 + 1.0F, f5, (double)f1);
         StringHolder_8(
            Vec3dxx.add(Vec3dx.x, Vec3dx.y + (double)f3, Vec3dx.z),
            Vec3dxx.add(Vec3dxx.x, Vec3dxx.y + (double)f3, Vec3dxx.z),
            i,
            3.0F,
            flag
         );
      }

      if (flag) {
         RenderSystem.depthMask(true);
         RenderSystem.disableDepthTest();
      } else {
         RenderSystem.enableDepthTest();
      }

      GL11.glDisable(2881);
   }

   private static void StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, float f, double d0, int i) {
      for (int j = 0; j < i; j++) {
         double d1 = l11lI1I11lIl.nextDouble() * Math.PI * 2.0;
         double d2 = l11lI1I11lIl.nextDouble();
         double d3 = (double)f;
         double d4 = Vec3d.x + Math.cos(d1) * d3;
         double d5 = Vec3d.z + Math.sin(d1) * d3;
         double d6 = Vec3d.y + d0;
         ll11llI11I1IlllIlIl1I11I1I.add(new I1lIIIll1lIIl1IllllIlIll11$EventBus(d4, d6, d5));
      }
   }

   public static void StringHolder_8(
      EventImpl_34 ll1li1l111llllli1, float f, float f1, int i, int j, float f2, float f3, float f4, LivingEntity LivingEntity
   ) {
      try {
         Camera Camera = l11I1I1ll1Illll1I1l1111l1II.gameRenderer.getCamera();
         boolean flag = Objects.requireNonNull(l11I1I1ll1Illll1I1l1111l1II.player).canSee(LivingEntity);
         double d0 = HashMapHolder.byteHolder_2(LivingEntity.prevX, LivingEntity.getX(), (double)Interface()) - Camera.getPos().x;
         double d1 = HashMapHolder.byteHolder_2(LivingEntity.prevY, LivingEntity.getY(), (double)Interface()) - Camera.getPos().y;
         double d2 = HashMapHolder.byteHolder_2(LivingEntity.prevZ, LivingEntity.getZ(), (double)Interface()) - Camera.getPos().z;
         float f5 = (float)HashMapHolder.byteHolder_2((double)(LivingEntity.age - 1), (double)LivingEntity.age, (double)Interface());
         if (flag) {
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(false);
         } else {
            RenderSystem.disableDepthTest();
         }

         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE, AdvancementTabType5.ZERO, AdvancementTabType4.ONE);
         RenderSystem.setShaderTexture(0, l1llII11lIIIll11Ill111IlIl);
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
         if (flag) {
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(false);
         } else {
            RenderSystem.disableDepthTest();
         }

         float[] afloat = new float[]{1.0F, 1.0F, 1.0F};
         float[] afloat1 = new float[]{223.0F, 259.0F, 223.0F};
         float[] afloat2 = new float[]{1.0F, 1.18F, 0.74F};
         float f6 = 0.43F;

         for (int k = 0; k < 3; k++) {
            for (int l = 0; l <= i; l++) {
               float f7 = (float)l / (float)i;
               float f8 = 0.5F * f4;
               f8 = MathHelper.lerp(f7, 0.0F, f8);
               double d3 = (double)((((float)l * f6 / 1.5F / 8.0F * afloat[k] + f5 * afloat[k] + afloat1[k]) * (float)j + (float)(k * 120)) % (float)(j * 360));
               long i1 = 2000L;
               double d4 = Math.toRadians(d3);
               double d5 = Math.sin(Math.toRadians((double)(f5 * 2.0F * afloat2[k] + (float)l * f6 / 8.0F * (float)(k + 1))) * (double)f3) / (double)f2;
               MatrixStack MatrixStack = new MatrixStack();
               MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(Camera.getPitch()));
               MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(Camera.getYaw() + 180.0F));
               MatrixStack.translate(
                  d0 + Math.cos(d4) * (double)LivingEntity.getWidth(),
                  d1 + (double)(LivingEntity.getHeight() / 2.5F) + d5 + (double)((float)k * 0.3F),
                  d2 + Math.sin(d4) * (double)LivingEntity.getWidth()
               );
               MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-Camera.getYaw()));
               MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(Camera.getPitch()));
               Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
               int j1 = PatternHolder.EventBus(
                  ZenithClient.getInstance()
                     .floatHolder_3()
                     .getClientColor(90)
                     .StringHolder_8(ByteBufferHolder.lIlll1llI1l11I1ll11llIll111I, f1)
                     .lllIlll1Ill111l111Il11II11lII(),
                  f7 * f
               );
               HashMapHolder.EventTarget(matrix4f, BufferBuilder, -f8 / 2.0F, -f8 / 2.0F, f8, f8, j1);
            }
         }

         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
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

   public static void StringHolder_8(float f, float f1, float f2, float f3, Runnable runnable) {
      RenderSystem.setShaderColor(
         MathHelper.clamp(f, 0.0F, 1.0F),
         MathHelper.clamp(f1, 0.0F, 1.0F),
         MathHelper.clamp(f2, 0.0F, 1.0F),
         MathHelper.clamp(f3, 0.0F, 1.0F)
      );
      runnable.run();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static float Interface() {
      return l11I1I1ll1Illll1I1l1111l1II.getRenderTickCounter().getTickDelta(false);
   }

   private ListHolder_2() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public static void StringHolder_8(Matrix4f matrix4f) {
      l11lllI1IIl1lI1II1lI1l1I1l1lII = matrix4f;
   }

   public static void EventBus(Matrix4f matrix4f) {
      II11111I1IlIIII1l1l1l = matrix4f;
   }

   public static void EventTarget(Matrix4f matrix4f) {
      l1lllI1llI1l = matrix4f;
   }

   public static Matrix4f l1lIIII11lI1Il1111IllII1II1lI() {
      return l11lllI1IIl1lI1II1lI1l1I1l1lII;
   }

   public static Matrix4f IlIlI1lIllIl1l1I1IIIlllI11() {
      return II11111I1IlIIII1l1l1l;
   }

   public static Matrix4f l1lI1IIllIIl() {
      return l1lllI1llI1l;
   }
}
