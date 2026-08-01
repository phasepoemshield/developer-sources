package zenith;

import com.google.gson.JsonObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.text.Text;
import net.minecraft.text.Style;

public class Module implements Comparable<Module>, ZenithInternal140 {
   protected ModuleInfo IIIl1IIllI1I1lllII = this.getClass().getAnnotation(ModuleInfo.class);
   private String name;
   private final Category III11l1l111I;
   private volatile boolean lIIIIIIIl1lI1;
   private boolean Il11I1IIII1l1lIlI1 = false;
   private int Ill11II1Il1IIlI1Il;

   protected Module() {
      this.name = this.IIIl1IIllI1I1lllII.name();
      this.III11l1l111I = this.IIIl1IIllI1I1lllII.lII111I11I1Il111l();
      this.lIIIIIIIl1lI1 = false;
      this.Ill11II1Il1IIlI1Il = -1;
   }

   public void StringHolder_32(boolean flag) {
      if (flag && !this.Spider()) {
         this.lI1Il11I1l1III11IIlI1lI1II11I();
      }

      if (!flag && this.Spider()) {
         this.lI1Il11I1l1III11IIlI1lI1II11I();
      }
   }

   public void lI1Il11I1l1III11IIlI1lI1II11I() {
      this.lIIIIIIIl1lI1 = !this.lIIIIIIIl1lI1;
      if (this.lIIIIIIIl1lI1) {
         this.l11l1lII();
      } else {
         this.l1l1lI111l1II1Illl111l1l1ll1l();
      }
   }

