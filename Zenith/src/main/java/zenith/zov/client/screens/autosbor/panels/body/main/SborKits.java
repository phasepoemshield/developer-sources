package zenith.zov.client.screens.autosbor.panels.body.main;

import zenith.hud.*;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.item.ItemStack;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.doubleHolder;
import zenith.doubleHolder_3;
import zenith.GetStartTimeHandler;
import zenith.GetMaxSumBuyHandler;
import zenith.GetServerHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.autosbor.AutoSborStyle;

public class SborKits {
   private static final float gridXOffset = 140.0F;
   private static final float countPanelYOffset = 31.0F;
   private static final float countPanelHeight = 30.0F;
   private static final float blockGap = 4.0F;
   private static final long layoutAnimationDuration = 180L;
   private static final long nameMoveDuration = 120L;
   private static final long kitAppearDuration = 180L;
   private static final float gridWidth = 223.0F;
   private static final float panelWidth = 104.0F;
   private static final float panelHeight = 34.0F;
   private static final float panelGap = 4.0F;
   private static final float panelLeftGap = 4.0F;
   private static final float listHeight = 251.0F;
   private static final float scrollOffsetX = 4.0F;
   private static final float scrollWidth = 1.0F;
   private static final float scrollHeightGap = 4.0F;
   private static final float minScrollThumbHeight = 20.0F;
   private static final float textOffsetX = 8.0F;
   private static final float textHoverOffsetX = 2.0F;
   private static final float textYOffset = 9.0F;
   private static final float deleteIconRightGap = 8.0F;
   private static final float deleteIconTextGap = 5.0F;
   private static final float deleteIconHitGap = 2.0F;
   private static final float previewOffsetY = 4.0F;
   private static final float kitAppearOffsetY = 6.0F;
   private static final float previewIconSize = 7.0F;
   private static final float previewIconGap = 2.0F;
   private static final int previewItemLimit = 9;
   private static final floatHolder_5 panelRadius = floatHolder_5.StringHolder_30(7.0F);
   private static final floatHolder_5 scrollRadius = floatHolder_5.StringHolder_30(0.5F);
   private static final Font textFont = Fonts.MEDIUM.getFont(6.0F);
   private static final Font deleteIconFont = Fonts.ICONS.getFont(5.0F);
   private static final String deleteIcon = "[";
   private final doubleHolder scrollHandler = new doubleHolder();
   private final Map<GetServerHandler, List<ItemStack>> previewCache = new IdentityHashMap<>();
   private final Map<GetServerHandler, GetStartTimeHandler> nameXAnimations = new IdentityHashMap<>();
   private final Map<GetServerHandler, GetStartTimeHandler> kitAppearAnimations = new IdentityHashMap<>();
   private final GetStartTimeHandler layoutAnimation = new GetStartTimeHandler(180L, 0.0F, IReturn.doubleHolder_4);
   private final Supplier<String> serverSupplier;
   private float listX;
   private float listY;
   private float currentListHeight;
   private float currentScrollHeight;

