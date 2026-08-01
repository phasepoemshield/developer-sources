package zenith;

import zenith.hud.*;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.BooleanSupplier;

public class TimerUtilHolder {
   private final TimerUtil l11lII1lI1ll1II1IIl = new TimerUtil();
   private final List<ComparableImpl$Helper> l1lIlIIlII11IIlIl1IIl11I = Lists.newCopyOnWriteArrayList();
   private final List<ComparableImpl$Event> Il11l1ll1IIlI1Il1lll1 = Lists.newCopyOnWriteArrayList();
   private int I1lIl1l11Illl1I1I1l111I;
   private int lIIIllIl1lllIIIIllllll;
   private boolean II1I1l11Ill1lll11ll;
   private ZenithInternal013$EventTarget IIIIIIl1lI1I11lIl11l1IlI1ll11l = new EventTargetImpl$Helper(1);

   public TimerUtilHolder() {
      this.IIII1111111II();
   }

   public TimerUtilHolder StringHolder_8(int i, ZenithInternal022 i1ii1liil11ll1) {
      return this.StringHolder_8(i, i1ii1liil11ll1, () -> true, 0);
   }

   public TimerUtilHolder StringHolder_8(int i, ZenithInternal022 i1ii1liil11ll1, BooleanSupplier booleansupplier) {
      return this.StringHolder_8(i, i1ii1liil11ll1, booleansupplier, 0);
   }

   public TimerUtilHolder StringHolder_8(int i, ZenithInternal022 i1ii1liil11ll1, int j) {
      return this.StringHolder_8(i, i1ii1liil11ll1, () -> true, j);
   }

   public TimerUtilHolder StringHolder_8(int i, ZenithInternal022 i1ii1liil11ll1, BooleanSupplier booleansupplier, int j) {
      this.l1lIlIIlII11IIlIl1IIl11I.add(new ComparableImpl$Helper(i, i1ii1liil11ll1, booleansupplier, j));
      Collections.sort(this.l1lIlIIlII11IIlIl1IIl11I);
      return this;
   }

   public TimerUtilHolder EventBus(int i, ZenithInternal022 i1ii1liil11ll1) {
      return this.EventBus(i, i1ii1liil11ll1, () -> true, 0);
   }

   public TimerUtilHolder EventBus(int i, ZenithInternal022 i1ii1liil11ll1, BooleanSupplier booleansupplier) {
      return this.EventBus(i, i1ii1liil11ll1, booleansupplier, 0);
   }

   public TimerUtilHolder EventBus(int i, ZenithInternal022 i1ii1liil11ll1, int j) {
      return this.EventBus(i, i1ii1liil11ll1, () -> true, j);
   }

   public TimerUtilHolder EventBus(int i, ZenithInternal022 i1ii1liil11ll1, BooleanSupplier booleansupplier, int j) {
      this.Il11l1ll1IIlI1Il1lll1.add(new ComparableImpl$Event(i, i1ii1liil11ll1, booleansupplier, j));
      Collections.sort(this.Il11l1ll1IIlI1Il1lll1);
      return this;
   }

   public void l1I1lIIIll1I1Ill11II() {
      this.l11lII1lI1ll1II1IIl.reset();
   }

   public void l1II111ll1() {
      this.I1lIl1l11Illl1I1I1l111I = 0;
      this.lIIIllIl1lllIIIIllllll = 0;
   }

   public TimerUtilHolder IllI1IIIlII11() {
      if (this.floatHolder_8()) {
         this.IIII1111111II();
      }

      return this;
   }

   public TimerUtilHolder IIII1111111II() {
      this.l1lIlIIlII11IIlIl1IIl11I.clear();
      this.Il11l1ll1IIlI1Il1lll1.clear();
      this.l1I1lIIIll1I1Ill11II();
      this.l1II111ll1();
      return this;
   }

