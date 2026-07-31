package zenith.zov.client.screens.menu.panels;

import zenith.hud.*;

import java.util.Locale;
import net.minecraft.util.math.MathHelper;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.Category;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.floatHolder_8;
import zenith.OnMouseClickedHandler;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.IdentifierHolder_2;
import zenith.Module;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;

public class HeaderPanel {
   private HeightHandler themeButtonBounds;
   private HeightHandler searchBarBounds;
   private HeightHandler translateBounds;
   private HeightHandler layoutToggleButtonBounds;
   private final OnMouseClickedHandler searchField;
   private final Runnable onLayoutToggle;
   private final Runnable onThemeSwitch;
   private Category lastCategory = Category.IIII1111111II;
   GetStartTimeHandler animation = new GetStartTimeHandler(300L, 1.0F, IReturn.ListHolder_8);

   public HeaderPanel(OnMouseClickedHandler li111l1i1ili111111ll1iiii1, Runnable runnable, Runnable runnable1) {
      this.searchField = li111l1i1ili111111ll1iiii1;
      this.onLayoutToggle = runnable;
      this.onThemeSwitch = runnable1;
   }

   public void render(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f,
      float f1,
      float f2,
      int i,
      float f3,
      float f4,
      SetColorHandler_3 llliili1l1ii11i1lii1,
      Category iill11i1il1ilii11iii1llil1ll
   ) {
      this.animation.StringHolder_8(1.0F);
      ByteBufferHolder il1iliilli1l1iill = llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l().ZenithInternal039(f4);
      ByteBufferHolder il1iliilli1l1iill1 = llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl().ZenithInternal039(f4);
      float f5 = this.renderBreadcrumbs(iiii1ilili1l1l1lilli1liliii, f, f1, f4, llliili1l1ii11i1lii1, iill11i1il1ilii11iii1llil1ll, il1iliilli1l1iill1);
      f5 += 8.0F;
      f5 = this.renderStats(iiii1ilili1l1l1lilli1liliii, f5, f1, f4, llliili1l1ii11i1lii1, iill11i1il1ilii11iii1llil1ll, il1iliilli1l1iill1);
      f5 += 8.0F;
      f5 = this.renderThemeButton(iiii1ilili1l1l1lilli1liliii, f5, f1, f4, llliili1l1ii11i1lii1);
      f5 += 8.0F;
      f5 = this.renderTranslateButton(iiii1ilili1l1l1lilli1liliii, f5, f1, f4, llliili1l1ii11i1lii1);
      f5 += 8.0F;
      this.renderLayoutButton(iiii1ilili1l1l1lilli1liliii, f5, f1, f4, llliili1l1ii11i1lii1, i);
      this.renderSearchBar(iiii1ilili1l1l1lilli1liliii, f2, f1, f3, f4, llliili1l1ii11i1lii1);
   }

