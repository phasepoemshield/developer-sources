package ru.metaculture.protection;

import com.cinemamod.mcef.MCEF;
import com.cinemamod.mcef.MCEFBrowser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.class_2960;

public final class vNnuvNVNvv implements unUNvvnuUNn {
   private static final int UuUVuuUu = 1280;
   private static final int C00OOC00oO = 720;
   private static final int uUnuvNvvNU = 6;
   private final Map<UUID, vNnuvNVNvv.nvnNNunvv> vVvUvVVuuNvV = new HashMap<>();
   private final List<UUID> uNNnnnuuuN = new ArrayList<>();
   private final unUNvvnuUNn nuUnNvnuUu = new CO0ooCcO0O();

   @Override
   public void UuUVuuUu(List<c0O00CcoCc0c.NVnVnNnN> var1) {
      this.C00OOC00oO(var1);
      if (MCEF.isInitialized()) {
         for (int var2 = 0; var2 < var1.size(); var2++) {
            c0O00CcoCc0c.NVnVnNnN var3 = (c0O00CcoCc0c.NVnVnNnN)var1.get(var2);
            if (var3.source().isEmpty()) {
               this.uUnuvNvvNU(var3.id());
            } else {
               this.vVvUvVVuuNvV.computeIfAbsent(var3.id(), var0 -> new vNnuvNVNvv.nvnNNunvv()).C00OOC00oO(var3.source());
            }
         }
      }
   }

   @Override
   public UNnNuvuvnU UuUVuuUu(UUID var1) {
      vNnuvNVNvv.nvnNNunvv var2 = this.vVvUvVVuuNvV.get(var1);
      MCEFBrowser var3 = var2 == null ? null : var2.uUnuvNvvNU();
      return var3 == null ? null : new vNnuvNVNvv.NVnVnNnN(var3);
   }

   @Override
   public nVnnVNuNNVUU C00OOC00oO(UUID var1) {
      return this.vVvUvVVuuNvV.get(var1);
   }

   @Override
   public void UuUVuuUu(VUVnuvunnvuV var1, nnunnunvvuv var2, c0O00CcoCc0c.NVnVnNnN var3, long var4, int var6) {
      vNnuvNVNvv.nvnNNunvv var7 = this.vVvUvVVuuNvV.get(var3.id());
      class_2960 var8 = var7 == null ? null : var7.C00OOC00oO(var7.C00OOC00oO());
      if (var8 == null) {
         this.nuUnNvnuUu.UuUVuuUu(var1, var2, var3, var4, var6);
      } else {
         nvNUnuU var9 = new nvNUnuU(var1, var1.C00OOC00oO().method_23760(), var1.UuUVuuUu(OOcCooOcCcO.C00OOC00oO(var8)));
         double var10 = -var2.vVvUvVVuuNvV();
         double var12 = var2.vVvUvVVuuNvV();
         double var14 = -var2.uNNnnnuuuN();
         double var16 = var2.uNNnnnuuuN();
         var9.UuUVuuUu(
            var2.UuUVuuUu(var10, 0.0),
            var2.UuUVuuUu(var14),
            var2.C00OOC00oO(var10, 0.0),
            var2.UuUVuuUu(var12, 0.0),
            var2.UuUVuuUu(var14),
            var2.C00OOC00oO(var12, 0.0),
            var2.UuUVuuUu(var12, 0.0),
            var2.UuUVuuUu(var16),
            var2.C00OOC00oO(var12, 0.0),
            var2.UuUVuuUu(var10, 0.0),
            var2.UuUVuuUu(var16),
            var2.C00OOC00oO(var10, 0.0),
            0.0F,
            1.0F,
            1.0F,
            1.0F,
            1.0F,
            0.0F,
            0.0F,
            0.0F,
            -1
         );
      }
   }

   @Override
   public void UuUVuuUu() {
      for (vNnuvNVNvv.nvnNNunvv var2 : this.vVvUvVVuuNvV.values()) {
         var2.vVvUvVVuuNvV();
      }

      this.vVvUvVVuuNvV.clear();
      this.nuUnNvnuUu.UuUVuuUu();
   }

   private void uUnuvNvvNU(UUID var1) {
      vNnuvNVNvv.nvnNNunvv var2 = this.vVvUvVVuuNvV.remove(var1);
      if (var2 != null) {
         var2.vVvUvVVuuNvV();
      }
   }

   private void C00OOC00oO(List<c0O00CcoCc0c.NVnVnNnN> var1) {
      this.uNNnnnuuuN.clear();

      for (UUID var3 : this.vVvUvVVuuNvV.keySet()) {
         if (!UuUVuuUu(var1, var3)) {
            this.uNNnnnuuuN.add(var3);
         }
      }

      for (int var4 = 0; var4 < this.uNNnnnuuuN.size(); var4++) {
         this.uUnuvNvvNU(this.uNNnnnuuuN.get(var4));
      }
   }

