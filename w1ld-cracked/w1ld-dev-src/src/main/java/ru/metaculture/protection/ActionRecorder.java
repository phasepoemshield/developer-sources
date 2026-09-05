package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_304;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import org.wild.mixin.acceser.ClientPlayerInteractionManagerAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@uNUunUnnnVu(
   uUnuvNvvNU = {"lichoday", "bitrixtime", "oblamovvv"}
)
@ModuleRegister(
   UuUVuuUu = "ActionRecorder",
   C00OOC00oO = "Записывает и воспроизводит действия игрока",
   uUnuvNvvNU = oOOOo0.Player,
   vVvUvVVuuNvV = {uVUNNUnNvU.NEW}
)
public class ActionRecorder extends Module {
   private static final String NVNnnvnuunNv = "KEY";
   private static final String uVunuUNVVUUV = "MOUSE";
   private static final String UNnVVNvvnVvU = "SCROLL";
   private final NVuVVUNUvV uNnUnnuNUnNu = new NVuVVUNUvV("File", "default").UuUVuuUu(48);
   private final uVNuNUVvn NnUuNNU = new uVNuNUVvn("Record Key", -1);
   private final uVNuNUVvn nNvNUVU = new uVNuNUVvn("Play Key", -1);
   private final uVNuNUVvn UnUNuUU = new uVNuNUVvn("Stop Key", -1);
   private final vvNnnUNnVvn uUVuVvuNUvnu = new vvNnnUNnVvn("Infinite Loop", false);
   private final nNUuNvVn UvUvUNuvNU = new nNUuNvVn("Loops", 1.0F, 1.0F, 20.0F, 1.0F, false).UuUVuuUu(this.uUVuVvuNUvnu::uUnuvNvvNU);
   private final nNUuNvVn c0oOOCcCoC0 = new nNUuNvVn("Play Duration Sec", 0.0F, 0.0F, 600.0F, 1.0F, false);
   private final nNUuNvVn VVnVNnunVvu = new nNUuNvVn("Record Limit Sec", 0.0F, 0.0F, 600.0F, 1.0F, false);
   private final vvNnnUNnVvn unNNVVNnvvV = new vvNnnUNnVvn("Auto Save", true);
   private final vvNnnUNnVvn NuunnvnN = new vvNnnUNnVvn("Rotation Controller", true);
   private final nNUuNvVn NVUunUNUN = new nNUuNvVn("Min Rotation Speed", 1.0F, 0.2F, 180.0F, 0.1F, false).UuUVuuUu(() -> !this.NuunnvnN.uUnuvNvvNU());
   private final Gson UUVNuUNUvUnV = new GsonBuilder().setPrettyPrinting().create();
   private final NnuUuVVVvUu vuvnUnVnUNnV = new NnuUuVVVvUu();
   private ActionRecorder.VvunVVUvUNnv nnuUVNUuvvVU;
   private ActionRecorder.VvunVVUvUNnv nVVUuvuNnUN;
   private boolean nNnVnUNVV;
   private boolean nuunNvv;
   private int uUVVvVVNvvn;
   private int vvUVNVvvNUv;
   private int UuNnnVnuNNV;
   private int uUVvnUuNvvN = -1;
   private float UUuUnNVNuuv;
   private float NVuNUuVnVUN;
   private float NVuunNnvvvVu;
   private float vNnNuuvVn;
   private boolean VUuuVUnun;
   private boolean vVVuuVVv;
   private boolean VuunNUUUvu;
   private double NNUUNUuVNNVn;
   private double VvVvnNUnvuvV;
   private boolean ccOO0COcoco0;
   private boolean NUVvUUVuVNVv;
   private boolean nNuVunNUVu;

