package org.wild.module.api;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.Generated;
import net.minecraft.class_310;
import ru.metaculture.protection.NNnVUnVnVUVn;
import ru.metaculture.protection.NNnnunNVu;
import ru.metaculture.protection.NUvnVVNvvu;
import ru.metaculture.protection.NVnVVNVNnv;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.NVuVVUNUvV;
import ru.metaculture.protection.NnNvuuvuNu;
import ru.metaculture.protection.UNNVUuvVNNuv;
import ru.metaculture.protection.UUVVvUvuNNn;
import ru.metaculture.protection.UnUnNvvu;
import ru.metaculture.protection.UvNnUnuNUUU;
import ru.metaculture.protection.VUVnvvnNN;
import ru.metaculture.protection.VUnvnVNv;
import ru.metaculture.protection.VVnnnnN;
import ru.metaculture.protection.VnnUVUVvV;
import ru.metaculture.protection.VnnUvVNuNuVv;
import ru.metaculture.protection.VnuVvnV;
import ru.metaculture.protection.ili11Iii1Ii;
import ru.metaculture.protection.nNUuNvVn;
import ru.metaculture.protection.nuVVunNUnVnv;
import ru.metaculture.protection.nuunVnvU;
import ru.metaculture.protection.nvUuvVvuuN;
import ru.metaculture.protection.oOOOo0;
import ru.metaculture.protection.uNUunUnnnVu;
import ru.metaculture.protection.uVNuNUVvn;
import ru.metaculture.protection.uVUNNUnNvU;
import ru.metaculture.protection.uVVuNvUUV;
import ru.metaculture.protection.vNnVvvNU;
import ru.metaculture.protection.vnnunVnunuN;
import ru.metaculture.protection.vvNnnUNnVvn;

public class Module extends NNnnunNVu {
   private static final String NVNnnvnuunNv = "Сброс настроек";
   private static final String uVunuUNVVUUV = "До заводских";
   public ModuleRegister UuUVuuUu = this.getClass().getAnnotation(ModuleRegister.class);
   public uNUunUnnnVu C00OOC00oO = this.getClass().getAnnotation(uNUunUnnnVu.class);
   public static class_310 uUnuvNvvNU = class_310.method_1551();
   public String vVvUvVVuuNvV;
   public int uNNnnnuuuN;
   public boolean nuUnNvnuUu;
   public boolean VVuuUN = false;
   public oOOOo0 vNUvnnVnUvu;
   public String uVUuuVnNVU;
   public String vuuuNvNuv;
   public boolean nvUVNnuu;
   public boolean UuuNnUvUuv = true;
   public UnUnNvvu nUUVuvU = new UnUnNvvu(0.0F, 0.0F);
   private final Set<uVUNNUnNvU> UNnVVNvvnVvU = new HashSet<>();
   private boolean uNnUnnuNUnNu;
   private final UNNVUuvVNNuv NnUuNNU = new UNNVUuvVNNuv("Сброс настроек", 0, () -> "До заводских").C00OOC00oO(this::UuuNnUvUuv);
   public VVnnnnN UnUNVVVNuv = new VVnnnnN();
   public UUVVvUvuNNn vNVuvnUUnuUn = new VUnvnVNv(300, 1.0);
   public UUVVvUvuNNn UvnvNVnnnnNU = new VUnvnVNv(300, 1.0);
   public final uVVuNvUUV uVUVnuvnuVuv = new uVVuNvUUV();

   public Module() {
      this.vVvUvVVuuNvV = this.UuUVuuUu.UuUVuuUu();
      this.vNUvnnVnUvu = this.UuUVuuUu.uUnuvNvvNU();
      this.uNNnnnuuuN = -1;
      this.nuUnNvnuUu = false;
      this.vuuuNvNuv = this.UuUVuuUu.C00OOC00oO();
      this.uVUuuVnNVU = this.vVvUvVVuuNvV;
      Collections.addAll(this.UNnVVNvvnVvU, this.UuUVuuUu.vVvUvVVuuNvV());
   }

