package zenith;

import java.util.Objects;

public class ModeOption {
   private final ModeSetting l111IllllI1ll1llI1ll;
   private final String I1lIIlllIlI11ll;
   private final String I1II1llllIl1l1I1;

   public ModeOption(ModeSetting liii11li1iliiiii1l1li, String s) {
      this.l111IllllI1ll1llI1ll = liii11li1iliiiii1l1li;
      this.I1lIIlllIlI11ll = s;
      this.I1II1llllIl1l1I1 = "";
      if (liii11li1iliiiii1l1li.lllI11l11l11lIl111lII111.isEmpty()) {
         this.I1lII1lllll11IIlIIl1l11lII();
      }

      liii11li1iliiiii1l1li.lllI11l11l11lIl111lII111.add(this);
   }

   public ModeOption(ModeSetting liii11li1iliiiii1l1li, String s, String s1) {
      this.l111IllllI1ll1llI1ll = liii11li1iliiiii1l1li;
      this.I1lIIlllIlI11ll = s;
      this.I1II1llllIl1l1I1 = s1;
      if (liii11li1iliiiii1l1li.lllI11l11l11lIl111lII111.isEmpty()) {
         this.I1lII1lllll11IIlIIl1l11lII();
      }

      liii11li1iliiiii1l1li.lllI11l11l11lIl111lII111.add(this);
   }

   public String getName() {
      return ZenithClient.getInstance().StringHolder_31().translate(this.I1lIIlllIlI11ll);
   }

   public ModeOption I1lII1lllll11IIlIIl1l11lII() {
      this.l111IllllI1ll1llI1ll.StringHolder_8(this);
      return this;
   }

   public boolean isSelected() {
      return this.l111IllllI1ll1llI1ll.lII1I1l1IlIIl1I() == this;
   }

   @Override
   public String toString() {
      return this.I1lIIlllIlI11ll;
   }

   @Override
   public boolean equals(Object object) {
      if (object == this) {
         return true;
      } else if (object != null && object.getClass() == this.getClass()) {
         ModeOption liii11li1iliiiii1l1li$ii1il11l111ii11iil = (ModeOption)object;
         return Objects.equals(this.l111IllllI1ll1llI1ll, liii11li1iliiiii1l1li$ii1il11l111ii11iil.l111IllllI1ll1llI1ll)
            && Objects.equals(this.I1lIIlllIlI11ll, liii11li1iliiiii1l1li$ii1il11l111ii11iil.I1lIIlllIlI11ll)
            && Objects.equals(this.I1II1llllIl1l1I1, liii11li1iliiiii1l1li$ii1il11l111ii11iil.I1II1llllIl1l1I1);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.l111IllllI1ll1llI1ll, this.I1lIIlllIlI11ll, this.I1II1llllIl1l1I1);
   }

   public ModeSetting llIllllIlI() {
      return this.l111IllllI1ll1llI1ll;
   }

   public String ll1I1IlIIIIII() {
      return this.I1lIIlllIlI11ll;
   }

   public String llllIII11IIl1ll1llI1lII1I() {
      return this.I1II1llllIl1l1I1;
   }
}
