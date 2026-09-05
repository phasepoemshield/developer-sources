package ru.metaculture.protection;

import com.mojang.authlib.GameProfile;
import java.math.BigInteger;
import java.security.PublicKey;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_2803;
import net.minecraft.class_2817;
import net.minecraft.class_2896;
import net.minecraft.class_2899;
import net.minecraft.class_2901;
import net.minecraft.class_2905;
import net.minecraft.class_2907;
import net.minecraft.class_2909;
import net.minecraft.class_2913;
import net.minecraft.class_2917;
import net.minecraft.class_310;
import net.minecraft.class_3515;
import net.minecraft.class_7648;
import net.minecraft.class_7701;
import net.minecraft.class_7756;
import net.minecraft.class_8593;
import net.minecraft.class_8675;
import net.minecraft.class_8709;
import net.minecraft.class_9088;
import net.minecraft.class_9091;
import net.minecraft.class_9157;
import net.minecraft.class_9782;
import net.minecraft.class_9812;
import net.minecraft.client.ClientBrandRetriever;

public final class NvuvVnuNuvUv implements class_2896 {
   private final class_310 UuUVuuUu = class_310.method_1551();
   private final class_2535 C00OOC00oO;
   private final vUNVNUnuv uUnuvNvvNU;

   public NvuvVnuNuvUv(class_2535 var1, vUNVNUnuv var2) {
      this.C00OOC00oO = var1;
      this.uUnuvNvvNU = var2;
   }

   public void method_12587(class_2905 var1) {
      if (!nnVNNuuVUVn.uNNnnnuuuN(this.uUnuvNvvNU)) {
         nnVNNuuVUVn.uUnuvNvvNU(this.uUnuvNvvNU);
      } else if (var1.method_56013()) {
         String var8 = "Online-mode authentication is not supported for bot sessions";
         nnVNNuuVUVn.UuUVuuUu(this.uUnuvNvvNU, var8);
         OCO0OoO.UuUVuuUu(this.uUnuvNvvNU, "§c" + var8);
         this.C00OOC00oO.method_10747(class_2561.method_43470("Wild bots support offline-mode servers only (online-mode auth requires a per-account session)"));
      } else {
         Cipher var2;
         Cipher var3;
         class_2917 var4;
         try {
            SecretKey var5 = class_3515.method_15239();
            PublicKey var6 = var1.method_12611();
            new BigInteger(class_3515.method_15240(var1.method_12610(), var6, var5)).toString(16);
            var2 = class_3515.method_15235(2, var5);
            var3 = class_3515.method_15235(1, var5);
            var4 = new class_2917(var5, var6, var1.method_12613());
         } catch (Exception var7) {
            nnVNNuuVUVn.UuUVuuUu(this.uUnuvNvvNU, "Login protocol error: " + var7.getClass().getSimpleName());
            throw new IllegalStateException("Protocol error", var7);
         }

         this.C00OOC00oO.method_10752(var4, class_7648.method_45084(() -> this.C00OOC00oO.method_10746(var2, var3)));
      }
   }

   public void method_12588(class_2901 var1) {
      if (!nnVNNuuVUVn.uNNnnnuuuN(this.uUnuvNvvNU)) {
         nnVNNuuVUVn.uUnuvNvvNU(this.uUnuvNvvNU);
      } else {
         nnVNNuuVUVn.UuUVuuUu(this.uUnuvNvvNU, nnVNNuuVUVn.nvnNNunvv.CONFIGURING, "Configuring session ...");
         GameProfile var2 = var1.comp_2363();
         class_8675 var3 = new class_8675(
            var2,
            this.UuUVuuUu.method_47601().method_47706(false, null, null),
            class_7756.method_45738().method_45926(),
            class_7701.field_40183,
            null,
            null,
            null,
            Map.of(),
            null,
            Map.of(),
            class_9782.field_51977
         );
         this.C00OOC00oO.method_56330(class_9157.field_48699, new uvUVUnvuUvU(this.UuUVuuUu, this.C00OOC00oO, var3, this.uUnuvNvvNU));
         this.C00OOC00oO.method_10743(class_8593.field_48252);
         this.C00OOC00oO.method_56329(class_9157.field_48698);
         this.C00OOC00oO.method_10743(new class_2817(new class_8709(ClientBrandRetriever.getClientModName())));
         this.C00OOC00oO.method_10743(new class_2803(this.UuUVuuUu.field_1690.method_53842()));
      }
   }

   public void method_12584(class_2909 var1) {
      nnVNNuuVUVn.UuUVuuUu(this.uUnuvNvvNU, "Login rejected: " + var1.comp_4195().getString());
      this.C00OOC00oO.method_10747(var1.comp_4195());
   }

   public void method_12585(class_2907 var1) {
      if (!this.C00OOC00oO.method_10756()) {
         this.C00OOC00oO.method_10760(var1.method_12634(), false);
      }
   }

   public void method_12586(class_2899 var1) {
      this.C00OOC00oO.method_10743(new class_2913(var1.comp_1567(), null));
   }

   public void method_55845(class_9088 var1) {
      this.C00OOC00oO.method_10743(new class_9091(var1.comp_2194(), null));
   }

   public void method_10839(class_9812 var1) {
      String var2 = "login disconnected: " + var1.comp_2853().getString();
      nnVNNuuVUVn.UuUVuuUu(this.uUnuvNvvNU, var2);
      OCO0OoO.UuUVuuUu(this.uUnuvNvvNU, "§c" + var2);
      nnVNNuuVUVn.uUnuvNvvNU(this.uUnuvNvvNU);
   }

   public boolean method_48106() {
      return this.C00OOC00oO.method_10758();
   }
}
