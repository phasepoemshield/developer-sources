package ru.metaculture.protection;

import java.util.Objects;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Matrix4f;

public final class O0000000OO0O0 extends Event {
   private final MinecraftClient O00000000;
   private final GameRenderer O000000000;
   private final O0000O0O0O00 O0000000000;
   private final float O00000000000;

   public O0000000OO0O0(MinecraftClient minecraftClient, GameRenderer gameRenderer, O0000O0O0O00 o0000O0O0O00, float f) {
      this.O00000000 = Objects.requireNonNull(minecraftClient, "client");
      this.O000000000 = Objects.requireNonNull(gameRenderer, "gameRenderer");
      this.O0000000000 = Objects.requireNonNull(o0000O0O0O00, "worldRenderer");
      this.O00000000000 = f;
   }

   public MinecraftClient O0000000000() {
      return this.O00000000;
   }

   public GameRenderer O00000000000() {
      return this.O000000000;
   }

   public O0000O0O0O00 O000000000000() {
      return this.O0000000000;
   }

   public MatrixStack O0000000000000() {
      return this.O0000000000.O000000000();
   }

   public Matrix4f O000000000000O() {
      return this.O0000000000.O0000000000();
   }

   public Matrix4f O00000000000O() {
      return this.O0000000000.O000000000000();
   }

   public float O00000000000O0() {
      return this.O00000000000;
   }
}
