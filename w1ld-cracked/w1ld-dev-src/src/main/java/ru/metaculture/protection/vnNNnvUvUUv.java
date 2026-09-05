package ru.metaculture.protection;

import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;
import net.minecraft.class_10868;
import net.minecraft.class_1268;
import net.minecraft.class_1921;
import net.minecraft.class_276;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4720;
import net.minecraft.class_6367;
import net.minecraft.class_9799;
import net.minecraft.class_4597.class_4598;

public final class vnNNnvUvUUv {
   private static final int UuUVuuUu = 262144;
   private static final vnNNnvUvUUv C00OOC00oO = new vnNNnvUvUUv();
   private final Map<class_1268, vnNNnvUvUUv.VvunVVUvUNnv> uUnuvNvvNU = new EnumMap<>(class_1268.class);
   private boolean vVvUvVVuuNvV;
   private int uNNnnnuuuN = -1;
   private int nuUnNvnuUu = -1;

   private vnNNnvUvUUv() {
      this.uUnuvNvvNU.put(class_1268.field_5808, new vnNNnvUvUUv.VvunVVUvUNnv("wild_hands_main"));
      this.uUnuvNvvNU.put(class_1268.field_5810, new vnNNnvUvUUv.VvunVVUvUNnv("wild_hands_off"));
   }

   public static vnNNnvUvUUv UuUVuuUu() {
      return C00OOC00oO;
   }

   public void UuUVuuUu(boolean var1, boolean var2, int var3, int var4) {
      this.vVvUvVVuuNvV = false;
      this.uUnuvNvvNU.values().forEach(vnNNnvUvUUv.VvunVVUvUNnv::C00OOC00oO);
      if ((var1 || var2) && var3 > 0 && var4 > 0 && !NnuVnuNVV.C00OOC00oO()) {
         this.uNNnnnuuuN = var3;
         this.nuUnNvnuUu = var4;
         vnNNnvUvUUv.VvunVVUvUNnv var5 = this.uUnuvNvvNU.get(class_1268.field_5808);
         vnNNnvUvUUv.VvunVVUvUNnv var6 = this.uUnuvNvvNU.get(class_1268.field_5810);

         try {
            if (var1 && var5.UuUVuuUu(var3, var4)) {
               var5.UuUVuuUu();
               this.vVvUvVVuuNvV = true;
            }

            if (var2 && var6.UuUVuuUu(var3, var4)) {
               var6.UuUVuuUu();
               this.vVvUvVVuuNvV = true;
            }
         } catch (RuntimeException var8) {
            this.vVvUvVVuuNvV = false;
            this.uUnuvNvvNU.values().forEach(vnNNnvUvUUv.VvunVVUvUNnv::C00OOC00oO);
         }
      }
   }

   public class_4597 UuUVuuUu(class_1268 var1, class_4597 var2) {
      vnNNnvUvUUv.VvunVVUvUNnv var3 = this.uUnuvNvvNU.get(var1);
      return this.vVvUvVVuuNvV && var3 != null && var3.uUnuvNvvNU && var2 != null && !NnuVnuNVV.C00OOC00oO()
         ? var2x -> class_4720.method_24037(var2.getBuffer(var2x), var3.UuUVuuUu.uNNnnnuuuN.UuUVuuUu(var2x))
         : var2;
   }

   public class_4597 C00OOC00oO(class_1268 var1, class_4597 var2) {
      vnNNnvUvUUv.VvunVVUvUNnv var3 = this.uUnuvNvvNU.get(var1);
      return this.vVvUvVVuuNvV && var3 != null && var3.uUnuvNvvNU && var2 != null && !NnuVnuNVV.C00OOC00oO()
         ? var2x -> class_4720.method_24037(var2.getBuffer(var2x), var3.C00OOC00oO.uNNnnnuuuN.UuUVuuUu(var2x))
         : var2;
   }

   public void UuUVuuUu(class_1268 var1) {
      vnNNnvUvUUv.VvunVVUvUNnv var2 = this.uUnuvNvvNU.get(var1);
      if (this.vVvUvVVuuNvV && var2 != null && var2.uUnuvNvvNU) {
         var2.UuUVuuUu.C00OOC00oO();
         var2.C00OOC00oO.C00OOC00oO();
      }
   }

