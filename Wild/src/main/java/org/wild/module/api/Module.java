package org.wild.module.api;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.Generated;
import net.minecraft.client.MinecraftClient;
import ru.metaculture.protection.BooleanSetting;
import ru.metaculture.protection.ButtonSetting;
import ru.metaculture.protection.Category;
import ru.metaculture.protection.ClientUtil;
import ru.metaculture.protection.ColorSetting;
import ru.metaculture.protection.EventManager;
import ru.metaculture.protection.GroupSetting;
import ru.metaculture.protection.KeybindSetting;
import ru.metaculture.protection.MenuModule;
import ru.metaculture.protection.ModeSetting;
import ru.metaculture.protection.ModuleAccess;
import ru.metaculture.protection.MultiSelectSetting;
import ru.metaculture.protection.NotificationsHud;
import ru.metaculture.protection.NumberSetting;
import ru.metaculture.protection.O0000000OO0OOO;
import ru.metaculture.protection.O0000000OOO000;
import ru.metaculture.protection.O0000000OOOO00;
import ru.metaculture.protection.O000000O0;
import ru.metaculture.protection.O000000O00;
import ru.metaculture.protection.O0000O00O0OO;
import ru.metaculture.protection.O0000O00OOO00;
import ru.metaculture.protection.O0000O00OOOO;
import ru.metaculture.protection.O0000O00OOOOOO;
import ru.metaculture.protection.O0000O0O00;
import ru.metaculture.protection.O0000O0O0000O;
import ru.metaculture.protection.O0000O0O00OOO;
import ru.metaculture.protection.Setting;
import ru.metaculture.protection.TextArraySetting;
import ru.metaculture.protection.TextSetting;
import ru.metaculture.protection.WildClient;

public class Module extends O0000000OOO000 {
   private static final String O000000000O = "Сброс настроек";
   private static final String O000000000O0 = "До заводских";
   public ModuleRegister O00000000 = this.getClass().getAnnotation(ModuleRegister.class);
   public ModuleAccess O000000000 = this.getClass().getAnnotation(ModuleAccess.class);
   public static MinecraftClient O0000000000 = MinecraftClient.getInstance();
   public String O00000000000;
   public int O000000000000;
   public boolean O0000000000000;
   public boolean O000000000000O = false;
   public Category O00000000000O;
   public String O00000000000O0;
   public String O00000000000OO;
   public boolean O0000000000O;
   public boolean O0000000000O0 = true;
   public O0000O00OOOO O0000000000O00 = new O0000O00OOOO(0.0F, 0.0F);
   private final Set<O0000000OO0OOO> O000000000O00 = new HashSet<>();
   private boolean O000000000O000;
   private final O0000000OOOO00 O000000000O00O = new O0000000OOOO00("Сброс настроек", 0, () -> "До заводских").O000000000(this::O0000000000O0);
   public O0000O00O0OO O0000000000O0O = new O0000O00O0OO();
   public O0000O00OOO00 O0000000000OO = new O0000O0O0000O(300, 1.0);
   public O0000O00OOO00 O0000000000OO0 = new O0000O0O0000O(300, 1.0);
   public final O0000O00OOOOOO O0000000000OOO = new O0000O00OOOOOO();

   public Module() {
      this.O00000000000 = this.O00000000.O00000000();
      this.O00000000000O = this.O00000000.O0000000000();
      this.O000000000000 = -1;
      this.O0000000000000 = false;
      this.O00000000000OO = this.O00000000.O000000000();
      this.O00000000000O0 = this.O00000000000;
      Collections.addAll(this.O000000000O00, this.O00000000.O00000000000());
   }

   public void O00000000() {
      try {
         EventManager.O00000000(this);
      } catch (Exception var2) {
         var2.printStackTrace();
         this.O0000000000000 = false;
         return;
      }

      if (O0000000000.player != null && !(this instanceof MenuModule)) {
         NotificationsHud.O00000000(this.O00000000000, true);
         if (WildClient.O00000000.O000000000.O00000000(ClientUtil.class).O0000000000000
            && ClientUtil.O000000000O0.O0000000000()
            && ClientUtil.O000000000O00.O000000000("Модули")) {
            O0000O0O00OOO.O00000000("Function_ON", ClientUtil.O000000000O000.O0000000000() / 250.0F);
         }
      }

      this.O0000000000OOO.O00000000(1.0, 0.24F, O0000O0O00.O0000000000O0O);
   }

