// Module: Particles
// Category: render
// Original class: Particles
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.render;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.blaze3d.platform.GlStateManager.AdvancementTabType4;
import com.mojang.blaze3d.platform.GlStateManager.AdvancementTabType5;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.VertexFormat.LootPool96;
import net.minecraft.client.util.math.MatrixStack.BeaconScreen5;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL11;

@ModuleInfo(
   name = "Particles",
   category = Category.RENDER,
   description = "module.particles.description"
)
public class Particles extends Module {
   public static final Particles IIlIIl11llll1 = new Particles();
   private static final Identifier lI1IlI111II111llI1l111 = Identifier.of("zenith", "visuals/jumpcircle/glowboost.png");
   private static final int[] l1lIIIl11IIllI1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 0, 2, 1, 3, 4, 6, 5, 7, 0, 4, 1, 5, 2, 6, 3, 7};
   private static final int[] IlII1IlI1lIIIII1 = new int[]{0, 1, 1, 2, 2, 3, 3, 0, 0, 4, 1, 4, 2, 4, 3, 4};
   private static final float I1I1IIl11ll = 0.6F;
   private static final float ll1I11I11I1lll = 1.6F;
   private static final int llllIIlIlI1llIlIlIlIIllII1 = 200;
   private static final long llll111IIIIlI111IlI1llIl = 50L;
   private static final double lI1I111lII1lI1Il = 2.5;
   private final MultiBooleanSetting I1lI1Ill11llIlI111l = MultiBooleanSetting.StringHolder_8(
      "module.particles.effects",
      "module.particles.effects.desc",
      List.of(
         "module.particles.meteor",
         "module.particles.cubes",
         "module.particles.pyramids",
         "module.particles.totem",
         "module.particles.crescent",
         "module.particles.heart",
         "module.particles.stars"
      )
   );
   private final NumberSetting lIII11I1lI1ll1llI1111l1ll = new NumberSetting(
      "module.particles.count", 14.0F, 1.0F, 80.0F, 1.0F, "module.particles.count.desc", ""
   );
   private final NumberSetting I1I1II1I1II11lII1ll = new NumberSetting(
      "module.particles.lifetime", 1600.0F, 500.0F, 5000.0F, 100.0F, "module.particles.lifetime.desc", "ms"
   );
   private final NumberSetting ll1ll1llIlIlI1I1 = new NumberSetting(
      "module.particles.size", 0.45F, 0.1F, 1.5F, 0.05F, "module.particles.size.desc", "x"
   );
   private final NumberSetting IlllII1IlIl1lI1lIIIl11IIlI = new NumberSetting(
      "module.particles.radius", 8.0F, 0.1F, 80.0F, 0.5F, "module.particles.radius.desc", ""
   );
   private final NumberSetting llIII1lll1l1111 = new NumberSetting(
      "module.particles.tailLength",
      0.3F,
      0.05F,
      0.7F,
      0.05F,
      "module.particles.tailLength.desc",
      "x",
      () -> this.I1lI1Ill11llIlI111l.ConstructorHolder(0),
      null
   );
   private final BooleanSetting lI1lIll111l1llI1111IIl1II1 = new BooleanSetting(
      "module.particles.hit", "module.particles.hit.desc", false
   );
   private final NumberSetting I11lII1Il1I1IlIIIl1IlIl = new NumberSetting(
      "module.particles.glow",
      1.0F,
      0.0F,
      3.0F,
      0.1F,
      "module.particles.glow.desc",
      "x",
      () -> this.I1lI1Ill11llIlI111l.ConstructorHolder(1)
            || this.I1lI1Ill11llIlI111l.ConstructorHolder(2)
            || this.I1lI1Ill11llIlI111l.ConstructorHolder(3)
            || this.I1lI1Ill11llIlI111l.ConstructorHolder(4)
            || this.I1lI1Ill11llIlI111l.ConstructorHolder(5)
            || this.I1lI1Ill11llIlI111l.ConstructorHolder(6)
            || this.lI1lIll111l1llI1111IIl1II1.Spider(),
      null
   );
   private final MultiBooleanSetting l11I1lll111IIIll1IIIIl1llI11l = MultiBooleanSetting.StringHolder_8(
      "module.particles.hitTypes", "module.particles.hitTypes.desc", List.of("module.particles.cubes", "module.particles.diamond", "module.particles.triangle")
   );
   private final ModeSetting I1lIIlI1lIllIII111lIIIII = new ModeSetting(
      "module.particles.hitPhysics",
      "module.particles.hitPhysics.desc",
      this.lI1lIll111l1llI1111IIl1II1::Spider,
      "module.particles.drop",
      "module.particles.fly",
      "module.particles.both"
   );
   private final NumberSetting IllI1IIllIII1lIlIIII11l11 = new NumberSetting(
      "module.particles.hitCount", 10.0F, 1.0F, 20.0F, 1.0F, "module.particles.hitCount.desc", "", this.lI1lIll111l1llI1111IIl1II1::Spider, null
   );
   private final NumberSetting II111l1ll = new NumberSetting(
      "module.particles.hitLifetime",
      1000.0F,
      100.0F,
      3000.0F,
      50.0F,
      "module.particles.hitLifetime.desc",
      "ms",
      this.lI1lIll111l1llI1111IIl1II1::Spider,
      null
   );
   private final NumberSetting IIIl11lI = new NumberSetting(
      "module.particles.hitSpeed", 1.0F, 0.1F, 3.0F, 0.1F, "module.particles.hitSpeed.desc", "x", this.lI1lIll111l1llI1111IIl1II1::Spider, null
   );
   private final NumberSetting III1I1Il1l = new NumberSetting(
      "module.particles.hitScale", 1.0F, 0.5F, 1.5F, 0.1F, "module.particles.hitScale.desc", "x", this.lI1lIll111l1llI1111IIl1II1::Spider, null
   );
   private final BooleanSetting I11llllIlllIlIll1l11 = new BooleanSetting(
      "module.particles.hitOnlyCrit", "module.particles.hitOnlyCrit.desc", false, this.lI1lIll111l1llI1111IIl1II1::Spider
   );
   private final BooleanSetting lI1lllllII11II1llIIIl1I1 = new BooleanSetting(
      "module.particles.hitBounce",
      "module.particles.hitBounce.desc",
      false,
      () -> this.lI1lIll111l1llI1111IIl1II1.Spider() && !this.I1lIIlI1lIllIII111lIIIII.ClearHeadersHandler(1)
   );
   private final ModeSetting I1l1I1111I = new ModeSetting(
      "module.particles.color", "module.particles.colorMode.desc", "module.particles.sync", "module.particles.custom"
   );
   private final ColorSetting II111lI11I111I11Ill111 = new ColorSetting(
      "module.particles.customColor",
      "module.particles.customColor.desc",
      ByteBufferHolder.ll1lIllll111I1lIIl1lIl,
      () -> this.I1l1I1111I.ClearHeadersHandler(1)
   );
   private final List<Particles$l1IIl11lI> lll1I1111l1l1 = new ArrayList<>();
   private final List<Particles$II1Il11l111II11IIl> lIIII1III1IlIIIl1I = new ArrayList<>();
   private final List<Particles$II1Il11l111II11IIl> l1lIIII1 = new ArrayList<>();
   private final List<Particles$II1Il11l111II11IIl> IlI1ll11l1llll11lll1IllIl1 = new ArrayList<>();
   private final List<Particles$II1Il11l111II11IIl> I11Il11lllllllI1IlllI = new ArrayList<>();
   private final List<Particles$II1Il11l111II11IIl> llIl1lI1I1lIlllIIII1llIlI1lI = new ArrayList<>();
   private final List<Particles$II1Il11l111II11IIl> I1lll1Il1I1IlIlIIll = new ArrayList<>();
   private final List<Particles$EventTarget> l11l11III1111Il1Il11l1I1lllll = new ArrayList<>();
   private final List<Particles$EventTarget> IIl1lIllIll1IlIlI1IlI1l = new ArrayList<>();
   private final List<Particles$EventTarget> I11II11I11IIl1I1 = new ArrayList<>();
   private long ll11l1Il1l1IlIll;
   private final Random l1IlIlI1111II11lIIll = new Random();
   private final Vector3f[] lIlI1llIl1l11lI1111l = new Vector3f[8];
   private final Matrix3f IlIll1I1llI = new Matrix3f();
   private final Vector3f IIl11lI1llI1I11 = new Vector3f();
   private final Vector3f ll1lI1l1IIIlIII1l1l11l1lI = new Vector3f();
   private final Matrix4f llllI1IlllII1 = new Matrix4f();
   private final Matrix4f l1llI1111IlIl1 = new Matrix4f();
   private final Matrix4f Ill11111Ill11lI1ll111I11I1lII = new Matrix4f();
   private double II11ll1l11Il1IIllIl1l1l11l1ll;
   private double l11IlIlI1IllllllI1llI1l1;
   private double l11l11Il1;
   private float lI11Ill111Il11111l1Ill1l1IlIlI;
   private float[] l1I1IIIlII11llIII = new float[6144];
   private int[] lII1llIII1l1IllIl = new int[1024];
   private int IlIIllIllIl1lllII1lIl1I1Il;
   private float[] IlI111lIl1Il1II1111Il = new float[1536];
   private int[] ll1lll1I1lll1II11Il = new int[256];
   private int II111IlI1l1II11111I1l1;
   private float[] I1Illl1Il111IIIl;
   private float[] l11Il1llIl11l11IIlII1I;
   private float[] llIl1I11111IIIIII11II111I;
   private float[] llIlIl1lII1II1ll11;
   private boolean I1111I1lIlIll;
   private boolean Illl11l1IllllIl11II11IllII1;
   private boolean l111lIIlIII1;
   private static final float IIllIlI11IIIIII = 0.985F;

   private Particles() {
      for (int i = 0; i < 8; i++) {
         this.lIlI1llIl1l11lI1111l[i] = new Vector3f();
      }
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
      this.lll1I1111l1l1.clear();
      this.lIIII1III1IlIIIl1I.clear();
      this.l1lIIII1.clear();
      this.IlI1ll11l1llll11lll1IllIl1.clear();
      this.I11Il11lllllllI1IlllI.clear();
      this.llIl1lI1I1lIlllIIII1llIlI1lI.clear();
      this.I1lll1Il1I1IlIlIIll.clear();
      this.l1lIlIl1llIl11IIllllIII111I1l1();
      this.ll11l1Il1l1IlIll = System.currentTimeMillis();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      super.l1l1lI111l1II1Illl111l1l1ll1l();
      this.lll1I1111l1l1.clear();
      this.lIIII1III1IlIIIl1I.clear();
      this.l1lIIII1.clear();
      this.IlI1ll11l1llll11lll1IllIl1.clear();
      this.I11Il11lllllllI1IlllI.clear();
      this.llIl1lI1I1lIlllIIII1llIlI1lI.clear();
      this.I1lll1Il1I1IlIlIIll.clear();
      this.l1lIlIl1llIl11IIllllIII111I1l1();
   }

   @EventTarget
   public void byteHolder(EventImpl_34 ll1li1l111llllli1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         long i = System.currentTimeMillis();
         this.ZenithInternal101(i);
         this.ZenithInternal042(i);
         Camera Camera = l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera;
         net.minecraft.util.math.Vec3d Vec3d = Camera.getPos();
         this.II11ll1l11Il1IIllIl1l1l11l1ll = Vec3d.x;
         this.l11IlIlI1IllllllI1llI1l1 = Vec3d.y;
         this.l11l11Il1 = Vec3d.z;
         float f = Camera.getPitch();
         float f1 = Camera.getYaw();
         float f2 = f * (float) (Math.PI / 180.0);
         float f3 = f1 * (float) (Math.PI / 180.0);
         float f4 = (f1 + 180.0F) * (float) (Math.PI / 180.0);
         this.llllI1IlllII1.identity().rotateX(f2).rotateY(f4);
         this.l1llI1111IlIl1.identity().rotateY(-f3).rotateX(f2);
         this.lI11Ill111Il11111l1Ill1l1IlIlI = Math.max(0.0F, this.I11lII1Il1I1IlIIIl1IlIl.lll1lI1llll1IIllIIIII1lll());
         if (this.I1lI1Ill11llIlI111l.ConstructorHolder(0) && !this.lll1I1111l1l1.isEmpty()) {
            this.ZenithInternal084(i);
         }

         if (this.I1lI1Ill11llIlI111l.ConstructorHolder(1) && !this.lIIII1III1IlIIIl1I.isEmpty()) {
            this.StringHolder_19(i);
         }

         if (this.I1lI1Ill11llIlI111l.ConstructorHolder(2) && !this.l1lIIII1.isEmpty()) {
            this.ZenithInternal061(i);
         }

         if (this.I1lI1Ill11llIlI111l.ConstructorHolder(3) && !this.IlI1ll11l1llll11lll1IllIl1.isEmpty()) {
            this.FinishThread(i);
         }

         if (this.I1lI1Ill11llIlI111l.ConstructorHolder(4) && !this.I11Il11lllllllI1IlllI.isEmpty()) {
            this.ZenithInternal064(i);
         }

         if (this.I1lI1Ill11llIlI111l.ConstructorHolder(5) && !this.llIl1lI1I1lIlllIIII1llIlI1lI.isEmpty()) {
            this.ZenithInternal021(i);
         }

         if (this.I1lI1Ill11llIlI111l.ConstructorHolder(6) && !this.I1lll1Il1I1IlIlIIll.isEmpty()) {
            this.ZenithException_2(i);
         }

         this.ClearHeadersHandler(i);
         if (this.lI1lIll111l1llI1111IIl1II1.Spider()) {
            this.StringHolder_5(i);
         }

         if (this.lI11Ill111Il11111l1Ill1l1IlIlI > 0.0F) {
            this.longHolder_3(i);
         }

         this.StringHolder_8(ll1li1l111llllli1.Norender());
      }
   }

   @EventTarget
   public void EventTarget(EntityHolder i11l111illlill) {
      if (i11l111illlill.AutoMine() == ZenithInternal005$Helper.Il1III11llIlIlIl1l1IlI1IIlI) {
         if (this.lI1lIll111l1llI1111IIl1II1.Spider()) {
            Entity Entity = i11l111illlill.Autoloot();
            if (Entity instanceof LivingEntity && Entity != l11I1I1ll1Illll1I1l1111l1II.player) {
               if (!this.I11llllIlllIlIll1l11.Spider() || this.Ill1111111I1IlIlIIl1l1()) {
                  net.minecraft.util.math.Vec3d Vec3d = this.ZenithInternal128(Entity);
                  this.StringHolder_4(Vec3d);
               }
            }
         }
      }
   }

   private net.minecraft.util.math.Vec3d ZenithInternal128(Entity Entity) {
      net.minecraft.util.math.Vec3d Vec3dxxxx = Entity.getPos().add(0.0, (double)Entity.getHeight() * 0.5, 0.0);
      if (l11I1I1ll1Illll1I1l1111l1II.player == null) {
         return Vec3dxxxx;
      } else {
         net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.player.getEyePos();
         net.minecraft.util.math.Vec3d Vec3dxx = l11I1I1ll1Illll1I1l1111l1II.player.getRotationVec(1.0F);
         net.minecraft.util.math.Box Box = Entity.getBoundingBox();
         net.minecraft.util.math.Vec3d Vec3dxxx = StringHolder_8(Vec3dx, Vec3dxx, Box);
         if (Vec3dxxx != null) {
            return Vec3dxxx;
         } else {
            net.minecraft.util.math.Vec3d Vec3dxxxx = Vec3dxxxx.subtract(Vec3dx);
            double d0 = Vec3dxx.dotProduct(Vec3dxxxx);
            if (d0 <= 0.0) {
               return Vec3dxxxx;
            } else {
               double d1 = (double)Math.max(Entity.getWidth(), Entity.getHeight()) * 0.4;
               double d2 = Math.max(0.0, d0 - d1);
               return Vec3dx.add(Vec3dxx.multiply(d2));
            }
         }
      }
   }

   private static net.minecraft.util.math.Vec3d StringHolder_8(
      net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box
   ) {
      double d0 = Double.NEGATIVE_INFINITY;
      double d1 = Double.POSITIVE_INFINITY;
      double[] adouble = new double[]{Vec3d.x, Vec3d.y, Vec3d.z};
      double[] adouble1 = new double[]{Vec3dx.x, Vec3dx.y, Vec3dx.z};
      double[] adouble2 = new double[]{Box.minX, Box.minY, Box.minZ};
      double[] adouble3 = new double[]{Box.maxX, Box.maxY, Box.maxZ};

      for (int i = 0; i < 3; i++) {
         if (Math.abs(adouble1[i]) < 1.0E-9) {
            if (adouble[i] < adouble2[i] || adouble[i] > adouble3[i]) {
               return null;
            }
         } else {
            double d2 = (adouble2[i] - adouble[i]) / adouble1[i];
            double d3 = (adouble3[i] - adouble[i]) / adouble1[i];
            if (d2 > d3) {
               double d4 = d2;
               d2 = d3;
               d3 = d4;
            }

            if (d2 > d0) {
               d0 = d2;
            }

            if (d3 < d1) {
               d1 = d3;
            }

            if (d0 > d1) {
               return null;
            }
         }
      }

      double d5 = d0 > 0.0 ? d0 : (double)(d1 > 0.0 ? 0 : -1);
      return d5 < 0.0 ? null : Vec3d.add(Vec3dx.multiply(d5));
   }

   private boolean Ill1111111I1IlIlIIl1l1() {
      ClientPlayerEntity ClientPlayerEntity = l11I1I1ll1Illll1I1l1111l1II.player;
      return ClientPlayerEntity != null
         && ClientPlayerEntity.fallDistance > 0.0F
         && !ClientPlayerEntity.isOnGround()
         && !ClientPlayerEntity.isClimbing()
         && !ClientPlayerEntity.isTouchingWater()
         && !ClientPlayerEntity.hasVehicle()
         && !ClientPlayerEntity.isSprinting();
   }

   private void StringHolder_4(net.minecraft.util.math.Vec3d Vec3d) {
      ArrayList arraylist = new ArrayList();
      if (this.l11I1lll111IIIll1IIIIl1llI11l.ConstructorHolder(0)) {
         arraylist.add(Particles$l1lll11l1l.lII1I1111l1Il1l);
      }

      if (this.l11I1lll111IIIll1IIIIl1llI11l.ConstructorHolder(1)) {
         arraylist.add(Particles$l1lll11l1l.lIllI1III11IIIl);
      }

      if (this.l11I1lll111IIIll1IIIIl1llI11l.ConstructorHolder(2)) {
         arraylist.add(Particles$l1lll11l1l.llIII1l1111llI1llI1llIlllI1);
      }

      if (!arraylist.isEmpty()) {
         int i = Math.max(1, (int)this.IllI1IIllIII1lIlIIII11l11.lll1lI1llll1IIllIIIII1lll());
         long j = System.currentTimeMillis();

         for (int k = 0; k < i; k++) {
            Particles$l1lll11l1l i11liil1i1$l1lll11l1l = (Particles$l1lll11l1l)arraylist.get(k % arraylist.size());
            List list = this.StringHolder_8(i11liil1i1$l1lll11l1l);
            if (list.size() < 200) {
               list.add(this.StringHolder_8(Vec3d, j));
            }
         }
      }
   }

   private Particles$EventTarget StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, long i) {
      boolean flag = this.I1lIIlI1lIllIII111lIIIII.ClearHeadersHandler(0)
         || this.I1lIIlI1lIllIII111lIIIII.ClearHeadersHandler(2) && this.l1IlIlI1111II11lIIll.nextBoolean();
      double d0;
      double d1;
      double d2;
      if (flag) {
         d0 = -1.0 + this.l1IlIlI1111II11lIIll.nextDouble() * 2.0;
         d1 = 0.2 + this.l1IlIlI1111II11lIIll.nextDouble() * 0.8;
         d2 = -1.0 + this.l1IlIlI1111II11lIIll.nextDouble() * 2.0;
      } else {
         d0 = -1.0 + this.l1IlIlI1111II11lIIll.nextDouble() * 2.0;
         d1 = -0.75 + this.l1IlIlI1111II11lIIll.nextDouble() * 1.5;
         d2 = -1.0 + this.l1IlIlI1111II11lIIll.nextDouble() * 2.0;
      }

      double d3 = d0 * d0 + d1 * d1 + d2 * d2;
      if (d3 < 1.0E-4) {
         d0 = 0.0;
         d1 = 1.0;
         d2 = 0.0;
         d3 = 1.0;
      }

      double d4 = 1.0 / Math.sqrt(d3);
      double d5 = (double)this.IIIl11lI.lll1lI1llll1IIllIIIII1lll() * 2.0;
      d0 *= d4 * d5;
      d1 *= d4 * d5;
      d2 *= d4 * d5;
      float f = this.l1IlIlI1111II11lIIll.nextFloat() * 2.0F - 1.0F;
      float f1 = this.l1IlIlI1111II11lIIll.nextFloat() * 2.0F - 1.0F;
      float f2 = this.l1IlIlI1111II11lIIll.nextFloat() * 2.0F - 1.0F;
      long j = this.StringHolder_32(this.II111l1ll.lll1lI1llll1IIllIIIII1lll());
      float f3 = (float)((0.1 + this.l1IlIlI1111II11lIIll.nextDouble() * 0.2) * (double)this.III1I1Il1l.lll1lI1llll1IIllIIIII1lll());
      int k = this.l1IlIlI1111II11lIIll.nextInt(180);
      return new Particles$EventTarget(Vec3d, i, j, f3, d0, d1, d2, f, f1, f2, flag, this.lI1lllllII11II1llIIIl1I1.Spider(), k);
   }

   private List<Particles$EventTarget> StringHolder_8(Particles$l1lll11l1l i11liil1i1$l1lll11l1l) {
      return switch (i11liil1i1$l1lll11l1l) {
         case lII1I1111l1Il1l -> this.l11l11III1111Il1Il11l1I1lllll;
         case lIllI1III11IIIl -> this.IIl1lIllIll1IlIlI1IlI1l;
         case llIII1l1111llI1llI1llIlllI1 -> this.I11II11I11IIl1I1;
      };
   }

   private void l1lIlIl1llIl11IIllllIII111I1l1() {
      this.l11l11III1111Il1Il11l1I1lllll.clear();
      this.IIl1lIllIll1IlIlI1IlI1l.clear();
      this.I11II11I11IIl1I1.clear();
   }

   private void ZenithInternal042(long i) {
      boolean flag = this.I1lI1Ill11llIlI111l.ConstructorHolder(0);
      boolean flag1 = this.I1lI1Ill11llIlI111l.ConstructorHolder(1);
      boolean flag2 = this.I1lI1Ill11llIlI111l.ConstructorHolder(2);
      boolean flag3 = this.I1lI1Ill11llIlI111l.ConstructorHolder(3);
      boolean flag4 = this.I1lI1Ill11llIlI111l.ConstructorHolder(4);
      boolean flag5 = this.I1lI1Ill11llIlI111l.ConstructorHolder(5);
      boolean flag6 = this.I1lI1Ill11llIlI111l.ConstructorHolder(6);
      if (flag || flag1 || flag2 || flag3 || flag4 || flag5 || flag6) {
         net.minecraft.util.math.Vec3d Vec3d = l11I1I1ll1Illll1I1l1111l1II.player.getPos();
         float f = this.IlllII1IlIl1lI1lIIIl11IIlI.lll1lI1llll1IIllIIIII1lll();
         double d0 = Math.max(1.5, (double)f);
         int j = Math.max(1, (int)this.lIII11I1lI1ll1llI1111l1ll.lll1lI1llll1IIllIIIII1lll());
         if (flag) {
            this.StringHolder_8(Vec3d, d0, i, f, j);
         } else {
            this.lll1I1111l1l1.clear();
         }

         if (flag1) {
            this.StringHolder_8(this.lIIII1III1IlIIIl1I, Vec3d, d0, i, j, 6.0F);
         } else {
            this.lIIII1III1IlIIIl1I.clear();
         }

         if (flag2) {
            this.StringHolder_8(this.l1lIIII1, Vec3d, d0, i, j, 7.0F);
         } else {
            this.l1lIIII1.clear();
         }

         if (flag3) {
            this.StringHolder_8(this.IlI1ll11l1llll11lll1IllIl1, Vec3d, d0, i, j, 5.0F, 8.0F, 5.0F);
         } else {
            this.IlI1ll11l1llll11lll1IllIl1.clear();
         }

         if (flag4) {
            this.StringHolder_8(this.I11Il11lllllllI1IlllI, Vec3d, d0, i, j, 6.0F);
         } else {
            this.I11Il11lllllllI1IlllI.clear();
         }

         if (flag5) {
            this.StringHolder_8(this.llIl1lI1I1lIlllIIII1llIlI1lI, Vec3d, d0, i, j, 6.0F);
         } else {
            this.llIl1lI1I1lIlllIIII1llIlI1lI.clear();
         }

         if (flag6) {
            this.StringHolder_8(this.I1lll1Il1I1IlIlIIll, Vec3d, d0, i, j, 6.0F);
         } else {
            this.I1lll1Il1I1IlIlIIll.clear();
         }
      }
   }

   private void StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, double d0, long i, float f, int j) {
      this.EventBus(this.lll1I1111l1l1, j);

      while (this.lll1I1111l1l1.size() < j) {
         this.lll1I1111l1l1.add(this.StringHolder_8(Vec3d, 1.5, d0, i, f));
      }
   }

   private void StringHolder_8(List<Particles$II1Il11l111II11IIl> list, net.minecraft.util.math.Vec3d Vec3d, double d0, long i, int j, float f) {
      this.StringHolder_8(list, Vec3d, d0, i, j, f, f, f);
   }

   private void StringHolder_8(
      List<Particles$II1Il11l111II11IIl> list, net.minecraft.util.math.Vec3d Vec3d, double d0, long i, int j, float f, float f1, float f2
   ) {
      this.EventBus(list, j);

      while (list.size() < j) {
         list.add(this.StringHolder_8(Vec3d, 1.5, d0, i, f, f1, f2));
      }
   }

   private <T> void EventBus(List<T> list, int i) {
      while (list.size() > i) {
         list.remove(0);
      }
   }

   private boolean StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, double d0) {
      return ZenithInternal094.EventImpl_24(
         new net.minecraft.util.math.Box(
            Vec3d.x - d0,
            Vec3d.y - d0,
            Vec3d.z - d0,
            Vec3d.x + d0,
            Vec3d.y + d0,
            Vec3d.z + d0
         )
      );
   }

   private Particles$l1IIl11lI StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, double d0, double d1, long i, float f) {
      double d2 = this.l1IlIlI1111II11lIIll.nextDouble() * Math.PI * 2.0;
      double d3 = Math.acos(2.0 * this.l1IlIlI1111II11lIIll.nextDouble() - 1.0);
      double d4 = d0 + this.l1IlIlI1111II11lIIll.nextDouble() * (d1 - d0);
      double d5 = Math.sin(d3);
      net.minecraft.util.math.Vec3d Vec3dx = new net.minecraft.util.math.Vec3d(
         Vec3d.x + d5 * Math.cos(d2) * d4, Vec3d.y + 1.0 + Math.cos(d3) * d4, Vec3d.z + d5 * Math.sin(d2) * d4
      );
      return new Particles$l1IIl11lI(
         Vec3dx,
         d2,
         i,
         this.StringHolder_32(this.I1I1II1I1II11lII1ll.lll1lI1llll1IIllIIIII1lll()),
         this.l1IlIlI1111II11lIIll,
         this.l1IlIlI1111II11lIIll.nextInt(180),
         f
      );
   }

   private Particles$II1Il11l111II11IIl EventBus(net.minecraft.util.math.Vec3d Vec3d, double d0, double d1, long i, float f) {
      return this.StringHolder_8(Vec3d, d0, d1, i, f, f, f);
   }

   private Particles$II1Il11l111II11IIl StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, double d0, double d1, long i, float f, float f1, float f2) {
      double d2 = this.l1IlIlI1111II11lIIll.nextDouble() * Math.PI * 2.0;
      double d3 = Math.acos(2.0 * this.l1IlIlI1111II11lIIll.nextDouble() - 1.0);
      double d4 = d0 + this.l1IlIlI1111II11lIIll.nextDouble() * (d1 - d0);
      double d5 = Math.sin(d3);
      net.minecraft.util.math.Vec3d Vec3dx = new net.minecraft.util.math.Vec3d(
         Vec3dx.x + d5 * Math.cos(d2) * d4, Vec3dx.y + 1.0 + Math.cos(d3) * d4, Vec3dx.z + d5 * Math.sin(d2) * d4
      );
      double d6 = this.l1IlIlI1111II11lIIll.nextDouble() * Math.PI * 2.0;
      double d7 = Math.acos(2.0 * this.l1IlIlI1111II11lIIll.nextDouble() - 1.0);
      double d8 = 1.6 + this.l1IlIlI1111II11lIIll.nextDouble() * 1.8;
      double d9 = Math.sin(d7);
      double d10 = d9 * Math.cos(d6) * d8;
      double d11 = Math.cos(d7) * d8;
      double d12 = d9 * Math.sin(d6) * d8;
      return new Particles$II1Il11l111II11IIl(
         Vec3dx,
         d2,
         i,
         this.StringHolder_32(this.I1I1II1I1II11lII1ll.lll1lI1llll1IIllIIIII1lll()),
         this.l1IlIlI1111II11lIIll.nextInt(180),
         (this.l1IlIlI1111II11lIIll.nextFloat() - 0.5F) * f,
         (this.l1IlIlI1111II11lIIll.nextFloat() - 0.5F) * f1,
         (this.l1IlIlI1111II11lIIll.nextFloat() - 0.5F) * f2,
         d10,
         d11,
         d12
      );
   }

   private long StringHolder_32(float f) {
      float f1 = 0.75F + this.l1IlIlI1111II11lIIll.nextFloat() * 0.5F;
      return Math.max(50L, (long)Math.round(f * f1));
   }

   private float StringHolder_8(long i, long j, long k) {
      return k <= 0L ? 1.0F : (float)(i - j) / (float)k;
   }

   private void ZenithInternal101(long i) {
      this.lll1I1111l1l1.removeIf(i11liil1i1$l1iil11li -> i - i11liil1i1$l1iil11li.Il1l111I111III11I1111ll1 > i11liil1i1$l1iil11li.l1l11II1IIIl1IlIlIll);
      this.lIIII1III1IlIIIl1I
         .removeIf(i11liil1i1$ii1il11l111ii11iil -> i - i11liil1i1$ii1il11l111ii11iil.llI1IlIl1ll > i11liil1i1$ii1il11l111ii11iil.Il11l1ll11l);
      this.l1lIIII1.removeIf(i11liil1i1$ii1il11l111ii11iil -> i - i11liil1i1$ii1il11l111ii11iil.llI1IlIl1ll > i11liil1i1$ii1il11l111ii11iil.Il11l1ll11l);
      this.IlI1ll11l1llll11lll1IllIl1
         .removeIf(i11liil1i1$ii1il11l111ii11iil -> i - i11liil1i1$ii1il11l111ii11iil.llI1IlIl1ll > i11liil1i1$ii1il11l111ii11iil.Il11l1ll11l);
      this.I11Il11lllllllI1IlllI
         .removeIf(i11liil1i1$ii1il11l111ii11iil -> i - i11liil1i1$ii1il11l111ii11iil.llI1IlIl1ll > i11liil1i1$ii1il11l111ii11iil.Il11l1ll11l);
      this.llIl1lI1I1lIlllIIII1llIlI1lI
         .removeIf(i11liil1i1$ii1il11l111ii11iil -> i - i11liil1i1$ii1il11l111ii11iil.llI1IlIl1ll > i11liil1i1$ii1il11l111ii11iil.Il11l1ll11l);
      this.I1lll1Il1I1IlIlIIll
         .removeIf(i11liil1i1$ii1il11l111ii11iil -> i - i11liil1i1$ii1il11l111ii11iil.llI1IlIl1ll > i11liil1i1$ii1il11l111ii11iil.Il11l1ll11l);
   }

   private void ZenithInternal084(long i) {
      float f = this.ll1ll1llIlIlI1I1.lll1lI1llll1IIllIIIII1lll();
      float f1 = Math.max(0.025F, f * 0.24F);
      RenderSystem.enableBlend();
      RenderSystem.disableCull();
      RenderSystem.blendFuncSeparate(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE, AdvancementTabType5.ZERO, AdvancementTabType4.ONE);
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderTexture(0, lI1IlI111II111llI1l111);
      net.minecraft.client.render.BufferBuilder BufferBuilder = null;

      for (Particles$l1IIl11lI i11liil1i1$l1iil11li : this.lll1I1111l1l1) {
         float f2 = this.StringHolder_8(i, i11liil1i1$l1iil11li.Il1l111I111III11I1111ll1, i11liil1i1$l1iil11li.l1l11II1IIIl1IlIlIll);
         if (!(f2 >= 1.0F)) {
            net.minecraft.util.math.Vec3d Vec3d = new net.minecraft.util.math.Vec3d(
               i11liil1i1$l1iil11li.lllI11IllIlI1I111lIlI1Ill.x + i11liil1i1$l1iil11li.IllII1ll1lIIIl1IllII * (double)f2,
               i11liil1i1$l1iil11li.lllI11IllIlI1I111lIlI1Ill.y + i11liil1i1$l1iil11li.lIl1llIIlIlIlI111I * (double)f2,
               i11liil1i1$l1iil11li.lllI11IllIlI1I111lIlI1Ill.z + i11liil1i1$l1iil11li.lI1lIIIIll1I1111l1 * (double)f2
            );
            i11liil1i1$l1iil11li.EventBus(Vec3d, i);
            if (this.StringHolder_8(Vec3d, 8.0)) {
               float f3 = this.StringHolder_12(f2);
               int j = this.ZenithInternal150(i11liil1i1$l1iil11li.llIlI1lll1I1II111l1lII).lllIlll1Ill111l111Il11II11lII();
               long k = (long)((float)i11liil1i1$l1iil11li.l1l11II1IIIl1IlIlIll * this.llIII1lll1l1111.lll1lI1llll1IIllIIIII1lll());
               if (BufferBuilder == null) {
                  BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
               }

               int l = i11liil1i1$l1iil11li.count - 1;

               while (l > 0 && i - i11liil1i1$l1iil11li.llIl1lllIlII1IIIII[l] > k) {
                  l--;
               }

               for (int i1 = l; i1 > 0; i1--) {
                  double d0 = i11liil1i1$l1iil11li.II1IllIIlI[i1];
                  double d1 = i11liil1i1$l1iil11li.l11llIIIIll[i1];
                  double d2 = i11liil1i1$l1iil11li.lll1ll1l11l1lIll1l11IlIIl[i1];
                  double d3 = i11liil1i1$l1iil11li.II1IllIIlI[i1 - 1];
                  double d4 = i11liil1i1$l1iil11li.l11llIIIIll[i1 - 1];
                  double d5 = i11liil1i1$l1iil11li.lll1ll1l11l1lIll1l11IlIIl[i1 - 1];
                  double d6 = d3 - d0;
                  double d7 = d4 - d1;
                  double d8 = d5 - d2;
                  double d9 = Math.sqrt(d6 * d6 + d7 * d7 + d8 * d8);
                  int j1 = Math.min(20, Math.max(1, (int)Math.ceil(d9 / (double)f1)));

                  for (int k1 = 0; k1 < j1; k1++) {
                     float f4 = (float)k1 / (float)j1;
                     long l1 = i11liil1i1$l1iil11li.llIl1lllIlII1IIIII[i1]
                        + (long)((double)(i11liil1i1$l1iil11li.llIl1lllIlII1IIIII[i1 - 1] - i11liil1i1$l1iil11li.llIl1lllIlII1IIIII[i1]) * (double)f4);
                     float f5 = k <= 0L ? 1.0F : MathHelper.clamp((float)(i - l1) / (float)k, 0.0F, 1.0F);
                     float f6 = (1.0F - f5) * (1.0F - f5);
                     if (!(f6 <= 0.0F)) {
                        float f7 = f * (0.34F + (float)Math.sqrt((double)f6) * 0.86F);
                        this.StringHolder_8(BufferBuilder, d0 + d6 * (double)f4, d1 + d7 * (double)f4, d2 + d8 * (double)f4, f7, j, f3 * f6 * 0.5F, false);
                     }
                  }
               }

               if (i11liil1i1$l1iil11li.count > 0) {
                  this.StringHolder_8(
                     BufferBuilder,
                     i11liil1i1$l1iil11li.II1IllIIlI[0],
                     i11liil1i1$l1iil11li.l11llIIIIll[0],
                     i11liil1i1$l1iil11li.lll1ll1l11l1lIll1l11IlIIl[0],
                     f,
                     j,
                     f3,
                     true
                  );
               }
            }
         }
      }

      if (BufferBuilder != null) {
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
      }

      RenderSystem.depthMask(true);
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   }

   private void StringHolder_8(net.minecraft.client.render.BufferBuilder BufferBuilder, double d0, double d1, double d2, float f, int i, float f1, boolean flag) {
      this.Ill11111Ill11lI1ll111I11I1lII
         .set(this.llllI1IlllII1)
         .translate((float)(d0 - this.II11ll1l11Il1IIllIl1l1l11l1ll), (float)(d1 - this.l11IlIlI1IllllllI1llI1l1), (float)(d2 - this.l11l11Il1))
         .mul(this.l1llI1111IlIl1);
      int j = PatternHolder.EventBus(i, f1);
      int k = PatternHolder.EventBus(i, flag ? f1 * 0.45F : f1);
      float f2 = f * 0.5F;
      float f3 = f * 0.95F;
      BufferBuilder.vertex(this.Ill11111Ill11lI1ll111I11I1lII, f3, -f3, 0.0F).texture(0.0F, 1.0F).color(k);
      BufferBuilder.vertex(this.Ill11111Ill11lI1ll111I11I1lII, -f3, -f3, 0.0F).texture(1.0F, 1.0F).color(k);
      BufferBuilder.vertex(this.Ill11111Ill11lI1ll111I11I1lII, -f3, f3, 0.0F).texture(1.0F, 0.0F).color(k);
      BufferBuilder.vertex(this.Ill11111Ill11lI1ll111I11I1lII, f3, f3, 0.0F).texture(0.0F, 0.0F).color(k);
      if (flag) {
         BufferBuilder.vertex(this.Ill11111Ill11lI1ll111I11I1lII, f2, -f2, 0.0F).texture(0.0F, 1.0F).color(j);
         BufferBuilder.vertex(this.Ill11111Ill11lI1ll111I11I1lII, -f2, -f2, 0.0F).texture(1.0F, 1.0F).color(j);
         BufferBuilder.vertex(this.Ill11111Ill11lI1ll111I11I1lII, -f2, f2, 0.0F).texture(1.0F, 0.0F).color(j);
         BufferBuilder.vertex(this.Ill11111Ill11lI1ll111I11I1lII, f2, f2, 0.0F).texture(0.0F, 0.0F).color(j);
      }
   }

   private void StringHolder_19(long i) {
      float f = this.ll1ll1llIlIlI1I1.lll1lI1llll1IIllIIIII1lll() * 0.6F;

      for (Particles$II1Il11l111II11IIl i11liil1i1$ii1il11l111ii11iil : this.lIIII1III1IlIIIl1I) {
         float f1 = this.StringHolder_8(i, i11liil1i1$ii1il11l111ii11iil.llI1IlIl1ll, i11liil1i1$ii1il11l111ii11iil.Il11l1ll11l);
         if (!(f1 >= 1.0F)) {
            net.minecraft.util.math.Vec3d Vec3d = this.StringHolder_8(i11liil1i1$ii1il11l111ii11iil, f1);
            if (this.StringHolder_8(Vec3d, 2.5)) {
               float f2 = this.StringHolder_12(f1);
               float f3 = f * (0.6F + f1 * 0.6F);
               float f4 = f3 * 0.5F;
               this.IlIll1I1llI
                  .identity()
                  .rotateY(i11liil1i1$ii1il11l111ii11iil.l1II11llIIlllllI1lIlII1l1lI * f1)
                  .rotateX(i11liil1i1$ii1il11l111ii11iil.IIlIll1I1I1l1 * f1)
                  .rotateZ(i11liil1i1$ii1il11l111ii11iil.I1l1I1II11IIl1lIll1I1II1lIIl * f1);

               for (int j = 0; j < 8; j++) {
                  this.lIlI1llIl1l11lI1111l[j].set((j & 1) == 0 ? -f4 : f4, (j & 2) == 0 ? -f4 : f4, (j & 4) == 0 ? -f4 : f4);
                  this.IlIll1I1llI.transform(this.lIlI1llIl1l11lI1111l[j]);
               }

               int k = PatternHolder.EventBus(
                  this.ZenithInternal150(i11liil1i1$ii1il11l111ii11iil.Ill1IIlll1).lllIlll1Ill111l111Il11II11lII(), f2
               );

               for (byte b0 = 0; b0 < l1lIIIl11IIllI1.length; b0 += 2) {
                  this.StringHolder_8(
                     this.lIlI1llIl1l11lI1111l[l1lIIIl11IIllI1[b0]],
                     this.lIlI1llIl1l11lI1111l[l1lIIIl11IIllI1[b0 + 1]],
                     Vec3d.x,
                     Vec3d.y,
                     Vec3d.z,
                     k,
                     1.6F
                  );
               }
            }
         }
      }
   }

   private void ZenithInternal061(long i) {
      float f = this.ll1ll1llIlIlI1I1.lll1lI1llll1IIllIIIII1lll() * 0.75F;

      for (Particles$II1Il11l111II11IIl i11liil1i1$ii1il11l111ii11iil : this.l1lIIII1) {
         float f1 = this.StringHolder_8(i, i11liil1i1$ii1il11l111ii11iil.llI1IlIl1ll, i11liil1i1$ii1il11l111ii11iil.Il11l1ll11l);
         if (!(f1 >= 1.0F)) {
            net.minecraft.util.math.Vec3d Vec3d = this.StringHolder_8(i11liil1i1$ii1il11l111ii11iil, f1);
            if (this.StringHolder_8(Vec3d, 2.5)) {
               float f2 = this.StringHolder_12(f1);
               float f3 = f * (0.65F + f1 * 0.55F);
               float f4 = f3 * 0.5F;
               this.IlIll1I1llI
                  .identity()
                  .rotateY(i11liil1i1$ii1il11l111ii11iil.l1II11llIIlllllI1lIlII1l1lI * f1)
                  .rotateX(i11liil1i1$ii1il11l111ii11iil.IIlIll1I1I1l1 * f1)
                  .rotateZ(i11liil1i1$ii1il11l111ii11iil.I1l1I1II11IIl1lIll1I1II1lIIl * f1);
               this.lIlI1llIl1l11lI1111l[0].set(-f4, -f4, -f4);
               this.IlIll1I1llI.transform(this.lIlI1llIl1l11lI1111l[0]);
               this.lIlI1llIl1l11lI1111l[1].set(f4, -f4, -f4);
               this.IlIll1I1llI.transform(this.lIlI1llIl1l11lI1111l[1]);
               this.lIlI1llIl1l11lI1111l[2].set(f4, -f4, f4);
               this.IlIll1I1llI.transform(this.lIlI1llIl1l11lI1111l[2]);
               this.lIlI1llIl1l11lI1111l[3].set(-f4, -f4, f4);
               this.IlIll1I1llI.transform(this.lIlI1llIl1l11lI1111l[3]);
               this.lIlI1llIl1l11lI1111l[4].set(0.0F, f4, 0.0F);
               this.IlIll1I1llI.transform(this.lIlI1llIl1l11lI1111l[4]);
               int j = PatternHolder.EventBus(
                  this.ZenithInternal150(i11liil1i1$ii1il11l111ii11iil.Ill1IIlll1).lllIlll1Ill111l111Il11II11lII(), f2
               );

               for (byte b0 = 0; b0 < IlII1IlI1lIIIII1.length; b0 += 2) {
                  this.StringHolder_8(
                     this.lIlI1llIl1l11lI1111l[IlII1IlI1lIIIII1[b0]],
                     this.lIlI1llIl1l11lI1111l[IlII1IlI1lIIIII1[b0 + 1]],
                     Vec3d.x,
                     Vec3d.y,
                     Vec3d.z,
                     j,
                     1.6F
                  );
               }
            }
         }
      }
   }

   private void FinishThread(long i) {
      float[] afloat = this.ll1Il1lIIlIII1l1Il1I11l1();
      if (afloat != null && afloat.length != 0) {
         float f = this.ll1ll1llIlIlI1I1.lll1lI1llll1IIllIIIII1lll() * 0.78F;

         for (Particles$II1Il11l111II11IIl i11liil1i1$ii1il11l111ii11iil : this.IlI1ll11l1llll11lll1IllIl1) {
            float f1 = this.StringHolder_8(i, i11liil1i1$ii1il11l111ii11iil.llI1IlIl1ll, i11liil1i1$ii1il11l111ii11iil.Il11l1ll11l);
            if (!(f1 >= 1.0F)) {
               net.minecraft.util.math.Vec3d Vec3d = this.StringHolder_8(
                  i11liil1i1$ii1il11l111ii11iil.l1lIlI1IIIlII1I1, i11liil1i1$ii1il11l111ii11iil.IllI1l11Ill11IlIIIllI1I11l11I1, f1
               );
               if (this.StringHolder_8(Vec3d, 2.5)) {
                  float f2 = this.StringHolder_12(f1);
                  float f3 = f * (0.75F + f1 * 0.35F);
                  this.IlIll1I1llI
                     .identity()
                     .rotateY(i11liil1i1$ii1il11l111ii11iil.l1II11llIIlllllI1lIlII1l1lI * f1)
                     .rotateX(i11liil1i1$ii1il11l111ii11iil.IIlIll1I1I1l1 * f1)
                     .rotateZ(i11liil1i1$ii1il11l111ii11iil.I1l1I1II11IIl1lIll1I1II1lIIl * f1);
                  int j = PatternHolder.EventBus(
                     this.ZenithInternal150(i11liil1i1$ii1il11l111ii11iil.Ill1IIlll1).lllIlll1Ill111l111Il11II11lII(), f2
                  );

                  for (byte b0 = 0; b0 < afloat.length; b0 += 6) {
                     this.IIl11lI1llI1I11.set(afloat[b0] * f3, afloat[b0 + 1] * f3, afloat[b0 + 2] * f3);
                     this.ll1lI1l1IIIlIII1l1l11l1lI.set(afloat[b0 + 3] * f3, afloat[b0 + 4] * f3, afloat[b0 + 5] * f3);
                     this.IlIll1I1llI.transform(this.IIl11lI1llI1I11);
                     this.IlIll1I1llI.transform(this.ll1lI1l1IIIlIII1l1l11l1lI);
                     this.StringHolder_8(
                        Vec3d.x + (double)this.IIl11lI1llI1I11.x,
                        Vec3d.y + (double)this.IIl11lI1llI1I11.y,
                        Vec3d.z + (double)this.IIl11lI1llI1I11.z,
                        Vec3d.x + (double)this.ll1lI1l1IIIlIII1l1l11l1lI.x,
                        Vec3d.y + (double)this.ll1lI1l1IIIlIII1l1l11l1lI.y,
                        Vec3d.z + (double)this.ll1lI1l1IIIlIII1l1l11l1lI.z,
                        j,
                        1.6F
                     );
                  }
               }
            }
         }
      }
   }

   private void ZenithInternal064(long i) {
      float[] afloat = this.I1I111II1l1l1llI();
      float f = this.ll1ll1llIlIlI1I1.lll1lI1llll1IIllIIIII1lll() * 0.72F;

      for (Particles$II1Il11l111II11IIl i11liil1i1$ii1il11l111ii11iil : this.I11Il11lllllllI1IlllI) {
         float f1 = this.StringHolder_8(i, i11liil1i1$ii1il11l111ii11iil.llI1IlIl1ll, i11liil1i1$ii1il11l111ii11iil.Il11l1ll11l);
         if (!(f1 >= 1.0F)) {
            net.minecraft.util.math.Vec3d Vec3d = this.StringHolder_8(i11liil1i1$ii1il11l111ii11iil, f1);
            if (this.StringHolder_8(Vec3d, 2.5)) {
               float f2 = this.StringHolder_12(f1);
               float f3 = f * (0.7F + f1 * 0.45F);
               this.IlIll1I1llI
                  .identity()
                  .rotateY(i11liil1i1$ii1il11l111ii11iil.l1II11llIIlllllI1lIlII1l1lI * f1)
                  .rotateX(i11liil1i1$ii1il11l111ii11iil.IIlIll1I1I1l1 * f1)
                  .rotateZ(i11liil1i1$ii1il11l111ii11iil.I1l1I1II11IIl1lIll1I1II1lIIl * f1);
               int j = PatternHolder.EventBus(
                  this.ZenithInternal150(i11liil1i1$ii1il11l111ii11iil.Ill1IIlll1).lllIlll1Ill111l111Il11II11lII(), f2
               );

               for (byte b0 = 0; b0 < afloat.length; b0 += 6) {
                  this.IIl11lI1llI1I11.set(afloat[b0] * f3, afloat[b0 + 1] * f3, afloat[b0 + 2] * f3);
                  this.ll1lI1l1IIIlIII1l1l11l1lI.set(afloat[b0 + 3] * f3, afloat[b0 + 4] * f3, afloat[b0 + 5] * f3);
                  this.IlIll1I1llI.transform(this.IIl11lI1llI1I11);
                  this.IlIll1I1llI.transform(this.ll1lI1l1IIIlIII1l1l11l1lI);
                  this.StringHolder_8(
                     Vec3d.x + (double)this.IIl11lI1llI1I11.x,
                     Vec3d.y + (double)this.IIl11lI1llI1I11.y,
                     Vec3d.z + (double)this.IIl11lI1llI1I11.z,
                     Vec3d.x + (double)this.ll1lI1l1IIIlIII1l1l11l1lI.x,
                     Vec3d.y + (double)this.ll1lI1l1IIIlIII1l1l11l1lI.y,
                     Vec3d.z + (double)this.ll1lI1l1IIIlIII1l1l11l1lI.z,
                     j,
                     1.6F
                  );
               }
            }
         }
      }
   }

   private void ZenithInternal021(long i) {
      float[] afloat = this.lI1IlIIlll11l1IIll();
      if (afloat != null && afloat.length != 0) {
         float f = this.ll1ll1llIlIlI1I1.lll1lI1llll1IIllIIIII1lll() * 0.7F;

         for (Particles$II1Il11l111II11IIl i11liil1i1$ii1il11l111ii11iil : this.llIl1lI1I1lIlllIIII1llIlI1lI) {
            float f1 = this.StringHolder_8(i, i11liil1i1$ii1il11l111ii11iil.llI1IlIl1ll, i11liil1i1$ii1il11l111ii11iil.Il11l1ll11l);
            if (!(f1 >= 1.0F)) {
               net.minecraft.util.math.Vec3d Vec3d = this.StringHolder_8(i11liil1i1$ii1il11l111ii11iil, f1);
               if (this.StringHolder_8(Vec3d, 2.5)) {
                  float f2 = this.StringHolder_12(f1);
                  float f3 = f * (0.7F + f1 * 0.45F);
                  this.IlIll1I1llI
                     .identity()
                     .rotateY(i11liil1i1$ii1il11l111ii11iil.l1II11llIIlllllI1lIlII1l1lI * f1)
                     .rotateX(i11liil1i1$ii1il11l111ii11iil.IIlIll1I1I1l1 * f1)
                     .rotateZ(i11liil1i1$ii1il11l111ii11iil.I1l1I1II11IIl1lIll1I1II1lIIl * f1);
                  int j = PatternHolder.EventBus(
                     this.ZenithInternal150(i11liil1i1$ii1il11l111ii11iil.Ill1IIlll1).lllIlll1Ill111l111Il11II11lII(), f2
                  );

                  for (byte b0 = 0; b0 < afloat.length; b0 += 6) {
                     this.IIl11lI1llI1I11.set(afloat[b0] * f3, afloat[b0 + 1] * f3, afloat[b0 + 2] * f3);
                     this.ll1lI1l1IIIlIII1l1l11l1lI.set(afloat[b0 + 3] * f3, afloat[b0 + 4] * f3, afloat[b0 + 5] * f3);
                     this.IlIll1I1llI.transform(this.IIl11lI1llI1I11);
                     this.IlIll1I1llI.transform(this.ll1lI1l1IIIlIII1l1l11l1lI);
                     this.StringHolder_8(
                        Vec3d.x + (double)this.IIl11lI1llI1I11.x,
                        Vec3d.y + (double)this.IIl11lI1llI1I11.y,
                        Vec3d.z + (double)this.IIl11lI1llI1I11.z,
                        Vec3d.x + (double)this.ll1lI1l1IIIlIII1l1l11l1lI.x,
                        Vec3d.y + (double)this.ll1lI1l1IIIlIII1l1l11l1lI.y,
                        Vec3d.z + (double)this.ll1lI1l1IIIlIII1l1l11l1lI.z,
                        j,
                        1.6F
                     );
                  }
               }
            }
         }
      }
   }

   private void ZenithException_2(long i) {
      float[] afloat = this.llIlIIIIIIIlI1();
      if (afloat != null && afloat.length != 0) {
         float f = this.ll1ll1llIlIlI1I1.lll1lI1llll1IIllIIIII1lll() * 0.9F;

         for (Particles$II1Il11l111II11IIl i11liil1i1$ii1il11l111ii11iil : this.I1lll1Il1I1IlIlIIll) {
            float f1 = this.StringHolder_8(i, i11liil1i1$ii1il11l111ii11iil.llI1IlIl1ll, i11liil1i1$ii1il11l111ii11iil.Il11l1ll11l);
            if (!(f1 >= 1.0F)) {
               net.minecraft.util.math.Vec3d Vec3d = this.StringHolder_8(i11liil1i1$ii1il11l111ii11iil, f1);
               if (this.StringHolder_8(Vec3d, 2.5)) {
                  float f2 = this.StringHolder_12(f1);
                  float f3 = f * (0.7F + f1 * 0.45F);
                  this.IlIll1I1llI
                     .identity()
                     .rotateY(i11liil1i1$ii1il11l111ii11iil.l1II11llIIlllllI1lIlII1l1lI * f1)
                     .rotateX(i11liil1i1$ii1il11l111ii11iil.IIlIll1I1I1l1 * f1)
                     .rotateZ(i11liil1i1$ii1il11l111ii11iil.I1l1I1II11IIl1lIll1I1II1lIIl * f1);
                  int j = PatternHolder.EventBus(
                     this.ZenithInternal150(i11liil1i1$ii1il11l111ii11iil.Ill1IIlll1).lllIlll1Ill111l111Il11II11lII(), f2
                  );

                  for (byte b0 = 0; b0 < afloat.length; b0 += 6) {
                     this.IIl11lI1llI1I11.set(afloat[b0] * f3, afloat[b0 + 1] * f3, afloat[b0 + 2] * f3);
                     this.ll1lI1l1IIIlIII1l1l11l1lI.set(afloat[b0 + 3] * f3, afloat[b0 + 4] * f3, afloat[b0 + 5] * f3);
                     this.IlIll1I1llI.transform(this.IIl11lI1llI1I11);
                     this.IlIll1I1llI.transform(this.ll1lI1l1IIIlIII1l1l11l1lI);
                     this.StringHolder_8(
                        Vec3d.x + (double)this.IIl11lI1llI1I11.x,
                        Vec3d.y + (double)this.IIl11lI1llI1I11.y,
                        Vec3d.z + (double)this.IIl11lI1llI1I11.z,
                        Vec3d.x + (double)this.ll1lI1l1IIIlIII1l1l11l1lI.x,
                        Vec3d.y + (double)this.ll1lI1l1IIIlIII1l1l11l1lI.y,
                        Vec3d.z + (double)this.ll1lI1l1IIIlIII1l1l11l1lI.z,
                        j,
                        1.6F
                     );
                  }
               }
            }
         }
      }
   }

   private float[] llIlIIIIIIIlI1() {
      if (this.l111lIIlIII1) {
         return this.llIlIl1lII1II1ll11;
      } else {
         this.l111lIIlIII1 = true;
         InputStream inputstream = Particles.class.getResourceAsStream("/assets/zenith/visuals/particles/fire_nether_star.obj");
         if (inputstream == null) {
            return null;
         } else {
            try (BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream, StandardCharsets.UTF_8))) {
               ArrayList arraylist = new ArrayList();
               HashMap hashmap = new HashMap();
               float f = Float.POSITIVE_INFINITY;
               float f1 = Float.POSITIVE_INFINITY;
               float f2 = Float.POSITIVE_INFINITY;
               float f3 = Float.NEGATIVE_INFINITY;
               float f4 = Float.NEGATIVE_INFINITY;
               float f5 = Float.NEGATIVE_INFINITY;

               String s;
               while ((s = bufferedreader.readLine()) != null) {
                  s = s.trim();
                  if (s.startsWith("v ")) {
                     String[] astring2 = s.split("\\s+");
                     float f7 = Float.parseFloat(astring2[1]);
                     float f9 = Float.parseFloat(astring2[2]);
                     float f11 = Float.parseFloat(astring2[3]);
                     arraylist.add(new Vector3f(f7, f9, f11));
                     if (f7 < f) {
                        f = f7;
                     }

                     if (f7 > f3) {
                        f3 = f7;
                     }

                     if (f9 < f1) {
                        f1 = f9;
                     }

                     if (f9 > f4) {
                        f4 = f9;
                     }

                     if (f11 < f2) {
                        f2 = f11;
                     }

                     if (f11 > f5) {
                        f5 = f11;
                     }
                  } else if (s.startsWith("f ")) {
                     String[] astring = s.split("\\s+");

                     for (int i = 1; i < astring.length; i++) {
                        int j = i == astring.length - 1 ? 1 : i + 1;
                        int k = Integer.parseInt(astring[i].split("/")[0]) - 1;
                        int l = Integer.parseInt(astring[j].split("/")[0]) - 1;
                        if (k != l) {
                           String[] astring1 = astring[i].split("/");
                           int i1 = astring1.length > 2 && !astring1[2].isEmpty() ? Integer.parseInt(astring1[2]) - 1 : -1;
                           long j1 = (long)Math.min(k, l) << 32 | (long)Math.max(k, l) & 4294967295L;
                           Particles$Event i11liil1i1$liil11l111liil1ll = (Particles$Event)hashmap.get(j1);
                           if (i11liil1i1$liil11l111liil1ll == null) {
                              Vector3f vector3f = (Vector3f)arraylist.get(k);
                              Vector3f vector3f1 = (Vector3f)arraylist.get(l);
                              hashmap.put(j1, new Particles$Event(vector3f.x, vector3f.y, vector3f.z, vector3f1.x, vector3f1.y, vector3f1.z, i1));
                           } else {
                              i11liil1i1$liil11l111liil1ll.count++;
                              if (i11liil1i1$liil11l111liil1ll.llIlI11I1I1lIl1IlIII1lII != i1) {
                                 i11liil1i1$liil11l111liil1ll.lI11Il1lI1l = false;
                              }
                           }
                        }
                     }
                  }
               }

               float f6 = (f + f3) * 0.5F;
               float f8 = (f1 + f4) * 0.5F;
               float f10 = (f2 + f5) * 0.5F;
               float f12 = Math.max(f3 - f, Math.max(f4 - f1, f5 - f2));
               float f13 = f12 > 1.0E-5F ? 1.0F / f12 : 1.0F;
               ArrayList arraylist1 = new ArrayList();

               for (Particles$Event i11liil1i1$liil11l111liil1ll1 : hashmap.values()) {
                  if (i11liil1i1$liil11l111liil1ll1.count == 1 || !i11liil1i1$liil11l111liil1ll1.lI11Il1lI1l) {
                     arraylist1.add((i11liil1i1$liil11l111liil1ll1.I1l1I1lIIl1I111l111l - f6) * f13);
                     arraylist1.add((i11liil1i1$liil11l111liil1ll1.l1lI11I111IlllI1lII1Ill - f8) * f13);
                     arraylist1.add((i11liil1i1$liil11l111liil1ll1.I1lI11llIll1l1llIlIll1l11 - f10) * f13);
                     arraylist1.add((i11liil1i1$liil11l111liil1ll1.lIIlI11I1111II1l1llI - f6) * f13);
                     arraylist1.add((i11liil1i1$liil11l111liil1ll1.l1lII1I1IIIIIlllIll1lI - f8) * f13);
                     arraylist1.add((i11liil1i1$liil11l111liil1ll1.llI1lIII1lIIIl1 - f10) * f13);
                  }
               }

               this.llIlIl1lII1II1ll11 = new float[arraylist1.size()];

               for (int k1 = 0; k1 < arraylist1.size(); k1++) {
                  this.llIlIl1lII1II1ll11[k1] = (Float)arraylist1.get(k1);
               }
            } catch (Exception exception) {
               this.llIlIl1lII1II1ll11 = null;
            }

            return this.llIlIl1lII1II1ll11;
         }
      }
   }

   private void ClearHeadersHandler(long i) {
      if (l11I1I1ll1Illll1I1l1111l1II.world != null) {
         long j = i - this.ll11l1Il1l1IlIll;
         if (j >= 50L) {
            int k = (int)Math.min(4L, j / 50L);
            this.ll11l1Il1l1IlIll = i - j % 50L;

            for (int l = 0; l < k; l++) {
               this.ZenithInternal021(this.l11l11III1111Il1Il11l1I1lllll);
               this.ZenithInternal021(this.IIl1lIllIll1IlIlI1IlI1l);
               this.ZenithInternal021(this.I11II11I11IIl1I1);
            }
         }
      }
   }

   private void ZenithInternal021(List<Particles$EventTarget> list) {
      if (!list.isEmpty()) {
         ClientWorld ClientWorld = l11I1I1ll1Illll1I1l1111l1II.world;
         list.removeIf(i11liil1i1$illi1l1l11 -> i11liil1i1$illi1l1l11.ListHolder_6(System.currentTimeMillis()));

         for (Particles$EventTarget i11liil1i1$illi1l1l1 : list) {
            i11liil1i1$illi1l1l1.StringHolder_8(ClientWorld);
         }
      }
   }

   private void StringHolder_5(long i) {
      float f = MathHelper.clamp((float)(i - this.ll11l1Il1l1IlIll) / 50.0F, 0.0F, 1.0F);
      if (!this.l11l11III1111Il1Il11l1I1lllll.isEmpty()) {
         this.StringHolder_8(this.l11l11III1111Il1Il11l1I1lllll, Particles$l1lll11l1l.lII1I1111l1Il1l, i, f);
      }

      if (!this.IIl1lIllIll1IlIlI1IlI1l.isEmpty()) {
         this.StringHolder_8(this.IIl1lIllIll1IlIlI1IlI1l, Particles$l1lll11l1l.lIllI1III11IIIl, i, f);
      }

      if (!this.I11II11I11IIl1I1.isEmpty()) {
         this.StringHolder_8(this.I11II11I11IIl1I1, Particles$l1lll11l1l.llIII1l1111llI1llI1llIlllI1, i, f);
      }
   }

   private void StringHolder_8(List<Particles$EventTarget> list, Particles$l1lll11l1l i11liil1i1$l1lll11l1l, long i, float f) {
      for (Particles$EventTarget i11liil1i1$illi1l1l1 : list) {
         float f1 = i11liil1i1$illi1l1l1.longHolder_6(i);
         if (!(f1 <= 0.0F)) {
            net.minecraft.util.math.Vec3d Vec3d = i11liil1i1$illi1l1l1.setKeyCode(f);
            if (this.StringHolder_8(Vec3d, 2.5)) {
               float f2 = i11liil1i1$illi1l1l1.IIl1I1ll1llIIllIIIII;
               float f3 = i11liil1i1$illi1l1l1.ZenithInternal070(i);
               this.IlIll1I1llI
                  .identity()
                  .rotateX(i11liil1i1$illi1l1l1.lIIl1IIl1lII11III1lI * f3)
                  .rotateY(i11liil1i1$illi1l1l1.II1IlII11I1I1I1Il11Il1 * f3)
                  .rotateZ(i11liil1i1$illi1l1l1.I1IIlI1lIIllI11I1III * f3);
               int j = PatternHolder.EventBus(
                  this.ZenithInternal150(i11liil1i1$illi1l1l1.ll1lIIIlI1llI1l1111II1lI).lllIlll1Ill111l111Il11II11lII(), f1
               );
               switch (i11liil1i1$l1lll11l1l) {
                  case lII1I1111l1Il1l:
                     this.StringHolder_8(Vec3d, f2, j);
                     break;
                  case lIllI1III11IIIl:
                     this.EventBus(Vec3d, f2, j);
                     break;
                  case llIII1l1111llI1llI1llIlllI1:
                     this.EventTarget(Vec3d, f2, j);
               }
            }
         }
      }
   }

   private void StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, float f, int i) {
      float f1 = f * 0.5F;
      Vector3f[] avector3f = new Vector3f[8];

      for (int j = 0; j < 8; j++) {
         avector3f[j] = new Vector3f((j & 1) == 0 ? -f1 : f1, (j & 2) == 0 ? -f1 : f1, (j & 4) == 0 ? -f1 : f1);
         this.IlIll1I1llI.transform(avector3f[j]);
      }

      for (byte b0 = 0; b0 < l1lIIIl11IIllI1.length; b0 += 2) {
         this.StringHolder_8(
            avector3f[l1lIIIl11IIllI1[b0]], avector3f[l1lIIIl11IIllI1[b0 + 1]], Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F
         );
      }
   }

   private void EventBus(net.minecraft.util.math.Vec3d Vec3d, float f, int i) {
      float f1 = f * 0.56F;
      float f2 = f * 0.4F;
      Vector3f vector3f = new Vector3f(0.0F, f1, 0.0F);
      this.IlIll1I1llI.transform(vector3f);
      Vector3f vector3f1 = new Vector3f(0.0F, -f1, 0.0F);
      this.IlIll1I1llI.transform(vector3f1);
      Vector3f vector3f2 = new Vector3f(f2, 0.0F, 0.0F);
      this.IlIll1I1llI.transform(vector3f2);
      Vector3f vector3f3 = new Vector3f(-f2, 0.0F, 0.0F);
      this.IlIll1I1llI.transform(vector3f3);
      Vector3f vector3f4 = new Vector3f(0.0F, 0.0F, f2);
      this.IlIll1I1llI.transform(vector3f4);
      Vector3f vector3f5 = new Vector3f(0.0F, 0.0F, -f2);
      this.IlIll1I1llI.transform(vector3f5);
      this.StringHolder_8(vector3f, vector3f2, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
      this.StringHolder_8(vector3f, vector3f3, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
      this.StringHolder_8(vector3f, vector3f4, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
      this.StringHolder_8(vector3f, vector3f5, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
      this.StringHolder_8(vector3f1, vector3f2, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
      this.StringHolder_8(vector3f1, vector3f3, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
      this.StringHolder_8(vector3f1, vector3f4, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
      this.StringHolder_8(vector3f1, vector3f5, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
      this.StringHolder_8(vector3f2, vector3f5, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
      this.StringHolder_8(vector3f5, vector3f3, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
      this.StringHolder_8(vector3f3, vector3f4, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
      this.StringHolder_8(vector3f4, vector3f2, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
   }

   private void EventTarget(net.minecraft.util.math.Vec3d Vec3d, float f, int i) {
      Vector3f vector3f = new Vector3f(0.0F, f * 0.62F, 0.0F);
      this.IlIll1I1llI.transform(vector3f);
      Vector3f vector3f1 = new Vector3f(f * 0.56F, -f * 0.24F, 0.0F);
      this.IlIll1I1llI.transform(vector3f1);
      Vector3f vector3f2 = new Vector3f(-f * 0.28F, -f * 0.24F, f * 0.4816F);
      this.IlIll1I1llI.transform(vector3f2);
      Vector3f vector3f3 = new Vector3f(-f * 0.28F, -f * 0.24F, -f * 0.4816F);
      this.IlIll1I1llI.transform(vector3f3);
      this.StringHolder_8(vector3f, vector3f1, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
      this.StringHolder_8(vector3f, vector3f2, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
      this.StringHolder_8(vector3f, vector3f3, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
      this.StringHolder_8(vector3f1, vector3f2, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
      this.StringHolder_8(vector3f2, vector3f3, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
      this.StringHolder_8(vector3f3, vector3f1, Vec3d.x, Vec3d.y, Vec3d.z, i, 1.6F);
   }

   private float[] lI1IlIIlll11l1IIll() {
      if (this.Illl11l1IllllIl11II11IllII1) {
         return this.llIl1I11111IIIIII11II111I;
      } else {
         this.Illl11l1IllllIl11II11IllII1 = true;
         InputStream inputstream = Particles.class.getResourceAsStream("/assets/zenith/visuals/particles/heart.gltf");
         if (inputstream == null) {
            return null;
         } else {
            try {
               byte[] abyte = inputstream.readAllBytes();
               JsonObject jsonobject = JsonParser.parseString(new String(abyte, StandardCharsets.UTF_8)).getAsJsonObject();
               String s = jsonobject.getAsJsonArray("buffers").get(0).getAsJsonObject().get("uri").getAsString();
               int i = s.indexOf(44);
               byte[] abyte1 = Base64.getDecoder().decode(s.substring(i + 1));
               ByteBuffer bytebuffer = ByteBuffer.wrap(abyte1).order(ByteOrder.LITTLE_ENDIAN);
               JsonArray jsonarray = jsonobject.getAsJsonArray("bufferViews");
               int[] aint = new int[jsonarray.size()];

               for (int j = 0; j < jsonarray.size(); j++) {
                  JsonObject jsonobject1 = jsonarray.get(j).getAsJsonObject();
                  aint[j] = jsonobject1.has("byteOffset") ? jsonobject1.get("byteOffset").getAsInt() : 0;
               }

               JsonArray jsonarray2 = jsonobject.getAsJsonArray("accessors");
               int[] aint6 = new int[jsonarray2.size()];
               int[] aint1 = new int[jsonarray2.size()];
               int[] aint2 = new int[jsonarray2.size()];
               int[] aint3 = new int[jsonarray2.size()];

               for (int k = 0; k < jsonarray2.size(); k++) {
                  JsonObject jsonobject2 = jsonarray2.get(k).getAsJsonObject();
                  aint6[k] = jsonobject2.get("bufferView").getAsInt();
                  aint1[k] = jsonobject2.get("componentType").getAsInt();
                  aint2[k] = jsonobject2.get("count").getAsInt();
                  aint3[k] = jsonobject2.has("byteOffset") ? jsonobject2.get("byteOffset").getAsInt() : 0;
               }

               JsonArray jsonarray3 = jsonobject.getAsJsonArray("nodes");
               float[][] afloat1 = new float[jsonarray3.size()][3];
               boolean[] aboolean = new boolean[jsonarray3.size()];
               int l = jsonobject.has("scene") ? jsonobject.get("scene").getAsInt() : 0;
               JsonArray jsonarray1 = jsonobject.getAsJsonArray("scenes").get(l).getAsJsonObject().getAsJsonArray("nodes");

               for (int i1 = 0; i1 < jsonarray1.size(); i1++) {
                  StringHolder_8(jsonarray3, jsonarray1.get(i1).getAsInt(), 0.0F, 0.0F, 0.0F, afloat1, aboolean);
               }

               JsonArray jsonarray4 = jsonobject.getAsJsonArray("meshes");
               int[] aint4 = new int[jsonarray4.size()];
               int[] aint5 = new int[jsonarray4.size()];

               for (int j1 = 0; j1 < jsonarray4.size(); j1++) {
                  JsonObject jsonobject3 = jsonarray4.get(j1).getAsJsonObject().getAsJsonArray("primitives").get(0).getAsJsonObject();
                  aint4[j1] = jsonobject3.getAsJsonObject("attributes").get("POSITION").getAsInt();
                  aint5[j1] = jsonobject3.get("indices").getAsInt();
               }

               HashMap hashmap = new HashMap();
               float f27 = Float.POSITIVE_INFINITY;
               float f = Float.POSITIVE_INFINITY;
               float f1 = Float.POSITIVE_INFINITY;
               float f2 = Float.NEGATIVE_INFINITY;
               float f3 = Float.NEGATIVE_INFINITY;
               float f4 = Float.NEGATIVE_INFINITY;

               for (int k1 = 0; k1 < jsonarray3.size(); k1++) {
                  JsonObject jsonobject4 = jsonarray3.get(k1).getAsJsonObject();
                  if (jsonobject4.has("mesh")) {
                     int l1 = jsonobject4.get("mesh").getAsInt();
                     int i2 = aint4[l1];
                     int j2 = aint5[l1];
                     int k2 = aint2[i2];
                     int l2 = aint[aint6[i2]] + aint3[i2];
                     float[] afloat = new float[k2 * 3];

                     for (int i3 = 0; i3 < k2; i3++) {
                        float f5 = bytebuffer.getFloat(l2 + i3 * 12) + afloat1[k1][0];
                        float f6 = bytebuffer.getFloat(l2 + i3 * 12 + 4) + afloat1[k1][1];
                        float f7 = bytebuffer.getFloat(l2 + i3 * 12 + 8) + afloat1[k1][2];
                        afloat[i3 * 3] = f5;
                        afloat[i3 * 3 + 1] = f6;
                        afloat[i3 * 3 + 2] = f7;
                        if (f5 < f27) {
                           f27 = f5;
                        }

                        if (f5 > f2) {
                           f2 = f5;
                        }

                        if (f6 < f) {
                           f = f6;
                        }

                        if (f6 > f3) {
                           f3 = f6;
                        }

                        if (f7 < f1) {
                           f1 = f7;
                        }

                        if (f7 > f4) {
                           f4 = f7;
                        }
                     }

                     int k4 = aint2[j2];
                     int l4 = aint[aint6[j2]] + aint3[j2];
                     int i5 = aint1[j2];
                     int[] aint7 = new int[k4];

                     for (int j3 = 0; j3 < k4; j3++) {
                        if (i5 == 5123) {
                           aint7[j3] = bytebuffer.getShort(l4 + j3 * 2) & '\uffff';
                        } else if (i5 == 5125) {
                           aint7[j3] = bytebuffer.getInt(l4 + j3 * 4);
                        } else {
                           aint7[j3] = bytebuffer.get(l4 + j3) & 255;
                        }
                     }

                     for (byte b0 = 0; b0 < k4; b0 += 3) {
                        int k3 = aint7[b0];
                        int l3 = aint7[b0 + 1];
                        int i4 = aint7[b0 + 2];
                        float f8 = afloat[k3 * 3];
                        float f9 = afloat[k3 * 3 + 1];
                        float f10 = afloat[k3 * 3 + 2];
                        float f11 = afloat[l3 * 3];
                        float f12 = afloat[l3 * 3 + 1];
                        float f13 = afloat[l3 * 3 + 2];
                        float f14 = afloat[i4 * 3];
                        float f15 = afloat[i4 * 3 + 1];
                        float f16 = afloat[i4 * 3 + 2];
                        float f17 = f11 - f8;
                        float f18 = f12 - f9;
                        float f19 = f13 - f10;
                        float f20 = f14 - f8;
                        float f21 = f15 - f9;
                        float f22 = f16 - f10;
                        float f23 = f18 * f22 - f19 * f21;
                        float f24 = f19 * f20 - f17 * f22;
                        float f25 = f17 * f21 - f18 * f20;
                        float f26 = (float)Math.sqrt((double)(f23 * f23 + f24 * f24 + f25 * f25));
                        if (!(f26 < 1.0E-8F)) {
                           f23 /= f26;
                           f24 /= f26;
                           f25 /= f26;
                           StringHolder_8(hashmap, f8, f9, f10, f11, f12, f13, f23, f24, f25);
                           StringHolder_8(hashmap, f11, f12, f13, f14, f15, f16, f23, f24, f25);
                           StringHolder_8(hashmap, f14, f15, f16, f8, f9, f10, f23, f24, f25);
                        }
                     }
                  }
               }

               float f28 = (f27 + f2) * 0.5F;
               float f29 = (f + f3) * 0.5F;
               float f30 = (f1 + f4) * 0.5F;
               float f31 = Math.max(f2 - f27, Math.max(f3 - f, f4 - f1));
               float f32 = f31 > 1.0E-5F ? 1.2F / f31 : 1.0F;
               ArrayList arraylist = new ArrayList(hashmap.size() * 6);

               for (Particles$EventBus i11liil1i1$l1i1illlili : hashmap.values()) {
                  if (i11liil1i1$l1i1illlili.count == 1 || !i11liil1i1$l1i1illlili.lll1l1lIIl1lIIIIl11lI) {
                     arraylist.add((i11liil1i1$l1i1illlili.Il1IIIlIllI11I1IIIIIl1l1lI - f28) * f32);
                     arraylist.add((i11liil1i1$l1i1illlili.III1IIIlll1I1llIlI1I1l1I - f29) * f32);
                     arraylist.add((i11liil1i1$l1i1illlili.Il1lll111I1111lI11Il1II1I1I1 - f30) * f32);
                     arraylist.add((i11liil1i1$l1i1illlili.I11I1lIIlll111Illl11ll1 - f28) * f32);
                     arraylist.add((i11liil1i1$l1i1illlili.lI1l1I1l1lII11llIIlIll11 - f29) * f32);
                     arraylist.add((i11liil1i1$l1i1illlili.II11l111I111IllllI1l - f30) * f32);
                  }
               }

               this.llIl1I11111IIIIII11II111I = new float[arraylist.size()];

               for (int j4 = 0; j4 < arraylist.size(); j4++) {
                  this.llIl1I11111IIIIII11II111I[j4] = (Float)arraylist.get(j4);
               }
            } catch (Exception exception) {
               this.llIl1I11111IIIIII11II111I = null;
            }

            return this.llIl1I11111IIIIII11II111I;
         }
      }
   }

   private static void StringHolder_8(JsonArray jsonarray, int i, float f, float f1, float f2, float[][] afloat, boolean[] aboolean) {
      if (i >= 0 && i < jsonarray.size() && !aboolean[i]) {
         aboolean[i] = true;
         JsonObject jsonobject = jsonarray.get(i).getAsJsonObject();
         float f3 = f;
         float f4 = f1;
         float f5 = f2;
         if (jsonobject.has("translation")) {
            JsonArray jsonarray1 = jsonobject.getAsJsonArray("translation");
            f3 = f + jsonarray1.get(0).getAsFloat();
            f4 = f1 + jsonarray1.get(1).getAsFloat();
            f5 = f2 + jsonarray1.get(2).getAsFloat();
         }

         afloat[i][0] = f3;
         afloat[i][1] = f4;
         afloat[i][2] = f5;
         if (jsonobject.has("children")) {
            JsonArray jsonarray2 = jsonobject.getAsJsonArray("children");

            for (int j = 0; j < jsonarray2.size(); j++) {
               StringHolder_8(jsonarray, jsonarray2.get(j).getAsInt(), f3, f4, f5, afloat, aboolean);
            }
         }
      }
   }

   private static void StringHolder_8(
      Map<String, Particles$EventBus> map, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8
   ) {
      int i = Math.round(f * 10000.0F);
      int j = Math.round(f1 * 10000.0F);
      int k = Math.round(f2 * 10000.0F);
      int l = Math.round(f3 * 10000.0F);
      int i1 = Math.round(f4 * 10000.0F);
      int j1 = Math.round(f5 * 10000.0F);
      boolean flag;
      if (i != l) {
         flag = i > l;
      } else if (j != i1) {
         flag = j > i1;
      } else {
         flag = k > j1;
      }

      String s = flag ? l + "," + i1 + "," + j1 + "|" + i + "," + j + "," + k : i + "," + j + "," + k + "|" + l + "," + i1 + "," + j1;
      Particles$EventBus i11liil1i1$l1i1illlili = (Particles$EventBus)map.get(s);
      if (i11liil1i1$l1i1illlili == null) {
         map.put(s, new Particles$EventBus(f, f1, f2, f3, f4, f5, f6, f7, f8));
      } else {
         i11liil1i1$l1i1illlili.count++;
         float f9 = i11liil1i1$l1i1illlili.lIlIIll1II * f6
            + i11liil1i1$l1i1illlili.IIlllIlIIllIIl11IIIl1I1 * f7
            + i11liil1i1$l1i1illlili.lIlI1Ill1IlII1l1Il1 * f8;
         if (Math.abs(f9) < 0.985F) {
            i11liil1i1$l1i1illlili.lll1l1lIIl1lIIIIl11lI = false;
         }
      }
   }

   private float[] I1I111II1l1l1llI() {
      if (this.l11Il1llIl11l11IIlII1I != null) {
         return this.l11Il1llIl11l11IIlII1I;
      } else {
         float f = 0.5F;
         float f1 = 0.42F;
         float f2 = 0.3F;
         float f3 = 0.13F;
         float f4 = 0.022F;
         float f5 = (f * f - f1 * f1 + f2 * f2) / (2.0F * f2);
         float f6 = (float)Math.sqrt((double)Math.max(0.0F, f * f - f5 * f5));
         float f7 = (float)Math.atan2((double)f6, (double)f5);
         float f8 = (float)Math.atan2((double)f6, (double)(f5 - f2));
         byte b0 = 18;
         byte b1 = 3;
         float f9 = (f - f5) * 0.5F;
         float f10 = f7;
         float f11 = (float) (Math.PI * 2) - 2.0F * f7;
         float f12 = f11 / (float)b0;
         float f13 = f8;
         float f14 = (float) (Math.PI * 2) - 2.0F * f8;
         float f15 = f14 / (float)b0;
         float[] afloat = new float[b0 + 1];
         float[] afloat1 = new float[b0 + 1];
         float[] afloat2 = new float[b0 + 1];

         for (int i = 0; i <= b0; i++) {
            float f16 = f10 + f12 * (float)i;
            afloat[i] = (float)Math.cos((double)f16) * f + f9;
            afloat1[i] = (float)Math.sin((double)f16) * f;
            float f17 = (f16 - f10) / f11;
            afloat2[i] = f4 + (f3 - f4) * (float)Math.sin((double)f17 * Math.PI);
         }

         float[] afloat3 = new float[b0 + 1];
         float[] afloat4 = new float[b0 + 1];
         float[] afloat5 = new float[b0 + 1];

         for (int j = 0; j <= b0; j++) {
            float f18 = f13 + f15 * (float)j;
            afloat3[j] = (float)Math.cos((double)f18) * f1 + f2 + f9;
            afloat4[j] = (float)Math.sin((double)f18) * f1;
            float f19 = (f18 - f13) / f14;
            afloat5[j] = f4 + (f3 - f4) * (float)Math.sin((double)f19 * Math.PI);
         }

         ArrayList arraylist = new ArrayList(b0 * 28 + 64);

         for (int k = 0; k < b0; k++) {
            arraylist.add(afloat[k]);
            arraylist.add(afloat1[k]);
            arraylist.add(afloat2[k]);
            arraylist.add(afloat[k + 1]);
            arraylist.add(afloat1[k + 1]);
            arraylist.add(afloat2[k + 1]);
            arraylist.add(afloat[k]);
            arraylist.add(afloat1[k]);
            arraylist.add(-afloat2[k]);
            arraylist.add(afloat[k + 1]);
            arraylist.add(afloat1[k + 1]);
            arraylist.add(-afloat2[k + 1]);
         }

         for (int l = 0; l < b0; l++) {
            arraylist.add(afloat3[l]);
            arraylist.add(afloat4[l]);
            arraylist.add(afloat5[l]);
            arraylist.add(afloat3[l + 1]);
            arraylist.add(afloat4[l + 1]);
            arraylist.add(afloat5[l + 1]);
            arraylist.add(afloat3[l]);
            arraylist.add(afloat4[l]);
            arraylist.add(-afloat5[l]);
            arraylist.add(afloat3[l + 1]);
            arraylist.add(afloat4[l + 1]);
            arraylist.add(-afloat5[l + 1]);
         }

         for (byte b2 = 0; b2 <= b0; b2 += b1) {
            arraylist.add(afloat[b2]);
            arraylist.add(afloat1[b2]);
            arraylist.add(afloat2[b2]);
            arraylist.add(afloat[b2]);
            arraylist.add(afloat1[b2]);
            arraylist.add(-afloat2[b2]);
         }

         for (byte b3 = b1; b3 < b0; b3 += b1) {
            arraylist.add(afloat3[b3]);
            arraylist.add(afloat4[b3]);
            arraylist.add(afloat5[b3]);
            arraylist.add(afloat3[b3]);
            arraylist.add(afloat4[b3]);
            arraylist.add(-afloat5[b3]);
         }

         this.l11Il1llIl11l11IIlII1I = new float[arraylist.size()];

         for (int i1 = 0; i1 < arraylist.size(); i1++) {
            this.l11Il1llIl11l11IIlII1I[i1] = (Float)arraylist.get(i1);
         }

         return this.l11Il1llIl11l11IIlII1I;
      }
   }

   private void StringHolder_8(Vector3f vector3f, Vector3f vector3f1, double d0, double d1, double d2, int i, float f) {
      this.StringHolder_8(
         d0 + (double)vector3f.x,
         d1 + (double)vector3f.y,
         d2 + (double)vector3f.z,
         d0 + (double)vector3f1.x,
         d1 + (double)vector3f1.y,
         d2 + (double)vector3f1.z,
         i,
         f
      );
   }

   private void StringHolder_8(double d0, double d1, double d2, double d3, double d4, double d5, int i, float f7) {
      float f = (float)(d0 - this.II11ll1l11Il1IIllIl1l1l11l1ll);
      float f1 = (float)(d1 - this.l11IlIlI1IllllllI1llI1l1);
      float f2 = (float)(d2 - this.l11l11Il1);
      float f3 = (float)(d3 - this.II11ll1l11Il1IIllIl1l1l11l1ll);
      float f4 = (float)(d4 - this.l11IlIlI1IllllllI1llI1l1);
      float f5 = (float)(d5 - this.l11l11Il1);
      float f6 = this.lI11Ill111Il11111l1Ill1l1IlIlI;
      if (f6 > 0.05F) {
         int j = (this.II111IlI1l1II11111I1l1 + 1) * 6;
         if (j > this.IlI111lIl1Il1II1111Il.length) {
            this.IlI111lIl1Il1II1111Il = Arrays.copyOf(this.IlI111lIl1Il1II1111Il, this.IlI111lIl1Il1II1111Il.length * 2);
         }

         if (this.II111IlI1l1II11111I1l1 >= this.ll1lll1I1lll1II11Il.length) {
            this.ll1lll1I1lll1II11Il = Arrays.copyOf(this.ll1lll1I1lll1II11Il, this.ll1lll1I1lll1II11Il.length * 2);
         }

         int k = this.II111IlI1l1II11111I1l1 * 6;
         this.IlI111lIl1Il1II1111Il[k] = f;
         this.IlI111lIl1Il1II1111Il[k + 1] = f1;
         this.IlI111lIl1Il1II1111Il[k + 2] = f2;
         this.IlI111lIl1Il1II1111Il[k + 3] = f3;
         this.IlI111lIl1Il1II1111Il[k + 4] = f4;
         this.IlI111lIl1Il1II1111Il[k + 5] = f5;
         this.ll1lll1I1lll1II11Il[this.II111IlI1l1II11111I1l1++] = PatternHolder.EventBus(i, 0.22F + 0.1F * f6);
      }

      int l = (this.IlIIllIllIl1lllII1lIl1I1Il + 1) * 6;
      if (l > this.l1I1IIIlII11llIII.length) {
         this.l1I1IIIlII11llIII = Arrays.copyOf(this.l1I1IIIlII11llIII, this.l1I1IIIlII11llIII.length * 2);
      }

      if (this.IlIIllIllIl1lllII1lIl1I1Il >= this.lII1llIII1l1IllIl.length) {
         this.lII1llIII1l1IllIl = Arrays.copyOf(this.lII1llIII1l1IllIl, this.lII1llIII1l1IllIl.length * 2);
      }

      int i1 = this.IlIIllIllIl1lllII1lIl1I1Il * 6;
      this.l1I1IIIlII11llIII[i1] = f;
      this.l1I1IIIlII11llIII[i1 + 1] = f1;
      this.l1I1IIIlII11llIII[i1 + 2] = f2;
      this.l1I1IIIlII11llIII[i1 + 3] = f3;
      this.l1I1IIIlII11llIII[i1 + 4] = f4;
      this.l1I1IIIlII11llIII[i1 + 5] = f5;
      this.lII1llIII1l1IllIl[this.IlIIllIllIl1lllII1lIl1I1Il++] = i;
   }

   private void StringHolder_8(MatrixStack MatrixStack) {
      if (this.IlIIllIllIl1lllII1lIl1I1Il != 0 || this.II111IlI1l1II11111I1l1 != 0) {
         GL11.glEnable(2881);
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(false);
         RenderSystem.blendFunc(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE_MINUS_CONSTANT_ALPHA);
         RenderSystem.setShader(ShaderProgramKeys.RENDERTYPE_LINES);
         BeaconScreen5 BeaconScreen5 = MatrixStack.peek();
         if (this.II111IlI1l1II11111I1l1 > 0) {
            RenderSystem.lineWidth(5.1200004F);
            this.StringHolder_8(BeaconScreen5, this.IlI111lIl1Il1II1111Il, this.ll1lll1I1lll1II11Il, this.II111IlI1l1II11111I1l1);
         }

         if (this.IlIIllIllIl1lllII1lIl1I1Il > 0) {
            RenderSystem.lineWidth(1.6F);
            this.StringHolder_8(BeaconScreen5, this.l1I1IIIlII11llIII, this.lII1llIII1l1IllIl, this.IlIIllIllIl1lllII1lIl1I1Il);
         }

         RenderSystem.depthMask(true);
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         GL11.glDisable(2881);
         this.IlIIllIllIl1lllII1lIl1I1Il = 0;
         this.II111IlI1l1II11111I1l1 = 0;
      }
   }

   private void StringHolder_8(BeaconScreen5 BeaconScreen5, float[] afloat, int[] aint, int i) {
      net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.LINES, net.minecraft.client.render.VertexFormats.LINES);

      for (int j = 0; j < i; j++) {
         int k = j * 6;
         float f = afloat[k];
         float f1 = afloat[k + 1];
         float f2 = afloat[k + 2];
         float f3 = afloat[k + 3];
         float f4 = afloat[k + 4];
         float f5 = afloat[k + 5];
         int l = aint[j];
         float f6 = f3 - f;
         float f7 = f4 - f1;
         float f8 = f5 - f2;
         float f9 = f6 * f6 + f7 * f7 + f8 * f8;
         float f10 = f9 > 1.0E-12F ? 1.0F / (float)Math.sqrt((double)f9) : 1.0F;
         float f11 = f6 * f10;
         float f12 = f7 * f10;
         float f13 = f8 * f10;
         BufferBuilder.vertex(BeaconScreen5, f, f1, f2).color(l).normal(BeaconScreen5, f11, f12, f13);
         BufferBuilder.vertex(BeaconScreen5, f3, f4, f5).color(l).normal(BeaconScreen5, f11, f12, f13);
      }

      net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
   }

   private void longHolder_3(long i) {
      boolean flag = this.I1lI1Ill11llIlI111l.ConstructorHolder(1) && !this.lIIII1III1IlIIIl1I.isEmpty();
      boolean flag1 = this.I1lI1Ill11llIlI111l.ConstructorHolder(2) && !this.l1lIIII1.isEmpty();
      boolean flag2 = this.I1lI1Ill11llIlI111l.ConstructorHolder(3) && !this.IlI1ll11l1llll11lll1IllIl1.isEmpty();
      boolean flag3 = this.I1lI1Ill11llIlI111l.ConstructorHolder(4) && !this.I11Il11lllllllI1IlllI.isEmpty();
      boolean flag4 = this.I1lI1Ill11llIlI111l.ConstructorHolder(5) && !this.llIl1lI1I1lIlllIIII1llIlI1lI.isEmpty();
      boolean flag5 = this.I1lI1Ill11llIlI111l.ConstructorHolder(6) && !this.I1lll1Il1I1IlIlIIll.isEmpty();
      boolean flag6 = this.lI1lIll111l1llI1111IIl1II1.Spider()
         && (!this.l11l11III1111Il1Il11l1I1lllll.isEmpty() || !this.IIl1lIllIll1IlIlI1IlI1l.isEmpty() || !this.I11II11I11IIl1I1.isEmpty());
      if (flag || flag1 || flag2 || flag3 || flag4 || flag5 || flag6) {
         float f = this.ll1ll1llIlIlI1I1.lll1lI1llll1IIllIIIII1lll();
         float f1 = this.lI11Ill111Il11111l1Ill1l1IlIlI;
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.blendFuncSeparate(AdvancementTabType5.SRC_ALPHA, AdvancementTabType4.ONE, AdvancementTabType5.ZERO, AdvancementTabType4.ONE);
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(false);
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         RenderSystem.setShaderTexture(0, lI1IlI111II111llI1l111);
         net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
         if (flag) {
            this.StringHolder_8(BufferBuilder, this.lIIII1III1IlIIIl1I, f * 1.7F, f1, i, false);
         }

         if (flag1) {
            this.StringHolder_8(BufferBuilder, this.l1lIIII1, f * 1.7F, f1, i, false);
         }

         if (flag2) {
            this.StringHolder_8(BufferBuilder, this.IlI1ll11l1llll11lll1IllIl1, f * 2.0F, f1, i, true);
         }

         if (flag3) {
            this.StringHolder_8(BufferBuilder, this.I11Il11lllllllI1IlllI, f * 1.8F, f1, i, false);
         }

         if (flag4) {
            this.StringHolder_8(BufferBuilder, this.llIl1lI1I1lIlllIIII1llIlI1lI, f * 1.8F, f1, i, false);
         }

         if (flag5) {
            this.StringHolder_8(BufferBuilder, this.I1lll1Il1I1IlIlIIll, f * 1.8F, f1, i, false);
         }

         if (flag6) {
            float f2 = MathHelper.clamp((float)(i - this.ll11l1Il1l1IlIll) / 50.0F, 0.0F, 1.0F);
            this.StringHolder_8(BufferBuilder, this.l11l11III1111Il1Il11l1I1lllll, f1, i, f2);
            this.StringHolder_8(BufferBuilder, this.IIl1lIllIll1IlIlI1IlI1l, f1, i, f2);
            this.StringHolder_8(BufferBuilder, this.I11II11I11IIl1I1, f1, i, f2);
         }

         BuiltBuffer BuiltBuffer = BufferBuilder.endNullable();
         if (BuiltBuffer != null) {
            net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BuiltBuffer);
         }

         RenderSystem.depthMask(true);
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   private void StringHolder_8(net.minecraft.client.render.BufferBuilder BufferBuilder, List<Particles$EventTarget> list, float f, long i, float f1) {
      float f2 = Math.min(1.0F, f);

      for (Particles$EventTarget i11liil1i1$illi1l1l1 : list) {
         float f3 = i11liil1i1$illi1l1l1.longHolder_6(i);
         if (!(f3 <= 0.0F)) {
            net.minecraft.util.math.Vec3d Vec3d = i11liil1i1$illi1l1l1.setKeyCode(f1);
            if (this.StringHolder_8(Vec3d, 2.5)) {
               int j = this.ZenithInternal150(i11liil1i1$illi1l1l1.ll1lIIIlI1llI1l1111II1lI).lllIlll1Ill111l111Il11II11lII();
               float f4 = f3 * 0.55F * f2;
               float f5 = f3 * 0.22F * f;
               float f6 = i11liil1i1$illi1l1l1.ZenithInternal070(i);
               float f7 = 0.85F + 0.15F * MathHelper.sin(i11liil1i1$illi1l1l1.II1IlII11I1I1I1Il11Il1 * 3.0F + f6 * 6.0F);
               float f8 = i11liil1i1$illi1l1l1.IIl1I1ll1llIIllIIIII * 1.1F * f7;
               float f9 = i11liil1i1$illi1l1l1.IIl1I1ll1llIIllIIIII * 1.9F * f7;
               this.StringHolder_8(BufferBuilder, Vec3d.x, Vec3d.y, Vec3d.z, f9, j, f5);
               this.StringHolder_8(BufferBuilder, Vec3d.x, Vec3d.y, Vec3d.z, f8, j, f4);
            }
         }
      }
   }

   private void StringHolder_8(net.minecraft.client.render.BufferBuilder BufferBuilder, List<Particles$II1Il11l111II11IIl> list, float f, float f1, long i, boolean flag) {
      float f2 = Math.min(1.0F, f1);

      for (Particles$II1Il11l111II11IIl i11liil1i1$ii1il11l111ii11iil : list) {
         float f3 = this.StringHolder_8(i, i11liil1i1$ii1il11l111ii11iil.llI1IlIl1ll, i11liil1i1$ii1il11l111ii11iil.Il11l1ll11l);
         if (!(f3 >= 1.0F)) {
            net.minecraft.util.math.Vec3d Vec3d = flag
               ? this.StringHolder_8(i11liil1i1$ii1il11l111ii11iil.l1lIlI1IIIlII1I1, i11liil1i1$ii1il11l111ii11iil.IllI1l11Ill11IlIIIllI1I11l11I1, f3)
               : this.StringHolder_8(i11liil1i1$ii1il11l111ii11iil, f3);
            if (this.StringHolder_8(Vec3d, 2.5)) {
               int j = this.ZenithInternal150(i11liil1i1$ii1il11l111ii11iil.Ill1IIlll1).lllIlll1Ill111l111Il11II11lII();
               float f4 = this.StringHolder_12(f3);
               float f5 = f4 * 0.55F * f2;
               float f6 = f4 * 0.22F * f1;
               float f7 = 0.85F + 0.15F * MathHelper.sin((float)i11liil1i1$ii1il11l111ii11iil.IllI1l11Ill11IlIIIllI1I11l11I1 * 3.0F + f3 * 6.0F);
               float f8 = f * 0.55F * (0.9F + f3 * 0.2F) * f7;
               float f9 = f * (0.95F + f3 * 0.25F) * f7;
               this.StringHolder_8(BufferBuilder, Vec3d.x, Vec3d.y, Vec3d.z, f9, j, f6);
               this.StringHolder_8(BufferBuilder, Vec3d.x, Vec3d.y, Vec3d.z, f8, j, f5);
            }
         }
      }
   }

   private void StringHolder_8(net.minecraft.client.render.BufferBuilder BufferBuilder, double d0, double d1, double d2, float f, int i, float f1) {
      if (!(f1 <= 0.0F)) {
         this.Ill11111Ill11lI1ll111I11I1lII
            .set(this.llllI1IlllII1)
            .translate((float)(d0 - this.II11ll1l11Il1IIllIl1l1l11l1ll), (float)(d1 - this.l11IlIlI1IllllllI1llI1l1), (float)(d2 - this.l11l11Il1))
            .mul(this.l1llI1111IlIl1);
         int j = PatternHolder.EventBus(i, f1);
         BufferBuilder.vertex(this.Ill11111Ill11lI1ll111I11I1lII, f, -f, 0.0F).texture(0.0F, 1.0F).color(j);
         BufferBuilder.vertex(this.Ill11111Ill11lI1ll111I11I1lII, -f, -f, 0.0F).texture(1.0F, 1.0F).color(j);
         BufferBuilder.vertex(this.Ill11111Ill11lI1ll111I11I1lII, -f, f, 0.0F).texture(1.0F, 0.0F).color(j);
         BufferBuilder.vertex(this.Ill11111Ill11lI1ll111I11I1lII, f, f, 0.0F).texture(0.0F, 0.0F).color(j);
      }
   }

   private float StringHolder_12(float f) {
      if (f < 0.15F) {
         return f / 0.15F;
      } else {
         return f > 0.75F ? Math.max(0.0F, (1.0F - f) / 0.25F) : 1.0F;
      }
   }

   private net.minecraft.util.math.Vec3d StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, double d0, float f) {
      float f1 = MathHelper.sin((float)d0 * 7.0F + f * 4.0F) * 0.6F;
      float f2 = MathHelper.cos((float)d0 * 9.0F + f * 5.0F) * 0.6F;
      float f3 = MathHelper.sin((float)d0 * 5.0F + f * 3.0F) * 0.4F + f * 0.6F;
      return new net.minecraft.util.math.Vec3d(Vec3d.x + (double)f1, Vec3d.y + (double)f3, Vec3d.z + (double)f2);
   }

   private net.minecraft.util.math.Vec3d StringHolder_8(Particles$II1Il11l111II11IIl i11liil1i1$ii1il11l111ii11iil, float f) {
      return new net.minecraft.util.math.Vec3d(
         i11liil1i1$ii1il11l111ii11iil.l1lIlI1IIIlII1I1.x + i11liil1i1$ii1il11l111ii11iil.I1I11l1III * (double)f,
         i11liil1i1$ii1il11l111ii11iil.l1lIlI1IIIlII1I1.y + i11liil1i1$ii1il11l111ii11iil.ll1111lllllII * (double)f,
         i11liil1i1$ii1il11l111ii11iil.l1lIlI1IIIlII1I1.z + i11liil1i1$ii1il11l111ii11iil.IIIlllI111ll111lII1 * (double)f
      );
   }

   private float[] ll1Il1lIIlIII1l1Il1I11l1() {
      if (this.I1111I1lIlIll) {
         return this.I1Illl1Il111IIIl;
      } else {
         this.I1111I1lIlIll = true;
         InputStream inputstream = Particles.class.getResourceAsStream("/assets/zenith/visuals/particles/totem_undying.obj");
         if (inputstream == null) {
            return null;
         } else {
            try (BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream, StandardCharsets.UTF_8))) {
               ArrayList arraylist = new ArrayList();
               HashMap hashmap = new HashMap();

               String s;
               while ((s = bufferedreader.readLine()) != null) {
                  s = s.trim();
                  if (s.startsWith("v ")) {
                     String[] astring2 = s.split("\\s+");
                     arraylist.add(new Vector3f(Float.parseFloat(astring2[1]), Float.parseFloat(astring2[2]) - 0.75F, Float.parseFloat(astring2[3])));
                  } else if (s.startsWith("f ")) {
                     String[] astring = s.split("\\s+");

                     for (int i = 1; i < astring.length; i++) {
                        int j = i == astring.length - 1 ? 1 : i + 1;
                        int k = Integer.parseInt(astring[i].split("/")[0]) - 1;
                        int l = Integer.parseInt(astring[j].split("/")[0]) - 1;
                        if (k != l) {
                           String[] astring1 = astring[i].split("/");
                           int i1 = astring1.length > 2 && !astring1[2].isEmpty() ? Integer.parseInt(astring1[2]) - 1 : -1;
                           long j1 = (long)Math.min(k, l) << 32 | (long)Math.max(k, l) & 4294967295L;
                           Particles$Event i11liil1i1$liil11l111liil1ll = (Particles$Event)hashmap.get(j1);
                           if (i11liil1i1$liil11l111liil1ll == null) {
                              Vector3f vector3f = (Vector3f)arraylist.get(k);
                              Vector3f vector3f1 = (Vector3f)arraylist.get(l);
                              hashmap.put(j1, new Particles$Event(vector3f.x, vector3f.y, vector3f.z, vector3f1.x, vector3f1.y, vector3f1.z, i1));
                           } else {
                              i11liil1i1$liil11l111liil1ll.count++;
                              if (i11liil1i1$liil11l111liil1ll.llIlI11I1I1lIl1IlIII1lII != i1) {
                                 i11liil1i1$liil11l111liil1ll.lI11Il1lI1l = false;
                              }
                           }
                        }
                     }
                  }
               }

               ArrayList arraylist1 = new ArrayList();

               for (Particles$Event i11liil1i1$liil11l111liil1ll1 : hashmap.values()) {
                  if (i11liil1i1$liil11l111liil1ll1.count == 1 || !i11liil1i1$liil11l111liil1ll1.lI11Il1lI1l) {
                     arraylist1.add(i11liil1i1$liil11l111liil1ll1.I1l1I1lIIl1I111l111l);
                     arraylist1.add(i11liil1i1$liil11l111liil1ll1.l1lI11I111IlllI1lII1Ill);
                     arraylist1.add(i11liil1i1$liil11l111liil1ll1.I1lI11llIll1l1llIlIll1l11);
                     arraylist1.add(i11liil1i1$liil11l111liil1ll1.lIIlI11I1111II1l1llI);
                     arraylist1.add(i11liil1i1$liil11l111liil1ll1.l1lII1I1IIIIIlllIll1lI);
                     arraylist1.add(i11liil1i1$liil11l111liil1ll1.llI1lIII1lIIIl1);
                  }
               }

               this.I1Illl1Il111IIIl = new float[arraylist1.size()];

               for (int k1 = 0; k1 < arraylist1.size(); k1++) {
                  this.I1Illl1Il111IIIl[k1] = (Float)arraylist1.get(k1);
               }
            } catch (Exception exception) {
               this.I1Illl1Il111IIIl = null;
            }

            return this.I1Illl1Il111IIIl;
         }
      }
   }

   private ByteBufferHolder ZenithInternal150(int i) {
      return this.I1l1I1111I.ClearHeadersHandler(0)
         ? ZenithClient.getInstance().floatHolder_3().getClientColor(i)
         : this.II111lI11I111I11Ill111.l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }

   public float[] II1IllII1l() {
      return this.ll1Il1lIIlIII1l1Il1I11l1();
   }

   public float[] l111l11llII1Il11() {
      return this.llIlIIIIIIIlI1();
   }
}
