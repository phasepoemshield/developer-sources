package ru.metaculture.protection;

import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_2680;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AutoTool",
   uUnuvNvvNU = oOOOo0.Player,
   C00OOC00oO = "Автоматически берет нужный вам инструмент"
)
public class AutoTool extends Module {
   private static final String uVunuUNVVUUV = "AutoTool";
   private static final long UNnVVNvvnVvU = 50L;
   private static final String uNnUnnuNUnNu = "Только хотбар";
   private static final String NnUuNNU = "Инвентарь";
   private static final String nNvNUVU = "Гибрид";
   public static UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "Гибрид", "Только хотбар", "Инвентарь", "Гибрид");
   private AutoTool.NVnVnNnN UnUNuUU = AutoTool.NVnVnNnN.IDLE;
   private long uUVuVvuNUvnu;
   private int UvUvUNuvNU = -1;
   private int c0oOOCcCoC0 = -1;
   private boolean VVnVNnunVvu;

   public AutoTool() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         switch (this.UnUNuUU) {
            case IDLE:
               this.UuuNnUvUuv();
               break;
            case PREPARE_SWAP:
               this.nUUVuvU();
               break;
            case MINING:
               this.UnUNVVVNuv();
               break;
            case PREPARE_RESTORE:
               this.vNVuvnUUnuUn();
         }
      } else {
         this.uUnuvNvvNU(false);
      }
   }

   @Override
   public void C00OOC00oO() {
      this.uUnuvNvvNU(true);
      super.C00OOC00oO();
   }

   private void UuuNnUvUuv() {
      class_2680 var1 = this.uVunuUNVVUUV();
      if (var1 != null && uUnuvNvvNU.field_1690.field_1886.method_1434()) {
         int var2 = this.UuUVuuUu(var1);
         int var3 = uUnuvNvvNU.field_1724.method_31548().method_67532();
         if (var2 != -1 && var2 != var3) {
            this.UvUvUNuvNU = var2;
            this.c0oOOCcCoC0 = var3;
            this.VVnVNnunVvu = var2 >= 9;
            if (this.VVnVNnunVvu) {
               this.UuUVuuUu(AutoTool.NVnVnNnN.PREPARE_SWAP);
            } else {
               uUnuvNvvNU.field_1724.method_31548().method_61496(var2);
               this.UnUNuUU = AutoTool.NVnVnNnN.MINING;
            }
         }
      }
   }

   private void nUUVuvU() {
      if (!uUnuvNvvNU.field_1690.field_1886.method_1434() || this.uVunuUNVVUUV() == null) {
         this.uUnuvNvvNU(false);
      } else if (this.UvnvNVnnnnNU()) {
         this.uVUVnuvnuVuv();
         NVnVnU.UuUVuuUu().C00OOC00oO("AutoTool");
         this.UnUNuUU = AutoTool.NVnVnNnN.MINING;
      }
   }

   private void UnUNVVVNuv() {
      if (!uUnuvNvvNU.field_1690.field_1886.method_1434() || this.uVunuUNVVUUV() == null) {
         if (this.VVnVNnunVvu) {
            this.UuUVuuUu(AutoTool.NVnVnNnN.PREPARE_RESTORE);
         } else {
            this.NVNnnvnuunNv();
            this.uUnuvNvvNU(false);
         }
      }
   }

   private void vNVuvnUUnuUn() {
      if (this.UvnvNVnnnnNU()) {
         this.uVUVnuvnuVuv();
         this.uUnuvNvvNU(false);
      }
   }

   private void UuUVuuUu(AutoTool.NVnVnNnN var1) {
      NVnVnU.UuUVuuUu().UuUVuuUu("AutoTool");
      uUnuvNvvNU.field_1690.field_1867.method_23481(false);
      uUnuvNvvNU.field_1724.method_5728(false);
      this.uUVuVvuNUvnu = System.currentTimeMillis();
      this.UnUNuUU = var1;
   }

   private boolean UvnvNVnnnnNU() {
      NVnVnU.UuUVuuUu().UuUVuuUu("AutoTool");
      return System.currentTimeMillis() - this.uUVuVvuNUvnu >= 50L;
   }

   private void uVUVnuvnuVuv() {
      if (this.UvUvUNuvNU >= 9 && this.c0oOOCcCoC0 >= 0) {
         uUnuvNvvNU.field_1761
            .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, this.UvUvUNuvNU, this.c0oOOCcCoC0, class_1713.field_7791, uUnuvNvvNU.field_1724);
      }
   }

   private void NVNnnvnuunNv() {
      if (this.c0oOOCcCoC0 >= 0 && this.c0oOOCcCoC0 <= 8) {
         uUnuvNvvNU.field_1724.method_31548().method_61496(this.c0oOOCcCoC0);
      }
   }

   private class_2680 uVunuUNVVUUV() {
      return uUnuvNvvNU.field_1765 instanceof class_3965 var1 && var1.method_17783() == class_240.field_1332
         ? uUnuvNvvNU.field_1687.method_8320(var1.method_17777())
         : null;
   }

   private int UuUVuuUu(class_2680 var1) {
      int var2 = NVNnnvnuunNv.C00OOC00oO("Инвентарь") ? 9 : 0;
      int var3 = NVNnnvnuunNv.C00OOC00oO("Только хотбар") ? 9 : 36;
      int var4 = uUnuvNvvNU.field_1724.method_31548().method_67532();
      class_1799 var5 = uUnuvNvvNU.field_1724.method_31548().method_5438(var4);
      boolean var6 = this.UuUVuuUu(var5);
      int var7 = var6 ? var4 : -1;
      float var8 = var6 ? var5.method_7924(var1) : 1.0F;
      boolean var9 = !var1.method_29291() || var6 && var5.method_7951(var1);

      for (int var10 = var2; var10 < var3; var10++) {
         class_1799 var11 = uUnuvNvvNU.field_1724.method_31548().method_5438(var10);
         if (this.UuUVuuUu(var11)) {
            float var12 = var11.method_7924(var1);
            boolean var13 = !var1.method_29291() || var11.method_7951(var1);
            if (var13 && !var9 || var13 == var9 && var12 > var8) {
               var7 = var10;
               var8 = var12;
               var9 = var13;
            }
         }
      }

      return var7;
   }

   private boolean UuUVuuUu(class_1799 var1) {
      return !var1.method_7960() && (!var1.method_7963() || var1.method_7936() - var1.method_7919() > 1);
   }

   private void uUnuvNvvNU(boolean var1) {
      if (var1
         && uUnuvNvvNU.field_1724 != null
         && uUnuvNvvNU.field_1761 != null
         && (this.UnUNuUU == AutoTool.NVnVnNnN.MINING || this.UnUNuUU == AutoTool.NVnVnNnN.PREPARE_RESTORE)) {
         if (this.VVnVNnunVvu) {
            this.uVUVnuvnuVuv();
         } else {
            this.NVNnnvnuunNv();
         }
      }

      NVnVnU.UuUVuuUu().C00OOC00oO("AutoTool");
      NVnVnU.UuUVuuUu().UuUVuuUu.remove("AutoTool");
      this.UnUNuUU = AutoTool.NVnVnNnN.IDLE;
      this.uUVuVvuNUvnu = 0L;
      this.UvUvUNuvNU = -1;
      this.c0oOOCcCoC0 = -1;
      this.VVnVNnunVvu = false;
   }

   static enum NVnVnNnN {
      IDLE,
      PREPARE_SWAP,
      MINING,
      PREPARE_RESTORE;
   }
}
