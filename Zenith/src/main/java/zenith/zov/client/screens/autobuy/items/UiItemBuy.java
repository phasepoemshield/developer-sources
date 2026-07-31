package zenith.zov.client.screens.autobuy.items;

import zenith.hud.*;

import java.util.Locale;
import net.minecraft.item.ItemStack;
import net.minecraft.client.util.math.Vector2f;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.doubleHolder;
import zenith.NumberSetting;
import zenith.floatHolder_8;
import zenith.OnMouseClickedHandler;
import zenith.ZenithInternal097$Helper;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.Interface;
import zenith.DrawContextImpl;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;
import zenith.zov.client.screens.menu.settings.impl.MenuSliderSetting;

public class UiItemBuy {
   private final AutoInventoryItem itemBuy;
   private final OnMouseClickedHandler sumTextBox;
   private HeightHandler bounds;
   private HeightHandler settingsIconBounds;
   private float lastMainPanelX;
   private final GetStartTimeHandler enableAnimation = new GetStartTimeHandler(200L, IReturn.ListHolder_8);
   private final MenuSliderSetting menuSliderSetting;
   private final doubleHolder settingsScrollHandler = new doubleHolder();
   private HeightHandler settingsClipRect;
   private boolean quantityControlsVisible = true;
   private boolean extraSettingsVisible = true;
   private boolean highlightSelectedInSettings = false;
   private boolean useCornerBrackets = false;
   private boolean showPurchaseText = true;
   private boolean useCompactLayout = false;
   private boolean useLightBackground = false;

   public UiItemBuy(AutoInventoryItem autoinventoryitem) {
      this.itemBuy = autoinventoryitem;
      this.sumTextBox = new OnMouseClickedHandler(new Vector2f(0.0F, 0.0F), Fonts.MEDIUM.getFont(7.0F), "Сумма", 50.0F);
      this.sumTextBox.StringHolder_8(ZenithInternal097$Helper.lI1111lI1IlI1lIllIl1Illl);
      this.sumTextBox.EventImpl_38(11);
      this.sumTextBox.GetDisplayNameHandler(String.valueOf(autoinventoryitem.getMaxSumBuy()));
      this.sumTextBox.EventImpl_16(this.sumTextBox.II1I11IIl().length());
      int i = autoinventoryitem.getItemBuy().getItemStack().getMaxCount();
      String s = autoinventoryitem.getItemBuy().getDisplayName();
      if ("Зелье Победителя".equals(s) || "Улучшенное зелье силы".equals(s) || "Улучшенное зелье скорости".equals(s) || "Зелье черепашьей мощи".equals(s)) {
         i = Math.max(i, 64);
      }

      int j = Math.max(1, Math.min(autoinventoryitem.getCountBuy(), i));
      this.menuSliderSetting = new MenuSliderSetting(
         new NumberSetting("Количество", (float)j, 1.0F, (float)i, 1.0F, (f1, f) -> autoinventoryitem.setCountBuy((int)f))
      );
   }

   public void renderSlotBar(DrawContextImpl lliii11l1lllil, float f, float f1, float f2, floatHolder_5 iil11iill1il1l1llilll1l1i1i1) {
      this.renderSlotBar(lliii11l1lllil, f, f1, f2, iil11iill1il1l1llilll1l1i1i1, false);
   }

   public void renderSlotBar(
      DrawContextImpl lliii11l1lllil, float f, float f1, float f2, floatHolder_5 iil11iill1il1l1llilll1l1i1i1, boolean flag
   ) {
      this.bounds = new HeightHandler(f + 0.1F, f1 + 0.1F, f2 - 0.2F, f2 - 0.2F);
      this.renderSlot(lliii11l1lllil, f, f1, f2, iil11iill1il1l1llilll1l1i1i1, flag);
   }

   private void renderSlot(DrawContextImpl lliii11l1lllil, float f, float f1, float f2, floatHolder_5 iil11iill1il1l1llilll1l1i1i1) {
      this.renderSlot(lliii11l1lllil, f, f1, f2, iil11iill1il1l1llilll1l1i1i1, false);
   }

