package ru.metaculture.protection;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.Window;
import net.minecraft.text.Text;
import org.lwjgl.opengl.GL11;

public final class ProxyScreen extends Screen implements O00000OO0OOOO {
   private static final O0000O000OO O00000000 = O0000O000OO.O00000000();
   private static final int O000000000 = 14;
   private final Screen O0000000000;
   private final O00000OO0OOOOO O00000000000 = new O00000OO0OOOOO();
   private final ProxyScreen.W365 O000000000000 = new ProxyScreen.W365("Host", false, 255, ProxyScreen.W366.HOST);
   private final ProxyScreen.W365 O0000000000000 = new ProxyScreen.W365("Port", false, 5, ProxyScreen.W366.PORT);
   private final ProxyScreen.W365 O000000000000O = new ProxyScreen.W365("Username", false, 128, ProxyScreen.W366.TEXT);
   private final ProxyScreen.W365 O00000000000O = new ProxyScreen.W365("Password", true, 256, ProxyScreen.W366.SECRET);
   private final List<ProxyScreen.W365> O00000000000O0 = List.of(this.O000000000000, this.O0000000000000, this.O000000000000O, this.O00000000000O);
   private final List<ProxyScreen.W364> O00000000000OO = List.of(
      new ProxyScreen.W364("Socks5", ProxyScreen.W363.TYPE),
      new ProxyScreen.W364("Enabled", ProxyScreen.W363.ENABLED),
      new ProxyScreen.W364("Paste", ProxyScreen.W363.PASTE),
      new ProxyScreen.W364("Test", ProxyScreen.W363.TEST),
      new ProxyScreen.W364("Save", ProxyScreen.W363.SAVE),
      new ProxyScreen.W364("Back", ProxyScreen.W363.BACK)
   );
   private final ProxyScreen.W368[] O0000000000O = new ProxyScreen.W368[14];
   private final O00000OOO00 O0000000000O0 = new O00000OOO00(O0000O000O0O00.O000000000000());
   private final O00000OOO00 O0000000000O00 = new O00000OOO00(O0000O000O0O00.O000000000000());
   private long O0000000000O0O;
   private long O0000000000OO;
   private long O0000000000OO0;
   private float O0000000000OOO;
   private float O000000000O;
   private float O000000000O0;
   private float O000000000O00;
   private float O000000000O000;
   private float O000000000O00O;
   private float O000000000O0O;
   private float O000000000O0O0;
   private float O000000000O0OO;
   private float O000000000OO;
   private float O000000000OO0;
   private boolean O000000000OO00;
   private boolean O000000000OO0O;
   private boolean O000000000OOO;
   private int O000000000OOO0;
   private int O000000000OOOO;
   private int O00000000O = -6357021;
   private int O00000000O0 = -11341636;
   private Theme O00000000O00 = Theme.AURORA;
   private boolean O00000000O000;
   private boolean O00000000O0000;
   private boolean O00000000O000O;
   private String O00000000O00O = "Socks5";
   private String O00000000O00O0 = "Proxy disabled";
   private int O00000000O00OO;

   public ProxyScreen(Screen screen) {
      super(Text.literal("Proxy"));
      this.O0000000000 = screen;

      for (int var2 = 0; var2 < this.O0000000000O.length; var2++) {
         this.O0000000000O[var2] = new ProxyScreen.W368();
      }
   }

   protected void init() {
      super.init();
      this.O0000000000O0O = System.nanoTime();
      this.O0000000000OO = this.O0000000000O0O;
      this.O0000000000OO0 = this.O0000000000O0O;
      this.O000000000OO00 = false;
      this.O000000000OO0O = false;
      this.O000000000OOO = false;
      this.O000000000OOO0 = 0;
      this.O000000000OOOO = 0;
      this.O0000000000O0.O00000000(0.0F);
      this.O0000000000O00.O00000000(0.0F);
      if (!this.O00000000O0000) {
         O0000O00O00OOO.W360 var1 = O0000O00O00OOO.O0000000000();
         this.O00000000O000O = var1.enabled();
         this.O00000000O00O = O0000O00O00OOO.O000000000(var1.type());
         this.O000000000000.O000000000O0O = var1.host();
         this.O0000000000000.O000000000O0O = var1.port();
         this.O000000000000O.O000000000O0O = var1.username();
         this.O00000000000O.O000000000O0O = var1.password();

         for (ProxyScreen.W365 var3 : this.O00000000000O0) {
            var3.O000000000O0O0 = var3.O000000000O0O.length();
         }

         this.O00000000O00O0 = this.O00000000O000O ? "Proxy enabled" : "Proxy disabled";
         this.O00000000O0000 = true;
      }

      for (ProxyScreen.W365 var6 : this.O00000000000O0) {
         var6.O000000000000();
      }

      for (ProxyScreen.W364 var7 : this.O00000000000OO) {
         var7.O00000000();
      }
   }

   public void render(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
      this.O00000000(mouseX, mouseY, deltaTicks, false);
   }

   @Override
   public void O00000000(int i, int j, float f) {
      this.O00000000(i, j, f, true);
   }

   private void O00000000(int i, int j, float f, boolean bl) {
      Window var5 = this.client == null ? null : this.client.getWindow();
      if (var5 != null && !var5.hasZeroWidthOrHeight() && var5.getFramebufferWidth() > 0 && var5.getFramebufferHeight() > 0) {
         int var6 = var5.getFramebufferWidth();
         int var7 = var5.getFramebufferHeight();
         long var8 = System.nanoTime();
         float var10 = Math.max(0.001F, Math.min(0.05F, (float)(var8 - this.O0000000000OO) / 1.0E9F));
         this.O0000000000OO = var8;
         this.O0000000000OOO = (float)(var8 - this.O0000000000O0O) / 1.0E9F;
         if (this.O00000000(var5, var6, var7, i, j, var8)) {
            var10 = 0.001F;
         }

         this.O000000000000();
         this.O00000000(var5, i, j, var10, var8);
         this.O000000000(var6, var7, var10);
         this.O0000000000000();
         float var11 = (this.O000000000O / Math.max(1.0F, (float)var6) - 0.5F) * 2.0F;
         float var12 = (this.O000000000O0 / Math.max(1.0F, (float)var7) - 0.5F) * 2.0F;
         float var13 = this.O0000000000O0.O00000000(var11, var10);
         float var14 = this.O0000000000O00.O00000000(var12, var10);
         this.O00000000(var6, var7, var13, var14, var10);
         int var15 = GL11.glGetInteger(36006);
         MainMenuScreen.W281 var16 = this.O00000000(var6, var7, var15, var13, var14, var8);
         if (bl) {
            O0000O00O0OOO0.W373 var17 = O0000O00O0OOO0.O00000000();

            try {
               this.O00000000000.O00000000(var16);
            } finally {
               O0000O00O0OOO0.O00000000(var17);
            }

            this.O00000000(var16);
         }
      }
   }

