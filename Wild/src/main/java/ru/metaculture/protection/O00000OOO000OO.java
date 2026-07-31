package ru.metaculture.protection;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.Util;
import org.json.JSONObject;
import org.lwjgl.glfw.GLFW;

public final class O00000OOO000OO implements AutoCloseable {
   private static final SimpleDateFormat O00000000 = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ROOT);
   private static final String[] O000000000 = new String[]{"Save As", "Export .wifd", "Import", "Open Folder", "Cleanup Legacy", "Reset"};
   private static final String[] O0000000000 = new String[]{"All", "Мои", "Пресеты"};
   private static final int O00000000000 = 0;
   private static final int O000000000000 = 1;
   private final O00000OOO0OOO O0000000000000 = new O00000OOO0OOO();
   private final ShaderSourceBuilder O000000000000O = new ShaderSourceBuilder(this.O0000000000000);
   private final O00000OOOO0 O00000000000O = new O00000OOOO0(this.O000000000000O);
   private final O00000OOO00O O00000000000O0 = new O00000OOO00O(this.O0000000000000);
   private final O00000OOOO O00000000000OO = new O00000OOOO(this.O0000000000000, this.O000000000000O);
   private final O00000OOOO0OO O0000000000O = new O00000OOOO0OO();
   private O00000OOO0OO00 O0000000000O0 = O00000OOO0O0.O00000000(this.O0000000000000);
   private float O0000000000O00 = 520.0F;
   private float O0000000000O0O = 260.0F;
   private float O0000000000OO = 0.92F;
   private float O0000000000OO0 = 0.92F;
   private final O0000O000O00O O0000000000OOO = new O0000O000O00O(0.92F);
   private boolean O000000000O;
   private float O000000000O0;
   private float O000000000O00;
   private float O000000000O000;
   private float O000000000O00O;
   private float O000000000O0O;
   private float O000000000O0O0;
   private long O000000000O0OO;
   private String O000000000OO;
   private float O000000000OO0;
   private float O000000000OO00;
   private String O000000000OO0O;
   private final Set<String> O000000000OOO = new LinkedHashSet<>();
   private final Set<String> O000000000OOO0 = new LinkedHashSet<>();
   private final Map<String, O00000OOO000OO.W291> O000000000OOOO = new HashMap<>();
   private float O00000000O;
   private float O00000000O0;
   private boolean O00000000O00;
   private float O00000000O000;
   private float O00000000O0000;
   private float O00000000O000O;
   private float O00000000O00O;
   private String O00000000O00O0;
   private String O00000000O00OO;
   private float O00000000O0O;
   private float O00000000O0O0;
   private float O00000000O0O00;
   private float O00000000O0O0O;
   private long O00000000O0OO;
   private String O00000000O0OO0 = "ready";
   private long O00000000O0OOO;
   private O00000OOOO00O O00000000OO = O00000OOOO00O.HUD;
   private boolean O00000000OO0;
   private boolean O00000000OO00;
   private boolean O00000000OO000;
   private O00000OOOO00O O00000000OO00O;
   private boolean O00000000OO0O;
   private String O00000000OO0O0 = "Host Rectangle";
   private O00000OOO000OO.W292 O00000000OO0OO = O00000OOO000OO.W292.AUTO;
   private int O00000000OOO;
   private final Map<Integer, O00000OOO00OO0> O00000000OOO0 = new HashMap<>();
   private boolean O00000000OOO00;
   private final O0000O00O0O0OO O00000000OOO0O = new O0000O00O0O0OO(
      O0000O00O0O000.O00000000(), O0000O00O0O0O0.O00000000(2.7F, 0.86F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F
   );
   private final O0000O00O0O0OO O00000000OOOO = new O0000O00O0O0OO(
      O0000O00O0O000.O00000000(), O0000O00O0O0O0.O00000000(2.4F, 0.78F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F
   );
   private final O0000O00O0O0OO O00000000OOOO0 = new O0000O00O0O0OO(
      O0000O00O0O000.O00000000(), O0000O00O0O0O0.O00000000(2.6F, 0.84F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F
   );
   private final O0000O00O0O0OO O00000000OOOOO = new O0000O00O0O0OO(
      O0000O00O0O000.O00000000(), O0000O00O0O0O0.O00000000(3.0F, 0.88F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F
   );
   private final O0000O00O0O0OO O0000000O = new O0000O00O0O0OO(
      O0000O00O0O000.O00000000(), O0000O00O0O0O0.O00000000(2.6F, 0.82F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F
   );
   private boolean O0000000O0;
   private float O0000000O00;
   private boolean O0000000O000;
   private float O0000000O0000;
   private int O0000000O00000;
   private String O0000000O0000O = "";
   private boolean O0000000O000O;
   private long O0000000O000O0;
   private final Set<String> O0000000O000OO = new LinkedHashSet<>();
   private long O0000000O00O;
   private String O0000000O00O0;
   private int O0000000O00O00 = -1;
   private int O0000000O00O0O = -1;
   private long O0000000O00OO;
   private final O00000OOO0O O0000000O00OO0 = new O00000OOO0O();
   private String O0000000O00OOO = O00000OOOOO0.O00000000();
   private boolean O0000000O0O;
   private long O0000000O0O0;
   private final Map<String, O00000OOOOO0O0> O0000000O0O00 = new HashMap<>();
   private final Map<String, O00000OOOOO0O0> O0000000O0O000 = new HashMap<>();
   private final Map<String, O00000OOOOO0O0> O0000000O0O00O = new HashMap<>();
   private String O0000000O0O0O;
   private String O0000000O0O0O0;
   private String O0000000O0O0OO;
   private String O0000000O0OO;
   private String O0000000O0OO0;
   private final Map<String, O0000O000O00O> O0000000O0OO00 = new HashMap<>();
   private final Map<String, O0000O000O00O> O0000000O0OO0O = new HashMap<>();
   private final Map<String, O0000O00O0O0OO> O0000000O0OOO = new HashMap<>();
   private final Map<String, Boolean> O0000000O0OOO0 = new LinkedHashMap<>(16, 0.75F, true);
   private final Map<String, O0000O00O0O0OO> O0000000O0OOOO = new HashMap<>();
   private final Map<String, O0000O000O00O> O0000000OO = new HashMap<>();
   private final O0000O000O00O O0000000OO0 = new O0000O000O00O(0.0F);
   private float O0000000OO00;
   private float O0000000OO000;
   private float O0000000OO0000;
   private float O0000000OO000O;
   private float O0000000OO00O;
   private float O0000000OO00O0;
   private boolean O0000000OO00OO;
   private boolean O0000000OO0O;
   private float O0000000OO0O0;
   private float O0000000OO0O00;
   private boolean O0000000OO0O0O;
   private float O0000000OO0OO;
   private float O0000000OO0OO0;
   private O0000O00000 O0000000OO0OOO;
   private int O0000000OOO;
   private int O0000000OOO0;

   public O00000OOO000OO() {
      ShaderEffectManager.O00000000().O00000000(this.O0000000000000);
      this.O000000000000(this.O00000000OO);
      this.O0000000000O0.O00000000().O00000000(this.O0000000O00OOO, O00000OOOOO000.O000000000000O());
      this.O00000000O00OO();
      this.O0000000O00OOO = this.O0000000000O0.O00000000().O000000000();
      this.O0000000O00O0O = this.O0000000000O0.O000000000000();
      this.O00000000000O.O00000000(this.O00000000OO);
      O00000OOOOO000.O00000000().O00000000(this.O0000000000000);
      O00000OOOO0OOO.O00000000(this.O0000000000000, this.O000000000000O);
   }

   public O00000OOO0OOO O00000000() {
      return this.O0000000000000;
   }

   public O00000OOO0OO00 O000000000() {
      return this.O0000000000O0;
   }

   public O00000OOOO00O O0000000000() {
      return this.O00000000OO;
   }

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0) {
      return o0000O000O0O0 != null && (o0000O000O0O0.O000000O0O0OO() || o0000O000O0O0.O00000000(O0000O000O00O0.O000000000O00O()) > 0.035F);
   }

   public boolean O00000000000() {
      return this.O0000000000O.O000000000() || this.O00000000000O0.O00000000() || this.O00000000OO0O;
   }

   public boolean O000000000(O0000O000O0O0 o0000O000O0O0) {
      return o0000O000O0O0 != null && (o0000O000O0O0.O000000O0O0OO() || o0000O000O0O0.O00000000(O0000O000O00O0.O000000000O00O()) > 0.0015F);
   }

   public void O00000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O000O0OOO o0000O000O0OOO, int i, int j) {
      if (o0000O00OO0O0 != null && o0000O000O0O0 != null && o0000O000O0OOO != null && i > 0 && j > 0) {
         float var6 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000O00O());
         if (!(var6 <= 0.0015F)) {
            this.O000000000000O(o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0());
            this.O000000000O0O();
            this.O0000000000OO = this.O0000000000OOO.O00000000(this.O0000000000OO0, O0000O000O0O00.O000000000000O());
            this.O000000000O00O();
            ColorScheme var7 = o0000O000O0OOO.O0000000000000();
            this.O0000000OO0OOO = o0000O000O0OOO.O000000000000();
            this.O0000000OOO = i;
            this.O0000000OOO0 = j;
            boolean var8 = o0000O000O0O0.O000000O0O0OO();
            float var9 = O000000000000O(var6);
            float var10 = this.O00000000(var6);
            float var11 = this.O00000000(var6, var8);
            float var12 = this.O00000000(var6, var8, j);
            float var13 = o0000O000O0O0.O000000000(O0000O000O00O0.O000000000O00O());
            float var14 = (float)(System.currentTimeMillis() % 12000L) / 12000.0F;
            this.O00000000OOO0O.O0000000000(this.O00000000OO0 ? 1.0F : 0.0F);
            this.O00000000OOOO.O0000000000(this.O00000000OO00 ? 1.0F : 0.0F);
            this.O00000000OOOO0.O0000000000(this.O00000000OO000 ? 1.0F : 0.0F);
            this.O00000000OOOOO.O0000000000(this.O00000000OO0O ? 1.0F : 0.0F);
            this.O0000000O.O0000000000(this.O0000000O000 ? 1.0F : 0.0F);
            o0000O00OO0O0.O0000000000();
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, var7, i, j, var9, var14, var6, var8);
            this.O00000000(o0000O00OO0O0, o0000O000O0OOO.O000000000000(), var7, i, j, var6, var8, var13, var14);
            o0000O00OO0O0.O000000000000(var10);
            o0000O00OO0O0.O00000000(0.0F, var12);
            o0000O00OO0O0.O00000000(var11, i * 0.5F, j * 0.5F);

            try {
               this.O000000000(o0000O00OO0O0, o0000O000O0O0, var7, i, j, var14);
               this.O00000000(o0000O00OO0O0, var7, i, j, var9);
               this.O00000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO);
               this.O00000000(o0000O00OO0O0, o0000O000O0O0, var7, i, j, var9);
               this.O00000000(o0000O00OO0O0, o0000O000O0OOO, var7);
               this.O000000000000O(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, i, j);
               this.O00000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, i);
               this.O00000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, i, j, var9);
               this.O00000000000O(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, i, j);
               this.O0000000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, i, j);
               this.O00000000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, i, j);
               this.O000000000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, i, j);
               this.O0000000000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, i, j);
               this.O000000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, i, j);
               this.O00000000000O0.O00000000(o0000O00OO0O0, o0000O000O0OOO, o0000O000O0O0, i, j);
               this.O00000000(o0000O00OO0O0, o0000O000O0OOO, i, j);
               this.O0000000000O.O00000000(o0000O00OO0O0, o0000O000O0OOO.O000000000000(), var7, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), i, j);
            } finally {
               o0000O00OO0O0.O00000000000O();
               o0000O00OO0O0.O00000000000O();
               o0000O00OO0O0.O00000000000OO();
            }

            this.O000000000(o0000O00OO0O0, o0000O000O0OOO.O000000000000(), var7, i, j, var6, var8, var13, var14);
            this.O00000000O00O0();
            boolean var15 = var8 && var10 > 0.72F;
            if (var15 && System.currentTimeMillis() - this.O0000000O00O > 130L) {
               this.O00000000O0O();
               this.O00000000000O.O00000000(this.O00000000OO);
               this.O00000000000O.O00000000(this.O0000000000O0);
               this.O0000000O00O = System.currentTimeMillis();
            }

            boolean var16 = this.O000000000OO == null && this.O00000000O00O0 == null && !this.O00000000O00 && !this.O000000000O;
            if (var15 && var16 && this.O0000000000O0.O000000000000() != this.O0000000O00O00 && System.currentTimeMillis() - this.O0000000O00OO > 1800L) {
               this.O0000000O00O00 = this.O0000000000O0.O000000000000();
               this.O0000000O00OO = System.currentTimeMillis();
               this.O00000000O0O();
               O00000OOOOO00 var17 = O00000OOOOO000.O00000000().O00000000(this.O00000000OO, this.O0000000000O0, this.O0000000O00O0);
               if (var17 != null) {
                  this.O0000000O00O0 = var17.O00000000();
                  this.O00000000(var17.O000000000(), this.O0000000000O0);
               }
            }
         }
      }
   }

   private void O000000000000() {
      this.O0000000O00O00 = this.O0000000000O0.O000000000000();
      this.O0000000O00OO = System.currentTimeMillis();
   }

   private String O0000000000000() {
      return O000000000000(this.O0000000O00OOO);
   }

   private String O000000000000O() {
      String var1 = this.O00000000000O.O000000000();
      if (var1 != null && !var1.isBlank()) {
         return "failed";
      } else {
         return this.O0000000000O0.O000000000000() != this.O0000000O00O0O ? "dirty" : "saved";
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      O0000O000O0OOO o0000O000O0OOO,
      ColorScheme o0000O000O0OO,
      int i,
      int j,
      float f,
      float g,
      float h,
      boolean bl
   ) {
      float var11 = this.O000000000(h, bl);
      if (O000000O000O0O.O00000000()) {
         o0000O00OO0O0.O00000000(26.0F + 22.0F * var11);
         o0000O00OO0O0.O00000000(
            0.0F, 0.0F, (float)i, (float)j, 0.0F, this.O00000000(o0000O000O0OO) ? 0.42F + 0.2F * f + 0.22F * var11 : 0.66F + 0.16F * f + 0.16F * var11
         );
      }

      o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, this.O00000000(o0000O000O0OOO, f));
   }

   private float O00000000(float f) {
      float var2 = O000000000000O(O000000000(f, 0.0F, 1.0F));
      return var2 * O000000000000O(O000000000((f - 0.006F) / 0.64F, 0.0F, 1.0F));
   }

   private float O00000000(float f, boolean bl) {
      float var3 = O000000000000O(O000000000(f, 0.0F, 1.0F));
      float var4 = (float)Math.sin(Math.PI * O000000000(bl ? f : 1.0F - f, 0.0F, 1.0F));
      return bl ? 0.952F + 0.048F * var3 + 0.01F * var4 * (1.0F - var3) : 0.97F + 0.03F * var3 - 0.01F * var4;
   }

   private float O00000000(float f, boolean bl, int i) {
      float var4 = O000000000000O(O000000000(f, 0.0F, 1.0F));
      float var5 = Math.max(18.0F, i * 0.032F);
      return bl ? var5 * (1.0F - var4) : -var5 * (1.0F - var4);
   }

   private float O000000000(float f, boolean bl) {
      float var3 = O000000000000O(O000000000(f, 0.0F, 1.0F));
      return bl ? 1.0F - var3 : (1.0F - var3) * 0.96F;
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, int i, int j, float f, boolean bl, float g, float h) {
      float var10 = O000000000(bl ? f : 1.0F - f, 0.0F, 1.0F);
      float var11 = (float)Math.sin(Math.PI * var10);
      float var12 = this.O000000000(f, bl);
      float var13 = O000000000(var11 * 0.52F + Math.abs(g) * 0.35F + var12 * 0.18F, 0.0F, 1.0F);
      if (!bl) {
         float var24 = O000000000000O(1.0F - O000000000(f, 0.0F, 1.0F));
         float var25 = O000000000(var24 * 0.42F + Math.abs(g) * 0.1F, 0.0F, 1.0F);
         int var26 = this.O00000000(o0000O000O0OO)
            ? ColorScheme.O00000000(244, 247, 255, Math.round(54.0F * var25))
            : ColorScheme.O00000000(0, 0, 0, Math.round(86.0F * var25));
         int var27 = ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), Math.round(14.0F * var13 * (1.0F - var24 * 0.35F)));
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, 0.0F, var26);
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, 0.0F, var27);
         float var29 = Math.max(o0000O00000.O00000000(7.0F), j * 0.01F);
         int var31 = this.O00000000(o0000O000O0OO)
            ? ColorScheme.O00000000(18, 24, 40, Math.round(8.0F * var25))
            : ColorScheme.O00000000(0, 0, 0, Math.round(18.0F * var25));
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, var29, 0.0F, var31);
         o0000O00OO0O0.O00000000(0.0F, j - var29, (float)i, var29, 0.0F, var31);
      } else {
         int var14 = ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round((this.O00000000(o0000O000O0OO) ? 34 : 46) * var13));
         int var15 = ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), Math.round((this.O00000000(o0000O000O0OO) ? 22 : 38) * var13));
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, var14);
         float var16 = O000000000000O(O000000000(bl ? f * 1.14F : f, 0.0F, 1.0F));
         float var17 = (1.0F - var16) * j * 0.28F;
         if (var17 > 0.6F) {
            int var18 = this.O00000000(o0000O000O0OO)
               ? ColorScheme.O00000000(244, 248, 255, Math.round(118.0F * (1.0F - var16)))
               : ColorScheme.O00000000(0, 0, 0, Math.round(150.0F * (1.0F - var16)));
            o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, var17, 0.0F, var18);
            o0000O00OO0O0.O00000000(0.0F, j - var17, (float)i, var17, 0.0F, var18);
            o0000O00OO0O0.O00000000(
               0.0F,
               var17 - o0000O00000.O00000000(1.0F),
               (float)i,
               o0000O00000.O00000000(1.0F),
               0.0F,
               ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(120.0F * (1.0F - var16)))
            );
            o0000O00OO0O0.O00000000(
               0.0F,
               j - var17,
               (float)i,
               o0000O00000.O00000000(1.0F),
               0.0F,
               ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), Math.round(120.0F * (1.0F - var16)))
            );
         }

         float var28 = bl ? var10 : 1.0F - var10;

         for (int var19 = 0; var19 < 5; var19++) {
            float var20 = O000000000(var28 * 1.18F + var19 * 0.17F + h * 0.045F);
            float var21 = -i * 0.28F + var20 * i * 1.58F;
            float var22 = o0000O00000.O00000000(42 + var19 * 9) * (0.72F + var13);
            float var23 = var13 * (0.62F - var19 * 0.075F);
            o0000O00OO0O0.O00000000(var21, j * (0.42F + var19 * 0.035F));
            o0000O00OO0O0.O000000000(-18.0F);
            o0000O00OO0O0.O00000000(
               -var22 * 0.5F,
               (float)(-j),
               var22,
               j * 2.1F,
               var22 * 0.5F,
               ColorScheme.O00000000(var19 % 2 == 0 ? o0000O000O0OO.O000000000O0() : o0000O000O0OO.O000000000O00(), Math.round(52.0F * var23))
            );
            o0000O00OO0O0.O00000000(
               -var22 * 0.08F,
               (float)(-j),
               var22 * 0.16F,
               j * 2.1F,
               var22 * 0.08F,
               ColorScheme.O00000000(o0000O000O0OO.O000000000O(), Math.round(18.0F * var23))
            );
            o0000O00OO0O0.O000000000000O();
            o0000O00OO0O0.O00000000000O();
         }

         float var30 = O000000000(0.18F + var12 * 0.62F + var13 * 0.22F, 0.0F, 1.0F);
         int var32 = this.O00000000(o0000O000O0OO)
            ? ColorScheme.O00000000(18, 24, 40, Math.round(24.0F * var30))
            : ColorScheme.O00000000(0, 0, 0, Math.round(78.0F * var30));
         float var33 = Math.max(o0000O00000.O00000000(42.0F), i * 0.035F);
         float var34 = Math.max(o0000O00000.O00000000(36.0F), j * 0.045F);
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, var34, 0.0F, var32);
         o0000O00OO0O0.O00000000(0.0F, j - var34, (float)i, var34, 0.0F, var32);
         o0000O00OO0O0.O00000000(0.0F, 0.0F, var33, (float)j, 0.0F, var32);
         o0000O00OO0O0.O00000000(i - var33, 0.0F, var33, (float)j, 0.0F, var32);
         o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, var15);
      }
   }

   private void O000000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, int i, int j, float f, boolean bl, float g, float h) {
      if (bl) {
         float var10 = O000000000(bl ? f : 1.0F - f, 0.0F, 1.0F);
         float var11 = (float)Math.sin(Math.PI * var10);
         var11 = O000000000(var11 * 0.34F + Math.abs(g) * 0.22F, 0.0F, 1.0F);
         if (!(var11 <= 0.015F)) {
            float var12 = j * O000000000(var10 * 0.85F + h * 0.18F);
            o0000O00OO0O0.O00000000(
               0.0F,
               var12 - o0000O00000.O00000000(1.2F),
               (float)i,
               o0000O00000.O00000000(2.4F),
               o0000O00000.O00000000(1.2F),
               ColorScheme.O00000000(o0000O000O0OO.O000000000O(), Math.round((this.O00000000(o0000O000O0OO) ? 34 : 48) * var11))
            );
            o0000O00OO0O0.O00000000(
               0.0F,
               var12 + o0000O00000.O00000000(3.5F),
               (float)i,
               o0000O00000.O00000000(1.0F),
               o0000O00000.O00000000(0.5F),
               ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), Math.round(78.0F * var11))
            );
            float var13 = i * (0.18F + 0.16F * var11);
            float var14 = i * O000000000(var10 * 1.25F + 0.18F);
            o0000O00OO0O0.O00000000(var14, j * 0.5F);
            o0000O00OO0O0.O000000000(12.0F);
            o0000O00OO0O0.O00000000(
               -var13 * 0.5F,
               -j * 0.62F,
               var13,
               j * 1.24F,
               var13 * 0.18F,
               o0000O00000.O00000000(34.0F) * var11,
               o0000O00000.O00000000(4.0F),
               ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(58.0F * var11))
            );
            o0000O00OO0O0.O00000000(
               -var13 * 0.5F, -j * 0.62F, var13, j * 1.24F, var13 * 0.18F, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(18.0F * var11))
            );
            o0000O00OO0O0.O000000000000O();
            o0000O00OO0O0.O00000000000O();
         }
      }
   }

   private int O00000000(O0000O000O0OOO o0000O000O0OOO, float f) {
      ColorScheme var3 = o0000O000O0OOO.O0000000000000();
      return this.O00000000(var3)
         ? ColorScheme.O00000000(
            ColorScheme.O00000000(246, 248, 252, Math.round(214.0F * f)), ColorScheme.O00000000(var3.O000000000O0(), Math.round(56.0F * f)), 0.08F
         )
         : ColorScheme.O00000000(2, 4, 8, Math.round(240.0F * f));
   }

   private int O00000000(ColorScheme o0000O000O0OO, int i) {
      return this.O00000000(o0000O000O0OO)
         ? ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, Math.min(255, i + 8)), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), i), 0.038F)
         : ColorScheme.O00000000(ColorScheme.O00000000(8, 10, 16, i), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), i), 0.026F);
   }

   private int O000000000(ColorScheme o0000O000O0OO, int i) {
      return this.O00000000(o0000O000O0OO)
         ? ColorScheme.O00000000(ColorScheme.O00000000(248, 250, 254, Math.min(255, i + 6)), ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), i), 0.034F)
         : ColorScheme.O00000000(ColorScheme.O00000000(6, 8, 13, i), ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), i), 0.022F);
   }

   private int O0000000000(ColorScheme o0000O000O0OO, int i) {
      return this.O00000000(o0000O000O0OO) ? ColorScheme.O00000000(20, 27, 42, Math.round(i * 0.36F)) : ColorScheme.O00000000(0, 0, 0, i);
   }

   private boolean O00000000(ColorScheme o0000O000O0OO) {
      return switch (this.O00000000OO0OO) {
         case AUTO -> o0000O000O0OO != null && o0000O000O0OO.O000000000O000();
         case DARK -> false;
         case LIGHT -> true;
      };
   }

   private List<O00000OOO000OO.W293> O00000000000O() {
      ArrayList var1 = new ArrayList();
      if (this.O0000000O00000 != 2) {
         for (O00000OOOOO00 var3 : O00000OOOOO000.O00000000().O000000000()) {
            var1.add(new O00000OOO000OO.W293(var3, -1));
         }
      }

      if (this.O0000000O00000 != 1) {
         for (int var4 = 0; var4 < O00000OOOOO00O.O00000000.size(); var4++) {
            var1.add(new O00000OOO000OO.W293(null, var4));
         }
      }

      return var1;
   }

   private void O00000000(O0000O00000 o0000O00000, O00000OOO000O0 o00000OOO000O0, float f, float g) {
      float var5 = this.O00000000000(o0000O00000);
      O00000OOO000O0 var6 = this.O0000000000(o00000OOO000O0, o0000O00000);
      if (var6.contains(f, g)) {
         List var7 = this.O00000000000O();
         int var8 = (int)Math.floor((g - var6.y() + this.O0000000O0000) / var5);
         if (var8 >= 0 && var8 < var7.size()) {
            O00000OOO000OO.W293 var9 = (O00000OOO000OO.W293)var7.get(var8);
            float var10 = var6.y() + var8 * var5 - this.O0000000O0000;
            if (var9.presetIndex() >= 0) {
               if (this.O0000000000(o00000OOO000O0, o0000O00000, var10).contains(f, g)) {
                  this.O00000000OOO = var9.presetIndex();
                  this.O000000000(false);
               } else if (this.O00000000000(o00000OOO000O0, o0000O00000, var10).contains(f, g)) {
                  this.O00000000OOO = var9.presetIndex();
                  this.O000000000(true);
               } else {
                  this.O00000000OOO = var9.presetIndex();
                  this.O0000000000OO(O00000OOOOO00O.O00000000.get(var9.presetIndex()).O00000000);
               }
            } else {
               O00000OOOOO00 var11 = var9.slot();
               O00000OOOO00O var12 = O00000OOOO00O.O00000000(var11.O0000000000());
               boolean var13 = var11.O00000000().equals(O00000OOOOO000.O00000000().O000000000(var12));
               if (this.O000000000(o00000OOO000O0, o0000O00000, var10).contains(f, g)) {
                  if (var13) {
                     O00000OOOO0O00.O00000000().O00000000(var12);
                     O00000OOOO0O0.O00000000().O0000000000(var12);
                     O00000OOOOO000.O00000000().O00000000(var12, null);
                  }

                  O00000OOOO0O00.O00000000().O00000000(var11.O000000000());
                  O00000OOOO0O0.O00000000().O0000000000(var11.O000000000());
                  O00000OOOOO000.O00000000().O000000000(var11.O00000000());
                  if (var11.O00000000().equals(this.O0000000O00O0)) {
                     this.O0000000O00O0 = null;
                  }

                  this.O0000000000OO("slot deleted");
               } else if (this.O00000000(o00000OOO000O0, o0000O00000, var10).contains(f, g)) {
                  this.O00000000(var11);
               } else {
                  O00000OOO0OO00 var14 = O00000OOOOO000.O00000000().O00000000(var11.O00000000(), this.O0000000000000);
                  if (var14 != null) {
                     this.O000000000OOOO();
                     this.O0000000000O0 = var14;
                     this.O00000000O00OO();
                     this.O00000000OO = var12 == O00000OOOO00O.PREVIEW_ONLY ? O00000OOOO00O.HUD : var12;
                     this.O000000000000(this.O00000000OO);
                     this.O00000000000O.O00000000(this.O00000000OO);
                     this.O0000000O00OOO = this.O0000000000O0.O00000000().O000000000().isBlank()
                        ? var11.O000000000()
                        : this.O0000000000O0.O00000000().O000000000();
                     this.O0000000O00O0 = var11.O00000000();
                     this.O00000000000O0();
                     this.O00000000000O.O00000000(this.O0000000000O0);
                     this.O00000000(var11.O000000000(), this.O0000000000O0);
                     this.O0000000O00O0O = this.O0000000000O0.O000000000000();
                     this.O000000000000();
                     this.O0000000000OO("loaded " + var11.O000000000());
                  }
               }
            }
         }
      }
   }

   private boolean O00000000(O0000O00000 o0000O00000, int i, int j, float f, float g, int k) {
      O00000OOO000O0 var7 = this.O0000000000(o0000O00000, i, j);
      if (!this.O0000000O000) {
         return false;
      } else if (k != 0) {
         return var7.contains(f, g);
      } else if (!var7.contains(f, g)) {
         this.O0000000O000 = false;
         return false;
      } else {
         O00000OOO000O0 var8 = this.O00000000000(var7, o0000O00000);
         if (var8.contains(f, g)) {
            this.O0000000O000 = false;
            return true;
         } else {
            for (int var9 = 0; var9 < O0000000000.length; var9++) {
               if (this.O000000000(var7, o0000O00000, var9).contains(f, g)) {
                  this.O0000000O00000 = var9;
                  this.O0000000O0000 = 0.0F;
                  return true;
               }
            }

            this.O00000000(o0000O00000, var7, f, g);
            return true;
         }
      }
   }

   private boolean O00000000(O0000O00000 o0000O00000, int i, int j, float f, float g, double d) {
      if (!this.O0000000O000) {
         return false;
      } else {
         O00000OOO000O0 var8 = this.O0000000000(o0000O00000, i, j);
         if (!var8.contains(f, g)) {
            return false;
         } else {
            O00000OOO000O0 var9 = this.O0000000000(var8, o0000O00000);
            float var10 = this.O00000000000O().size() * this.O00000000000(o0000O00000);
            this.O0000000O0000 = O000000000(this.O0000000O0000 - (float)d * o0000O00000.O00000000(46.0F), 0.0F, Math.max(0.0F, var10 - var9.h()));
            return true;
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, O00000OOO000O0 o00000OOO000O0, int i) {
      float var5 = o00000OOO000O0.x() + o00000OOO000O0.w() * 0.5F;
      float var6 = o00000OOO000O0.y() + o00000OOO000O0.h() * 0.5F;
      float var7 = o0000O00000.O00000000(9.0F);
      float var8 = o0000O00000.O00000000(9.0F);
      o0000O00OO0O0.O00000000(var5 - var7 * 0.5F, var6 - var8 * 0.32F, var7, var8 * 0.82F, o0000O00000.O00000000(1.6F), i, 0.8F);
      o0000O00OO0O0.O00000000(var5 - var7 * 0.62F, var6 - var8 * 0.56F, var7 * 1.24F, o0000O00000.O00000000(1.3F), o0000O00000.O00000000(0.8F), i);
      o0000O00OO0O0.O00000000(var5 - var7 * 0.22F, var6 - var8 * 0.78F, var7 * 0.44F, o0000O00000.O00000000(1.4F), o0000O00000.O00000000(0.8F), i);
      o0000O00OO0O0.O00000000(
         var5 - var7 * 0.18F, var6 - var8 * 0.12F, o0000O00000.O00000000(1.0F), var8 * 0.45F, o0000O00000.O00000000(0.5F), ColorScheme.O00000000(i, 170)
      );
      o0000O00OO0O0.O00000000(
         var5 + var7 * 0.18F, var6 - var8 * 0.12F, o0000O00000.O00000000(1.0F), var8 * 0.45F, o0000O00000.O00000000(0.5F), ColorScheme.O00000000(i, 170)
      );
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, float f, float g, int i, boolean bl) {
      if (bl) {
         o0000O00OO0O0.O000000000(f, g, o0000O00000.O00000000(4.2F), 0.0F, 1.0F, ColorScheme.O00000000(i, 90));
         o0000O00OO0O0.O000000000(f, g, o0000O00000.O00000000(2.2F), 0.0F, 1.0F, ColorScheme.O00000000(i, 240));
      } else {
         o0000O00OO0O0.O00000000(
            f - o0000O00000.O00000000(2.4F),
            g - o0000O00000.O00000000(2.4F),
            o0000O00000.O00000000(4.8F),
            o0000O00000.O00000000(4.8F),
            o0000O00000.O00000000(1.4F),
            ColorScheme.O00000000(i, 116)
         );
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, O00000OOO000O0 o00000OOO000O0, float f, float g, float h
   ) {
      if (!(f <= o00000OOO000O0.h() + 1.0F)) {
         float var8 = o00000OOO000O0.x() + o00000OOO000O0.w() - o0000O00000.O00000000(4.0F);
         float var9 = o00000OOO000O0.y() + o0000O00000.O00000000(3.0F);
         float var10 = o00000OOO000O0.h() - o0000O00000.O00000000(6.0F);
         float var11 = Math.max(o0000O00000.O00000000(36.0F), var10 * o00000OOO000O0.h() / f);
         float var12 = Math.max(1.0F, f - o00000OOO000O0.h());
         float var13 = var9 + (var10 - var11) * (this.O0000000O0000 / var12);
         float var14 = O00000OOOOOOO.O00000000(
            7102L,
            var8 - o0000O00000.O00000000(3.0F),
            var9,
            o0000O00000.O00000000(9.0F),
            var10,
            var13,
            var11,
            o0000O00000.O00000000(6.0F),
            g,
            h,
            gx -> this.O0000000O0000 = O000000000(gx, 0.0F, 1.0F) * var12
         );
         float var15 = o0000O00000.O00000000(2.0F) + o0000O00000.O00000000(2.0F) * var14;
         o0000O00OO0O0.O00000000(var8, var9, o0000O00000.O00000000(2.0F), var10, o0000O00000.O00000000(1.0F), o0000O000O0OO.O00000000000O0());
         o0000O00OO0O0.O00000000(
            var8 + o0000O00000.O00000000(2.0F) - var15,
            var13,
            var15,
            var11,
            o0000O00000.O00000000(1.5F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), (int)(150.0F + 80.0F * var14))
         );
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O000000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O000O0OOO o0000O000O0OOO, int i, int j) {
      float var6 = this.O0000000O.O00000000();
      if (this.O0000000O000 || !(var6 <= 0.01F)) {
         this.O0000000000OO0();
         O0000O00000 var7 = o0000O000O0OOO.O000000000000();
         ColorScheme var8 = o0000O000O0OOO.O0000000000000();
         O00000OOO000O0 var9 = this.O0000000000(var7, i, j);
         var9 = new O00000OOO000O0(var9.x(), var9.y() - var7.O00000000(10.0F) * (1.0F - var6), var9.w(), var9.h());
         float var10 = var7.O00000000(12.0F);
         o0000O00OO0O0.O000000000000(var6);
         boolean var24 = false /* VF: Semaphore variable */;

         label200: {
            try {
               var24 = true;
               o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var10, var7.O00000000(22.0F), var7.O00000000(2.0F), this.O0000000000(var8, 148));
               o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var10, this.O000000000(var8, 232));
               o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var10, ColorScheme.O00000000(var8.O000000000O0(), 108), 0.8F);
               o0000O00OO0O0.O00000000(
                  var9.x() + var7.O00000000(1.0F),
                  var9.y() + var7.O00000000(1.0F),
                  var9.w() - var7.O00000000(2.0F),
                  var7.O00000000(1.0F),
                  var7.O00000000(1.0F),
                  ColorScheme.O00000000(var8.O000000000O(), this.O00000000(var8) ? 58 : 18)
               );
               O0000O00000OO.O00000000(
                  o0000O00OO0O0,
                  var7,
                  FontRegistry.O00000000000,
                  var9.x() + var7.O00000000(12.0F),
                  var9.y() + var7.O00000000(12.0F),
                  12.0F,
                  "Library",
                  this.O000000000(var8)
               );
               O0000O00000OO.O00000000(
                  o0000O00OO0O0,
                  var7,
                  FontRegistry.O00000000,
                  var9.x() + var7.O00000000(12.0F),
                  var9.y() + var7.O00000000(27.0F),
                  8.0F,
                  "your shaders and presets / preview, bind, apply",
                  ColorScheme.O00000000(var8.O000000000O0(), 196)
               );
               O00000OOO000O0 var11 = this.O00000000000(var9, var7);
               boolean var12 = var11.contains(o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0());
               o0000O00OO0O0.O00000000(
                  var11.x(),
                  var11.y(),
                  var11.w(),
                  var11.h(),
                  var7.O00000000(7.0F),
                  ColorScheme.O00000000(var8.O00000000000O0(), ColorScheme.O00000000(220, 80, 96, 112), var12 ? 1.0F : 0.0F)
               );
               o0000O00OO0O0.O00000000(
                  var11.x(),
                  var11.y(),
                  var11.w(),
                  var11.h(),
                  var7.O00000000(7.0F),
                  ColorScheme.O00000000(var12 ? -37756 : var8.O0000000000O(), var12 ? 210 : 64),
                  0.65F
               );
               this.O00000000(o0000O00OO0O0, var7, var8, var11.x() + var11.w() * 0.5F, var11.y() + var11.h() * 0.5F, 4, var12 ? 1.0F : 0.35F);

               for (int var13 = 0; var13 < O0000000000.length; var13++) {
                  this.O00000000(
                     o0000O00OO0O0,
                     var7,
                     var8,
                     this.O000000000(var9, var7, var13),
                     O0000000000[var13],
                     this.O0000000O00000 == var13,
                     o0000O000O0O0.O0000000O(),
                     o0000O000O0O0.O0000000O0()
                  );
               }

               List var30 = this.O00000000000O();
               O00000OOO000O0 var14 = this.O0000000000(var9, var7);
               if (var30.isEmpty()) {
                  o0000O00OO0O0.O00000000(
                     var14.x(), var14.y(), var14.w(), var14.h(), var7.O00000000(9.0F), ColorScheme.O00000000(255, 255, 255, this.O00000000(var8) ? 38 : 8)
                  );
                  o0000O00OO0O0.O00000000(var14.x(), var14.y(), var14.w(), var14.h(), var7.O00000000(9.0F), var8.O0000000000O(), 0.65F);
                  O0000O00000OO.O00000000(
                     o0000O00OO0O0,
                     var7,
                     FontRegistry.O00000000000,
                     var14.x() + var7.O00000000(12.0F),
                     var14.y() + var7.O00000000(18.0F),
                     10.0F,
                     "No saved shaders",
                     this.O000000000(var8)
                  );
                  O0000O00000OO.O00000000(
                     o0000O00OO0O0,
                     var7,
                     FontRegistry.O00000000,
                     var14.x() + var7.O00000000(12.0F),
                     var14.y() + var7.O00000000(34.0F),
                     8.0F,
                     "Ctrl+S or File / Save As stores the current graph here.",
                     this.O0000000000(var8)
                  );
                  var24 = false;
                  break label200;
               }

               float var15 = this.O00000000000(var7);
               float var16 = var30.size() * var15;
               this.O0000000O0000 = O000000000(this.O0000000O0000, 0.0F, Math.max(0.0F, var16 - var14.h()));
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O00000000(
                  var14.x(), var14.y(), var14.w(), var14.h(), var7.O00000000(9.0F), var7.O00000000(9.0F), var7.O00000000(9.0F), var7.O00000000(9.0F)
               );

               try {
                  for (int var17 = 0; var17 < var30.size(); var17++) {
                     float var18 = var14.y() + var17 * var15 - this.O0000000O0000;
                     if (!(var18 > var14.y() + var14.h()) && !(var18 + var15 < var14.y())) {
                        O00000OOO000OO.W293 var19 = (O00000OOO000OO.W293)var30.get(var17);
                        if (var19.presetIndex() >= 0) {
                           this.O00000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, var7, var8, var9, var14, var19.presetIndex(), var18, var15, i, j, var6);
                        } else {
                           this.O00000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, var7, var8, var9, var14, var19.slot(), var18, var15, var6);
                        }
                     }
                  }
               } finally {
                  o0000O00OO0O0.O0000000000();
                  o0000O00OO0O0.O0000000000000();
               }

               this.O00000000(o0000O00OO0O0, var7, var8, var14, var16, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0());
               var24 = false;
            } finally {
               if (var24) {
                  o0000O00OO0O0.O00000000000OO();
               }
            }

            o0000O00OO0O0.O00000000000OO();
            return;
         }

         o0000O00OO0O0.O00000000000OO();
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      O0000O000O0OOO o0000O000O0OOO,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O00000OOO000O0 o00000OOO000O0,
      O00000OOO000O0 o00000OOO000O02,
      O00000OOOOO00 o00000OOOOO00,
      float f,
      float g,
      float h
   ) {
      O00000OOOOO000 var12 = O00000OOOOO000.O00000000();
      boolean var13 = o0000O000O0O0.O0000000O() >= o00000OOO000O02.x()
         && o0000O000O0O0.O0000000O() <= o00000OOO000O02.x() + o00000OOO000O02.w()
         && o0000O000O0O0.O0000000O0() >= f
         && o0000O000O0O0.O0000000O0() <= f + g - o0000O00000.O00000000(6.0F);
      boolean var14 = o00000OOOOO00.O00000000().equals(this.O0000000O00O0);
      O00000OOOO00O var15 = O00000OOOO00O.O00000000(o00000OOOOO00.O0000000000());
      boolean var16 = o00000OOOOO00.O00000000().equals(var12.O000000000(var15));
      O00000OOO000O0 var17 = new O00000OOO000O0(o00000OOO000O02.x(), f, o00000OOO000O02.w() - o0000O00000.O00000000(4.0F), g - o0000O00000.O00000000(6.0F));
      float var18 = Math.max(var13 ? 0.75F : 0.0F, var14 ? 0.58F : 0.0F);
      o0000O00OO0O0.O00000000(
         var17.x(),
         var17.y(),
         var17.w(),
         var17.h(),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(
            ColorScheme.O00000000(255, 255, 255, this.O00000000(o0000O000O0OO) ? 46 : 10), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 72), var18
         )
      );
      o0000O00OO0O0.O00000000(
         var17.x(),
         var17.y(),
         var17.w(),
         var17.h(),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(
            o0000O000O0OO.O0000000000O(),
            ColorScheme.O00000000(var16 ? o0000O000O0OO.O000000000O00() : o0000O000O0OO.O000000000O0(), 126),
            Math.max(var18, var16 ? 0.38F : 0.0F)
         ),
         0.65F
      );
      O00000OOO000O0 var19 = this.O000000000000(var17, o0000O00000);
      this.O00000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, o00000OOOOO00, var19, h);
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         var17.x() + o0000O00000.O00000000(12.0F),
         var17.y() + var17.h() * 0.5F,
         var16 ? o0000O000O0OO.O000000000O00() : o0000O000O0OO.O000000000O0(),
         var14
      );
      float var20 = var19.x() + var19.w() + o0000O00000.O00000000(10.0F);
      O00000OOO000O0 var21 = this.O00000000(o00000OOO000O0, o0000O00000, f);
      O00000OOO000O0 var22 = this.O000000000(o00000OOO000O0, o0000O00000, f);
      float var23 = Math.max(o0000O00000.O00000000(72.0F), var21.x() - var20 - o0000O00000.O00000000(10.0F));
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var20,
         var17.y() + o0000O00000.O00000000(8.0F),
         10.0F,
         O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, o00000OOOOO00.O000000000(), 10.0F, var23),
         this.O000000000(o0000O000O0OO)
      );
      String var24 = (var15 == null ? "Unknown" : var15.O000000000()) + (var16 ? " / bound" : "") + " / " + this.O00000000(o00000OOOOO00.O0000000000O());
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         var20,
         var17.y() + o0000O00000.O00000000(25.0F),
         8.0F,
         O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, var24, 8.0F, var23),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 200)
      );
      String var25 = o00000OOOOO00.O000000000000O() + " / " + O00000OOOO0O00.O00000000().O00000000000O(o00000OOOOO00.O000000000()).size() + " uniforms";
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         var20,
         var17.y() + o0000O00000.O00000000(40.0F),
         8.0F,
         O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, var25, 8.0F, var23),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 176)
      );
      boolean var26 = var21.contains(o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0());
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var21, var16 ? "Off" : "Bind", var26, var16);
      boolean var27 = var22.contains(o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0());
      o0000O00OO0O0.O00000000(
         var22.x(),
         var22.y(),
         var22.w(),
         var22.h(),
         o0000O00000.O00000000(7.0F),
         ColorScheme.O00000000(o0000O000O0OO.O00000000000O0(), ColorScheme.O00000000(230, 82, 96, 128), var27 ? 1.0F : 0.0F)
      );
      o0000O00OO0O0.O00000000(
         var22.x(),
         var22.y(),
         var22.w(),
         var22.h(),
         o0000O00000.O00000000(7.0F),
         ColorScheme.O00000000(var27 ? -37756 : o0000O000O0OO.O0000000000O(), var27 ? 220 : 70),
         0.65F
      );
      this.O00000000(
         o0000O00OO0O0, o0000O00000, var22, var27 ? ColorScheme.O00000000(255, 214, 220, 242) : ColorScheme.O00000000(o0000O000O0OO.O000000000O(), 148)
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      O0000O000O0OOO o0000O000O0OOO,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O00000OOO000O0 o00000OOO000O0,
      O00000OOO000O0 o00000OOO000O02,
      int i,
      float f,
      float g,
      int j,
      int k,
      float h
   ) {
      O00000OOOOO00O.W314 var14 = O00000OOOOO00O.O00000000.get(i);
      boolean var15 = o0000O000O0O0.O0000000O() >= o00000OOO000O02.x()
         && o0000O000O0O0.O0000000O() <= o00000OOO000O02.x() + o00000OOO000O02.w()
         && o0000O000O0O0.O0000000O0() >= f
         && o0000O000O0O0.O0000000O0() <= f + g - o0000O00000.O00000000(6.0F);
      boolean var16 = i == this.O00000000OOO;
      O00000OOO000O0 var17 = new O00000OOO000O0(o00000OOO000O02.x(), f, o00000OOO000O02.w() - o0000O00000.O00000000(4.0F), g - o0000O00000.O00000000(6.0F));
      float var18 = Math.max(var15 ? 0.62F : 0.0F, var16 ? 0.5F : 0.0F);
      o0000O00OO0O0.O00000000(
         var17.x(),
         var17.y(),
         var17.w(),
         var17.h(),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(
            ColorScheme.O00000000(255, 255, 255, this.O00000000(o0000O000O0OO) ? 46 : 10), ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 66), var18
         )
      );
      o0000O00OO0O0.O00000000(
         var17.x(),
         var17.y(),
         var17.w(),
         var17.h(),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(
            o0000O000O0OO.O0000000000O(),
            ColorScheme.O00000000(var16 ? o0000O000O0OO.O000000000O0() : o0000O000O0OO.O000000000O00(), var16 ? 148 : 112),
            Math.max(var18, var16 ? 0.6F : 0.0F)
         ),
         var16 ? 0.85F : 0.65F
      );
      if (var16) {
         o0000O00OO0O0.O00000000(
            var17.x(),
            var17.y() + o0000O00000.O00000000(9.0F),
            o0000O00000.O00000000(2.4F),
            var17.h() - o0000O00000.O00000000(18.0F),
            o0000O00000.O00000000(1.2F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 230)
         );
      }

      O00000OOO000O0 var19 = this.O000000000000(var17, o0000O00000);
      O00000OOO0OOOO.O00000000(
         o0000O00OO0O0,
         o0000O000O0OOO,
         this.O00000000OOO0.get(i),
         "__preset_thumb_" + i,
         var19.x(),
         var19.y(),
         var19.w(),
         var19.h(),
         j,
         k,
         o0000O000O0O0.O0000000O(),
         o0000O000O0O0.O0000000O0(),
         h
      );
      o0000O00OO0O0.O00000000(
         var19.x(),
         var19.y(),
         var19.w(),
         var19.h(),
         o0000O00000.O00000000(6.0F),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), Math.round(84.0F * h)),
         0.55F
      );
      this.O00000000(o0000O00OO0O0, o0000O00000, var17.x() + o0000O00000.O00000000(12.0F), var17.y() + var17.h() * 0.5F, o0000O000O0OO.O000000000O00(), var16);
      float var20 = var19.x() + var19.w() + o0000O00000.O00000000(10.0F);
      O00000OOO000O0 var21 = this.O0000000000(o00000OOO000O0, o0000O00000, f);
      float var22 = Math.max(o0000O00000.O00000000(72.0F), var21.x() - var20 - o0000O00000.O00000000(10.0F));
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var20,
         var17.y() + o0000O00000.O00000000(8.0F),
         10.0F,
         O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, var14.O00000000, 10.0F, var22),
         this.O000000000(o0000O000O0OO)
      );
      String var23 = var14.O0000000000.O000000000();
      float var24 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, var23, 7.0F) + o0000O00000.O00000000(12.0F);
      float var25 = var17.y() + o0000O00000.O00000000(23.0F);
      o0000O00OO0O0.O00000000(
         var20, var25, var24, o0000O00000.O00000000(13.0F), o0000O00000.O00000000(6.5F), ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 44)
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         var20 + o0000O00000.O00000000(6.0F),
         var25,
         o0000O00000.O00000000(13.0F),
         7.0F,
         var23,
         ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 235)
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         var20 + var24 + o0000O00000.O00000000(8.0F),
         var25 + o0000O00000.O00000000(3.0F),
         7.5F,
         O0000O00000OO.O00000000(
            o0000O00000, FontRegistry.O00000000, "preset / " + var14.O00000000000, 7.5F, Math.max(1.0F, var22 - var24 - o0000O00000.O00000000(8.0F))
         ),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 186)
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         var20,
         var17.y() + o0000O00000.O00000000(40.0F),
         8.0F,
         O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, var14.O000000000, 8.0F, var22),
         this.O0000000000(o0000O000O0OO)
      );
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var21, "Use", o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), true);
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         this.O00000000000(o00000OOO000O0, o0000O00000, f),
         "Merge",
         o0000O000O0O0.O0000000O(),
         o0000O000O0O0.O0000000O0(),
         false
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      O0000O000O0OOO o0000O000O0OOO,
      O00000OOOOO00 o00000OOOOO00,
      O00000OOO000O0 o00000OOO000O0,
      float f
   ) {
      O0000O00000 var7 = o0000O000O0OOO.O000000000000();
      ColorScheme var8 = o0000O000O0OOO.O0000000000000();
      float var9 = var7.O00000000(6.0F);
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         var9,
         ColorScheme.O00000000(255, 255, 255, this.O00000000(var8) ? 48 : 10)
      );
      boolean var10 = false;
      String var11 = o00000OOOOO00 == null ? "" : o00000OOOOO00.O000000000();
      if (!var11.isBlank() && O00000OOOO0O00.O00000000().O000000000000(var11)) {
         O00000OOO0OO00 var12 = O00000OOOO0O00.O00000000().O0000000000(var11);
         O00000OOOO00O var13 = O00000OOOO00O.O00000000(o00000OOOOO00.O0000000000());
         if (var13 == O00000OOOO00O.PREVIEW_ONLY) {
            var13 = this.O00000000OO;
         }

         if (var12 != null) {
            O00000OOO0OOOO.O00000000(
               o0000O00OO0O0,
               o0000O000O0OOO,
               var11,
               var13,
               var12,
               o00000OOO000O0.x(),
               o00000OOO000O0.y(),
               o00000OOO000O0.w(),
               o00000OOO000O0.h(),
               this.O000000000OO00(),
               this.O000000000OO0O(),
               o0000O000O0O0.O0000000O(),
               o0000O000O0O0.O0000000O0(),
               f
            );
            var10 = true;
         }
      }

      if (!var10) {
         o0000O00OO0O0.O000000000(
            o00000OOO000O0.x(),
            o00000OOO000O0.y(),
            o00000OOO000O0.w(),
            o00000OOO000O0.h(),
            var9,
            ColorScheme.O00000000(var8.O000000000O0(), Math.round(70.0F * f)),
            ColorScheme.O00000000(var8.O000000000O00(), Math.round(42.0F * f))
         );
      }

      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         var9,
         ColorScheme.O00000000(var8.O000000000O0(), Math.round(84.0F * f)),
         0.55F
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, O00000OOO000O0 o00000OOO000O0, String string, boolean bl, boolean bl2
   ) {
      float var8 = Math.max(bl2 ? 0.62F : 0.0F, bl ? 1.0F : 0.0F);
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         o0000O00000.O00000000(7.0F),
         ColorScheme.O00000000(
            o0000O000O0OO.O00000000000O0(), ColorScheme.O00000000(bl2 ? o0000O000O0OO.O000000000O00() : o0000O000O0OO.O000000000O0(), 84), var8
         )
      );
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         o0000O00000.O00000000(7.0F),
         ColorScheme.O00000000(
            o0000O000O0OO.O0000000000O(), ColorScheme.O00000000(bl2 ? o0000O000O0OO.O000000000O00() : o0000O000O0OO.O000000000O0(), 152), var8
         ),
         0.62F
      );
      float var9 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, string, 9.0F);
      float var10 = o00000OOO000O0.x() + (o00000OOO000O0.w() - var9 - o0000O00000.O00000000(10.0F)) * 0.5F;
      int var11 = ColorScheme.O00000000(bl2 ? o0000O000O0OO.O000000000O00() : o0000O000O0OO.O000000000O0(), Math.round(160.0F + 80.0F * var8));
      float var12 = o00000OOO000O0.y() + o00000OOO000O0.h() * 0.5F;
      if (bl2) {
         o0000O00OO0O0.O000000000(var10 + o0000O00000.O00000000(3.0F), var12, o0000O00000.O00000000(3.0F), 0.0F, 1.0F, ColorScheme.O00000000(var11, 88));
         o0000O00OO0O0.O000000000(var10 + o0000O00000.O00000000(3.0F), var12, o0000O00000.O00000000(1.6F), 0.0F, 1.0F, var11);
      } else {
         o0000O00OO0O0.O00000000(var10 + o0000O00000.O00000000(3.0F), var12, o0000O00000.O00000000(2.6F), 0.0F, 1.0F, 0.9F, var11);
      }

      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var10 + o0000O00000.O00000000(10.0F),
         o00000OOO000O0.y(),
         o00000OOO000O0.h(),
         9.0F,
         string,
         ColorScheme.O00000000(o0000O000O0OO.O0000000000OOO(), o0000O000O0OO.O000000000O(), 0.52F + var8 * 0.48F)
      );
   }

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, O0000O000O0OOO o0000O000O0OOO, float f, float g, int i, int j, int k) {
      if (o0000O000O0O0 != null && o0000O000O0OOO != null && this.O00000000(o0000O000O0O0)) {
         this.O00000000O0O = f;
         this.O00000000O0O0 = g;
         O0000O00000 var8 = o0000O000O0OOO.O000000000000();
         if (this.O0000000000O.O000000000()) {
            boolean var17 = this.O0000000000O.O00000000(f, g, i, var8, j, k);
            this.O00000000O00O0();
            return var17;
         } else {
            if (this.O00000000000O0.O00000000()) {
               O00000OOO000O0 var9 = this.O00000000000O0.O00000000(var8, j, k);
               if (var9.contains(f, g)) {
                  if (i == 0) {
                     O00000OOO0O00O var18 = this.O00000000000O0.O00000000(var8, j, k, f, g);
                     if (var18 != null) {
                        this.O00000000(var18);
                        return true;
                     }

                     String var20 = this.O00000000000O0.O000000000(var8, j, k, f, g);
                     if (var20 != null) {
                        this.O00000000000O0.O00000000(var20);
                        return true;
                     }
                  }

                  return true;
               }

               if (i == 0 || i == 1) {
                  this.O00000000000O0.O000000000000();
                  return true;
               }
            }

            if (this.O00000000OO0O) {
               return this.O0000000000(var8, j, k, f, g, i);
            } else {
               if (this.O0000000O0O0OO != null && !this.O00000000(var8, j, k).contains(f, g)) {
                  this.O000000000O00();
               }

               if (this.O0000000O000O && (this.O0000000O0 || !this.O00000000(var8, k).contains(f, g))) {
                  this.O0000000O000O = false;
               }

               if (i == 0 && this.O00000000(o0000O000O0O0, var8, j, f, g)) {
                  return true;
               } else if (this.O0000000O000 && this.O00000000(var8, j, k, f, g, i)) {
                  return true;
               } else if (this.O00000000OO0 && this.O00000000(var8, j, f, g, i)) {
                  return true;
               } else if (this.O00000000OO00 && this.O000000000(var8, j, k, f, g, i)) {
                  return true;
               } else if (this.O00000000OO000 && this.O000000000(var8, j, f, g, i)) {
                  return true;
               } else if (this.O00000000000(var8, j, k, f, g, i)) {
                  return true;
               } else {
                  O00000OOO000O0 var16 = this.O000000000(var8, k);
                  O00000OOO000O0 var10 = this.O0000000000(var8, k);
                  if (i == 0 && var10.contains(f, g)) {
                     this.O0000000O0 = !this.O0000000O0;
                     return true;
                  } else if (this.O0000000O0 || i != 0 || !var16.contains(f, g)) {
                     O00000OOO000O0 var11 = this.O000000000(var8, j, k);
                     if (i == 0 && var11.contains(f, g)) {
                        if (g <= var11.y() + var8.O00000000(34.0F)) {
                           this.O0000000OO0O0O = true;
                           this.O0000000OO0OO = f - var11.x();
                           this.O0000000OO0OO0 = g - var11.y();
                        }

                        return true;
                     } else {
                        if (i == 0) {
                           O00000OOO0OO0O var12 = this.O000000000000(f, g);
                           if (var12 != null) {
                              this.O00000000000OO(var12.O00000000());
                              this.O00000000(var12.O00000000());
                              return true;
                           }
                        }

                        if (i != 2 && (i != 0 || !this.O000000000OO0())) {
                           O00000OOO000OO.W296 var21 = this.O0000000000000(f, g);
                           if (i == 0 && var21 != null) {
                              if (var21.direction == O00000OOO0O0O0.OUTPUT) {
                                 this.O00000000O00O0 = var21.nodeId;
                                 this.O00000000O00OO = var21.pinId;
                                 this.O00000000(var21.nodeId);
                              } else {
                                 this.O000000000OOOO();
                                 if (this.O0000000000O0.O00000000(var21.nodeId, var21.pinId)) {
                                    this.O0000000OO0.O00000000(1.0F);
                                 }

                                 this.O00000000(var21.nodeId);
                              }

                              return true;
                           } else {
                              O00000OOO0OO0O var13 = this.O00000000000(f, g);
                              if (i == 0 && var13 != null) {
                                 if (Screen.hasShiftDown()) {
                                    this.O000000000OOO.add(var13.O00000000());
                                    this.O000000000OO0O = var13.O00000000();
                                 } else if (!this.O0000000000(var13.O00000000())) {
                                    this.O00000000(var13.O00000000());
                                 } else {
                                    this.O000000000OO0O = var13.O00000000();
                                 }

                                 if (O000000000000O(var13.O000000000()) && this.O0000000000(var13).contains(f, g)) {
                                    this.O000000000OOOO();
                                    this.O000000000O();
                                    O00000OOOOO0O0 var24 = this.O00000000(var13);
                                    var24.O00000000(var13.O00000000("value", "int_value".equals(var13.O000000000()) ? 1.0F : 0.5F));
                                    if (var24.O00000000(f, g, i, this.O0000000000(var13))) {
                                       this.O0000000O0O0O = var13.O00000000();
                                    }

                                    return true;
                                 } else if (this.O000000000000(var13) && this.O00000000000(var13).contains(f, g)) {
                                    this.O000000000OOOO();
                                    this.O000000000O();
                                    this.O000000000O0();
                                    O00000OOOOO0O0 var14 = this.O000000000(var13);
                                    var14.O00000000(var13.O00000000("name", this.O0000000000000(var13)));
                                    if (var14.O00000000(f, g, i, this.O00000000000(var13))) {
                                       this.O0000000O0O0O0 = var13.O00000000();
                                    }

                                    return true;
                                 } else {
                                    this.O000000000O();
                                    this.O000000000O0();
                                    this.O000000000OOOO();
                                    this.O000000000OO = var13.O00000000();
                                    this.O000000000OO0 = this.O000000000000(f) - var13.O0000000000();
                                    this.O000000000OO00 = this.O0000000000000(g) - var13.O00000000000();
                                    this.O00000000(f, g);
                                    return true;
                                 }
                              } else {
                                 if (this.O0000000O0O0O != null) {
                                    this.O000000000O();
                                 }

                                 if (this.O0000000O0O0O0 != null) {
                                    this.O000000000O0();
                                 }

                                 if (i == 1) {
                                    this.O00000000000O0.O00000000(f, g, null);
                                    return true;
                                 } else if (i == 0) {
                                    this.O00000000O00 = true;
                                    this.O000000000OOO0.clear();
                                    if (Screen.hasShiftDown()) {
                                       this.O000000000OOO0.addAll(this.O000000000OOO);
                                    }

                                    this.O00000000O000 = f;
                                    this.O00000000O0000 = g;
                                    this.O00000000O000O = f;
                                    this.O00000000O00O = g;
                                    if (!Screen.hasShiftDown()) {
                                       this.O00000000000O0();
                                    }

                                    return true;
                                 } else {
                                    return true;
                                 }
                              }
                           }
                        } else {
                           this.O000000000(f, g);
                           return true;
                        }
                     }
                  } else if (this.O00000000(var8, k).contains(f, g)) {
                     this.O0000000O000O = true;
                     this.O0000000O000O0 = System.currentTimeMillis();
                     return true;
                  } else {
                     this.O0000000O000O = false;
                     O00000OOO000OO.W295 var19 = this.O00000000(var8, k, f, g);
                     if (var19 != null) {
                        if (var19.row().type() == 0) {
                           if (!this.O0000000O000OO.remove(var19.row().category())) {
                              this.O0000000O000OO.add(var19.row().category());
                           }

                           return true;
                        }

                        O00000OOO0O00O var22 = var19.row().def();
                        if (var19.star()) {
                           O00000OOOOO.O00000000().O000000000(var22.O00000000());
                           return true;
                        }

                        float var23 = this.O000000000000(j * 0.5F);
                        float var25 = this.O0000000000000(k * 0.5F);
                        this.O000000000OOOO();
                        O00000OOO0OO0O var15 = this.O0000000000O0
                           .O00000000(var22.O00000000(), var23 - var22.O00000000000() * 0.5F, var25 - this.O000000000(var22) * 0.5F, this.O0000000000000);
                        this.O00000000(var15.O00000000());
                        this.O0000000O0OO00.put(var15.O00000000(), new O0000O000O00O(0.0F));
                        O00000OOOOO.O00000000().O0000000000(var22.O00000000());
                        this.O0000000000OO(var22.O000000000());
                     }

                     return true;
                  }
               }
            }
         }
      } else {
         return false;
      }
   }

   private void O00000000(O00000OOO0O00O o00000OOO0O00O) {
      float var2 = this.O00000000000O0.O0000000000();
      float var3 = this.O00000000000O0.O00000000000();
      float var4 = this.O000000000000(var2);
      float var5 = this.O0000000000000(var3);
      this.O000000000OOOO();
      O00000OOO0OO0O var6 = this.O0000000000O0
         .O00000000(o00000OOO0O00O.O00000000(), var4 - o00000OOO0O00O.O00000000000() * 0.5F, var5 - this.O000000000(o00000OOO0O00O) * 0.5F, this.O0000000000000);
      this.O00000000(var6.O00000000());
      this.O0000000O0OO00.put(var6.O00000000(), new O0000O000O00O(0.0F));
      if (o00000OOO0O00O.O00000000000O()) {
         this.O0000000O0OOO0.put(var6.O00000000(), true);
         this.O0000000000O0(var6.O00000000()).O0000000000(1.0F);
         this.O0000000000O(var6.O00000000());
      }

      if (this.O00000000000O0.O000000000() != null && this.O0000000O0OO != null && this.O0000000O0OO0 != null) {
         String var7 = null;

         for (O00000OOO0O0OO var9 : o00000OOO0O00O.O000000000000()) {
            if (var9.type() == this.O00000000000O0.O000000000()) {
               var7 = var9.id();
               break;
            }
         }

         if (var7 != null) {
            this.O0000000000O0.O00000000(this.O0000000O0OO, this.O0000000O0OO0, var6.O00000000(), var7, this.O0000000000000);
            this.O0000000OO0.O00000000(1.0F);
         }
      }

      this.O0000000O0OO = null;
      this.O0000000O0OO0 = null;
      this.O00000000000O0.O000000000000();
      O00000OOOOO.O00000000().O0000000000(o00000OOO0O00O.O00000000());
      this.O0000000000OO(o00000OOO0O00O.O000000000());
   }

   private void O00000000(String string) {
      this.O000000000OOO.clear();
      if (string != null) {
         this.O000000000OOO.add(string);
      }

      this.O000000000OO0O = string;
   }

   private void O00000000000O0() {
      this.O000000000OOO.clear();
      this.O000000000OO0O = null;
      this.O0000000O0O0OO = null;
   }

   private void O00000000000OO() {
      for (O0000O00O0O0OO var2 : this.O0000000O0OOOO.values()) {
         if (var2 != null) {
            var2.O0000000000(0.0F);
         }
      }

      this.O0000000O0OOO0.clear();
      this.O0000000O0OOOO.clear();
   }

   private void O000000000(String string) {
      if (string != null) {
         this.O0000000O0O00O.keySet().removeIf(string2 -> string2.startsWith(string + ":"));
      }
   }

   private boolean O0000000000(String string) {
      return string != null && this.O000000000OOO.contains(string);
   }

   private void O0000000000O() {
      if (this.O000000000OOO.isEmpty()) {
         this.O000000000OO0O = null;
      } else {
         if (this.O000000000OO0O == null || !this.O000000000OOO.contains(this.O000000000OO0O)) {
            this.O000000000OO0O = this.O000000000OOO.iterator().next();
         }
      }
   }

   private void O00000000(float f, float g) {
      this.O000000000OOOO.clear();
      if (!this.O000000000OOO.isEmpty() && this.O000000000OOO.contains(this.O000000000OO)) {
         for (String var4 : this.O000000000OOO) {
            O00000OOO0OO0O var5 = this.O0000000000O0.O0000000000(var4);
            if (var5 != null) {
               this.O000000000OOOO.put(var4, new O00000OOO000OO.W291(var5.O0000000000(), var5.O00000000000()));
            }
         }
      } else {
         O00000OOO0OO0O var3 = this.O0000000000O0.O0000000000(this.O000000000OO);
         if (var3 != null) {
            this.O000000000OOOO.put(var3.O00000000(), new O00000OOO000OO.W291(var3.O0000000000(), var3.O00000000000()));
         }
      }

      this.O00000000O = this.O000000000000(f);
      this.O00000000O0 = this.O0000000000000(g);
   }

   private void O00000000(boolean bl) {
      float var2 = Math.min(this.O00000000O000, this.O00000000O000O);
      float var3 = Math.min(this.O00000000O0000, this.O00000000O00O);
      float var4 = Math.max(this.O00000000O000, this.O00000000O000O);
      float var5 = Math.max(this.O00000000O0000, this.O00000000O00O);
      this.O000000000OOO.clear();
      if (bl) {
         this.O000000000OOO.addAll(this.O000000000OOO0);
      }

      for (O00000OOO0OO0O var7 : this.O0000000000O0.O0000000000()) {
         O00000OOO0O00O var8 = this.O0000000000000.O00000000(var7.O000000000());
         if (var8 != null) {
            float var9 = this.O0000000000(var7.O0000000000());
            float var10 = this.O00000000000(var7.O00000000000());
            float var11 = var8.O00000000000() * this.O0000000000OO;
            float var12 = this.O00000000(var8, var7) * this.O0000000000OO;
            if (O00000000(var2, var3, var4 - var2, var5 - var3, var9, var10, var11, var12)) {
               this.O000000000OOO.add(var7.O00000000());
            }
         }
      }

      this.O0000000000O();
   }

   private void O0000000000O0() {
      if (!this.O000000000OOO.isEmpty()) {
         this.O000000000OOOO();
         ArrayList var1 = new ArrayList<>(this.O000000000OOO);
         HashMap var2 = new HashMap();
         this.O000000000OOO.clear();

         for (String var4 : (List<String>)var1) {
            O00000OOO0OO0O var5 = this.O0000000000O0.O0000000000(var4);
            if (var5 != null) {
               O00000OOO0OO0O var6 = this.O0000000000O0
                  .O00000000(var5.O000000000(), var5.O0000000000() + 42.0F, var5.O00000000000() + 42.0F, this.O0000000000000);
               var6.O0000000000000().putAll(var5.O0000000000000());
               var6.O000000000000O().putAll(var5.O000000000000O());
               var2.put(var4, var6.O00000000());
               this.O000000000OOO.add(var6.O00000000());
               this.O0000000O0OO00.put(var6.O00000000(), new O0000O000O00O(0.0F));
            }
         }

         for (O00000OOO0OO0 var8 : new ArrayList<>(this.O0000000000O0.O00000000000())) {
            String var9 = (String)var2.get(var8.O00000000());
            String var10 = (String)var2.get(var8.O0000000000());
            if (var9 != null && var10 != null) {
               this.O0000000000O0.O00000000(var9, var8.O000000000(), var10, var8.O00000000000(), this.O0000000000000);
            }
         }

         this.O0000000000O();
         this.O0000000OO0.O00000000(1.0F);
         this.O0000000000OO("duplicated " + this.O000000000OOO.size());
      }
   }

   private void O0000000000O00() {
      this.O0000000O00OOO = O000000000000(this.O0000000O00OOO);
      O00000OOOOO000 var1 = O00000OOOOO000.O00000000();
      O00000OOOOO00 var2 = this.O0000000O00O0 == null ? null : var1.O00000000(this.O0000000O00O0);
      String var3 = var2 == null ? "" : var2.O000000000();
      this.O00000000O0O();
      this.O0000000000O0.O00000000().O00000000(this.O0000000O00OOO, O00000OOOOO000.O000000000000O());
      this.O0000000000O0.O00000000().O00000000(this.O0000000O00OOO);
      this.O0000000000O0
         .O00000000()
         .O000000000(this.O0000000000O0.O00000000().O0000000000().isBlank() ? O00000OOOOO000.O000000000000O() : this.O0000000000O0.O00000000().O0000000000());
      this.O0000000000O0.O00000000().O000000000000("local");
      this.O0000000000O0.O00000000().O000000000(System.currentTimeMillis());
      this.O000000000000(this.O00000000OO);
      this.O00000000000O.O00000000(this.O00000000OO);
      boolean var4 = this.O00000000000O.O00000000(this.O0000000O00OOO, this.O0000000000O0);
      if (var4) {
         O00000OOOOO00 var5 = var1.O00000000(this.O00000000OO, this.O0000000000O0, this.O0000000O00OOO, this.O0000000O00O0);
         if (var5 != null) {
            this.O0000000O00O0 = var5.O00000000();
            this.O00000000(var5.O000000000(), this.O0000000000O0);
         }

         if (!var3.isBlank() && !O00000OOOO0O00.O00000000000OO(var3).equals(O00000OOOO0O00.O00000000000OO(this.O0000000O00OOO))) {
            O00000OOOO0O00.O00000000().O00000000(var3);
            O00000OOOO0O0.O00000000().O0000000000(var3);
         }

         this.O0000000O00O0O = this.O0000000000O0.O000000000000();
         this.O0000000000OO("saved " + this.O0000000O00OOO);
      } else {
         this.O0000000000OO(this.O00000000000O.O000000000().isBlank() ? "compile failed" : this.O00000000000O.O000000000());
      }
   }

   private void O0000000000O0O() {
      this.O0000000O00OOO = this.O00000000000(O000000000000(this.O0000000O00OOO));
      this.O0000000O00O0 = null;
      this.O0000000000O00();
   }

   private String O00000000000(String string) {
      String var2 = string != null && !string.isBlank() ? string : O00000OOOOO0.O00000000();

      for (int var3 = 1; var3 < 128; var3++) {
         String var4 = var3 == 1 ? var2 + " Copy" : var2 + " Copy " + var3;
         boolean var5 = false;

         for (O00000OOOOO00 var7 : O00000OOOOO000.O00000000().O00000000(this.O00000000OO)) {
            if (var7.O000000000().equalsIgnoreCase(var4)) {
               var5 = true;
               break;
            }
         }

         if (!var5 && !O00000OOOO0O00.O00000000().O000000000000(var4)) {
            return var4;
         }
      }

      return var2 + " Copy " + System.currentTimeMillis() % 10000L;
   }

   private void O0000000000OO() {
      int var1 = O00000OOOOO000.O00000000().O00000000(O00000OOOO0OOO.O00000000());
      this.O0000000000OO(var1 == 0 ? "no legacy slots" : "cleanup " + var1 + " legacy");
   }

   private static boolean O00000000(float f, float g, float h, float i, float j, float k, float l, float m) {
      return f < j + l && f + h > j && g < k + m && g + i > k;
   }

   private static String O000000000000(String string) {
      String var1 = O00000OOOO0O00.O00000000000OO(string);
      return var1.isBlank() ? O00000OOOOO0.O00000000() : var1;
   }

   private static boolean O00000000(char c) {
      return Character.isLetterOrDigit(c) || c == ' ' || c == '_' || c == '-' || c == '.';
   }

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, float f, float g) {
      if (o0000O000O0O0 != null && this.O00000000(o0000O000O0O0)) {
         this.O00000000O0O = f;
         this.O00000000O0O0 = g;
         if (this.O0000000OO0O0O) {
            this.O0000000OO0O0 = f - this.O0000000OO0OO;
            this.O0000000OO0O00 = g - this.O0000000OO0OO0;
            return true;
         } else if (this.O000000000O) {
            float var14 = this.O0000000000O00;
            float var16 = this.O0000000000O0O;
            this.O0000000000O00 = this.O000000000O000 + f - this.O000000000O0;
            this.O0000000000O0O = this.O000000000O00O + g - this.O000000000O00;
            this.O0000000000(var14, var16);
            return true;
         } else {
            if (this.O0000000O0O0O != null) {
               O00000OOOOO0O0 var4 = this.O0000000O0O00.get(this.O0000000O0O0O);
               if (var4 != null && var4.O00000000(f, g, Screen.hasShiftDown())) {
                  O00000OOO0OO0O var15 = this.O0000000000O0.O0000000000(this.O0000000O0O0O);
                  if (var15 != null) {
                     var15.O000000000("value", O00000000(var15, var4.O0000000000()));
                     this.O0000000000O0.O0000000000000();
                  }

                  return true;
               }
            }

            if (this.O0000000O0O0O0 != null) {
               O00000OOOOO0O0 var11 = this.O0000000O0O000.get(this.O0000000O0O0O0);
               if (var11 != null && var11.O00000000(f, g, Screen.hasShiftDown())) {
                  return true;
               }
            }

            if (this.O0000000O0O0OO != null) {
               O00000OOOOO0O0 var12 = this.O0000000O0O00O.get(this.O0000000O0O0OO);
               if (var12 != null && var12.O00000000(f, g, Screen.hasShiftDown())) {
                  this.O00000000000O(this.O0000000O0O0OO);
                  return true;
               }
            }

            if (this.O00000000O00) {
               this.O00000000O000O = f;
               this.O00000000O00O = g;
               this.O00000000(Screen.hasShiftDown());
               return true;
            } else if (this.O000000000OO == null) {
               return this.O00000000O00O0 != null;
            } else {
               O00000OOO0OO0O var13 = this.O0000000000O0.O0000000000(this.O000000000OO);
               if (var13 != null) {
                  if (this.O000000000OOOO.size() > 1 || this.O000000000OOOO.size() == 1 && this.O000000000OOOO.containsKey(var13.O00000000())) {
                     float var5 = this.O000000000000(f) - this.O00000000O;
                     float var6 = this.O0000000000000(g) - this.O00000000O0;

                     for (Entry var8 : this.O000000000OOOO.entrySet()) {
                        O00000OOO0OO0O var9 = this.O0000000000O0.O0000000000((String)var8.getKey());
                        if (var9 != null) {
                           O00000OOO000OO.W291 var10 = (O00000OOO000OO.W291)var8.getValue();
                           var9.O00000000(var10.x + var5, var10.y + var6);
                        }
                     }
                  } else {
                     var13.O00000000(this.O000000000000(f) - this.O000000000OO0, this.O0000000000000(g) - this.O000000000OO00);
                  }

                  this.O0000000000O0.O0000000000000();
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   public boolean O000000000(O0000O000O0O0 o0000O000O0O0, float f, float g) {
      if (o0000O000O0O0 != null && this.O00000000(o0000O000O0O0)) {
         if (this.O00000000O00O0 != null) {
            O00000OOO000OO.W296 var4 = this.O0000000000000(f, g);
            if (var4 != null && var4.direction == O00000OOO0O0O0.INPUT) {
               this.O000000000OOOO();
               boolean var11 = this.O0000000000O0.O00000000(this.O00000000O00O0, this.O00000000O00OO, var4.nodeId, var4.pinId, this.O0000000000000);
               if (var11) {
                  this.O0000000OO0.O00000000(1.0F);
               }

               this.O0000000000OO(var11 ? "linked" : "cycle / type guard");
            } else if (var4 == null && this.O00000000000(f, g) == null) {
               O00000OOO0OO0O var5 = this.O0000000000O0.O0000000000(this.O00000000O00O0);
               if (var5 != null) {
                  O00000OOO0O00O var6 = this.O0000000000000.O00000000(var5.O000000000());
                  O00000OOO0O0OO var7 = var6 == null ? null : var6.O000000000(this.O00000000O00OO);
                  if (var7 != null) {
                     this.O0000000O0OO = this.O00000000O00O0;
                     this.O0000000O0OO0 = this.O00000000O00OO;
                     this.O00000000000O0.O00000000(f, g, var7.type());
                  }
               }
            }
         }

         if (this.O00000000O00) {
            this.O00000000O000O = f;
            this.O00000000O00O = g;
            this.O00000000(Screen.hasShiftDown());
         }

         if (this.O0000000O0O0O != null) {
            O00000OOOOO0O0 var8 = this.O0000000O0O00.get(this.O0000000O0O0O);
            if (var8 != null) {
               if (var8.O00000000000(f, g)) {
                  O00000OOO0OO0O var12 = this.O0000000000O0.O0000000000(this.O0000000O0O0O);
                  if (var12 != null) {
                     var12.O000000000("value", O00000000(var12, var8.O0000000000()));
                     this.O0000000000O0.O0000000000000();
                  }
               }

               if (!var8.O00000000000O()) {
                  this.O0000000O0O0O = null;
               }
            }
         }

         if (this.O0000000O0O0O0 != null) {
            O00000OOOOO0O0 var9 = this.O0000000O0O000.get(this.O0000000O0O0O0);
            if (var9 != null) {
               if (var9.O00000000000(f, g)) {
                  O00000OOO0OO0O var13 = this.O0000000000O0.O0000000000(this.O0000000O0O0O0);
                  if (var13 != null) {
                     var13.O000000000("name", var9.O00000000000());
                     this.O0000000000O0.O0000000000000();
                  }
               }

               if (!var9.O00000000000O()) {
                  this.O0000000O0O0O0 = null;
               }
            }
         }

         if (this.O0000000O0O0OO != null) {
            O00000OOOOO0O0 var10 = this.O0000000O0O00O.get(this.O0000000O0O0OO);
            if (var10 != null) {
               if (var10.O00000000000(f, g)) {
                  this.O00000000000O(this.O0000000O0O0OO);
               }

               if (!var10.O00000000000O()) {
                  this.O00000000000O(this.O0000000O0O0OO);
                  this.O0000000O0O0OO = null;
               }
            }
         }

         this.O000000000O = false;
         this.O0000000OO0O0O = false;
         this.O000000000OO = null;
         this.O000000000OOOO.clear();
         this.O00000000O00 = false;
         this.O000000000OOO0.clear();
         this.O00000000O00O0 = null;
         this.O00000000O00OO = null;
         this.O0000000OO00OO = false;
         return true;
      } else {
         return false;
      }
   }

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, float f, float g, double d) {
      if (o0000O000O0O0 == null || !this.O00000000(o0000O000O0O0)) {
         return false;
      } else if (this.O0000000000O.O000000000()) {
         return this.O0000000000O
            .O00000000(
               d,
               this.O000000000OOO(),
               this.O0000000OOO <= 0 ? this.O000000000OO00() : this.O0000000OOO,
               this.O0000000OOO0 <= 0 ? this.O000000000OO0O() : this.O0000000OOO0
            );
      } else if (this.O00000000000O0.O00000000()) {
         this.O00000000000O0.O00000000(d);
         return true;
      } else {
         O0000O00000 var6 = this.O000000000OOO();
         int var7 = this.O0000000OOO <= 0 ? this.O000000000OO00() : this.O0000000OOO;
         int var8 = this.O0000000OOO0 <= 0 ? this.O000000000OO0O() : this.O0000000OOO0;
         if (this.O00000000(var6, var7, var8, f, g, d)) {
            return true;
         } else if (!this.O0000000O0 && this.O000000000(var6, this.O0000000OOO0 <= 0 ? this.O000000000OO0O() : this.O0000000OOO0).contains(f, g)) {
            this.O0000000O00 = Math.max(0.0F, this.O0000000O00 - (float)d * var6.O00000000(28.0F));
            return true;
         } else {
            float var9 = (f - this.O0000000000O00) / Math.max(0.001F, this.O0000000000OO0);
            float var10 = (g - this.O0000000000O0O) / Math.max(0.001F, this.O0000000000OO0);
            float var11 = (float)Math.exp(d * 0.105);
            this.O0000000000OO0 = O000000000(this.O0000000000OO0 * var11, 0.34F, 2.45F);
            this.O0000000000O00 = f - var9 * this.O0000000000OO0;
            this.O0000000000O0O = g - var10 * this.O0000000000OO0;
            this.O000000000O0O = 0.0F;
            this.O000000000O0O0 = 0.0F;
            return true;
         }
      }
   }

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, char c) {
      if (o0000O000O0O0 == null || !this.O00000000(o0000O000O0O0)) {
         return false;
      } else if (this.O0000000000O.O000000000()) {
         return this.O0000000000O.O00000000(c);
      } else if (this.O0000000O0O) {
         if (O00000000(c) && this.O0000000O00OOO.length() < 48) {
            this.O0000000O00OOO = this.O0000000O00OOO + c;
            this.O0000000O0O0 = System.currentTimeMillis();
         }

         return true;
      } else if (this.O00000000000O0.O00000000() && c != ' ') {
         this.O00000000000O0.O00000000(c);
         return true;
      } else if (this.O0000000O000O) {
         if (O00000000(c) && this.O0000000O0000O.length() < 40) {
            this.O0000000O0000O = this.O0000000O0000O + c;
            this.O0000000O000O0 = System.currentTimeMillis();
            this.O0000000O00 = 0.0F;
         }

         return true;
      } else {
         if (this.O0000000O0O0O != null) {
            O00000OOOOO0O0 var3 = this.O0000000O0O00.get(this.O0000000O0O0O);
            if (var3 != null && var3.O00000000(c)) {
               return true;
            }
         }

         if (this.O0000000O0O0O0 != null) {
            O00000OOOOO0O0 var4 = this.O0000000O0O000.get(this.O0000000O0O0O0);
            if (var4 != null && var4.O00000000(c)) {
               return true;
            }
         }

         if (this.O0000000O0O0OO != null) {
            O00000OOOOO0O0 var5 = this.O0000000O0O00O.get(this.O0000000O0O0OO);
            if (var5 != null && var5.O00000000(c)) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean O00000000(O0000O000O0O0 o0000O000O0O0, int i) {
      if (o0000O000O0O0 == null || !this.O00000000(o0000O000O0O0)) {
         return false;
      } else if (this.O0000000000O.O000000000()) {
         boolean var11 = this.O0000000000O.O00000000(i);
         this.O00000000O00O0();
         return var11;
      } else if (this.O0000000O0O) {
         if (i == 256) {
            this.O0000000O0O = false;
            this.O0000000O00OOO = O000000000000(this.O0000000O00OOO);
            return true;
         } else if (i == 257 || i == 335 || i == 258) {
            this.O0000000O0O = false;
            this.O0000000O00OOO = O000000000000(this.O0000000O00OOO);
            return true;
         } else if (i == 259) {
            if (!this.O0000000O00OOO.isEmpty()) {
               this.O0000000O00OOO = this.O0000000O00OOO.substring(0, this.O0000000O00OOO.length() - 1);
               this.O0000000O0O0 = System.currentTimeMillis();
            }

            return true;
         } else {
            return true;
         }
      } else if (this.O00000000000O0.O00000000()) {
         if (i == 256) {
            this.O00000000000O0.O000000000000();
            this.O0000000O0OO = null;
            this.O0000000O0OO0 = null;
            return true;
         } else if (i == 257 || i == 335) {
            O00000OOO0O00O var10 = this.O00000000000O0.O00000000000O();
            if (var10 != null) {
               this.O00000000(var10);
            } else {
               this.O00000000000O0.O000000000000();
            }

            return true;
         } else if (i == 259) {
            this.O00000000000O0.O0000000000000();
            return true;
         } else if (i == 264) {
            this.O00000000000O0.O00000000(1);
            return true;
         } else if (i == 265) {
            this.O00000000000O0.O00000000(-1);
            return true;
         } else {
            return true;
         }
      } else {
         if (this.O0000000O0O0O != null) {
            O00000OOOOO0O0 var3 = this.O0000000O0O00.get(this.O0000000O0O0O);
            if (var3 != null && var3.O00000000(i)) {
               if (!var3.O000000000000()) {
                  O00000OOO0OO0O var13 = this.O0000000000O0.O0000000000(this.O0000000O0O0O);
                  if (var13 != null) {
                     var13.O000000000("value", O00000000(var13, var3.O0000000000()));
                     this.O0000000000O0.O0000000000000();
                  }

                  this.O0000000O0O0O = null;
               }

               return true;
            }
         }

         if (this.O0000000O0O0O0 != null) {
            O00000OOOOO0O0 var7 = this.O0000000O0O000.get(this.O0000000O0O0O0);
            if (var7 != null && var7.O00000000(i)) {
               if (!var7.O000000000000()) {
                  O00000OOO0OO0O var12 = this.O0000000000O0.O0000000000(this.O0000000O0O0O0);
                  if (var12 != null) {
                     var12.O000000000("name", var7.O00000000000());
                     this.O0000000000O0.O0000000000000();
                  }

                  this.O0000000O0O0O0 = null;
               }

               return true;
            }
         }

         if (this.O0000000O0O0OO != null) {
            O00000OOOOO0O0 var8 = this.O0000000O0O00O.get(this.O0000000O0O0OO);
            if (var8 != null && var8.O00000000(i)) {
               if (!var8.O000000000000()) {
                  this.O00000000000O(this.O0000000O0O0OO);
                  this.O0000000O0O0OO = null;
               }

               return true;
            }
         }

         if (this.O0000000O000O) {
            if (i == 256) {
               this.O0000000O0000O = "";
               this.O0000000O000O = false;
               this.O0000000O00 = 0.0F;
               return true;
            } else if (i == 257 || i == 335) {
               this.O0000000O000O = false;
               return true;
            } else if (i == 259) {
               if (!this.O0000000O0000O.isEmpty()) {
                  this.O0000000O0000O = this.O0000000O0000O.substring(0, this.O0000000O0000O.length() - 1);
                  this.O0000000O000O0 = System.currentTimeMillis();
                  this.O0000000O00 = 0.0F;
               }

               return true;
            } else {
               return true;
            }
         } else if (i == 32) {
            return true;
         } else if (i == 68 && Screen.hasShiftDown()) {
            this.O0000000000O0();
            return true;
         } else if (i == 256) {
            if (!this.O00000000OO0 && !this.O00000000OO00 && !this.O00000000OO000 && !this.O00000000OO0O && !this.O0000000O000) {
               o0000O000O0O0.O000000000O0O0(false);
            } else {
               this.O000000000OOO0();
            }

            return true;
         } else if (i != 261 && i != 259) {
            if (i == 76) {
               this.O0000000O0 = !this.O0000000O0;
               return true;
            } else {
               if (Screen.hasControlDown()) {
                  if (i == 90) {
                     if (Screen.hasShiftDown()) {
                        this.O00000000O00();
                     } else {
                        this.O00000000O0();
                     }

                     return true;
                  }

                  if (i == 89) {
                     this.O00000000O00();
                     return true;
                  }

                  if (i == 83) {
                     this.O0000000000O00();
                     return true;
                  }

                  if (i == 80) {
                     this.O00000000000O0.O00000000(this.O00000000O0O, this.O00000000O0O0, null);
                     this.O0000000000OO("command");
                     return true;
                  }

                  if (i == 67) {
                     this.O00000000O000O();
                     return true;
                  }

                  if (i == 86) {
                     this.O00000000O00O();
                     return true;
                  }

                  if (i == 82) {
                     this.O00000000O000();
                     return true;
                  }

                  if (i == 48) {
                     this.O0000000000O00 = 520.0F;
                     this.O0000000000O0O = 260.0F;
                     this.O0000000000OO0 = 0.92F;
                     this.O0000000000OOO.O00000000(this.O0000000000OO0);
                     this.O0000000000OO("view");
                     return true;
                  }
               }

               return true;
            }
         } else {
            if (!this.O000000000OOO.isEmpty()) {
               this.O000000000OOOO();
               ArrayList var9 = new ArrayList<>(this.O000000000OOO);
               boolean var4 = false;

               for (String var6 : (List<String>)var9) {
                  if (this.O0000000000O0.O000000000(var6)) {
                     var4 = true;
                     this.O0000000O0O00.remove(var6);
                     this.O0000000O0O000.remove(var6);
                     this.O000000000(var6);
                     this.O0000000O0OOO0.remove(var6);
                     this.O0000000O0OOOO.remove(var6);
                     if (var6.equals(this.O0000000O0O0O)) {
                        this.O0000000O0O0O = null;
                     }

                     if (var6.equals(this.O0000000O0O0O0)) {
                        this.O0000000O0O0O0 = null;
                     }

                     if (this.O0000000O0O0OO != null && this.O0000000O0O0OO.startsWith(var6 + ":")) {
                        this.O0000000O0O0OO = null;
                     }
                  }
               }

               this.O00000000000O0();
               if (var4) {
                  this.O0000000OO0.O00000000(1.0F);
               }

               this.O0000000000OO("deleted");
            }

            return true;
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O000O0OOO o0000O000O0OOO, int i) {
      O0000O00000 var5 = o0000O000O0OOO.O000000000000();
      ColorScheme var6 = o0000O000O0OOO.O0000000000000();
      float var7 = var5.O00000000(34.0F);
      float var8 = var5.O00000000(28.0F);
      float var9 = i - var5.O00000000(68.0F);
      float var10 = var5.O00000000(60.0F);
      float var11 = var5.O00000000(14.0F);
      o0000O00OO0O0.O00000000(var7, var8, var9, var10, var11, var5.O00000000(22.0F), var5.O00000000(2.0F), this.O0000000000(var6, 132));
      o0000O00OO0O0.O00000000(var7, var8, var9, var10, var11, 0.34F);
      o0000O00OO0O0.O00000000(var7, var8, var9, var10, var11, this.O00000000(var6, 226));
      o0000O00OO0O0.O00000000(var7, var8, var9, var10, var11, ColorScheme.O00000000(var6.O000000000O0(), 52), 0.7F);
      o0000O00OO0O0.O00000000(
         var7 + var5.O00000000(1.0F),
         var8 + var5.O00000000(1.0F),
         var9 - var5.O00000000(2.0F),
         var5.O00000000(1.0F),
         var11,
         ColorScheme.O00000000(var6.O000000000O(), 18)
      );
      o0000O00OO0O0.O000000000(
         var7 + var5.O00000000(20.0F), var8 + var10 * 0.5F, var5.O00000000(4.0F), 0.0F, 1.0F, ColorScheme.O00000000(var6.O000000000O0(), 235)
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         var5,
         FontRegistry.O00000000000,
         var7 + var5.O00000000(32.0F),
         var8 + var5.O00000000(5.0F),
         var5.O00000000(24.0F),
         13.0F,
         "Foundry",
         this.O000000000(var6)
      );
      String var12 = this.O00000000000O.O0000000000().isBlank() ? "cold" : this.O00000000000O.O0000000000();
      String var13 = this.O00000000000O.O000000000();
      String var14 = !var13.isBlank() ? var13 : this.O00000000O0OO0;
      int var15 = !var13.isBlank() ? ColorScheme.O00000000(255, 132, 132, 230) : ColorScheme.O00000000(var6.O000000000O0(), 210);
      String var16 = this.O0000000000O0.O00000000().O0000000000().isBlank()
         ? "#" + var12 + " / " + this.O0000000000O0.O0000000000().size() + " nodes / " + this.O0000000000O0.O00000000000().size() + " links / " + var14
         : "#"
            + var12
            + " / "
            + this.O0000000000O0.O00000000().O0000000000()
            + " / "
            + this.O0000000000O0.O0000000000().size()
            + " nodes / "
            + this.O0000000000O0.O00000000000().size()
            + " links / "
            + var14;
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         var5,
         FontRegistry.O00000000,
         var7 + var5.O00000000(32.0F),
         var8 + var5.O00000000(29.0F),
         var5.O00000000(18.0F),
         8.0F,
         O0000O00000OO.O00000000(var5, FontRegistry.O00000000, var16, 8.0F, var5.O00000000(160.0F)),
         var15
      );
      this.O00000000(o0000O00OO0O0, var5, var6, this.O00000000(var5), "File", this.O00000000OO0, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), 6);
      this.O00000000(o0000O00OO0O0, var5, var6, this.O000000000(var5), o0000O000O0O0);
      this.O00000000(
         o0000O00OO0O0,
         var5,
         var6,
         this.O0000000000(var5),
         this.O00000000OO.O000000000(),
         this.O00000000OO00,
         o0000O000O0O0.O0000000O(),
         o0000O000O0O0.O0000000O0(),
         1
      );
      this.O00000000(
         o0000O00OO0O0, var5, var6, this.O0000000000000(var5, i), "Library", this.O0000000O000, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), 7
      );
      this.O00000000(
         o0000O00OO0O0,
         var5,
         var6,
         this.O000000000000(var5, i),
         this.O00000000OO0OO.O00000000(),
         this.O00000000OO000,
         o0000O000O0O0.O0000000O(),
         o0000O000O0O0.O0000000O0(),
         3
      );
      this.O00000000(o0000O00OO0O0, var5, var6, this.O00000000000(var5, i), "Close", false, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), 4);
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O00000OOO000O0 o00000OOO000O0,
      String string,
      boolean bl,
      float f,
      float g,
      int i
   ) {
      float var10 = o00000OOO000O0.contains(f, g) ? 1.0F : 0.0F;
      float var11 = Math.max(bl ? 0.82F : 0.0F, var10);
      int var12 = ColorScheme.O00000000(
         ColorScheme.O00000000(255, 255, 255, this.O00000000(o0000O000O0OO) ? 70 : 11),
         ColorScheme.O00000000(i == 2 ? o0000O000O0OO.O000000000O00() : o0000O000O0OO.O000000000O0(), 86),
         var11
      );
      o0000O00OO0O0.O00000000(o00000OOO000O0.x(), o00000OOO000O0.y(), o00000OOO000O0.w(), o00000OOO000O0.h(), o0000O00000.O00000000(8.0F), var12);
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(o0000O000O0OO.O0000000000O(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 128), var11),
         0.7F
      );
      this.O00000000(
         o0000O00OO0O0, o0000O00000, o0000O000O0OO, o00000OOO000O0.x() + o0000O00000.O00000000(14.0F), o00000OOO000O0.y() + o00000OOO000O0.h() * 0.5F, i, var11
      );
      float var13 = o00000OOO000O0.x() + o0000O00000.O00000000(28.0F);
      float var14 = o00000OOO000O0.w() - o0000O00000.O00000000(36.0F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var13,
         o00000OOO000O0.y(),
         o00000OOO000O0.h(),
         9.0F,
         O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, string, 9.0F, var14),
         ColorScheme.O00000000(this.O0000000000(o0000O000O0OO), this.O000000000(o0000O000O0OO), 0.55F + var11 * 0.45F)
      );
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, int i, float h) {
      int var8 = ColorScheme.O00000000(i == 2 ? o0000O000O0OO.O000000000O00() : o0000O000O0OO.O000000000O0(), Math.round(150.0F + 90.0F * h));
      float var9 = o0000O00000.O00000000(5.6F);
      if (i == 0) {
         o0000O00OO0O0.O00000000(f - var9, g - var9 * 0.65F, var9 * 2.0F, var9 * 1.3F, o0000O00000.O00000000(2.0F), var8);
         o0000O00OO0O0.O00000000(f - var9 * 0.7F, g - var9, var9 * 0.9F, o0000O00000.O00000000(2.0F), o0000O00000.O00000000(1.0F), var8);
      } else if (i == 1) {
         o0000O00OO0O0.O000000000(f, g, var9 * 0.9F, 0.0F, 1.0F, ColorScheme.O00000000(var8, 82));
         o0000O00OO0O0.O000000000(f, g, var9 * 0.38F, 0.0F, 1.0F, var8);
      } else if (i == 2) {
         o0000O00OO0O0.O00000000(f - var9, g - var9, var9 * 0.72F, var9 * 0.72F, o0000O00000.O00000000(1.5F), var8);
         o0000O00OO0O0.O00000000(f + var9 * 0.18F, g - var9, var9 * 0.72F, var9 * 0.72F, o0000O00000.O00000000(1.5F), ColorScheme.O00000000(var8, 170));
         o0000O00OO0O0.O00000000(f - var9 * 0.42F, g + var9 * 0.18F, var9 * 0.72F, var9 * 0.72F, o0000O00000.O00000000(1.5F), ColorScheme.O00000000(var8, 210));
      } else if (i == 3) {
         o0000O00OO0O0.O000000000(f, g, var9 * 0.88F, 0.0F, 1.0F, ColorScheme.O00000000(var8, 74));
         o0000O00OO0O0.O00000000(f - var9, g - o0000O00000.O00000000(0.8F), var9 * 2.0F, o0000O00000.O00000000(1.6F), o0000O00000.O00000000(1.0F), var8);
         o0000O00OO0O0.O00000000(f - o0000O00000.O00000000(0.8F), g - var9, o0000O00000.O00000000(1.6F), var9 * 2.0F, o0000O00000.O00000000(1.0F), var8);
      } else if (i == 5) {
         o0000O00OO0O0.O00000000(f - var9 * 1.05F, g - var9 * 0.78F, var9 * 1.62F, o0000O00000.O00000000(1.5F), o0000O00000.O00000000(1.0F), var8);
         o0000O00OO0O0.O00000000(
            f - var9 * 0.62F,
            g - o0000O00000.O00000000(0.75F),
            var9 * 1.78F,
            o0000O00000.O00000000(1.5F),
            o0000O00000.O00000000(1.0F),
            ColorScheme.O00000000(var8, 194)
         );
         o0000O00OO0O0.O00000000(
            f - var9 * 1.05F, g + var9 * 0.78F, var9 * 1.62F, o0000O00000.O00000000(1.5F), o0000O00000.O00000000(1.0F), ColorScheme.O00000000(var8, 155)
         );
         o0000O00OO0O0.O000000000(f + var9 * 1.05F, g - var9 * 0.78F, o0000O00000.O00000000(1.9F), 0.0F, 1.0F, ColorScheme.O00000000(var8, 210));
         o0000O00OO0O0.O000000000(f - var9 * 1.0F, g, o0000O00000.O00000000(1.9F), 0.0F, 1.0F, ColorScheme.O00000000(var8, 170));
         o0000O00OO0O0.O000000000(f + var9 * 0.92F, g + var9 * 0.78F, o0000O00000.O00000000(1.9F), 0.0F, 1.0F, var8);
      } else if (i == 6) {
         o0000O00OO0O0.O00000000(f - var9, g - var9 * 0.82F, var9 * 0.92F, o0000O00000.O00000000(2.2F), o0000O00000.O00000000(1.0F), var8);
         o0000O00OO0O0.O00000000(f - var9, g - var9 * 0.42F, var9 * 2.0F, var9 * 1.28F, o0000O00000.O00000000(1.6F), ColorScheme.O00000000(var8, 210));
         o0000O00OO0O0.O00000000(
            f - var9 * 0.74F,
            g - var9 * 0.12F,
            var9 * 1.48F,
            o0000O00000.O00000000(1.1F),
            o0000O00000.O00000000(0.5F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O(), 96)
         );
      } else if (i == 7) {
         o0000O00OO0O0.O00000000(f - var9, g - var9, var9 * 0.82F, var9 * 0.82F, o0000O00000.O00000000(1.4F), var8);
         o0000O00OO0O0.O00000000(f + var9 * 0.18F, g - var9, var9 * 0.82F, var9 * 0.82F, o0000O00000.O00000000(1.4F), ColorScheme.O00000000(var8, 176));
         o0000O00OO0O0.O00000000(
            f - var9, g + var9 * 0.18F, var9 * 2.0F, o0000O00000.O00000000(1.5F), o0000O00000.O00000000(0.8F), ColorScheme.O00000000(var8, 214)
         );
         o0000O00OO0O0.O00000000(
            f - var9, g + var9 * 0.66F, var9 * 1.44F, o0000O00000.O00000000(1.5F), o0000O00000.O00000000(0.8F), ColorScheme.O00000000(var8, 150)
         );
      } else {
         o0000O00OO0O0.O00000000(f, g);
         o0000O00OO0O0.O000000000(45.0F);
         o0000O00OO0O0.O00000000(-var9, -o0000O00000.O00000000(0.8F), var9 * 2.0F, o0000O00000.O00000000(1.6F), o0000O00000.O00000000(1.0F), var8);
         o0000O00OO0O0.O000000000000O();
         o0000O00OO0O0.O000000000(-45.0F);
         o0000O00OO0O0.O00000000(-var9, -o0000O00000.O00000000(0.8F), var9 * 2.0F, o0000O00000.O00000000(1.6F), o0000O00000.O00000000(1.0F), var8);
         o0000O00OO0O0.O000000000000O();
         o0000O00OO0O0.O00000000000O();
      }
   }

   private void O00000000(String string, O00000OOO0OO00 o00000OOO0OO00) {
      if (string != null && !string.isBlank() && o00000OOO0OO00 != null) {
         if (o00000OOO0OO00 == this.O0000000000O0) {
            this.O00000000O0O();
         }

         O00000OOO00OO0 var3 = this.O000000000000O.O00000000(o00000OOO0OO00);
         O00000OOOO0O00.O00000000().O00000000(string, o00000OOO0OO00, var3, this.O00000000(o00000OOO0OO00));
      }
   }

   private void O00000000(O00000OOOOO00 o00000OOOOO00) {
      if (o00000OOOOO00 != null) {
         O00000OOOO00O var2 = O00000OOOO00O.O00000000(o00000OOOOO00.O0000000000());
         if (var2 == O00000OOOO00O.PREVIEW_ONLY) {
            this.O0000000000OO("preview-only slot");
         } else {
            O00000OOOOO000 var3 = O00000OOOOO000.O00000000();
            if (o00000OOOOO00.O00000000().equals(var3.O000000000(var2))) {
               this.O00000000(var2);
            } else {
               O00000OOO0OO00 var4 = var3.O00000000(o00000OOOOO00.O00000000(), this.O0000000000000);
               if (var4 == null) {
                  this.O0000000000OO("slot load failed");
               } else {
                  var4.O00000000(var2.O00000000());
                  O00000OOO00OO0 var5 = this.O000000000000O.O00000000(var4);
                  O00000OOOO0O00.O00000000().O00000000(o00000OOOOO00.O000000000(), var4, var5, this.O000000000(o00000OOOOO00));
                  O00000OOOO0O00.O00000000().O00000000(var2, var4, var5);
                  O00000OOOO0O0.O00000000().O00000000(var2, var5);
                  var3.O00000000(var2, o00000OOOOO00.O00000000());
                  O000000O00.O00000000(var2, o00000OOOOO00.O000000000());
                  this.O0000000000OO("bound " + var2.O000000000());
               }
            }
         }
      }
   }

   private O00000OOOO0O00.W313 O00000000(O00000OOO0OO00 o00000OOO0OO00) {
      if (o00000OOO0OO00 != null && o00000OOO0OO00.O00000000() != null) {
         String var2 = o00000OOO0OO00.O00000000().O0000000000000();
         if ("preset".equalsIgnoreCase(var2)) {
            return O00000OOOO0O00.W313.PRESET;
         } else {
            return !"imported".equalsIgnoreCase(var2) && !"shared".equalsIgnoreCase(var2) ? O00000OOOO0O00.W313.USER : O00000OOOO0O00.W313.IMPORTED;
         }
      } else {
         return O00000OOOO0O00.W313.USER;
      }
   }

   private O00000OOOO0O00.W313 O000000000(O00000OOOOO00 o00000OOOOO00) {
      if (o00000OOOOO00 == null) {
         return O00000OOOO0O00.W313.USER;
      } else {
         String var2 = o00000OOOOO00.O00000000000O();
         if ("preset".equalsIgnoreCase(var2)) {
            return O00000OOOO0O00.W313.PRESET;
         } else {
            return !"imported".equalsIgnoreCase(var2) && !"shared".equalsIgnoreCase(var2) ? O00000OOOO0O00.W313.USER : O00000OOOO0O00.W313.IMPORTED;
         }
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, O00000OOO000O0 o00000OOO000O0, O0000O000O0O0 o0000O000O0O0
   ) {
      float var6 = !o00000OOO000O0.contains(o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0()) && !this.O0000000O0O ? 0.0F : 1.0F;
      int var7 = ColorScheme.O00000000(
         ColorScheme.O00000000(255, 255, 255, this.O00000000(o0000O000O0OO) ? 76 : 14), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 64), var6
      );
      o0000O00OO0O0.O00000000(o00000OOO000O0.x(), o00000OOO000O0.y(), o00000OOO000O0.w(), o00000OOO000O0.h(), o0000O00000.O00000000(7.0F), var7);
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         o0000O00000.O00000000(7.0F),
         ColorScheme.O00000000(o0000O000O0OO.O0000000000O(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 134), var6),
         this.O0000000O0O ? 1.0F : 0.7F
      );
      String var8 = this.O0000000O00OOO != null && !this.O0000000O00OOO.isBlank() ? this.O0000000O00OOO : "Shader name";
      int var9 = this.O0000000O00OOO != null && !this.O0000000O00OOO.isBlank() ? this.O000000000(o0000O000O0OO) : this.O0000000000(o0000O000O0OO);
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x() + o0000O00000.O00000000(8.0F),
         o00000OOO000O0.y(),
         o00000OOO000O0.w() - o0000O00000.O00000000(16.0F),
         o00000OOO000O0.h(),
         o0000O00000.O00000000(6.0F),
         o0000O00000.O00000000(6.0F),
         o0000O00000.O00000000(6.0F),
         o0000O00000.O00000000(6.0F)
      );

      try {
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000,
            o00000OOO000O0.x() + o0000O00000.O00000000(10.0F),
            o00000OOO000O0.y(),
            o00000OOO000O0.h(),
            10.0F,
            var8,
            var9
         );
         if (this.O0000000O0O && (System.currentTimeMillis() - this.O0000000O0O0) / 500L % 2L == 0L) {
            float var10 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, var8, 10.0F);
            float var11 = Math.min(
               o00000OOO000O0.x() + o00000OOO000O0.w() - o0000O00000.O00000000(12.0F),
               o00000OOO000O0.x() + o0000O00000.O00000000(10.0F) + var10 + o0000O00000.O00000000(2.0F)
            );
            o0000O00OO0O0.O00000000(
               var11,
               o00000OOO000O0.y() + o0000O00000.O00000000(6.0F),
               1.0F,
               o00000OOO000O0.h() - o0000O00000.O00000000(12.0F),
               0.0F,
               ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 240)
            );
         }
      } finally {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }
   }

   private void O00000000(O00000OOOO00O o00000OOOO00O) {
      if (o00000OOOO00O != null) {
         O00000OOOO0O00.O00000000().O00000000(o00000OOOO00O);
         O00000OOOO0O0.O00000000().O0000000000(o00000OOOO00O);
         O00000OOOOO000.O00000000().O00000000(o00000OOOO00O, null);
         O000000O00.O00000000(o00000OOOO00O);
         this.O0000000000OO(o00000OOOO00O.O000000000() + " unbound");
      }
   }

   private void O0000000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O000O0OOO o0000O000O0OOO, int i, int j) {
      float var6 = this.O00000000OOO0O.O00000000();
      if (this.O00000000OO0 || !(var6 <= 0.01F)) {
         O0000O00000 var7 = o0000O000O0OOO.O000000000000();
         ColorScheme var8 = o0000O000O0OOO.O0000000000000();
         O00000OOO000O0 var9 = this.O000000000000(var7);
         var9 = new O00000OOO000O0(var9.x(), var9.y() - var7.O00000000(9.0F) * (1.0F - var6), var9.w(), var9.h());
         float var10 = var7.O00000000(14.0F);
         o0000O00OO0O0.O000000000000(var6);

         try {
            o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var10, var7.O00000000(24.0F), var7.O00000000(2.0F), this.O0000000000(var8, 142));
            o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var10, this.O00000000(var8, 236));
            o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var10, ColorScheme.O00000000(var8.O000000000O0(), 82), 0.8F);
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var7,
               FontRegistry.O00000000000,
               var9.x() + var7.O00000000(12.0F),
               var9.y() + var7.O00000000(12.0F),
               12.0F,
               "File",
               this.O000000000(var8)
            );
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var7,
               FontRegistry.O00000000,
               var9.x() + var7.O00000000(12.0F),
               var9.y() + var7.O00000000(28.0F),
               8.0F,
               "autosave on / Ctrl+S saves the named slot",
               ColorScheme.O00000000(var8.O000000000O0(), 190)
            );
            float var11 = var9.y() + var7.O00000000(48.0F);
            O00000OOOOO00 var12 = this.O0000000O00O0 == null ? null : O00000OOOOO000.O00000000().O00000000(this.O0000000O00O0);
            this.O00000000(o0000O00OO0O0, var7, var8, var9.x() + var7.O00000000(12.0F), var11, "File", var12 == null ? "unsaved" : var12.O000000000());
            this.O00000000(o0000O00OO0O0, var7, var8, var9.x() + var7.O00000000(12.0F), var11 + var7.O00000000(19.0F), "State", this.O000000000000O());
            this.O00000000(o0000O00OO0O0, var7, var8, var9.x() + var7.O00000000(12.0F), var11 + var7.O00000000(38.0F), "Target", this.O00000000OO.O000000000());
            this.O00000000(
               o0000O00OO0O0,
               var7,
               var8,
               var9.x() + var7.O00000000(12.0F),
               var11 + var7.O00000000(57.0F),
               "Uniforms",
               String.valueOf(this.O000000000000O.O00000000(this.O0000000000O0).exposedUniforms().size())
            );
            this.O00000000(
               o0000O00OO0O0,
               var7,
               var8,
               var9.x() + var7.O00000000(12.0F),
               var11 + var7.O00000000(76.0F),
               "Source",
               this.O0000000000O0.O00000000().O0000000000000()
            );
            O00000OOOOO00 var13 = O00000OOOOO000.O00000000().O0000000000(this.O00000000OO);
            this.O00000000(
               o0000O00OO0O0, var7, var8, var9.x() + var7.O00000000(12.0F), var11 + var7.O00000000(95.0F), "Bound", var13 == null ? "-" : var13.O000000000()
            );

            for (int var14 = 0; var14 < O000000000.length; var14++) {
               O00000OOO000O0 var15 = this.O0000000000(var9, var7, var14);
               this.O00000000(
                  o0000O00OO0O0, var7, var8, var15, O000000000[var14], o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), var14 == 0 || var14 == 1
               );
            }
         } finally {
            o0000O00OO0O0.O00000000000OO();
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O000O0OOO o0000O000O0OOO, int i, int j) {
      float var6 = this.O00000000OOOO.O00000000();
      if (this.O00000000OO00 || !(var6 <= 0.01F)) {
         O0000O00000 var7 = o0000O000O0OOO.O000000000000();
         ColorScheme var8 = o0000O000O0OOO.O0000000000000();
         O00000OOO000O0 var9 = this.O00000000000(var7, i, j);
         var9 = new O00000OOO000O0(var9.x(), var9.y() - var7.O00000000(10.0F) * (1.0F - var6), var9.w(), var9.h());
         float var10 = var7.O00000000(14.0F);
         o0000O00OO0O0.O000000000000(var6);
         boolean var18 = false /* VF: Semaphore variable */;

         try {
            var18 = true;
            o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var10, var7.O00000000(24.0F), var7.O00000000(2.0F), this.O0000000000(var8, 148));
            o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var10, this.O00000000(var8, 238));
            o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var10, ColorScheme.O00000000(var8.O000000000O0(), 90), 0.8F);
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var7,
               FontRegistry.O00000000000,
               var9.x() + var7.O00000000(16.0F),
               var9.y() + var7.O00000000(14.0F),
               12.0F,
               "Target Studio",
               this.O000000000(var8)
            );
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var7,
               FontRegistry.O00000000,
               var9.x() + var7.O00000000(16.0F),
               var9.y() + var7.O00000000(31.0F),
               8.0F,
               "pick where this shader runs — click a target to edit it",
               ColorScheme.O00000000(var8.O000000000O0(), 190)
            );
            O00000OOOO00O[] var11 = O00000OOOO00O.O0000000000O0O();

            for (int var12 = 0; var12 < var11.length; var12++) {
               this.O00000000(
                  o0000O00OO0O0, var7, var8, this.O00000000000(var9, var7, var12), var11[var12], o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0()
               );
            }

            float var21 = var9.y() + var9.h() - var7.O00000000(76.0F);
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var7,
               FontRegistry.O00000000000,
               var9.x() + var7.O00000000(16.0F),
               var21,
               9.0F,
               "Shape Source",
               ColorScheme.O00000000(var8.O000000000O00(), 220)
            );
            String[] var13 = new String[]{"Host Rectangle", "Inset Shape", "Full Quad"};

            for (int var14 = 0; var14 < var13.length; var14++) {
               O00000OOO000O0 var15 = this.O000000000000(var9, var7, var14);
               this.O00000000(
                  o0000O00OO0O0,
                  var7,
                  var8,
                  var15,
                  var13[var14],
                  this.O00000000OO0O0.equals(var13[var14]),
                  o0000O000O0O0.O0000000O(),
                  o0000O000O0O0.O0000000O0()
               );
            }

            var18 = false;
         } finally {
            if (var18) {
               o0000O00OO0O0.O00000000000OO();
            }
         }

         o0000O00OO0O0.O00000000000OO();
      }
   }

   private void O0000000000OO0() {
      if (!this.O00000000OOO00) {
         this.O00000000OOO00 = true;

         for (int var1 = 0; var1 < O00000OOOOO00O.O00000000.size(); var1++) {
            try {
               O00000OOO0OO00 var2 = O00000OOOOO00O.O00000000(O00000OOOOO00O.O00000000.get(var1), this.O0000000000000);
               this.O00000000OOO0.put(var1, this.O000000000000O.O00000000(var2));
            } catch (Throwable var3) {
            }
         }
      }
   }

   private void O000000000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O000O0OOO o0000O000O0OOO, int i, int j) {
      float var6 = this.O00000000OOOO0.O00000000();
      if (this.O00000000OO000 || !(var6 <= 0.01F)) {
         O0000O00000 var7 = o0000O000O0OOO.O000000000000();
         ColorScheme var8 = o0000O000O0OOO.O0000000000000();
         O00000OOO000O0 var9 = this.O000000000000O(var7, i);
         var9 = new O00000OOO000O0(var9.x() + var7.O00000000(10.0F) * (1.0F - var6), var9.y(), var9.w(), var9.h());
         float var10 = var7.O00000000(14.0F);
         o0000O00OO0O0.O000000000000(var6);

         try {
            o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var10, var7.O00000000(22.0F), var7.O00000000(2.0F), this.O0000000000(var8, 136));
            o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var10, this.O00000000(var8, 236));
            o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var10, ColorScheme.O00000000(var8.O000000000O0(), 84), 0.8F);
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var7,
               FontRegistry.O00000000000,
               var9.x() + var7.O00000000(16.0F),
               var9.y() + var7.O00000000(14.0F),
               12.0F,
               "Settings",
               this.O000000000(var8)
            );
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var7,
               FontRegistry.O00000000,
               var9.x() + var7.O00000000(16.0F),
               var9.y() + var7.O00000000(32.0F),
               8.0F,
               "core editor behavior",
               ColorScheme.O00000000(var8.O000000000O0(), 184)
            );
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var7,
               FontRegistry.O00000000000,
               var9.x() + var7.O00000000(16.0F),
               var9.y() + var7.O00000000(64.0F),
               9.0F,
               "Foundry Theme",
               ColorScheme.O00000000(var8.O000000000O00(), 220)
            );
            O00000OOO000OO.W292[] var11 = O00000OOO000OO.W292.values();

            for (int var12 = 0; var12 < var11.length; var12++) {
               this.O00000000(
                  o0000O00OO0O0,
                  var7,
                  var8,
                  this.O0000000000000(var9, var7, var12),
                  var11[var12].O00000000(),
                  this.O00000000OO0OO == var11[var12],
                  o0000O000O0O0.O0000000O(),
                  o0000O000O0O0.O0000000O0()
               );
            }

            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var7,
               FontRegistry.O00000000000,
               var9.x() + var7.O00000000(16.0F),
               var9.y() + var7.O00000000(118.0F),
               9.0F,
               "Shader Properties",
               ColorScheme.O00000000(var8.O000000000O00(), 220)
            );
            this.O00000000(
               o0000O00OO0O0,
               var7,
               var8,
               var9.x() + var7.O00000000(16.0F),
               var9.y() + var7.O00000000(140.0F),
               "Complexity",
               this.O0000000000O0.O00000000().O000000000000()
            );
            this.O00000000(
               o0000O00OO0O0,
               var7,
               var8,
               var9.x() + var7.O00000000(16.0F),
               var9.y() + var7.O00000000(162.0F),
               "Uniforms",
               String.valueOf(this.O000000000000O.O00000000(this.O0000000000O0).exposedUniforms().size())
            );
            this.O00000000(o0000O00OO0O0, var7, var8, var9.x() + var7.O00000000(16.0F), var9.y() + var7.O00000000(184.0F), "Shape", this.O00000000OO0O0);
         } finally {
            o0000O00OO0O0.O00000000000OO();
         }
      }
   }

   private void O0000000000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O000O0OOO o0000O000O0OOO, int i, int j) {
      float var6 = this.O00000000OOOOO.O00000000();
      if ((this.O00000000OO0O || !(var6 <= 0.01F)) && this.O00000000OO00O != null) {
         O0000O00000 var7 = o0000O000O0OOO.O000000000000();
         ColorScheme var8 = o0000O000O0OOO.O0000000000000();
         O00000OOO000O0 var9 = this.O000000000000(var7, i, j);
         float var10 = var7.O00000000(14.0F);
         o0000O00OO0O0.O000000000000(var6);

         try {
            o0000O00OO0O0.O00000000(0.0F, 0.0F, (float)i, (float)j, 0.0F, ColorScheme.O00000000(0, 0, 0, Math.round((this.O00000000(var8) ? 42 : 82) * var6)));
            o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var10, var7.O00000000(26.0F), var7.O00000000(2.0F), this.O0000000000(var8, 172));
            o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var10, this.O00000000(var8, 248));
            o0000O00OO0O0.O00000000(var9.x(), var9.y(), var9.w(), var9.h(), var10, ColorScheme.O00000000(var8.O000000000O0(), 128), 0.9F);
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var7,
               FontRegistry.O00000000000,
               var9.x() + var7.O00000000(18.0F),
               var9.y() + var7.O00000000(16.0F),
               12.0F,
               "Switch Target",
               this.O000000000(var8)
            );
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var7,
               FontRegistry.O00000000,
               var9.x() + var7.O00000000(18.0F),
               var9.y() + var7.O00000000(38.0F),
               9.0F,
               "Current graph has unsaved changes. Save before switching to " + this.O00000000OO00O.O000000000() + ".",
               this.O0000000000(var8)
            );
            this.O00000000(
               o0000O00OO0O0, var7, var8, this.O0000000000000(var9, var7), "Save & Switch", o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), true
            );
            this.O00000000(o0000O00OO0O0, var7, var8, this.O000000000000O(var9, var7), "Switch", o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), false);
            this.O00000000(o0000O00OO0O0, var7, var8, this.O00000000000O(var9, var7), "Cancel", o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0(), false);
         } finally {
            o0000O00OO0O0.O00000000000OO();
         }
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O00000OOO000O0 o00000OOO000O0,
      O00000OOOO00O o00000OOOO00O,
      float f,
      float g
   ) {
      boolean var8 = o00000OOO000O0.contains(f, g);
      boolean var9 = o00000OOOO00O == this.O00000000OO;
      O00000OOOOO00 var10 = O00000OOOOO000.O00000000().O0000000000(o00000OOOO00O);
      boolean var11 = O00000OOOO0O00.O00000000().O000000000000(o00000OOOO00O);
      float var12 = Math.max(var9 ? 0.82F : 0.0F, var8 ? 0.7F : 0.0F);
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(
            ColorScheme.O00000000(255, 255, 255, this.O00000000(o0000O000O0OO) ? 52 : 8), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 74), var12
         )
      );
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(
            o0000O000O0OO.O0000000000O(), ColorScheme.O00000000(var9 ? o0000O000O0OO.O000000000O0() : o0000O000O0OO.O000000000O00(), var9 ? 150 : 96), var12
         ),
         var9 ? 0.9F : 0.6F
      );
      int var13 = var9 ? o0000O000O0OO.O000000000O0() : ColorScheme.O00000000(120, 230, 150, 255);
      o0000O00OO0O0.O000000000(
         o00000OOO000O0.x() + o0000O00000.O00000000(15.0F), o00000OOO000O0.y() + o0000O00000.O00000000(15.0F), o0000O00000.O00000000(3.1F), 0.0F, 1.0F, var13
      );
      if (var9) {
         o0000O00OO0O0.O00000000(
            o00000OOO000O0.x() + o0000O00000.O00000000(15.0F),
            o00000OOO000O0.y() + o0000O00000.O00000000(15.0F),
            o0000O00000.O00000000(5.4F),
            0.0F,
            1.0F,
            0.9F,
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 150)
         );
      }

      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         o00000OOO000O0.x() + o0000O00000.O00000000(26.0F),
         o00000OOO000O0.y() + o0000O00000.O00000000(8.0F),
         10.0F,
         o00000OOOO00O.O000000000(),
         this.O000000000(o0000O000O0OO)
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         o00000OOO000O0.x() + o0000O00000.O00000000(26.0F),
         o00000OOO000O0.y() + o0000O00000.O00000000(24.0F),
         7.5F,
         O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, this.O000000000(o00000OOOO00O), 7.5F, o00000OOO000O0.w() - o0000O00000.O00000000(96.0F)),
         this.O0000000000(o0000O000O0OO)
      );
      if (var11) {
         String var14 = var10 == null ? "runtime" : var10.O000000000();
         O00000OOO000O0 var15 = this.O00000000(o00000OOO000O0, o0000O00000);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000,
            o00000OOO000O0.x() + o00000OOO000O0.w() - o0000O00000.O00000000(88.0F),
            o00000OOO000O0.y() + o0000O00000.O00000000(25.0F),
            7.0F,
            O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, "◆ " + var14, 7.0F, o0000O00000.O00000000(44.0F)),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 210)
         );
         boolean var16 = var15.contains(f, g);
         o0000O00OO0O0.O00000000(
            var15.x(),
            var15.y(),
            var15.w(),
            var15.h(),
            o0000O00000.O00000000(5.0F),
            ColorScheme.O00000000(ColorScheme.O00000000(o0000O000O0OO.O000000000O(), 24), ColorScheme.O00000000(220, 80, 92, 126), var16 ? 1.0F : 0.0F)
         );
         o0000O00OO0O0.O00000000(
            var15.x(),
            var15.y(),
            var15.w(),
            var15.h(),
            o0000O00000.O00000000(5.0F),
            ColorScheme.O00000000(var16 ? -33652 : o0000O000O0OO.O000000000O(), var16 ? 220 : 72),
            0.58F
         );
         float var17 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, "Off", 8.0F);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000000,
            var15.x() + (var15.w() - var17) * 0.5F,
            var15.y(),
            var15.h(),
            8.0F,
            "Off",
            var16 ? o0000O000O0OO.O000000000O() : o0000O000O0OO.O0000000000OOO()
         );
      }
   }

   private O00000OOO000O0 O00000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000) {
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o00000OOO000O0.w() - o0000O00000.O00000000(44.0F),
         o00000OOO000O0.y() + o00000OOO000O0.h() - o0000O00000.O00000000(20.0F),
         o0000O00000.O00000000(36.0F),
         o0000O00000.O00000000(15.0F)
      );
   }

   private String O000000000(O00000OOOO00O o00000OOOO00O) {
      return switch (o00000OOOO00O) {
         case HUD -> "Drives HUD element plates";
         case BACKGROUND -> "Drives the ClickGUI background";
         case ESP -> "Drives the TargetESP entity fill";
         default -> o00000OOOO00O.O0000000000();
      };
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, String string, String string2) {
      O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000, f, g, 8.0F, string, o0000O000O0OO.O0000000000OOO());
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         f + o0000O00000.O00000000(82.0F),
         g - o0000O00000.O00000000(1.0F),
         9.0F,
         string2 != null && !string2.isBlank() ? string2 : "-",
         this.O000000000(o0000O000O0OO)
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O00000OOO000O0 o00000OOO000O0,
      String string,
      float f,
      float g,
      boolean bl
   ) {
      float var9 = o00000OOO000O0.contains(f, g) ? 1.0F : 0.0F;
      int var10 = ColorScheme.O00000000(255, 255, 255, this.O00000000(o0000O000O0OO) ? 72 : 12);
      int var11 = ColorScheme.O00000000(bl ? o0000O000O0OO.O000000000O0() : o0000O000O0OO.O000000000O00(), 88);
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(), o00000OOO000O0.y(), o00000OOO000O0.w(), o00000OOO000O0.h(), o0000O00000.O00000000(8.0F), ColorScheme.O00000000(var10, var11, var9)
      );
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(
            o0000O000O0OO.O0000000000O(), ColorScheme.O00000000(bl ? o0000O000O0OO.O000000000O0() : o0000O000O0OO.O000000000O00(), 122), var9
         ),
         0.7F
      );
      int var12 = this.O0000000000000(string);
      if (var12 >= 0 && o00000OOO000O0.w() > o0000O00000.O00000000(78.0F)) {
         this.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            o0000O000O0OO,
            o00000OOO000O0.x() + o0000O00000.O00000000(14.0F),
            o00000OOO000O0.y() + o00000OOO000O0.h() * 0.5F,
            var12,
            bl,
            var9
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000000,
            o00000OOO000O0.x() + o0000O00000.O00000000(28.0F),
            o00000OOO000O0.y(),
            o00000OOO000O0.h(),
            9.0F,
            O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, string, 9.0F, o00000OOO000O0.w() - o0000O00000.O00000000(36.0F)),
            this.O000000000(o0000O000O0OO)
         );
      } else {
         float var13 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000, string, 9.0F);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000000,
            o00000OOO000O0.x() + (o00000OOO000O0.w() - var13) * 0.5F,
            o00000OOO000O0.y(),
            o00000OOO000O0.h(),
            9.0F,
            string,
            this.O000000000(o0000O000O0OO)
         );
      }
   }

   private int O0000000000000(String string) {
      if (string == null) {
         return -1;
      } else if (string.startsWith("Save")) {
         return 0;
      } else if (string.startsWith("Slots")) {
         return 1;
      } else if (string.startsWith("Export")) {
         return 2;
      } else if (string.startsWith("Import")) {
         return 3;
      } else if (string.startsWith("Open")) {
         return 4;
      } else if (string.startsWith("Reset")) {
         return 5;
      } else if (string.startsWith("Use")) {
         return 6;
      } else if (string.startsWith("Merge")) {
         return 7;
      } else if (string.startsWith("Cleanup")) {
         return 8;
      } else if (string.startsWith("Switch")) {
         return 9;
      } else {
         return string.startsWith("Cancel") ? 10 : -1;
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, int i, boolean bl, float h) {
      int var9 = ColorScheme.O00000000(bl ? o0000O000O0OO.O000000000O0() : o0000O000O0OO.O000000000O00(), Math.round(150.0F + 90.0F * h));
      float var10 = o0000O00000.O00000000(5.2F);
      if (i == 0) {
         o0000O00OO0O0.O00000000(f - var10, g - var10, var10 * 2.0F, var10 * 2.0F, o0000O00000.O00000000(1.8F), var9);
         o0000O00OO0O0.O00000000(
            f - var10 * 0.58F,
            g + var10 * 0.1F,
            var10 * 1.16F,
            var10 * 0.52F,
            o0000O00000.O00000000(1.0F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O(), 115)
         );
      } else if (i == 1) {
         o0000O00OO0O0.O00000000(f - var10, g - var10, var10 * 0.78F, var10 * 0.78F, o0000O00000.O00000000(1.6F), var9);
         o0000O00OO0O0.O00000000(f + var10 * 0.22F, g - var10, var10 * 0.78F, var10 * 0.78F, o0000O00000.O00000000(1.6F), ColorScheme.O00000000(var9, 160));
         o0000O00OO0O0.O00000000(f - var10, g + var10 * 0.22F, var10 * 0.78F, var10 * 0.78F, o0000O00000.O00000000(1.6F), ColorScheme.O00000000(var9, 200));
      } else if (i == 2 || i == 3) {
         float var11 = i == 2 ? -1.0F : 1.0F;
         o0000O00OO0O0.O00000000(
            f - o0000O00000.O00000000(0.8F), g - var10 * 0.65F, o0000O00000.O00000000(1.6F), var10 * 1.3F, o0000O00000.O00000000(1.0F), var9
         );
         o0000O00OO0O0.O00000000(f - var10 * 0.72F, g + var11 * var10 * 0.55F, var10 * 1.44F, o0000O00000.O00000000(1.5F), o0000O00000.O00000000(1.0F), var9);
         o0000O00OO0O0.O00000000(
            f - var10, g - var11 * var10 * 0.95F, var10 * 2.0F, o0000O00000.O00000000(1.5F), o0000O00000.O00000000(1.0F), ColorScheme.O00000000(var9, 140)
         );
      } else if (i == 4) {
         this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, f, g, 0, h);
      } else if (i == 5) {
         o0000O00OO0O0.O000000000(f, g, var10, 0.0F, 0.82F, ColorScheme.O00000000(var9, 90));
         o0000O00OO0O0.O00000000(f + var10 * 0.2F, g - var10 * 0.9F, var10 * 0.78F, o0000O00000.O00000000(1.4F), o0000O00000.O00000000(1.0F), var9);
      } else if (i == 8) {
         o0000O00OO0O0.O00000000(f - var10 * 0.5F, g - var10 * 0.32F, var10, var10 * 0.92F, o0000O00000.O00000000(1.4F), var9, 0.8F);
         o0000O00OO0O0.O00000000(f - var10 * 0.68F, g - var10 * 0.56F, var10 * 1.36F, o0000O00000.O00000000(1.3F), o0000O00000.O00000000(0.8F), var9);
         o0000O00OO0O0.O00000000(f - var10 * 0.22F, g - var10 * 0.82F, var10 * 0.44F, o0000O00000.O00000000(1.3F), o0000O00000.O00000000(0.8F), var9);
         o0000O00OO0O0.O00000000(
            f - o0000O00000.O00000000(0.6F),
            g - var10 * 0.1F,
            o0000O00000.O00000000(1.2F),
            var10 * 0.5F,
            o0000O00000.O00000000(0.5F),
            ColorScheme.O00000000(var9, 170)
         );
      } else if (i == 9) {
         o0000O00OO0O0.O000000000(f, g, var10 * 0.9F, 0.0F, 1.0F, ColorScheme.O00000000(var9, 82));
         o0000O00OO0O0.O000000000(f, g, var10 * 0.38F, 0.0F, 1.0F, var9);
      } else if (i == 10) {
         o0000O00OO0O0.O00000000(f, g);
         o0000O00OO0O0.O000000000(45.0F);
         o0000O00OO0O0.O00000000(-var10 * 0.8F, -o0000O00000.O00000000(0.8F), var10 * 1.6F, o0000O00000.O00000000(1.6F), o0000O00000.O00000000(1.0F), var9);
         o0000O00OO0O0.O000000000000O();
         o0000O00OO0O0.O000000000(-45.0F);
         o0000O00OO0O0.O00000000(-var10 * 0.8F, -o0000O00000.O00000000(0.8F), var10 * 1.6F, o0000O00000.O00000000(1.6F), o0000O00000.O00000000(1.0F), var9);
         o0000O00OO0O0.O000000000000O();
         o0000O00OO0O0.O00000000000O();
      } else {
         o0000O00OO0O0.O000000000(f, g, var10, 0.0F, 1.0F, ColorScheme.O00000000(var9, i == 6 ? 165 : 92));
         o0000O00OO0O0.O000000000(f, g, var10 * 0.38F, 0.0F, 1.0F, var9);
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O00000OOO000O0 o00000OOO000O0,
      String string,
      boolean bl,
      float f,
      float g
   ) {
      float var9 = o00000OOO000O0.contains(f, g) ? 1.0F : 0.0F;
      float var10 = Math.max(bl ? 0.84F : 0.0F, var9);
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(
            ColorScheme.O00000000(255, 255, 255, this.O00000000(o0000O000O0OO) ? 64 : 10), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 92), var10
         )
      );
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(bl ? o0000O000O0OO.O000000000O0() : o0000O000O0OO.O000000000O(), bl ? 150 : 42),
         0.65F
      );
      float var11 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, string, 8.0F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         o00000OOO000O0.x() + (o00000OOO000O0.w() - var11) * 0.5F,
         o00000OOO000O0.y(),
         o00000OOO000O0.h(),
         8.0F,
         string,
         bl ? this.O000000000(o0000O000O0OO) : this.O0000000000(o0000O000O0OO)
      );
   }

   private void O000000000000O(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O000O0OOO o0000O000O0OOO, int i, int j) {
      O0000O00000 var6 = o0000O000O0OOO.O000000000000();
      ColorScheme var7 = o0000O000O0OOO.O0000000000000();
      O00000OOO000O0 var8 = this.O0000000000(var6, j);
      boolean var9 = var8.contains(o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0());
      o0000O00OO0O0.O00000000(
         var8.x(),
         var8.y(),
         var8.w(),
         var8.h(),
         var6.O00000000(7.0F),
         ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, 8), ColorScheme.O00000000(var7.O000000000O0(), 64), var9 ? 1.0F : 0.0F)
      );
      o0000O00OO0O0.O00000000(var8.x(), var8.y(), var8.w(), var8.h(), var6.O00000000(7.0F), ColorScheme.O00000000(var7.O000000000O0(), 96), 0.7F);
      String var10 = this.O0000000O0 ? ">" : "<";
      float var11 = O0000O00000OO.O00000000(var6, FontRegistry.O00000000000, var10, 10.0F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0, var6, FontRegistry.O00000000000, var8.x() + (var8.w() - var11) * 0.5F, var8.y(), var8.h(), 10.0F, var10, var7.O000000000O()
      );
      if (!this.O0000000O0) {
         O00000OOO000O0 var12 = this.O000000000(var6, j);
         float var13 = var6.O00000000(14.0F);
         o0000O00OO0O0.O00000000(var12.x(), var12.y(), var12.w(), var12.h(), var13, var6.O00000000(18.0F), var6.O00000000(2.0F), this.O0000000000(var7, 118));
         o0000O00OO0O0.O00000000(var12.x(), var12.y(), var12.w(), var12.h(), var13, this.O000000000(var7, 220));
         o0000O00OO0O0.O00000000(var12.x(), var12.y(), var12.w(), var12.h(), var13, var7.O0000000000O(), 0.7F);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var6,
            FontRegistry.O00000000000,
            var12.x() + var6.O00000000(15.0F),
            var12.y() + var6.O00000000(14.0F),
            12.0F,
            "Node Library",
            var7.O000000000O()
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var6,
            FontRegistry.O00000000,
            var12.x() + var6.O00000000(15.0F),
            var12.y() + var6.O00000000(28.0F),
            8.0F,
            "click to spawn / RMB opens search",
            ColorScheme.O00000000(var7.O000000000O0(), 156)
         );
         this.O00000000(o0000O00OO0O0, var6, var7, this.O00000000(var6, j));
         List var14 = this.O0000000000OOO();
         float var15 = var12.y() + var6.O00000000(74.0F);
         float var16 = var12.y() + var12.h() - var6.O00000000(14.0F);
         float var17 = Math.max(1.0F, var16 - var15);
         float var18 = this.O00000000(var6, var14);
         this.O0000000O00 = O000000000(this.O0000000O00, 0.0F, Math.max(0.0F, var18 - var17));
         O00000OOOOO var19 = O00000OOOOO.O00000000();
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O00000000(
            var12.x() + var6.O00000000(8.0F),
            var15,
            var12.w() - var6.O00000000(16.0F),
            var17,
            var6.O00000000(8.0F),
            var6.O00000000(8.0F),
            var6.O00000000(8.0F),
            var6.O00000000(8.0F)
         );

         try {
            float var20 = var15 - this.O0000000O00;

            for (O00000OOO000OO.W294 var22 : (List<O00000OOO000OO.W294>)var14) {
               if (var22.type() == 0) {
                  float var37 = var6.O00000000(20.0F);
                  if (var20 + var37 >= var15 && var20 <= var16) {
                     boolean var39 = o0000O000O0O0.O0000000O() >= var12.x() + var6.O00000000(8.0F)
                        && o0000O000O0O0.O0000000O() < var12.x() + var12.w() - var6.O00000000(8.0F)
                        && o0000O000O0O0.O0000000O0() >= var20
                        && o0000O000O0O0.O0000000O0() < var20 + var37;
                     boolean var41 = this.O0000000O000OO.contains(var22.category());
                     if (var39) {
                        o0000O00OO0O0.O00000000(
                           var12.x() + var6.O00000000(8.0F),
                           var20,
                           var12.w() - var6.O00000000(16.0F),
                           var37,
                           var6.O00000000(6.0F),
                           ColorScheme.O00000000(var7.O000000000O00(), 26)
                        );
                     }

                     O0000O00000OO.O00000000(
                        o0000O00OO0O0,
                        var6,
                        FontRegistry.O00000000000,
                        var12.x() + var6.O00000000(14.0F),
                        var20,
                        var37,
                        8.0F,
                        (var41 ? "▸ " : "▾ ") + var22.category().toUpperCase(Locale.ROOT),
                        ColorScheme.O00000000(var7.O000000000O00(), var39 ? 245 : 210)
                     );
                     String var43 = String.valueOf(var22.count());
                     float var45 = O0000O00000OO.O00000000(var6, FontRegistry.O00000000, var43, 8.0F);
                     O0000O00000OO.O00000000(
                        o0000O00OO0O0,
                        var6,
                        FontRegistry.O00000000,
                        var12.x() + var12.w() - var6.O00000000(18.0F) - var45,
                        var20,
                        var37,
                        8.0F,
                        var43,
                        ColorScheme.O00000000(var7.O000000000O0(), var39 ? 210 : 140)
                     );
                  }

                  var20 += var6.O00000000(22.0F);
               } else {
                  O00000OOO0O00O var23 = var22.def();
                  float var24 = var6.O00000000(24.0F);
                  if (var20 + var24 >= var15 && var20 <= var16) {
                     boolean var25 = o0000O000O0O0.O0000000O() >= var12.x() + var6.O00000000(8.0F)
                        && o0000O000O0O0.O0000000O() < var12.x() + var12.w() - var6.O00000000(8.0F)
                        && o0000O000O0O0.O0000000O0() >= var20
                        && o0000O000O0O0.O0000000O0() < var20 + var24;
                     float var26 = var25 ? 1.0F : 0.0F;
                     boolean var27 = var19.O00000000(var23.O00000000());
                     o0000O00OO0O0.O00000000(
                        var12.x() + var6.O00000000(8.0F),
                        var20,
                        var12.w() - var6.O00000000(16.0F),
                        var24,
                        var6.O00000000(7.0F),
                        ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, 4), ColorScheme.O00000000(var7.O000000000O0(), 54), var26)
                     );
                     o0000O00OO0O0.O000000000(
                        var12.x() + var6.O00000000(19.0F),
                        var20 + var24 * 0.5F,
                        var6.O00000000(2.6F),
                        0.0F,
                        1.0F,
                        this.O00000000(var23.O0000000000000().isEmpty() ? null : var23.O0000000000000().get(0), var7)
                     );
                     O0000O00000OO.O00000000(
                        o0000O00OO0O0,
                        var6,
                        FontRegistry.O00000000,
                        var12.x() + var6.O00000000(31.0F),
                        var20,
                        var24,
                        9.0F,
                        O0000O00000OO.O00000000(var6, FontRegistry.O00000000, var23.O000000000(), 9.0F, var12.w() - var6.O00000000(112.0F)),
                        var25 ? var7.O000000000O() : var7.O0000000000OOO()
                     );
                     String var28 = var23.O0000000000000().isEmpty() ? "out" : var23.O0000000000000().get(0).type().O00000000();
                     O0000O00000OO.O00000000(
                        o0000O00OO0O0,
                        var6,
                        FontRegistry.O00000000,
                        var12.x() + var12.w() - var6.O00000000(72.0F),
                        var20,
                        var24,
                        8.0F,
                        var28,
                        ColorScheme.O00000000(var7.O000000000O0(), var25 ? 230 : 150)
                     );
                     if (var27 || var25) {
                        O00000OOO000O0 var29 = this.O00000000(var12, var6, var20, var24);
                        boolean var30 = var29.contains(o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0());
                        this.O00000000(
                           o0000O00OO0O0, var6, var7, var29.x() + var29.w() * 0.5F, var29.y() + var29.h() * 0.5F, var27, var30 ? 1.0F : (var27 ? 0.8F : 0.35F)
                        );
                     }
                  }

                  var20 += var6.O00000000(26.0F);
               }
            }

            if (var14.isEmpty()) {
               O0000O00000OO.O00000000(
                  o0000O00OO0O0,
                  var6,
                  FontRegistry.O00000000,
                  var12.x() + var6.O00000000(16.0F),
                  var15 + var6.O00000000(10.0F),
                  9.0F,
                  "no matching nodes",
                  var7.O0000000000OOO()
               );
            }
         } finally {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }

         if (var18 > var17 + 1.0F) {
            float var34 = var12.x() + var12.w() - var6.O00000000(8.0F);
            float var35 = var15 + var6.O00000000(2.0F);
            float var36 = var17 - var6.O00000000(4.0F);
            float var38 = Math.max(var6.O00000000(34.0F), var36 * var17 / var18);
            float var40 = Math.max(1.0F, var18 - var17);
            float var42 = var35 + (var36 - var38) * (this.O0000000O00 / var40);
            float var44 = O00000OOOOOOO.O00000000(
               7101L,
               var34 - var6.O00000000(3.0F),
               var35,
               var6.O00000000(8.0F),
               var36,
               var42,
               var38,
               var6.O00000000(6.0F),
               o0000O000O0O0.O0000000O(),
               o0000O000O0O0.O0000000O0(),
               g -> this.O0000000O00 = O000000000(g, 0.0F, 1.0F) * var40
            );
            float var46 = var6.O00000000(2.0F) + var6.O00000000(2.0F) * var44;
            o0000O00OO0O0.O00000000(var34, var35, var6.O00000000(2.0F), var36, var6.O00000000(1.0F), var7.O00000000000O0());
            o0000O00OO0O0.O00000000(
               var34 + var6.O00000000(2.0F) - var46,
               var42,
               var46,
               var38,
               var6.O00000000(1.5F),
               ColorScheme.O00000000(var7.O000000000O0(), (int)(142.0F + 90.0F * var44))
            );
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, O00000OOO000O0 o00000OOO000O0) {
      float var5 = this.O0000000O000O ? 1.0F : 0.0F;
      float var6 = o0000O00000.O00000000(7.0F);
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         var6,
         ColorScheme.O00000000(255, 255, 255, this.O00000000(o0000O000O0OO) ? 78 : 12)
      );
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         var6,
         ColorScheme.O00000000(
            o0000O000O0OO.O0000000000O(), ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 176), Math.max(var5, this.O0000000O0000O.isEmpty() ? 0.0F : 0.5F)
         ),
         this.O0000000O000O ? 1.0F : 0.65F
      );
      float var7 = o00000OOO000O0.x() + o0000O00000.O00000000(11.0F);
      float var8 = o00000OOO000O0.y() + o00000OOO000O0.h() * 0.5F - o0000O00000.O00000000(1.0F);
      o0000O00OO0O0.O00000000(var7, var8, o0000O00000.O00000000(3.2F), 0.0F, 1.0F, 1.2F, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 220));
      o0000O00OO0O0.O00000000(
         var7 + o0000O00000.O00000000(2.4F),
         var8 + o0000O00000.O00000000(2.4F),
         o0000O00000.O00000000(3.8F),
         1.2F,
         0.6F,
         ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 220)
      );
      float var9 = o00000OOO000O0.x() + o0000O00000.O00000000(21.0F);
      String var10 = this.O0000000O0000O.isEmpty() ? "Search nodes…" : this.O0000000O0000O;
      int var11 = this.O0000000O0000O.isEmpty() ? this.O0000000000(o0000O000O0OO) : this.O000000000(o0000O000O0OO);
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x() + o0000O00000.O00000000(4.0F),
         o00000OOO000O0.y(),
         o00000OOO000O0.w() - o0000O00000.O00000000(8.0F),
         o00000OOO000O0.h(),
         var6,
         var6,
         var6,
         var6
      );

      try {
         O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000, var9, o00000OOO000O0.y(), o00000OOO000O0.h(), 9.0F, var10, var11);
         if (this.O0000000O000O && (System.currentTimeMillis() - this.O0000000O000O0) / 500L % 2L == 0L) {
            float var12 = var9
               + (
                  this.O0000000O0000O.isEmpty()
                     ? 0.0F
                     : O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, this.O0000000O0000O, 9.0F) + o0000O00000.O00000000(1.5F)
               );
            o0000O00OO0O0.O00000000(
               Math.min(var12, o00000OOO000O0.x() + o00000OOO000O0.w() - o0000O00000.O00000000(8.0F)),
               o00000OOO000O0.y() + o0000O00000.O00000000(4.5F),
               1.0F,
               o00000OOO000O0.h() - o0000O00000.O00000000(9.0F),
               0.0F,
               ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 240)
            );
         }
      } finally {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, float f, float g, boolean bl, float h) {
      int var8 = ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), Math.round(120.0F + 130.0F * h));
      float var9 = o0000O00000.O00000000(2.9F);
      if (bl) {
         o0000O00OO0O0.O00000000(f - var9, g - var9, var9 * 2.0F, var9 * 2.0F, o0000O00000.O00000000(1.0F), var8);
         o0000O00OO0O0.O00000000(f, g);
         o0000O00OO0O0.O000000000(45.0F);
         o0000O00OO0O0.O00000000(-var9, -var9, var9 * 2.0F, var9 * 2.0F, o0000O00000.O00000000(1.0F), ColorScheme.O00000000(var8, 210));
         o0000O00OO0O0.O000000000000O();
         o0000O00OO0O0.O00000000000O();
         o0000O00OO0O0.O000000000(f, g, o0000O00000.O00000000(1.4F), 0.0F, 1.0F, ColorScheme.O00000000(o0000O000O0OO.O000000000O(), 200));
      } else {
         o0000O00OO0O0.O00000000(f - var9, g - var9, var9 * 2.0F, var9 * 2.0F, o0000O00000.O00000000(1.0F), var8, 0.7F);
         o0000O00OO0O0.O00000000(f, g);
         o0000O00OO0O0.O000000000(45.0F);
         o0000O00OO0O0.O00000000(-var9, -var9, var9 * 2.0F, var9 * 2.0F, o0000O00000.O00000000(1.0F), ColorScheme.O00000000(var8, 150), 0.7F);
         o0000O00OO0O0.O000000000000O();
         o0000O00OO0O0.O00000000000O();
      }
   }

   private O00000OOO000O0 O00000000(O0000O00000 o0000O00000, int i) {
      O00000OOO000O0 var3 = this.O000000000(o0000O00000, i);
      return new O00000OOO000O0(
         var3.x() + o0000O00000.O00000000(10.0F),
         var3.y() + o0000O00000.O00000000(42.0F),
         var3.w() - o0000O00000.O00000000(20.0F),
         o0000O00000.O00000000(22.0F)
      );
   }

   private O00000OOO000O0 O00000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000, float f, float g) {
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o00000OOO000O0.w() - o0000O00000.O00000000(30.0F),
         f + (g - o0000O00000.O00000000(16.0F)) * 0.5F,
         o0000O00000.O00000000(16.0F),
         o0000O00000.O00000000(16.0F)
      );
   }

   private List<O00000OOO000OO.W294> O0000000000OOO() {
      ArrayList var1 = new ArrayList();
      String var2 = this.O0000000O0000O == null ? "" : this.O0000000O0000O.toLowerCase(Locale.ROOT).trim();
      if (var2.isEmpty()) {
         O00000OOOOO var10 = O00000OOOOO.O00000000();
         ArrayList var12 = new ArrayList();

         for (String var16 : var10.O000000000()) {
            O00000OOO0O00O var7 = this.O0000000000000.O00000000(var16);
            if (var7 != null) {
               var12.add(var7);
            }
         }

         this.O00000000(var1, "Избранное", var12);
         ArrayList var15 = new ArrayList();

         for (String var19 : var10.O0000000000()) {
            O00000OOO0O00O var8 = this.O0000000000000.O00000000(var19);
            if (var8 != null) {
               var15.add(var8);
            }
         }

         this.O00000000(var1, "Недавние", var15);
         String var18 = null;
         ArrayList var20 = new ArrayList();

         for (O00000OOO0O00O var9 : this.O000000000O0OO()) {
            if (!var9.O0000000000().equals(var18)) {
               if (var18 != null) {
                  this.O00000000(var1, var18, var20);
               }

               var18 = var9.O0000000000();
               var20 = new ArrayList();
            }

            var20.add(var9);
         }

         if (var18 != null) {
            this.O00000000(var1, var18, var20);
         }

         return var1;
      } else {
         ArrayList var3 = new ArrayList();

         for (O00000OOO0O00O var5 : this.O0000000000000.O00000000()) {
            O00000OOO00O0.W300 var6 = O00000OOO00O0.O00000000(var5, var2);
            if (var6 != null) {
               var3.add(var6);
            }
         }

         var3.sort(Comparator.<O00000OOO00O0.W300>comparingInt(o00000000 -> -o00000000.score()).thenComparing(o00000000 -> o00000000.def().O000000000()));

         for (O00000OOO00O0.W300 var13 : (List<O00000OOO00O0.W300>)var3) {
            var1.add(new O00000OOO000OO.W294(1, var13.def().O0000000000(), var13.def(), 0));
         }

         return var1;
      }
   }

   private void O00000000(List<O00000OOO000OO.W294> list, String string, List<O00000OOO0O00O> list2) {
      if (!list2.isEmpty()) {
         list.add(new O00000OOO000OO.W294(0, string, null, list2.size()));
         if (!this.O0000000O000OO.contains(string)) {
            for (O00000OOO0O00O var5 : list2) {
               list.add(new O00000OOO000OO.W294(1, string, var5, 0));
            }
         }
      }
   }

   private float O00000000(O0000O00000 o0000O00000, List<O00000OOO000OO.W294> list) {
      float var3 = 0.0F;

      for (O00000OOO000OO.W294 var5 : list) {
         var3 += var5.type() == 0 ? o0000O00000.O00000000(22.0F) : o0000O00000.O00000000(26.0F);
      }

      return var3;
   }

   private O00000OOO000OO.W295 O00000000(O0000O00000 o0000O00000, int i, float f, float g) {
      O00000OOO000O0 var5 = this.O000000000(o0000O00000, i);
      float var6 = var5.y() + o0000O00000.O00000000(74.0F);
      float var7 = var5.y() + var5.h() - o0000O00000.O00000000(14.0F);
      if (!(g < var6) && !(g > var7) && !(f < var5.x() + o0000O00000.O00000000(8.0F)) && !(f >= var5.x() + var5.w() - o0000O00000.O00000000(8.0F))) {
         float var8 = var6 - this.O0000000O00;

         for (O00000OOO000OO.W294 var10 : this.O0000000000OOO()) {
            if (var10.type() == 0) {
               if (g >= var8 && g < var8 + o0000O00000.O00000000(20.0F)) {
                  return new O00000OOO000OO.W295(var10, false);
               }

               var8 += o0000O00000.O00000000(22.0F);
            } else {
               float var11 = o0000O00000.O00000000(24.0F);
               if (g >= var8 && g < var8 + var11) {
                  boolean var12 = this.O00000000(var5, o0000O00000, var8, var11).contains(f, g);
                  return new O00000OOO000OO.W295(var10, var12);
               }

               var8 += o0000O00000.O00000000(26.0F);
               if (var8 > var7 + o0000O00000.O00000000(26.0F)) {
                  break;
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O000O0OOO o0000O000O0OOO, int i, int j, float f) {
      O0000O00000 var7 = o0000O000O0OOO.O000000000000();
      ColorScheme var8 = o0000O000O0OOO.O0000000000000();
      O00000OOO000O0 var9 = this.O000000000(var7, i, j);
      float var10 = var9.w();
      float var11 = var9.h();
      float var12 = var9.x();
      float var13 = var9.y();
      float var14 = var7.O00000000(15.0F);
      o0000O00OO0O0.O00000000(var12, var13, var10, var11, var14, var7.O00000000(22.0F), var7.O00000000(2.0F), this.O0000000000(var8, 138));
      o0000O00OO0O0.O00000000(var12, var13, var10, var11, var14, this.O000000000(var8, 210));
      o0000O00OO0O0.O00000000(var12, var13, var10, var11, var14, ColorScheme.O00000000(var8.O000000000O00(), 56), 0.8F);
      float var15 = var7.O00000000(12.0F);
      float var16 = var11 - var7.O00000000(50.0F);
      float var17 = var10 - var15 * 2.0F;
      float var18 = var12 + var15;
      float var19 = var13 + var7.O00000000(38.0F);
      O00000OOO0OOOO.O00000000(
         o0000O00OO0O0,
         o0000O000O0OOO,
         this.O00000000OO,
         this.O00000000000O,
         this.O0000000000O0,
         var18,
         var19,
         var17,
         var16,
         i,
         j,
         o0000O000O0O0.O0000000O(),
         o0000O000O0O0.O0000000O0(),
         f
      );
      String var20 = this.O00000000000O.O000000000();
      float var21 = var7.O00000000(9.0F);
      if (!var20.isBlank()) {
         o0000O00OO0O0.O00000000(var18, var19, var17, var16, var21, ColorScheme.O00000000(8, 4, 6, Math.round(150.0F * f)));
         o0000O00OO0O0.O00000000(var18, var19, var17, var16, var21, ColorScheme.O00000000(255, 110, 124, Math.round(142.0F * f)), 0.7F);
         String var22 = "compile failed";
         float var23 = O0000O00000OO.O00000000(var7, FontRegistry.O00000000000, var22, 10.0F);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var7,
            FontRegistry.O00000000000,
            var18 + (var17 - var23) * 0.5F,
            var19 + var16 * 0.5F - var7.O00000000(17.0F),
            var7.O00000000(14.0F),
            10.0F,
            var22,
            ColorScheme.O00000000(255, 132, 132, 240)
         );
         String var24 = O0000O00000OO.O00000000(var7, FontRegistry.O00000000, var20, 8.0F, var17 - var7.O00000000(24.0F));
         float var25 = O0000O00000OO.O00000000(var7, FontRegistry.O00000000, var24, 8.0F);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var7,
            FontRegistry.O00000000,
            var18 + (var17 - var25) * 0.5F,
            var19 + var16 * 0.5F + var7.O00000000(1.0F),
            var7.O00000000(12.0F),
            8.0F,
            var24,
            ColorScheme.O00000000(255, 182, 188, 218)
         );
      } else if (this.O00000000000O.O0000000000().isBlank()) {
         o0000O00OO0O0.O000000000(
            var18,
            var19,
            var17,
            var16,
            var21,
            ColorScheme.O00000000(var8.O000000000O0(), Math.round(52.0F * f)),
            ColorScheme.O00000000(var8.O000000000O00(), Math.round(30.0F * f))
         );
         o0000O00OO0O0.O00000000(var18, var19, var17, var16, var21, ColorScheme.O00000000(var8.O000000000O0(), Math.round(74.0F * f)), 0.6F);
         String var26 = "connect Master Output to see the result";
         float var27 = O0000O00000OO.O00000000(var7, FontRegistry.O00000000, var26, 9.0F);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var7,
            FontRegistry.O00000000,
            var18 + (var17 - var27) * 0.5F,
            var19 + var16 * 0.5F - var7.O00000000(7.0F),
            var7.O00000000(14.0F),
            9.0F,
            var26,
            this.O0000000000(var8)
         );
      }

      O0000O00000OO.O00000000(
         o0000O00OO0O0, var7, FontRegistry.O00000000000, var12 + var15, var13 + var7.O00000000(12.0F), 11.0F, "Master Preview", var8.O000000000O()
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         var7,
         FontRegistry.O00000000,
         var12 + var15 + var7.O00000000(108.0F),
         var13 + var7.O00000000(14.0F),
         9.0F,
         this.O00000000OO.O000000000(),
         ColorScheme.O00000000(var8.O000000000O00(), 220)
      );
   }

   private void O00000000000O(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O000O0OOO o0000O000O0OOO, int i, int j) {
      O0000O00000 var6 = o0000O000O0OOO.O000000000000();
      ColorScheme var7 = o0000O000O0OOO.O0000000000000();
      O00000OOO000O0 var8 = this.O00000000(var6, i, j);
      float var9 = var6.O00000000(14.0F);
      o0000O00OO0O0.O00000000(var8.x(), var8.y(), var8.w(), var8.h(), var9, var6.O00000000(20.0F), var6.O00000000(2.0F), this.O0000000000(var7, 132));
      o0000O00OO0O0.O00000000(var8.x(), var8.y(), var8.w(), var8.h(), var9, this.O00000000(var7, 214));
      o0000O00OO0O0.O00000000(var8.x(), var8.y(), var8.w(), var8.h(), var9, ColorScheme.O00000000(var7.O000000000O0(), 58), 0.7F);
      O00000OOO0OO0O var10 = this.O000000000OO();
      if (var10 == null) {
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var6,
            FontRegistry.O00000000000,
            var8.x() + var6.O00000000(14.0F),
            var8.y() + var6.O00000000(14.0F),
            12.0F,
            "Shader Settings",
            var7.O000000000O()
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var6,
            FontRegistry.O00000000,
            var8.x() + var6.O00000000(14.0F),
            var8.y() + var6.O00000000(32.0F),
            8.0F,
            this.O00000000OO.O000000000() + " / " + this.O00000000OO0O0,
            ColorScheme.O00000000(var7.O000000000O0(), 190)
         );
         this.O000000000(o0000O00OO0O0, var6, var7, var8);
      } else {
         O00000OOO0O00O var11 = this.O0000000000000.O00000000(var10.O000000000());
         if (var11 != null) {
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var6,
               FontRegistry.O00000000000,
               var8.x() + var6.O00000000(14.0F),
               var8.y() + var6.O00000000(14.0F),
               12.0F,
               var11.O000000000(),
               var7.O000000000O()
            );
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var6,
               FontRegistry.O00000000,
               var8.x() + var6.O00000000(14.0F),
               var8.y() + var6.O00000000(30.0F),
               8.0F,
               var11.O0000000000() + " / " + var10.O000000000(),
               ColorScheme.O00000000(var7.O000000000O0(), 190)
            );
            this.O00000000(o0000O00OO0O0, var6, var7, var8, var11, var10);
            float var12 = var8.y() + var6.O00000000(74.0F);
            if (var11.O00000000000O()) {
               O00000OOO000O0 var13 = this.O000000000(var8, var6);
               boolean var14 = Boolean.TRUE.equals(this.O0000000O0OOO0.get(var10.O00000000()));
               boolean var15 = var13.contains(o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0());
               o0000O00OO0O0.O00000000(
                  var13.x(),
                  var13.y(),
                  var13.w(),
                  var13.h(),
                  var6.O00000000(7.0F),
                  ColorScheme.O00000000(
                     var7.O00000000000O0(), ColorScheme.O00000000(var14 ? var7.O000000000O00() : var7.O000000000O0(), 76), !var15 && !var14 ? 0.0F : 1.0F
                  )
               );
               o0000O00OO0O0.O00000000(
                  var13.x(), var13.y(), var13.w(), var13.h(), var6.O00000000(7.0F), ColorScheme.O00000000(var7.O000000000O0(), var14 ? 150 : 84), 0.65F
               );
               String var16 = var14 ? "Preview ON" : "Preview OFF";
               float var17 = O0000O00000OO.O00000000(var6, FontRegistry.O00000000, var16, 9.0F);
               O0000O00000OO.O00000000(
                  o0000O00OO0O0, var6, FontRegistry.O00000000, var13.x() + (var13.w() - var17) * 0.5F, var13.y(), var13.h(), 9.0F, var16, var7.O000000000O()
               );
            }

            if ("float_value".equals(var10.O000000000())) {
               this.O00000000(o0000O00OO0O0, var6, var7, var10, "value", "Value", -12.0F, 12.0F, 0.01F, 0.5F, var8, 0, o0000O000O0O0);
            } else if ("int_value".equals(var10.O000000000())) {
               this.O00000000(o0000O00OO0O0, var6, var7, var10, "value", "Value", -64.0F, 64.0F, 1.0F, 1.0F, var8, 0, o0000O000O0O0);
            } else if ("exposed_float".equals(var10.O000000000())) {
               this.O00000000(o0000O00OO0O0, var6, var7, var10, "name", "Name", var8, 0, o0000O000O0O0);
               float var19 = var10.O00000000("min", 0.0F);
               float var20 = var10.O00000000("max", 1.0F);
               if (var20 <= var19) {
                  var20 = var19 + 0.001F;
               }

               this.O00000000(o0000O00OO0O0, var6, var7, var10, "value", "Default", var19, var20, var10.O00000000("step", 0.01F), 0.5F, var8, 1, o0000O000O0O0);
               this.O00000000(o0000O00OO0O0, var6, var7, var10, "min", "Min", -128.0F, 128.0F, 0.01F, 0.0F, var8, 2, o0000O000O0O0);
               this.O00000000(o0000O00OO0O0, var6, var7, var10, "max", "Max", -128.0F, 128.0F, 0.01F, 1.0F, var8, 3, o0000O000O0O0);
               this.O00000000(o0000O00OO0O0, var6, var7, var10, "step", "Step", 1.0E-4F, 16.0F, 0.001F, 0.01F, var8, 4, o0000O000O0O0);
            } else if ("exposed_color".equals(var10.O000000000())) {
               this.O00000000(o0000O00OO0O0, var6, var7, var10, "name", "Name", var8, 0, o0000O000O0O0);
               this.O00000000(o0000O00OO0O0, var6, var7, var10, "r", "Red", 0.0F, 1.0F, 0.01F, 1.0F, var8, 1, o0000O000O0O0);
               this.O00000000(o0000O00OO0O0, var6, var7, var10, "g", "Green", 0.0F, 1.0F, 0.01F, 1.0F, var8, 2, o0000O000O0O0);
               this.O00000000(o0000O00OO0O0, var6, var7, var10, "b", "Blue", 0.0F, 1.0F, 0.01F, 1.0F, var8, 3, o0000O000O0O0);
               this.O00000000(o0000O00OO0O0, var6, var7, var10, "a", "Alpha", 0.0F, 1.0F, 0.01F, 1.0F, var8, 4, o0000O000O0O0);
               O00000OOO000O0 var18 = new O00000OOO000O0(var8.x() + var8.w() - var6.O00000000(82.0F), var12, var6.O00000000(68.0F), var6.O00000000(18.0F));
               o0000O00OO0O0.O00000000(
                  var18.x(),
                  var18.y(),
                  var18.w(),
                  var18.h(),
                  var6.O00000000(6.0F),
                  ColorScheme.O00000000(
                     Math.round(var10.O00000000("r", 1.0F) * 255.0F),
                     Math.round(var10.O00000000("g", 1.0F) * 255.0F),
                     Math.round(var10.O00000000("b", 1.0F) * 255.0F),
                     Math.round(var10.O00000000("a", 1.0F) * 255.0F)
                  )
               );
               o0000O00OO0O0.O00000000(var18.x(), var18.y(), var18.w(), var18.h(), var6.O00000000(6.0F), var7.O0000000000O(), 0.6F);
            } else {
               this.O00000000(o0000O00OO0O0, var6, var7, var8, var11, var10, var12);
            }
         }
      }
   }

   private void O000000000(RenderManager o0000O00OO0O0, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO, O00000OOO000O0 o00000OOO000O0) {
      float var5 = o00000OOO000O0.y() + o0000O00000.O00000000(58.0F);
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         o00000OOO000O0.x() + o0000O00000.O00000000(14.0F),
         var5,
         "Name",
         this.O0000000O00OOO != null && !this.O0000000O00OOO.isBlank() ? this.O0000000O00OOO : this.O0000000000O0.O00000000().O000000000()
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         o00000OOO000O0.x() + o0000O00000.O00000000(14.0F),
         var5 + o0000O00000.O00000000(22.0F),
         "Nodes",
         String.valueOf(this.O0000000000O0.O0000000000().size())
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         o00000OOO000O0.x() + o0000O00000.O00000000(14.0F),
         var5 + o0000O00000.O00000000(44.0F),
         "Links",
         String.valueOf(this.O0000000000O0.O00000000000().size())
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         o00000OOO000O0.x() + o0000O00000.O00000000(14.0F),
         var5 + o0000O00000.O00000000(66.0F),
         "Uniforms",
         String.valueOf(this.O000000000000O.O00000000(this.O0000000000O0).exposedUniforms().size())
      );
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         o00000OOO000O0.x() + o0000O00000.O00000000(14.0F),
         var5 + o0000O00000.O00000000(88.0F),
         "Author",
         this.O0000000000O0.O00000000().O0000000000().isBlank() ? O00000OOOOO000.O000000000000O() : this.O0000000000O0.O00000000().O0000000000()
      );
      String var6 = this.O0000000000O0.O000000000000() == this.O0000000O00O0O ? "saved" : "dirty";
      O00000OOO000O0 var7 = new O00000OOO000O0(
         o00000OOO000O0.x() + o0000O00000.O00000000(14.0F),
         o00000OOO000O0.y() + o00000OOO000O0.h() - o0000O00000.O00000000(42.0F),
         o00000OOO000O0.w() - o0000O00000.O00000000(28.0F),
         o0000O00000.O00000000(28.0F)
      );
      o0000O00OO0O0.O00000000(
         var7.x(),
         var7.y(),
         var7.w(),
         var7.h(),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(
            ColorScheme.O00000000(255, 255, 255, this.O00000000(o0000O000O0OO) ? 50 : 9),
            ColorScheme.O00000000(this.O0000000000O0.O000000000000() == this.O0000000O00O0O ? o0000O000O0OO.O000000000O00() : o0000O000O0OO.O000000000O0(), 72),
            0.86F
         )
      );
      o0000O00OO0O0.O00000000(
         var7.x(),
         var7.y(),
         var7.w(),
         var7.h(),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(this.O0000000000O0.O000000000000() == this.O0000000O00O0O ? o0000O000O0OO.O000000000O00() : o0000O000O0OO.O000000000O0(), 120),
         0.65F
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         var7.x() + o0000O00000.O00000000(12.0F),
         var7.y(),
         var7.h(),
         9.0F,
         "compile state: " + var6,
         this.O000000000(o0000O000O0OO)
      );
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O00000OOO000O0 o00000OOO000O0,
      O00000OOO0O00O o00000OOO0O00O,
      O00000OOO0OO0O o00000OOO0OO0O
   ) {
      float var7 = o00000OOO000O0.y() + o0000O00000.O00000000(48.0F);
      String[] var8 = new String[]{
         o00000OOO0O00O.O000000000000().size() + " in",
         o00000OOO0O00O.O0000000000000().size() + " out",
         this.O000000000000(o00000OOO0OO0O) ? "uniform" : o00000OOO0O00O.O0000000000()
      };
      float var9 = o00000OOO000O0.x() + o0000O00000.O00000000(14.0F);

      for (int var10 = 0; var10 < var8.length; var10++) {
         float var11 = var10 == 2
            ? o00000OOO000O0.w() - o0000O00000.O00000000(28.0F) - (var9 - o00000OOO000O0.x() - o0000O00000.O00000000(14.0F))
            : o0000O00000.O00000000(58.0F);
         O00000OOO000O0 var12 = new O00000OOO000O0(var9, var7, var11, o0000O00000.O00000000(18.0F));
         o0000O00OO0O0.O00000000(
            var12.x(),
            var12.y(),
            var12.w(),
            var12.h(),
            o0000O00000.O00000000(6.0F),
            ColorScheme.O00000000(255, 255, 255, this.O00000000(o0000O000O0OO) ? 42 : 8)
         );
         o0000O00OO0O0.O00000000(
            var12.x(),
            var12.y(),
            var12.w(),
            var12.h(),
            o0000O00000.O00000000(6.0F),
            ColorScheme.O00000000(var10 == 2 ? o0000O000O0OO.O000000000O00() : o0000O000O0OO.O000000000O0(), 72),
            0.55F
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000,
            var12.x() + o0000O00000.O00000000(8.0F),
            var12.y(),
            var12.h(),
            8.0F,
            O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, var8[var10], 8.0F, var12.w() - o0000O00000.O00000000(16.0F)),
            this.O0000000000(o0000O000O0OO)
         );
         var9 += var11 + o0000O00000.O00000000(6.0F);
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O00000OOO000O0 o00000OOO000O0,
      O00000OOO0O00O o00000OOO0O00O,
      O00000OOO0OO0O o00000OOO0OO0O,
      float f
   ) {
      float var8 = o00000OOO000O0.w() - o0000O00000.O00000000(28.0F);
      float var9 = o00000OOO000O0.y() + o00000OOO000O0.h() - o0000O00000.O00000000(16.0F) - f;
      if ("output_color".equals(o00000OOO0OO0O.O000000000())) {
         this.O000000000(
            o0000O00OO0O0,
            o0000O00000,
            o0000O000O0OO,
            new O00000OOO000O0(o00000OOO000O0.x() + o0000O00000.O00000000(14.0F), f, var8, var9),
            o00000OOO0O00O,
            o00000OOO0OO0O
         );
      } else {
         boolean var10 = !o00000OOO0O00O.O000000000000().isEmpty();
         boolean var11 = !o00000OOO0O00O.O0000000000000().isEmpty();
         if (var10 || var11) {
            if (var10 != var11) {
               O00000OOO000O0 var16 = new O00000OOO000O0(o00000OOO000O0.x() + o0000O00000.O00000000(14.0F), f, var8, var9);
               if (var10) {
                  this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var16, "Inputs", o00000OOO0O00O.O000000000000(), o00000OOO0OO0O, true);
               } else {
                  this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var16, "Outputs", o00000OOO0O00O.O0000000000000(), o00000OOO0OO0O, false);
               }
            } else {
               float var12 = o0000O00000.O00000000(10.0F);
               float var13 = (var8 - var12) * 0.5F;
               O00000OOO000O0 var14 = new O00000OOO000O0(o00000OOO000O0.x() + o0000O00000.O00000000(14.0F), f, var13, var9);
               O00000OOO000O0 var15 = new O00000OOO000O0(var14.x() + var14.w() + var12, f, var13, var14.h());
               this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var14, "Inputs", o00000OOO0O00O.O000000000000(), o00000OOO0OO0O, true);
               this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var15, "Outputs", o00000OOO0O00O.O0000000000000(), o00000OOO0OO0O, false);
            }
         }
      }
   }

   private void O000000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O00000OOO000O0 o00000OOO000O0,
      O00000OOO0O00O o00000OOO0O00O,
      O00000OOO0OO0O o00000OOO0OO0O
   ) {
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(255, 255, 255, this.O00000000(o0000O000O0OO) ? 34 : 6)
      );
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 92),
         0.55F
      );
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y() + o0000O00000.O00000000(8.0F),
         o0000O00000.O00000000(2.2F),
         o00000OOO000O0.h() - o0000O00000.O00000000(16.0F),
         o0000O00000.O00000000(1.1F),
         ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 190)
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         o00000OOO000O0.x() + o0000O00000.O00000000(12.0F),
         o00000OOO000O0.y() + o0000O00000.O00000000(8.0F),
         9.0F,
         "Result",
         ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 224)
      );
      String var7 = this.O00000000000O.O0000000000().isBlank() ? "cold" : "#" + this.O00000000000O.O0000000000();
      float var8 = o00000OOO000O0.x() + o0000O00000.O00000000(12.0F);
      float var9 = o00000OOO000O0.y() + o0000O00000.O00000000(26.0F);
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var8, var9, "Hash", var7);
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var8, var9 + o0000O00000.O00000000(18.0F), "State", this.O000000000000O());
      this.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var8, var9 + o0000O00000.O00000000(36.0F), "Target", this.O00000000OO.O000000000());
      this.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         var8,
         var9 + o0000O00000.O00000000(54.0F),
         "Uniforms",
         String.valueOf(this.O000000000000O.O00000000(this.O0000000000O0).exposedUniforms().size())
      );
      float var10 = var9 + o0000O00000.O00000000(76.0F);

      for (O00000OOO0O0OO var12 : o00000OOO0O00O.O000000000000()) {
         if (var10 > o00000OOO000O0.y() + o00000OOO000O0.h() - o0000O00000.O00000000(14.0F)) {
            break;
         }

         boolean var13 = this.O0000000000O0.O000000000(o00000OOO0OO0O.O00000000(), var12.id()) != null;
         int var14 = this.O00000000(var12, o0000O000O0OO);
         o0000O00OO0O0.O000000000(
            var8 + o0000O00000.O00000000(3.0F),
            var10 + o0000O00000.O00000000(4.4F),
            o0000O00000.O00000000(2.6F),
            0.0F,
            1.0F,
            ColorScheme.O00000000(var14, var13 ? 245 : 130)
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000,
            var8 + o0000O00000.O00000000(12.0F),
            var10,
            8.0F,
            O0000O00000OO.O00000000(
               o0000O00000,
               FontRegistry.O00000000,
               var12.label() + (var13 ? " / linked" : " / not connected"),
               8.0F,
               o00000OOO000O0.w() - o0000O00000.O00000000(60.0F)
            ),
            var13 ? this.O000000000(o0000O000O0OO) : this.O0000000000(o0000O000O0OO)
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000,
            o00000OOO000O0.x() + o00000OOO000O0.w() - o0000O00000.O00000000(38.0F),
            var10,
            7.0F,
            var12.type().O00000000(),
            ColorScheme.O00000000(var14, var13 ? 220 : 150)
         );
         var10 += o0000O00000.O00000000(17.0F);
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O00000OOO000O0 o00000OOO000O0,
      String string,
      List<O00000OOO0O0OO> list,
      O00000OOO0OO0O o00000OOO0OO0O,
      boolean bl
   ) {
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(),
         o00000OOO000O0.y(),
         o00000OOO000O0.w(),
         o00000OOO000O0.h(),
         o0000O00000.O00000000(8.0F),
         ColorScheme.O00000000(255, 255, 255, this.O00000000(o0000O000O0OO) ? 34 : 6)
      );
      o0000O00OO0O0.O00000000(
         o00000OOO000O0.x(), o00000OOO000O0.y(), o00000OOO000O0.w(), o00000OOO000O0.h(), o0000O00000.O00000000(8.0F), o0000O000O0OO.O0000000000O(), 0.55F
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000000,
         o00000OOO000O0.x() + o0000O00000.O00000000(10.0F),
         o00000OOO000O0.y() + o0000O00000.O00000000(8.0F),
         9.0F,
         string,
         ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 220)
      );
      float var9 = o00000OOO000O0.y() + o0000O00000.O00000000(28.0F);

      for (O00000OOO0O0OO var11 : list) {
         if (var9 > o00000OOO000O0.y() + o00000OOO000O0.h() - o0000O00000.O00000000(18.0F)) {
            break;
         }

         int var12 = this.O00000000(var11, o0000O000O0OO);
         boolean var13 = bl
            ? this.O0000000000O0.O000000000(o00000OOO0OO0O.O00000000(), var11.id()) != null
            : this.O0000000000O0
               .O00000000000()
               .stream()
               .anyMatch(o00000OOO0OO0 -> o00000OOO0OO0.O00000000().equals(o00000OOO0OO0O.O00000000()) && o00000OOO0OO0.O000000000().equals(var11.id()));
         o0000O00OO0O0.O000000000(
            o00000OOO000O0.x() + o0000O00000.O00000000(12.0F),
            var9 + o0000O00000.O00000000(6.0F),
            o0000O00000.O00000000(2.6F),
            0.0F,
            1.0F,
            ColorScheme.O00000000(var12, var13 ? 245 : 130)
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000,
            o00000OOO000O0.x() + o0000O00000.O00000000(22.0F),
            var9,
            8.0F,
            O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, var11.label(), 8.0F, o00000OOO000O0.w() - o0000O00000.O00000000(62.0F)),
            var13 ? this.O000000000(o0000O000O0OO) : this.O0000000000(o0000O000O0OO)
         );
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O00000000,
            o00000OOO000O0.x() + o00000OOO000O0.w() - o0000O00000.O00000000(38.0F),
            var9,
            7.0F,
            var11.type().O00000000(),
            ColorScheme.O00000000(var12, var13 ? 220 : 150)
         );
         var9 += o0000O00000.O00000000(17.0F);
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O00000OOO0OO0O o00000OOO0OO0O,
      String string,
      String string2,
      O00000OOO000O0 o00000OOO000O0,
      int i,
      O0000O000O0O0 o0000O000O0O0
   ) {
      O00000OOO000O0 var10 = this.O00000000(o00000OOO000O0, o0000O00000, i);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         o00000OOO000O0.x() + o0000O00000.O00000000(14.0F),
         var10.y(),
         var10.h(),
         9.0F,
         string2,
         o0000O000O0OO.O0000000000OOO()
      );
      String var11 = this.O000000000(o00000OOO0OO0O, string);
      O00000OOOOO0O0 var12 = this.O0000000000O00(var11);
      if (!var12.O00000000000O()) {
         var12.O00000000(o00000OOO0OO0O.O00000000(string, this.O0000000000000(o00000OOO0OO0O)));
      }

      var12.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var10, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0());
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      O00000OOO0OO0O o00000OOO0OO0O,
      String string,
      String string2,
      float f,
      float g,
      float h,
      float i,
      O00000OOO000O0 o00000OOO000O0,
      int j,
      O0000O000O0O0 o0000O000O0O0
   ) {
      O00000OOO000O0 var14 = this.O00000000(o00000OOO000O0, o0000O00000, j);
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         FontRegistry.O00000000,
         o00000OOO000O0.x() + o0000O00000.O00000000(14.0F),
         var14.y(),
         var14.h(),
         9.0F,
         string2,
         o0000O000O0OO.O0000000000OOO()
      );
      String var15 = this.O000000000(o00000OOO0OO0O, string);
      O00000OOOOO0O0 var16 = this.O00000000(var15, f, g, h);
      if (!var16.O00000000000O()) {
         var16.O00000000(o00000OOO0OO0O.O00000000(string, i));
      }

      var16.O00000000(o0000O00OO0O0, o0000O00000, o0000O000O0OO, var14, o0000O000O0O0.O0000000O(), o0000O000O0O0.O0000000O0());
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O000O0OOO o0000O000O0OOO) {
      ArrayList var4 = new ArrayList<>(this.O0000000000O0.O0000000000());
      ((List<O00000OOO0OO0O>)var4).sort(Comparator.comparing(o00000OOO0OO0O -> this.O0000000000(o00000OOO0OO0O.O00000000())));

      for (O00000OOO0OO0O var6 : (List<O00000OOO0OO0O>)var4) {
         this.O00000000(o0000O00OO0O0, o0000O000O0O0, o0000O000O0OOO, var6);
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O000O0OOO o0000O000O0OOO, O00000OOO0OO0O o00000OOO0OO0O) {
      O00000OOO0O00O var5 = this.O0000000000000.O00000000(o00000OOO0OO0O.O000000000());
      if (var5 != null) {
         O0000O00000 var6 = o0000O000O0OOO.O000000000000();
         ColorScheme var7 = o0000O000O0OOO.O0000000000000();
         float var8 = this.O0000000000(o00000OOO0OO0O.O0000000000());
         float var9 = this.O00000000000(o00000OOO0OO0O.O00000000000());
         float var10 = var5.O00000000000() * this.O0000000000OO;
         O0000O00O0O0OO var11 = this.O0000000000O0(o00000OOO0OO0O.O00000000());
         var11.O0000000000(Boolean.TRUE.equals(this.O0000000O0OOO0.get(o00000OOO0OO0O.O00000000())) ? 1.0F : 0.0F);
         float var12 = var11.O00000000();
         float var13 = this.O000000000(var5);
         float var14 = this.O00000000(var5, o00000OOO0OO0O) * this.O0000000000OO;
         float var15 = Math.max(var6.O00000000(6.0F), 10.0F * this.O0000000000OO);
         boolean var16 = this.O0000000000(o00000OOO0OO0O.O00000000());
         boolean var17 = o0000O000O0O0.O0000000O() >= var8
            && o0000O000O0O0.O0000000O() < var8 + var10
            && o0000O000O0O0.O0000000O0() >= var9
            && o0000O000O0O0.O0000000O0() < var9 + var14;
         O0000O000O00O var18 = this.O0000000O0OO0O.computeIfAbsent(o00000OOO0OO0O.O00000000(), string -> new O0000O000O00O(0.0F));
         float var19 = var18.O00000000(var17 ? 1.0F : 0.0F, O0000O000O0O00.O0000000000O());
         O0000O00O0O0OO var20 = this.O0000000O0OOO.computeIfAbsent(o00000OOO0OO0O.O00000000(), string -> this.O000000000O000());
         var20.O0000000000(var16 ? 1.0F : (var17 ? 0.38F : 0.0F));
         float var21 = O000000000000O(var20.O00000000());
         O0000O000O00O var22 = this.O0000000O0OO00.computeIfAbsent(o00000OOO0OO0O.O00000000(), string -> new O0000O000O00O(1.0F));
         float var23 = var22.O00000000(1.0F, O0000O000O0O00.O00000000000O0());
         float var24 = Math.max(var21, var19 * 0.45F);
         float var25 = Math.min(1.0F, (Math.abs(this.O00000000O0O00) + Math.abs(this.O00000000O0O0O)) * 0.0012F);
         float var26 = Math.max(0.001F, var23) * (1.0F + var24 * 0.016F + var25 * (var17 ? 0.006F : 0.0F));
         o0000O00OO0O0.O00000000(var26, var8 + var10 * 0.5F, var9 + var14 * 0.5F);

         try {
            boolean var27 = O00000OOOO000.O00000000()
               .O00000000(
                  o0000O00OO0O0,
                  var8,
                  var9,
                  var10,
                  var14,
                  var15,
                  var19,
                  var21,
                  var25,
                  var7,
                  this.O00000000O0O,
                  this.O00000000O0O0,
                  this.O0000000OOO,
                  this.O0000000OOO0,
                  this.O00000000(var7)
               );
            if (!var27) {
               if (var19 > 0.001F) {
                  o0000O00OO0O0.O00000000(
                     var8,
                     var9,
                     var10,
                     var14,
                     var15,
                     var6.O00000000(12.0F) * var19,
                     var6.O00000000(1.1F),
                     ColorScheme.O00000000(var7.O000000000O00(), Math.round(34.0F * var19))
                  );
               }

               if (var21 > 0.001F) {
                  float var28 = 0.86F + 0.14F * (float)Math.sin((float)(System.currentTimeMillis() % 2200L) / 2200.0F * Math.PI * 2.0);
                  this.O00000000(o0000O00OO0O0, var8, var9, var10, var14, var15, var7.O000000000O0(), var21 * var28 * 0.62F, var6);
               }

               o0000O00OO0O0.O00000000(
                  var8,
                  var9 + var6.O00000000(2.0F),
                  var10,
                  var14,
                  var15,
                  var6.O00000000(11.0F),
                  var6.O00000000(1.0F),
                  this.O0000000000(var7, Math.round(82.0F + 24.0F * var21))
               );
               o0000O00OO0O0.O00000000(var8, var9, var10, var14, var15, 0.24F + 0.08F * var21);
               o0000O00OO0O0.O00000000(var8, var9, var10, var14, var15, this.O00000000(var7, Math.round(194.0F + 20.0F * var21)));
               if (var17) {
                  o0000O00OO0O0.O00000000(
                     var8 + 1.2F * this.O0000000000OO,
                     var9 + 1.2F * this.O0000000000OO,
                     var10 - 2.4F * this.O0000000000OO,
                     var14 - 2.4F * this.O0000000000OO,
                     Math.max(0.0F, var15 - 1.2F * this.O0000000000OO),
                     ColorScheme.O00000000(var7.O000000000O0(), Math.round(10.0F * var19))
                  );
               }

               o0000O00OO0O0.O00000000(
                  var8,
                  var9,
                  var10,
                  var14,
                  var15,
                  ColorScheme.O00000000(var7.O0000000000O(), ColorScheme.O00000000(var7.O000000000O0(), 118), Math.max(var19 * 0.48F, var21 * 0.72F)),
                  0.55F
               );
            }

            int var43 = this.O000000000(var7);
            int var29 = this.O0000000000(var7);
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var6,
               FontRegistry.O00000000000,
               var8 + 14.0F * this.O0000000000OO,
               var9 + 12.0F * this.O0000000000OO,
               11.0F * this.O0000000000OO / Math.max(0.001F, var6.O000000000()),
               var5.O000000000(),
               var43
            );
            O0000O00000OO.O00000000(
               o0000O00OO0O0,
               var6,
               FontRegistry.O00000000,
               var8 + 14.0F * this.O0000000000OO,
               var9 + 28.0F * this.O0000000000OO,
               8.5F * this.O0000000000OO / Math.max(0.001F, var6.O000000000()),
               var5.O0000000000(),
               var29
            );
            if (var5.O00000000000O()) {
               String var30 = "Preview";
               float var31 = 7.5F * this.O0000000000OO / Math.max(0.001F, var6.O000000000());
               float var32 = O0000O00000OO.O00000000(var6, FontRegistry.O00000000, var30, var31);
               O00000OOO000O0 var33 = this.O00000000(var5, var8, var9, var10);
               int var34 = ColorScheme.O00000000(
                  ColorScheme.O00000000(var7.O000000000O0(), this.O00000000(var7) ? 32 : 44), ColorScheme.O00000000(var7.O000000000O00(), 116), var12
               );
               o0000O00OO0O0.O00000000(var33.x(), var33.y(), var33.w(), var33.h(), var33.h() * 0.5F, var34);
               o0000O00OO0O0.O00000000(
                  var33.x(),
                  var33.y(),
                  var33.w(),
                  var33.h(),
                  var33.h() * 0.5F,
                  ColorScheme.O00000000(var7.O000000000O0(), Math.round(70.0F + 92.0F * var12)),
                  0.55F
               );
               O0000O00000OO.O00000000(
                  o0000O00OO0O0, var6, FontRegistry.O00000000, var33.x() + (var33.w() - var32) * 0.5F, var33.y(), var33.h(), var31, var30, var43
               );
            }

            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O00000000(
               var8 + 1.2F,
               var9 + 1.2F,
               var10 - 2.4F,
               var14 - 2.4F,
               Math.max(0.0F, var15 - 1.2F),
               Math.max(0.0F, var15 - 1.2F),
               Math.max(0.0F, var15 - 1.2F),
               Math.max(0.0F, var15 - 1.2F)
            );

            try {
               this.O00000000(o0000O00OO0O0, o0000O000O0OOO, o00000OOO0OO0O, var8, var9, var10);
               this.O00000000(o0000O00OO0O0, o0000O000O0OOO, o00000OOO0OO0O, var5, var8, var9, var10, var13, var12);
            } finally {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }

            this.O00000000(o0000O00OO0O0, o0000O000O0OOO, o00000OOO0OO0O, var5, var8, var9);
         } finally {
            o0000O00OO0O0.O00000000000O0();
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O000O0OOO o0000O000O0OOO, O00000OOO0OO0O o00000OOO0OO0O, float f, float g, float h) {
      O0000O00000 var7 = o0000O000O0OOO.O000000000000();
      ColorScheme var8 = o0000O000O0OOO.O0000000000000();
      if (this.O000000000000(o00000OOO0OO0O)) {
         O00000OOO000O0 var11 = this.O00000000000(o00000OOO0OO0O);
         O00000OOOOO0O0 var12 = this.O000000000(o00000OOO0OO0O);
         if (!var12.O00000000000O()) {
            var12.O00000000(o00000OOO0OO0O.O00000000("name", this.O0000000000000(o00000OOO0OO0O)));
         }

         var12.O00000000(o0000O00OO0O0, var7, var8, var11, this.O00000000O0O, this.O00000000O0O0);
      } else if (O000000000000O(o00000OOO0OO0O.O000000000())) {
         O00000OOO000O0 var9 = this.O0000000000(o00000OOO0OO0O);
         O00000OOOOO0O0 var10 = this.O00000000(o00000OOO0OO0O);
         if (!var10.O00000000000O()) {
            var10.O00000000(o00000OOO0OO0O.O00000000("value", "int_value".equals(o00000OOO0OO0O.O000000000()) ? 1.0F : 0.5F));
         }

         var10.O00000000(o0000O00OO0O0, var7, var8, var9, this.O00000000O0O, this.O00000000O0O0);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0OOO o0000O000O0OOO,
      O00000OOO0OO0O o00000OOO0OO0O,
      O00000OOO0O00O o00000OOO0O00O,
      float f,
      float g,
      float h,
      float i,
      float j
   ) {
      if (o00000OOO0OO0O != null && o00000OOO0O00O != null && o00000OOO0O00O.O00000000000O() && !(j <= 0.01F)) {
         O0000O00000 var10 = o0000O000O0OOO.O000000000000();
         ColorScheme var11 = o0000O000O0OOO.O0000000000000();
         float var12 = f + 6.0F * this.O0000000000OO;
         float var13 = g + (i + 4.0F) * this.O0000000000OO;
         float var14 = Math.max(1.0F, h - 12.0F * this.O0000000000OO);
         float var15 = Math.max(1.0F, 120.0F * this.O0000000000OO * j);
         float var16 = Math.max(var10.O00000000(5.0F), 8.0F * this.O0000000000OO);
         o0000O00OO0O0.O00000000(var12, var13, var14, var15, var16, ColorScheme.O00000000(5, 7, 12, Math.round(156.0F * j)));
         o0000O00OO0O0.O00000000(var12, var13, var14, var15, var16, ColorScheme.O00000000(var11.O000000000O0(), Math.round(62.0F * j)), 0.65F);
         if (!(this.O0000000000OO < 0.6F) && !(var15 < 14.0F)) {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O00000000(var12, var13, var14, var15, var16, var16, var16, var16);
            boolean var19 = false /* VF: Semaphore variable */;

            try {
               var19 = true;
               this.O00000000000OO
                  .O00000000(
                     this.O0000000000O0,
                     o00000OOO0OO0O.O00000000(),
                     this.O00000000000O,
                     o0000O00OO0O0,
                     var12,
                     var13,
                     var14,
                     var15,
                     this.O000000000OO00(),
                     this.O000000000OO0O(),
                     var11,
                     j
                  );
               var19 = false;
            } finally {
               if (var19) {
                  o0000O00OO0O0.O0000000000();
                  o0000O00OO0O0.O0000000000000();
               }
            }

            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }
   }

   private O00000OOOOO0O0 O00000000(O00000OOO0OO0O o00000OOO0OO0O) {
      return this.O0000000O0O00
         .computeIfAbsent(
            o00000OOO0OO0O.O00000000(),
            string -> "int_value".equals(o00000OOO0OO0O.O000000000()) ? O00000OOOOO0O0.O00000000(-64.0F, 64.0F) : O00000OOOOO0O0.O00000000(-12.0F, 12.0F)
         );
   }

   private static boolean O000000000000O(String string) {
      return "float_value".equals(string) || "int_value".equals(string);
   }

   private static float O00000000(O00000OOO0OO0O o00000OOO0OO0O, float f) {
      return "int_value".equals(o00000OOO0OO0O.O000000000()) ? Math.round(f) : f;
   }

   private O00000OOOOO0O0 O000000000(O00000OOO0OO0O o00000OOO0OO0O) {
      return this.O0000000O0O000.computeIfAbsent(o00000OOO0OO0O.O00000000(), string -> O00000OOOOO0O0.O00000000());
   }

   private void O000000000O() {
      if (this.O0000000O0O0O != null) {
         O00000OOOOO0O0 var1 = this.O0000000O0O00.get(this.O0000000O0O0O);
         if (var1 != null) {
            if (var1.O000000000000()) {
               var1.O00000000000O0();
            }

            O00000OOO0OO0O var2 = this.O0000000000O0.O0000000000(this.O0000000O0O0O);
            if (var2 != null) {
               var2.O000000000("value", O00000000(var2, var1.O0000000000()));
               this.O0000000000O0.O0000000000000();
            }
         }

         this.O0000000O0O0O = null;
      }
   }

   private void O000000000O0() {
      if (this.O0000000O0O0O0 != null) {
         O00000OOOOO0O0 var1 = this.O0000000O0O000.get(this.O0000000O0O0O0);
         if (var1 != null) {
            if (var1.O000000000000()) {
               var1.O00000000000O0();
            }

            O00000OOO0OO0O var2 = this.O0000000000O0.O0000000000(this.O0000000O0O0O0);
            if (var2 != null) {
               var2.O000000000("name", var1.O00000000000());
               this.O0000000000O0.O0000000000000();
            }
         }

         this.O0000000O0O0O0 = null;
      }
   }

   private void O000000000O00() {
      if (this.O0000000O0O0OO != null) {
         O00000OOOOO0O0 var1 = this.O0000000O0O00O.get(this.O0000000O0O0OO);
         if (var1 != null) {
            if (var1.O000000000000()) {
               var1.O00000000000O0();
            }

            this.O00000000000O(this.O0000000O0O0OO);
         }

         this.O0000000O0O0OO = null;
      }
   }

   private void O00000000000O(String string) {
      if (string != null) {
         int var2 = string.indexOf(58);
         if (var2 > 0 && var2 < string.length() - 1) {
            O00000OOO0OO0O var3 = this.O0000000000O0.O0000000000(string.substring(0, var2));
            O00000OOOOO0O0 var4 = this.O0000000O0O00O.get(string);
            if (var3 != null && var4 != null) {
               String var5 = string.substring(var2 + 1);
               if ("name".equals(var5)) {
                  var3.O000000000("name", var4.O00000000000());
               } else {
                  var3.O000000000(var5, var4.O0000000000());
                  this.O00000000(var3, var5);
               }

               this.O0000000000O0.O0000000000000();
            }
         }
      }
   }

   private void O00000000(O00000OOO0OO0O o00000OOO0OO0O, String string) {
      if (o00000OOO0OO0O != null) {
         if ("step".equals(string)) {
            o00000OOO0OO0O.O000000000("step", Math.max(1.0E-4F, o00000OOO0OO0O.O00000000("step", 0.01F)));
         } else {
            float var3 = o00000OOO0OO0O.O00000000("min", 0.0F);
            float var4 = o00000OOO0OO0O.O00000000("max", 1.0F);
            if (var4 <= var3) {
               if ("min".equals(string)) {
                  o00000OOO0OO0O.O000000000("max", var3 + 0.001F);
               } else {
                  o00000OOO0OO0O.O000000000("min", var4 - 0.001F);
               }
            }
         }
      }
   }

   private boolean O00000000(O0000O000O0O0 o0000O000O0O0, O0000O00000 o0000O00000, int i, float f, float g) {
      O00000OOO000O0 var6 = this.O000000000(o0000O00000);
      if (!var6.contains(f, g)) {
         this.O0000000O0O = false;
      }

      if (this.O00000000000(o0000O00000, i).contains(f, g)) {
         o0000O000O0O0.O000000000O0O0(false);
         this.O000000000OOO0();
         return true;
      } else if (var6.contains(f, g)) {
         this.O0000000O0O = true;
         this.O0000000O0O0 = System.currentTimeMillis();
         return true;
      } else if (this.O00000000(o0000O00000).contains(f, g)) {
         this.O00000000OO0 = !this.O00000000OO0;
         this.O00000000OO00 = false;
         this.O0000000O000 = false;
         this.O00000000OO000 = false;
         return true;
      } else if (this.O0000000000(o0000O00000).contains(f, g)) {
         this.O00000000OO00 = !this.O00000000OO00;
         this.O00000000OO0 = false;
         this.O0000000O000 = false;
         this.O00000000OO000 = false;
         return true;
      } else if (this.O0000000000000(o0000O00000, i).contains(f, g)) {
         this.O0000000O000 = !this.O0000000O000;
         this.O00000000OO0 = false;
         this.O00000000OO00 = false;
         this.O00000000OO000 = false;
         this.O0000000O0000 = 0.0F;
         return true;
      } else if (this.O000000000000(o0000O00000, i).contains(f, g)) {
         this.O00000000OO000 = !this.O00000000OO000;
         this.O00000000OO0 = false;
         this.O00000000OO00 = false;
         this.O0000000O000 = false;
         return true;
      } else {
         return false;
      }
   }

   private boolean O00000000(O0000O00000 o0000O00000, int i, float f, float g, int j) {
      O00000OOO000O0 var6 = this.O000000000000(o0000O00000);
      if (j != 0) {
         return var6.contains(f, g);
      } else if (!var6.contains(f, g)) {
         this.O00000000OO0 = false;
         return true;
      } else {
         for (int var7 = 0; var7 < O000000000.length; var7++) {
            if (this.O0000000000(var6, o0000O00000, var7).contains(f, g)) {
               if (var7 == 0) {
                  this.O0000000000O0O();
               } else if (var7 == 1) {
                  this.O00000000O000O();
               } else if (var7 == 2) {
                  this.O00000000O00O();
               } else if (var7 == 3) {
                  this.O00000000O0000();
               } else if (var7 == 4) {
                  this.O0000000000OO();
               } else if (var7 == 5) {
                  this.O00000000O000();
               }

               return true;
            }
         }

         return true;
      }
   }

   private boolean O000000000(O0000O00000 o0000O00000, int i, int j, float f, float g, int k) {
      O00000OOO000O0 var7 = this.O00000000000(o0000O00000, i, j);
      if (k != 0) {
         return var7.contains(f, g);
      } else if (!var7.contains(f, g)) {
         this.O00000000OO00 = false;
         return false;
      } else {
         O00000OOOO00O[] var8 = O00000OOOO00O.O0000000000O0O();

         for (int var9 = 0; var9 < var8.length; var9++) {
            O00000OOO000O0 var10 = this.O00000000000(var7, o0000O00000, var9);
            if (var10.contains(f, g)) {
               if (O00000OOOO0O00.O00000000().O000000000000(var8[var9]) && this.O00000000(var10, o0000O00000).contains(f, g)) {
                  this.O00000000(var8[var9]);
                  return true;
               }

               this.O0000000000(var8[var9]);
               return true;
            }
         }

         String[] var11 = new String[]{"Host Rectangle", "Inset Shape", "Full Quad"};

         for (int var12 = 0; var12 < var11.length; var12++) {
            if (this.O000000000000(var7, o0000O00000, var12).contains(f, g)) {
               this.O000000000OOOO();
               this.O00000000OO0O0 = var11[var12];
               this.O00000000O0O();
               this.O0000000000O0.O0000000000000();
               this.O00000000000O.O00000000(this.O00000000OO);
               this.O00000000000O.O00000000(this.O0000000000O0);
               this.O0000000000OO(this.O00000000OO0O0);
               return true;
            }
         }

         return true;
      }
   }

   private boolean O000000000(O0000O00000 o0000O00000, int i, float f, float g, int j) {
      O00000OOO000O0 var6 = this.O000000000000O(o0000O00000, i);
      if (j != 0) {
         return var6.contains(f, g);
      } else if (!var6.contains(f, g)) {
         this.O00000000OO000 = false;
         return false;
      } else {
         O00000OOO000OO.W292[] var7 = O00000OOO000OO.W292.values();

         for (int var8 = 0; var8 < var7.length; var8++) {
            if (this.O0000000000000(var6, o0000O00000, var8).contains(f, g)) {
               this.O00000000OO0OO = var7[var8];
               this.O0000000000OO("theme " + this.O00000000OO0OO.O00000000());
               return true;
            }
         }

         return true;
      }
   }

   private boolean O0000000000(O0000O00000 o0000O00000, int i, int j, float f, float g, int k) {
      if (k != 0) {
         return true;
      } else {
         O00000OOO000O0 var7 = this.O000000000000(o0000O00000, i, j);
         if (this.O0000000000000(var7, o0000O00000).contains(f, g)) {
            this.O0000000000O00();
            this.O00000000000(this.O00000000OO00O);
            this.O00000000OO0O = false;
            this.O00000000OO00O = null;
            return true;
         } else if (this.O000000000000O(var7, o0000O00000).contains(f, g)) {
            this.O00000000000(this.O00000000OO00O);
            this.O00000000OO0O = false;
            this.O00000000OO00O = null;
            return true;
         } else if (!this.O00000000000O(var7, o0000O00000).contains(f, g) && var7.contains(f, g)) {
            return true;
         } else {
            this.O00000000OO0O = false;
            this.O00000000OO00O = null;
            return true;
         }
      }
   }

   private boolean O00000000000(O0000O00000 o0000O00000, int i, int j, float f, float g, int k) {
      O00000OOO000O0 var7 = this.O00000000(o0000O00000, i, j);
      if (!var7.contains(f, g)) {
         return false;
      } else {
         O00000OOO0OO0O var8 = this.O000000000OO();
         if (var8 == null) {
            this.O000000000O00();
            return true;
         } else {
            O00000OOO0O00O var9 = this.O0000000000000.O00000000(var8.O000000000());
            if (var9 == null) {
               this.O000000000O00();
               return true;
            } else if (k == 0 && var9.O00000000000O() && this.O000000000(var7, o0000O00000).contains(f, g)) {
               this.O00000000000OO(var8.O00000000());
               return true;
            } else if (k != 0) {
               return true;
            } else if ("float_value".equals(var8.O000000000())) {
               return this.O00000000(var8, "value", -12.0F, 12.0F, 0.01F, 0.5F, var7, o0000O00000, 0, f, g, k);
            } else if ("int_value".equals(var8.O000000000())) {
               return this.O00000000(var8, "value", -64.0F, 64.0F, 1.0F, 1.0F, var7, o0000O00000, 0, f, g, k);
            } else {
               if ("exposed_float".equals(var8.O000000000())) {
                  if (this.O00000000(var8, "name", var7, o0000O00000, 0, f, g, k)) {
                     return true;
                  }

                  float var10 = var8.O00000000("min", 0.0F);
                  float var11 = var8.O00000000("max", 1.0F);
                  if (var11 <= var10) {
                     var11 = var10 + 0.001F;
                  }

                  if (this.O00000000(var8, "value", var10, var11, var8.O00000000("step", 0.01F), 0.5F, var7, o0000O00000, 1, f, g, k)) {
                     return true;
                  }

                  if (this.O00000000(var8, "min", -128.0F, 128.0F, 0.01F, 0.0F, var7, o0000O00000, 2, f, g, k)) {
                     return true;
                  }

                  if (this.O00000000(var8, "max", -128.0F, 128.0F, 0.01F, 1.0F, var7, o0000O00000, 3, f, g, k)) {
                     return true;
                  }

                  if (this.O00000000(var8, "step", 1.0E-4F, 16.0F, 0.001F, 0.01F, var7, o0000O00000, 4, f, g, k)) {
                     return true;
                  }
               }

               if ("exposed_color".equals(var8.O000000000())) {
                  if (this.O00000000(var8, "name", var7, o0000O00000, 0, f, g, k)) {
                     return true;
                  }

                  if (this.O00000000(var8, "r", 0.0F, 1.0F, 0.01F, 1.0F, var7, o0000O00000, 1, f, g, k)) {
                     return true;
                  }

                  if (this.O00000000(var8, "g", 0.0F, 1.0F, 0.01F, 1.0F, var7, o0000O00000, 2, f, g, k)) {
                     return true;
                  }

                  if (this.O00000000(var8, "b", 0.0F, 1.0F, 0.01F, 1.0F, var7, o0000O00000, 3, f, g, k)) {
                     return true;
                  }

                  if (this.O00000000(var8, "a", 0.0F, 1.0F, 0.01F, 1.0F, var7, o0000O00000, 4, f, g, k)) {
                     return true;
                  }
               }

               this.O000000000O00();
               return true;
            }
         }
      }
   }

   private boolean O00000000(
      O00000OOO0OO0O o00000OOO0OO0O, String string, O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000, int i, float f, float g, int j
   ) {
      O00000OOO000O0 var9 = this.O00000000(o00000OOO000O0, o0000O00000, i);
      if (!var9.contains(f, g)) {
         return false;
      } else {
         this.O000000000OOOO();
         this.O000000000O00();
         String var10 = this.O000000000(o00000OOO0OO0O, string);
         O00000OOOOO0O0 var11 = this.O0000000000O00(var10);
         var11.O00000000(o00000OOO0OO0O.O00000000(string, this.O0000000000000(o00000OOO0OO0O)));
         if (var11.O00000000(f, g, j, var9)) {
            this.O0000000O0O0OO = var10;
         }

         return true;
      }
   }

   private boolean O00000000(
      O00000OOO0OO0O o00000OOO0OO0O,
      String string,
      float f,
      float g,
      float h,
      float i,
      O00000OOO000O0 o00000OOO000O0,
      O0000O00000 o0000O00000,
      int j,
      float k,
      float l,
      int m
   ) {
      O00000OOO000O0 var13 = this.O00000000(o00000OOO000O0, o0000O00000, j);
      if (!var13.contains(k, l)) {
         return false;
      } else {
         this.O000000000OOOO();
         this.O000000000O00();
         String var14 = this.O000000000(o00000OOO0OO0O, string);
         O00000OOOOO0O0 var15 = this.O00000000(var14, f, g, h);
         var15.O00000000(o00000OOO0OO0O.O00000000(string, i));
         if (var15.O00000000(k, l, m, var13)) {
            this.O0000000O0O0OO = var14;
         }

         return true;
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0OOO o0000O000O0OOO, O00000OOO0OO0O o00000OOO0OO0O, O00000OOO0O00O o00000OOO0O00O, float f, float g
   ) {
      O0000O00000 var7 = o0000O000O0OOO.O000000000000();
      ColorScheme var8 = o0000O000O0OOO.O0000000000000();
      O00000OOOO0000 var9 = O00000OOOO0000.O00000000();
      boolean var10 = var9.O00000000(o0000O00OO0O0, this.O0000000OOO, this.O0000000OOO0);
      int var11 = this.O00000000(var8) ? ColorScheme.O00000000(255, 255, 255, 245) : ColorScheme.O00000000(8, 10, 16, 240);

      for (int var12 = 0; var12 < o00000OOO0O00O.O000000000000().size(); var12++) {
         O00000OOO0O0OO var13 = o00000OOO0O00O.O000000000000().get(var12);
         float var15 = g + this.O00000000(var12) * this.O0000000000OO;
         float var16 = this.O00000000(o00000OOO0OO0O.O00000000(), var13.id(), O00000OOO0O0O0.INPUT, f, var15);
         float[] var17 = this.O00000000(f, var15, var16);
         float var14 = var17[0];
         var15 = var17[1];
         int var18 = this.O00000000(var13, var8);
         if (var10) {
            float var19 = Math.max(3.4F, 4.6F * this.O0000000000OO) + 3.4F * var16;
            float var20 = Math.max(1.8F, 2.1F * this.O0000000000OO);
            var9.O00000000(
               o0000O00OO0O0, var14, var15, var19, var20, var18, var11, var16, O000000000(o00000OOO0OO0O.O00000000().hashCode() * 0.0031F + var12 * 0.173F)
            );
         } else {
            if (var16 > 0.001F) {
               o0000O00OO0O0.O00000000(
                  var14 - 5.0F * this.O0000000000OO,
                  var15 - 5.0F * this.O0000000000OO,
                  10.0F * this.O0000000000OO,
                  10.0F * this.O0000000000OO,
                  5.0F * this.O0000000000OO,
                  var7.O00000000(14.0F) * var16,
                  var7.O00000000(2.0F),
                  ColorScheme.O00000000(var18, Math.round(132.0F * var16))
               );
            }

            o0000O00OO0O0.O000000000(var14, var15, Math.max(3.4F, 4.6F * this.O0000000000OO) + 3.4F * var16, 0.0F, 1.0F, var18);
            o0000O00OO0O0.O000000000(var14, var15, Math.max(1.8F, 2.1F * this.O0000000000OO), 0.0F, 1.0F, var11);
         }

         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var7,
            FontRegistry.O00000000,
            var14 + 10.0F * this.O0000000000OO,
            var15 - 6.3F * this.O0000000000OO,
            8.5F * this.O0000000000OO / Math.max(0.001F, var7.O000000000()),
            var13.label(),
            this.O0000000000(var8)
         );
      }

      for (int var21 = 0; var21 < o00000OOO0O00O.O0000000000000().size(); var21++) {
         O00000OOO0O0OO var22 = o00000OOO0O00O.O0000000000000().get(var21);
         float var23 = f + o00000OOO0O00O.O00000000000() * this.O0000000000OO;
         float var26 = g + this.O00000000(var21) * this.O0000000000OO;
         float var28 = this.O00000000(o00000OOO0OO0O.O00000000(), var22.id(), O00000OOO0O0O0.OUTPUT, var23, var26);
         float[] var29 = this.O00000000(var23, var26, var28);
         var23 = var29[0];
         var26 = var29[1];
         int var30 = this.O00000000(var22, var8);
         if (var10) {
            float var31 = Math.max(3.4F, 4.6F * this.O0000000000OO) + 3.4F * var28;
            float var33 = Math.max(1.8F, 2.1F * this.O0000000000OO);
            var9.O00000000(
               o0000O00OO0O0,
               var23,
               var26,
               var31,
               var33,
               var30,
               var11,
               var28,
               O000000000(o00000OOO0OO0O.O00000000().hashCode() * 0.0047F + var21 * 0.191F + 0.41F)
            );
         } else {
            if (var28 > 0.001F) {
               o0000O00OO0O0.O00000000(
                  var23 - 5.0F * this.O0000000000OO,
                  var26 - 5.0F * this.O0000000000OO,
                  10.0F * this.O0000000000OO,
                  10.0F * this.O0000000000OO,
                  5.0F * this.O0000000000OO,
                  var7.O00000000(14.0F) * var28,
                  var7.O00000000(2.0F),
                  ColorScheme.O00000000(var30, Math.round(132.0F * var28))
               );
            }

            o0000O00OO0O0.O000000000(var23, var26, Math.max(3.4F, 4.6F * this.O0000000000OO) + 3.4F * var28, 0.0F, 1.0F, var30);
            o0000O00OO0O0.O000000000(var23, var26, Math.max(1.8F, 2.1F * this.O0000000000OO), 0.0F, 1.0F, var11);
         }

         float var32 = O0000O00000OO.O00000000(var7, FontRegistry.O00000000, var22.label(), 8.5F * this.O0000000000OO / Math.max(0.001F, var7.O000000000()));
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var7,
            FontRegistry.O00000000,
            var23 - 10.0F * this.O0000000000OO - var32,
            var26 - 6.3F * this.O0000000000OO,
            8.5F * this.O0000000000OO / Math.max(0.001F, var7.O000000000()),
            var22.label(),
            this.O0000000000(var8)
         );
      }

      if (var10) {
         var9.O000000000();
      }
   }

   private float O00000000(String string, String string2, O00000OOO0O0O0 o00000OOO0O0O0, float f, float g) {
      float var6 = (float)Math.hypot(this.O00000000O0O - f, this.O00000000O0O0 - g);
      float var7 = var6 <= Math.max(18.0F, 22.0F * this.O0000000000OO) ? 1.0F : 0.0F;
      String var8 = string + "." + string2 + "." + o00000OOO0O0O0.name();
      return this.O0000000OO.computeIfAbsent(var8, stringx -> new O0000O000O00O(0.0F)).O00000000(var7, O0000O000O0O00.O00000000000OO());
   }

   private float[] O00000000(float f, float g, float h) {
      float var4 = this.O00000000O0O - f;
      float var5 = this.O00000000O0O0 - g;
      float var6 = (float)Math.hypot(var4, var5);
      if (!(var6 <= 0.001F) && !(h <= 0.001F)) {
         float var7 = Math.min(5.5F * this.O0000000000OO, var6 * 0.22F) * h;
         return new float[]{f + var4 / var6 * var7, g + var5 / var6 * var7};
      } else {
         return new float[]{f, g};
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, ColorScheme o0000O000O0OO, int i, int j, float f) {
      HashMap var6 = new HashMap();
      Map var7 = this.O000000000O0O0();
      float var8 = this.O0000000OO0.O00000000(0.0F, O0000O000O0O00.O00000000000O0());
      O00000OOOO0O0O var9 = O00000OOOO0O0O.O00000000();
      if (var9.O00000000(o0000O00OO0O0, i, j, f)) {
         for (O00000OOO0OO0 var11 : this.O0000000000O0.O00000000000()) {
            O00000OOO000OO.W297 var12 = this.O00000000(var11.O00000000(), var11.O000000000(), O00000OOO0O0O0.OUTPUT);
            O00000OOO000OO.W297 var13 = this.O00000000(var11.O0000000000(), var11.O00000000000(), O00000OOO0O0O0.INPUT);
            if (var12 != null && var13 != null) {
               O00000OOO0O0OO var14 = this.O000000000(var11.O00000000(), var11.O000000000(), O00000OOO0O0O0.OUTPUT);
               O00000OOO0O0OO var15 = this.O000000000(var11.O0000000000(), var11.O00000000000(), O00000OOO0O0O0.INPUT);
               O00000OOO000OO.W298 var16 = this.O00000000(var11.O00000000(), var11.O000000000(), var14, var15, o0000O000O0OO);
               int var17 = this.O00000000(var11.O00000000(), var6);
               Integer var18 = (Integer)var7.get(O00000000(var11));
               float var19 = var18 == null ? -1.0F : O000000000(var18.intValue() * 0.105F + O000000000(var11) * 0.019F);
               this.O00000000(
                  var9,
                  var12.x,
                  var12.y,
                  var13.x,
                  var13.y,
                  var16.a(),
                  var16.b(),
                  false,
                  var19,
                  var8,
                  var17,
                  this.O00000000000O0(var11.O00000000()),
                  this.O00000000000O0(var11.O0000000000())
               );
            }
         }

         var9.O000000000();
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, ColorScheme o0000O000O0OO, int i, int j, float f) {
      if (this.O00000000O00O0 != null && this.O00000000O00OO != null) {
         O00000OOO000OO.W297 var7 = this.O00000000(this.O00000000O00O0, this.O00000000O00OO, O00000OOO0O0O0.OUTPUT);
         if (var7 == null) {
            this.O0000000OO00OO = false;
         } else {
            float var8 = o0000O000O0O0.O0000000O();
            float var9 = o0000O000O0O0.O0000000O0();
            if (!this.O0000000OO00OO) {
               this.O0000000OO00O = var8;
               this.O0000000OO00O0 = var9;
               this.O0000000OO00OO = true;
            } else {
               float var10 = Math.max(0.001F, Math.min(0.05F, O0000O000O00O.O00000000()));
               float var11 = 1.0F - (float)Math.exp(-24.0F * var10);
               this.O0000000OO00O = this.O0000000OO00O + (var8 - this.O0000000OO00O) * var11;
               this.O0000000OO00O0 = this.O0000000OO00O0 + (var9 - this.O0000000OO00O0) * var11;
            }

            O00000OOO0O0OO var15 = this.O000000000(this.O00000000O00O0, this.O00000000O00OO, O00000OOO0O0O0.OUTPUT);
            O00000OOO000OO.W298 var16 = this.O00000000(this.O00000000O00O0, this.O00000000O00OO, var15, o0000O000O0OO, 0);
            int var12 = var16.a();
            int var13 = ColorScheme.O00000000(var16.b(), 190);
            O00000OOOO0O0O var14 = O00000OOOO0O0O.O00000000();
            if (var14.O00000000(o0000O00OO0O0, i, j, f)) {
               this.O00000000(
                  var14,
                  var7.x,
                  var7.y,
                  this.O0000000OO00O,
                  this.O0000000OO00O0,
                  var12,
                  var13,
                  true,
                  -1.0F,
                  1.0F,
                  0,
                  this.O00000000000O0(this.O00000000O00O0),
                  1.0F
               );
               var14.O000000000();
            }
         }
      } else {
         this.O0000000OO00OO = false;
      }
   }

   private void O00000000(
      O00000OOOO0O0O o00000OOOO0O0O, float f, float g, float h, float i, int j, int k, boolean bl, float l, float m, int n, float o, float p
   ) {
      float var14 = Math.abs(h - f);
      float var15 = O000000000((Math.abs(this.O0000000OO00) + Math.abs(this.O0000000OO000)) * 0.012F, 0.0F, 1.0F);
      float var16 = Math.max(78.0F * this.O0000000000OO, var14 * (0.44F + 0.14F * m + var15 * 0.075F + Math.min(0.08F, n * 0.008F)));
      float var17 = bl ? O000000000((Math.abs(this.O00000000O0O00) + Math.abs(this.O00000000O0O0O)) * 6.0E-4F, 0.0F, 1.0F) : 0.0F;
      float var18 = 1.2F + m * 0.2F + (bl ? 0.34F : 0.0F) + var17 * 0.12F + var15 * 0.08F;
      boolean var19 = bl || l >= 0.0F;
      float var20 = l >= 0.0F ? 0.118F + m * 0.036F + var15 * 0.02F + Math.min(0.028F, n * 0.002F) : 0.0F;
      float var21 = this.O0000000OO00 * O000000000(o, 0.0F, 1.0F);
      float var22 = this.O0000000OO000 * O000000000(o, 0.0F, 1.0F);
      float var23 = this.O0000000OO00 * O000000000(p, 0.0F, 1.0F);
      float var24 = this.O0000000OO000 * O000000000(p, 0.0F, 1.0F);
      o00000OOOO0O0O.O00000000(f, g, h, i, var16, j, k, var18, var19, var20, l, var21, var22, var23, var24);
   }

   private float O00000000000O0(String string) {
      if (string == null || this.O000000000OO == null) {
         return 0.0F;
      } else if (string.equals(this.O000000000OO)) {
         return 1.0F;
      } else {
         return this.O000000000OOOO.containsKey(string) ? 0.92F : 0.0F;
      }
   }

   private O0000O00O0O0OO O000000000O000() {
      return new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O0000O00O0O0O0.O00000000(2.4F, 0.72F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F);
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, int k, float l, O0000O00000 o0000O00000) {
      float var10 = O000000000(l, 0.0F, 1.0F);
      o0000O00OO0O0.O00000000(
         f, g, h, i, j, o0000O00000.O00000000(15.0F) * var10, o0000O00000.O00000000(2.2F), ColorScheme.O00000000(k, Math.round(96.0F * var10))
      );
      o0000O00OO0O0.O00000000(
         f, g, h, i, j, o0000O00000.O00000000(30.0F) * var10, o0000O00000.O00000000(6.0F), ColorScheme.O00000000(k, Math.round(36.0F * var10))
      );
   }

   private void O000000000(float f, float g) {
      this.O000000000O = true;
      this.O000000000O0 = f;
      this.O000000000O00 = g;
      this.O000000000O000 = this.O0000000000O00;
      this.O000000000O00O = this.O0000000000O0O;
      this.O000000000O0O = 0.0F;
      this.O000000000O0O0 = 0.0F;
      this.O000000000O0OO = System.nanoTime();
   }

   private void O0000000000(float f, float g) {
      long var3 = System.nanoTime();
      float var5 = Math.max(0.001F, Math.min(0.05F, (float)(var3 - this.O000000000O0OO) / 1.0E9F));
      this.O000000000O0O = (this.O0000000000O00 - f) / var5;
      this.O000000000O0O0 = (this.O0000000000O0O - g) / var5;
      this.O000000000O0OO = var3;
   }

   private void O000000000O00O() {
      if (!this.O000000000O && !this.O0000000OO0O0O) {
         float var1 = O0000O000O00O.O00000000();
         if (Math.abs(this.O000000000O0O) < 0.01F && Math.abs(this.O000000000O0O0) < 0.01F) {
            this.O000000000O0O = 0.0F;
            this.O000000000O0O0 = 0.0F;
         } else {
            this.O0000000000O00 = this.O0000000000O00 + this.O000000000O0O * var1;
            this.O0000000000O0O = this.O0000000000O0O + this.O000000000O0O0 * var1;
            float var2 = (float)Math.exp(-8.8F * var1);
            this.O000000000O0O *= var2;
            this.O000000000O0O0 *= var2;
         }
      }
   }

   private void O000000000O0O() {
      float var1 = Math.max(0.001F, Math.min(0.05F, O0000O000O00O.O00000000()));
      boolean var2 = this.O000000000OO != null;
      float var3 = var2 ? O000000000(this.O00000000O0O00 * 0.018F, -42.0F, 42.0F) : 0.0F;
      float var4 = var2 ? O000000000(this.O00000000O0O0O * 0.018F, -42.0F, 42.0F) : 0.0F;
      float var5 = (var3 - this.O0000000OO00) * 82.0F - this.O0000000OO0000 * 15.5F;
      float var6 = (var4 - this.O0000000OO000) * 82.0F - this.O0000000OO000O * 15.5F;
      this.O0000000OO0000 += var5 * var1;
      this.O0000000OO000O += var6 * var1;
      this.O0000000OO00 = this.O0000000OO00 + this.O0000000OO0000 * var1;
      this.O0000000OO000 = this.O0000000OO000 + this.O0000000OO000O * var1;
      if (!var2
         && Math.abs(this.O0000000OO00) < 0.01F
         && Math.abs(this.O0000000OO000) < 0.01F
         && Math.abs(this.O0000000OO0000) < 0.01F
         && Math.abs(this.O0000000OO000O) < 0.01F) {
         this.O0000000OO00 = 0.0F;
         this.O0000000OO000 = 0.0F;
         this.O0000000OO0000 = 0.0F;
         this.O0000000OO000O = 0.0F;
      }
   }

   private void O000000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, ColorScheme o0000O000O0OO, int i, int j, float f) {
      O00000OOOO00.O00000000()
         .O00000000(
            o0000O00OO0O0,
            i,
            j,
            this.O0000000000O00,
            this.O0000000000O0O,
            this.O0000000000OO,
            o0000O000O0O0.O0000000O(),
            o0000O000O0O0.O0000000O0(),
            0.95F,
            f,
            o0000O000O0OO,
            this.O00000000(o0000O000O0OO)
         );
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O000O0OOO o0000O000O0OOO, ColorScheme o0000O000O0OO) {
      if (this.O00000000O00) {
         O0000O00000 var4 = o0000O000O0OOO.O000000000000();
         float var5 = Math.min(this.O00000000O000, this.O00000000O000O);
         float var6 = Math.min(this.O00000000O0000, this.O00000000O00O);
         float var7 = Math.abs(this.O00000000O000O - this.O00000000O000);
         float var8 = Math.abs(this.O00000000O00O - this.O00000000O0000);
         if (!(var7 < 1.0F) && !(var8 < 1.0F)) {
            float var9 = var4.O00000000(6.0F);
            o0000O00OO0O0.O00000000(var5, var6, var7, var8, var9, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 24));
            o0000O00OO0O0.O00000000(var5, var6, var7, var8, var9, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 150), 0.9F);
            o0000O00OO0O0.O00000000(
               var5, var6, var7, var8, var9, var4.O00000000(14.0F), var4.O00000000(1.0F), ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 34)
            );
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O000O0OOO o0000O000O0OOO, int i, int j) {
      O0000O00000 var5 = o0000O000O0OOO.O000000000000();
      ColorScheme var6 = o0000O000O0OOO.O0000000000000();
      String var7 = "RMB -> Node Browser | Space+LMB / MMB pan | LMB drag select | Shift+D duplicate | Wheel zoom | Ctrl+C/V share | Del erase | Ctrl+Z/Y undo | Ctrl+S save";
      float var8 = O0000O00000OO.O00000000(var5, FontRegistry.O00000000, var7, 9.0F);
      float var9 = (i - var8) * 0.5F;
      float var10 = j - var5.O00000000(20.0F);
      o0000O00OO0O0.O00000000(
         var9 - var5.O00000000(10.0F),
         var10 - var5.O00000000(2.0F),
         var8 + var5.O00000000(20.0F),
         var5.O00000000(18.0F),
         var5.O00000000(8.0F),
         this.O000000000(var6, 188)
      );
      o0000O00OO0O0.O00000000(
         var9 - var5.O00000000(10.0F),
         var10 - var5.O00000000(2.0F),
         var8 + var5.O00000000(20.0F),
         var5.O00000000(18.0F),
         var5.O00000000(8.0F),
         ColorScheme.O00000000(var6.O000000000O0(), 56),
         0.6F
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         var5,
         FontRegistry.O00000000,
         var9,
         var10 - var5.O00000000(2.0F),
         var5.O00000000(18.0F),
         9.0F,
         var7,
         ColorScheme.O00000000(var6.O000000000O(), 200)
      );
   }

   private int O00000000(String string, Map<String, Integer> map) {
      Integer var3 = (Integer)map.get(string);
      if (var3 != null) {
         return var3;
      } else {
         map.put(string, 0);
         int var4 = 0;

         for (O00000OOO0OO0 var6 : this.O0000000000O0.O00000000000()) {
            if (var6.O0000000000().equals(string)) {
               var4 = Math.max(var4, this.O00000000(var6.O00000000(), map) + 1);
            }
         }

         map.put(string, var4);
         return var4;
      }
   }

   private Map<String, Integer> O000000000O0O0() {
      HashMap var1 = new HashMap();
      LinkedHashSet var2 = new LinkedHashSet();

      for (O00000OOO0OO0O var4 : this.O0000000000O0.O0000000000()) {
         if ("output_color".equals(var4.O000000000())) {
            var2.add(var4.O00000000());
         }
      }

      LinkedHashSet var10 = new LinkedHashSet(var2);

      for (int var11 = 0; !var2.isEmpty() && var11 < 256; var11++) {
         LinkedHashSet var5 = new LinkedHashSet();

         for (String var7 : (Set<String>)var2) {
            for (O00000OOO0OO0 var9 : this.O0000000000O0.O00000000000()) {
               if (var9.O0000000000().equals(var7)) {
                  var1.putIfAbsent(O00000000(var9), var11);
                  if (var10.add(var9.O00000000())) {
                     var5.add(var9.O00000000());
                  }
               }
            }
         }

         var2 = var5;
      }

      return var1;
   }

   private static String O00000000(O00000OOO0OO0 o00000OOO0OO0) {
      return o00000OOO0OO0.O000000000000() + ">" + o00000OOO0OO0.O0000000000000();
   }

   private static float O000000000(O00000OOO0OO0 o00000OOO0OO0) {
      int var1 = 17;
      var1 = var1 * 31 + o00000OOO0OO0.O00000000().hashCode();
      var1 = var1 * 31 + o00000OOO0OO0.O000000000().hashCode();
      var1 = var1 * 31 + o00000OOO0OO0.O0000000000().hashCode();
      var1 = var1 * 31 + o00000OOO0OO0.O00000000000().hashCode();
      return (var1 & 1023) / 1023.0F;
   }

   private static float O000000000(float f) {
      return f - (float)Math.floor(f);
   }

   private List<O00000OOO0O00O> O000000000O0OO() {
      ArrayList var1 = new ArrayList<>(this.O0000000000000.O00000000());
      ((List<O00000OOO0O00O>)var1).sort(Comparator.comparing(O00000OOO0O00O::O0000000000).thenComparing(Comparator.comparing(O00000OOO0O00O::O000000000)));
      return var1;
   }

   private O00000OOO0OO0O O00000000000(float f, float g) {
      ArrayList var3 = new ArrayList<>(this.O0000000000O0.O0000000000());

      for (int var4 = var3.size() - 1; var4 >= 0; var4--) {
         O00000OOO0OO0O var5 = (O00000OOO0OO0O)var3.get(var4);
         O00000OOO0O00O var6 = this.O0000000000000.O00000000(var5.O000000000());
         if (var6 != null) {
            float var7 = this.O0000000000(var5.O0000000000());
            float var8 = this.O00000000000(var5.O00000000000());
            float var9 = var6.O00000000000() * this.O0000000000OO;
            float var10 = this.O00000000(var6, var5) * this.O0000000000OO;
            if (f >= var7 && f < var7 + var9 && g >= var8 && g < var8 + var10) {
               return var5;
            }
         }
      }

      return null;
   }

   private O00000OOO0OO0O O000000000000(float f, float g) {
      ArrayList var3 = new ArrayList<>(this.O0000000000O0.O0000000000());

      for (int var4 = var3.size() - 1; var4 >= 0; var4--) {
         O00000OOO0OO0O var5 = (O00000OOO0OO0O)var3.get(var4);
         O00000OOO0O00O var6 = this.O0000000000000.O00000000(var5.O000000000());
         if (var6 != null && var6.O00000000000O()) {
            float var7 = this.O0000000000(var5.O0000000000());
            float var8 = this.O00000000000(var5.O00000000000());
            float var9 = var6.O00000000000() * this.O0000000000OO;
            if (this.O00000000(var6, var7, var8, var9).contains(f, g)) {
               return var5;
            }
         }
      }

      return null;
   }

   private void O00000000000OO(String string) {
      if (string != null) {
         boolean var2 = !Boolean.TRUE.equals(this.O0000000O0OOO0.get(string));
         this.O0000000O0OOO0.put(string, var2);
         this.O0000000000O0(string).O0000000000(var2 ? 1.0F : 0.0F);
         if (var2) {
            this.O0000000000O(string);
         }
      }
   }

   private void O0000000000O(String string) {
      int var2 = 0;

      for (Boolean var4 : this.O0000000O0OOO0.values()) {
         if (Boolean.TRUE.equals(var4)) {
            var2++;
         }
      }

      Iterator var5 = this.O0000000O0OOO0.entrySet().iterator();

      while (var2 > 10 && var5.hasNext()) {
         Entry var6 = (Entry)var5.next();
         if (!((String)var6.getKey()).equals(string) && Boolean.TRUE.equals(var6.getValue())) {
            var6.setValue(false);
            this.O0000000000O0((String)var6.getKey()).O0000000000(0.0F);
            var2--;
         }
      }
   }

   private O00000OOO000OO.W296 O0000000000000(float f, float g) {
      for (O00000OOO0OO0O var4 : this.O0000000000O0.O0000000000()) {
         O00000OOO0O00O var5 = this.O0000000000000.O00000000(var4.O000000000());
         if (var5 != null) {
            for (int var6 = 0; var6 < var5.O000000000000().size(); var6++) {
               O00000OOO0O0OO var7 = var5.O000000000000().get(var6);
               float var8 = this.O0000000000(var4.O0000000000());
               float var9 = this.O00000000000(var4.O00000000000() + this.O00000000(var6));
               if (Math.hypot(f - var8, g - var9) <= Math.max(12.0F, 13.0F * this.O0000000000OO)) {
                  return new O00000OOO000OO.W296(var4.O00000000(), var7.id(), O00000OOO0O0O0.INPUT);
               }
            }

            for (int var10 = 0; var10 < var5.O0000000000000().size(); var10++) {
               O00000OOO0O0OO var11 = var5.O0000000000000().get(var10);
               float var12 = this.O0000000000(var4.O0000000000() + var5.O00000000000());
               float var13 = this.O00000000000(var4.O00000000000() + this.O00000000(var10));
               if (Math.hypot(f - var12, g - var13) <= Math.max(12.0F, 13.0F * this.O0000000000OO)) {
                  return new O00000OOO000OO.W296(var4.O00000000(), var11.id(), O00000OOO0O0O0.OUTPUT);
               }
            }
         }
      }

      return null;
   }

   private O00000OOO000OO.W297 O00000000(String string, String string2, O00000OOO0O0O0 o00000OOO0O0O0) {
      O00000OOO0OO0O var4 = this.O0000000000O0.O0000000000(string);
      if (var4 == null) {
         return null;
      } else {
         O00000OOO0O00O var5 = this.O0000000000000.O00000000(var4.O000000000());
         if (var5 == null) {
            return null;
         } else {
            List var6 = o00000OOO0O0O0 == O00000OOO0O0O0.INPUT ? var5.O000000000000() : var5.O0000000000000();

            for (int var7 = 0; var7 < var6.size(); var7++) {
               if (((O00000OOO0O0OO)var6.get(var7)).id().equals(string2)) {
                  float var8 = o00000OOO0O0O0 == O00000OOO0O0O0.INPUT ? var4.O0000000000() : var4.O0000000000() + var5.O00000000000();
                  return new O00000OOO000OO.W297(this.O0000000000(var8), this.O00000000000(var4.O00000000000() + this.O00000000(var7)));
               }
            }

            return null;
         }
      }
   }

   private int O00000000(String string, String string2, O00000OOO0O0O0 o00000OOO0O0O0, ColorScheme o0000O000O0OO) {
      return this.O00000000(this.O000000000(string, string2, o00000OOO0O0O0), o0000O000O0OO);
   }

   private O00000OOO0O0OO O000000000(String string, String string2, O00000OOO0O0O0 o00000OOO0O0O0) {
      O00000OOO0OO0O var4 = this.O0000000000O0.O0000000000(string);
      if (var4 == null) {
         return null;
      } else {
         O00000OOO0O00O var5 = this.O0000000000000.O00000000(var4.O000000000());
         if (var5 == null) {
            return null;
         } else {
            for (O00000OOO0O0OO var8 : o00000OOO0O0O0 == O00000OOO0O0O0.INPUT ? var5.O000000000000() : var5.O0000000000000()) {
               if (var8.id().equals(string2)) {
                  return var8;
               }
            }

            return null;
         }
      }
   }

   private O00000OOO000OO.W298 O00000000(
      String string, String string2, O00000OOO0O0OO o00000OOO0O0OO, O00000OOO0O0OO o00000OOO0O0OO2, ColorScheme o0000O000O0OO
   ) {
      O00000OOO000OO.W298 var6 = this.O00000000(string, string2, o00000OOO0O0OO, o0000O000O0OO, 0);
      if (o00000OOO0O0OO2 != null && o00000OOO0O0OO != null && o00000OOO0O0OO.type() != o00000OOO0O0OO2.type()) {
         int var7 = ColorScheme.O00000000(this.O00000000(this.O00000000(o00000OOO0O0OO2, o0000O000O0OO), o0000O000O0OO), 246);
         return new O00000OOO000OO.W298(var6.b(), var7);
      } else {
         return var6;
      }
   }

   private O00000OOO000OO.W298 O00000000(String string, String string2, O00000OOO0O0OO o00000OOO0O0OO, ColorScheme o0000O000O0OO, int i) {
      int var6 = ColorScheme.O00000000(this.O00000000(this.O00000000(o00000OOO0O0OO, o0000O000O0OO), o0000O000O0OO), 246);
      if (o00000OOO0O0OO != null && o00000OOO0O0OO.type() == O00000OOO0OO.VEC4 && i <= 10) {
         O00000OOO0OO0O var7 = this.O0000000000O0.O0000000000(string);
         if (var7 == null) {
            return new O00000OOO000OO.W298(var6, var6);
         } else {
            String var8 = var7.O000000000();
            if ("theme_top".equals(var8)) {
               int var11 = ColorScheme.O00000000(this.O00000000(o0000O000O0OO.O000000000O0(), o0000O000O0OO), 246);
               return new O00000OOO000OO.W298(var11, var11);
            } else if ("theme_bottom".equals(var8)) {
               int var10 = ColorScheme.O00000000(this.O00000000(o0000O000O0OO.O000000000O00(), o0000O000O0OO), 246);
               return new O00000OOO000OO.W298(var10, var10);
            } else if ("theme_panel".equals(var8)) {
               int var9 = ColorScheme.O00000000(this.O00000000(o0000O000O0OO.O0000000000000(), o0000O000O0OO), 246);
               return new O00000OOO000OO.W298(var9, var9);
            } else if ("color_ramp".equals(var8) || "color_pulse".equals(var8) || "vec4_mix".equals(var8)) {
               return this.O00000000(string, "a", "b", o0000O000O0OO, i + 1, var6);
            } else if ("color_gradient_map".equals(var8)) {
               return this.O00000000(string, "a", "c", o0000O000O0OO, i + 1, var6);
            } else if ("alpha_blend".equals(var8)
               || "blend_screen".equals(var8)
               || "blend_overlay".equals(var8)
               || "blend_multiply".equals(var8)
               || "blend_add".equals(var8)) {
               return this.O00000000(string, "base", "layer", o0000O000O0OO, i + 1, var6);
            } else if ("glass_surface".equals(var8)) {
               return this.O00000000(string, "tint", o0000O000O0OO, i + 1, var6);
            } else {
               return !"sdf_fill".equals(var8)
                     && !"rim_light".equals(var8)
                     && !"hover_glow".equals(var8)
                     && !"exposure_lift".equals(var8)
                     && !"color_multiply_scalar".equals(var8)
                     && !"color_desaturate".equals(var8)
                     && !"color_invert".equals(var8)
                     && !"color_screen_split".equals(var8)
                     && !"chromatic_aberration".equals(var8)
                     && !"posterize".equals(var8)
                     && !"bloom_lift".equals(var8)
                  ? new O00000OOO000OO.W298(var6, var6)
                  : this.O00000000(string, "color", o0000O000O0OO, i + 1, var6);
            }
         }
      } else {
         return new O00000OOO000OO.W298(var6, var6);
      }
   }

   private O00000OOO000OO.W298 O00000000(String string, String string2, String string3, ColorScheme o0000O000O0OO, int i, int j) {
      O00000OOO000OO.W298 var7 = this.O00000000(string, string2, o0000O000O0OO, i, j);
      O00000OOO000OO.W298 var8 = this.O00000000(string, string3, o0000O000O0OO, i, j);
      return new O00000OOO000OO.W298(var7.a(), var8.b());
   }

   private O00000OOO000OO.W298 O00000000(String string, String string2, ColorScheme o0000O000O0OO, int i, int j) {
      O00000OOO0OO0 var6 = this.O0000000000O0.O000000000(string, string2);
      if (var6 != null) {
         O00000OOO0O0OO var9 = this.O000000000(var6.O00000000(), var6.O000000000(), O00000OOO0O0O0.OUTPUT);
         return this.O00000000(var6.O00000000(), var6.O000000000(), var9, o0000O000O0OO, i);
      } else {
         O00000OOO0O0OO var7 = this.O000000000(string, string2, O00000OOO0O0O0.INPUT);
         int var8 = this.O00000000(var7, o0000O000O0OO, j);
         return new O00000OOO000OO.W298(var8, var8);
      }
   }

   private int O00000000(O00000OOO0O0OO o00000OOO0O0OO, ColorScheme o0000O000O0OO, int i) {
      if (o00000OOO0O0OO != null && o00000OOO0O0OO.type() == O00000OOO0OO.VEC4) {
         String var4 = o00000OOO0O0OO.defaultExpression();
         if (var4 == null) {
            return i;
         } else if (var4.contains("u_AccentTop")) {
            return ColorScheme.O00000000(this.O00000000(o0000O000O0OO.O000000000O0(), o0000O000O0OO), 246);
         } else if (var4.contains("u_AccentBottom")) {
            return ColorScheme.O00000000(this.O00000000(o0000O000O0OO.O000000000O00(), o0000O000O0OO), 246);
         } else if (var4.contains("u_ThemeColors")) {
            return ColorScheme.O00000000(this.O00000000(o0000O000O0OO.O0000000000000(), o0000O000O0OO), 246);
         } else {
            return var4.contains("vec4(1.0") ? ColorScheme.O00000000(this.O00000000(o0000O000O0OO.O000000000O(), o0000O000O0OO), 246) : i;
         }
      } else {
         return i;
      }
   }

   private int O00000000(int i, ColorScheme o0000O000O0OO) {
      int var3 = ColorScheme.O00000000(i, 255);
      float var4 = this.O00000000(o0000O000O0OO) ? 0.02F : 0.16F;
      return ColorScheme.O00000000(var3, o0000O000O0OO.O000000000O(), var4);
   }

   private int O00000000(O00000OOO0O0OO o00000OOO0O0OO, ColorScheme o0000O000O0OO) {
      if (o00000OOO0O0OO == null) {
         return ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 220);
      } else {
         return switch (o00000OOO0O0OO.type()) {
            case FLOAT -> ColorScheme.O00000000(250, 211, 126, 240);
            case VEC2 -> ColorScheme.O00000000(119, 210, 255, 240);
            case VEC3 -> ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), 240);
            case VEC4 -> ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), 240);
            case INT -> ColorScheme.O00000000(155, 255, 61, 240);
         };
      }
   }

   private int O000000000(ColorScheme o0000O000O0OO) {
      return this.O00000000(o0000O000O0OO) ? ColorScheme.O00000000(10, 10, 10, 255) : o0000O000O0OO.O000000000O();
   }

   private int O0000000000(ColorScheme o0000O000O0OO) {
      return this.O00000000(o0000O000O0OO) ? ColorScheme.O00000000(10, 10, 10, 210) : o0000O000O0OO.O0000000000OOO();
   }

   private float O000000000(O00000OOO0O00O o00000OOO0O00O) {
      int var2 = Math.max(o00000OOO0O00O.O000000000000().size(), o00000OOO0O00O.O0000000000000().size());
      float var3 = Math.max(96.0F, 60.0F + var2 * 26.0F);
      return !"float_value".equals(o00000OOO0O00O.O00000000())
            && !"int_value".equals(o00000OOO0O00O.O00000000())
            && !"exposed_float".equals(o00000OOO0O00O.O00000000())
            && !"exposed_color".equals(o00000OOO0O00O.O00000000())
         ? var3
         : var3 + 24.0F;
   }

   private float O00000000(O00000OOO0O00O o00000OOO0O00O, O00000OOO0OO0O o00000OOO0OO0O) {
      float var3 = this.O000000000(o00000OOO0O00O);
      if (o00000OOO0OO0O != null && o00000OOO0O00O.O00000000000O()) {
         O0000O00O0O0OO var4 = this.O0000000000O0(o00000OOO0OO0O.O00000000());
         return var3 + var4.O00000000() * 128.0F;
      } else {
         return var3;
      }
   }

   private O0000O00O0O0OO O0000000000O0(String string) {
      return this.O0000000O0OOOO
         .computeIfAbsent(
            string, stringx -> new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O0000O00O0O0O0.O00000000(2.6F, 0.78F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F)
         );
   }

   private O00000OOO000O0 O00000000(O00000OOO0O00O o00000OOO0O00O, float f, float g, float h) {
      float var5 = Math.max(52.0F * this.O0000000000OO, 0.0F);
      float var6 = Math.max(16.0F * this.O0000000000OO, 0.0F);
      return new O00000OOO000O0(f + h - var5 - 10.0F * this.O0000000000OO, g + 12.0F * this.O0000000000OO, var5, var6);
   }

   private float O00000000(int i) {
      return 64.0F + i * 26.0F;
   }

   private float O0000000000(float f) {
      return this.O0000000000O00 + f * this.O0000000000OO;
   }

   private float O00000000000(float f) {
      return this.O0000000000O0O + f * this.O0000000000OO;
   }

   private float O000000000000(float f) {
      return (f - this.O0000000000O00) / Math.max(0.001F, this.O0000000000OO);
   }

   private float O0000000000000(float f) {
      return (f - this.O0000000000O0O) / Math.max(0.001F, this.O0000000000OO);
   }

   private O00000OOO000O0 O000000000(O0000O00000 o0000O00000, int i) {
      return new O00000OOO000O0(o0000O00000.O00000000(42.0F), o0000O00000.O00000000(106.0F), o0000O00000.O00000000(232.0F), i - o0000O00000.O00000000(148.0F));
   }

   private O00000OOO000O0 O0000000000(O0000O00000 o0000O00000, int i) {
      return this.O0000000O0
         ? new O00000OOO000O0(o0000O00000.O00000000(42.0F), o0000O00000.O00000000(106.0F), o0000O00000.O00000000(28.0F), o0000O00000.O00000000(28.0F))
         : new O00000OOO000O0(
            o0000O00000.O00000000(42.0F) + o0000O00000.O00000000(232.0F) - o0000O00000.O00000000(34.0F),
            o0000O00000.O00000000(106.0F),
            o0000O00000.O00000000(28.0F),
            o0000O00000.O00000000(28.0F)
         );
   }

   private O00000OOO000O0 O00000000(O0000O00000 o0000O00000, int i, int j) {
      float var4 = Math.min(o0000O00000.O00000000(342.0F), Math.max(o0000O00000.O00000000(286.0F), i * 0.25F));
      float var5 = Math.min(o0000O00000.O00000000(292.0F), Math.max(o0000O00000.O00000000(220.0F), j * 0.3F));
      return new O00000OOO000O0(i - var4 - o0000O00000.O00000000(42.0F), o0000O00000.O00000000(104.0F), var4, var5);
   }

   private O00000OOO000O0 O00000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000, int i) {
      float var4 = o0000O00000.O00000000(27.0F);
      float var5 = o00000OOO000O0.y() + o0000O00000.O00000000(74.0F) + i * var4;
      float var6 = o00000OOO000O0.x() + o0000O00000.O00000000(90.0F);
      return new O00000OOO000O0(var6, var5, o00000OOO000O0.w() - o0000O00000.O00000000(104.0F), o0000O00000.O00000000(20.0F));
   }

   private O00000OOO000O0 O000000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000) {
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o00000OOO000O0.w() - o0000O00000.O00000000(108.0F),
         o00000OOO000O0.y() + o0000O00000.O00000000(14.0F),
         o0000O00000.O00000000(92.0F),
         o0000O00000.O00000000(22.0F)
      );
   }

   private O00000OOO0OO0O O000000000OO() {
      this.O0000000000O();
      return this.O000000000OO0O == null ? null : this.O0000000000O0.O0000000000(this.O000000000OO0O);
   }

   private String O000000000(O00000OOO0OO0O o00000OOO0OO0O, String string) {
      return o00000OOO0OO0O.O00000000() + ":" + string;
   }

   private O00000OOOOO0O0 O00000000(String string, float f, float g, float h) {
      O00000OOOOO0O0 var5 = this.O0000000O0O00O.computeIfAbsent(string, stringx -> O00000OOOOO0O0.O00000000(f, g));
      var5.O000000000(f, g);
      float var6 = Math.max(2.0E-4F, Math.min(1.0F, Math.abs(h) * 1.8F));
      var5.O0000000000(var6, var6 * 0.1F);
      return var5;
   }

   private O00000OOOOO0O0 O0000000000O00(String string) {
      return this.O0000000O0O00O.computeIfAbsent(string, stringx -> O00000OOOOO0O0.O00000000());
   }

   private O00000OOO000O0 O0000000000(O00000OOO0OO0O o00000OOO0OO0O) {
      O00000OOO0O00O var2 = this.O0000000000000.O00000000(o00000OOO0OO0O.O000000000());
      if (var2 == null) {
         return new O00000OOO000O0(0.0F, 0.0F, 0.0F, 0.0F);
      } else {
         float var3 = this.O0000000000(o00000OOO0OO0O.O0000000000()) + 14.0F * this.O0000000000OO;
         float var4 = this.O00000000000(o00000OOO0OO0O.O00000000000()) + 78.0F * this.O0000000000OO;
         float var5 = Math.max(1.0F, (var2.O00000000000() - 28.0F) * this.O0000000000OO);
         float var6 = Math.max(1.0F, 18.0F * this.O0000000000OO);
         return new O00000OOO000O0(var3, var4, var5, var6);
      }
   }

   private O00000OOO000O0 O00000000000(O00000OOO0OO0O o00000OOO0OO0O) {
      O00000OOO0O00O var2 = this.O0000000000000.O00000000(o00000OOO0OO0O.O000000000());
      if (var2 == null) {
         return new O00000OOO000O0(0.0F, 0.0F, 0.0F, 0.0F);
      } else {
         float var3 = this.O0000000000(o00000OOO0OO0O.O0000000000()) + 14.0F * this.O0000000000OO;
         float var4 = this.O00000000000(o00000OOO0OO0O.O00000000000()) + 78.0F * this.O0000000000OO;
         float var5 = Math.max(1.0F, (var2.O00000000000() - 28.0F) * this.O0000000000OO);
         float var6 = Math.max(1.0F, 18.0F * this.O0000000000OO);
         return new O00000OOO000O0(var3, var4, var5, var6);
      }
   }

   private O00000OOO000O0 O000000000(O0000O00000 o0000O00000, int i, int j) {
      float var4 = Math.min(o0000O00000.O00000000(340.0F), i * 0.31F);
      float var5 = Math.min(o0000O00000.O00000000(232.0F), j * 0.3F);
      if (!this.O0000000OO0O) {
         this.O0000000OO0O0 = i - var4 - o0000O00000.O00000000(42.0F);
         this.O0000000OO0O00 = j - var5 - o0000O00000.O00000000(42.0F);
         this.O0000000OO0O = true;
      }

      this.O0000000OO0O0 = O000000000(
         this.O0000000OO0O0, o0000O00000.O00000000(24.0F), Math.max(o0000O00000.O00000000(24.0F), i - var4 - o0000O00000.O00000000(24.0F))
      );
      this.O0000000OO0O00 = O000000000(
         this.O0000000OO0O00, o0000O00000.O00000000(94.0F), Math.max(o0000O00000.O00000000(94.0F), j - var5 - o0000O00000.O00000000(24.0F))
      );
      return new O00000OOO000O0(this.O0000000OO0O0, this.O0000000OO0O00, var4, var5);
   }

   private boolean O000000000000(O00000OOO0OO0O o00000OOO0OO0O) {
      return o00000OOO0OO0O != null && ("exposed_float".equals(o00000OOO0OO0O.O000000000()) || "exposed_color".equals(o00000OOO0OO0O.O000000000()));
   }

   private String O0000000000000(O00000OOO0OO0O o00000OOO0OO0O) {
      return o00000OOO0OO0O != null && "exposed_color".equals(o00000OOO0OO0O.O000000000()) ? "Color" : "Radius";
   }

   private boolean O000000000OO0() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      return var1 != null && var1.getWindow() != null ? GLFW.glfwGetKey(var1.getWindow().getHandle(), 32) == 1 : false;
   }

   private int O000000000OO00() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      return var1 != null && var1.getWindow() != null ? Math.max(1, var1.getWindow().getFramebufferWidth()) : 1;
   }

   private int O000000000OO0O() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      return var1 != null && var1.getWindow() != null ? Math.max(1, var1.getWindow().getFramebufferHeight()) : 1;
   }

   private O0000O00000 O000000000OOO() {
      return this.O0000000OO0OOO != null ? this.O0000000OO0OOO : O0000O00000.O00000000(this.O000000000OO00(), this.O000000000OO0O(), O0000O0000.O00000000());
   }

   private O00000OOO000O0 O00000000000(O0000O00000 o0000O00000, int i) {
      float var3 = o0000O00000.O00000000(28.0F);
      return new O00000OOO000O0(
         i - this.O0000000000000(o0000O00000) - o0000O00000.O00000000(74.0F), o0000O00000.O00000000(46.0F), o0000O00000.O00000000(74.0F), var3
      );
   }

   private O00000OOO000O0 O000000000000(O0000O00000 o0000O00000, int i) {
      float var3 = o0000O00000.O00000000(28.0F);
      return new O00000OOO000O0(
         this.O00000000000(o0000O00000, i).x() - o0000O00000.O00000000(10.0F) - o0000O00000.O00000000(96.0F),
         o0000O00000.O00000000(46.0F),
         o0000O00000.O00000000(96.0F),
         var3
      );
   }

   private O00000OOO000O0 O00000000(O0000O00000 o0000O00000) {
      return new O00000OOO000O0(
         o0000O00000.O00000000(34.0F) + o0000O00000.O00000000(200.0F), o0000O00000.O00000000(46.0F), o0000O00000.O00000000(84.0F), o0000O00000.O00000000(28.0F)
      );
   }

   private O00000OOO000O0 O000000000(O0000O00000 o0000O00000) {
      O00000OOO000O0 var2 = this.O00000000(o0000O00000);
      return new O00000OOO000O0(
         var2.x() + var2.w() + o0000O00000.O00000000(10.0F), o0000O00000.O00000000(46.0F), o0000O00000.O00000000(220.0F), o0000O00000.O00000000(28.0F)
      );
   }

   private O00000OOO000O0 O0000000000(O0000O00000 o0000O00000) {
      O00000OOO000O0 var2 = this.O000000000(o0000O00000);
      return new O00000OOO000O0(
         var2.x() + var2.w() + o0000O00000.O00000000(10.0F), o0000O00000.O00000000(46.0F), o0000O00000.O00000000(136.0F), o0000O00000.O00000000(28.0F)
      );
   }

   private O00000OOO000O0 O0000000000000(O0000O00000 o0000O00000, int i) {
      O00000OOO000O0 var3 = this.O000000000000(o0000O00000, i);
      return new O00000OOO000O0(
         var3.x() - o0000O00000.O00000000(10.0F) - o0000O00000.O00000000(110.0F),
         o0000O00000.O00000000(46.0F),
         o0000O00000.O00000000(110.0F),
         o0000O00000.O00000000(28.0F)
      );
   }

   private O00000OOO000O0 O0000000000(O0000O00000 o0000O00000, int i, int j) {
      O00000OOO000O0 var4 = this.O0000000000000(o0000O00000, i);
      float var5 = Math.min(o0000O00000.O00000000(520.0F), Math.max(o0000O00000.O00000000(420.0F), i * 0.3F));
      float var6 = O000000000(var4.x() + var4.w() - var5, o0000O00000.O00000000(42.0F), i - var5 - o0000O00000.O00000000(42.0F));
      float var7 = var4.y() + var4.h() + o0000O00000.O00000000(10.0F);
      float var8 = Math.min(o0000O00000.O00000000(520.0F), Math.max(o0000O00000.O00000000(220.0F), j - var7 - o0000O00000.O00000000(34.0F)));
      return new O00000OOO000O0(var6, var7, var5, var8);
   }

   private O00000OOO000O0 O0000000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000) {
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o0000O00000.O00000000(10.0F),
         o00000OOO000O0.y() + o0000O00000.O00000000(74.0F),
         o00000OOO000O0.w() - o0000O00000.O00000000(20.0F),
         o00000OOO000O0.h() - o0000O00000.O00000000(84.0F)
      );
   }

   private O00000OOO000O0 O000000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000, int i) {
      float var4 = o0000O00000.O00000000(8.0F);
      float var5 = (o00000OOO000O0.w() - o0000O00000.O00000000(20.0F) - var4 * 2.0F) / 3.0F;
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o0000O00000.O00000000(10.0F) + i * (var5 + var4),
         o00000OOO000O0.y() + o0000O00000.O00000000(42.0F),
         var5,
         o0000O00000.O00000000(24.0F)
      );
   }

   private float O00000000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(68.0F);
   }

   private O00000OOO000O0 O00000000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000) {
      float var3 = o0000O00000.O00000000(24.0F);
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o00000OOO000O0.w() - var3 - o0000O00000.O00000000(10.0F), o00000OOO000O0.y() + o0000O00000.O00000000(10.0F), var3, var3
      );
   }

   private O00000OOO000O0 O000000000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000) {
      float var3 = o00000OOO000O0.h() - o0000O00000.O00000000(14.0F);
      float var4 = o0000O00000.O00000000(78.0F);
      return new O00000OOO000O0(o00000OOO000O0.x() + o0000O00000.O00000000(26.0F), o00000OOO000O0.y() + o0000O00000.O00000000(7.0F), var4, var3);
   }

   private O00000OOO000O0 O00000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000, float f) {
      float var4 = o0000O00000.O00000000(48.0F);
      float var5 = o0000O00000.O00000000(24.0F);
      O00000OOO000O0 var6 = this.O000000000(o00000OOO000O0, o0000O00000, f);
      return new O00000OOO000O0(var6.x() - o0000O00000.O00000000(8.0F) - var4, f + o0000O00000.O00000000(14.0F), var4, var5);
   }

   private O00000OOO000O0 O000000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000, float f) {
      float var4 = o0000O00000.O00000000(24.0F);
      return new O00000OOO000O0(o00000OOO000O0.x() + o00000OOO000O0.w() - var4 - o0000O00000.O00000000(18.0F), f + o0000O00000.O00000000(14.0F), var4, var4);
   }

   private O00000OOO000O0 O0000000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000, float f) {
      O00000OOO000O0 var4 = this.O00000000000(o00000OOO000O0, o0000O00000, f);
      float var5 = o0000O00000.O00000000(52.0F);
      return new O00000OOO000O0(var4.x() - o0000O00000.O00000000(8.0F) - var5, f + o0000O00000.O00000000(19.0F), var5, o0000O00000.O00000000(24.0F));
   }

   private O00000OOO000O0 O00000000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000, float f) {
      float var4 = o0000O00000.O00000000(58.0F);
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o00000OOO000O0.w() - var4 - o0000O00000.O00000000(18.0F), f + o0000O00000.O00000000(19.0F), var4, o0000O00000.O00000000(24.0F)
      );
   }

   private O00000OOO000O0 O000000000000(O0000O00000 o0000O00000) {
      O00000OOO000O0 var2 = this.O00000000(o0000O00000);
      float var3 = o0000O00000.O00000000(320.0F);
      return new O00000OOO000O0(var2.x(), var2.y() + var2.h() + o0000O00000.O00000000(10.0F), var3, o0000O00000.O00000000(300.0F));
   }

   private O00000OOO000O0 O0000000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000, int i) {
      float var4 = o0000O00000.O00000000(7.0F);
      float var5 = (o00000OOO000O0.w() - o0000O00000.O00000000(24.0F) - var4) * 0.5F;
      float var6 = o0000O00000.O00000000(28.0F);
      int var7 = i & 1;
      int var8 = i >> 1;
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o0000O00000.O00000000(12.0F) + var7 * (var5 + var4),
         o00000OOO000O0.y() + o0000O00000.O00000000(164.0F) + var8 * (var6 + var4),
         var5,
         var6
      );
   }

   private O00000OOO000O0 O00000000000(O0000O00000 o0000O00000, int i, int j) {
      O00000OOO000O0 var4 = this.O0000000000(o0000O00000);
      float var5 = Math.min(o0000O00000.O00000000(520.0F), i - o0000O00000.O00000000(84.0F));
      float var6 = Math.min(o0000O00000.O00000000(252.0F), j - var4.y() - var4.h() - o0000O00000.O00000000(34.0F));
      float var7 = O000000000(var4.x() + var4.w() - var5, o0000O00000.O00000000(42.0F), i - var5 - o0000O00000.O00000000(42.0F));
      return new O00000OOO000O0(var7, var4.y() + var4.h() + o0000O00000.O00000000(10.0F), var5, var6);
   }

   private O00000OOO000O0 O00000000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000, int i) {
      float var4 = o0000O00000.O00000000(8.0F);
      float var5 = (o00000OOO000O0.w() - o0000O00000.O00000000(24.0F) - var4) * 0.5F;
      float var6 = o0000O00000.O00000000(42.0F);
      int var7 = i & 1;
      int var8 = i >> 1;
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o0000O00000.O00000000(12.0F) + var7 * (var5 + var4),
         o00000OOO000O0.y() + o0000O00000.O00000000(52.0F) + var8 * (var6 + var4),
         var5,
         var6
      );
   }

   private O00000OOO000O0 O000000000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000, int i) {
      float var4 = o0000O00000.O00000000(7.0F);
      float var5 = (o00000OOO000O0.w() - o0000O00000.O00000000(24.0F) - var4 * 2.0F) / 3.0F;
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o0000O00000.O00000000(12.0F) + i * (var5 + var4),
         o00000OOO000O0.y() + o00000OOO000O0.h() - o0000O00000.O00000000(40.0F),
         var5,
         o0000O00000.O00000000(26.0F)
      );
   }

   private O00000OOO000O0 O000000000000O(O0000O00000 o0000O00000, int i) {
      O00000OOO000O0 var3 = this.O000000000000(o0000O00000, i);
      return new O00000OOO000O0(
         var3.x() - o0000O00000.O00000000(150.0F),
         var3.y() + var3.h() + o0000O00000.O00000000(10.0F),
         o0000O00000.O00000000(300.0F),
         o0000O00000.O00000000(236.0F)
      );
   }

   private O00000OOO000O0 O0000000000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000, int i) {
      float var4 = o0000O00000.O00000000(8.0F);
      float var5 = (o00000OOO000O0.w() - o0000O00000.O00000000(32.0F) - var4 * 2.0F) / 3.0F;
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o0000O00000.O00000000(16.0F) + i * (var5 + var4),
         o00000OOO000O0.y() + o0000O00000.O00000000(84.0F),
         var5,
         o0000O00000.O00000000(26.0F)
      );
   }

   private O00000OOO000O0 O000000000000(O0000O00000 o0000O00000, int i, int j) {
      float var4 = o0000O00000.O00000000(430.0F);
      float var5 = o0000O00000.O00000000(148.0F);
      return new O00000OOO000O0((i - var4) * 0.5F, (j - var5) * 0.5F, var4, var5);
   }

   private O00000OOO000O0 O0000000000000(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000) {
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o0000O00000.O00000000(18.0F),
         o00000OOO000O0.y() + o00000OOO000O0.h() - o0000O00000.O00000000(44.0F),
         o0000O00000.O00000000(132.0F),
         o0000O00000.O00000000(30.0F)
      );
   }

   private O00000OOO000O0 O000000000000O(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000) {
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o0000O00000.O00000000(160.0F),
         o00000OOO000O0.y() + o00000OOO000O0.h() - o0000O00000.O00000000(44.0F),
         o0000O00000.O00000000(112.0F),
         o0000O00000.O00000000(30.0F)
      );
   }

   private O00000OOO000O0 O00000000000O(O00000OOO000O0 o00000OOO000O0, O0000O00000 o0000O00000) {
      return new O00000OOO000O0(
         o00000OOO000O0.x() + o00000OOO000O0.w() - o0000O00000.O00000000(118.0F),
         o00000OOO000O0.y() + o00000OOO000O0.h() - o0000O00000.O00000000(44.0F),
         o0000O00000.O00000000(100.0F),
         o0000O00000.O00000000(30.0F)
      );
   }

   private float O0000000000000(O0000O00000 o0000O00000) {
      return o0000O00000.O00000000(64.0F);
   }

   private void O000000000OOO0() {
      this.O00000000OO0 = false;
      this.O00000000OO00 = false;
      this.O00000000OO000 = false;
      this.O00000000OO0O = false;
      this.O0000000O000 = false;
      this.O0000000O0O = false;
   }

   private void O000000000OOOO() {
      try {
         this.O0000000O00OO0.O00000000(this.O00000000O());
      } catch (Throwable var2) {
      }
   }

   private String O00000000O() {
      JSONObject var1 = O00000OOOO0OO0.O000000000(this.O0000000000O0);
      JSONObject var2 = var1.optJSONObject("metadata");
      if (var2 != null) {
         var2.put("updatedAt", 0L);
         var2.put("source", "");
      }

      return var1.toString();
   }

   private void O0000000000O0O(String string) {
      this.O0000000000O0 = O00000OOOO0OO0.O00000000(new JSONObject(string), this.O0000000000000);
      this.O00000000O00OO();
      O00000OOOO00O var2 = O00000OOOO00O.O00000000(this.O0000000000O0.O000000000());
      if (var2 != null && var2 != O00000OOOO00O.PREVIEW_ONLY) {
         this.O00000000OO = var2;
      }

      this.O000000000000(this.O00000000OO);
      this.O00000000000O.O00000000(this.O00000000OO);
      this.O00000000000O.O00000000(this.O0000000000O0);
      this.O00000000000O0();
      this.O0000000O0O00.keySet().removeIf(stringx -> this.O0000000000O0.O0000000000(stringx) == null);
      this.O0000000O0O000.keySet().removeIf(stringx -> this.O0000000000O0.O0000000000(stringx) == null);
      this.O0000000O0O00O.keySet().removeIf(stringx -> {
         int var2x = stringx.indexOf(58);
         String var3 = var2x > 0 ? stringx.substring(0, var2x) : stringx;
         return this.O0000000000O0.O0000000000(var3) == null;
      });
      this.O0000000O0OOO0.keySet().removeIf(stringx -> this.O0000000000O0.O0000000000(stringx) == null);
      this.O0000000O0OOOO.keySet().removeIf(stringx -> this.O0000000000O0.O0000000000(stringx) == null);
      this.O0000000O0O0O = null;
      this.O0000000O0O0O0 = null;
      this.O0000000O0O0OO = null;
      this.O000000000OO = null;
      this.O00000000O00O0 = null;
      this.O00000000O00OO = null;
      if (!this.O0000000000O0.O00000000().O000000000().isBlank()) {
         this.O0000000O00OOO = this.O0000000000O0.O00000000().O000000000();
      }
   }

   private void O00000000O0() {
      try {
         String var1 = this.O0000000O00OO0.O000000000(this.O00000000O());
         if (var1 == null) {
            this.O0000000000OO("nothing to undo");
            return;
         }

         this.O0000000000O0O(var1);
         this.O0000000000OO("undo");
      } catch (Throwable var2) {
         this.O0000000000OO("undo failed");
      }
   }

   private void O00000000O00() {
      try {
         String var1 = this.O0000000O00OO0.O0000000000(this.O00000000O());
         if (var1 == null) {
            this.O0000000000OO("nothing to redo");
            return;
         }

         this.O0000000000O0O(var1);
         this.O0000000000OO("redo");
      } catch (Throwable var2) {
         this.O0000000000OO("redo failed");
      }
   }

   private void O00000000O000() {
      this.O000000000OOOO();
      this.O0000000000O0 = O00000OOO0O0.O00000000(this.O0000000000000);
      this.O0000000O00OOO = O00000OOOOO0.O00000000();
      this.O0000000000O0.O00000000().O00000000(this.O0000000O00OOO, O00000OOOOO000.O000000000000O());
      this.O0000000000O0.O00000000().O00000000(this.O0000000O00OOO);
      this.O0000000000O0.O00000000().O0000000000000("Host Rectangle");
      this.O00000000O00OO();
      this.O000000000000(this.O00000000OO);
      this.O00000000000O0();
      this.O00000000000OO();
      this.O0000000O00O0 = null;
      this.O00000000000O.close();
      this.O0000000O00O0O = this.O0000000000O0.O000000000000();
      this.O000000000000();
      this.O0000000000OO("reset");
   }

   private void O0000000000(O00000OOOO00O o00000OOOO00O) {
      if (o00000OOOO00O != null && o00000OOOO00O != this.O00000000OO) {
         if (this.O0000000000O0 != null && this.O0000000000O0.O000000000000() != this.O0000000O00O0O && !this.O0000000000O0.O0000000000().isEmpty()) {
            this.O00000000OO00O = o00000OOOO00O;
            this.O00000000OO0O = true;
         } else {
            this.O00000000000(o00000OOOO00O);
         }
      }
   }

   private void O00000000000(O00000OOOO00O o00000OOOO00O) {
      if (o00000OOOO00O != null) {
         this.O000000000OOOO();
         this.O00000000OO = o00000OOOO00O;
         this.O000000000000(o00000OOOO00O);
         this.O00000000O0O();
         this.O00000000000O.O00000000(o00000OOOO00O);
         this.O00000000000O.O00000000(this.O0000000000O0);
         this.O0000000000OO(o00000OOOO00O.O000000000());
      }
   }

   private void O000000000(boolean bl) {
      if (!O00000OOOOO00O.O00000000.isEmpty()) {
         int var2 = Math.max(0, Math.min(O00000OOOOO00O.O00000000.size() - 1, this.O00000000OOO));
         this.O000000000OOOO();
         O00000OOOOO00O.W314 var3 = O00000OOOOO00O.O00000000.get(var2);
         O00000OOO0OO00 var4 = O00000OOOOO00O.O00000000(var3, this.O0000000000000);
         if (var4 != null) {
            if (bl) {
               this.O000000000(var4);
               this.O0000000000OO("merged " + var3.O00000000);
            } else {
               this.O0000000000O0 = var4;
               this.O00000000O00OO();
               O00000OOOO00O var5 = O00000OOOO00O.O00000000(this.O0000000000O0.O000000000());
               if (var5 != O00000OOOO00O.PREVIEW_ONLY) {
                  this.O00000000OO = var5;
               }

               this.O0000000O00OOO = this.O0000000000O0.O00000000().O000000000().isBlank() ? var3.O00000000 : this.O0000000000O0.O00000000().O000000000();
               this.O0000000000O0.O00000000().O00000000(this.O0000000O00OOO, O00000OOOOO000.O000000000000O());
               this.O0000000O00O0 = null;
               this.O00000000000O0();
               this.O00000000000OO();
               this.O00000000000O.close();
               this.O00000000000O.O00000000(this.O00000000OO);
               this.O00000000000O.O00000000(this.O0000000000O0);
               this.O0000000000OO0 = 0.78F;
               this.O0000000000OOO.O00000000(0.78F);
               this.O0000000000O00 = 720.0F;
               this.O0000000000O0O = 360.0F;
               this.O0000000O00O0O = -1;
               this.O000000000000();
               this.O0000000000OO("template: " + var3.O00000000);
            }
         }
      }
   }

   private void O000000000(O00000OOO0OO00 o00000OOO0OO00) {
      if (o00000OOO0OO00 != null) {
         HashMap var2 = new HashMap();
         float var3 = this.O000000000OOO().O00000000(80.0F);
         float var4 = this.O000000000OOO().O00000000(80.0F);

         for (O00000OOO0OO0O var6 : o00000OOO0OO00.O0000000000()) {
            O00000OOO0OO0O var7 = this.O0000000000O0.O00000000(var6.O000000000(), var6.O0000000000() + var3, var6.O00000000000() + var4, this.O0000000000000);
            var7.O0000000000000().putAll(var6.O0000000000000());
            var7.O000000000000O().putAll(var6.O000000000000O());
            var2.put(var6.O00000000(), var7.O00000000());
         }

         for (O00000OOO0OO0 var10 : o00000OOO0OO00.O00000000000()) {
            String var11 = (String)var2.get(var10.O00000000());
            String var8 = (String)var2.get(var10.O0000000000());
            if (var11 != null && var8 != null) {
               this.O0000000000O0.O00000000(var11, var10.O000000000(), var8, var10.O00000000000(), this.O0000000000000);
            }
         }

         this.O0000000000O0.O0000000000000();
      }
   }

   private void O00000000O0000() {
      try {
         File var1 = O00000OOOOO000.O00000000().O0000000000();
         if (!var1.exists()) {
            var1.mkdirs();
         }

         Util.getOperatingSystem().open(var1);
         this.O0000000000OO("opened folder");
      } catch (Throwable var2) {
         this.O0000000000OO("open folder failed");
      }
   }

   private String O00000000(long l) {
      return l <= 0L ? "-" : O00000000.format(new Date(l));
   }

   private void O00000000O000O() {
      try {
         this.O000000000000(this.O00000000OO);
         this.O00000000O0O();
         File var1 = O00000OOOOO000.O00000000().O000000000(this.O00000000OO, this.O0000000000O0, this.O0000000000000());
         if (var1 != null) {
            this.O0000000000OO("exported -> " + var1.getName());
         } else {
            this.O0000000000OO("export failed");
         }
      } catch (Throwable var2) {
         this.O0000000000OO("export failed");
      }
   }

   private void O00000000O00O() {
      try {
         List var1 = O00000OOOOO000.O00000000().O000000000000();
         this.O0000000000O.O00000000(var1);
         this.O0000000000OO(var1.isEmpty() ? "no shader files" : "import");
      } catch (Throwable var2) {
         this.O0000000000OO("import failed");
      }
   }

   private void O00000000O00O0() {
      File var1 = this.O0000000000O.O0000000000();
      if (var1 != null) {
         try {
            O00000OOO0OO00 var2 = O00000OOOOO000.O00000000().O00000000(var1, this.O0000000000000);
            if (var2 == null) {
               this.O0000000000OO("import failed");
               return;
            }

            this.O000000000OOOO();
            this.O0000000000O0 = var2;
            this.O00000000O00OO();
            O00000OOOO00O var3 = O00000OOOO00O.O00000000(this.O0000000000O0.O000000000());
            this.O00000000OO = var3 == O00000OOOO00O.PREVIEW_ONLY ? this.O00000000OO : var3;
            this.O000000000000(this.O00000000OO);
            this.O00000000000O.O00000000(this.O00000000OO);
            this.O0000000O00OOO = this.O0000000000O0.O00000000().O000000000().isBlank()
               ? O000000000000(var1.getName().replace(".wifd", "").replace(".json", ""))
               : this.O0000000000O0.O00000000().O000000000();
            this.O00000000000O0();
            this.O00000000000OO();
            this.O0000000O00O0 = null;
            this.O00000000000O.close();
            this.O0000000O00O0O = -1;
            this.O000000000000();
            this.O0000000000OO("imported " + var1.getName());
         } catch (Throwable var4) {
            this.O0000000000OO("import failed");
         }
      }
   }

   private void O000000000000(O00000OOOO00O o00000OOOO00O) {
      if (this.O0000000000O0 != null && o00000OOOO00O != null) {
         this.O0000000000O0.O00000000(o00000OOOO00O.O00000000());
      }
   }

   private void O00000000O00OO() {
      this.O00000000OO0O0 = this.O0000000000O0 != null && this.O0000000000O0.O00000000() != null
         ? this.O0000000000O0.O00000000().O000000000000O()
         : "Host Rectangle";
   }

   private void O00000000O0O() {
      if (this.O0000000000O0 != null && this.O0000000000O0.O00000000() != null) {
         this.O0000000000O0.O00000000().O0000000000000(this.O00000000OO0O0);
      }
   }

   private void O0000000000OO(String string) {
      this.O00000000O0OO0 = string != null && !string.isBlank() ? string : "ready";
      this.O00000000O0OOO = System.currentTimeMillis() + 1500L;
   }

   private void O000000000000O(float f, float g) {
      long var3 = System.nanoTime();
      if (this.O00000000O0OO != 0L) {
         float var5 = Math.max(0.001F, Math.min(0.05F, (float)(var3 - this.O00000000O0OO) / 1.0E9F));
         this.O00000000O0O00 = (f - this.O00000000O0O) / var5;
         this.O00000000O0O0O = (g - this.O00000000O0O0) / var5;
      }

      this.O00000000O0OO = var3;
      this.O00000000O0O = f;
      this.O00000000O0O0 = g;
      if (System.currentTimeMillis() > this.O00000000O0OOO && this.O00000000000O.O000000000().isBlank()) {
         this.O00000000O0OO0 = "ready";
      }
   }

   private static float O000000000000O(float f) {
      float var1 = O000000000(f, 0.0F, 1.0F);
      return var1 * var1 * var1 * (var1 * (var1 * 6.0F - 15.0F) + 10.0F);
   }

   private static float O000000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   @Override
   public void close() {
      this.O00000000000O.close();
      this.O00000000000OO.close();
   }

   record W291(float x, float y) {
   }

   static enum W292 {
      AUTO("Auto"),
      DARK("Dark"),
      LIGHT("Light");

      private final String O00000000;

      private W292(String string2) {
         this.O00000000 = string2;
      }

      String O00000000() {
         return this.O00000000;
      }
   }

   record W293(O00000OOOOO00 slot, int presetIndex) {
   }

   record W294(int type, String category, O00000OOO0O00O def, int count) {
   }

   record W295(O00000OOO000OO.W294 row, boolean star) {
   }

   record W296(String nodeId, String pinId, O00000OOO0O0O0 direction) {
   }

   record W297(float x, float y) {
   }

   record W298(int a, int b) {
   }
}
