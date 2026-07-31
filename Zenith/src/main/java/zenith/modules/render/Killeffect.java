// Module: KillEffect
// Category: render
// Original class: Killeffect
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.render;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.VertexFormat.LootPool96;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;

@ModuleInfo(
   name = "KillEffect",
   category = Category.RENDER,
   description = "module.killEffect.desc"
)
public class Killeffect extends Module {
   public static final Killeffect IIl1l1l1ll1IIllII11I = new Killeffect();
   private static final long I1I11I1llII = 1500L;
   private static final float Il11l1lI111IIIIlll1lIl = 6.5F;
   private static final float ll1l1l1I1111IlIIlIIllI = 0.4F;
   private static final float lIlIlIII11IIllll1l1lIlI = 0.6F;
   private static final float IIIlII1l1IllII1 = 0.015625F;
   private static final float I1IlII1lI1I1lIl1I = 1.5F;
   private static final float l1llIlIl11llII1l = 1.0F;
   private final ModeSetting IlIlIII11lIIII = new ModeSetting(
      "module.killEffect.mode",
      "module.killEffect.mode.desc",
      "module.killEffect.mode.cubes",
      "module.killEffect.mode.pyramids",
      "module.killEffect.mode.body",
      "module.killEffect.mode.blackHole",
      "module.killEffect.mode.fountain"
   );
   private final NumberSetting IlllIl1l1ll1llI1ll = new NumberSetting(
      "module.killEffect.duration", 1500.0F, 400.0F, 4000.0F, 100.0F, "module.killEffect.duration.desc", "ms"
   );
   private final NumberSetting II1ll1Illl1l1II = new NumberSetting(
      "module.killEffect.scale", 1.0F, 0.3F, 3.0F, 0.1F, "module.killEffect.scale.desc", "x"
   );
   private final NumberSetting Il1lII1I1l1IlI1lI = new NumberSetting(
      "module.killEffect.count",
      20.0F,
      4.0F,
      80.0F,
      1.0F,
      "module.killEffect.count.desc",
      "x",
      () -> !this.IlIlIII11lIIII.ClearHeadersHandler(2),
      null
   );
   private final NumberSetting Il1llII1llII1I11IlIlI1lIIlII = new NumberSetting(
      "module.killEffect.speed", 1.0F, 0.2F, 3.0F, 0.1F, "module.killEffect.speed.desc", "x"
   );
   private final ModeSetting Ill1lll1II1I1lII11l1lllIl = new ModeSetting(
      "module.killEffect.particleType",
      "module.killEffect.particleType.desc",
      () -> this.IlIlIII11lIIII.ClearHeadersHandler(3) || this.IlIlIII11lIIII.ClearHeadersHandler(4),
      "module.killEffect.particleType.cubes",
      "module.killEffect.particleType.pyramids",
      "module.killEffect.particleType.stars",
      "module.killEffect.particleType.totems",
      "module.killEffect.particleType.random"
   );
   private final ModeSetting IIIIll1lllIlll1lllIll11llI1lI = new ModeSetting(
      "module.killEffect.color", "module.killEffect.color.desc", "module.particles.sync", "module.particles.custom"
   );
   private final ColorSetting Illl11lll111lII1 = new ColorSetting(
      "module.killEffect.customColor",
      "module.killEffect.customColor.desc",
      ByteBufferHolder.ll1lIllll111I1lIIl1lIl,
      () -> this.IIIIll1lllIlll1lllIll11llI1lI.ClearHeadersHandler(1)
   );
   private final List<Killeffect$EventBus> lll1llIlIl1IIIIl1l1Illl = new ArrayList<>();
   private final Map<Integer, Long> IlI1IIlII = new HashMap<>();
   private final Random II1IlI1II11l111111ll = new Random();
   private final Matrix3f ll1l1lII11ll11III11lIlI = new Matrix3f();
   private final Vector3f I1I111I1IIl1ll1l1I11lII1IlII = new Vector3f();
   private final Vector3f lIIIIIlIII = new Vector3f();

   private Killeffect() {
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
      this.lll1llIlIl1IIIIl1l1Illl.clear();
      this.IlI1IIlII.clear();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      super.l1l1lI111l1II1Illl111l1l1ll1l();
      this.lll1llIlIl1IIIIl1l1Illl.clear();
      this.IlI1IIlII.clear();
   }

   @EventTarget
   public void EventTarget(EntityHolder i11l111illlill) {
      if (i11l111illlill.AutoMine() == ZenithInternal005$Helper.Il1III11llIlIlIl1l1IlI1IIlI) {
         Entity Entity = i11l111illlill.Autoloot();
         if (this.StringHolder_4(Entity)) {
            this.IlI1IIlII.put(Entity.getId(), System.currentTimeMillis());
         }
      }
   }

   @EventTarget
   public void StringHolder_8(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.longHolder_8() && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         if (ii1l11il1i1i.Swinganimation() instanceof EntityStatusS2CPacket EntityStatusS2CPacket) {
            if (EntityStatusS2CPacket.getStatus() == 3) {
               Entity Entity = EntityStatusS2CPacket.getEntity(l11I1I1ll1Illll1I1l1111l1II.world);
               if (Entity != null && this.StringHolder_4(Entity)) {
                  long i = System.currentTimeMillis();
                  Long olong = this.IlI1IIlII.remove(Entity.getId());
                  if (olong != null && i - olong <= 1500L) {
                     this.byteHolder_2(Entity);
                  }
               }
            }
         }
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl_34 ll1li1l111llllli1) {
      this.lII1l1lIl1111l11();
      if (l11I1I1ll1Illll1I1l1111l1II.world != null && !this.lll1llIlIl1IIIIl1l1Illl.isEmpty()) {
         long i = System.currentTimeMillis();
         float f = this.IlllIl1l1ll1llI1ll.lll1lI1llll1IIllIIIII1lll();
         MatrixStack MatrixStack = ll1li1l111llllli1.Norender();
         net.minecraft.util.math.Vec3d Vec3d = l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera.getPos();
         Iterator iterator = this.lll1llIlIl1IIIIl1l1Illl.iterator();

         while (iterator.hasNext()) {
            Killeffect$EventBus lii1l1lll1$l1i1illlili = (Killeffect$EventBus)iterator.next();
            float f1 = f * lii1l1lll1$l1i1illlili.I1IlIlI1lII1II11IlI111;
            float f2 = (float)(i - lii1l1lll1$l1i1illlili.lI11lIllI1I11lI) / f1;
            if (f2 >= 1.0F) {
               iterator.remove();
            } else {
               float f3 = (float)(i - lii1l1lll1$l1i1illlili.lI11lIllI1I11lI) / 1000.0F;
               this.StringHolder_8(lii1l1lll1$l1i1illlili, f2, f3, 1.5F, MatrixStack, Vec3d);
            }
         }
      }
   }

