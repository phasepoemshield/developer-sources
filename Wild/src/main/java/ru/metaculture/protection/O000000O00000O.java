package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import org.wild.module.api.Module;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class O000000O00000O {
   private static final O000000O00000O O00000000 = new O000000O00000O();
   private static final MinecraftClient O000000000 = MinecraftClient.getInstance();
   private boolean O0000000000 = false;
   private boolean O00000000000 = false;

   public static O000000O00000O O00000000() {
      return O00000000;
   }

   @Compile
   public void O000000000() {}

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (o0000000O0O0.O0000000000000() == 1) {
         if (o0000000O0O0.O00000000000() >= 0) {
            if (WildClient.O00000000.O000000000 != null) {
               Module[] var2 = WildClient.O00000000.O000000000.O00000000(o0000000O0O0.O00000000000());
               if (var2 != null) {
                  for (Module var6 : var2) {
                     var6.a_();
                  }
               }

               this.O000000000(o0000000O0O0.O00000000000());
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O00 o0000000O0O00) {
      if (o0000000O0O00.O00000000000O0()) {
         if (O000000000 == null || O000000000.currentScreen == null) {
            if (!this.O00000000000) {
               if (WildClient.O00000000.O000000000 != null) {
                  int var2 = -100 - o0000000O0O00.O00000000000();
                  Module[] var3 = WildClient.O00000000.O000000000.O00000000(var2);
                  if (var3 != null) {
                     for (Module var7 : var3) {
                        var7.a_();
                     }
                  }

                  this.O000000000(var2);
               }
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O000 o0000000O0O000) {
      if (O000000000 == null || O000000000.currentScreen == null) {
         if (!this.O00000000000 && WildClient.O00000000.O000000000 != null) {
            if (!(Math.abs(o0000000O0O000.O000000000000()) < 1.0E-4)) {
               int var2 = o0000000O0O000.O000000000000() > 0.0 ? KeybindSetting.WHEEL_UP : KeybindSetting.WHEEL_DOWN;
               KeybindSetting.O0000000000(var2);
               Module[] var3 = WildClient.O00000000.O000000000.O00000000(var2);
               if (var3 != null) {
                  for (Module var7 : var3) {
                     var7.a_();
                  }
               }

               this.O000000000(var2);
            }
         }
      }
   }

   private void O000000000(int i) {
      for (Module var3 : WildClient.O00000000.O000000000.O00000000) {
         for (Setting var5 : var3.O0000000000O()) {
            if (var5 instanceof BooleanSetting var6) {
               this.O00000000(var6, i);
            } else if (var5 instanceof GroupSetting var7) {
               for (BooleanSetting var9 : var7.O00000000000) {
                  this.O00000000(var9, i);
               }
            }
         }
      }
   }

   private void O00000000(BooleanSetting o0000000OOO0O0, int i) {
      if (o0000000OOO0O0.O0000000000000 == i && !o0000000OOO0O0.O000000000000O) {
         o0000000OOO0O0.O000000000(!o0000000OOO0O0.O00000000000());
      }
   }

   public void O0000000000() {
   }

   public void O00000000(String string) {
   }

   public void O00000000(boolean bl) {
      this.O00000000000 = bl;
   }

   public boolean O00000000000() {
      return this.O00000000000;
   }

   public void O00000000(Module module, int i, O000000O0000O o000000O0000O) {
      if (module != null) {
         module.O000000000000 = i;
      }
   }

   public void O00000000(Module module, Setting o0000000OOO00O, O000000O0000O o000000O0000O, int i, Object object) {
   }

   public void O00000000(String string, String string2) {
   }

   public Object O000000000(String string, String string2) {
      return null;
   }

   public String O00000000(int i) {
      if (i == -200) {
         return "Wheel Up";
      } else if (i == -201) {
         return "Wheel Down";
      } else if (i <= -100) {
         return "Mouse " + (Math.abs(i + 100) + 1);
      } else if (i == -1) {
         return "None";
      } else if (i >= 65 && i <= 90) {
         return String.valueOf((char)(65 + (i - 65)));
      } else if (i >= 48 && i <= 57) {
         return String.valueOf((char)(48 + (i - 48)));
      } else if (i == 32) {
         return "Space";
      } else if (i == 257) {
         return "Enter";
      } else if (i == 256) {
         return "Escape";
      } else if (i == 259) {
         return "Backspace";
      } else if (i == 258) {
         return "Tab";
      } else if (i == 340 || i == 344) {
         return "Shift";
      } else if (i == 341 || i == 345) {
         return "Ctrl";
      } else if (i == 342 || i == 346) {
         return "Alt";
      } else {
         return i >= 290 && i <= 314 ? "F" + (i - 290 + 1) : "Key " + i;
      }
   }

   static {
      Loader.initialize();
   }
}
