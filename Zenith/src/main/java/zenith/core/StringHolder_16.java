package zenith;

public class StringHolder_16 {
   private final String I1lI11llII1IIIllIIIl1I;
   private String l1l11Il11I1l1I1I1l1l11II = "";
   private String IlIlIl11lllI11lI1Ill1lIllI = "";
   private final String[] ll1llllllI11ll1IlIl1III = new String[9];
   private final String[] ll11lII1 = new String[9];
   private int l111ll1I11ll1ll1IlIllI = 0;

   public StringHolder_16(String s) {
      this.I1lI11llII1IIIllIIIl1I = s == null ? "" : s;

      for (int i = 0; i < 9; i++) {
         this.ll1llllllI11ll1IlIl1III[i] = "";
         this.ll11lII1[i] = "";
      }
   }

   public static StringHolder_16 Il1l1I11l111Ill1lI11ll1() {
      return new StringHolder_16("");
   }

   public boolean l1IllIIlIIl11l1I1IlI1IIl11Il1l() {
      return this.I1lI11llII1IIIllIIIl1I.isBlank();
   }

   public String I1llI111I1IlIIlIlIII1lI1() {
      return this.I1lI11llII1IIIllIIIl1I;
   }

   public String Ill1I1IIl1l1lIIIlll11I1I1lll1() {
      return this.l1l11Il11I1l1I1I1l1l11II;
   }

   public String l1II1ll1II1() {
      return this.IlIlIl11lllI11lI1Ill1lIllI;
   }

   public int I1II1I1llIl11() {
      return this.l111ll1I11ll1ll1IlIllI;
   }

   public String GetSocketHandler(int i) {
      return this.ll1llllllI11ll1IlIl1III[i];
   }

   public String ZenithInternal142(int i) {
      return this.ll11lII1[i];
   }

   public boolean IIlII1llIllllI1lI() {
      if (this.l1l11Il11I1l1I1I1l1l11II != null && !this.l1l11Il11I1l1I1I1l1l11II.isBlank()) {
         int i = 0;

         for (int j = 0; j < 9; j++) {
            if (this.ll1llllllI11ll1IlIl1III[j] != null && !this.ll1llllllI11ll1IlIl1III[j].isBlank()) {
               i++;
            }
         }

         return i >= 2;
      } else {
         return false;
      }
   }

   public void StringHolder_8(String s, String s1, String[] astring, String[] astring1, int i) {
      this.l1l11Il11I1l1I1I1l1l11II = s == null ? "" : s;
      this.IlIlIl11lllI11lI1Ill1lIllI = s1 == null ? "" : s1;
      this.l111ll1I11ll1ll1IlIllI = Math.max(0, i);

      for (int j = 0; j < 9; j++) {
         this.ll1llllllI11ll1IlIl1III[j] = astring != null && j < astring.length && astring[j] != null ? astring[j] : "";
         this.ll11lII1[j] = astring1 != null && j < astring1.length && astring1[j] != null ? astring1[j] : "";
      }
   }

   public void l111lIII11I11l1II() {
      this.l1l11Il11I1l1I1I1l1l11II = "";
      this.IlIlIl11lllI11lI1Ill1lIllI = "";
      this.l111ll1I11ll1ll1IlIllI = 0;

      for (int i = 0; i < 9; i++) {
         this.ll1llllllI11ll1IlIl1III[i] = "";
         this.ll11lII1[i] = "";
      }
   }

   public String EventTarget(Autocraft Autocraft) {
      return !this.IIlII1llIllllI1lI()
         ? "AutoCraft: craft item in crafting table to add preset"
         : "AutoCraft: take crafted item to save " + Autocraft.ZenithInternal021(this.l1l11Il11I1l1I1I1l1l11II, this.IlIlIl11lllI11lI1Ill1lIllI);
   }
}
