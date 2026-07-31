package zenith.zov.client.screens.nlgui.panel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.Category;
import zenith.IReturn;
import zenith.ZenithInternal068;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.Module;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.NLMenuScreen$ElementsType;
import zenith.zov.client.screens.nlgui.elements.GuiModuleElement;
import zenith.zov.client.screens.nlgui.panel.api.ElementPanel;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class GuiModulePanel extends ElementPanel {
   private final GetStartTimeHandler animationChangeCategory = new GetStartTimeHandler(200L, 1.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler animationEnable = new GetStartTimeHandler(200L, 1.0F, IReturn.ScreenImpl);
   private final Map<Category, List<GuiModuleElement>> categories = new HashMap<>();
   private Category currentCategory = Category.IIII1111111II;
   private Category lastCategory;
   private HeightHandler scissorBounds;
   private float scroll = 0.0F;
   private float scrollTarget = 0.0F;
   private static final float SCROLL_SPEED = 22.0F;
   private static final float SCROLL_SMOOTH = 0.25F;

   public GuiModulePanel() {
      for (Category iill11i1il1ilii11iii1llil1ll : Category.values()) {
         this.categories
            .put(
               iill11i1il1ilii11iii1llil1ll,
               ZenithClient.getInstance()
                  .getModuleManager()
                  .getModules()
                  .stream()
                  .filter(ll111il1lliill11 -> ll111il1lliill11.getCategory() == iill11i1il1ilii11iii1llil1ll)
                  .map(GuiModuleElement::new)
                  .toList()
            );
      }
   }

   @Override
   public void renderHeader(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2, float f3) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f4 = f1 + (float)GuiStyle.PADDING.intValue() + (float)(GuiStyle.PADDING * 2);
         Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
         Font font1 = Fonts.NEW_ICONS.getFont(6.0F);
         float f5 = Math.min(1.0F, this.animationChangeCategory.StringHolder_8(1.0F));
         if (this.lastCategory != null) {
            float f6 = -8.0F * f5;
            this.renderHeader(this.lastCategory, font, font1, iiii1ilili1l1l1lilli1liliii, i, j, f, 1.0F - f5, f4, f2 + f6, f3);
         }

         if (f5 > 0.0F) {
            float f7 = 8.0F * (1.0F - f5);
            this.renderHeader(this.currentCategory, font, font1, iiii1ilili1l1l1lilli1liliii, i, j, f, f5, f4, f2 + f7, f3);
         }
      }
   }

   public void renderHeader(
      Category iill11i1il1ilii11iii1llil1ll,
      Font font,
      Font font1,
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      int i,
      int j,
      float f,
      float f1,
      float f2,
      float f3,
      float f8
   ) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f4 = f1 * f;
         String s = iill11i1il1ilii11iii1llil1ll.getIcon();
         float f5 = f3 + (23.0F - font.height()) / 2.0F;
         float f6 = f3 + (23.0F - font1.height()) / 2.0F - 0.1F;
         float f7 = f2 + font1.width(s) + (float)GuiStyle.PADDING.intValue();
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font, iill11i1il1ilii11iii1llil1ll.getName(), f7, f5, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font1, s, f2, f6, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4));
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2) {
      this.scissorBounds = new HeightHandler(f1, f2, 376.0F, 295.5F - (float)(GuiStyle.PADDING * 2));
      this.animationChangeCategory.EventImpl_21(300L);
      List list = this.getFilteredElements(this.currentCategory);
      float f3 = this.getContentHeight(list, (float)GuiStyle.PADDING.intValue());
      this.clampScroll(f3 + (float)GuiStyle.PADDING.intValue(), this.scissorBounds.height());
      this.scroll = this.scroll + (this.scrollTarget - this.scroll) * 0.25F;
      float f4 = this.animationChangeCategory.StringHolder_8(1.0F);
      if (this.animationChangeCategory.ArrayListHolder()) {
         this.lastCategory = null;
      }

      float f5 = (0.5F - f4) / 0.5F;
      if (f5 < 0.0F) {
         f5 = 0.0F;
      }

      if (f5 > 1.0F) {
         f5 = 1.0F;
      }

      float f6 = (f4 - 0.3F) / 0.7F;
      if (f6 < 0.0F) {
         f6 = 0.0F;
      }

      if (f6 > 1.0F) {
         f6 = 1.0F;
      }

      iiii1ilili1l1l1lilli1liliii.ListHolder_6(f1, f2, f1 + this.scissorBounds.width(), f2 + this.scissorBounds.height());
      if (this.lastCategory != null && f5 > 0.0F) {
         float f7 = f * f5;
         this.renderElements(this.getFilteredElements(this.lastCategory), this.lastCategory, iiii1ilili1l1l1lilli1liliii, i, j, f7, f1, f2, false);
      }

      if (f6 > 0.0F) {
         float f9 = f * f6;
         float f8 = 20.0F * (1.0F - f6);
         this.renderElements(list, this.currentCategory, iiii1ilili1l1l1lilli1liliii, i, j, f9, f1, f2 + f8, false);
         iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
         this.renderElements(list, this.currentCategory, iiii1ilili1l1l1lilli1liliii, i, j, f9, f1, f2 + f8, true);
      } else {
         iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      }
   }

   private void renderElements(
      List<GuiModuleElement> list,
      Category iill11i1il1ilii11iii1llil1ll,
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      int i,
      int j,
      float f,
      float f1,
      float f2,
      boolean flag
   ) {
      if (!list.isEmpty()) {
         ArrayList arraylist = new ArrayList(list.size());

         for (GuiModuleElement guimoduleelement : list) {
            if (guimoduleelement.isPriority()) {
               arraylist.add(guimoduleelement);
            }
         }

         for (GuiModuleElement guimoduleelement2 : list) {
            if (!guimoduleelement2.isPriority()) {
               arraylist.add(guimoduleelement2);
            }
         }

         float f7 = f1 + (float)GuiStyle.PADDING.intValue();
         float f8 = f2 + this.scroll;
         float f3 = 376.0F - (float)(GuiStyle.PADDING * 2);
         float f4 = (float)GuiStyle.PADDING.intValue();
         float f5 = (f3 - f4) / 2.0F;
         byte b0 = 2;
         float[] afloat = new float[b0];
         int k = 0;
         boolean flag1 = false;

         for (GuiModuleElement guimoduleelement1 : arraylist) {
            try {
               int l = 0;

               for (int i1 = 1; i1 < b0; i1++) {
                  if (afloat[i1] < afloat[l]) {
                     l = i1;
                  }
               }

               float f9 = f7 + (float)l * (f5 + f4);
               float f6 = f8 + afloat[l];
               HeightHandler li1il11i1iilii1iiili111li11 = new HeightHandler(
                  f9, f6, guimoduleelement1.getWidth(), guimoduleelement1.getHeight()
               );
               if (flag) {
                  guimoduleelement1.renderPriority(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f9, f6, f);
               } else if (this.scissorBounds.StringHolder_8(li1il11i1iilii1iiili111li11)) {
                  guimoduleelement1.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f9, f6, f, k + l);
               }

               if (guimoduleelement1.isEnable()) {
                  flag1 = true;
               }

               afloat[l] += guimoduleelement1.getHeight() + f4;
               k++;
            } catch (Exception exception) {
               exception.printStackTrace();
            }
         }

         if (iill11i1il1ilii11iii1llil1ll == this.currentCategory) {
            this.animationEnable.ZenithInternal101(flag1);
         }
      }
   }

   @Override
   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      if (this.scissorBounds == null) {
         return false;
      } else {
         List list = this.getFilteredElements(this.currentCategory);

         for (GuiModuleElement guimoduleelement : list) {
            if (guimoduleelement.mouseScrolled(d0, d1, d2, d3)) {
               return true;
            }
         }

         float f = this.scissorBounds.height();
         if (list.isEmpty()) {
            return false;
         } else {
            float f1 = this.getContentHeight(list, (float)GuiStyle.PADDING.intValue()) + (float)GuiStyle.PADDING.intValue();
            if (f1 <= f) {
               return false;
            } else {
               this.scrollTarget = (float)((double)this.scrollTarget + d3 * 22.0);
               this.clampScroll(f1, f);
               return true;
            }
         }
      }
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

   private float getContentHeight(List<GuiModuleElement> list, float f) {
      if (list.isEmpty()) {
         return 0.0F;
      } else {
         ArrayList arraylist = new ArrayList(list.size());

         for (GuiModuleElement guimoduleelement : list) {
            if (guimoduleelement.isPriority()) {
               arraylist.add(guimoduleelement);
            }
         }

         for (GuiModuleElement guimoduleelement2 : list) {
            if (!guimoduleelement2.isPriority()) {
               arraylist.add(guimoduleelement2);
            }
         }

         byte b0 = 2;
         float[] afloat = new float[b0];

         for (GuiModuleElement guimoduleelement1 : arraylist) {
            int i = 0;

            for (int j = 1; j < b0; j++) {
               if (afloat[j] < afloat[i]) {
                  i = j;
               }
            }

            afloat[i] += guimoduleelement1.getHeight() + f;
         }

         float f1 = Math.max(afloat[0], afloat[1]);
         return Math.max(0.0F, f1 - f);
      }
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (!this.animationChangeCategory.ArrayListHolder()) {
         return false;
      } else {
         boolean flag = false;
         List list = this.getFilteredElements(this.currentCategory);

         for (GuiModuleElement guimoduleelement : list) {
            if (guimoduleelement.onMousePriorityClicked(d0, d1, ill1iili11ii1l)) {
               flag = true;
            }
         }

         if (flag) {
            return true;
         } else if (this.scissorBounds != null && this.scissorBounds.byteHolder(d0, d1)) {
            for (GuiModuleElement guimoduleelement1 : list) {
               if (guimoduleelement1.onMouseClicked(d0, d1, ill1iili11ii1l)) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      for (GuiModuleElement guimoduleelement : this.getFilteredElements(this.currentCategory)) {
         guimoduleelement.onMouseReleased(d0, d1, ill1iili11ii1l);
      }

      return super.onMouseReleased(d0, d1, ill1iili11ii1l);
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      for (GuiModuleElement guimoduleelement : this.getFilteredElements(this.currentCategory)) {
         if (guimoduleelement.keyPressed(i, j, k)) {
            return true;
         }
      }

      return super.keyPressed(i, j, k);
   }

   @Override
   public boolean charTyped(char c0, int i) {
      for (GuiModuleElement guimoduleelement : this.getFilteredElements(this.currentCategory)) {
         if (guimoduleelement.charTyped(c0, i)) {
            return true;
         }
      }

      return super.charTyped(c0, i);
   }

   public void setCategory(Category iill11i1il1ilii11iii1llil1ll) {
      if (this.animationChangeCategory.ArrayListHolder()) {
         if (this.currentCategory != iill11i1il1ilii11iii1llil1ll) {
            if (ZenithClient.getInstance().ZenithInternal141().getType() == NLMenuScreen$ElementsType.CATEGORY) {
               this.lastCategory = this.currentCategory;
               this.scrollTarget = 0.0F;
               this.animationChangeCategory.EventTarget(0.0F);
               this.animationChangeCategory.ZenithInternal095(1.0F);
            }

            this.currentCategory = iill11i1il1ilii11iii1llil1ll;

            for (GuiModuleElement guimoduleelement : this.categories.get(iill11i1il1ilii11iii1llil1ll)) {
               guimoduleelement.setPositionInitialized(false);
            }
         }
      }
   }

   @Override
   public List<GuiModuleElement> getElements() {
      return this.getFilteredElements(this.currentCategory);
   }

   private List<GuiModuleElement> getFilteredElements(Category iill11i1il1ilii11iii1llil1ll) {
      List list = this.categories.get(iill11i1il1ilii11iii1llil1ll);
      if (list != null && !list.isEmpty()) {
         String s = ZenithClient.getInstance().ZenithInternal141().getSearchValue();
         if (s == null) {
            return list;
         } else {
            String s1 = s.trim().toLowerCase();
            return s1.isEmpty()
               ? list
               : this.categories
                  .values()
                  .stream()
                  .flatMap(Collection::stream)
                  .filter(guimoduleelement -> guimoduleelement.getName().toLowerCase().contains(s1))
                  .toList();
         }
      } else {
         return Collections.emptyList();
      }
   }

   @Override
   public void close() {
      this.animationChangeCategory.EventTarget(1.0F);
      this.lastCategory = null;
   }

   public Category getCurrentCategory() {
      return this.currentCategory;
   }
}
