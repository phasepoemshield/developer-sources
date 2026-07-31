package zenith.zov.client.screens.autosbor.panels.body;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.util.math.Vector2f;
import zenith.floatHolder_4;
import zenith.floatHolder_5;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.doubleHolder_3;
import zenith.OnMouseClickedHandler;
import zenith.ZenithInternal097$Helper;
import zenith.GetDisplayNameHandler_2;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.autosbor.AutoSborStyle;

public class SborHeader {
   private static final float panelXOffset = 140.0F;
   private static final float panelYOffset = 4.0F;
   private static final float panelWidth = 336.0F;
   private static final float panelHeight = 23.0F;
   private static final float buttonSize = 23.0F;
   private static final float priceBoxWidth = 128.0F;
   private static final float textOffsetX = 8.0F;
   private static final float itemIconSize = 8.0F;
   private static final float itemIconScale = 0.5F;
   private static final float itemNameOffsetX = 8.0F;
   private static final floatHolder_5 panelRadius = floatHolder_5.StringHolder_30(7.0F);
   private static final Font priceFont = Fonts.MEDIUM.getFont(6.0F);
   private static final Font itemNameFont = Fonts.MEDIUM.getFont(6.0F);
   private static final Font selectItemFont = Fonts.MEDIUM.getFont(7.0F);
   private final OnMouseClickedHandler priceBox = new OnMouseClickedHandler(new Vector2f(0.0F, 0.0F), priceFont, "Buy this item for up to", 112.0F);
   private float priceBoxX;
   private float priceBoxY;
   private GetDisplayNameHandler_2 selectedItem;

   public SborHeader() {
      this.priceBox.StringHolder_8(ZenithInternal097$Helper.lI1111lI1IlI1lIllIl1Illl);
      this.priceBox.EventImpl_38(11);
   }

   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2) {
      float f3 = f + 140.0F;
      float f4 = f1 + 4.0F;
      this.priceBoxX = f3 + 336.0F - 128.0F;
      this.priceBoxY = f4;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f3, f4, 336.0F, 23.0F, panelRadius, AutoSborStyle.surface().ZenithInternal039(f2));
      if (this.selectedItem != null) {
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(f3, f4, 23.0F, 23.0F, panelRadius, AutoSborStyle.surface().ZenithInternal039(f2));
         this.renderSelectedItem(iiii1ilili1l1l1lilli1liliii, f3, f4, f2);
         this.renderPriceBox(iiii1ilili1l1l1lilli1liliii, f2);
      } else {
         this.renderSelectItemText(iiii1ilili1l1l1lilli1liliii, f3, f4, f2);
      }
   }

   public void setSelectedItem(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      this.selectedItem = li1ll11ilil1ii1lilll1i;
      if (this.selectedItem == null) {
         this.priceBox.setSelected(false);
      }
   }

   public long getPrice() {
      String s = this.priceBox.II1I11IIl();
      if (s != null && !s.isBlank()) {
         try {
            return Long.parseLong(s);
         } catch (NumberFormatException numberformatexception) {
            return 0L;
         }
      } else {
         return 0L;
      }
   }

   public void setPrice(long i) {
      String s = i <= 0L ? "" : Long.toString(i);
      this.priceBox.GetDisplayNameHandler(s);
      this.priceBox.EventImpl_16(s.length());
   }

   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (ill1iili11ii1l != ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         return false;
      } else if (this.selectedItem == null) {
         return false;
      } else if (this.isPriceBoxHovered(d0, d1)) {
         this.priceBox.setSelected(true);
         return true;
      } else {
         this.priceBox.setSelected(false);
         return false;
      }
   }

   public boolean keyPressed(int i, int j, int k) {
      if (this.selectedItem == null) {
         return false;
      } else if (!this.priceBox.isSelected()) {
         return false;
      } else if (i != 256 && i != 257) {
         return this.priceBox.keyPressed(i, j, k);
      } else {
         this.priceBox.setSelected(false);
         return true;
      }
   }

   public boolean charTyped(char c0, int i) {
      if (this.selectedItem == null) {
         return false;
      } else {
         return !this.priceBox.isSelected() ? false : this.priceBox.charTyped(c0, i);
      }
   }

   private void renderSelectedItem(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2) {
      if (this.selectedItem != null) {
         float f3 = f + 7.5F;
         float f4 = f1 + 7.5F;
         iiii1ilili1l1l1lilli1liliii.getMatrices().push();
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f3, f4, 0.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().scale(0.5F, 0.5F, 1.0F);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, f2);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(this.selectedItem.getItemStack(), 0, 0);
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
         float f5 = f + 23.0F + 8.0F;
         float f6 = f1 + (23.0F - itemNameFont.height()) / 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(itemNameFont, this.selectedItem.getDisplayName(), f5, f6, AutoSborStyle.text().ZenithInternal039(f2));
      }
   }

   private void renderSelectItemText(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2) {
      String s = "Select item";
      float f3 = f + (336.0F - selectItemFont.width(s)) / 2.0F;
      float f4 = f1 + (23.0F - selectItemFont.height()) / 2.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(selectItemFont, s, f3, f4, AutoSborStyle.textTertiary().ZenithInternal039(f2));
   }

   private void renderPriceBox(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f) {
      float f1 = this.priceBoxX + 8.0F;
      float f2 = this.priceBoxY + (23.0F - this.priceBox.IIl1llI1Il111I11I111II().height()) / 2.0F;
      boolean flag = this.isPriceBoxHovered((double)iiii1ilili1l1l1lilli1liliii.l111IIlIl1l1(), (double)iiii1ilili1l1l1lilli1liliii.Ill1lI1III1());
      ByteBufferHolder il1iliilli1l1iill = this.priceBox.isSelected()
         ? AutoSborStyle.transparentText()
         : (flag ? AutoSborStyle.text() : AutoSborStyle.textSecondary());
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(this.priceBoxX, this.priceBoxY, 128.0F, 23.0F, panelRadius, AutoSborStyle.surface().ZenithInternal039(f));
      if (!this.priceBox.isSelected() && !this.priceBox.isEmpty()) {
         this.renderFormattedPrice(iiii1ilili1l1l1lilli1liliii, f1, f2, f);
      } else {
         this.priceBox
            .StringHolder_8(iiii1ilili1l1l1lilli1liliii, f1, f2, AutoSborStyle.text().ZenithInternal039(f), il1iliilli1l1iill.ZenithInternal039(f));
      }
   }

   private void renderFormattedPrice(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2) {
      String s = "$";
      String s1 = this.formatPrice(this.getPrice());
      float f3 = priceFont.width(s);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(priceFont, s, f, f1, AutoSborStyle.primary().ZenithInternal039(f2));
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(priceFont, s1, f + f3, f1, AutoSborStyle.text().ZenithInternal039(f2));
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

   private boolean isPriceBoxHovered(double d0, double d1) {
      return doubleHolder_3.StringHolder_8(d0, d1, (double)this.priceBoxX, (double)this.priceBoxY, 128.0, 23.0);
   }
}