   public boolean C00OOC00oO(class_1268 var1) {
      vnNNnvUvUUv.VvunVVUvUNnv var2 = this.uUnuvNvvNU.get(var1);
      return var2 != null && var2.UuUVuuUu.vNUvnnVnUvu;
   }

   public int uUnuvNvvNU(class_1268 var1) {
      vnNNnvUvUUv.VvunVVUvUNnv var2 = this.uUnuvNvvNU.get(var1);
      return var2 != null && var2.UuUVuuUu.vNUvnnVnUvu ? UuUVuuUu(var2.UuUVuuUu.vVvUvVVuuNvV, false) : 0;
   }

   public int vVvUvVVuuNvV(class_1268 var1) {
      vnNNnvUvUUv.VvunVVUvUNnv var2 = this.uUnuvNvvNU.get(var1);
      return var2 != null && var2.UuUVuuUu.vNUvnnVnUvu ? UuUVuuUu(var2.UuUVuuUu.vVvUvVVuuNvV, true) : 0;
   }

   public int uNNnnnuuuN(class_1268 var1) {
      vnNNnvUvUUv.VvunVVUvUNnv var2 = this.uUnuvNvvNU.get(var1);
      return var2 != null && var2.C00OOC00oO.vNUvnnVnUvu ? UuUVuuUu(var2.C00OOC00oO.vVvUvVVuuNvV, false) : 0;
   }

   public void C00OOC00oO() {
      this.vVvUvVVuuNvV = false;
      this.uNNnnnuuuN = -1;
      this.nuUnNvnuUu = -1;
      this.uUnuvNvvNU.values().forEach(vnNNnvUvUUv.VvunVVUvUNnv::uUnuvNvvNU);
   }

   private static int UuUVuuUu(class_276 var0, boolean var1) {
      if (var0 == null) {
         return 0;
      } else {
         return (var1 ? var0.method_30278() : var0.method_30277()) instanceof class_10868 var3 ? var3.method_68427() : 0;
      }
   }

   static final class NVnVnNnN {
      private final String UuUVuuUu;
      private final class_9799 C00OOC00oO = new class_9799(262144);
      private final SequencedMap<class_1921, class_9799> uUnuvNvvNU = new LinkedHashMap<>();
      class_6367 vVvUvVVuuNvV;
      vnNNnvUvUUv.nvnNNunvv uNNnnnuuuN;
      private int nuUnNvnuUu = -1;
      private int VVuuUN = -1;
      boolean vNUvnnVnUvu;

      NVnVnNnN(String var1) {
         this.UuUVuuUu = var1;
      }

      boolean UuUVuuUu(int var1, int var2) {
         if (this.vVvUvVVuuNvV == null) {
            this.vVvUvVVuuNvV = new class_6367(this.UuUVuuUu, var1, var2, true);
            this.nuUnNvnuUu = var1;
            this.VVuuUN = var2;
         } else if (this.nuUnNvnuUu != var1 || this.VVuuUN != var2) {
            this.vVvUvVVuuNvV.method_1234(var1, var2);
            this.nuUnNvnuUu = var1;
            this.VVuuUN = var2;
         }

         GpuTextureView var3 = this.vVvUvVVuuNvV.method_71639();
         GpuTextureView var4 = this.vVvUvVVuuNvV.method_71640();
         return var3 != null && !var3.isClosed() && (var4 == null || !var4.isClosed());
      }

      void UuUVuuUu() {
         this.vVvUvVVuuNvV();
         this.uUnuvNvvNU();
         this.C00OOC00oO.method_60809();
         this.uUnuvNvvNU.values().forEach(class_9799::method_60809);
         this.uNNnnnuuuN = new vnNNnvUvUUv.nvnNNunvv(this.C00OOC00oO, this.uUnuvNvvNU);
      }

      void C00OOC00oO() {
         vnNNnvUvUUv.nvnNNunvv var1 = this.uNNnnnuuuN;
         if (var1 != null && var1.vVvUvVVuuNvV && this.vVvUvVVuuNvV != null) {
            GpuTextureView var2 = this.vVvUvVVuuNvV.method_71639();
            if (var2 != null && !var2.isClosed()) {
               GpuTextureView var3 = RenderSystem.outputColorTextureOverride;
               GpuTextureView var4 = RenderSystem.outputDepthTextureOverride;
               RenderSystem.outputColorTextureOverride = var2;
               RenderSystem.outputDepthTextureOverride = this.vVvUvVVuuNvV.method_71640();

               try {
                  var1.UuUVuuUu();
                  this.vNUvnnVnUvu = true;
               } finally {
                  RenderSystem.outputColorTextureOverride = var3;
                  RenderSystem.outputDepthTextureOverride = var4;
               }
            }
         }
      }

