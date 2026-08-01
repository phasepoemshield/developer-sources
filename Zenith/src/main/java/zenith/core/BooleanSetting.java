package zenith;

import com.google.gson.JsonObject;
import java.util.function.Supplier;

public class BooleanSetting extends Setting {
   private boolean lIIIIIIIl1lI1;
   private final String IIlI1IIlllllI1IIl;

   @Override
   public String llllIII11IIl1ll1llI1lII1I() {
      return ZenithClient.getInstance().StringHolder_31().translate(this.IIlI1IIlllllI1IIl);
   }

   public BooleanSetting(String s, boolean flag) {
      super(s, "");
      this.lIIIIIIIl1lI1 = flag;
      this.IIlI1IIlllllI1IIl = "";
   }

   public BooleanSetting(String s, String s1, boolean flag) {
      super(s, s1);
      this.lIIIIIIIl1lI1 = flag;
      this.IIlI1IIlllllI1IIl = s1;
   }

   public BooleanSetting(String s, String s1, boolean flag, Supplier<Boolean> supplier) {
      super(s, s1);
      this.lIIIIIIIl1lI1 = flag;
      this.StringHolder_8(supplier);
      this.IIlI1IIlllllI1IIl = s1;
   }

   public BooleanSetting(String s, boolean flag, Supplier<Boolean> supplier) {
      super(s, "");
      this.lIIIIIIIl1lI1 = flag;
      this.StringHolder_8(supplier);
      this.IIlI1IIlllllI1IIl = "";
   }

   public static BooleanSetting EventTarget(String s, boolean flag) {
      return new BooleanSetting(s, flag);
   }

   public static BooleanSetting EventImpl(String s) {
      return new BooleanSetting(s, true);
   }

   public void lI1Il11I1l1III11IIlI1lI1II11I() {
      this.lIIIIIIIl1lI1 = !this.lIIIIIIIl1lI1;
   }

   @Override
   public void safe(JsonObject jsonobject) {
      jsonobject.addProperty(String.valueOf(this.I1llIl1Il1lIII), this.Spider());
   }

   @Override
   public void load(JsonObject jsonobject) {
      this.StringHolder_11(jsonobject.get(String.valueOf(this.I1llIl1Il1lIII)).getAsBoolean());
   }

   public boolean Spider() {
      return this.lIIIIIIIl1lI1;
   }

   public void StringHolder_11(boolean flag) {
      this.lIIIIIIIl1lI1 = flag;
   }
}
