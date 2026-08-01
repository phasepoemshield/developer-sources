package zenith;

import com.google.gson.JsonObject;
import java.io.File;
import java.io.IOException;

public class IsPriorityHandler {
   private final String I1ll1l11ll1IIlllII;
   private final File Illl1llIIIl1lI11Ill;
   private boolean Il11I1IIII1l1lIlI1;

   public IsPriorityHandler(String s) {
      this.I1ll1l11ll1IIlllII = s;
      this.Illl1llIIIl1lI11Ill = new File(FileHolder_2.l1I11IIIl11lIIllI1II1lI1I1, s + "." + "Zenith".toLowerCase());
      if (!this.Illl1llIIIl1lI11Ill.exists()) {
         try {
            this.Illl1llIIIl1lI11Ill.createNewFile();
         } catch (IOException ioexception) {
            ioexception.printStackTrace();
         }
      }
   }

   public void Tridentaimbot() {
      this.Il11I1IIII1l1lIlI1 = !this.Il11I1IIII1l1lIlI1;
   }

   public JsonObject save() {
      try {
         JsonObject jsonobject = new JsonObject();
         JsonObject jsonobject1 = new JsonObject();
         jsonobject1.addProperty("name", this.I1ll1l11ll1IIlllII);
         jsonobject1.addProperty("priority", this.Il11I1IIII1l1lIlI1);
         jsonobject.add("ConfigData", jsonobject1);
         jsonobject.add("Styles", ZenithClient.getInstance().floatHolder_3().save());
         JsonObject jsonobject2 = new JsonObject();
         jsonobject2.addProperty(
            "name", StringHolder_23.ZenithInternal095(ZenithClient.getInstance().ZenithInternal071().ZenithInternal018())
         );
         jsonobject.add("FiguraData", jsonobject2);
         jsonobject.add("PetData", ZenithClient.getInstance().BlockPosHolder().save());
         JsonObject jsonobject3 = new JsonObject();

         for (Module ll111il1lliill11 : ZenithClient.getInstance().getModuleManager().getModules()) {
            jsonobject3.add(ll111il1lliill11.getName(), ll111il1lliill11.save());
         }

         jsonobject.add("Modules", jsonobject3);
         JsonObject jsonobject4 = new JsonObject();
         jsonobject4.addProperty("language", ZenithClient.getInstance().StringHolder_31().floatHolder());
         jsonobject.add("Language", jsonobject4);
         if (ZenithClient.getInstance().ZenithInternal141() != null) {
            ZenithClient.getInstance().ZenithInternal141().safe(jsonobject);
         }

         return jsonobject;
      } catch (Exception exception) {
         exception.printStackTrace();
         return null;
      }
   }

   public void load(JsonObject jsonobject) {
      if (jsonobject.has("Styles")) {
         ZenithClient.getInstance().floatHolder_3().load(jsonobject.getAsJsonObject("Styles"));
      }

      if (jsonobject.has("ConfigData")) {
         JsonObject jsonobject1 = jsonobject.getAsJsonObject("ConfigData");
         if (jsonobject1.has("priority")) {
            this.Il11I1IIII1l1lIlI1 = jsonobject1.get("priority").getAsBoolean();
         }
      }

      if (jsonobject.has("FiguraData")) {
         JsonObject jsonobject2 = jsonobject.getAsJsonObject("FiguraData");
         if (jsonobject2.has("name")) {
            ZenithClient.getInstance()
               .ZenithInternal071()
               .StringHolder_8(StringHolder_23.EventImpl_29(jsonobject2.get("name").getAsString()));
         }
      }

      if (jsonobject.has("PetData")) {
         JsonObject jsonobject3 = jsonobject.getAsJsonObject("PetData");
         ZenithClient.getInstance().BlockPosHolder().load(jsonobject3);
      }

      if (jsonobject.has("Language")) {
         JsonObject jsonobject4 = jsonobject.getAsJsonObject("Language");
         if (jsonobject4.has("language")) {
            ZenithClient.getInstance().StringHolder_31().EventImpl_36(jsonobject4.get("language").getAsString());
         }
      }

      if (ZenithClient.getInstance().ZenithInternal141() != null) {
         ZenithClient.getInstance().ZenithInternal141().load(jsonobject);
      }

      if (jsonobject.has("Modules")) {
         JsonObject jsonobject5 = jsonobject.getAsJsonObject("Modules");

         for (Module ll111il1lliill11 : ZenithClient.getInstance().getModuleManager().getModules()) {
            try {
               ll111il1lliill11.load(jsonobject5.getAsJsonObject(ll111il1lliill11.getName()));
            } catch (Exception exception) {
               exception.printStackTrace();
            }
         }
      }
   }

   public String getName() {
      return this.I1ll1l11ll1IIlllII;
   }

   public File getFile() {
      return this.Illl1llIIIl1lI11Ill;
   }

   public boolean isPriority() {
      return this.Il11I1IIII1l1lIlI1;
   }
}
