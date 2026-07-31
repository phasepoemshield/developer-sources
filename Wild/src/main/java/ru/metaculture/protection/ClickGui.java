package ru.metaculture.protection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import lombok.Generated;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import org.wild.module.api.Module;

public final class ClickGui {
   private static final long O00000000 = 1000L;
   private static final long O000000000 = 95L;
   private static final long O0000000000 = 55L;
   private final O0000O000O0O0 O00000000000 = new O0000O000O0O0();
   private final O0000O0000 O000000000000 = O0000O0000.O00000000();
   private final O00000OOOOOOOO O0000000000000 = new O00000OOOOOOOO();
   private final O0000O000 O000000000000O = new O0000O000(this.O000000000000);
   private final O0000O000000 O00000000000O = new O0000O000000();
   private final O00000OOOOOOO0 O00000000000O0 = new O00000OOOOOOO0();
   private final O0000O0000OO00 O00000000000OO = new O0000O0000OO00();
   private final O00000OOOOOO0 O0000000000O = new O00000OOOOOO0(this.O00000000000O, this.O00000000000O0, this.O00000000000OO);
   private final O00000OOOOOO0O O0000000000O0 = new O00000OOOOOO0O(this.O0000000000O, this.O00000000000O0, new O00000OOOOOO00());
   private final O0000O000OO O0000000000O00 = O0000O000OO.O00000000();
   private O00000OOO000OO O0000000000O0O;
   private O0000O000O0O00 O0000000000OO = O0000O000O0O00.O000000000000();
   private O0000O000O0O00 O0000000000OO0 = O0000O000O0O00.O00000000();
   private O0000O000O0O00 O0000000000OOO = O0000O000O0O00.O000000000();
   private O0000O000O0O00 O000000000O = O0000O000O0O00.O0000000000();
   private O0000O000O0O00 O000000000O0 = O0000O000O0O00.O00000000000();
   private O0000O000O0O00 O000000000O00 = O0000O000O0O00.O00000000000O();
   private O0000O000O0O00 O000000000O000 = O0000O000O0O00.O000000000000O();
   private O0000O000O0O00 O000000000O00O = O0000O000O0O00.O00000000000O0();
   private O0000O000O0O00 O000000000O0O = O0000O000O0O00.O00000000000OO();
   private O0000O000O0O00 O000000000O0O0 = O0000O000O0O00.O0000000000O();
   private O0000O000O0O00 O000000000O0OO = O0000O000O0O00.O0000000000O0();
   private O0000O000O0O00 O000000000OO = O0000O000O0O00.O0000000000O00();
   private O0000O000O0O00 O000000000OO0 = O0000O000O0O00.O0000000000O0O();
   private O0000O000O0O00 O000000000OO00 = O0000O000O0O00.O0000000000OO();
   private O0000O000O0O00 O000000000OO0O = O0000O000O0O00.O0000000000OO0();
   private final ClickGuiRenderer O000000000OOO = new ClickGuiRenderer(
      new O0000O0000OOOO(),
      new O0000O0000OOO0(),
      new SearchBarRenderer(),
      new O0000O0000O00O(new ModuleListRenderer(new SettingsRenderer())),
      this.O00000000000OO,
      new O0000O000O()
   );
   private O0000O00000 O000000000OOO0 = O0000O00000.O00000000(0.5F, this.O000000000000);
   private O0000O000O0OOO O000000000OOOO = this.O00000000OO();
   private O0000O0000000 O00000000O = O0000O0000000.O00000000();
   private boolean O00000000O0;
   private Theme O00000000O00;
   private long O00000000O000;
   private boolean O00000000O0000;

   void O00000000(MinecraftClient minecraftClient) {
      this.O00000000000.O00000000();
      MenuModule.O00000000(minecraftClient, this.O000000000000);
      this.O00000000000.O000000000();
      O0000O000O0000.O00000000(this.O00000000000);
      this.O00000000O0 = false;
      this.O00000000O00 = null;
      this.O00000000O000 = System.currentTimeMillis();
      this.O00000000O0000 = false;
      this.O000000000(minecraftClient);
      if (minecraftClient != null && minecraftClient.mouse != null) {
         minecraftClient.mouse.unlockCursor();
      }

      ProtectionHandler.O00000000();
   }

   void O00000000(MinecraftClient minecraftClient, DrawContext drawContext, RenderManager o0000O00OO0O0, int i, int j, float f) {
      if (minecraftClient != null && minecraftClient.getWindow() != null && o0000O00OO0O0 != null && i > 0 && j > 0) {
         long var7 = System.currentTimeMillis();
         if (this.O00000000O0000 || this.O00000000O000 > 0L && var7 - this.O00000000O000 > 1000L) {
            this.O0000000000(minecraftClient);
         }

         this.O00000000O000 = var7;
         this.O00000000O0000 = false;
         this.O00000000(minecraftClient, i, j);
         O00000OOOOOOO.O00000000();
         this.O0000000000O0.O00000000(this.O00000000000, this.O00000000000.O0000000O());
         O00000OOO000OO var9 = !this.O00000000000.O000000O0O0OO() && !(this.O00000000000.O00000000(O0000O000O00O0.O000000000O00O()) > 0.0015F)
            ? this.O0000000000O0O
            : this.O00000000O0OOO();
         boolean var10 = var9 != null && var9.O000000000(this.O00000000000);
         if (!var10) {
            this.O000000000OOO.O00000000(o0000O00OO0O0, drawContext, this.O00000000000, this.O0000000000000, this.O00000000O, this.O000000000OOOO, i, j);
         }

         if (var9 != null) {
            var9.O00000000(o0000O00OO0O0, this.O00000000000, this.O000000000OOOO, i, j);
         }
      } else {
         this.O00000000000O();
      }
   }

   void O00000000(float f, float g) {
      this.O00000000000.O000000000000O(f);
      this.O00000000000.O00000000000O(g);
   }

   public boolean O00000000() {
      return this.O00000000000.O000000O0O0OO() || this.O00000000000.O00000000(O0000O000O00O0.O000000000O00O()) > 0.0015F;
   }

