package ru.metaculture.protection;

import java.util.Arrays;
import java.util.List;
import net.minecraft.class_2558;
import net.minecraft.class_2561;
import net.minecraft.class_7439;
import net.minecraft.class_2558.class_10609;
import net.minecraft.class_2558.class_10610;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoAccept",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Автоматически принимает запросы на телепортацию и в клан"
)
public class AutoAccept extends Module {
   public final VUVnvvnNN NVNnnvnuunNv = new VUVnvvnNN("Принимать", new vvNnnUNnVvn("Запрос на ТП", true), new vvNnnUNnVvn("Запрос в клан", true));
   public final UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Принимать ТП от", "Друзей", "Друзей", "Всех")
      .UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Запрос на ТП"));
   public final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Принимать запрос в клан только от друзей", true)
      .UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Запрос в клан"));
   private boolean uNnUnnuNUnNu;
   private boolean NnUuNNU = false;
   private long nNvNUVU = 0L;
   private final String[] UnUNuUU = new String[]{
      "has requested teleport", "просит телепортироваться", "хочет телепортироваться к вам", "просит к вам телепортироваться"
   };
   private final String[] uUVuVvuNUvnu = new String[]{"приглашает вас в клан", "приглашает Вас в клан", "invited you to clan"};

   public AutoAccept() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      NUvunNNvN.UuUVuuUu();
      if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
         class_2561 var8 = var2.comp_763();
         String var4 = var8.getString();
         if (this.NnUuNNU) {
            if (System.currentTimeMillis() - this.nNvNUVU > 5000L) {
               this.NnUuNNU = false;
            } else {
               String var5 = this.UuUVuuUu(var8, "Вступить");
               if (var5 != null) {
                  this.UuUVuuUu(var5);
                  this.NnUuNNU = false;
                  return;
               }
            }
         }

         if (this.NVNnnvnuunNv.C00OOC00oO("Запрос на ТП") && this.uUnuvNvvNU(var4)) {
            if (this.uVunuUNVVUUV.C00OOC00oO("Всех")) {
               this.uNnUnnuNUnNu = true;
            } else {
               String var9 = var4.toLowerCase();

               for (String var7 : uNvUVUNvuUVV.vVvUvVVuuNvV()) {
                  if (var9.contains(var7.toLowerCase())) {
                     this.uNnUnnuNUnNu = true;
                     break;
                  }
               }
            }
         }

         if (this.NVNnnvnuunNv.C00OOC00oO("Запрос в клан") && this.vVvUvVVuuNvV(var4)) {
            String var10 = this.UuUVuuUu(var4, "приглашает");
            if (var10 != null && !this.C00OOC00oO(var10)) {
               return;
            }

            String var11 = this.UuUVuuUu(var8, "Вступить");
            if (var11 != null) {
               this.UuUVuuUu(var11);
            } else {
               this.NnUuNNU = true;
               this.nNvNUVU = System.currentTimeMillis();
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (this.uNnUnnuNUnNu && uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.field_3944.method_45730("tpaccept");
         this.uNnUnnuNUnNu = false;
      }
   }

   private String UuUVuuUu(class_2561 var1, String var2) {
      if (var1 == null) {
         return null;
      } else {
         if (var1.method_10866() != null && var1.method_10866().method_10970() != null) {
            class_2558 var3 = var1.method_10866().method_10970();
            if (var1.getString().contains(var2)) {
               if (var3 instanceof class_10609 var8) {
                  return var8.comp_3506();
               }

               if (var3 instanceof class_10610 var9) {
                  return var9.comp_3507();
               }
            }
         }

         List var7 = var1.method_10855();
         if (var7 != null) {
            for (class_2561 var5 : var7) {
               String var6 = this.UuUVuuUu(var5, var2);
               if (var6 != null) {
                  return var6;
               }
            }
         }

         return null;
      }
   }

   private void UuUVuuUu(String var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1724.field_3944 != null) {
         if (var1.startsWith("/")) {
            uUnuvNvvNU.field_1724.field_3944.method_45730(var1.substring(1));
         } else {
            uUnuvNvvNU.field_1724.field_3944.method_45730(var1);
         }
      }
   }

   private boolean C00OOC00oO(String var1) {
      return !this.UNnVVNvvnVvU.uUnuvNvvNU() ? true : uNvUVUNvuUVV.UuUVuuUu(var1);
   }

   private String UuUVuuUu(String var1, String var2) {
      String var3 = var1.replaceAll("§.", "");
      int var4 = var3.indexOf(var2);
      if (var4 <= 0) {
         return null;
      } else {
         String var5 = var3.substring(0, var4).trim();
         int var6 = var5.lastIndexOf(32);
         return var6 >= 0 ? var5.substring(var6 + 1).trim() : var5.trim();
      }
   }

   private boolean uUnuvNvvNU(String var1) {
      String var2 = var1.toLowerCase();
      return Arrays.stream(this.UnUNuUU).anyMatch(var1x -> var2.contains(var1x.toLowerCase()));
   }

   private boolean vVvUvVVuuNvV(String var1) {
      String var2 = var1.toLowerCase();
      return Arrays.stream(this.uUVuVvuNUvnu).anyMatch(var1x -> var2.contains(var1x.toLowerCase()));
   }
}