   public void UuUVuuUu() {
      try {
         NUvnVVNvvu.UuUVuuUu(this);
      } catch (Exception var2) {
         var2.printStackTrace();
         this.nuUnNvnuUu = false;
         return;
      }

      if (uUnuvNvvNU.field_1724 != null && !(this instanceof NnNvuuvuNu)) {
         nuVVunNUnVnv.UuUVuuUu(this.vVvUvVVuuNvV, true);
         if (NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(NNnVUnVnVUVn.class).nuUnNvnuUu
            && NNnVUnVnVUVn.uVunuUNVVUUV.uUnuvNvvNU()
            && NNnVUnVnVUVn.UNnVVNvvnVvU.C00OOC00oO("Модули")) {
            vnnunVnunuN.UuUVuuUu("Function_ON", NNnVUnVnVUVn.uNnUnnuNUnNu.uUnuvNvvNU() / 250.0F);
         }
      }

      this.uVUVnuvnuVuv.UuUVuuUu(1.0, 0.24F, VnuVvnV.UnUNVVVNuv);
   }

   public void C00OOC00oO() {
      NUvnVVNvvu.C00OOC00oO(this);
      if (uUnuvNvvNU.field_1724 != null && !NVnVnNnN.NuunnvnN() && !(this instanceof NnNvuuvuNu)) {
         nuVVunNUnVnv.UuUVuuUu(this.vVvUvVVuuNvV, false);
         if (NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(NNnVUnVnVUVn.class).nuUnNvnuUu
            && NNnVUnVnVUVn.uVunuUNVVUUV.uUnuvNvvNU()
            && NNnVUnVnVUVn.UNnVVNvvnVvU.C00OOC00oO("Модули")) {
            vnnunVnunuN.UuUVuuUu("Function_OFF", NNnVUnVnVUVn.uNnUnnuNUnNu.uUnuvNvvNU() / 250.0F);
         }
      }

      this.uVUVnuvnuVuv.UuUVuuUu(0.0, 0.24F, VnuVvnV.UnUNVVVNuv);
   }

   public void a_() {
      this.UuUVuuUu(!this.nuUnNvnuUu, true);
   }

