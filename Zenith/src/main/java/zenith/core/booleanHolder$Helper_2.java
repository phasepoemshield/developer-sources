package zenith;

import java.util.HashSet;
import java.util.Set;
import net.minecraft.util.math.BlockPos;

class Basefinder$II1Il11l111II11IIl {
   protected final Basefinder$Event I1IlIl1lII1I;
   protected final Set<BlockPos> lIIIl111II11IlI111111llll1l1I = new HashSet<>();
   // $VF: renamed from: x int
   protected int field_252;
   // $VF: renamed from: y int
   protected int field_253;
   // $VF: renamed from: z int
   protected int field_254;
   protected boolean finished;

   private Basefinder$II1Il11l111II11IIl(Basefinder$Event l1ii1iilii1i11lill1lll$liil11l111liil1ll) {
      this.I1IlIl1lII1I = l1ii1iilii1i11lill1lll$liil11l111liil1ll;
      this.field_252 = l1ii1iilii1i11lill1lll$liil11l111liil1ll.IlIlI111Il111I11IIIlI1l11I;
      this.field_253 = l1ii1iilii1i11lill1lll$liil11l111liil1ll.Ill1I1I111IIlI;
      this.field_254 = l1ii1iilii1i11lill1lll$liil11l111liil1ll.III1Il1Il1;
   }

   protected void IlIlIl11IlI1l11llI1lII11I1I1() {
      if (!this.finished) {
         if (++this.field_254 > this.I1IlIl1lII1I.lIll1IIlI1IIIlI) {
            this.field_254 = this.I1IlIl1lII1I.III1Il1Il1;
            if (++this.field_253 > this.I1IlIl1lII1I.Illl11llI1I1Il1l) {
               this.field_253 = this.I1IlIl1lII1I.Ill1I1I111IIlI;
               if (++this.field_252 > this.I1IlIl1lII1I.ll1l111I1l111Ill1IIllIl111l11I) {
                  this.finished = true;
               }
            }
         }
      }
   }
}
