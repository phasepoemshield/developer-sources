package zenith;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.Entity;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;

@ModuleInfo(
   name = "Totem Particles",
   category = Category.RENDER,
   description = "Частицы при активации тотема"
)
public final class TotemParticles extends Module {
   public static final TotemParticles I1llII1II11I111lIllIlII11I1III = new TotemParticles();
   private final MultiBooleanSetting II1l1IlIlllIII1l1IlIII1I1ll1l = MultiBooleanSetting.StringHolder_8(
      "module.totemParticles.textures", "module.totemParticles.textureSelection.desc", List.of(ZenithInternal063.l111I111IlII1())
   );
   private final List<String> I11l1I1l1I = new ArrayList<>();
   private final NumberSetting llll1Il1lll1l1l1IlI11lI1l1I1I = new NumberSetting(
      "module.totemParticles.count", 50.0F, 10.0F, 200.0F, 10.0F, "module.totemParticles.count.desc", "x", () -> true, null
   );
   private final NumberSetting llIlIl1111Il1IIllll1II1l11lll = new NumberSetting(
      "module.totemParticles.speed", 1.9F, 0.1F, 5.0F, 0.1F, "module.totemParticles.speed.desc", "x", () -> true, null
   );
   private final NumberSetting I1l1I11IlIIl = new NumberSetting(
      "module.totemParticles.size", 0.3F, 0.1F, 3.0F, 0.1F, "module.totemParticles.size.desc", "x", () -> true, null
   );
   private final NumberSetting Illl1lI11Il11lllllIl1IIl111I = new NumberSetting(
      "module.totemParticles.lifetime", 120.0F, 20.0F, 300.0F, 10.0F, "module.totemParticles.lifetime.desc", "t", () -> true, null
   );
   private final NumberSetting IlII11I1III1 = new NumberSetting(
      "module.totemParticles.interval", 1.0F, 1.0F, 10.0F, 1.0F, "module.totemParticles.interval.desc", "t", () -> true, null
   );
   private final ModeSetting lI111Il1l1I1lI1I = new ModeSetting(
      "module.totemParticles.color",
      "module.totemParticles.colorMode.desc",
      () -> true,
      "module.totemParticles.vanilla",
      "module.particles.sync",
      "module.particles.custom"
   );
   private final ColorSetting I1I11ll111llIllIII1I = new ColorSetting(
      "module.totemParticles.customColor",
      "module.totemParticles.customColor.desc",
      ByteBufferHolder.ll1lIllll111I1lIIl1lIl,
      () -> this.lI111Il1l1I1lI1I.ClearHeadersHandler(2)
   );
   private final ContainerSetting Ill1I11IIIlI1111lIll = new ContainerSetting(
      "module.totemParticles.settingsCat",
      "module.totemParticles.settings.desc",
      () -> true,
      this.llll1Il1lll1l1l1IlI11lI1l1I1I,
      this.llIlIl1111Il1IIllll1II1l11lll,
      this.I1l1I11IlIIl,
      this.Illl1lI11Il11lllllIl1IIl111I,
      this.IlII11I1III1,
      this.lI111Il1l1I1lI1I,
      this.I1I11ll111llIllIII1I
   );
   private final List<Vec3dHolder> ll1IIIl1I1II = new ArrayList<>();
   private final List<TotemParticles$II1Il11l111II11IIl> l1IIII11lII1lI1l1II111lIl1 = new ArrayList<>();

   @Override
   public List<Setting> getSettings() {
      return List.of(this.II1l1IlIlllIII1l1IlIII1I1ll1l, this.Ill1I11IIIlI1111lIll);
   }

   private TotemParticles() {
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
      this.ll1IIIl1I1II.clear();
      this.l1IIII11lII1lI1l1II111lIl1.clear();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      super.l1l1lI111l1II1Illl111l1l1ll1l();
      this.ll1IIIl1I1II.clear();
      this.l1IIII11lII1lI1l1II111lIl1.clear();
   }

   @EventTarget
   public void StringHolder_8(EventImpl_4 i1ii11ilil1il1ii) {
      EntityStatusS2CPacket EntityStatusS2CPacket = i1ii11ilil1il1ii.Carrotfarm();
      if (EntityStatusS2CPacket.getStatus() == 35) {
         Entity Entity = EntityStatusS2CPacket.getEntity(l11I1I1ll1Illll1I1l1111l1II.world);
         if (Entity != null) {
            this.FinishThread(Entity);
         }
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl_2 i1i11liii111lill1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         net.minecraft.util.math.Vec3d Vec3d = l11I1I1ll1Illll1I1l1111l1II.player.getPos();
         this.Il1II111I1I11lI();
         this.ll1IIIl1I1II.removeIf(Vec3dHolder::ll1IlIIll11II11II1111);

         for (Vec3dHolder il1111iil1i1lll1i11ili : this.ll1IIIl1I1II) {
            double d0 = il1111iil1i1lll1i11ili.Cameratweaks().distanceTo(Vec3d);
            if (d0 > 64.0) {
               il1111iil1i1lll1i11ili.ZenithInternal031(il1111iil1i1lll1i11ili.IlII1I1llIllIl1IIl());
            } else {
               il1111iil1i1lll1i11ili.Coordinates();
            }
         }
      }
   }

