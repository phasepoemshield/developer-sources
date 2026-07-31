package zenith.zov.client.screens.nlgui.style;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import zenith.ZenithInternal027;
import zenith.ByteBufferHolder;
import zenith.PatternHolder;

public class StyleManager {
   private final List<ZenithStyle> styles = new ArrayList<>();
   private ZenithStyle currentStyle;

   public StyleManager() {
      this.styles.addAll(this.createDefaultStyles());
      if (this.currentStyle == null && !this.styles.isEmpty()) {
         this.currentStyle = this.styles.getFirst();
      }
   }

   public ZenithStyle getCurrentStyle() {
      if (this.currentStyle != null) {
         return this.currentStyle;
      } else {
         return this.styles.isEmpty() ? null : this.styles.getFirst();
      }
   }

   private List<ZenithStyle> createDefaultStyles() {
      ArrayList arraylist = new ArrayList();
      arraylist.add(this.createDefaultStyle("Zenith", "#A6B2FF", "#C4A6FF", "#0E0E107A"));
      arraylist.add(this.createDefaultStyle("Recode", "#FF97A0", "#FFB897", "#100B0C7A"));
      arraylist.add(this.createDefaultStyle("Nebula", "#84EBB4", "#84D0EB", "#1116137A"));
      arraylist.add(this.createMistStyle());
      arraylist.add(this.createDefaultStyle("Obsidian Night", "#A897FF", "#CF97FF", "#06040C7A"));
      arraylist.add(this.createDefaultStyle("Arctic Frost", "#97DCFF", "#97FFEC", "#1416167A"));
      arraylist.add(this.createDefaultStyle("Ultraviolet", "#FFC197", "#FFE197", "#0D06017A"));
      arraylist.add(this.createDefaultStyle("Neon Blood Moon", "#F697FF", "#C197FF", "#1616167A"));
      arraylist.add(this.createDefaultStyle("Toxic Anarchy", "#326077", "#327756", "#0A0F117A"));
      arraylist.add(this.createDefaultStyle("Deep Ocean", "#AA193B", "#6E1950", "#1615157A"));
      arraylist.add(this.createDefaultStyle("Sunset Glow", "#FF6B35", "#FF356B", "#1A0D097A"));
      arraylist.add(this.createDefaultStyle("Cyberpunk 2077", "#FF00FF", "#00D4FF", "#1400147A"));
      return arraylist;
   }

   private ZenithStyle createDefaultStyle(String s, String s1, String s2, String s3) {
      ZenithStyle zenithstyle = new ZenithStyle(s);
      zenithstyle.getPrimaryColor().setColor(new ByteBufferHolder(s1));
      zenithstyle.getSecondaryPrimaryColor().setColor(new ByteBufferHolder(s2));
      zenithstyle.setDefaultsFromGuiStyle(new ByteBufferHolder(s3));
      return zenithstyle;
   }

   private ZenithStyle createMistStyle() {
      ZenithStyle zenithstyle = new ZenithStyle("Mist");
      zenithstyle.getPrimaryColor().setColor(new ByteBufferHolder("#7B8FA1"));
      zenithstyle.getSecondaryPrimaryColor().setColor(new ByteBufferHolder("#A5B6C7"));
      zenithstyle.getGlowColor1().setColor(new ByteBufferHolder("#7B8FA17A"));
      zenithstyle.getGlowColor2().setColor(new ByteBufferHolder("#7B8FA11F"));
      zenithstyle.setDefaultsFromGuiStyle();
      zenithstyle.getLeftBackground().setColor(new ByteBufferHolder("#FFFFFF7A").SecretKeySpecHolder(0.15F));
      zenithstyle.getRightBackground().setColor(new ByteBufferHolder("#FFFFFFB8").SecretKeySpecHolder(0.15F));
      zenithstyle.getPanelLeftBackground().setColor(new ByteBufferHolder("#FFFFFF7A").SecretKeySpecHolder(0.15F));
      zenithstyle.getSurfaceEnableBackground().setColor(new ByteBufferHolder("#F5F7FA3D").SecretKeySpecHolder(0.15F));
      zenithstyle.getHeaderDisableBackground().setColor(new ByteBufferHolder("#EEF2F73D").SecretKeySpecHolder(0.15F));
      zenithstyle.getSurfaceDisableBackground().setColor(new ByteBufferHolder("#EEF2F73D").SecretKeySpecHolder(0.15F));
      zenithstyle.getFieldSurfaceBackground().setColor(new ByteBufferHolder("#1E293B05").SecretKeySpecHolder(0.15F));
      zenithstyle.getFieldBorder().setColor(new ByteBufferHolder("#1E293B0A").SecretKeySpecHolder(0.15F));
      zenithstyle.getDisableActiveBg().setColor(new ByteBufferHolder("#64748B14").SecretKeySpecHolder(0.15F));
      zenithstyle.getTextEnable().setColor(new ByteBufferHolder("#1E293B"));
      zenithstyle.getTextSecondary().setColor(new ByteBufferHolder("#0F172AB8"));
      zenithstyle.getTextTertiary().setColor(new ByteBufferHolder("#3341557A"));
      return zenithstyle;
   }

   public JsonObject save() {
      JsonObject jsonobject = new JsonObject();
      JsonArray jsonarray = new JsonArray();

      for (ZenithStyle zenithstyle : this.styles) {
         JsonObject jsonobject1 = new JsonObject();
         zenithstyle.safe(jsonobject1);
         jsonarray.add(jsonobject1);
      }

      jsonobject.add("array", jsonarray);
      jsonobject.addProperty("select", this.currentStyle.getName());
      return jsonobject;
   }

   public void load(JsonObject jsonobject) {
      try {
         if (jsonobject.has("select")) {
            this.currentStyle = this.getStyleByName(jsonobject.get("select").getAsString());
         }

         if (jsonobject.has("array")) {
            for (JsonElement jsonelement : jsonobject.getAsJsonArray("array")) {
               if (jsonelement.isJsonObject()) {
                  ZenithStyle zenithstyle = this.getStyleByName(jsonelement.getAsJsonObject().get("name").getAsString());
                  zenithstyle.load(jsonelement.getAsJsonObject());
               }
            }
         }
      } catch (Exception exception) {
      }
   }

   public ZenithStyle getStyleByName(String s) {
      if (s == null) {
         return null;
      } else {
         for (ZenithStyle zenithstyle : this.styles) {
            if (s.equals(zenithstyle.getName())) {
               return zenithstyle;
            }
         }

         return null;
      }
   }

   public ZenithInternal027 getClientColor() {
      return ZenithInternal027.StringHolder_8(this.getClientColor(0), this.getClientColor(90), this.getClientColor(180), this.getClientColor(270));
   }

   public ByteBufferHolder getClientColor(int i) {
      return PatternHolder.StringHolder_8(
         4,
         i,
         this.getCurrentStyle().getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(),
         this.getCurrentStyle().getSecondaryPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
   }

   public ByteBufferHolder getGlowColor(int i) {
      return PatternHolder.StringHolder_8(
         4, i, this.getCurrentStyle().getGlowColor1().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.getCurrentStyle().getGlowColor2().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
   }

   public ZenithInternal027 getGlowColor() {
      return ZenithInternal027.StringHolder_8(this.getGlowColor(0), this.getGlowColor(90), this.getGlowColor(180), this.getGlowColor(270));
   }

   public List<ZenithStyle> getStyles() {
      return this.styles;
   }

   public void setCurrentStyle(ZenithStyle zenithstyle) {
      this.currentStyle = zenithstyle;
   }
}