   public void O000000000() {
      EventManager.O000000000(this);
      if (O0000000000.player != null && !WildClient.O000000000OO00() && !(this instanceof MenuModule)) {
         NotificationsHud.O00000000(this.O00000000000, false);
         if (WildClient.O00000000.O000000000.O00000000(ClientUtil.class).O0000000000000
            && ClientUtil.O000000000O0.O0000000000()
            && ClientUtil.O000000000O00.O000000000("Модули")) {
            O0000O0O00OOO.O00000000("Function_OFF", ClientUtil.O000000000O000.O0000000000() / 250.0F);
         }
      }

      this.O0000000000OOO.O00000000(0.0, 0.24F, O0000O0O00.O0000000000O0O);
   }

   public void a_() {
      this.O00000000(!this.O0000000000000, true);
   }

   public JsonObject b_() {
      JsonObject var1 = new JsonObject();
      if (this.O0000000000000) {
         var1.addProperty("enable", this.O0000000000000);
      }

      if (this.O000000000000 != -1) {
         var1.addProperty("keyIndex", this.O000000000000);
      }

      JsonObject var2 = new JsonObject();

      for (Object var4 : this.O0000000000O()) {
         if (var4 != null && !((Setting)var4).O0000000000) {
            String var5 = ((Setting)var4).O00000000();
            switch (var4) {
               case BooleanSetting var8:
                  var2.addProperty(var5, var8.O00000000000());
                  if (var8.O0000000000000 != -1) {
                     JsonObject var23 = new JsonObject();
                     var23.addProperty("key", var8.O0000000000000);
                     var23.addProperty("hold", var8.O000000000000O);
                     var2.add(var5 + "$bind", var23);
                  }
                  break;
               case ModeSetting var9:
                  var2.addProperty(var5, var9.O000000000000);
                  break;
               case O000000O00 var10:
                  var2.addProperty(var5, var10.O000000000000O());
                  break;
               case MultiSelectSetting var11:
                  var2.addProperty(var5, String.join(", ", var11.O000000000000O));
                  break;
               case NumberSetting var12:
                  var2.addProperty(var5, var12.O00000000000);
                  break;
               case KeybindSetting var13:
                  var2.addProperty(var5, var13.O00000000000);
                  break;
               case TextSetting var14:
                  var2.addProperty(var5, var14.O000000000000);
                  break;
               case TextArraySetting var15:
                  var2.add(var5, var15.O000000000000O());
                  break;
               case ColorSetting var16:
                  JsonObject var24 = new JsonObject();
                  var24.addProperty("current", var16.O000000000000);
                  var24.addProperty("saturation", var16.O0000000000O00);
                  var24.addProperty("brightness", var16.O0000000000O0O);
                  var2.add(var5, var24);
                  break;
               case GroupSetting var25:
                  GroupSetting var17 = (GroupSetting)var4;
                  JsonObject var18 = new JsonObject();
                  JsonObject var19 = new JsonObject();

                  for (BooleanSetting var21 : var17.O00000000000) {
                     var18.addProperty(var21.O00000000, var21.O00000000000());
                     if (var21.O0000000000000 != -1) {
                        JsonObject var22 = new JsonObject();
                        var22.addProperty("key", var21.O0000000000000);
                        var22.addProperty("hold", var21.O000000000000O);
                        var19.add(var21.O00000000, var22);
                     }
                  }

                  var2.add(var5, var18);
                  if (var19.size() > 0) {
                     var2.add(var5 + "$binds", var19);
                  }
                  continue;
               default:
            }
         }
      }

      var1.add("Settings", var2);
      return var1;
   }

