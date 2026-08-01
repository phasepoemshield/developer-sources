package zenith.zov.client.screens.nlgui.elements;

import java.util.ArrayList;
import java.util.List;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.HeightHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.api.InterfaceElement;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class InterfaceStyleContainerElement extends InterfaceElement {
   private static final float CONTENT_VIEW_HEIGHT = 120.0F;
   private static final float SCROLL_SPEED = 22.0F;
   private static final float SCROLL_SMOOTH = 0.25F;
   private final List<GuiStyleElement> styleElements;
   private HeightHandler bounds;
   private HeightHandler contentBounds;
   private float scroll = 0.0F;
   private float scrollTarget = 0.0F;

   public InterfaceStyleContainerElement() {
      this.styleElements = new ArrayList<>();

      for (ZenithStyle zenithstyle : ZenithClient.getInstance().floatHolder_3().getStyles()) {
         this.styleElements.add(new GuiStyleElement(zenithstyle));
      }
   }

   @Override
   public String getName() {
      return "";
   }

   @Override
   public float getHeight() {
      return 23.0F + (float)(GuiStyle.PADDING * 2) + 168.0F + (float)(GuiStyle.PADDING * 2);
   }

   @Override
   public float getWidth() {
      return 368.0F;
   }

   @Override
   public void renderPriority(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      if (!this.styleElements.isEmpty()) {
         float f5 = f2 + (float)GuiStyle.PADDING.intValue();
         float f6 = f3 + 23.0F + (float)(GuiStyle.PADDING * 2) + (float)GuiStyle.PADDING.intValue() + this.scroll;
         float f7 = this.getWidth() - (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f8 = (float)GuiStyle.PADDING.intValue();
         float f9 = (f7 - f8) / 2.0F;
         float[] afloat = new float[]{0.0F, 0.0F};

         for (int i = 0; i < this.styleElements.size(); i++) {
            GuiStyleElement guistyleelement = this.styleElements.get(i);
            int j = afloat[0] <= afloat[1] ? 0 : 1;
            float f10 = f5 + (float)j * (f9 + f8);
            float f11 = f6 + afloat[j];
            guistyleelement.renderPriority(iiii1ilili1l1l1lilli1liliii, f, f1, f10, f11, f4);
            afloat[j] += guistyleelement.getHeight() + f8;
         }
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4, int k) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         this.bounds = new HeightHandler(f2, f3, this.getWidth(), 23.0F);
         float f5 = this.bounds.width();
         float f6 = this.getHeight();
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f2,
            f3,
            f5,
            f6,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getSurfaceDisableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f2,
            f3,
            f5,
            23.0F,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getHeaderDisableBackground()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getSurfaceEnableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1(), 1.0F)
               .ZenithInternal039(f4)
         );
         float f7 = f2 + (float)(GuiStyle.PADDING * 2) + 5.0F + (float)GuiStyle.PADDING.intValue();
         Font font = Fonts.NEW_MEDIUM.getFont(6.0F);
         Font font1 = Fonts.NEW_ICONS.getFont(6.0F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            "Styles",
            f7,
            f3 + (23.0F - font.height()) / 2.0F,
            zenithstyle.getTextSecondary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), 1.0F)
               .ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1,
            "O",
            f2 + (float)(GuiStyle.PADDING * 2),
            f3 + (23.0F - font1.height()) / 2.0F,
            ByteBufferHolder.lllIll11l1I11Il1II11II1I11
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), 1.0F)
               .ZenithInternal039(f4)
         );
         this.contentBounds = new HeightHandler(
            f2 + (float)GuiStyle.PADDING.intValue(),
            f3 + 23.0F + (float)(GuiStyle.PADDING * 2) + (float)GuiStyle.PADDING.intValue(),
            f5 - (float)GuiStyle.PADDING.intValue() * 2.0F,
            168.0F
         );
         float f8 = this.getContentHeight();
         this.clampScroll(f8, this.contentBounds.height());
         this.scroll = this.scroll + (float)Math.round((this.scrollTarget - this.scroll) * 0.25F);

         try {
            float f9 = this.contentBounds.Il11lIlllI111I1l1111();
            float f10 = (float)Math.round(this.contentBounds.I1II11l1I11Illl11IIl1l1lIl1II() + this.scroll);
            float f11 = (float)GuiStyle.PADDING.intValue();
            float f12 = (this.contentBounds.width() - f11) / 2.0F;
            float[] afloat = new float[]{0.0F, 0.0F};
            iiii1ilili1l1l1lilli1liliii.ListHolder_6(
               this.contentBounds.Il11lIlllI111I1l1111(),
               this.contentBounds.I1II11l1I11Illl11IIl1l1lIl1II(),
               this.contentBounds.Il11lIlllI111I1l1111() + this.contentBounds.width() + (float)GuiStyle.PADDING.intValue(),
               this.contentBounds.I1II11l1I11Illl11IIl1l1lIl1II() + this.contentBounds.height()
            );

            for (int i = 0; i < this.styleElements.size(); i++) {
               GuiStyleElement guistyleelement = this.styleElements.get(i);
               int j = afloat[0] <= afloat[1] ? 0 : 1;
               float f13 = f9 + (float)j * (f12 + f11);
               float f14 = f10 + afloat[j];
               guistyleelement.render(iiii1ilili1l1l1lilli1liliii, f, f1, f13, f14, f4, i + j);
               afloat[j] += guistyleelement.getHeight() + f11;
            }

            iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
            this.renderScrollIndicator(iiii1ilili1l1l1lilli1liliii, zenithstyle, f4, f8);
         } catch (Exception exception) {
            exception.printStackTrace();
         }
      }
   }

   @Override
   public boolean onMousePriorityClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      boolean flag = false;

      for (GuiStyleElement guistyleelement : this.styleElements) {
         if (guistyleelement.onMousePriorityClicked(d0, d1, ill1iili11ii1l)) {
            flag = true;
         }
      }

      return flag;
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null && this.bounds.byteHolder(d0, d1)) {
         return true;
      } else {
         for (GuiStyleElement guistyleelement : this.styleElements) {
            if (guistyleelement.onMouseClicked(d0, d1, ill1iili11ii1l)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      boolean flag = false;

      for (GuiStyleElement guistyleelement : this.styleElements) {
         if (guistyleelement.mouseScrolled(d0, d1, d2, d3)) {
            flag = true;
         }
      }

      if (flag) {
         return true;
      } else if (this.contentBounds != null && this.contentBounds.byteHolder(d0, d1)) {
         float f = this.getContentHeight();
         if (f <= this.contentBounds.height()) {
            return false;
         } else {
            this.scrollTarget += (float)d3 * 22.0F;
            this.clampScroll(f, this.contentBounds.height());
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      for (GuiStyleElement guistyleelement : this.styleElements) {
         guistyleelement.onMouseReleased(d0, d1, ill1iili11ii1l);
      }

      super.onMouseReleased(d0, d1, ill1iili11ii1l);
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      for (GuiStyleElement guistyleelement : this.styleElements) {
         if (guistyleelement.keyPressed(i, j, k)) {
            return true;
         }
      }

      return super.keyPressed(i, j, k);
   }

   @Override
   public boolean charTyped(char c0, int i) {
      for (GuiStyleElement guistyleelement : this.styleElements) {
         if (guistyleelement.charTyped(c0, i)) {
            return true;
         }
      }

      return super.charTyped(c0, i);
   }

   private void clampScroll(float f, float f1) {
      if (f <= f1) {
         this.scrollTarget = 0.0F;
         this.scroll = 0.0F;
      } else {
         float f2 = f1 - f;
         if (this.scrollTarget < f2) {
            this.scrollTarget = f2;
         }

         if (this.scrollTarget > 0.0F) {
            this.scrollTarget = 0.0F;
         }

         if (this.scroll < f2) {
            this.scroll = f2;
         }

         if (this.scroll > 0.0F) {
            this.scroll = 0.0F;
         }
      }
   }

   private float getContentHeight() {
      if (this.styleElements.isEmpty()) {
         return 0.0F;
      } else {
         float f = (float)GuiStyle.PADDING.intValue();
         float[] afloat = new float[]{0.0F, 0.0F};

         for (GuiStyleElement guistyleelement : this.styleElements) {
            int i = afloat[0] <= afloat[1] ? 0 : 1;
            afloat[i] += guistyleelement.getHeight() + f;
         }

         float f1 = Math.max(afloat[0], afloat[1]);
         return Math.max(0.0F, f1 - f);
      }
   }

   private void renderScrollIndicator(floatHolder_4 iiii1ilili1l1l1lilli1liliii, ZenithStyle zenithstyle, float f, float f1) {
   }
}
