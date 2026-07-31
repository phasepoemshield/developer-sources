package ru.metaculture.protection;

import java.util.Objects;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;

public final class O0000000O0OO extends Event {
   private final MinecraftClient O00000000;
   private final ClientPlayerEntity O000000000;
   private final ClientWorld O0000000000;

   public O0000000O0OO(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity, ClientWorld clientWorld) {
      this.O00000000 = Objects.requireNonNull(minecraftClient, "client");
      this.O000000000 = Objects.requireNonNull(clientPlayerEntity, "player");
      this.O0000000000 = Objects.requireNonNull(clientWorld, "world");
   }

   public MinecraftClient O0000000000() {
      return this.O00000000;
   }

   public ClientPlayerEntity O00000000000() {
      return this.O000000000;
   }

   public ClientWorld O000000000000() {
      return this.O0000000000;
   }
}
