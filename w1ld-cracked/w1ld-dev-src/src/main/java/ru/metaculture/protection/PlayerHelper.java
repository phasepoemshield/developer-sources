package ru.metaculture.protection;

import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.List;
import java.util.Locale;
import net.minecraft.class_1268;
import net.minecraft.class_1304;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2561;
import net.minecraft.class_2720;
import net.minecraft.class_2815;
import net.minecraft.class_2824;
import net.minecraft.class_2846;
import net.minecraft.class_2856;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_408;
import net.minecraft.class_418;
import net.minecraft.class_5537;
import net.minecraft.class_7439;
import net.minecraft.class_9276;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import net.minecraft.class_9837;
import net.minecraft.class_2856.class_2857;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "PlayerHelper",
   uUnuvNvvNU = oOOOo0.Player,
   C00OOC00oO = "Полезные твики для игрока"
)
public class PlayerHelper extends Module {
   private static final String vvUVNVvvNUv = "PlayerHelper_AutoArmor";
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим ресурс паков", "Load", "Load", "Skip", "Vanilla");
   public final vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Авто респавн", true);
   public final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Скип ресурс паков", true);
   public final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Писать координаты смерти", false);
   public final vvNnnUNnVvn NnUuNNU = new vvNnnUNnVvn("Автоматически кушать", false);
   public final nNUuNvVn nNvNUVU = new nNUuNvVn("Порог голода", 10.0F, 1.0F, 20.0F, 1.0F, false).UuUVuuUu(() -> !this.NnUuNNU.uUnuvNvvNU());
   public final vvNnnUNnVvn UnUNuUU = new vvNnnUNnVvn("Отправлять координаты", false);
   public final UvNnUnuNUUU uUVuVvuNUvnu = new UvNnUnuNUUU("Кому отправлять: ", "СОО.Клановцам", "Друзьям", "Общий чат", "СОО.Клановцам")
      .UuUVuuUu(() -> !this.UnUNuUU.uUnuvNvvNU());
   public final uVNuNUVvn UvUvUNuvNU = new uVNuNUVvn("Бинд на отправку", -1).UuUVuuUu(() -> !this.UnUNuUU.uUnuvNvvNU());
   public final vvNnnUNnVvn c0oOOCcCoC0 = new vvNnnUNnVvn("Не ломать предмет", false);
   public final vvNnnUNnVvn VVnVNnunVvu = new vvNnnUNnVvn("Автоматически чинить", false);
   public final nNUuNvVn unNNVVNnvvV = new nNUuNvVn("Порог прочности", 100.0F, 1.0F, 500.0F, 1.0F, false).UuUVuuUu(() -> !this.VVnVNnunVvu.uUnuvNvvNU());
   public final vvNnnUNnVvn NuunnvnN = new vvNnnUNnVvn("AutoArmor", false);
   public final nNUuNvVn NVUunUNUN = new nNUuNvVn("Скорость надевания", 150.0F, 50.0F, 1000.0F, 50.0F, false).UuUVuuUu(() -> !this.NuunnvnN.uUnuvNvvNU());
   public final uVNuNUVvn UUVNuUNUvUnV = new uVNuNUVvn("Бинд зума", -1, true);
   public final vvNnnUNnVvn vuvnUnVnUNnV = new vvNnnUNnVvn("При заходе на новую анархию писать /event delay", true);
   public final vvNnnUNnVvn nnuUVNUuvvVU = new vvNnnUNnVvn("Перезаход при афк", true);
   private int UuNnnVnuNNV = -1;
   private boolean uUVvnUuNvvN = false;
   public static boolean nVVUuvuNnUN = false;
   public static boolean nNnVnUNVV = false;
   private int UUuUnNVNuuv = -1;
   private float NVuNUuVnVUN = 0.0F;
   public static boolean nuunNvv = false;
   public static float uUVVvVVNvvn = 0.25F;
   private final VuNvNNvVV NVuunNnvvvVu = new VuNvNNvVV();
   private final VuNvNNvVV vNnNuuvVn = new VuNvNNvVV();
   private PlayerHelper.NVnVnNnN VUuuVUnun = null;
   private int vVVuuVVv = 0;
   private int VuunNUUUvu = 0;
   private String NNUUNUuVNNVn = "N/A";
   private String VvVvnNUnvuvV = "N/A";
   private String ccOO0COcoco0 = "N/A";
   private boolean NUVvUUVuVNVv = false;

