package zenith.zov.client.screens.menu;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.Vector2f;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.Category;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ScreenImpl;
import zenith.ZenithInternal068;
import zenith.doubleHolder;
import zenith.doubleHolder_3;
import zenith.StringHolder_21;
import zenith.floatHolder_8;
import zenith.OnMouseClickedHandler;
import zenith.ZenithInternal097$Helper;
import zenith.GetStartTimeHandler;
import zenith.Interface;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.menu.elements.api.AbstractMenuElement;
import zenith.zov.client.screens.menu.elements.impl.MenuAddCustomThemeElement;
import zenith.zov.client.screens.menu.elements.impl.MenuCustomThemeElement;
import zenith.zov.client.screens.menu.elements.impl.MenuModuleElement;
import zenith.zov.client.screens.menu.elements.impl.MenuThemeElement;
import zenith.zov.client.screens.menu.panels.HeaderPanel;
import zenith.zov.client.screens.menu.panels.SidebarPanel;
import zenith.zov.client.screens.menu.settings.api.MenuPopupSetting;

public class MenuScreen extends ScreenImpl {
   private Category selectedCategory = Category.IIII1111111II;
   private Category realSelectedCategory = Category.IIII1111111II;
   private float boxX;
   private float boxY;
   private int columns = 1;
   private float boxWidth = 522.0F;
   private float boxHeight = 316.0F;
   private boolean dragging;
   private float dragOffsetX;
   private float dragOffsetY;
   private final GetStartTimeHandler sidebarAnimation = new GetStartTimeHandler(300L, 0.0F, IReturn.ZenithInternal088);
   private boolean isSidebarExpanded;
   private final GetStartTimeHandler animationClose = new GetStartTimeHandler(300L, 0.0F, IReturn.StringHolder_9);
   private boolean initialized;
   private OnMouseClickedHandler searchField;
   private final doubleHolder scrollHandler = new doubleHolder();
   private boolean closing = false;
   private SidebarPanel sidebarPanel;
   private HeaderPanel headerPanel;
   private int scaledScissorX = 0;
   private int scaledScissorY = 0;
   private int scaledScissorEndX = 2000;
   private int scaledScissorEndY = 2000;
   private final GetStartTimeHandler animationColums;
   private final GetStartTimeHandler animationScrollHeight;
   private final GetStartTimeHandler animationChangeCategory;
   private boolean draggingScrollbar = false;
   private float scrollClickOffset = 0.0F;
   private Set<MenuPopupSetting> popupSettings = new HashSet<>();
   List<AbstractMenuElement> modules = new CopyOnWriteArrayList<>();

   public MenuScreen() {
      this.animationColums = new GetStartTimeHandler(300L, this.columns == 3 ? 1.0F : 0.0F, IReturn.ZenithInternal088);
      this.animationChangeCategory = new GetStartTimeHandler(150L, 1.0F, IReturn.ZenithInternal088);
      this.animationScrollHeight = new GetStartTimeHandler(150L, 1.0F, IReturn.ListHolder_8);
   }

   public void initialize() {
      this.modules
         .addAll(
            ZenithClient.getInstance().getModuleManager().getModules().stream().map(MenuModuleElement::new).toList()
         );

      for (SetColorHandler_3 llliili1l1ii11i1lii1 : ZenithClient.getInstance()
         .NotificationsHolder()
         .llII1lIlI1l11lIIlI11IllIlIII()) {
         if (SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I != llliili1l1ii11i1lii1 && SetColorHandler_3.I11lII11lI11I1I1IIIl != llliili1l1ii11i1lii1) {
            this.modules.add(new MenuCustomThemeElement(llliili1l1ii11i1lii1));
         } else {
            this.modules.add(new MenuThemeElement(llliili1l1ii11i1lii1));
         }
      }

      this.modules.add(new MenuAddCustomThemeElement());
   }

