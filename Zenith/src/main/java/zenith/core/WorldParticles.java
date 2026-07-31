package zenith;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@ModuleInfo(
   name = "World Particles",
   category = Category.RENDER,
   description = "Ambient частицы и светлячки в мире"
)
public final class WorldParticles extends Module {
   private static final String Il11Il1111lIlIllIlIll1Il = "module.worldParticles.default";
   private static final String I1IIl1llIllIIIlll1 = "module.worldParticles.spaceTest";
   private static final ByteBufferHolder[] I1I1I1llIlIlII1IIlIIl1111I = new ByteBufferHolder[]{
      new ByteBufferHolder(88, 221, 255), new ByteBufferHolder(178, 122, 255), new ByteBufferHolder(255, 132, 205), new ByteBufferHolder(255, 215, 139)
   };
   public static final WorldParticles l1lI1lIlI111llIIllIl1lIIl1 = new WorldParticles();
   private final ModeSetting Il1l11l1111 = new ModeSetting(
      "module.worldParticles.renderMode", "module.worldParticles.renderMode.desc", "module.worldParticles.default", "module.worldParticles.spaceTest"
   );
   private final MultiBooleanSetting IIllI11l11IlIllI1II1I11IIlIl11 = l1IIllI11l111IlI1II11lIl11II();
   private final List<String> IlI1IllIll11llI1IIIIllIlI = new ArrayList<>();
   private final MultiBooleanSetting II1Ill11Il11II1l11I1lIl1111I11 = new MultiBooleanSetting("module.worldParticles.mode", "module.worldParticles.mode.desc");
   private final MultiBooleanSetting$II1Il11l111II11IIl lIll1lII1llII1l1I1II1 = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.II1Ill11Il11II1l11I1lIl1111I11, "module.worldParticles.ambient", true
   );
   private final MultiBooleanSetting$II1Il11l111II11IIl IlIl11llllII1lIlIl1I = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.II1Ill11Il11II1l11I1lIl1111I11, "module.worldParticles.fireflies", true
   );
   private final NumberSetting l1IIlI1lII1l11Il1llI1II = new NumberSetting(
      "module.worldParticles.count",
      380.0F,
      20.0F,
      800.0F,
      20.0F,
      "module.worldParticles.particleCount.desc",
      "x",
      () -> !this.IlIII1lII1Il111IlI11llllIl111() && !this.IlI1IllIll11llI1IIIIllIlI.isEmpty() && this.lIll1lII1llII1l1I1II1.Spider(),
      null
   );
   private final NumberSetting llI1l1IIl1111ll1l11Ill1Il = new NumberSetting(
      "module.worldParticles.size",
      0.8F,
      0.1F,
      6.0F,
      0.1F,
      "module.worldParticles.particleSize.desc",
      "x",
      () -> !this.IlIII1lII1Il111IlI11llllIl111() && !this.IlI1IllIll11llI1IIIIllIlI.isEmpty() && this.lIll1lII1llII1l1I1II1.Spider(),
      null
   );
   private final ModeSetting IIIlII11II11111lIlIl1l11II1lII = new ModeSetting(
      "module.worldParticles.physics",
      "module.worldParticles.physics.desc",
      () -> !this.IlIII1lII1Il111IlI11llllIl111() && !this.IlI1IllIll11llI1IIIIllIlI.isEmpty() && this.lIll1lII1llII1l1I1II1.Spider(),
      "module.particles.drop",
      "module.particles.fly"
   );
   private final NumberSetting llI1ll11I1lIlIIlll1I1lI1111I1 = new NumberSetting(
      "module.worldParticles.speed",
      0.9F,
      0.1F,
      3.0F,
      0.1F,
      "module.worldParticles.particleSpeed.desc",
      "x",
      () -> !this.IlIII1lII1Il111IlI11llllIl111() && !this.IlI1IllIll11llI1IIIIllIlI.isEmpty() && this.lIll1lII1llII1l1I1II1.Spider(),
      null
   );
   private final ModeSetting I11lIlII1I11l1l1Ill1 = new ModeSetting(
      "module.worldParticles.color",
      "module.worldParticles.colorMode.desc",
      () -> this.IlIII1lII1Il111IlI11llllIl111() || !this.IlI1IllIll11llI1IIIIllIlI.isEmpty(),
      "module.particles.sync",
      "module.particles.custom"
   );
   private final ColorSetting IIIlllIlIll1Il111Ill1lI1111l = new ColorSetting(
      "module.worldParticles.customColor",
      "module.worldParticles.customColor.desc",
      ByteBufferHolder.ll1lIllll111I1lIIl1lIl,
      () -> this.I11lIlII1I11l1l1Ill1.ClearHeadersHandler(1)
   );
   private final NumberSetting I11IlI11l1IllI1I1I = new NumberSetting(
      "module.worldParticles.ffCount",
      20.0F,
      5.0F,
      100.0F,
      5.0F,
      "module.worldParticles.fireFlyCount.desc",
      "x",
      () -> !this.IlIII1lII1Il111IlI11llllIl111() && this.IlIl11llllII1lIlIl1I.Spider(),
      null
   );
   private final NumberSetting IIlI1Il1111II1Ill1I = new NumberSetting(
      "module.worldParticles.ffSize",
      0.6F,
      0.1F,
      2.0F,
      0.1F,
      "module.worldParticles.fireFlySize.desc",
      "x",
      () -> !this.IlIII1lII1Il111IlI11llllIl111() && this.IlIl11llllII1lIlIl1I.Spider(),
      null
   );
   private final NumberSetting l111lllI1llI = new NumberSetting(
      "module.worldParticles.ffSpeed",
      1.4F,
      0.1F,
      2.0F,
      0.1F,
      "module.worldParticles.fireFlySpeed.desc",
      "x",
      () -> !this.IlIII1lII1Il111IlI11llllIl111() && this.IlIl11llllII1lIlIl1I.Spider(),
      null
   );
   private final NumberSetting Illl1I1I1lI1IlIl1I = new NumberSetting(
      "module.worldParticles.ffTrail",
      7.5F,
      1.0F,
      15.0F,
      0.5F,
      "module.worldParticles.fireFlyTrailLength.desc",
      "b",
      () -> !this.IlIII1lII1Il111IlI11llllIl111() && this.IlIl11llllII1lIlIl1I.Spider(),
      null
   );
   private final NumberSetting lI11111l111 = new NumberSetting(
      "module.worldParticles.spaceCount", 260.0F, 30.0F, 620.0F, 10.0F, "module.worldParticles.spaceCount.desc", "x", this::IlIII1lII1Il111IlI11llllIl111, null
   );
   private final NumberSetting lIII1II1Il1lll1lIIlII = new NumberSetting(
      "module.worldParticles.spaceSize", 0.72F, 0.1F, 2.8F, 0.05F, "module.worldParticles.spaceSize.desc", "x", this::IlIII1lII1Il111IlI11llllIl111, null
   );
   private final NumberSetting Illl1l11ll = new NumberSetting(
      "module.worldParticles.spaceSpeed", 0.85F, 0.1F, 2.4F, 0.05F, "module.worldParticles.spaceSpeed.desc", "x", this::IlIII1lII1Il111IlI11llllIl111, null
   );
   private final NumberSetting lIlIIllIlIl1I1Illl1II1lI1I = new NumberSetting(
      "module.worldParticles.spaceRange", 52.0F, 16.0F, 86.0F, 2.0F, "module.worldParticles.spaceRange.desc", "b", this::IlIII1lII1Il111IlI11llllIl111, null
   );
   private final NumberSetting lllI1IlIIlI1lIllIlI1IllIII11 = new NumberSetting(
      "module.worldParticles.spaceTrail",
      1.0F,
      0.2F,
      2.4F,
      0.05F,
      "module.worldParticles.spaceTrailLength.desc",
      "x",
      this::IlIII1lII1Il111IlI11llllIl111,
      null
   );
   private final ContainerSetting ll1IlllIlI11I1l1ll = new ContainerSetting(
      "module.worldParticles.ambientCat",
      "module.worldParticles.ambientCategory.desc",
      () -> !this.IlIII1lII1Il111IlI11llllIl111() && !this.IlI1IllIll11llI1IIIIllIlI.isEmpty() && this.lIll1lII1llII1l1I1II1.Spider(),
      this.l1IIlI1lII1l11Il1llI1II,
      this.llI1l1IIl1111ll1l11Ill1Il,
      this.IIIlII11II11111lIlIl1l11II1lII,
      this.llI1ll11I1lIlIIlll1I1lI1111I1
   );
   private final ContainerSetting I1I1llll11llIlI11 = new ContainerSetting(
      "module.worldParticles.ffCat",
      "module.worldParticles.fireFliesCategory.desc",
      () -> !this.IlIII1lII1Il111IlI11llllIl111() && this.IlIl11llllII1lIlIl1I.Spider(),
      this.I11IlI11l1IllI1I1I,
      this.IIlI1Il1111II1Ill1I,
      this.l111lllI1llI,
      this.Illl1I1I1lI1IlIl1I
   );
   private final ContainerSetting llIl111I11 = new ContainerSetting(
      "module.worldParticles.spaceCat",
      "module.worldParticles.spaceCategory.desc",
      this::IlIII1lII1Il111IlI11llllIl111,
      this.lI11111l111,
      this.lIII1II1Il1lll1lIIlII,
      this.Illl1l11ll,
      this.lIlIIllIlIl1I1Illl1II1lI1I,
      this.lllI1IlIIlI1lIllIlI1IllIII11
   );
   private final List<MinecraftClientHolder_2> I111lIll11ll = new ArrayList<>();
   private final List<SetColorHandler> l1IIIll1IlI = new ArrayList<>();
   private final List<StringHolder_7> lI11lIIII11I = new ArrayList<>();

   @Override
   public List<Setting> getSettings() {
      return List.of(
         this.Il1l11l1111,
         this.IIllI11l11IlIllI1II1I11IIlIl11,
         this.II1Ill11Il11II1l11I1lIl1111I11,
         this.ll1IlllIlI11I1l1ll,
         this.I1I1llll11llIlI11,
         this.llIl111I11,
         this.I11lIlII1I11l1l1Ill1,
         this.IIIlllIlIll1Il111Ill1lI1111l
      );
   }

   private WorldParticles() {
      this.IIllI11l11IlIllI1II1I11IIlIl11.StringHolder_8(() -> !this.IlIII1lII1Il111IlI11llllIl111());
      this.II1Ill11Il11II1l11I1lIl1111I11.StringHolder_8(() -> !this.IlIII1lII1Il111IlI11llllIl111());
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
      this.I111lIll11ll.clear();
      this.l1IIIll1IlI.clear();
      this.lI11lIIII11I.clear();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      super.l1l1lI111l1II1Illl111l1l1ll1l();
      this.I111lIll11ll.clear();
      this.l1IIIll1IlI.clear();
      this.lI11lIIII11I.clear();
   }

   @EventTarget
   public void StringHolder_8(EventImpl_2 i1i11liii111lill1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         net.minecraft.util.math.Vec3d Vec3d = l11I1I1ll1Illll1I1l1111l1II.player.getPos();
         if (this.IlIII1lII1Il111IlI11llllIl111()) {
            this.I111lIll11ll.clear();
            this.l1IIIll1IlI.clear();
            this.ZenithInternal042(Vec3d);
         } else {
            this.lI11lIIII11I.clear();
            this.l1I111I1IIIlI();
            if (this.lIll1lII1llII1l1I1II1.Spider()) {
               this.ByteBufferHolder_2(Vec3d);
            } else {
               this.I111lIll11ll.clear();
            }

            if (this.IlIl11llllII1lIlIl1I.Spider()) {
               this.CallableImpl(Vec3d);
            } else {
               this.l1IIIll1IlI.clear();
            }
         }
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl_34 ll1li1l111llllli1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         MinecraftClientHolder_4.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.gameRenderer.getCamera());
         if (this.IlIII1lII1Il111IlI11llllIl111()) {
            if (!this.lI11lIIII11I.isEmpty()) {
               MinecraftClientHolder_4.EventBus(
                  ll1li1l111llllli1.Norender(),
                  this.lI11lIIII11I,
                  ll1li1l111llllli1.Particles(),
                  this.lllI1IlIIlI1lIllIlI1IllIII11.lll1lI1llll1IIllIIIII1lll()
               );
            }
         } else {
            if (!this.I111lIll11ll.isEmpty()) {
               MinecraftClientHolder_4.StringHolder_8(ll1li1l111llllli1.Norender(), ll1li1l111llllli1.Particles(), this.I111lIll11ll);
            }

            if (!this.l1IIIll1IlI.isEmpty()) {
               MinecraftClientHolder_4.StringHolder_8(
                  ll1li1l111llllli1.Norender(), this.l1IIIll1IlI, ll1li1l111llllli1.Particles(), this.Illl1I1I1lI1IlIl1I.lll1lI1llll1IIllIIIII1lll()
               );
            }
         }
      }
   }

   private void ByteBufferHolder_2(net.minecraft.util.math.Vec3d Vec3d) {
      if (this.IlI1IllIll11llI1IIIIllIlI.isEmpty()) {
         this.I111lIll11ll.clear();
      } else {
         int i = (int)this.l1IIlI1lII1l11Il1llI1II.lll1lI1llll1IIllIIIII1lll();
         boolean flag = this.IIIlII11II11111lIlIl1l11II1lII.ClearHeadersHandler(0);
         float f = this.llI1ll11I1lIlIIlll1I1lI1111I1.lll1lI1llll1IIllIIIII1lll();
         this.I111lIll11ll.removeIf(SetColorHandler_2::ll1IlIIll11II11II1111);

         for (MinecraftClientHolder_2 iiii11ll111l1llilll1l1illil11 : this.I111lIll11ll) {
            iiii11ll111l1llilll1l1illil11.StringHolder_8(Vec3d, flag, f);
         }

         while (this.I111lIll11ll.size() < i) {
            this.ConnectThread(Vec3d);
         }
      }
   }

   private void ConnectThread(net.minecraft.util.math.Vec3d Vec3d) {
      ThreadLocalRandom threadlocalrandom = ThreadLocalRandom.current();
      net.minecraft.util.math.Vec3d Vec3dx = new net.minecraft.util.math.Vec3d(
         Vec3dxx.x + threadlocalrandom.nextDouble(-48.0, 48.0),
         Vec3dxx.y + threadlocalrandom.nextDouble(-10.0, 30.0),
         Vec3dxx.z + threadlocalrandom.nextDouble(-48.0, 48.0)
      );
      net.minecraft.util.math.Vec3d Vec3dxx;
      if (this.IIIlII11II11111lIlIl1l11II1lII.ClearHeadersHandler(0)) {
         Vec3dxx = new net.minecraft.util.math.Vec3d(
            threadlocalrandom.nextDouble(-0.002, 0.002), threadlocalrandom.nextDouble(-0.005, -0.001), threadlocalrandom.nextDouble(-0.002, 0.002)
         );
      } else {
         Vec3dxx = new net.minecraft.util.math.Vec3d(
            threadlocalrandom.nextDouble(-0.01, 0.01), threadlocalrandom.nextDouble(-0.01, 0.01), threadlocalrandom.nextDouble(-0.01, 0.01)
         );
      }

      int i = threadlocalrandom.nextInt(500, 1500);
      float f = this.llI1l1IIl1111ll1l11Ill1Il.lll1lI1llll1IIllIIIII1lll();
      ByteBufferHolder il1iliilli1l1iill = this.ZenithInternal149(i * 2);
      String s = this.l11IlI1lI1llIll();
      if (s != null) {
         float f1 = threadlocalrandom.nextFloat(0.0F, 360.0F);
         float f2 = threadlocalrandom.nextBoolean() ? 0.0F : threadlocalrandom.nextFloat(-0.5F, 0.5F);
         this.I111lIll11ll.add(new MinecraftClientHolder_2(Vec3dx, Vec3dxx, i, f, il1iliilli1l1iill, s, f1, f2));
      }
   }

   private void CallableImpl(net.minecraft.util.math.Vec3d Vec3d) {
      int i = (int)this.I11IlI11l1IllI1I1I.lll1lI1llll1IIllIIIII1lll();
      this.l1IIIll1IlI.removeIf(SetColorHandler::ll1IlIIll11II11II1111);

      for (SetColorHandler iliili1lliii1i1il1iilil1lil1li : this.l1IIIll1IlI) {
         iliili1lliii1i1il1iilil1lil1li.ZenithInternal045(Vec3d);
      }

      while (this.l1IIIll1IlI.size() < i) {
         this.hasTimeElapsed(Vec3d);
      }
   }

   private void longHolder_5(net.minecraft.util.math.Vec3d Vec3d) {
      ThreadLocalRandom threadlocalrandom = ThreadLocalRandom.current();
      net.minecraft.util.math.Vec3d Vec3dx = new net.minecraft.util.math.Vec3d(
         Vec3dxx.x + threadlocalrandom.nextDouble(-48.0, 48.0),
         Vec3dxx.y + threadlocalrandom.nextDouble(-10.0, 30.0),
         Vec3dxx.z + threadlocalrandom.nextDouble(-48.0, 48.0)
      );
      float f = this.l111lllI1llI.lll1lI1llll1IIllIIIII1lll();
      net.minecraft.util.math.Vec3d Vec3dxx = new net.minecraft.util.math.Vec3d(
         threadlocalrandom.nextDouble(-0.2, 0.2) * (double)f,
         threadlocalrandom.nextDouble(-0.2, 0.2) * (double)f,
         threadlocalrandom.nextDouble(-0.2, 0.2) * (double)f
      );
      int i = threadlocalrandom.nextInt(200, 400);
      float f1 = this.IIlI1Il1111II1Ill1I.lll1lI1llll1IIllIIIII1lll();
      ByteBufferHolder il1iliilli1l1iill = this.ZenithInternal149(i * 2);
      this.l1IIIll1IlI.add(new SetColorHandler(Vec3dx, Vec3dxx, i, f1, il1iliilli1l1iill));
   }

   private void ZenithInternal042(net.minecraft.util.math.Vec3d Vec3d) {
      int i = (int)this.lI11111l111.lll1lI1llll1IIllIIIII1lll();
      float f = this.Illl1l11ll.lll1lI1llll1IIllIIIII1lll();
      this.lI11lIIII11I.removeIf(SetColorHandler_2::ll1IlIIll11II11II1111);

      while (this.lI11lIIII11I.size() > i) {
         this.lI11lIIII11I.removeLast();
      }

      for (StringHolder_7 i1lil1lliilli1lli1l : this.lI11lIIII11I) {
         i1lil1lliilli1lli1l.EventTarget(Vec3d, f);
      }

      while (this.lI11lIIII11I.size() < i) {
         this.ZenithInternal101(Vec3d);
      }
   }

   private void ZenithInternal101(net.minecraft.util.math.Vec3d Vec3d) {
      ThreadLocalRandom threadlocalrandom = ThreadLocalRandom.current();
      int i = threadlocalrandom.nextInt(720, 1680);
      int j = this.lI11lIIII11I.size() * 43 + threadlocalrandom.nextInt(360);
      StringHolder_7 i1lil1lliilli1lli1l = StringHolder_7.StringHolder_8(
         Vec3d,
         this.lIlIIllIlIl1I1Illl1II1lI1I.lll1lI1llll1IIllIIIII1lll(),
         i,
         this.lIII1II1Il1lll1lIIlII.lll1lI1llll1IIllIIIII1lll(),
         this.RegistryEntryHolder(j)
      );
      this.lI11lIIII11I.add(i1lil1lliilli1lli1l);
   }

   private ByteBufferHolder ZenithInternal149(int i) {
      return this.I11lIlII1I11l1l1Ill1.ClearHeadersHandler(0)
         ? ZenithClient.getInstance().floatHolder_3().getClientColor(i)
         : this.IIIlllIlIll1Il111Ill1lI1111l.l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }

   private ByteBufferHolder RegistryEntryHolder(int i) {
      if (this.I11lIlII1I11l1l1Ill1.ClearHeadersHandler(1)) {
         return this.IIIlllIlIll1Il111Ill1lI1111l.l1IllIl1l1llIlI11I11Il1l1l1lI1();
      } else {
         ByteBufferHolder il1iliilli1l1iill = ZenithClient.getInstance().floatHolder_3().getClientColor(i);
         ByteBufferHolder il1iliilli1l1iill1 = I1I1I1llIlIlII1IIlIIl1111I[Math.floorMod(i / 73, I1I1I1llIlIlII1IIlIIl1111I.length)];
         return il1iliilli1l1iill.StringHolder_8(il1iliilli1l1iill1, 0.55F).StringHolder_24(0.12F);
      }
   }

   private boolean IlIII1lII1Il111IlI11llllIl111() {
      return this.Il1l11l1111.EventImpl_15("module.worldParticles.spaceTest");
   }

   private void l1I111I1IIIlI() {
      this.IlI1IllIll11llI1IIIIllIlI.clear();
      if (this.IIllI11l11IlIllI1II1I11IIlIl11 != null) {
         for (MultiBooleanSetting$II1Il11l111II11IIl l11i1111l1i$ii1il11l111ii11iil : this.IIllI11l11IlIllI1II1I11IIlIl11.Ill1l1IlIll()) {
            if (l11i1111l1i$ii1il11l111ii11iil.Spider()) {
               this.IlI1IllIll11llI1IIIIllIlI.add(l11i1111l1i$ii1il11l111ii11iil.getName());
            }
         }
      }
   }

   private String l11IlI1lI1llIll() {
      return this.IlI1IllIll11llI1IIIIllIlI.isEmpty()
         ? null
         : this.IlI1IllIll11llI1IIIIllIlI.get(ThreadLocalRandom.current().nextInt(this.IlI1IllIll11llI1IIIIllIlI.size()));
   }

   private static MultiBooleanSetting l1IIllI11l111IlI1II11lIl11II() {
      MultiBooleanSetting l11i1111l1i = new MultiBooleanSetting("module.worldParticles.textures", "module.worldParticles.textureSelection.desc");

      for (String s : ZenithInternal063.l111I111IlII1()) {
         new MultiBooleanSetting$II1Il11l111II11IIl(l11i1111l1i, s, s.equals("particle.texture.firefly"));
      }

      return l11i1111l1i;
   }

   public NumberSetting IIII1lIllIIIIlI1l11lllIllI1lIl() {
      return this.Illl1I1I1lI1IlIl1I;
   }
}