   boolean O00000000(float f, float g, int i) {
      if (this.O00000000000.O00000000OOOOO()) {
         return true;
      } else {
         O00000OOO000OO var4 = this.O00000000O0OO0();
         if (var4 != null) {
            return i == 0 && !var4.O00000000000() && O00000OOOOOOO.O00000000(f, g)
               ? true
               : var4.O00000000(this.O00000000000, this.O000000000OOOO, f, g, i, this.O00000000OO0(), this.O00000000OO00());
         } else if (this.O00000000000.O00000000OO000()
            && this.O000000000OOO.O00000000() != null
            && this.O000000000OOO.O00000000().O00000000(this.O00000000000, this.O000000000OOOO, f, g, i)) {
            return true;
         } else {
            float var5 = this.O00000000000.O00000000(O0000O000O00O0.O0000000000O0());
            boolean var6 = var5 > 0.1F
               && f >= this.O0000000000000.O000000000O00O()
               && f <= this.O0000000000000.O000000000O00O() + this.O000000000OOO0.O000000000O0()
               && g >= this.O0000000000000.O000000000O0O()
               && g <= this.O0000000000000.O000000000O0O() + this.O000000000OOO0.O000000000O00();
            boolean var7 = this.O0000000000(f, g);
            if (i == 0) {
               float var8 = this.O0000000000000.O0000000000() + this.O000000000OOO0.O00000000(16.0F);
               float var9 = this.O0000000000000.O00000000000() + this.O000000000OOO0.O00000000(16.0F);
               float var10 = this.O000000000OOO0.O00000000(40.0F);
               if (f >= var8 && f <= var8 + var10 && g >= var9 && g <= var9 + var10) {
                  boolean var11 = !this.O00000000000.O000000O0O0O00();
                  this.O00000000000.O00000000(var11);
                  if (var11) {
                     this.O00000000000.O000000000O0O(true);
                  }

                  return true;
               }
            }

            if (!var6 || !this.O00000000000.O000000O0O0O0O() && var7) {
               if (i == 0) {
                  boolean var13 = f >= this.O0000000000000.O00000000000OO()
                     && f <= this.O0000000000000.O00000000000OO() + this.O000000000OOO0.O0000000000O0()
                     && g >= this.O0000000000000.O00000000000O()
                     && g <= this.O0000000000000.O00000000000O() + this.O000000000OOO0.O0000000000O();
                  if (var13) {
                     label96: {
                        boolean var15 = f >= this.O0000000000000.O00000000000OO() + this.O000000000OOO0.O0000000000O0() - this.O000000000OOO0.O00000000(34.0F);
                        if (var15) {
                           if (!this.O00000000000.O00000000OO0OO().isEmpty()) {
                              break label96;
                           }

                           if (this.O00000000000.O00000000OOO()) {
                              break label96;
                           }
                        }

                        this.O00000000000.O000000000OOOO();
                        this.O00000000000.O00000000000O0(false);
                        this.O00000000000.O00000000000O(true);
                        this.O00000000000.O000000000000O(false);
                        return true;
                     }

                     this.O00000000000.O000000000O();
                     this.O00000000000.O00000000000O(false);
                     this.O00000000000.O000000000OOOO();
                     return true;
                  }

                  if (this.O00000000000.O00000000OOO()) {
                     this.O00000000000.O00000000000O(false);
                     this.O00000000000.O000000000000O(false);
                  }
               }

               this.O00000000000.O000000000O0O(false);
               return this.O0000000000O0.O00000000(this.O00000000000, this.O0000000000000, this.O00000000O, this.O000000000OOO0, this.O0000000000O00, f, g, i);
            } else {
               this.O00000000000.O000000000O0O(true);
               if (i == 0) {
                  float var12 = this.O000000000OOO0.O000000000(20.0F);
                  float var14 = this.O0000000000000.O000000000O00O() + this.O000000000OOO0.O000000000O0() - this.O000000000OOO0.O000000000(15.0F) - var12;
                  float var16 = this.O0000000000000.O000000000O0O() + this.O000000000OOO0.O000000000(20.0F);
                  if (f >= var14 && f <= var14 + var12 && g >= var16 && g <= var16 + var12) {
                     this.O00000000000.O00000000(false);
                     return true;
                  }
               }

               this.O0000000000O0.O00000000(this.O00000000000, this.O0000000000000, this.O00000000O, this.O000000000OOO0, this.O0000000000O00, f, g, i);
               return true;
            }
         }
      }
   }

   boolean O000000000() {
      O00000OOO000OO var1 = this.O00000000O0OO0();
      if (var1 == null) {
         if (this.O00000000000.O00000000OO000() && this.O000000000OOO.O00000000() != null) {
            this.O000000000OOO.O00000000().O00000000(this.O00000000000, this.O00000000000.O0000000O(), this.O00000000000.O0000000O0());
         }

         return this.O0000000000O0.O00000000(this.O00000000000);
      } else {
         boolean var2 = O00000OOOOOOO.O000000000();
         boolean var3 = var1.O000000000(this.O00000000000, this.O00000000000.O0000000O(), this.O00000000000.O0000000O0());
         return var2 || var3;
      }
   }

   boolean O000000000(float f, float g) {
      if (this.O00000000000.O00000000OOOOO()) {
         return true;
      } else {
         O00000OOO000OO var3 = this.O00000000O0OO0();
         if (var3 != null) {
            if (O00000OOOOOOO.O000000000(f, g)) {
               return true;
            } else {
               var3.O00000000(this.O00000000000, f, g);
               return true;
            }
         } else if (this.O00000000000.O00000000OO000()
            && this.O000000000OOO.O00000000() != null
            && this.O000000000OOO.O00000000().O000000000(this.O00000000000, f, g)) {
            return true;
         } else {
            boolean var4 = this.O0000000000O0.O00000000(this.O00000000000, this.O0000000000000, this.O000000000OOO0, f, g);
            if (this.O00000000000.O0000000O0OOO0() || this.O00000000000.O0000000OO000O()) {
               this.O000000000(MinecraftClient.getInstance());
            } else if (this.O00000000000.O0000000O0OO0O() || this.O00000000000.O0000000O0OOO()) {
               this.O000000000000O.O00000000(this.O000000000OOO0, this.O00000000000, this.O0000000000000);
            }

            return var4;
         }
      }
   }

   boolean O00000000(float f, float g, double d, double e) {
      if (this.O00000000000.O00000000OOOOO()) {
         return true;
      } else {
         O00000OOO000OO var7 = this.O00000000O0OO0();
         if (var7 != null) {
            return var7.O00000000(this.O00000000000, f, g, e);
         } else {
            return this.O00000000000.O00000000OO000()
                  && this.O000000000OOO.O00000000() != null
                  && this.O000000000OOO.O00000000().O00000000(this.O00000000000, f, g, e)
               ? true
               : this.O0000000000O0.O00000000(this.O00000000000, this.O0000000000000, this.O00000000O, this.O000000000OOO0, f, g, d, e);
         }
      }
   }