   protected void init() {
      this.closing = false;
      this.animationColums.EventBus(this.columns == 3 ? 1.0F : 0.0F);
      this.boxWidth = (float)MathHelper.lerp(this.animationColums.CloudFriendInfo(), 465, 533);
      this.boxHeight = (float)MathHelper.lerp(this.animationColums.CloudFriendInfo(), 282, 320);
      this.boxX = ((float)this.width - this.boxWidth) / 2.0F;
      this.boxY = ((float)this.height - this.boxHeight) / 2.0F;
      this.animationClose.EventBus(0.0F);
      this.animationClose.StringHolder_8(1.0F);
      if (!this.initialized) {
         this.searchField = new OnMouseClickedHandler(
            new Vector2f(this.boxX + this.boxWidth - 128.0F - 8.0F, this.boxY + 8.0F), Fonts.MEDIUM.getFont(7.0F), "Search", 100.0F
         );
         this.searchField.StringHolder_8(ZenithInternal097$Helper.III11IIl1l1l1lI);
         this.sidebarPanel = new SidebarPanel(this.sidebarAnimation, this.isSidebarExpanded, iill11i1il1ilii11iii1llil1ll -> {
            if (this.realSelectedCategory != iill11i1il1ilii11iii1llil1ll) {
               this.headerPanel.resetAnim(this.realSelectedCategory, iill11i1il1ilii11iii1llil1ll);
               this.realSelectedCategory = iill11i1il1ilii11iii1llil1ll;
               this.scrollHandler.ZenithInternal061(0.0);
               this.searchField.ZenithException(true);
               this.searchField.setSelected(true);
               this.searchField.keyPressed(259, 0, 0);
               this.searchField.setSelected(false);
            }
         }, () -> {
            this.isSidebarExpanded = !this.isSidebarExpanded;
            this.sidebarAnimation.ZenithInternal095(this.isSidebarExpanded ? 1.0F : 0.0F);
         });
         this.headerPanel = new HeaderPanel(
            this.searchField,
            () -> this.columns = this.columns % 3 + 1,
            () -> ZenithClient.getInstance().NotificationsHolder().Il1III11llIlIlIl1l1IlI1IIlI()
         );
      }

      this.initialized = true;
   }

   @Override
   public void tick() {
      if (this.closing && this.animationClose.CloudFriendInfo() == 0.0F) {
         this.close();
      }

      super.tick();
   }

   public void removed() {
      this.closing = true;
      super.removed();
   }

   public void renderBackground(DrawContext DrawContext, int i, int j, float f) {
   }

   public boolean isFinish() {
      return this.animationClose.CloudFriendInfo() == 0.0F && this.closing;
   }

