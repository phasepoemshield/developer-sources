package zenith;

import com.google.gson.JsonObject;

public class ButtonSetting extends Setting {
   private String I1IlllIl11I1l;
   private Runnable lllII1IIllIIllIII1l1IIIIl1ll1;

   public ButtonSetting(String s, Runnable runnable) {
      this(s, "t", runnable);
   }

   public ButtonSetting(String s, String s1, Runnable runnable) {
      this(s, s1, "", runnable);
   }

   public ButtonSetting(String s, String s1, String s2, Runnable runnable) {
      super(s, s2);
      this.lllII1IIllIIllIII1l1IIIIl1ll1 = runnable;
      this.I1IlllIl11I1l = s1;
   }

   public void lI1Il11I1l1III11IIlI1lI1II11I() {
      this.lllII1IIllIIllIII1l1IIIIl1ll1.run();
   }

   @Override
   public void safe(JsonObject jsonobject) {
   }

   @Override
   public void load(JsonObject jsonobject) {
   }

   public String getIcon() {
      return this.I1IlllIl11I1l;
   }

   public Runnable IIl111lI11I1Il1l1ll1l1111II11() {
      return this.lllII1IIllIIllIII1l1IIIIl1ll1;
   }

   public void Vec3dHolder_2(String s) {
      this.I1IlllIl11I1l = s;
   }

   public void StringHolder_8(Runnable runnable) {
      this.lllII1IIllIIllIII1l1IIIIl1ll1 = runnable;
   }
}
