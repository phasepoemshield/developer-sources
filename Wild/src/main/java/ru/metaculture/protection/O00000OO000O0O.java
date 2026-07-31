package ru.metaculture.protection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.MinecraftClient;
import org.wild.module.api.Module;

public class O00000OO000O0O {
   public static MinecraftClient O00000000 = MinecraftClient.getInstance();
   public static O0000O00OOO00 O000000000 = new O0000O0O0000O(200, 1.0);
   public static O0000O00OOO00 O0000000000 = new O0000O0O0000O(500, 1.0);
   public static O0000O00OOO00 O00000000000 = new O0000O0O0000O(500, 1.0);
   public static O0000O00OOO00 O000000000000 = new O0000O0O0000O(500, 1.0);
   public static O0000O00OOO00 O0000000000000 = new O0000O0O0000O(1000, 1.0);
   public static BooleanSetting O000000000000O = new BooleanSetting("Блюр нада?", true);
   public static O0000O0O000 O00000000000O = new O0000O0O000(O0000O0O0000.EASE_OUT_SINE, 1500L);
   public static O0000O00OOOO0 O00000000000O0 = new O0000O00OOOO0();
   public static O0000O00OOOOOO O00000000000OO = new O0000O00OOOOOO();
   public static O0000O00OOOOOO O0000000000O = new O0000O00OOOOOO();
   public static O0000O00OOOOOO O0000000000O0 = new O0000O00OOOOOO();
   public static O0000O00OOOOOO O0000000000O00 = new O0000O00OOOOOO();
   public static O0000O00OOOOOO O0000000000O0O = new O0000O00OOOOOO();
   public static ColorSetting O0000000000OO = null;
   public static float O0000000000OO0 = 0.0F;
   public static float O0000000000OOO = 0.0F;
   public static boolean O000000000O = false;
   public static boolean O000000000O0 = false;
   public static boolean O000000000O00 = false;
   public static KeybindSetting O000000000O000 = null;
   public static TextSetting O000000000O00O = null;
   public static NumberSetting O000000000O0O = null;
   public static Module O000000000O0O0 = null;
   public static float O000000000O0OO = 0.0F;
   public static float O000000000OO = 0.0F;
   public static float O000000000OO0 = 0.0F;
   public static String O000000000OO00 = "";
   public static boolean O000000000OO0O = false;
   public static long O000000000OOO = 0L;
   public static boolean O000000000OOO0 = false;
   public static long O000000000OOOO = 0L;
   public static final int O00000000O = -200;
   public static final int O00000000O0 = -201;
   public static boolean O00000000O00 = false;
   public static float O00000000O000;
   public static float O00000000O0000;
   public static float O00000000O000O;
   public static float O00000000O00O;
   public static int O00000000O00O0 = 0;
   public static int O00000000O00OO = 0;
   public static Category[] O00000000O0O;
   public static Theme O00000000O0O0;
   public static Theme O00000000O0O00;
   public static Theme[] O00000000O0O0O;
   public static Category O00000000O0OO;
   public static List<Module> O00000000O0OO0;
   private static O0000O00OOO0 O00000000OO00O;
   public static Set<Module> O00000000O0OOO = new HashSet<>();
   public static Map<Module, O0000O00OOOOOO> O00000000OO = new HashMap<>();
   public static Map<Module, O0000O00OOOOOO> O00000000OO0 = new HashMap<>();
   public static Map<Module, O0000O00OOOOOO> O00000000OO00 = new HashMap<>();
   public static Map<NumberSetting, O0000O00OOOOOO> O00000000OO000 = new HashMap<>();

   public static O0000O00OOO0 O00000000() {
      if (O00000000OO00O == null) {
         O00000000OO00O = new O0000O00OOO0();
      }

      return O00000000OO00O;
   }

   public static O0000O00OOOOOO O00000000(Module module) {
      return O00000000OO.computeIfAbsent(module, modulex -> new O0000O00OOOOOO());
   }

   public static O0000O00OOOOOO O000000000(Module module) {
      return O00000000OO0.computeIfAbsent(module, modulex -> new O0000O00OOOOOO());
   }

   public static O0000O00OOOOOO O0000000000(Module module) {
      O0000O00OOOOOO var1 = O00000000OO00.computeIfAbsent(module, modulex -> new O0000O00OOOOOO());
      if (module.O000000000000 != -1 && var1.O00000000000O() == 0.0 && var1.O0000000000O() == 0.0) {
         var1.O00000000000(1.0);
      }

      return var1;
   }

   public static O0000O00OOOOOO O00000000(NumberSetting o000000O000) {
      return O00000000OO000.computeIfAbsent(o000000O000, o000000O0002 -> {
         O0000O00OOOOOO var2 = new O0000O00OOOOOO();
         float var3 = (o000000O000.O00000000000 - o000000O000.O000000000000) / (o000000O000.O0000000000000 - o000000O000.O000000000000);
         var2.O00000000000(var3);
         return var2;
      });
   }
}
