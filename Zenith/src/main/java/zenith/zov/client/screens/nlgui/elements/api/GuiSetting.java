package zenith.zov.client.screens.nlgui.elements.api;

import zenith.hud.*;

import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.doubleHolder_3;
import zenith.Setting;
import zenith.GetStartTimeHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.base.font.MsdfRenderer;
import zenith.zov.client.screens.nlgui.style.GuiStyle;

public abstract class GuiSetting<T extends Setting> extends Element {
   private static final float MIN_DESC_SCROLL_SPEED = 0.028F;
   private static final float MAX_DESC_SCROLL_SPEED = 0.065F;
   private static final float TARGET_DESC_CHARS_PER_SECOND = 12.0F;
   protected final float width;
   protected final T setting;
   protected final GetStartTimeHandler animationVisible;
   private float scrollOffset = 0.0F;
   private int scrollDirection = 1;
   private long hoverStartTime = -1L;
   private long lastUpdateTime = -1L;
   private long pauseUntilTime = -1L;
   private boolean continueScroll = false;

   protected GuiSetting(float f, T l1i111illi1i1) {
      this.width = f;
      this.setting = (T)l1i111illi1i1;
      this.animationVisible = new GetStartTimeHandler(200L, l1i111illi1i1.isVisible() ? 1.0F : 0.0F, IReturn.ScreenImpl);
   }

   @Override
   public boolean isVisible() {
      return this.animationVisible.CloudFriendInfo() != 0.0F || this.setting.isVisible();
   }

   @Override
   public float getHeight() {
      return this.isShort() ? 7.0F : 14.0F;
   }

   public float getVisibleProgress() {
      return this.animationVisible.CloudFriendInfo();
   }

   public float getAnimHeight() {
      return this.getHeight() * this.animationVisible.CloudFriendInfo();
   }

   public boolean isShort() {
      return this.setting.llllIII11IIl1ll1llI1lII1I().isEmpty()
         || ZenithClient.getInstance().ZenithInternal141().isShortMode();
   }

   public boolean onMousePriorityScroll(double d0, double d1, double d2, double d3) {
      return false;
   }

   public boolean onMousePriorityClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      return false;
   }

   public void renderPriority(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4, float f5) {
   }

   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
   }

   protected void drawDefault(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f,
      float f1,
      String s,
      String s1,
      String s2,
      Font font,
      Font font1,
      float f2,
      float f3,
      float f4,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill2
   ) {
      Font font2 = Fonts.NEW_ICONS.getFont(font.getSize() - 0.5F);
      boolean flag = ZenithClient.getInstance().ZenithInternal141().isRenderIcon();
      float f5 = this.getHeight();
      float f6 = flag ? font2.width(s) + (float)GuiStyle.PADDING.intValue() / 2.0F : 0.0F;
      if (this.isShort()) {
         if (flag) {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(font2, s, f2, f3 + (f5 - font2.height()) / 2.0F, il1iliilli1l1iill2);
         }

         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s1, f2 + f6, f3 + (f5 - font.height()) / 2.0F, il1iliilli1l1iill);
      } else {
         if (flag) {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(font2, s, f2, f3 + (font2.height() / 2.0F - (s.equals("u") ? 0.0F : 0.2F)), il1iliilli1l1iill2);
         }

         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s1, f2 + f6, f3 + 1.1F, il1iliilli1l1iill);
         float f7 = f3 + f5 - font1.height() - 1.0F;
         float f8 = font1.width(s2);
         float f9 = f8 - f4;
         boolean flag1 = doubleHolder_3.StringHolder_8(
            (double)f, (double)f1, (double)f2, (double)(f7 - 3.0F), (double)(f4 + 1.0F), (double)(font1.height() + 10.0F)
         );
         if (f9 <= 1.0F) {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(font1, s2, f2, f7, il1iliilli1l1iill1);
            this.resetDescScroll();
         } else {
            iiii1ilili1l1l1lilli1liliii.ListHolder_6(f2 - 0.5F, f7, f2 + f4 + 2.0F, f7 + font1.height() + 4.0F);
            long i = System.currentTimeMillis();
            if (this.lastUpdateTime == -1L) {
               this.lastUpdateTime = i;
            }

            float f10 = (float)(i - this.lastUpdateTime);
            this.lastUpdateTime = i;
            if (flag1) {
               if (this.hoverStartTime == -1L) {
                  this.hoverStartTime = i;
                  this.pauseUntilTime = i + 300L;
               }

               this.continueScroll = true;
            } else if (this.continueScroll && this.scrollOffset <= 0.0F && this.scrollDirection == 1) {
               this.continueScroll = false;
            }

            if (!flag1 && !this.continueScroll) {
               this.hoverStartTime = -1L;
               this.pauseUntilTime = -1L;
            } else if (this.pauseUntilTime == -1L || i >= this.pauseUntilTime) {
               this.pauseUntilTime = -1L;
               float f11 = f9 + 10.0F;
               float f12 = this.getDescScrollSpeed(f8, s2);
               this.scrollOffset = this.scrollOffset + (float)this.scrollDirection * f12 * f10;
               if (this.scrollOffset >= f11) {
                  this.scrollOffset = f11;
                  this.scrollDirection = -1;
                  this.pauseUntilTime = i + 900L;
               } else if (this.scrollOffset <= 0.0F) {
                  this.scrollOffset = 0.0F;
                  this.scrollDirection = 1;
                  this.pauseUntilTime = i + 300L;
               }
            }

            float f14 = 10.0F;
            float f15 = f4 + this.scrollOffset;
            float f13 = f15 > 0.0F ? (f4 - f14 + this.scrollOffset) / f15 : 1.0F;
            MsdfRenderer.renderText(
               font1.getFont(),
               s2,
               font1.getSize(),
               il1iliilli1l1iill1.lllIlll1Ill111l111Il11II11lII(),
               iiii1ilili1l1l1lilli1liliii.getMatrices().peek().getPositionMatrix(),
               f2 - this.scrollOffset,
               f7,
               0.0F,
               true,
               f13,
               1.0F,
               f15
            );
            iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
         }
      }
   }

   private float getDescScrollSpeed(float f, String s) {
      float f1 = f / (float)Math.max(s.length(), 1);
      float f2 = f1 * 12.0F / 1000.0F;
      return Math.max(0.028F, Math.min(f2, 0.065F));
   }

   private void resetDescScroll() {
      this.scrollOffset = 0.0F;
      this.scrollDirection = 1;
      this.hoverStartTime = -1L;
      this.lastUpdateTime = -1L;
      this.pauseUntilTime = -1L;
      this.continueScroll = false;
   }

   @Override
   public float getWidth() {
      return this.width;
   }

   public T getSetting() {
      return this.setting;
   }
}