   private void byteHolder_2(Entity Entity) {
      float f = this.II1ll1Illl1l1II.lll1lI1llll1IIllIIIII1lll();
      if (this.IlIlIII11lIIII.ClearHeadersHandler(2)) {
         this.StringHolder_8(Entity, f);
      } else if (this.IlIlIII11lIIII.ClearHeadersHandler(3)) {
         this.EventTarget(Entity, f);
      } else if (this.IlIlIII11lIIII.ClearHeadersHandler(4)) {
         this.EventBus(Entity, f);
      } else {
         int i = Math.max(1, Math.round(this.Il1lII1I1l1IlI1lI.lll1lI1llll1IIllIIIII1lll()));
         float f1 = this.Il1llII1llII1I11IlIlI1lIIlII.lll1lI1llll1IIllIIIII1lll();
         net.minecraft.util.math.Vec3d Vec3dxxx = Entity.getPos().add(0.0, (double)Entity.getHeight() * 0.5, 0.0);
         Killeffect$II1Il11l111II11IIl[] alii1l1lll1$ii1il11l111ii11iil = new Killeffect$II1Il11l111II11IIl[i];

         for (int j = 0; j < i; j++) {
            float f2 = this.II1IlI1II11l111111ll.nextFloat() * (float) (Math.PI * 2);
            float f3 = this.II1IlI1II11l111111ll.nextFloat();
            float f4 = (2.2F + this.II1IlI1II11l111111ll.nextFloat() * 2.4F) * f * (0.55F + (1.0F - f3) * 0.6F) * f1;
            float f5 = (1.4F + f3 * 3.2F) * f * f1;
            net.minecraft.util.math.Vec3d Vec3dx = new net.minecraft.util.math.Vec3d(Math.cos((double)f2) * (double)f4, (double)f5, Math.sin((double)f2) * (double)f4);
            float f6 = (0.18F + this.II1IlI1II11l111111ll.nextFloat() * 0.18F) * f;
            net.minecraft.util.math.Vec3d Vec3dxx = new net.minecraft.util.math.Vec3d(
               (double)(this.II1IlI1II11l111111ll.nextFloat() * (float) (Math.PI * 2)),
               (double)(this.II1IlI1II11l111111ll.nextFloat() * (float) (Math.PI * 2)),
               (double)(this.II1IlI1II11l111111ll.nextFloat() * (float) (Math.PI * 2))
            );
            net.minecraft.util.math.Vec3d Vec3dxxx = new net.minecraft.util.math.Vec3d(
               (double)((this.II1IlI1II11l111111ll.nextFloat() - 0.5F) * 12.0F),
               (double)((this.II1IlI1II11l111111ll.nextFloat() - 0.5F) * 12.0F),
               (double)((this.II1IlI1II11l111111ll.nextFloat() - 0.5F) * 12.0F)
            );
            alii1l1lll1$ii1il11l111ii11iil[j] = new Killeffect$II1Il11l111II11IIl(Vec3dxxx, Vec3dx, Vec3dxx, Vec3dxxx, f6, f6, f6, f6, null);
         }

         this.lll1llIlIl1IIIIl1l1Illl
            .add(
               new Killeffect$EventBus(
                  System.currentTimeMillis(), this.II1IlI1II11l111111ll.nextInt(180), this.IlIlIII11lIIII.getIndex(), alii1l1lll1$ii1il11l111ii11iil, null
               )
            );
      }
   }

   private void StringHolder_8(Entity Entity, float f) {
      float f1 = Math.max(0.5F, Entity.getHeight());
      net.minecraft.util.math.Vec3d Vec3dxxxx = Entity.getPos();
      Identifier Identifier = this.byteHolder(Entity);
      Killeffect$EventTarget[][] alii1l1lll1$illi1l1l1 = null;
      if (Identifier != null) {
         alii1l1lll1$illi1l1l1 = new Killeffect$EventTarget[][]{
            StringHolder_8(0.0F, 0.0F, 8.0F, 8.0F, 8.0F),
            StringHolder_8(16.0F, 16.0F, 8.0F, 12.0F, 4.0F),
            StringHolder_8(40.0F, 16.0F, 4.0F, 12.0F, 4.0F),
            StringHolder_8(32.0F, 48.0F, 4.0F, 12.0F, 4.0F),
            StringHolder_8(0.0F, 16.0F, 4.0F, 12.0F, 4.0F),
            StringHolder_8(16.0F, 48.0F, 4.0F, 12.0F, 4.0F)
         };
      }

      float[][] afloat = new float[][]{
         {0.0F, 0.88F, 0.0F, 0.25F, 0.25F, 0.25F},
         {0.0F, 0.6F, 0.0F, 0.3F, 0.4F, 0.18F},
         {-0.21F, 0.6F, 0.0F, 0.12F, 0.4F, 0.12F},
         {0.21F, 0.6F, 0.0F, 0.12F, 0.4F, 0.12F},
         {-0.08F, 0.2F, 0.0F, 0.14F, 0.4F, 0.14F},
         {0.08F, 0.2F, 0.0F, 0.14F, 0.4F, 0.14F}
      };
      Killeffect$II1Il11l111II11IIl[] alii1l1lll1$ii1il11l111ii11iil = new Killeffect$II1Il11l111II11IIl[afloat.length];

      for (int i = 0; i < afloat.length; i++) {
         float[] afloat1 = afloat[i];
         net.minecraft.util.math.Vec3d Vec3dx = Vec3dxxxx.add((double)(afloat1[0] * f1), (double)(afloat1[1] * f1), (double)(afloat1[2] * f1));
         double d0 = (double)afloat1[0];
         double d1 = (double)afloat1[2];
         double d2 = Math.sqrt(d0 * d0 + d1 * d1);
         double d3;
         double d4;
         if (d2 < 1.0E-4) {
            double d5 = (double)(this.II1IlI1II11l111111ll.nextFloat() * (float) (Math.PI * 2));
            d3 = Math.cos(d5);
            d4 = Math.sin(d5);
         } else {
            d3 = d0 / d2;
            d4 = d1 / d2;
         }

         float f5 = this.Il1llII1llII1I11IlIlI1lIIlII.lll1lI1llll1IIllIIIII1lll();
         float f2 = (1.8F + this.II1IlI1II11l111111ll.nextFloat() * 1.6F) * f * f5;
         float f3 = (2.2F + this.II1IlI1II11l111111ll.nextFloat() * 2.0F) * f * f5;
         net.minecraft.util.math.Vec3d Vec3dxx = new net.minecraft.util.math.Vec3d(
            d3 * (double)f2 + (double)((this.II1IlI1II11l111111ll.nextFloat() - 0.5F) * f * f5),
            (double)f3,
            d4 * (double)f2 + (double)((this.II1IlI1II11l111111ll.nextFloat() - 0.5F) * f * f5)
         );
         net.minecraft.util.math.Vec3d Vec3dxxx = new net.minecraft.util.math.Vec3d(
            (double)(this.II1IlI1II11l111111ll.nextFloat() * (float) (Math.PI * 2)),
            (double)(this.II1IlI1II11l111111ll.nextFloat() * (float) (Math.PI * 2)),
            (double)(this.II1IlI1II11l111111ll.nextFloat() * (float) (Math.PI * 2))
         );
         net.minecraft.util.math.Vec3d Vec3dxxxx = new net.minecraft.util.math.Vec3d(
            (double)((this.II1IlI1II11l111111ll.nextFloat() - 0.5F) * 10.0F),
            (double)((this.II1IlI1II11l111111ll.nextFloat() - 0.5F) * 10.0F),
            (double)((this.II1IlI1II11l111111ll.nextFloat() - 0.5F) * 10.0F)
         );
         float f4 = 0.2F * f1 * f;
         Killeffect$EventTarget[] alii1l1lll1$illi1l1l11 = alii1l1lll1$illi1l1l1 == null ? null : alii1l1lll1$illi1l1l1[i];
         alii1l1lll1$ii1il11l111ii11iil[i] = new Killeffect$II1Il11l111II11IIl(
            Vec3dx, Vec3dxx, Vec3dxxx, Vec3dxxxx, afloat1[3] * f1 * f, afloat1[4] * f1 * f, afloat1[5] * f1 * f, f4, alii1l1lll1$illi1l1l11
         );
      }

      this.lll1llIlIl1IIIIl1l1Illl
         .add(new Killeffect$EventBus(System.currentTimeMillis(), this.II1IlI1II11l111111ll.nextInt(180), 2, alii1l1lll1$ii1il11l111ii11iil, Identifier));
   }