   private static boolean UuUVuuUu(List<c0O00CcoCc0c.NVnVnNnN> var0, UUID var1) {
      for (int var2 = 0; var2 < var0.size(); var2++) {
         if (((c0O00CcoCc0c.NVnVnNnN)var0.get(var2)).id().equals(var1)) {
            return true;
         }
      }

      return false;
   }

   record NVnVnNnN(MCEFBrowser browser) implements UNnNuvuvnU {
      @Override
      public void moveCursor(float var1, float var2) {
         this.browser.sendMouseMove(pixelX(var1), pixelY(var2));
      }

      @Override
      public void press(float var1, float var2, int var3) {
         this.browser.sendMousePress(pixelX(var1), pixelY(var2), var3);
      }

      @Override
      public void release(float var1, float var2, int var3) {
         this.browser.sendMouseRelease(pixelX(var1), pixelY(var2), var3);
      }

      @Override
      public void scroll(float var1, float var2, double var3) {
         this.browser.sendMouseWheel(pixelX(var1), pixelY(var2), var3, 0);
      }

      @Override
      public void keyPress(int var1, int var2, int var3) {
         this.browser.sendKeyPress(var1, var2, var3);
      }

      @Override
      public void keyRelease(int var1, int var2, int var3) {
         this.browser.sendKeyRelease(var1, var2, var3);
      }

      @Override
      public void type(char var1, int var2) {
         this.browser.sendKeyTyped(var1, var2);
      }

      private static int pixelX(float var0) {
         return Math.round(Math.max(0.0F, Math.min(1.0F, var0)) * 1280.0F);
      }

      private static int pixelY(float var0) {
         return Math.round(Math.max(0.0F, Math.min(1.0F, var0)) * 720.0F);
      }
   }

   static final class nvnNNunvv implements nVnnVNuNNVUU {
      private final List<MCEFBrowser> UuUVuuUu = new ArrayList<>();
      private final List<String> C00OOC00oO = new ArrayList<>();
      private int uUnuvNvvNU;

      @Override
      public int UuUVuuUu() {
         return this.UuUVuuUu.size();
      }

      @Override
      public int C00OOC00oO() {
         return this.uUnuvNvvNU;
      }

      @Override
      public String UuUVuuUu(int var1) {
         return var1 >= 0 && var1 < this.C00OOC00oO.size() ? this.C00OOC00oO.get(var1) : "";
      }

      @Override
      public class_2960 C00OOC00oO(int var1) {
         if (var1 >= 0 && var1 < this.UuUVuuUu.size()) {
            MCEFBrowser var2 = this.UuUVuuUu.get(var1);
            return var2.isTextureReady() ? var2.getTextureLocation() : null;
         } else {
            return null;
         }
      }

      @Override
      public void uUnuvNvvNU(int var1) {
         if (var1 >= 0 && var1 < this.UuUVuuUu.size()) {
            this.uUnuvNvvNU = var1;
         }
      }

      @Override
      public void UuUVuuUu(String var1) {
         if (this.UuUVuuUu.size() < 6 && var1.startsWith("https://")) {
            this.UuUVuuUu.add(MCEF.createBrowser(var1, false, 1280, 720));
            this.C00OOC00oO.add(var1);
            this.uUnuvNvvNU = this.UuUVuuUu.size() - 1;
         }
      }

      @Override
      public void vVvUvVVuuNvV(int var1) {
         if (var1 >= 0 && var1 < this.UuUVuuUu.size() && this.UuUVuuUu.size() > 1) {
            this.UuUVuuUu.remove(var1).close();
            this.C00OOC00oO.remove(var1);
            this.uUnuvNvvNU = Math.clamp(this.uUnuvNvvNU >= var1 ? this.uUnuvNvvNU - 1 : this.uUnuvNvvNU, 0, this.UuUVuuUu.size() - 1);
         }
      }

      MCEFBrowser uUnuvNvvNU() {
         return this.uUnuvNvvNU >= 0 && this.uUnuvNvvNU < this.UuUVuuUu.size() ? this.UuUVuuUu.get(this.uUnuvNvvNU) : null;
      }

      void C00OOC00oO(String var1) {
         int var2 = this.C00OOC00oO.indexOf(var1);
         if (var2 >= 0) {
            this.uUnuvNvvNU = var2;
         } else if (this.UuUVuuUu.isEmpty()) {
            this.UuUVuuUu(var1);
         } else {
            this.UuUVuuUu.get(this.uUnuvNvvNU).loadURL(var1);
            this.C00OOC00oO.set(this.uUnuvNvvNU, var1);
         }
      }

      void vVvUvVVuuNvV() {
         for (int var1 = 0; var1 < this.UuUVuuUu.size(); var1++) {
            this.UuUVuuUu.get(var1).close();
         }

         this.UuUVuuUu.clear();
         this.C00OOC00oO.clear();
         this.uUnuvNvvNU = 0;
      }
   }
}
