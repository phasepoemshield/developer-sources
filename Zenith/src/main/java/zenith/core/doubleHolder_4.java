package zenith;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.RaycastContext.LootTables60;

public class doubleHolder_4 implements ZenithInternal076 {
   private static final double II1IllII1l1I = 0.15;
   private static final int I1Il1IlIl1llIlIl1Il1l1IlllI = 14;
   private static final int IIll111111I1lIIIl1III11l = 14;
   private final Random IIIIl1lI1l1Il1IIllI1I1lllII = new SecureRandom();
   private net.minecraft.util.math.Vec3d l11lI1ll1IIl = net.minecraft.util.math.Vec3d.ZERO;

   public net.minecraft.util.math.Vec3d StringHolder_8(
      net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box, float f, net.minecraft.util.math.Vec3d Vec3d, boolean flag
   ) {
      List list = this.StringHolder_8(Vec3dxx, Box, f, flag);
      List list1 = this.StringHolder_8(list, f);
      net.minecraft.util.math.Vec3d Vec3dx = this.EventBus(Vec3dxx, list1, f, flag);
      if (Vec3dx == null) {
         Vec3dx = this.EventBus(Vec3dxx, list, f, flag);
      }

      if (Vec3dx == null) {
         Vec3dx = this.EventBus(Vec3dxx, list);
      }

      this.StringHolder_19(Vec3dx);
      return (Vec3dx == null ? Box.getCenter() : Vec3dx).add(this.l11lI1ll1IIl);
   }

   public net.minecraft.util.math.Vec3d EventBus(
      net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box, float f, net.minecraft.util.math.Vec3d Vec3d, boolean flag
   ) {
      List list = this.StringHolder_8(Vec3dxx, Box, f, flag);
      List list1 = this.StringHolder_8(list, f);
      net.minecraft.util.math.Vec3d Vec3dx = this.StringHolder_8(Vec3dxx, list1, f, flag);
      if (Vec3dx == null) {
         Vec3dx = this.StringHolder_8(Vec3dxx, list, f, flag);
      }

      if (Vec3dx == null) {
         Vec3dx = this.StringHolder_8(Vec3dxx, list);
      }

      this.StringHolder_19(Vec3dx);
      return (Vec3dx == null ? Box.getCenter() : Vec3dx).add(this.l11lI1ll1IIl);
   }

