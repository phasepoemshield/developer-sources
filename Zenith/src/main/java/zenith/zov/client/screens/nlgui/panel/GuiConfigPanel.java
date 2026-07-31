package zenith.zov.client.screens.nlgui.panel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.ZenithInternal068;
import zenith.HeightHandler;
import zenith.IsPriorityHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.GuiConfigElement;
import zenith.zov.client.screens.nlgui.panel.api.ElementPanel;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class GuiConfigPanel extends ElementPanel {
   private static final float SCROLL_SPEED = 22.0F;
   private static final float SCROLL_SMOOTH = 0.25F;
   private static final int COLUMNS = 3;
   private static final long CONFIG_SYNC_INTERVAL_MS = 700L;
   private final List<GuiConfigElement> elements = new ArrayList<>();
   private HeightHandler scissorBounds;
   private float scroll = 0.0F;
   private float scrollTarget = 0.0F;
   private long lastConfigSyncAt;
   private String lastConfigSignature = "";

   @Override
   public void renderHeader(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2, float f7) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f3 = f1 + (float)GuiStyle.PADDING.intValue() + (float)GuiStyle.PADDING.intValue() * 2.0F;
         Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
         Font font1 = Fonts.NEW_ICONS.getFont(6.0F);
         String s = "9";
         float f4 = f2 + (23.0F - font.height()) / 2.0F;
         float f5 = f2 + (23.0F - font1.height()) / 2.0F - 0.1F;
         float f6 = f3 + font1.width(s) + (float)GuiStyle.PADDING.intValue();
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font, "Configs", f6, f4, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font1, s, f3, f5, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f));
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2) {
      this.syncConfigs();
      this.scissorBounds = new HeightHandler(f1, f2, 376.0F, 295.5F - (float)GuiStyle.PADDING.intValue() * 2.0F);
      List list = this.getFilteredElements();
      float f3 = this.getContentHeight(list, (float)GuiStyle.PADDING.intValue());
      this.clampScroll(f3 + (float)GuiStyle.PADDING.intValue(), this.scissorBounds.height());
      this.scroll = this.scroll + (this.scrollTarget - this.scroll) * 0.25F;
      iiii1ilili1l1l1lilli1liliii.ListHolder_6(f1, f2, f1 + this.scissorBounds.width(), f2 + this.scissorBounds.height());
      this.renderElements(list, iiii1ilili1l1l1lilli1liliii, i, j, f, f1, f2, false);
      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      this.renderElements(list, iiii1ilili1l1l1lilli1liliii, i, j, f, f1, f2, true);
   }

   private void renderElements(
      List<GuiConfigElement> list, floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, int j, float f, float f1, float f2, boolean flag
   ) {
      if (!list.isEmpty()) {
         List list1 = this.getPriorityOrdered(list);
         float f3 = f1 + (float)GuiStyle.PADDING.intValue();
         float f4 = f2 + this.scroll;
         float f5 = 376.0F - (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f6 = (float)GuiStyle.PADDING.intValue();
         float f7 = (f5 - f6 * 2.0F) / 3.0F;
         float[] afloat = new float[3];
         int k = 0;

         for (GuiConfigElement guiconfigelement : list1) {
            int l = 0;

            for (int i1 = 1; i1 < 3; i1++) {
               if (afloat[i1] < afloat[l]) {
                  l = i1;
               }
            }

            float f9 = f3 + (float)l * (f7 + f6);
            float f8 = f4 + afloat[l];
            if (flag) {
               guiconfigelement.renderPriority(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f9, f8, f);
            } else if (this.scissorBounds.byteHolder((double)f9, (double)f8)
               || this.scissorBounds.byteHolder((double)f9, (double)(f8 + guiconfigelement.getHeight()))) {
               guiconfigelement.render(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j, f9, f8, f, k + l);
            }

            afloat[l] += guiconfigelement.getHeight() + f6;
            k++;
         }
      }
   }

   @Override
   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      if (this.scissorBounds == null) {
         return false;
      } else {
         List list = this.getFilteredElements();

         for (GuiConfigElement guiconfigelement : list) {
            if (guiconfigelement.mouseScrolled(d0, d1, d2, d3)) {
               return true;
            }
         }

         if (this.scissorBounds.byteHolder(d0, d1) && !list.isEmpty()) {
            float f = this.scissorBounds.height();
            float f1 = this.getContentHeight(list, (float)GuiStyle.PADDING.intValue()) + (float)GuiStyle.PADDING.intValue();
            if (f1 <= f) {
               return false;
            } else {
               this.scrollTarget += (float)d3 * 22.0F;
               this.clampScroll(f1, f);
               return true;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      List list = this.getFilteredElements();

      for (GuiConfigElement guiconfigelement : list) {
         if (guiconfigelement.onMousePriorityClicked(d0, d1, ill1iili11ii1l)) {
            return true;
         }
      }

      if (this.scissorBounds != null && this.scissorBounds.byteHolder(d0, d1)) {
         for (GuiConfigElement guiconfigelement1 : list) {
            if (guiconfigelement1.onMouseClicked(d0, d1, ill1iili11ii1l)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public boolean onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      for (GuiConfigElement guiconfigelement : this.getFilteredElements()) {
         guiconfigelement.onMouseReleased(d0, d1, ill1iili11ii1l);
      }

      return super.onMouseReleased(d0, d1, ill1iili11ii1l);
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      for (GuiConfigElement guiconfigelement : this.getFilteredElements()) {
         if (guiconfigelement.keyPressed(i, j, k)) {
            return true;
         }
      }

      return super.keyPressed(i, j, k);
   }

   @Override
   public boolean charTyped(char c0, int i) {
      for (GuiConfigElement guiconfigelement : this.getFilteredElements()) {
         if (guiconfigelement.charTyped(c0, i)) {
            return true;
         }
      }

      return super.charTyped(c0, i);
   }

   @Override
   public List<GuiConfigElement> getElements() {
      return this.getFilteredElements();
   }

   @Override
   public void close() {
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

   private float getContentHeight(List<GuiConfigElement> list, float f) {
      if (list.isEmpty()) {
         return 0.0F;
      } else {
         List list1 = this.getPriorityOrdered(list);
         float[] afloat = new float[3];

         for (GuiConfigElement guiconfigelement : list1) {
            int i = 0;

            for (int j = 1; j < 3; j++) {
               if (afloat[j] < afloat[i]) {
                  i = j;
               }
            }

            afloat[i] += guiconfigelement.getHeight() + f;
         }

         float f1 = afloat[0];

         for (int k = 1; k < 3; k++) {
            f1 = Math.max(f1, afloat[k]);
         }

         return Math.max(0.0F, f1 - f);
      }
   }

   private List<GuiConfigElement> getFilteredElements() {
      if (this.elements.isEmpty()) {
         return Collections.emptyList();
      } else {
         String s = ZenithClient.getInstance().ZenithInternal141().getSearchValue();
         if (s != null && !s.isBlank()) {
            String s1 = s.trim().toLowerCase();
            return this.elements.stream().filter(guiconfigelement -> guiconfigelement.getName().toLowerCase().contains(s1)).toList();
         } else {
            return this.elements;
         }
      }
   }

   private List<GuiConfigElement> getPriorityOrdered(List<GuiConfigElement> list) {
      ArrayList arraylist = new ArrayList(list.size());

      for (GuiConfigElement guiconfigelement : list) {
         if (guiconfigelement.isPriority()) {
            arraylist.add(guiconfigelement);
         }
      }

      for (GuiConfigElement guiconfigelement1 : list) {
         if (!guiconfigelement1.isPriority()) {
            arraylist.add(guiconfigelement1);
         }
      }

      return arraylist;
   }

   private void rebuildElements() {
      HashMap hashmap = new HashMap();

      for (GuiConfigElement guiconfigelement : this.elements) {
         hashmap.put(guiconfigelement.getName().toLowerCase(), guiconfigelement);
      }

      ArrayList arraylist1 = new ArrayList();
      List list = ZenithClient.getInstance().ZenithInternal115().StringHolder_29();
      ArrayList arraylist = new ArrayList();

      for (String s : list) {
         String s1 = s.replace("." + "Zenith".toLowerCase(), "").trim();
         if (!s1.isEmpty()) {
            IsPriorityHandler lillllii11iiill11i = ZenithClient.getInstance().ZenithInternal115().GetSettingsHandler(s1);
            if (lillllii11iiill11i != null) {
               String s2 = s1.toLowerCase();
               arraylist.add(s2);
               GuiConfigElement guiconfigelement1 = (GuiConfigElement)hashmap.get(s2);
               arraylist1.add(guiconfigelement1 != null ? guiconfigelement1 : new GuiConfigElement(lillllii11iiill11i, this::rebuildElements));
            }
         }
      }

      this.elements.clear();
      this.elements.addAll(arraylist1);
      Collections.sort(arraylist);
      this.lastConfigSignature = String.join("|", arraylist);
   }

   private void syncConfigs() {
      long i = System.currentTimeMillis();
      if (i - this.lastConfigSyncAt >= 700L) {
         this.lastConfigSyncAt = i;
         List list = ZenithClient.getInstance().ZenithInternal115().StringHolder_29();
         ArrayList arraylist = new ArrayList();

         for (String s : list) {
            String s1 = s.replace("." + "Zenith".toLowerCase(), "").trim();
            if (!s1.isEmpty()) {
               arraylist.add(s1.toLowerCase());
            }
         }

         Collections.sort(arraylist);
         String s2 = String.join("|", arraylist);
         if (!s2.equals(this.lastConfigSignature)) {
            this.rebuildElements();
         }
      }
   }
}