   public void renderBackground(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
   }

   public void renderInGameBackground(DrawContext context) {
   }

   public boolean shouldPause() {
      return false;
   }

   public boolean shouldCloseOnEsc() {
      return false;
   }

   public void close() {
      this.O00000000(ProxyScreen.W363.BACK);
   }

   public void removed() {
      this.O00000000O00OO++;
      this.O00000000000.close();
      super.removed();
   }

   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      if (button == 0 && this.client != null && this.client.getWindow() != null) {
         float var6 = this.O00000000(this.client.getWindow(), mouseX);
         float var7 = this.O000000000(this.client.getWindow(), mouseY);

         for (ProxyScreen.W365 var9 : this.O00000000000O0) {
            if (var9.O00000000(var6, var7)) {
               this.O00000000(var9);
               var9.O0000000000O0 = 1.0F;
               return true;
            }
         }

         this.O0000000000();

         for (ProxyScreen.W364 var11 : this.O00000000000OO) {
            if (var11.O00000000(var6, var7)) {
               var11.O0000000000O0 = 1.0F;
               var11.O0000000000O00 = 1.0F;
               this.O00000000(var11.O000000000O00);
               return true;
            }
         }

         return true;
      } else {
         return super.mouseClicked(mouseX, mouseY, button);
      }
   }

   public boolean charTyped(char chr, int modifiers) {
      ProxyScreen.W365 var3 = this.O00000000000();
      if (var3 == null) {
         return super.charTyped(chr, modifiers);
      } else {
         if (chr >= ' ' && chr != 127) {
            var3.O000000000(String.valueOf(chr));
         }

         return true;
      }
   }

   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      boolean var4 = (modifiers & 2) != 0 || (modifiers & 8) != 0;
      ProxyScreen.W365 var5 = this.O00000000000();
      if (keyCode == 256) {
         if (var5 != null) {
            this.O0000000000();
            return true;
         } else {
            this.O00000000(ProxyScreen.W363.BACK);
            return true;
         }
      } else if (keyCode == 258) {
         this.O00000000((modifiers & 1) != 0 ? -1 : 1);
         return true;
      } else if (var5 != null) {
         if (var4) {
            if (keyCode == 65) {
               var5.O000000000OO = true;
               return true;
            }

            if (keyCode == 67) {
               if (this.client != null && this.client.keyboard != null && var5.O000000000OO) {
                  this.client.keyboard.setClipboard(var5.O000000000O0O);
               }

               return true;
            }

            if (keyCode == 86) {
               if (this.client != null && this.client.keyboard != null) {
                  var5.O000000000(this.client.keyboard.getClipboard());
               }

               return true;
            }
         }

         if (keyCode == 259) {
            var5.O000000000();
            return true;
         } else if (keyCode == 261) {
            var5.O0000000000();
            return true;
         } else if (keyCode == 263) {
            var5.O000000000OO = false;
            var5.O000000000O0O0 = O00000000(var5.O000000000O0O0 - 1, 0, var5.O000000000O0O.length());
            return true;
         } else if (keyCode == 262) {
            var5.O000000000OO = false;
            var5.O000000000O0O0 = O00000000(var5.O000000000O0O0 + 1, 0, var5.O000000000O0O.length());
            return true;
         } else if (keyCode == 268) {
            var5.O000000000OO = false;
            var5.O000000000O0O0 = 0;
            return true;
         } else if (keyCode == 269) {
            var5.O000000000OO = false;
            var5.O000000000O0O0 = var5.O000000000O0O.length();
            return true;
         } else if (keyCode != 257 && keyCode != 335) {
            return true;
         } else {
            this.O00000000(ProxyScreen.W363.SAVE);
            return true;
         }
      } else if (var4 && keyCode == 86) {
         this.O00000000(ProxyScreen.W363.PASTE);
         return true;
      } else if (keyCode != 257 && keyCode != 335) {
         return super.keyPressed(keyCode, scanCode, modifiers);
      } else {
         this.O00000000(ProxyScreen.W363.SAVE);
         return true;
      }
   }

   private void O00000000(ProxyScreen.W363 o00000000) {
      MinecraftClient var2 = this.client == null ? MinecraftClient.getInstance() : this.client;
      if (var2 != null) {
         switch (o00000000) {
            case TYPE:
               this.O00000000O00O = "Socks5".equals(this.O00000000O00O) ? "Socks4" : "Socks5";
               this.O00000000O00O0 = this.O00000000O00O + " selected";
               break;
            case ENABLED:
               this.O00000000O000O = !this.O00000000O000O;
               if (this.O00000000O000O) {
                  this.O00000000O00O0 = "Proxy enabled";
               } else {
                  O0000O00O00OOO.O00000000(this.O000000000(false));
                  this.O00000000O00O0 = "Proxy disabled";
               }
               break;
            case PASTE:
               this.O00000000(var2);
               break;
            case TEST:
               this.O000000000(var2);
               break;
            case SAVE:
               this.O00000000(false);
               break;
            case BACK:
               var2.execute(() -> var2.setScreen(this.O0000000000));
         }
      }
   }

   private void O00000000(MinecraftClient minecraftClient) {
      String var2 = "";

      try {
         var2 = minecraftClient.keyboard == null ? "" : minecraftClient.keyboard.getClipboard();
      } catch (Throwable var4) {
      }

      O0000O00O00OOO.W361 var3 = O0000O00O00OOO.O00000000(var2);
      if (!var3.host().isBlank() && !var3.port().isBlank()) {
         this.O00000000O00O = O0000O00O00OOO.O000000000(var3.type());
         this.O000000000000.O00000000(var3.host());
         this.O0000000000000.O00000000(var3.port());
         this.O000000000000O.O00000000(var3.username());
         this.O00000000000O.O00000000(var3.password());
         this.O00000000O000O = true;
         this.O0000000000();
         this.O00000000O00O0 = "Proxy imported";
      } else {
         this.O00000000O00O0 = "Clipboard has no proxy";
      }
   }

   private void O000000000(MinecraftClient minecraftClient) {
      this.O000000000();
      O0000O00O00OOO.W360 var2 = this.O000000000(true);
      String var3 = O0000O00O00OOO.O00000000(var2, true);
      if (var3 != null) {
         this.O00000000O00O0 = var3;
      } else {
         int var4 = ++this.O00000000O00OO;
         this.O00000000O00O0 = "Checking proxy...";
         O0000O00O00OOO.O00000000(var2, "mc.funtime.su", 25565, 8000).whenComplete((o0000000000, throwable) -> minecraftClient.execute(() -> {
            if (var4 == this.O00000000O00OO) {
               if (throwable != null) {
                  this.O00000000O00O0 = "Proxy failed: " + throwable.getClass().getSimpleName();
               } else {
                  if (o0000000000.success()) {
                     this.O00000000O000O = true;
                     O0000O00O00OOO.O00000000(var2);
                     this.O00000000O00O0 = "Proxy OK and enabled: " + o0000000000.millis() + " ms";
                  } else {
                     this.O00000000O00O0 = "Proxy failed: " + o0000000000.message();
                  }
               }
            }
         }));
      }
   }

   private void O00000000(boolean bl) {
      this.O000000000();
      O0000O00O00OOO.W360 var2 = this.O000000000(true);
      String var3 = O0000O00O00OOO.O00000000(var2, true);
      if (var3 != null) {
         this.O00000000O00O0 = var3;
      } else {
         this.O00000000O000O = true;
         O0000O00O00OOO.O00000000(var2);
         this.O00000000O00O0 = "Proxy saved and enabled";
         if (bl && this.client != null) {
            this.client.setScreen(this.O0000000000);
         }
      }
   }

   private void O000000000() {
      String var1 = this.O000000000000.O000000000O0O;
      O0000O00O00OOO.W361 var2 = O0000O00O00OOO.O00000000(var1);
      if (!var2.host().isBlank()) {
         this.O000000000000.O00000000(var2.host());
         if (!var2.port().isBlank()) {
            this.O0000000000000.O00000000(var2.port());
         }

         if (!var2.username().isBlank()) {
            this.O000000000000O.O00000000(var2.username());
         }

         if (!var2.password().isBlank()) {
            this.O00000000000O.O00000000(var2.password());
         }

         this.O00000000O00O = O0000O00O00OOO.O000000000(var2.type());
      } else {
         O0000O00O00OOO.W361 var3 = O0000O00O00OOO.O00000000(this.O000000000000.O000000000O0O + ":" + this.O0000000000000.O000000000O0O);
         if (!var3.host().isBlank()) {
            this.O000000000000.O00000000(var3.host());
         }
      }
   }

   private O0000O00O00OOO.W360 O000000000(boolean bl) {
      return new O0000O00O00OOO.W360(
         bl,
         this.O00000000O00O,
         this.O000000000000.O000000000O0O,
         this.O0000000000000.O000000000O0O,
         this.O000000000000O.O000000000O0O,
         this.O00000000000O.O000000000O0O
      );
   }

   private void O00000000(ProxyScreen.W365 o0000000000) {
      for (ProxyScreen.W365 var3 : this.O00000000000O0) {
         var3.O000000000O0OO = var3 == o0000000000;
         var3.O000000000OO = false;
         if (var3.O000000000O0OO) {
            var3.O000000000O0O0 = var3.O000000000O0O.length();
         }
      }
   }

   private void O00000000(int i) {
      ProxyScreen.W365 var2 = this.O00000000000();
      int var3 = var2 == null ? (i > 0 ? -1 : this.O00000000000O0.size()) : this.O00000000000O0.indexOf(var2);
      int var4 = Math.floorMod(var3 + i, this.O00000000000O0.size());
      this.O00000000(this.O00000000000O0.get(var4));
   }

   private void O0000000000() {
      for (ProxyScreen.W365 var2 : this.O00000000000O0) {
         var2.O000000000O0OO = false;
         var2.O000000000OO = false;
      }
   }

   private ProxyScreen.W365 O00000000000() {
      for (ProxyScreen.W365 var2 : this.O00000000000O0) {
         if (var2.O000000000O0OO) {
            return var2;
         }
      }

      return null;
   }

   private void O000000000000() {
      Theme var1 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.AURORA;
      this.O00000000O00 = var1;
      O0000O000OO.W351 var2 = O00000000.O000000000(var1);
      if (var2 != null) {
         this.O00000000O = var2.O0000000000();
         this.O00000000O0 = var2.O00000000000();
         this.O00000000O000 = var2.O000000000000();
      } else {
         this.O00000000O000 = false;
         Color var3 = var1.O00000000();
         this.O00000000O = 0xFF000000 | var3.getRGB() & 16777215;
         float[] var4 = Color.RGBtoHSB(var3.getRed(), var3.getGreen(), var3.getBlue(), null);
         this.O00000000O0 = 0xFF000000 | Color.HSBtoRGB((var4[0] + 0.075F) % 1.0F, Math.min(1.0F, var4[1] * 1.08F), Math.min(1.0F, var4[2] * 1.18F)) & 16777215;
      }
   }

   private boolean O00000000(Window window, int i, int j, int k, int l, long m) {
      if (this.O000000000OOO0 == i && this.O000000000OOOO == j) {
         return false;
      } else {
         this.O000000000OOO0 = i;
         this.O000000000OOOO = j;
         float var8 = O000000000(this.O00000000(window, (double)k), 0.0F, (float)i);
         float var9 = O000000000(this.O000000000(window, l), 0.0F, (float)j);
         this.O000000000O = this.O000000000O00O = this.O000000000OO = var8;
         this.O000000000O0 = this.O000000000O0O = this.O000000000OO0 = var9;
         this.O000000000O00 = this.O000000000O000 = 0.0F;
         this.O000000000O0O0 = this.O000000000O0OO = 0.0F;
         this.O000000000OO00 = true;
         this.O000000000OO0O = true;
         this.O000000000OOO = true;
         this.O0000000000OO0 = m;
         this.O0000000000O0.O00000000(0.0F);
         this.O0000000000O00.O00000000(0.0F);
         this.O000000000000O();
         this.O00000000(var8, var9, 0.12F);
         return true;
      }
   }

   private void O00000000(Window window, int i, int j, float f, long l) {
      float var7 = this.O00000000(window, (double)i);
      float var8 = this.O000000000(window, j);
      if (!this.O000000000OO00) {
         this.O000000000O = var7;
         this.O000000000O0 = var8;
         this.O000000000O00 = 0.0F;
         this.O000000000O000 = 0.0F;
         this.O000000000OO00 = true;
      } else {
         float var9 = var7 - this.O000000000O;
         float var10 = var8 - this.O000000000O0;
         float var11 = O000000000(var9, var10);
         if (var11 > 0.2F) {
            this.O000000000O00 = O000000000(var9 / Math.max(1.0F, (float)window.getFramebufferWidth()) / f, -3.0F, 3.0F);
            this.O000000000O000 = O000000000(var10 / Math.max(1.0F, (float)window.getFramebufferHeight()) / f, -3.0F, 3.0F);
         } else {
            float var12 = (float)Math.pow(8.0E-4F, f);
            this.O000000000O00 *= var12;
            this.O000000000O000 *= var12;
         }

         this.O000000000O = var7;
         this.O000000000O0 = var8;
         if (var11 > 1.5F) {
            this.O0000000000OO0 = l;
         }
      }
   }

   private void O000000000(int i, int j, float f) {
      if (!this.O000000000OO0O) {
         this.O000000000O00O = this.O000000000O;
         this.O000000000O0O = this.O000000000O0;
         this.O000000000O0O0 = 0.0F;
         this.O000000000O0OO = 0.0F;
         this.O000000000OO0O = true;
      } else {
         float var4 = this.O000000000O00O;
         float var5 = this.O000000000O0O;
         float var6 = O000000000(this.O000000000O - this.O000000000O00O, this.O000000000O0 - this.O000000000O0O);
         float var7 = (1.0F - (float)Math.pow(3.5E-5F, f)) * (0.72F + O000000000(var6 / 520.0F, 0.0F, 0.42F));
         this.O000000000O00O = this.O000000000O00O + (this.O000000000O - this.O000000000O00O) * O000000000(var7, 0.05F, 0.26F);
         this.O000000000O0O = this.O000000000O0O + (this.O000000000O0 - this.O000000000O0O) * O000000000(var7, 0.05F, 0.26F);
         float var8 = O000000000((this.O000000000O00O - var4) / Math.max(1.0F, (float)i) / f, -1.8F, 1.8F);
         float var9 = O000000000((this.O000000000O0O - var5) / Math.max(1.0F, (float)j) / f, -1.8F, 1.8F);
         float var10 = 1.0F - (float)Math.pow(0.0025F, f);
         this.O000000000O0O0 = this.O000000000O0O0 + (var8 - this.O000000000O0O0) * var10;
         this.O000000000O0OO = this.O000000000O0OO + (var9 - this.O000000000O0OO) * var10;
      }
   }

   private void O0000000000000() {
      if (O000000O000O0O.O0000000000() && MenuModule.O00000000(MenuModule.O00000000O0O0)) {
         if (!this.O000000000OOO) {
            this.O000000000OO = this.O000000000O00O;
            this.O000000000OO0 = this.O000000000O0O;
            this.O000000000OOO = true;
            this.O00000000(this.O000000000O00O, this.O000000000O0O, 0.3F);
         } else {
            float var1 = O000000000(this.O000000000O00O - this.O000000000OO, this.O000000000O0O - this.O000000000OO0);
            if (var1 > 5.5F) {
               this.O00000000(this.O000000000O00O, this.O000000000O0O, O000000000(var1 / 190.0F, 0.1F, 0.48F));
               this.O000000000OO = this.O000000000O00O;
               this.O000000000OO0 = this.O000000000O0O;
            }
         }
      }
   }

   private void O000000000000O() {
      for (ProxyScreen.W368 var4 : this.O0000000000O) {
         var4.O00000000 = 0.0F;
         var4.O000000000 = 0.0F;
         var4.O0000000000 = -100.0F;
         var4.O00000000000 = 0.0F;
      }
   }

   private void O00000000(float f, float g, float h) {
      int var4 = 0;
      float var5 = -1.0F;

      for (int var6 = 0; var6 < this.O0000000000O.length; var6++) {
         float var7 = this.O0000000000OOO - this.O0000000000O[var6].O0000000000;
         if (this.O0000000000O[var6].O00000000000 <= 0.0F) {
            var4 = var6;
            break;
         }

         if (var7 > var5) {
            var5 = var7;
            var4 = var6;
         }
      }

      this.O0000000000O[var4].O00000000 = f;
      this.O0000000000O[var4].O000000000 = g;
      this.O0000000000O[var4].O0000000000 = this.O0000000000OOO;
      this.O0000000000O[var4].O00000000000 = h;
   }

   private void O00000000(int i, int j, float f, float g, float h) {
      float var6 = O00000000(i, j);
      boolean var7 = i < 980.0F * var6;
      float var8 = 46.0F * var6;
      float var9 = 18.0F * var6;
      float var10 = 16.0F * var6;
      float var11 = var7 ? O000000000(i * 0.68F, 300.0F * var6, 520.0F * var6) : O000000000(i * 0.2F, 280.0F * var6, 410.0F * var6);
      float var12 = var7 ? var11 : var11 * 2.0F + var10;
      float var13 = 42.0F * var6;
      float var14 = 10.0F * var6;
      float var15 = var7 ? (var12 - var14) * 0.5F : O000000000(i * 0.072F, 96.0F * var6, 128.0F * var6);
      int var16 = var7 ? 2 : 6;
      int var17 = var7 ? 3 : 1;
      float var18 = var16 * var15 + (var16 - 1) * var14;
      float var19 = var7 ? this.O00000000000O0.size() * var8 + (this.O00000000000O0.size() - 1) * var9 : var8 * 2.0F + var9;
      float var20 = var17 * var13 + (var17 - 1) * var14;
      float var21 = var19 + 34.0F * var6 + var20;
      float var22 = i * 0.5F + f * 1.35F * var6;
      float var23 = j * 0.305F + g * 0.92F * var6;
      if (var23 + var21 > j - 58.0F * var6) {
         var23 = j - var21 - 58.0F * var6;
      }

      var23 = Math.max(j * 0.21F, var23);
      float var24 = var22 - var12 * 0.5F;

      for (int var25 = 0; var25 < this.O00000000000O0.size(); var25++) {
         ProxyScreen.W365 var26 = this.O00000000000O0.get(var25);
         int var27 = var7 ? 0 : var25 % 2;
         int var28 = var7 ? var25 : var25 / 2;
         float var29 = var24 + var27 * (var11 + var10);
         float var30 = var23 + var28 * (var8 + var9);
         this.O00000000(var26, var29, var30, var11, var8, var8 * 0.5F, h, var6);
      }

      float var32 = var22 - var18 * 0.5F;
      float var33 = var23 + var19 + 34.0F * var6;

      for (int var34 = 0; var34 < this.O00000000000OO.size(); var34++) {
         ProxyScreen.W364 var35 = this.O00000000000OO.get(var34);
         int var36 = var34 % var16;
         int var37 = var34 / var16;
         var35.O00000000 = this.O000000000(var35.O000000000O00);
         var35.O0000000000 = var32 + var36 * (var15 + var14);
         var35.O00000000000 = var33 + var37 * (var13 + var14);
         var35.O000000000000O = var15;
         var35.O00000000000O = var13;
         var35.O00000000000O0 = var13 * 0.5F;
         var35.O000000000O = 46.0F * var6;
         var35.O000000000O0 = O0000000000(O000000000((this.O0000000000OOO - 0.32F - var34 * 0.035F) / 0.76F, 0.0F, 1.0F));
         this.O00000000(var35, h, var6);
      }
   }

   private void O00000000(ProxyScreen.W365 o0000000000, float f, float g, float h, float i, float j, float k, float l) {
      o0000000000.O0000000000 = f;
      o0000000000.O00000000000 = g;
      o0000000000.O000000000000O = h;
      o0000000000.O00000000000O = i;
      o0000000000.O00000000000O0 = j;
      o0000000000.O000000000O = 50.0F * l;
      o0000000000.O000000000O0 = O0000000000(O000000000((this.O0000000000OOO - 0.22F - this.O00000000000O0.indexOf(o0000000000) * 0.04F) / 0.82F, 0.0F, 1.0F));
      this.O00000000(o0000000000, k, l);
      o0000000000.O000000000OO0 = o0000000000.O000000000OO0
         + ((o0000000000.O000000000O0OO ? 1.0F : 0.0F) - o0000000000.O000000000OO0) * (1.0F - (float)Math.pow(1.0E-4F, k));
   }

   private void O00000000(ProxyScreen.W367 o000000000000, float f, float g) {
      float var4 = O00000000(
         this.O000000000O,
         this.O000000000O0,
         o000000000000.O0000000000,
         o000000000000.O00000000000,
         o000000000000.O000000000000O,
         o000000000000.O00000000000O,
         o000000000000.O00000000000O0
      );
      boolean var5 = var4 <= 0.0F;
      float var6 = 1.0F - O0000000000(O000000000(Math.max(0.0F, var4) / Math.max(1.0F, 28.0F * g), 0.0F, 1.0F));
      float var7 = o000000000000 instanceof ProxyScreen.W365 var8 && var8.O000000000O0OO ? 0.52F : 0.0F;
      float var13 = Math.max(var5 ? Math.max(0.74F, var6) : var6 * 0.48F, var7);
      o000000000000.O00000000000OO = o000000000000.O00000000000OO
         + ((var5 ? 1.0F : 0.0F) - o000000000000.O00000000000OO) * (1.0F - (float)Math.pow(1.0E-4F, f));
      o000000000000.O0000000000O = o000000000000.O0000000000O + (var13 - o000000000000.O0000000000O) * (1.0F - (float)Math.pow(1.4E-4F, f));
      o000000000000.O0000000000O0 = o000000000000.O0000000000O0 + (0.0F - o000000000000.O0000000000O0) * (1.0F - (float)Math.pow(1.8E-5F, f));
      o000000000000.O0000000000O00 = o000000000000.O0000000000O00 + (0.0F - o000000000000.O0000000000O00) * (1.0F - (float)Math.pow(6.0E-6F, f));
      float var9 = O000000000((this.O000000000O00O - o000000000000.O0000000000) / Math.max(1.0F, o000000000000.O000000000000O), 0.0F, 1.0F);
      float var10 = O000000000((this.O000000000O0O - o000000000000.O00000000000) / Math.max(1.0F, o000000000000.O00000000000O), 0.0F, 1.0F);
      float var11 = 1.0F - (float)Math.pow(2.2E-4F, f);
      o000000000000.O0000000000OO = o000000000000.O0000000000OO + (var9 - o000000000000.O0000000000OO) * var11;
      o000000000000.O0000000000OO0 = o000000000000.O0000000000OO0 + (var10 - o000000000000.O0000000000OO0) * var11;
      float var12 = 1.0F + o000000000000.O0000000000O * 0.04F - o000000000000.O0000000000O0 * 0.065F + var7 * 0.018F;
      o000000000000.O0000000000O0O = o000000000000.O000000000.O00000000(var12, f);
      o000000000000.O000000000000 = o000000000000.O0000000000 + (o000000000000.O0000000000OO - 0.5F) * 5.0F * g * o000000000000.O0000000000O;
      o000000000000.O0000000000000 = o000000000000.O00000000000
         + (o000000000000.O0000000000OO0 - 0.5F) * 3.5F * g * o000000000000.O0000000000O
         - o000000000000.O00000000000OO * 1.2F * g;
      o000000000000.O0000000000OOO = O000000000(
         O000000000(this.O000000000O0O0, this.O000000000O0OO) * 0.42F * o000000000000.O0000000000O + Math.abs(o000000000000.O000000000.O000000000()) * 0.04F,
         0.0F,
         1.0F
      );
   }

   private MainMenuScreen.W281 O00000000(int i, int j, int k, float f, float g, long l) {
      float var8 = Math.max(0.0F, (float)(l - this.O0000000000OO0) / 1.0E9F);
      float var9 = O000000000(O000000000(this.O000000000O0O0, this.O000000000O0OO), 0.0F, 3.0F);
      float var10 = Math.max((float)Math.exp(-var8 * 1.28F), O000000000(var9 * 0.24F, 0.0F, 1.0F));
      float var11 = O0000000000(O000000000(this.O0000000000OOO / 0.88F, 0.0F, 1.0F));
      float var12 = O00000000(i, j);
      float var13 = 0.0F;
      ArrayList var14 = new ArrayList();

      for (ProxyScreen.W365 var16 : this.O00000000000O0) {
         var14.add(this.O00000000(var16, var16.O000000000O0));
         var13 = Math.max(var13, var16.O0000000000O00);
      }

      for (ProxyScreen.W364 var22 : this.O00000000000OO) {
         var14.add(this.O00000000(var22, var22.O000000000O0));
         var13 = Math.max(var13, var22.O0000000000O00);
      }

      MainMenuScreen.W283[] var21 = new MainMenuScreen.W283[14];

      for (int var23 = 0; var23 < 14; var23++) {
         ProxyScreen.W368 var17 = this.O0000000000O[var23];
         float var18 = Math.max(0.0F, this.O0000000000OOO - var17.O0000000000);
         float var19 = var18 > 3.1F ? 0.0F : var17.O00000000000;
         var21[var23] = new MainMenuScreen.W283(var17.O00000000 / Math.max(1.0F, (float)i), var17.O000000000 / Math.max(1.0F, (float)j), var18, var19);
      }

      return new MainMenuScreen.W281(
         i,
         j,
         k,
         this.O0000000000OOO * 0.58F,
         this.O000000000O00O,
         this.O000000000O0O,
         this.O000000000O00O / Math.max(1.0F, (float)i),
         this.O000000000O0O / Math.max(1.0F, (float)j),
         this.O000000000O0O0 * 0.56F,
         this.O000000000O0OO * 0.56F,
         var9 * 0.56F,
         O000000000(this.O00000000O),
         O0000000000(this.O00000000O),
         O00000000000(this.O00000000O),
         O000000000(this.O00000000O0),
         O0000000000(this.O00000000O0),
         O00000000000(this.O00000000O0),
         -f * 8.0E-4F,
         -g * 6.2E-4F,
         f * 0.92F * var12,
         g * 0.78F * var12,
         f * 1.25F * var12,
         g * 1.05F * var12,
         var10 * 0.64F,
         var10 > 0.1F ? 0.86F : 0.74F,
         0.56F + var11 * 0.24F,
         O000000000(var13, 0.0F, 1.0F),
         this.O00000000O00 == Theme.SAKURA_BREEZE,
         this.O00000000O00 == Theme.VERNAL_SOLSTICE,
         this.O00000000O00 == Theme.MIDNIGHT_AZURE,
         this.O00000000O000,
         null,
         null,
         List.of(),
         List.of(),
         List.of(),
         new MainMenuScreen.W271(0.0F, 0.0F, 0.0F, 0.0F, 0.0F),
         var14,
         var21
      );
   }

   private MainMenuScreen.W265 O00000000(ProxyScreen.W367 o000000000000, float f) {
      return new MainMenuScreen.W265(
         o000000000000.O00000000,
         o000000000000.O000000000000,
         o000000000000.O0000000000000,
         o000000000000.O000000000000O,
         o000000000000.O00000000000O,
         o000000000000.O00000000000O0,
         o000000000000.O00000000000OO,
         o000000000000.O0000000000O,
         o000000000000.O0000000000O0,
         f,
         o000000000000.O0000000000O00,
         o000000000000.O000000000O,
         o000000000000.O0000000000O0O,
         o000000000000.O0000000000OO,
         o000000000000.O0000000000OO0,
         o000000000000.O0000000000OOO
      );
   }

   private void O00000000(MainMenuScreen.W281 o000000000O) {
      try {
         WildClient.O000000000000O();
         RenderManager var2 = WildClient.O00000000();
         if (var2 == null) {
            return;
         }

         O0000O00O0OOO0.W373 var3 = O0000O00O0OOO0.O00000000();

         try {
            var2.O00000000(o000000000O.framebufferWidth(), o000000000O.framebufferHeight());
            float var4 = O00000000(o000000000O.framebufferWidth(), o000000000O.framebufferHeight());
            float var5 = O0000000000(O000000000(this.O0000000000OOO / 0.82F, 0.0F, 1.0F));
            float var6 = o000000000O.framebufferWidth() * 0.5F + o000000000O.uiParallaxX() * 0.12F;
            float var7 = o000000000O.framebufferHeight() * 0.126F + o000000000O.uiParallaxY() * 0.08F;
            var2.O00000000(FontRegistry.O00000000000, var6, var7, 40.0F * var4, "Proxy", this.O00000000(0.94F * var5), "c");
            var2.O00000000(
               FontRegistry.O00000000,
               var6,
               var7 + 30.0F * var4,
               24.0F * var4,
               this.O00000000O00O + "  /  " + this.O00000000O00O0,
               this.O000000000(0.52F * var5),
               "c"
            );

            for (ProxyScreen.W365 var9 : this.O00000000000O0) {
               this.O00000000(var2, var9, var4);
            }

            for (ProxyScreen.W364 var16 : this.O00000000000OO) {
               this.O00000000(var2, var16, var4);
            }

            this.O00000000(var2, o000000000O, var4);
            var2.O000000000();
         } finally {
            O0000O00O0OOO0.O00000000(var3);
         }
      } catch (Throwable var14) {
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, MainMenuScreen.W281 o000000000O, float f) {
      String var4 = this.O00000000000O();
      if (!var4.isBlank()) {
         float var5 = 25.0F * f;
         float var6 = o000000000O.framebufferWidth() * 0.5F;
         float var7 = o000000000O.framebufferHeight() - 30.0F * f;
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var6, var7, var5, var4, this.O000000000(0.4F * o000000000O.sceneEntry()), "c");
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, ProxyScreen.W365 o0000000000, float f) {
      float var4 = o0000000000.O000000000O0;
      String var5 = o0000000000.O000000000O00 ? "*".repeat(o0000000000.O000000000O0O.length()) : o0000000000.O000000000O0O;
      boolean var6 = var5.isBlank();
      float var7 = 22.0F * f;
      float var8 = o0000000000.O000000000000 + var7;
      float var9 = Math.max(8.0F * f, o0000000000.O000000000000O - var7 * 2.0F);
      float var10 = 25.0F * f;
      boolean var11 = var6 && !o0000000000.O000000000O0OO;
      String var12 = var11 ? o0000000000.O00000000 : var5;
      int var13 = var11 ? this.O000000000(0.42F * var4) : this.O00000000((0.78F + o0000000000.O000000000OO0 * 0.18F) * var4);
      if (!var6 || o0000000000.O000000000O0OO) {
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000,
            o0000000000.O000000000000 + 18.0F * f,
            o0000000000.O0000000000000 - 7.0F * f,
            20.0F * f,
            o0000000000.O00000000,
            this.O000000000((0.3F + o0000000000.O000000000OO0 * 0.28F) * var4)
         );
      }

      o0000O00OO0O0.O00000000(
         var8,
         o0000000000.O0000000000000 + 3.0F * f,
         var9,
         o0000000000.O00000000000O - 6.0F * f,
         o0000000000.O00000000000O0 * 0.55F,
         o0000000000.O00000000000O0 * 0.55F,
         o0000000000.O00000000000O0 * 0.55F,
         o0000000000.O00000000000O0 * 0.55F
      );
      if (!var12.isBlank()) {
         if (var11) {
            O00000000(
               o0000O00OO0O0,
               FontRegistry.O00000000,
               o0000000000.O000000000000,
               o0000000000.O0000000000000,
               o0000000000.O000000000000O,
               o0000000000.O00000000000O,
               var10,
               var12,
               var13
            );
         } else {
            float var14 = O00000000(FontRegistry.O00000000, var10, o0000000000.O0000000000000, o0000000000.O00000000000O);
            if (o0000000000.O000000000OO) {
               float var15 = RenderManager.O00000000(FontRegistry.O00000000, var12, var10).O00000000;
               o0000O00OO0O0.O00000000(
                  O00000000000(var8 - o0000000000.O000000000OO0O - 2.0F * f),
                  o0000000000.O0000000000000 + o0000000000.O00000000000O * 0.25F,
                  var15 + 4.0F * f,
                  o0000000000.O00000000000O * 0.5F,
                  2.0F * f,
                  O00000000(0.25F, 0.55F, 0.95F, 0.45F * var4)
               );
            }

            o0000O00OO0O0.O00000000(FontRegistry.O00000000, O00000000000(var8 - o0000000000.O000000000OO0O), O00000000000(var14), var10, var12, var13);
         }
      }

      if (o0000000000.O000000000O0OO) {
         int var24 = O00000000(o0000000000.O000000000O0O0, 0, var5.length());
         String var25 = var5.substring(0, var24);
         float var16 = RenderManager.O00000000(FontRegistry.O00000000, var25, var10).O00000000;
         if (o0000000000.O000000000OO) {
            var16 = RenderManager.O00000000(FontRegistry.O00000000, var5, var10).O00000000;
         }

         float var17 = o0000000000.O000000000OO0O;
         float var18 = var9 - 9.0F * f;
         if (var16 - var17 > var18) {
            var17 = var16 - var18;
         }

         if (var16 - var17 < 0.0F) {
            var17 = var16;
         }

         var17 = Math.max(0.0F, var17);
         o0000000000.O000000000OO0O = o0000000000.O000000000OO0O + (var17 - o0000000000.O000000000OO0O) * 0.3F;
         o0000000000.O000000000OO00 = o0000000000.O000000000OO00 + (var16 - o0000000000.O000000000OO00) * 0.3F;
         float var19 = 0.54F + 0.46F * (float)Math.sin(this.O0000000000OOO * 5.4F);
         if (!o0000000000.O000000000OO) {
            int var20 = O00000000(this.O00000000O0, this.O00000000O, var19, (0.42F + var19 * 0.36F) * var4);
            float var21 = var8 + o0000000000.O000000000OO00 - o0000000000.O000000000OO0O + 2.0F * f;
            float var22 = 20.0F * f;
            float var23 = o0000000000.O0000000000000 + (o0000000000.O00000000000O - var22) * 0.5F;
            o0000O00OO0O0.O00000000(O00000000000(var21), O00000000000(var23), Math.max(1.25F * f, 1.0F), var22, 1.0F * f, var20);
         }

         o0000O00OO0O0.O00000000(
            o0000000000.O000000000000,
            o0000000000.O0000000000000,
            o0000000000.O000000000000O,
            o0000000000.O00000000000O,
            o0000000000.O00000000000O0,
            O00000000(this.O00000000O0, this.O00000000O, var19, 0.24F * var4 * (0.35F + o0000000000.O000000000OO0 * 0.65F)),
            1.0F * f
         );
      }

      o0000O00OO0O0.O0000000000000();
   }

   private void O00000000(RenderManager o0000O00OO0O0, ProxyScreen.W364 o000000000, float f) {
      float var4 = o000000000.O000000000O0 * 0.9F;
      String var5 = O00000000(o000000000.O00000000, o000000000.O000000000000O - 18.0F * f, 24.0F * f, FontRegistry.O00000000);
      O00000000(
         o0000O00OO0O0,
         FontRegistry.O00000000,
         o000000000.O000000000000,
         o000000000.O0000000000000,
         o000000000.O000000000000O,
         o000000000.O00000000000O,
         24.0F * f,
         var5,
         this.O00000000(var4)
      );
   }

   private String O000000000(ProxyScreen.W363 o00000000) {
      return switch (o00000000) {
         case TYPE -> this.O00000000O00O;
         case ENABLED -> this.O00000000O000O ? "Enabled" : "Disabled";
         case PASTE -> "Paste";
         case TEST -> "Test";
         case SAVE -> "Save";
         case BACK -> "Back";
      };
   }

   private String O00000000000O() {
      String var1 = this.O000000000000.O000000000O0O.trim();
      String var2 = this.O0000000000000.O000000000O0O.trim();
      if (var1.isBlank() || var2.isBlank()) {
         return "";
      } else {
         return "Socks5".equals(this.O00000000O00O) && !this.O000000000000O.O000000000O0O.isBlank()
            ? this.O000000000000O.O000000000O0O + ":" + "*".repeat(Math.min(10, this.O00000000000O.O000000000O0O.length())) + "@" + var1 + ":" + var2
            : var1 + ":" + var2;
      }
   }

   private int O00000000(float f) {
      return this.O00000000O000 ? O00000000(0.1F, 0.1F, 0.1F, f) : O00000000(1.0F, 1.0F, 1.0F, f);
   }

   private int O000000000(float f) {
      return this.O00000000O000 ? O00000000(0.4F, 0.4F, 0.4F, f) : O00000000(0.8F, 0.86F, 0.9F, f);
   }

   private static void O00000000(RenderManager o0000O00OO0O0, FontObject o0000O0O00O00O, float f, float g, float h, float i, float j, String string, int k) {
      String var9 = string == null ? "" : string;
      float var10 = RenderManager.O00000000(o0000O0O00O00O, var9, j).O00000000;
      float var11 = O00000000000(f + (h - var10) * 0.5F);
      float var12 = O00000000000(O00000000(o0000O0O00O00O, j, g, i));
      o0000O00OO0O0.O00000000(o0000O0O00O00O, var11, var12, j, var9, k);
   }

   private float O00000000(Window window, double d) {
      return (float)(d * window.getFramebufferWidth() / Math.max(1.0, (double)window.getScaledWidth()));
   }

   private float O000000000(Window window, double d) {
      return (float)(d * window.getFramebufferHeight() / Math.max(1.0, (double)window.getScaledHeight()));
   }

   private static float O00000000(FontObject o0000O0O00O00O, float f, float g, float h) {
      try {
         return g + h * 0.5F + FontRegistry.O00000000(o0000O0O00O00O, 72, f * 0.5F);
      } catch (Throwable var5) {
         return g + h * 0.5F + f * 0.18F;
      }
   }

   private static String O00000000(String string, float f, float g, FontObject o0000O0O00O00O) {
      if (string == null) {
         return "";
      } else if (f <= 0.0F) {
         return "";
      } else if (RenderManager.O00000000(o0000O0O00O00O, string, g).O00000000 <= f) {
         return string;
      } else {
         String var4 = "...";
         if (RenderManager.O00000000(o0000O0O00O00O, var4, g).O00000000 > f) {
            return "";
         } else {
            int var5 = 1;
            int var6 = string.length();
            int var7 = 1;

            while (var5 <= var6) {
               int var8 = var5 + var6 >>> 1;
               if (RenderManager.O00000000(o0000O0O00O00O, string.substring(0, var8) + var4, g).O00000000 <= f) {
                  var7 = var8;
                  var5 = var8 + 1;
               } else {
                  var6 = var8 - 1;
               }
            }

            return string.substring(0, var7) + var4;
         }
      }
   }

   private static float O00000000(float f, float g) {
      return O000000000(Math.min(f / 1920.0F, g / 1080.0F) * 1.16F, 0.72F, 1.34F);
   }

   static float O00000000(float f, float g, float h, float i, float j, float k, float l) {
      float var7 = h + j * 0.5F;
      float var8 = i + k * 0.5F;
      float var9 = j * 0.5F - l;
      float var10 = k * 0.5F - l;
      float var11 = Math.abs(f - var7) - var9;
      float var12 = Math.abs(g - var8) - var10;
      float var13 = Math.max(var11, 0.0F);
      float var14 = Math.max(var12, 0.0F);
      return (float)Math.sqrt(var13 * var13 + var14 * var14) + Math.min(Math.max(var11, var12), 0.0F) - l;
   }

   private static float O000000000(float f, float g) {
      return (float)Math.sqrt(f * f + g * g);
   }

   private static float O0000000000(float f) {
      float var1 = O000000000(f, 0.0F, 1.0F);
      return var1 * var1 * var1 * (var1 * (var1 * 6.0F - 15.0F) + 10.0F);
   }

   private static float O000000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   static int O00000000(int i, int j, int k) {
      return Math.max(j, Math.min(k, i));
   }

   private static float O00000000000(float f) {
      return Math.round(f);
   }

   private static float O000000000(int i) {
      return (i >> 16 & 0xFF) / 255.0F;
   }

   private static float O0000000000(int i) {
      return (i >> 8 & 0xFF) / 255.0F;
   }

   private static float O00000000000(int i) {
      return (i & 0xFF) / 255.0F;
   }

   private static int O00000000(float f, float g, float h, float i) {
      int var4 = Math.round(O000000000(f, 0.0F, 1.0F) * 255.0F);
      int var5 = Math.round(O000000000(g, 0.0F, 1.0F) * 255.0F);
      int var6 = Math.round(O000000000(h, 0.0F, 1.0F) * 255.0F);
      int var7 = Math.round(O000000000(i, 0.0F, 1.0F) * 255.0F);
      return var7 << 24 | var4 << 16 | var5 << 8 | var6;
   }

   private static int O00000000(int i, int j, float f, float g) {
      float var4 = O000000000(f, 0.0F, 1.0F);
      int var5 = O0000O000OO000.O00000000000(i, j, var4);
      int var6 = Math.round(O000000000(g, 0.0F, 1.0F) * 255.0F);
      return var6 << 24 | var5;
   }

   static enum W363 {
      TYPE,
      ENABLED,
      PASTE,
      TEST,
      SAVE,
      BACK;
   }

   static final class W364 extends ProxyScreen.W367 {
      final ProxyScreen.W363 O000000000O00;

      W364(String string, ProxyScreen.W363 o00000000) {
         super(string);
         this.O000000000O00 = o00000000;
      }
   }

   static final class W365 extends ProxyScreen.W367 {
      final boolean O000000000O00;
      private final int O000000000O000;
      private final ProxyScreen.W366 O000000000O00O;
      String O000000000O0O = "";
      int O000000000O0O0;
      boolean O000000000O0OO;
      boolean O000000000OO;
      float O000000000OO0;
      float O000000000OO00;
      float O000000000OO0O;

      W365(String string, boolean bl, int i, ProxyScreen.W366 o00000000000) {
         super(string);
         this.O000000000O00 = bl;
         this.O000000000O000 = i;
         this.O000000000O00O = o00000000000;
      }

      void O00000000(String string) {
         this.O000000000O0O = this.O0000000000(string == null ? "" : string);
         if (this.O000000000O0O.length() > this.O000000000O000) {
            this.O000000000O0O = this.O000000000O0O.substring(0, this.O000000000O000);
         }

         this.O000000000O0O0 = this.O000000000O0O.length();
         this.O000000000OO = false;
         this.O000000000OO00 = 0.0F;
         this.O000000000OO0O = 0.0F;
      }

      void O000000000(String string) {
         String var2 = this.O0000000000(string == null ? "" : string);
         if (!var2.isEmpty()) {
            if (this.O000000000OO) {
               this.O000000000O0O = "";
               this.O000000000O0O0 = 0;
               this.O000000000OO = false;
            }

            int var3 = this.O000000000O000 - this.O000000000O0O.length();
            if (var3 > 0) {
               if (var2.length() > var3) {
                  var2 = var2.substring(0, var3);
               }

               int var4 = ProxyScreen.O00000000(this.O000000000O0O0, 0, this.O000000000O0O.length());
               this.O000000000O0O = this.O000000000O0O.substring(0, var4) + var2 + this.O000000000O0O.substring(var4);
               this.O000000000O0O0 = var4 + var2.length();
            }
         }
      }

      void O000000000() {
         if (this.O000000000OO) {
            this.O00000000000();
         } else if (this.O000000000O0O0 > 0 && !this.O000000000O0O.isEmpty()) {
            int var1 = ProxyScreen.O00000000(this.O000000000O0O0, 0, this.O000000000O0O.length());
            if (var1 > 0) {
               this.O000000000O0O = this.O000000000O0O.substring(0, var1 - 1) + this.O000000000O0O.substring(var1);
               this.O000000000O0O0 = var1 - 1;
            }
         }
      }

      void O0000000000() {
         if (this.O000000000OO) {
            this.O00000000000();
         } else {
            int var1 = ProxyScreen.O00000000(this.O000000000O0O0, 0, this.O000000000O0O.length());
            if (var1 < this.O000000000O0O.length()) {
               this.O000000000O0O = this.O000000000O0O.substring(0, var1) + this.O000000000O0O.substring(var1 + 1);
               this.O000000000O0O0 = var1;
            }
         }
      }

      private void O00000000000() {
         this.O000000000O0O = "";
         this.O000000000O0O0 = 0;
         this.O000000000OO00 = 0.0F;
         this.O000000000OO0O = 0.0F;
         this.O000000000OO = false;
      }

      void O000000000000() {
         this.O00000000();
         this.O000000000O0OO = false;
         this.O000000000OO = false;
         this.O000000000OO0 = 0.0F;
         this.O000000000OO00 = 0.0F;
         this.O000000000OO0O = 0.0F;
         this.O000000000O0O0 = ProxyScreen.O00000000(this.O000000000O0O0, 0, this.O000000000O0O.length());
      }

      private String O0000000000(String string) {
         StringBuilder var2 = new StringBuilder(string.length());

         for (int var3 = 0; var3 < string.length(); var3++) {
            char var4 = string.charAt(var3);
            if (var4 >= ' '
               && var4 != 127
               && (this.O000000000O00O != ProxyScreen.W366.PORT || var4 >= '0' && var4 <= '9')
               && (this.O000000000O00O != ProxyScreen.W366.HOST && this.O000000000O00O != ProxyScreen.W366.TEXT || !Character.isWhitespace(var4))) {
               var2.append(var4);
            }
         }

         return var2.toString();
      }
   }

   static enum W366 {
      HOST,
      PORT,
      TEXT,
      SECRET;
   }

   static class W367 {
      protected String O00000000;
      protected final O00000OOO00 O000000000 = new O00000OOO00(O0000O000O0O00.O000000000000());
      protected float O0000000000;
      protected float O00000000000;
      protected float O000000000000;
      protected float O0000000000000;
      protected float O000000000000O;
      protected float O00000000000O;
      protected float O00000000000O0;
      protected float O00000000000OO;
      protected float O0000000000O;
      protected float O0000000000O0;
      protected float O0000000000O00;
      protected float O0000000000O0O = 1.0F;
      protected float O0000000000OO = 0.5F;
      protected float O0000000000OO0 = 0.5F;
      protected float O0000000000OOO;
      protected float O000000000O;
      protected float O000000000O0;

      protected W367(String string) {
         this.O00000000 = string;
      }

      protected boolean O00000000(float f, float g) {
         return ProxyScreen.O00000000(f, g, this.O0000000000, this.O00000000000, this.O000000000000O, this.O00000000000O, this.O00000000000O0) <= 0.0F;
      }

      protected void O00000000() {
         this.O00000000000OO = 0.0F;
         this.O0000000000O = 0.0F;
         this.O0000000000O0 = 0.0F;
         this.O0000000000O00 = 0.0F;
         this.O0000000000OOO = 0.0F;
         this.O000000000O0 = 0.0F;
         this.O0000000000O0O = 1.0F;
         this.O0000000000OO = 0.5F;
         this.O0000000000OO0 = 0.5F;
         this.O000000000.O00000000(1.0F);
      }
   }

   static final class W368 {
      float O00000000;
      float O000000000;
      float O0000000000 = -100.0F;
      float O00000000000;
   }
}