   public JsonObject b_() {
      JsonObject var1 = new JsonObject();
      if (this.nuUnNvnuUu) {
         var1.addProperty("enable", this.nuUnNvnuUu);
      }

      if (this.uNNnnnuuuN != -1) {
         var1.addProperty("keyIndex", this.uNNnnnuuuN);
      }

      JsonObject var2 = new JsonObject();

      for (Object var4 : this.nvUVNnuu()) {
         if (var4 != null && !((nvUuvVvuuN)var4).uUnuvNvvNU) {
            String var5 = ((nvUuvVvuuN)var4).UuUVuuUu();
            switch (var4) {
               case vvNnnUNnVvn var8:
                  var2.addProperty(var5, var8.vVvUvVVuuNvV());
                  if (var8.nuUnNvnuUu != -1) {
                     JsonObject var23 = new JsonObject();
                     var23.addProperty("key", var8.nuUnNvnuUu);
                     var23.addProperty("hold", var8.VVuuUN);
                     var2.add(var5 + "$bind", var23);
                  }
                  break;
               case UvNnUnuNUUU var9:
                  var2.addProperty(var5, var9.uNNnnnuuuN);
                  break;
               case ili11Iii1Ii var10:
                  var2.addProperty(var5, var10.VVuuUN());
                  break;
               case nuunVnvU var11:
                  var2.addProperty(var5, String.join(", ", var11.VVuuUN));
                  break;
               case nNUuNvVn var12:
                  var2.addProperty(var5, var12.vVvUvVVuuNvV);
                  break;
               case uVNuNUVvn var13:
                  var2.addProperty(var5, var13.vVvUvVVuuNvV);
                  break;
               case NVuVVUNUvV var14:
                  var2.addProperty(var5, var14.uNNnnnuuuN);
                  break;
               case NVnVVNVNnv var15:
                  var2.add(var5, var15.VVuuUN());
                  break;
               case VnnUvVNuNuVv var16:
                  JsonObject var24 = new JsonObject();
                  var24.addProperty("current", var16.uNNnnnuuuN);
                  var24.addProperty("saturation", var16.nUUVuvU);
                  var24.addProperty("brightness", var16.UnUNVVVNuv);
                  var2.add(var5, var24);
                  break;
               case VUVnvvnNN var25:
                  VUVnvvnNN var17 = (VUVnvvnNN)var4;
                  JsonObject var18 = new JsonObject();
                  JsonObject var19 = new JsonObject();

                  for (vvNnnUNnVvn var21 : var17.vVvUvVVuuNvV) {
                     var18.addProperty(var21.UuUVuuUu, var21.vVvUvVVuuNvV());
                     if (var21.nuUnNvnuUu != -1) {
                        JsonObject var22 = new JsonObject();
                        var22.addProperty("key", var21.nuUnNvnuUu);
                        var22.addProperty("hold", var21.VVuuUN);
                        var19.add(var21.UuUVuuUu, var22);
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

   public void UuUVuuUu(JsonObject var1) {
      if (var1 != null) {
         try {
            if (var1.has("enable")) {
               this.UuUVuuUu(var1.get("enable").getAsBoolean());
            }
         } catch (Throwable var31) {
         }

         try {
            if (var1.has("keyIndex")) {
               this.uNNnnnuuuN = var1.get("keyIndex").getAsInt();
            }
         } catch (Throwable var30) {
         }

         JsonObject var2 = null;

         try {
            var2 = var1.getAsJsonObject("Settings");
         } catch (Throwable var29) {
         }

         if (var2 != null) {
            for (Object var4 : this.nvUVNnuu()) {
               if (var4 != null && !((nvUuvVvuuN)var4).uUnuvNvvNU) {
                  String var5 = ((nvUuvVvuuN)var4).UuUVuuUu();
                  if (var2.has(var5)) {
                     try {
                        switch (var4) {
                           case vvNnnUNnVvn var8:
                              var8.C00OOC00oO(var2.get(var5).getAsBoolean());
                              JsonElement var33 = var2.get(var5 + "$bind");
                              if (var33 != null && var33.isJsonObject()) {
                                 JsonObject var35 = var33.getAsJsonObject();
                                 if (var35.has("key")) {
                                    var8.nuUnNvnuUu = var35.get("key").getAsInt();
                                 }

                                 if (var35.has("hold")) {
                                    var8.VVuuUN = var35.get("hold").getAsBoolean();
                                 }
                              }
                              break;
                           case UvNnUnuNUUU var9:
                              String var34 = var2.get(var5).getAsString();
                              if (var9.vVvUvVVuuNvV != null && var9.vVvUvVVuuNvV.contains(var34)) {
                                 var9.uNNnnnuuuN = var34;
                                 var9.vNUvnnVnUvu = var9.vVvUvVVuuNvV.indexOf(var34);
                              }
                              break;
                           case nNUuNvVn var10:
                              float var36 = var2.get(var5).getAsFloat();
                              if (!Float.isNaN(var36) && !Float.isInfinite(var36)) {
                                 var10.vVvUvVVuuNvV = Math.max(var10.uNNnnnuuuN, Math.min(var10.nuUnNvnuUu, var36));
                              }
                              break;
                           case ili11Iii1Ii var11:
                              var11.uUnuvNvvNU(var2.get(var5).getAsString());
                              break;
                           case uVNuNUVvn var12:
                              var12.vVvUvVVuuNvV = var2.get(var5).getAsInt();
                              break;
                           case NVuVVUNUvV var13:
                              var13.C00OOC00oO(var2.get(var5).getAsString());
                              break;
                           case NVnVVNVNnv var14:
                              var14.UuUVuuUu(var2.get(var5));
                              break;
                           case VnnUvVNuNuVv var15:
                              JsonElement var37 = var2.get(var5);
                              if (var37 != null && var37.isJsonObject()) {
                                 JsonObject var40 = var37.getAsJsonObject();
                                 if (var40.has("current")) {
                                    float var43 = var40.get("current").getAsFloat();
                                    if (!Float.isNaN(var43) && !Float.isInfinite(var43)) {
                                       var15.uNNnnnuuuN = Math.max(var15.nuUnNvnuUu, Math.min(var15.VVuuUN, var43));
                                    }
                                 }

                                 if (var40.has("saturation")) {
                                    float var44 = var40.get("saturation").getAsFloat();
                                    if (!Float.isNaN(var44) && !Float.isInfinite(var44)) {
                                       var15.nUUVuvU = Math.max(0.0F, Math.min(1.0F, var44));
                                    }
                                 }

                                 if (var40.has("brightness")) {
                                    float var45 = var40.get("brightness").getAsFloat();
                                    if (!Float.isNaN(var45) && !Float.isInfinite(var45)) {
                                       var15.UnUNVVVNuv = Math.max(0.0F, Math.min(1.0F, var45));
                                    }
                                 }
                              } else if (var37 != null) {
                                 float var39 = var37.getAsFloat();
                                 if (!Float.isNaN(var39) && !Float.isInfinite(var39)) {
                                    var15.uNNnnnuuuN = Math.max(var15.nuUnNvnuUu, Math.min(var15.VVuuUN, var39));
                                 }
                              }
                              break;
                           case VUVnvvnNN var52:
                              VUVnvvnNN var16 = (VUVnvvnNN)var4;
                              JsonElement var38 = var2.get(var5);
                              if (var38 != null && var38.isJsonObject()) {
                                 JsonObject var41 = var38.getAsJsonObject();

                                 for (vvNnnUNnVvn var48 : var16.vVvUvVVuuNvV) {
                                    if (var41.has(var48.UuUVuuUu)) {
                                       try {
                                          var48.C00OOC00oO(var41.get(var48.UuUVuuUu).getAsBoolean());
                                       } catch (Throwable var28) {
                                       }
                                    }
                                 }
                              }

                              JsonElement var42 = var2.get(var5 + "$binds");
                              if (var42 != null && var42.isJsonObject()) {
                                 JsonObject var47 = var42.getAsJsonObject();

                                 for (vvNnnUNnVvn var50 : var16.vVvUvVVuuNvV) {
                                    if (var47.has(var50.UuUVuuUu)) {
                                       try {
                                          JsonObject var51 = var47.getAsJsonObject(var50.UuUVuuUu);
                                          if (var51.has("key")) {
                                             var50.nuUnNvnuUu = var51.get("key").getAsInt();
                                          }

                                          if (var51.has("hold")) {
                                             var50.VVuuUN = var51.get("hold").getAsBoolean();
                                          }
                                       } catch (Throwable var27) {
                                       }
                                    }
                                 }
                              }
                              break;
                           case nuunVnvU var17:
                              var17.uUnuvNvvNU();
                              JsonElement var18 = var2.get(var5);
                              if (var18 != null) {
                                 String var19 = var18.getAsString();
                                 String[] var20 = var19.split(",");
                                 ArrayList var21 = new ArrayList();

                                 for (String var25 : var20) {
                                    if (var25 != null) {
                                       String var26 = var25.trim();
                                       if (!var26.isEmpty() && var17.vVvUvVVuuNvV != null && var17.vVvUvVVuuNvV.contains(var26)) {
                                          var21.add(var26);
                                       }
                                    }
                                 }

                                 var17.VVuuUN = var21;
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

   public void UuUVuuUu(boolean var1) {
      this.UuUVuuUu(var1, false);
   }

   public void C00OOC00oO(boolean var1) {
      this.UuUVuuUu(var1);
   }

   public void c_() {
      if (this.nuUnNvnuUu) {
         this.UuUVuuUu(false);
      }

      this.uNNnnnuuuN = -1;
      this.VVuuUN = false;
      this.nvUVNnuu = false;

      for (nvUuvVvuuN var2 : this.nvUVNnuu()) {
         if (var2 != null && !var2.uUnuvNvvNU) {
            var2.C00OOC00oO();
         }
      }
   }

   @Override
   public List<nvUuvVvuuN> nuUnNvnuUu() {
      List var1 = super.nuUnNvnuUu();
      if (this.nUUVuvU()) {
         var1.add(this.NnUuNNU);
      }

      return var1;
   }

   private void UuuNnUvUuv() {
      for (nvUuvVvuuN var2 : this.nvUVNnuu()) {
         if (this.UuUVuuUu(var2)) {
            var2.C00OOC00oO();
         }
      }

      if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
         NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
      }
   }

   private boolean nUUVuvU() {
      for (nvUuvVvuuN var2 : this.nvUVNnuu()) {
         if (this.UuUVuuUu(var2)) {
            return true;
         }
      }

      return false;
   }

   private boolean UuUVuuUu(nvUuvVvuuN var1) {
      return var1 != null && var1 != this.NnUuNNU && !var1.uUnuvNvvNU && !(var1 instanceof vNnVvvNU) && !(var1 instanceof VnnUVUVvV);
   }

   public Module UuUVuuUu(uVUNNUnNvU var1) {
      if (var1 != null) {
         this.UNnVVNvvnVvU.add(var1);
      }

      return this;
   }

   public Module UuUVuuUu(uVUNNUnNvU... var1) {
      if (var1 != null) {
         Collections.addAll(this.UNnVVNvvnVvU, var1);
         this.UNnVVNvvnVvU.remove(null);
      }

      return this;
   }

   public boolean C00OOC00oO(uVUNNUnNvU var1) {
      return var1 != null && this.UNnVVNvvnVvU.contains(var1);
   }

   public Set<uVUNNUnNvU> VVuuUN() {
      return Collections.unmodifiableSet(this.UNnVVNvvnVvU);
   }

   private void UuUVuuUu(boolean var1, boolean var2) {
      if (var1 && NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null && !NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(this)) {
         this.nuUnNvnuUu = false;
      } else if (this.nuUnNvnuUu != var1) {
         this.nuUnNvnuUu = var1;
         if (var1) {
            this.UuUVuuUu();
         } else {
            this.C00OOC00oO();
         }

         if (var2 && NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
            NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
         }
      }
   }

   private void UnUNVVVNuv() {
      if (!this.uNnUnnuNUnNu && uUnuvNvvNU.field_1724 != null && (this.C00OOC00oO(uVUNNUnNvU.RISKY) || this.C00OOC00oO(uVUNNUnNvU.PATCHED))) {
         this.uNnUnnuNUnNu = true;
         String var1 = this.C00OOC00oO(uVUNNUnNvU.RISKY) && this.C00OOC00oO(uVUNNUnNvU.PATCHED)
            ? "Risky/Patched"
            : (this.C00OOC00oO(uVUNNUnNvU.RISKY) ? "Risky" : "Patched");
         nuVVunNUnVnv.UuUVuuUu("warn", "Warning: " + this.vVvUvVVuuNvV + " is currently flagged as " + var1 + ".", 3500L);
      }
   }

   @Generated
   public uNUunUnnnVu vNUvnnVnUvu() {
      return this.C00OOC00oO;
   }

   @Generated
   public int uVUuuVnNVU() {
      return this.uNNnnnuuuN;
   }

   @Generated
   public String vuuuNvNuv() {
      return this.uVUuuVnNVU;
   }
}
