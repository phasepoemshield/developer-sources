package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalNear;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lombok.Generated;
import net.minecraft.class_10799;
import net.minecraft.class_1268;
import net.minecraft.class_1542;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1893;
import net.minecraft.class_1921;
import net.minecraft.class_2246;
import net.minecraft.class_2282;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2846;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_3481;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4588;
import net.minecraft.class_476;
import net.minecraft.class_6880;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import net.minecraft.class_1921.class_4688;
import net.minecraft.class_2350.class_2353;
import net.minecraft.class_239.class_240;
import net.minecraft.class_2846.class_2847;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "CocoaFarm",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Авто-ферма какао-бобов на тропических брёвнах"
)
public class CocoaFarm extends Module {
   private static class_2338 uNnUnnuNUnNu;
   private static class_2338 NnUuNNU;
   public final vvNnnUNnVvn NVNnnvnuunNv = new vvNnnUNnVvn("Авто-посадка", true);
   public final vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Склад в сундук", true);
   public final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Логи", true);
   private static final double nNvNUVU = 4.6;
   private static final double UnUNuUU = 3.6;
   private static final float uUVuVvuNUvnu = 60.0F;
   private static final float UvUvUNuvNU = 5.0F;
   private static final float c0oOOCcCoC0 = 0.5F;
   private static final float VVnVNnunVvu = 4.0F;
   private static final long unNNVVNnvvV = 300L;
   private static final int NuunnvnN = 32;
   private static final long NVUunUNUN = 300L;
   private static final long UUVNuUNUvUnV = 2500L;
   private static final long vuvnUnVnUNnV = 5000L;
   private static final long nnuUVNUuvvVU = 4000L;
   private static final long nVVUuvuNnUN = 12000L;
   private static final long nNnVnUNVV = 30000L;
   private static final int nuunNvv = 6;
   private static final double uUVVvVVNvvn = 4.2;
   private static final long vvUVNVvvNUv = 6000L;
   private static final int UuNnnVnuNNV = 3;
   private static final long uUVvnUuNvvN = 30000L;
   private final VuNvNNvVV UUuUnNVNuuv = new VuNvNNvVV();
   private final VuNvNNvVV NVuNUuVnVUN = new VuNvNNvVV();
   private final VuNvNNvVV NVuunNnvvvVu = new VuNvNNvVV();
   private final VuNvNNvVV vNnNuuvVn = new VuNvNNvVV();
   private final VuNvNNvVV VUuuVUnun = new VuNvNNvVV();
   private final VuNvNNvVV vVVuuVVv = new VuNvNNvVV();
   private final List<CocoaFarm.VvunVVUvUNnv> VuunNUUUvu = new ArrayList<>();
   private final HashMap<class_2338, Long> NNUUNUuVNNVn = new HashMap<>();
   private final HashMap<Integer, Long> VvVvnNUnvuvV = new HashMap<>();
   private final HashMap<class_2338, long[]> ccOO0COcoco0 = new HashMap<>();
   private CocoaFarm.nvnNNunvv NUVvUUVuVNVv = CocoaFarm.nvnNNunvv.FARM;
   private CocoaFarm.VvunVVUvUNnv nNuVunNUVu;
   private class_2338 UNvvunVVn;
   private class_2338 UnvuVuVnNuvu;
   private class_2338 UvNNVUVNVuvV;
   private class_2338 NnunUUnU;
   private int nvuVvuNnNUnv = -1;
   private int NnVnNVN;
   private int vnvvNvUnVv = -1;
   private int OCOocoOoOO;
   private long o0Ooc0COOoc;
   private long nvvnUnUn;
   private double UnUUVuVunvVu;
   private int nnvuvUNuUnN;
   private boolean UVnuVUUVnnU;
   private int VunnVNvNV;
   private int NvUVUvVVnUu = -1;
   private boolean unnUnUNVnN;
   private boolean NnuUnUNnu;
   private boolean UnnnvvU;
   private static final int[] VUUnuVvVu = new int[]{0, -1, 1, -2, 2, -3, -4};
   private static final int VvVuvUvvNNVv = 4096;
   private static final RenderPipeline UnnNNvuvvUU = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "cocoa_zone_fill"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderPipeline VNNnnVUuvv = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "cocoa_zone_glow"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 vUvUvUNNuNvn = class_1921.method_24049(
      "cocoa_zone_fill", 4096, false, true, UnnNNvuvvUU, class_4688.method_23598().method_23617(false)
   );
   private static final class_1921 uuVuUuuVVNvN = class_1921.method_24049(
      "cocoa_zone_glow", 4096, false, true, VNNnnVUuvv, class_4688.method_23598().method_23617(false)
   );
   private static final int VvuUUUNNNv = -65409;
   private static final int uuuVnuvnnNnU = -8781569;
   private static final int nNunUnVN = 657938;
   private static final int VnVuuvVvnNv = 20;

   public static void UuuNnUvUuv() {
      uNnUnnuNUnNu = null;
      NnUuNNU = null;
   }