   private void EventBus(Entity Entity, float f) {
      net.minecraft.util.math.Vec3d Vec3dxxxx = Entity.getPos();
      int i = Math.max(1, Math.round(this.Il1lII1I1l1IlI1lI.lll1lI1llll1IIllIIIII1lll()));
      float f1 = this.Il1llII1llII1I11IlIlI1lIIlII.lll1lI1llll1IIllIIIII1lll();
      float f2 = 2.0F * this.IlllIl1l1ll1llI1ll.lll1lI1llll1IIllIIIII1lll() / 1000.0F;
      Killeffect$II1Il11l111II11IIl[] alii1l1lll1$ii1il11l111ii11iil = new Killeffect$II1Il11l111II11IIl[i];

      for (int j = 0; j < i; j++) {
         int k = this.lI1II1llI1II1l11IIl();
         float f3 = this.II1IlI1II11l111111ll.nextFloat() * (float) (Math.PI * 2);
         float f4 = (float)Math.sqrt((double)this.II1IlI1II11l111111ll.nextFloat()) * 0.83F * f;
         net.minecraft.util.math.Vec3d Vec3dx = Vec3dxxxx.add(Math.cos((double)f3) * (double)f4, 0.0, Math.sin((double)f3) * (double)f4);
         float f5 = (1.6F + this.II1IlI1II11l111111ll.nextFloat() * 1.6F) * f * f1;
         net.minecraft.util.math.Vec3d Vec3dxx = new net.minecraft.util.math.Vec3d(0.0, (double)f5, 0.0);
         float f6 = (0.22F + this.II1IlI1II11l111111ll.nextFloat() * 0.22F) * f;
         net.minecraft.util.math.Vec3d Vec3dxxx = new net.minecraft.util.math.Vec3d(
            (double)(this.II1IlI1II11l111111ll.nextFloat() * (float) (Math.PI * 2)),
            (double)(this.II1IlI1II11l111111ll.nextFloat() * (float) (Math.PI * 2)),
            (double)(this.II1IlI1II11l111111ll.nextFloat() * (float) (Math.PI * 2))
         );
         net.minecraft.util.math.Vec3d Vec3dxxxx = new net.minecraft.util.math.Vec3d(
            (double)((this.II1IlI1II11l111111ll.nextFloat() - 0.5F) * 7.0F),
            (double)((this.II1IlI1II11l111111ll.nextFloat() - 0.5F) * 7.0F),
            (double)((this.II1IlI1II11l111111ll.nextFloat() - 0.5F) * 7.0F)
         );
         float f7 = this.II1IlI1II11l111111ll.nextFloat() * 0.18F * f2;
         alii1l1lll1$ii1il11l111ii11iil[j] = new Killeffect$II1Il11l111II11IIl(Vec3dx, Vec3dxx, Vec3dxxx, Vec3dxxxx, f6, f6, f6, f7, null, k);
      }

      this.lll1llIlIl1IIIIl1l1Illl
         .add(new Killeffect$EventBus(System.currentTimeMillis(), this.II1IlI1II11l111111ll.nextInt(180), 4, alii1l1lll1$ii1il11l111ii11iil, null, 2.0F));
   }

   private void EventTarget(Entity Entity, float f) {
      net.minecraft.util.math.Vec3d Vec3dxxx = Entity.getPos().add(0.0, (double)Entity.getHeight() * 0.5, 0.0);
      int i = Math.max(1, Math.round(this.Il1lII1I1l1IlI1lI.lll1lI1llll1IIllIIIII1lll()));
      Killeffect$II1Il11l111II11IIl[] alii1l1lll1$ii1il11l111ii11iil = new Killeffect$II1Il11l111II11IIl[i];

      for (int j = 0; j < i; j++) {
         int k = this.lI1II1llI1II1l11IIl();
         float f1 = this.II1IlI1II11l111111ll.nextFloat() * (float) (Math.PI * 2);
         float f2 = (this.II1IlI1II11l111111ll.nextFloat() - 0.5F) * 0.85F;
         float f3 = (1.8F + this.II1IlI1II11l111111ll.nextFloat() * 1.4F) * f;
         double d0 = Math.cos((double)f2);
         double d1 = Math.cos((double)f1) * d0 * (double)f3;
         double d2 = Math.sin((double)f2) * (double)f3 * 0.45;
         double d3 = Math.sin((double)f1) * d0 * (double)f3;
         net.minecraft.util.math.Vec3d Vec3dx = new net.minecraft.util.math.Vec3d(d1, d2, d3);
         float f4 = (0.16F + this.II1IlI1II11l111111ll.nextFloat() * 0.18F) * f;
         net.minecraft.util.math.Vec3d Vec3dxx = new net.minecraft.util.math.Vec3d(
            (double)(this.II1IlI1II11l111111ll.nextFloat() * (float) (Math.PI * 2)),
            (double)(this.II1IlI1II11l111111ll.nextFloat() * (float) (Math.PI * 2)),
            (double)(this.II1IlI1II11l111111ll.nextFloat() * (float) (Math.PI * 2))
         );
         net.minecraft.util.math.Vec3d Vec3dxxx = new net.minecraft.util.math.Vec3d(
            (double)((this.II1IlI1II11l111111ll.nextFloat() - 0.5F) * 18.0F),
            (double)((this.II1IlI1II11l111111ll.nextFloat() - 0.5F) * 18.0F),
            (double)((this.II1IlI1II11l111111ll.nextFloat() - 0.5F) * 18.0F)
         );
         alii1l1lll1$ii1il11l111ii11iil[j] = new Killeffect$II1Il11l111II11IIl(Vec3dxxx, Vec3dx, Vec3dxx, Vec3dxxx, f4, f4, f4, f4, null, k);
      }

      this.lll1llIlIl1IIIIl1l1Illl
         .add(new Killeffect$EventBus(System.currentTimeMillis(), this.II1IlI1II11l111111ll.nextInt(180), 3, alii1l1lll1$ii1il11l111ii11iil, null));
   }