   public void O00000000(JsonObject jsonObject) {
      if (jsonObject != null) {
         try {
            if (jsonObject.has("enable")) {
               this.O00000000(jsonObject.get("enable").getAsBoolean());
            }
         } catch (Throwable var31) {
         }

         try {
            if (jsonObject.has("keyIndex")) {
               this.O000000000000 = jsonObject.get("keyIndex").getAsInt();
            }
         } catch (Throwable var30) {
         }

         JsonObject var2 = null;

         try {
            var2 = jsonObject.getAsJsonObject("Settings");
         } catch (Throwable var29) {
         }

         if (var2 != null) {
            for (Object var4 : this.O0000000000O()) {
               if (var4 != null && !((Setting)var4).O0000000000) {
                  String var5 = ((Setting)var4).O00000000();
                  if (var2.has(var5)) {
                     try {
                        switch (var4) {
                           case BooleanSetting var8:
                              var8.O000000000(var2.get(var5).getAsBoolean());
                              JsonElement var33 = var2.get(var5 + "$bind");
                              if (var33 != null && var33.isJsonObject()) {
                                 JsonObject var35 = var33.getAsJsonObject();
                                 if (var35.has("key")) {
                                    var8.O0000000000000 = var35.get("key").getAsInt();
                                 }

                                 if (var35.has("hold")) {
                                    var8.O000000000000O = var35.get("hold").getAsBoolean();
                                 }
                              }
                              break;
                           case ModeSetting var9:
                              String var34 = var2.get(var5).getAsString();
                              if (var9.O00000000000 != null && var9.O00000000000.contains(var34)) {
                                 var9.O000000000000 = var34;
                                 var9.O00000000000O = var9.O00000000000.indexOf(var34);
                              }
                              break;
                           case NumberSetting var10:
                              float var36 = var2.get(var5).getAsFloat();
                              if (!Float.isNaN(var36) && !Float.isInfinite(var36)) {
                                 var10.O00000000000 = Math.max(var10.O000000000000, Math.min(var10.O0000000000000, var36));
                              }
                              break;
                           case O000000O00 var11:
                              var11.O0000000000(var2.get(var5).getAsString());
                              break;
                           case KeybindSetting var12:
                              var12.O00000000000 = var2.get(var5).getAsInt();
                              break;
                           case TextSetting var13:
                              var13.O000000000(var2.get(var5).getAsString());
                              break;
                           case TextArraySetting var14:
                              var14.O00000000(var2.get(var5));
                              break;
                           case ColorSetting var15:
                              JsonElement var37 = var2.get(var5);
                              if (var37 != null && var37.isJsonObject()) {
                                 JsonObject var40 = var37.getAsJsonObject();
                                 if (var40.has("current")) {
                                    float var43 = var40.get("current").getAsFloat();
                                    if (!Float.isNaN(var43) && !Float.isInfinite(var43)) {
                                       var15.O000000000000 = Math.max(var15.O0000000000000, Math.min(var15.O000000000000O, var43));
                                    }
                                 }

                                 if (var40.has("saturation")) {
                                    float var44 = var40.get("saturation").getAsFloat();
                                    if (!Float.isNaN(var44) && !Float.isInfinite(var44)) {
                                       var15.O0000000000O00 = Math.max(0.0F, Math.min(1.0F, var44));
                                    }
                                 }

                                 if (var40.has("brightness")) {
                                    float var45 = var40.get("brightness").getAsFloat();
                                    if (!Float.isNaN(var45) && !Float.isInfinite(var45)) {
                                       var15.O0000000000O0O = Math.max(0.0F, Math.min(1.0F, var45));
                                    }
                                 }
                              } else if (var37 != null) {
                                 float var39 = var37.getAsFloat();
                                 if (!Float.isNaN(var39) && !Float.isInfinite(var39)) {
                                    var15.O000000000000 = Math.max(var15.O0000000000000, Math.min(var15.O000000000000O, var39));
                                 }
                              }
                              break;
                           case GroupSetting var52:
                              GroupSetting var16 = (GroupSetting)var4;
                              JsonElement var38 = var2.get(var5);
                              if (var38 != null && var38.isJsonObject()) {
                                 JsonObject var41 = var38.getAsJsonObject();

                                 for (BooleanSetting var48 : var16.O00000000000) {
                                    if (var41.has(var48.O00000000)) {
                                       try {
                                          var48.O000000000(var41.get(var48.O00000000).getAsBoolean());
                                       } catch (Throwable var28) {
                                       }
                                    }
                                 }
                              }

                              JsonElement var42 = var2.get(var5 + "$binds");
                              if (var42 != null && var42.isJsonObject()) {
                                 JsonObject var47 = var42.getAsJsonObject();

                                 for (BooleanSetting var50 : var16.O00000000000) {
                                    if (var47.has(var50.O00000000)) {
                                       try {
                                          JsonObject var51 = var47.getAsJsonObject(var50.O00000000);
                                          if (var51.has("key")) {
                                             var50.O0000000000000 = var51.get("key").getAsInt();
                                          }

                                          if (var51.has("hold")) {
                                             var50.O000000000000O = var51.get("hold").getAsBoolean();
                                          }
                                       } catch (Throwable var27) {
                                       }
                                    }
                                 }
                              }
                              break;
                           case MultiSelectSetting var17:
                              var17.O0000000000();
                              JsonElement var18 = var2.get(var5);
                              if (var18 != null) {
                                 String var19 = var18.getAsString();
                                 String[] var20 = var19.split(",");
                                 ArrayList var21 = new ArrayList();

                                 for (String var25 : var20) {
                                    if (var25 != null) {
                                       String var26 = var25.trim();
                                       if (!var26.isEmpty() && var17.O00000000000 != null && var17.O00000000000.contains(var26)) {
                                          var21.add(var26);
                                       }
                                    }
                                 }

                                 var17.O000000000000O = var21;
                              }
                              break;
                           default:
                        }
                     } catch (Throwable var32) {
                     }
                  }
               }
            }
         }
      }
   }

