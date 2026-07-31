// Module: Trails
// Category: render
// Original class: Trails
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.render;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.util.Identifier;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.client.render.VertexFormat.LootPool96;
import org.joml.Matrix4f;

@ModuleInfo(
   name = "Trails",
   category = Category.RENDER,
   description = "Светящийся след за игроком при движении"
)
public final class Trails extends Module {
   public static final Trails II111llIl1Il1IIIlIIl11 = new Trails();
   private static final Identifier lllIl1I1l1I = Identifier.of("zenith", "particles/firefly.png");
   private static final double lII1l1I1II1l1111ll1 = 9.0E-6;
   private static final double I1l11I11IIII11I1 = 0.02;
   private static final double lIllIl1Il11l1IIII1l1 = 64.0;
   private static final int IIlllIl11Ill111l1I = 3;
   private static final int ll1I1Ill1III1III11lI1IIl = 2;
   private static final int lIl1l1lI1llllIlIlIlll1 = 2;
   private static final float lll11l1llllII111I = 0.02F;
   private final ModeSetting ll1llll1l1Ill1lIIl1I1II1I111lI = new ModeSetting(
      "module.trails.mode", "module.trails.mode.desc", "module.trails.particles", "module.trails.trails"
   );
   private final ModeSetting lll1lIl1ll11 = new ModeSetting(
      "module.trails.texture", "module.trails.particleTexture.desc", () -> this.ll1llll1l1Ill1lIIl1I1II1I111lI.ClearHeadersHandler(0), l111I111IlII1()
   );
   private final BooleanSetting Il1111I11IIlI11lIII = new BooleanSetting(
      "module.trails.hideFirstPerson", "module.trails.hideFirstPerson.desc", false
   );
   private final NumberSetting l11I11ll1I11lIII1ll11IIll1I = new NumberSetting(
      "module.trails.length",
      150.0F,
      50.0F,
      300.0F,
      10.0F,
      "module.trails.trailLength.desc",
      "x",
      () -> this.ll1llll1l1Ill1lIIl1I1II1I111lI.ClearHeadersHandler(1),
      null
   );
   private final NumberSetting I11I111l1l11IIlIll1l1l1I1lIl1 = new NumberSetting(
      "module.trails.pointSize",
      0.5F,
      0.1F,
      2.0F,
      0.1F,
      "module.trails.pointSize.desc",
      "x",
      () -> this.ll1llll1l1Ill1lIIl1I1II1I111lI.ClearHeadersHandler(1),
      null
   );
   private final NumberSetting II1Il1III11111Ill = new NumberSetting(
      "module.trails.opacity",
      100.0F,
      10.0F,
      100.0F,
      5.0F,
      "module.trails.opacity.desc",
      "%",
      () -> this.ll1llll1l1Ill1lIIl1I1II1I111lI.ClearHeadersHandler(1),
      null
   );
   private final NumberSetting I111111IllI1I11l111 = new NumberSetting(
      "module.trails.particleCount",
      5.0F,
      1.0F,
      10.0F,
      1.0F,
      "module.trails.particleCount.desc",
      "x",
      () -> this.ll1llll1l1Ill1lIIl1I1II1I111lI.ClearHeadersHandler(0),
      null
   );
   private final NumberSetting IlI11I1lIl1llI1III1I1I11ll = new NumberSetting(
      "module.trails.particleSize",
      0.2F,
      0.1F,
      3.0F,
      0.1F,
      "module.trails.particleSize.desc",
      "x",
      () -> this.ll1llll1l1Ill1lIIl1I1II1I111lI.ClearHeadersHandler(0),
      null
   );
   private final NumberSetting lI1I1IllIllIllI1I1IIl = new NumberSetting(
      "module.trails.particleSpeed",
      1.3F,
      0.1F,
      3.0F,
      0.1F,
      "module.trails.particleSpeed.desc",
      "x",
      () -> this.ll1llll1l1Ill1lIIl1I1II1I111lI.ClearHeadersHandler(0),
      null
   );
   private final NumberSetting lIII1lIl1 = new NumberSetting(
      "module.trails.particleLifetime",
      40.0F,
      10.0F,
      100.0F,
      5.0F,
      "module.trails.particleLifetime.desc",
      "t",
      () -> this.ll1llll1l1Ill1lIIl1I1II1I111lI.ClearHeadersHandler(0),
      null
   );
   private final ModeSetting I1lI11lI1IllllIIl1IlI11II = new ModeSetting(
      "module.trails.color", "module.trails.colorMode.desc", "module.particles.sync", "module.particles.custom"
   );
   private final ColorSetting l11l11Ill1l11Il = new ColorSetting(
      "module.trails.customColor",
      "module.trails.customColor.desc",
      ByteBufferHolder.ll1lIllll111I1lIIl1lIl,
      () -> this.I1lI11lI1IllllIIl1IlI11II.ClearHeadersHandler(1)
   );
   private final Deque<net.minecraft.util.math.Vec3d> l1IllIIl1IlI11Il1lI = new ArrayDeque<>();
   private net.minecraft.util.math.Vec3d I1IIIlIIIl1ll1III1 = null;
   private int lIIl1Il11111lIlI1I1lll1l11ll1 = 0;
   private final List<MinecraftClientHolder_2> II11Illll11l1lIIlIIl1II1l11 = new ArrayList<>();
   private int lI11IlI1Illl11llIll11lIIIl = 0;

