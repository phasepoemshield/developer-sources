package zenith;

public class MultiBooleanSetting$II1Il11l111II11IIl {
   private boolean lIIIIIIIl1lI1;
   private final String l1Il1l11l1lII11l1l1I111I;

   public String getName() {
      return ZenithClient.getInstance().StringHolder_31().translate(this.l1Il1l11l1lII11l1l1I111I);
   }

   public String ll1I1IlIIIIII() {
      return this.l1Il1l11l1lII11l1l1I111I;
   }

   private MultiBooleanSetting$II1Il11l111II11IIl(String s, boolean flag) {
      this.lIIIIIIIl1lI1 = flag;
      this.l1Il1l11l1lII11l1l1I111I = s;
   }

   public MultiBooleanSetting$II1Il11l111II11IIl(MultiBooleanSetting l11i1111l1i, String s, boolean flag) {
      this.lIIIIIIIl1lI1 = flag;
      this.l1Il1l11l1lII11l1l1I111I = s;
      l11i1111l1i.III1Il1llIlIl11l1IlllI1Il.add(this);
   }

   public static MultiBooleanSetting$II1Il11l111II11IIl ZenithInternal095(String s, boolean flag) {
      return new MultiBooleanSetting$II1Il11l111II11IIl(s, flag);
   }

   public static MultiBooleanSetting$II1Il11l111II11IIl EventImpl_8(String s) {
      return new MultiBooleanSetting$II1Il11l111II11IIl(s, true);
   }

   public void lI1Il11I1l1III11IIlI1lI1II11I() {
      this.lIIIIIIIl1lI1 = !this.lIIIIIIIl1lI1;
   }

   public boolean Spider() {
      return this.lIIIIIIIl1lI1;
   }

   public void StringHolder_11(boolean flag) {
      this.lIIIIIIIl1lI1 = flag;
   }
}
