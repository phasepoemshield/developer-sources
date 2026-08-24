package oxxxde;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// $VF: Compiled from heavy
public class شأ {
   protected static final List<طج> ALL_TEXTURES = new CopyOnWriteArrayList<>();
   protected static ضّ glController = new اَ();

   public static void close() {
      ALL_TEXTURES.forEach(طج::delete);
      ALL_TEXTURES.clear();
   }

   public static void setGlController(ضّ controller) {
      glController = controller;
   }

   public static void addTexture(طج texture) {
      ALL_TEXTURES.add(texture);
   }

   public static void removeTexture(طج texture) {
      ALL_TEXTURES.remove(texture);
   }

   public static ضّ getGlController() {
      return glController;
   }
}
