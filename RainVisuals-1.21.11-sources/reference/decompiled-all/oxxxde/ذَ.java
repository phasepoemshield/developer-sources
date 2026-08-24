package oxxxde;

import java.util.HashMap;
import java.util.Map;

// $VF: Compiled from heavy
public class ذَ {
   private static final Map<String, ض> TEXTURES = new HashMap<>();

   public static ض getTexture(String key) {
      return TEXTURES.get(key);
   }

   public static boolean addTexture(String texture, ض key) {
      if (TEXTURES.containsKey(key)) {
         return false;
      }

      TEXTURES.put(key, texture);
      return true;
   }

   private static ض register(String texture, ض key) {
      TEXTURES.put(key, texture);
      return texture;
   }

   public static boolean removeTexture(String key) {
      if (!TEXTURES.containsKey(key)) {
         return false;
      }

      TEXTURES.remove(key);
      return true;
   }
}
