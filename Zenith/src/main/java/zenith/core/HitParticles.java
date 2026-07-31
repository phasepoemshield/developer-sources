package zenith;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

@ModuleInfo(
   name = "Hit Particles",
   category = Category.RENDER,
   description = "Частицы при ударе по Entity"
)
public final class HitParticles extends Module {
   public static final HitParticles I1lIl1I1llI111lllI1l = new HitParticles();
   private final MultiBooleanSetting lI1l1lIIIIl1l1IIIIl1111lIIl = l1IIllI11l111IlI1II11lIl11II();
   private final List<String> I1111I1lIIIl1IIlllI1lII11IIII = new ArrayList<>();
   private final ModeSetting l1I1lI1II11I11l1Il11l11l = new ModeSetting(
      "module.hitParticles.physics", "module.hitParticles.physics.desc", () -> true, "module.hitParticles.spiral", "module.particles.boom"
   );
   private final NumberSetting IlIlIIlIll = new NumberSetting(
      "module.hitParticles.count", 50.0F, 5.0F, 100.0F, 5.0F, "module.hitParticles.count.desc", "x", () -> true, null
   );
   private final NumberSetting IllIIIl1ll = new NumberSetting(
      "module.hitParticles.speed",
      0.9F,
      0.1F,
      3.0F,
      0.1F,
      "module.hitParticles.speed.desc",
      "x",
      () -> !this.l1I1lI1II11I11l1Il11l11l.ClearHeadersHandler(0),
      null
   );
   private final NumberSetting IIlII1l1I1II1llI = new NumberSetting(
      "module.hitParticles.size", 0.2F, 0.1F, 3.0F, 0.05F, "module.hitParticles.size.desc", "x", () -> true, null
   );
   private final NumberSetting II1l111II1I = new NumberSetting(
      "module.hitParticles.lifetime", 20.0F, 10.0F, 200.0F, 10.0F, "module.hitParticles.lifetime.desc", "t", () -> true, null
   );
   private final NumberSetting II1IIllI11lIlII1ll1lI1Il = new NumberSetting(
      "module.hitParticles.spiralCount",
      2.0F,
      1.0F,
      15.0F,
      1.0F,
      "module.hitParticles.spiralCount.desc",
      "x",
      () -> this.l1I1lI1II11I11l1Il11l11l.ClearHeadersHandler(0),
      null
   );
   private final NumberSetting lIIIlIl1Il11111I = new NumberSetting(
      "module.hitParticles.angularSpeed",
      2.0F,
      1.0F,
      15.0F,
      1.0F,
      "module.hitParticles.angularSpeed.desc",
      "x",
      () -> this.l1I1lI1II11I11l1Il11l11l.ClearHeadersHandler(0),
      null
   );
   private final NumberSetting ll1IIl1l1l1II1III11lIl1ll1 = new NumberSetting(
      "module.hitParticles.radiusSpeed",
      3.0F,
      1.0F,
      15.0F,
      1.0F,
      "module.hitParticles.radiusSpeed.desc",
      "x",
      () -> this.l1I1lI1II11I11l1Il11l11l.ClearHeadersHandler(0),
      null
   );
   private final ModeSetting IIll11IlII1ll1ll1II11I = new ModeSetting(
      "module.hitParticles.color",
      "module.hitParticles.colorMode.desc",
      () -> !this.I1111I1lIIIl1IIlllI1lII11IIII.isEmpty(),
      "module.particles.custom",
      "module.particles.sync"
   );
   private final ColorSetting III111lIIlIlll1111lII1 = new ColorSetting(
      "module.hitParticles.customColor",
      "module.hitParticles.customColor.desc",
      ByteBufferHolder.ll1lIllll111I1lIIl1lIl,
      () -> this.IIll11IlII1ll1ll1II11I.ClearHeadersHandler(0)
   );
   private final ContainerSetting l1I11IIlI1111111lIll11I = new ContainerSetting(
      "module.hitParticles.settingsCat",
      "module.hitParticles.settings.desc",
      () -> true,
      this.IlIlIIlIll,
      this.IllIIIl1ll,
      this.IIlII1l1I1II1llI,
      this.II1l111II1I
   );
   private final ContainerSetting Illll1I1I1l11I1l111lIII = new ContainerSetting(
      "module.hitParticles.spiralCat",
      "module.hitParticles.spiral.desc",
      () -> this.l1I1lI1II11I11l1Il11l11l.ClearHeadersHandler(0),
      this.II1IIllI11lIlII1ll1lI1Il,
      this.lIIIlIl1Il11111I,
      this.ll1IIl1l1l1II1III11lIl1ll1
   );
   private final List<MinecraftClientHolder> llI1lI11II1IIlll = new ArrayList<>();

   @Override
   public List<Setting> getSettings() {
      return List.of(
         this.lI1l1lIIIIl1l1IIIIl1111lIIl,
         this.l1I1lI1II11I11l1Il11l11l,
         this.l1I11IIlI1111111lIll11I,
         this.Illll1I1I1l11I1l111lIII,
         this.IIll11IlII1ll1ll1II11I,
         this.III111lIIlIlll1111lII1
      );
   }

