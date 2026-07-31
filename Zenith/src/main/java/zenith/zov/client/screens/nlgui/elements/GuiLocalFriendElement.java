package zenith.zov.client.screens.nlgui.elements;

import zenith.floatHolder_4;
import zenith.floatHolder_5;
import zenith.ByteBufferHolder;
import zenith.floatHolder_8;
import zenith.HeightHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class GuiLocalFriendElement extends GuiFriendRowElement {
   private final String name;

   public GuiLocalFriendElement(String s) {
      this.name = s;
   }

   public void syncLocal(float f) {
      this.markPresent(f);
   }

   // $VF: renamed from: key () java.lang.String
   @Override
   public String getEnd() {
      return "local:" + this.name;
   }

   @Override
   public boolean isCloud() {
      return false;
   }

   @Override
   public String getCloudUid() {
      return null;
   }

   @Override
   public String getLocalName() {
      return this.name;
   }

   @Override
   public String getName() {
      return this.name;
   }

   @Override
   public float render(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4, float f5, ZenithStyle zenithstyle
   ) {
      float f6 = this.updateVisible();
      if (f6 <= 0.02F) {
         this.setRemoveBounds(null);
         this.bounds = null;
         return 0.0F;
      } else {
         this.bounds = new HeightHandler(f2, f3, f4, 28.0F);
         float f7 = f5 * f6;
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f2,
            f3,
            f4,
            28.0F,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getSurfaceDisableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f5)
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f2,
            f3,
            f4,
            28.0F,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getSurfaceEnableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f5)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         float f8 = 13.0F;
         float f9 = f2 + (float)(GuiStyle.PADDING * 2);
         float f10 = f3 + (28.0F - f8) / 2.0F;
         floatHolder_8.EventBus(
            iiii1ilili1l1l1lilli1liliii.getMatrices(),
            FriendSkinResolver.resolveSkin(this.name),
            f9,
            f10,
            f8,
            floatHolder_5.StringHolder_30(2.0F),
            ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f7)
         );
         Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
         Font font1 = Fonts.NEW_REGULAR.getFont(4.8F);
         Font font2 = Fonts.NEW_MEDIUM.getFont(5.0F);
         Font font3 = Fonts.NEW_ICONS.getFont(4.2F);
         float f11 = f9 + f8 + 4.0F;
         float f12 = font.height() + (float)GuiStyle.PADDING.intValue() / 2.0F + font1.height();
         float f13 = f10 + (f8 - f12) / 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font, this.name, f11, f13, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f7)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1,
            "Local",
            f11,
            f13 + font.height() + (float)GuiStyle.PADDING.intValue() / 2.0F,
            zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f7)
         );
         float f14 = font3.width("[") + (float)GuiStyle.PADDING.intValue() / 2.0F + font2.width("Remove");
         float f15 = f2 + f4 - f14 - (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f16 = f3 + (28.0F - font2.height()) / 2.0F;
         HeightHandler li1il11i1iilii1iiili111li11 = new HeightHandler(f15, f16, f14, 13.0F);
         this.setRemoveBounds(li1il11i1iilii1iiili111li11);
         float f17 = this.getRemoveHoverAnimation().StringHolder_8(li1il11i1iilii1iiili111li11.byteHolder((double)f, (double)f1) ? 1.0F : 0.0F);
         float f18 = f15 + font3.width("[") + (float)GuiStyle.PADDING.intValue() / 2.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font3,
            "[",
            f15,
            f3 + (28.0F - font3.height()) / 2.0F,
            zenithstyle.getTextTertiary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f17)
               .ZenithInternal039(f7)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font2, "Remove", f18, f16, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f7)
         );
         return f6;
      }
   }
}
