package ru.metaculture.protection;

import java.nio.file.Files;
import java.nio.file.Path;
import net.minecraft.class_2561;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@uNUunUnnnVu(
   uUnuvNvvNU = {"lichoday"}
)
@ModuleRegister(
   UuUVuuUu = "RotationLab",
   uUnuvNvvNU = oOOOo0.Player,
   C00OOC00oO = "Тренажёр человеческих паттернов ротации",
   vVvUvVVuuNvV = {uVUNNUnNvU.NEW}
)
public class RotationLab extends Module {
   private final NVuVVUNUvV NVNnnvnuunNv = new NVuVVUNUvV("Asset", "rotation_lab").UuUVuuUu(48);
   private final vNnVvvNU uVunuUNVVUUV = new vNnVvvNU("Delete Asset", 0).C00OOC00oO("Delete").UuUVuuUu(this::NVNnnvnuunNv);
   private final UvNnUnuNUUU UNnVVNvvnVvU = new UvNnUnuNUUU("Mode", "Mixed", "Mixed", "Flick", "Tracking", "Micro", "Vertical", "Diagonal", "Idle", "Attack");
   private final vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("Auto Capture", true);
   private final nNUuNvVn NnUuNNU = new nNUuNvVn("Target Radius", 11.0F, 5.0F, 30.0F, 1.0F, false);
   private final nNUuNvVn nNvNUVU = new nNUuNvVn("Spread", 78.0F, 25.0F, 95.0F, 1.0F, false);
   private final nNUuNvVn UnUNuUU = new nNUuNvVn("Targets", 80.0F, 5.0F, 500.0F, 1.0F, false);
   private vuuvVuVVVnuU uUVuVvuNUvnu;

   public RotationLab() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv, this.uVunuUNVVUUV, this.UNnVVNvvnVvU, this.uNnUnnuNUnNu, this.NnUuNNU, this.nNvNUVU, this.UnUNuUU});
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      if (uUnuvNvvNU != null) {
         uUnuvNvvNU.execute(this::uVunuUNVVUUV);
      }
   }

   @Override
   public void C00OOC00oO() {
      if (this.uUVuVvuNUvnu != null) {
         this.uUVuVvuNUvnu.UuUVuuUu();
      }

      if (this.uUVuVvuNUvnu != null && uUnuvNvvNU.field_1755 == this.uUVuVvuNUvnu) {
         uUnuvNvvNU.method_1507(null);
      }

      this.uUVuVvuNUvnu = null;
      super.C00OOC00oO();
   }

   private void uVunuUNVVUUV() {
      if (this.nuUnNvnuUu && uUnuvNvvNU.method_22683() != null) {
         this.uUVuVvuNUvnu = new vuuvVuVVVnuU(this);
         uUnuvNvvNU.method_1507(this.uUVuVvuNUvnu);
         if (uUnuvNvvNU.field_1724 != null) {
            uUnuvNvvNU.field_1724.method_7353(class_2561.method_30163("RotationLab opened"), true);
         }
      }
   }

   public void UuUVuuUu(vuuvVuVVVnuU var1) {
      if (this.uUVuVvuNUvnu == var1) {
         this.uUVuVvuNUvnu = null;
      }

      if (this.nuUnNvnuUu) {
         this.UuUVuuUu(false);
      }
   }

   public String UuuNnUvUuv() {
      return this.NVNnnvnuunNv.uUnuvNvvNU();
   }

   public String nUUVuvU() {
      return this.UNnVVNvvnVvU.uUnuvNvvNU();
   }

   public boolean UnUNVVVNuv() {
      return this.uNnUnnuNUnNu.uUnuvNvvNU();
   }

   public int vNVuvnUUnuUn() {
      return Math.max(5, Math.round(this.NnUuNNU.uUnuvNvvNU()));
   }

   public float UvnvNVnnnnNU() {
      return Math.max(0.25F, Math.min(0.95F, this.nNvNUVU.uUnuvNvvNU() / 100.0F));
   }

   public int uVUVnuvnuVuv() {
      return Math.max(1, Math.round(this.UnUNuUU.uUnuvNvvNU()));
   }

   public void NVNnnvnuunNv() {
      Path var1 = NUNNNUuUNnVv.UuUVuuUu(this.UuuNnUvUuv());

      try {
         if (this.uUVuVvuNUvnu != null) {
            this.uUVuVvuNUvnu.C00OOC00oO();
         }

         if (Files.deleteIfExists(var1)) {
            vVnvuVVUunuv.UuUVuuUu("[RotationLab] Deleted " + var1.getFileName());
         } else {
            vVnvuVVUunuv.UuUVuuUu("[RotationLab] Asset not found: " + var1.getFileName());
         }
      } catch (Throwable var3) {
         vVnvuVVUunuv.UuUVuuUu("[RotationLab] Delete failed: " + var3.getClass().getSimpleName());
      }
   }
}
