package zenith;

import com.google.gson.JsonObject;
import java.util.function.Supplier;

public class BindSetting extends Setting {
   private String lIIlllll1l1I11l1l11I1lII;
   private int Ill11II1Il1IIlI1Il;

   public void booleanHolder_2(int i) {
      this.Ill11II1Il1IIlI1Il = i;
      this.lIIlllll1l1I11l1l11I1lII = StringHolder_3.doubleHolder_2(i);
   }

   public BindSetting(String s, Supplier<Boolean> supplier) {
      this(s, "", supplier);
   }

   public BindSetting(String s, String s1, Supplier<Boolean> supplier) {
      super(s, s1);
      this.StringHolder_8(supplier);
      this.Ill11II1Il1IIlI1Il = -1;
      this.lIIlllll1l1I11l1l11I1lII = StringHolder_3.doubleHolder_2(this.Ill11II1Il1IIlI1Il);
   }

   public BindSetting(String s, int i, Supplier<Boolean> supplier) {
      this(s, "", i, supplier);
   }

   public BindSetting(String s, String s1, int i, Supplier<Boolean> supplier) {
      super(s, s1);
      this.StringHolder_8(supplier);
      this.Ill11II1Il1IIlI1Il = i;
      this.lIIlllll1l1I11l1l11I1lII = StringHolder_3.doubleHolder_2(i);
   }

   public BindSetting(String s, int i) {
      this(s, "", i);
   }

   public BindSetting(String s, String s1, int i) {
      super(s, s1);
      this.Ill11II1Il1IIlI1Il = i;
      this.lIIlllll1l1I11l1l11I1lII = StringHolder_3.doubleHolder_2(i);
   }

   public BindSetting(String s) {
      this(s, "");
   }

   public BindSetting(String s, String s1) {
      super(s, s1);
      this.Ill11II1Il1IIlI1Il = -1;
      this.lIIlllll1l1I11l1l11I1lII = "";
   }

   @Override
   public void safe(JsonObject jsonobject) {
      jsonobject.addProperty(String.valueOf(this.I1llIl1Il1lIII), this.Elytramotion());
   }

   @Override
   public void load(JsonObject jsonobject) {
      this.setKeyCode(jsonobject.get(String.valueOf(this.I1llIl1Il1lIII)).getAsInt());
   }

   public String llI1llI1lI1l1() {
      return this.lIIlllll1l1I11l1l11I1lII;
   }

   public int Elytramotion() {
      return this.Ill11II1Il1IIlI1Il;
   }
}
