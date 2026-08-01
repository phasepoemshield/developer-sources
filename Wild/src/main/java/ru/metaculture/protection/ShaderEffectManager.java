package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import net.minecraft.entity.Entity;
import org.json.JSONArray;
import org.json.JSONObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class ShaderEffectManager {
   private static final ShaderEffectManager O00000000 = new ShaderEffectManager();
   static final float[] O000000000 = new float[]{0.0F, 0.0F, 0.0F, 0.0F};
   private static final int O0000000000 = 48;
   private static final long O00000000000 = 33L;
   private static final int O000000000000 = 6;
   private static final int O0000000000000 = 7;
   private final Map<String, ShaderEffectManager.W318> O000000000000O = new LinkedHashMap<>();
   private final Map<String, float[]> O00000000000O = new HashMap<>();
   private final Map<String, Integer> O00000000000O0 = new HashMap<>();
   private final Map<String, ShaderEffectManager.W316> O00000000000OO = new LinkedHashMap<>(16, 0.75F, true);
   private final ShaderEffectManager.W315 O0000000000O = new ShaderEffectManager.W315();
   private final ShaderEffectManager.W317 O0000000000O0 = new ShaderEffectManager.W317();
   private boolean O0000000000O00;

   private ShaderEffectManager() {
   }

   public static ShaderEffectManager O00000000() {
      return O00000000;
   }

   public synchronized void O00000000(O00000OOO0OOO o00000OOO0OOO) {
      if (o00000OOO0OOO != null) {
         if (!this.O0000000000O00) {
            this.O00000000000O();
            ShaderSourceBuilder.O00000000(this::O000000000);
            this.O0000000000O00 = true;
         }

         for (ShaderEffectManager.W318 var3 : this.O000000000000O.values()) {
            if (o00000OOO0OOO.O00000000(var3.id()) == null) {
               o00000OOO0OOO.O00000000(var3.toNodeDefinition());
            }
         }

         O000000000(o00000OOO0OOO);
      }
   }

   public synchronized void O00000000(ShaderEffectManager.W318 o00000000000) {
      if (o00000000000 != null) {
         this.O000000000000O.put(o00000000000.id(), o00000000000);
      }
   }

   public synchronized ShaderEffectManager.W318 O00000000(String string) {
      return this.O000000000000O.get(string);
   }

   public synchronized Collection<ShaderEffectManager.W318> O000000000() {
      return Collections.unmodifiableCollection(new ArrayList<>(this.O000000000000O.values()));
   }

   public synchronized List<ShaderEffectManager.W318> O00000000(O00000OOOO00O o00000OOOO00O) {
      O00000OOOO00O var2 = o00000OOOO00O == null ? O00000OOOO00O.PREVIEW_ONLY : o00000OOOO00O.O00000000000();
      ArrayList var3 = new ArrayList();

      for (ShaderEffectManager.W318 var5 : this.O000000000000O.values()) {
         if (var5.target().O00000000000() == var2) {
            var3.add(var5);
         }
      }

      return var3;
   }

   public ShaderEffectManager.W315 O0000000000() {
      return this.O0000000000O;
   }

   public ShaderEffectManager.W317 O00000000000() {
      return this.O0000000000O0;
   }

   public synchronized String O000000000(O00000OOOO00O o00000OOOO00O) {
      if (o00000OOOO00O != null && o00000OOOO00O != O00000OOOO00O.PREVIEW_ONLY) {
         StringBuilder var2 = new StringBuilder();

         for (ShaderEffectManager.W318 var4 : this.O000000000000O.values()) {
            if (var4.target().O00000000000() == o00000OOOO00O && !var4.glslPreamble().isBlank()) {
               var2.append(var4.glslPreamble());
               if (!var4.glslPreamble().endsWith("\n")) {
                  var2.append('\n');
               }
            }
         }

         return var2.toString();
      } else {
         return "";
      }
   }

   public boolean O00000000(O00000OOO0O00O o00000OOO0O00O, String string, O00000OOO0O00O o00000OOO0O00O2, String string2) {
      return this.O000000000(o00000OOO0O00O, string, o00000OOO0O00O2, string2) == null;
   }

   public String O000000000(O00000OOO0O00O o00000OOO0O00O, String string, O00000OOO0O00O o00000OOO0O00O2, String string2) {
      if (o00000OOO0O00O != null && o00000OOO0O00O2 != null) {
         O00000OOO0O0OO var5 = o00000OOO0O00O.O000000000(string);
         if (var5 == null) {
            return o00000OOO0O00O.O00000000() + " has no output slot '" + string + "'";
         } else {
            O00000OOO0O0OO var6 = o00000OOO0O00O2.O00000000(string2);
            if (var6 == null) {
               return o00000OOO0O00O2.O00000000() + " has no input slot '" + string2 + "'";
            } else {
               ShaderEffectManager.W320 var7 = ShaderEffectManager.W320.O00000000(var5.type());
               ShaderEffectManager.W320 var8 = ShaderEffectManager.W320.O00000000(var6.type());
               return var5.type() != var6.type() ? "type mismatch: " + var7.O00000000() + " -> " + var8.O00000000() : null;
            }
         }
      } else {
         return "unknown node definition";
      }
   }

   public JSONObject O00000000(O00000OOO0O00O o00000OOO0O00O) {
      JSONObject var2 = new JSONObject();
      if (o00000OOO0O00O == null) {
         return var2;
      } else {
         var2.put("id", o00000OOO0O00O.O00000000());
         JSONArray var3 = new JSONArray();

         for (O00000OOO0O0OO var5 : o00000OOO0O00O.O000000000000()) {
            var3.put(O00000000(var5));
         }

         JSONArray var7 = new JSONArray();

         for (O00000OOO0O0OO var6 : o00000OOO0O00O.O0000000000000()) {
            var7.put(O00000000(var6));
         }

         var2.put("inputs", var3);
         var2.put("outputs", var7);
         return var2;
      }
   }

   public JSONArray O00000000(O00000OOO0OO00 o00000OOO0OO00, O00000OOO0OOO o00000OOO0OOO) {
      JSONArray var3 = new JSONArray();
      if (o00000OOO0OO00 != null && o00000OOO0OOO != null) {
         for (O00000OOO0OO0 var5 : o00000OOO0OO00.O00000000000()) {
            O00000OOO0OO0O var6 = o00000OOO0OO00.O0000000000(var5.O00000000());
            O00000OOO0OO0O var7 = o00000OOO0OO00.O0000000000(var5.O0000000000());
            if (var6 != null && var7 != null) {
               O00000OOO0O00O var8 = o00000OOO0OOO.O00000000(var6.O000000000());
               O00000OOO0O00O var9 = o00000OOO0OOO.O00000000(var7.O000000000());
               if (this.O00000000(var8, var5.O000000000(), var9, var5.O00000000000())) {
                  JSONObject var10 = new JSONObject();
                  var10.put("from", var5.O00000000());
                  var10.put("fromSlot", var5.O000000000());
                  var10.put("to", var5.O0000000000());
                  var10.put("toSlot", var5.O00000000000());
                  var10.put("type", var8.O000000000(var5.O000000000()).type().O00000000());
                  var3.put(var10);
               }
            }
         }

         return var3;
      } else {
         return var3;
      }
   }

   public int O00000000(O00000OOO0OO00 o00000OOO0OO00, JSONArray jSONArray, O00000OOO0OOO o00000OOO0OOO) {
      if (o00000OOO0OO00 != null && jSONArray != null && o00000OOO0OOO != null) {
         int var4 = 0;

         for (int var5 = 0; var5 < jSONArray.length(); var5++) {
            JSONObject var6 = jSONArray.optJSONObject(var5);
            if (var6 != null) {
               String var7 = var6.optString("from", "");
               String var8 = var6.optString("fromSlot", "");
               String var9 = var6.optString("to", "");
               String var10 = var6.optString("toSlot", "");
               O00000OOO0OO0O var11 = o00000OOO0OO00.O0000000000(var7);
               O00000OOO0OO0O var12 = o00000OOO0OO00.O0000000000(var9);
               if (var11 != null && var12 != null) {
                  O00000OOO0O00O var13 = o00000OOO0OOO.O00000000(var11.O000000000());
                  O00000OOO0O00O var14 = o00000OOO0OOO.O00000000(var12.O000000000());
                  if (this.O00000000(var13, var8, var14, var10)) {
                     String var15 = var6.optString("type", "");
                     if ((var15.isBlank() || var15.equals(var13.O000000000(var8).type().O00000000()))
                        && o00000OOO0OO00.O00000000(var7, var8, var9, var10, o00000OOO0OOO)) {
                        var4++;
                     }
                  }
               }
            }
         }

         return var4;
      } else {
         return 0;
      }
   }

   public synchronized void O00000000(String string, float f, float g, float h, float i) {
      if (string != null && !string.isBlank()) {
         this.O00000000000O.put(string, new float[]{f, g, h, i});
      }
   }

   public synchronized void O00000000(String string, int i) {
      if (string != null && !string.isBlank()) {
         if (i <= 0) {
            this.O00000000000O0.remove(string);
         } else {
            this.O00000000000O0.put(string, i);
         }
      }
   }

   public void O00000000(float f, float g, float h, float i) {
      this.O00000000("uRadii", Math.max(0.0F, f), Math.max(0.0F, g), Math.max(0.0F, h), Math.max(0.0F, i));
   }

   public synchronized void O00000000(O0000O00OO0 o0000O00OO0, O00000OOOO00O o00000OOOO00O) {
      if (o0000O00OO0 != null) {
         O00000OOOO00O var3 = o00000OOOO00O == null ? O00000OOOO00O.PREVIEW_ONLY : o00000OOOO00O.O00000000000();

         for (ShaderEffectManager.W318 var5 : this.O000000000000O.values()) {
            if (var5.target().O00000000000() == var3) {
               for (ShaderEffectManager.W321 var7 : var5.uniforms()) {
                  int var8 = o0000O00OO0.O00000000(var7.name());
                  if (var8 >= 0) {
                     float[] var9 = this.O00000000000O.getOrDefault(var7.name(), var7.defaults());
                     switch (var7.kind()) {
                        case SAMPLER2D:
                           GL13.glActiveTexture(33984 + var7.textureUnit());
                           GL11.glBindTexture(3553, this.O0000000000(var7.name()));
                           GL20.glUniform1i(var8, var7.textureUnit());
                           break;
                        case VEC4:
                           GL20.glUniform4f(var8, var9[0], var9[1], var9[2], var9[3]);
                           break;
                        case VEC2:
                           GL20.glUniform2f(var8, var9[0], var9[1]);
                           break;
                        case FLOAT:
                           GL20.glUniform1f(var8, var9[0]);
                           break;
                        case INT:
                           GL20.glUniform1i(var8, Math.round(var9[0]));
                     }
                  }
               }
            }
         }

         GL13.glActiveTexture(33984);
      }
   }

   private int O0000000000(String string) {
      Integer var2 = this.O00000000000O0.get(string);
      if (var2 != null && var2 > 0) {
         return var2;
      } else if ("uMask".equals(string)) {
         int var4 = this.O0000000000O.O00000000000();
         return var4 > 0 ? var4 : O00000OOOO0O0.O00000000().O000000000000();
      } else if ("uDepth".equals(string)) {
         int var3 = this.O0000000000O.O000000000000();
         return var3 > 0 ? var3 : O00000OOOO0O0.O00000000().O000000000000();
      } else {
         return O00000OOOO0O0.O00000000().O000000000000();
      }
   }

   public boolean O00000000(
      String string,
      O00000OOO00OO0 o00000OOO00OO0,
      Map<String, float[]> map,
      float f,
      float g,
      float h,
      float i,
      int j,
      int k,
      float l,
      float m,
      ColorScheme o0000O000O0OO,
      float n
   ) {
      int var14 = this.O0000000000O.O00000000000();
      return var14 <= 0
         ? false
         : this.O00000000(string, o00000OOO00OO0, map, O00000OOOO00O.ESP, var14, f, g, h, i, f, g, h, i, 0.0F, j, k, l, m, o0000O000O0OO, n);
   }

   public boolean O00000000(
      String string,
      O00000OOO00OO0 o00000OOO00OO0,
      Map<String, float[]> map,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      int n,
      int o,
      float p,
      float q,
      ColorScheme o0000O000O0OO,
      float r
   ) {
      this.O00000000(j, k, l, m);
      float var18 = Math.max(Math.max(j, k), Math.max(l, m));
      return this.O00000000(
         string, o00000OOO00OO0, map, O00000OOOO00O.HUD, O00000OOOO0O0.O00000000().O000000000000(), f, g, h, i, f, g, h, i, var18, n, o, p, q, o0000O000O0OO, r
      );
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean O00000000(
      String string,
      O00000OOO00OO0 o00000OOO00OO0,
      Map<String, float[]> map,
      O00000OOOO00O o00000OOOO00O,
      int i,
      float f,
      float g,
      float h,
      float j,
      float k,
      float l,
      float m,
      float n,
      float o,
      int p,
      int q,
      float r,
      float s,
      ColorScheme o0000O000O0OO,
      float t
   ) {
      if (o00000OOO00OO0 != null && o00000OOO00OO0.ok() && p > 0 && q > 0 && !(h <= 0.0F) && !(j <= 0.0F) && !(t <= 0.001F)) {
         O0000O00OO0 var21 = O00000OOOO0O0.O00000000().O00000000(string, o00000OOO00OO0);
         O00000OOO var22 = O00000OOOO0O0.O00000000().O000000000();
         if (var21 != null && var22 != null) {
            O0000O00O0OOO0.W373 var23 = O0000O00O0OOO0.O00000000();
            boolean var31 = false /* VF: Semaphore variable */;

            boolean var28;
            try {
               var31 = true;
               GL11.glViewport(0, 0, p, q);
               GL11.glDisable(2929);
               GL11.glDisable(2884);
               GL11.glDepthMask(false);
               GlStateManager._enableBlend();
               GL11.glEnable(3042);
               GL14.glBlendFuncSeparate(770, 771, 1, 771);
               GL11.glDisable(36281);
               var21.O00000000();
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, i > 0 ? i : O00000OOOO0O0.O00000000().O000000000000());
               O00000000(var21, "u_DiffuseMap", 0);
               O00000000(var21, "uViewport", p, q);
               O00000000(var21, "uRect", f, g, h, j);
               O00000000(var21, "u_ElementRect", k, l, m, n);
               O00000000(var21, "u_ElementRadius", Math.max(0.0F, o));
               O00000000(var21, "u_GlobalUV", k / Math.max(1.0F, (float)p), l / Math.max(1.0F, (float)q));
               O00000000(var21, "u_Resolution", Math.max(1.0F, (float)p), Math.max(1.0F, (float)q));
               O00000000(var21, "u_Time", O00000OOOO0O0.O00000000().O0000000000());
               O00000000(var21, "u_Mouse", r - k, s - l);
               int var24 = o0000O000O0OO == null ? -1 : o0000O000O0OO.O000000000O0();
               int var25 = o0000O000O0OO == null ? -16777216 : o0000O000O0OO.O000000000O00();
               int var26 = o0000O000O0OO == null ? -15724520 : o0000O000O0OO.O0000000000000();
               int var27 = o0000O000O0OO == null ? -14671832 : o0000O000O0OO.O000000000000O();
               O00000000(var21, "u_AccentTop", O00000000(var24, 16), O00000000(var24, 8), O00000000(var24, 0));
               O00000000(var21, "u_AccentBottom", O00000000(var25, 16), O00000000(var25, 8), O00000000(var25, 0));
               O00000000(var21, "u_ThemeColors[0]", O00000000(var26, 16), O00000000(var26, 8), O00000000(var26, 0), O00000000(var26, 24));
               O00000000(var21, "u_ThemeColors[1]", O00000000(var27, 16), O00000000(var27, 8), O00000000(var27, 0), O00000000(var27, 24));
               O00000000(var21, "u_ThemeColors[2]", O00000000(var24, 16), O00000000(var24, 8), O00000000(var24, 0), t);
               O00000000(var21, "u_ThemeColors[3]", O00000000(var25, 16), O00000000(var25, 8), O00000000(var25, 0), t);
               O00000000(var21, "u_Alpha", t);
               O00000000(var21, o00000OOO00OO0, map);
               this.O00000000(var21, o00000OOOO00O);
               var22.O00000000();
               var28 = true;
               var31 = false;
            } finally {
               if (var31) {
                  GL13.glActiveTexture(33984);
                  GL11.glBindTexture(3553, 0);
                  O0000O00O0OOO0.O00000000(var23);
               }
            }

            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, 0);
            O0000O00O0OOO0.O00000000(var23);
            return var28;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public synchronized int O00000000(
      ShaderSourceBuilder o00000OOO00OOO,
      O00000OOO0OOO o00000OOO0OOO,
      O00000OOO0OO00 o00000OOO0OO00,
      String string,
      float f,
      float g,
      ColorScheme o0000O000O0OO,
      float h,
      float i
   ) {
      if (o00000OOO00OOO != null && o00000OOO0OOO != null && o00000OOO0OO00 != null && string != null && !(f <= 2.0F) && !(g <= 2.0F)) {
         O00000OOO0OO0O var10 = o00000OOO0OO00.O0000000000(string);
         O00000OOO0O00O var11 = var10 == null ? null : o00000OOO0OOO.O00000000(var10.O000000000());
         O00000OOO0O0OO var12 = O000000000(var11);
         if (var12 == null) {
            return 0;
         } else {
            ShaderEffectManager.W316 var13 = this.O00000000000OO.computeIfAbsent(string, stringx -> new ShaderEffectManager.W316());
            int var14 = o00000OOO0OO00.O000000000000();
            if (var13.O000000000 == null || var13.O000000000000 != var14 || !var12.id().equals(var13.O0000000000)) {
               O00000OOO0OO00 var15 = o00000OOO0OO00.O000000000000(string);
               var15.O00000000(O00000OOOO00O.PREVIEW_ONLY.O00000000());
               var13.O000000000 = o00000OOO00OOO.O00000000(var15, string, var12.id(), var12.type());
               var13.O000000000000 = var14;
               var13.O0000000000 = var12.id();
               var13.O00000000000O = 0L;
               String var16 = var13.O000000000 == null ? "" : "__template_preview_" + var13.O000000000.hash();
               if (!var13.O00000000000.isEmpty() && !var13.O00000000000.equals(var16)) {
                  O00000OOOO0O0.O00000000().O0000000000(var13.O00000000000);
               }

               var13.O00000000000 = var16;
            }

            if (var13.O000000000 != null && var13.O000000000.ok()) {
               O0000O00O0OOO0.W373 var19;
               byte var20;
               label146: {
                  long var25 = System.currentTimeMillis();
                  int var17 = Math.max(32, Math.min(512, (int)Math.ceil(f)));
                  int var18 = Math.max(32, Math.min(384, (int)Math.ceil(g)));
                  if (var25 - var13.O00000000000O >= 33L || var13.O0000000000000 != var17 || var13.O000000000000O != var18) {
                     var19 = O0000O00O0OOO0.O00000000();
                     boolean var23 = false /* VF: Semaphore variable */;

                     try {
                        var23 = true;
                        var13.O00000000.O00000000(var17, var18);
                        if (!var13.O00000000.O000000000000()) {
                           var20 = 0;
                           var23 = false;
                           break label146;
                        }

                        var13.O00000000.O00000000();
                        GL11.glDisable(3089);
                        GlStateManager._enableBlend();
                        GL11.glEnable(3042);
                        GL11.glClearColor(0.008F, 0.01F, 0.015F, 0.0F);
                        GL11.glClear(16384);
                        O00000OOOO00OO.O00000000(var13.O00000000000, var13.O000000000, 0.0F, 0.0F, var17, var18, var17, var18, h, i, o0000O000O0OO, 1.0F);
                        var13.O00000000000O = var25;
                        var13.O0000000000000 = var17;
                        var13.O000000000000O = var18;
                        var23 = false;
                     } finally {
                        if (var23) {
                           O0000O00O0OOO0.O00000000(var19);
                        }
                     }

                     O0000O00O0OOO0.O00000000(var19);
                  }

                  var13.O00000000000O0 = var25;
                  this.O000000000000O();
                  return var13.O00000000.O000000000();
               }

               O0000O00O0OOO0.O00000000(var19);
               return var20;
            } else {
               return 0;
            }
         }
      } else {
         return 0;
      }
   }

   public synchronized void O000000000(String string) {
      ShaderEffectManager.W316 var2 = this.O00000000000OO.remove(string);
      if (var2 != null) {
         O00000000(var2);
      }
   }

   public synchronized void O000000000000() {
      for (ShaderEffectManager.W316 var2 : this.O00000000000OO.values()) {
         O00000000(var2);
      }

      this.O00000000000OO.clear();
   }

   public synchronized void O0000000000000() {
      this.O000000000000();
      this.O0000000000O.close();
      this.O0000000000O0.close();
   }

   private void O000000000000O() {
      while (this.O00000000000OO.size() > 48) {
         Entry var1 = this.O00000000000OO.entrySet().iterator().next();
         O00000000((ShaderEffectManager.W316)var1.getValue());
         this.O00000000000OO.remove(var1.getKey());
      }
   }

   private static void O00000000(ShaderEffectManager.W316 o000000000) {
      o000000000.O00000000.close();
      if (!o000000000.O00000000000.isEmpty()) {
         O00000OOOO0O0.O00000000().O0000000000(o000000000.O00000000000);
         o000000000.O00000000000 = "";
      }
   }

   private static O00000OOO0O0OO O000000000(O00000OOO0O00O o00000OOO0O00O) {
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

   private static JSONObject O00000000(O00000OOO0O0OO o00000OOO0O0OO) {
      JSONObject var1 = new JSONObject();
      var1.put("id", o00000OOO0O0OO.id());
      var1.put("label", o00000OOO0O0OO.label());
      var1.put("type", o00000OOO0O0OO.type().O00000000());
      var1.put("direction", o00000OOO0O0OO.direction().name().toLowerCase(Locale.ROOT));
      return var1;
   }

   private static void O00000000(O0000O00OO0 o0000O00OO0, O00000OOO00OO0 o00000OOO00OO0, Map<String, float[]> map) {
      if (o00000OOO00OO0 != null && !o00000OOO00OO0.exposedUniforms().isEmpty()) {
         for (O00000OOO00OO var4 : o00000OOO00OO0.exposedUniforms()) {
            float[] var5 = map == null ? null : (float[])map.get(var4.uniformName());
            if (var5 == null) {
               var5 = var4.defaults();
            }

            if (var4.kind() == O00000OOO00OO.W302.FLOAT) {
               O00000000(o0000O00OO0, var4.uniformName(), var5[0]);
            } else {
               O00000000(o0000O00OO0, var4.uniformName(), var5[0], var5[1], var5[2], var5[3]);
            }
         }
      }
   }

   private void O00000000000O() {
      this.O00000000(
         new ShaderEffectManager.W318(
            "template_esp_dual_pass",
            "ESP Dual-Pass Source",
            "isolated entity mask and scene depth samplers",
            "Template",
            O00000OOOO00O.ESP,
            216.0F,
            List.of(),
            List.of(
               ShaderEffectManager.W319.output("mask", "mask", ShaderEffectManager.W320.FLOAT),
               ShaderEffectManager.W319.output("depth", "depth", ShaderEffectManager.W320.FLOAT),
               ShaderEffectManager.W319.output("uv", "uv", ShaderEffectManager.W320.VEC2)
            ),
            "uniform sampler2D uMask;\nuniform sampler2D uDepth;\n\nfloat wild_template_mask(vec2 uv) {\n    return step(0.001, texture(uMask, uv).a);\n}\n\nfloat wild_template_depth(vec2 uv) {\n    float d = texture(uDepth, uv).r;\n    float ndc = d * 2.0 - 1.0;\n    float near = 0.05;\n    float far = 1024.0;\n    return clamp((2.0 * near) / (far + near - ndc * (far - near)), 0.0, 1.0);\n}\n",
            List.of(ShaderEffectManager.W321.sampler("uMask", 6), ShaderEffectManager.W321.sampler("uDepth", 7)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> {
               boolean var3 = o00000OOO00O0O.O00000000() == O00000OOOO00O.ESP;

               return switch (string) {
                  case "mask" -> var3 ? "wild_template_mask(wild_diffuse_uv())" : "step(0.001, texture(u_DiffuseMap, wild_diffuse_uv()).a)";
                  case "depth" -> var3 ? "wild_template_depth(wild_diffuse_uv())" : "clamp(1.0 - texture(u_DiffuseMap, wild_diffuse_uv()).a, 0.0, 1.0)";
                  default -> "wild_diffuse_uv()";
               };
            }
         )
      );
      this.O00000000(
         new ShaderEffectManager.W318(
            "template_hud_roundrect",
            "SDF RoundRect Plate",
            "per-corner rounded plate driven by uRect and uRadii",
            "Template",
            O00000OOOO00O.HUD,
            224.0F,
            List.of(
               ShaderEffectManager.W319.input("color", "color", ShaderEffectManager.W320.VEC4, "u_ThemeColors[0]"),
               ShaderEffectManager.W319.input("softness", "soft", ShaderEffectManager.W320.FLOAT, "1.0")
            ),
            List.of(
               ShaderEffectManager.W319.output("color", "color", ShaderEffectManager.W320.VEC4),
               ShaderEffectManager.W319.output("mask", "distance", ShaderEffectManager.W320.FLOAT)
            ),
            "uniform vec4 uRadii;\n\nfloat wild_template_corner_pick(vec2 p, vec4 radii) {\n    float top = mix(radii.x, radii.y, step(0.0, p.x));\n    float bottom = mix(radii.w, radii.z, step(0.0, p.x));\n    return mix(top, bottom, step(0.0, p.y));\n}\n\nfloat wild_template_roundrect_distance() {\n    vec2 screenPx = vec2(gl_FragCoord.x, u_Resolution.y - gl_FragCoord.y);\n    vec2 p = screenPx - u_ElementRect.xy - u_ElementRect.zw * 0.5;\n    vec2 halfSize = max(u_ElementRect.zw * 0.5, vec2(0.5));\n    float radiiSum = uRadii.x + uRadii.y + uRadii.z + uRadii.w;\n    vec4 radii = mix(vec4(u_ElementRadius), uRadii, step(0.001, radiiSum));\n    float r = clamp(wild_template_corner_pick(p, radii), 0.0, min(halfSize.x, halfSize.y));\n    vec2 q = abs(p) - halfSize + vec2(r);\n    return length(max(q, vec2(0.0))) - r + min(max(q.x, q.y), 0.0);\n}\n\nfloat wild_template_roundrect_alpha(float d, float softness) {\n    float aa = max(fwidth(d), max(softness, 0.0001));\n    return 1.0 - smoothstep(0.0, aa, d);\n}\n",
            List.of(ShaderEffectManager.W321.vec4("uRadii", 0.0F, 0.0F, 0.0F, 0.0F)),
            (o00000OOO00O0O, o00000OOO0OO0O, string) -> {
               if (o00000OOO00O0O.O000000000()) {
                  return "mask".equals(string)
                     ? "wild_template_roundrect_distance()"
                     : "vec4(("
                        + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
                        + ").rgb, ("
                        + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
                        + ").a * wild_template_roundrect_alpha(wild_template_roundrect_distance(), "
                        + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "softness")
                        + "))";
               } else {
                  String var3 = "wild_sdf_round_box(uv, vec2(0.0), vec2(0.42, 0.30), 0.08, 0.0)";
                  return "mask".equals(string)
                     ? var3
                     : "vec4(("
                        + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
                        + ").rgb, ("
                        + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "color")
                        + ").a * wild_sdf_alpha("
                        + var3
                        + "))";
               }
            }
         )
      );
   }

   private static void O000000000(O00000OOO0OOO o00000OOO0OOO) {
      if (o00000OOO0OOO.O00000000("int_value") == null) {
         o00000OOO0OOO.O00000000(
            new O00000OOO0O00O(
               "int_value",
               "Integer",
               "Constants",
               154.0F,
               List.of(),
               List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.INT)),
               (o00000OOO00O0O, o00000OOO0OO0O, string) -> String.valueOf(Math.round(o00000OOO0OO0O.O00000000("value", 1.0F)))
            )
         );
      }

      if (o00000OOO0OOO.O00000000("int_to_float") == null) {
         o00000OOO0OOO.O00000000(
            new O00000OOO0O00O(
               "int_to_float",
               "Int → Float",
               "Math",
               174.0F,
               List.of(O00000OOO0O0OO.input("i", "i", O00000OOO0OO.INT, "0")),
               List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.FLOAT)),
               (o00000OOO00O0O, o00000OOO0OO0O, string) -> "float(" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "i") + ")"
            )
         );
      }

      if (o00000OOO0OOO.O00000000("float_to_int") == null) {
         o00000OOO0OOO.O00000000(
            new O00000OOO0O00O(
               "float_to_int",
               "Float → Int",
               "Math",
               174.0F,
               List.of(O00000OOO0O0OO.input("x", "x", O00000OOO0OO.FLOAT, "0.0")),
               List.of(O00000OOO0O0OO.output("value", "value", O00000OOO0OO.INT)),
               (o00000OOO00O0O, o00000OOO0OO0O, string) -> "int(floor((" + o00000OOO00O0O.O00000000(o00000OOO0OO0O, "x") + ") + 0.5))"
            )
         );
      }
   }

   static float O00000000(int i, int j) {
      return (i >>> j & 0xFF) / 255.0F;
   }

   static void O00000000(O0000O00OO0 o0000O00OO0, String string, float f) {
      int var3 = o0000O00OO0.O00000000(string);
      if (var3 >= 0) {
         GL20.glUniform1f(var3, f);
      }
   }

   private static void O00000000(O0000O00OO0 o0000O00OO0, String string, int i) {
      int var3 = o0000O00OO0.O00000000(string);
      if (var3 >= 0) {
         GL20.glUniform1i(var3, i);
      }
   }

   static void O00000000(O0000O00OO0 o0000O00OO0, String string, float f, float g) {
      int var4 = o0000O00OO0.O00000000(string);
      if (var4 >= 0) {
         GL20.glUniform2f(var4, f, g);
      }
   }

   private static void O00000000(O0000O00OO0 o0000O00OO0, String string, float f, float g, float h) {
      int var5 = o0000O00OO0.O00000000(string);
      if (var5 >= 0) {
         GL20.glUniform3f(var5, f, g, h);
      }
   }

   static void O00000000(O0000O00OO0 o0000O00OO0, String string, float f, float g, float h, float i) {
      int var6 = o0000O00OO0.O00000000(string);
      if (var6 >= 0) {
         GL20.glUniform4f(var6, f, g, h, i);
      }
   }

   public static final class W315 implements AutoCloseable {
      private static final String O00000000 = "foundry_template_esp";
      private final O0000O0O000O0 O000000000 = new O0000O0O000O0();
      private O0000O00O0OOO0.W373 O0000000000;
      private boolean O00000000000;

      public void O00000000(Predicate<Entity> predicate) {
         O0000O00OO000.O00000000().O00000000("foundry_template_esp", true, predicate);
         this.O00000000000 = true;
      }

      public void O00000000() {
         O0000O00OO000.O00000000().O00000000("foundry_template_esp");
         this.O00000000000 = false;
      }

      public boolean O000000000() {
         return this.O00000000000;
      }

      public boolean O0000000000() {
         return O0000O00OO000.O00000000().O0000000000();
      }

      public int O00000000000() {
         O0000O00OO000 var1 = O0000O00OO000.O00000000();
         return var1.O0000000000() && var1.O00000000000() > 0 ? var1.O00000000000() : this.O000000000.O000000000;
      }

      public int O000000000000() {
         O0000O00OO000 var1 = O0000O00OO000.O00000000();
         return var1.O0000000000() && var1.O000000000000() > 0 ? var1.O000000000000() : this.O000000000.O0000000000;
      }

      public int O0000000000000() {
         O0000O00OO000 var1 = O0000O00OO000.O00000000();
         return var1.O0000000000() && var1.O0000000000OO0() > 0 ? var1.O0000000000OO0() : this.O000000000.O00000000000;
      }

      public int O000000000000O() {
         O0000O00OO000 var1 = O0000O00OO000.O00000000();
         return var1.O0000000000() && var1.O0000000000OOO() > 0 ? var1.O0000000000OOO() : this.O000000000.O000000000000;
      }

      public boolean O00000000(int i, int j) {
         if (i > 0 && j > 0 && this.O0000000000 == null) {
            try {
               this.O000000000.O00000000(i, j);
            } catch (IllegalStateException var4) {
               return false;
            }

            this.O0000000000 = O0000O00O0OOO0.O00000000();
            GL30.glBindFramebuffer(36008, O0000O00O0OOO0.O00000000(this.O0000000000.O00000000));
            GL30.glBindFramebuffer(36009, this.O000000000.O00000000);
            GL30.glBlitFramebuffer(0, 0, i, j, 0, 0, i, j, 256, 9728);
            GL30.glBindFramebuffer(36160, this.O000000000.O00000000);
            GL11.glViewport(0, 0, i, j);
            GL11.glDisable(3089);
            GL30.glClearBufferfv(6144, 0, ShaderEffectManager.O000000000);
            GL11.glEnable(2929);
            GL11.glDepthMask(false);
            return true;
         } else {
            return false;
         }
      }

      public void O00000000000O() {
         if (this.O0000000000 != null) {
            O0000O00O0OOO0.O00000000(this.O0000000000);
            this.O0000000000 = null;
         }
      }

      @Override
      public void close() {
         if (this.O00000000000) {
            this.O00000000();
         }

         this.O00000000000O();
         this.O000000000.O00000000();
      }
   }

   static final class W316 {
      final O00000OOO0 O00000000 = new O00000OOO0();
      O00000OOO00OO0 O000000000;
      String O0000000000 = "";
      String O00000000000 = "";
      int O000000000000 = Integer.MIN_VALUE;
      int O0000000000000;
      int O000000000000O;
      long O00000000000O;
      long O00000000000O0;
   }

   public static final class W317 implements AutoCloseable {
      private O0000O00OO0 O00000000;
      private boolean O000000000;

      public boolean O00000000(float f, float g, float h, float i, float j, float k, float l, float m, int n, int o, float p, float q, int r, int s, float t) {
         if (!this.O000000000 && !(h <= 0.0F) && !(i <= 0.0F) && r > 0 && s > 0 && !(t <= 0.001F)) {
            O0000O00OO0 var16 = this.O00000000();
            O00000OOO var17 = O00000OOOO0O0.O00000000().O000000000();
            if (var16 != null && var17 != null) {
               O0000O00O0OOO0.W373 var18 = O0000O00O0OOO0.O00000000();

               boolean var19;
               try {
                  GL11.glViewport(0, 0, r, s);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GL11.glDepthMask(false);
                  GlStateManager._enableBlend();
                  GL11.glEnable(3042);
                  GL14.glBlendFuncSeparate(770, 771, 1, 771);
                  GL11.glDisable(36281);
                  var16.O00000000();
                  ShaderEffectManager.O00000000(var16, "uViewport", r, s);
                  ShaderEffectManager.O00000000(var16, "uRect", f, g, h, i);
                  ShaderEffectManager.O00000000(var16, "uRadii", Math.max(0.0F, j), Math.max(0.0F, k), Math.max(0.0F, l), Math.max(0.0F, m));
                  ShaderEffectManager.O00000000(
                     var16,
                     "uTint",
                     ShaderEffectManager.O00000000(n, 16),
                     ShaderEffectManager.O00000000(n, 8),
                     ShaderEffectManager.O00000000(n, 0),
                     ShaderEffectManager.O00000000(n, 24)
                  );
                  ShaderEffectManager.O00000000(
                     var16,
                     "uStrokeTint",
                     ShaderEffectManager.O00000000(o, 16),
                     ShaderEffectManager.O00000000(o, 8),
                     ShaderEffectManager.O00000000(o, 0),
                     ShaderEffectManager.O00000000(o, 24)
                  );
                  ShaderEffectManager.O00000000(var16, "uStrokeWidth", Math.max(0.0F, p));
                  ShaderEffectManager.O00000000(var16, "uSoftness", Math.max(0.0F, q));
                  ShaderEffectManager.O00000000(var16, "uAlpha", t);
                  var17.O00000000();
                  var19 = true;
               } finally {
                  O0000O00O0OOO0.O00000000(var18);
               }

               return var19;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }

      private O0000O00OO0 O00000000() {
         if (this.O00000000 != null) {
            return this.O00000000;
         } else {
            try {
               this.O00000000 = O0000O00OO0.O00000000("assets/wild/shaders/foundry/roundrect.vert", "assets/wild/shaders/foundry/roundrect.frag");
               return this.O00000000;
            } catch (Throwable var2) {
               this.O000000000 = true;
               return null;
            }
         }
      }

      @Override
      public void close() {
         if (this.O00000000 != null) {
            this.O00000000.O000000000();
            this.O00000000 = null;
         }

         this.O000000000 = false;
      }
   }

   public record W318(
      String id,
      String title,
      String description,
      String category,
      O00000OOOO00O target,
      float nodeWidth,
      List<ShaderEffectManager.W319> inputs,
      List<ShaderEffectManager.W319> outputs,
      String glslPreamble,
      List<ShaderEffectManager.W321> uniforms,
      O00000OOO0O0O emitter
   ) {
      public W318(
         String id,
         String title,
         String description,
         String category,
         O00000OOOO00O target,
         float nodeWidth,
         List<ShaderEffectManager.W319> inputs,
         List<ShaderEffectManager.W319> outputs,
         String glslPreamble,
         List<ShaderEffectManager.W321> uniforms,
         O00000OOO0O0O emitter
      ) {
         if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("template id required");
         } else if (target != null && emitter != null) {
            title = title != null && !title.isBlank() ? title : id;
            description = description == null ? "" : description;
            category = category != null && !category.isBlank() ? category : "Template";
            inputs = inputs == null ? List.of() : List.copyOf(inputs);
            outputs = outputs == null ? List.of() : List.copyOf(outputs);
            glslPreamble = glslPreamble == null ? "" : glslPreamble;
            uniforms = uniforms == null ? List.of() : List.copyOf(uniforms);
            this.id = id;
            this.title = title;
            this.description = description;
            this.category = category;
            this.target = target;
            this.nodeWidth = nodeWidth;
            this.inputs = inputs;
            this.outputs = outputs;
            this.glslPreamble = glslPreamble;
            this.uniforms = uniforms;
            this.emitter = emitter;
         } else {
            throw new IllegalArgumentException("template target and emitter required for " + id);
         }
      }

      public O00000OOO0O00O toNodeDefinition() {
         ArrayList var1 = new ArrayList(this.inputs.size());

         for (ShaderEffectManager.W319 var3 : this.inputs) {
            var1.add(var3.toPinTemplate());
         }

         ArrayList var5 = new ArrayList(this.outputs.size());

         for (ShaderEffectManager.W319 var4 : this.outputs) {
            var5.add(var4.toPinTemplate());
         }

         return new O00000OOO0O00O(this.id, this.title, this.category, this.nodeWidth, var1, var5, this.emitter);
      }
   }

   public record W319(String id, String label, ShaderEffectManager.W320 type, O00000OOO0O0O0 direction, String defaultExpression) {
      public W319(String id, String label, ShaderEffectManager.W320 type, O00000OOO0O0O0 direction, String defaultExpression) {
         if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("slot id required");
         } else if (type != null && direction != null) {
            label = label != null && !label.isBlank() ? label : id;
            defaultExpression = defaultExpression == null ? "" : defaultExpression;
            this.id = id;
            this.label = label;
            this.type = type;
            this.direction = direction;
            this.defaultExpression = defaultExpression;
         } else {
            throw new IllegalArgumentException("slot type and direction required for " + id);
         }
      }

      public static ShaderEffectManager.W319 input(String string, String string2, ShaderEffectManager.W320 o0000000000000, String string3) {
         return new ShaderEffectManager.W319(string, string2, o0000000000000, O00000OOO0O0O0.INPUT, string3);
      }

      public static ShaderEffectManager.W319 output(String string, String string2, ShaderEffectManager.W320 o0000000000000) {
         return new ShaderEffectManager.W319(string, string2, o0000000000000, O00000OOO0O0O0.OUTPUT, "");
      }

      public O00000OOO0O0OO toPinTemplate() {
         return new O00000OOO0O0OO(this.id, this.label, this.type.O00000000000(), this.direction, this.defaultExpression);
      }
   }

   public static enum W320 {
      VEC4("vec4", 4, ColorScheme.O00000000(255, 61, 158, 255)),
      VEC2("vec2", 2, ColorScheme.O00000000(177, 140, 255, 255)),
      FLOAT("float", 1, ColorScheme.O00000000(53, 228, 255, 255)),
      INT("int", 1, ColorScheme.O00000000(155, 255, 61, 255));

      private final String O00000000;
      private final int O000000000;
      private final int O0000000000;

      private W320(String string2, int j, int k) {
         this.O00000000 = string2;
         this.O000000000 = j;
         this.O0000000000 = k;
      }

      public String O00000000() {
         return this.O00000000;
      }

      public int O000000000() {
         return this.O000000000;
      }

      public int O0000000000() {
         return this.O0000000000;
      }

      public boolean O00000000(ShaderEffectManager.W320 o0000000000000) {
         return this == o0000000000000;
      }

      public O00000OOO0OO O00000000000() {
         return switch (this) {
            case VEC4 -> O00000OOO0OO.VEC4;
            case VEC2 -> O00000OOO0OO.VEC2;
            case FLOAT -> O00000OOO0OO.FLOAT;
            case INT -> O00000OOO0OO.INT;
         };
      }

      public static ShaderEffectManager.W320 O00000000(O00000OOO0OO o00000OOO0OO) {
         if (o00000OOO0OO == null) {
            return FLOAT;
         } else {
            return switch (o00000OOO0OO) {
               case VEC4 -> VEC4;
               case VEC3 -> VEC4;
               case VEC2 -> VEC2;
               case FLOAT -> FLOAT;
               case INT -> INT;
            };
         }
      }

      public static int O000000000(O00000OOO0OO o00000OOO0OO) {
         if (o00000OOO0OO == null) {
            return FLOAT.O0000000000;
         } else {
            return switch (o00000OOO0OO) {
               case VEC4 -> VEC4.O0000000000;
               case VEC3 -> ColorScheme.O00000000(250, 176, 96, 255);
               case VEC2 -> VEC2.O0000000000;
               case FLOAT -> FLOAT.O0000000000;
               case INT -> INT.O0000000000;
            };
         }
      }
   }

   public record W321(String name, ShaderEffectManager$W322$W323 kind, int textureUnit, float[] defaults) {
      public W321(String name, ShaderEffectManager$W322$W323 kind, int textureUnit, float[] defaults) {
         if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("uniform name required");
         } else if (kind == null) {
            throw new IllegalArgumentException("uniform kind required for " + name);
         } else {
            defaults = defaults == null ? new float[4] : Arrays.copyOf(defaults, 4);
            this.name = name;
            this.kind = kind;
            this.textureUnit = textureUnit;
            this.defaults = defaults;
         }
      }

      public static ShaderEffectManager.W321 sampler(String string, int i) {
         return new ShaderEffectManager.W321(string, ShaderEffectManager$W322$W323.SAMPLER2D, i, null);
      }

      public static ShaderEffectManager.W321 vec4(String string, float f, float g, float h, float i) {
         return new ShaderEffectManager.W321(string, ShaderEffectManager$W322$W323.VEC4, -1, new float[]{f, g, h, i});
      }

      public static ShaderEffectManager.W321 vec2(String string, float f, float g) {
         return new ShaderEffectManager.W321(string, ShaderEffectManager$W322$W323.VEC2, -1, new float[]{f, g, 0.0F, 0.0F});
      }

      public static ShaderEffectManager.W321 scalar(String string, float f) {
         return new ShaderEffectManager.W321(string, ShaderEffectManager$W322$W323.FLOAT, -1, new float[]{f, 0.0F, 0.0F, 0.0F});
      }

      public static ShaderEffectManager.W321 integer(String string, int i) {
         return new ShaderEffectManager.W321(string, ShaderEffectManager$W322$W323.INT, -1, new float[]{i, 0.0F, 0.0F, 0.0F});
      }
   }
}
