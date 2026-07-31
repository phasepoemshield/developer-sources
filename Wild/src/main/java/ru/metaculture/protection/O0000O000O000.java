package ru.metaculture.protection;

import java.util.List;
import net.minecraft.client.gui.DrawContext;
import org.wild.module.api.Module;

public interface O0000O000O000 {
   boolean O00000000(Module module);

   default boolean O00000000(Module module, O0000O000O0O0 o0000O000O0O0) {
      return false;
   }

   default void O00000000(O0000O000O0O0 o0000O000O0O0) {
   }

   default void O000000000(O0000O000O0O0 o0000O000O0O0) {
   }

   float O00000000(Module module, O0000O00000 o0000O00000, O0000O000O0O0 o0000O000O0O0);

   void O00000000(Module module, O0000O000O0O0 o0000O000O0O0, O0000O000O0O00 o0000O000O0O00, O0000O000O0O00 o0000O000O0O002);

   void O00000000(
      RenderManager o0000O00OO0O0, DrawContext drawContext, O0000O000O0O0 o0000O000O0O0, O0000O00000000 o0000O00000000, O0000O000O0OOO o0000O000O0OOO
   );

   void O00000000(List<O00000OOOOOO> list, O0000O000O0O0 o0000O000O0O0, O0000O00000000 o0000O00000000, O0000O00000 o0000O00000);

   default boolean O00000000(O0000O000O0O0 o0000O000O0O0, O0000O0000000 o0000O0000000, O0000O00000 o0000O00000, float f, float g, double d) {
      return false;
   }

   default boolean O00000000(O0000O000O0O0 o0000O000O0O0, float f, float g) {
      return false;
   }

   default boolean O0000000000(O0000O000O0O0 o0000O000O0O0) {
      return false;
   }

   default boolean O00000000(O0000O000O0O0 o0000O000O0O0, int i) {
      return false;
   }

   default boolean O00000000(O0000O000O0O0 o0000O000O0O0, char c) {
      return false;
   }
}
