package zenith;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import net.minecraft.util.Identifier;
import net.minecraft.resource.Resource;

public final class GsonHolder {
   private static final Gson ll11llI1l1111llIl1I11 = new Gson();
   private static int ll111I11II1I1Il1IIIIIlIII1 = 0;

   public static booleanHolder$Helper StringHolder_8(Identifier Identifier) {
      try {
         Resource Resource = (Resource)net.minecraft.client.MinecraftClient.getInstance().getResourceManager().getResource(Identifier).orElseThrow();

         booleanHolder$Helper i1lii1l11iiili$ii1il11l111ii11iil;
         try (InputStream inputstream = Resource.getInputStream()) {
            i1lii1l11iiili$ii1il11l111ii11iil = ByteBufferHolder_2((JsonObject)ll11llI1l1111llIl1I11.fromJson(new InputStreamReader(inputstream), JsonObject.class));
         }

         return i1lii1l11iiili$ii1il11l111ii11iil;
      } catch (Exception exception) {
         return null;
      }
   }

   private static booleanHolder$Helper ByteBufferHolder_2(JsonObject jsonobject) {
      booleanHolder$Helper i1lii1l11iiili$ii1il11l111ii11iil = new booleanHolder$Helper(ll111I11II1I1Il1IIIIIlIII1++);
      if (jsonobject.has("textures")) {
         JsonArray jsonarray = jsonobject.getAsJsonArray("textures");

         for (int i = 0; i < jsonarray.size(); i++) {
            JsonObject jsonobject1 = jsonarray.get(i).getAsJsonObject();
            int j = jsonobject1.has("uv_width") ? jsonobject1.get("uv_width").getAsInt() : 16;
            int k = jsonobject1.has("uv_height") ? jsonobject1.get("uv_height").getAsInt() : 16;
            String s = jsonobject1.has("source") ? jsonobject1.get("source").getAsString() : null;
            i1lii1l11iiili$ii1il11l111ii11iil.ll1l1IlIII11l11IIIIIlII111ll.put(i, new StringHolder$EventBus(i, j, k, s));
         }
      }

      if (jsonobject.has("elements")) {
         for (JsonElement jsonelement : jsonobject.getAsJsonArray("elements")) {
            JsonObject jsonobject2 = jsonelement.getAsJsonObject();
            if ("mesh".equals(jsonobject2.has("type") ? jsonobject2.get("type").getAsString() : "cube")) {
               StringHolder_8(jsonobject2, i1lii1l11iiili$ii1il11l111ii11iil);
            }
         }
      }

      i1lii1l11iiili$ii1il11l111ii11iil.lI1llIlIlllIllIlIIllIll1lI11();
      return i1lii1l11iiili$ii1il11l111ii11iil;
   }

   private static void StringHolder_8(JsonObject jsonobject, booleanHolder$Helper i1lii1l11iiili$ii1il11l111ii11iil) {
      JsonObject jsonobject1 = jsonobject.getAsJsonObject("vertices");
      JsonObject jsonobject2 = jsonobject.getAsJsonObject("faces");
      HashMap hashmap = new HashMap();

      for (String s : jsonobject1.keySet()) {
         JsonArray jsonarray = jsonobject1.getAsJsonArray(s);
         hashmap.put(s, new float[]{jsonarray.get(0).getAsFloat(), jsonarray.get(1).getAsFloat(), jsonarray.get(2).getAsFloat()});
      }

      for (String s3 : jsonobject2.keySet()) {
         JsonObject jsonobject4 = jsonobject2.getAsJsonObject(s3);
         JsonArray jsonarray1 = jsonobject4.getAsJsonArray("vertices");
         int i = jsonobject4.get("texture").getAsInt();
         StringHolder$EventBus i1lii1l11iiili$l1i1illlili = i1lii1l11iiili$ii1il11l111ii11iil.ll1l1IlIII11l11IIIIIlII111ll.get(i);
         HashMap hashmap1 = new HashMap();
         JsonObject jsonobject3 = jsonobject4.getAsJsonObject("uv");

         for (String s1 : jsonobject3.keySet()) {
            JsonArray jsonarray2 = jsonobject3.getAsJsonArray(s1);
            hashmap1.put(
               s1,
               new float[]{
                  jsonarray2.get(0).getAsFloat() / (float)i1lii1l11iiili$l1i1illlili.I111Il1I1IIlllIIlII1lI1,
                  jsonarray2.get(1).getAsFloat() / (float)i1lii1l11iiili$l1i1illlili.llll1111IllllI
               }
            );
         }

         int k = jsonarray1.size();
         float[][] afloat = new float[k][];
         float[][] afloat1 = new float[k][];

         for (int j = 0; j < k; j++) {
            String s2 = jsonarray1.get(j).getAsString();
            afloat[j] = (float[])hashmap.get(s2);
            afloat1[j] = (float[])hashmap1.get(s2);
         }

         float[] afloat2 = StringHolder_8(afloat[0], afloat[1], afloat[2]);

         for (int l = 1; l < k - 1; l++) {
            i1lii1l11iiili$ii1il11l111ii11iil.StringHolder_8(
               i, afloat[0], afloat1[0], afloat2, afloat[l], afloat1[l], afloat2, afloat[l + 1], afloat1[l + 1], afloat2
            );
         }
      }
   }

   private static float[] StringHolder_8(float[] afloat, float[] afloat1, float[] afloat2) {
      float f = afloat1[0] - afloat[0];
      float f1 = afloat1[1] - afloat[1];
      float f2 = afloat1[2] - afloat[2];
      float f3 = afloat2[0] - afloat[0];
      float f4 = afloat2[1] - afloat[1];
      float f5 = afloat2[2] - afloat[2];
      float f6 = f1 * f5 - f2 * f4;
      float f7 = f2 * f3 - f * f5;
      float f8 = f * f4 - f1 * f3;
      float f9 = (float)Math.sqrt((double)(f6 * f6 + f7 * f7 + f8 * f8));
      return f9 != 0.0F ? new float[]{f6 / f9, f7 / f9, f8 / f9} : new float[]{0.0F, 1.0F, 0.0F};
   }

   private GsonHolder() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
