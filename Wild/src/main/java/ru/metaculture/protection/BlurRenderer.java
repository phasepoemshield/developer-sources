package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.Window;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class BlurRenderer {
   private static final BlurRenderer O00000000 = new BlurRenderer();
   private static final int O000000000 = 5;
   private static final long O0000000000 = 760000000L;
   private static final long O00000000000 = 1860000000L;
   private final BlurRenderer.W393[] O000000000000 = new BlurRenderer.W393[5];
   private final float[] O0000000000000 = new float[10];
   private final float[] O000000000000O = new float[5];
   private final float[] O00000000000O = new float[5];
   private final float[] O00000000000O0 = new float[5];
   private final float[] O00000000000OO = new float[15];
   private final float[] O0000000000O = new float[15];
   private final float[] O0000000000O0 = new float[15];
   private final float[] O0000000000O00 = new float[15];
   private final float[] O0000000000O0O = new float[4];
   private final float[] O0000000000OO = new float[4];
   private final float[] O0000000000OO0 = new float[2];
   private final O0000O0O000O0 O0000000000OOO = new O0000O0O000O0();
   private boolean O000000000O;
   private BlurRenderer.W392 O000000000O0;
   private O0000O00OO0 O000000000O00;
   private int O000000000O000 = -1;
   private int O000000000O00O = -1;
   private int O000000000O0O = -1;
   private int O000000000O0O0 = -1;
   private int O000000000O0OO = -1;
   private int O000000000OO = -1;
   private int O000000000OO0 = -1;
   private int O000000000OO00 = -1;
   private int O000000000OO0O = -1;
   private int O000000000OOO = -1;
   private int O000000000OOO0 = -1;
   private int O000000000OOOO = -1;
   private int O00000000O = -1;
   private int O00000000O0 = -1;

   private BlurRenderer() {
      for (int var1 = 0; var1 < this.O000000000000.length; var1++) {
         this.O000000000000[var1] = new BlurRenderer.W393();
      }
   }

   public static BlurRenderer O00000000() {
      return O00000000;
   }

   public void O000000000() {
      if (!this.O000000000O) {
         this.O000000000O = true;
         EventManager.O00000000(this);
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O00 o0000000O0O00) {
      if (o0000000O0O00.O00000000000O0()) {
         if (MenuModule.O00000000(MenuModule.O000000000OO0O)) {
            MinecraftClient var2 = MinecraftClient.getInstance();
            if (var2 != null && var2.currentScreen != null) {
               Window var3 = var2.getWindow();
               if (var3 != null && !var3.hasZeroWidthOrHeight()) {
                  int var4 = var3.getFramebufferWidth();
                  int var5 = var3.getFramebufferHeight();
                  int var6 = var3.getWidth();
                  int var7 = var3.getHeight();
                  if (var4 > 0 && var5 > 0 && var6 > 0 && var7 > 0) {
                     float var8 = O00000000((float)(o0000000O0O00.O000000000000O() * var4 / var6), 0.0F, Math.max(0.0F, var4 - 1.0F));
                     float var9 = O00000000((float)(o0000000O0O00.O00000000000O() * var5 / var7), 0.0F, Math.max(0.0F, var5 - 1.0F));
                     this.O00000000(var8, var9, this.O00000000(o0000000O0O00.O00000000000()), -1, -2232577, 0.0F, 760000000L);
                  }
               }
            }
         }
      }
   }

   public void O00000000(float f, float g, int i, int j) {
      this.O00000000(f, g, i, j, i, j);
   }

   public void O00000000(float f, float g, int i, int j, int k, int l) {
      this.O00000000(f, g, 1.24F, i, j, k, l, 1.0F, 1860000000L);
   }

   public void O00000000(float f, float g, float h, float i, float j, float k, float l, float m, float n, float o) {
      this.O0000000000O0O[0] = Math.max(0.0F, f);
      this.O0000000000O0O[1] = Math.max(0.0F, g);
      this.O0000000000O0O[2] = Math.max(0.0F, h);
      this.O0000000000O0O[3] = Math.max(0.0F, i);
      this.O0000000000OO[0] = Math.max(0.0F, k);
      this.O0000000000OO[1] = Math.max(0.0F, l);
      this.O0000000000OO[2] = Math.max(0.0F, m);
      this.O0000000000OO[3] = Math.max(0.0F, n);
      this.O0000000000OO0[0] = Math.max(0.0F, j);
      this.O0000000000OO0[1] = Math.max(0.0F, o);
   }

   public boolean O00000000(Screen screen) {
      this.O000000000(System.nanoTime());
      return screen != null && !this.O000000000(screen) && this.O00000000000O();
   }

   public boolean O00000000(Object object) {
      this.O000000000(System.nanoTime());
      return object != null && this.O000000000(object) && this.O00000000000O();
   }

   public boolean O00000000(int i, int j) {
      this.O000000000(System.nanoTime());
      if (this.O000000000O0 == null && i > 0 && j > 0 && this.O00000000000O()) {
         this.O0000000000(i, j);
         O0000O00O0OOO0.W373 var3 = O0000O00O0OOO0.O00000000();
         this.O000000000O0 = new BlurRenderer.W392(var3, i, j);
         GL30.glBindFramebuffer(36160, this.O0000000000OOO.O00000000);
         GL11.glViewport(0, 0, i, j);
         GL11.glDisable(3089);
         GL11.glDisable(36281);
         GL11.glColorMask(true, true, true, true);
         GL11.glDepthMask(true);
         GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
         GL11.glClear(16640);
         return true;
      } else {
         return false;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O0000000000() {
      BlurRenderer.W392 var1 = this.O000000000O0;
      if (var1 != null) {
         this.O000000000O0 = null;
         O0000O00O0OOO0.O00000000(var1.snapshot());
         O0000O00O0OOO0.W373 var2 = O0000O00O0OOO0.O00000000();
         boolean var5 = false /* VF: Semaphore variable */;

         try {
            var5 = true;
            this.O00000000000(var1.width(), var1.height());
            var5 = false;
         } finally {
            if (var5) {
               O0000O00O0OOO0.O00000000(var2);
            }
         }

         O0000O00O0OOO0.O00000000(var2);
      }
   }

   public void O00000000000() {
      long var1 = System.nanoTime();
      this.O000000000(var1);
      if (this.O000000000O0 == null && this.O00000000000O()) {
         MinecraftClient var3 = MinecraftClient.getInstance();
         if (var3 != null && var3.getWindow() != null && !var3.getWindow().hasZeroWidthOrHeight()) {
            RenderEngine var4 = WildClient.O0000000000();
            if (var4 != null) {
               this.O0000000000000();
               RenderEngine.W370 var5 = var4.O00000000000();
               if (var5.colorTexture() > 0 && var5.width() > 0 && var5.height() > 0) {
                  this.O00000000(var5.colorTexture(), var5.width(), var5.height(), false);
               }
            }
         }
      }
   }

   public void O000000000(int i, int j) {
      this.O000000000O0 = null;
      if (i > 0 && j > 0) {
         if (this.O0000000000OOO.O00000000000 != i || this.O0000000000OOO.O000000000000 != j) {
            this.O0000000000OOO.O00000000();
            this.O00000000000O0();
         }
      } else {
         this.O0000000000OOO.O00000000();
         this.O00000000000O0();
      }
   }

   public void O00000000(boolean bl) {
      if (!bl) {
         this.O000000000O0 = null;
         this.O00000000000O0();
      }
   }

   public void O000000000000() {
      this.O000000000O0 = null;
      this.O00000000000O0();
   }

   private boolean O000000000(Object object) {
      return object instanceof ModernClickGuiScreen || object instanceof ClickGuiScreen || object instanceof AutoBuyScreen || object instanceof O00000OO0OOOO;
   }

   private void O0000000000(int i, int j) {
      this.O0000000000OOO.O00000000(i, j);
      this.O0000000000000();
   }

   private void O0000000000000() {
      if (this.O000000000O00 == null) {
         this.O000000000O00 = O0000O00OO0.O00000000("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/postfx/gui_ripple.frag");
         this.O000000000O000 = this.O000000000O00.O00000000("uSource");
         this.O000000000O00O = this.O000000000O00.O00000000("uResolution");
         this.O000000000O0O = this.O000000000O00.O00000000("uRippleCount");
         this.O000000000O0O0 = this.O000000000O00.O00000000("uRippleCenter[0]");
         this.O000000000O0OO = this.O000000000O00.O00000000("uRippleAge[0]");
         this.O000000000OO = this.O000000000O00.O00000000("uRipplePower[0]");
         this.O000000000OO0 = this.O000000000O00.O00000000("uRippleKind[0]");
         this.O000000000OO00 = this.O000000000O00.O00000000("uRipplePreviousColorTop[0]");
         this.O000000000OO0O = this.O000000000O00.O00000000("uRipplePreviousColorBottom[0]");
         this.O000000000OOO = this.O000000000O00.O00000000("uRippleColorTop[0]");
         this.O000000000OOO0 = this.O000000000O00.O00000000("uRippleColorBottom[0]");
         this.O000000000OOOO = this.O000000000O00.O00000000("uThemeGuiRect");
         this.O00000000O = this.O000000000O00.O00000000("uThemePanelRect");
         this.O00000000O0 = this.O000000000O00.O00000000("uThemeRadii");
      }
   }

   private void O00000000000(int i, int j) {
      this.O00000000(this.O0000000000OOO.O000000000, i, j, true);
   }

   private void O00000000(int i, int j, int k, boolean bl) {
      long var5 = System.nanoTime();
      int var7 = this.O00000000(var5);
      RenderEngine var8 = WildClient.O0000000000();
      if (var8 != null) {
         var8.O00000000(i, j, k, this.O000000000O00, () -> {
            if (this.O000000000O000 >= 0) {
               GL20.glUniform1i(this.O000000000O000, 0);
            }

            if (this.O000000000O00O >= 0) {
               GL20.glUniform2f(this.O000000000O00O, j, k);
            }

            if (this.O000000000O0O >= 0) {
               GL20.glUniform1i(this.O000000000O0O, var7);
            }

            this.O000000000000O();
         }, bl);
      }
   }

   private int O00000000(long l) {
      int var3 = 0;

      for (int var4 = 0; var4 < 5; var4++) {
         BlurRenderer.W393 var5 = this.O000000000000[var4];
         if (var5.O00000000) {
            float var6 = (float)(l - var5.O000000000) / (float)var5.O0000000000O;
            if (var6 >= 1.0F) {
               var5.O00000000 = false;
            } else {
               this.O0000000000000[var3 * 2] = var5.O0000000000;
               this.O0000000000000[var3 * 2 + 1] = var5.O00000000000;
               this.O000000000000O[var3] = O00000000(var6, 0.0F, 1.0F);
               this.O00000000000O[var3] = var5.O000000000000;
               this.O00000000000O0[var3] = var5.O0000000000000;
               O00000000(var5.O000000000000O, this.O00000000000OO, var3 * 3);
               O00000000(var5.O00000000000O, this.O0000000000O, var3 * 3);
               O00000000(var5.O00000000000O0, this.O0000000000O0, var3 * 3);
               O00000000(var5.O00000000000OO, this.O0000000000O00, var3 * 3);
               var3++;
            }
         }
      }

      for (int var7 = var3; var7 < 5; var7++) {
         this.O0000000000000[var7 * 2] = 0.0F;
         this.O0000000000000[var7 * 2 + 1] = 0.0F;
         this.O000000000000O[var7] = 1.0F;
         this.O00000000000O[var7] = 0.0F;
         this.O00000000000O0[var7] = 0.0F;
         O00000000(-1, this.O00000000000OO, var7 * 3);
         O00000000(-2232577, this.O0000000000O, var7 * 3);
         O00000000(-1, this.O0000000000O0, var7 * 3);
         O00000000(-2232577, this.O0000000000O00, var7 * 3);
      }

      return var3;
   }

   private void O000000000000O() {
      if (this.O000000000O0O0 >= 0) {
         GL20.glUniform2fv(this.O000000000O0O0, this.O0000000000000);
      }

      if (this.O000000000O0OO >= 0) {
         GL20.glUniform1fv(this.O000000000O0OO, this.O000000000000O);
      }

      if (this.O000000000OO >= 0) {
         GL20.glUniform1fv(this.O000000000OO, this.O00000000000O);
      }

      if (this.O000000000OO0 >= 0) {
         GL20.glUniform1fv(this.O000000000OO0, this.O00000000000O0);
      }

      if (this.O000000000OO00 >= 0) {
         GL20.glUniform3fv(this.O000000000OO00, this.O00000000000OO);
      }

      if (this.O000000000OO0O >= 0) {
         GL20.glUniform3fv(this.O000000000OO0O, this.O0000000000O);
      }

      if (this.O000000000OOO >= 0) {
         GL20.glUniform3fv(this.O000000000OOO, this.O0000000000O0);
      }

      if (this.O000000000OOO0 >= 0) {
         GL20.glUniform3fv(this.O000000000OOO0, this.O0000000000O00);
      }

      if (this.O000000000OOOO >= 0) {
         GL20.glUniform4fv(this.O000000000OOOO, this.O0000000000O0O);
      }

      if (this.O00000000O >= 0) {
         GL20.glUniform4fv(this.O00000000O, this.O0000000000OO);
      }

      if (this.O00000000O0 >= 0) {
         GL20.glUniform2fv(this.O00000000O0, this.O0000000000OO0);
      }
   }

   private void O00000000(float f, float g, float h, int i, int j, float k, long l) {
      this.O00000000(f, g, h, i, j, i, j, k, l);
   }

   private void O00000000(float f, float g, float h, int i, int j, int k, int l, float m, long n) {
      long var11 = System.nanoTime();
      BlurRenderer.W393 var13 = null;
      BlurRenderer.W393 var14 = this.O000000000000[0];

      for (BlurRenderer.W393 var18 : this.O000000000000) {
         if (!var18.O00000000) {
            var13 = var18;
            break;
         }

         if (var18.O000000000 < var14.O000000000) {
            var14 = var18;
         }
      }

      if (var13 == null) {
         var13 = var14;
      }

      var13.O00000000 = true;
      var13.O0000000000 = f;
      var13.O00000000000 = g;
      var13.O000000000000 = h;
      var13.O0000000000000 = m;
      var13.O000000000000O = i;
      var13.O00000000000O = j;
      var13.O00000000000O0 = k;
      var13.O00000000000OO = l;
      var13.O0000000000O = Math.max(1L, n);
      var13.O000000000 = var11;
   }

   private void O000000000(long l) {
      for (BlurRenderer.W393 var6 : this.O000000000000) {
         if (var6.O00000000 && l - var6.O000000000 >= var6.O0000000000O) {
            var6.O00000000 = false;
         }
      }
   }

   private boolean O00000000000O() {
      for (BlurRenderer.W393 var4 : this.O000000000000) {
         if (var4.O00000000) {
            return true;
         }
      }

      return false;
   }

   private void O00000000000O0() {
      for (BlurRenderer.W393 var4 : this.O000000000000) {
         var4.O00000000 = false;
         var4.O000000000 = 0L;
         var4.O0000000000 = 0.0F;
         var4.O00000000000 = 0.0F;
         var4.O000000000000 = 0.0F;
         var4.O0000000000000 = 0.0F;
         var4.O000000000000O = -1;
         var4.O00000000000O = -2232577;
         var4.O00000000000O0 = -1;
         var4.O00000000000OO = -2232577;
         var4.O0000000000O = 760000000L;
      }
   }

   private float O00000000(int i) {
      return switch (i) {
         case 0 -> 0.9F;
         case 1 -> 0.84F;
         case 2 -> 0.96F;
         default -> 0.86F;
      };
   }

   private static float O00000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   private static void O00000000(int i, float[] fs, int j) {
      fs[j] = (i >>> 16 & 0xFF) / 255.0F;
      fs[j + 1] = (i >>> 8 & 0xFF) / 255.0F;
      fs[j + 2] = (i & 0xFF) / 255.0F;
   }

   record W392(O0000O00O0OOO0.W373 snapshot, int width, int height) {
   }

   static final class W393 {
      boolean O00000000;
      long O000000000;
      float O0000000000;
      float O00000000000;
      float O000000000000;
      float O0000000000000;
      int O000000000000O = -1;
      int O00000000000O = -2232577;
      int O00000000000O0 = -1;
      int O00000000000OO = -2232577;
      long O0000000000O = 760000000L;
   }
}