   public CocoaFarm() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV});

      try {
         BaritoneAPI.getSettings().chunkCaching.value = false;
      } catch (Throwable var2) {
      }
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.NUVvUUVuVNVv = CocoaFarm.nvnNNunvv.FARM;
      this.VuunNUUUvu.clear();
      this.NNUUNUuVNNVn.clear();
      this.nNuVunNUVu = null;
      this.UNvvunVVn = null;
      this.UnvuVuVnNuvu = null;
      this.UvNNVUVNVuvV = null;
      this.NnunUUnU = null;
      this.nvuVvuNnNUnv = -1;
      this.NnVnNVN = 0;
      this.vnvvNvUnVv = -1;
      this.OCOocoOoOO = 0;
      this.o0Ooc0COOoc = 0L;
      this.nvvnUnUn = 0L;
      this.UnUUVuVunvVu = Double.MAX_VALUE;
      this.nnvuvUNuUnN = 0;
      this.UVnuVUUVnnU = false;
      this.VunnVNvNV = 0;
      this.NvUVUvVVnUu = -1;
      this.VvVvnNUnvuvV.clear();
      this.ccOO0COcoco0.clear();
      this.NVuNUuVnVUN.UuUVuuUu();
      this.UUuUnNVNuuv.UuUVuuUu();
      this.NVuunNnvvvVu.UuUVuuUu();
      this.vNnNuuvVn.UuUVuuUu();
      this.vVVuuVVv.UuUVuuUu();
      this.unnUnUNVnN = (Boolean)BaritoneAPI.getSettings().allowBreak.value;
      this.NnuUnUNnu = (Boolean)BaritoneAPI.getSettings().allowPlace.value;
      this.UnnnvvU = (Boolean)BaritoneAPI.getSettings().allowSprint.value;
      BaritoneAPI.getSettings().allowBreak.value = false;
      BaritoneAPI.getSettings().allowPlace.value = false;
      BaritoneAPI.getSettings().chunkCaching.value = false;
      if (uNnUnnuNUnNu != null && NnUuNNU != null) {
         this.C00OOC00oO("Запуск, зона " + this.nvUVNnuu(uNnUnnuNUnNu) + " — " + this.nvUVNnuu(NnUuNNU));
      } else {
         vVnvuVVUunuv.UuUVuuUu("§c[CocoaFarm] §fСначала задайте зону: §e.cocoa pos1 §fи §e.cocoa pos2");
      }
   }

   @Override
   public void C00OOC00oO() {
      this.UnUNuUU();
      BaritoneAPI.getSettings().allowBreak.value = this.unnUnUNVnN;
      BaritoneAPI.getSettings().allowPlace.value = this.NnuUnUNnu;
      BaritoneAPI.getSettings().allowSprint.value = this.UnnnvvU;
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      COC0OCc.nuUnNvnuUu = 0;
      COC0OCc.uVUuuVnNVU = null;
      NNvvnnunn.UuUVuuUu = false;
      this.UnvuVuVnNuvu = null;
      this.nNuVunNUVu = null;
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         if (uNnUnnuNUnNu != null && NnUuNNU != null) {
            if (PlayerHelper.UuuNnUvUuv()) {
               this.UnUNuUU();
            } else if (this.NUVvUUVuVNVv != CocoaFarm.nvnNNunvv.FARM && System.currentTimeMillis() > this.o0Ooc0COOoc) {
               this.C00OOC00oO("Тайм-аут депозит-сессии, блокирую сундук");
               this.uUnuvNvvNU(true);
            } else {
               switch (this.NUVvUUVuVNVv) {
                  case FARM:
                     this.vNVuvnUUnuUn();
                     break;
                  case NAVIGATING:
                     this.uVUVnuvnuVuv();
                     break;
                  case INTERACTING:
                     this.NVNnnvnuunNv();
                     break;
                  case WAITING_FOR_CONTAINER:
                     this.uVunuUNVVUUV();
                     break;
                  case DEPOSITING:
                     this.UNnVVNvvnVvU();
               }
            }
         }
      }
   }

   private void vNVuvnUUnuUn() {
      if (this.uVunuUNVVUUV.uUnuvNvvNU()
         && System.currentTimeMillis() >= this.nvvnUnUn
         && (this.nnuUVNUuvvVU() == 0 || this.vuvnUnVnUNnV() >= 4)
         && this.vuvnUnVnUNnV() > 1) {
         class_2338 var1 = this.unNNVVNnvvV();
         if (var1 != null) {
            this.NnunUUnU = var1;
            this.NUVvUUVuVNVv = CocoaFarm.nvnNNunvv.NAVIGATING;
            this.VUuuVUnun.UuUVuuUu();
            this.NVuunNnvvvVu.UuUVuuUu();
            this.UnUUVuVunvVu = Double.MAX_VALUE;
            this.UnUNuUU();
            this.NnVnNVN = 0;
            this.OCOocoOoOO = 0;
            this.vnvvNvUnVv = -1;
            this.o0Ooc0COOoc = System.currentTimeMillis() + 30000L;
            this.C00OOC00oO("Инвентарь полон, иду к сундуку " + this.nvUVNnuu(var1));
            return;
         }
      }

      if (this.nNuVunNUVu == null || !this.vVvUvVVuuNvV(this.nNuVunNUVu)) {
         this.nNuVunNUVu = null;
         if (this.NVuNUuVnVUN.uNNnnnuuuN(300L)) {
            this.NnUuNNU();
            this.NVuNUuVnVUN.UuUVuuUu();
         }

         CocoaFarm.VvunVVUvUNnv var9 = this.nNvNUVU();
         if (var9 != null && this.vVvUvVVuuNvV(var9.C00OOC00oO)) {
            var9 = null;
         }

         if (var9 != null && !var9.C00OOC00oO.equals(this.UNvvunVVn)) {
            this.UNvvunVVn = var9.C00OOC00oO;
            this.nnvuvUNuUnN = 0;
            this.NVuunNnvvvVu.UuUVuuUu();
            this.UnUUVuVunvVu = Double.MAX_VALUE;
         }

         this.nNuVunNUVu = var9;
      }

      if (!this.uUVuVvuNUvnu()) {
         if (this.nNuVunNUVu == null) {
            if (!this.UVnuVUUVnnU) {
               this.C00OOC00oO("Целей нет, жду созревания");
               this.UVnuVUUVnnU = true;
            }

            this.UnUNuUU();
         } else {
            this.UVnuVUUVnnU = false;
            class_2338 var10 = this.nuUnNvnuUu(this.nNuVunNUVu);
            double var2 = uUnuvNvvNU.field_1724.method_23317() - (var10.method_10263() + 0.5);
            double var4 = uUnuvNvvNU.field_1724.method_23321() - (var10.method_10260() + 0.5);
            boolean var6 = var2 * var2 + var4 * var4 <= 1.44;
            double var7 = uUnuvNvvNU.field_1724.method_33571().method_1022(this.uNNnnnuuuN(this.nNuVunNUVu));
            if (var7 > 4.6 || !var6 && var7 > 3.6) {
               if (!this.UuUVuuUu(var7, var10)) {
                  this.UuUVuuUu("не могу дойти до " + this.nvUVNnuu(this.nNuVunNUVu.C00OOC00oO) + " (дист " + Math.round(var7 * 10.0) / 10.0 + ")");
               }
            } else {
               if (this.nNuVunNUVu.UuUVuuUu == CocoaFarm.NVnVnNnN.HARVEST) {
                  this.UuUVuuUu(this.nNuVunNUVu);
               } else {
                  this.C00OOC00oO(this.nNuVunNUVu);
               }
            }
         }
      }
   }

   private boolean UuUVuuUu(double var1, class_2338 var3) {
      if (var1 < this.UnUUVuVunvVu - 0.4) {
         this.UnUUVuVunvVu = var1;
         this.NVuunNnvvvVu.UuUVuuUu();
      }

      if (this.NVuunNnvvvVu.uNNnnnuuuN(5000L)) {
         return false;
      } else {
         this.VVuuUN(var3);
         return true;
      }
   }

   private void UuUVuuUu(String var1) {
      this.C00OOC00oO("Пропуск: " + var1);
      this.NNUUNUuVNNVn.put(this.nNuVunNUVu.C00OOC00oO, System.currentTimeMillis() + 12000L);
      this.nNuVunNUVu = null;
      this.UnvuVuVnNuvu = null;
      this.UnUNuUU();
   }

   private void uUnuvNvvNU(class_2338 var1) {
      uUnuvNvvNU.field_1724.field_3944.method_52787(new class_2846(class_2847.field_12971, var1, class_2350.field_11033));
   }

   private boolean vVvUvVVuuNvV(class_2338 var1) {
      long var2 = System.currentTimeMillis();
      long[] var4 = this.ccOO0COcoco0.get(var1);
      if (var4 != null && var2 - var4[1] <= 6000L) {
         var4[0]++;
         var4[1] = var2;
         if (var4[0] >= 3L) {
            this.ccOO0COcoco0.remove(var1);
            this.NNUUNUuVNNVn.put(var1, var2 + 30000L);
            this.uUnuvNvvNU(var1);
            this.C00OOC00oO("Фантомный блок " + this.nvUVNnuu(var1) + ", ресинк и пропуск");
            return true;
         } else {
            return false;
         }
      } else {
         this.ccOO0COcoco0.put(var1.method_10062(), new long[]{1L, var2});
         if (this.ccOO0COcoco0.size() > 128) {
            this.ccOO0COcoco0.entrySet().removeIf(var2x -> var2 - var2x.getValue()[1] > 6000L);
         }

         return false;
      }
   }

   private void UuUVuuUu(CocoaFarm.VvunVVUvUNnv var1) {
      class_3965 var2 = this.VVuuUN(var1);
      if (var2 != null && !(uUnuvNvvNU.field_1724.method_33571().method_1022(var2.method_17784()) > 4.2)) {
         this.NVuunNnvvvVu.UuUVuuUu();
         this.UnUNuUU();
         uuUuvNuNVNVU var3 = this.UuUVuuUu(var2.method_17784());
         this.UuUVuuUu(var3);
         if (!(new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var3) > 4.0F)) {
            if (!this.NuunnvnN()) {
               class_3965 var4 = this.nVVUuvuNnUN();
               class_3965 var5 = var4 != null && var4.method_17777().equals(var1.C00OOC00oO) ? var4 : var2;
               if (!var1.C00OOC00oO.equals(this.UnvuVuVnNuvu)) {
                  if (!this.UUuUnNVNuuv.uNNnnnuuuN(300L)) {
                     return;
                  }

                  uUnuvNvvNU.field_1761.method_2910(var1.C00OOC00oO, var5.method_17780());
                  this.UnvuVuVnNuvu = var1.C00OOC00oO;
                  this.vNnNuuvVn.UuUVuuUu();
                  this.UUuUnNVNuuv.UuUVuuUu();
               } else {
                  if (this.vNnNuuvVn.uNNnnnuuuN(4000L)) {
                     this.uUnuvNvvNU(var1.C00OOC00oO);
                     this.UuUVuuUu("какао " + this.nvUVNnuu(var1.C00OOC00oO) + " не ломается, ресинк фантома");
                     return;
                  }

                  uUnuvNvvNU.field_1761.method_2902(var1.C00OOC00oO, var5.method_17780());
               }

               uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
            }
         }
      } else {
         this.uUnuvNvvNU(var1);
      }
   }

   private void C00OOC00oO(CocoaFarm.VvunVVUvUNnv var1) {
      if (!this.UUVNuUNUvUnV()) {
         this.C00OOC00oO("Бобы закончились, посадка недоступна");
         this.nNuVunNUVu = null;
      } else if (!this.NVUunUNUN()) {
         if (uUnuvNvvNU.field_1724.method_6047().method_31574(class_1802.field_8116)) {
            if (this.nnvuvUNuUnN >= 6) {
               this.uUnuvNvvNU(var1.C00OOC00oO);
               this.uUnuvNvvNU(var1.C00OOC00oO.method_10093(var1.uUnuvNvvNU));
               this.UuUVuuUu("посадка " + this.nvUVNnuu(var1.C00OOC00oO.method_10093(var1.uUnuvNvvNU)) + " не проходит, ресинк фантома");
            } else {
               class_3965 var2 = this.UuUVuuUu(var1.C00OOC00oO, var1.uUnuvNvvNU);
               if (var2 != null && !(uUnuvNvvNU.field_1724.method_33571().method_1022(var2.method_17784()) > 4.2)) {
                  this.NVuunNnvvvVu.UuUVuuUu();
                  this.UnUNuUU();
                  uuUuvNuNVNVU var3 = this.UuUVuuUu(var2.method_17784());
                  this.UuUVuuUu(var3);
                  if (!(new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var3) > 4.0F)) {
                     if (this.UUuUnNVNuuv.uNNnnnuuuN(300L)) {
                        class_3965 var4 = this.nVVUuvuNnUN();
                        class_3965 var5 = var4 != null && var4.method_17777().equals(var1.C00OOC00oO) && var4.method_17780() == var1.uUnuvNvvNU ? var4 : var2;
                        uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var5);
                        uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                        this.nnvuvUNuUnN++;
                        this.UUuUnNVNuuv.UuUVuuUu();
                        this.UnvuVuVnNuvu = null;
                     }
                  }
               } else {
                  this.uUnuvNvvNU(var1);
               }
            }
         }
      }
   }

   private void uUnuvNvvNU(CocoaFarm.VvunVVUvUNnv var1) {
      class_2338 var2 = this.nuUnNvnuUu(var1);
      double var3 = uUnuvNvvNU.field_1724.method_23317() - (var2.method_10263() + 0.5);
      double var5 = uUnuvNvvNU.field_1724.method_23321() - (var2.method_10260() + 0.5);
      double var7 = var3 * var3 + var5 * var5;
      if (var7 > 2.5) {
         if (!this.UuUVuuUu(Math.sqrt(var7), var2)) {
            this.UuUVuuUu("не могу подойти к " + this.nvUVNnuu(var1.C00OOC00oO));
         }
      } else {
         if (this.NVuunNnvvvVu.uNNnnnuuuN(2500L)) {
            this.UuUVuuUu("нет прямой видимости " + this.nvUVNnuu(var1.C00OOC00oO));
         }
      }
   }

   private boolean UvnvNVnnnnNU() {
      return this.NnunUUnU != null && this.UuUVuuUu(uUnuvNvvNU.field_1687.method_8320(this.NnunUUnU));
   }

   private void uUnuvNvvNU(boolean var1) {
      if (var1) {
         this.nvvnUnUn = System.currentTimeMillis() + 30000L;
      }

      this.NnunUUnU = null;
      this.nvuVvuNnNUnv = -1;
      this.UnUNuUU();
      this.NUVvUUVuVNVv = CocoaFarm.nvnNNunvv.FARM;
   }

   private void uVUVnuvnuVuv() {
      if (!this.UvnvNVnnnnNU()) {
         this.uUnuvNvvNU(false);
      } else if (this.VUuuVUnun.uNNnnnuuuN(15000L)) {
         this.C00OOC00oO("Не смог дойти до сундука, вернусь позже");
         this.uUnuvNvvNU(true);
      } else if (uUnuvNvvNU.field_1724.method_33571().method_1022(class_243.method_24953(this.NnunUUnU)) <= 4.5) {
         this.UnUNuUU();
         this.UUuUnNVNuuv.UuUVuuUu();
         this.NUVvUUVuVNVv = CocoaFarm.nvnNNunvv.INTERACTING;
      } else {
         this.VVuuUN(this.NnunUUnU);
      }
   }

   private void NVNnnvnuunNv() {
      if (!this.UvnvNVnnnnNU()) {
         this.uUnuvNvvNU(false);
      } else if (this.NnVnNVN >= 3) {
         this.C00OOC00oO("Сундук не открывается, блокирую");
         this.uUnuvNvvNU(true);
      } else {
         this.UnUNuUU();
         if (uUnuvNvvNU.field_1724.method_33571().method_1022(class_243.method_24953(this.NnunUUnU)) > 4.6) {
            this.VUuuVUnun.UuUVuuUu();
            this.NUVvUUVuVNVv = CocoaFarm.nvnNNunvv.NAVIGATING;
         } else {
            class_3965 var1 = this.vuuuNvNuv(this.NnunUUnU);
            class_243 var2 = var1 != null ? var1.method_17784() : class_243.method_24953(this.NnunUUnU);
            uuUuvNuNVNVU var3 = this.UuUVuuUu(var2);
            this.UuUVuuUu(var3);
            if (!(new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var3) > 4.0F)) {
               if (this.UUuUnNVNuuv.uNNnnnuuuN(300L)) {
                  class_3965 var4 = var1 != null ? var1 : new class_3965(var2, class_2350.field_11036, this.NnunUUnU, false);
                  uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var4);
                  uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                  this.NnVnNVN++;
                  this.nvuVvuNnNUnv = -1;
                  this.VUuuVUnun.UuUVuuUu();
                  this.UUuUnNVNuuv.UuUVuuUu();
                  this.NUVvUUVuVNVv = CocoaFarm.nvnNNunvv.WAITING_FOR_CONTAINER;
               }
            }
         }
      }
   }

   private void uVunuUNVVUUV() {
      this.UnUNuUU();
      if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
         int var3 = ((class_1707)var1.method_17577()).field_7763;
         if (uUnuvNvvNU.field_1724.field_7512 != null && uUnuvNvvNU.field_1724.field_7512.field_7763 == var3) {
            this.nvuVvuNnNUnv = var3;
            this.vnvvNvUnVv = -1;
            this.OCOocoOoOO = 0;
            this.VUuuVUnun.UuUVuuUu();
            this.NUVvUUVuVNVv = CocoaFarm.nvnNNunvv.DEPOSITING;
            return;
         }
      }

      if (this.VUuuVUnun.uNNnnnuuuN(4000L)) {
         this.C00OOC00oO("Сундук не ответил открытием, повтор подхода");
         this.VUuuVUnun.UuUVuuUu();
         this.NUVvUUVuVNVv = CocoaFarm.nvnNNunvv.NAVIGATING;
      }
   }

   private void UNnVVNvvnVvU() {
      if (!(
         uUnuvNvvNU.field_1755 instanceof class_476 var1
            && uUnuvNvvNU.field_1724.field_7512 != null
            && uUnuvNvvNU.field_1724.field_7512.field_7763 == this.nvuVvuNnNUnv
            && ((class_1707)var1.method_17577()).field_7763 == this.nvuVvuNnNUnv
      )) {
         this.uUnuvNvvNU(false);
      } else if (this.VUuuVUnun.uNNnnnuuuN(50L)) {
         int var6 = this.uNnUnnuNUnNu();
         if (this.vnvvNvUnVv >= 0 && var6 >= this.vnvvNvUnVv) {
            this.OCOocoOoOO++;
         } else {
            this.OCOocoOoOO = 0;
         }

         this.vnvvNvUnVv = var6;
         if (this.OCOocoOoOO >= 3) {
            vVnvuVVUunuv.UuUVuuUu("§c[CocoaFarm] §fСундук заполнен, освободите место");
            uUnuvNvvNU.field_1724.method_7346();
            this.uUnuvNvvNU(true);
         } else {
            class_1707 var3 = (class_1707)var1.method_17577();
            int var4 = var3.method_17388() * 9;
            int var5 = this.UuUVuuUu(var3, var4);
            if (var5 == -1) {
               uUnuvNvvNU.field_1724.method_7346();
               this.C00OOC00oO("Депозит завершён");
               this.uUnuvNvvNU(false);
            } else {
               uUnuvNvvNU.field_1761.method_2906(this.nvuVvuNnNUnv, var5, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
               this.VUuuVUnun.UuUVuuUu();
            }
         }
      }
   }

   private int uNnUnnuNUnNu() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
         if (var3.method_31574(class_1802.field_8116)) {
            var1 += var3.method_7947();
         }
      }

      return var1;
   }

   private int UuUVuuUu(class_1707 var1, int var2) {
      boolean var3 = this.NVNnnvnuunNv.uUnuvNvvNU();
      boolean var4 = false;

      for (int var5 = var2; var5 < var1.field_7761.size(); var5++) {
         class_1735 var6 = var1.method_7611(var5);
         if (var6.method_7681() && var6.method_7677().method_31574(class_1802.field_8116)) {
            if (!var3 || var4) {
               return var5;
            }

            var4 = true;
         }
      }

      return -1;
   }

   private void NnUuNNU() {
      this.VuunNUUUvu.clear();
      boolean var1 = this.NVNnnvnuunNv.uUnuvNvvNU() && this.UUVNuUNUvUnV();
      int[] var2 = this.VVnVNnunVvu();
      int var3 = 0;
      int var4 = 0;

      for (class_2338 var6 : class_2338.method_10094(var2[0], var2[1], var2[2], var2[3], var2[4], var2[5])) {
         class_2680 var7 = uUnuvNvvNU.field_1687.method_8320(var6);
         if (var7.method_26164(class_3481.field_15474)) {
            class_2338 var8 = var6.method_10062();

            for (class_2350 var10 : class_2353.field_11062) {
               class_2338 var11 = var8.method_10093(var10);
               if (!this.uVUuuVnNVU(var11) && !this.uVUuuVnNVU(var8)) {
                  class_2680 var12 = uUnuvNvvNU.field_1687.method_8320(var11);
                  if (var12.method_27852(class_2246.field_10302)) {
                     if ((Integer)var12.method_11654(class_2282.field_10779) >= 2) {
                        this.VuunNUUUvu.add(new CocoaFarm.VvunVVUvUNnv(CocoaFarm.NVnVnNnN.HARVEST, var11, var10));
                        var3++;
                     }
                  } else if (var1 && (var12.method_26215() || var12.method_45474())) {
                     this.VuunNUUUvu.add(new CocoaFarm.VvunVVUvUNnv(CocoaFarm.NVnVnNnN.PLANT, var8, var10));
                     var4++;
                  }
               }
            }
         }
      }

      int var13 = var3 + var4;
      if (var13 > 0 && this.VunnVNvNV == 0) {
         this.C00OOC00oO("Найдено целей: сбор " + var3 + ", посадка " + var4);
      }

      this.VunnVNvNV = var13;
   }

   private CocoaFarm.VvunVVUvUNnv nNvNUVU() {
      class_243 var1 = uUnuvNvvNU.field_1724.method_33571();
      CocoaFarm.VvunVVUvUNnv var2 = null;
      double var3 = Double.MAX_VALUE;

      for (CocoaFarm.VvunVVUvUNnv var6 : this.VuunNUUUvu) {
         if (this.vVvUvVVuuNvV(var6) && !this.uVUuuVnNVU(var6.C00OOC00oO)) {
            double var7 = var1.method_1025(this.uNNnnnuuuN(var6));
            if (var6.UuUVuuUu == CocoaFarm.NVnVnNnN.PLANT) {
               var7 += 0.001;
            }

            if (var7 < var3) {
               var3 = var7;
               var2 = var6;
            }
         }
      }

      return var2;
   }

   private boolean vVvUvVVuuNvV(CocoaFarm.VvunVVUvUNnv var1) {
      if (var1 == null) {
         return false;
      } else if (var1.UuUVuuUu == CocoaFarm.NVnVnNnN.HARVEST) {
         class_2680 var4 = uUnuvNvvNU.field_1687.method_8320(var1.C00OOC00oO);
         return var4.method_27852(class_2246.field_10302) && (Integer)var4.method_11654(class_2282.field_10779) >= 2;
      } else if (!this.UUVNuUNUvUnV()) {
         return false;
      } else {
         class_2680 var2 = uUnuvNvvNU.field_1687.method_8320(var1.C00OOC00oO);
         if (!var2.method_26164(class_3481.field_15474)) {
            return false;
         } else {
            class_2680 var3 = uUnuvNvvNU.field_1687.method_8320(var1.C00OOC00oO.method_10093(var1.uUnuvNvvNU));
            return var3.method_26215() || var3.method_45474();
         }
      }
   }

   private class_243 uNNnnnuuuN(CocoaFarm.VvunVVUvUNnv var1) {
      return var1.UuUVuuUu == CocoaFarm.NVnVnNnN.HARVEST ? class_243.method_24953(var1.C00OOC00oO) : this.uUnuvNvvNU(var1.C00OOC00oO, var1.uUnuvNvvNU);
   }

   private class_2338 nuUnNvnuUu(CocoaFarm.VvunVVUvUNnv var1) {
      class_2338 var2 = var1.UuUVuuUu == CocoaFarm.NVnVnNnN.HARVEST ? var1.C00OOC00oO : var1.C00OOC00oO.method_10093(var1.uUnuvNvvNU);
      class_2338 var3 = var1.UuUVuuUu == CocoaFarm.NVnVnNnN.HARVEST
         ? var1.C00OOC00oO.method_10093(var1.uUnuvNvvNU)
         : var1.C00OOC00oO.method_10079(var1.uUnuvNvvNU, 2);
      int var4 = uUnuvNvvNU.field_1724.method_24515().method_10264();
      class_2338[] var5 = new class_2338[]{var2, var3};

      for (class_2338 var9 : var5) {
         for (int var13 : VUUnuVvVu) {
            class_2338 var14 = new class_2338(var9.method_10263(), var4 + var13, var9.method_10260());
            if (this.uNNnnnuuuN(var14) && this.nuUnNvnuUu(var14)) {
               return var14;
            }
         }
      }

      return new class_2338(var2.method_10263(), var4, var2.method_10260());
   }

   private boolean uNNnnnuuuN(class_2338 var1) {
      int var2 = Math.min(uNnUnnuNUnNu.method_10263(), NnUuNNU.method_10263());
      int var3 = Math.max(uNnUnnuNUnNu.method_10263(), NnUuNNU.method_10263());
      int var4 = Math.min(uNnUnnuNUnNu.method_10264(), NnUuNNU.method_10264());
      int var5 = Math.max(uNnUnnuNUnNu.method_10264(), NnUuNNU.method_10264());
      int var6 = Math.min(uNnUnnuNUnNu.method_10260(), NnUuNNU.method_10260());
      int var7 = Math.max(uNnUnnuNUnNu.method_10260(), NnUuNNU.method_10260());
      return var1.method_10263() >= var2
         && var1.method_10263() <= var3
         && var1.method_10264() >= var4
         && var1.method_10264() <= var5
         && var1.method_10260() >= var6
         && var1.method_10260() <= var7;
   }

   private boolean nuUnNvnuUu(class_2338 var1) {
      class_2680 var2 = uUnuvNvvNU.field_1687.method_8320(var1);
      class_2680 var3 = uUnuvNvvNU.field_1687.method_8320(var1.method_10084());
      class_2680 var4 = uUnuvNvvNU.field_1687.method_8320(var1.method_10074());
      boolean var5 = var2.method_26215() || var2.method_26220(uUnuvNvvNU.field_1687, var1).method_1110();
      boolean var6 = var3.method_26215() || var3.method_26220(uUnuvNvvNU.field_1687, var1.method_10084()).method_1110();
      boolean var7 = !var4.method_26215()
         && !var4.method_27852(class_2246.field_10302)
         && !var4.method_26220(uUnuvNvvNU.field_1687, var1.method_10074()).method_1110();
      return var5 && var6 && var7;
   }

   private void VVuuUN(class_2338 var1) {
      IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
      boolean var3 = !var1.equals(this.UvNNVUVNVuvV);
      if (var3 || !var2.getCustomGoalProcess().isActive()) {
         var2.getCustomGoalProcess().setGoalAndPath(new GoalNear(var1, 1));
         if (var3) {
            this.C00OOC00oO("Иду к " + this.nvUVNnuu(var1));
         }

         this.UvNNVUVNVuvV = var1;
      }
   }

   private void UnUNuUU() {
      IBaritone var1 = BaritoneAPI.getProvider().getPrimaryBaritone();
      if (var1.getCustomGoalProcess().isActive()) {
         var1.getPathingBehavior().cancelEverything();
      }

      this.UvNNVUVNVuvV = null;
   }

   private boolean uUVuVvuNUvnu() {
      if (!this.c0oOOCcCoC0()) {
         return false;
      } else {
         class_1542 var1 = this.UvUvUNuvNU();
         if (var1 == null) {
            this.NvUVUvVVnUu = -1;
            return false;
         } else {
            double var2 = uUnuvNvvNU.field_1724.method_23317() - var1.method_23317();
            double var4 = uUnuvNvvNU.field_1724.method_23321() - var1.method_23321();
            double var6 = var2 * var2 + var4 * var4;
            boolean var8 = this.nNuVunNUVu == null;
            if (var6 > 36.0 && !var8) {
               return false;
            } else if (var6 <= 1.7) {
               this.NvUVUvVVnUu = -1;
               return false;
            } else {
               if (var1.method_5628() != this.NvUVUvVVnUu) {
                  this.NvUVUvVVnUu = var1.method_5628();
                  this.vVVuuVVv.UuUVuuUu();
               }

               if (this.vVVuuVVv.uNNnnnuuuN(8000L)) {
                  this.VvVvnNUnvuvV.put(var1.method_5628(), System.currentTimeMillis() + 45000L);
                  this.NvUVUvVVnUu = -1;
                  return false;
               } else {
                  this.vNUvnnVnUvu(this.UuUVuuUu(var1));
                  return true;
               }
            }
         }
      }
   }

   private class_2338 UuUVuuUu(class_1542 var1) {
      class_2338 var2 = class_2338.method_49637(var1.method_23317(), var1.method_23318() + 0.1, var1.method_23321());
      int var3 = uUnuvNvvNU.field_1724.method_24515().method_10264();

      for (int var7 : VUUnuVvVu) {
         class_2338 var8 = new class_2338(var2.method_10263(), var3 + var7, var2.method_10260());
         if (this.uNNnnnuuuN(var8) && this.nuUnNvnuUu(var8)) {
            return var8;
         }
      }

      return new class_2338(var2.method_10263(), var3, var2.method_10260());
   }

   private class_1542 UvUvUNuvNU() {
      class_238 var1 = class_238.method_54784(uNnUnnuNUnNu, NnUuNNU).method_1014(1.0);
      List var2 = uUnuvNvvNU.field_1687
         .method_8390(class_1542.class, var1, var0 -> var0.method_5805() && var0.method_6983().method_31574(class_1802.field_8116));
      class_1542 var3 = null;
      double var4 = Double.MAX_VALUE;
      long var6 = System.currentTimeMillis();

      for (class_1542 var9 : var2) {
         Long var10 = this.VvVvnNUnvuvV.get(var9.method_5628());
         if (var10 != null) {
            if (var6 <= var10) {
               continue;
            }

            this.VvVvnNUnvuvV.remove(var9.method_5628());
         }

         double var11 = uUnuvNvvNU.field_1724.method_5858(var9);
         if (var11 < var4) {
            var4 = var11;
            var3 = var9;
         }
      }

      return var3;
   }

   private boolean c0oOOCcCoC0() {
      for (int var1 = 0; var1 < 36; var1++) {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1);
         if (var2.method_7960()) {
            return true;
         }

         if (var2.method_31574(class_1802.field_8116) && var2.method_7947() < var2.method_7914()) {
            return true;
         }
      }

      return false;
   }

   private void vNUvnnVnUvu(class_2338 var1) {
      IBaritone var2 = BaritoneAPI.getProvider().getPrimaryBaritone();
      boolean var3 = !var1.equals(this.UvNNVUVNVuvV);
      if (var3 || !var2.getCustomGoalProcess().isActive()) {
         var2.getCustomGoalProcess().setGoalAndPath(new GoalNear(var1, 1));
         if (var3) {
            this.C00OOC00oO("Подбираю лут " + this.nvUVNnuu(var1));
         }

         this.UvNNVUVNVuvV = var1;
      }
   }

   private int[] VVnVNnunVvu() {
      int var1 = Math.min(uNnUnnuNUnNu.method_10263(), NnUuNNU.method_10263());
      int var2 = Math.min(uNnUnnuNUnNu.method_10264(), NnUuNNU.method_10264());
      int var3 = Math.min(uNnUnnuNUnNu.method_10260(), NnUuNNU.method_10260());
      int var4 = Math.max(uNnUnnuNUnNu.method_10263(), NnUuNNU.method_10263());
      int var5 = Math.max(uNnUnnuNUnNu.method_10264(), NnUuNNU.method_10264());
      int var6 = Math.max(uNnUnnuNUnNu.method_10260(), NnUuNNU.method_10260());
      class_2338 var7 = uUnuvNvvNU.field_1724.method_24515();
      var1 = Math.max(var1, var7.method_10263() - 32);
      var3 = Math.max(var3, var7.method_10260() - 32);
      var4 = Math.min(var4, var7.method_10263() + 32);
      var6 = Math.min(var6, var7.method_10260() + 32);
      return new int[]{var1, var2, var3, var4, var5, var6};
   }

   private class_2338 unNNVVNnvvV() {
      int[] var1 = this.VVnVNnunVvu();
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      class_2338 var3 = null;
      double var4 = Double.MAX_VALUE;

      for (class_2338 var7 : class_2338.method_10094(var1[0], var1[1], var1[2], var1[3], var1[4], var1[5])) {
         if (this.UuUVuuUu(uUnuvNvvNU.field_1687.method_8320(var7))) {
            double var8 = var2.method_1025(class_243.method_24953(var7));
            if (var8 < var4) {
               var4 = var8;
               var3 = var7.method_10062();
            }
         }
      }

      return var3;
   }

   private boolean UuUVuuUu(class_2680 var1) {
      return var1.method_27852(class_2246.field_10034) || var1.method_27852(class_2246.field_10380) || var1.method_27852(class_2246.field_16328);
   }

   private boolean uVUuuVnNVU(class_2338 var1) {
      Long var2 = this.NNUUNUuVNNVn.get(var1);
      if (var2 == null) {
         return false;
      } else if (System.currentTimeMillis() > var2) {
         this.NNUUNUuVNNVn.remove(var1);
         return false;
      } else {
         return true;
      }
   }

   private int UuUVuuUu(class_1799 var1) {
      if (var1 != null && !var1.method_7960()) {
         class_9304 var2 = (class_9304)var1.method_58694(class_9334.field_49633);
         if (var2 != null && !var2.method_57543()) {
            for (Entry var4 : var2.method_57539()) {
               if (((class_6880)var4.getKey()).method_40225(class_1893.field_9130)) {
                  return var4.getIntValue();
               }
            }

            return 0;
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private boolean NuunnvnN() {
      if (this.UuUVuuUu(uUnuvNvvNU.field_1724.method_6047()) > 0) {
         return false;
      } else {
         int var1 = -1;
         int var2 = 0;

         for (int var3 = 0; var3 < 9; var3++) {
            int var4 = this.UuUVuuUu(uUnuvNvvNU.field_1724.method_31548().method_5438(var3));
            if (var4 > var2) {
               var2 = var4;
               var1 = var3;
            }
         }

         if (var1 != -1) {
            uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
            return false;
         } else {
            for (int var5 = 9; var5 < 36; var5++) {
               int var6 = this.UuUVuuUu(uUnuvNvvNU.field_1724.method_31548().method_5438(var5));
               if (var6 > var2) {
                  var2 = var6;
                  var1 = var5;
               }
            }

            if (var1 != -1) {
               uUnuvNvvNU.field_1761
                  .method_2906(
                     uUnuvNvvNU.field_1724.field_7498.field_7763,
                     var1,
                     uUnuvNvvNU.field_1724.method_31548().method_67532(),
                     class_1713.field_7791,
                     uUnuvNvvNU.field_1724
                  );
               return true;
            } else {
               return false;
            }
         }
      }
   }

   private boolean NVUunUNUN() {
      if (uUnuvNvvNU.field_1724.method_6047().method_31574(class_1802.field_8116)) {
         return false;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_31574(class_1802.field_8116)) {
               uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
               return false;
            }
         }

         for (int var2 = 9; var2 < 36; var2++) {
            if (uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_31574(class_1802.field_8116)) {
               uUnuvNvvNU.field_1761
                  .method_2906(
                     uUnuvNvvNU.field_1724.field_7498.field_7763,
                     var2,
                     uUnuvNvvNU.field_1724.method_31548().method_67532(),
                     class_1713.field_7791,
                     uUnuvNvvNU.field_1724
                  );
               return true;
            }
         }

         return false;
      }
   }

   private boolean UUVNuUNUvUnV() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_31574(class_1802.field_8116)) {
            return true;
         }
      }

      return false;
   }

   private int vuvnUnVnUNnV() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_31574(class_1802.field_8116)) {
            var1++;
         }
      }

      return var1;
   }

   private int nnuUVNUuvvVU() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_7960()) {
            var1++;
         }
      }

      return var1;
   }

   private class_3965 VVuuUN(CocoaFarm.VvunVVUvUNnv var1) {
      class_3965 var2 = this.vuuuNvNuv(var1.C00OOC00oO);
      if (var2 != null) {
         return var2;
      } else {
         class_243 var3 = uUnuvNvvNU.field_1724.method_33571();
         class_243 var4 = class_243.method_24953(var1.C00OOC00oO);
         return var3.method_1022(var4) <= 4.6 && this.UuUVuuUu(var3, var4, var1.C00OOC00oO)
            ? new class_3965(var4, var1.uUnuvNvvNU, var1.C00OOC00oO, false)
            : null;
      }
   }

   private class_3965 UuUVuuUu(class_2338 var1, class_2350 var2) {
      class_3965 var3 = this.C00OOC00oO(var1, var2);
      if (var3 != null) {
         return var3;
      } else {
         class_243 var4 = uUnuvNvvNU.field_1724.method_33571();
         class_243 var5 = class_243.method_24954(var2.method_62675());
         if (var4.method_1020(this.uUnuvNvvNU(var1, var2)).method_1026(var5) <= 0.05) {
            return null;
         } else {
            double[] var6 = new double[]{0.5, 0.3, 0.7};

            for (double var10 : var6) {
               for (double var15 : var6) {
                  class_243 var17 = this.UuUVuuUu(var1, var2, var10, var15);
                  if (var4.method_1022(var17) <= 4.6 && this.UuUVuuUu(var4, var17, var1)) {
                     return new class_3965(var17, var2, var1, false);
                  }
               }
            }

            return null;
         }
      }
   }

   private boolean UuUVuuUu(class_243 var1, class_243 var2, class_2338 var3) {
      class_243 var4 = var2.method_1020(var1);
      double var5 = var4.method_1033();
      if (var5 < 1.0E-6) {
         return true;
      } else {
         var4 = var4.method_1021(1.0 / var5);

         for (double var7 = 0.25; var7 < var5 - 0.05; var7 += 0.25) {
            class_243 var9 = var1.method_1019(var4.method_1021(var7));
            class_2338 var10 = class_2338.method_49637(var9.field_1352, var9.field_1351, var9.field_1350);
            if (!var10.equals(var3)) {
               class_2680 var11 = uUnuvNvvNU.field_1687.method_8320(var10);
               if (!var11.method_27852(class_2246.field_10302) && !var11.method_26215() && !var11.method_26220(uUnuvNvvNU.field_1687, var10).method_1110()) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private class_3965 vuuuNvNuv(class_2338 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      double[] var3 = new double[]{0.5, 0.2, 0.8};

      for (double var7 : var3) {
         for (double var12 : var3) {
            for (double var17 : var3) {
               class_243 var19 = new class_243(var1.method_10263() + var7, var1.method_10264() + var12, var1.method_10260() + var17);
               class_3965 var20 = uUnuvNvvNU.field_1687
                  .method_17742(new class_3959(var2, var19, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724));
               if (var20.method_17783() == class_240.field_1332 && var20.method_17777().equals(var1)) {
                  return var20;
               }
            }
         }
      }

      return null;
   }

   private class_3965 C00OOC00oO(class_2338 var1, class_2350 var2) {
      class_243 var3 = uUnuvNvvNU.field_1724.method_33571();
      double[] var4 = new double[]{0.5, 0.3, 0.7};

      for (double var8 : var4) {
         for (double var13 : var4) {
            class_243 var15 = this.UuUVuuUu(var1, var2, var8, var13);
            class_3965 var16 = uUnuvNvvNU.field_1687
               .method_17742(new class_3959(var3, var15, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724));
            if (var16.method_17783() == class_240.field_1332 && var16.method_17777().equals(var1) && var16.method_17780() == var2) {
               return var16;
            }
         }
      }

      return null;
   }

   private class_243 UuUVuuUu(class_2338 var1, class_2350 var2, double var3, double var5) {
      double var7 = var1.method_10263();
      double var9 = var1.method_10264();
      double var11 = var1.method_10260();

      return switch (var2) {
         case field_11043 -> new class_243(var7 + var3, var9 + var5, var11);
         case field_11035 -> new class_243(var7 + var3, var9 + var5, var11 + 1.0);
         case field_11039 -> new class_243(var7, var9 + var3, var11 + var5);
         case field_11034 -> new class_243(var7 + 1.0, var9 + var3, var11 + var5);
         default -> class_243.method_24953(var1);
      };
   }

   private class_243 uUnuvNvvNU(class_2338 var1, class_2350 var2) {
      return new class_243(
         var1.method_10263() + 0.5 + var2.method_10148() * 0.5,
         var1.method_10264() + 0.5 + var2.method_10164() * 0.5,
         var1.method_10260() + 0.5 + var2.method_10165() * 0.5
      );
   }

   private void UuUVuuUu(uuUuvNuNVNVU var1) {
      float var2 = new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var1);
      float var3 = Math.max(5.0F, Math.min(60.0F, var2 * 0.5F));
      COC0OCc.UuUVuuUu(var1, var3, var3, var3, var3, 2, 20, false);
   }

   private class_3965 nVVUuvuNnUN() {
      double var1 = Math.toRadians(uUnuvNvvNU.field_1724.method_36454());
      double var3 = Math.toRadians(uUnuvNvvNU.field_1724.method_36455());
      double var5 = Math.cos(var3);
      class_243 var7 = new class_243(-Math.sin(var1) * var5, -Math.sin(var3), Math.cos(var1) * var5);
      class_243 var8 = uUnuvNvvNU.field_1724.method_33571();
      class_243 var9 = var8.method_1019(var7.method_1021(5.0));
      class_3965 var10 = uUnuvNvvNU.field_1687.method_17742(new class_3959(var8, var9, class_3960.field_17559, class_242.field_1348, uUnuvNvvNU.field_1724));
      return var10.method_17783() == class_240.field_1332 ? var10 : null;
   }

   private uuUuvNuNVNVU UuUVuuUu(class_243 var1) {
      class_243 var2 = uUnuvNvvNU.field_1724.method_33571();
      double var3 = var1.field_1352 - var2.field_1352;
      double var5 = var1.field_1351 - var2.field_1351;
      double var7 = var1.field_1350 - var2.field_1350;
      double var9 = Math.sqrt(var3 * var3 + var7 * var7);
      float var11 = (float)Math.toDegrees(Math.atan2(-var3, var7));
      float var12 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
      return new uuUuvNuNVNVU(var11, var12);
   }

   private String nvUVNnuu(class_2338 var1) {
      return var1.method_10263() + " " + var1.method_10264() + " " + var1.method_10260();
   }

   private void C00OOC00oO(String var1) {
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null && uNnUnnuNUnNu != null && NnUuNNU != null) {
         if (nNNnNvVVv.UuUVuuUu(uUnuvNvvNU)) {
            class_243 var2 = uUnuvNvvNU.field_1773.method_19418().method_19326();
            Matrix4f var3 = var1.uUnuvNvvNU().method_23760().method_23761();
            float var4 = (float)(Math.min(uNnUnnuNUnNu.method_10263(), NnUuNNU.method_10263()) - var2.field_1352);
            float var5 = (float)(Math.min(uNnUnnuNUnNu.method_10264(), NnUuNNU.method_10264()) - var2.field_1351);
            float var6 = (float)(Math.min(uNnUnnuNUnNu.method_10260(), NnUuNNU.method_10260()) - var2.field_1350);
            float var7 = (float)(Math.max(uNnUnnuNUnNu.method_10263(), NnUuNNU.method_10263()) + 1 - var2.field_1352);
            float var8 = (float)(Math.max(uNnUnnuNUnNu.method_10264(), NnUuNNU.method_10264()) + 1 - var2.field_1351);
            float var9 = (float)(Math.max(uNnUnnuNUnNu.method_10260(), NnUuNNU.method_10260()) + 1 - var2.field_1350);
            float var10 = (float)(System.nanoTime() / 1.0E9);
            class_4598 var11 = nNNnNvVVv.UuUVuuUu();

            try {
               class_4588 var12 = var11.getBuffer(vUvUvUNNuNvn);
               class_4588 var13 = var11.getBuffer(uuVuUuuVVNvN);
               this.C00OOC00oO(var13, var3, var4, var5, var6, var7, var8, var9, var10);
            } finally {
               nNNnNvVVv.C00OOC00oO();
            }
         }
      }
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = var7 - var4;

      for (int var10 = 0; var10 < 20; var10++) {
         float var11 = var10 / 20.0F;
         float var12 = (var10 + 1) / 20.0F;
         float var13 = var4 + var9 * var11;
         float var14 = var4 + var9 * var12;
         int var15 = VnVnuUn.UuUVuuUu(VnVnuUn.uUnuvNvvNU(-65409, -8781569, var11), (int)(140.0F * (1.0F - 0.55F * var11)));
         int var16 = VnVnuUn.UuUVuuUu(VnVnuUn.uUnuvNvvNU(-65409, -8781569, var12), (int)(140.0F * (1.0F - 0.55F * var12)));
         this.UuUVuuUu(var1, var2, var3, var5, var6, var5, var13, var14, var15, var16);
         this.UuUVuuUu(var1, var2, var6, var8, var3, var8, var13, var14, var15, var16);
         this.UuUVuuUu(var1, var2, var3, var8, var3, var5, var13, var14, var15, var16);
         this.UuUVuuUu(var1, var2, var6, var5, var6, var8, var13, var14, var15, var16);
      }
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      int var11 = VnVnuUn.C00OOC00oO(var9);
      int var12 = VnVnuUn.uUnuvNvvNU(var9);
      int var13 = VnVnuUn.vVvUvVVuuNvV(var9);
      int var14 = VnVnuUn.UuUVuuUu(var9);
      int var15 = VnVnuUn.C00OOC00oO(var10);
      int var16 = VnVnuUn.uUnuvNvvNU(var10);
      int var17 = VnVnuUn.vVvUvVVuuNvV(var10);
      int var18 = VnVnuUn.UuUVuuUu(var10);
      var1.method_22918(var2, var3, var7, var4).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var5, var7, var6).method_1336(var11, var12, var13, var14);
      var1.method_22918(var2, var5, var8, var6).method_1336(var15, var16, var17, var18);
      var1.method_22918(var2, var3, var8, var4).method_1336(var15, var16, var17, var18);
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = var7 - var4;
      if (!(var10 <= 0.01F)) {
         float var11 = (var9 * 0.35F % 1.0F + 1.0F) % 1.0F;
         float var12 = var11 < 0.5F ? var11 * 2.0F : (1.0F - var11) * 2.0F;
         float var13 = var4 + var10 * var12;
         int var14 = VnVnuUn.UuUVuuUu(-65409, 38);
         this.UuUVuuUu(var1, var2, var3, var5, var6, var8, var13, var14);
         int var15 = VnVnuUn.UuUVuuUu(-16719617, 90);
         float var16 = var6 - var3;
         float var17 = var8 - var5;
         int var18 = Math.min(10, Math.max(1, Math.round(var16 / 3.0F)));
         int var19 = Math.min(10, Math.max(1, Math.round(var17 / 3.0F)));
         float var20 = 0.015F;

         for (int var21 = 0; var21 <= var18; var21++) {
            float var22 = var3 + var16 * ((float)var21 / var18);
            this.C00OOC00oO(var1, var2, var22 - var20, var5, var22 + var20, var8, var13, var15);
         }

         for (int var23 = 0; var23 <= var19; var23++) {
            float var24 = var5 + var17 * ((float)var23 / var19);
            this.C00OOC00oO(var1, var2, var3, var24 - var20, var6, var24 + var20, var13, var15);
         }
      }
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      int var9 = VnVnuUn.C00OOC00oO(var8);
      int var10 = VnVnuUn.uUnuvNvvNU(var8);
      int var11 = VnVnuUn.vVvUvVVuuNvV(var8);
      int var12 = VnVnuUn.UuUVuuUu(var8);
      var1.method_22918(var2, var3, var7, var4).method_1336(var9, var10, var11, var12);
      var1.method_22918(var2, var5, var7, var4).method_1336(var9, var10, var11, var12);
      var1.method_22918(var2, var5, var7, var6).method_1336(var9, var10, var11, var12);
      var1.method_22918(var2, var3, var7, var6).method_1336(var9, var10, var11, var12);
   }

   private void C00OOC00oO(class_4588 var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      int var9 = VnVnuUn.C00OOC00oO(var8);
      int var10 = VnVnuUn.uUnuvNvvNU(var8);
      int var11 = VnVnuUn.vVvUvVVuuNvV(var8);
      int var12 = VnVnuUn.UuUVuuUu(var8);
      var1.method_22918(var2, var3, var7, var4).method_1336(var9, var10, var11, var12);
      var1.method_22918(var2, var5, var7, var4).method_1336(var9, var10, var11, var12);
      var1.method_22918(var2, var5, var7, var6).method_1336(var9, var10, var11, var12);
      var1.method_22918(var2, var3, var7, var6).method_1336(var9, var10, var11, var12);
   }

   private void C00OOC00oO(class_4588 var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = var9 * 1.4F;
      int var11 = VnVnuUn.UuUVuuUu(-65409, 190);
      float var12 = 0.02F;
      float[][] var13 = new float[][]{
         {var3, var4, var5, var6, var4, var5},
         {var6, var4, var5, var6, var4, var8},
         {var6, var4, var8, var3, var4, var8},
         {var3, var4, var8, var3, var4, var5},
         {var3, var7, var5, var6, var7, var5},
         {var6, var7, var5, var6, var7, var8},
         {var6, var7, var8, var3, var7, var8},
         {var3, var7, var8, var3, var7, var5},
         {var3, var4, var5, var3, var7, var5},
         {var6, var4, var5, var6, var7, var5},
         {var6, var4, var8, var6, var7, var8},
         {var3, var4, var8, var3, var7, var8}
      };

      for (float[] var17 : var13) {
         this.UuUVuuUu(var1, var2, var17[0], var17[1], var17[2], var17[3], var17[4], var17[5], var12, var11, var10);
      }
   }

   private void UuUVuuUu(
      class_4588 var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, float var11
   ) {
      float var12 = var6 - var3;
      float var13 = var7 - var4;
      float var14 = var8 - var5;
      float var15 = (float)Math.sqrt(var12 * var12 + var13 * var13 + var14 * var14);
      if (!(var15 < 1.0E-4F)) {
         float var16 = var12 / var15;
         float var17 = var13 / var15;
         float var18 = var14 / var15;
         float var19 = 0.45F;
         float var20 = 0.35F;
         float var21 = Math.max(var19 + var20, var15 / 40.0F);
         var19 = var21 * 0.56F;
         float var22 = -((var11 % var21 + var21) % var21);

         for (float var23 = var22; var23 < var15; var23 += var21) {
            float var24 = Math.max(0.0F, var23);
            float var25 = Math.min(var15, var23 + var19);
            if (!(var25 <= var24)) {
               float var26 = var3 + var16 * var24;
               float var27 = var4 + var17 * var24;
               float var28 = var5 + var18 * var24;
               float var29 = var3 + var16 * var25;
               float var30 = var4 + var17 * var25;
               float var31 = var5 + var18 * var25;
               UuUvVUUnNuu.uUnuvNvvNU(
                  var1,
                  var2,
                  Math.min(var26, var29) - var9,
                  Math.min(var27, var30) - var9,
                  Math.min(var28, var31) - var9,
                  Math.max(var26, var29) + var9,
                  Math.max(var27, var30) + var9,
                  Math.max(var28, var31) + var9,
                  var10
               );
            }
         }
      }
   }

   @Generated
   public static class_2338 nUUVuvU() {
      return uNnUnnuNUnNu;
   }

   @Generated
   public static void UuUVuuUu(class_2338 var0) {
      uNnUnnuNUnNu = var0;
   }

   @Generated
   public static class_2338 UnUNVVVNuv() {
      return NnUuNNU;
   }

   @Generated
   public static void C00OOC00oO(class_2338 var0) {
      NnUuNNU = var0;
   }

   static enum NVnVnNnN {
      HARVEST,
      PLANT;
   }

   static final class VvunVVUvUNnv {
      final CocoaFarm.NVnVnNnN UuUVuuUu;
      final class_2338 C00OOC00oO;
      final class_2350 uUnuvNvvNU;

      VvunVVUvUNnv(CocoaFarm.NVnVnNnN var1, class_2338 var2, class_2350 var3) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
      }
   }

   static enum nvnNNunvv {
      FARM,
      NAVIGATING,
      INTERACTING,
      WAITING_FOR_CONTAINER,
      DEPOSITING;
   }
}
