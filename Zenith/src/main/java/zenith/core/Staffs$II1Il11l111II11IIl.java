package zenith;

import zenith.hud.*;

import net.minecraft.text.Text;

public class Staffs$II1Il11l111II11IIl {
   private Text lI1lI11l11llIll1lI1l;
   private String name;
   private boolean l1IIlI1ll1I1l1l1111l1;
   private Staffs$EventTarget llI1Illl111I1II11II11I;

   public Text ll1l1l1I1I() {
      return this.lI1lI11l11llIll1lI1l;
   }

   public String getName() {
      return this.name;
   }

   public boolean llIllIlIIIlIl1I1l1l() {
      return this.l1IIlI1ll1I1l1l1111l1;
   }

   public Staffs$EventTarget l1111IIIII1l() {
      return this.llI1Illl111I1II11II11I;
   }

   public void EventTarget(Text Text) {
      this.lI1lI11l11llIll1lI1l = Text;
   }

   public void setName(String s) {
      this.name = s;
   }

   public void StringHolder(boolean flag) {
      this.l1IIlI1ll1I1l1l1111l1 = flag;
   }

   public void StringHolder_8(Staffs$EventTarget i1l1i1ii1ll1ll1111$illi1l1l1) {
      this.llI1Illl111I1II11II11I = i1l1i1ii1ll1ll1111$illi1l1l1;
   }

   @Override
   public boolean equals(Object object) {
      if (object == this) {
         return true;
      } else if (!(object instanceof Staffs$II1Il11l111II11IIl i1l1i1ii1ll1ll1111$ii1il11l111ii11iil1)) {
         return false;
      } else if (!i1l1i1ii1ll1ll1111$ii1il11l111ii11iil1.EventTarget(this)) {
         return false;
      } else if (this.llIllIlIIIlIl1I1l1l() != i1l1i1ii1ll1ll1111$ii1il11l111ii11iil1.llIllIlIIIlIl1I1l1l()) {
         return false;
      } else {
         Text Textx = this.ll1l1l1I1I();
         Text Textx = i1l1i1ii1ll1ll1111$ii1il11l111ii11iil1.ll1l1l1I1I();
         if (Textx == null ? Textx == null : Textx.equals(Textx)) {
            String s = this.getName();
            String s1 = i1l1i1ii1ll1ll1111$ii1il11l111ii11iil1.getName();
            if (s == null ? s1 == null : s.equals(s1)) {
               Staffs$EventTarget i1l1i1ii1ll1ll1111$illi1l1l1 = this.l1111IIIII1l();
               Staffs$EventTarget i1l1i1ii1ll1ll1111$illi1l1l11 = i1l1i1ii1ll1ll1111$ii1il11l111ii11iil1.l1111IIIII1l();
               return i1l1i1ii1ll1ll1111$illi1l1l1 == null
                  ? i1l1i1ii1ll1ll1111$illi1l1l11 == null
                  : i1l1i1ii1ll1ll1111$illi1l1l1.equals(i1l1i1ii1ll1ll1111$illi1l1l11);
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   protected boolean EventTarget(Object object) {
      return object instanceof Staffs$II1Il11l111II11IIl;
   }

   @Override
   public int hashCode() {
      byte b0 = 59;
      int i = 1;
      i = i * 59 + (this.llIllIlIIIlIl1I1l1l() ? 79 : 97);
      Text Text = this.ll1l1l1I1I();
      i = i * 59 + (Text == null ? 43 : Text.hashCode());
      String s = this.getName();
      i = i * 59 + (s == null ? 43 : s.hashCode());
      Staffs$EventTarget i1l1i1ii1ll1ll1111$illi1l1l1 = this.l1111IIIII1l();
      return i * 59 + (i1l1i1ii1ll1ll1111$illi1l1l1 == null ? 43 : i1l1i1ii1ll1ll1111$illi1l1l1.hashCode());
   }

   @Override
   public String toString() {
      return "StaffComponent.Staff(prefix="
         + this.ll1l1l1I1I()
         + ", name="
         + this.getName()
         + ", isSpec="
         + this.llIllIlIIIlIl1I1l1l()
         + ", status="
         + this.l1111IIIII1l()
         + ")";
   }

   public Staffs$II1Il11l111II11IIl(Text Text, String s, boolean flag, Staffs$EventTarget i1l1i1ii1ll1ll1111$illi1l1l1) {
      this.lI1lI11l11llIll1lI1l = Text;
      this.name = s;
      this.l1IIlI1ll1I1l1l1111l1 = flag;
      this.llI1Illl111I1II11II11I = i1l1i1ii1ll1ll1111$illi1l1l1;
   }
}
