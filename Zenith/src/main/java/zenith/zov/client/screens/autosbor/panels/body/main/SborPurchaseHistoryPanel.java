package zenith.zov.client.screens.autosbor.panels.body.main;

import zenith.hud.*;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import net.minecraft.item.ItemStack;
import zenith.floatHolder_4;
import zenith.floatHolder_5;
import zenith.doubleHolder;
import zenith.doubleHolder_3;
import zenith.Autoinventory;
import zenith.GetItemStackHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.autosbor.AutoSborStyle;

public class SborPurchaseHistoryPanel {
   private static final float gridXOffset = 140.0F;
   private static final float countPanelYOffset = 31.0F;
   private static final float countPanelHeight = 30.0F;
   private static final float blockGap = 4.0F;
   private static final float slotSize = 23.0F;
   private static final float slotGap = 2.0F;
   private static final int gridRows = 4;
   private static final float screenHeight = 320.0F;
   private static final float bottomPanelHeight = 21.0F;
   private static final float bottomPanelGap = 2.0F;
   private static final float historyTopGap = 4.0F;
   private static final float bottomPadding = 4.0F;
   private static final float rowWidth = 218.0F;
   private static final float rowHeight = 23.0F;
   private static final float rowGap = 2.0F;
   private static final float pricePanelWidth = 64.0F;
   private static final float scrollOffsetX = 4.0F;
   private static final float scrollWidth = 1.0F;
   private static final float scrollHeightGap = 4.0F;
   private static final float minScrollThumbHeight = 20.0F;
   private static final float iconAreaSize = 19.0F;
   private static final float iconRenderSize = 10.0F;
   private static final float iconOffsetX = 2.0F;
   private static final float textOffsetX = 29.0F;
   private static final float innerGap = 6.0F;
   private static final floatHolder_5 rowRadius = floatHolder_5.StringHolder_30(6.0F);
   private static final floatHolder_5 scrollRadius = floatHolder_5.StringHolder_30(0.5F);
   private static final Font nameFont = Fonts.MEDIUM.getFont(5.5F);
   private static final Font amountFont = Fonts.MEDIUM.getFont(5.0F);
   private static final Font priceFont = Fonts.MEDIUM.getFont(5.5F);
   private final doubleHolder scrollHandler = new doubleHolder();
   private float listX;
   private float listY;
   private float currentListHeight;
   private float currentScrollHeight;

   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, boolean flag, float f2) {
      List list = Autoinventory.lIIl1Illl1IllIIl11Il1l111I1I.I1llI1lIlI1Ill11I().I1IIIIllll();
      float f3 = flag ? 1.0F : 0.0F;
      this.listX = f + 140.0F;
      this.listY = f1 + this.getListYOffset(f3);
      this.currentListHeight = this.getListHeight(f3);
      this.currentScrollHeight = this.currentListHeight - 4.0F;
      this.updateScroll(list.size());
      float f4 = (float)this.scrollHandler.IIIlII1Il1l111lI1();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)this.listX, (int)this.listY, (int)(this.listX + 218.0F), (int)(this.listY + this.currentListHeight));

      for (int i = 0; i < list.size(); i++) {
         float f5 = this.listY + (float)i * 25.0F - f4;
         if (!(f5 + 23.0F <= this.listY) && !(f5 >= this.listY + this.currentListHeight)) {
            this.renderHistoryRow(iiii1ilili1l1l1lilli1liliii, (GetItemStackHandler)list.get(i), this.listX, f5, f2);
         }
      }

      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      this.renderScrollBar(iiii1ilili1l1l1lilli1liliii, list.size(), f2);
   }

   public boolean mouseScrolled(double d0, double d1, double d2) {
      if (!this.isHovered(d0, d1)) {
         return false;
      } else if (this.scrollHandler.l1IIlIIlI11lII1() <= 0.0) {
         return false;
      } else {
         this.scrollHandler.ZenithInternal101(d2 * 3.0);
         return true;
      }
   }

   private void renderHistoryRow(floatHolder_4 iiii1ilili1l1l1lilli1liliii, GetItemStackHandler l1li1l11il1li1lii, float f, float f1, float f2) {
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f, f1, 218.0F, 23.0F, rowRadius, AutoSborStyle.headerSurface().ZenithInternal039(f2));
      float f3 = f + 218.0F - 64.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f3, f1, 64.0F, 23.0F, rowRadius, AutoSborStyle.surface().ZenithInternal039(f2));
      this.renderItemIcon(iiii1ilili1l1l1lilli1liliii, l1li1l11il1li1lii.getItemStack(), f, f1, f2);
      this.renderNameAndAmount(iiii1ilili1l1l1lilli1liliii, l1li1l11il1li1lii, f, f1, f3, f2);
      this.renderPrice(iiii1ilili1l1l1lilli1liliii, l1li1l11il1li1lii.getPrice(), f3, f1, f2);
   }

   private void renderItemIcon(floatHolder_4 iiii1ilili1l1l1lilli1liliii, ItemStack ItemStack, float f, float f1, float f2) {
      if (ItemStack != null && !ItemStack.isEmpty()) {
         float f3 = 0.625F;
         float f4 = f + 2.0F + 4.5F;
         float f5 = f1 + 6.5F;
         iiii1ilili1l1l1lilli1liliii.getMatrices().push();
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f4, f5, 0.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().scale(f3, f3, 1.0F);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, f2);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(ItemStack, 0, 0);
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
      }
   }

   private void renderNameAndAmount(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, GetItemStackHandler l1li1l11il1li1lii, float f, float f1, float f2, float f3
   ) {
      String s = "x" + l1li1l11il1li1lii.getAmount();
      float f4 = amountFont.width(s);
      float f5 = f + 29.0F;
      float f6 = 4.0F;
      float f7 = Math.max(10.0F, f2 - 6.0F - f5 - f6 - f4);
      String s1 = this.trimToWidth(l1li1l11il1li1lii.getItemName(), f7);
      float f8 = f1 + (23.0F - nameFont.height()) / 2.0F;
      float f9 = f1 + (23.0F - amountFont.height()) / 2.0F;
      float f10 = f5 + nameFont.width(s1) + f6;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(nameFont, s1, f5, f8, AutoSborStyle.text().ZenithInternal039(f3));
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(amountFont, s, f10, f9, AutoSborStyle.textSecondary().ZenithInternal039(f3));
   }

   private void renderPrice(floatHolder_4 iiii1ilili1l1l1lilli1liliii, long i, float f, float f1, float f2) {
      String s = "$";
      String s1 = this.formatPrice(i);
      float f3 = priceFont.width(s);
      float f4 = priceFont.width(s1);
      float f5 = f + (64.0F - f3 - f4) / 2.0F;
      float f6 = f1 + (23.0F - priceFont.height()) / 2.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(priceFont, s, f5, f6, AutoSborStyle.primary().ZenithInternal039(f2));
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(priceFont, s1, f5 + f3, f6, AutoSborStyle.text().ZenithInternal039(f2));
   }

   private void updateScroll(int i) {
      this.scrollHandler.ZenithInternal084((double)Math.max(0.0F, this.getContentHeight(i) - this.currentListHeight));
      this.scrollHandler.Coordinates();
   }

   private float getContentHeight(int i) {
      return i <= 0 ? 0.0F : (float)i * 23.0F + (float)(i - 1) * 2.0F;
   }

   private float getListYOffset(float f) {
      float f1 = 31.0F + 34.0F * f;
      return f1 + this.getGridHeight() + 4.0F + 21.0F + 2.0F + 21.0F + 4.0F;
   }

   private float getListHeight(float f) {
      return Math.max(0.0F, 320.0F - this.getListYOffset(f) - 4.0F);
   }

   private float getGridHeight() {
      return 98.0F;
   }

   private void renderScrollBar(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, float f) {
      float f1 = this.getContentHeight(i);
      if (!(this.scrollHandler.l1IIlIIlI11lII1() <= 0.0) && !(f1 <= this.currentListHeight)) {
         float f2 = this.listX + 218.0F + 4.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f2, this.listY, 1.0F, this.currentScrollHeight, scrollRadius, AutoSborStyle.textAlpha(10).ZenithInternal039(f)
         );
         float f3 = Math.max(20.0F, this.currentScrollHeight * (this.currentListHeight / f1));
         f3 = Math.min(this.currentScrollHeight, f3);
         float f4 = (float)this.scrollHandler.l1IIlIIlI11lII1();
         float f5 = Math.max(0.0F, Math.min(1.0F, (float)this.scrollHandler.IIIlII1Il1l111lI1() / f4));
         float f6 = this.listY + (this.currentScrollHeight - f3) * f5;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f2, f6, 1.0F, f3, scrollRadius, AutoSborStyle.textAlpha(24).ZenithInternal039(f));
      }
   }

   private String trimToWidth(String s, float f) {
      String s1 = s == null ? "" : s;
      if (nameFont.width(s1) <= f) {
         return s1;
      } else {
         while (!s1.isEmpty() && nameFont.width(s1 + "...") > f) {
            s1 = s1.substring(0, s1.length() - 1);
         }

         return s1.isEmpty() ? "" : s1 + "...";
      }
   }

   private String formatPrice(long i) {
      String s = Long.toString(Math.max(0L, i));
      StringBuilder stringbuilder = new StringBuilder(s.length() + s.length() / 3);

      for (int j = 0; j < s.length(); j++) {
         if (j > 0 && (s.length() - j) % 3 == 0) {
            stringbuilder.append(' ');
         }

         stringbuilder.append(s.charAt(j));
      }

      return stringbuilder.toString();
   }

   private boolean isHovered(double d0, double d1) {
      float f = this.scrollHandler.l1IIlIIlI11lII1() <= 0.0 ? 218.0F : 223.0F;
      return doubleHolder_3.StringHolder_8(d0, d1, (double)this.listX, (double)this.listY, (double)f, (double)this.currentListHeight);
   }
}
