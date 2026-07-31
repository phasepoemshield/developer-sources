package zenith.zov.client.screens.nlgui.elements.setting;

import zenith.hud.*;

import net.minecraft.client.util.math.Vector2f;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.OnMouseClickedHandler;
import zenith.HeightHandler;
import zenith.StringSetting;
import zenith.GetStartTimeHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.api.GuiSetting;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class GuiStringSetting extends GuiSetting<StringSetting> {
   private final GetStartTimeHandler focusAnimation = new GetStartTimeHandler(200L, IReturn.ListHolder_8);
   private HeightHandler bounds;
   private OnMouseClickedHandler textBox;

   public GuiStringSetting(StringSetting li1il1ll1l1l11iii) {
      super(166.0F, li1il1ll1l1l11iii);
   }

   public GuiStringSetting(StringSetting li1il1ll1l1l11iii, float f) {
      super(f, li1il1ll1l1l11iii);
   }

   @Override
   public String getName() {
      return this.setting.getName();
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null && this.bounds.byteHolder(d0, d1) && ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         this.getBox().setSelected(true);
         return true;
      } else {
         if (!this.getBox().onMouseClicked(d0, d1, ill1iili11ii1l)) {
            this.setting.ZenithInternal078(this.getBox().II1I11IIl());
         }

         return false;
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         this.animationVisible.ZenithInternal101(this.setting.isVisible());
         f4 *= this.animationVisible.CloudFriendInfo();
         OnMouseClickedHandler li111l1i1ili111111ll1iiii1 = this.getBox();
         if (!li111l1i1ili111111ll1iiii1.isSelected()) {
            li111l1i1ili111111ll1iiii1.GetDisplayNameHandler(this.setting.getValue());
            li111l1i1ili111111ll1iiii1.EventImpl_16(this.setting.getValue().length());
         }

         Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
         Font font1 = Fonts.NEW_REGULAR.getFont(5.4F);
         float f5 = this.width / 2.0F - (float)GuiStyle.PADDING.intValue();
         ByteBufferHolder il1iliilli1l1iill = zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4);
         ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4);
         ByteBufferHolder il1iliilli1l1iill2 = zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4);
         this.drawDefault(
            iiii1ilili1l1l1lilli1liliii,
            f,
            f1,
            "M",
            this.setting.getName(),
            this.setting.llllIII11IIl1ll1llI1lII1I(),
            font,
            font1,
            f2,
            f3,
            f5,
            il1iliilli1l1iill,
            il1iliilli1l1iill1,
            il1iliilli1l1iill2
         );
         float f6 = this.width / 2.0F;
         float f7 = this.getHeight();
         this.bounds = new HeightHandler(f2 + this.width - f6, f3 + (this.getHeight() - f7) / 2.0F, f6, f7);
         this.focusAnimation.ZenithInternal101(li111l1i1ili111111ll1iiii1.isSelected() || this.bounds.byteHolder((double)f, (double)f1));
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            this.bounds.Il11lIlllI111I1l1111(),
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            f6,
            f7,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
            zenithstyle.getFieldSurfaceBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            this.bounds.Il11lIlllI111I1l1111(),
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            f6,
            f7,
            0.1F,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 2.0F),
            zenithstyle.getFieldBorder()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(
                  zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(0.5F), this.focusAnimation.CloudFriendInfo()
               )
               .ZenithInternal039(f4)
         );
         Font font2 = Fonts.NEW_MEDIUM.getFont(5.3F);
         li111l1i1ili111111ll1iiii1.StringHolder_8(font2);
         li111l1i1ili111111ll1iiii1.setWidth(f6 - (float)GuiStyle.PADDING.intValue() * 2.0F);
         li111l1i1ili111111ll1iiii1.EventImpl_38(this.setting.l1II11IllIl1IIII1l1lIllI1l1().l1l1IIl11IIl1lIlI1Il1lIIl1I1l1());
         li111l1i1ili111111ll1iiii1.SoundEventHolder(
            ZenithClient.getInstance().StringHolder_31().translate(this.setting.Il1II11IIIl1I1Il1Il1I1Illl11())
         );
         li111l1i1ili111111ll1iiii1.StringHolder_8(
            iiii1ilili1l1l1lilli1liliii,
            this.bounds.Il11lIlllI111I1l1111() + (float)GuiStyle.PADDING.intValue(),
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II() + (f7 - font2.height()) / 2.0F,
            zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4),
            zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f4)
         );
      }
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      OnMouseClickedHandler li111l1i1ili111111ll1iiii1 = this.getBox();
      if (li111l1i1ili111111ll1iiii1.isSelected()) {
         if (i == 257) {
            this.setting.ZenithInternal078(li111l1i1ili111111ll1iiii1.II1I11IIl());
            li111l1i1ili111111ll1iiii1.setSelected(false);
            return true;
         }

         if (i == 256) {
            li111l1i1ili111111ll1iiii1.setSelected(false);
            return true;
         }
      }

      return li111l1i1ili111111ll1iiii1.keyPressed(i, j, k);
   }

   @Override
   public boolean charTyped(char c0, int i) {
      return this.getBox().charTyped(c0, i);
   }

   @Override
   public float getHeight() {
      return 14.0F;
   }

   private OnMouseClickedHandler getBox() {
      if (this.textBox == null) {
         this.textBox = new OnMouseClickedHandler(
            new Vector2f(0.0F, 0.0F), Fonts.NEW_MEDIUM.getFont(5.3F), this.setting.Il1II11IIIl1I1Il1Il1I1Illl11(), 40.0F
         );
      }

      return this.textBox;
   }
}
