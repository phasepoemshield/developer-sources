package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1799;
import net.minecraft.class_243;
import net.minecraft.class_2767;
import net.minecraft.class_3414;
import net.minecraft.class_3532;
import net.minecraft.class_408;
import net.minecraft.class_4184;
import org.lwjgl.glfw.GLFW;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "GeyserHelper",
   uUnuvNvvNU = oOOOo0.Player,
   C00OOC00oO = "Подсвечивает лут который можно слутать с ивента 'Гейзер' на FunTime"
)
public class GeyserHelper extends Module {
   private final Map<class_1542, Long> uNnUnnuNUnNu = new ConcurrentHashMap<>();
   private final List<GeyserHelper.nvnNNunvv> NnUuNNU = new ArrayList<>();
   private final Map<Integer, Long> nNvNUVU = new ConcurrentHashMap<>();
   public final vvNnnUNnVvn NVNnnvnuunNv = new vvNnnUNnVvn("Синхронизация с NameTags", true);
   public final UvNnUnuNUUU uVunuUNVVUUV = new UvNnUnuNUUU("Стилистика", "Тёмный", "Тёмный", "Светлый", "Блюр").UuUVuuUu(this.NVNnnvnuunNv::uUnuvNvvNU);
   public final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Прозрачность", 1.0F, 0.1F, 1.0F, 0.05F, true).UuUVuuUu(this.NVNnnvnuunNv::uUnuvNvvNU);
   private final vVvnUVnUvv UnUNuUU = new vVvnUVnUvv() {};
   private boolean uUVuVvuNUvnu = false;
   private float UvUvUNuvNU = 0.0F;
   private float c0oOOCcCoC0 = 0.0F;
   private float VVnVNnunVvu = 0.0F;
   private float unNNVVNnvvV = 0.0F;
   private float NuunnvnN = 0.0F;
   private boolean NVUunUNUN = false;
   private long UUVNuUNUvUnV = 0L;
   private final List<GeyserHelper.NVnVnNnN> vuvnUnVnUNnV = new ArrayList<>();
   private int nnuUVNUuvvVU;
   private int nVVUuvuNnUN;
   private float nNnVnUNVV = 1.0F;
   private String nuunNvv = "Тёмный";

