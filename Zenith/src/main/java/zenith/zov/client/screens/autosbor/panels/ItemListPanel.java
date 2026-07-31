package zenith.zov.client.screens.autosbor.panels;

import zenith.hud.*;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.Vector2f;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.doubleHolder;
import zenith.doubleHolder_3;
import zenith.OnMouseClickedHandler;
import zenith.GetStartTimeHandler;
import zenith.GetDisplayNameHandler_2;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.autosbor.AutoSborStyle;

public class ItemListPanel {
   private static final float panelWidth = 128.0F;
   private static final float panelHeight = 23.0F;
   private static final float panelOffset = 4.0F;
   private static final float textOffsetX = 8.0F;
   private static final float searchIconRightOffset = 8.0F;
   private static final float searchIconYOffset = -0.5F;
   private static final float listHeight = 258.0F;
   private static final float itemPanelSize = 23.0F;
   private static final float itemIconSize = 8.0F;
   private static final float itemIconScale = 0.5F;
   private static final float itemOpacity = 0.48F;
   private static final float itemHoverOpacity = 1.0F;
   private static final float titleIconGap = 4.0F;
   private static final float itemStep = 25.0F;
   private static final int columns = 5;
   private static final float listWidth = 123.0F;
   private static final float scrollWidth = 1.0F;
   private static final float scrollGap = 4.0F;
   private static final float scrollHitPadding = 3.0F;
   private static final float minScrollHeight = 20.0F;
   private static final float minScrollStep = 20.0F;
   private static final float maxScrollStep = 60.0F;
   private static final float scrollStepScale = 10.0F;
   private static final float scrollStepDivider = 8.0F;
   private static final float scrollSnapEpsilon = 0.05F;
   private static final long itemMoveDuration = 180L;
   private static final floatHolder_5 panelRadius = floatHolder_5.StringHolder_30(7.0F);
   private static final Font panelTitleFont = Fonts.MEDIUM.getFont(6.0F);
   private static final Font panelTitleIconFont = Fonts.ICONS.getFont(7.0F);
   private static final Font searchIconFont = Fonts.ICONS.getFont(6.0F);
   private static final Font searchFont = Fonts.MEDIUM.getFont(6.0F);
   private static final String panelTitleText = "Auto Inventory";
   private static final String panelTitleIcon = "7";
   private static final String searchIcon = "S";
   private final OnMouseClickedHandler searchBox = new OnMouseClickedHandler(
      new Vector2f(0.0F, 0.0F), searchFont, "Search for item...", 112.0F - searchIconFont.width("S") - 8.0F
   );
   private final doubleHolder scrollHandler = new doubleHolder();
   private final GetStartTimeHandler animationScrollHeight = new GetStartTimeHandler(150L, 1.0F, IReturn.ListHolder_8);
   private final List<GetDisplayNameHandler_2> filteredItems = new ArrayList<>();
   private final Map<GetDisplayNameHandler_2, GetStartTimeHandler> itemXAnimations = new IdentityHashMap<>();
   private final Map<GetDisplayNameHandler_2, GetStartTimeHandler> itemYAnimations = new IdentityHashMap<>();
   private final Supplier<String> serverSupplier;
   private String lastSearchText = "";
   private String lastServer = "";
   private int lastSourceSize = -1;
   private float panelX;
   private float panelY;
   private float searchPanelX;
   private float searchPanelY;
   private float gridX;
   private float gridY;
   private float scrollbarX;
   private float scrollbarY;
   private float scrollbarThumbY;
   private float scrollbarHeight;
   private float scrollClickOffset;
   private float lastScrollOffset;
   private boolean draggingScrollbar;
   private GetDisplayNameHandler_2 draggedItem;

