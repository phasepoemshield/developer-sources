package ru.metaculture.protection;

import java.util.Objects;
import net.minecraft.client.MinecraftClient;

public final class O0000000O0O0O0 extends Event {
   private final MinecraftClient O00000000;

   public O0000000O0O0O0(MinecraftClient minecraftClient) {
      this.O00000000 = Objects.requireNonNull(minecraftClient, "client");
   }

   public MinecraftClient O0000000000() {
      return this.O00000000;
   }
}