   public GeyserHelper() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU});
      this.UnUNuUU.UuUVuuUu(this.NVNnnvnuunNv);
      this.UnUNuUU.UuUVuuUu(this.uVunuUNVVUUV);
      this.UnUNuUU.UuUVuuUu(this.UNnVVNvvnVvU);
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.nNvNUVU.clear();
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      this.uNnUnnuNUnNu.clear();
      this.NnUuNNU.clear();
      this.nNvNUVU.clear();
      this.uUVuVvuNUvnu = false;
      this.NuunnvnN = 0.0F;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (uUnuvNvvNU.field_1687 != null) {
         if (var1.vVvUvVVuuNvV() instanceof class_2767 var2) {
            String var4 = ((class_3414)var2.method_11894().comp_349()).toString();
            if (this.UuUVuuUu(var4)) {
               this.UuUVuuUu(var2.method_11890(), var2.method_11889(), var2.method_11893());
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1687 != null) {
         this.uNnUnnuNUnNu.keySet().removeIf(var0 -> !var0.method_5805() || var0.method_6983().method_7960());
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         this.vuvnUnVnUNnV.clear();
         this.UuuNnUvUuv();
         float var2 = uUnuvNvvNU.method_61966().method_60637(true);
         UnVNvNnU var3 = var1.vVvUvVVuuNvV();
         class_4184 var4 = uUnuvNvvNU.field_1773.method_19418();
         class_243 var5 = var4.method_19326();
         float var6 = (float)uUnuvNvvNU.field_1729.method_1603();
         float var7 = (float)uUnuvNvvNU.field_1729.method_1604();
         boolean var8 = uUnuvNvvNU.field_1755 instanceof class_408;
         this.NnUuNNU.clear();
         NameTags var9 = this.nUUVuvU();
         boolean var10 = var9 != null && var9.nuUnNvnuUu && var9.uVunuUNVVUUV.C00OOC00oO("Предметы");
         HashSet var11 = new HashSet();
         if (!this.uNnUnnuNUnNu.isEmpty()) {
            for (Entry var13 : this.uNnUnnuNUnNu.entrySet()) {
               class_1542 var14 = (class_1542)var13.getKey();
               class_243 var15 = var14.method_30950(var2);
               double var16 = var10 ? 0.52 : 0.7;
               class_243 var18 = new class_243(var15.field_1352, var15.field_1351 + var16, var15.field_1350);
               if (!(var18.method_1025(var5) < 1.0E-6)) {
                  class_243 var19 = VnNnNnvuvn.UuUVuuUu(var18);
                  if (!(var19.field_1350 <= 0.001F) && !(var19.field_1350 > 1.0)) {
                     double var20 = var5.method_1022(var18);
                     var11.add(var14.method_5628());
                     this.nNvNUVU.putIfAbsent(var14.method_5628(), System.currentTimeMillis());
                     float var22 = class_3532.method_15363((float)(System.currentTimeMillis() - this.nNvNUVU.get(var14.method_5628())) / 300.0F, 0.0F, 1.0F);
                     float var23 = 1.0F - (float)Math.pow(1.0F - var22, 4.0);
                     this.UuUVuuUu(var3, var14, (Long)var13.getValue(), (float)var19.field_1352, (float)var19.field_1351, (float)var20, var10, var23);
                  }
               }
            }
         }

         this.nNvNUVU.keySet().retainAll(var11);
         this.UuUVuuUu(var3);
         if (var8) {
            boolean var24 = GLFW.glfwGetMouseButton(uUnuvNvvNU.method_22683().method_4490(), 0) == 1;
            boolean var25 = var24 && !this.NVUunUNUN;
            this.NVUunUNUN = var24;
            if (var25 && System.currentTimeMillis() - this.UUVNuUNUvUnV > 150L) {
               this.UUVNuUNUvUnV = System.currentTimeMillis();
               boolean var26 = false;

               for (GeyserHelper.NVnVnNnN var30 : this.vuvnUnVnUNnV) {
                  if (this.UuUVuuUu(var6, var7, var30.x, var30.y, var30.w, var30.h)) {
                     var26 = true;
                     this.uUVuVvuNUvnu = !this.uUVuVvuNUvnu;
                     if (this.uUVuVvuNUvnu) {
                        this.UvUvUNuvNU = var30.x;
                        this.c0oOOCcCoC0 = var30.y;
                        this.VVnVNnunVvu = var30.w;
                        this.unNNVVNnvvV = var30.h;
                     }
                     break;
                  }
               }

               if (!var26 && this.uUVuVvuNUvnu) {
                  boolean var29 = this.UuUVuuUu(var6, var7, this.UvUvUNuvNU - 250.0F, this.c0oOOCcCoC0 - 150.0F, 600.0F, 500.0F);
                  if (!var29) {
                     this.uUVuVvuNUvnu = false;
                  }
               }
            }

            float var27 = this.uUVuVvuNUvnu ? 1.0F : 0.0F;
            this.NuunnvnN = this.NuunnvnN + (var27 - this.NuunnvnN) * 0.15F;
            if (this.NuunnvnN > 0.01F) {
               UuUuVnVvnvn.UuUVuuUu(
                  var3,
                  this.UnUNuUU,
                  this.UvUvUNuvNU,
                  this.c0oOOCcCoC0,
                  this.VVnVNnunVvu,
                  this.unNNVVNnvvV,
                  uUnuvNvvNU.method_22683().method_4486(),
                  uUnuvNvvNU.method_22683().method_4502(),
                  this.NuunnvnN,
                  var6,
                  var7,
                  var25,
                  var24
               );
            }
         } else {
            this.uUVuVvuNUvnu = false;
            this.NuunnvnN = 0.0F;
            this.NVUunUNUN = false;
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, class_1542 var2, long var3, float var5, float var6, float var7, boolean var8, float var9) {
      float var10 = (float)class_3532.method_15350(16.0 / Math.max((double)var7, 12.0), 0.75, 1.15);
      float var11 = 6.0F * var10;
      class_1799 var12 = var2.method_6983();
      float var13 = 24.0F * var10;
      long var14 = System.currentTimeMillis() - var3;
      String var16 = String.format("%.0f сек", (float)var14 / 1000.0F);
      float var17 = 6.0F * var10;
      float var18 = 20.0F * var10;
      float var19 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var16, var13).UuUVuuUu + var17 * 2.0F;
      if (var8) {
         float var20 = 12.0F * var10;
         float var21 = var20 * var9;
         float var22 = var6 + var21;
         float var23 = var5 - var19 / 2.0F;
         this.UuUVuuUu(var1, var23, var22, var19, var18, var11, var9);
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var23 + var17, var22 + 14.0F * var10, var13, var16, this.UuUVuuUu(this.nVVUuvuNnUN, var9));
         this.vuvnUnVnUNnV.add(new GeyserHelper.NVnVnNnN(var23, var22, var19, var18));
      } else {
         float var28 = 8.0F * var10 * (1.0F - var9);
         float var29 = var6 + var28;
         float var30 = 22.0F * var10;
         float var31 = 4.0F * var10;
         float var24 = var30 + var31 + var19;
         float var25 = var5 - var24 / 2.0F;
         this.UuUVuuUu(var1, var25, var29, var30, var30, var11, var9);
         float var26 = var29 + (var30 - var18) / 2.0F;
         this.UuUVuuUu(var1, var25 + var30 + var31, var26, var19, var18, var11, var9);
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var25 + var30 + var31 + var17, var26 + 14.0F * var10, var13, var16, this.UuUVuuUu(this.nVVUuvuNnUN, var9));
         float var27 = (var30 - 16.0F * var10) / 2.0F;
         this.NnUuNNU.add(new GeyserHelper.nvnNNunvv(var12, var25 + var27, var29 + var27, var25, var29, var30, var2.method_5628(), var10));
         this.vuvnUnVnUNnV.add(new GeyserHelper.NVnVnNnN(var25, var29, var24, var30));
      }
   }

   private void UuuNnUvUuv() {
      NameTags var1 = this.nUUVuvU();
      boolean var2 = this.NVNnnvnuunNv.uUnuvNvvNU() && var1 != null;
      String var3 = var2 ? var1.UUVNuUNUvUnV.uUnuvNvvNU() : this.uVunuUNVVUUV.uUnuvNvvNU();
      float var4 = var2 ? var1.uUVvnUuNvvN.uUnuvNvvNU() : this.UNnVVNvvnVvU.uUnuvNvvNU();
      if (var3.equals("Светлый")) {
         this.nnuUVNUuvvVU = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(240, 240, 245, (int)(255.0F * var4));
         this.nVVUuvuNnUN = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(30, 30, 30, 255);
      } else if (var3.equals("Блюр")) {
         this.nnuUVNUuvvVU = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(10, 10, 10, (int)(120.0F * var4));
         this.nVVUuvuNnUN = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(250, 250, 250, 255);
      } else {
         this.nnuUVNUuvvVU = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(25, 25, 26, (int)(255.0F * var4));
         this.nVVUuvuNnUN = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(240, 240, 240, 255);
      }

      this.nNnVnUNVV = var4;
      this.nuunNvv = var3;
   }

   private NameTags nUUVuvU() {
      try {
         return (NameTags)ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO(NameTags.class);
      } catch (Exception var2) {
         return null;
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = this.nNnVnUNVV * var7;
      if (!(var8 <= 0.05F)) {
         if (this.nuunNvv.equals("Блюр")) {
            var1.UuUVuuUu(23.0F);
            var1.UuUVuuUu(var2, var3, var4, var5, var6, var8);
         }

         int var9 = this.UuUVuuUu(this.nnuUVNUuvvVU, var7);
         var1.UuUVuuUu(var2, var3, var4, var5, var6, var9);
      }
   }

   private int UuUVuuUu(int var1, float var2) {
      int var3 = var1 >> 24 & 0xFF;
      int var4 = var1 >> 16 & 0xFF;
      int var5 = var1 >> 8 & 0xFF;
      int var6 = var1 & 0xFF;
      return UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(var4, var5, var6, (int)(var3 * var2));
   }

   private boolean UuUVuuUu(String var1) {
      String var2 = var1.toLowerCase();
      return var2.contains("extinguish") || var2.contains("fizz") || var2.contains("burn") || var2.contains("lava");
   }

   private void UuUVuuUu(double var1, double var3, double var5) {
      uUnuvNvvNU.execute(() -> {
         if (uUnuvNvvNU.field_1687 != null) {
            for (class_1297 var8 : uUnuvNvvNU.field_1687.method_18112()) {
               if (var8 instanceof class_1542 var9 && var9.method_5649(var1, var3, var5) <= 9.0) {
                  this.uNnUnnuNUnNu.putIfAbsent(var9, System.currentTimeMillis());
               }
            }
         }
      });
   }

   private boolean UuUVuuUu(float var1, float var2, float var3, float var4, float var5, float var6) {
      return var1 >= var3 && var1 <= var3 + var5 && var2 >= var4 && var2 <= var4 + var6;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1) {
      if (var1 != null && !this.NnUuNNU.isEmpty()) {
         for (GeyserHelper.nvnNNunvv var3 : this.NnUuNNU) {
            float var4 = NuNvVUuUUnun.UuUVuuUu(var3.clipX());
            float var5 = NuNvVUuUUnun.UuUVuuUu(var3.clipY());
            float var6 = Math.max(1.0F, NuNvVUuUUnun.UuUVuuUu(var3.clipSize()));
            var1.uUnuvNvvNU();
            var1.UuUVuuUu(var4, var5, var6, var6, var6 * 0.27F, var6 * 0.27F, var6 * 0.27F, var6 * 0.27F);
            boolean var9 = false /* VF: Semaphore variable */;

            try {
               var9 = true;
               NuNvVUuUUnun.UuUVuuUu(
                  var1,
                  var3.stack(),
                  NuNvVUuUUnun.UuUVuuUu(var3.x()),
                  NuNvVUuUUnun.UuUVuuUu(var3.y()),
                  NuNvVUuUUnun.uUnuvNvvNU(var3.scale()),
                  var3.seed(),
                  true,
                  var3.seed()
               );
               var9 = false;
            } finally {
               if (var9) {
                  var1.uUnuvNvvNU();
                  var1.nuUnNvnuUu();
               }
            }

            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
         }

         this.NnUuNNU.clear();
      }
   }

   record NVnVnNnN(float x, float y, float w, float h) {
   }

   record nvnNNunvv(class_1799 stack, float x, float y, float clipX, float clipY, float clipSize, int seed, float scale) {
   }
}