   public ActionRecorder() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
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
            this.NVUunUNUN
         }
      );
   }

   @Override
   public void C00OOC00oO() {
      if (this.nNnVnUNVV) {
         this.uUnuvNvvNU(this.unNNVVNnvvV.uUnuvNvvNU());
      }

      if (this.nuunNvv) {
         this.vVvUvVVuuNvV(false);
      }

      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (var1.nuUnNvnuUu() == 1 && this.NnUuNNU.uUnuvNvvNU() != -1 && var1.vVvUvVVuuNvV() == this.NnUuNNU.uUnuvNvvNU()) {
         this.UuuNnUvUuv();
         var1.C00OOC00oO();
      } else if (var1.nuUnNvnuUu() == 1 && this.nNvNUVU.uUnuvNvvNU() != -1 && var1.vVvUvVVuuNvV() == this.nNvNUVU.uUnuvNvvNU()) {
         this.nUUVuvU();
         var1.C00OOC00oO();
      } else if (var1.nuUnNvnuUu() == 1 && this.UnUNuUU.uUnuvNvvNU() != -1 && var1.vVvUvVVuuNvV() == this.UnUNuUU.uUnuvNvvNU()) {
         this.UvnvNVnnnnNU();
         var1.C00OOC00oO();
      } else {
         if (this.nNnVnUNVV && var1.vVvUvVVuuNvV() >= 0 && !this.vVvUvVVuuNvV(var1.vVvUvVVuuNvV())) {
            this.UuUVuuUu(
               ActionRecorder.NVnVnNnN.UuUVuuUu(
                  this.uUVVvVVNvvn, this.nnuUVNUuvvVU.nuUnNvnuUu.size(), var1.vVvUvVVuuNvV(), var1.uNNnnnuuuN(), var1.nuUnNvnuUu(), var1.VVuuUN()
               )
            );
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VnuuuuVvVnN var1) {
      if (!var1.uVUuuVnNVU() && this.nNnVnUNVV) {
         if (!this.vVvUvVVuuNvV(-100 - var1.vVvUvVVuuNvV())) {
            this.UuUVuuUu(
               ActionRecorder.NVnVnNnN.UuUVuuUu(this.uUVVvVVNvvn, this.nnuUVNUuvvVU.nuUnNvnuUu.size(), var1.vVvUvVVuuNvV(), var1.uNNnnnuuuN(), var1.nuUnNvnuUu())
            );
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(UVNVVUunvN var1) {
      if (!var1.vNUvnnVnUvu() && this.nNnVnUNVV) {
         if ((!(var1.uNNnnnuuuN() > 0.0) || !this.vVvUvVVuuNvV(-200)) && (!(var1.uNNnnnuuuN() < 0.0) || !this.vVvUvVVuuNvV(-201))) {
            this.UuUVuuUu(ActionRecorder.NVnVnNnN.UuUVuuUu(this.uUVVvVVNvvn, this.nnuUVNUuvvVU.nuUnNvnuUu.size(), var1.vVvUvVVuuNvV(), var1.uNNnnnuuuN()));
         }
      }
   }

   @vuVvUNNvVNV(
      UuUVuuUu = 4
   )
   public void UuUVuuUu(uNVVnVUNun var1) {
      if (this.nuunNvv) {
         ActionRecorder.nvnNNunvv var2 = this.C00OOC00oO(this.vvUVNVvvNUv);
         if (var2 != null) {
            var1.UuUVuuUu(var2.vNUvnnVnUvu);
            var1.C00OOC00oO(var2.uVUuuVnNVU);
            var1.UuUVuuUu(var2.vuuuNvNuv);
            var1.C00OOC00oO(var2.nvUVNnuu);
            var1.uUnuvNvvNU(var2.UuuNnUvUuv);
         }
      } else {
         if (this.nNnVnUNVV) {
            this.NVuunNnvvvVu = var1.uUnuvNvvNU();
            this.vNnNuuvVn = var1.vVvUvVVuuNvV();
            this.VUuuVUnun = var1.uNNnnnuuuN();
            this.vVVuuVVv = var1.nuUnNvnuUu();
            this.VuunNUUUvu = var1.VVuuUN();
         }
      }
   }

   @vuVvUNNvVNV(
      UuUVuuUu = 4
   )
   public void UuUVuuUu(nUUuNuvNUVV var1) {
      if (this.nuunNvv) {
         var1.C00OOC00oO();
      } else {
         if (this.nNnVnUNVV) {
            this.NNUUNUuVNNVn = this.NNUUNUuVNNVn + var1.uUnuvNvvNU();
            this.VvVvnNUnvuvV = this.VvVvnNUnvuvV + var1.vVvUvVVuuNvV();
         }
      }
   }

   @vuVvUNNvVNV(
      UuUVuuUu = 4
   )
   public void UuUVuuUu(UNNVUnNV var1) {
      if (this.nuunNvv) {
         ActionRecorder.nvnNNunvv var2 = this.C00OOC00oO(this.vvUVNVvvNUv);
         if (var2 != null) {
            this.UuUVuuUu(var2);
            this.UuUVuuUu(var2, var1);
            this.UuUVuuUu(this.vvUVNVvvNUv);
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      if (this.nNnVnUNVV) {
         this.uVUVnuvnuVuv();
         this.uUVVvVVNvvn++;
         if (this.VVnVNnunVvu.uUnuvNvvNU() > 0.0F && this.uUVVvVVNvvn >= Math.round(this.VVnVNnunVvu.uUnuvNvvNU() * 20.0F)) {
            this.uUnuvNvvNU(this.unNNVVNnvvV.uUnuvNvvNU());
         }
      }

      if (this.nuunNvv) {
         if (this.uUVvnUuNvvN != this.vvUVNVvvNUv) {
            ActionRecorder.nvnNNunvv var2 = this.C00OOC00oO(this.vvUVNVvvNUv);
            if (var2 != null) {
               this.UuUVuuUu(var2);
            }

            this.UuUVuuUu(this.vvUVNVvvNUv);
         }

         this.UNnVVNvvnVvU();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(NnVNuVNVuU var1) {
      this.UvnvNVnnnnNU();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(coOCCcooOcOO var1) {
      this.UvnvNVnnnnNU();
   }

   private void UuuNnUvUuv() {
      if (this.nNnVnUNVV) {
         this.uUnuvNvvNU(this.unNNVVNnvvV.uUnuvNvvNU());
      } else {
         this.UnUNVVVNuv();
      }
   }

   private void nUUVuvU() {
      if (this.nuunNvv) {
         this.vVvUvVVuuNvV(true);
      } else {
         if (this.nNnVnUNVV) {
            this.uUnuvNvvNU(this.unNNVVNnvvV.uUnuvNvvNU());
         }

         this.vNVuvnUUnuUn();
      }
   }

   private void UnUNVVVNuv() {
      if (!this.VVnVNnunVvu()) {
         vVnvuVVUunuv.UuUVuuUu("[ActionRecorder] Player is not ready.");
      } else {
         if (this.nuunNvv) {
            this.vVvUvVVuuNvV(false);
         }

         this.nnuUVNUuvvVU = new ActionRecorder.VvunVVUvUNnv();
         this.nnuUVNUuvvVU.C00OOC00oO = System.currentTimeMillis();
         this.nnuUVNUuvvVU.uUnuvNvvNU = this.UvUvUNuvNU();
         this.nNnVnUNVV = true;
         this.uUVVvVVNvvn = 0;
         this.UUuUnNVNuuv = uUnuvNvvNU.field_1724.method_36454();
         this.NVuNUuVnVUN = uUnuvNvvNU.field_1724.method_36455();
         this.NVuunNnvvvVu = 0.0F;
         this.vNnNuuvVn = 0.0F;
         this.VUuuVUnun = false;
         this.vVVuuVVv = false;
         this.VuunNUUUvu = false;
         this.NNUUNUuVNNVn = 0.0;
         this.VvVvnNUnvuvV = 0.0;
         vVnvuVVUunuv.UuUVuuUu("[ActionRecorder] Recording: " + this.nnuUVNUuvvVU.uUnuvNvvNU);
      }
   }

   private void uUnuvNvvNU(boolean var1) {
      if (this.nNnVnUNVV) {
         this.nNnVnUNVV = false;
         if (var1 && this.nnuUVNUuvvVU != null) {
            this.UuUVuuUu(this.nnuUVNUuvvVU);
         }

         int var2 = this.nnuUVNUuvvVU != null && this.nnuUVNUuvvVU.uNNnnnuuuN != null ? this.nnuUVNUuvvVU.uNNnnnuuuN.size() : 0;
         vVnvuVVUunuv.UuUVuuUu("[ActionRecorder] Recording stopped. Ticks: " + var2);
      }
   }

   private void vNVuvnUUnuUn() {
      if (!this.VVnVNnunVvu()) {
         vVnvuVVUunuv.UuUVuuUu("[ActionRecorder] Player is not ready.");
      } else {
         ActionRecorder.VvunVVUvUNnv var1 = this.NnUuNNU();
         if (var1 != null && var1.uNNnnnuuuN != null && !var1.uNNnnnuuuN.isEmpty()) {
            this.C00OOC00oO(var1);
            this.nVVUuvuNnUN = var1;
            this.nuunNvv = true;
            this.vvUVNVvvNUv = 0;
            this.UuNnnVnuNNV = 0;
            this.uUVvnUuNvvN = -1;
            this.ccOO0COcoco0 = false;
            this.NUVvUUVuVNVv = false;
            this.nNuVunNUVu = false;
            vVnvuVVUunuv.UuUVuuUu("[ActionRecorder] Playback: " + this.nVVUuvuNnUN.uUnuvNvvNU);
         } else {
            vVnvuVVUunuv.UuUVuuUu("[ActionRecorder] Recording is empty or missing.");
         }
      }
   }

   private void vVvUvVVuuNvV(boolean var1) {
      if (this.nuunNvv) {
         this.nuunNvv = false;
         this.nVVUuvuNnUN = null;
         this.vvUVNVvvNUv = 0;
         this.UuNnnVnuNNV = 0;
         this.uUVvnUuNvvN = -1;
         this.ccOO0COcoco0 = false;
         this.NUVvUUVuVNVv = false;
         this.nNuVunNUVu = false;
         this.vuvnUnVnUNnV.UuUVuuUu();
         this.c0oOOCcCoC0();
         if (var1) {
            vVnvuVVUunuv.UuUVuuUu("[ActionRecorder] Playback stopped.");
         }
      }
   }

   private void UvnvNVnnnnNU() {
      if (this.nNnVnUNVV) {
         this.uUnuvNvvNU(this.unNNVVNnvvV.uUnuvNvvNU());
      }

      if (this.nuunNvv) {
         this.vVvUvVVuuNvV(false);
      }
   }

   private void uVUVnuvnuVuv() {
      if (this.VVnVNnunVvu() && this.nnuUVNUuvvVU != null) {
         ActionRecorder.nvnNNunvv var1 = new ActionRecorder.nvnNNunvv();
         var1.UuUVuuUu = this.uUVVvVVNvvn;
         var1.C00OOC00oO = uUnuvNvvNU.field_1724.method_36454();
         var1.uUnuvNvvNU = uUnuvNvvNU.field_1724.method_36455();
         var1.vVvUvVVuuNvV = Math.abs(class_3532.method_15393(var1.C00OOC00oO - this.UUuUnNVNuuv));
         var1.uNNnnnuuuN = Math.abs(var1.uUnuvNvvNU - this.NVuNUuVnVUN);
         var1.nuUnNvnuUu = this.NNUUNUuVNNVn;
         var1.VVuuUN = this.VvVvnNUnvuvV;
         var1.vNUvnnVnUvu = this.NVuunNnvvvVu;
         var1.uVUuuVnNVU = this.vNnNuuvVn;
         var1.vuuuNvNuv = this.VUuuVUnun;
         var1.nvUVNnuu = this.vVVuuVVv;
         var1.UuuNnUvUuv = this.VuunNUUUvu;
         var1.nUUVuvU = uUnuvNvvNU.field_1724.method_31548().method_67532();
         var1.UnUNVVVNuv = uUnuvNvvNU.field_1724.method_18798().field_1352;
         var1.vNVuvnUUnuUn = uUnuvNvvNU.field_1724.method_18798().field_1351;
         var1.UvnvNVnnnnNU = uUnuvNvvNU.field_1724.method_18798().field_1350;
         var1.uVUVnuvnuVuv = Math.hypot(var1.UnUNVVVNuv, var1.UvnvNVnnnnNU);
         this.nnuUVNUuvvVU.uNNnnnuuuN.add(var1);
         this.UUuUnNVNuuv = var1.C00OOC00oO;
         this.NVuNUuVnVUN = var1.uUnuvNvvNU;
         this.NNUUNUuVNNVn = 0.0;
         this.VvVvnNUnvuvV = 0.0;
      }
   }

   private void UuUVuuUu(ActionRecorder.NVnVnNnN var1) {
      if (this.nnuUVNUuvvVU != null && this.nnuUVNUuvvVU.nuUnNvnuUu != null) {
         this.nnuUVNUuvvVU.nuUnNvnuUu.add(var1);
      }
   }

   private void UuUVuuUu(ActionRecorder.nvnNNunvv var1) {
      if (!this.VVnVNnunVvu()) {
         this.vVvUvVVuuNvV(false);
      } else {
         this.uUnuvNvvNU(var1.nUUVuvU);
         uUnuvNvvNU.field_1690.field_1894.method_23481(var1.vNUvnnVnUvu > 0.0F);
         uUnuvNvvNU.field_1690.field_1881.method_23481(var1.vNUvnnVnUvu < 0.0F);
         uUnuvNvvNU.field_1690.field_1913.method_23481(var1.uVUuuVnNVU > 0.0F);
         uUnuvNvvNU.field_1690.field_1849.method_23481(var1.uVUuuVnNVU < 0.0F);
         uUnuvNvvNU.field_1690.field_1903.method_23481(var1.vuuuNvNuv);
         uUnuvNvvNU.field_1690.field_1832.method_23481(var1.nvUVNnuu);
         uUnuvNvvNU.field_1690.field_1867.method_23481(var1.UuuNnUvUuv);
         uUnuvNvvNU.field_1690.field_1886.method_23481(this.ccOO0COcoco0);
         uUnuvNvvNU.field_1690.field_1904.method_23481(this.NUVvUUVuVNVv);
         uUnuvNvvNU.field_1690.field_1871.method_23481(this.nNuVunNUVu);
         uUnuvNvvNU.field_1724.method_5728(var1.UuuNnUvUuv);
      }
   }

   private void UuUVuuUu(ActionRecorder.nvnNNunvv var1, UNNVUnNV var2) {
      if (uUnuvNvvNU.field_1724 != null) {
         if (this.NuunnvnN.uUnuvNvvNU()) {
            float var3 = Math.abs(class_3532.method_15393(var1.C00OOC00oO - uUnuvNvvNU.field_1724.method_36454()));
            float var4 = Math.abs(var1.uUnuvNvvNU - uUnuvNvvNU.field_1724.method_36455());
            float var5 = Math.max(this.NVUunUNUN.uUnuvNvvNU(), Math.max(var1.vVvUvVVuuNvV, var3));
            float var6 = Math.max(this.NVUunUNUN.uUnuvNvvNU(), Math.max(var1.uNNnnnuuuN, var4));
            this.vuvnUnVnUNnV.UuUVuuUu(new uuUuvNuNVNVU(var1.C00OOC00oO, var1.uUnuvNvvNU), var5, var6, 1, 30);
            var2.UuUVuuUu(uUnuvNvvNU.field_1724.method_36454());
            var2.C00OOC00oO(uUnuvNvvNU.field_1724.method_36455());
         } else {
            uUnuvNvvNU.field_1724.method_36456(var1.C00OOC00oO);
            uUnuvNvvNU.field_1724.method_36457(var1.uUnuvNvvNU);
            var2.UuUVuuUu(var1.C00OOC00oO);
            var2.C00OOC00oO(var1.uUnuvNvvNU);
         }
      }
   }

   private void UuUVuuUu(int var1) {
      if (this.nVVUuvuNnUN != null && this.nVVUuvuNnUN.nuUnNvnuUu != null && this.uUVvnUuNvvN != var1) {
         this.uUVvnUuNvvN = var1;

         for (ActionRecorder.NVnVnNnN var3 : this.nVVUuvuNnUN.nuUnNvnuUu) {
            if (var3.UuUVuuUu == var1) {
               this.C00OOC00oO(var3);
            }
         }
      }
   }

   private void C00OOC00oO(ActionRecorder.NVnVnNnN var1) {
      if ("KEY".equals(var1.uUnuvNvvNU)) {
         this.uUnuvNvvNU(var1);
      } else if ("MOUSE".equals(var1.uUnuvNvvNU)) {
         this.vVvUvVVuuNvV(var1);
      }
   }

   private void uUnuvNvvNU(ActionRecorder.NVnVnNnN var1) {
      boolean var2 = var1.nuUnNvnuUu != 0;
      if (this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1886, var1.vVvUvVVuuNvV, var1.uNNnnnuuuN)) {
         this.ccOO0COcoco0 = var2;
         uUnuvNvvNU.field_1690.field_1886.method_23481(var2);
         if (var2) {
            this.NVNnnvnuunNv();
         }
      } else if (this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1904, var1.vVvUvVVuuNvV, var1.uNNnnnuuuN)) {
         this.NUVvUUVuVNVv = var2;
         uUnuvNvvNU.field_1690.field_1904.method_23481(var2);
         if (var2) {
            this.uVunuUNVVUUV();
         }
      } else if (this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1871, var1.vVvUvVVuuNvV, var1.uNNnnnuuuN)) {
         this.nNuVunNUVu = var2;
         uUnuvNvvNU.field_1690.field_1871.method_23481(var2);
      } else {
         if (var2 && uUnuvNvvNU.field_1690.field_1852 != null) {
            for (int var3 = 0; var3 < uUnuvNvvNU.field_1690.field_1852.length; var3++) {
               if (this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1852[var3], var1.vVvUvVVuuNvV, var1.uNNnnnuuuN)) {
                  this.uUnuvNvvNU(var3);
                  return;
               }
            }
         }
      }
   }

   private void vVvUvVVuuNvV(ActionRecorder.NVnVnNnN var1) {
      boolean var2 = var1.nuUnNvnuUu != 0;
      if (var1.vVvUvVVuuNvV == 0) {
         this.ccOO0COcoco0 = var2;
         uUnuvNvvNU.field_1690.field_1886.method_23481(var2);
         if (var2) {
            this.NVNnnvnuunNv();
         }
      } else if (var1.vVvUvVVuuNvV == 1) {
         this.NUVvUUVuVNVv = var2;
         uUnuvNvvNU.field_1690.field_1904.method_23481(var2);
         if (var2) {
            this.uVunuUNVVUUV();
         }
      } else {
         if (var1.vVvUvVVuuNvV == 2) {
            this.nNuVunNUVu = var2;
            uUnuvNvvNU.field_1690.field_1871.method_23481(var2);
         }
      }
   }

   private void NVNnnvnuunNv() {
      if (this.VVnVNnunVvu() && uUnuvNvvNU.field_1755 == null) {
         if (uUnuvNvvNU.field_1765 instanceof class_3966 var1) {
            class_1297 var4 = var1.method_17782();
            if (var4 != null) {
               uUnuvNvvNU.field_1761.method_2918(uUnuvNvvNU.field_1724, var4);
               uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
               return;
            }
         }

         if (uUnuvNvvNU.field_1765 instanceof class_3965 var3 && uUnuvNvvNU.field_1761.method_2910(var3.method_17777(), var3.method_17780())) {
            uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
         }
      }
   }

   private void uVunuUNVVUUV() {
      if (this.VVnVNnunVvu() && uUnuvNvvNU.field_1755 == null) {
         if (uUnuvNvvNU.field_1765 instanceof class_3965 var1) {
            class_1269 var4 = uUnuvNvvNU.field_1761.method_2896(uUnuvNvvNU.field_1724, class_1268.field_5808, var1);
            if (var4 != class_1269.field_5811 && var4 != class_1269.field_5814) {
               uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
               return;
            }
         }

         class_1269 var3 = uUnuvNvvNU.field_1761.method_2919(uUnuvNvvNU.field_1724, class_1268.field_5808);
         if (var3 != class_1269.field_5811 && var3 != class_1269.field_5814) {
            uUnuvNvvNU.field_1724.method_6104(class_1268.field_5808);
         }
      }
   }

   private void UNnVVNvvnVvU() {
      int var1 = this.uNnUnnuNUnNu();
      if (var1 <= 0) {
         this.vVvUvVVuuNvV(false);
      } else if (this.vvUVNVvvNUv + 1 < var1) {
         this.vvUVNVvvNUv++;
      } else {
         this.UuNnnVnuNNV++;
         if (!this.uUVuVvuNUvnu.uUnuvNvvNU() && this.UuNnnVnuNNV >= Math.max(1, Math.round(this.UvUvUNuvNU.uUnuvNvvNU()))) {
            this.vVvUvVVuuNvV(true);
         } else {
            this.vvUVNVvvNUv = 0;
            this.uUVvnUuNvvN = -1;
            this.ccOO0COcoco0 = false;
            this.NUVvUUVuVNVv = false;
            this.nNuVunNUVu = false;
         }
      }
   }

   private int uNnUnnuNUnNu() {
      if (this.nVVUuvuNnUN != null && this.nVVUuvuNnUN.uNNnnnuuuN != null) {
         int var1 = this.nVVUuvuNnUN.uNNnnnuuuN.size();
         if (this.c0oOOCcCoC0.uUnuvNvvNU() > 0.0F) {
            var1 = Math.min(var1, Math.max(1, Math.round(this.c0oOOCcCoC0.uUnuvNvvNU() * 20.0F)));
         }

         return var1;
      } else {
         return 0;
      }
   }

   private ActionRecorder.nvnNNunvv C00OOC00oO(int var1) {
      if (this.nVVUuvuNnUN != null && this.nVVUuvuNnUN.uNNnnnuuuN != null && !this.nVVUuvuNnUN.uNNnnnuuuN.isEmpty()) {
         int var2 = Math.max(0, Math.min(var1, this.nVVUuvuNnUN.uNNnnnuuuN.size() - 1));
         ActionRecorder.nvnNNunvv var3 = this.nVVUuvuNnUN.uNNnnnuuuN.get(var2);
         if (var3.UuUVuuUu == var1) {
            return var3;
         } else {
            for (ActionRecorder.nvnNNunvv var5 : this.nVVUuvuNnUN.uNNnnnuuuN) {
               if (var5.UuUVuuUu == var1) {
                  return var5;
               }
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   private void UuUVuuUu(ActionRecorder.VvunVVUvUNnv var1) {
      try {
         this.C00OOC00oO(var1);
         Path var2 = this.nNvNUVU();
         Files.createDirectories(var2.getParent());

         try (BufferedWriter var3 = Files.newBufferedWriter(var2, StandardCharsets.UTF_8)) {
            this.UUVNuUNUvUnV.toJson(var1, var3);
         }

         vVnvuVVUunuv.UuUVuuUu("[ActionRecorder] Saved: " + var2.getFileName());
      } catch (Throwable var8) {
         vVnvuVVUunuv.UuUVuuUu("[ActionRecorder] Save failed: " + var8.getMessage());
      }
   }

   private ActionRecorder.VvunVVUvUNnv NnUuNNU() {
      ActionRecorder.VvunVVUvUNnv var3;
      try {
         Path var1 = this.nNvNUVU();
         if (!Files.isRegularFile(var1)) {
            return null;
         }

         try (BufferedReader var2 = Files.newBufferedReader(var1, StandardCharsets.UTF_8)) {
            var3 = (ActionRecorder.VvunVVUvUNnv)this.UUVNuUNUvUnV.fromJson(var2, ActionRecorder.VvunVVUvUNnv.class);
         }
      } catch (Throwable var7) {
         vVnvuVVUunuv.UuUVuuUu("[ActionRecorder] Load failed: " + var7.getMessage());
         return null;
      }

      return var3;
   }

   private void C00OOC00oO(ActionRecorder.VvunVVUvUNnv var1) {
      if (var1.uNNnnnuuuN == null) {
         var1.uNNnnnuuuN = new ArrayList<>();
      }

      if (var1.nuUnNvnuUu == null) {
         var1.nuUnNvnuUu = new ArrayList<>();
      }

      var1.UuUVuuUu = 1;
      var1.uUnuvNvvNU = this.UvUvUNuvNU();
      var1.vVvUvVVuuNvV = var1.uNNnnnuuuN.size();
      var1.uNNnnnuuuN.sort(Comparator.comparingInt(var0 -> var0.UuUVuuUu));
      var1.nuUnNvnuUu.sort(Comparator.<ActionRecorder.NVnVnNnN>comparingInt(var0 -> var0.UuUVuuUu).thenComparingInt(var0 -> var0.C00OOC00oO));
   }

   private Path nNvNUVU() {
      return this.UnUNuUU().resolve(this.uUVuVvuNUvnu());
   }

   private Path UnUNuUU() {
      return ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nuUnNvnuUu.toPath().resolve("action_records")
         : uUnuvNvvNU.field_1697.toPath().resolve("Wild").resolve("action_records");
   }

   private String uUVuVvuNUvnu() {
      String var1 = this.UvUvUNuvNU();
      return var1.endsWith(".json") ? var1 : var1 + ".json";
   }

   private String UvUvUNuvNU() {
      String var1 = this.uNnUnnuNUnNu.uUnuvNvvNU();
      if (var1 == null || var1.isBlank()) {
         var1 = "default";
      }

      var1 = var1.trim().replace('\\', '/');
      int var2 = var1.lastIndexOf(47);
      if (var2 >= 0) {
         var1 = var1.substring(var2 + 1);
      }

      String var3 = var1.replaceAll("[^a-zA-Z0-9._-]", "_");
      if (var3.isBlank() || var3.equals(".") || var3.equals("..")) {
         var3 = "default";
      }

      if (var3.endsWith(".json")) {
         var3 = var3.substring(0, var3.length() - 5);
      }

      return var3;
   }

   private void uUnuvNvvNU(int var1) {
      if (uUnuvNvvNU.field_1724 != null && var1 >= 0 && var1 <= 8) {
         if (uUnuvNvvNU.field_1724.method_31548().method_67532() != var1) {
            uUnuvNvvNU.field_1724.method_31548().method_61496(var1);
            if (uUnuvNvvNU.field_1761 instanceof ClientPlayerInteractionManagerAccessor var2) {
               var2.invokeSyncSelectedSlot();
            }
         }
      }
   }

   private boolean UuUVuuUu(class_304 var1, int var2, int var3) {
      return var1 != null && var1.method_1417(var2, var3);
   }

   private boolean vVvUvVVuuNvV(int var1) {
      return var1 != -1 && (var1 == this.NnUuNNU.uUnuvNvvNU() || var1 == this.nNvNUVU.uUnuvNvvNU() || var1 == this.UnUNuUU.uUnuvNvvNU());
   }

   private void c0oOOCcCoC0() {
      if (uUnuvNvvNU.field_1690 != null) {
         this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1894);
         this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1881);
         this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1913);
         this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1849);
         this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1903);
         this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1832);
         this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1867);
         uUnuvNvvNU.field_1690.field_1886.method_23481(false);
         uUnuvNvvNU.field_1690.field_1904.method_23481(false);
         uUnuvNvvNU.field_1690.field_1871.method_23481(false);
         if (uUnuvNvvNU.field_1724 != null) {
            uUnuvNvvNU.field_1724.method_5728(false);
         }
      }
   }

   private void UuUVuuUu(class_304 var1) {
      if (var1 != null && uUnuvNvvNU.method_22683() != null) {
         boolean var2 = class_3675.method_15987(uUnuvNvvNU.method_22683().method_4490(), var1.method_1429().method_1444());
         var1.method_23481(var2);
      }
   }

   private boolean VVnVNnunVvu() {
      return uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1761 != null && uUnuvNvvNU.field_1690 != null;
   }

   static final class NVnVnNnN {
      int UuUVuuUu;
      int C00OOC00oO;
      String uUnuvNvvNU;
      int vVvUvVVuuNvV;
      int uNNnnnuuuN;
      int nuUnNvnuUu;
      int VVuuUN;
      double vNUvnnVnUvu;
      double uVUuuVnNVU;

      private NVnVnNnN() {
      }

      static ActionRecorder.NVnVnNnN UuUVuuUu(int var0, int var1, int var2, int var3, int var4, int var5) {
         ActionRecorder.NVnVnNnN var6 = new ActionRecorder.NVnVnNnN();
         var6.UuUVuuUu = var0;
         var6.C00OOC00oO = var1;
         var6.uUnuvNvvNU = "KEY";
         var6.vVvUvVVuuNvV = var2;
         var6.uNNnnnuuuN = var3;
         var6.nuUnNvnuUu = var4;
         var6.VVuuUN = var5;
         return var6;
      }

      static ActionRecorder.NVnVnNnN UuUVuuUu(int var0, int var1, int var2, int var3, int var4) {
         ActionRecorder.NVnVnNnN var5 = new ActionRecorder.NVnVnNnN();
         var5.UuUVuuUu = var0;
         var5.C00OOC00oO = var1;
         var5.uUnuvNvvNU = "MOUSE";
         var5.vVvUvVVuuNvV = var2;
         var5.nuUnNvnuUu = var3;
         var5.VVuuUN = var4;
         return var5;
      }

      static ActionRecorder.NVnVnNnN UuUVuuUu(int var0, int var1, double var2, double var4) {
         ActionRecorder.NVnVnNnN var6 = new ActionRecorder.NVnVnNnN();
         var6.UuUVuuUu = var0;
         var6.C00OOC00oO = var1;
         var6.uUnuvNvvNU = "SCROLL";
         var6.vNUvnnVnUvu = var2;
         var6.uVUuuVnNVU = var4;
         return var6;
      }
   }

   static final class VvunVVUvUNnv {
      int UuUVuuUu = 1;
      long C00OOC00oO;
      String uUnuvNvvNU = "default";
      int vVvUvVVuuNvV;
      List<ActionRecorder.nvnNNunvv> uNNnnnuuuN = new ArrayList<>();
      List<ActionRecorder.NVnVnNnN> nuUnNvnuUu = new ArrayList<>();
   }

   static final class nvnNNunvv {
      int UuUVuuUu;
      float C00OOC00oO;
      float uUnuvNvvNU;
      float vVvUvVVuuNvV;
      float uNNnnnuuuN;
      double nuUnNvnuUu;
      double VVuuUN;
      float vNUvnnVnUvu;
      float uVUuuVnNVU;
      boolean vuuuNvNuv;
      boolean nvUVNnuu;
      boolean UuuNnUvUuv;
      int nUUVuvU;
      double UnUNVVVNuv;
      double vNVuvnUUnuUn;
      double UvnvNVnnnnNU;
      double uVUVnuvnuVuv;
   }
}