   boolean O00000000(int i) {
      if (this.O00000000000.O00000000OOOOO()) {
         return true;
      } else if (i == 84 && Screen.hasControlDown()) {
         this.O00000000000.O000000000OOOO();
         if (this.O00000000000.O000000O0O0OO()) {
            this.O00000000000.O000000000O0O0(false);
         } else {
            this.O00000000000.O000000000O0O0(this.O00000000O0OOO() != null);
         }

         return true;
      } else if (i == 77 && Screen.hasControlDown()) {
         this.O00000000000.O000000000OOOO();
         this.O00000000000.O000000000O0O0(false);
         this.O00000000000.O0000000000O();
         return true;
      } else {
         O00000OOO000OO var2 = this.O00000000O0OO0();
         if (var2 != null) {
            return var2.O00000000(this.O00000000000, i);
         } else if (this.O00000000000.O00000000OO000()
            && this.O000000000OOO.O00000000() != null
            && this.O000000000OOO.O00000000().O00000000(this.O00000000000, i)) {
            return true;
         } else {
            if (this.O00000000000.O00000000OOO()) {
               if (Screen.hasControlDown()) {
                  switch (i) {
                     case 65:
                        if (!this.O00000000000.O00000000OO0OO().isEmpty()) {
                           this.O00000000000.O000000000000O(true);
                        }

                        return true;
                     case 67:
                        if (!this.O00000000000.O00000000OO0OO().isEmpty()) {
                           MinecraftClient.getInstance().keyboard.setClipboard(this.O00000000000.O00000000OO0OO());
                        }

                        return true;
                     case 86:
                        String var3 = MinecraftClient.getInstance().keyboard.getClipboard();
                        if (var3 != null && !var3.isEmpty()) {
                           if (this.O00000000000.O00000000OO0O0()) {
                              this.O00000000000.O0000000000("");
                           }

                           String var4 = this.O00000000000.O00000000OO0OO();
                           int var5 = 96 - var4.length();
                           if (var5 > 0) {
                              String var6 = var3.length() > var5 ? var3.substring(0, var5) : var3;
                              this.O00000000000.O0000000000(var4 + var6);
                           }

                           this.O00000000000.O000000000000O(false);
                           this.O00000000000.O00000000000(System.currentTimeMillis());
                        }

                        return true;
                     case 88:
                        if (!this.O00000000000.O00000000OO0OO().isEmpty()) {
                           MinecraftClient.getInstance().keyboard.setClipboard(this.O00000000000.O00000000OO0OO());
                           this.O00000000000.O0000000000("");
                           this.O00000000000.O000000000000O(false);
                           this.O00000000000.O00000000000(System.currentTimeMillis());
                        }

                        return true;
                  }
               } else if (i == 263 || i == 262) {
                  this.O00000000000.O000000000000O(false);
               }
            }

            if (i == 70 && Screen.hasControlDown()) {
               this.O00000000000.O000000000OOOO();
               this.O00000000000.O00000000000O0(false);
               this.O00000000000.O00000000000O(true);
               this.O00000000000.O000000000000O(true);
               return true;
            } else {
               return this.O0000000000O0.O00000000(this.O00000000000, i);
            }
         }
      }
   }

   boolean O00000000(char c) {
      if (this.O00000000000.O00000000OOOOO()) {
         return true;
      } else {
         O00000OOO000OO var2 = this.O00000000O0OO0();
         if (var2 != null) {
            var2.O00000000(this.O00000000000, c);
            return true;
         } else {
            return this.O00000000000.O00000000OO000()
                  && this.O000000000OOO.O00000000() != null
                  && this.O000000000OOO.O00000000().O00000000(this.O00000000000, c)
               ? true
               : this.O0000000000O0.O00000000(this.O00000000000, c);
         }
      }
   }

   boolean O0000000000() {
      if (this.O00000000000.O00000000OOOOO()) {
         return false;
      } else {
         this.O00000000000.O0000000000();
         return true;
      }
   }

   boolean O00000000000() {
      return this.O00000000000.O000000000(this.O0000000000OO);
   }

   boolean O000000000000() {
      return this.O00000000000.O00000000OOOOO();
   }

   public boolean O0000000000000() {
      return this.O00000000000.O000000O0O0OO()
         || this.O00000000000.O00000000OO000() && this.O000000000OOO.O00000000() != null && this.O000000000OOO.O00000000().O00000000()
         || this.O00000000000.O00000000OOO()
         || this.O00000000000.O00000000OOO00()
         || this.O00000000000.O0000000OOO000() != null
         || this.O00000000000.O000000000OOO0();
   }

   public void O000000000000O() {
      this.O000000000(MinecraftClient.getInstance());
   }

   void O00000000000O() {
      this.O00000000O0000 = true;
      this.O00000000O0OO();
   }