   private void renderSlotWithCorners(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f,
      float f1,
      float f2,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      SetColorHandler_3 llliili1l1ii11i1lii1
   ) {
      Font font = Fonts.MEDIUM.getFont(6.0F);
      ItemStack ItemStack = this.itemBuy.getItemBuy().getItemStack();
      this.settingsIconBounds = new HeightHandler(f + 0.1F, f1 + 0.1F, f2 - 0.2F, f2 - 0.2F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f, f1, f2, f2, iil11iill1il1l1llilll1l1i1i1, llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l());
      iiii1ilili1l1l1lilli1liliii.EventBus(f, f1, f2, f2, -0.1F, iil11iill1il1l1llilll1l1i1i1, llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il());
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f, f1, f2, f2, 0.05F, 9.0F, llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(), iil11iill1il1l1llilll1l1i1i1
      );
      if (!ItemStack.isEmpty()) {
         float f3 = 1.2F;
         iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
         iiii1ilili1l1l1lilli1liliii.getMatrices()
            .translate((double)f + ((double)f2 - 12.8 * (double)f3) / 2.0, (double)f1 + ((double)f2 - 12.8 * (double)f3) / 2.0, 0.0);
         iiii1ilili1l1l1lilli1liliii.getMatrices().scale(f3, f3, 1.0F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(ItemStack, 0, 0);
         iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
         if (this.itemBuy.getCountBuy() > 1) {
            String s = "x" + this.itemBuy.getCountBuy();
            float f4 = font.width(s);
            float f5 = f + f2 - f4 - 2.0F;
            float f6 = f1 + f2 - font.height() - 3.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s, f5, f6, llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl());
         }
      }
   }

   private void renderSlot(DrawContextImpl lliii11l1lllil, float f, float f1, float f2, floatHolder_5 iil11iill1il1l1llilll1l1i1i1, boolean flag) {
      this.enableAnimation.ZenithInternal101(this.itemBuy.isSelected());
      Font font = Fonts.MEDIUM.getFont(6.0F);
      SetColorHandler_3 llliili1l1ii11i1lii1 = ZenithClient.getInstance().NotificationsHolder().IllIlIll11lIlI1();
      ItemStack ItemStack = this.itemBuy.getItemBuy().getItemStack();
      ByteBufferHolder il1iliilli1l1iill = this.useLightBackground
         ? llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1()
         : llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l();
      float f3 = 4.0F;
      lliii11l1lllil.StringHolder_8(f, f1, f2, f2, iil11iill1il1l1llilll1l1i1i1, il1iliilli1l1iill);
      lliii11l1lllil.EventBus(f, f1, f2, f2, -0.1F, iil11iill1il1l1llilll1l1i1i1, llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il());
      if (this.itemBuy.isSelected() || flag) {
         lliii11l1lllil.StringHolder_8(f, f1, f2, f2, 0.05F, 9.0F, llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(), iil11iill1il1l1llilll1l1i1i1);
      }

      if (!ItemStack.isEmpty()) {
         lliii11l1lllil.lII1I1l1I11111l1llI1();
         lliii11l1lllil.getMatrices().translate((double)f + ((double)f2 - 12.8) / 2.0, (double)f1 + ((double)f2 - 12.8) / 2.0, 0.0);
         lliii11l1lllil.getMatrices().scale(0.8F, 0.8F, 1.0F);
         lliii11l1lllil.StringHolder_8(ItemStack, 0, 0);
         lliii11l1lllil.IIlII1lII1();
         if (this.itemBuy.getCountBuy() > 1) {
            String s = "x" + this.itemBuy.getCountBuy();
            float f4 = font.width(s);
            float f5 = f + f2 - f4 - 0.5F;
            float f6 = f1 + f2 - font.height() - 2.0F;
            lliii11l1lllil.StringHolder_8(font, s, f5, f6, llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl());
         }
      }
   }

   public void setQuantityControlsVisible(boolean flag) {
      this.quantityControlsVisible = flag;
   }

   public void setExtraSettingsVisible(boolean flag) {
      this.extraSettingsVisible = flag;
   }

   public void setHighlightSelectedInSettings(boolean flag) {
      this.highlightSelectedInSettings = flag;
   }

   public void setUseCornerBrackets(boolean flag) {
      this.useCornerBrackets = flag;
   }

   public void setShowPurchaseText(boolean flag) {
      this.showPurchaseText = flag;
   }

   public void setUseCompactLayout(boolean flag) {
      this.useCompactLayout = flag;
   }

   public void setUseLightBackground(boolean flag) {
      this.useLightBackground = flag;
   }

   public void renderSumTextBox(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, ByteBufferHolder il1iliilli1l1iill, ByteBufferHolder il1iliilli1l1iill1
   ) {
      this.sumTextBox.StringHolder_8(iiii1ilili1l1l1lilli1liliii, f, f1, il1iliilli1l1iill, il1iliilli1l1iill1);
   }

   public void setSumTextBoxWidth(float f) {
      this.sumTextBox.setWidth(f);
   }

   public void renderSettings(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      this.renderSettings(iiii1ilili1l1l1lilli1liliii, f, f1, f2, f3, f4, f2, f3);
   }

   public void renderSettings(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4, float f5) {
      this.renderSettings(iiii1ilili1l1l1lilli1liliii, f, f1, f2, f3, f4, f5, f3);
   }

   public void renderSettings(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4, float f5, float f6) {
      this.lastMainPanelX = f5;
      SetColorHandler_3 llliili1l1ii11i1lii1 = ZenithClient.getInstance().NotificationsHolder().IllIlIll11lIlI1();
      float f7 = 47.0F;
      this.renderSlotWithCorners(iiii1ilili1l1l1lilli1liliii, f2, f3, f7, floatHolder_5.StringHolder_30(4.0F), llliili1l1ii11i1lii1);
      Font font = Fonts.MEDIUM.getFont(7.0F);
      Font font1 = Fonts.MEDIUM.getFont(7.0F);
      if (this.useCompactLayout) {
         float f8 = 200.0F;
         float f9 = f4 + 20.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f2 + f7 + 8.0F, f3, f8 - f7 - 8.0F, f9, floatHolder_5.StringHolder_30(4.0F), llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l()
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font, this.itemBuy.getItemBuy().getDisplayName(), f2 + f7 + 8.0F + 8.0F, f3 + 8.0F, llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         float f10 = f2 + f8 - 65.0F - 8.0F;
         float f11 = f3 + 8.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f10, f11, 65.0F, f4, floatHolder_5.StringHolder_30(4.0F), llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l()
         );
         float f12 = font1.height() + 4.0F;
         float f13 = f11 + (f4 - f12) / 2.0F + 1.0F;
         this.sumTextBox
            .StringHolder_8(
               iiii1ilili1l1l1lilli1liliii,
               f10 + 8.0F,
               f13,
               llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(),
               llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III()
            );
         this.sumTextBox.setWidth(50.0F);
      } else {
         float f16 = 266.0F - f7 - 8.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f2 + f7 + 8.0F, f3, f16, f7, floatHolder_5.StringHolder_30(4.0F), llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l()
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f2 + f7 + 8.0F, f3, f16, f7, -0.1F, floatHolder_5.StringHolder_30(4.0F), llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font, this.itemBuy.getItemBuy().getDisplayName(), f2 + f7 + 8.0F + 8.0F, f3 + 6.0F, llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         if (this.quantityControlsVisible) {
            this.menuSliderSetting
               .render(
                  iiii1ilili1l1l1lilli1liliii,
                  f,
                  f1,
                  f2 + f7 + 8.0F,
                  f3 + 24.0F,
                  f16,
                  1.0F,
                  1.0F,
                  llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(),
                  llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl(),
                  llliili1l1ii11i1lii1.I1llIl11Il(),
                  llliili1l1ii11i1lii1
               );
         }

         if (this.showPurchaseText) {
            float f17 = f3 + f7 + 6.0F;
            float f20 = 266.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f2, f17, f20, f4, floatHolder_5.StringHolder_30(4.0F), llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l()
            );
            iiii1ilili1l1l1lilli1liliii.EventBus(
               f2, f17, f20, f4, -0.1F, floatHolder_5.StringHolder_30(4.0F), llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
            );
            float f23 = f17 + (f4 - font1.height()) / 2.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               font1, "Купить этот предмет на сумму до:", f2 + 8.0F, f23, llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl()
            );
            float f26 = f2 + f20 - 65.0F - 8.0F;
            float f27 = font1.height() + 4.0F;
            float f14 = f17 + (f4 - f27) / 2.0F + 1.0F;
            this.sumTextBox
               .StringHolder_8(
                  iiii1ilili1l1l1lilli1liliii,
                  f26 + 8.0F,
                  f14,
                  llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(),
                  llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III()
               );
            this.sumTextBox.setWidth(50.0F);
         } else {
            float f18 = f3 + f7 + 6.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(
               f2 + 200.0F - 65.0F, f18, 65.0F, f4, floatHolder_5.StringHolder_30(4.0F), llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l()
            );
            float f21 = font1.height() + 4.0F;
            float f24 = f18 + (f4 - f21) / 2.0F + 1.0F;
            this.sumTextBox
               .StringHolder_8(
                  iiii1ilili1l1l1lilli1liliii,
                  f2 + 200.0F - 65.0F + 8.0F,
                  f24,
                  llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(),
                  llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III()
               );
            this.sumTextBox.setWidth(50.0F);
         }
      }

      if (!this.sumTextBox.isEmpty()) {
         String s = this.sumTextBox.II1I11IIl().replaceAll(",", "");
         this.sumTextBox.GetDisplayNameHandler(String.format(Locale.US, "%,d", Long.parseLong(s)));
         this.itemBuy.setMaxSumBuy(Long.parseLong(s));
      }

      if (this.extraSettingsVisible && this.itemBuy instanceof ExtendAutoInventoryItem extendautoinventoryitem) {
         float f19 = 192.0F;
         float f22 = 255.0F;
         float f25 = f5 - f19 - 8.0F;
         floatHolder_8.StringHolder_8(
            iiii1ilili1l1l1lilli1liliii.getMatrices(),
            f25,
            f6,
            f19,
            f22,
            22.0F,
            floatHolder_5.StringHolder_30(8.0F),
            ByteBufferHolder.ll1lIllll111I1lIIl1lIl,
            Interface.ll11lIl1IlIl1lI1.lI11l1I1l11(),
            false
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f25, f6, f19, f22, floatHolder_5.StringHolder_30(8.0F), llliili1l1ii11i1lii1.l1lII1IIl1lllll1II11l11IIl()
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f25 + 8.0F, f6 + 8.0F, f19 - 16.0F, 30.0F, floatHolder_5.StringHolder_30(8.0F), llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l()
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f25 + 8.0F, f6 + 8.0F, f19 - 16.0F, 30.0F, -0.1F, floatHolder_5.StringHolder_30(8.0F), llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            Fonts.MEDIUM.getFont(7.0F),
            "Доп. Настройки",
            f25 + (f19 - Fonts.MEDIUM.getFont(7.0F).width("Доп. Настройки")) / 2.0F,
            f6 + 8.0F + 13.0F,
            llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl()
         );
         float f28 = f6 + 8.0F + 30.0F + 8.0F;
         float f29 = 0.0F;

         for (MenuSetting menusetting : extendautoinventoryitem.getEnchants()) {
            f29 += menusetting.getHeight() + 8.0F;
         }

         float f30 = f22 - 8.0F - 30.0F - 8.0F - 8.0F;
         this.settingsScrollHandler.ZenithInternal084((double)Math.max(0.0F, f29 - f30));
         this.settingsScrollHandler.Coordinates();
         float f31 = (float)this.settingsScrollHandler.IIIlII1Il1l111lI1();
         this.settingsClipRect = new HeightHandler(f25 + 8.0F, f28, f19 - 16.0F, f30);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            (int)this.settingsClipRect.Il11lIlllI111I1l1111(),
            (int)this.settingsClipRect.I1II11l1I11Illl11IIl1l1lIl1II(),
            (int)(this.settingsClipRect.Il11lIlllI111I1l1111() + this.settingsClipRect.width()),
            (int)(this.settingsClipRect.I1II11l1I11Illl11IIl1l1lIl1II() + this.settingsClipRect.height())
         );
         float f15 = f28 - f31 + 4.0F;

         for (MenuSetting menusetting1 : extendautoinventoryitem.getEnchants()) {
            menusetting1.render(
               iiii1ilili1l1l1lilli1liliii,
               f,
               f1,
               f25 + 8.0F,
               f15,
               f19 - 16.0F,
               1.0F,
               1.0F,
               llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(),
               llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl(),
               llliili1l1ii11i1lii1.l1l1lIIlI1l11(),
               llliili1l1ii11i1lii1
            );
            f15 += menusetting1.getHeight() + 8.0F;
         }

         iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      }
   }

   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l, boolean flag) {
      if (this.settingsIconBounds != null && this.settingsIconBounds.byteHolder(d0, d1)) {
         return true;
      } else {
         this.sumTextBox.onMouseClicked(d0, d1, ill1iili11ii1l);
         if (this.quantityControlsVisible) {
            this.menuSliderSetting.onMouseClicked(d0, d1, ill1iili11ii1l);
         }

         if (this.extraSettingsVisible && this.itemBuy instanceof ExtendAutoInventoryItem extendautoinventoryitem) {
            float f4 = 192.0F;
            float f = this.lastMainPanelX - f4 - 8.0F;
            float f1 = this.settingsIconBounds != null ? this.settingsIconBounds.I1II11l1I11Illl11IIl1l1lIl1II() : 0.0F;
            float f2 = (float)this.settingsScrollHandler.IIIlII1Il1l111lI1();
            float f3 = f1 + 20.0F - f2;

            for (MenuSetting menusetting : extendautoinventoryitem.getEnchants()) {
               menusetting.onMouseClicked(d0, d1, ill1iili11ii1l);
               f3 += menusetting.getHeight() + 16.0F;
            }
         }

         return false;
      }
   }

   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.quantityControlsVisible) {
         this.menuSliderSetting.onMouseReleased(d0, d1, ill1iili11ii1l);
      }

      if (this.extraSettingsVisible && this.itemBuy instanceof ExtendAutoInventoryItem extendautoinventoryitem) {
         float f = (float)this.settingsScrollHandler.IIIlII1Il1l111lI1();

         for (MenuSetting menusetting : extendautoinventoryitem.getEnchants()) {
            menusetting.onMouseReleased(d0, d1, ill1iili11ii1l);
         }
      }
   }

   public boolean charTyped(char c0, int i) {
      boolean flag = this.sumTextBox.charTyped(c0, i);
      if (!this.sumTextBox.isEmpty() && this.sumTextBox.isSelected()) {
         String s = this.sumTextBox.II1I11IIl().replaceAll(",", "");

         try {
            long j = Long.parseLong(s);
            this.itemBuy.setMaxSumBuy(j);
            System.out.println("\ud83d\udcbe Цена сохранена: " + j);
         } catch (NumberFormatException numberformatexception) {
            System.out.println("❌ Ошибка: неверный формат цены");
         }
      }

      return flag;
   }

   public boolean keyPressed(int i, int j, int k) {
      boolean flag = this.sumTextBox.keyPressed(i, j, k);
      if (this.sumTextBox.isSelected()) {
         if (!this.sumTextBox.isEmpty()) {
            String s = this.sumTextBox.II1I11IIl().replaceAll(",", "");

            try {
               long l = Long.parseLong(s);
               this.itemBuy.setMaxSumBuy(l);
               System.out.println("\ud83d\udcbe Цена сохранена: " + l);
            } catch (NumberFormatException numberformatexception) {
               System.out.println("❌ Ошибка: неверный формат цены");
            }
         }

         return true;
      } else {
         return flag;
      }
   }

   public String getName() {
      return this.itemBuy.getItemBuy().getDisplayName();
   }

   public boolean onScroll(double d0, double d1, double d2) {
      if (this.settingsClipRect != null && this.settingsClipRect.byteHolder(d0, d1)) {
         this.settingsScrollHandler.ZenithInternal101(d2 * 10.0);
         return true;
      } else {
         return false;
      }
   }

   public void setBounds(float f, float f1, float f2, float f3) {
      this.bounds = new HeightHandler(f, f1, f2, f3);
   }

   public AutoInventoryItem getItemBuy() {
      return this.itemBuy;
   }

   public HeightHandler getBounds() {
      return this.bounds;
   }

   public void setBounds(HeightHandler li1il11i1iilii1iiili111li11) {
      this.bounds = li1il11i1iilii1iiili111li11;
   }
}
