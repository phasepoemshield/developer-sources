package ru.metaculture.protection;

import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class O00000O0OO000O {
   public static final Identifier O00000000 = Identifier.of("wild", "floating_stardust");
   public static final Identifier O000000000 = Identifier.of("wild", "shooting_star");
   public static final SimpleParticleType O0000000000 = FabricParticleTypes.simple(true);
   public static final SimpleParticleType O00000000000 = FabricParticleTypes.simple(true);
   private static boolean O000000000000;

   private O00000O0OO000O() {
   }

   public static void O00000000() {
      if (!O000000000000) {
         O000000000000 = true;
         O00000O0OO00O0.O00000000();
         O00000O0OO0O.O00000000();
         O00000O0OO000.O00000000 = O0000000000;
         O00000O0OO0000.O00000000 = O00000000000;
         Registry.register(Registries.PARTICLE_TYPE, O00000000, O0000000000);
         Registry.register(Registries.PARTICLE_TYPE, O000000000, O00000000000);
         ParticleFactoryRegistry.getInstance().register(O0000000000, new O00000O0OO000.W192());
         ParticleFactoryRegistry.getInstance().register(O00000000000, new O00000O0OO0000.W193());
      }
   }
}