   public void renderTop(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1) {
      if (this.initialized) {
         this.animationColums.StringHolder_8(this.columns == 3 ? 1.0F : 0.0F);
         float f2 = 44.0F * this.sidebarPanel.getSidebarAnimation().CloudFriendInfo();
         this.boxWidth = (float)MathHelper.lerp(this.animationColums.CloudFriendInfo(), 465, 533) + f2;
         this.boxHeight = (float)MathHelper.lerp(this.animationColums.CloudFriendInfo(), 288, 320);
         float f3 = this.animationClose.StringHolder_8(this.closing ? 0.0F : 1.0F);
         f3 = Math.min(Math.max(f3, 0.0F), 1.0F);
         float f4 = this.sidebarAnimation.ArmorHud();
         float f5 = 0.85F + 0.15F * f3;
         SetColorHandler_3 llliili1l1ii11i1lii1 = ZenithClient.getInstance().NotificationsHolder().IllIlIll11lIlI1();
         MatrixStack MatrixStack = iiii1ilili1l1l1lilli1liliii.getMatrices();
         iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
         float f6 = this.boxX + this.boxWidth / 2.0F;
         float f7 = this.boxY + this.boxHeight / 2.0F;
         MatrixStack.translate(f6, f7, 1.0F);
         MatrixStack.scale(f5, f5, 1.0F);
         MatrixStack.translate(-f6, -f7, 1.0F);
         ByteBufferHolder il1iliilli1l1iill = llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f3);
         ByteBufferHolder il1iliilli1l1iill1 = llliili1l1ii11i1lii1.l1lII1IIl1lllll1II11l11IIl().ZenithInternal039(Math.min(1.0F, f3 * 4.0F));
         ByteBufferHolder il1iliilli1l1iill2 = llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl().ZenithInternal039(f3);
         ByteBufferHolder il1iliilli1l1iill3 = llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl().ZenithInternal039(f3);
         if (Interface.ll11lIl1IlIl1lI1.lI11l1I1l11()) {
            floatHolder_8.ZenithInternal028(
               iiii1ilili1l1l1lilli1liliii.getMatrices(),
               this.boxX,
               this.boxY,
               this.boxWidth,
               this.boxHeight,
               20.0F * f3 * f3,
               floatHolder_5.StringHolder_30(9.0F),
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f3 * 2.0F)
            );
         }

         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            this.boxX, this.boxY, this.boxWidth, this.boxHeight, floatHolder_5.StringHolder_30(9.0F), il1iliilli1l1iill1
         );
         float f8 = 2.0F;
         this.sidebarPanel
            .render(
               iiii1ilili1l1l1lilli1liliii,
               this.boxX,
               this.boxY,
               this.boxHeight,
               f3,
               llliili1l1ii11i1lii1,
               this.realSelectedCategory,
               il1iliilli1l1iill,
               il1iliilli1l1iill3,
               il1iliilli1l1iill2
            );
         float f9 = 30.0F + 58.0F * f4;
         float f10 = this.boxX + 8.0F + f9 + 8.0F;
         float f11 = this.boxY + 8.0F;
         float f12 = this.boxY + 22.0F + 8.0F + 8.0F;
         this.headerPanel
            .render(iiii1ilili1l1l1lilli1liliii, f10, f11, this.boxX, this.columns, this.boxWidth, f3, llliili1l1ii11i1lii1, this.realSelectedCategory);
         float f13 = this.boxHeight - 46.0F;
         float f14 = this.scrollHandler.l1IIlIIlI11lII1() == 0.0
            ? 0.0F
            : (float)(this.scrollHandler.IIIlII1Il1l111lI1() / this.scrollHandler.l1IIlIIlI11lII1());
         float f15 = Math.max(f13 * (f13 / (float)((double)f13 + this.scrollHandler.l1IIlIIlI11lII1())), 20.0F);
         f15 = Math.min(f13, this.animationScrollHeight.StringHolder_8(f15));
         float f16 = Math.max(1.0F, f13 - f15);
         float f17 = f12 + f16 * f14;
         f17 = Math.min(f12 + f13, f17);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            this.boxX + this.boxWidth - 8.0F - f8,
            f12,
            f8,
            f13,
            floatHolder_5.StringHolder_30(0.5F),
            llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l().ZenithInternal039(f3)
         );
         if (f17 + f15 > f13 + f12) {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               this.boxX + this.boxWidth - 8.0F - f8,
               f12,
               f8,
               f13,
               floatHolder_5.StringHolder_30(1.0F),
               llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il().ZenithInternal039(f3)
            );
         } else {
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               this.boxX + this.boxWidth - 8.0F - f8,
               f17,
               f8,
               f15,
               floatHolder_5.StringHolder_30(1.0F),
               llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il().ZenithInternal039(f3)
            );
         }

         float f18 = this.boxX + (float)(this.columns == 3 ? 530 : 461) + f2 - f10 - 8.0F;
         this.scaledScissorX = (int)f10;
         this.scaledScissorY = (int)((float)((int)this.boxY) + 38.0F);
         this.scaledScissorEndX = (int)(this.boxX + this.boxWidth);
         this.scaledScissorEndY = (int)((float)((int)this.boxY) + this.boxHeight);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(this.scaledScissorX, this.scaledScissorY, this.scaledScissorEndX, this.scaledScissorEndY);

         try {
            this.animationChangeCategory.StringHolder_8(IReturn.ListHolder_8);
            this.renderModules(
               iiii1ilili1l1l1lilli1liliii,
               f,
               f1,
               f3 * this.animationChangeCategory.StringHolder_8(this.selectedCategory == this.realSelectedCategory ? 1.0F : 0.0F),
               (float)((int)f10),
               f18,
               (float)((int)f12)
            );
         } catch (Exception exception) {
            System.out.println("MODULE ERROR");
            exception.printStackTrace();
         }

         iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
         ArrayList arraylist = new ArrayList();

         for (MenuPopupSetting menupopupsetting : this.popupSettings) {
            menupopupsetting.render(iiii1ilili1l1l1lilli1liliii, f, f1, f3, llliili1l1ii11i1lii1);
            if (menupopupsetting.getAnimationScale().CloudFriendInfo() == 0.0F) {
               arraylist.add(menupopupsetting);
            }
         }

         this.popupSettings.removeAll(arraylist);
         if (this.animationChangeCategory.CloudFriendInfo() == 0.0F) {
            this.selectedCategory = this.realSelectedCategory;
         }

         if (this.draggingScrollbar) {
            float f20 = this.boxY + 22.0F + 8.0F + 8.0F;
            float f21 = f1 - f20 - this.scrollClickOffset;
            float f19 = f21 / f16;
            this.scrollHandler.ZenithInternal061(-((double)f19 * this.scrollHandler.l1IIlIIlI11lII1()));
         }

         iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
      }
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (!this.popupSettings.isEmpty()) {
         for (MenuPopupSetting menupopupsetting : this.popupSettings) {
            if (menupopupsetting.getBounds().byteHolder(d0, d1)) {
               menupopupsetting.onMouseClicked(d0, d1, ill1iili11ii1l);
               return;
            }

            menupopupsetting.getAnimationScale().StringHolder_8(0.0F);
         }
      }

      if (!this.isClosing()) {
         if (this.headerPanel.handleMouseClicked(d0, d1)) {
            if (this.headerPanel.getSearchBarBounds().byteHolder(d0, d1)) {
               this.searchField.setSelected(true);
            }

            if (ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0 || ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 1) {
               ZenithClient.getInstance()
                  .MinecraftClientHolder_5()
                  .StringHolder_8(
                     ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0
                        ? ZenithClient.getInstance().MinecraftClientHolder_5().IIl1l1II1I11IllI1I111Ill1
                        : ZenithClient.getInstance().MinecraftClientHolder_5().l11l11lII11lIl1l
                  );
            }
         } else if (!this.sidebarPanel.handleMouseClicked(d0, d1)) {
            if (this.searchField.isSelected()) {
               this.searchField.setSelected(false);
            }

            if (ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0
               && doubleHolder_3.StringHolder_8(d0, d1, (double)this.boxX, (double)this.boxY, (double)this.boxWidth, 20.0)) {
               this.dragging = true;
               this.dragOffsetX = (float)d0 - this.boxX;
               this.dragOffsetY = (float)d1 - this.boxY;
            } else if (this.animationClose.ArrayListHolder()) {
               float f1 = this.boxX + this.boxWidth - 8.0F - 2.0F;
               float f2 = this.boxY + 22.0F + 8.0F + 8.0F;
               float f = this.boxHeight - 38.0F;
               if (ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0 && doubleHolder_3.StringHolder_8(d0, d1, (double)f1, (double)f2, 2.0, (double)f)) {
                  this.draggingScrollbar = true;
               } else if (doubleHolder_3.StringHolder_8(d0, d1, this.scaledScissorX, this.scaledScissorY, this.scaledScissorEndX, this.scaledScissorEndY)) {
                  this.modules
                     .stream()
                     .filter(
                        abstractmenuelement -> this.searchField.isEmpty()
                              ? abstractmenuelement.getCategory() == this.selectedCategory
                              : abstractmenuelement.getName().toLowerCase().contains(StringHolder_21.ZenithInternal059(this.searchField.II1I11IIl()).toLowerCase())
                     )
                     .forEach(abstractmenuelement -> abstractmenuelement.onMouseClicked(d0, d1, ill1iili11ii1l));
                  super.onMouseClicked(d0, d1, ill1iili11ii1l);
               }
            }
         } else {
            if (ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0 || ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 1) {
               ZenithClient.getInstance()
                  .MinecraftClientHolder_5()
                  .StringHolder_8(
                     ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0
                        ? ZenithClient.getInstance().MinecraftClientHolder_5().IIl1l1II1I11IllI1I111Ill1
                        : ZenithClient.getInstance().MinecraftClientHolder_5().l11l11lII11lIl1l
                  );
            }
         }
      }
   }

   public boolean charTyped(char c0, int i) {
      if (this.searchField.isSelected()) {
         return this.searchField.charTyped(c0, i);
      } else {
         for (MenuPopupSetting menupopupsetting : this.popupSettings) {
            if (menupopupsetting.charTyped(c0, i)) {
               return true;
            }
         }

         for (AbstractMenuElement abstractmenuelement : this.modules) {
            if (abstractmenuelement.charTyped(c0, i)) {
               return true;
            }
         }

         return super.charTyped(c0, i);
      }
   }

   @Override
   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      for (MenuPopupSetting menupopupsetting : this.popupSettings) {
         menupopupsetting.onMouseReleased(d0, d1, ill1iili11ii1l);
      }

      if (ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0) {
         this.dragging = false;
         this.draggingScrollbar = false;
      }

      for (AbstractMenuElement abstractmenuelement : this.modules) {
         abstractmenuelement.onMouseReleased(d0, d1, ill1iili11ii1l);
      }

      super.onMouseReleased(d0, d1, ill1iili11ii1l);
   }

   public boolean keyPressed(int i, int j, int k) {
      boolean flag = false;

      for (MenuPopupSetting menupopupsetting : this.popupSettings) {
         if (menupopupsetting.keyPressed(i, j, k)) {
            this.searchField.setSelected(false);
            flag = true;
         }
      }

      if (flag) {
         return true;
      } else if (this.searchField.isSelected()) {
         if (i != 256 && i != 257) {
            return this.searchField.keyPressed(i, j, k);
         } else {
            this.searchField.setSelected(false);
            return true;
         }
      } else {
         boolean flag1 = false;

         for (AbstractMenuElement abstractmenuelement : this.modules) {
            if (abstractmenuelement.keyPressed(i, j, k)) {
               flag1 = true;
            }
         }

         if (flag1) {
            return true;
         } else {
            if (i == 256 && !this.closing) {
               this.onMouseReleased(0.0, 0.0, ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl);
               this.onMouseReleased(0.0, 0.0, ZenithInternal068.lII1lI1lII1l);
               this.onMouseReleased(0.0, 0.0, ZenithInternal068.l1lll1lIII1l11);

               for (MenuPopupSetting menupopupsetting1 : this.popupSettings) {
                  menupopupsetting1.getAnimationScale().EventImpl_24(0.0F);
               }

               this.closing = true;
               ZenithClient.getInstance()
                  .MinecraftClientHolder_5()
                  .StringHolder_8(ZenithClient.getInstance().MinecraftClientHolder_5().lIII1l1I1lIllI1llIIlIlll);
            }

            return super.keyPressed(i, j, k);
         }
      }
   }

   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      if (this.popupSettings.isEmpty()) {
         float f = this.boxHeight - 38.0F;
         float f1 = (float)Math.max(20.0, Math.min(60.0, this.scrollHandler.l1IIlIIlI11lII1() / (double)f * 10.0));
         this.scrollHandler.ZenithInternal101(d3 * (double)f1 / 8.0);
         return super.mouseScrolled(d0, d1, d2, d3);
      } else {
         for (MenuPopupSetting menupopupsetting : this.popupSettings) {
            menupopupsetting.mouseScrolled(d0, d1, d2, d3);
         }

         return true;
      }
   }

   @Override
   public void onMouseDragged(double d0, double d1, ZenithInternal068 ill1iili11ii1l, double d2, double d3) {
      if (ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0 && this.dragging) {
         this.boxX = (float)d0 - this.dragOffsetX;
         this.boxY = (float)d1 - this.dragOffsetY;
      } else {
         this.popupSettings.forEach(menupopupsetting -> menupopupsetting.onMouseDragged(d0, d1, ill1iili11ii1l, d2, d3));
         this.modules.forEach(abstractmenuelement -> abstractmenuelement.onMouseDragged(d0, d1, ill1iili11ii1l, d2, d3));
         super.onMouseDragged(d0, d1, ill1iili11ii1l, d2, d3);
      }
   }

   public void close() {
      super.close();
   }

   private void renderModules(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4, float f5) {
      List list = this.modules
         .stream()
         .filter(
            abstractmenuelement1 -> this.searchField.isEmpty()
                  ? abstractmenuelement1.getCategory() == this.selectedCategory
                  : abstractmenuelement1.getName().toLowerCase().contains(StringHolder_21.ZenithInternal059(this.searchField.II1I11IIl()).toLowerCase())
         )
         .sorted(Comparator.comparing(abstractmenuelement1 -> abstractmenuelement1.getName(), String.CASE_INSENSITIVE_ORDER))
         .toList();
      int i = this.columns;
      float f6 = 6.0F;
      float f7 = 6.0F;
      float f8 = f4 - f7;
      float f9 = (f8 - f6 * (float)(i - 1)) / (float)i;
      Font font = Fonts.MEDIUM.getFont(7.0F);
      double[] adouble = new double[i];

      for (AbstractMenuElement abstractmenuelement : list) {
         int j = 0;

         for (int k = 1; k < i; k++) {
            if (adouble[k] < adouble[j]) {
               j = k;
            }
         }

         float f12 = f3 + (float)j * (f9 + f6);
         float f10 = (float)((double)f5 + adouble[j] - this.scrollHandler.IIIlII1Il1l111lI1());
         abstractmenuelement.render(iiii1ilili1l1l1lilli1liliii, f, f1, font, f12, f10, f9, f2, j);
         adouble[j] += (double)(abstractmenuelement.getHeight() + f6);
      }

      this.scrollHandler.Coordinates();
      double d0 = Arrays.stream(adouble).max().orElse(0.0);
      float f11 = this.boxHeight - 38.0F;
      this.scrollHandler.ZenithInternal084(Math.max(0.0, d0 - (double)f11) + (double)(d0 > (double)f11 ? 4 : 0));
   }

   public void addPopupMenuSetting(MenuPopupSetting menupopupsetting) {
      this.popupSettings.add(menupopupsetting);
   }

   public void removePopupMenuSetting(MenuPopupSetting menupopupsetting) {
      this.popupSettings.remove(menupopupsetting);
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1) {
   }

   public boolean isSearch() {
      return this.searchField.isSelected();
   }

   public int getColumns() {
      return this.columns;
   }

   public void setColumns(int i) {
      this.columns = i;
   }

   public boolean isClosing() {
      return this.closing;
   }

   public void setClosing(boolean flag) {
      this.closing = flag;
   }

   public List<AbstractMenuElement> getModules() {
      return this.modules;
   }
}
