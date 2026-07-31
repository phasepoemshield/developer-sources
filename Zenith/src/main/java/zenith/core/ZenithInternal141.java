package zenith;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

public class ZenithInternal141<T> {
   private int I1ll1llllI1ll = 0;
   private final PriorityBlockingQueue<ModuleHolder$Helper<T>> I1IIII11I1IlI1lIlI1 = new PriorityBlockingQueue<>(
      11, Comparator.comparingInt(lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil -> -lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil.I1l111I11lIII11)
   );

   public void HostnameVerifierImpl(int i) {
      this.I1ll1llllI1ll += i;
   }

   public void tick() {
      this.HostnameVerifierImpl(1);
   }

   public void StringHolder_8(ModuleHolder$Helper<T> lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil) {
      this.I1IIII11I1IlI1lIlI1
         .removeIf(
            lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil -> lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iilxx.I1I1111111I1l1lIll11
                  == lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil.I1I1111111I1l1lIll11
         );
      lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil.Il1l1I1111II1IlllIIl1lIlIll11 = lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil.Il1l1I1111II1IlllIIl1lIlIll11
         + this.I1ll1llllI1ll;
      this.I1IIII11I1IlI1lIlI1.add(lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil);
   }

   public T PatternHolder() {
      ModuleHolder$Helper lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil = this.I1IIII11I1IlI1lIlI1.peek();
      if (lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil == null) {
         return null;
      } else {
         if (net.minecraft.client.MinecraftClient.getInstance().isOnThread()) {
            while (
               lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil != null
                  && (
                     lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil.Il1l1I1111II1IlllIIl1lIlIll11 <= this.I1ll1llllI1ll
                        || !lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil.I1I1111111I1l1lIll11.Spider()
                  )
            ) {
               this.I1IIII11I1IlI1lIlI1.poll();
               lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil = this.I1IIII11I1IlI1lIlI1.peek();
            }
         }

         return lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil != null ? lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil.I1IIlI11I : null;
      }
   }

   public ModuleHolder$Helper<T> ListHolder_4() {
      ModuleHolder$Helper lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil = this.I1IIII11I1IlI1lIlI1.peek();
      if (lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil == null) {
         return null;
      } else {
         if (net.minecraft.client.MinecraftClient.getInstance().isOnThread()) {
            while (
               lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil != null
                  && (
                     lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil.Il1l1I1111II1IlllIIl1lIlIll11 <= this.I1ll1llllI1ll
                        || !lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil.I1I1111111I1l1lIll11.Spider()
                  )
            ) {
               this.I1IIII11I1IlI1lIlI1.poll();
               lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil = this.I1IIII11I1IlI1lIlI1.peek();
            }
         }

         return lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil;
      }
   }
}
