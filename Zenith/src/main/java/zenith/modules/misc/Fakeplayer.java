// Module: FakePlayer
// Category: misc
// Original class: Fakeplayer
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.entity.EntityPose;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.entity.Entity.LootPool29;
import zenith.zov.base.font.Fonts;

@ModuleInfo(
   name = "FakePlayer",
   description = "",
   category = Category.MISC
)
public class Fakeplayer extends Module {
   public static final Fakeplayer lllIl1l1I = new Fakeplayer();
   private final ModeSetting IIlIllII11IIlI1I1IIIlII1 = new ModeSetting("Mode", "FakePlayer mode", "Default", "Teleportation");
   private final BindSetting l11l11II1III1l1IIII1II1I1l1 = new BindSetting("Start/Stop Recording", "emty", -1);
   private final BindSetting I11Ill1lI1lllIllllIll1Il11Il = new BindSetting("Start/Stop Moving", "emty", -1);
   private final NumberSetting lIIII1I1ll11lllII11ll1l11l = new NumberSetting(
      "Min Distance", 1.0F, 0.0F, 20.0F, 0.1F, "b", () -> this.IIlIllII11IIlI1I1IIIlII1.ClearHeadersHandler(1), null
   );
   private final NumberSetting l1l11Illl111l11 = new NumberSetting(
      "Max Distance", 4.0F, 0.0F, 20.0F, 0.1F, "b", () -> this.IIlIllII11IIlI1I1IIIlII1.ClearHeadersHandler(1), null
   );
   private final NumberSetting III1IIIIIl1Il1Illlll = new NumberSetting(
      "Min Yaw", 0.0F, 0.0F, 180.0F, 1.0F, "deg", () -> this.IIlIllII11IIlI1I1IIIlII1.ClearHeadersHandler(1), null
   );
   private final NumberSetting IIlIlllIIIIIlI1 = new NumberSetting(
      "Max Yaw", 30.0F, 0.0F, 180.0F, 1.0F, "deg", () -> this.IIlIllII11IIlI1I1IIIlII1.ClearHeadersHandler(1), null
   );
   private final NumberSetting llIl11II1l = new NumberSetting(
      "Min Pitch", 0.0F, 0.0F, 90.0F, 1.0F, "deg", () -> this.IIlIllII11IIlI1I1IIIlII1.ClearHeadersHandler(1), null
   );
   private final NumberSetting lI1111IlllI1I11llIl = new NumberSetting(
      "Max Pitch", 30.0F, 0.0F, 90.0F, 1.0F, "deg", () -> this.IIlIllII11IIlI1I1IIIlII1.ClearHeadersHandler(1), null
   );
   private final NumberSetting II1I1l1IlIIII1I111I1II = new NumberSetting(
      "Min Idling Ticks", 5.0F, 0.0F, 200.0F, 1.0F, "t", () -> this.IIlIllII11IIlI1I1IIIlII1.ClearHeadersHandler(1), null
   );
   private final NumberSetting l111IIlII1IlI1llII1ll111I1l = new NumberSetting(
      "Max Idling Ticks", 20.0F, 0.0F, 200.0F, 1.0F, "t", () -> this.IIlIllII11IIlI1I1IIIlII1.ClearHeadersHandler(1), null
   );
   private boolean lll1lllI1IlI = false;
   private boolean ll1I1III111ll11II1I1I1I1I1 = false;
   private int l1l1lllII1lII1l1IllI1 = 0;
   private int IlI1l1lllIIIIl1ll11l = 0;
   private int IIlIl1111II1111llIIIl11IlI1l = 0;
   private OtherClientPlayerEntity llIII1I1IIlIlIlllIl11lIll111II;
   private final List<Fakeplayer$II1Il11l111II11IIl> llIlIl11ll1II1llllI1I1111I11l1 = new ArrayList<>();

   private Fakeplayer() {
   }

