package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_640;
import net.minecraft.class_7439;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoClan",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Автоматически создает клан а так же приглашает в него ваших друзей (если такие есть)"
)
public class AutoClan extends Module {
   public final uVNuNUVvn NVNnnvnuunNv = new uVNuNUVvn("Бинд", -1);
   private AutoClan.NVnVnNnN uVunuUNVVUUV = AutoClan.NVnVnNnN.IDLE;
   private int UNnVVNvvnVvU = 0;
   private int uNnUnnuNUnNu = 0;
   private int NnUuNNU = 0;
   private List<String> nNvNUVU = new ArrayList<>();
   private static final String UnUNuUU = "abcdefghijklmnopqrstuvwxyz0123456789";

   public AutoClan() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (!NUvunNNvN.UuUVuuUu()) {
         if (var1.vVvUvVVuuNvV() == this.NVNnnvnuunNv.uUnuvNvvNU()) {
         }
      }
   }

   private void UuuNnUvUuv() {
      if (uUnuvNvvNU.field_1724 != null) {
         this.nUUVuvU();
      }
   }

   private void nUUVuvU() {
      String var1 = this.UnUNVVVNuv();
      vVnvuVVUunuv.UuUVuuUu("§7Создание клана с названием: §f" + var1);
      uUnuvNvvNU.field_1724.field_3944.method_45729("/clan create " + var1);
      this.uVunuUNVVUUV = AutoClan.NVnVnNnN.WAITING_CREATE_RESPONSE;
      this.UNnVVNvvnVvU = 0;
   }

   private String UnUNVVVNuv() {
      ThreadLocalRandom var1 = ThreadLocalRandom.current();
      int var2 = var1.nextInt(3, 6);
      StringBuilder var3 = new StringBuilder(var2);

      for (int var4 = 0; var4 < var2; var4++) {
         var3.append("abcdefghijklmnopqrstuvwxyz0123456789".charAt(var1.nextInt("abcdefghijklmnopqrstuvwxyz0123456789".length())));
      }

      return var3.toString();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (uUnuvNvvNU.field_1724 != null && this.uVunuUNVVUUV != AutoClan.NVnVnNnN.IDLE) {
         if (var1.vVvUvVVuuNvV() instanceof class_7439 var2) {
            String var4 = var2.comp_763().getString();
            this.UuUVuuUu(var4);
         }
      }
   }

   private void UuUVuuUu(String var1) {
      if (this.uVunuUNVVUUV == AutoClan.NVnVnNnN.WAITING_CREATE_RESPONSE) {
         if (var1.contains("Ошибка, клан с таким названием уже существует")) {
            vVnvuVVUunuv.UuUVuuUu("§cНазвание занято, пробую другое...");
            this.UNnVVNvvnVvU = 0;
            this.uVunuUNVVUUV = AutoClan.NVnVnNnN.CREATING_CLAN;
            return;
         }

         if (var1.contains("Супер! Вы успешно создали клан")) {
            vVnvuVVUunuv.UuUVuuUu("§aКлан успешно создан!");
            this.vNVuvnUUnuUn();
            return;
         }

         if (var1.contains("Ошибка: Ты уже состоишь в клане")) {
            vVnvuVVUunuv.UuUVuuUu("§eТы уже в клане, начинаю инвайтить друзей...");
            this.vNVuvnUUnuUn();
            return;
         }
      }

      if (this.uVunuUNVVUUV == AutoClan.NVnVnNnN.INVITING_FRIENDS) {
      }
   }

   private void vNVuvnUUnuUn() {
      this.nNvNUVU = this.UvnvNVnnnnNU();
      if (this.nNvNUVU.isEmpty()) {
         vVnvuVVUunuv.UuUVuuUu("§cНет друзей онлайн на этом сервере!");
         this.uVUVnuvnuVuv();
      } else {
         vVnvuVVUunuv.UuUVuuUu("§aНайдено §l" + this.nNvNUVU.size() + "§a друзей онлайн. Начинаю инвайт...");
         this.uNnUnnuNUnNu = 0;
         this.NnUuNNU = 0;
         this.uVunuUNVVUUV = AutoClan.NVnVnNnN.INVITING_FRIENDS;
      }
   }

   private List<String> UvnvNVnnnnNU() {
      ArrayList var1 = new ArrayList();
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.method_1562() != null) {
         List var2 = uNvUVUNvuUVV.vVvUvVVuuNvV();
         Collection var3 = uUnuvNvvNU.method_1562().method_2880();
         HashSet var4 = new HashSet();

         for (class_640 var6 : var3) {
            if (var6.method_2966() != null && var6.method_2966().getName() != null) {
               var4.add(var6.method_2966().getName());
            }
         }

         String var8 = uUnuvNvvNU.field_1724.method_5477().getString();

         for (String var7 : var2) {
            if (var4.contains(var7) && !var7.equalsIgnoreCase(var8)) {
               var1.add(var7);
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && this.uVunuUNVVUUV != AutoClan.NVnVnNnN.IDLE) {
         this.UNnVVNvvnVvU++;
         switch (this.uVunuUNVVUUV) {
            case CREATING_CLAN:
               if (this.UNnVVNvvnVvU > 20) {
                  this.nUUVuvU();
               }
               break;
            case WAITING_CREATE_RESPONSE:
               if (this.UNnVVNvvnVvU > 100) {
                  vVnvuVVUunuv.UuUVuuUu("§cТаймаут ожидания ответа сервера.");
                  this.uVUVnuvnuVuv();
               }
               break;
            case INVITING_FRIENDS:
               this.NnUuNNU++;
               if (this.NnUuNNU >= 25) {
                  this.NnUuNNU = 0;
                  if (this.uNnUnnuNUnNu < this.nNvNUVU.size()) {
                     String var2 = this.nNvNUVU.get(this.uNnUnnuNUnNu);
                     uUnuvNvvNU.field_1724.field_3944.method_45730("clan invite " + var2);
                     vVnvuVVUunuv.UuUVuuUu("§7Инвайт: §f" + var2 + " §7(" + (this.uNnUnnuNUnNu + 1) + "/" + this.nNvNUVU.size() + ")");
                     this.uNnUnnuNUnNu++;
                  } else {
                     vVnvuVVUunuv.UuUVuuUu("§aВсе друзья приглашены! (" + this.nNvNUVU.size() + " шт.)");
                     this.uVUVnuvnuVuv();
                  }
               }
         }
      }
   }

   private void uVUVnuvnuVuv() {
      this.uVunuUNVVUUV = AutoClan.NVnVnNnN.IDLE;
      this.UNnVVNvvnVvU = 0;
      this.uNnUnnuNUnNu = 0;
      this.NnUuNNU = 0;
      this.nNvNUVU.clear();
   }

   @Override
   public void C00OOC00oO() {
      this.uVUVnuvnuVuv();
      super.C00OOC00oO();
   }

   static enum NVnVnNnN {
      IDLE,
      CREATING_CLAN,
      WAITING_CREATE_RESPONSE,
      INVITING_FRIENDS;
   }
}
