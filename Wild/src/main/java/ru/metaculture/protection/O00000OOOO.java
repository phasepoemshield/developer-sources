package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public final class O00000OOOO implements AutoCloseable {
   private final O00000OOO0OOO O00000000;
   private final ShaderSourceBuilder O000000000;
   private final O00000OOO0 O0000000000 = new O00000OOO0();
   private final Map<String, O00000OOOO.W305> O00000000000 = new HashMap<>();

   public O00000OOOO(O00000OOO0OOO o00000OOO0OOO, ShaderSourceBuilder o00000OOO00OOO) {
      this.O00000000 = o00000OOO0OOO;
      this.O000000000 = o00000OOO00OOO;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(
      O00000OOO0OO00 o00000OOO0OO00,
      String string,
      O00000OOOO0 o00000OOOO0,
      RenderManager o0000O00OO0O0,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k,
      ColorScheme o0000O000O0OO,
      float l
   ) {
      if (o00000OOO0OO00 != null && string != null && o0000O00OO0O0 != null && !(h <= 2.0F) && !(i <= 2.0F) && !(l <= 0.001F)) {
         O00000OOO0OO0O var13 = o00000OOO0OO00.O0000000000(string);
         O00000OOO0O00O var14 = var13 == null ? null : this.O00000000.O00000000(var13.O000000000());
         O00000OOO0O0OO var15 = O00000000(var14);
         if (var15 != null) {
            String var16 = "__node_preview_" + string;
            O00000OOOO.W305 var17 = this.O00000000000.get(var16);
            int var18 = o00000OOO0OO00.O000000000000();
            if (var17 == null || var17.version != var18 || !var15.id().equals(var17.pinId)) {
               O00000OOO0OO00 var19 = o00000OOO0OO00.O000000000000(string);
               var19.O00000000(O00000OOOO00O.PREVIEW_ONLY.O00000000());
               O00000OOO00OO0 var20 = this.O000000000.O00000000(var19, string, var15.id(), var15.type());
               var17 = new O00000OOOO.W305(var18, var15.id(), var20 == null ? "" : var20.hash(), var20);
               this.O00000000000.put(var16, var17);
            }

            O00000OOO00OO0 var27 = var17.compilation;
            if (var27 != null && var27.ok()) {
               o0000O00OO0O0.O0000000000();
               O0000O00O0OOO0.W373 var28 = O0000O00O0OOO0.O00000000();
               boolean var25 = false /* VF: Semaphore variable */;

               label86: {
                  try {
                     var25 = true;
                     int var21 = Math.max(32, Math.min(512, (int)Math.ceil(h)));
                     int var22 = Math.max(32, Math.min(384, (int)Math.ceil(i)));
                     this.O0000000000.O00000000(var21, var22);
                     if (!this.O0000000000.O000000000000()) {
                        var25 = false;
                        break label86;
                     }

                     this.O0000000000.O00000000();
                     GL11.glDisable(3089);
                     GlStateManager._enableBlend();
                     GL11.glEnable(3042);
                     GL11.glClearColor(0.008F, 0.01F, 0.015F, 0.0F);
                     GL11.glClear(16384);
                     O00000OOOO00OO.O00000000(
                        "__node_preview_" + var17.hash, var27, 0.0F, 0.0F, var21, var22, var21, var22, h * 0.5F, i * 0.5F, o0000O000O0OO, l
                     );
                     var25 = false;
                  } finally {
                     if (var25) {
                        O0000O00O0OOO0.O00000000(var28);
                     }
                  }

                  O0000O00O0OOO0.O00000000(var28);
                  o0000O00OO0O0.O000000000(this.O0000000000.O000000000(), f, g, h, i, ColorScheme.O00000000(-1, Math.round(255.0F * l)), true);
                  return;
               }

               O0000O00O0OOO0.O00000000(var28);
            } else {
               O00000000(o0000O00OO0O0, f, g, h, i, o0000O000O0OO, l);
            }
         }
      }
   }

   private static O00000OOO0O0OO O00000000(O00000OOO0O00O o00000OOO0O00O) {
      if (o00000OOO0O00O != null && !o00000OOO0O00O.O0000000000000().isEmpty()) {
         for (O00000OOO0O0OO var2 : o00000OOO0O00O.O0000000000000()) {
            if ("color".equals(var2.id()) || "mask".equals(var2.id()) || "value".equals(var2.id())) {
               return var2;
            }
         }

         return o00000OOO0O00O.O0000000000000().get(0);
      } else {
         return null;
      }
   }

   private static void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, ColorScheme o0000O000O0OO, float j) {
      int var7 = ColorScheme.O00000000(40, 10, 14, Math.round(132.0F * j));
      int var8 = ColorScheme.O00000000(255, 134, 146, Math.round(230.0F * j));
      o0000O00OO0O0.O00000000(f, g, h, i, 8.0F, var7);
      float var9 = O0000O00000OO.O00000000(null, FontRegistry.O00000000, "preview error", 9.0F);
      O0000O00000OO.O00000000(o0000O00OO0O0, null, FontRegistry.O00000000, f + (h - var9) * 0.5F, g, i, 9.0F, "preview error", var8);
   }

   @Override
   public void close() {
      this.O0000000000.close();
      this.O00000000000.clear();
   }

   record W305(int version, String pinId, String hash, O00000OOO00OO0 compilation) {
   }
}
