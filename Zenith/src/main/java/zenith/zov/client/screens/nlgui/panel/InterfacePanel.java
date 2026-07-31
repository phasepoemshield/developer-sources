package zenith.zov.client.screens.nlgui.panel;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zenith.HudElement;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.IReturn;
import zenith.ZenithInternal068;
import zenith.floatHolder_8;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.Interface;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.GuiInterfaceDragElement;
import zenith.zov.client.screens.nlgui.elements.InterfaceSettingsElement;
import zenith.zov.client.screens.nlgui.elements.InterfaceStyleContainerElement;
import zenith.zov.client.screens.nlgui.elements.api.InterfaceElement;
import zenith.zov.client.screens.nlgui.panel.api.ElementPanel;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class InterfacePanel extends ElementPanel {
   private final GetStartTimeHandler animationChangeCategory = new GetStartTimeHandler(200L, 1.0F, IReturn.ListHolder_8);
   private HeightHandler themeTabBounds;
   private HeightHandler hudTabBounds;
   private final Map<InterfacePanel$InterfaceCategory, List<InterfaceElement>> categories = new HashMap<>();
   private InterfacePanel$InterfaceCategory currentCategory = InterfacePanel$InterfaceCategory.THEME;
   private InterfacePanel$InterfaceCategory lastCategory;
   private HeightHandler scissorBounds;
   private float scroll = 0.0F;
   private float scrollTarget = 0.0F;
   private static final float SCROLL_SPEED = 22.0F;
   private static final float SCROLL_SMOOTH = 0.25F;

   public InterfacePanel() {
      this.categories.put(InterfacePanel$InterfaceCategory.THEME, List.of(new InterfaceSettingsElement(), new InterfaceStyleContainerElement()));
      ArrayList arraylist = new ArrayList();

      for (HudElement ii11l1l11lil1i1 : Interface.ll11lIl1IlIl1lI1.IlIIIIllll1l1()) {
         arraylist.add(new GuiInterfaceDragElement(ii11l1l11lil1i1));
      }

      this.categories.put(InterfacePanel$InterfaceCategory.field_443, arraylist);
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
            this.renderHeader(this.lastCategory, font, font1, iiii1ilili1l1l1lilli1liliii, f, 1.0F - f5, f4, f2 + f6);
         }

         if (f5 > 0.0F) {
            float f7 = 8.0F * (1.0F - f5);
            this.renderHeader(this.currentCategory, font, font1, iiii1ilili1l1l1lilli1liliii, f, f5, f4, f2 + f7);
         }

         this.renderHeaderTabs(iiii1ilili1l1l1lilli1liliii, f, f1, f2, f3);
      }
   }

   private void renderHeader(
      InterfacePanel$InterfaceCategory interfacepanel$interfacecategory,
      Font font,
      Font font1,
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f,
      float f1,
      float f2,
      float f3
   ) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f4 = f1 * f;
         String s = ":";
         float f5 = f3 + (23.0F - font.height()) / 2.0F;
         float f6 = f3 + (23.0F - font1.height()) / 2.0F - 0.1F;
         float f7 = f2 + font1.width(s) + (float)GuiStyle.PADDING.intValue();
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font, "Interface", f7, f5, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font1, s, f2, f6, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4));
      }
   }

   private void renderHeaderTabs(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         Font font = Fonts.NEW_MEDIUM.getFont(4.8F);
         String s = "Theme";
         String s1 = "HUD";
         float f4 = (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f5 = (float)GuiStyle.PADDING.intValue();
         float f6 = font.width(s1);
         float f7 = font.width(s);
         float f8 = f1 + f3 - f4 - f6;
         float f9 = f8 - f5;
         float f10 = f9 - f5 - f7;
         float f11 = f2 + (23.0F - font.height()) / 2.0F;
         this.themeTabBounds = new HeightHandler(f10 - 2.0F, f2 + 1.0F, f7 + 4.0F, 21.0F);
         this.hudTabBounds = new HeightHandler(f8 - 2.0F, f2 + 1.0F, f6 + 4.0F, 21.0F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            s,
            f10,
            f11,
            (this.currentCategory == InterfacePanel$InterfaceCategory.THEME
                  ? zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  : zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1())
               .ZenithInternal039(f)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f9, f11, 0.5F, 6.0F, zenithstyle.getDisableActiveBg().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            s1,
            f8,
            f11,
            (this.currentCategory == InterfacePanel$InterfaceCategory.field_443
                  ? zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  : zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1())
               .ZenithInternal039(f)
         );
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2) {
      this.scissorBounds = new HeightHandler(f1, f2, 376.0F, 295.5F - (float)(GuiStyle.PADDING * 2));
      this.animationChangeCategory.EventImpl_21(300L);
      List list = this.getFilteredElements(this.currentCategory);
      float f3 = this.getContentHeight(list, this.currentCategory);
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
      floatHolder_8.IIIl1ll1l1Il1II11Ill1Il1l1I = false;
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

      floatHolder_8.IIIl1ll1l1Il1II11Ill1Il1l1I = true;
   }

   private void renderElements(
      List<InterfaceElement> list,
      InterfacePanel$InterfaceCategory interfacepanel$interfacecategory,
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      int i,
      int j,
      float f,
      float f1,
      float f2,
      boolean flag
   ) {
      if (!list.isEmpty()) {
         float f3 = f1 + (float)GuiStyle.PADDING.intValue();
         float f4 = f2 + this.scroll;
         float f5 = (float)GuiStyle.PADDING.intValue();
         int k = interfacepanel$interfacecategory == InterfacePanel$InterfaceCategory.field_443 ? 2 : 1;
         if (k <= 1) {
            int j1 = 0;

            for (InterfaceElement interfaceelement1 : list) {
               try {
                  HeightHandler li1il11i1iilii1iiili111li11 = new HeightHandler(
                     f3, f4, interfaceelement1.getWidth(), interfaceelement1.getHeight()
                  );
                  if (flag) {
                     interfaceelement1.renderPriority(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f3, f4, f);
                  } else if (this.scissorBounds == null || this.scissorBounds.StringHolder_8(li1il11i1iilii1iiili111li11)) {
                     interfaceelement1.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f3, f4, f, j1);
                  }

                  f4 += interfaceelement1.getHeight() + f5;
                  j1++;
               } catch (Exception exception) {
                  exception.printStackTrace();
               }
            }
         } else {
            float f6 = 376.0F - (float)GuiStyle.PADDING.intValue() * 2.0F;
            float f7 = (f6 - f5) / 2.0F;
            float[] afloat = new float[k];
            int l = 0;

            for (InterfaceElement interfaceelement : list) {
               try {
                  int i1 = afloat[0] <= afloat[1] ? 0 : 1;
                  float f8 = f3 + (float)i1 * (f7 + f5);
                  float f9 = f4 + afloat[i1];
                  HeightHandler li1il11i1iilii1iiili111li11x = new HeightHandler(
                     f8, f9, interfaceelement.getWidth(), interfaceelement.getHeight()
                  );
                  if (flag) {
                     interfaceelement.renderPriority(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f8, f9, f);
                  } else if (this.scissorBounds == null || this.scissorBounds.StringHolder_8(li1il11i1iilii1iiili111li11x)) {
                     interfaceelement.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f8, f9, f, l + i1);
                  }

                  afloat[i1] += interfaceelement.getHeight() + f5;
                  l++;
               } catch (Exception exception1) {
                  exception1.printStackTrace();
               }
            }
         }
      }
   }

   @Override
   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      if (this.scissorBounds == null) {
         return false;
      } else {
         List list = this.getFilteredElements(this.currentCategory);

         for (InterfaceElement interfaceelement : list) {
            if (interfaceelement.mouseScrolled(d0, d1, d2, d3)) {
               return true;
            }
         }

         float f = this.scissorBounds.height();
         if (list.isEmpty()) {
            return false;
         } else {
            float f1 = this.getContentHeight(list, this.currentCategory) + (float)GuiStyle.PADDING.intValue();
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

   private float getContentHeight(List<InterfaceElement> list, InterfacePanel$InterfaceCategory interfacepanel$interfacecategory) {
      if (list.isEmpty()) {
         return 0.0F;
      } else if (interfacepanel$interfacecategory == InterfacePanel$InterfaceCategory.field_443) {
         float f1 = (float)GuiStyle.PADDING.intValue();
         float[] afloat = new float[]{0.0F, 0.0F};

         for (InterfaceElement interfaceelement1 : list) {
            int i = afloat[0] <= afloat[1] ? 0 : 1;
            afloat[i] += interfaceelement1.getHeight() + f1;
         }

         float f2 = Math.max(afloat[0], afloat[1]);
         return Math.max(0.0F, f2 - f1);
      } else {
         float f = 0.0F;

         for (InterfaceElement interfaceelement : list) {
            f += interfaceelement.getHeight() + (float)GuiStyle.PADDING.intValue();
         }

         return Math.max(0.0F, f - (float)GuiStyle.PADDING.intValue());
      }
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      try {
         if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
            if (this.themeTabBounds != null && this.themeTabBounds.byteHolder(d0, d1)) {
               this.setCategory(InterfacePanel$InterfaceCategory.THEME);
               return true;
            }

            if (this.hudTabBounds != null && this.hudTabBounds.byteHolder(d0, d1)) {
               this.setCategory(InterfacePanel$InterfaceCategory.field_443);
               return true;
            }
         }

         if (!this.animationChangeCategory.ArrayListHolder()) {
            return false;
         }

         boolean flag = false;
         List list = this.getFilteredElements(this.currentCategory);

         for (InterfaceElement interfaceelement : list) {
            if (interfaceelement.onMousePriorityClicked(d0, d1, ill1iili11ii1l)) {
               flag = true;
            }
         }

         if (flag) {
            return true;
         }

         if (this.scissorBounds == null || !this.scissorBounds.byteHolder(d0, d1)) {
            return false;
         }

         for (InterfaceElement interfaceelement1 : list) {
            if (interfaceelement1.onMouseClicked(d0, d1, ill1iili11ii1l)) {
               return true;
            }
         }
      } catch (Exception exception) {
         exception.printStackTrace();
      }

      return false;
   }

   @Override
   public boolean onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      for (InterfaceElement interfaceelement : this.getFilteredElements(this.currentCategory)) {
         interfaceelement.onMouseReleased(d0, d1, ill1iili11ii1l);
      }

      return super.onMouseReleased(d0, d1, ill1iili11ii1l);
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      for (InterfaceElement interfaceelement : this.getFilteredElements(this.currentCategory)) {
         if (interfaceelement.keyPressed(i, j, k)) {
            return true;
         }
      }

      return super.keyPressed(i, j, k);
   }

   @Override
   public boolean charTyped(char c0, int i) {
      for (InterfaceElement interfaceelement : this.getFilteredElements(this.currentCategory)) {
         if (interfaceelement.charTyped(c0, i)) {
            return true;
         }
      }

      return super.charTyped(c0, i);
   }

   private void setCategory(InterfacePanel$InterfaceCategory interfacepanel$interfacecategory) {
      this.setCategory(interfacepanel$interfacecategory, false);
   }

   private void setCategory(InterfacePanel$InterfaceCategory interfacepanel$interfacecategory, boolean flag) {
      if (flag || this.animationChangeCategory.ArrayListHolder()) {
         if (this.currentCategory != interfacepanel$interfacecategory) {
            this.lastCategory = this.currentCategory;
            this.currentCategory = interfacepanel$interfacecategory;
            this.scrollTarget = 0.0F;
            this.scroll = 0.0F;
            this.animationChangeCategory.EventTarget(0.0F);
            this.animationChangeCategory.ZenithInternal095(1.0F);
         }
      }
   }

   public void openHudElementSettings(HudElement ii11l1l11lil1i1) {
      if (ii11l1l11lil1i1 != null) {
         this.setCategory(InterfacePanel$InterfaceCategory.field_443, true);
         List list = this.categories.get(InterfacePanel$InterfaceCategory.field_443);
         if (list != null && !list.isEmpty()) {
            GuiInterfaceDragElement guiinterfacedragelement = null;

            for (InterfaceElement interfaceelement : list) {
               if (interfaceelement instanceof GuiInterfaceDragElement guiinterfacedragelement1) {
                  boolean flag = guiinterfacedragelement1.getDraggableElement().getName().equals(ii11l1l11lil1i1.getName());
                  guiinterfacedragelement1.setSettingsExpanded(flag);
                  if (flag) {
                     guiinterfacedragelement = guiinterfacedragelement1;
                     break;
                  }
               }
            }

            if (guiinterfacedragelement != null) {
               float[] afloat = this.getHudElementMetrics(list, guiinterfacedragelement);
               if (afloat != null) {
                  float f = this.scissorBounds != null ? this.scissorBounds.height() : 295.5F - (float)GuiStyle.PADDING.intValue() * 2.0F;
                  float f1 = (afloat[0] + afloat[1]) / 2.0F;
                  this.scrollTarget = f / 2.0F - f1;
                  this.scroll = this.scrollTarget;
                  this.clampScroll(afloat[2] + (float)GuiStyle.PADDING.intValue(), f);
               }
            }
         }
      }
   }

   private float[] getHudElementMetrics(List<InterfaceElement> list, GuiInterfaceDragElement guiinterfacedragelement) {
      float f = (float)GuiStyle.PADDING.intValue();
      float[] afloat = new float[]{0.0F, 0.0F};
      float f1 = Float.NaN;
      float f2 = Float.NaN;

      for (InterfaceElement interfaceelement : list) {
         int i = afloat[0] <= afloat[1] ? 0 : 1;
         float f3 = afloat[i];
         if (interfaceelement == guiinterfacedragelement) {
            f1 = f3;
            f2 = f3 + interfaceelement.getHeight();
         }

         afloat[i] += interfaceelement.getHeight() + f;
      }

      if (Float.isFinite(f1) && Float.isFinite(f2)) {
         float f4 = Math.max(afloat[0], afloat[1]);
         if (f4 > 0.0F) {
            f4 -= f;
         }

         f4 = Math.max(0.0F, f4);
         return new float[]{f1, f2, f4};
      } else {
         return null;
      }
   }

   @Override
   public List<InterfaceElement> getElements() {
      return this.getFilteredElements(this.currentCategory);
   }

   private List<InterfaceElement> getFilteredElements(InterfacePanel$InterfaceCategory interfacepanel$interfacecategory) {
      List list = this.categories.get(interfacepanel$interfacecategory);
      if (list != null && !list.isEmpty()) {
         String s = ZenithClient.getInstance().ZenithInternal141().getSearchValue();
         if (s != null && !s.isBlank()) {
            String s1 = s.trim().toLowerCase();
            return list.stream().filter(interfaceelement -> {
               String s3 = interfaceelement.getName();
               return s3 != null && !s3.isBlank() ? s3.toLowerCase().contains(s1) : interfacepanel$interfacecategory == InterfacePanel$InterfaceCategory.THEME;
            }).toList();
         } else {
            return list;
         }
      } else {
         return List.of();
      }
   }

   @Override
   public void close() {
      this.animationChangeCategory.EventTarget(1.0F);
      this.lastCategory = null;
      this.themeTabBounds = null;
      this.hudTabBounds = null;
   }

   public InterfacePanel$InterfaceCategory getCurrentCategory() {
      return this.currentCategory;
   }
}
