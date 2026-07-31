package zenith;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.ItemStack;

public class GetServerHandler {
   private static final String l1l1lI111l1II1Illl111l1l1ll1l = "HolyWorld";
   private final String l1ll1I1lll11l1llIlIlIIIlI11I;
   private final File llI1lll1lIllII11I1111Illl;
   private String server;
   private List<GetMaxSumBuyHandler> llIl1II1l1ll11 = new ArrayList<>();

   public GetServerHandler(String s) {
      this(s, "HolyWorld", new File(FileHolder.ll1I1IlIIIIII, s + "." + "Zenith".toLowerCase()));
   }

   public GetServerHandler(String s, String s1) {
      this(s, s1, new File(FileHolder.ll1I1IlIIIIII, ConnectThread(s, s1) + "." + "Zenith".toLowerCase()));
   }

   public GetServerHandler(String s, String s1, File file1) {
      this.l1ll1I1lll11l1llIlIlIIIlI11I = s;
      this.server = ZenithInternal139(s1);
      this.llI1lll1lIllII11I1111Illl = file1;
      if (!file1.exists()) {
         try {
            file1.createNewFile();
         } catch (IOException ioexception) {
            ioexception.printStackTrace();
         }
      }
   }

   public JsonObject save() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("name", this.l1ll1I1lll11l1llIlIlIIIlI11I);
      jsonobject.addProperty("server", this.server);
      JsonArray jsonarray = new JsonArray();

      for (GetMaxSumBuyHandler lill1l111l1l11ii11i1ii11ii1 : this.llIl1II1l1ll11) {
         jsonarray.add(lill1l111l1l11ii11i1ii11ii1.save());
      }

      jsonobject.add("items", jsonarray);
      return jsonobject;
   }

   public void load(JsonObject jsonobject) {
      this.llIl1II1l1ll11.clear();
      if (jsonobject.has("server")) {
         this.server = ZenithInternal139(jsonobject.get("server").getAsString());
      }

      if (jsonobject.has("items")) {
         JsonArray jsonarray = jsonobject.getAsJsonArray("items");

         for (int i = 0; i < jsonarray.size(); i++) {
            JsonObject jsonobject1 = jsonarray.get(i).getAsJsonObject();
            GetMaxSumBuyHandler lill1l111l1l11ii11i1ii11ii1 = new GetMaxSumBuyHandler();
            lill1l111l1l11ii11i1ii11ii1.load(jsonobject1);
            this.llIl1II1l1ll11.add(lill1l111l1l11ii11i1ii11ii1);
         }
      }
   }

   public List<ItemStack> ZenithInternal047() {
      ArrayList arraylist = new ArrayList();

      for (GetMaxSumBuyHandler lill1l111l1l11ii11i1ii11ii1 : this.llIl1II1l1ll11) {
         arraylist.add(lill1l111l1l11ii11i1ii11ii1.ListHolder_8());
      }

      return arraylist;
   }

   public boolean EventImpl_6(String s) {
      return this.server.equals(ZenithInternal139(s));
   }

   private static String ZenithInternal139(String s) {
      return s != null && !s.isBlank() ? s : "HolyWorld";
   }

   private static String ConnectThread(String s, String s1) {
      String s2 = ZenithInternal139(s1).replaceAll("[^\\p{L}\\p{N}._-]", "_");
      return s2 + "_" + s;
   }

   public String getName() {
      return this.l1ll1I1lll11l1llIlIlIIIlI11I;
   }

   public File getFile() {
      return this.llI1lll1lIllII11I1111Illl;
   }

   public String getServer() {
      return this.server;
   }

   public List<GetMaxSumBuyHandler> ZenithInternal066() {
      return this.llIl1II1l1ll11;
   }

   public void EventImpl_7(String s) {
      this.server = s;
   }

   public void ZenithInternal128(List<GetMaxSumBuyHandler> list) {
      this.llIl1II1l1ll11 = list;
   }
}
