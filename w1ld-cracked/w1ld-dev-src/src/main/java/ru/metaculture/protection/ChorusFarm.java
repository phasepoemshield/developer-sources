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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.Generated;
import net.minecraft.class_10799;
import net.minecraft.class_1268;
import net.minecraft.class_1542;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1753;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1893;
import net.minecraft.class_1921;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2846;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4588;
import net.minecraft.class_476;
import net.minecraft.class_6880;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import net.minecraft.class_1921.class_4688;
import net.minecraft.class_239.class_240;
import net.minecraft.class_2846.class_2847;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ChorusFarm",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Авто-ферма плодов хоруса с отстрелом луком"
)
public class ChorusFarm extends Module {
   private static class_2338 nNvNUVU;
   private static class_2338 UnUNuUU;
   public final vvNnnUNnVvn NVNnnvnuunNv = new vvNnnUNnVvn("Сбивать плоды", true);
   public final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Высота для сбора", 6.0F, 2.0F, 24.0F, 1.0F, false);
   public final vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Авто-посадка", true);
   public final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Склад в сундук", true);
   public final vvNnnUNnVvn NnUuNNU = new vvNnnUNnVvn("Логи", false);
   private static final double uUVuVvuNUvnu = 4.6;
   private static final double UvUvUNuvNU = 3.6;
   private static final double c0oOOCcCoC0 = 28.0;
   private static final float VVnVNnunVvu = 140.0F;
   private static final float unNNVVNnvvV = 34.0F;
   private static final float NuunnvnN = 1.35F;
   private static final float NVUunUNUN = 4.0F;
   private static final float UUVNuUNUvUnV = 2.6F;
   private static final int vuvnUnVnUNnV = 20;
   private static final int nnuUVNUuvvVU = 8;
   private static final int nVVUuvuNnUN = 3;
   private static final long nNnVnUNVV = 90L;
   private static final int nuunNvv = 40;
   private static final int uUVVvVVNvvn = 32;
   private static final int vvUVNVvvNUv = 4;
   private static final long UuNnnVnuNNV = 150L;
   private static final long uUVvnUuNvvN = 1800L;
   private static final long UUuUnNVNuuv = 5000L;
   private static final long NVuNUuVnVUN = 2000L;
   private static final long NVuunNnvvvVu = 900L;
   private static final int vNnNuuvVn = 4;
   private static final double VUuuVUnun = 1.62;
   private static final long vVVuuVVv = 60L;
   private static final int VuunNUUUvu = 6;
   private static final int NNUUNUuVNNVn = 4;
   private static final long VvVvnNUnvuvV = 8000L;
   private static final long ccOO0COcoco0 = 6000L;
   private static final long NUVvUUVuVNVv = 30000L;
   private static final double nNuVunNUVu = 4.2;
   private static final int UNvvunVVn = 400;
   private static final long UnvuVuVnNuvu = 4000L;
   private static final int UvNNVUVNVuvV = 2;
   private static final long NnunUUnU = 30000L;
   private static final long nvuVvuNnNUnv = 3000L;
   private static final long NnVnNVN = 18000L;
   private static final int vnvvNvUnVv = 128;
   private final VuNvNNvVV OCOocoOoOO = new VuNvNNvVV();
   private final VuNvNNvVV o0Ooc0COOoc = new VuNvNNvVV();
   private final VuNvNNvVV nvvnUnUn = new VuNvNNvVV();
   private final VuNvNNvVV UnUUVuVunvVu = new VuNvNNvVV();
   private final VuNvNNvVV nnvuvUNuUnN = new VuNvNNvVV();
   private final VuNvNNvVV UVnuVUUVnnU = new VuNvNNvVV();
   private final VuNvNNvVV VunnVNvNV = new VuNvNNvVV();
   private final VuNvNNvVV NvUVUvVVnUu = new VuNvNNvVV();
   private final List<ChorusFarm.uunvUUVnuNn> unnUnUNVnN = new ArrayList<>();
   private final HashMap<class_2338, Long> NnuUnUNnu = new HashMap<>();
   private final HashMap<class_2338, Long> UnnnvvU = new HashMap<>();
   private final HashMap<Integer, Long> VUUnuVvVu = new HashMap<>();
   private final HashMap<class_2338, long[]> VvVuvUvvNNVv = new HashMap<>();
   private final Set<class_2338> UnnNNvuvvUU = new HashSet<>();
   private Set<class_2338> VNNnnVUuvv;
   private class_2338 vUvUvUNNuNvn;
   private int uuVuUuuVVNvN = 20;
   private class_2338 VvuUUUNNNv;
   private ChorusFarm.VvunVVUvUNnv uuuVnuvnnNnU = ChorusFarm.VvunVVUvUNnv.FARM;
   private ChorusFarm.uunvUUVnuNn nNunUnVN;
   private class_2338 VnVuuvVvnNv;
   private class_2338 vuvvuVuVv;
   private class_2338 uunNUuunVU;
   private class_2338 NvnuuuvnVV;
   private int NnUVNnuvUv = -1;
   private int UuuuNNunN;
   private int NNVNuUvVn = -1;
   private int vuNnuUnu;
   private long uuvvuNvuUNVV;
   private long uVvunVUNuUvu;
   private double NVNnnvVnvV;
   private int vUNuuvvnVnv;
   private int unnnNUNnVu;
   private int NvnnUUuVvNU;
   private class_2338 vVvuUVnV;
   private boolean nvuUVvuuN;
   private boolean CC0COO;
   private int uNnNUNvuVnu;
   private int VnnnvUunNvuu = -1;
   private boolean VuuUVVu;
   private boolean nUNnuUNnV;
   private boolean VuNVnvNNuNnn;
   private static final int uvVuuuvvVU = 4096;
   private static final int NNnvvunuVNUn = 16;
   private static final RenderPipeline nVuuUnnUUVU = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "chorus_zone_fill"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderPipeline nUununvNvvn = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
         .withLocation(class_2960.method_60655("wild", "chorus_zone_glow"))
         .withVertexFormat(class_290.field_1576, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 NuvunVvnnN = class_1921.method_24049(
      "chorus_zone_fill", 4096, false, true, nVuuUnnUUVU, class_4688.method_23598().method_23617(false)
   );
   private static final class_1921 vuvnnvuNVvu = class_1921.method_24049(
      "chorus_zone_glow", 4096, false, true, nUununvNvvn, class_4688.method_23598().method_23617(false)
   );
   private static final int NVvnvnn = -2995201;
   private static final int vUvVUNnN = -9822240;
   private static final int NUuVnnuUnvu = 18;

   public static void UuuNnUvUuv() {
      nNvNUVU = null;
      UnUNuUU = null;
   }

   public ChorusFarm() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, this.NnUuNNU});

      try {
         BaritoneAPI.getSettings().chunkCaching.value = false;
      } catch (Throwable var2) {
      }
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.uuuVnuvnnNnU = ChorusFarm.VvunVVUvUNnv.FARM;
      this.unnUnUNVnN.clear();
      this.NnuUnUNnu.clear();
      this.nNunUnVN = null;
      this.VnVuuvVvnNv = null;
      this.vuvvuVuVv = null;
      this.uunNUuunVU = null;
      this.NvnuuuvnVV = null;
      this.NnUVNnuvUv = -1;
      this.UuuuNNunN = 0;
      this.NNVNuUvVn = -1;
      this.vuNnuUnu = 0;
      this.uuvvuNvuUNVV = 0L;
      this.uVvunVUNuUvu = 0L;
      this.NVNnnvVnvV = Double.MAX_VALUE;
      this.vUNuuvvnVnv = 0;
      this.unnnNUNnVu = 0;
      this.NvnnUUuVvNU = 0;
      this.vVvuUVnV = null;
      this.nvuUVvuuN = false;
      this.CC0COO = false;
      this.uNnNUNvuVnu = 0;
      this.VnnnvUunNvuu = -1;
      this.VUUnuVvVu.clear();
      this.VvVuvUvvNNVv.clear();
      this.UnnNNvuvvUU.clear();
      this.UnnnvvU.clear();
      this.VNNnnVUuvv = null;
      this.vUvUvUNNuNvn = null;
      this.uuVuUuuVVNvN = 20;
      this.VvuUUUNNNv = null;
      this.o0Ooc0COOoc.UuUVuuUu();
      this.OCOocoOoOO.UuUVuuUu();
      this.nvvnUnUn.UuUVuuUu();
      this.UnUUVuVunvVu.UuUVuuUu();
      this.nnvuvUNuUnN.UuUVuuUu();
      this.UVnuVUUVnnU.UuUVuuUu();
      this.NvUVUvVVnUu.UuUVuuUu();
      this.VuuUVVu = (Boolean)BaritoneAPI.getSettings().allowBreak.value;
      this.nUNnuUNnV = (Boolean)BaritoneAPI.getSettings().allowPlace.value;
      this.VuNVnvNNuNnn = (Boolean)BaritoneAPI.getSettings().allowSprint.value;
      BaritoneAPI.getSettings().allowBreak.value = false;
      BaritoneAPI.getSettings().allowPlace.value = false;
      BaritoneAPI.getSettings().chunkCaching.value = false;
      if (nNvNUVU != null && UnUNuUU != null) {
         this.C00OOC00oO("Запуск, площадь " + this.UnUNVVVNuv(nNvNUVU) + " — " + this.UnUNVVVNuv(UnUNuUU));
      } else {
         vVnvuVVUunuv.UuUVuuUu("§d[ChorusFarm] §fСначала задайте зону: §e.chorus pos1 §fи §e.chorus pos2");
      }
   }

   @Override
   public void C00OOC00oO() {
      this.NnUuNNU();
      this.NVNnnvnuunNv();
      BaritoneAPI.getSettings().allowBreak.value = this.VuuUVVu;
      BaritoneAPI.getSettings().allowPlace.value = this.nUNnuUNnV;
      BaritoneAPI.getSettings().allowSprint.value = this.VuNVnvNNuNnn;
      COC0OCc.UuUVuuUu = COC0OCc.VvunVVUvUNnv.IDLE;
      COC0OCc.nuUnNvnuUu = 0;
      COC0OCc.uVUuuVnNVU = null;
      NNvvnnunn.UuUVuuUu = false;
      this.vuvvuVuVv = null;
      this.VNNnnVUuvv = null;
      this.vUvUvUNNuNvn = null;
      this.nNunUnVN = null;
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null) {
         if (nNvNUVU == null || UnUNuUU == null) {
            this.NVNnnvnuunNv();
         } else if (PlayerHelper.UuuNnUvUuv()) {
            this.NVNnnvnuunNv();
            this.NnUuNNU();
         } else if (this.uuuVnuvnnNnU != ChorusFarm.VvunVVUvUNnv.FARM && System.currentTimeMillis() > this.uuvvuNvuUNVV) {
            this.C00OOC00oO("Тайм-аут депозит-сессии, блокирую сундук");
            this.uUnuvNvvNU(true);
         } else {
            switch (this.uuuVnuvnnNnU) {
               case FARM:
                  this.vNVuvnUUnuUn();
                  break;
               case NAVIGATING:
                  this.unNNVVNnvvV();
                  break;
               case INTERACTING:
                  this.NuunnvnN();
                  break;
               case WAITING_FOR_CONTAINER:
                  this.NVUunUNUN();
                  break;
               case DEPOSITING:
                  this.UUVNuUNUvUnV();
            }
         }
      }
   }

   private void vNVuvnUUnuUn() {
      this.nNnVnUNVV();
      if (this.uNnUnnuNUnNu.uUnuvNvvNU() && System.currentTimeMillis() >= this.uVvunVUNuUvu && this.nuunNvv()) {
         class_2338 var1 = this.c0oOOCcCoC0();
         if (var1 != null) {
            this.NVNnnvnuunNv();
            this.NvnuuuvnVV = var1;
            this.uuuVnuvnnNnU = ChorusFarm.VvunVVUvUNnv.NAVIGATING;
            this.VunnVNvNV.UuUVuuUu();
            this.nvvnUnUn.UuUVuuUu();
            this.NVNnnvVnvV = Double.MAX_VALUE;
            this.NnUuNNU();
            this.UuuuNNunN = 0;
            this.vuNnuUnu = 0;
            this.NNVNuUvVn = -1;
            this.uuvvuNvuUNVV = System.currentTimeMillis() + 30000L;
            this.C00OOC00oO("Инвентарь полон, иду к сундуку " + this.UnUNVVVNuv(var1));
            return;
         }
      }

      if (this.nNunUnVN == null || !this.uNNnnnuuuN(this.nNunUnVN)) {
         this.nNunUnVN = null;
         if (this.o0Ooc0COOoc.uNNnnnuuuN(150L)) {
            this.uVunuUNVVUUV();
            this.o0Ooc0COOoc.UuUVuuUu();
         }

         ChorusFarm.uunvUUVnuNn var2 = this.UNnVVNvvnVvU();
         if (var2 != null && this.VVuuUN(var2.C00OOC00oO)) {
            var2 = null;
         }

         if (var2 != null && !var2.C00OOC00oO.equals(this.VnVuuvVvnNv)) {
            this.VnVuuvVvnNv = var2.C00OOC00oO;
            this.vUNuuvvnVnv = 0;
            this.unnnNUNnVu = 0;
            this.NvnnUUuVvNU = 0;
            this.vVvuUVnV = null;
            this.nvvnUnUn.UuUVuuUu();
            this.UVnuVUUVnnU.UuUVuuUu();
            this.NVNnnvVnvV = Double.MAX_VALUE;
         }

         this.nNunUnVN = var2;
      }

      if (this.nNunUnVN == null || this.nNunUnVN.UuUVuuUu != ChorusFarm.NVnVnNnN.SHOOT) {
         this.NVNnnvnuunNv();
         this.vVvuUVnV = null;
         if (this.nNvNUVU()) {
            return;
         }
      }

      if (this.nNunUnVN == null) {
         if (!this.CC0COO) {
            this.C00OOC00oO("Целей нет, жду роста");
            this.CC0COO = true;
         }

         this.NnUuNNU();
      } else {
         this.CC0COO = false;
         switch (this.nNunUnVN.UuUVuuUu) {
            case SHOOT:
               this.UuUVuuUu(this.nNunUnVN);
               break;
            case PLANT:
               this.C00OOC00oO(this.nNunUnVN);
               break;
            case CLEAR:
               this.uUnuvNvvNU(this.nNunUnVN);
         }
      }
   }

   private void UuUVuuUu(ChorusFarm.uunvUUVnuNn var1) {
      class_243 var2 = class_243.method_24953(var1.C00OOC00oO);
      if (this.vVvuUVnV != null) {
         double var3 = uUnuvNvvNU.field_1724.method_23317() - (this.vVvuUVnV.method_10263() + 0.5);
         double var5 = uUnuvNvvNU.field_1724.method_23321() - (this.vVvuUVnV.method_10260() + 0.5);
         if (!(var3 * var3 + var5 * var5 <= 1.4) && !this.nvvnUnUn.uNNnnnuuuN(5000L)) {
            this.NVNnnvnuunNv();
            this.UuUVuuUu(this.vVvuUVnV, 0);
            return;
         }

         this.vVvuUVnV = null;
         this.VvuUUUNNNv = null;
         this.NnUuNNU();
         this.nvvnUnUn.UuUVuuUu();
         this.UVnuVUUVnnU.UuUVuuUu();
         this.NVNnnvVnvV = Double.MAX_VALUE;
      }

      double var9 = uUnuvNvvNU.field_1724.method_33571().method_1022(var2);
      if (var9 > 28.0) {
         this.NVNnnvnuunNv();
         class_2338 var11 = new class_2338(var1.C00OOC00oO.method_10263(), this.uNnUnnuNUnNu(), var1.C00OOC00oO.method_10260());
         if (!this.UuUVuuUu(var9, var11, 3)) {
            this.UuUVuuUu("не подойти к плоду " + this.UnUNVVVNuv(var1.C00OOC00oO));
         }
      } else {
         this.NnUuNNU();
         if (!this.UUuUnNVNuuv()) {
            this.C00OOC00oO("Нет стрел, пропускаю отстрел");
            this.NVNnnvnuunNv();
            this.nNunUnVN = null;
         } else if (!this.uUVVvVVNvvn()) {
            if (uUnuvNvvNU.field_1724.method_6047().method_7909() instanceof class_1753) {
               if (!var1.C00OOC00oO.equals(this.VvuUUUNNNv)) {
                  this.VvuUUUNNNv = var1.C00OOC00oO;
                  this.uuVuUuuVVNvN = this.UuUVuuUu(var1.C00OOC00oO, var2);
               }

               float var10 = this.UuUVuuUu(this.uuVuUuuVVNvN);
               uuUuvNuNVNVU var6 = this.UuUVuuUu(var2, var10);
               this.UuUVuuUu(var6);
               this.UvnvNVnnnnNU();
               if (uUnuvNvvNU.field_1724.method_6048() < this.uuVuUuuVVNvN) {
                  this.UVnuVUUVnnU.UuUVuuUu();
               } else if (new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var6) > 2.6F) {
                  this.UVnuVUUVnnU.UuUVuuUu();
               } else {
                  class_243 var7 = uUnuvNvvNU.field_1724.method_18798();
                  if (var7.field_1352 * var7.field_1352 + var7.field_1350 * var7.field_1350 > 0.0025) {
                     this.UVnuVUUVnnU.UuUVuuUu();
                  } else if (!this.UuUVuuUu(var1.C00OOC00oO, var10)) {
                     if (this.UVnuVUUVnnU.uNNnnnuuuN(900L)) {
                        class_2338 var8 = this.NvnnUUuVvNU < 4 ? this.uUnuvNvvNU(var1.C00OOC00oO) : null;
                        if (var8 != null) {
                           this.vVvuUVnV = var8;
                           this.NvnnUUuVvNU++;
                           this.nvvnUnUn.UuUVuuUu();
                           this.NVNnnvVnvV = Double.MAX_VALUE;
                           this.NVNnnvnuunNv();
                           this.C00OOC00oO("Меняю позицию для отстрела " + this.UnUNVVVNuv(var1.C00OOC00oO));
                        } else {
                           this.NnuUnUNnu.put(var1.C00OOC00oO, System.currentTimeMillis() + 6000L);
                           this.UuUVuuUu("не навестись на плод " + this.UnUNVVVNuv(var1.C00OOC00oO));
                        }
                     }
                  } else if (this.nnvuvUNuUnN.uNNnnnuuuN(60L)) {
                     this.uVUVnuvnuVuv();
                     this.nnvuvUNuUnN.UuUVuuUu();
                     this.UVnuVUUVnnU.UuUVuuUu();
                     this.unnnNUNnVu++;
                     if (this.unnnNUNnVu >= 6) {
                        this.NnuUnUNnu.put(var1.C00OOC00oO, System.currentTimeMillis() + 6000L);
                        this.UuUVuuUu("плод " + this.UnUNVVVNuv(var1.C00OOC00oO) + " не сбивается за 6 выстрелов");
                     }
                  }
               }
            }
         }
      }
   }

   private class_2338 uUnuvNvvNU(class_2338 var1) {
      class_2338 var2 = new class_2338(var1.method_10263(), this.uNnUnnuNUnNu(), var1.method_10260());
      class_243 var3 = class_243.method_24953(var1);
      class_2338 var4 = uUnuvNvvNU.field_1724.method_24515();
      class_2338 var5 = null;
      double var6 = -Double.MAX_VALUE;

      for (int var8 = 0; var8 < 16; var8++) {
         double var9 = var8 * Math.PI / 8.0;
         double var11 = Math.cos(var9);
         double var13 = Math.sin(var9);

         for (int var15 = 3; var15 <= 6; var15++) {
            int var16 = var2.method_10263() + (int)Math.round(var11 * var15);
            int var17 = var2.method_10260() + (int)Math.round(var13 * var15);
            class_2338 var18 = new class_2338(var16, this.uNnUnnuNUnNu(), var17);
            if (this.uVUuuVnNVU(var18)) {
               class_2338 var19 = this.vVvUvVVuuNvV(var18);
               if (var19 != null) {
                  double var20 = var19.method_10263() - var4.method_10263();
                  double var22 = var19.method_10260() - var4.method_10260();
                  if (!(var20 * var20 + var22 * var22 < 4.0)) {
                     class_243 var24 = new class_243(var19.method_10263() + 0.5, var19.method_10264() + 1.62, var19.method_10260() + 0.5);
                     if (this.UuUVuuUu(var24, var3, var1)) {
                        double var25 = Math.sqrt(
                           (var19.method_10263() + 0.5 - (var2.method_10263() + 0.5)) * (var19.method_10263() + 0.5 - (var2.method_10263() + 0.5))
                              + (var19.method_10260() + 0.5 - (var2.method_10260() + 0.5)) * (var19.method_10260() + 0.5 - (var2.method_10260() + 0.5))
                        );
                        double var27 = -Math.abs(var25 - 4.0);
                        if (var27 > var6) {
                           var6 = var27;
                           var5 = var19;
                        }
                     }
                  }
               }
            }
         }
      }

      return var5;
   }

   private class_2338 vVvUvVVuuNvV(class_2338 var1) {
      int[] var2 = new int[]{0, -1, 1, -2, 2};

      for (int var6 : var2) {
         class_2338 var7 = new class_2338(var1.method_10263(), this.uNnUnnuNUnNu() + var6, var1.method_10260());
         if (this.uNNnnnuuuN(var7)) {
            return var7;
         }
      }

      return null;
   }

   private boolean uNNnnnuuuN(class_2338 var1) {
      class_2680 var2 = uUnuvNvvNU.field_1687.method_8320(var1);
      class_2680 var3 = uUnuvNvvNU.field_1687.method_8320(var1.method_10084());
      class_2680 var4 = uUnuvNvvNU.field_1687.method_8320(var1.method_10074());
      boolean var5 = var2.method_26215() || var2.method_26220(uUnuvNvvNU.field_1687, var1).method_1110();
      boolean var6 = var3.method_26215() || var3.method_26220(uUnuvNvvNU.field_1687, var1.method_10084()).method_1110();
      boolean var7 = !var4.method_26215() && !var4.method_26220(uUnuvNvvNU.field_1687, var1.method_10074()).method_1110();
      return var5 && var6 && var7;
   }

   private boolean UuUVuuUu(class_243 var1, class_243 var2, class_2338 var3) {
      class_243 var4 = var2.method_1020(var1);
      double var5 = var4.method_1033();
      if (var5 < 1.0E-6) {
         return true;
      } else {
         class_243 var7 = var4.method_1021(1.0 / var5);

         for (double var8 = 0.2; var8 < var5; var8 += 0.2) {
            class_243 var10 = var1.method_1019(var7.method_1021(var8));
            class_2338 var11 = class_2338.method_49637(var10.field_1352, var10.field_1351, var10.field_1350);
            if (var11.equals(var3)) {
               return true;
            }

            class_2680 var12 = uUnuvNvvNU.field_1687.method_8320(var11);
            if (!var12.method_26215() && !var12.method_26220(uUnuvNvvNU.field_1687, var11).method_1110()) {
               return false;
            }
         }

         return true;
      }
   }

   private void C00OOC00oO(ChorusFarm.uunvUUVnuNn var1) {
      this.NVNnnvnuunNv();
      if (!this.uUVvnUuNvvN()) {
         this.C00OOC00oO("Цветы хоруса закончились, посадка недоступна");
         this.nNunUnVN = null;
      } else if (!this.vvUVNVvvNUv()) {
         if (uUnuvNvvNU.field_1724.method_6047().method_31574(class_1802.field_8710)) {
            if (this.vUNuuvvnVnv >= 4) {
               this.nuUnNvnuUu(var1.C00OOC00oO);
               this.nuUnNvnuUu(var1.C00OOC00oO.method_10084());
               this.UuUVuuUu("посадка на " + this.UnUNVVVNuv(var1.C00OOC00oO) + " не проходит, ресинк фантома");
            } else {
               class_3965 var2 = this.UuUVuuUu(var1.C00OOC00oO, class_2350.field_11036);
               if (var2 != null && !(uUnuvNvvNU.field_1724.method_33571().method_1022(var2.method_17784()) > 4.2)) {
                  this.nvvnUnUn.UuUVuuUu();
                  this.NnUuNNU();
                  uuUuvNuNVNVU var3 = this.UuUVuuUu(var2.method_17784());
                  this.UuUVuuUu(var3);
                  if (!(new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var3) > 4.0F)) {
                     if (this.OCOocoOoOO.uNNnnnuuuN(90L)) {
                        class_3965 var4 = this.vNnNuuvVn();
                        class_3965 var5 = var4 != null && var4.method_17777().equals(var1.C00OOC00oO) && var4.method_17780() == class_2350.field_11036
                           ? var4
                           : var2;
                        uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var5);
                        uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                        this.vUNuuvvnVnv++;
                        this.OCOocoOoOO.UuUVuuUu();
                        this.vuvvuVuVv = null;
                     }
                  }
               } else {
                  this.vVvUvVVuuNvV(var1);
               }
            }
         }
      }
   }

   private void uUnuvNvvNU(ChorusFarm.uunvUUVnuNn var1) {
      this.NVNnnvnuunNv();
      double var2 = uUnuvNvvNU.field_1724.method_33571().method_1022(class_243.method_24953(var1.C00OOC00oO));
      if (var2 > 4.6) {
         if (!this.UuUVuuUu(var2, var1.C00OOC00oO, 2)) {
            this.UuUVuuUu("не подойти к корню " + this.UnUNVVVNuv(var1.C00OOC00oO));
         }
      } else {
         class_3965 var4 = this.nUUVuvU(var1.C00OOC00oO);
         if (var4 != null && !(uUnuvNvvNU.field_1724.method_33571().method_1022(var4.method_17784()) > 4.2)) {
            this.nvvnUnUn.UuUVuuUu();
            this.NnUuNNU();
            if (!this.UuNnnVnuNNV()) {
               uuUuvNuNVNVU var5 = this.UuUVuuUu(var4.method_17784());
               this.UuUVuuUu(var5);
               if (!(new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var5) > 4.0F)) {
                  class_3965 var6 = this.vNnNuuvVn();
                  class_3965 var7 = var6 != null && var6.method_17777().equals(var1.C00OOC00oO) ? var6 : var4;
                  if (!var1.C00OOC00oO.equals(this.vuvvuVuVv)) {
                     if (!this.OCOocoOoOO.uNNnnnuuuN(90L)) {
                        return;
                     }

                     uUnuvNvvNU.field_1761.method_2910(var1.C00OOC00oO, var7.method_17780());
                     this.vuvvuVuVv = var1.C00OOC00oO;
                     if (uUnuvNvvNU.field_1687.method_8320(var1.C00OOC00oO.method_10074()).method_27852(class_2246.field_10471)) {
                        Set var8 = this.UuUVuuUu(List.of(var1.C00OOC00oO));
                        var8.remove(var1.C00OOC00oO);
                        this.VNNnnVUuvv = var8;
                     } else {
                        this.VNNnnVUuvv = null;
                     }

                     this.UnUUVuVunvVu.UuUVuuUu();
                     this.OCOocoOoOO.UuUVuuUu();
                  } else {
                     if (this.UnUUVuVunvVu.uNNnnnuuuN(2000L)) {
                        this.nuUnNvnuUu(var1.C00OOC00oO);
                        this.UuUVuuUu("корень " + this.UnUNVVVNuv(var1.C00OOC00oO) + " не ломается, ресинк фантома");
                        return;
                     }

                     uUnuvNvvNU.field_1761.method_2902(var1.C00OOC00oO, var7.method_17780());
                  }

                  uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
               }
            }
         } else {
            this.vVvUvVVuuNvV(var1);
         }
      }
   }

   private boolean UuUVuuUu(double var1, class_2338 var3, int var4) {
      if (var1 < this.NVNnnvVnvV - 0.4) {
         this.NVNnnvVnvV = var1;
         this.nvvnUnUn.UuUVuuUu();
      }

      if (this.nvvnUnUn.uNNnnnuuuN(5000L)) {
         return false;
      } else {
         this.UuUVuuUu(var3, var4);
         return true;
      }
   }

   private void UuUVuuUu(String var1) {
      this.C00OOC00oO("Пропуск: " + var1);
      if (this.nNunUnVN != null) {
         this.NnuUnUNnu.put(this.nNunUnVN.C00OOC00oO, System.currentTimeMillis() + 8000L);
         this.nuUnNvnuUu(this.nNunUnVN.C00OOC00oO);
      }

      this.nNunUnVN = null;
      this.vuvvuVuVv = null;
      this.VNNnnVUuvv = null;
      this.NnUuNNU();
   }

   private void nuUnNvnuUu(class_2338 var1) {
      uUnuvNvvNU.field_1724.field_3944.method_52787(new class_2846(class_2847.field_12971, var1, class_2350.field_11033));
   }

   private boolean VVuuUN(class_2338 var1) {
      long var2 = System.currentTimeMillis();
      long[] var4 = this.VvVuvUvvNNVv.get(var1);
      if (var4 != null && var2 - var4[1] <= 4000L) {
         var4[0]++;
         var4[1] = var2;
         if (var4[0] >= 2L) {
            this.VvVuvUvvNNVv.remove(var1);
            this.NnuUnUNnu.put(var1, var2 + 30000L);
            this.nuUnNvnuUu(var1);
            this.C00OOC00oO("Фантомный блок " + this.UnUNVVVNuv(var1) + ", ресинк и пропуск");
            return true;
         } else {
            return false;
         }
      } else {
         this.VvVuvUvvNNVv.put(var1.method_10062(), new long[]{1L, var2});
         if (this.VvVuvUvvNNVv.size() > 128) {
            this.VvVuvUvvNNVv.entrySet().removeIf(var2x -> var2 - var2x.getValue()[1] > 4000L);
         }

         return false;
      }
   }

   private void vVvUvVVuuNvV(ChorusFarm.uunvUUVnuNn var1) {
      double var2 = uUnuvNvvNU.field_1724.method_33571().method_1022(class_243.method_24953(var1.C00OOC00oO));
      if (var2 > 4.6) {
         if (!this.UuUVuuUu(var2, var1.C00OOC00oO, 1)) {
            this.UuUVuuUu("не подойти к " + this.UnUNVVVNuv(var1.C00OOC00oO));
         }
      } else {
         if (this.nvvnUnUn.uNNnnnuuuN(1800L)) {
            this.UuUVuuUu("нет прямой видимости " + this.UnUNVVVNuv(var1.C00OOC00oO));
         }
      }
   }

   private void UvnvNVnnnnNU() {
      uUnuvNvvNU.field_1690.field_1904.method_23481(true);
      if (!uUnuvNvvNU.field_1724.method_6115() && uUnuvNvvNU.field_1761 != null) {
         uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
      }

      this.nvuUVvuuN = true;
   }

   private void uVUVnuvnuVuv() {
      uUnuvNvvNU.field_1690.field_1904.method_23481(false);
      this.nvuUVvuuN = false;
      if (uUnuvNvvNU.field_1761 != null) {
         uUnuvNvvNU.field_1761.method_2897(uUnuvNvvNU.field_1724);
      }

      uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
   }

   private void NVNnnvnuunNv() {
      if (this.nvuUVvuuN) {
         uUnuvNvvNU.field_1690.field_1904.method_23481(false);
         this.nvuUVvuuN = false;
      }

      if (uUnuvNvvNU.field_1724 != null
         && uUnuvNvvNU.field_1761 != null
         && uUnuvNvvNU.field_1724.method_6115()
         && uUnuvNvvNU.field_1724.method_6030().method_7909() instanceof class_1753) {
         uUnuvNvvNU.field_1761.method_2897(uUnuvNvvNU.field_1724);
      }
   }

   private uuUuvNuNVNVU UuUVuuUu(class_243 var1, float var2) {
      class_243 var3 = uUnuvNvvNU.field_1724.method_33571().method_1023(0.0, 0.1, 0.0);
      double var4 = var1.field_1352 - var3.field_1352;
      double var6 = var1.field_1350 - var3.field_1350;
      double var8 = Math.sqrt(var4 * var4 + var6 * var6);
      double var10 = var1.field_1351 - var3.field_1351;
      float var12 = (float)Math.toDegrees(Math.atan2(-var4, var6));
      float var13 = this.UuUVuuUu(var8, var10, var2);
      return new uuUuvNuNVNVU(var12, var13);
   }

   private float UuUVuuUu(int var1) {
      float var2 = var1 / 20.0F;
      var2 = (var2 * var2 + var2 * 2.0F) / 3.0F;
      if (var2 > 1.0F) {
         var2 = 1.0F;
      }

      return var2 * 3.0F;
   }

   private int UuUVuuUu(class_2338 var1, class_243 var2) {
      for (int var3 = 8; var3 < 20; var3++) {
         float var4 = this.UuUVuuUu(var3);
         uuUuvNuNVNVU var5 = this.UuUVuuUu(var2, var4);
         if (this.UuUVuuUu(var5.UuUVuuUu, var5.C00OOC00oO, var4, var1)) {
            return Math.min(20, var3 + 3);
         }
      }

      return 20;
   }

   private float UuUVuuUu(double var1, double var3, float var5) {
      if (var1 < 0.35) {
         return var3 >= 0.0 ? -75.0F : 75.0F;
      } else {
         float var6 = -89.0F;
         float var7 = 89.0F;

         for (int var8 = 0; var8 < 60; var8++) {
            float var9 = (var6 + var7) / 2.0F;
            double var10 = this.UuUVuuUu(var1, var9, var5);
            if (var10 > var3) {
               var6 = var9;
            } else {
               var7 = var9;
            }
         }

         return (var6 + var7) / 2.0F;
      }
   }

   private double UuUVuuUu(double var1, float var3, float var4) {
      double var5 = Math.toRadians(var3);
      double var7 = var4 * Math.cos(var5);
      double var9 = -var4 * Math.sin(var5);
      double var11 = 0.0;
      double var13 = 0.0;

      for (int var15 = 0; var15 < 600; var15++) {
         double var16 = var11;
         double var18 = var13;
         var11 += var7;
         var13 += var9;
         var7 *= 0.99;
         var9 *= 0.99;
         var9 -= 0.05;
         if (var11 >= var1) {
            double var20 = var11 - var16 > 0.001 ? (var1 - var16) / (var11 - var16) : 1.0;
            return var18 + (var13 - var18) * var20;
         }
      }

      return var13;
   }

   private boolean UuUVuuUu(class_2338 var1, float var2) {
      return this.UuUVuuUu(uUnuvNvvNU.field_1724.method_36454(), uUnuvNvvNU.field_1724.method_36455(), var2, var1);
   }

   private boolean UuUVuuUu(double var1, double var3, float var5, class_2338 var6) {
      double var7 = Math.toRadians(var1);
      double var9 = Math.toRadians(var3);
      double var11 = Math.cos(var9);
      class_243 var13 = new class_243(-Math.sin(var7) * var11, -Math.sin(var9), Math.cos(var7) * var11);
      class_243 var14 = var13.method_1021(var5);
      class_243 var15 = uUnuvNvvNU.field_1724.method_60478();
      var14 = var14.method_1031(var15.field_1352, uUnuvNvvNU.field_1724.method_24828() ? 0.0 : var15.field_1351, var15.field_1350);
      class_243 var16 = uUnuvNvvNU.field_1724.method_33571().method_1023(0.0, 0.1, 0.0);
      double var17 = this.uNnUnnuNUnNu() - 6;

      for (int var19 = 0; var19 < 120; var19++) {
         class_243 var20 = var16.method_1019(var14);
         class_3965 var21 = uUnuvNvvNU.field_1687
            .method_17742(new class_3959(var16, var20, class_3960.field_17558, class_242.field_1348, uUnuvNvvNU.field_1724));
         if (var21.method_17783() == class_240.field_1332) {
            return var21.method_17777().equals(var6);
         }

         var16 = var20;
         var14 = var14.method_1021(0.99).method_1023(0.0, 0.05, 0.0);
         if (var20.field_1351 < var17) {
            break;
         }
      }

      return false;
   }

   private void uVunuUNVVUUV() {
      this.unnUnUNVnN.clear();
      long var1 = System.currentTimeMillis();
      this.UnnnvvU.entrySet().removeIf(var2 -> var1 > var2.getValue());
      if (this.vUvUvUNNuNvn != null) {
         class_2680 var3 = uUnuvNvvNU.field_1687.method_8320(this.vUvUvUNNuNvn);
         if (this.nvUVNnuu(this.vUvUvUNNuNvn) || !var3.method_27852(class_2246.field_10021) && !var3.method_27852(class_2246.field_10528)) {
            this.vUvUvUNNuNvn = null;
         }
      }

      boolean var22 = this.UNnVVNvvnVvU.uUnuvNvvNU() && this.uUVvnUuNvvN();
      boolean var4 = this.NVNnnvnuunNv.uUnuvNvvNU();
      int var5 = (int)this.uVunuUNVVUUV.uUnuvNvvNU();
      int[] var6 = this.UvUvUNuvNU();
      ArrayList var7 = new ArrayList();
      ArrayList var8 = new ArrayList();
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;

      for (class_2338 var13 : class_2338.method_10094(var6[0], var6[1], var6[2], var6[3], var6[4], var6[5])) {
         class_2680 var14 = uUnuvNvvNU.field_1687.method_8320(var13);
         boolean var15 = var14.method_27852(class_2246.field_10528);
         boolean var16 = var14.method_27852(class_2246.field_10021);
         if (var15 || var16 || var14.method_27852(class_2246.field_10471)) {
            class_2338 var17 = var13.method_10062();
            if (var14.method_27852(class_2246.field_10471)) {
               if (var22) {
                  class_2338 var18 = var17.method_10084();
                  if (this.uVUuuVnNVU(var18) && !this.nvUVNnuu(var18) && !this.nvUVNnuu(var17)) {
                     class_2680 var19 = uUnuvNvvNU.field_1687.method_8320(var18);
                     if (var19.method_26215() || var19.method_45474()) {
                        this.unnUnUNVnN.add(new ChorusFarm.uunvUUVnuNn(ChorusFarm.NVnVnNnN.PLANT, var17, class_2350.field_11036));
                        var10++;
                     }
                  }
               }
            } else {
               var8.add(var17);
               if (uUnuvNvvNU.field_1687.method_8320(var17.method_10074()).method_27852(class_2246.field_10471) && !this.nvUVNnuu(var17)) {
                  var7.add(var17);
               }
            }
         }
      }

      Set var23 = this.UuUVuuUu(var7);
      int var24 = this.uNnUnnuNUnNu() + 4 + 1;

      for (class_2338 var27 : var8) {
         if (!var23.contains(var27) && !this.nvUVNnuu(var27) && var27.method_10264() <= var24) {
            this.unnUnUNVnN.add(new ChorusFarm.uunvUUVnuNn(ChorusFarm.NVnVnNnN.CLEAR, var27, null));
            var11++;
         }
      }

      HashSet var26 = new HashSet();

      for (class_2338 var30 : var7) {
         ChorusFarm.nvnNNunvv var31 = this.vNUvnnVnUvu(var30);
         boolean var32 = !var31.flowers().isEmpty();
         boolean var33 = this.vUvUvUNNuNvn != null && var30.equals(this.vUvUvUNNuNvn);
         if (!var32) {
            if (!var33 && !this.UnnNNvuvvUU.contains(var30)) {
               var26.add(var30);
            } else {
               this.unnUnUNVnN.add(new ChorusFarm.uunvUUVnuNn(ChorusFarm.NVnVnNnN.CLEAR, var30, null));
               var11++;
            }
         } else if (var33 || var31.height() >= var5) {
            if (var4) {
               for (class_2338 var21 : var31.flowers()) {
                  if (!this.nvUVNnuu(var21)) {
                     this.unnUnUNVnN.add(new ChorusFarm.uunvUUVnuNn(ChorusFarm.NVnVnNnN.SHOOT, var21, null));
                     var9++;
                  }
               }
            } else {
               this.unnUnUNVnN.add(new ChorusFarm.uunvUUVnuNn(ChorusFarm.NVnVnNnN.CLEAR, var30, null));
               var11++;
            }
         }
      }

      this.UnnNNvuvvUU.clear();
      this.UnnNNvuvvUU.addAll(var26);
      int var29 = var9 + var10 + var11;
      if (var29 > 0 && this.uNnNUNvuVnu == 0) {
         this.C00OOC00oO("Найдено: отстрел " + var9 + ", посадка " + var10 + ", очистка " + var11);
      }

      this.uNnNUNvuVnu = var29;
   }

   private Set<class_2338> UuUVuuUu(List<class_2338> var1) {
      HashSet var2 = new HashSet();
      ArrayDeque var3 = new ArrayDeque();

      for (class_2338 var5 : var1) {
         if (var2.add(var5)) {
            var3.add(var5);
         }
      }

      while (!var3.isEmpty() && var2.size() < 1600) {
         class_2338 var11 = (class_2338)var3.poll();

         for (class_2350 var8 : class_2350.values()) {
            if (var8 != class_2350.field_11033) {
               class_2338 var9 = var11.method_10093(var8);
               if (!var2.contains(var9)) {
                  class_2680 var10 = uUnuvNvvNU.field_1687.method_8320(var9);
                  if (var10.method_27852(class_2246.field_10021) || var10.method_27852(class_2246.field_10528)) {
                     var2.add(var9);
                     var3.add(var9);
                  }
               }
            }
         }
      }

      return var2;
   }

   private ChorusFarm.nvnNNunvv vNUvnnVnUvu(class_2338 var1) {
      HashSet var2 = new HashSet();
      ArrayDeque var3 = new ArrayDeque();
      ArrayList var4 = new ArrayList();
      var3.add(var1);
      var2.add(var1);
      int var5 = var1.method_10264();
      int var6 = var5;

      while (!var3.isEmpty() && var2.size() < 400) {
         class_2338 var7 = (class_2338)var3.poll();
         if (var7.method_10264() > var6) {
            var6 = var7.method_10264();
         }

         if (uUnuvNvvNU.field_1687.method_8320(var7).method_27852(class_2246.field_10528)) {
            var4.add(var7);
         }

         for (class_2350 var11 : class_2350.values()) {
            if (var11 != class_2350.field_11033) {
               class_2338 var12 = var7.method_10093(var11);
               if (!var2.contains(var12)) {
                  class_2680 var13 = uUnuvNvvNU.field_1687.method_8320(var12);
                  if (var13.method_27852(class_2246.field_10021) || var13.method_27852(class_2246.field_10528)) {
                     var2.add(var12);
                     var3.add(var12);
                  }
               }
            }
         }
      }

      return new ChorusFarm.nvnNNunvv(var6 - var5 + 1, var4);
   }

   private ChorusFarm.uunvUUVnuNn UNnVVNvvnVvU() {
      class_243 var1 = uUnuvNvvNU.field_1724.method_33571();
      ChorusFarm.uunvUUVnuNn var2 = null;
      double var3 = Double.MAX_VALUE;

      for (ChorusFarm.uunvUUVnuNn var6 : this.unnUnUNVnN) {
         if (this.uNNnnnuuuN(var6) && !this.nvUVNnuu(var6.C00OOC00oO) && !this.UuuNnUvUuv(var6.C00OOC00oO)) {
            double var7 = var1.method_1025(this.nuUnNvnuUu(var6));
            if (var6.UuUVuuUu == ChorusFarm.NVnVnNnN.CLEAR) {
               var7 -= 64.0;
            } else if (var6.UuUVuuUu == ChorusFarm.NVnVnNnN.PLANT) {
               var7 += 0.001;
            }

            if (this.vUvUvUNNuNvn != null && var6.C00OOC00oO.method_10262(this.vUvUvUNNuNvn) < 64.0) {
               var7 -= 10000.0;
            }

            if (var7 < var3) {
               var3 = var7;
               var2 = var6;
            }
         }
      }

      return var2;
   }

   private boolean uNNnnnuuuN(ChorusFarm.uunvUUVnuNn var1) {
      if (var1 == null) {
         return false;
      } else {
         class_2680 var2 = uUnuvNvvNU.field_1687.method_8320(var1.C00OOC00oO);

         return switch (var1.UuUVuuUu) {
            case SHOOT -> this.NVNnnvnuunNv.uUnuvNvvNU() && var2.method_27852(class_2246.field_10528);
            case PLANT -> {
               if (!this.uUVvnUuNvvN()) {
                  yield false;
               } else if (!var2.method_27852(class_2246.field_10471)) {
                  yield false;
               } else {
                  class_2680 var3 = uUnuvNvvNU.field_1687.method_8320(var1.C00OOC00oO.method_10084());
                  yield var3.method_26215() || var3.method_45474();
               }
            }
            case CLEAR -> var2.method_27852(class_2246.field_10021) || var2.method_27852(class_2246.field_10528);
         };
      }
   }

   private class_243 nuUnNvnuUu(ChorusFarm.uunvUUVnuNn var1) {
      return var1.UuUVuuUu == ChorusFarm.NVnVnNnN.PLANT
         ? new class_243(var1.C00OOC00oO.method_10263() + 0.5, var1.C00OOC00oO.method_10264() + 1.0, var1.C00OOC00oO.method_10260() + 0.5)
         : class_243.method_24953(var1.C00OOC00oO);
   }

   private int uNnUnnuNUnNu() {
      return Math.min(nNvNUVU.method_10264(), UnUNuUU.method_10264());
   }

   private boolean uVUuuVnNVU(class_2338 var1) {
      int var2 = Math.min(nNvNUVU.method_10263(), UnUNuUU.method_10263());
      int var3 = Math.max(nNvNUVU.method_10263(), UnUNuUU.method_10263());
      int var4 = Math.min(nNvNUVU.method_10260(), UnUNuUU.method_10260());
      int var5 = Math.max(nNvNUVU.method_10260(), UnUNuUU.method_10260());
      return var1.method_10263() >= var2 && var1.method_10263() <= var3 && var1.method_10260() >= var4 && var1.method_10260() <= var5;
   }

   private void UuUVuuUu(class_2338 var1, int var2) {
      IBaritone var3 = BaritoneAPI.getProvider().getPrimaryBaritone();
      boolean var4 = !var1.equals(this.uunNUuunVU);
      if (var4 || !var3.getCustomGoalProcess().isActive()) {
         var3.getCustomGoalProcess().setGoalAndPath(new GoalNear(var1, var2));
         if (var4) {
            this.C00OOC00oO("Иду к " + this.UnUNVVVNuv(var1));
         }

         this.uunNUuunVU = var1;
      }
   }

   private void NnUuNNU() {
      IBaritone var1 = BaritoneAPI.getProvider().getPrimaryBaritone();
      if (var1.getCustomGoalProcess().isActive()) {
         var1.getPathingBehavior().cancelEverything();
      }

      this.uunNUuunVU = null;
   }

   private boolean nNvNUVU() {
      if (this.vUvUvUNNuNvn != null) {
         return false;
      } else if (!this.uUVuVvuNUvnu()) {
         return false;
      } else {
         class_1542 var1 = this.UnUNuUU();
         if (var1 == null) {
            this.VnnnvUunNvuu = -1;
            return false;
         } else {
            double var2 = uUnuvNvvNU.field_1724.method_23317() - var1.method_23317();
            double var4 = uUnuvNvvNU.field_1724.method_23321() - var1.method_23321();
            double var6 = var2 * var2 + var4 * var4;
            double var8 = Math.abs(uUnuvNvvNU.field_1724.method_23318() - var1.method_23318());
            if (var6 <= 0.8 && var8 < 1.3) {
               this.VnnnvUunNvuu = -1;
               return false;
            } else {
               if (var1.method_5628() != this.VnnnvUunNvuu) {
                  this.VnnnvUunNvuu = var1.method_5628();
                  this.NvUVUvVVnUu.UuUVuuUu();
               }

               if (this.NvUVUvVVnUu.uNNnnnuuuN(1500L)) {
                  class_2338 var10 = this.UuUVuuUu(var1);
                  if (var10 != null) {
                     this.vUvUvUNNuNvn = var10;
                     this.VnnnvUunNvuu = -1;
                     this.C00OOC00oO("Плод завис на растении, харвест корня " + this.UnUNVVVNuv(var10));
                     return false;
                  }
               }

               if (this.NvUVUvVVnUu.uNNnnnuuuN(10000L)) {
                  this.VUUnuVvVu.put(var1.method_5628(), System.currentTimeMillis() + 18000L);
                  this.VnnnvUunNvuu = -1;
                  return false;
               } else {
                  this.NVNnnvnuunNv();
                  this.UuUVuuUu(class_2338.method_49637(var1.method_23317(), var1.method_23318() + 0.1, var1.method_23321()), 0);
                  return true;
               }
            }
         }
      }
   }

   private class_1542 UnUNuUU() {
      class_238 var1 = new class_238(
            Math.min(nNvNUVU.method_10263(), UnUNuUU.method_10263()),
            this.uNnUnnuNUnNu() - 4,
            Math.min(nNvNUVU.method_10260(), UnUNuUU.method_10260()),
            Math.max(nNvNUVU.method_10263(), UnUNuUU.method_10263()) + 1,
            this.uNnUnnuNUnNu() + 32,
            Math.max(nNvNUVU.method_10260(), UnUNuUU.method_10260()) + 1
         )
         .method_1014(2.5);
      List var2 = uUnuvNvvNU.field_1687
         .method_8390(
            class_1542.class,
            var1,
            var0 -> var0.method_5805() && (var0.method_6983().method_31574(class_1802.field_8233) || var0.method_6983().method_31574(class_1802.field_8710))
         );
      class_1542 var3 = null;
      double var4 = Double.MAX_VALUE;
      long var6 = System.currentTimeMillis();

      for (class_1542 var9 : var2) {
         Long var10 = this.VUUnuVvVu.get(var9.method_5628());
         if (var10 != null) {
            if (var6 <= var10) {
               continue;
            }

            this.VUUnuVvVu.remove(var9.method_5628());
         }

         double var11 = uUnuvNvvNU.field_1724.method_5858(var9);
         if (var11 < var4) {
            var4 = var11;
            var3 = var9;
         }
      }

      return var3;
   }

   private class_2338 UuUVuuUu(class_1542 var1) {
      if (var1.method_23318() - this.uNnUnnuNUnNu() < 1.5) {
         return null;
      } else {
         class_2338 var2 = class_2338.method_49637(var1.method_23317(), var1.method_23318() + 0.05, var1.method_23321());
         class_2338 var3 = null;

         for (class_2338 var7 : new class_2338[]{var2.method_10074(), var2, var2.method_10084()}) {
            class_2680 var8 = uUnuvNvvNU.field_1687.method_8320(var7);
            if (var8.method_27852(class_2246.field_10021) || var8.method_27852(class_2246.field_10528)) {
               var3 = var7;
               break;
            }
         }

         return var3 == null ? null : this.vuuuNvNuv(var3);
      }
   }

   private class_2338 vuuuNvNuv(class_2338 var1) {
      HashSet var2 = new HashSet();
      ArrayDeque var3 = new ArrayDeque();
      var2.add(var1);
      var3.add(var1);

      while (!var3.isEmpty() && var2.size() < 400) {
         class_2338 var4 = (class_2338)var3.poll();
         class_2680 var5 = uUnuvNvvNU.field_1687.method_8320(var4);
         if ((var5.method_27852(class_2246.field_10021) || var5.method_27852(class_2246.field_10528))
            && uUnuvNvvNU.field_1687.method_8320(var4.method_10074()).method_27852(class_2246.field_10471)
            && !this.nvUVNnuu(var4)) {
            return var4;
         }

         for (class_2350 var9 : class_2350.values()) {
            class_2338 var10 = var4.method_10093(var9);
            if (!var2.contains(var10)) {
               class_2680 var11 = uUnuvNvvNU.field_1687.method_8320(var10);
               if (var11.method_27852(class_2246.field_10021) || var11.method_27852(class_2246.field_10528)) {
                  var2.add(var10);
                  var3.add(var10);
               }
            }
         }
      }

      return null;
   }

   private boolean uUVuVvuNUvnu() {
      for (int var1 = 0; var1 < 36; var1++) {
         class_1799 var2 = uUnuvNvvNU.field_1724.method_31548().method_5438(var1);
         if (var2.method_7960()) {
            return true;
         }

         if ((var2.method_31574(class_1802.field_8233) || var2.method_31574(class_1802.field_8710)) && var2.method_7947() < var2.method_7914()) {
            return true;
         }
      }

      return false;
   }

   private int[] UvUvUNuvNU() {
      int var1 = Math.min(nNvNUVU.method_10263(), UnUNuUU.method_10263());
      int var2 = Math.min(nNvNUVU.method_10260(), UnUNuUU.method_10260());
      int var3 = Math.max(nNvNUVU.method_10263(), UnUNuUU.method_10263());
      int var4 = Math.max(nNvNUVU.method_10260(), UnUNuUU.method_10260());
      class_2338 var5 = uUnuvNvvNU.field_1724.method_24515();
      var1 = Math.max(var1, var5.method_10263() - 40);
      var2 = Math.max(var2, var5.method_10260() - 40);
      var3 = Math.min(var3, var5.method_10263() + 40);
      var4 = Math.min(var4, var5.method_10260() + 40);
      int var6 = this.uNnUnnuNUnNu() - 4;
      int var7 = this.uNnUnnuNUnNu() + 32;
      return new int[]{var1, var6, var2, var3, var7, var4};
   }

   private class_2338 c0oOOCcCoC0() {
      int[] var1 = this.UvUvUNuvNU();
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

   private boolean VVnVNnunVvu() {
      return this.NvnuuuvnVV != null && this.UuUVuuUu(uUnuvNvvNU.field_1687.method_8320(this.NvnuuuvnVV));
   }

   private void uUnuvNvvNU(boolean var1) {
      if (var1) {
         this.uVvunVUNuUvu = System.currentTimeMillis() + 30000L;
      }

      this.NvnuuuvnVV = null;
      this.NnUVNnuvUv = -1;
      this.NnUuNNU();
      this.uuuVnuvnnNnU = ChorusFarm.VvunVVUvUNnv.FARM;
   }

   private void unNNVVNnvvV() {
      if (!this.VVnVNnunVvu()) {
         this.uUnuvNvvNU(false);
      } else if (this.VunnVNvNV.uNNnnnuuuN(15000L)) {
         this.C00OOC00oO("Не смог дойти до сундука, вернусь позже");
         this.uUnuvNvvNU(true);
      } else if (uUnuvNvvNU.field_1724.method_33571().method_1022(class_243.method_24953(this.NvnuuuvnVV)) <= 4.5) {
         this.NnUuNNU();
         this.OCOocoOoOO.UuUVuuUu();
         this.uuuVnuvnnNnU = ChorusFarm.VvunVVUvUNnv.INTERACTING;
      } else {
         this.UuUVuuUu(this.NvnuuuvnVV, 2);
      }
   }

   private void NuunnvnN() {
      if (!this.VVnVNnunVvu()) {
         this.uUnuvNvvNU(false);
      } else if (this.UuuuNNunN >= 3) {
         this.C00OOC00oO("Сундук не открывается, блокирую");
         this.uUnuvNvvNU(true);
      } else {
         this.NnUuNNU();
         if (uUnuvNvvNU.field_1724.method_33571().method_1022(class_243.method_24953(this.NvnuuuvnVV)) > 4.6) {
            this.VunnVNvNV.UuUVuuUu();
            this.uuuVnuvnnNnU = ChorusFarm.VvunVVUvUNnv.NAVIGATING;
         } else {
            class_3965 var1 = this.nUUVuvU(this.NvnuuuvnVV);
            class_243 var2 = var1 != null ? var1.method_17784() : class_243.method_24953(this.NvnuuuvnVV);
            uuUuvNuNVNVU var3 = this.UuUVuuUu(var2);
            this.UuUVuuUu(var3);
            if (!(new uuUuvNuNVNVU(uUnuvNvvNU.field_1724).UuUVuuUu(var3) > 4.0F)) {
               if (this.OCOocoOoOO.uNNnnnuuuN(90L)) {
                  class_3965 var4 = var1 != null ? var1 : new class_3965(var2, class_2350.field_11036, this.NvnuuuvnVV, false);
                  uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var4);
                  uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
                  this.UuuuNNunN++;
                  this.NnUVNnuvUv = -1;
                  this.VunnVNvNV.UuUVuuUu();
                  this.OCOocoOoOO.UuUVuuUu();
                  this.uuuVnuvnnNnU = ChorusFarm.VvunVVUvUNnv.WAITING_FOR_CONTAINER;
               }
            }
         }
      }
   }

   private void NVUunUNUN() {
      this.NnUuNNU();
      if (uUnuvNvvNU.field_1755 instanceof class_476 var1) {
         int var3 = ((class_1707)var1.method_17577()).field_7763;
         if (uUnuvNvvNU.field_1724.field_7512 != null && uUnuvNvvNU.field_1724.field_7512.field_7763 == var3) {
            this.NnUVNnuvUv = var3;
            this.NNVNuUvVn = -1;
            this.vuNnuUnu = 0;
            this.VunnVNvNV.UuUVuuUu();
            this.uuuVnuvnnNnU = ChorusFarm.VvunVVUvUNnv.DEPOSITING;
            return;
         }
      }

      if (this.VunnVNvNV.uNNnnnuuuN(4000L)) {
         this.C00OOC00oO("Сундук не ответил открытием, повтор подхода");
         this.VunnVNvNV.UuUVuuUu();
         this.uuuVnuvnnNnU = ChorusFarm.VvunVVUvUNnv.NAVIGATING;
      }
   }

   private void UUVNuUNUvUnV() {
      if (!(
         uUnuvNvvNU.field_1755 instanceof class_476 var1
            && uUnuvNvvNU.field_1724.field_7512 != null
            && uUnuvNvvNU.field_1724.field_7512.field_7763 == this.NnUVNnuvUv
            && ((class_1707)var1.method_17577()).field_7763 == this.NnUVNnuvUv
      )) {
         this.uUnuvNvvNU(false);
      } else if (this.VunnVNvNV.uNNnnnuuuN(50L)) {
         int var6 = this.nVVUuvuNnUN();
         if (this.NNVNuUvVn >= 0 && var6 >= this.NNVNuUvVn) {
            this.vuNnuUnu++;
         } else {
            this.vuNnuUnu = 0;
         }

         this.NNVNuUvVn = var6;
         if (this.vuNnuUnu >= 3) {
            vVnvuVVUunuv.UuUVuuUu("§d[ChorusFarm] §fСундук заполнен, освободите место");
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
               uUnuvNvvNU.field_1761.method_2906(this.NnUVNnuvUv, var5, 0, class_1713.field_7794, uUnuvNvvNU.field_1724);
               this.VunnVNvNV.UuUVuuUu();
            }
         }
      }
   }

   private int vuvnUnVnUNnV() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
         if (var3.method_31574(class_1802.field_8233)) {
            var1 += var3.method_7947();
         }
      }

      return var1;
   }

   private int nnuUVNUuvvVU() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
         if (var3.method_31574(class_1802.field_8710)) {
            var1 += var3.method_7947();
         }
      }

      return var1;
   }

   private int nVVUuvuNnUN() {
      return this.vuvnUnVnUNnV() + Math.max(0, this.nnuUVNUuvvVU() - 128);
   }

   private int UuUVuuUu(class_1707 var1, int var2) {
      for (int var3 = var2; var3 < var1.field_7761.size(); var3++) {
         class_1735 var4 = var1.method_7611(var3);
         if (var4.method_7681() && var4.method_7677().method_31574(class_1802.field_8233)) {
            return var3;
         }
      }

      if (this.nnuUVNUuvvVU() > 128) {
         for (int var5 = var2; var5 < var1.field_7761.size(); var5++) {
            class_1735 var6 = var1.method_7611(var5);
            if (var6.method_7681() && var6.method_7677().method_31574(class_1802.field_8710)) {
               return var5;
            }
         }
      }

      return -1;
   }

   private boolean nvUVNnuu(class_2338 var1) {
      Long var2 = this.NnuUnUNnu.get(var1);
      if (var2 == null) {
         return false;
      } else if (System.currentTimeMillis() > var2) {
         this.NnuUnUNnu.remove(var1);
         return false;
      } else {
         return true;
      }
   }

   private boolean UuuNnUvUuv(class_2338 var1) {
      Long var2 = this.UnnnvvU.get(var1);
      if (var2 == null) {
         return false;
      } else if (System.currentTimeMillis() > var2) {
         this.UnnnvvU.remove(var1);
         return false;
      } else {
         return true;
      }
   }

   private void nNnVnUNVV() {
      if (this.vuvvuVuVv != null) {
         class_2680 var1 = uUnuvNvvNU.field_1687.method_8320(this.vuvvuVuVv);
         if (!var1.method_27852(class_2246.field_10021) && !var1.method_27852(class_2246.field_10528)) {
            if (this.VNNnnVUuvv != null) {
               long var2 = System.currentTimeMillis() + 3000L;

               for (class_2338 var5 : this.VNNnnVUuvv) {
                  this.UnnnvvU.put(var5, var2);
               }

               this.VNNnnVUuvv = null;
            }

            this.vuvvuVuVv = null;
         }
      }
   }

   private boolean nuunNvv() {
      return this.NVuNUuVnVUN() >= 4 ? true : this.NVuunNnvvvVu() == 0 && (this.vuvnUnVnUNnV() > 0 || this.nnuUVNUuvvVU() > 128);
   }

   private boolean uUVVvVVNvvn() {
      if (uUnuvNvvNU.field_1724.method_6047().method_7909() instanceof class_1753) {
         return false;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_7909() instanceof class_1753) {
               uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
               return false;
            }
         }

         for (int var2 = 9; var2 < 36; var2++) {
            if (uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_7909() instanceof class_1753) {
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

   private boolean vvUVNVvvNUv() {
      if (uUnuvNvvNU.field_1724.method_6047().method_31574(class_1802.field_8710)) {
         return false;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_31574(class_1802.field_8710)) {
               uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
               return false;
            }
         }

         for (int var2 = 9; var2 < 36; var2++) {
            if (uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_31574(class_1802.field_8710)) {
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

   private boolean UuNnnVnuNNV() {
      class_1799 var1 = uUnuvNvvNU.field_1724.method_6047();
      if (!(var1.method_7909() instanceof class_1753) && !var1.method_31574(class_1802.field_8710)) {
         return false;
      } else {
         for (int var2 = 0; var2 < 9; var2++) {
            class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
            if (!var3.method_7960()
               && !(var3.method_7909() instanceof class_1753)
               && !var3.method_31574(class_1802.field_8710)
               && !var3.method_31574(class_1802.field_8107)
               && !var3.method_31574(class_1802.field_8233)) {
               uUnuvNvvNU.field_1724.method_31548().method_61496(var2);
               return false;
            }
         }

         return false;
      }
   }

   private boolean uUVvnUuNvvN() {
      for (int var1 = 0; var1 < 36; var1++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_31574(class_1802.field_8710)) {
            return true;
         }
      }

      return false;
   }

   private boolean UUuUnNVNuuv() {
      class_1799 var1 = uUnuvNvvNU.field_1724.method_6047();
      if (var1.method_7909() instanceof class_1753 && this.UuUVuuUu(var1)) {
         return true;
      } else {
         for (int var2 = 0; var2 < 36; var2++) {
            class_1799 var3 = uUnuvNvvNU.field_1724.method_31548().method_5438(var2);
            if (var3.method_31574(class_1802.field_8107) || var3.method_31574(class_1802.field_8236) || var3.method_31574(class_1802.field_8087)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean UuUVuuUu(class_1799 var1) {
      if (var1 != null && !var1.method_7960()) {
         class_9304 var2 = (class_9304)var1.method_58694(class_9334.field_49633);
         if (var2 != null && !var2.method_57543()) {
            for (Entry var4 : var2.method_57539()) {
               if (((class_6880)var4.getKey()).method_40225(class_1893.field_9125)) {
                  return var4.getIntValue() > 0;
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private int NVuNUuVnVUN() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_31574(class_1802.field_8233)) {
            var1++;
         }
      }

      return var1;
   }

   private int NVuunNnvvvVu() {
      int var1 = 0;

      for (int var2 = 0; var2 < 36; var2++) {
         if (uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_7960()) {
            var1++;
         }
      }

      return var1;
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
                  if (var4.method_1022(var17) <= 4.6 && this.C00OOC00oO(var4, var17, var1)) {
                     return new class_3965(var17, var2, var1, false);
                  }
               }
            }

            return null;
         }
      }
   }

   private boolean C00OOC00oO(class_243 var1, class_243 var2, class_2338 var3) {
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
               if (!var11.method_27852(class_2246.field_10021)
                  && !var11.method_27852(class_2246.field_10528)
                  && !var11.method_26215()
                  && !var11.method_26220(uUnuvNvvNU.field_1687, var10).method_1110()) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private class_3965 nUUVuvU(class_2338 var1) {
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
         case field_11033 -> new class_243(var7 + var3, var9, var11 + var5);
         case field_11036 -> new class_243(var7 + var3, var9 + 1.0, var11 + var5);
         default -> throw new MatchException(null, null);
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
      float var3 = Math.max(34.0F, Math.min(140.0F, var2 * 1.35F));
      COC0OCc.UuUVuuUu(var1, var3, var3, var3, var3, 2, 20, false);
   }

   private class_3965 vNnNuuvVn() {
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

   private String UnUNVVVNuv(class_2338 var1) {
      return var1.method_10263() + " " + var1.method_10264() + " " + var1.method_10260();
   }

   private void C00OOC00oO(String var1) {
      if (this.NnUuNNU.uUnuvNvvNU()) {
         vVnvuVVUunuv.UuUVuuUu("§d[ChorusFarm] §7" + var1);
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null && nNvNUVU != null && UnUNuUU != null) {
         if (nNNnNvVVv.UuUVuuUu(uUnuvNvvNU)) {
            class_243 var2 = uUnuvNvvNU.field_1773.method_19418().method_19326();
            Matrix4f var3 = var1.uUnuvNvvNU().method_23760().method_23761();
            int var4 = this.uNnUnnuNUnNu() - 1;
            float var5 = (float)(Math.min(nNvNUVU.method_10263(), UnUNuUU.method_10263()) - var2.field_1352);
            float var6 = (float)(var4 - var2.field_1351);
            float var7 = (float)(Math.min(nNvNUVU.method_10260(), UnUNuUU.method_10260()) - var2.field_1350);
            float var8 = (float)(Math.max(nNvNUVU.method_10263(), UnUNuUU.method_10263()) + 1 - var2.field_1352);
            float var9 = (float)(var4 + 16 - var2.field_1351);
            float var10 = (float)(Math.max(nNvNUVU.method_10260(), UnUNuUU.method_10260()) + 1 - var2.field_1350);
            float var11 = (float)(System.nanoTime() / 1.0E9);
            class_4598 var12 = nNNnNvVVv.UuUVuuUu();

            try {
               class_4588 var13 = var12.getBuffer(NuvunVvnnN);
               class_4588 var14 = var12.getBuffer(vuvnnvuNVvu);
               this.UuUVuuUu(var14, var3, var5, var6, var7, var8, var9, var10, var11);
            } finally {
               nNNnNvVVv.C00OOC00oO();
            }
         }
      }
   }

   private void UuUVuuUu(class_4588 var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = var7 - var4;

      for (int var10 = 0; var10 < 18; var10++) {
         float var11 = var10 / 18.0F;
         float var12 = (var10 + 1) / 18.0F;
         float var13 = var4 + var9 * var11;
         float var14 = var4 + var9 * var12;
         int var15 = VnVnuUn.UuUVuuUu(VnVnuUn.uUnuvNvvNU(-2995201, -9822240, var11), (int)(120.0F * (1.0F - 0.7F * var11)));
         int var16 = VnVnuUn.UuUVuuUu(VnVnuUn.uUnuvNvvNU(-2995201, -9822240, var12), (int)(120.0F * (1.0F - 0.7F * var12)));
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
      float var10 = var9 * 1.4F;
      int var11 = VnVnuUn.UuUVuuUu(-2995201, 200);
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
      return nNvNUVU;
   }

   @Generated
   public static void UuUVuuUu(class_2338 var0) {
      nNvNUVU = var0;
   }

   @Generated
   public static class_2338 UnUNVVVNuv() {
      return UnUNuUU;
   }

   @Generated
   public static void C00OOC00oO(class_2338 var0) {
      UnUNuUU = var0;
   }

   static enum NVnVnNnN {
      SHOOT,
      PLANT,
      CLEAR;
   }

   static enum VvunVVUvUNnv {
      FARM,
      NAVIGATING,
      INTERACTING,
      WAITING_FOR_CONTAINER,
      DEPOSITING;
   }

   record nvnNNunvv(int height, List<class_2338> flowers) {
   }

   static final class uunvUUVnuNn {
      final ChorusFarm.NVnVnNnN UuUVuuUu;
      final class_2338 C00OOC00oO;
      final class_2350 uUnuvNvvNU;

      uunvUUVnuNn(ChorusFarm.NVnVnNnN var1, class_2338 var2, class_2350 var3) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
      }
   }
}
