package zenith;

public final class StringHolder_24  {
   private final String I1IlIlIlllI1III1l1l1I1l1IlI111;
   private final String IIIlI11IllIIlIllII1l1;
   private final String lIIII11lIIl1;
   private final String lI1Il11l1I11lI1lI111I;
   private final long IIl11I11lI1lI;
   private final boolean I1ll111I11l1lI1Il1l1lIl1II;

   public StringHolder_24(String s, String s1, String s2, String s3, long i, boolean flag) {
      this.I1IlIlIlllI1III1l1l1I1l1IlI111 = s;
      this.IIIlI11IllIIlIllII1l1 = s1;
      this.lIIII11lIIl1 = s2;
      this.lI1Il11l1I11lI1lI111I = s3;
      this.IIl11I11lI1lI = i;
      this.I1ll111I11l1lI1Il1l1lIl1II = flag;
   }

   public static StringHolder_24 GetDisplayNameHandler_2(String s) {
      return new StringHolder_24("system", "System", s, "SYSTEM", System.currentTimeMillis(), true);
   }

   public String StringSetting() {
      return this.I1IlIlIlllI1III1l1l1I1l1IlI111;
   }

   public String ContainerSetting() {
      return this.IIIlI11IllIIlIllII1l1;
   }

   public String text() {
      return this.lIIII11lIIl1;
   }

   public String Aimassist() {
      return this.lI1Il11l1I11lI1lI111I;
   }

   public long Antibot() {
      return this.IIl11I11lI1lI;
   }

   public boolean Aura() {
      return this.I1ll111I11l1lI1Il1l1lIl1II;
   }
}