   public SborKits(Supplier<String> supplier) {
      this.serverSupplier = supplier;
   }

   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, boolean flag, float f2) {
      List list = this.getKits();
      float f3 = this.layoutAnimation.StringHolder_8(flag ? 1.0F : 0.0F);
      this.listX = f + 140.0F + 223.0F + 4.0F;
      this.listY = f1 + this.getListYOffset(f3);
      this.currentListHeight = this.getListHeight(f3);
      this.currentScrollHeight = this.currentListHeight - 4.0F;
      this.updateScroll(list.size());
      this.cleanUnusedKitData(list);
      float f4 = (float)this.scrollHandler.IIIlII1Il1l111lI1();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)this.listX, (int)this.listY, (int)(this.listX + 104.0F), (int)(this.listY + this.currentListHeight));

      for (int i = 0; i < list.size(); i++) {
         GetServerHandler lll111iiili1il1l1ill1il1l = (GetServerHandler)list.get(i);
         float f5 = this.listY + (float)i * 38.0F - f4;
         float f6 = this.getKitAppearProgress(lll111iiili1il1l1ill1il1l);
         float f7 = f5 + (1.0F - f6) * 6.0F;
         float f8 = f2 * f6;
         boolean flag1 = doubleHolder_3.StringHolder_8(
            (double)iiii1ilili1l1l1lilli1liliii.l111IIlIl1l1(), (double)iiii1ilili1l1l1lilli1liliii.Ill1lI1III1(), (double)this.listX, (double)f7, 104.0, 34.0
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(this.listX, f7, 104.0F, 34.0F, panelRadius, AutoSborStyle.surface().ZenithInternal039(f8));
         this.renderKitName(iiii1ilili1l1l1lilli1liliii, lll111iiili1il1l1ill1il1l, this.listX, f7, flag1, f8);
         this.renderDeleteIcon(iiii1ilili1l1l1lilli1liliii, this.listX, f7, f8);
         this.renderKitPreview(iiii1ilili1l1l1lilli1liliii, lll111iiili1il1l1ill1il1l, this.listX, f7, f8);
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

   public GetServerHandler getKitAt(double d0, double d1) {
      int i = this.getKitIndexAt(d0, d1);
      return i < 0 ? null : this.getKits().get(i);
   }

   public GetServerHandler getDeleteKitAt(double d0, double d1) {
      int i = this.getKitIndexAt(d0, d1);
      if (i < 0) {
         return null;
      } else {
         float f = (float)this.scrollHandler.IIIlII1Il1l111lI1();
         float f1 = this.listY + (float)i * 38.0F - f;
         return !this.isDeleteIconHovered(d0, d1, this.listX, f1) ? null : this.getKits().get(i);
      }
   }

   public void removePreview(GetServerHandler lll111iiili1il1l1ill1il1l) {
      this.previewCache.remove(lll111iiili1il1l1ill1il1l);
      this.nameXAnimations.remove(lll111iiili1il1l1ill1il1l);
      this.kitAppearAnimations.remove(lll111iiili1il1l1ill1il1l);
   }

   private float getKitAppearProgress(GetServerHandler lll111iiili1il1l1ill1il1l) {
      GetStartTimeHandler li1liiliill1 = this.kitAppearAnimations
         .computeIfAbsent(lll111iiili1il1l1ill1il1l, lll111iiili1il1l1ill1il1l -> new GetStartTimeHandler(180L, 0.0F, IReturn.doubleHolder_4));
      return li1liiliill1.StringHolder_8(1.0F);
   }

   private void cleanUnusedKitData(List<GetServerHandler> list) {
      this.previewCache.keySet().removeIf(lll111iiili1il1l1ill1il1l -> !this.containsKit(list, lll111iiili1il1l1ill1il1l));
      this.nameXAnimations.keySet().removeIf(lll111iiili1il1l1ill1il1l -> !this.containsKit(list, lll111iiili1il1l1ill1il1l));
      this.kitAppearAnimations.keySet().removeIf(lll111iiili1il1l1ill1il1l -> !this.containsKit(list, lll111iiili1il1l1ill1il1l));
   }

   private boolean containsKit(List<GetServerHandler> list, GetServerHandler lll111iiili1il1l1ill1il1l) {
      for (GetServerHandler lll111iiili1il1l1ill1il1lx : list) {
         if (lll111iiili1il1l1ill1il1lx == lll111iiili1il1l1ill1il1lx) {
            return true;
         }
      }

      return false;
   }

   private int getKitIndexAt(double d0, double d1) {
      if (!this.isHovered(d0, d1)) {
         return -1;
      } else {
         List list = this.getKits();
         float f = (float)this.scrollHandler.IIIlII1Il1l111lI1();
         int i = (int)((d1 - (double)this.listY + (double)f) / 38.0);
         if (i >= 0 && i < list.size()) {
            float f1 = this.listY + (float)i * 38.0F - f;
            return !doubleHolder_3.StringHolder_8(d0, d1, (double)this.listX, (double)f1, 104.0, 34.0) ? -1 : i;
         } else {
            return -1;
         }
      }
   }

   private void renderKitName(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, GetServerHandler lll111iiili1il1l1ill1il1l, float f, float f1, boolean flag, float f2
   ) {
      String s = lll111iiili1il1l1ill1il1l.getName();
      String s1 = s == null ? "" : s;
      float f3 = 86.0F - deleteIconFont.width("[") - 5.0F;
      if (textFont.width(s1) > f3) {
         while (!s1.isEmpty() && textFont.width(s1 + "...") > f3) {
            s1 = s1.substring(0, s1.length() - 1);
         }

         if (!s1.isEmpty()) {
            s1 = s1 + "...";
         }
      }

      GetStartTimeHandler li1liiliill1 = this.nameXAnimations
         .computeIfAbsent(lll111iiili1il1l1ill1il1l, lll111iiili1il1l1ill1il1l -> new GetStartTimeHandler(120L, 0.0F, IReturn.doubleHolder_4));
      float f4 = f + 8.0F + li1liiliill1.StringHolder_8(flag ? 2.0F : 0.0F);
      float f5 = f1 + 9.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(textFont, s1, f4, f5, AutoSborStyle.text().ZenithInternal039(f2));
   }

   private void renderDeleteIcon(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2) {
      float f3 = f + 104.0F - 8.0F - deleteIconFont.width("[");
      float f4 = f1 + 9.0F + (textFont.height() - deleteIconFont.height()) / 2.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         deleteIconFont,
         "[",
         f3,
         f4,
         (this.isDeleteIconHovered((double)iiii1ilili1l1l1lilli1liliii.l111IIlIl1l1(), (double)iiii1ilili1l1l1lilli1liliii.Ill1lI1III1(), f, f1)
               ? AutoSborStyle.text()
               : AutoSborStyle.textTertiary())
            .ZenithInternal039(f2)
      );
   }

   private boolean isDeleteIconHovered(double d0, double d1, float f, float f1) {
      float f2 = f + 104.0F - 8.0F - deleteIconFont.width("[");
      float f3 = f1 + 9.0F + (textFont.height() - deleteIconFont.height()) / 2.0F;
      return doubleHolder_3.StringHolder_8(
         d0, d1, (double)(f2 - 2.0F), (double)(f3 - 2.0F), (double)(deleteIconFont.width("[") + 4.0F), (double)(deleteIconFont.height() + 4.0F)
      );
   }

   private void renderKitPreview(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, GetServerHandler lll111iiili1il1l1ill1il1l, float f, float f1, float f2
   ) {
      List list = this.previewCache.computeIfAbsent(lll111iiili1il1l1ill1il1l, this::buildPreviewStacks);
      float f3 = f1 + 9.0F + textFont.height() + 4.0F;
      float f4 = 0.4375F;

      for (int i = 0; i < list.size(); i++) {
         ItemStack ItemStack = (ItemStack)list.get(i);
         float f5 = f + 8.0F + (float)i * 9.0F;
         iiii1ilili1l1l1lilli1liliii.getMatrices().push();
         iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f5, f3, 0.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().scale(f4, f4, 1.0F);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, f2);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(ItemStack, 0, 0);
         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
      }
   }

   private List<ItemStack> buildPreviewStacks(GetServerHandler lll111iiili1il1l1ill1il1l) {
      ArrayList arraylist = new ArrayList(9);

      for (GetMaxSumBuyHandler lill1l111l1l11ii11i1ii11ii1 : lll111iiili1il1l1ill1il1l.ZenithInternal066()) {
         if (arraylist.size() >= 9) {
            break;
         }

         ItemStack ItemStack = lill1l111l1l11ii11i1ii11ii1.ListHolder_8();
         if (!ItemStack.isEmpty()) {
            arraylist.add(ItemStack);
         }
      }

      return arraylist;
   }

   private void updateScroll(int i) {
      this.scrollHandler.ZenithInternal084((double)Math.max(0.0F, this.getContentHeight(i) - this.currentListHeight));
      this.scrollHandler.Coordinates();
   }

   private float getContentHeight(int i) {
      return i <= 0 ? 0.0F : (float)i * 34.0F + (float)(i - 1) * 4.0F;
   }

   private float getListYOffset(float f) {
      return 31.0F + 34.0F * f;
   }

   private float getListHeight(float f) {
      return 251.0F + 34.0F * (1.0F - f);
   }

   private void renderScrollBar(floatHolder_4 iiii1ilili1l1l1lilli1liliii, int i, float f) {
      float f1 = this.getContentHeight(i);
      if (!(this.scrollHandler.l1IIlIIlI11lII1() <= 0.0) && !(f1 <= this.currentListHeight)) {
         float f2 = this.listX + 104.0F + 4.0F;
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

   private boolean isHovered(double d0, double d1) {
      return doubleHolder_3.StringHolder_8(d0, d1, (double)this.listX, (double)this.listY, 104.0, (double)this.currentListHeight);
   }

   private List<GetServerHandler> getKits() {
      return ZenithClient.getInstance().ModuleManager().EventImpl_38(this.getServer());
   }

   private String getServer() {
      return this.serverSupplier == null ? "HolyWorld" : this.serverSupplier.get();
   }
}
