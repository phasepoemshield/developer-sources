package l;

import fat.releon.Releon;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Matrix4f;

public class Widget10 extends Helper296 {
   private final Helper242 module;
   private final List<Widget8> settingComponents = new ArrayList<>();
   private static final float ROW_H = 17.0F;
   private static final float HEADER_TEXT_X = 7.0F;
   private static final float HEADER_TEXT_Y = 5.5F;
   private static final float HEADER_ARROW_X_OFFSET = 12.0F;
   private static final float HEADER_DOTS_WIDTH = 14.0F;
   private static final float HEADER_ARROW_Y = 4.0F;
   private static final float HEADER_RADIUS = 3.0F;
   private static final float OUTLINE_THICKNESS = 1.5F;
   private static final float DIVIDER_MARGIN_X = 5.0F;
   private static final float DIVIDER_HEIGHT = 0.5F;
   private static final float DIVIDER_Y_OFFSET = 2.0F;
   private static final float SETTINGS_TOP_PADDING = 2.0F;
   private static final float SETTINGS_BOTTOM_PADDING = 8.0F;
   private static final float SETTINGS_RENDER_THRESHOLD = 0.65F;
   private static final float BIND_PANEL_H = 40.0F;
   private static final int EXPAND_ANIMATION_MS = 281;
   private boolean expanded = false;
   private boolean bindExpanded = false;
   private boolean binding = false;
   private long lastBindToggleMs = 0L;
   private final Helper467 expandAnimation = new Animation2().method5003(281).method5004(1.0);
   private final Helper467 hoverAnimation = new Animation2().method5003(140).method5004(1.0);
   private final Helper467 bindMarkAnimation = new Animation2().method5003(160).method5004(1.0);

   public Widget10(Helper242 var1) {
      this.module = var1;
      new Helper262().method2699(var1.settings(), this.settingComponents);
      this.expandAnimation.method4997(Helper450.BACKWARDS);
      this.expandAnimation.method4993();
      this.hoverAnimation.method4997(Helper450.BACKWARDS);
      this.hoverAnimation.method4993();
   }

   public Helper242 method369() {
      return this.module;
   }

   private float method370(Widget8 var1) {
      if (var1 instanceof Helper1) {
         return 15.0F;
      } else if (var1 instanceof Helper10) {
         return 15.0F;
      } else if (var1 instanceof Helper17) {
         return 15.0F;
      } else if (var1 instanceof Helper470) {
         return 15.0F;
      } else if (var1 instanceof Helper468) {
         return 20.0F;
      } else if (var1 instanceof Helper21) {
         return 15.0F;
      } else if (var1 instanceof Helper469) {
         return 15.0F;
      } else if (var1 instanceof Helper458) {
         return 15.0F;
      } else {
         return var1 instanceof Helper459 ? 15.0F : 15.0F;
      }
   }

   private float method371() {
      float var1 = 17.0F;
      if (this.expanded) {
         for (Widget8 var3 : this.settingComponents) {
            Supplier var4 = var3.method344().method2703();
            if (var4 == null || (Boolean)var4.get()) {
               var1 += var3.height > 0.0F ? var3.height : this.method370(var3);
            }
         }
      }

      return var1 + 8.0F;
   }

   private float method372() {
      boolean var1 = this.expanded;
      this.expandAnimation.method4997(var1 ? Helper450.FORWARDS : Helper450.BACKWARDS);
      if (this.module.settings().isEmpty()) {
         return 17.0F;
      } else {
         float var3 = this.expandAnimation.method5000().floatValue();
         if (!var1 && var3 <= 0.01F) {
            return 17.0F;
         } else {
            float var2 = this.method371();
            return 17.0F + (var2 - 17.0F) * var3;
         }
      }
   }

   public float method373() {
      return this.method372();
   }

