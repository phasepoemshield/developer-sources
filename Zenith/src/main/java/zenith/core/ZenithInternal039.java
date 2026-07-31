package zenith;

import com.google.gson.JsonObject;

public final class ZenithInternal039 {
   private ZenithInternal039() {
   }

   public static JsonObject StringHolder_8(int i, int j, String s, String s1) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("v", i);
      jsonobject.addProperty("type", ZenithInternal087.l1l11lll1IIIlll11I1IIlI.Pathteleport());
      jsonobject.addProperty("uid", j);
      jsonobject.addProperty("nick", s);
      jsonobject.addProperty("role", s1);
      return jsonobject;
   }

   public static JsonObject StringHolder_8(int i, String s, int j) {
      JsonObject jsonobject = StringHolder_8(i, s, ZenithInternal087.IIll111I1I1I);
      jsonobject.addProperty("friendId", j);
      return jsonobject;
   }

   public static JsonObject StringHolder_8(int i, String s, int j, boolean flag) {
      JsonObject jsonobject = StringHolder_8(i, s, ZenithInternal087.llIlI1I1Il1I);
      jsonobject.addProperty("friendId", j);
      jsonobject.addProperty("mutualRemove", flag);
      return jsonobject;
   }

   public static JsonObject Event(int i, String s) {
      return StringHolder_8(i, s, ZenithInternal087.Ill1IIlll1IIl1III1l1I11I1);
   }

   public static JsonObject StringHolder_8(int i, String s, String s1) {
      JsonObject jsonobject = StringHolder_8(i, s, ZenithInternal087.IllI1I1IIIllllI);
      jsonobject.addProperty("target", ZenithInternal024.l11I11lIII1I1.Pathteleport());
      jsonobject.addProperty("message", s1);
      return jsonobject;
   }

   public static JsonObject EventBus(int i, String s, String s1) {
      JsonObject jsonobject = StringHolder_8(i, s, ZenithInternal087.IllI1I1IIIllllI);
      jsonobject.addProperty("target", ZenithInternal024.IlIl1II1ll11.Pathteleport());
      jsonobject.addProperty("message", s1);
      return jsonobject;
   }

   public static JsonObject StringHolder_8(int i, String s, int j, String s1) {
      JsonObject jsonobject = StringHolder_8(i, s, ZenithInternal087.IllI1I1IIIllllI);
      jsonobject.addProperty("target", ZenithInternal024.llI1llllIllIlll1l1lI11lIIIl.Pathteleport());
      jsonobject.addProperty("recipientUid", j);
      jsonobject.addProperty("message", s1);
      return jsonobject;
   }

   private static JsonObject StringHolder_8(int i, String s, ZenithInternal087 l1il1i1i1i1i1l1l1lli111i) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("v", i);
      jsonobject.addProperty("type", l1il1i1i1i1i1l1l1lli111i.Pathteleport());
      jsonobject.addProperty("token", s);
      return jsonobject;
   }
}
