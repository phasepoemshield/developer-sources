package ru.metaculture.protection;

import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2797;
import net.minecraft.class_636;
import net.minecraft.class_7472;
import net.minecraft.class_3515.class_7426;
import net.minecraft.class_7635.class_7636;

public final class vUNVNUnuv {
   private final String UuUVuuUu;
   private final class_2535 C00OOC00oO;
   private volatile GameProfile uUnuvNvvNU;
   private volatile nNnnNNnNVvUv vVvUvVVuuNvV;
   private volatile VnUvNVNVNUUn uNNnnnuuuN;
   private volatile VNNVunUvvnn nuUnNvnuUu;
   private volatile class_636 VVuuUN;
   private volatile boolean vNUvnnVnUvu;
   private volatile boolean uVUuuVnNVU;
   private volatile boolean vuuuNvNuv;
   private final AtomicBoolean nvUVNnuu = new AtomicBoolean();
   private final VUnnvUVNvuuv UuuNnUvUuv = new VUnnvUVNvuuv(this);

   public vUNVNUnuv(String var1, class_2535 var2) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
   }

   public String UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public GameProfile C00OOC00oO() {
      return this.uUnuvNvvNU;
   }

   public void UuUVuuUu(GameProfile var1) {
      this.uUnuvNvvNU = var1;
   }

   public class_2535 uUnuvNvvNU() {
      return this.C00OOC00oO;
   }

   public void UuUVuuUu(class_2596<?> var1) {
      if (this.C00OOC00oO.method_10758()) {
         this.C00OOC00oO.method_10743(var1);
      }
   }

   public boolean UuUVuuUu(String var1) {
      if (!this.vNUvnnVnUvu || var1 == null || var1.isBlank() || var1.length() > 256 || !this.C00OOC00oO.method_10758()) {
         return false;
      } else if (!var1.startsWith("/")) {
         this.UuUVuuUu(new class_2797(var1, Instant.now(), class_7426.method_43531(), null, new class_7636(0, new BitSet(), (byte)0)));
         return true;
      } else if (var1.length() == 1) {
         return false;
      } else {
         this.UuUVuuUu(new class_7472(var1.substring(1)));
         return true;
      }
   }

   public void vVvUvVVuuNvV() {
      if (this.C00OOC00oO.method_10758()) {
         this.C00OOC00oO.method_10747(class_2561.method_43470("Bot removed"));
      }
   }

   public boolean uNNnnnuuuN() {
      return this.C00OOC00oO.method_10758();
   }

   public nNnnNNnNVvUv nuUnNvnuUu() {
      return this.vVvUvVVuuNvV;
   }

   public void UuUVuuUu(nNnnNNnNVvUv var1) {
      this.vVvUvVVuuNvV = var1;
   }

   public VnUvNVNVNUUn VVuuUN() {
      return this.uNNnnnuuuN;
   }

   public void UuUVuuUu(VnUvNVNVNUUn var1) {
      this.uNNnnnuuuN = var1;
   }

   public VNNVunUvvnn vNUvnnVnUvu() {
      return this.nuUnNvnuUu;
   }

   public void UuUVuuUu(VNNVunUvvnn var1) {
      this.nuUnNvnuUu = var1;
   }

   public class_636 uVUuuVnNVU() {
      return this.VVuuUN;
   }

   public void UuUVuuUu(class_636 var1) {
      this.VVuuUN = var1;
   }

   public boolean vuuuNvNuv() {
      return this.vNUvnnVnUvu;
   }

   public void UuUVuuUu(boolean var1) {
      this.vNUvnnVnUvu = var1;
   }

   public boolean nvUVNnuu() {
      return this.uVUuuVnNVU;
   }

   public void C00OOC00oO(boolean var1) {
      this.uVUuuVnNVU = var1;
   }

   public VUnnvUVNvuuv UuuNnUvUuv() {
      return this.UuuNnUvUuv;
   }

   public boolean nUUVuvU() {
      return this.vuuuNvNuv;
   }

   public void uUnuvNvvNU(boolean var1) {
      this.vuuuNvNuv = var1;
   }

   boolean UnUNVVVNuv() {
      return this.nvUVNnuu.compareAndSet(false, true);
   }

   boolean vNVuvnUUnuUn() {
      return this.nvUVNnuu.get();
   }

   void UvnvNVnnnnNU() {
      this.vNUvnnVnUvu = false;
      this.uVUuuVnNVU = false;
      this.vuuuNvNuv = false;
      this.vVvUvVVuuNvV = null;
      this.uNNnnnuuuN = null;
      this.nuUnNvnuUu = null;
      this.VVuuUN = null;
   }
}