   private static MultiBooleanSetting l1IIllI11l111IlI1II11lIl11II() {
      MultiBooleanSetting l11i1111l1i = new MultiBooleanSetting("module.hitParticles.textures", "module.hitParticles.textureSelection.desc");

      for (String s : ZenithInternal063.l111I111IlII1()) {
         new MultiBooleanSetting$II1Il11l111II11IIl(l11i1111l1i, s, s.equals("particle.texture.firefly"));
      }

      return l11i1111l1i;
   }

   private HitParticles() {
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
      this.llI1lI11II1IIlll.clear();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      super.l1l1lI111l1II1Illl111l1l1ll1l();
      this.llI1lI11II1IIlll.clear();
   }

   @EventTarget
   public void EventTarget(EntityHolder i11l111illlill) {
      if (i11l111illlill.AutoMine() == ZenithInternal005$Helper.Il1III11llIlIlIl1l1IlI1IIlI) {
         Entity Entity = i11l111illlill.Autoloot();
         if (Entity instanceof LivingEntity) {
            net.minecraft.util.math.Vec3d Vec3d = Entity.getBoundingBox().getCenter();
            if (this.l1I1lI1II11I11l1Il11l11l.ClearHeadersHandler(0)) {
               this.EventImpl_13(Entity);
            } else {
               this.StringHolder_4(Vec3d);
            }
         }
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl_2 i1i11liii111lill1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         if (!this.llI1lI11II1IIlll.isEmpty()) {
            net.minecraft.util.math.Vec3d Vec3d = l11I1I1ll1Illll1I1l1111l1II.player.getPos();
            int i = this.l1I1lI1II11I11l1Il11l11l.ClearHeadersHandler(0) ? 2 : 1;
            this.llI1lI11II1IIlll.removeIf(SetColorHandler_2::ll1IlIIll11II11II1111);

            for (MinecraftClientHolder i11i11liiil11l : this.llI1lI11II1IIlll) {
               i11i11liiil11l.EventBus(Vec3d, i);
            }
         }
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl_34 ll1li1l111llllli1) {
      if (!this.llI1lI11II1IIlll.isEmpty()) {
         MinecraftClientHolder_4.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.gameRenderer.getCamera());
         MinecraftClientHolder_4.StringHolder_8(ll1li1l111llllli1.Norender(), ll1li1l111llllli1.Particles(), this.llI1lI11II1IIlll);
      }
   }

   private void EventImpl_13(Entity Entity) {
      this.l1I111I1IIIlI();
      ThreadLocalRandom threadlocalrandom = ThreadLocalRandom.current();
      double d0 = Entity.getBoundingBox().getCenter().x;
      double d1 = Entity.getY();
      double d2 = Entity.getBoundingBox().getCenter().z;
      double d3 = (double)Entity.getWidth();
      double d4 = (double)Entity.getHeight();
      int i = (int)this.II1IIllI11lIlII1ll1lI1Il.lll1lI1llll1IIllIIIII1lll();
      int j = (int)this.IlIlIIlIll.lll1lI1llll1IIllIIIII1lll();
      int k = (int)this.II1l111II1I.lll1lI1llll1IIllIIIII1lll();
      float f = this.lIIIlIl1Il11111I.lll1lI1llll1IIllIIIII1lll();
      float f1 = this.ll1IIl1l1l1II1III11lIl1ll1.lll1lI1llll1IIllIIIII1lll();
      int l = 1 + threadlocalrandom.nextInt(Math.min(i, 3));
      int i1 = Math.max(1, j / l);

      for (int j1 = 0; j1 < l; j1++) {
         double d5 = (Math.PI * 2) / (double)l * (double)j1 + threadlocalrandom.nextDouble(-0.5, 0.5);
         double d6 = d3 * threadlocalrandom.nextDouble(0.7, 1.3);
         int k1 = i + threadlocalrandom.nextInt(-1, 2);
         if (k1 < 1) {
            k1 = 1;
         }

         boolean flag = threadlocalrandom.nextBoolean();
         double d7 = threadlocalrandom.nextDouble(0.0, d4 * 0.3);

         for (int l1 = 0; l1 < i1; l1++) {
            double d8 = (double)l1 / (double)i1;
            double d9 = d5 + d8 * (double)k1 * 2.0 * Math.PI * (double)(flag ? 1 : -1);
            double d10 = d6 + threadlocalrandom.nextDouble(-0.1, 0.1);
            double d11 = d0 + Math.cos(d9) * d10;
            double d12 = d1 + d7 + d8 * (d4 - d7) + threadlocalrandom.nextDouble(-0.1, 0.1);
            double d13 = d2 + Math.sin(d9) * d10;
            net.minecraft.util.math.Vec3d Vec3d = new net.minecraft.util.math.Vec3d(d11, d12, d13);
            int i2 = threadlocalrandom.nextInt(k / 2, k);
            float f2 = this.IIlII1l1I1II1llI.lll1lI1llll1IIllIIIII1lll() * threadlocalrandom.nextFloat(0.7F, 1.3F);
            ByteBufferHolder il1iliilli1l1iill = this.ZenithInternal149((j1 * i1 + l1) * 10);
            String s = this.l11IlI1lI1llIll();
            if (s != null) {
               float f3 = threadlocalrandom.nextFloat(0.0F, 360.0F);
               float f4 = threadlocalrandom.nextFloat(-1.5F, 1.5F);
               float f5 = f * threadlocalrandom.nextFloat(0.7F, 1.3F) * (float)(flag ? 1 : -1);
               float f6 = f1 * threadlocalrandom.nextFloat(0.6F, 1.4F);
               MinecraftClientHolder i11i11liiil11l = new MinecraftClientHolder(Vec3d, net.minecraft.util.math.Vec3d.ZERO, i2, f2, il1iliilli1l1iill, s, f3, f4);
               i11i11liiil11l.StringHolder_8(Entity, f5, f6);
               this.llI1lI11II1IIlll.add(i11i11liiil11l);
            }
         }
      }
   }

