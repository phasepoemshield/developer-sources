package zenith;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.item.Items;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;

@ModuleInfo(
   name = "FireWorkESP",
   category = Category.RENDER,
   description = "Есп на фейерверки"
)
public final class Fireworkesp extends Module {
   public static final Fireworkesp l1lIIlI1lII111lll1IIlll1lIIll = new Fireworkesp();
   private final Map<net.minecraft.util.math.Vec3d, Long> ll1l11l11Il = new ConcurrentHashMap<>();

   private Fireworkesp() {
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_14 ill1i111i1l1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         if (ill1i111i1l1.Autobuy() instanceof FireworkRocketEntity FireworkRocketEntity) {
            this.ll1l11l11Il.put(FireworkRocketEntity.getPos(), System.currentTimeMillis());
         }
      }
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_5 i1iilll1lili11lll11l11li1l) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         long i = System.currentTimeMillis();
         Iterator iterator = this.ll1l11l11Il.entrySet().iterator();

         while (iterator.hasNext()) {
            Entry entry = (Entry)iterator.next();
            long j = i - (Long)entry.getValue();
            if (j > 10000L) {
               iterator.remove();
            } else {
               this.StringHolder_8(i1iilll1lili11lll11l11li1l.HitParticles(), (net.minecraft.util.math.Vec3d)entry.getKey(), j);
            }
         }
      }
   }

   private void StringHolder_8(DrawContextImpl lliii11l1lllil, net.minecraft.util.math.Vec3d Vec3d, long i) {
      if (lliii11l1lllil != null) {
         net.minecraft.util.math.Vec3d Vec3dx = ZenithInternal094.ListHolder_6(Vec3dx);
         if (Vec3dx != null && !(Vec3dx.z <= 0.0) && !(Vec3dx.z >= 1.0)) {
            if (ZenithInternal094.SecureRandomHolder_2(Vec3dx)) {
               SetColorHandler_3 llliili1l1ii11i1lii1 = ZenithClient.getInstance().NotificationsHolder().IllIlIll11lIlI1();
               Font font = Fonts.MEDIUM.getFont(7.0F);
               String s = String.format("%.1fс", (double)i / 1000.0);
               float f = 11.2F;
               float f1 = 2.0F;
               float f2 = font.width(s);
               float f3 = (float)Vec3dx.x;
               float f4 = (float)Vec3dx.y;
               float f5 = f + f1 + f2;
               float f6 = f3 - f5 / 2.0F;
               float f7 = f4 - f / 2.0F;
               float f8 = Entityesp.lIIlIlIII1ll11.getSize();
               this.pushCenteredScale(lliii11l1lllil, f3, f4, f8, f8);
               lliii11l1lllil.StringHolder_8(
                  f6 - f1,
                  f7 - f1,
                  f5 + f1 * 2.0F,
                  f + f1 * 2.0F,
                  floatHolder_5.StringHolder_30(2.0F),
                  llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l()
               );
               float f9 = f7 + (f - f) / 2.0F;
               lliii11l1lllil.lII1I1l1I11111l1llI1();
               lliii11l1lllil.getMatrices().translate(f6, f9, 0.0F);
               lliii11l1lllil.getMatrices().scale(0.7F, 0.7F, 1.0F);
               lliii11l1lllil.StringHolder_8(Items.FIREWORK_ROCKET.getDefaultStack(), 0, 0);
               lliii11l1lllil.IIlII1lII1();
               float f10 = f6 + f + f1;
               float f11 = f4 - font.height() / 2.0F;
               lliii11l1lllil.StringHolder_8(font, s, f10, f11, llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl());
               this.markDirty(lliii11l1lllil);
            }
         }
      }
   }

   private void pushCenteredScale(DrawContextImpl lliii11l1lllil, float f, float f1, float f2, float f3) {
      lliii11l1lllil.lII1I1l1I11111l1llI1();
      lliii11l1lllil.getMatrices().translate(f, f1, 0.0F);
      lliii11l1lllil.getMatrices().scale(f2, f3, 1.0F);
      lliii11l1lllil.getMatrices().translate(-f, -f1, 0.0F);
   }

   // $VF: renamed from: pop (zenith.DrawContextImpl) void
   private void markDirty(DrawContextImpl lliii11l1lllil) {
      lliii11l1lllil.IIlII1lII1();
   }

   @Override
   public void onEnable() {
      super.l11l1lII();
      this.ll1l11l11Il.clear();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      super.l1l1lI111l1II1Illl111l1l1ll1l();
      this.ll1l11l11Il.clear();
   }
}
