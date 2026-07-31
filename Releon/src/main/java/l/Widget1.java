package l;

import fat.releon.Releon;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import org.joml.Matrix4f;

public class Widget1 extends Helper296 {
   private static final float HEADER_HEIGHT_RENDER = 18.0F;
   private static final float HEADER_HEIGHT_INPUT = 20.0F;
   private static final float CONTENT_PADDING_X = 6.0F;
   private static final float CONTENT_PADDING_TOP_RENDER = 4.0F;
   private static final float CONTENT_PADDING_TOP_INPUT = 5.0F;
   private static final float CONTENT_PADDING_BOTTOM_RENDER = 10.0F;
   private static final float CONTENT_PADDING_BOTTOM_INPUT = 11.0F;
   private static final float CONTENT_WIDTH_PADDING = 12.0F;
   private static final float TITLE_LEFT_PADDING = 10.0F;
   private static final float TITLE_TOP_PADDING = 6.0F;
   private static final float TITLE_ICON_RIGHT_PADDING = 10.0F;
   private static final float MODULE_GAP_Y = 2.0F;
   private static final float SCROLL_STEP = 20.0F;
   private static final long SCROLLBAR_HIDE_DELAY_MS = 650L;
   private static final float SCROLLBAR_WIDTH = 3.0F;
   private static final float SCROLLBAR_X_OFFSET = 3.5F;
   private static final float SCROLLBAR_MIN_HANDLE_HEIGHT = 18.0F;
   private static final Map<Helper269, String> CATEGORY_ICONS = Map.of(
      Helper269.COMBAT, "A", Helper269.MOVEMENT, "B", Helper269.RENDER, "C", Helper269.PLAYER, "D", Helper269.MISC, "E"
   );
   private static final Map<Helper269, String> CATEGORY_TITLES = Map.of(
      Helper269.COMBAT, "Combat", Helper269.MOVEMENT, "Movement", Helper269.RENDER, "Visuals", Helper269.PLAYER, "Player", Helper269.MISC, "Other"
   );
   private final Helper269 category;
   private final List<Widget10> modules = new ArrayList<>();
   private float scroll = 0.0F;
   private float smoothedScroll = 0.0F;
   private final Helper467 scrollbarAnimation = new Animation2().method5003(180).method5004(1.0);
   private long lastScrollMs = 0L;

   public Widget1(Helper269 var1) {
      this.category = var1;
      this.method237();
   }

   public void method237() {
      this.modules.clear();
      Releon var1 = Releon.method71();
      if (var1 != null && var1.method17() != null) {
         for (Helper242 var4 : var1.method17().method2314()) {
            if (var4.getCategory() == this.category) {
               this.modules.add(new Widget10(var4));
            }
         }

         this.modules.sort(Comparator.comparing(var0 -> var0.method369().getVisibleName().toLowerCase()));
      }
   }

   private String method238() {
      return CATEGORY_ICONS.getOrDefault(this.category, "");
   }

   private String method239() {
      return CATEGORY_TITLES.getOrDefault(this.category, this.category.method2734());
   }

   private float method240() {
      return this.x + 6.0F;
   }

   private float method241() {
      return this.y + 18.0F + 4.0F;
   }

   private float method242() {
      return this.y + 20.0F + 5.0F;
   }

   private float method243() {
      return this.width - 12.0F;
   }

   private float method244() {
      return this.height - 18.0F - 10.0F;
   }