   private boolean method374(Widget8 var1, double var2, double var4) {
      return Helper147.method1224(var2, var4, var1.x, var1.y, var1.width, var1.height);
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      Matrix4f var6 = var5.peek().getPositionMatrix();
      float var7 = 17.0F;
      float var9 = this.method372();
      float var10 = this.expandAnimation.method5000().floatValue();
      boolean var11 = this.expanded;
      boolean var12 = var11 || var10 > 0.65F;
      boolean var13 = Helper147.method1224(var2, var3, this.x, this.y, this.width, var7);
      this.hoverAnimation.method4997(var13 ? Helper450.FORWARDS : Helper450.BACKWARDS);
      float var14 = this.hoverAnimation.method5000().floatValue();
      var14 = Math.max(0.0F, Math.min(1.0F, var14));
      float var15 = this.module.getAnimation().method5000().floatValue();
      var15 = Math.max(0.0F, Math.min(1.0F, var15));
      this.bindMarkAnimation.method4997(this.binding ? Helper450.FORWARDS : Helper450.BACKWARDS);
      float var16 = Math.max(0.0F, Math.min(1.0F, this.bindMarkAnimation.method5000().floatValue()));
      int var17 = Helper133.method1111(var15, -8289392, -6315602);
      int var18 = Widget16.INSTANCE.method2913().method354();
      int var19 = Helper133.method1111(var16, var17, var18);
      int var24 = Helper133.method1111(var15, -7566196, -1);
      Helper103.method927(14, Helper101.DEFAULT).method1474(var5, this.module.getVisibleName(), this.x + 7.0F, this.y + 5.5F + 0.5F, var24);
      float var25 = this.x + this.width - 12.0F - 8.0F;
      float var26 = this.y + 5.5F + 0.5F;
      if (var16 < 0.99F) {
         int var27 = new Color(var17 >> 16 & 0xFF, var17 >> 8 & 0xFF, var17 & 0xFF, Math.max(0, Math.min(255, (int)((1.0F - var16) * 255.0F)))).getRGB();
         Helper103.method927(14, Helper101.DEFAULT).method1474(var5, "...", var25, var26, var27);
      }

      if (var16 > 0.01F) {
         int var35 = new Color(var19 >> 16 & 0xFF, var19 >> 8 & 0xFF, var19 & 0xFF, Math.max(0, Math.min(255, (int)(var16 * 255.0F)))).getRGB();
         Helper103.method927(14, Helper101.DEFAULT).method1474(var5, "?", var25 + 1.0F, var26, var35);
      }

      if (var9 <= var7 + 0.5F) {
         this.height = var7;
      } else if (!var12) {
         this.height = var9;
      } else {
         float var36 = Math.max(0.0F, var9 - (var7 + 2.0F));
         Helper140 var28 = Releon.method71().method30();
         var28.method1209(var6, this.x, this.y + var7, this.width, var7 + 2.0F + var36);
         float var29 = var7 + 2.0F;
         if (this.expanded) {
            for (int var30 = 0; var30 < this.settingComponents.size(); var30++) {
               Widget8 var31 = this.settingComponents.get(var30);
               Supplier var32 = var31.method344().method2703();
               if (var32 == null || (Boolean)var32.get()) {
                  var31.x = this.x - 2.0F;
                  var31.y = this.y + var29;
                  var31.width = this.width + 2.0F;
                  var31.method246(var1, var2, var3, var4);
                  var29 += var31.height > 0.0F ? var31.height : this.method370(var31);
               }
            }
         }

         var28.method1210();
         this.height = var9;
      }
   }

   @Override
   public boolean method285(double var1, double var3) {
      return Helper147.method1224(var1, var3, this.x, this.y, this.width, this.method373());
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      float var6 = 17.0F;
      boolean var7 = Helper147.method1224(var1, var3, this.x, this.y, this.width, var6);
      boolean var8 = this.method375(var1, var3);
      float var9 = this.method372();
      float var10 = this.expandAnimation.method5000().floatValue();
      boolean var11 = this.expanded || this.bindExpanded || var10 > 0.65F;
      if (!this.binding || var5 <= 1 || var8 && var5 == 2) {
         if (var8 && var5 == 2) {
            this.binding = !this.binding;
            this.bindExpanded = false;
            this.expanded = false;
            this.lastBindToggleMs = System.currentTimeMillis();
            return true;
         } else {
            if (var7) {
               if (var5 == 0) {
                  this.module.switchState();
                  return true;
               }

               if (var5 == 1) {
                  if (!this.module.settings().isEmpty()) {
                     this.expanded = !this.expanded;
                     if (this.expanded) {
                        this.bindExpanded = false;
                        this.binding = false;
                     }

                     return true;
                  }

                  return false;
               }
            }

            if (var11 && var9 > var6 + 0.5F && var3 <= this.y + var9 && this.expanded) {
               boolean var12 = false;

               for (Widget8 var14 : this.settingComponents) {
                  Supplier var15 = var14.method344().method2703();
                  if ((var15 == null || (Boolean)var15.get()) && this.method374(var14, var1, var3)) {
                     var12 = true;
                     var14.method247(var1, var3, var5);
                  }
               }

               if (var12) {
                  return true;
               }
            }

            return false;
         }
      } else {
         this.module.setKey(var5);
         this.binding = false;
         this.bindExpanded = false;
         return true;
      }
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      if (this.binding) {
         int var6 = var1 == 261 ? -1 : var1;
         if (var1 == 256) {
            this.binding = false;
            return true;
         } else {
            if (var6 != 344) {
               this.module.setKey(var6);
               this.binding = false;
            }

            return true;
         }
      } else if (this.binding && var1 == 261) {
         this.module.setKey(-1);
         this.binding = false;
         return true;
      } else {
         if (this.expanded && this.method372() > 17.5F) {
            for (Widget8 var5 : this.settingComponents) {
               var5.method250(var1, var2, var3);
            }
         }

         return false;
      }
   }

   private boolean method375(double var1, double var3) {
      float var5 = this.x + this.width - 12.0F - 10.0F;
      float var6 = this.y + 4.0F;
      return Helper147.method1224(var1, var3, var5, var6, 14.0, 13.0);
   }

   @Override
   public boolean method251(char var1, int var2) {
      if (this.expanded && this.method372() > 17.5F) {
         for (Widget8 var4 : this.settingComponents) {
            if (var4.method251(var1, var2)) {
               return true;
            }
         }
      }

      return false;
   }
}
