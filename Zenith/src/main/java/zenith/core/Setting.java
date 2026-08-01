package zenith;

import com.google.gson.JsonObject;
import java.util.function.Supplier;

public abstract class Setting {
   protected final String I1llIl1Il1lIII;
   protected final String I1llIl1IlIlII;
   protected Supplier<Boolean> IIIllIlIIIll11lll;

   public Setting(String s) {
      this(s, "");
   }

   public Setting(String s, String s1) {
      this.I1llIl1Il1lIII = s;
      this.I1llIl1IlIlII = s1 != null ? s1 : "";
      this.StringHolder_8(() -> true);
   }

   public String getName() {
      return ZenithClient.getInstance().StringHolder_31().translate(this.I1llIl1Il1lIII);
   }

   public String llllIII11IIl1ll1llI1lII1I() {
      return ZenithClient.getInstance().StringHolder_31().translate(this.I1llIl1IlIlII);
   }

   public abstract void safe(JsonObject jsonobject);

   public abstract void load(JsonObject jsonobject);

   public boolean isVisible() {
      return this.IIIllIlIIIll11lll.get();
   }

   public String ll1I1IlIIIIII() {
      return this.I1llIl1Il1lIII;
   }

   public Supplier<Boolean> l1l1II1I1ll11l1IlI1lI11l1() {
      return this.IIIllIlIIIll11lll;
   }

   public void StringHolder_8(Supplier<Boolean> supplier) {
      this.IIIllIlIIIll11lll = supplier;
   }
}
