package ru.metaculture.protection;

import java.util.Objects;
import net.minecraft.client.MinecraftClient;

public final class O0000000OO00O0 extends Event {
   private final MinecraftClient O00000000;
   private final RenderManager O000000000;
   private final FontObject O0000000000;
   private final int O00000000000;
   private final int O000000000000;

   public O0000000OO00O0(MinecraftClient minecraftClient, RenderManager o0000O00OO0O0, FontObject o0000O0O00O00O, int i, int j) {
      this.O00000000 = Objects.requireNonNull(minecraftClient, "client");
      this.O000000000 = Objects.requireNonNull(o0000O00OO0O0, "renderer");
      this.O0000000000 = Objects.requireNonNull(o0000O0O00O00O, "defaultFont");
      this.O00000000000 = i;
      this.O000000000000 = j;
   }

   public MinecraftClient O0000000000() {
      return this.O00000000;
   }

   public RenderManager O00000000000() {
      return this.O000000000;
   }

   public FontObject O000000000000() {
      return this.O0000000000;
   }

   public int O0000000000000() {
      return this.O00000000000;
   }

   public int O000000000000O() {
      return this.O000000000000;
   }
}
