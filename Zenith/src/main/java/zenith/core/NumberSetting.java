package zenith;

import com.google.gson.JsonObject;
import java.util.function.Supplier;

public class NumberSetting extends Setting {
   private final String lII1I1llIlIlllII1lIlll1IlII;
   private final String Illll1lIIllI1l11llI1Il11;
   private float ll11llllll11lI11l1II1l1;
   private final float lI1II1111I;
   private final float lIlI11l1II1I1I11llIlIl111l1I;
   private final float Il1lIll11l1Il;
   private NumberSetting$II1Il11l111II11IIl I111Il1Il1I1Il11111;

   @Override
   public String llllIII11IIl1ll1llI1lII1I() {
      return ZenithClient.getInstance().StringHolder_31().translate(this.Illll1lIIllI1l11llI1Il11);
   }

   public NumberSetting(
      String s,
      float f,
      float f1,
      float f2,
      float f3,
      String s1,
      String s2,
      Supplier<Boolean> supplier,
      NumberSetting$II1Il11l111II11IIl illil1lill1llll11$ii1il11l111ii11iil
   ) {
      super(s, s1);
      this.lI1II1111I = f1;
      this.lIlI11l1II1I1I11llIlIl111l1I = f2;
      this.ll11llllll11lI11l1II1l1 = f;
      this.Il1lIll11l1Il = f3;
      this.Illll1lIIllI1l11llI1Il11 = s1 != null ? s1 : "";
      this.lII1I1llIlIlllII1lIlll1IlII = s2 != null ? s2 : "";
      this.I111Il1Il1I1Il11111 = illil1lill1llll11$ii1il11l111ii11iil;
      if (supplier != null) {
         this.StringHolder_8(supplier);
      }
   }

   public NumberSetting(String s, float f, float f1, float f2, float f3) {
      this(s, f, f1, f2, f3, "", "%", null, null);
   }

   public NumberSetting(String s, float f, float f1, float f2, float f3, String s1) {
      this(s, f, f1, f2, f3, s1, "%", null, null);
   }

   public NumberSetting(String s, float f, float f1, float f2, float f3, String s1, String s2) {
      this(s, f, f1, f2, f3, s1, s2, null, null);
   }

   public NumberSetting(String s, float f, float f1, float f2, float f3, Supplier<Boolean> supplier) {
      this(s, f, f1, f2, f3, "", "%", supplier, null);
   }

   public NumberSetting(String s, float f, float f1, float f2, float f3, NumberSetting$II1Il11l111II11IIl illil1lill1llll11$ii1il11l111ii11iil) {
      this(s, f, f1, f2, f3, "", "%", null, illil1lill1llll11$ii1il11l111ii11iil);
   }

   public NumberSetting(
      String s, float f, float f1, float f2, float f3, Supplier<Boolean> supplier, NumberSetting$II1Il11l111II11IIl illil1lill1llll11$ii1il11l111ii11iil
   ) {
      this(s, f, f1, f2, f3, "", "%", supplier, illil1lill1llll11$ii1il11l111ii11iil);
   }

   public NumberSetting(
      String s,
      float f,
      float f1,
      float f2,
      float f3,
      String s1,
      Supplier<Boolean> supplier,
      NumberSetting$II1Il11l111II11IIl illil1lill1llll11$ii1il11l111ii11iil
   ) {
      this(s, f, f1, f2, f3, "", s1, supplier, illil1lill1llll11$ii1il11l111ii11iil);
   }

   public void longHolder_4(float f) {
      float f1 = this.ll11llllll11lI11l1II1l1;
      this.ll11llllll11lI11l1II1l1 = f;
      if (this.I111Il1Il1I1Il11111 != null) {
         this.I111Il1Il1I1Il11111.apply(f1, f);
      }
   }

   @Override
   public void safe(JsonObject jsonobject) {
      jsonobject.addProperty(String.valueOf(this.I1llIl1Il1lIII), this.lll1lI1llll1IIllIIIII1lll());
   }

   @Override
   public void load(JsonObject jsonobject) {
      this.longHolder_4(jsonobject.get(String.valueOf(this.I1llIl1Il1lIII)).getAsFloat());
   }

   public String getSuffix() {
      return this.lII1I1llIlIlllII1lIlll1IlII;
   }

   public float lll1lI1llll1IIllIIIII1lll() {
      return this.ll11llllll11lI11l1II1l1;
   }

   public float Il1llI11l1() {
      return this.lI1II1111I;
   }

   public float Il1IIllllIIIll1I1IIIIIlI() {
      return this.lIlI11l1II1I1I11llIlIl111l1I;
   }

   public float IIl11llIllllI1lI11I() {
      return this.Il1lIll11l1Il;
   }

   public NumberSetting$II1Il11l111II11IIl II1lIllIlI1ll1I1I1Illl1I() {
      return this.I111Il1Il1I1Il11111;
   }
}