   private void StringHolder_4(net.minecraft.util.math.Vec3d Vec3d) {
      this.l1I111I1IIIlI();
      ThreadLocalRandom threadlocalrandom = ThreadLocalRandom.current();
      int i = (int)this.IlIlIIlIll.lll1lI1llll1IIllIIIII1lll();
      float f = this.IllIIIl1ll.lll1lI1llll1IIllIIIII1lll();

      for (int j = 0; j < i; j++) {
         double d0 = threadlocalrandom.nextDouble(0.0, Math.PI * 2);
         double d1 = threadlocalrandom.nextDouble(-Math.PI / 6, Math.PI / 3);
         double d2 = Math.cos(d1);
         double d3 = Math.sin(d1);
         net.minecraft.util.math.Vec3d Vec3dx = Vec3dxx.add(
            threadlocalrandom.nextDouble(-0.3, 0.3), threadlocalrandom.nextDouble(0.0, 0.5), threadlocalrandom.nextDouble(-0.3, 0.3)
         );
         net.minecraft.util.math.Vec3d Vec3dxx = new net.minecraft.util.math.Vec3d(
            Math.cos(d0) * d2 * threadlocalrandom.nextDouble(0.033, 0.08) * (double)f,
            d3 * threadlocalrandom.nextDouble(0.053, 0.107) * (double)f,
            Math.sin(d0) * d2 * threadlocalrandom.nextDouble(0.033, 0.08) * (double)f
         );
         int k = (int)this.II1l111II1I.lll1lI1llll1IIllIIIII1lll();
         int l = threadlocalrandom.nextInt(k / 2, k);
         float f1 = this.IIlII1l1I1II1llI.lll1lI1llll1IIllIIIII1lll();
         ByteBufferHolder il1iliilli1l1iill = this.ZenithInternal149(j * 10);
         String s = this.l11IlI1lI1llIll();
         if (s != null) {
            float f2 = threadlocalrandom.nextFloat(0.0F, 360.0F);
            float f3 = threadlocalrandom.nextBoolean() ? 0.0F : threadlocalrandom.nextFloat(-1.0F, 1.0F);
            this.llI1lI11II1IIlll.add(new MinecraftClientHolder(Vec3dx, Vec3dxx, l, f1, il1iliilli1l1iill, s, f2, f3));
         }
      }
   }

   private ByteBufferHolder ZenithInternal149(int i) {
      return this.IIll11IlII1ll1ll1II11I.ClearHeadersHandler(0)
         ? ZenithClient.getInstance().floatHolder_3().getClientColor(i)
         : this.III111lIIlIlll1111lII1.l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }

   private void l1I111I1IIIlI() {
      this.I1111I1lIIIl1IIlllI1lII11IIII.clear();
      if (this.lI1l1lIIIIl1l1IIIIl1111lIIl != null) {
         for (MultiBooleanSetting$II1Il11l111II11IIl l11i1111l1i$ii1il11l111ii11iil : this.lI1l1lIIIIl1l1IIIIl1111lIIl.Ill1l1IlIll()) {
            if (l11i1111l1i$ii1il11l111ii11iil.Spider()) {
               this.I1111I1lIIIl1IIlllI1lII11IIII.add(l11i1111l1i$ii1il11l111ii11iil.getName());
            }
         }
      }
   }

   private String l11IlI1lI1llIll() {
      return this.I1111I1lIIIl1IIlllI1lII11IIII.isEmpty()
         ? null
         : this.I1111I1lIIIl1IIlllI1lII11IIII.get(ThreadLocalRandom.current().nextInt(this.I1111I1lIIIl1IIlllI1lII11IIII.size()));
   }
}
