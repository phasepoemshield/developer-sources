package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;

public class O0000000O00O extends Event {
   private MinecraftClient O00000000;
   private RenderManager O000000000;
   private FontObject O0000000000;
   private int O00000000000;
   private int O000000000000;
   private DrawContext O0000000000000;

   public O0000000O00O() {
   }

   public O0000000O00O(MinecraftClient minecraftClient, RenderManager o0000O00OO0O0, FontObject o0000O0O00O00O, int i, int j, DrawContext drawContext) {
      this.O00000000(minecraftClient, o0000O00OO0O0, o0000O0O00O00O, i, j, drawContext);
   }

   public O0000000O00O O00000000(MinecraftClient minecraftClient, RenderManager o0000O00OO0O0, FontObject o0000O0O00O00O, int i, int j, DrawContext drawContext) {
      this.O00000000 = minecraftClient;
      this.O000000000 = o0000O00OO0O0;
      this.O0000000000 = o0000O0O00O00O;
      this.O00000000000 = i;
      this.O000000000000 = j;
      this.O0000000000000 = drawContext;
      return this;
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

   public DrawContext O00000000000O() {
      return this.O0000000000000;
   }
}