   void O00000000000O0() {
      if (!this.O00000000O0) {
         this.O00000000O0 = true;
         O00000OOOOOOO.O0000000000();
         this.O00000000000.O000000000OOOO();
         this.O00000000000.O00000000000O(false);
         this.O00000000000.O000000000O0O0(false);
         O00000OOO000OO var1 = this.O0000000000O0O;
         if (var1 != null) {
            var1.close();
         }

         O0000O000O0O0O var2 = this.O000000000OOO.O00000000();
         if (var2 != null) {
            var2.O000000000();
         }

         O0000O000O0000.O000000000(this.O00000000000);
         if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null) {
            WildClient.O00000000.O0000000000O.O00000000(this.O00000000000.O00000000OO());
            WildClient.O00000000.O0000000000O.O00000000(this.O00000000000.O00000000OO0O());
            WildClient.O00000000.O0000000000O.O00000000(this.O00000000000.O0000000O0000(), this.O00000000000.O0000000O00000());
            WildClient.O00000000.O0000000000O.O00000000(this.O00000000000.O000000O0O0O00());
         }
      }
   }

   private void O000000000(MinecraftClient minecraftClient) {
      if (minecraftClient != null && minecraftClient.getWindow() != null) {
         int var2 = minecraftClient.getWindow().getFramebufferWidth();
         int var3 = minecraftClient.getWindow().getFramebufferHeight();
         if (var2 > 0 && var3 > 0) {
            this.O00000000(minecraftClient, var2, var3);
         }
      }
   }

   private void O00000000(MinecraftClient minecraftClient, int i, int j) {
      this.O00000000O0O00();
      this.O000000000(minecraftClient, i, j);
      this.O00000000O0O0O();
      this.O00000000000.O0000000000(this.O000000000OO0O);
      this.O000000000OOOO = this.O00000000OO();
      this.O00000000000.O00000000(this.O0000000000OO);
      this.O00000000OO000();
      this.O00000000O = this.O00000000000O.O00000000(this.O00000000000, this.O0000000000000, this.O000000000OOO0);
      this.O00000000000.O00000000(this.O00000000O.O0000000000());
      this.O00000000000.O00000000(this.O000000000OOO0);
      this.O00000000000.O000000000(this.O000000000O000, this.O000000000OOO0);
      this.O00000000O = this.O00000000000O.O00000000(this.O00000000000, this.O0000000000000, this.O000000000OOO0);
      this.O00000000OO0OO();
      this.O00000000OOO0O();
   }

   private void O00000000O0O00() {
      this.O0000000000OO = O0000O000O0O00.O000000000000();
      this.O0000000000OO0 = O0000O000O0O00.O00000000();
      this.O0000000000OOO = O0000O000O0O00.O000000000();
      this.O000000000O = O0000O000O0O00.O0000000000();
      this.O000000000O0 = O0000O000O0O00.O00000000000();
      this.O000000000O00 = O0000O000O0O00.O00000000000O();
      this.O000000000O000 = O0000O000O0O00.O000000000000O();
      this.O000000000O00O = O0000O000O0O00.O00000000000O0();
      this.O000000000O0O = O0000O000O0O00.O00000000000OO();
      this.O000000000O0O0 = O0000O000O0O00.O0000000000O();
      this.O000000000O0OO = O0000O000O0O00.O0000000000O0();
      this.O000000000OO = O0000O000O0O00.O0000000000O00();
      this.O000000000OO0 = O0000O000O0O00.O0000000000O0O();
      this.O000000000OO00 = O0000O000O0O00.O0000000000OO();
      this.O000000000OO0O = O0000O000O0O00.O0000000000OO0();
   }

   private void O00000000O0O0O() {
      Theme var1 = this.O00000000000.O00000000OO0O();
      ColorScheme var2 = ColorScheme.O00000000(var1, this.O00000000(var1));
      if (this.O00000000O00 == null) {
         this.O00000000000.O00000000(var2);
      } else if (this.O00000000O00 != var1) {
         this.O00000000000.O000000000(this.O00000000O00);
         this.O00000000000.O000000000(var2);
      }

      this.O00000000O00 = var1;
   }

   private void O000000000(MinecraftClient minecraftClient, int i, int j) {
      if (minecraftClient != null && minecraftClient.getWindow() != null) {
         int var4 = i > 0 ? i : minecraftClient.getWindow().getFramebufferWidth();
         int var5 = j > 0 ? j : minecraftClient.getWindow().getFramebufferHeight();
         if (var4 <= 0 || var5 <= 0) {
            return;
         }

         this.O000000000OOO0 = this.O000000000000O.O00000000(minecraftClient, var4, var5, this.O00000000000, this.O0000000000000);
         O0000O00000OO.O00000000(this.O000000000OOO0);
      }
   }

   private void O0000000000(MinecraftClient minecraftClient) {
      this.O00000000O0OO();
      if (minecraftClient != null && minecraftClient.mouse != null) {
         minecraftClient.mouse.unlockCursor();
      }
   }

   private void O00000000O0OO() {
      O00000OOOOOOO.O0000000000();
      this.O00000000000.O000000000OOOO();
      this.O00000000000.O00000000000O(false);
      this.O00000000000.O00000000000O0(false);
      this.O00000000000.O000000000OO0O();
   }

   private O00000OOO000OO O00000000O0OO0() {
      O00000OOO000OO var1 = this.O0000000000O0O;
      if (var1 != null && var1.O00000000(this.O00000000000)) {
         return var1;
      } else {
         if (this.O00000000000.O000000O0O0OO() || this.O00000000000.O00000000(O0000O000O00O0.O000000000O00O()) > 0.035F) {
            var1 = this.O00000000O0OOO();
            if (var1 != null && var1.O00000000(this.O00000000000)) {
               return var1;
            }
         }

         return null;
      }
   }

   private O00000OOO000OO O00000000O0OOO() {
      if (this.O0000000000O0O != null) {
         return this.O0000000000O0O;
      } else {
         try {
            this.O0000000000O0O = new O00000OOO000OO();
            return this.O0000000000O0O;
         } catch (Throwable var2) {
            this.O00000000000.O000000000O0O0(false);
            System.out.println("[ModernClickGui] Foundry init failed: " + var2.getClass().getSimpleName() + ": " + var2.getMessage());
            return null;
         }
      }
   }

   private O0000O000O0OOO O00000000OO() {
      Theme var1 = this.O00000000000.O00000000OO0O();
      ColorScheme var2 = this.O00000000000.O00000000O00O();
      if (var2 == null) {
         var2 = ColorScheme.O00000000(var1, this.O00000000(var1));
      }

      if (this.O00000000000.O0000000OOOOO0() <= 0L) {
         var2 = ColorScheme.O00000000(var1, var2, System.currentTimeMillis());
      }

      return O0000O000O0OOO.O0000000000().O00000000(var1).O00000000(this.O000000000OOO0).O00000000(var2).O00000000(this.O0000000000O00).O00000000();
   }

   private boolean O00000000(Theme o0000000OOO) {
      return this.O0000000000O00 != null && this.O0000000000O00.O0000000000(o0000000OOO);
   }

   private boolean O0000000000(float f, float g) {
      return O0000O00000OO.O00000000(
         f, g, this.O0000000000000.O00000000(), this.O0000000000000.O000000000(), this.O000000000OOO0.O00000000000(), this.O000000000OOO0.O000000000000()
      );
   }

   private int O00000000OO0() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      return var1 != null && var1.getWindow() != null ? Math.max(1, var1.getWindow().getFramebufferWidth()) : Math.round(this.O000000000OOO0.O00000000000());
   }

   private int O00000000OO00() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      return var1 != null && var1.getWindow() != null ? Math.max(1, var1.getWindow().getFramebufferHeight()) : Math.round(this.O000000000OOO0.O000000000000());
   }

   private void O00000000OO000() {
      boolean var1 = !this.O00000000000.O00000000OOOOO() && this.O00000000000.O00000000OOO();
      boolean var2 = !this.O00000000000.O00000000OOOOO() && !this.O00000000000.O00000000OO0OO().isEmpty();
      boolean var3 = !this.O00000000000.O00000000OOOOO() && this.O00000000000.O000000O0O0O00();
      boolean var4 = !this.O00000000000.O00000000OOOOO() && this.O00000000000.O000000O0O0OO();
      boolean var5 = !this.O00000000000.O00000000OOOOO() && this.O00000000000.O00000000OO00();
      this.O00000000000.O00000000(O0000O000O00O0.O00000000(), var1 ? 1.0F : 0.0F, this.O00000000(var1, this.O000000000O00));
      this.O00000000000.O00000000(O0000O000O00O0.O0000000000O(), var2 ? 1.0F : 0.0F, this.O00000000(var2, this.O0000000000OO0));
      this.O00000000000.O00000000(O0000O000O00O0.O0000000000O0(), var3 ? 1.0F : 0.0F, var3 ? this.O0000000000OO : this.O0000000000OO0);
      this.O00000000000.O00000000(O0000O000O00O0.O000000000O00O(), var4 ? 1.0F : 0.0F, var4 ? this.O0000000000OO : this.O000000000OO00);
      boolean var6 = !this.O00000000000.O00000000OOOOO()
         && O0000O00000OO.O00000000(
            this.O00000000000,
            SearchBarRenderer.O0000000000(this.O0000000000000, this.O000000000OOO0),
            SearchBarRenderer.O00000000000(this.O0000000000000, this.O000000000OOO0),
            SearchBarRenderer.O0000000000(this.O000000000OOO0),
            SearchBarRenderer.O00000000000(this.O000000000OOO0)
         );
      boolean var7 = var6 || var4;
      this.O00000000000.O00000000(O0000O000O00O0.O000000000O0O(), var7 ? 1.0F : 0.0F, this.O00000000(var7, this.O000000000O0O));
      boolean var8 = !this.O00000000000.O00000000OOOOO() && this.O00000000000.O00000000OO000();
      boolean var9 = O00000O0OOO0O0.O00000000()
         && !this.O00000000000.O00000000OOOOO()
         && O0000O00000OO.O00000000(
            this.O00000000000,
            SearchBarRenderer.O00000000(this.O0000000000000, this.O000000000OOO0),
            SearchBarRenderer.O000000000(this.O0000000000000, this.O000000000OOO0),
            SearchBarRenderer.O00000000(this.O000000000OOO0),
            SearchBarRenderer.O000000000(this.O000000000OOO0)
         );
      boolean var10 = var9 || var8;
      this.O00000000000.O00000000(O0000O000O00O0.O000000000O0OO(), var10 ? 1.0F : 0.0F, this.O00000000(var10, this.O000000000O0O));
      this.O00000000000.O00000000(O0000O000O00O0.O000000000000O(), var5 ? 1.0F : 0.0F, var5 ? this.O0000000000OO : this.O000000000OO00);
      this.O00000000OO00O();
      this.O00000000OO0O();
      this.O00000000OO0O0();
      this.O00000000OOO();
      this.O00000000OOO0();
      this.O00000000OOO00();
   }

   private void O00000000OO00O() {
      float var1 = O0000O0000OOO0.O0000000000(this.O0000000000000, this.O000000000OOO0);
      float var2 = this.O0000000000000.O00000000000() + this.O000000000OOO0.O00000000(89.0F);
      Category[] var3 = Category.values();

      for (int var4 = 0; var4 < var3.length; var4++) {
         Category var5 = var3[var4];
         float var6 = var2 + var4 * this.O000000000OOO0.O00000000(56.0F);
         boolean var7 = !this.O00000000000.O00000000OOOOO()
            && O0000O00000OO.O00000000(this.O00000000000, var1, var6, this.O000000000OOO0.O00000000(40.0F), this.O000000000OOO0.O00000000(40.0F));
         boolean var8 = !this.O00000000000.O00000000OOOOO()
            && !this.O00000000000.O00000000OO0()
            && !this.O00000000000.O00000000OO00()
            && !this.O00000000000.O00000000OO000()
            && var5 == this.O00000000000.O00000000OO();
         this.O00000000000.O00000000(O0000O000O00O0.O00000000(var5), var7 ? 1.0F : 0.0F, this.O00000000(var7, this.O000000000O0O));
         this.O00000000000.O00000000(O0000O000O00O0.O000000000(var5), var8 ? 1.0F : 0.0F, this.O00000000(var8, this.O0000000000OO0));
      }

      float var11 = O0000O0000OOO0.O000000000(this.O000000000OOO0);
      float var12 = O0000O0000OOO0.O000000000000(this.O0000000000000, this.O000000000OOO0);
      boolean var13 = !this.O00000000000.O00000000OOOOO() && O0000O00000OO.O00000000(this.O00000000000, var1, var12, var11, var11);
      boolean var14 = !this.O00000000000.O00000000OOOOO() && this.O00000000000.O00000000OO0();
      this.O00000000000.O00000000(O0000O000O00O0.O000000000000(), var13 ? 1.0F : 0.0F, this.O00000000(var13, this.O000000000O0O));
      this.O00000000000.O00000000(O0000O000O00O0.O0000000000000(), var14 ? 1.0F : 0.0F, this.O00000000(var14, this.O0000000000OO0));
      float var15 = O0000O0000OOO0.O0000000000(this.O0000000000000, this.O000000000OOO0);
      float var9 = O0000O0000OOO0.O00000000000(this.O0000000000000, this.O000000000OOO0);
      boolean var10 = !this.O00000000000.O00000000OOOOO() && O0000O00000OO.O00000000(this.O00000000000, var15, var9, var11, var11);
      this.O00000000000.O00000000(O0000O000O00O0.O000000000(), var10 ? 1.0F : 0.0F, this.O00000000(var10, this.O000000000O0O));
   }

   private void O00000000OO0O() {
      if (!this.O00000000000.O000000O0O0O00() && this.O00000000000.O00000000(O0000O000O00O0.O0000000000O0()) <= 0.005F) {
         this.O00000000000.O000000000(0.0F);
      } else {
         O0000O0000000O var1 = O0000O0000000O.O00000000(this.O0000000000000, this.O000000000OOO0);
         List var2 = this.O00000000000.O00000000(this.O0000000000O00);
         if (var2 == null) {
            var2 = java.util.Collections.emptyList();
         }
         this.O00000000000.O000000000(Math.max(0.0F, var1.O00000000(var2.size()) - var1.O00000000000() + this.O000000000OOO0.O000000000(2.0F)));
         float var3 = this.O00000000000.O00000000(this.O000000000O000, this.O000000000OOO0);
         float var4 = var1.O00000000();
         float var5 = var1.O000000000();
         float var6 = var1.O0000000000();
         float var7 = var1.O00000000000();
         boolean var8 = !this.O00000000000.O00000000OOOOO() && O0000O00000OO.O00000000(this.O00000000000, var4, var5, var6, var7);
         boolean var9 = !this.O00000000000.O00000000OOOOO() && this.O00000000000.O00000000OOO00();
         boolean var10 = !this.O00000000000.O00000000OOOOO() && !this.O00000000000.O00000000OOO0().isEmpty();
         this.O00000000000.O00000000(O0000O000O00O0.O0000000000O00(), var9 ? 1.0F : 0.0F, this.O00000000(var9, this.O000000000O00));
         this.O00000000000.O00000000(O0000O000O00O0.O0000000000O0O(), var10 ? 1.0F : 0.0F, this.O00000000(var10, this.O0000000000OO0));
         int var11 = this.O00000000000.O0000000OOO0O0() >= 0
            ? this.O00000000000.O0000000OOO0O0()
            : this.O0000000000O00.O00000000(this.O00000000000.O00000000OO0O());
         float var12 = this.O00000000000.O000000O0OO000();
         float var13 = this.O00000000000.O000000O0OO00O();
         float var14 = this.O00000000000.O000000O0OO0O();
         float var15 = this.O00000000000.O000000O0OO0O0();
         boolean var16 = false;
         int var17 = this.O0000000000O00.O000000000().size();
         int[] var18 = new int[var17];
         Arrays.fill(var18, -1);
         int var19 = 0;

         while (var19 < var2.size()) {
            var18[(int)(Integer)var2.get(var19)] = var19++;
         }

         for (int var24 = 0; var24 < var17; var24++) {
            int var20 = var18[var24];
            if (var20 < 0) {
               this.O00000000000.O00000000(O0000O000O00O0.O00000000(var24), 0.0F, this.O000000000OO00);
               this.O00000000000.O00000000(O0000O000O00O0.O000000000(var24), 0.0F, this.O000000000OO00);
               this.O00000000000.O00000000(O0000O000O00O0.O0000000000(var24), 0.0F, this.O000000000OO00);
            } else {
               O0000O0000000O.W330 var21 = var1.O00000000(var20, var3);
               boolean var22 = var8 && O0000O00000OO.O00000000(this.O00000000000, var21.x(), var21.y(), var21.width(), var21.height());
               boolean var23 = !this.O00000000000.O00000000OOOOO() && var24 == var11;
               this.O00000000000.O00000000(O0000O000O00O0.O00000000(var24), var22 ? 1.0F : 0.0F, this.O00000000(var22, this.O000000000O0O));
               this.O00000000000.O00000000(O0000O000O00O0.O000000000(var24), var23 ? 1.0F : 0.0F, this.O00000000(var23, this.O0000000000OO0));
               this.O00000000000.O00000000(O0000O000O00O0.O0000000000(var24), var22 ? 1.0F : 0.0F, this.O00000000(var22, this.O000000000O00O));
               if (var23) {
                  var12 = var21.x();
                  var13 = var21.y();
                  var14 = var21.width();
                  var15 = var21.height();
                  var16 = true;
               }
            }
         }

         this.O00000000000.O000000000OO(var11 >= 0 && var11 < var17 && var18[var11] >= 0);
         if (var16) {
            this.O00000000000.O00000000(var11, var12, var13, var14, var15);
         }
      }
   }

   private void O00000000OO0O0() {
      List var1 = this.O00000000000.O000000000000();
      HashSet var2 = new HashSet<>(this.O00000000000.O0000000000000());

      for (Module var4 : (List<Module>)var1) {
         boolean var5 = var2.contains(var4) && !this.O00000000000.O00000000OOOOO();
         if (var5) {
            boolean var6 = this.O00000000000.O00000000O0O().contains(var4);
            boolean var7 = var4.O0000000000000;
            this.O00000000000.O00000000(O0000O000O00O0.O00000000(var4), var6 ? 1.0F : 0.0F, var6 ? this.O0000000000OOO : this.O000000000O);
            this.O00000000000.O00000000(O0000O000O00O0.O00000000000(var4), var6 ? 1.0F : 0.0F, this.O00000000(var6, this.O0000000000OO0));
            this.O00000000000.O00000000(O0000O000O00O0.O0000000000(var4), var7 ? 1.0F : 0.0F, this.O00000000(var7, this.O0000000000OO0));
            if (O0000O000O0000.O000000000(var4)) {
               O0000O000O0000.O00000000(var4, this.O00000000000, this.O0000000000OO0, this.O000000000O00O);
            } else {
               this.O00000000(var4);
            }
         } else {
            this.O00000000000.O00000000(O0000O000O00O0.O00000000(var4), 0.0F, this.O000000000OO00);
            this.O00000000000.O00000000(O0000O000O00O0.O00000000000(var4), 0.0F, this.O000000000OO00);
            this.O00000000000.O00000000(O0000O000O00O0.O0000000000(var4), 0.0F, this.O000000000OO00);
         }
      }
   }

   private void O00000000OO0OO() {
      List var1 = this.O00000000000.O000000000000();
      HashSet var2 = new HashSet<>(this.O00000000000.O0000000000000());
      long var3 = System.currentTimeMillis() - this.O00000000000.O0000000O0O0O0();
      HashMap var5 = new HashMap();

      for (O0000O00000000 var7 : this.O00000000O.O000000000()) {
         var5.put(var7.O00000000(), var7);
      }

      float var16 = this.O0000000000000.O0000000000OO0();
      float var17 = var16 + this.O0000000000000.O000000000O();
      int var8 = 0;

      for (Module var10 : (List<Module>)var1) {
         if (!this.O00000000000.O00000000OOOOO() && var2.contains(var10)) {
            O0000O00000000 var11 = (O0000O00000000)var5.get(var10);
            boolean var12 = var11 != null && var11.O0000000000() + var11.O000000000000() >= var16 && var11.O0000000000() <= var17;
            if (var12) {
               long var13 = 95L + var8 * 55L;
               float var15 = var3 >= var13 ? 1.0F : 0.0F;
               this.O00000000000.O000000000(O0000O000O00O0.O000000000000(var10), var15, var15 > 0.0F ? this.O0000000000OO0 : this.O000000000OO00);
               this.O00000000000.O000000000(O0000O000O00O0.O0000000000000(var10), var15, var15 > 0.0F ? this.O000000000O0OO : this.O000000000OO00);
               this.O00000000000.O000000000(O0000O000O00O0.O000000000000O(var10), var15, var15 > 0.0F ? this.O000000000OO0 : this.O000000000OO00);
               var8++;
            } else {
               this.O00000000(O0000O000O00O0.O000000000000(var10));
               this.O00000000(O0000O000O00O0.O0000000000000(var10));
               this.O00000000(O0000O000O00O0.O000000000000O(var10));
            }
         } else {
            this.O00000000000.O00000000(O0000O000O00O0.O000000000000(var10), 0.0F, this.O000000000OO00);
            this.O00000000000.O00000000(O0000O000O00O0.O0000000000000(var10), 0.0F, this.O000000000OO00);
            this.O00000000000.O00000000(O0000O000O00O0.O000000000000O(var10), 0.0F, this.O000000000OO00);
         }
      }
   }

   private void O00000000(String string) {
      this.O00000000000.O00000000O0O0().computeIfAbsent(string, stringx -> new O0000O000O00O(1.0F)).O00000000(1.0F);
   }

   private void O00000000(Module module) {
      boolean var2 = !this.O00000000000.O00000000OOOOO() && this.O00000000000.O00000000O0O().contains(module);
      long var3 = this.O00000000000.O0000000000(module);
      long var5 = System.currentTimeMillis();
      int var7 = 0;

      for (Setting var9 : module.O0000000000000()) {
         if (!(var9 instanceof O000000O0)) {
            float var10;
            if (var2) {
               if (var3 > 0L) {
                  long var11 = 60L + var7 * 55L;
                  var10 = var5 - var3 > var11 ? 1.0F : 0.0F;
               } else {
                  var10 = 1.0F;
               }
            } else {
               var10 = 0.0F;
            }

            this.O00000000000.O000000000(O0000O000O00O0.O00000000000(var9), var10, var10 > 0.0F ? this.O000000000O0 : this.O000000000O);
            if (var9 instanceof BooleanSetting var26) {
               boolean var31 = !this.O00000000000.O00000000OOOOO() && var26.O0000000000();
               this.O00000000000.O00000000(O0000O000O00O0.O00000000(var9), var31 ? 1.0F : 0.0F, this.O00000000(var31, this.O0000000000OO0));
            } else if (var9 instanceof NumberSetting var12) {
               float var30 = !this.O00000000000.O00000000OOOOO() ? O0000O00000OO.O00000000(var12) : 0.0F;
               boolean var33 = !this.O00000000000.O00000000OOOOO() && this.O00000000000.O0000000OO0O0O() == var12;
               this.O00000000000.O00000000(O0000O000O00O0.O00000000(var9), var30, var30 > 0.0F ? this.O0000000000OO0 : this.O000000000OO00);
               this.O00000000000.O00000000(O0000O000O00O0.O0000000000000(var9), var30, var30 > 0.0F ? this.O000000000O00O : this.O000000000OO00);
               this.O00000000000.O00000000(O0000O000O00O0.O000000000000O(var9), var33 ? 1.0F : 0.0F, this.O00000000(var33, this.O0000000000OO0));
            } else if (var9 instanceof ColorSetting var13) {
               float var29 = !this.O00000000000.O00000000OOOOO() ? O0000O00000OO.O00000000(var13) : 0.0F;
               this.O00000000000.O00000000(O0000O000O00O0.O00000000(var9), var29, var29 > 0.0F ? this.O0000000000OO0 : this.O000000000OO00);
               boolean var32 = !this.O00000000000.O00000000OOOOO() && this.O00000000000.O0000000OOOOOO() == var13;
               float var19 = this.O00000000000.O00000000(O0000O000O00O0.O00000000000O(var9));
               this.O00000000000.O00000000(O0000O000O00O0.O00000000000O(var9), var32 ? 1.0F : 0.0F, this.O00000000(var32, this.O0000000000OO0));
               if (var32) {
                  float var20 = var13.O0000000000O00;
                  float var21 = 1.0F - var13.O0000000000O0O;
                  if (var19 < 0.01F) {
                     O0000O000O00O var22 = this.O00000000000
                        .O00000000O0O0()
                        .computeIfAbsent(O0000O000O00O0.O00000000000O0(var9), string -> new O0000O000O00O(var20));
                     var22.O00000000(var20);
                     O0000O000O00O var23 = this.O00000000000
                        .O00000000O0O0()
                        .computeIfAbsent(O0000O000O00O0.O00000000000OO(var9), string -> new O0000O000O00O(var21));
                     var23.O00000000(var21);
                     O0000O000O00O var24 = this.O00000000000
                        .O00000000O0O0()
                        .computeIfAbsent(O0000O000O00O0.O0000000000O(var9), string -> new O0000O000O00O(var29));
                     var24.O00000000(var29);
                     O0000O000O00O var25 = this.O00000000000
                        .O00000000O0O0()
                        .computeIfAbsent(O0000O000O00O0.O0000000000O0(var9), string -> new O0000O000O00O(var13.O0000000000OO));
                     var25.O00000000(var13.O0000000000OO);
                  } else {
                     this.O00000000000.O00000000(O0000O000O00O0.O00000000000O0(var9), var20, this.O000000000O00O);
                     this.O00000000000.O00000000(O0000O000O00O0.O00000000000OO(var9), var21, this.O000000000O00O);
                     this.O00000000000.O00000000(O0000O000O00O0.O0000000000O(var9), var29, this.O000000000O00O);
                     this.O00000000000.O00000000(O0000O000O00O0.O0000000000O0(var9), var13.O0000000000OO, this.O000000000O00O);
                  }
               } else {
                  this.O00000000000.O00000000(O0000O000O00O0.O00000000000O0(var9), var13.O0000000000O00, this.O000000000OO00);
                  this.O00000000000.O00000000(O0000O000O00O0.O00000000000OO(var9), 1.0F - var13.O0000000000O0O, this.O000000000OO00);
                  this.O00000000000.O00000000(O0000O000O00O0.O0000000000O(var9), var29, this.O000000000OO00);
                  this.O00000000000.O00000000(O0000O000O00O0.O0000000000O0(var9), var13.O0000000000OO, this.O000000000OO00);
               }
            } else if (var9 instanceof ModeSetting var14) {
               boolean var28 = !this.O00000000000.O00000000OOOOO() && var14.O00000000000O0;
               this.O00000000000.O00000000(O0000O000O00O0.O000000000000(var9), var28 ? 1.0F : 0.0F, this.O00000000(var28, this.O0000000000OO0));
            } else if (var9 instanceof O000000O00 var15) {
               boolean var27 = !this.O00000000000.O00000000OOOOO() && var15.O000000000000;
               this.O00000000000.O00000000(O0000O000O00O0.O000000000000(var9), var27 ? 1.0F : 0.0F, this.O00000000(var27, this.O0000000000OO0));
            } else if (var9 instanceof GroupSetting var16) {
               for (int var17 = 0; var17 < var16.O00000000000.size(); var17++) {
                  boolean var18 = !this.O00000000000.O00000000OOOOO() && var16.O00000000000.get(var17).O0000000000();
                  this.O00000000000.O00000000(O0000O000O00O0.O00000000(var9, var17), var18 ? 1.0F : 0.0F, this.O00000000(var18, this.O0000000000OO0));
               }
            }

            var7++;
         }
      }
   }

   private void O00000000OOO() {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         AutoBuy var1 = WildClient.O00000000.O000000000.O00000000(AutoBuy.class);
         if (var1 != null) {
            O0000O000O0000.O00000000(var1, this.O00000000000, this.O0000000000OO0, this.O000000000O00O);
            boolean var2 = !this.O00000000000.O00000000OOOOO() && var1.O0000000000000;
            this.O00000000000.O00000000(O0000O000O00O0.O0000000000(var1), var2 ? 1.0F : 0.0F, this.O00000000(var2, this.O0000000000OO0));
         }
      }
   }

   private void O00000000OOO0() {
      boolean var1 = !this.O00000000000.O00000000OOOOO() && this.O00000000000.O000000O0O0O0();
      this.O00000000000.O00000000(O0000O000O00O0.O0000000000OO(), var1 ? 1.0F : 0.0F, this.O00000000(var1, this.O000000000OO));
   }

   private void O00000000OOO00() {
      if (!this.O00000000000.O000000O0O0O0() && !this.O00000000000.O00000000OO00()) {
         boolean var1 = false;
         float var2 = O0000O0000OOO0.O0000000000(this.O0000000000000, this.O000000000OOO0);
         float var3 = this.O0000000000000.O00000000000() + this.O000000000OOO0.O00000000(89.0F);
         if (O0000O00000OO.O00000000(
            this.O00000000000,
            O0000O0000OOO0.O00000000(this.O0000000000000, this.O000000000OOO0),
            O0000O0000OOO0.O000000000(this.O0000000000000, this.O000000000OOO0),
            O0000O0000OOO0.O00000000(this.O000000000OOO0),
            O0000O0000OOO0.O00000000(this.O000000000OOO0)
         )) {
            var1 = true;
         }

         if (O0000O00000OO.O00000000(
            this.O00000000000,
            SearchBarRenderer.O0000000000(this.O0000000000000, this.O000000000OOO0),
            SearchBarRenderer.O00000000000(this.O0000000000000, this.O000000000OOO0),
            SearchBarRenderer.O0000000000(this.O000000000OOO0),
            SearchBarRenderer.O00000000000(this.O000000000OOO0)
         )) {
            var1 = true;
         }

         if (O00000O0OOO0O0.O00000000()
            && O0000O00000OO.O00000000(
               this.O00000000000,
               SearchBarRenderer.O00000000(this.O0000000000000, this.O000000000OOO0),
               SearchBarRenderer.O000000000(this.O0000000000000, this.O000000000OOO0),
               SearchBarRenderer.O00000000(this.O000000000OOO0),
               SearchBarRenderer.O000000000(this.O000000000OOO0)
            )) {
            var1 = true;
         }

         Category[] var4 = Category.values();

         for (int var5 = 0; var5 < var4.length; var5++) {
            float var6 = var3 + var5 * this.O000000000OOO0.O00000000(56.0F);
            if (O0000O00000OO.O00000000(this.O00000000000, var2, var6, this.O000000000OOO0.O00000000(40.0F), this.O000000000OOO0.O00000000(40.0F))) {
               var1 = true;
               break;
            }
         }

         float var15 = O0000O0000OOO0.O000000000(this.O000000000OOO0);
         float var16 = O0000O0000OOO0.O000000000000(this.O0000000000000, this.O000000000OOO0);
         if (O0000O00000OO.O00000000(this.O00000000000, var2, var16, var15, var15)) {
            var1 = true;
         }

         float var7 = O0000O0000OOO0.O0000000000(this.O0000000000000, this.O000000000OOO0);
         float var8 = O0000O0000OOO0.O00000000000(this.O0000000000000, this.O000000000OOO0);
         if (O0000O00000OO.O00000000(this.O00000000000, var7, var8, var15, var15)) {
            var1 = true;
         }

         if (this.O00000000000.O000000O0O0O00() && this.O00000000000.O000000OO00000() != null && this.O00000000000.O000000OO00000().startsWith("theme:")) {
            O0000O0000000O var9 = O0000O0000000O.O00000000(this.O0000000000000, this.O000000000OOO0);
            if (O0000O00000OO.O00000000(this.O00000000000, var9.O00000000(), var9.O000000000(), var9.O0000000000(), var9.O00000000000())) {
               float var10 = this.O00000000000.O0000000000OOO();
               List var11 = this.O00000000000.O00000000(this.O0000000000O00);
               if (var11 == null) {
                  var11 = java.util.Collections.emptyList();
               }

               for (int var12 = 0; var12 < var11.size(); var12++) {
                  int var13 = (Integer)var11.get(var12);
                  O0000O0000000O.W330 var14 = var9.O00000000(var12, var10);
                  if (("theme:" + var13).equals(this.O00000000000.O000000OO00000())
                     && O0000O00000OO.O00000000(this.O00000000000, var14.x(), var14.y(), var14.width(), var14.height())) {
                     var1 = true;
                     break;
                  }
               }
            }
         }

         if (!var1) {
            this.O00000000000.O000000000OO0O();
         }

         boolean var17 = !this.O00000000000.O00000000OOOOO() && this.O00000000000.O000000000OOO();
         this.O00000000000.O00000000(O0000O000O00O0.O0000000000OO0(), var17 ? 1.0F : 0.0F, this.O00000000(var17, this.O0000000000OO0));
      } else {
         this.O00000000000.O000000000OO0O();
         this.O00000000000.O00000000(O0000O000O00O0.O0000000000OO0(), 0.0F, this.O000000000OO00);
      }
   }

   private void O00000000OOO0O() {
      for (O0000O00000000 var2 : this.O00000000O.O000000000()) {
         boolean var3 = !this.O00000000000.O00000000OOOOO()
            && O0000O00000OO.O00000000(this.O00000000000, var2.O000000000(), var2.O0000000000(), var2.O00000000000(), var2.O000000000000());
         this.O00000000000.O00000000(O0000O000O00O0.O000000000(var2.O00000000()), var3 ? 1.0F : 0.0F, this.O000000000O0O0);
      }
   }

   private O0000O000O0O00 O00000000(boolean bl, O0000O000O0O00 o0000O000O0O00) {
      return !this.O00000000000.O00000000OOOOO() && bl ? o0000O000O0O00 : this.O000000000OO00;
   }

   @Generated
   public O0000O000O0O0 O00000000000OO() {
      return this.O00000000000;
   }

   @Generated
   public O0000O0000 O0000000000O() {
      return this.O000000000000;
   }

   @Generated
   public O00000OOOOOOOO O0000000000O0() {
      return this.O0000000000000;
   }

   @Generated
   public O0000O000 O0000000000O00() {
      return this.O000000000000O;
   }

   @Generated
   public O0000O000000 O0000000000O0O() {
      return this.O00000000000O;
   }

   @Generated
   public O00000OOOOOOO0 O0000000000OO() {
      return this.O00000000000O0;
   }

   @Generated
   public O0000O0000OO00 O0000000000OO0() {
      return this.O00000000000OO;
   }

   @Generated
   public O00000OOOOOO0 O0000000000OOO() {
      return this.O0000000000O;
   }

   @Generated
   public O00000OOOOOO0O O000000000O() {
      return this.O0000000000O0;
   }

   @Generated
   public O0000O000OO O000000000O0() {
      return this.O0000000000O00;
   }

   @Generated
   public O00000OOO000OO O000000000O00() {
      return this.O0000000000O0O;
   }

   @Generated
   public O0000O000O0O00 O000000000O000() {
      return this.O0000000000OO;
   }

   @Generated
   public O0000O000O0O00 O000000000O00O() {
      return this.O0000000000OO0;
   }

   @Generated
   public O0000O000O0O00 O000000000O0O() {
      return this.O0000000000OOO;
   }

   @Generated
   public O0000O000O0O00 O000000000O0O0() {
      return this.O000000000O;
   }

   @Generated
   public O0000O000O0O00 O000000000O0OO() {
      return this.O000000000O0;
   }

   @Generated
   public O0000O000O0O00 O000000000OO() {
      return this.O000000000O00;
   }

   @Generated
   public O0000O000O0O00 O000000000OO0() {
      return this.O000000000O000;
   }

   @Generated
   public O0000O000O0O00 O000000000OO00() {
      return this.O000000000O00O;
   }

   @Generated
   public O0000O000O0O00 O000000000OO0O() {
      return this.O000000000O0O;
   }

   @Generated
   public O0000O000O0O00 O000000000OOO() {
      return this.O000000000O0O0;
   }

   @Generated
   public O0000O000O0O00 O000000000OOO0() {
      return this.O000000000O0OO;
   }

   @Generated
   public O0000O000O0O00 O000000000OOOO() {
      return this.O000000000OO;
   }

   @Generated
   public O0000O000O0O00 O00000000O() {
      return this.O000000000OO0;
   }

   @Generated
   public O0000O000O0O00 O00000000O0() {
      return this.O000000000OO00;
   }

   @Generated
   public O0000O000O0O00 O00000000O00() {
      return this.O000000000OO0O;
   }

   @Generated
   public ClickGuiRenderer O00000000O000() {
      return this.O000000000OOO;
   }

   @Generated
   public O0000O00000 O00000000O0000() {
      return this.O000000000OOO0;
   }

   @Generated
   public O0000O000O0OOO O00000000O000O() {
      return this.O000000000OOOO;
   }

   @Generated
   public O0000O0000000 O00000000O00O() {
      return this.O00000000O;
   }

   @Generated
   public boolean O00000000O00O0() {
      return this.O00000000O0;
   }

   @Generated
   public Theme O00000000O00OO() {
      return this.O00000000O00;
   }

   @Generated
   public long O00000000O0O() {
      return this.O00000000O000;
   }

   @Generated
   public boolean O00000000O0O0() {
      return this.O00000000O0000;
   }
}