   private float method245() {
      return this.height - 20.0F - 11.0F;
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      Matrix4f var6 = var5.peek().getPositionMatrix();
      rectangle.method677(
         Helper80.method841(var5, this.x, this.y, this.width, this.height)
            .method826(5.0F)
            .method823(-16777216)
            .method840()
      );
      float var7 = 18.0F;
      String var8 = this.method239();
      String var9 = this.method238();
      int var10 = Widget16.INSTANCE.method2913().method353();
      Helper103.method927(14, Helper101.DEFAULT).method1474(var5, var8, this.x + 10.0F, this.y + 6.0F, var10);
      if (!var9.isEmpty()) {
         float var11 = Helper103.method927(18, Helper101.ICONSCATEGORY).method1479(var9);
         Helper103.method927(18, Helper101.ICONSCATEGORY).method1474(var5, var9, this.x + this.width - 10.0F - var11, this.y + 5.2F, var10);
      }

      float var33 = this.method240();
      float var12 = this.method241();
      float var13 = this.method243();
      float var14 = this.method244();
      Helper140 var15 = Releon.method71().method30();
      var15.method1209(var6, var33, var12, var13, var14);
      String var16 = Widget16.INSTANCE.method2910().method3061();
      boolean var17 = var16 != null && !var16.isEmpty();
      String var18 = var17 ? var16.toLowerCase() : "";
      float var19 = Math.round(this.smoothedScroll);
      float var20 = 0.0F;
      float var21 = 0.0F;

      for (Widget10 var23 : this.modules) {
         if (!var17 || var23.method369().getVisibleName().toLowerCase().contains(var18)) {
            float var24 = var23.method373();
            float var25 = var12 + var20 + var19;
            var23.method294(var33, var25).method1960(var13, var24);
            if (var25 + var24 >= var12 && var25 <= var12 + var14) {
               var23.method246(var1, var2, var3, var4);
            }

            var20 += var24 + 2.0F;
            var21 += var24 + 2.0F;
         }
      }

      var15.method1210();
      float var34 = Math.max(0.0F, (float)Math.ceil(var21 - var14));
      this.scroll = MathHelper.clamp(this.scroll, -var34, 0.0F);
      this.smoothedScroll = Helper147.method1250(2.0, this.smoothedScroll, this.scroll);
      if (var34 > 0.0F) {
         if (System.currentTimeMillis() - this.lastScrollMs > 650L) {
            this.scrollbarAnimation.method4997(Helper450.BACKWARDS);
         }

         float var35 = this.scrollbarAnimation.method5000().floatValue();
         if (var35 <= 0.01F) {
            return;
         }

         float var36 = 3.0F;
         float var37 = this.x + this.width - 3.5F;
         int var28 = MathHelper.clamp((int)(100.0F * var35), 0, 255);
         int var29 = MathHelper.clamp((int)(180.0F * var35), 0, 255);
         rectangle.method677(Helper80.method841(var5, var37, var12, var36, var14).method826(2.0F).method823(new Color(0, 0, 0, 255).getRGB()).method840());
         float var30 = Math.max(18.0F, var14 * (var14 / (var14 + var34)));
         float var31 = -var19 / var34;
         float var32 = var12 + (var14 - var30) * var31;
         rectangle.method677(Helper80.method841(var5, var37, var32, var36, var30).method826(2.0F).method823(new Color(180, 180, 180, 255).getRGB()).method840());
      }
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      float var6 = this.method240();
      float var7 = this.method242();
      float var8 = this.method243();
      float var9 = this.method245();
      if (!Helper147.method1224(var1, var3, var6, var7, var8, var9)) {
         return false;
      } else {
         String var10 = Widget16.INSTANCE.method2910().method3061();
         boolean var11 = var10 != null && !var10.isEmpty();
         String var12 = var11 ? var10.toLowerCase() : "";

         for (Widget10 var14 : this.modules) {
            if ((!var11 || var14.method369().getVisibleName().toLowerCase().contains(var12)) && var14.method285(var1, var3)) {
               return var14.method247(var1, var3, var5);
            }
         }

         return false;
      }
   }

   @Override
   public boolean method248(double var1, double var3, int var5) {
      for (Widget10 var7 : this.modules) {
         var7.method248(var1, var3, var5);
      }

      return false;
   }

   @Override
   public boolean method249(double var1, double var3, double var5) {
      float var7 = this.method240();
      float var8 = this.method242();
      float var9 = this.method243();
      float var10 = this.method245();
      if (!Helper147.method1224(var1, var3, var7, var8, var9, var10)) {
         return false;
      } else {
         this.scroll = (float)(this.scroll + var5 * 20.0);
         this.lastScrollMs = System.currentTimeMillis();
         this.scrollbarAnimation.method4997(Helper450.FORWARDS);

         for (Widget10 var12 : this.modules) {
            var12.method249(var1, var3, var5);
         }

         return true;
      }
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      for (Widget10 var5 : this.modules) {
         if (var5.method250(var1, var2, var3)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean method251(char var1, int var2) {
      for (Widget10 var4 : this.modules) {
         var4.method251(var1, var2);
      }

      return false;
   }
}