   public ItemListPanel(Supplier<String> supplier) {
      this.serverSupplier = supplier;
   }

   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2) {
      this.updateLayout(f, f1);
      this.renderPanels(iiii1ilili1l1l1lilli1liliii, f2);
      List list = this.updateFilteredItems();
      this.updateScroll(list.size());
      float f3 = (float)this.scrollHandler.IIIlII1Il1l111lI1();
      boolean flag = Math.abs(f3 - this.lastScrollOffset) > 0.05F;
      this.lastScrollOffset = f3;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)this.gridX, (int)this.gridY, (int)(this.gridX + 123.0F), (int)(this.gridY + 258.0F));
      this.renderVisibleItems(iiii1ilili1l1l1lilli1liliii, list, f3, flag, f2);
      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      this.renderScrollBar(iiii1ilili1l1l1lilli1liliii, f2);
   }

   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (ill1iili11ii1l != ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         return false;
      } else if (this.isSearchHovered(d0, d1)) {
         this.searchBox.setSelected(true);
         return true;
      } else {
         this.searchBox.setSelected(false);
         if (!this.isScrollbarHovered(d0, d1)) {
            return false;
         } else {
            this.draggingScrollbar = true;
            this.scrollClickOffset = doubleHolder_3.StringHolder_8(
                  d0, d1, (double)(this.scrollbarX - 3.0F), (double)this.scrollbarThumbY, 7.0, (double)this.scrollbarHeight
               )
               ? (float)d1 - this.scrollbarThumbY
               : this.scrollbarHeight / 2.0F;
            this.updateDraggedScrollbar(d1);
            return true;
         }
      }
   }

   public void onMouseReleased(ZenithInternal068 ill1iili11ii1l) {
      if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         this.draggingScrollbar = false;
      }
   }

   public void onMouseDragged(double d0, ZenithInternal068 ill1iili11ii1l) {
      if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl && this.draggingScrollbar) {
         this.updateDraggedScrollbar(d0);
      }
   }

   public boolean keyPressed(int i, int j, int k) {
      if (!this.searchBox.isSelected()) {
         return false;
      } else if (i != 256 && i != 257) {
         return this.searchBox.keyPressed(i, j, k);
      } else {
         this.searchBox.setSelected(false);
         return true;
      }
   }

   public boolean charTyped(char c0, int i) {
      return !this.searchBox.isSelected() ? false : this.searchBox.charTyped(c0, i);
   }

   public boolean mouseScrolled(double d0, double d1, double d2) {
      if (this.isNotListHovered(d0, d1)) {
         return false;
      } else if (this.scrollHandler.l1IIlIIlI11lII1() <= 0.0) {
         return true;
      } else {
         float f = MathHelper.clamp((float)(this.scrollHandler.l1IIlIIlI11lII1() / 258.0 * 10.0), 20.0F, 60.0F);
         this.scrollHandler.ZenithInternal101(d2 * (double)f / 8.0);
         return true;
      }
   }

   public boolean isListHovered(double d0, double d1) {
      return !this.isNotListHovered(d0, d1);
   }

   public GetDisplayNameHandler_2 getItemAt(double d0, double d1) {
      if (this.isNotListHovered(d0, d1)) {
         return null;
      } else {
         float f = (float)this.scrollHandler.IIIlII1Il1l111lI1();
         int i = (int)((d0 - (double)this.gridX) / 25.0);
         int j = (int)((d1 - (double)this.gridY + (double)f) / 25.0);
         if (i >= 0 && i < 5 && j >= 0) {
            float f1 = this.gridX + (float)i * 25.0F;
            float f2 = this.gridY + (float)j * 25.0F - f;
            if (!doubleHolder_3.StringHolder_8(d0, d1, (double)f1, (double)f2, 23.0, 23.0)) {
               return null;
            } else {
               List list = this.updateFilteredItems();
               int k = j * 5 + i;
               return k >= 0 && k < list.size() ? (GetDisplayNameHandler_2)list.get(k) : null;
            }
         } else {
            return null;
         }
      }
   }

   public float getItemPanelSize() {
      return 23.0F;
   }

   public void renderDraggedItem(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i, float f, float f1, float f2
   ) {
      this.renderItem(iiii1ilili1l1l1lilli1liliii, li1ll11ilil1ii1lilll1i, f, f1, f2);
   }

   public void setDraggedItem(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      if (this.draggedItem != li1ll11ilil1ii1lilll1i) {
         this.draggedItem = li1ll11ilil1ii1lilll1i;
         this.lastSourceSize = -1;
      }
   }

   private void updateLayout(float f, float f1) {
      this.panelX = f + 4.0F;
      this.panelY = f1 + 4.0F;
      this.searchPanelX = this.panelX;
      this.searchPanelY = this.panelY + 23.0F + 4.0F;
      this.gridX = this.panelX;
      this.gridY = this.searchPanelY + 23.0F + 4.0F;
      this.scrollbarX = this.gridX + 123.0F + 4.0F;
      this.scrollbarY = this.gridY;
   }

   private void renderPanels(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f) {
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(this.panelX, this.panelY, 128.0F, 23.0F, panelRadius, AutoSborStyle.panelBackground().ZenithInternal039(f));
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         this.searchPanelX, this.searchPanelY, 128.0F, 23.0F, panelRadius, AutoSborStyle.panelBackground().ZenithInternal039(f)
      );
      this.renderTitle(iiii1ilili1l1l1lilli1liliii, f);
      this.renderSearchBox(iiii1ilili1l1l1lilli1liliii, f);
   }

   private void renderTitle(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f) {
      float f1 = panelTitleIconFont.width("7");
      float f2 = panelTitleFont.width("Auto Inventory");
      float f3 = this.panelX + (128.0F - f1 - 4.0F - f2) / 2.0F;
      float f4 = this.panelY + (23.0F - panelTitleIconFont.height()) / 2.0F - 0.5F;
      float f5 = f3 + f1 + 4.0F;
      float f6 = this.panelY + (23.0F - panelTitleFont.height()) / 2.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(panelTitleIconFont, "7", f3, f4, AutoSborStyle.primary().ZenithInternal039(f));
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(panelTitleFont, "Auto Inventory", f5, f6, AutoSborStyle.text().ZenithInternal039(f));
   }

   private void renderSearchBox(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f) {
      float f1 = this.searchPanelX + 8.0F;
      float f2 = this.searchPanelX + 128.0F - searchIconFont.width("S") - 8.0F;
      float f3 = this.searchPanelY + (23.0F - this.searchBox.IIl1llI1Il111I11I111II().height()) / 2.0F;
      boolean flag = this.isSearchHovered((double)iiii1ilili1l1l1lilli1liliii.l111IIlIl1l1(), (double)iiii1ilili1l1l1lilli1liliii.Ill1lI1III1());
      ByteBufferHolder il1iliilli1l1iill = this.searchBox.isSelected()
         ? AutoSborStyle.transparentText()
         : (flag ? AutoSborStyle.text() : AutoSborStyle.textSecondary());
      iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)f1, (int)this.searchPanelY, (int)(f1 + this.searchBox.getWidth()), (int)(this.searchPanelY + 23.0F));
      this.searchBox.StringHolder_8(iiii1ilili1l1l1lilli1liliii, f1, f3, AutoSborStyle.text().ZenithInternal039(f), il1iliilli1l1iill.ZenithInternal039(f));
      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      this.renderSearchIcon(iiii1ilili1l1l1lilli1liliii, f2, f);
   }

   private void renderSearchIcon(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1) {
      float f2 = this.searchPanelY + (23.0F - searchIconFont.height()) / 2.0F + -0.5F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(searchIconFont, "S", f, f2, AutoSborStyle.textTertiary().ZenithInternal039(f1));
   }

   private List<GetDisplayNameHandler_2> updateFilteredItems() {
      List list = this.getSourceItems();
      String s = this.searchBox.II1I11IIl().trim().toLowerCase(Locale.ROOT);
      String s1 = this.getServer();
      if (s.equals(this.lastSearchText) && s1.equals(this.lastServer) && list.size() == this.lastSourceSize) {
         return this.filteredItems;
      } else {
         boolean flag = !s.equals(this.lastSearchText) || !s1.equals(this.lastServer);
         this.filteredItems.clear();
         if (s.isEmpty()) {
            for (GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1ix : list) {
               if (li1ll11ilil1ii1lilll1ix != this.draggedItem) {
                  this.filteredItems.add(li1ll11ilil1ii1lilll1ix);
               }
            }
         } else {
            for (GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1ix : list) {
               if (li1ll11ilil1ii1lilll1ix != this.draggedItem && li1ll11ilil1ii1lilll1ix.HudElement().toLowerCase(Locale.ROOT).contains(s)) {
                  this.filteredItems.add(li1ll11ilil1ii1lilll1ix);
               }
            }
         }

         this.lastSearchText = s;
         this.lastServer = s1;
         this.lastSourceSize = list.size();
         if (flag) {
            this.scrollHandler.ZenithInternal061(0.0);
         }

         return this.filteredItems;
      }
   }

   private List<GetDisplayNameHandler_2> getSourceItems() {
      ArrayList arraylist = new ArrayList();
      if ("Funtime 1.21".equals(this.getServer())) {
         arraylist.addAll(ZenithClient.getInstance().ZenithInternal124().Potions());
      } else {
         arraylist.addAll(ZenithClient.getInstance().ZenithInternal124().TargetPotions());
      }

      arraylist.addAll(ZenithClient.getInstance().ZenithInternal124().AnimatedTab());
      return arraylist;
   }

   private String getServer() {
      return this.serverSupplier == null ? "HolyWorld" : this.serverSupplier.get();
   }

   private void updateScroll(int i) {
      this.scrollHandler.ZenithInternal084((double)Math.max(0.0F, this.getContentHeight(i) - 258.0F));
      this.scrollHandler.Coordinates();
   }

   private void renderVisibleItems(floatHolder_4 iiii1ilili1l1l1lilli1liliii, List<GetDisplayNameHandler_2> list, float f, boolean flag, float f1) {
      int i = this.getRows(list.size());
      int j = Math.max(0, (int)Math.floor((double)((f - 23.0F) / 25.0F)));
      int k = Math.min(i - 1, (int)Math.ceil((double)((f + 258.0F) / 25.0F)));
      int l = j * 5;
      int i1 = Math.min(list.size(), (k + 1) * 5);

      for (int j1 = l; j1 < i1; j1++) {
         int k1 = j1 % 5;
         int l1 = j1 / 5;
         float f2 = this.gridX + (float)k1 * 25.0F;
         float f3 = this.gridY + (float)l1 * 25.0F;
         GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i = (GetDisplayNameHandler_2)list.get(j1);
         float f4 = this.updateItemAnimation(this.itemXAnimations, li1ll11ilil1ii1lilll1i, f2, flag);
         float f5 = this.updateItemAnimation(this.itemYAnimations, li1ll11ilil1ii1lilll1i, f3, flag);
         this.renderItem(iiii1ilili1l1l1lilli1liliii, li1ll11ilil1ii1lilll1i, f4, f5 - f, f1);
      }
   }

   private float updateItemAnimation(Map<GetDisplayNameHandler_2, GetStartTimeHandler> map, GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i, float f, boolean flag) {
      GetStartTimeHandler li1liiliill1 = map.computeIfAbsent(
         li1ll11ilil1ii1lilll1i, li1ll11ilil1ii1lilll1i -> new GetStartTimeHandler(180L, f, IReturn.doubleHolder_4)
      );
      if (flag) {
         li1liiliill1.EventBus(f);
         return f;
      } else {
         return li1liiliill1.StringHolder_8(f);
      }
   }

   private void renderItem(floatHolder_4 iiii1ilili1l1l1lilli1liliii, GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i, float f, float f1, float f2) {
      float f3 = f + 7.5F;
      float f4 = f1 + 7.5F;
      boolean flag = doubleHolder_3.StringHolder_8(
         (double)iiii1ilili1l1l1lilli1liliii.l111IIlIl1l1(), (double)iiii1ilili1l1l1lilli1liliii.Ill1lI1III1(), (double)f, (double)f1, 23.0, 23.0
      );
      float f5 = flag ? 1.0F : 0.48F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f, f1, 23.0F, 23.0F, panelRadius, AutoSborStyle.surface().ZenithInternal039(f2));
      iiii1ilili1l1l1lilli1liliii.getMatrices().push();
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f3, f4, 0.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().scale(0.5F, 0.5F, 1.0F);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, f5 * f2);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(li1ll11ilil1ii1lilll1i.getItemStack(), 0, 0);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
   }

   private void renderScrollBar(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f) {
      float f1 = this.scrollHandler.l1IIlIIlI11lII1() == 0.0 ? 0.0F : (float)(this.scrollHandler.IIIlII1Il1l111lI1() / this.scrollHandler.l1IIlIIlI11lII1());
      this.scrollbarHeight = Math.max(258.0F * (258.0F / (float)(258.0 + this.scrollHandler.l1IIlIIlI11lII1())), 20.0F);
      this.scrollbarHeight = Math.min(258.0F, this.animationScrollHeight.StringHolder_8(this.scrollbarHeight));
      float f2 = Math.max(1.0F, 258.0F - this.scrollbarHeight);
      this.scrollbarThumbY = this.scrollbarY + f2 * f1;
      this.scrollbarThumbY = MathHelper.clamp(this.scrollbarThumbY, this.scrollbarY, this.scrollbarY + 258.0F - this.scrollbarHeight);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         this.scrollbarX, this.scrollbarY, 1.0F, 258.0F, floatHolder_5.StringHolder_30(0.5F), AutoSborStyle.textAlpha(10).ZenithInternal039(f)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         this.scrollbarX,
         this.scrollbarThumbY,
         1.0F,
         this.scrollbarHeight,
         floatHolder_5.StringHolder_30(1.0F),
         AutoSborStyle.textAlpha(24).ZenithInternal039(f)
      );
   }

   private float getContentHeight(int i) {
      int j = this.getRows(i);
      return j <= 0 ? 0.0F : (float)(j - 1) * 25.0F + 23.0F;
   }

   private int getRows(int i) {
      return (int)Math.ceil((double)((float)i / 5.0F));
   }

   private boolean isSearchHovered(double d0, double d1) {
      return doubleHolder_3.StringHolder_8(d0, d1, (double)this.searchPanelX, (double)this.searchPanelY, 128.0, 23.0);
   }

   private boolean isNotListHovered(double d0, double d1) {
      return !doubleHolder_3.StringHolder_8(d0, d1, (double)this.gridX, (double)this.gridY, 123.0, 258.0);
   }

   private boolean isScrollbarHovered(double d0, double d1) {
      return this.scrollHandler.l1IIlIIlI11lII1() > 0.0
         && doubleHolder_3.StringHolder_8(d0, d1, (double)(this.scrollbarX - 3.0F), (double)this.scrollbarY, 7.0, 258.0);
   }

   private void updateDraggedScrollbar(double d0) {
      if (this.draggingScrollbar && !(this.scrollHandler.l1IIlIIlI11lII1() <= 0.0)) {
         float f = Math.max(1.0F, 258.0F - this.scrollbarHeight);
         float f1 = (float)d0 - this.scrollbarY - this.scrollClickOffset;
         float f2 = MathHelper.clamp(f1 / f, 0.0F, 1.0F);
         this.scrollHandler.ZenithInternal061(-((double)f2 * this.scrollHandler.l1IIlIIlI11lII1()));
      }
   }
}