   private int lI1II1llI1II1l11IIl() {
      int i = this.Ill1lll1II1I1lII11l1lllIl.getIndex();
      return i >= 4 ? this.II1IlI1II11l111111ll.nextInt(4) : i;
   }

   private Identifier byteHolder(Entity Entity) {
      if (Entity instanceof AbstractClientPlayerEntity AbstractClientPlayerEntity) {
         return AbstractClientPlayerEntity.getSkinTextures().texture();
      } else {
         try {
            if (l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().getRenderer(Entity) instanceof LivingEntityRenderer LivingEntityRenderer) {
               if (LivingEntityRenderer.createRenderState() instanceof LivingEntityRenderState LivingEntityRenderState) {
                  LivingEntityRenderer.updateRenderState((LivingEntity)Entity, LivingEntityRenderState, 1.0F);
                  return LivingEntityRenderer.getTexture(LivingEntityRenderState);
               } else {
                  return null;
               }
            } else {
               return null;
            }
         } catch (Throwable throwable) {
            return null;
         }
      }
   }

   private static Killeffect$EventTarget[] StringHolder_8(float f, float f1, float f2, float f3, float f4) {
      float f5 = 0.015625F;
      return new Killeffect$EventTarget[]{
         new Killeffect$EventTarget((f + f4 + f2) * f5, f1 * f5, (f + f4 + f2 + f2) * f5, (f1 + f4) * f5),
         new Killeffect$EventTarget((f + f4) * f5, f1 * f5, (f + f4 + f2) * f5, (f1 + f4) * f5),
         new Killeffect$EventTarget((f + f4) * f5, (f1 + f4) * f5, (f + f4 + f2) * f5, (f1 + f4 + f3) * f5),
         new Killeffect$EventTarget((f + f4 + f2 + f4) * f5, (f1 + f4) * f5, (f + f4 + f2 + f4 + f2) * f5, (f1 + f4 + f3) * f5),
         new Killeffect$EventTarget(f * f5, (f1 + f4) * f5, (f + f4) * f5, (f1 + f4 + f3) * f5),
         new Killeffect$EventTarget((f + f4 + f2) * f5, (f1 + f4) * f5, (f + f4 + f2 + f4) * f5, (f1 + f4 + f3) * f5)
      };
   }

   private void StringHolder_8(
      Killeffect$EventBus lii1l1lll1$l1i1illlili, float f, float f1, float f2, MatrixStack MatrixStack, net.minecraft.util.math.Vec3d Vec3d
   ) {
      ByteBufferHolder il1iliilli1l1iill = this.ZenithInternal149(lii1l1lll1$l1i1illlili.lIIIlI1111lll11lI);
      if (lii1l1lll1$l1i1illlili.I1llIIll1l111lll11 == 3) {
         this.StringHolder_8(lii1l1lll1$l1i1illlili, f, f1, f2, il1iliilli1l1iill);
      } else if (lii1l1lll1$l1i1illlili.I1llIIll1l111lll11 == 4) {
         this.EventBus(lii1l1lll1$l1i1illlili, f, f1, f2, il1iliilli1l1iill);
      } else {
         float f3 = 1.0F - f;
         float f4 = f3 * f3;
         if (!(f4 <= 0.01F)) {
            boolean flag = lii1l1lll1$l1i1illlili.I1llIIll1l111lll11 == 2;
            boolean flag1 = lii1l1lll1$l1i1illlili.I1llIIll1l111lll11 == 1;
            int i = PatternHolder.EventBus(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII(), f4);
            float f5 = MathHelper.lerp(f, 1.0F, flag ? 0.7F : 0.35F);
            float f6 = 0.0F;
            if (flag) {
               float f7 = MathHelper.clamp((f - 0.4F) / 0.20000002F, 0.0F, 1.0F);
               f6 = f7 * f7 * (3.0F - 2.0F * f7);
            }

            for (Killeffect$II1Il11l111II11IIl lii1l1lll1$ii1il11l111ii11iil : lii1l1lll1$l1i1illlili.IlIIlIIl1I1lIl1l111IIl) {
               double d0 = lii1l1lll1$ii1il11l111ii11iil.l1lII11lII.x + lii1l1lll1$ii1il11l111ii11iil.lI1lllIl1IIIl1l1IlIlIl.x * (double)f1;
               double d1 = lii1l1lll1$ii1il11l111ii11iil.l1lII11lII.y
                  + lii1l1lll1$ii1il11l111ii11iil.lI1lllIl1IIIl1l1IlIlIl.y * (double)f1
                  - (double)(3.25F * f1 * f1);
               double d2 = lii1l1lll1$ii1il11l111ii11iil.l1lII11lII.z + lii1l1lll1$ii1il11l111ii11iil.lI1lllIl1IIIl1l1IlIlIl.z * (double)f1;
               double d3 = lii1l1lll1$ii1il11l111ii11iil.l11IIIlllIlI1l.x
                  + lii1l1lll1$ii1il11l111ii11iil.l1l1lII1lIllI11llll11.x * (double)f1;
               double d4 = lii1l1lll1$ii1il11l111ii11iil.l11IIIlllIlI1l.y
                  + lii1l1lll1$ii1il11l111ii11iil.l1l1lII1lIllI11llll11.y * (double)f1;
               double d5 = lii1l1lll1$ii1il11l111ii11iil.l11IIIlllIlI1l.z
                  + lii1l1lll1$ii1il11l111ii11iil.l1l1lII1lIllI11llll11.z * (double)f1;
               if (flag) {
                  float f8 = MathHelper.lerp(f6, lii1l1lll1$ii1il11l111ii11iil.Ill1IlIll1ll1l1IIII1l1lllll, lii1l1lll1$ii1il11l111ii11iil.I1l11ll1I11);
                  float f9 = MathHelper.lerp(f6, lii1l1lll1$ii1il11l111ii11iil.l111lI1II, lii1l1lll1$ii1il11l111ii11iil.I1l11ll1I11);
                  float f10 = MathHelper.lerp(f6, lii1l1lll1$ii1il11l111ii11iil.lll11lI1llllllIII1I1Il1, lii1l1lll1$ii1il11l111ii11iil.I1l11ll1I11);
                  float f11 = f8 * f5 * 0.5F;
                  float f12 = f9 * f5 * 0.5F;
                  float f13 = f10 * f5 * 0.5F;
                  boolean flag2 = lii1l1lll1$l1i1illlili.IlI1I1lIIlllI1ll != null && lii1l1lll1$ii1il11l111ii11iil.I1lIll11l11I11IIllllI != null;
                  if (flag2 && f6 < 0.999F) {
                     float f14 = (1.0F - f6) * f4;
                     this.StringHolder_8(
                        MatrixStack,
                        lii1l1lll1$l1i1illlili.IlI1I1lIIlllI1ll,
                        Vec3d,
                        d0,
                        d1,
                        d2,
                        f11,
                        f12,
                        f13,
                        d3,
                        d4,
                        d5,
                        lii1l1lll1$ii1il11l111ii11iil.I1lIll11l11I11IIllllI,
                        f14
                     );
                  }

                  float f15;
                  float f19;
                  if (flag2) {
                     f19 = f4 * f6 * 0.9F;
                     f15 = f4 * f6;
                  } else {
                     f19 = f4 * (0.55F + 0.35F * f6);
                     f15 = f4;
                  }

                  if (f19 > 0.01F || f15 > 0.01F) {
                     int j = PatternHolder.EventBus(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII(), f19);
                     int k = PatternHolder.EventBus(il1iliilli1l1iill.StringHolder_24(0.4F).lllIlll1Ill111l111Il11II11lII(), f15);
                     this.StringHolder_8(d0, d1, d2, f11, f12, f13, d3, d4, d5, j, k, f2);
                  }
               } else {
                  float f16 = lii1l1lll1$ii1il11l111ii11iil.Ill1IlIll1ll1l1IIII1l1lllll * f5 * 0.5F;
                  float f17 = lii1l1lll1$ii1il11l111ii11iil.l111lI1II * f5 * 0.5F;
                  float f18 = lii1l1lll1$ii1il11l111ii11iil.lll11lI1llllllIII1I1Il1 * f5 * 0.5F;
                  if (flag1) {
                     this.EventBus(d0, d1, d2, f16, f17, f18, d3, d4, d5, i, f2);
                  } else {
                     this.StringHolder_8(d0, d1, d2, f16, f17, f18, d3, d4, d5, i, f2);
                  }
               }
            }
         }
      }
   }

