package oxxxde;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotakbaz.rain.client.render.texture.GlTex;

// $VF: Compiled from heavy
public class شأ {
   protected static final List<GlTex> ALL_TEXTURES = new CopyOnWriteArrayList<>();
   protected static ضّ glController = new اَ();

   public static void close() {
      ALL_TEXTURES.forEach(GlTex::delete);
      ALL_TEXTURES.clear();
   }

   public static void setGlController(ضّ controller) {
      glController = controller;
   }

   public static void addTexture(GlTex texture) {
      ALL_TEXTURES.add(texture);
   }

   public static void removeTexture(GlTex texture) {
      ALL_TEXTURES.remove(texture);
   }

   public static ضّ getGlController() {
      return glController;
   }
}
