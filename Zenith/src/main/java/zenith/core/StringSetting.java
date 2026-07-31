package zenith;

import com.google.gson.JsonObject;
import java.util.function.Supplier;

public class StringSetting extends Setting {
   private final StringSetting$II1Il11l111II11IIl l1IIlIIl1III11I;
   private String value;
   private final String ll11lllIIl11II11;

   public StringSetting(String s, String s1, String s2) {
      this(s, "", s1, s2);
   }

   public StringSetting(String s, String s1, String s2, String s3) {
      super(s, s1);
      this.value = s2;
      this.ll11lllIIl11II11 = s3;
      this.l1IIlIIl1III11I = StringSetting$II1Il11l111II11IIl.lI11I111IlIIIlII11l11I1II1();
   }

   public StringSetting(String s, String s1, String s2, StringSetting$II1Il11l111II11IIl li1il1ll1l1l11iii$ii1il11l111ii11iil) {
      this(s, "", s1, s2, li1il1ll1l1l11iii$ii1il11l111ii11iil);
   }

   public StringSetting(String s, String s1, String s2, String s3, StringSetting$II1Il11l111II11IIl li1il1ll1l1l11iii$ii1il11l111ii11iil) {
      super(s, s1);
      this.value = s2;
      this.ll11lllIIl11II11 = s3;
      this.l1IIlIIl1III11I = li1il1ll1l1l11iii$ii1il11l111ii11iil == null
         ? StringSetting$II1Il11l111II11IIl.lI11I111IlIIIlII11l11I1II1()
         : li1il1ll1l1l11iii$ii1il11l111ii11iil;
   }

   public StringSetting(String s, String s1, String s2, Supplier<Boolean> supplier) {
      this(s, "", s1, s2, supplier);
   }

   public StringSetting(String s, String s1, String s2, String s3, Supplier<Boolean> supplier) {
      super(s, s1);
      this.value = s2;
      this.ll11lllIIl11II11 = s3;
      this.l1IIlIIl1III11I = StringSetting$II1Il11l111II11IIl.lI11I111IlIIIlII11l11I1II1();
      this.StringHolder_8(supplier);
   }

   public StringSetting(
      String s, String s1, String s2, Supplier<Boolean> supplier, StringSetting$II1Il11l111II11IIl li1il1ll1l1l11iii$ii1il11l111ii11iil
   ) {
      this(s, "", s1, s2, supplier, li1il1ll1l1l11iii$ii1il11l111ii11iil);
   }

   public StringSetting(
      String s, String s1, String s2, String s3, Supplier<Boolean> supplier, StringSetting$II1Il11l111II11IIl li1il1ll1l1l11iii$ii1il11l111ii11iil
   ) {
      super(s, s1);
      this.value = s2;
      this.ll11lllIIl11II11 = s3;
      this.l1IIlIIl1III11I = li1il1ll1l1l11iii$ii1il11l111ii11iil == null
         ? StringSetting$II1Il11l111II11IIl.lI11I111IlIIIlII11l11I1II1()
         : li1il1ll1l1l11iii$ii1il11l111ii11iil;
      this.StringHolder_8(supplier);
   }

   public boolean ZenithInternal078(String s) {
      if (this.l1IIlIIl1III11I.ZenithInternal025(s)) {
         this.value = s;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void safe(JsonObject jsonobject) {
      jsonobject.addProperty(String.valueOf(this.I1llIl1Il1lIII), this.value);
   }

   @Override
   public void load(JsonObject jsonobject) {
      if (jsonobject.has(String.valueOf(this.I1llIl1Il1lIII))) {
         String s = jsonobject.get(String.valueOf(this.I1llIl1Il1lIII)).getAsString();
         this.ZenithInternal078(s);
      }
   }

   public StringSetting$II1Il11l111II11IIl l1II11IllIl1IIII1l1lIllI1l1() {
      return this.l1IIlIIl1III11I;
   }

   public String getValue() {
      return this.value;
   }

   public String Il1II11IIIl1I1Il1Il1I1Illl11() {
      return this.ll11lllIIl11II11;
   }

   public void booleanHolder_3(String s) {
      this.value = s;
   }
}
