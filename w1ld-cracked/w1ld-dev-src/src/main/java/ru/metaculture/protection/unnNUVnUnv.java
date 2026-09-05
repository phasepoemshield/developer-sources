package ru.metaculture.protection;

import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.class_2378;
import net.minecraft.class_2400;
import net.minecraft.class_2960;
import net.minecraft.class_7923;

public final class unnNUVnUnv {
   public static final class_2960 UuUVuuUu = class_2960.method_60655("wild", "floating_stardust");
   public static final class_2960 C00OOC00oO = class_2960.method_60655("wild", "shooting_star");
   public static final class_2400 uUnuvNvvNU = FabricParticleTypes.simple(true);
   public static final class_2400 vVvUvVVuuNvV = FabricParticleTypes.simple(true);
   private static boolean uNNnnnuuuN;

   private unnNUVnUnv() {
   }

   public static void UuUVuuUu() {
      if (!uNNnnnuuuN) {
         uNNnnnuuuN = true;
         vNvVVuUVVuuN.UuUVuuUu();
         vVUuUUNUVUN.UuUVuuUu();
         nvUnNvnvuN.UuUVuuUu = uUnuvNvvNU;
         vvvnuUuUUvN.UuUVuuUu = vVvUvVVuuNvV;
         class_2378.method_10230(class_7923.field_41180, UuUVuuUu, uUnuvNvvNU);
         class_2378.method_10230(class_7923.field_41180, C00OOC00oO, vVvUvVVuuNvV);
         ParticleFactoryRegistry.getInstance().register(uUnuvNvvNU, new nvUnNvnvuN.NVnVnNnN());
         ParticleFactoryRegistry.getInstance().register(vVvUvVVuuNvV, new vvvnuUuUUvN.NVnVnNnN());
      }
   }
}
