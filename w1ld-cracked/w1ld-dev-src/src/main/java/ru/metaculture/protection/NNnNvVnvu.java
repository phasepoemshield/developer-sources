package ru.metaculture.protection;

public final class NNnNvVnvu {
   private NNnNvVnvu() {
   }

   public static NNnNvVnvu.NVnVnNnN UuUVuuUu(NNnNvVnvu.nvnNNunvv var0, float var1, float var2) {
      if (var0 != null && var0.main() != null) {
         boolean var3 = var0.main().contains(var1, var2);
         boolean var4 = var0.themeRendered() && var0.theme() != null && var0.theme().contains(var1, var2);
         if (!var4 || var3 && !var0.themeOnTop()) {
            if (var3) {
               return new NNnNvVnvu.NVnVnNnN(NNnNvVnvu.uunvUUVnuNn.MAIN, true, var0.main().localX(var1), var0.main().localY(var2));
            } else {
               return var4
                  ? new NNnNvVnvu.NVnVnNnN(NNnNvVnvu.uunvUUVnuNn.THEME, var0.themeInteractive(), var0.theme().localX(var1), var0.theme().localY(var2))
                  : NNnNvVnvu.NVnVnNnN.NONE;
            }
         } else {
            return new NNnNvVnvu.NVnVnNnN(NNnNvVnvu.uunvUUVnuNn.THEME, var0.themeInteractive(), var0.theme().localX(var1), var0.theme().localY(var2));
         }
      } else {
         return NNnNvVnvu.NVnVnNnN.NONE;
      }
   }

   public record NVnVnNnN(NNnNvVnvu.uunvUUVnuNn surface, boolean interactive, float localX, float localY) {
      static final NNnNvVnvu.NVnVnNnN NONE = new NNnNvVnvu.NVnVnNnN(NNnNvVnvu.uunvUUVnuNn.NONE, false, 0.0F, 0.0F);

      public boolean blocksLower() {
         return this.surface != NNnNvVnvu.uunvUUVnuNn.NONE;
      }
   }

   public record VvunVVUvUNnv(float x, float y, float width, float height, float radius, float scale) {
      public VvunVVUvUNnv(float x, float y, float width, float height, float radius, float scale) {
         width = Math.max(0.0F, width);
         height = Math.max(0.0F, height);
         radius = Math.max(0.0F, Math.min(radius, Math.min(width, height) * 0.5F));
         scale = Math.max(0.001F, scale);
         this.x = x;
         this.y = y;
         this.width = width;
         this.height = height;
         this.radius = radius;
         this.scale = scale;
      }

      public boolean contains(float var1, float var2) {
         float var3 = this.x + this.width * 0.5F;
         float var4 = this.y + this.height * 0.5F;
         float var5 = var3 + (var1 - var3) / this.scale;
         float var6 = var4 + (var2 - var4) / this.scale;
         float var7 = this.width * 0.5F;
         float var8 = this.height * 0.5F;
         float var9 = Math.abs(var5 - var3) - var7 + this.radius;
         float var10 = Math.abs(var6 - var4) - var8 + this.radius;
         float var11 = Math.max(var9, 0.0F);
         float var12 = Math.max(var10, 0.0F);
         float var13 = Math.min(Math.max(var9, var10), 0.0F) + (float)Math.sqrt(var11 * var11 + var12 * var12) - this.radius;
         return var13 <= 0.0F;
      }

      public float localX(float var1) {
         float var2 = this.x + this.width * 0.5F;
         return var2 + (var1 - var2) / this.scale;
      }

      public float localY(float var1) {
         float var2 = this.y + this.height * 0.5F;
         return var2 + (var1 - var2) / this.scale;
      }
   }

   public record nvnNNunvv(NNnNvVnvu.VvunVVUvUNnv main, NNnNvVnvu.VvunVVUvUNnv theme, boolean themeRendered, boolean themeInteractive, boolean themeOnTop) {
   }

   public static enum uunvUUVnuNn {
      NONE,
      MAIN,
      THEME;
   }
}