   private void StringHolder_8(Killeffect$EventBus lii1l1lll1$l1i1illlili, float f, float f1, float f2, ByteBufferHolder il1iliilli1l1iill) {
      double d0 = 1.0 - (double)f;
      d0 *= d0;
      double d1 = (double)(f * (float) (Math.PI * 2)) * 2.5 * (double)this.Il1llII1llII1I11IlIlI1lIIlII.lll1lI1llll1IIllIIIII1lll();
      double d2 = Math.sin(d1);
      double d3 = Math.cos(d1);
      float f3 = f > 0.82F ? (1.0F - f) / 0.18F : 1.0F;
      f3 = MathHelper.clamp(f3, 0.0F, 1.0F);
      if (!(f3 < 0.01F)) {
         int i = PatternHolder.EventBus(il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII(), f3);
         int j = PatternHolder.EventBus(il1iliilli1l1iill.StringHolder_24(0.5F).lllIlll1Ill111l111Il11II11lII(), f3);
         net.minecraft.util.math.Vec3d Vec3d = lii1l1lll1$l1i1illlili.IlIIlIIl1I1lIl1l111IIl[0].l1lII11lII;
         Particles i11liil1i1 = Particles.IIlIIl11llll1;
         float[] afloat = i11liil1i1.l111l11llII1Il11();
         float[] afloat1 = i11liil1i1.II1IllII1l();

         for (Killeffect$II1Il11l111II11IIl lii1l1lll1$ii1il11l111ii11iil : lii1l1lll1$l1i1illlili.IlIIlIIl1I1lIl1l111IIl) {
            double d4 = lii1l1lll1$ii1il11l111ii11iil.lI1lllIl1IIIl1l1IlIlIl.x * d3
               - lii1l1lll1$ii1il11l111ii11iil.lI1lllIl1IIIl1l1IlIlIl.z * d2;
            double d5 = lii1l1lll1$ii1il11l111ii11iil.lI1lllIl1IIIl1l1IlIlIl.x * d2
               + lii1l1lll1$ii1il11l111ii11iil.lI1lllIl1IIIl1l1IlIlIl.z * d3;
            double d6 = lii1l1lll1$ii1il11l111ii11iil.lI1lllIl1IIIl1l1IlIlIl.y;
            double d7 = Vec3d.x + d4 * d0;
            double d9 = Vec3d.y + d6 * d0;
            double d11 = Vec3d.z + d5 * d0;
            double d13 = lii1l1lll1$ii1il11l111ii11iil.l11IIIlllIlI1l.x + lii1l1lll1$ii1il11l111ii11iil.l1l1lII1lIllI11llll11.x * (double)f1;
            double d14 = lii1l1lll1$ii1il11l111ii11iil.l11IIIlllIlI1l.y + lii1l1lll1$ii1il11l111ii11iil.l1l1lII1lIllI11llll11.y * (double)f1;
            double d15 = lii1l1lll1$ii1il11l111ii11iil.l11IIIlllIlI1l.z + lii1l1lll1$ii1il11l111ii11iil.l1l1lII1lIllI11llll11.z * (double)f1;
            float f4 = (float)(0.25 + 0.75 * d0);
            float f5 = lii1l1lll1$ii1il11l111ii11iil.Ill1IlIll1ll1l1IIII1l1lllll * f4 * 0.5F;
            float f6 = lii1l1lll1$ii1il11l111ii11iil.l111lI1II * f4 * 0.5F;
            float f7 = lii1l1lll1$ii1il11l111ii11iil.lll11lI1llllllIII1I1Il1 * f4 * 0.5F;
            int k = lii1l1lll1$ii1il11l111ii11iil.l11Il111lI1111l;
            if (k == 2 && afloat == null) {
               k = 1;
            }

            if (k == 3 && afloat1 == null) {
               k = 0;
            }

            switch (k) {
               case 1:
                  this.EventBus(d7, d9, d11, f5, f6, f7, d13, d14, d15, i, f2);
                  break;
               case 2:
                  this.StringHolder_8(
                     afloat, d7, d9, d11, lii1l1lll1$ii1il11l111ii11iil.Ill1IlIll1ll1l1IIII1l1lllll * f4, (float)d13, (float)d14, (float)d15, i, f2
                  );
                  break;
               case 3:
                  this.StringHolder_8(
                     afloat1, d7, d9, d11, lii1l1lll1$ii1il11l111ii11iil.Ill1IlIll1ll1l1IIII1l1lllll * f4, (float)d13, (float)d14, (float)d15, i, f2
                  );
                  break;
               default:
                  this.StringHolder_8(d7, d9, d11, f5, f6, f7, d13, d14, d15, i, f2);
            }
         }

         float f8 = MathHelper.sin(f * (float) (Math.PI * 2) * 4.0F) * 0.4F + 0.6F;
         float f9 = 0.12F * f8 * (1.0F - f * 0.5F) * this.II1ll1Illl1l1II.lll1lI1llll1IIllIIIII1lll();
         if (f9 > 0.01F) {
            this.StringHolder_8(
               Vec3d.x, Vec3d.y, Vec3d.z, f9, f9, f9, (double)f * 4.0, (double)f * 5.0, (double)f * 3.0, j, f2 * 1.4F
            );
         }

         byte b0 = 18;
         float f10 = (float)(0.55 - 0.45 * (double)f) * this.II1ll1Illl1l1II.lll1lI1llll1IIllIIIII1lll();
         if (f10 > 0.05F) {
            double d16 = (double)(f * (float) (Math.PI * 2)) * 6.0;
            double d17 = Vec3d.x + Math.cos(d16) * (double)f10;
            double d18 = Vec3d.z + Math.sin(d16) * (double)f10;

            for (int l = 1; l <= b0; l++) {
               double d8 = d16 + (double)l / (double)b0 * (float) (Math.PI * 2);
               double d10 = Vec3d.x + Math.cos(d8) * (double)f10;
               double d12 = Vec3d.z + Math.sin(d8) * (double)f10;
               this.StringHolder_8(
                  new net.minecraft.util.math.Vec3d(d17, Vec3d.y, d18), new net.minecraft.util.math.Vec3d(d10, Vec3d.y, d12), j, f2
               );
               d17 = d10;
               d18 = d12;
            }
         }
      }
   }

