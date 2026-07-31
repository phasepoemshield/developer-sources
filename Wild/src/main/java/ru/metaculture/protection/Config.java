package ru.metaculture.protection;

import com.google.gson.JsonObject;
import java.io.File;
import java.util.HashMap;
import java.util.Map.Entry;
import org.wild.module.api.Module;

public final class Config implements JsonConfigSerializable {
   private final String O0000000000000;
   private final File O000000000000O;
   public O0000O00OOO00 O00000000 = new O0000O0O0000O(500, 1.0);
   public O0000O00OOO00 O000000000 = new O0000O0O0000O(300, 1.0);
   public O0000O00OOO00 O0000000000 = new O0000O0O0000O(300, 1.0);
   public O0000O00OOO00 O00000000000 = new O0000O0O0000O(300, 1.0);
   public O0000O00OOO00 O000000000000 = new O0000O0O0000O(500, 1.0);

   public Config(String string) {
      this.O0000000000000 = string;
      this.O000000000000O = new File(ConfigManager.O00000000, string + ".json");
      if (!this.O000000000000O.exists()) {
         try {
            File var2 = this.O000000000000O.getParentFile();
            if (var2 != null && !var2.exists() && !var2.mkdirs()) {
               System.out.println("[Config] Warning: failed to create parent dir for " + string);
            }

            if (!this.O000000000000O.createNewFile()) {
               System.out.println("[Config] Warning: failed to create file " + this.O000000000000O.getAbsolutePath());
            }
         } catch (Exception var3) {
            System.out.println("[Config] Cannot create config '" + string + "': " + var3.getMessage());
         }
      }
   }

   public File O00000000() {
      return this.O000000000000O;
   }

   public String O000000000() {
      return this.O0000000000000;
   }

   @Override
   public JsonObject O0000000000() {
      JsonObject var1 = new JsonObject();
      JsonObject var2 = new JsonObject();

      for (Module var4 : WildClient.O00000000.O000000000.O00000000) {
         JsonObject var5 = var4.b_();
         this.O00000000(var4, var5);
         var2.add(var4.O00000000000, var5);
      }

      var1.add("Features", var2);
      JsonObject var7 = new JsonObject();

      for (Entry var10 : O00000OO000O.O00000000().O000000000000().entrySet()) {
         JsonObject var6 = new JsonObject();
         var6.addProperty("x", ((O00000OO000O.W223)var10.getValue()).nx());
         var6.addProperty("y", ((O00000OO000O.W223)var10.getValue()).ny());
         var6.addProperty("scaleX", ((O00000OO000O.W223)var10.getValue()).scaleX());
         var6.addProperty("scaleY", ((O00000OO000O.W223)var10.getValue()).scaleY());
         var6.addProperty("resized", ((O00000OO000O.W223)var10.getValue()).userResized());
         var7.add((String)var10.getKey(), var6);
      }

      var1.add("DraggablePositions", var7);
      JsonObject var9 = new JsonObject();

      for (Entry var12 : O00000OO000O.O00000000().O0000000000000().entrySet()) {
         var9.addProperty((String)var12.getKey(), (Number)var12.getValue());
      }

      var1.add("PendingDraggableScales", var9);
      var1.add("HUDSettings", O000000000O0O0.O000000000000());
      return var1;
   }

