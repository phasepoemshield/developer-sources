package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.client.MinecraftClient;

public class Helper383 {
   private static final MinecraftClient mc = MinecraftClient.getInstance();
   private static final Map<String, List<Helper382>> PATTERNS = new HashMap<>();
   private static final List<Helper382> CURRENT_RECORD = new CopyOnWriteArrayList<>();
   private static String currentName = null;
   private static String currentPlayName = null;
   private static String lastRecordedName = null;
   private static List<Helper382> currentPlay = Collections.emptyList();
   private static int playIndex = 0;
   private static boolean recording = false;
   private static boolean playing = false;

   public Helper383() {
   }

   private static String method3877(String var0) {
      if (var0 == null) {
         return "default";
      } else {
         String var1 = var0.trim().replaceAll("\\s+", "_").toLowerCase(Locale.US);
         return var1.isEmpty() ? "default" : var1;
      }
   }

   public static void method3878(String var0) {
      if (mc.player != null) {
         currentName = method3877(var0);
         CURRENT_RECORD.clear();
         currentPlay = Collections.emptyList();
         playIndex = 0;
         recording = true;
         playing = false;
         currentPlayName = null;
      }
   }

   public static void method3879() {
      if (recording && currentName != null && !currentName.isEmpty()) {
         recording = false;
         if (CURRENT_RECORD.isEmpty()) {
            currentName = null;
         } else {
            String var0 = currentName;
            PATTERNS.put(var0, new ArrayList<>(CURRENT_RECORD));
            lastRecordedName = var0;
            currentName = null;
            method3881(var0);
         }
      } else {
         recording = false;
      }
   }

   public static void method3880(float var0, float var1) {
      if (recording) {
         CURRENT_RECORD.add(new Helper382(var0, var1));
      }
   }

   public static boolean method3881(String var0) {
      String var1 = method3877(var0);
      List var2 = PATTERNS.get(var1);
      if (var2 != null && !var2.isEmpty()) {
         currentPlay = var2;
         playIndex = 0;
         playing = true;
         recording = false;
         currentPlayName = var1;
         return true;
      } else {
         return false;
      }
   }

   public static void method3882() {
      playing = false;
      currentPlay = Collections.emptyList();
      playIndex = 0;
      currentPlayName = null;
   }

   public static Helper382 method3883(String var0) {
      if (playing && !currentPlay.isEmpty()) {
         if (playIndex >= currentPlay.size()) {
            playIndex = 0;
         }

         return currentPlay.get(playIndex++);
      } else {
         return null;
      }
   }

   public static boolean method3884() {
      return recording;
   }

   public static boolean method3885() {
      return playing;
   }

   public static Set<String> method3886() {
      return new LinkedHashSet<>(PATTERNS.keySet());
   }

   public static String method3887() {
      return currentPlayName;
   }

   public static String method3888() {
      return lastRecordedName;
   }
}
