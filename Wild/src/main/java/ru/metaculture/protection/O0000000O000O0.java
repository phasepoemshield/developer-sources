package ru.metaculture.protection;

import java.time.Instant;
import java.util.Objects;
import net.minecraft.client.MinecraftClient;

public final class O0000000O000O0 extends Event {
   private final MinecraftClient O00000000;
   private final Instant O000000000;

   public O0000000O000O0(MinecraftClient minecraftClient) {
      this(minecraftClient, Instant.now());
   }

   public O0000000O000O0(MinecraftClient minecraftClient, Instant instant) {
      this.O00000000 = minecraftClient;
      this.O000000000 = Objects.requireNonNull(instant, "timestamp");
   }

   public MinecraftClient O0000000000() {
      return this.O00000000;
   }

   public Instant O00000000000() {
      return this.O000000000;
   }
}