   public List<net.minecraft.util.math.Vec3d> StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Box Box, float f, boolean flag) {
      double d0 = Box.getLengthX();
      double d1 = Box.getLengthY();
      double d2 = Box.getLengthZ();
      int i = this.ZenithInternal128(d0);
      int j = this.ZenithInternal128(d2);
      int k = Math.max(2, 14);
      double d3 = d1 / (double)(k - 1);
      double d4 = Box.minX;
      double d5 = Box.minY;
      double d6 = Box.minZ;
      double d7 = i <= 1 ? 0.0 : d0 / (double)(i - 1);
      double d8 = j <= 1 ? 0.0 : d2 / (double)(j - 1);
      ArrayList arraylist = new ArrayList(k * i * j);

      for (int l = 0; l < k; l++) {
         double d9 = d5 + (double)l * d3;

         for (int i1 = 0; i1 < i; i1++) {
            double d10 = d4 + (double)i1 * d7;

            for (int j1 = 0; j1 < j; j1++) {
               double d11 = d6 + (double)j1 * d8;
               net.minecraft.util.math.Vec3d Vec3dx = new net.minecraft.util.math.Vec3d(d10, d9, d11);
               if (this.StringHolder_8(Vec3dx, Vec3dx, f, flag)) {
                  arraylist.add(Vec3dx);
               }
            }
         }
      }

      return arraylist;
   }

   public boolean StringHolder_8(LivingEntity LivingEntity, float f, boolean flag) {
      net.minecraft.util.math.Box Box = LivingEntity.getBoundingBox();
      net.minecraft.util.math.Vec3d Vec3d = l11I1I1ll1Illll1I1l1111l1II.player.getEyePos();
      double d0 = Box.getLengthX();
      double d1 = Box.getLengthY();
      double d2 = Box.getLengthZ();
      int i = this.ZenithInternal128(d0);
      int j = this.ZenithInternal128(d2);
      int k = Math.max(2, 14);
      double d3 = d1 / (double)(k - 1);
      double d4 = Box.minX;
      double d5 = Box.minY;
      double d6 = Box.minZ;
      double d7 = i <= 1 ? 0.0 : d0 / (double)(i - 1);
      double d8 = j <= 1 ? 0.0 : d2 / (double)(j - 1);

      for (int l = 0; l < k; l++) {
         double d9 = d5 + (double)l * d3;

         for (int i1 = 0; i1 < i; i1++) {
            double d10 = d4 + (double)i1 * d7;

            for (int j1 = 0; j1 < j; j1++) {
               double d11 = d6 + (double)j1 * d8;
               net.minecraft.util.math.Vec3d Vec3dx = new net.minecraft.util.math.Vec3d(d10, d9, d11);
               if (this.StringHolder_8(Vec3d, Vec3dx, f, flag)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private boolean StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, float f, boolean flag) {
      if (Vec3dx.squaredDistanceTo(Vec3d) > (double)f * (double)f) {
         return false;
      } else if (flag) {
         return true;
      } else {
         RaycastContext RaycastContext = new RaycastContext(
            Vec3dx, Vec3d, LootTables60.COLLIDER, net.minecraft.world.RaycastContext.class_242.NONE, l11I1I1ll1Illll1I1l1111l1II.player
         );
         BlockHitResult BlockHitResult = ZenithInternal088.StringHolder_8(RaycastContext, Aura.ll1II1l1lII11IlII1::StringHolder_8);
         return BlockHitResult.getType() != net.minecraft.util.hit.HitResult.class_240.BLOCK;
      }
   }

   private net.minecraft.util.math.Vec3d StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, List<net.minecraft.util.math.Vec3d> list, float f, boolean flag) {
      if (list != null && !list.isEmpty()) {
         net.minecraft.util.math.Vec3d Vec3dx = this.longHolder_3(list);
         return this.StringHolder_8(Vec3dx, Vec3dx, f, flag)
            ? Vec3dx
            : list.stream()
               .filter(Vec3d -> this.StringHolder_8(Vec3dx, Vec3dxx, f, flag))
               .min(
                  Comparator.comparingDouble(
                     Vec3d -> {
                        floatHolder_9 li11l1lilili1l = ZenithClient.getInstance()
                           .ZenithInternal057()
                           .ll1ll1l11l1lllIIIIl1()
                           .longHolder_6(floatHolder_6.EventImpl_21(Vec3dxxx, Vec3dx));
                        return (double)(Math.abs(li11l1lilili1l.IlI1ll1l11IlllI111lIlIll111llI()) + Math.abs(li11l1lilili1l.I1II1IlI1I1ll1l1I11I1ll1()));
                     }
                  )
               )
               .orElse(null);
      } else {
         return null;
      }
   }

   private net.minecraft.util.math.Vec3d EventBus(net.minecraft.util.math.Vec3d Vec3d, List<net.minecraft.util.math.Vec3d> list, float f, boolean flag) {
      if (list != null && !list.isEmpty()) {
         net.minecraft.util.math.Vec3d Vec3dx = this.longHolder_3(list);
         return this.StringHolder_8(Vec3dx, Vec3dx, f, flag)
            ? Vec3dx
            : list.stream()
               .filter(Vec3d -> this.StringHolder_8(Vec3dx, Vec3dxx, f, flag))
               .min(Comparator.comparingDouble(Vec3d -> Vec3dxxx.squaredDistanceTo(Vec3d)))
               .orElse(null);
      } else {
         return null;
      }
   }

   private List<net.minecraft.util.math.Vec3d> StringHolder_8(List<net.minecraft.util.math.Vec3d> list, float f) {
      if (list != null && !list.isEmpty()) {
         net.minecraft.util.math.Vec3d Vec3dx = l11I1I1ll1Illll1I1l1111l1II.player.getEyePos();
         double d0 = Math.max(0.0, (double)f - 0.3);
         double d1 = d0 * d0;
         ArrayList arraylist = new ArrayList();

         for (net.minecraft.util.math.Vec3d Vec3dx : list) {
            if (Vec3dx.squaredDistanceTo(Vec3dx) < d1) {
               arraylist.add(Vec3dx);
            }
         }

         return arraylist;
      } else {
         return List.of();
      }
   }

   private net.minecraft.util.math.Vec3d longHolder_3(List<net.minecraft.util.math.Vec3d> list) {
      double d0 = 0.0;
      double d1 = 0.0;
      double d2 = 0.0;
      int i = list.size();

      for (net.minecraft.util.math.Vec3d Vec3d : list) {
         d0 += Vec3d.x;
         d1 += Vec3d.y;
         d2 += Vec3d.z;
      }

      return new net.minecraft.util.math.Vec3d(d0 / (double)i, d1 / (double)i, d2 / (double)i);
   }

   private net.minecraft.util.math.Vec3d StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, List<net.minecraft.util.math.Vec3d> list) {
      return list != null && !list.isEmpty()
         ? list.stream()
            .min(
               Comparator.comparingDouble(
                  Vec3d -> {
                     floatHolder_9 li11l1lilili1l = ZenithClient.getInstance()
                        .ZenithInternal057()
                        .ll1ll1l11l1lllIIIIl1()
                        .longHolder_6(floatHolder_6.EventImpl_21(Vec3dxx, Vec3d));
                     return (double)(Math.abs(li11l1lilili1l.IlI1ll1l11IlllI111lIlIll111llI()) + Math.abs(li11l1lilili1l.I1II1IlI1I1ll1l1I11I1ll1()));
                  }
               )
            )
            .orElse(null)
         : null;
   }

   private net.minecraft.util.math.Vec3d EventBus(net.minecraft.util.math.Vec3d Vec3d, List<net.minecraft.util.math.Vec3d> list) {
      return list != null && !list.isEmpty()
         ? list.stream().min(Comparator.comparingDouble(Vec3d -> Vec3dxx.squaredDistanceTo(Vec3d))).orElse(null)
         : null;
   }

   private void StringHolder_19(net.minecraft.util.math.Vec3d Vec3d) {
      this.l11lI1ll1IIl = this.l11lI1ll1IIl
         .add(
            this.IIIIl1lI1l1Il1IIllI1I1lllII.nextGaussian(), this.IIIIl1lI1l1Il1IIllI1I1lllII.nextGaussian(), this.IIIIl1lI1l1Il1IIllI1I1lllII.nextGaussian()
         )
         .multiply(Vec3d);
   }

   private double StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d, floatHolder_6 il1ll111liili1ll11liil) {
      if (il1ll111liili1ll11liil == null) {
         return Double.POSITIVE_INFINITY;
      } else {
         floatHolder_6 il1ll111liili1ll11liil1 = ZenithInternal131.ZenithInternal070(Vec3d.subtract(Vec3dx));
         floatHolder_9 li11l1lilili1l = il1ll111liili1ll11liil.longHolder_6(il1ll111liili1ll11liil1);
         return Math.hypot((double)li11l1lilili1l.IlI1ll1l11IlllI111lIlIll111llI(), (double)li11l1lilili1l.I1II1IlI1I1ll1l1I11I1ll1());
      }
   }

   private int ZenithInternal128(double d0) {
      if (d0 <= 0.0) {
         return 1;
      } else {
         int i = (int)Math.ceil(d0 / 0.15) + 1;
         int j = Math.min(i, 14);
         return Math.max(2, j);
      }
   }

   public Random IIIlIl1l1IlIl() {
      return this.IIIIl1lI1l1Il1IIllI1I1lllII;
   }

   public net.minecraft.util.math.Vec3d l1I1lI1llIlIlI() {
      return this.l11lI1ll1IIl;
   }
}