   @Override
   public void onEnable() {
      if (l11I1I1ll1Illll1I1l1111l1II.world != null) {
         this.llIII1I1IIlIlIlllIl11lIll111II = new OtherClientPlayerEntity(
            l11I1I1ll1Illll1I1l1111l1II.world, new GameProfile(UUID.fromString("66123666-6666-6666-6666-666666666600"), "Fake")
         );
         l11I1I1ll1Illll1I1l1111l1II.world.addEntity(this.llIII1I1IIlIlIlllIl11lIll111II);
         if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
            this.llIII1I1IIlIlIlllIl11lIll111II
               .updateTrackedPositionAndAngles(
                  l11I1I1ll1Illll1I1l1111l1II.player.getX(),
                  l11I1I1ll1Illll1I1l1111l1II.player.getY(),
                  l11I1I1ll1Illll1I1l1111l1II.player.getZ(),
                  l11I1I1ll1Illll1I1l1111l1II.player.getYaw(),
                  l11I1I1ll1Illll1I1l1111l1II.player.getPitch(),
                  0
               );
            this.llIII1I1IIlIlIlllIl11lIll111II.setHeadYaw(l11I1I1ll1Illll1I1l1111l1II.player.getYaw());
         }

         this.lll1lllI1IlI = false;
         this.ll1I1III111ll11II1I1I1I1I1 = false;
         this.l1l1lllII1lII1l1IllI1 = 0;
         this.IlI1l1lllIIIIl1ll11l = 0;
         this.IIlIl1111II1111llIIIl11IlI1l = this.IIlIllII11IIlI1I1IIIlII1.getIndex();
         super.l11l1lII();
      }
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      if (this.llIII1I1IIlIlIlllIl11lIll111II != null) {
         this.llIII1I1IIlIlIlllIl11lIll111II.setRemoved(LootPool29.KILLED);
         this.llIII1I1IIlIlIlllIl11lIll111II.onRemoved();
      }

