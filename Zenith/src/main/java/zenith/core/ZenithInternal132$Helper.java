package zenith;

import zenith.hud.*;

import net.minecraft.item.ItemStack;

class Cooldowns$EventTarget {
   final String IIllIlIll1Il;
   final String llI1111ll11I1IlIlI1lllll1l11;
   final ItemStack Il1111l11Il1l1I1I1lII;
   final Cooldowns$EventBus II1lI1III1l1IlI1IlIIII;
   final long Il1lIll11I1I;
   final long l11I11l111l11ll1II1l11Illl1I11;

   private Cooldowns$EventTarget(
      String s, String s1, ItemStack ItemStack, Cooldowns$EventBus lilliiill11llilll1ll1l$l1i1illlili, long i, long j
   ) {
      this.IIllIlIll1Il = s;
      this.llI1111ll11I1IlIlI1lllll1l11 = s1;
      this.Il1111l11Il1l1I1I1lII = ItemStack;
      this.II1lI1III1l1IlI1IlIIII = lilliiill11llilll1ll1l$l1i1illlili;
      this.Il1lIll11I1I = i;
      this.l11I11l111l11ll1II1l11Illl1I11 = j;
   }

   static Cooldowns$EventTarget StringHolder_8(String s, String s1, ItemStack ItemStack, long i, long j) {
      return new Cooldowns$EventTarget(s, s1, ItemStack, Cooldowns$EventBus.l111llII, i, j);
   }

   static Cooldowns$EventTarget EventBus(String s, String s1, ItemStack ItemStack, long i, long j) {
      return new Cooldowns$EventTarget(s, s1, ItemStack, Cooldowns$EventBus.IlII1111lIII11II, i, j);
   }

   float byteHolder(long i) {
      long j = switch (this.II1lI1III1l1IlI1IlIIII) {
         case l111llII -> Math.max(0L, this.Il1lIll11I1I + this.l11I11l111l11ll1II1l11Illl1I11 - i);
         case IlII1111lIII11II -> Math.max(0L, this.Il1lIll11I1I + this.l11I11l111l11ll1II1l11Illl1I11 - System.nanoTime());
      };
      return this.l11I11l111l11ll1II1l11Illl1I11 <= 0L ? 0.0F : (float)j / (float)this.l11I11l111l11ll1II1l11Illl1I11;
   }

   boolean StringHolder_4(long i) {
      return switch (this.II1lI1III1l1IlI1IlIIII) {
         case l111llII -> i >= this.Il1lIll11I1I + this.l11I11l111l11ll1II1l11Illl1I11;
         case IlII1111lIII11II -> System.nanoTime() >= this.Il1lIll11I1I + this.l11I11l111l11ll1II1l11Illl1I11;
      };
   }

   int ZenithInternal128(long i) {
      long j = switch (this.II1lI1III1l1IlI1IlIIII) {
         case l111llII -> Math.max(0L, this.Il1lIll11I1I + this.l11I11l111l11ll1II1l11Illl1I11 - i);
         case IlII1111lIII11II -> Math.max(0L, this.Il1lIll11I1I + this.l11I11l111l11ll1II1l11Illl1I11 - System.nanoTime());
      };
      return this.II1lI1III1l1IlI1IlIIII == Cooldowns$EventBus.l111llII ? (int)(j / 20L) : (int)(j / 1000000000L);
   }
}