   @EventTarget
   public void StringHolder_8(EventImpl_34 ll1li1l111llllli1) {
      if (!this.ll1IIIl1I1II.isEmpty()) {
         MinecraftClientHolder_4.StringHolder_8(l11I1I1ll1Illll1I1l1111l1II.gameRenderer.getCamera());
         MinecraftClientHolder_4.StringHolder_8(ll1li1l111llllli1.Norender(), ll1li1l111llllli1.Particles(), this.ll1IIIl1I1II);
      }
   }

   private void FinishThread(Entity Entity) {
      int i = (int)this.llll1Il1lll1l1l1IlI11lI1l1I1I.lll1lI1llll1IIllIIIII1lll();
      int j = (int)this.IlII11I1III1.lll1lI1llll1IIllIIIII1lll();

      for (int k = 0; k < i; k++) {
         this.l1IIII11lII1lI1l1II111lIl1.add(new TotemParticles$II1Il11l111II11IIl(Entity, 1, k * j));
      }
   }

   private void Il1II111I1I11lI() {
      this.l1I111I1IIIlI();
      this.l1IIII11lII1lI1l1II111lIl1.removeIf(iillll1i1i$ii1il11l111ii11iil -> {
         if (iillll1i1i$ii1il11l111ii11iil.lIlI1IIIIlIIIlIIlIl >= iillll1i1i$ii1il11l111ii11iil.lI1llllIl1I11IlI1I) {
            net.minecraft.util.math.Vec3d Vec3d = iillll1i1i$ii1il11l111ii11iil.Cameratweaks();
            if (Vec3d != null) {
               this.StringHolder_8(Vec3d, iillll1i1i$ii1il11l111ii11iil.I1lI1I1Il);
            }

            return true;
         } else {
            iillll1i1i$ii1il11l111ii11iil.lIlI1IIIIlIIIlIIlIl++;
            return false;
         }
      });
   }

   private void StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, int i) {
      ThreadLocalRandom threadlocalrandom = ThreadLocalRandom.current();
      float f = this.llIlIl1111Il1IIllll1II1l11lll.lll1lI1llll1IIllIIIII1lll();
      int j = (int)this.Illl1lI11Il11lllllIl1IIl111I.lll1lI1llll1IIllIIIII1lll();

      for (int k = 0; k < i; k++) {
         double d0 = threadlocalrandom.nextDouble(0.0, Math.PI * 2);
         double d1 = threadlocalrandom.nextDouble(Math.PI / 6, Math.PI / 3);
         double d2 = threadlocalrandom.nextDouble(0.015, 0.035) * (double)f;
         double d3 = Math.sin(d1) * d2;
         net.minecraft.util.math.Vec3d Vec3dx = new net.minecraft.util.math.Vec3d(Math.cos(d0) * d3, -Math.abs(Math.cos(d1) * d2 / 4.0), Math.sin(d0) * d3);
         float f1 = this.I1l1I11IlIIl.lll1lI1llll1IIllIIIII1lll() * threadlocalrandom.nextFloat(0.8F, 1.2F);
         ByteBufferHolder il1iliilli1l1iill = this.ZenithInternal016(k);
         String s = this.l11IlI1lI1llIll();
         if (s != null) {
            float f2 = threadlocalrandom.nextFloat(0.0F, 360.0F);
            this.ll1IIIl1I1II.add(new Vec3dHolder(Vec3dx, Vec3dx, j, f1, il1iliilli1l1iill, s, f2, 0.0F));
         }
      }
   }

   private ByteBufferHolder ZenithInternal016(int i) {
      if (this.lI111Il1l1I1lI1I.ClearHeadersHandler(2)) {
         return this.I1I11ll111llIllIII1I.l1IllIl1l1llIlI11I11Il1l1l1lI1();
      } else if (this.lI111Il1l1I1lI1I.ClearHeadersHandler(1)) {
         return ZenithClient.getInstance().floatHolder_3().getClientColor(i * 10);
      } else {
         int j = ThreadLocalRandom.current().nextInt(60, 120);
         return ByteBufferHolder.ConnectThread((float)j / 360.0F, 0.9F, 1.0F);
      }
   }

   private void l1I111I1IIIlI() {
      this.I11l1I1l1I.clear();
      if (this.II1l1IlIlllIII1l1IlIII1I1ll1l != null) {
         for (MultiBooleanSetting$II1Il11l111II11IIl l11i1111l1i$ii1il11l111ii11iil : this.II1l1IlIlllIII1l1IlIII1I1ll1l.Ill1l1IlIll()) {
            if (l11i1111l1i$ii1il11l111ii11iil.Spider()) {
               this.I11l1I1l1I.add(l11i1111l1i$ii1il11l111ii11iil.getName());
            }
         }
      }
   }

   private String l11IlI1lI1llIll() {
      return this.I11l1I1l1I.isEmpty() ? null : this.I11l1I1l1I.get(ThreadLocalRandom.current().nextInt(this.I11l1I1l1I.size()));
   }
}
