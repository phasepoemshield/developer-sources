package zenith.zov.client.screens.autosbor.panels.body.main;

import zenith.hud.*;

import com.mojang.blaze3d.systems.RenderSystem;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.client.util.math.Vector2f;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.NumberSetting;
import zenith.doubleHolder_3;
import zenith.OnMouseClickedHandler;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.GetDisplayNameHandler_2;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.autosbor.AutoSborStyle;

public class SborInventory {
   private static final float panelXOffset = 140.0F;
   private static final float panelYOffset = 31.0F;
   private static final float panelWidth = 336.0F;
   private static final float panelHeight = 30.0F;
   private static final float countSettingYOffset = 8.0F;
   private static final float blockGap = 4.0F;
   private static final float slotSize = 23.0F;
   private static final float itemIconSize = 8.0F;
   private static final float itemIconScale = 0.5F;
   private static final float itemCountOffset = 6.0F;
   private static final float slotGap = 2.0F;
   private static final int gridColumns = 9;
   private static final int gridRows = 4;
   private static final float bottomPanelWidth = 223.0F;
   private static final float bottomPanelHeight = 21.0F;
   private static final float inventoryNameOffsetX = 9.0F;
   private static final float inventoryNameIconGap = 8.0F;
   private static final float inventoryNameIconYOffset = -0.5F;
   private static final float createIconGap = 2.0F;
   private static final float bottomPanelGap = 2.0F;
   private static final long layoutAnimationDuration = 180L;
   private static final float animationEpsilon = 0.001F;
   private static final floatHolder_5 panelRadius = floatHolder_5.StringHolder_30(7.0F);
   private static final floatHolder_5 bottomPanelRadius = floatHolder_5.StringHolder_30(8.0F);
   private static final Font inventoryNameFont = Fonts.MEDIUM.getFont(6.0F);
   private static final Font inventoryNameIconFont = Fonts.ICONS.getFont(7.0F);
   private static final Font createIconFont = Fonts.ICONS.getFont(6.0F);
   private static final Font itemCountFont = Fonts.MEDIUM.getFont(5.0F);
   private static final String inventoryNamePlaceholder = "Inventory name";
   private static final String inventoryNameIcon = "7";
   private static final String createIcon = "{";
   private static final int defaultCountMax = 64;
   private final GetDisplayNameHandler_2[] slots;
   private final NumberSetting countSetting = new NumberSetting("Количество", 1.0F, 1.0F, 64.0F, 1.0F);
   private final NumberSetting minDurabilitySetting = new NumberSetting("Мин. прочность", 0.8F, 0.0F, 1.0F, 0.1F);
   private final OnMouseClickedHandler inventoryNameBox = new OnMouseClickedHandler(
      new Vector2f(0.0F, 0.0F), inventoryNameFont, "Inventory name", 205.0F - inventoryNameIconFont.width("7") - 8.0F
   );
   private final GetStartTimeHandler layoutAnimation = new GetStartTimeHandler(180L, 0.0F, IReturn.doubleHolder_4);
   private HeightHandler sliderBounds;
   private float panelX;
   private float panelY;
   private float gridX;
   private float gridY;
   private float inventoryNamePanelX;
   private float inventoryNamePanelY;
   private float createPanelX;
   private float createPanelY;
   private int countMax = 64;
   private boolean countVisible;
   private boolean durabilityVisible;
   private boolean draggingSlider;