   public void onEnable() {
      if (this.llI1lll1lIllII11I1111Illl()
         && ZenithClient.getInstance().ListHolder_7().GetClientColorHandler()
            == ZenithClient$II1Il11l111II11IIl$II1Il11l111II11IIl.TotemParticles) {
         this.StringHolder_32(false);
         ZenithClient.getInstance()
            .ZenithInternal015()
            .StringHolder_8(
               this.III11l1l111I.getIcon(),
               Text.of(
                  Text.of("Работает только")
                     .copy()
                     .setStyle(
                        Style.EMPTY
                           .withColor(
                              II1l111II1Il11II111llllIl1.floatHolder_3()
                                 .getCurrentStyle()
                                 .getPrimaryColor()
                                 .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                                 .lllIlll1Ill111l111Il11II11lII()
                           )
                     )
                     .append(
                        Text.of("с Альфой")
                           .copy()
                           .setStyle(
                              Style.EMPTY
                                 .withColor(
                                    II1l111II1Il11II111llllIl1.floatHolder_3()
                                       .getCurrentStyle()
                                       .getTextEnable()
                                       .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                                       .lllIlll1Ill111l111Il11II11lII()
                                 )
                           )
                     )
               )
            );
      } else {
         EventBus.StringHolder_8(this);
         EventBus.StringHolder_8((Event)(new EventImpl_25(this, this.lIIIIIIIl1lI1)));
      }
   }

   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      EventBus.EventBus(this);
      EventBus.StringHolder_8((Event)(new EventImpl_25(this, this.lIIIIIIIl1lI1)));
   }

   public List<Setting> getSettings() {
      return Arrays.stream(this.getClass().getDeclaredFields()).map(field -> {
         try {
            field.setAccessible(true);
            return field.get(this);
         } catch (IllegalAccessException illegalaccessexception) {
            illegalaccessexception.printStackTrace();
            return null;
         }
      }).filter(object -> object instanceof Setting).map(object -> (Setting)object).collect(Collectors.toList());
   }

   public boolean l1ll1I1lll11l1llIlIlIIIlI11I() {
      return true;
   }

   public JsonObject save() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("enabled", this.lIIIIIIIl1lI1);
      jsonobject.addProperty("priority", this.Il11I1IIII1l1lIlI1);
      jsonobject.addProperty("keyCode", this.Ill11II1Il1IIlI1Il);
      JsonObject jsonobject1 = new JsonObject();

      for (Setting l1i111illi1i1 : this.getSettings()) {
         l1i111illi1i1.safe(jsonobject1);
      }

      jsonobject.add("Settings", jsonobject1);
      return jsonobject;
   }

   public void load(JsonObject jsonobject) {
      try {
         if (jsonobject != null) {
            if (jsonobject.has("enabled")) {
               boolean flag = jsonobject.get("enabled").getAsBoolean();
               if (flag && !this.Spider()) {
                  this.lI1Il11I1l1III11IIlI1lI1II11I();
               }

               if (!flag && this.Spider()) {
                  this.lI1Il11I1l1III11IIlI1lI1II11I();
               }
            }

            if (jsonobject.has("priority")) {
               this.Il11I1IIII1l1lIlI1 = jsonobject.get("priority").getAsBoolean();
            }

            if (jsonobject.has("keyCode")) {
               this.Ill11II1Il1IIlI1Il = jsonobject.get("keyCode").getAsInt();
            }

            for (Setting l1i111illi1i1 : this.getSettings()) {
               String s = l1i111illi1i1.getName();
               JsonObject jsonobject1 = jsonobject.getAsJsonObject("Settings");
               if (jsonobject1 != null && (jsonobject1.has(s) || l1i111illi1i1 instanceof ContainerSetting)) {
                  l1i111illi1i1.load(jsonobject1);
               }
            }
         }
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   public int EventTarget(Module ll111il1lliill11) {
      return ll111il1lliill11.getName().compareTo(this.name);
   }

   public boolean llI1lll1lIllII11I1111Illl() {
      return false;
   }

   public ModuleInfo llIl1II1l1ll11() {
      return this.IIIl1IIllI1I1lllII;
   }

   public String getName() {
      return this.name;
   }

   public Category getCategory() {
      return this.III11l1l111I;
   }

   public boolean Spider() {
      return this.lIIIIIIIl1lI1;
   }

   public boolean isPriority() {
      return this.Il11I1IIII1l1lIlI1;
   }

   public int Elytramotion() {
      return this.Ill11II1Il1IIlI1Il;
   }

   public void StringHolder_8(ModuleInfo ii1llii1ll11i111lll1) {
      this.IIIl1IIllI1I1lllII = ii1llii1ll11i111lll1;
   }

   public void setName(String s) {
      this.name = s;
   }

   public void StringHolder_11(boolean flag) {
      this.lIIIIIIIl1lI1 = flag;
   }

   public void StringHolder_12(boolean flag) {
      this.Il11I1IIII1l1lIlI1 = flag;
   }

   public void booleanHolder_2(int i) {
      this.Ill11II1Il1IIlI1Il = i;
   }

   @Override
   public boolean equals(Object object) {
      if (object == this) {
         return true;
      } else if (!(object instanceof Module ll111il1lliill11)) {
         return false;
      } else if (!ll111il1lliill11.EventTarget((Object)this)) {
         return false;
      } else if (this.Spider() != ll111il1lliill11.Spider()) {
         return false;
      } else if (this.isPriority() != ll111il1lliill11.isPriority()) {
         return false;
      } else if (this.Elytramotion() != ll111il1lliill11.Elytramotion()) {
         return false;
      } else {
         ModuleInfo ii1llii1ll11i111lll1 = this.llIl1II1l1ll11();
         ModuleInfo ii1llii1ll11i111lll11 = ll111il1lliill11.llIl1II1l1ll11();
         if (ii1llii1ll11i111lll1 == null ? ii1llii1ll11i111lll11 == null : ii1llii1ll11i111lll1.equals(ii1llii1ll11i111lll11)) {
            String s = this.getName();
            String s1 = ll111il1lliill11.getName();
            if (s == null ? s1 == null : s.equals(s1)) {
               Category iill11i1il1ilii11iii1llil1ll = this.getCategory();
               Category iill11i1il1ilii11iii1llil1ll1 = ll111il1lliill11.getCategory();
               return iill11i1il1ilii11iii1llil1ll == null
                  ? iill11i1il1ilii11iii1llil1ll1 == null
                  : iill11i1il1ilii11iii1llil1ll.equals(iill11i1il1ilii11iii1llil1ll1);
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   protected boolean EventTarget(Object object) {
      return object instanceof Module;
   }

   @Override
   public int hashCode() {
      byte b0 = 59;
      int i = 1;
      i = i * 59 + (this.Spider() ? 79 : 97);
      i = i * 59 + (this.isPriority() ? 79 : 97);
      i = i * 59 + this.Elytramotion();
      ModuleInfo ii1llii1ll11i111lll1 = this.llIl1II1l1ll11();
      i = i * 59 + (ii1llii1ll11i111lll1 == null ? 43 : ii1llii1ll11i111lll1.hashCode());
      String s = this.getName();
      i = i * 59 + (s == null ? 43 : s.hashCode());
      Category iill11i1il1ilii11iii1llil1ll = this.getCategory();
      return i * 59 + (iill11i1il1ilii11iii1llil1ll == null ? 43 : iill11i1il1ilii11iii1llil1ll.hashCode());
   }

   @Override
   public String toString() {
      return "Module(info="
         + this.llIl1II1l1ll11()
         + ", name="
         + this.getName()
         + ", category="
         + this.getCategory()
         + ", enabled="
         + this.Spider()
         + ", priority="
         + this.isPriority()
         + ", keyCode="
         + this.Elytramotion()
         + ")";
   }
}
