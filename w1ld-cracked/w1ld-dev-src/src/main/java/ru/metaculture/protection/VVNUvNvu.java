package ru.metaculture.protection;

import java.awt.Color;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import net.minecraft.class_310;

public class VVNUvNvu {
   public static class_310 UuUVuuUu = class_310.method_1551();
   private File uUnuvNvvNU;
   private NvVNvUvunNNu vVvUvVVuuNvV = NvVNvUvunNNu.WILD;
   private oOOOo0 uNNnnnuuuN = oOOOo0.Visuals;
   private boolean nuUnNvnuUu;
   private float VVuuUN;
   private float vNUvnnVnUvu;
   private boolean uVUuuVnNVU;
   private boolean vuuuNvNuv;
   public VnnUvVNuNuVv C00OOC00oO = new VnnUvVNuNuVv("Custom Theme Color", Color.WHITE.getRGB());

   public void UuUVuuUu() {
      this.uUnuvNvvNU = new File(new File(NVnVnNnN.UuUVuuUu.nuUnNvnuUu, "configs"), "gui.cfg");

      try {
         if (!this.uUnuvNvvNU.getParentFile().exists()) {
            this.uUnuvNvvNU.getParentFile().mkdirs();
         }

         if (!this.uUnuvNvvNU.exists()) {
            this.uUnuvNvvNU.createNewFile();
            this.vuuuNvNuv();
         } else {
            this.nvUVNnuu();
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public void UuUVuuUu(NvVNvUvunNNu var1) {
      this.vVvUvVVuuNvV = var1;
      this.vuuuNvNuv();
   }

   public void UuUVuuUu(oOOOo0 var1) {
      this.uNNnnnuuuN = var1;
      this.vuuuNvNuv();
   }

   public NvVNvUvunNNu C00OOC00oO() {
      return this.vVvUvVVuuNvV;
   }

   public oOOOo0 uUnuvNvvNU() {
      return this.uNNnnnuuuN;
   }

   public boolean vVvUvVVuuNvV() {
      return this.nuUnNvnuUu;
   }

   public float uNNnnnuuuN() {
      return this.VVuuUN;
   }

   public float nuUnNvnuUu() {
      return this.vNUvnnVnUvu;
   }

   public void UuUVuuUu(float var1, float var2) {
      if (Float.isFinite(var1) && Float.isFinite(var2)) {
         if (!this.nuUnNvnuUu || !(Math.abs(this.VVuuUN - var1) < 0.5F) || !(Math.abs(this.vNUvnnVnUvu - var2) < 0.5F)) {
            this.nuUnNvnuUu = true;
            this.VVuuUN = var1;
            this.vNUvnnVnUvu = var2;
            this.vuuuNvNuv();
         }
      }
   }

   public boolean VVuuUN() {
      return this.uVUuuVnNVU;
   }

   public boolean vNUvnnVnUvu() {
      return this.vuuuNvNuv;
   }

   public void UuUVuuUu(boolean var1) {
      if (!this.uVUuuVnNVU || this.vuuuNvNuv != var1) {
         this.uVUuuVnNVU = true;
         this.vuuuNvNuv = var1;
         this.vuuuNvNuv();
      }
   }

   public UnUvnuVNNN uVUuuVnNVU() {
      return UuUVuuUu != null && UuUVuuUu.field_1755 instanceof nuUnNNVUUnU var1 ? var1.UuUVuuUu() : null;
   }

   private void vuuuNvNuv() {
      if (this.uUnuvNvvNU != null) {
         try (FileWriter var1 = new FileWriter(this.uUnuvNvvNU)) {
            Properties var2 = new Properties();
            var2.setProperty("theme", this.vVvUvVVuuNvV.name());
            var2.setProperty("category", this.uNNnnnuuuN.name());
            var2.setProperty("customColor", String.valueOf(this.C00OOC00oO.vNUvnnVnUvu()));
            var2.setProperty("customColorAlpha", String.valueOf(this.C00OOC00oO.vNVuvnUUnuUn));
            var2.setProperty("customColorPresets", this.UuUVuuUu(this.C00OOC00oO));
            if (this.nuUnNvnuUu) {
               var2.setProperty("themeScreenX", String.valueOf(this.VVuuUN));
               var2.setProperty("themeScreenY", String.valueOf(this.vNUvnnVnUvu));
            }

            if (this.uVUuuVnNVU) {
               var2.setProperty("themePanelVisible", String.valueOf(this.vuuuNvNuv));
            }

            var2.store(var1, "GUI Settings");
         } catch (IOException var6) {
            var6.printStackTrace();
         }
      }
   }

   private void nvUVNnuu() {
      try (FileReader var1 = new FileReader(this.uUnuvNvvNU)) {
         Properties var2 = new Properties();
         var2.load(var1);
         this.vVvUvVVuuNvV = NvVNvUvunNNu.valueOf(var2.getProperty("theme", NvVNvUvunNNu.WILD.name()));
         this.uNNnnnuuuN = oOOOo0.valueOf(var2.getProperty("category", oOOOo0.Visuals.name()));
         if (var2.containsKey("customColor")) {
            int var3 = Integer.parseInt(var2.getProperty("customColor"));
            this.C00OOC00oO.UuUVuuUu(var3);
            if (var2.containsKey("customColorAlpha")) {
               this.C00OOC00oO.C00OOC00oO(Float.parseFloat(var2.getProperty("customColorAlpha")));
            }

            this.UuUVuuUu(this.C00OOC00oO, var2.getProperty("customColorPresets", ""));
         }

         if (var2.containsKey("themeScreenX") && var2.containsKey("themeScreenY")) {
            this.VVuuUN = Float.parseFloat(var2.getProperty("themeScreenX"));
            this.vNUvnnVnUvu = Float.parseFloat(var2.getProperty("themeScreenY"));
            this.nuUnNvnuUu = Float.isFinite(this.VVuuUN) && Float.isFinite(this.vNUvnnVnUvu);
         }

         if (var2.containsKey("themePanelVisible")) {
            this.vuuuNvNuv = Boolean.parseBoolean(var2.getProperty("themePanelVisible"));
            this.uVUuuVnNVU = true;
         }
      } catch (IllegalArgumentException | IOException var6) {
         var6.printStackTrace();
      }
   }

   private String UuUVuuUu(VnnUvVNuNuVv var1) {
      StringBuilder var2 = new StringBuilder();

      for (int var3 = 0; var3 < var1.UvnvNVnnnnNU.size(); var3++) {
         if (var3 > 0) {
            var2.append(',');
         }

         var2.append(var1.UvnvNVnnnnNU.get(var3));
      }

      return var2.toString();
   }

   private void UuUVuuUu(VnnUvVNuNuVv var1, String var2) {
      var1.UvnvNVnnnnNU.clear();
      if (var2 != null && !var2.isBlank()) {
         String[] var3 = var2.split(",");

         for (String var7 : var3) {
            if (var1.UvnvNVnnnnNU.size() >= 8) {
               break;
            }

            try {
               var1.UvnvNVnnnnNU.add(Integer.parseInt(var7.trim()));
            } catch (NumberFormatException var9) {
            }
         }
      }
   }
}