   private void EventBus(Killeffect$EventBus lii1l1lll1$l1i1illlili, float f, float f1, float f2, ByteBufferHolder il1iliilli1l1iill) {
      float f3 = 1.0F - f;
      float f4 = f3 * f3;
      if (!(f4 <= 0.01F)) {
         Particles i11liil1i1 = Particles.IIlIIl11llll1;
         float[] afloat = i11liil1i1.l111l11llII1Il11();
         float[] afloat1 = i11liil1i1.II1IllII1l();
         int i = il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII();
         int j = PatternHolder.EventBus(i, f4);

         for (Killeffect$II1Il11l111II11IIl lii1l1lll1$ii1il11l111ii11iil : lii1l1lll1$l1i1illlili.IlIIlIIl1I1lIl1l111IIl) {
            float f5 = f1 - lii1l1lll1$ii1il11l111ii11iil.I1l11ll1I11;
            if (!(f5 <= 0.0F)) {
               double d0 = lii1l1lll1$ii1il11l111ii11iil.l1lII11lII.x + lii1l1lll1$ii1il11l111ii11iil.lI1lllIl1IIIl1l1IlIlIl.x * (double)f5;
               double d1 = lii1l1lll1$ii1il11l111ii11iil.l1lII11lII.y + lii1l1lll1$ii1il11l111ii11iil.lI1lllIl1IIIl1l1IlIlIl.y * (double)f5;
               double d2 = lii1l1lll1$ii1il11l111ii11iil.l1lII11lII.z + lii1l1lll1$ii1il11l111ii11iil.lI1lllIl1IIIl1l1IlIlIl.z * (double)f5;
               float f6 = (float)(
                  lii1l1lll1$ii1il11l111ii11iil.l11IIIlllIlI1l.x + lii1l1lll1$ii1il11l111ii11iil.l1l1lII1lIllI11llll11.x * (double)f5
               );
               float f7 = (float)(
                  lii1l1lll1$ii1il11l111ii11iil.l11IIIlllIlI1l.y + lii1l1lll1$ii1il11l111ii11iil.l1l1lII1lIllI11llll11.y * (double)f5
               );
               float f8 = (float)(
                  lii1l1lll1$ii1il11l111ii11iil.l11IIIlllIlI1l.z + lii1l1lll1$ii1il11l111ii11iil.l1l1lII1lIllI11llll11.z * (double)f5
               );
               float f9 = lii1l1lll1$ii1il11l111ii11iil.Ill1IlIll1ll1l1IIII1l1lllll * (1.0F - 0.25F * f);
               int k = lii1l1lll1$ii1il11l111ii11iil.l11Il111lI1111l;
               if (k == 2 && afloat == null) {
                  k = 1;
               }

               if (k == 3 && afloat1 == null) {
                  k = 0;
               }

               switch (k) {
                  case 0:
                     this.StringHolder_8(d0, d1, d2, f9 * 0.5F, f9 * 0.5F, f9 * 0.5F, (double)f6, (double)f7, (double)f8, j, f2);
                     break;
                  case 1:
                     this.EventBus(d0, d1, d2, f9 * 0.5F, f9 * 0.6F, f9 * 0.5F, (double)f6, (double)f7, (double)f8, j, f2);
                     break;
                  case 2:
                     this.StringHolder_8(afloat, d0, d1, d2, f9, f6, f7, f8, j, f2);
                     break;
                  case 3:
                     this.StringHolder_8(afloat1, d0, d1, d2, f9, f6, f7, f8, j, f2);
               }
            }
         }
      }
   }

   private void StringHolder_8(float[] afloat, double d0, double d1, double d2, float f, float f1, float f2, float f3, int i, float f4) {
      if (afloat != null && afloat.length != 0) {
         this.ll1l1lII11ll11III11lIlI.identity().rotateY(f2).rotateX(f1).rotateZ(f3);

         for (byte b0 = 0; b0 < afloat.length; b0 += 6) {
            this.I1I111I1IIl1ll1l1I11lII1IlII.set(afloat[b0] * f, afloat[b0 + 1] * f, afloat[b0 + 2] * f);
            this.lIIIIIlIII.set(afloat[b0 + 3] * f, afloat[b0 + 4] * f, afloat[b0 + 5] * f);
            this.ll1l1lII11ll11III11lIlI.transform(this.I1I111I1IIl1ll1l1I11lII1IlII);
            this.ll1l1lII11ll11III11lIlI.transform(this.lIIIIIlIII);
            this.StringHolder_8(
               new net.minecraft.util.math.Vec3d(
                  d0 + (double)this.I1I111I1IIl1ll1l1I11lII1IlII.x,
                  d1 + (double)this.I1I111I1IIl1ll1l1I11lII1IlII.y,
                  d2 + (double)this.I1I111I1IIl1ll1l1I11lII1IlII.z
               ),
               new net.minecraft.util.math.Vec3d(d0 + (double)this.lIIIIIlIII.x, d1 + (double)this.lIIIIIlIII.y, d2 + (double)this.lIIIIIlIII.z),
               i,
               f4
            );
         }
      }
   }