      private void uUnuvNvvNU() {
         if (this.vVvUvVVuuNvV != null) {
            GpuTextureView var1 = this.vVvUvVVuuNvV.method_71639();
            GpuTextureView var2 = this.vVvUvVVuuNvV.method_71640();
            if (var1 != null && !var1.isClosed()) {
               CommandEncoder var3 = RenderSystem.getDevice().createCommandEncoder();
               if (var2 != null && !var2.isClosed()) {
                  var3.clearColorAndDepthTextures(var1.texture(), 0, var2.texture(), 1.0);
               } else {
                  var3.clearColorTexture(var1.texture(), 0);
               }
            }
         }
      }

      void vVvUvVVuuNvV() {
         this.vNUvnnVnUvu = false;
         vnNNnvUvUUv.nvnNNunvv var1 = this.uNNnnnuuuN;
         this.uNNnnnuuuN = null;
         if (var1 != null) {
            var1.close();
         }
      }

      void uNNnnnuuuN() {
         this.vVvUvVVuuNvV();

         for (class_9799 var2 : this.uUnuvNvvNU.values()) {
            var2.method_60809();
         }

         this.C00OOC00oO.method_60809();
         if (this.vVvUvVVuuNvV != null) {
            this.vVvUvVVuuNvV.method_1238();
            this.vVvUvVVuuNvV = null;
         }

         this.nuUnNvnuUu = -1;
         this.VVuuUN = -1;
      }
   }

   static final class VvunVVUvUNnv {
      final vnNNnvUvUUv.NVnVnNnN UuUVuuUu;
      final vnNNnvUvUUv.NVnVnNnN C00OOC00oO;
      boolean uUnuvNvvNU;

      VvunVVUvUNnv(String var1) {
         this.UuUVuuUu = new vnNNnvUvUUv.NVnVnNnN(var1 + "_mask");
         this.C00OOC00oO = new vnNNnvUvUUv.NVnVnNnN(var1 + "_item");
      }

      boolean UuUVuuUu(int var1, int var2) {
         return this.UuUVuuUu.UuUVuuUu(var1, var2) && this.C00OOC00oO.UuUVuuUu(var1, var2);
      }

      void UuUVuuUu() {
         this.UuUVuuUu.UuUVuuUu();
         this.C00OOC00oO.UuUVuuUu();
         this.uUnuvNvvNU = true;
      }

      private void C00OOC00oO() {
         this.uUnuvNvvNU = false;
         this.UuUVuuUu.vVvUvVVuuNvV();
         this.C00OOC00oO.vVvUvVVuuNvV();
      }

      private void uUnuvNvvNU() {
         this.uUnuvNvvNU = false;
         this.UuUVuuUu.uNNnnnuuuN();
         this.C00OOC00oO.uNNnnnuuuN();
      }
   }

   static final class nvnNNunvv implements AutoCloseable {
      private final class_9799 UuUVuuUu;
      private final SequencedMap<class_1921, class_9799> C00OOC00oO;
      private final class_4598 uUnuvNvvNU;
      boolean vVvUvVVuuNvV;
      private boolean uNNnnnuuuN;

      nvnNNunvv(class_9799 var1, SequencedMap<class_1921, class_9799> var2) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = class_4597.method_22992(var2, var1);
      }

      class_4588 UuUVuuUu(class_1921 var1) {
         this.C00OOC00oO.computeIfAbsent(var1, var0 -> new class_9799(Math.max(4096, Math.min(var0.method_22722(), 262144))));
         this.vVvUvVVuuNvV = true;
         this.uNNnnnuuuN = false;
         return this.uUnuvNvvNU.getBuffer(var1);
      }

      void UuUVuuUu() {
         if (!this.uNNnnnuuuN) {
            this.uUnuvNvvNU.method_22993();
            this.UuUVuuUu.method_60809();
            this.C00OOC00oO.values().forEach(class_9799::method_60809);
            this.uNNnnnuuuN = true;
         }
      }

      @Override
      public void close() {
         this.UuUVuuUu.method_60809();
         this.C00OOC00oO.values().forEach(class_9799::method_60809);
      }
   }
}
