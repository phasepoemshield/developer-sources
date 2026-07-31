package l;

import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.chars.Char2ObjectArrayMap;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.font.LineMetrics;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.texture.NativeImage.Format;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.ColorHelper;
import org.lwjgl.system.MemoryUtil;

public class Helper186 {
   private static final FontRenderContext FONT_RENDER_CONTEXT = new FontRenderContext(null, true, true);
   private final Char2ObjectArrayMap<Helper100> glyphs = new Char2ObjectArrayMap();
   private final char fromIncl;
   private final char toExcl;
   private final Font font;
   public final Identifier bindToTexture;
   private final int pixelPadding;
   public int width;
   public int height;
   private boolean generated = false;

   public Helper186(char var1, char var2, Font var3, Identifier var4, int var5) {
      this.fromIncl = var1;
      this.toExcl = var2;
      this.font = var3;
      this.bindToTexture = var4;
      this.pixelPadding = var5;
   }

   public Helper100 method1601(char var1) {
      if (!this.generated) {
         this.method1604();
      }

      return (Helper100)this.glyphs.get(var1);
   }

   public boolean method1602(char var1) {
      return var1 >= this.fromIncl && var1 < this.toExcl;
   }

   private Font method1603(char var1) {
      if (this.font.canDisplay(var1)) {
         return this.font;
      } else {
         Font var2 = new Font("SansSerif", this.font.getStyle(), this.font.getSize());
         if (GraphicsEnvironment.isHeadless()) {
            return var2;
         } else {
            try {
               return Arrays.stream(GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts())
                  .filter(var1x -> var1x.canDisplay(var1))
                  .map(var1x -> new Font(var1x.getFontName(), this.font.getStyle(), this.font.getSize()))
                  .findFirst()
                  .orElse(var2);
            } catch (Throwable var4) {
               return var2;
            }
         }
      }
   }

   public void method1604() {
      if (!this.generated) {
         int var1 = this.toExcl - this.fromIncl - 1;
         int var2 = (int)(Math.ceil(Math.sqrt(var1)) * 1.5);
         this.glyphs.clear();
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;

         ArrayList<Helper185> var10;
         for (var10 = new ArrayList<>(); var3 <= var1; var4++) {
            char var11 = (char)(this.fromIncl + var3);
            var3++;
            if (var4 >= var2) {
               var7 = 0;
               var8 += var9 + this.pixelPadding;
               var4 = 0;
               var9 = 0;
            }

            Font var12 = this.method1603(var11);
            Helper184 var13 = method1607(var12, var11);
            int var14 = var13.method1593();
            int var15 = var13.method1594();
            var9 = Math.max(var9, var15);
            Helper100 var16 = new Helper100(var7, var8, var14, var15, var11, this);
            var10.add(new Helper185(var16, var12, var13.method1595(), var13.method1596()));
            var5 = Math.max(var5, var7 + var14);
            var6 = Math.max(var6, var8 + var15);
            var7 += var14 + this.pixelPadding;
         }

         BufferedImage var17 = new BufferedImage(Math.max(var5 + this.pixelPadding, 1), Math.max(var6 + this.pixelPadding, 1), 2);
         this.width = var17.getWidth();
         this.height = var17.getHeight();
         Graphics2D var18 = var17.createGraphics();
         var18.setColor(new Color(255, 255, 255, 0));
         var18.fillRect(0, 0, this.width, this.height);
         var18.setColor(Color.WHITE);
         var18.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
         var18.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
         var18.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

         for (Helper185 var20 : var10) {
            Helper100 var21 = var20.method1597();
            GlyphVector var22 = var20.method1598().createGlyphVector(FONT_RENDER_CONTEXT, String.valueOf(var21.method919()));
            var18.drawGlyphVector(var22, var21.method915() + var20.method1599(), var21.method916() + var20.method1600());
            this.glyphs.put(var21.method919(), var21);
         }

         method1605(this.bindToTexture, var17);
         this.generated = true;
      }
   }

   public static void method1605(Identifier var0, BufferedImage var1) {
      try {
         int var2 = var1.getWidth();
         int var3 = var1.getHeight();
         NativeImage var4 = new NativeImage(Format.RGBA, var2, var3, false);
         IntBuffer var5 = MemoryUtil.memIntBuffer(var4.pointer, var4.getWidth() * var4.getHeight());
         WritableRaster var6 = var1.getRaster();
         ColorModel var7 = var1.getColorModel();
         Object var8 = method1606(var6);

         for (int var9 = 0; var9 < var3; var9++) {
            for (int var10 = 0; var10 < var2; var10++) {
               var6.getDataElements(var10, var9, var8);
               int var11 = var7.getAlpha(var8);
               int var12 = var7.getRed(var8);
               int var13 = var7.getGreen(var8);
               int var14 = var7.getBlue(var8);
               var5.put(ColorHelper.getArgb(var11, var14, var13, var12));
            }
         }

         NativeImageBackedTexture var16 = new NativeImageBackedTexture(var4);
         var16.upload();
         if (RenderSystem.isOnRenderThread()) {
            MinecraftClient.getInstance().getTextureManager().registerTexture(var0, var16);
         } else {
            RenderSystem.recordRenderCall(() -> MinecraftClient.getInstance().getTextureManager().registerTexture(var0, var16));
         }
      } catch (Throwable var15) {
         throw var15;
      }
   }

   private static Object method1606(WritableRaster var0) {
      return switch (var0.getDataBuffer().getDataType()) {
         case 0 -> new byte[var0.getNumDataElements()];
         case 1 -> new short[var0.getNumDataElements()];
         default -> throw new IllegalArgumentException("Unsupported data buffer type: " + var0.getDataBuffer().getDataType());
         case 3 -> new int[var0.getNumDataElements()];
         case 4 -> new float[var0.getNumDataElements()];
         case 5 -> new double[var0.getNumDataElements()];
      };
   }

   private static Helper184 method1607(Font var0, char var1) {
      String var2 = String.valueOf(var1);
      GlyphVector var3 = var0.createGlyphVector(FONT_RENDER_CONTEXT, var2);
      Rectangle var4 = var3.getPixelBounds(FONT_RENDER_CONTEXT, 0.0F, 0.0F);
      LineMetrics var5 = var0.getLineMetrics(var2, FONT_RENDER_CONTEXT);
      int var6 = Math.max(1, (int)Math.ceil(var3.getGlyphMetrics(0).getAdvanceX()));
      int var7 = Math.max(1, (int)Math.ceil(var5.getAscent()));
      int var8 = Math.max(0, (int)Math.ceil(var5.getDescent() + var5.getLeading()));
      int var9 = Math.max(0, -var4.x);
      int var11 = Math.max(0, var4.x + var4.width - var6);
      int var12 = Math.max(1, var9 + var6 + var11);
      int var13 = Math.max(1, var7 + var8);
      return new Helper184(var12, var13, var9, var7);
   }
}