   private net.minecraft.util.math.Vec3d StringHolder_8(
      double d0, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11
   ) {
      double d12 = d1 * d6 - d2 * d7;
      double d13 = d1 * d7 + d2 * d6;
      double d14 = d0 * d8 + d13 * d9;
      double d15 = -d0 * d9 + d13 * d8;
      double d16 = d14 * d10 - d12 * d11;
      double d17 = d14 * d11 + d12 * d10;
      return new net.minecraft.util.math.Vec3d(d3 + d16, d4 + d17, d5 + d15);
   }

   private void StringHolder_8(double d0, double d1, double d2, float f, float f1, float f2, double d3, double d4, double d5, int i, float f3) {
      double d6 = Math.cos(d3);
      double d7 = Math.sin(d3);
      double d8 = Math.cos(d4);
      double d9 = Math.sin(d4);
      double d10 = Math.cos(d5);
      double d11 = Math.sin(d5);
      net.minecraft.util.math.Vec3d[] aVec3d = new net.minecraft.util.math.Vec3d[8];

      for (int j = 0; j < 8; j++) {
         double d12 = (double)((j & 4) != 0 ? f : -f);
         double d13 = (double)((j & 2) != 0 ? f1 : -f1);
         double d14 = (double)((j & 1) != 0 ? f2 : -f2);
         aVec3d[j] = this.StringHolder_8(d12, d13, d14, d0, d1, d2, d6, d7, d8, d9, d10, d11);
      }

      this.StringHolder_8(aVec3d[0], aVec3d[4], i, f3);
      this.StringHolder_8(aVec3d[4], aVec3d[5], i, f3);
      this.StringHolder_8(aVec3d[5], aVec3d[1], i, f3);
      this.StringHolder_8(aVec3d[1], aVec3d[0], i, f3);
      this.StringHolder_8(aVec3d[2], aVec3d[6], i, f3);
      this.StringHolder_8(aVec3d[6], aVec3d[7], i, f3);
      this.StringHolder_8(aVec3d[7], aVec3d[3], i, f3);
      this.StringHolder_8(aVec3d[3], aVec3d[2], i, f3);
      this.StringHolder_8(aVec3d[0], aVec3d[2], i, f3);
      this.StringHolder_8(aVec3d[4], aVec3d[6], i, f3);
      this.StringHolder_8(aVec3d[5], aVec3d[7], i, f3);
      this.StringHolder_8(aVec3d[1], aVec3d[3], i, f3);
   }

   private void EventBus(double d0, double d1, double d2, float f, float f1, float f2, double d3, double d4, double d5, int i, float f3) {
      double d6 = Math.cos(d3);
      double d7 = Math.sin(d3);
      double d8 = Math.cos(d4);
      double d9 = Math.sin(d4);
      double d10 = Math.cos(d5);
      double d11 = Math.sin(d5);
      net.minecraft.util.math.Vec3d[] aVec3d = new net.minecraft.util.math.Vec3d[]{
         this.StringHolder_8((double)(-f), (double)(-f1), (double)(-f2), d0, d1, d2, d6, d7, d8, d9, d10, d11),
         this.StringHolder_8((double)f, (double)(-f1), (double)(-f2), d0, d1, d2, d6, d7, d8, d9, d10, d11),
         this.StringHolder_8((double)f, (double)(-f1), (double)f2, d0, d1, d2, d6, d7, d8, d9, d10, d11),
         this.StringHolder_8((double)(-f), (double)(-f1), (double)f2, d0, d1, d2, d6, d7, d8, d9, d10, d11),
         this.StringHolder_8(0.0, (double)f1, 0.0, d0, d1, d2, d6, d7, d8, d9, d10, d11)
      };
      this.StringHolder_8(aVec3d[0], aVec3d[1], i, f3);
      this.StringHolder_8(aVec3d[1], aVec3d[2], i, f3);
      this.StringHolder_8(aVec3d[2], aVec3d[3], i, f3);
      this.StringHolder_8(aVec3d[3], aVec3d[0], i, f3);
      this.StringHolder_8(aVec3d[0], aVec3d[4], i, f3);
      this.StringHolder_8(aVec3d[1], aVec3d[4], i, f3);
      this.StringHolder_8(aVec3d[2], aVec3d[4], i, f3);
      this.StringHolder_8(aVec3d[3], aVec3d[4], i, f3);
   }

   private void StringHolder_8(double d0, double d1, double d2, float f, float f1, float f2, double d3, double d4, double d5, int i, int j, float f3) {
      double d6 = Math.cos(d3);
      double d7 = Math.sin(d3);
      double d8 = Math.cos(d4);
      double d9 = Math.sin(d4);
      double d10 = Math.cos(d5);
      double d11 = Math.sin(d5);
      net.minecraft.util.math.Vec3d[] aVec3d = new net.minecraft.util.math.Vec3d[8];

      for (int k = 0; k < 8; k++) {
         double d12 = (double)((k & 4) != 0 ? f : -f);
         double d13 = (double)((k & 2) != 0 ? f1 : -f1);
         double d14 = (double)((k & 1) != 0 ? f2 : -f2);
         aVec3d[k] = this.StringHolder_8(d12, d13, d14, d0, d1, d2, d6, d7, d8, d9, d10, d11);
      }

      ListHolder_2.StringHolder_8(aVec3d[0], aVec3d[4], aVec3d[5], aVec3d[1], i, true);
      ListHolder_2.StringHolder_8(aVec3d[2], aVec3d[3], aVec3d[7], aVec3d[6], i, true);
      ListHolder_2.StringHolder_8(aVec3d[0], aVec3d[2], aVec3d[6], aVec3d[4], i, true);
      ListHolder_2.StringHolder_8(aVec3d[1], aVec3d[5], aVec3d[7], aVec3d[3], i, true);
      ListHolder_2.StringHolder_8(aVec3d[0], aVec3d[1], aVec3d[3], aVec3d[2], i, true);
      ListHolder_2.StringHolder_8(aVec3d[4], aVec3d[6], aVec3d[7], aVec3d[5], i, true);
      this.StringHolder_8(aVec3d[0], aVec3d[4], j, f3);
      this.StringHolder_8(aVec3d[4], aVec3d[5], j, f3);
      this.StringHolder_8(aVec3d[5], aVec3d[1], j, f3);
      this.StringHolder_8(aVec3d[1], aVec3d[0], j, f3);
      this.StringHolder_8(aVec3d[2], aVec3d[6], j, f3);
      this.StringHolder_8(aVec3d[6], aVec3d[7], j, f3);
      this.StringHolder_8(aVec3d[7], aVec3d[3], j, f3);
      this.StringHolder_8(aVec3d[3], aVec3d[2], j, f3);
      this.StringHolder_8(aVec3d[0], aVec3d[2], j, f3);
      this.StringHolder_8(aVec3d[4], aVec3d[6], j, f3);
      this.StringHolder_8(aVec3d[5], aVec3d[7], j, f3);
      this.StringHolder_8(aVec3d[1], aVec3d[3], j, f3);
   }

