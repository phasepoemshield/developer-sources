package zenith.zov.client.screens.menu.settings.impl;

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
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;

public class MenuStringSetting extends MenuSetting {
   private final StringSetting setting;
   private HeightHandler bounds;
   private final GetStartTimeHandler focusAnimation = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);
   private OnMouseClickedHandler textBox;

   public MenuStringSetting(StringSetting li1il1ll1l1l11iii) {
      this.setting = li1il1ll1l1l11iii;
   }

   @Override
   public void render(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f9,
      float f10,
      float f,
      float f1,
      float f2,
      float f3,
      float f11,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill2,
      SetColorHandler_3 llliili1l1ii11i1lii1
   ) {
      Font font = Fonts.MEDIUM.getFont(7.0F);
      Font font1 = Fonts.MEDIUM.getFont(6.0F);
      Font font2 = Fonts.ICONS.getFont(6.0F);
      float f4 = 8.0F;
      OnMouseClickedHandler li111l1i1ili111111ll1iiii1 = this.getBox();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font2, "M", f + f4, f1 + 3.0F, il1iliilli1l1iill);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font, this.setting.getName(), f + f4 + 10.0F, f1 + (13.0F - font.height()) / 2.0F - 0.8F, il1iliilli1l1iill1
      );
      if (!li111l1i1ili111111ll1iiii1.isSelected()) {
         li111l1i1ili111111ll1iiii1.GetDisplayNameHandler(this.setting.getValue());
         li111l1i1ili111111ll1iiii1.EventImpl_16(this.setting.getValue().length());
      }

      float f5 = f2 / 2.3F;
      float f6 = 13.0F;
      float f7 = f + f2 - f5 - f4 - 3.0F;
      float f8 = f1 - 1.0F;
      this.bounds = new HeightHandler(f7, f8, f5, f6);
      ByteBufferHolder il1iliilli1l1iill3 = llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1().ZenithInternal039(f3);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f7, f8, f5, f6, floatHolder_5.StringHolder_30(3.0F), il1iliilli1l1iill3);
      iiii1ilili1l1l1lilli1liliii.EventBus(
         f7, f8, f5, f6, 0.2F, floatHolder_5.StringHolder_30(3.0F), llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il().ZenithInternal039(f3)
      );
      li111l1i1ili111111ll1iiii1.setWidth(f5 - 10.0F);
      li111l1i1ili111111ll1iiii1.EventImpl_38(this.setting.l1II11IllIl1IIII1l1lIllI1l1().l1l1IIl11IIl1lIlI1Il1lIIl1I1l1());
      li111l1i1ili111111ll1iiii1.SoundEventHolder(
         ZenithClient.getInstance().StringHolder_31().translate(this.setting.Il1II11IIIl1I1Il1Il1I1Illl11())
      );
      li111l1i1ili111111ll1iiii1.StringHolder_8(
         iiii1ilili1l1l1lilli1liliii, f7 + 6.0F, f1 + (13.0F - font.height()) / 2.0F - 0.8F, il1iliilli1l1iill1, il1iliilli1l1iill2
      );
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null) {
         if (this.bounds.byteHolder(d0, d1) && ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
            this.getBox().setSelected(true);
         } else {
            this.getBox().onMouseClicked(d0, d1, ill1iili11ii1l);
         }
      }
   }

   @Override
   public boolean keyPressed(int i, int j, int k) {
      OnMouseClickedHandler li111l1i1ili111111ll1iiii1 = this.getBox();
      if (li111l1i1ili111111ll1iiii1.isSelected()) {
         if (i == 257) {
            this.setting.ZenithInternal078(li111l1i1ili111111ll1iiii1.II1I11IIl());
            li111l1i1ili111111ll1iiii1.setSelected(false);
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

   private OnMouseClickedHandler getBox() {
      if (this.textBox == null) {
         this.textBox = new OnMouseClickedHandler(
            new Vector2f(0.0F, 0.0F), Fonts.MEDIUM.getFont(7.0F), this.setting.Il1II11IIIl1I1Il1Il1I1Illl11(), 40.0F
         );
      }

      return this.textBox;
   }

   @Override
   public float getWidth() {
      return 0.0F;
   }

   @Override
   public float getHeight() {
      return 13.0F;
   }

   @Override
   public boolean isVisible() {
      return this.setting.l1l1II1I1ll11l1IlI1lI11l1().get();
   }

   public StringSetting getSetting() {
      return this.setting;
   }
}