   private float renderBreadcrumbs(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f,
      float f1,
      float f2,
      SetColorHandler_3 llliili1l1ii11i1lii1,
      Category iill11i1il1ilii11iii1llil1ll,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      String s = iill11i1il1ilii11iii1llil1ll.getName();
      Font font = Fonts.MEDIUM.getFont(7.0F);
      Font font1 = Fonts.ICONS.getFont(7.0F);
      Font font2 = Fonts.ICONS.getFont(5.0F);
      float f3 = 7.0F;
      float f4 = 6.0F;
      float f5 = 7.0F;
      float f6 = 8.0F;
      float f7 = 4.0F;
      float f8 = 2.0F;
      float f9 = MathHelper.lerp(this.animation.CloudFriendInfo(), font.width(this.lastCategory.getName()), font.width(s));
      float f10 = f6 * 2.0F + f3 + f7 + f4 + f5 + f8 + f9;
      float f11 = 22.0F;
      ByteBufferHolder il1iliilli1l1iill1 = llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l().ZenithInternal039(f2);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f, f1, f10, f11, floatHolder_5.StringHolder_30(7.0F), il1iliilli1l1iill1);
      floatHolder_8.EventTarget(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         f,
         f1,
         f10,
         f11,
         -0.1F,
         floatHolder_5.StringHolder_30(7.0F),
         llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il().ZenithInternal039(f2)
      );
      float f12 = f + f6;
      float f13 = f1 + f11 / 2.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1, "7", f12, f13 - font1.height() / 2.0F - 0.5F, llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
      );
      f12 += font1.width("7") + f7;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font2, "A", f12 + 1.0F, f13 - font2.height() / 2.0F - 0.3F, llliili1l1ii11i1lii1.I1llIl11Il().ZenithInternal039(f2)
      );
      f12 += font2.width("A") + f7;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)f + 20, (int)f1, (int)(f + f10), (int)(f1 + f11));
      float f14 = (1.0F - this.animation.CloudFriendInfo()) * font.width(s) * 2.0F;
      float f15 = this.animation.CloudFriendInfo() * font.width(this.lastCategory.getName());
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font, s, f12 + f14, f13 - font.height() / 2.0F, il1iliilli1l1iill.ZenithInternal039(this.animation.CloudFriendInfo())
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font,
         this.lastCategory.getName(),
         f12 - f15,
         f13 - font.height() / 2.0F,
         il1iliilli1l1iill.ZenithInternal039(1.0F - this.animation.CloudFriendInfo())
      );
      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      return f + f10;
   }

   private float renderStats(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f,
      float f1,
      float f2,
      SetColorHandler_3 llliili1l1ii11i1lii1,
      Category iill11i1il1ilii11iii1llil1ll,
      ByteBufferHolder il1iliilli1l1iill
   ) {
      int i = 0;
      int j = 0;

      for (Module ll111il1lliill11 : ZenithClient.getInstance().getModuleManager().getModules()) {
         if (ll111il1lliill11.getCategory() == iill11i1il1ilii11iii1llil1ll) {
            j++;
            if (ll111il1lliill11.Spider()) {
               i++;
            }
         }
      }

      Font font = Fonts.MEDIUM.getFont(7.0F);
      Font font1 = Fonts.ICONS.getFont(7.0F);
      float f3 = 8.0F
         + font1.width(iill11i1il1ilii11iii1llil1ll.getIcon())
         + 4.0F
         + font.width(String.valueOf(i))
         + 1.0F
         + 8.0F
         + 1.0F
         + font1.width(iill11i1il1ilii11iii1llil1ll.getIcon())
         + 4.0F
         + font.width(String.valueOf(j))
         + 8.0F;
      float f4 = 22.0F;
      ByteBufferHolder il1iliilli1l1iill1 = llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l().ZenithInternal039(f2);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f, f1, f3, f4, floatHolder_5.StringHolder_30(7.0F), il1iliilli1l1iill1);
      floatHolder_8.EventTarget(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         f,
         f1,
         f3,
         f4,
         -0.1F,
         floatHolder_5.StringHolder_30(7.0F),
         llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il().ZenithInternal039(f2)
      );
      float f5 = 7.0F;
      float f6 = f + 8.0F;
      float f7 = f1 + (f4 - font.height()) / 2.0F;
      float f8 = f1 + (f4 - font1.height()) / 2.0F - 0.5F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1,
         iill11i1il1ilii11iii1llil1ll.getIcon(),
         f6 + (float)(iill11i1il1ilii11iii1llil1ll.getIcon().equals("2") ? 1 : 0),
         f8,
         llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
      );
      f6 += font1.width(iill11i1il1ilii11iii1llil1ll.getIcon()) + 4.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, String.valueOf(i), f6, f7, il1iliilli1l1iill);
      f6 += font.width(String.valueOf(i));
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         new IdentifierHolder_2("icons/separator.png"), ++f6, f8 - 1.0F, 8.0F, 8.0F, ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
      );
      f6 += 9.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1, iill11i1il1ilii11iii1llil1ll.getIcon(), f6, f8, llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2)
      );
      f6 += font1.width(iill11i1il1ilii11iii1llil1ll.getIcon()) + 4.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, String.valueOf(j), f6, f7, il1iliilli1l1iill);
      return f + f3;
   }

   private float renderTranslateButton(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, SetColorHandler_3 llliili1l1ii11i1lii1
   ) {
      float f3 = 22.0F;
      this.translateBounds = new HeightHandler(f, f1, f3, f3);
      String s = ZenithClient.getInstance().StringHolder_31().floatHolder().toUpperCase(Locale.ENGLISH);
      ByteBufferHolder il1iliilli1l1iill = llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l().ZenithInternal039(f2);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f, f1, f3, f3, floatHolder_5.StringHolder_30(6.0F), il1iliilli1l1iill);
      floatHolder_8.EventTarget(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         f,
         f1,
         f3,
         f3,
         -0.1F,
         floatHolder_5.StringHolder_30(6.0F),
         llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il().ZenithInternal039(f2)
      );
      Font font = Fonts.ICONS.getFont(6.0F);
      float f4 = f + f3 - 2.0F - font.width("X");
      float f5 = f1 + f3 - 3.0F - font.height();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, "X", f4, f5, llliili1l1ii11i1lii1.I111llllll1ll1l1Il().ZenithInternal039(f2));
      font = Fonts.BOLD.getFont(7.0F);
      f4 = f + (f3 - font.width(s)) / 2.0F;
      f5 = f1 + (f3 - font.height()) / 2.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s, f4, f5, llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2));
      return f + f3;
   }

   private float renderThemeButton(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, SetColorHandler_3 llliili1l1ii11i1lii1
   ) {
      float f3 = 22.0F;
      this.themeButtonBounds = new HeightHandler(f, f1, f3, f3);
      this.drawIconButton(iiii1ilili1l1l1lilli1liliii, f, f1, f3, llliili1l1ii11i1lii1.getIcon(), f2, llliili1l1ii11i1lii1);
      return f + f3;
   }

   private float renderLayoutButton(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, SetColorHandler_3 llliili1l1ii11i1lii1, int i
   ) {
      float f3 = 22.0F;
      this.layoutToggleButtonBounds = new HeightHandler(f, f1, f3, f3);
      String s = i == 2 ? ":" : (i == 3 ? ";" : "9");
      this.drawIconButton(iiii1ilili1l1l1lilli1liliii, f, f1, f3, s, f2, llliili1l1ii11i1lii1);
      return f + f3;
   }

   private void drawIconButton(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, String s, float f3, SetColorHandler_3 llliili1l1ii11i1lii1
   ) {
      ByteBufferHolder il1iliilli1l1iill = llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l().ZenithInternal039(f3);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f, f1, f2, f2, floatHolder_5.StringHolder_30(6.0F), il1iliilli1l1iill);
      floatHolder_8.EventTarget(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         f,
         f1,
         f2,
         f2,
         -0.1F,
         floatHolder_5.StringHolder_30(6.0F),
         llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il().ZenithInternal039(f3)
      );
      Font font = Fonts.ICONS.getFont(7.0F);
      float f4 = f + (f2 - font.width(s)) / 2.0F;
      float f5 = f1 + (f2 - font.height()) / 2.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s, f4, f5, llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f3));
   }

   private void renderSearchBar(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, SetColorHandler_3 llliili1l1ii11i1lii1
   ) {
      float f4 = 128.0F;
      float f5 = 22.0F;
      float f6 = 8.0F;
      float f7 = f + f2 - f6 - f4;
      this.searchBarBounds = new HeightHandler(f7, f1, f4, f5);
      ByteBufferHolder il1iliilli1l1iill = llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l().ZenithInternal039(f3);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f7, f1, f4, f5, floatHolder_5.StringHolder_30(6.0F), il1iliilli1l1iill);
      floatHolder_8.EventTarget(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         f7,
         f1,
         f4,
         f5,
         -0.1F,
         floatHolder_5.StringHolder_30(6.0F),
         llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il().ZenithInternal039(f3)
      );
      Font font = Fonts.MEDIUM.getFont(7.0F);
      String s = this.searchField.II1I11IIl();
      boolean flag = s.isEmpty() && !this.searchField.isSelected();
      float f8 = f1 + (f5 - font.height()) / 2.0F;
      if (flag) {
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font, "Search", f7 + 8.0F, f8, llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl().ZenithInternal039(f3 * 0.5F)
         );
      } else {
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            (int)f7 + 8, (int)f8 - 10, (int)Math.ceil((double)(f7 + 8.0F + 128.0F)), (int)Math.ceil((double)f8) + 10
         );
         this.searchField
            .StringHolder_8(
               iiii1ilili1l1l1lilli1liliii,
               f7 + 8.0F,
               f8,
               llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl().ZenithInternal039(f3),
               llliili1l1ii11i1lii1.I1111IIl1ll1l111lIIl111lIl().ZenithInternal039(f3 * 0.5F)
            );
         iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      }
   }

   public void resetAnim(Category iill11i1il1ilii11iii1llil1ll, Category iill11i1il1ilii11iii1llil1ll1) {
      this.animation.EventTarget(0.0F);
      this.lastCategory = iill11i1il1ilii11iii1llil1ll;
   }

   public boolean handleMouseClicked(double d0, double d1) {
      if (this.layoutToggleButtonBounds.byteHolder(d0, d1)) {
         this.onLayoutToggle.run();
         return true;
      } else if (this.themeButtonBounds.byteHolder(d0, d1)) {
         this.onThemeSwitch.run();
         return true;
      } else if (this.translateBounds.byteHolder(d0, d1)) {
         ZenithClient.getInstance().StringHolder_31().PlayerEntityHolder();
         return true;
      } else {
         return this.searchBarBounds.byteHolder(d0, d1);
      }
   }

   public HeightHandler getSearchBarBounds() {
      return this.searchBarBounds;
   }
}