   private static String[] l111I111IlII1() {
      return ZenithInternal063.l111I111IlII1();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      super.l1l1lI111l1II1Illl111l1l1ll1l();
      this.l1IllIIl1IlI11Il1lI.clear();
      this.I1IIIlIIIl1ll1III1 = null;
      this.lIIl1Il11111lIlI1I1lll1l11ll1 = 0;
      this.II11Illll11l1lIIlIIl1II1l11.clear();
      this.lI11IlI1Illl11llIll11lIIIl = 0;
   }

   @EventTarget
   public void StringHolder_8(EventImpl_2 i1i11liii111lill1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         if (this.ll1llll1l1Ill1lIIl1I1II1I111lI.ClearHeadersHandler(0)) {
            net.minecraft.util.math.Vec3d Vec3dxx = l11I1I1ll1Illll1I1l1111l1II.player.getBoundingBox().getCenter();
            boolean flag = Math.abs(l11I1I1ll1Illll1I1l1111l1II.player.getVelocity().x) > 0.05
               || Math.abs(l11I1I1ll1Illll1I1l1111l1II.player.getVelocity().z) > 0.05
               || Math.abs(l11I1I1ll1Illll1I1l1111l1II.player.getVelocity().y) > 0.15;
            if (flag) {
               this.lI11IlI1Illl11llIll11lIIIl++;
               if (this.lI11IlI1Illl11llIll11lIIIl >= 2) {
                  this.lI11IlI1Illl11llIll11lIIIl = 0;
                  this.ZenithInternal128(Vec3dxx);
               }
            }

            this.II11Illll11l1lIIlIIl1II1l11.removeIf(SetColorHandler_2::ll1IlIIll11II11II1111);

            for (MinecraftClientHolder_2 iiii11ll111l1llilll1l1illil11 : this.II11Illll11l1lIIlIIl1II1l11) {
               this.StringHolder_8(iiii11ll111l1llilll1l1illil11, Vec3dxx);
            }
         } else {
            int k = (int)this.l11I11ll1I11lIII1ll11IIll1I.lll1lI1llll1IIllIIIII1lll();
            net.minecraft.util.math.Vec3d Vec3d = l11I1I1ll1Illll1I1l1111l1II.player
               .getPos()
               .add(0.0, (double)l11I1I1ll1Illll1I1l1111l1II.player.getHeight() / 2.0, 0.0);
            if (this.I1IIIlIIIl1ll1III1 == null) {
               this.l1IllIIl1IlI11Il1lI.addLast(Vec3d);
               this.I1IIIlIIIl1ll1III1 = Vec3d;
               this.lIIl1Il11111lIlI1I1lll1l11ll1 = 0;
            } else {
               double d1 = this.I1IIIlIIIl1ll1III1.squaredDistanceTo(Vec3d);
               if (d1 > 9.0E-6) {
                  int i = Math.max(1, (int)(d1 / 0.02));
                  if (i > 1000) {
                     i = 0;
                  }

                  for (int j = 1; j <= i; j++) {
                     double d0 = (double)j / (double)i;
                     net.minecraft.util.math.Vec3d Vec3dx = this.I1IIIlIIIl1ll1III1.lerp(Vec3d, d0);
                     this.l1IllIIl1IlI11Il1lI.addLast(Vec3dx);
                  }

                  this.I1IIIlIIIl1ll1III1 = Vec3d;
                  this.lIIl1Il11111lIlI1I1lll1l11ll1 = 0;

                  while (this.l1IllIIl1IlI11Il1lI.size() > k) {
                     this.l1IllIIl1IlI11Il1lI.pollFirst();
                  }
               } else {
                  this.lIIl1Il11111lIlI1I1lll1l11ll1++;
                  if (this.lIIl1Il11111lIlI1I1lll1l11ll1 > 2) {
                     for (int l = 0; l < 3 && !this.l1IllIIl1IlI11Il1lI.isEmpty(); l++) {
                        this.l1IllIIl1IlI11Il1lI.pollFirst();
                     }
                  }
               }
            }
         }
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl_34 ll1li1l111llllli1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         if (!this.Il1111I11IIlI11lIII.Spider() || !l11I1I1ll1Illll1I1l1111l1II.options.getPerspective().isFirstPerson()) {
            if (this.ll1llll1l1Ill1lIIl1I1II1I111lI.ClearHeadersHandler(0)) {
               if (!this.II11Illll11l1lIIlIIl1II1l11.isEmpty()) {
                  MinecraftClientHolder_4.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.gameRenderer.getCamera());
                  MinecraftClientHolder_4.StringHolder_8(
                     ll1li1l111llllli1.Norender(), ll1li1l111llllli1.Particles(), this.II11Illll11l1lIIlIIl1II1l11
                  );
               }
            } else if (this.l1IllIIl1IlI11Il1lI.size() >= 2) {
               this.ZenithInternal095(ll1li1l111llllli1.Norender());
            }
         }
      }
   }

   private void ZenithInternal095(MatrixStack MatrixStack) {
      Camera Camera = l11I1I1ll1Illll1I1l1111l1II.gameRenderer.getCamera();
      net.minecraft.util.math.Vec3d Vec3dxx = Camera.getPos();
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderTexture(0, lllIl1I1l1I);
      net.minecraft.client.render.Tessellator Tessellator = net.minecraft.client.render.Tessellator.getInstance();
      net.minecraft.client.render.BufferBuilder BufferBuilder = Tessellator.begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
      float f = this.I11I111l1l11IIlIll1l1l1I1lIl1.lll1lI1llll1IIllIIIII1lll();
      int i = this.l1IllIIl1IlI11Il1lI.size();
      float f1 = Camera.getPitch();
      float f2 = Camera.getYaw();
      int j = 0;

      for (net.minecraft.util.math.Vec3d Vec3dx : this.l1IllIIl1IlI11Il1lI) {
         float f3 = (float)j / (float)i;
         float f4 = this.II1Il1III11111Ill.lll1lI1llll1IIllIIIII1lll() / 100.0F * 0.85F;
         float f5 = f3 * f3 * f4;
         if (f5 < 0.02F) {
            j++;
         } else {
            float f6 = f * (0.2F + f3 * 0.8F);
            net.minecraft.util.math.Vec3d Vec3dxx = Vec3dx.subtract(Vec3dxx);
            ByteBufferHolder il1iliilli1l1iill = this.ZenithInternal149(j);
            this.EventBus(BufferBuilder, f1, f2, Vec3dxx, f6 * 1.8F, f5 * 0.4F, il1iliilli1l1iill);
            this.EventBus(BufferBuilder, f1, f2, Vec3dxx, f6, f5, il1iliilli1l1iill);
            j++;
         }
      }

      net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   }

   private void EventBus(
      net.minecraft.client.render.BufferBuilder BufferBuilder, float f, float f1, net.minecraft.util.math.Vec3d Vec3d, float f2, float f3, ByteBufferHolder il1iliilli1l1iill
   ) {
      MatrixStack MatrixStack = new MatrixStack();
      MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(f));
      MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(f1 + 180.0F));
      MatrixStack.translate(Vec3d.x, Vec3d.y, Vec3d.z);
      MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-f1));
      MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(f));
      Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
      int i = (int)(f3 * 255.0F) << 24
         | il1iliilli1l1iill.IlIIlllIIIlllI1Il1Il11llI1lll() << 16
         | il1iliilli1l1iill.llI11I1ll11IlI() << 8
         | il1iliilli1l1iill.III11IllIIIIlII1Il1IIlI();
      float f4 = f2 / 2.0F;
      BufferBuilder.vertex(matrix4f, f4, -f4, 0.0F).texture(0.0F, 1.0F).color(i);
      BufferBuilder.vertex(matrix4f, -f4, -f4, 0.0F).texture(1.0F, 1.0F).color(i);
      BufferBuilder.vertex(matrix4f, -f4, f4, 0.0F).texture(1.0F, 0.0F).color(i);
      BufferBuilder.vertex(matrix4f, f4, f4, 0.0F).texture(0.0F, 0.0F).color(i);
   }

   private ByteBufferHolder ZenithInternal149(int i) {
      return this.I1lI11lI1IllllIIl1IlI11II.ClearHeadersHandler(0)
         ? ZenithClient.getInstance().floatHolder_3().getClientColor(i * 2)
         : this.l11l11Ill1l11Il.l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }

   private void ZenithInternal128(net.minecraft.util.math.Vec3d Vec3d) {
      ThreadLocalRandom threadlocalrandom = ThreadLocalRandom.current();
      int i = (int)this.I111111IllI1I11l111.lll1lI1llll1IIllIIIII1lll();
      float f = this.lI1I1IllIllIllI1I1IIl.lll1lI1llll1IIllIIIII1lll();
      net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.player.getVelocity();
      net.minecraft.util.math.Vec3d Vec3dxx = Vec3dx.normalize().multiply(-1.0);

      for (int j = 0; j < i; j++) {
         double d0 = threadlocalrandom.nextDouble(-0.3, 0.3);
         double d1 = threadlocalrandom.nextDouble(
            (double)(-l11I1I1ll1Illll1I1l1111l1II.player.getHeight() / 2.1F), (double)(l11I1I1ll1Illll1I1l1111l1II.player.getHeight() / 2.0F)
         );
         double d2 = threadlocalrandom.nextDouble(-0.3, 0.3);
         net.minecraft.util.math.Vec3d Vec3dxxx = Vec3dxxxx.add(Vec3dxx.x * 0.3 + d0, d1, Vec3dxx.z * 0.3 + d2);
         double d3 = threadlocalrandom.nextDouble(0.0, Math.PI * 2);
         double d4 = threadlocalrandom.nextDouble(-Math.PI / 4, Math.PI / 4);
         double d5 = Math.cos(d4);
         double d6 = Math.sin(d4);
         net.minecraft.util.math.Vec3d Vec3dxxxx = new net.minecraft.util.math.Vec3d(
            Math.cos(d3) * d5 * threadlocalrandom.nextDouble(0.02, 0.06) * (double)f,
            d6 * threadlocalrandom.nextDouble(0.02, 0.06) * (double)f,
            Math.sin(d3) * d5 * threadlocalrandom.nextDouble(0.02, 0.06) * (double)f
         );
         int k = (int)this.lIII1lIl1.lll1lI1llll1IIllIIIII1lll();
         int l = threadlocalrandom.nextInt(k / 2, k);
         float f1 = this.IlI11I1lIl1llI1III1I1I11ll.lll1lI1llll1IIllIIIII1lll() * threadlocalrandom.nextFloat(0.7F, 1.3F);
         ByteBufferHolder il1iliilli1l1iill = this.ZenithInternal149(j * 10);
         float f2 = threadlocalrandom.nextFloat(0.0F, 360.0F);
         float f3 = threadlocalrandom.nextFloat(-2.0F, 2.0F);
         String s = this.lll1lIl1ll11.Il1I11IIlllIl111l11I1I11().toLowerCase();
         this.II11Illll11l1lIIlIIl1II1l11.add(new MinecraftClientHolder_2(Vec3dxxx, Vec3dxxxx, l, f1, il1iliilli1l1iill, s, f2, f3));
      }
   }

   private void StringHolder_8(MinecraftClientHolder_2 iiii11ll111l1llilll1l1illil11, net.minecraft.util.math.Vec3d Vec3d) {
      iiii11ll111l1llilll1l1illil11.ZenithInternal139(iiii11ll111l1llilll1l1illil11.I1l11I1lllI1I1l1I1Ill1I1Il());
      double d0 = iiii11ll111l1llilll1l1illil11.Cameratweaks().distanceTo(Vec3dx);
      int i = d0 > 64.0 ? 8 : 1;
      iiii11ll111l1llilll1l1illil11.EventImpl_6(iiii11ll111l1llilll1l1illil11.I1l11I1lllI1I1l1I1Ill1I1Il() - i);
      if (iiii11ll111l1llilll1l1illil11.I1l11I1lllI1I1l1I1Ill1I1Il() > 0) {
         iiii11ll111l1llilll1l1illil11.HostnameVerifierImpl(iiii11ll111l1llilll1l1illil11.Cameratweaks());
         float f = 1.0F - (float)iiii11ll111l1llilll1l1illil11.I1l11I1lllI1I1l1I1Ill1I1Il() / (float)iiii11ll111l1llilll1l1illil11.IllllllIl1Il();
         net.minecraft.util.math.Vec3d Vec3dx = iiii11ll111l1llilll1l1illil11.I1IIIlI11Il1();
         if (f > 0.6F) {
            float f1 = (f - 0.6F) / 0.4F;
            double d1 = 0.003 * (double)f1;
            Vec3dx = new net.minecraft.util.math.Vec3d(Vec3dx.x * 0.98, Vec3dx.y - d1, Vec3dx.z * 0.98);
         } else {
            Vec3dx = Vec3dx.multiply(0.98);
         }

         iiii11ll111l1llilll1l1illil11.longHolder_4(Vec3dx);
         iiii11ll111l1llilll1l1illil11.EventBus(iiii11ll111l1llilll1l1illil11.Cameratweaks().add(Vec3dx));
         iiii11ll111l1llilll1l1illil11.ZenithInternal123(iiii11ll111l1llilll1l1illil11.I1l1l1I1I11llII11l() + iiii11ll111l1llilll1l1illil11.l1IIl1IIl1lIlll());
         if (iiii11ll111l1llilll1l1illil11.Cameratweaks().y <= (double)l11I1I1ll1Illll1I1l1111l1II.world.getBottomY()) {
            iiii11ll111l1llilll1l1illil11.EventImpl_6(0);
         }
      }
   }
}