   @Override
   public void O00000000(JsonObject jsonObject) {
      System.out.println("[Config] Loading config: " + this.O0000000000000);
      if (jsonObject != null) {
         boolean var2 = false;
         if (jsonObject.has("Features")) {
            JsonObject var3;
            try {
               var3 = jsonObject.getAsJsonObject("Features");
            } catch (Throwable var18) {
               System.out.println("[Config] 'Features' object malformed, skipping");
               var3 = null;
            }

            if (var3 != null) {
               this.O000000000(var3);
               int var4 = 0;

               for (Module var6 : WildClient.O00000000.O000000000.O00000000) {
                  try {
                     if (var6.O0000000000000) {
                        var6.O00000000(false);
                     }

                     if (WildClient.O00000000.O000000000.O00000000(var6) && var3.has(var6.O00000000000)) {
                        JsonObject var7 = null;

                        try {
                           var7 = var3.getAsJsonObject(var6.O00000000000);
                        } catch (Throwable var16) {
                        }

                        if (var7 != null) {
                           var2 |= this.O00000000(var6, var7);
                           var6.O00000000(var7);
                        }

                        if (var6.O0000000000000) {
                           var4++;
                        }
                     }
                  } catch (Throwable var17) {
                     System.out.println("[Config] Failed to load module '" + var6.O00000000000 + "': " + var17.getMessage());
                  }
               }
            }
         }

         if (jsonObject.has("HUDSettings")) {
            try {
               O000000000O0O0.O00000000(jsonObject.getAsJsonObject("HUDSettings"));
            } catch (Throwable var15) {
               System.out.println("[Config] Failed to load HUD settings: " + var15.getMessage());
            }
         }

         if (jsonObject.has("DraggablePositions")) {
            JsonObject var20 = jsonObject.getAsJsonObject("DraggablePositions");
            HashMap var22 = new HashMap();

            for (String var26 : var20.keySet()) {
               JsonObject var28 = var20.getAsJsonObject(var26);
               if (var28.has("x") && var28.has("y")) {
                  float var8 = var28.get("x").getAsFloat();
                  float var9 = var28.get("y").getAsFloat();
                  float var10 = var28.has("scaleX") ? var28.get("scaleX").getAsFloat() : 1.0F;
                  float var11 = var28.has("scaleY") ? var28.get("scaleY").getAsFloat() : 1.0F;
                  if (var10 > 10.0F || var10 <= 0.0F) {
                     var10 = 1.0F;
                  }

                  if (var11 > 10.0F || var11 <= 0.0F) {
                     var11 = 1.0F;
                  }

                  boolean var12 = var28.has("resized") && var28.get("resized").getAsBoolean();

                  try {
                     var22.put(var26, new O00000OO000O.W223(var8, var9, var10, var11, var12));
                  } catch (Exception var14) {
                     System.out.println("[Config] Failed to load position for: " + var26);
                  }
               }
            }

            O00000OO000O.O00000000().O00000000(var22);
            System.out.println("[Config] Loaded " + var22.size() + " draggable positions");
         }

         HashMap var21 = new HashMap();
         if (jsonObject.has("PendingDraggableScales")) {
            try {
               JsonObject var23 = jsonObject.getAsJsonObject("PendingDraggableScales");

               for (String var27 : var23.keySet()) {
                  float var29 = var23.get(var27).getAsFloat();
                  if (Float.isFinite(var29) && var29 > 0.0F && var29 <= 10.0F) {
                     var21.put(var27, var29);
                  }
               }
            } catch (Throwable var19) {
            }
         }

         O00000OO000O.O00000000().O000000000(var21);
         if (var2 && WildClient.O00000000 != null && WildClient.O00000000.O0000000000O00 != null) {
            WildClient.O00000000.O0000000000O00.O000000000(this.O0000000000000);
         }
      }
   }

   private void O000000000(JsonObject jsonObject) {
      if (jsonObject != null && jsonObject.has("NoRender")) {
         JsonObject var2 = null;

         try {
            var2 = jsonObject.getAsJsonObject("NoRender");
         } catch (Throwable var17) {
         }

         if (var2 != null && var2.has("Settings")) {
            JsonObject var3 = null;

            try {
               var3 = var2.getAsJsonObject("Settings");
            } catch (Throwable var16) {
            }

            if (var3 != null) {
               boolean var4 = false;

               try {
                  var4 = var2.has("enable") && var2.get("enable").getAsBoolean();
               } catch (Throwable var19) {
               }

               if (var4) {
                  JsonObject var5 = null;

                  try {
                     var5 = jsonObject.has("Removals") ? jsonObject.getAsJsonObject("Removals") : new JsonObject();
                  } catch (Throwable var15) {
                  }

                  if (var5 == null) {
                     var5 = new JsonObject();
                  }

                  JsonObject var6 = null;

                  try {
                     var6 = var5.has("Settings") ? var5.getAsJsonObject("Settings") : new JsonObject();
                  } catch (Throwable var14) {
                  }

                  if (var6 == null) {
                     var6 = new JsonObject();
                  }

                  boolean var7 = false;

                  try {
                     var7 = var5.has("enable") && var5.get("enable").getAsBoolean();
                  } catch (Throwable var18) {
                  }

                  if (var2.has("enable") && !var5.has("enable")) {
                     try {
                        var5.add("enable", var2.get("enable").deepCopy());
                     } catch (Throwable var13) {
                     }
                  }

                  if (!var7) {
                     var6.addProperty("Убрать траву", false);
                     var6.addProperty("Убрать растения", false);
                     var6.addProperty("Убрать стойки", false);
                     var6.addProperty("Убрать рамки", false);
                     var6.addProperty("Убрать картины", false);
                     var6.addProperty("Убрать дроп", false);
                     var6.addProperty("Убрать опыт", false);
                     var6.addProperty("Откл. диктор", false);
                  }

                  for (String var9 : var3.keySet()) {
                     if (!var6.has(var9)) {
                        try {
                           var6.add(var9, var3.get(var9).deepCopy());
                        } catch (Throwable var12) {
                        }
                     }
                  }

                  if (var3.has("Не рендерить") && !var6.has("Не рендерить")) {
                     try {
                        var6.add("Не рендерить", var3.get("Не рендерить").deepCopy());
                     } catch (Throwable var11) {
                     }
                  }

                  var5.add("Settings", var6);
                  jsonObject.add("Removals", var5);
               }
            }
         }
      }
   }

   private boolean O00000000(Module module, JsonObject jsonObject) {
      if (module == null || jsonObject == null) {
         return false;
      } else {
         return module instanceof UnHook ? jsonObject.remove("enable") != null : false;
      }
   }
}