   private void StringHolder_8(
      MatrixStack MatrixStack,
      Identifier Identifier,
      net.minecraft.util.math.Vec3d Vec3d,
      double d0,
      double d1,
      double d2,
      float f,
      float f1,
      float f2,
      double d3,
      double d4,
      double d5,
      Killeffect$EventTarget[] alii1l1lll1$illi1l1l1,
      float f3
   ) {
      if (!(f3 <= 0.005F)) {
         double d6 = Math.cos(d3);
         double d7 = Math.sin(d3);
         double d8 = Math.cos(d4);
         double d9 = Math.sin(d4);
         double d10 = Math.cos(d5);
         double d11 = Math.sin(d5);
         double d12 = d0 - Vec3d.x;
         double d13 = d1 - Vec3d.y;
         double d14 = d2 - Vec3d.z;
         net.minecraft.util.math.Vec3d[] aVec3d = new net.minecraft.util.math.Vec3d[8];

         for (int i = 0; i < 8; i++) {
            double d15 = (double)((i & 4) != 0 ? f : -f);
            double d16 = (double)((i & 2) != 0 ? f1 : -f1);
            double d17 = (double)((i & 1) != 0 ? f2 : -f2);
            aVec3d[i] = this.StringHolder_8(d15, d16, d17, d12, d13, d14, d6, d7, d8, d9, d10, d11);
         }

         int j = MathHelper.clamp(Math.round(f3 * 255.0F), 0, 255);
         int k = j << 24 | 16777215;
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableCull();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         RenderSystem.setShaderTexture(0, Identifier);
         Matrix4f matrix4f = MatrixStack.peek().getPositionMatrix();
         net.minecraft.client.render.BufferBuilder BufferBuilder = net.minecraft.client.render.Tessellator.getInstance().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
         this.StringHolder_8(BufferBuilder, matrix4f, aVec3d[4], aVec3d[0], aVec3d[1], aVec3d[5], alii1l1lll1$illi1l1l1[0], k);
         this.StringHolder_8(BufferBuilder, matrix4f, aVec3d[2], aVec3d[6], aVec3d[7], aVec3d[3], alii1l1lll1$illi1l1l1[1], k);
         this.StringHolder_8(BufferBuilder, matrix4f, aVec3d[2], aVec3d[6], aVec3d[4], aVec3d[0], alii1l1lll1$illi1l1l1[2], k);
         this.StringHolder_8(BufferBuilder, matrix4f, aVec3d[7], aVec3d[3], aVec3d[1], aVec3d[5], alii1l1lll1$illi1l1l1[3], k);
         this.StringHolder_8(BufferBuilder, matrix4f, aVec3d[2], aVec3d[3], aVec3d[1], aVec3d[0], alii1l1lll1$illi1l1l1[4], k);
         this.StringHolder_8(BufferBuilder, matrix4f, aVec3d[7], aVec3d[6], aVec3d[4], aVec3d[5], alii1l1lll1$illi1l1l1[5], k);
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(BufferBuilder.end());
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      }
   }

   private void StringHolder_8(
      net.minecraft.client.render.BufferBuilder BufferBuilder,
      Matrix4f matrix4f,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      Killeffect$EventTarget lii1l1lll1$illi1l1l1,
      int i
   ) {
      BufferBuilder.vertex(matrix4f, (float)Vec3dxxx.x, (float)Vec3dxxx.y, (float)Vec3dxxx.z)
         .texture(lii1l1lll1$illi1l1l1.lIIl1lIIl11ll1I1lIll1, lii1l1lll1$illi1l1l1.Il1Il11I111)
         .color(i);
      BufferBuilder.vertex(matrix4f, (float)Vec3dxx.x, (float)Vec3dxx.y, (float)Vec3dxx.z)
         .texture(lii1l1lll1$illi1l1l1.I111l11I1IlII1l1lll1llI1I1111, lii1l1lll1$illi1l1l1.Il1Il11I111)
         .color(i);
      BufferBuilder.vertex(matrix4f, (float)Vec3dx.x, (float)Vec3dx.y, (float)Vec3dx.z)
         .texture(lii1l1lll1$illi1l1l1.I111l11I1IlII1l1lll1llI1I1111, lii1l1lll1$illi1l1l1.IIIIl1l11lllIlI11IIlI1IIIII1Il)
         .color(i);
      BufferBuilder.vertex(matrix4f, (float)Vec3d.x, (float)Vec3d.y, (float)Vec3d.z)
         .texture(lii1l1lll1$illi1l1l1.lIIl1lIIl11ll1I1lIll1, lii1l1lll1$illi1l1l1.IIIIl1l11lllIlI11IIlI1IIIII1Il)
         .color(i);
   }

   private void StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, int i, float f) {
      float f1 = 1.0F;
      ListHolder_2.StringHolder_8(Vec3dx, Vec3d, PatternHolder.EventBus(i, 0.05F * f1), f * 5.5F, true);
      ListHolder_2.StringHolder_8(Vec3dx, Vec3d, PatternHolder.EventBus(i, 0.12F + 0.06F * f1), f * 3.5F, true);
      ListHolder_2.StringHolder_8(Vec3dx, Vec3d, PatternHolder.EventBus(i, 0.28F + 0.1F * f1), f * 1.9F, true);
      ListHolder_2.StringHolder_8(Vec3dx, Vec3d, i, f, true);
   }

   private void lII1l1lIl1111l11() {
      if (!this.IlI1IIlII.isEmpty()) {
         long i = System.currentTimeMillis();
         this.IlI1IIlII.values().removeIf(olong -> i - olong > 1500L);
      }
   }

   private boolean StringHolder_4(Entity Entity) {
      return Entity instanceof PlayerEntity && Entity != l11I1I1ll1Illll1I1l1111l1II.player;
   }

   private ByteBufferHolder ZenithInternal149(int i) {
      return this.IIIIll1lllIlll1lllIll11llI1lI.ClearHeadersHandler(0)
         ? ZenithClient.getInstance().NotificationsHolder().getClientColor(i)
         : this.Illl11lll111lII1.l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }
}