      this.llIII1I1IIlIlIlllIl11lIll111II = null;
      this.lll1lllI1IlI = false;
      this.ll1I1III111ll11II1I1I1I1I1 = false;
      this.l1l1lllII1lII1l1IllI1 = 0;
      this.IlI1l1lllIIIIl1ll11l = 0;
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }

   @EventTarget
   public void EventBus(KeyEvent i111liliill1iii1iiii1) {
      if (this.IIlIllII11IIlI1I1IIIlII1.ClearHeadersHandler(0)) {
         if (i111liliill1iii1iiii1.StringHolder_5(this.l11l11II1III1l1IIII1II1I1l1.Elytramotion())) {
            this.lll1lllI1IlI = !this.lll1lllI1IlI;
            if (this.lll1lllI1IlI) {
               this.llIlIl11ll1II1llllI1I1111I11l1.clear();
            }
         }

         if (i111liliill1iii1iiii1.StringHolder_5(this.I11Ill1lI1lllIllllIll1Il11Il.Elytramotion())) {
            this.ll1I1III111ll11II1I1I1I1I1 = !this.ll1I1III111ll11II1I1I1I1I1;
         }
      }
   }

   @EventTarget
   public void EventBus(EventImpl_37 llllii1liii1i1ll1liiil) {
      if (this.IIlIllII11IIlI1I1IIIlII1.ClearHeadersHandler(0)) {
         llllii1liii1i1ll1liiil.Predictions()
            .StringHolder_8(
               Fonts.NEW_MEDIUM.getFont(10.0F),
               "Recoding " + this.lll1lllI1IlI + "  " + StringHolder_3.doubleHolder_2(this.l11l11II1III1l1IIII1II1I1l1.Elytramotion()),
               20.0F,
               20.0F,
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl
            );
         llllii1liii1i1ll1liiil.Predictions()
            .StringHolder_8(
               Fonts.NEW_MEDIUM.getFont(10.0F),
               "Moving "
                  + this.ll1I1III111ll11II1I1I1I1I1
                  + "  "
                  + StringHolder_3.doubleHolder_2(this.I11Ill1lI1lllIllllIll1Il11Il.Elytramotion()),
               20.0F,
               35.0F,
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl
            );
      } else {
         llllii1liii1i1ll1liiil.Predictions()
            .StringHolder_8(
               Fonts.NEW_MEDIUM.getFont(10.0F),
               "Teleportation idle: " + this.IlI1l1lllIIIIl1ll11l + "t",
               20.0F,
               20.0F,
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl
            );
      }
   }

   @EventTarget
   public void EventBus(EventImpl_22 l11llilil1) {
      if (this.llIII1I1IIlIlIlllIl11lIll111II != null && l11I1I1ll1Illll1I1l1111l1II.player != null) {
         if (this.IIlIl1111II1111llIIIl11IlI1l != this.IIlIllII11IIlI1I1IIIlII1.getIndex()) {
            this.IIlIl1111II1111llIIIl11IlI1l = this.IIlIllII11IIlI1I1IIIlII1.getIndex();
            this.l1l1lllII1lII1l1IllI1 = 0;
            this.lll1lllI1IlI = false;
            this.ll1I1III111ll11II1I1I1I1I1 = false;
            this.IlI1l1lllIIIIl1ll11l = 0;
         }

         if (this.IIlIllII11IIlI1I1IIIlII1.ClearHeadersHandler(1)) {
            this.llIIll1IIIII1lll111();
         } else if (this.lll1lllI1IlI) {
            this.llIlIl11ll1II1llllI1I1111I11l1
               .add(
                  new Fakeplayer$II1Il11l111II11IIl(
                     l11I1I1ll1Illll1I1l1111l1II.player.getX(),
                     l11I1I1ll1Illll1I1l1111l1II.player.getY(),
                     l11I1I1ll1Illll1I1l1111l1II.player.getZ(),
                     l11I1I1ll1Illll1I1l1111l1II.player.getYaw(),
                     l11I1I1ll1Illll1I1l1111l1II.player.getPitch(),
                     l11I1I1ll1Illll1I1l1111l1II.player.isSwimming(),
                     l11I1I1ll1Illll1I1l1111l1II.player.isSneaking()
                  )
               );
         } else {
            if (this.ll1I1III111ll11II1I1I1I1I1 && !this.llIlIl11ll1II1llllI1I1111I11l1.isEmpty()) {
               this.l1l1lllII1lII1l1IllI1++;
               if (this.l1l1lllII1lII1l1IllI1 >= this.llIlIl11ll1II1llllI1I1111I11l1.size()) {
                  this.l1l1lllII1lII1l1IllI1 = 0;
                  return;
               }

               Fakeplayer$II1Il11l111II11IIl llil1l1lii1illiili1$ii1il11l111ii11iil = this.llIlIl11ll1II1llllI1I1111I11l1
                  .get(this.l1l1lllII1lII1l1IllI1);
               this.llIII1I1IIlIlIlllIl11lIll111II.setYaw(llil1l1lii1illiili1$ii1il11l111ii11iil.l1l1I1l1Illll1l11llIIl11l);
               this.llIII1I1IIlIlIlllIl11lIll111II.setPitch(llil1l1lii1illiili1$ii1il11l111ii11iil.ll1llII1IIII1I1lII11I);
               this.llIII1I1IIlIlIlllIl11lIll111II.setHeadYaw(llil1l1lii1illiili1$ii1il11l111ii11iil.l1l1I1l1Illll1l11llIIl11l);
               this.llIII1I1IIlIlIlllIl11lIll111II.setSwimming(llil1l1lii1illiili1$ii1il11l111ii11iil.IlIllllIII1I1II1lI11I1l11);
               this.llIII1I1IIlIlIlllIl11lIll111II.setSneaking(llil1l1lii1illiili1$ii1il11l111ii11iil.I1III11IIlllIII1);
               this.llIII1I1IIlIlIlllIl11lIll111II
                  .setPose(
                     llil1l1lii1illiili1$ii1il11l111ii11iil.IlIllllIII1I1II1lI11I1l11
                        ? EntityPose.SWIMMING
                        : (llil1l1lii1illiili1$ii1il11l111ii11iil.I1III11IIlllIII1 ? EntityPose.CROUCHING : EntityPose.STANDING)
                  );
               this.llIII1I1IIlIlIlllIl11lIll111II
                  .updateTrackedPosition(
                     llil1l1lii1illiili1$ii1il11l111ii11iil.I111IlIIlI1I1II11,
                     llil1l1lii1illiili1$ii1il11l111ii11iil.lII1l1IIl111IlIl1l11I,
                     llil1l1lii1illiili1$ii1il11l111ii11iil.I1l1l1Illl
                  );
               this.llIII1I1IIlIlIlllIl11lIll111II
                  .updateTrackedPositionAndAngles(
                     llil1l1lii1illiili1$ii1il11l111ii11iil.I111IlIIlI1I1II11,
                     llil1l1lii1illiili1$ii1il11l111ii11iil.lII1l1IIl111IlIl1l11I,
                     llil1l1lii1illiili1$ii1il11l111ii11iil.I1l1l1Illl,
                     llil1l1lii1illiili1$ii1il11l111ii11iil.l1l1I1l1Illll1l11llIIl11l,
                     llil1l1lii1illiili1$ii1il11l111ii11iil.ll1llII1IIII1I1lII11I,
                     3
                  );
            } else {
               this.l1l1lllII1lII1l1IllI1 = 0;
            }
         }
      }
   }

   private void llIIll1IIIII1lll111() {
      if (this.IlI1l1lllIIIIl1ll11l > 0) {
         this.IlI1l1lllIIIIl1ll11l--;
      } else {
         net.minecraft.util.math.Vec3d Vec3dxx = l11I1I1ll1Illll1I1l1111l1II.player.getBoundingBox().getCenter();
         float[] afloat = this.StringHolder_8(this.III1IIIIIl1Il1Illlll, this.IIlIlllIIIIIlI1, 180.0F);
         float[] afloat1 = this.StringHolder_8(this.llIl11II1l, this.lI1111IlllI1I11llIl, 90.0F);
         float f = l11I1I1ll1Illll1I1l1111l1II.player.getYaw();
         float f1 = l11I1I1ll1Illll1I1l1111l1II.player.getPitch();
         float f2 = this.byteHolder_2(afloat[0], afloat[1]);
         float f3 = this.byteHolder_2(afloat1[0], afloat1[1]);
         float f4 = f + f2;
         float f5 = MathHelper.clamp(f1 + f3, -89.0F, 89.0F);
         double d0 = (double)this.StringHolder_8(this.lIIII1I1ll11lllII11ll1l11l, this.l1l11Illl111l11);
         net.minecraft.util.math.Vec3d Vec3dx = this.byteHolder(f4, f5);
         net.minecraft.util.math.Vec3d Vec3dxx = Vec3dxx.add(Vec3dx.multiply(d0));
         this.llIII1I1IIlIlIlllIl11lIll111II.setYaw(f4);
         this.llIII1I1IIlIlIlllIl11lIll111II.setPitch(f5);
         this.llIII1I1IIlIlIlllIl11lIll111II.setHeadYaw(f4);
         this.llIII1I1IIlIlIlllIl11lIll111II.updateTrackedPosition(Vec3dxx.x, Vec3dxx.y, Vec3dxx.z);
         this.llIII1I1IIlIlIlllIl11lIll111II.updateTrackedPositionAndAngles(Vec3dxx.x, Vec3dxx.y, Vec3dxx.z, f4, f5, 3);
         this.IlI1l1lllIIIIl1ll11l = this.EventBus(this.II1I1l1IlIIII1I111I1II, this.l111IIlII1IlI1llII1ll111I1l);
      }
   }

   private float StringHolder_8(NumberSetting illil1lill1llll11, NumberSetting illil1lill1llll111) {
      float f = Math.min(illil1lill1llll11.lll1lI1llll1IIllIIIII1lll(), illil1lill1llll111.lll1lI1llll1IIllIIIII1lll());
      float f1 = Math.max(illil1lill1llll11.lll1lI1llll1IIllIIIII1lll(), illil1lill1llll111.lll1lI1llll1IIllIIIII1lll());
      return f == f1 ? f : (float)ThreadLocalRandom.current().nextDouble((double)f, (double)f1);
   }

   private int EventBus(NumberSetting illil1lill1llll11, NumberSetting illil1lill1llll111) {
      int i = Math.round(Math.min(illil1lill1llll11.lll1lI1llll1IIllIIIII1lll(), illil1lill1llll111.lll1lI1llll1IIllIIIII1lll()));
      int j = Math.round(Math.max(illil1lill1llll11.lll1lI1llll1IIllIIIII1lll(), illil1lill1llll111.lll1lI1llll1IIllIIIII1lll()));
      return i >= j ? i : ThreadLocalRandom.current().nextInt(i, j + 1);
   }

   private float[] StringHolder_8(NumberSetting illil1lill1llll11, NumberSetting illil1lill1llll111, float f) {
      float f1 = Math.max(0.0F, Math.min(Math.abs(illil1lill1llll11.lll1lI1llll1IIllIIIII1lll()), f));
      float f2 = Math.max(0.0F, Math.min(Math.abs(illil1lill1llll111.lll1lI1llll1IIllIIIII1lll()), f));
      return new float[]{Math.min(f1, f2), Math.max(f1, f2)};
   }

   private float byteHolder_2(float f, float f1) {
      if (f1 <= 0.0F) {
         return 0.0F;
      } else {
         float f2;
         if (f1 <= f) {
            f2 = f;
         } else {
            f2 = f + (float)ThreadLocalRandom.current().nextDouble() * (f1 - f);
         }

         return ThreadLocalRandom.current().nextBoolean() ? f2 : -f2;
      }
   }

   private net.minecraft.util.math.Vec3d byteHolder(float f, float f1) {
      float f2 = (float)Math.toRadians((double)f);
      float f3 = (float)Math.toRadians((double)f1);
      double d0 = (double)(-MathHelper.sin(f2) * MathHelper.cos(f3));
      double d1 = (double)(-MathHelper.sin(f3));
      double d2 = (double)(MathHelper.cos(f2) * MathHelper.cos(f3));
      return new net.minecraft.util.math.Vec3d(d0, d1, d2);
   }

   @EventTarget
   public void StringHolder_8(EntityHolder i11l111illlill) {
      if (this.llIII1I1IIlIlIlllIl11lIll111II != null && l11I1I1ll1Illll1I1l1111l1II.player != null) {
         if (i11l111illlill.AutoMine() == ZenithInternal005$Helper.Il1III11llIlIlIl1l1IlI1IIlI
            && this.llIII1I1IIlIlIlllIl11lIll111II.isDead()) {
            this.llIII1I1IIlIlIlllIl11lIll111II.setHealth(20.0F);
            new EntityStatusS2CPacket(this.llIII1I1IIlIlIlllIl11lIll111II, (byte)35).apply(l11I1I1ll1Illll1I1l1111l1II.player.networkHandler);
         }
      }
   }
}
