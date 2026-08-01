package zenith;

import net.minecraft.util.Identifier;

final class Killeffect$EventBus {
   final long lI11lIllI1I11lI;
   final int lIIIlI1111lll11lI;
   final int I1llIIll1l111lll11;
   final Killeffect$II1Il11l111II11IIl[] IlIIlIIl1I1lIl1l111IIl;
   final Identifier IlI1I1lIIlllI1ll;
   final float I1IlIlI1lII1II11IlI111;

   Killeffect$EventBus(long i, int j, int k, Killeffect$II1Il11l111II11IIl[] alii1l1lll1$ii1il11l111ii11iil, Identifier Identifier) {
      this(i, j, k, alii1l1lll1$ii1il11l111ii11iil, Identifier, 1.0F);
   }

   Killeffect$EventBus(long i, int j, int k, Killeffect$II1Il11l111II11IIl[] alii1l1lll1$ii1il11l111ii11iil, Identifier Identifier, float f) {
      this.lI11lIllI1I11lI = i;
      this.lIIIlI1111lll11lI = j;
      this.I1llIIll1l111lll11 = k;
      this.IlIIlIIl1I1lIl1l111IIl = alii1l1lll1$ii1il11l111ii11iil;
      this.IlI1I1lIIlllI1ll = Identifier;
      this.I1IlIlI1lII1II11IlI111 = f;
   }
}
