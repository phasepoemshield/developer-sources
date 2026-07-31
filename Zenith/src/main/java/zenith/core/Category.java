package zenith;

public enum Category {
   IIII1111111II("Combat", "3"),
   Il1IllI11IlI11l1II11ll1Il1("Movement", "4"),
   Illl1I111lI1I111I111IllI1ll("Misc", "5"),
   lllI1l11lI1("Visuals", "6"),
   lIl11I11I1llIIl11llIlI1Il("PvE", "7"),
   IllllII1ll1111IlIIII("Themes", "G");

   private final String IlIlIIIIIlllIl11Ill;
   private final String l1IllIlllIIIlllI1I11ll;

   private Category(String s1, String s2) {
      this.IlIlIIIIIlllIl11Ill = s1;
      this.l1IllIlllIIIlllI1I11ll = s2;
   }

   public String getIcon() {
      return this.l1IllIlllIIIlllI1I11ll;
   }

   public String getName() {
      return this.IlIlIIIIIlllIl11Ill;
   }
}
