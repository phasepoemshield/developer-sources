package oxxxde;

import java.util.HashMap;
import java.util.Map;
import kotakbaz.rain.client.render.texture.texture.GLTexture;

// $VF: Compiled from heavy
public class ذَ {
   private static final Map<String, GLTexture> TEXTURES = new HashMap<>();

   public static GLTexture getTexture(String key) {
      return TEXTURES.get(key);
   }

   public static boolean addTexture(String texture, GLTexture key) {
      if (TEXTURES.containsKey(key)) {
         return false;
      }

      TEXTURES.put(key, texture);
      return true;
   }

   private static GLTexture register(String texture, GLTexture key) {
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
