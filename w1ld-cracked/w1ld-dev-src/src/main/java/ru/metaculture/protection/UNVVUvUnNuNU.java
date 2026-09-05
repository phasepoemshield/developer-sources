package ru.metaculture.protection;

import com.google.gson.JsonObject;
import java.io.File;
import java.util.HashMap;
import java.util.Map.Entry;
import org.wild.module.api.Module;

public final class UNVVUvUnNuNU implements vNunuNNNVvuV {
   private final String nuUnNvnuUu;
   private final File VVuuUN;
   public UUVVvUvuNNn UuUVuuUu = new VUnvnVNv(500, 1.0);
   public UUVVvUvuNNn C00OOC00oO = new VUnvnVNv(300, 1.0);
   public UUVVvUvuNNn uUnuvNvvNU = new VUnvnVNv(300, 1.0);
   public UUVVvUvuNNn vVvUvVVuuNvV = new VUnvnVNv(300, 1.0);
   public UUVVvUvuNNn uNNnnnuuuN = new VUnvnVNv(500, 1.0);

   public UNVVUvUnNuNU(String var1) {
      this.nuUnNvnuUu = var1;
      this.VVuuUN = new File(NnunnNUUUNVn.UuUVuuUu, var1 + ".json");
      if (!this.VVuuUN.exists()) {
         try {
            File var2 = this.VVuuUN.getParentFile();
            if (var2 != null && !var2.exists() && !var2.mkdirs()) {
               System.out.println("[Config] Warning: failed to create parent dir for " + var1);
            }

            if (!this.VVuuUN.createNewFile()) {
               System.out.println("[Config] Warning: failed to create file " + this.VVuuUN.getAbsolutePath());
            }
         } catch (Exception var3) {
            System.out.println("[Config] Cannot create config '" + var1 + "': " + var3.getMessage());
         }
      }
   }

   public File UuUVuuUu() {
      return this.VVuuUN;
   }

   public String C00OOC00oO() {
      return this.nuUnNvnuUu;
   }

   @Override
   public JsonObject uUnuvNvvNU() {
      JsonObject var1 = new JsonObject();
      JsonObject var2 = new JsonObject();

      for (Module var4 : NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu) {
         JsonObject var5 = var4.b_();
         this.UuUVuuUu(var4, var5);
         var2.add(var4.vVvUvVVuuNvV, var5);
      }

      var1.add("Features", var2);
      JsonObject var7 = new JsonObject();

      for (Entry var10 : nNuUNVu.UuUVuuUu().uNNnnnuuuN().entrySet()) {
         JsonObject var6 = new JsonObject();
         var6.addProperty("x", ((nNuUNVu.VUnuUnnuNvVu)var10.getValue()).nx());
         var6.addProperty("y", ((nNuUNVu.VUnuUnnuNvVu)var10.getValue()).ny());
         var6.addProperty("scaleX", ((nNuUNVu.VUnuUnnuNvVu)var10.getValue()).scaleX());
         var6.addProperty("scaleY", ((nNuUNVu.VUnuUnnuNvVu)var10.getValue()).scaleY());
         var6.addProperty("resized", ((nNuUNVu.VUnuUnnuNvVu)var10.getValue()).userResized());
         var7.add((String)var10.getKey(), var6);
      }

      var1.add("DraggablePositions", var7);
      JsonObject var9 = new JsonObject();

      for (Entry var12 : nNuUNVu.UuUVuuUu().nuUnNvnuUu().entrySet()) {
         var9.addProperty((String)var12.getKey(), (Number)var12.getValue());
      }

      var1.add("PendingDraggableScales", var9);
      var1.add("HUDSettings", uNvNvUNUnuu.uNNnnnuuuN());
      return var1;
   }

   @Override
   public void UuUVuuUu(JsonObject var1) {
      System.out.println("[Config] Loading config: " + this.nuUnNvnuUu);
      if (var1 != null) {
         boolean var2 = false;
         if (var1.has("Features")) {
            JsonObject var3;
            try {
               var3 = var1.getAsJsonObject("Features");
            } catch (Throwable var18) {
               System.out.println("[Config] 'Features' object malformed, skipping");
               var3 = null;
            }

            if (var3 != null) {
               this.C00OOC00oO(var3);
               int var4 = 0;

               for (Module var6 : NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu) {
                  try {
                     if (var6.nuUnNvnuUu) {
                        var6.UuUVuuUu(false);
                     }

                     if (NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(var6) && var3.has(var6.vVvUvVVuuNvV)) {
                        JsonObject var7 = null;

                        try {
                           var7 = var3.getAsJsonObject(var6.vVvUvVVuuNvV);
                        } catch (Throwable var16) {
                        }

                        if (var7 != null) {
                           var2 |= this.UuUVuuUu(var6, var7);
                           var6.UuUVuuUu(var7);
                        }

                        if (var6.nuUnNvnuUu) {
                           var4++;
                        }
                     }
                  } catch (Throwable var17) {
                     System.out.println("[Config] Failed to load module '" + var6.vVvUvVVuuNvV + "': " + var17.getMessage());
                  }
               }
            }
         }

         if (var1.has("HUDSettings")) {
            try {
               uNvNvUNUnuu.UuUVuuUu(var1.getAsJsonObject("HUDSettings"));
            } catch (Throwable var15) {
               System.out.println("[Config] Failed to load HUD settings: " + var15.getMessage());
            }
         }

         if (var1.has("DraggablePositions")) {
            JsonObject var20 = var1.getAsJsonObject("DraggablePositions");
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
                     var22.put(var26, new nNuUNVu.VUnuUnnuNvVu(var8, var9, var10, var11, var12));
                  } catch (Exception var14) {
                     System.out.println("[Config] Failed to load position for: " + var26);
                  }
               }
            }

            nNuUNVu.UuUVuuUu().UuUVuuUu(var22);
            System.out.println("[Config] Loaded " + var22.size() + " draggable positions");
         }

         HashMap var21 = new HashMap();
         if (var1.has("PendingDraggableScales")) {
            try {
               JsonObject var23 = var1.getAsJsonObject("PendingDraggableScales");

               for (String var27 : var23.keySet()) {
                  float var29 = var23.get(var27).getAsFloat();
                  if (Float.isFinite(var29) && var29 > 0.0F && var29 <= 10.0F) {
                     var21.put(var27, var29);
                  }
               }
            } catch (Throwable var19) {
            }
         }

         nNuUNVu.UuUVuuUu().C00OOC00oO(var21);
         if (var2 && NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
            NVnVnNnN.UuUVuuUu.nUUVuvU.C00OOC00oO(this.nuUnNvnuUu);
         }
      }
   }

   private void C00OOC00oO(JsonObject var1) {
      if (var1 != null && var1.has("NoRender")) {
         JsonObject var2 = null;

         try {
            var2 = var1.getAsJsonObject("NoRender");
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
                     var5 = var1.has("Removals") ? var1.getAsJsonObject("Removals") : new JsonObject();
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
                  var1.add("Removals", var5);
               }
            }
         }
      }
   }

   private boolean UuUVuuUu(Module var1, JsonObject var2) {
      if (var1 == null || var2 == null) {
         return false;
      } else {
         return var1 instanceof UnHook ? var2.remove("enable") != null : false;
      }
   }
}
