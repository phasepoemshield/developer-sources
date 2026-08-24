package oxxxde;

import java.nio.ByteBuffer;

// $VF: Compiled from heavy
public class ذن {
   private final زآ filtering;
   private final ByteBuffer pixels;
   private final int height;
   private final ضو colorMode;
   private final boolean usingStb;
   private final int width;
   private final جش wrapping;

   public boolean isUsingStb() {
      return this.usingStb;
   }

   public ضو getColorMode() {
      return this.colorMode;
   }

   public ذن(ByteBuffer width, int height, int usingStb, ضو pixels, زآ colorMode, جش filtering, boolean wrapping) {
      this.pixels = pixels;
      this.width = width;
      this.height = height;
      this.colorMode = colorMode;
      this.filtering = filtering;
      this.wrapping = wrapping;
      this.usingStb = usingStb;
   }

   public int getWidth() {
      return this.width;
   }

   public جش getWrapping() {
      return this.wrapping;
   }

   public ByteBuffer getPixels() {
      return this.pixels;
   }

   public int getHeight() {
      return this.height;
   }

   public زآ getFiltering() {
      return this.filtering;
   }
}