   public PlayerHelper() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.uVunuUNVVUUV,
            this.NVNnnvnuunNv,
            this.uNnUnnuNUnNu,
            this.NnUuNNU,
            this.nNvNUVU,
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU,
            this.c0oOOCcCoC0,
            this.VVnVNnunVvu,
            this.unNNVVNnvvV,
            this.NuunnvnN,
            this.NVUunUNUN,
            this.UUVNuUNUvUnV,
            this.vuvnUnVnUNnV,
            this.nnuUVNUuvvVU
         }
      );
   }

   @Override
   public void UuUVuuUu(JsonObject var1) {
      super.UuUVuuUu(var1);
      if (var1 != null) {
         JsonObject var2 = null;

         try {
            var2 = var1.getAsJsonObject("Settings");
         } catch (Throwable var5) {
         }

         if (var2 != null && !var2.has(this.NVNnnvnuunNv.UuUVuuUu) && var2.has(this.UNnVVNvvnVvU.UuUVuuUu)) {
            try {
               boolean var3 = var2.get(this.UNnVVNvvnVvU.UuUVuuUu).getAsBoolean();
               this.NVNnnvnuunNv.uNNnnnuuuN = var3 ? "Skip" : "Load";
               this.NVNnnvnuunNv.vNUvnnVnUvu = this.NVNnnvnuunNv.vVvUvVVuuNvV.indexOf(this.NVNnnvnuunNv.uNNnnnuuuN);
            } catch (Throwable var4) {
            }
         }
      }
   }

   public static boolean UuuNnUvUuv() {
      return nVVUuvuNnUN || nNnVnUNVV;
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.NNUUNUuVNNVn = "N/A";
      this.VvVvnNUnvuvV = "N/A";
      this.ccOO0COcoco0 = "N/A";
      this.NUVvUUVuVNVv = false;
      this.NVuunNnvvvVu.UuUVuuUu();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (!NUvunNNvN.UuUVuuUu() && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         this.UvnvNVnnnnNU();
         this.nUUVuvU();
         this.UnUNVVVNuv();
         if (!(uUnuvNvvNU.field_1724.method_6032() <= 0.0F) && !(uUnuvNvvNU.field_1755 instanceof class_418)) {
            if (this.NnUuNNU.uUnuvNvvNU()) {
               this.VVnVNnunVvu();
            }

            if (this.c0oOOCcCoC0.uUnuvNvvNU()) {
               this.uVUVnuvnuVuv();
            }

            if (this.VVnVNnunVvu.uUnuvNvvNU() && !nVVUuvuNnUN) {
               this.NVNnnvnuunNv();
            }

            if (this.NuunnvnN.uUnuvNvvNU()) {
               this.NnUuNNU();
            }
         } else {
            if (this.uNnUnnuNUnNu.uUnuvNvvNU() && uUnuvNvvNU.field_1724.field_6213 < 2) {
               uUnuvNvvNU.field_1724
                  .method_7353(
                     class_2561.method_30163(
                        String.format(
                           "§cDeathCoords: §fX: %d Y: %d Z: %d",
                           (int)uUnuvNvvNU.field_1724.method_23317(),
                           (int)uUnuvNvvNU.field_1724.method_23318(),
                           (int)uUnuvNvvNU.field_1724.method_23321()
                        )
                     ),
                     false
                  );
            }

            if (this.uVunuUNVVUUV.uUnuvNvvNU()) {
               uUnuvNvvNU.field_1724.method_7331();
               uUnuvNvvNU.method_1507(null);
            }

            this.NuunnvnN();
            this.uNnUnnuNUnNu();
            this.UnUNuUU();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (uUnuvNvvNU.field_1755 == null && uUnuvNvvNU.field_1724 != null && var1.nuUnNvnuUu() == 1) {
         if (var1.vVvUvVVuuNvV() == this.UvUvUNuvNU.uUnuvNvvNU() && this.UvUvUNuvNU.uUnuvNvvNU() != -1 && this.UnUNuUU.uUnuvNvvNU()) {
            this.c0oOOCcCoC0();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         if (this.NVNnnvnuunNv.C00OOC00oO("Skip") && var1.vVvUvVVuuNvV() instanceof class_2720 var2) {
            uUnuvNvvNU.method_1562().method_52787(new class_2856(var2.comp_2158(), class_2857.field_13016));
            uUnuvNvvNU.method_1562().method_52787(new class_2856(var2.comp_2158(), class_2857.field_13017));
            var1.C00OOC00oO();
         }

         if (this.nnuUVNUuvvVU.uUnuvNvvNU() && var1.vVvUvVVuuNvV() instanceof class_7439 var4) {
            String var7 = var4.comp_763().getString();
            if (this.UuUVuuUu(var7)) {
               this.vNVuvnUUnuUn();
            }
         }

         if (this.c0oOOCcCoC0.uUnuvNvvNU()) {
            class_1799 var5 = uUnuvNvvNU.field_1724.method_6047();
            if (this.UuUVuuUu(var5)
               && (
                  var1.vVvUvVVuuNvV() instanceof class_2846
                     || var1.vVvUvVVuuNvV() instanceof class_2885
                     || var1.vVvUvVVuuNvV() instanceof class_2824
                     || var1.vVvUvVVuuNvV() instanceof class_2886
               )) {
               var1.C00OOC00oO();
            }
         }
      }
   }

   private void nUUVuvU() {
      vnvuUUVun.UuUVuuUu.UuUVuuUu(200L);
      String var1 = this.C00OOC00oO(vnvuUUVun.UuUVuuUu.uUnuvNvvNU());
      if (this.uUnuvNvvNU(var1)) {
         boolean var2 = !var1.equals(this.NNUUNUuVNNVn);
         this.NNUUNUuVNNVn = var1;
         if (this.vuvnUnVnUNnV.uUnuvNvvNU() && !var1.equals(this.VvVvnNUnvuvV) && uUnuvNvvNU.field_1724.field_3944 != null) {
            uUnuvNvvNU.field_1724.field_3944.method_45730("event delay");
            this.VvVvnNUnvuvV = var1;
         }
      }
   }

   private void UnUNVVVNuv() {
      if (this.NUVvUUVuVNVv && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1724.field_3944 != null && !vnvuUUVun.C00OOC00oO()) {
         if (this.NVuunNnvvvVu.uNNnnnuuuN(1000L)) {
            uUnuvNvvNU.field_1724.field_3944.method_45730("an" + this.ccOO0COcoco0);
            this.NUVvUUVuVNVv = false;
            this.NVuunNnvvvVu.UuUVuuUu();
         }
      }
   }

   private void vNVuvnUUnuUn() {
      if (!this.NUVvUUVuVNVv && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1724.field_3944 != null) {
         vnvuUUVun.UuUVuuUu.UuUVuuUu();
         String var1 = this.C00OOC00oO(vnvuUUVun.UuUVuuUu.uUnuvNvvNU());
         this.ccOO0COcoco0 = this.uUnuvNvvNU(var1) ? var1 : this.NNUUNUuVNNVn;
         if (this.uUnuvNvvNU(this.ccOO0COcoco0)) {
            if (uUnuvNvvNU.field_1755 != null) {
               uUnuvNvvNU.field_1724.method_3137();
            }

            uUnuvNvvNU.field_1724.field_3944.method_45730("hub");
            this.NUVvUUVuVNVv = true;
            this.NVuunNnvvvVu.UuUVuuUu();
         }
      }
   }

   private boolean UuUVuuUu(String var1) {
      if (var1 == null) {
         return false;
      } else {
         String var2 = var1.replaceAll("§.", "").toLowerCase(Locale.ROOT);
         return var2.contains("недоступна в режиме afk") || var2.contains("недопустимо нажимать в режиме afk");
      }
   }

   private String C00OOC00oO(String var1) {
      if (var1 == null) {
         return "N/A";
      } else {
         String var2 = var1.replaceAll("\\D+", "");
         return var2.isEmpty() ? "N/A" : var2;
      }
   }

   private boolean uUnuvNvvNU(String var1) {
      return var1 != null && !"N/A".equals(var1) && !var1.isBlank();
   }

   private boolean UuUVuuUu(uVNuNUVvn var1) {
      return var1 != null && var1.uUnuvNvvNU() != -1;
   }

   private void UvnvNVnnnnNU() {
      if (this.UUVNuUNUvUnV.uUnuvNvvNU() != -1) {
         boolean var1 = uVNuNUVvn.C00OOC00oO(this.UUVNuUNUvUnV.uUnuvNvvNU());
         if (nuunNvv && !var1) {
            uUVVvVVNvvn = 0.25F;
         }

         nuunNvv = var1;
      } else {
         nuunNvv = false;
         uUVVvVVNvvn = 0.25F;
      }
   }

   private void uVUVnuvnuVuv() {
      class_1799 var1 = uUnuvNvvNU.field_1724.method_6047();
      if (this.UuUVuuUu(var1)) {
         uUnuvNvvNU.field_1690.field_1886.method_23481(false);
         uUnuvNvvNU.field_1690.field_1904.method_23481(false);
      }
   }

   private boolean UuUVuuUu(class_1799 var1) {
      if (var1 != null && var1.method_7963()) {
         int var2 = var1.method_7936();
         if (var2 <= 0) {
            return false;
         } else {
            int var3 = var2 - var1.method_7919();
            int var4 = var2 < 70 ? Math.max(1, (int)Math.ceil(var2 * 0.12)) : 70;
            return var3 <= var4;
         }
      } else {
         return false;
      }
   }

   private void NVNnnvnuunNv() {
      if (uUnuvNvvNU.field_1755 != null) {
         if (nNnVnUNVV) {
            this.uNnUnnuNUnNu();
         }
      } else {
         class_1799 var1 = uUnuvNvvNU.field_1724.method_6047();
         class_1799 var2 = uUnuvNvvNU.field_1724.method_6079();
         if (!nNnVnUNVV) {
            if (uUnuvNvvNU.field_1724.method_6115()) {
               return;
            }

            if (var1.method_7963() && var1.method_7936() - var1.method_7919() <= this.unNNVVNnvvV.uUnuvNvvNU()) {
               if (this.UNnVVNvvnVvU() == -1) {
                  return;
               }

               nNnVnUNVV = true;
               this.UUuUnNVNuuv = uUnuvNvvNU.field_1724.method_31548().method_67532();
               this.NVuNUuVnVUN = uUnuvNvvNU.field_1724.method_36455();
               uUnuvNvvNU.field_1761
                  .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, 45, this.UUuUnNVNuuv, class_1713.field_7791, uUnuvNvvNU.field_1724);
               this.uVunuUNVVUUV();
            }
         } else {
            uUnuvNvvNU.field_1724.method_36457(90.0F);
            if (var2.method_7960() || var2.method_7919() == 0 || !var2.method_7963()) {
               this.uNnUnnuNUnNu();
               return;
            }

            if (uUnuvNvvNU.field_1724.method_6047().method_7909() != class_1802.field_8287 && !this.uVunuUNVVUUV()) {
               this.uNnUnnuNUnNu();
               return;
            }

            uUnuvNvvNU.field_1690.field_1904.method_23481(true);
            uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
         }
      }
   }

   private boolean uVunuUNVVUUV() {
      int var1 = this.UNnVVNvvnVvU();
      if (var1 == -1) {
         return false;
      } else {
         if (var1 >= 36 && var1 <= 44) {
            uUnuvNvvNU.field_1724.method_31548().method_61496(var1 - 36);
         } else {
            uUnuvNvvNU.field_1761
               .method_2906(
                  uUnuvNvvNU.field_1724.field_7498.field_7763,
                  var1,
                  uUnuvNvvNU.field_1724.method_31548().method_67532(),
                  class_1713.field_7791,
                  uUnuvNvvNU.field_1724
               );
         }

         return true;
      }
   }

   private int UNnVVNvvnVvU() {
      for (int var1 = 9; var1 <= 44; var1++) {
         if (((class_1735)uUnuvNvvNU.field_1724.field_7498.field_7761.get(var1)).method_7677().method_7909() == class_1802.field_8287) {
            return var1;
         }
      }

      return -1;
   }

   private void uNnUnnuNUnNu() {
      if (nNnVnUNVV) {
         nNnVnUNVV = false;
         uUnuvNvvNU.field_1690.field_1904.method_23481(false);
         uUnuvNvvNU.field_1724.method_36457(this.NVuNUuVnVUN);
         if (this.UUuUnNVNuuv != -1) {
            uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, 45, this.UUuUnNVNuuv, class_1713.field_7791, uUnuvNvvNU.field_1724);
            uUnuvNvvNU.field_1724.method_31548().method_61496(this.UUuUnNVNuuv);
            this.UUuUnNVNuuv = -1;
         }
      }
   }

   private void NnUuNNU() {
      if (this.vVVuuVVv > 0) {
         this.nNvNUVU();
      } else if (uUnuvNvvNU.field_1761 != null && !nVVUuvuNnUN && !nNnVnUNVV && !uUnuvNvvNU.field_1724.method_6115()) {
         if (this.vNnNuuvVn.uNNnnnuuuN((long)this.NVUunUNUN.uUnuvNvvNU())) {
            PlayerHelper.NVnVnNnN var1 = this.uUVuVvuNUvnu();
            if (var1 != null) {
               this.VUuuVUnun = var1;
               this.vVVuuVVv = 1;
               this.VuunNUUUvu = 0;
               this.nNvNUVU();
            }
         }
      }
   }

   private void nNvNUVU() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null && this.VUuuVUnun != null) {
         switch (this.vVVuuVVv) {
            case 1:
               NVnVnU.UuUVuuUu().UuUVuuUu("PlayerHelper_AutoArmor");
               uUnuvNvvNU.field_1690.field_1867.method_23481(false);
               uUnuvNvvNU.field_1724.method_5728(false);
               this.vVVuuVVv = 2;
               this.VuunNUUUvu = 1;
               break;
            case 2:
               if (this.VuunNUUUvu-- > 0) {
                  return;
               }

               if (this.VUuuVUnun.fromBundle()) {
                  if (!this.UuUVuuUu(this.VUuuVUnun)) {
                     this.UnUNuUU();
                     return;
                  }

                  this.vVVuuVVv = 3;
                  this.VuunNUUUvu = 1;
                  return;
               }

               UVuvVVvnVNu.UuUVuuUu(this.VUuuVUnun.sourceSlot(), this.VUuuVUnun.armorSlotId());
               uUnuvNvvNU.field_1724.field_3944.method_52787(new class_2815(uUnuvNvvNU.field_1724.field_7498.field_7763));
               this.vNnNuuvVn.UuUVuuUu();
               this.vVVuuVVv = 3;
               this.VuunNUUUvu = 1;
               break;
            case 3:
               if (this.VuunNUUUvu-- > 0) {
                  return;
               }

               if (this.VUuuVUnun.fromBundle()) {
                  UVuvVVvnVNu.UuUVuuUu(this.VUuuVUnun.sourceSlot(), this.VUuuVUnun.armorSlotId());
                  uUnuvNvvNU.field_1724.field_3944.method_52787(new class_2815(uUnuvNvvNU.field_1724.field_7498.field_7763));
                  this.vNnNuuvVn.UuUVuuUu();
               }

               this.UnUNuUU();
               break;
            default:
               this.UnUNuUU();
         }
      } else {
         this.UnUNuUU();
      }
   }

   private boolean UuUVuuUu(PlayerHelper.NVnVnNnN var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.field_1724.field_7498.method_34255().method_7960()) {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1.bundleSlot());
         class_9276 var3 = (class_9276)var2.method_58694(class_9334.field_49650);
         if (var2.method_7909() instanceof class_5537 && var3 != null && var1.bundleIndex() < var3.method_57426()) {
            int var4 = var1.bundleSlot() < 9 ? var1.bundleSlot() + 36 : var1.bundleSlot();
            class_5537.method_61637(var2, var1.bundleIndex());
            uUnuvNvvNU.field_1724.field_3944.method_52787(new class_9837(var4, var1.bundleIndex()));
            uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var4, 1, class_1713.field_7790, uUnuvNvvNU.field_1724);
            uUnuvNvvNU.field_1761.method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, var1.sourceSlot(), 0, class_1713.field_7790, uUnuvNvvNU.field_1724);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void UnUNuUU() {
      if (this.vVVuuVVv > 0) {
         NVnVnU.UuUVuuUu().C00OOC00oO("PlayerHelper_AutoArmor");
      }

      this.VUuuVUnun = null;
      this.vVVuuVVv = 0;
      this.VuunNUUUvu = 0;
   }

   private PlayerHelper.NVnVnNnN uUVuVvuNUvnu() {
      Object var1 = null;
      var1 = this.UuUVuuUu((PlayerHelper.NVnVnNnN)var1, this.UuUVuuUu(class_1304.field_6169, 5));
      var1 = this.UuUVuuUu((PlayerHelper.NVnVnNnN)var1, this.UuUVuuUu(class_1304.field_6174, 6));
      var1 = this.UuUVuuUu((PlayerHelper.NVnVnNnN)var1, this.UuUVuuUu(class_1304.field_6172, 7));
      return this.UuUVuuUu((PlayerHelper.NVnVnNnN)var1, this.UuUVuuUu(class_1304.field_6166, 8));
   }

   private PlayerHelper.NVnVnNnN UuUVuuUu(PlayerHelper.NVnVnNnN var1, PlayerHelper.NVnVnNnN var2) {
      if (var2 == null) {
         return var1;
      } else if (var1 == null) {
         return var2;
      } else {
         return var2.improvement() > var1.improvement() ? var2 : var1;
      }
   }

   private PlayerHelper.NVnVnNnN UuUVuuUu(class_1304 var1, int var2) {
      class_1799 var3 = uUnuvNvvNU.field_1724.method_6118(var1);
      int var4 = this.UuUVuuUu(var3, var1);
      int var5 = -1;
      int var6 = var4;

      for (int var7 = 0; var7 < 36; var7++) {
         class_1799 var8 = uUnuvNvvNU.field_1724.method_31548().method_5438(var7);
         int var9 = this.UuUVuuUu(var8, var1);
         if (var9 > var6) {
            var6 = var9;
            var5 = var7 < 9 ? var7 + 36 : var7;
         }
      }

      int var14 = this.UvUvUNuvNU();
      if (var14 != -1) {
         for (int var15 = 0; var15 < 36; var15++) {
            class_1799 var16 = uUnuvNvvNU.field_1724.method_31548().method_5438(var15);
            if (var16.method_7909() instanceof class_5537) {
               class_9276 var10 = (class_9276)var16.method_58694(class_9334.field_49650);
               if (var10 != null) {
                  for (int var11 = 0; var11 < var10.method_57426(); var11++) {
                     int var12 = this.UuUVuuUu(var10.method_57422(var11), var1);
                     if (var12 > var6) {
                        var5 = var14 < 9 ? var14 + 36 : var14;
                        return new PlayerHelper.NVnVnNnN(var5, var2, var12 - var4, var15, var11);
                     }
                  }
               }
            }
         }
      }

      return var5 == -1 ? null : new PlayerHelper.NVnVnNnN(var5, var2, var6 - var4);
   }

   private int UvUvUNuvNU() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_7960()) {
            return var1;
         }
      }

      return -1;
   }

   private int UuUVuuUu(class_1799 var1, class_1304 var2) {
      if (var1 != null && !var1.method_7960() && this.UuUVuuUu(var1.method_7909()) == var2) {
         int var3 = this.C00OOC00oO(var1.method_7909()) * 10000;
         class_9304 var4 = (class_9304)var1.method_58694(class_9334.field_49633);
         if (var4 != null && !var4.method_57543()) {
            for (Entry var6 : var4.method_57539()) {
               var3 += var6.getIntValue() * 100;
            }
         }

         if (var1.method_7963()) {
            var3 += Math.max(0, var1.method_7936() - var1.method_7919()) * 100 / Math.max(1, var1.method_7936());
         }

         return var3;
      } else {
         return -1;
      }
   }

   private class_1304 UuUVuuUu(class_1792 var1) {
      if (var1 == class_1802.field_22027
         || var1 == class_1802.field_8805
         || var1 == class_1802.field_8743
         || var1 == class_1802.field_8283
         || var1 == class_1802.field_8862
         || var1 == class_1802.field_8267
         || var1 == class_1802.field_8090) {
         return class_1304.field_6169;
      } else if (var1 == class_1802.field_22028
         || var1 == class_1802.field_8058
         || var1 == class_1802.field_8523
         || var1 == class_1802.field_8873
         || var1 == class_1802.field_8678
         || var1 == class_1802.field_8577) {
         return class_1304.field_6174;
      } else if (var1 == class_1802.field_22029
         || var1 == class_1802.field_8348
         || var1 == class_1802.field_8396
         || var1 == class_1802.field_8218
         || var1 == class_1802.field_8416
         || var1 == class_1802.field_8570) {
         return class_1304.field_6172;
      } else {
         return var1 != class_1802.field_22030
               && var1 != class_1802.field_8285
               && var1 != class_1802.field_8660
               && var1 != class_1802.field_8313
               && var1 != class_1802.field_8753
               && var1 != class_1802.field_8370
            ? null
            : class_1304.field_6166;
      }
   }

   private int C00OOC00oO(class_1792 var1) {
      if (var1 == class_1802.field_22027 || var1 == class_1802.field_22028 || var1 == class_1802.field_22029 || var1 == class_1802.field_22030) {
         return 6;
      } else if (var1 == class_1802.field_8805 || var1 == class_1802.field_8058 || var1 == class_1802.field_8348 || var1 == class_1802.field_8285) {
         return 5;
      } else if (var1 == class_1802.field_8743 || var1 == class_1802.field_8523 || var1 == class_1802.field_8396 || var1 == class_1802.field_8660) {
         return 4;
      } else if (var1 == class_1802.field_8283 || var1 == class_1802.field_8873 || var1 == class_1802.field_8218 || var1 == class_1802.field_8313) {
         return 3;
      } else if (var1 == class_1802.field_8862 || var1 == class_1802.field_8678 || var1 == class_1802.field_8416 || var1 == class_1802.field_8753) {
         return 2;
      } else if (var1 == class_1802.field_8267 || var1 == class_1802.field_8577 || var1 == class_1802.field_8570 || var1 == class_1802.field_8370) {
         return 1;
      } else {
         return var1 == class_1802.field_8090 ? 2 : 0;
      }
   }

   private void c0oOOCcCoC0() {
      int var1 = (int)uUnuvNvvNU.field_1724.method_23317();
      int var2 = (int)uUnuvNvvNU.field_1724.method_23318();
      int var3 = (int)uUnuvNvvNU.field_1724.method_23321();
      String var4 = String.format(" %d %d %d", var1, var2, var3);
      String var5 = this.uUVuVvuNUvnu.uUnuvNvvNU();
      switch (var5) {
         case "Общий чат":
            uUnuvNvvNU.method_1562().method_45729("! Мои координаты:" + var4);
            break;
         case "Друзья":
            List var8 = uNvUVUNvuUVV.vVvUvVVuuNvV();
            if (var8.isEmpty()) {
               uUnuvNvvNU.field_1724.method_7353(class_2561.method_30163("§cСписок друзей пуст!"), true);
               return;
            }

            for (String var10 : var8) {
               uUnuvNvvNU.method_1562().method_45729("/msg " + var10 + " Мои координаты:" + var4);
            }

            uUnuvNvvNU.field_1724.method_7353(class_2561.method_30163("§aКоординаты отправлены друзьям."), true);
            break;
         case "СОО.Клановцам":
            uUnuvNvvNU.method_1562().method_45729("/clan chat" + var4);
      }
   }

   private void VVnVNnunVvu() {
      if (uUnuvNvvNU.field_1755 != null && !(uUnuvNvvNU.field_1755 instanceof class_408)) {
         if (nVVUuvuNnUN) {
            this.NuunnvnN();
         }
      } else if (!(uUnuvNvvNU.field_1724.method_7344().method_7586() >= this.nNvNUVU.uUnuvNvvNU()) || nVVUuvuNnUN && uUnuvNvvNU.field_1724.method_6115()) {
         if (nVVUuvuNnUN || !uUnuvNvvNU.field_1724.method_6115()) {
            class_1268 var1 = this.unNNVVNnvvV();
            if (var1 == null) {
               if (nVVUuvuNnUN && !uUnuvNvvNU.field_1724.method_6115()) {
                  this.NuunnvnN();
               }
            } else {
               if (!nVVUuvuNnUN) {
                  this.UuUVuuUu(var1);
               } else {
                  this.C00OOC00oO(var1);
               }
            }
         }
      } else {
         if (nVVUuvuNnUN) {
            this.NuunnvnN();
         }
      }
   }

   private class_1268 unNNVVNnvvV() {
      class_1799 var1 = uUnuvNvvNU.field_1724.method_6047();
      if (var1.method_57826(class_9334.field_50075)) {
         return class_1268.field_5808;
      } else {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_6079();
         if (var2.method_57826(class_9334.field_50075)) {
            return class_1268.field_5810;
         } else {
            for (int var3 = 0; var3 < 9; var3++) {
               if (uUnuvNvvNU.field_1724.method_31548().method_5438(var3).method_57826(class_9334.field_50075)) {
                  return class_1268.field_5808;
               }
            }

            return null;
         }
      }
   }

   private void UuUVuuUu(class_1268 var1) {
      if (var1 == class_1268.field_5808) {
         int var2 = this.NVUunUNUN();
         if (var2 == -1) {
            return;
         }

         this.UuNnnVnuNNV = uUnuvNvvNU.field_1724.method_31548().method_67532();
         uUnuvNvvNU.field_1724.method_31548().method_61496(var2);
      }

      uUnuvNvvNU.field_1690.field_1904.method_23481(true);
      if (uUnuvNvvNU.field_1761 != null) {
         uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, var1);
      }

      this.uUVvnUuNvvN = true;
      nVVUuvuNnUN = true;
   }

   private void C00OOC00oO(class_1268 var1) {
      if (uUnuvNvvNU.field_1724.method_6115()) {
         uUnuvNvvNU.field_1690.field_1904.method_23481(true);
         this.uUVvnUuNvvN = true;
      } else if (this.uUVvnUuNvvN) {
         this.uUVvnUuNvvN = false;
         this.NuunnvnN();
      } else {
         uUnuvNvvNU.field_1690.field_1904.method_23481(true);
         if (uUnuvNvvNU.field_1761 != null) {
            uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, var1);
         }
      }
   }

   private void NuunnvnN() {
      if (nVVUuvuNnUN) {
         uUnuvNvvNU.field_1690.field_1904.method_23481(false);
         if (this.UuNnnVnuNNV != -1 && uUnuvNvvNU.field_1724 != null) {
            uUnuvNvvNU.field_1724.method_31548().method_61496(this.UuNnnVnuNNV);
            this.UuNnnVnuNNV = -1;
         }

         this.uUVvnUuNvvN = false;
         nVVUuvuNnUN = false;
      }
   }

   private int NVUunUNUN() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_57826(class_9334.field_50075)) {
            return var1;
         }
      }

      return -1;
   }

   @Override
   public void C00OOC00oO() {
      this.NuunnvnN();
      this.uNnUnnuNUnNu();
      this.UnUNuUU();
      nuunNvv = false;
      uUVVvVVNvvn = 0.25F;
      this.NUVvUUVuVNVv = false;
      super.C00OOC00oO();
   }

   record NVnVnNnN(int sourceSlot, int armorSlotId, int improvement, int bundleSlot, int bundleIndex) {
      NVnVnNnN(int var1, int var2, int var3) {
         this(var1, var2, var3, -1, -1);
      }

      boolean fromBundle() {
         return this.bundleSlot >= 0 && this.bundleIndex >= 0;
      }
   }
}