   public void Coordinates() {
      if ((!this.l1lIlIIlII11IIlIl1IIl11I.isEmpty() || !this.Il11l1ll1IIlI1Il1lll1.isEmpty()) && !this.II1I1l11Ill1lll11ll) {
         this.l1lIlIIlII11IIlIl1IIl11I
            .forEach(
               i11ll1i1li$l1lll11l1l1 -> {
                  if (this.I1lIl1l11Illl1I1I1l111I < this.l1lIlIIlII11IIlIl1IIl11I.size()) {
                     ComparableImpl$Helper i11ll1i1li$l1lll11l1l = this.l1lIlIIlII11IIlIl1IIl11I.get(this.I1lIl1l11Illl1I1I1l111I);
                     if (i11ll1i1li$l1lll11l1l.isVisible().getAsBoolean()
                        && this.l11lII1lI1ll1II1IIl.hasTimeElapsed((double)i11ll1i1li$l1lll11l1l.IIIllIlIIIll11lll())) {
                        i11ll1i1li$l1lll11l1l.IIlI1IIlllllI1IIl().lll1IlllI1lIIllll();
                        this.I1lIl1l11Illl1I1I1l111I++;
                        this.l1I1lIIIll1I1Ill11II();
                        if (this.IIIIIIl1lI1I11lIl11l1IlI1ll11l.ZenithInternal128(this.I1lIl1l11Illl1I1I1l111I, this.l1lIlIIlII11IIlIl1IIl11I.size())) {
                           this.l1II111ll1();
                           this.IIIIIIl1lI1I11lIl11l1IlI1ll11l.I1llIl1IlIlII();
                        }
                     }
                  }
               }
            );
         this.Il11l1ll1IIlI1Il1lll1.forEach(i11ll1i1li$liil11l111liil1ll1 -> {
            if (this.lIIIllIl1lllIIIIllllll < this.Il11l1ll1IIlI1Il1lll1.size()) {
               ComparableImpl$Event i11ll1i1li$liil11l111liil1ll = this.Il11l1ll1IIlI1Il1lll1.get(this.lIIIllIl1lllIIIIllllll);
               if (i11ll1i1li$liil11l111liil1ll.isVisible().getAsBoolean() && i11ll1i1li$liil11l111liil1ll.I1l1II1II1Ill11IIIl() <= 0) {
                  i11ll1i1li$liil11l111liil1ll.IIlI1IIlllllI1IIl().lll1IlllI1lIIllll();
                  this.lIIIllIl1lllIIIIllllll++;
                  this.l1I1lIIIll1I1Ill11II();
                  if (this.IIIIIIl1lI1I11lIl11l1IlI1ll11l.ZenithInternal128(this.lIIIllIl1lllIIIIllllll, this.Il11l1ll1IIlI1Il1lll1.size())) {
                     this.l1II111ll1();
                     this.IIIIIIl1lI1I11lIl11l1IlI1ll11l.I1llIl1IlIlII();
                  }
               }

               i11ll1i1li$liil11l111liil1ll.l11IIIIII111();
            }
         });
         this.I1lIl1l11Illl1I1I1l111I = Math.min(this.I1lIl1l11Illl1I1I1l111I, this.l1lIlIIlII11IIlIl1IIl11I.size());
         this.lIIIllIl1lllIIIIllllll = Math.min(this.lIIIllIl1lllIIIIllllll, this.Il11l1ll1IIlI1Il1lll1.size());
      }
   }

   public TimerUtilHolder StringHolder_8(ZenithInternal013$EventTarget i11ll1i1li$illi1l1l1) {
      this.IIIIIIl1lI1I11lIl11l1IlI1ll11l = i11ll1i1li$illi1l1l1;
      return this;
   }

   public boolean floatHolder_8() {
      return this.I1lIl1l11Illl1I1I1l111I >= this.l1lIlIIlII11IIlIl1IIl11I.size()
         && this.lIIIllIl1lllIIIIllllll >= this.Il11l1ll1IIlI1Il1lll1.size()
         && !this.II1I1l11Ill1lll11ll
         && this.IIIIIIl1lI1I11lIl11l1IlI1ll11l.floatHolder_8();
   }

   public TimerUtil Il1IllI11IlI11l1II11ll1Il1() {
      return this.l11lII1lI1ll1II1IIl;
   }

   public List<ComparableImpl$Helper> Illl1I111lI1I111I111IllI1ll() {
      return this.l1lIlIIlII11IIlIl1IIl11I;
   }

   public List<ComparableImpl$Event> lllI1l11lI1() {
      return this.Il11l1ll1IIlI1Il1lll1;
   }

   public int lIl11I11I1llIIl11llIlI1Il() {
      return this.I1lIl1l11Illl1I1I1l111I;
   }

   public int IllllII1ll1111IlIIII() {
      return this.lIIIllIl1lllIIIIllllll;
   }

   public boolean IlIlIIIIIlllIl11Ill() {
      return this.II1I1l11Ill1lll11ll;
   }

   public ZenithInternal013$EventTarget l1IllIlllIIIlllI1I11ll() {
      return this.IIIIIIl1lI1I11lIl11l1IlI1ll11l;
   }

   public void StringHolder_15(int i) {
      this.I1lIl1l11Illl1I1I1l111I = i;
   }

   public void StringHolder_22(int i) {
      this.lIIIllIl1lllIIIIllllll = i;
   }

   public void ZenithInternal142(boolean flag) {
      this.II1I1l11Ill1lll11ll = flag;
   }
}
