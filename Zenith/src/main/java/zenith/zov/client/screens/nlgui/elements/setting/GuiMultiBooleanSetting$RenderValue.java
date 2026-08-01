package zenith.zov.client.screens.nlgui.elements.setting;

import zenith.hud.*;

import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.MultiBooleanSetting$II1Il11l111II11IIl;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.zov.base.font.Font;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

class GuiMultiBooleanSetting$RenderValue {
   private final MultiBooleanSetting$II1Il11l111II11IIl value;
   private final GetStartTimeHandler animationEnable;
   private HeightHandler bounds;

   public GuiMultiBooleanSetting$RenderValue(GuiMultiBooleanSetting guimultibooleansetting, MultiBooleanSetting$II1Il11l111II11IIl l11i1111l1i$ii1il11l111ii11iil) {
      this.this$0 = guimultibooleansetting;
      this.value = l11i1111l1i$ii1il11l111ii11iil;
      this.animationEnable = new GetStartTimeHandler(200L, l11i1111l1i$ii1il11l111ii11iil.Spider() ? 1.0F : 0.0F, IReturn.ScreenImpl);
   }

   public void addRectToBatch(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f5 = GuiMultiBooleanSetting.access$000(this.this$0) / 2.0F - (float)GuiStyle.PADDING.intValue();
         this.bounds = new HeightHandler(f2 + (float)GuiStyle.PADDING.intValue() / 2.0F, f3, f5, this.getHeight());
         this.animationEnable.StringHolder_8(this.value.Spider() ? 1.0F : (this.bounds.byteHolder((double)f, (double)f1) ? 0.5F : 0.0F));
         iiii1ilili1l1l1lilli1liliii.EventBus(
            this.bounds.Il11lIlllI111I1l1111(),
            this.bounds.I1II11l1I11Illl11IIl1l1lIl1II(),
            this.bounds.width(),
            this.bounds.height(),
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 4.0F),
            ByteBufferHolder.lllIll11l1I11Il1II11II1I11
               .StringHolder_8(zenithstyle.getFieldSurfaceBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.animationEnable.CloudFriendInfo())
               .ZenithInternal039(f4)
         );
      }
   }

   public void renderText(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, Font font, Font font1) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f3 = GuiMultiBooleanSetting.access$100(this.this$0) / 2.0F - (float)GuiStyle.PADDING.intValue();
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font,
            this.value.getName(),
            f + (float)GuiStyle.PADDING.intValue() / 2.0F + (float)GuiStyle.PADDING.intValue() / 2.0F,
            f1 + (this.getHeight() - font.height()) / 2.0F,
            zenithstyle.getTextSecondary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.animationEnable.CloudFriendInfo())
               .ZenithInternal039(f2)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1,
            "<",
            f + (float)GuiStyle.PADDING.intValue() / 2.0F + f3 - font1.width("<") - (float)GuiStyle.PADDING.intValue() / 2.0F,
            f1 + (this.getHeight() - font1.height()) / 2.0F,
            ByteBufferHolder.lllIll11l1I11Il1II11II1I11
               .StringHolder_8(zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1(), this.animationEnable.CloudFriendInfo())
               .ZenithInternal039(f2)
         );
      }
   }

   public float getHeight() {
      return 10.0F;
   }

   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null && this.bounds.StringHolder_8(d0, d1, (float)GuiStyle.PADDING.intValue() / 2.0F)) {
         this.value.lI1Il11I1l1III11IIlI1lI1II11I();
         return true;
      } else {
         return false;
      }
   }
}