   public void O00000000(boolean bl) {
      this.O00000000(bl, false);
   }

   public void O000000000(boolean bl) {
      this.O00000000(bl);
   }

   public void c_() {
      if (this.O0000000000000) {
         this.O00000000(false);
      }

      this.O000000000000 = -1;
      this.O000000000000O = false;
      this.O0000000000O = false;

      for (Setting var2 : this.O0000000000O()) {
         if (var2 != null && !var2.O0000000000) {
            var2.O000000000();
         }
      }
   }

   @Override
   public List<Setting> O0000000000000() {
      List var1 = super.O0000000000000();
      if (this.O0000000000O00()) {
         var1.add(this.O000000000O00O);
      }

      return var1;
   }

   private void O0000000000O0() {
      for (Setting var2 : this.O0000000000O()) {
         if (this.O00000000(var2)) {
            var2.O000000000();
         }
      }

      if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O00 != null) {
         WildClient.O00000000.O0000000000O00.O0000000000();
      }
   }

   private boolean O0000000000O00() {
      for (Setting var2 : this.O0000000000O()) {
         if (this.O00000000(var2)) {
            return true;
         }
      }

      return false;
   }

   private boolean O00000000(Setting o0000000OOO00O) {
      return o0000000OOO00O != null
         && o0000000OOO00O != this.O000000000O00O
         && !o0000000OOO00O.O0000000000
         && !(o0000000OOO00O instanceof ButtonSetting)
         && !(o0000000OOO00O instanceof O000000O0);
   }

   public Module O00000000(O0000000OO0OOO o0000000OO0OOO) {
      if (o0000000OO0OOO != null) {
         this.O000000000O00.add(o0000000OO0OOO);
      }

      return this;
   }

   public Module O00000000(O0000000OO0OOO... o0000000OO0OOOs) {
      if (o0000000OO0OOOs != null) {
         Collections.addAll(this.O000000000O00, o0000000OO0OOOs);
         this.O000000000O00.remove(null);
      }

      return this;
   }

   public boolean O000000000(O0000000OO0OOO o0000000OO0OOO) {
      return o0000000OO0OOO != null && this.O000000000O00.contains(o0000000OO0OOO);
   }

   public Set<O0000000OO0OOO> O000000000000O() {
      return Collections.unmodifiableSet(this.O000000000O00);
   }

   private void O00000000(boolean bl, boolean bl2) {
      if (bl && WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null && !WildClient.O00000000.O000000000.O00000000(this)) {
         this.O0000000000000 = false;
      } else if (this.O0000000000000 != bl) {
         this.O0000000000000 = bl;
         if (bl) {
            this.O00000000();
         } else {
            this.O000000000();
         }

         if (bl2 && WildClient.O00000000 != null && WildClient.O00000000.O0000000000O00 != null) {
            WildClient.O00000000.O0000000000O00.O0000000000();
         }
      }
   }

   private void O0000000000O0O() {
      if (!this.O000000000O000 && O0000000000.player != null && (this.O000000000(O0000000OO0OOO.RISKY) || this.O000000000(O0000000OO0OOO.PATCHED))) {
         this.O000000000O000 = true;
         String var1 = this.O000000000(O0000000OO0OOO.RISKY) && this.O000000000(O0000000OO0OOO.PATCHED)
            ? "Risky/Patched"
            : (this.O000000000(O0000000OO0OOO.RISKY) ? "Risky" : "Patched");
         NotificationsHud.O00000000("warn", "Warning: " + this.O00000000000 + " is currently flagged as " + var1 + ".", 3500L);
      }
   }

   @Generated
   public ModuleAccess O00000000000O() {
      return this.O000000000;
   }

   @Generated
   public int O00000000000O0() {
      return this.O000000000000;
   }

   @Generated
   public String O00000000000OO() {
      return this.O00000000000O0;
   }
}