   public SborInventory(GetDisplayNameHandler_2[] ali1ll11ilil1ii1lilll1i) {
      this.slots = ali1ll11ilil1ii1lilll1i;
   }

   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, int[] aint, int i, boolean flag, float f4) {
      this.panelX = f + 140.0F;
      this.panelY = f1 + 31.0F;
      this.gridX = this.panelX;
      this.durabilityVisible = flag;
      boolean flag1 = this.countVisible || flag;
      float f5 = this.layoutAnimation.StringHolder_8(flag1 ? 1.0F : 0.0F);
      this.gridY = f1 + this.getGridYOffset(f5);
      float f6 = f5 * f4;
      if (f5 > 0.001F) {
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(this.panelX, this.panelY, 336.0F, 30.0F, panelRadius, AutoSborStyle.surface().ZenithInternal039(f6));
         this.renderPanelSetting(iiii1ilili1l1l1lilli1liliii, f2, f3, f6);
      }

      this.renderGrid(iiii1ilili1l1l1lilli1liliii, aint, i, f4);
      float f7 = this.gridY + this.getGridHeight() + 4.0F;
      this.renderInventoryNamePanel(iiii1ilili1l1l1lilli1liliii, this.panelX, f7, f4);
      this.renderCreatePanel(iiii1ilili1l1l1lilli1liliii, this.panelX, f7 + 21.0F + 2.0F, f4);
   }

   public boolean placeItem(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i, double d0, double d1) {
      int i = this.getSlotIndex(d0, d1);
      if (i < 0) {
         return false;
      } else {
         this.slots[i] = li1ll11ilil1ii1lilll1i;
         return true;
      }
   }

   public GetDisplayNameHandler_2 getItem(int i) {
      return !this.isSlotIndexValid(i) ? null : this.slots[i];
   }

   public void setItem(int i, GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      if (this.isSlotIndexValid(i)) {
         this.slots[i] = li1ll11ilil1ii1lilll1i;
      }
   }

   public void clearSlot(int i) {
      this.setItem(i, null);
   }

   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (ill1iili11ii1l != ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         return false;
      } else if ((this.countVisible || this.durabilityVisible)
         && doubleHolder_3.StringHolder_8(d0, d1, (double)this.panelX, (double)this.panelY, 336.0, 30.0)) {
         this.inventoryNameBox.setSelected(false);
         if (this.sliderBounds != null && this.sliderBounds.byteHolder(d0, d1)) {
            this.draggingSlider = true;
            this.updateSlider(d0);
            ZenithClient.getInstance()
               .MinecraftClientHolder_5()
               .StringHolder_8(ZenithClient.getInstance().MinecraftClientHolder_5().IIl1l1II1I11IllI1I111Ill1);
         }

         return true;
      } else if (this.isInventoryNameHovered(d0, d1)) {
         this.inventoryNameBox.setSelected(true);
         return true;
      } else {
         this.inventoryNameBox.setSelected(false);
         return false;
      }
   }

   public void onMouseReleased(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         this.draggingSlider = false;
      }
   }

   public boolean keyPressed(int i, int j, int k) {
      if (!this.inventoryNameBox.isSelected()) {
         return false;
      } else if (i != 256 && i != 257) {
         return this.inventoryNameBox.keyPressed(i, j, k);
      } else {
         this.inventoryNameBox.setSelected(false);
         return true;
      }
   }

   public boolean charTyped(char c0, int i) {
      return !this.inventoryNameBox.isSelected() ? false : this.inventoryNameBox.charTyped(c0, i);
   }

   public String getInventoryName() {
      return this.inventoryNameBox.II1I11IIl() == null ? "" : this.inventoryNameBox.II1I11IIl().trim();
   }

   public int getCount() {
      return Math.max(1, Math.min(this.countMax, Math.round(this.countSetting.lll1lI1llll1IIllIIIII1lll())));
   }

   public void setCount(int i) {
      this.countSetting.longHolder_4(Math.max(this.countSetting.Il1llI11l1(), (float)Math.min(this.countMax, i)));
   }

   public void setCountMax(int i) {
      this.countMax = Math.max(1, Math.min(64, i));
      this.setCount(this.getCount());
   }

   public float getMinDurability() {
      return this.minDurabilitySetting.lll1lI1llll1IIllIIIII1lll();
   }

   public void setMinDurability(float f) {
      this.minDurabilitySetting
         .longHolder_4(Math.max(this.minDurabilitySetting.Il1llI11l1(), Math.min(this.minDurabilitySetting.Il1IIllllIIIll1I1IIIIIlI(), f)));
   }

   public void setCountVisible(boolean flag) {
      this.countVisible = flag;
   }

   public void setDurabilityVisible(boolean flag) {
      this.durabilityVisible = flag;
   }

   public boolean isCreateHovered(double d0, double d1) {
      return doubleHolder_3.StringHolder_8(d0, d1, (double)this.createPanelX, (double)this.createPanelY, 223.0, 21.0);
   }

   private void renderPanelSetting(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f12, float f1) {
      NumberSetting illil1lill1llll11 = this.getActiveSetting();
      if (illil1lill1llll11 != null) {
         if (illil1lill1llll11 == this.countSetting) {
            this.setCount(this.getCount());
         }

         Font font = Fonts.MEDIUM.getFont(6.0F);
         Font font1 = Fonts.ICONS.getFont(6.0F);
         float f2 = this.panelY + 8.0F;
         float f3 = 8.0F;
         float f4 = this.panelX + f3;
         float f5 = f4 + 10.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font1, "D", f4, f2, AutoSborStyle.primary().ZenithInternal039(f1));
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, illil1lill1llll11.getName(), f5, f2, AutoSborStyle.text().ZenithInternal039(f1));
         String s = this.formatSettingValue(illil1lill1llll11);
         float f6 = this.panelX + 336.0F - f3 - font.width(s);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s, f6, f2, AutoSborStyle.primary().ZenithInternal039(f1));
         float f7 = 120.0F;
         float f8 = this.panelX + 336.0F - f3 - 4.0F - f7;
         float f9 = f2 + 12.0F;
         float f10 = this.getSettingPercent(illil1lill1llll11);
         float f11 = f7 * f10;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f8, f9, f7, 2.0F, floatHolder_5.StringHolder_30(0.2F), AutoSborStyle.fieldSurface().ZenithInternal039(f1)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f8, f9, Math.max(0.0F, f11 - 2.0F), 2.0F, floatHolder_5.IlI11I1ll1lI1I11IlI1Il1, AutoSborStyle.primary().ZenithInternal039(f1)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f8 + f11, f9 - 1.0F, 4.0F, 4.0F, floatHolder_5.StringHolder_30(2.0F), AutoSborStyle.text().ZenithInternal039(f1)
         );
         this.sliderBounds = new HeightHandler(f8, f9 - 2.0F, f7, 6.0F);
         this.updateSlider((double)f);
      }
   }

   private NumberSetting getActiveSetting() {
      if (this.countVisible) {
         return this.countSetting;
      } else {
         return this.durabilityVisible ? this.minDurabilitySetting : null;
      }
   }

   private float getSettingPercent(NumberSetting illil1lill1llll11) {
      return illil1lill1llll11.Il1IIllllIIIll1I1IIIIIlI() == illil1lill1llll11.Il1llI11l1()
         ? 0.0F
         : Math.max(
            0.0F,
            Math.min(
               1.0F,
               (illil1lill1llll11.lll1lI1llll1IIllIIIII1lll() - illil1lill1llll11.Il1llI11l1())
                  / (illil1lill1llll11.Il1IIllllIIIll1I1IIIIIlI() - illil1lill1llll11.Il1llI11l1())
            )
         );
   }

   private void updateSlider(double d0) {
      if (this.draggingSlider && this.sliderBounds != null) {
         NumberSetting illil1lill1llll11 = this.getActiveSetting();
         if (illil1lill1llll11 != null) {
            double d1 = d0 - (double)this.sliderBounds.Il11lIlllI111I1l1111();
            double d2 = Math.max(0.0, Math.min(1.0, d1 / (double)this.sliderBounds.width()));
            double d3 = (double)illil1lill1llll11.Il1llI11l1() + (double)(illil1lill1llll11.Il1IIllllIIIll1I1IIIIIlI() - illil1lill1llll11.Il1llI11l1()) * d2;
            float f = illil1lill1llll11.IIl11llIllllI1lI11I();
            d3 = (double)((float)Math.round((d3 - (double)illil1lill1llll11.Il1llI11l1()) / (double)f) * f + illil1lill1llll11.Il1llI11l1());
            d3 = Math.max((double)illil1lill1llll11.Il1llI11l1(), Math.min((double)illil1lill1llll11.Il1IIllllIIIll1I1IIIIIlI(), d3));
            if (illil1lill1llll11.lll1lI1llll1IIllIIIII1lll() != (float)d3) {
               ZenithClient.getInstance()
                  .MinecraftClientHolder_5()
                  .StringHolder_8(ZenithClient.getInstance().MinecraftClientHolder_5().II11l111l1IllII);
            }

            illil1lill1llll11.longHolder_4((float)d3);
            if (illil1lill1llll11 == this.countSetting) {
               this.setCount(this.getCount());
            }
         }
      }
   }

   private String formatSettingValue(NumberSetting illil1lill1llll11) {
      String s = String.valueOf(illil1lill1llll11.IIl11llIllllI1lI11I());
      int i = 0;
      int j = s.indexOf(46);
      if (j >= 0) {
         i = s.length() - j - 1;

         while (i > 0 && s.charAt(j + i) == '0') {
            i--;
         }
      }

      DecimalFormat decimalformat = new DecimalFormat();
      decimalformat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
      decimalformat.setMinimumFractionDigits(i);
      decimalformat.setMaximumFractionDigits(i);
      decimalformat.setGroupingUsed(false);
      return decimalformat.format((double)illil1lill1llll11.lll1lI1llll1IIllIIIII1lll());
   }

   private void renderGrid(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int[] aint, int i, float f) {
      for (int j = 0; j < 4; j++) {
         for (int k = 0; k < 9; k++) {
            int l = j * 9 + k;
            float f1 = this.gridX + (float)k * 25.0F;
            float f2 = this.gridY + (float)j * 25.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(f1, f2, 23.0F, 23.0F, panelRadius, AutoSborStyle.surface().ZenithInternal039(f));
            if (this.slots[l] != null) {
               this.renderSlotItem(iiii1ilili1l1l1lilli1liliii, this.slots[l], f1, f2, f);
               this.renderSlotCount(iiii1ilili1l1l1lilli1liliii, this.slots[l], aint, i, l, f1, f2, f);
            }
         }
      }
   }

   private void renderSlotItem(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i, float f, float f1, float f2
   ) {
      float f3 = f + 7.5F;
      float f4 = f1 + 7.5F;
      iiii1ilili1l1l1lilli1liliii.getMatrices().push();
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f3, f4, 0.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().scale(0.5F, 0.5F, 1.0F);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, f2);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(li1ll11ilil1ii1lilll1i.getItemStack(), 0, 0);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
   }

   private void renderSlotCount(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i,
      int[] aint,
      int i,
      int j,
      float f,
      float f1,
      float f2
   ) {
      if (li1ll11ilil1ii1lilll1i.getItemStack().getMaxCount() > 1 || this.isPotion(li1ll11ilil1ii1lilll1i.getItemStack().getItem())) {
         int k = this.getSlotCount(li1ll11ilil1ii1lilll1i, aint, i, j);
         if (k > 1) {
            String s = "x" + k;
            float f3 = f + 23.0F - 6.0F - itemCountFont.width(s);
            float f4 = f1 + 23.0F - 6.0F - itemCountFont.height();
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(itemCountFont, s, f3, f4, AutoSborStyle.text().ZenithInternal039(f2));
         }
      }
   }

   private int getSlotCount(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i, int[] aint, int i, int j) {
      int k = j == i && this.countVisible ? this.getCount() : this.getStoredSlotCount(aint, j);
      return k > 0 ? k : this.getDefaultCount(li1ll11ilil1ii1lilll1i);
   }

   private int getStoredSlotCount(int[] aint, int i) {
      return aint != null && i >= 0 && i < aint.length ? aint[i] : 0;
   }

   private int getDefaultCount(GetDisplayNameHandler_2 li1ll11ilil1ii1lilll1i) {
      return li1ll11ilil1ii1lilll1i != null && !li1ll11ilil1ii1lilll1i.getItemStack().isEmpty()
         ? Math.max(1, li1ll11ilil1ii1lilll1i.getItemStack().getCount())
         : 1;
   }

   private boolean isPotion(Item Item) {
      return Item == Items.POTION || Item == Items.SPLASH_POTION || Item == Items.LINGERING_POTION;
   }

   private float getGridYOffset(float f) {
      return 31.0F + 34.0F * f;
   }

   private float getGridHeight() {
      return 98.0F;
   }

   private void renderBottomPanel(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2) {
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f, f1, 223.0F, 21.0F, bottomPanelRadius, AutoSborStyle.fieldSurface().ZenithInternal039(f2));
      iiii1ilili1l1l1lilli1liliii.EventBus(f, f1, 223.0F, 21.0F, -0.1F, bottomPanelRadius, AutoSborStyle.fieldBorder().ZenithInternal039(f2));
   }

   private void renderInventoryNamePanel(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2) {
      this.inventoryNamePanelX = f;
      this.inventoryNamePanelY = f1;
      this.renderBottomPanel(iiii1ilili1l1l1lilli1liliii, f, f1, f2);
      float f3 = f + 9.0F;
      float f4 = f3 + inventoryNameIconFont.width("7") + 8.0F;
      float f5 = f1 + (21.0F - this.inventoryNameBox.IIl1llI1Il111I11I111II().height()) / 2.0F;
      boolean flag = doubleHolder_3.StringHolder_8(
         (double)iiii1ilili1l1l1lilli1liliii.l111IIlIl1l1(), (double)iiii1ilili1l1l1lilli1liliii.Ill1lI1III1(), (double)f, (double)f1, 223.0, 21.0
      );
      ByteBufferHolder il1iliilli1l1iill = flag ? AutoSborStyle.text() : AutoSborStyle.textSecondary();
      this.renderInventoryNameIcon(iiii1ilili1l1l1lilli1liliii, f3, f1, f2);
      this.inventoryNameBox
         .StringHolder_8(iiii1ilili1l1l1lilli1liliii, f4, f5, AutoSborStyle.text().ZenithInternal039(f2), il1iliilli1l1iill.ZenithInternal039(f2));
   }

   private void renderInventoryNameIcon(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2) {
      float f3 = f1 + (21.0F - inventoryNameIconFont.height()) / 2.0F + -0.5F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(inventoryNameIconFont, "7", f, f3, AutoSborStyle.textTertiary().ZenithInternal039(f2));
   }

   private void renderCreatePanel(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2) {
      this.createPanelX = f;
      this.createPanelY = f1;
      this.renderBottomPanel(iiii1ilili1l1l1lilli1liliii, f, f1, f2);
      String s = "Create";
      float f3 = inventoryNameFont.width(s);
      float f4 = createIconFont.width("{");
      float f5 = f3 + 2.0F + f4;
      float f6 = f + (223.0F - f5) / 2.0F;
      float f7 = f6 + f4 + 2.0F;
      float f8 = f1 + (21.0F - inventoryNameFont.height()) / 2.0F;
      float f9 = f1 + (21.0F - createIconFont.height()) / 2.0F;
      ByteBufferHolder il1iliilli1l1iill = doubleHolder_3.StringHolder_8(
            (double)iiii1ilili1l1l1lilli1liliii.l111IIlIl1l1(), (double)iiii1ilili1l1l1lilli1liliii.Ill1lI1III1(), (double)f, (double)f1, 223.0, 21.0
         )
         ? AutoSborStyle.text()
         : AutoSborStyle.textSecondary();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(createIconFont, "{", f6, f9, il1iliilli1l1iill.ZenithInternal039(f2));
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(inventoryNameFont, s, f7, f8, il1iliilli1l1iill.ZenithInternal039(f2));
   }

   public int getSlotIndex(double d0, double d1) {
      if (!doubleHolder_3.StringHolder_8(d0, d1, (double)this.gridX, (double)this.gridY, 223.0, 98.0)) {
         return -1;
      } else {
         int i = (int)((d0 - (double)this.gridX) / 25.0);
         int j = (int)((d1 - (double)this.gridY) / 25.0);
         if (i >= 0 && i < 9 && j >= 0 && j < 4) {
            float f = this.gridX + (float)i * 25.0F;
            float f1 = this.gridY + (float)j * 25.0F;
            return !doubleHolder_3.StringHolder_8(d0, d1, (double)f, (double)f1, 23.0, 23.0) ? -1 : j * 9 + i;
         } else {
            return -1;
         }
      }
   }

   private boolean isSlotIndexValid(int i) {
      return i >= 0 && i < this.slots.length;
   }

   private boolean isInventoryNameHovered(double d0, double d1) {
      return doubleHolder_3.StringHolder_8(d0, d1, (double)this.inventoryNamePanelX, (double)this.inventoryNamePanelY, 223.0, 21.0);
   }
}
