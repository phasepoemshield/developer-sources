package zenith.zov.client.screens.menu.settings.impl;

import zenith.hud.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.minecraft.util.math.RotationAxis;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.floatHolder_8;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.ModeSetting;
import zenith.ModeOption;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;

public class MenuModeSetting extends MenuSetting {
   private final ModeSetting setting;
   private final Map<ModeOption, HeightHandler> modeSettingOptionBounds = new HashMap<>();
   private HeightHandler bounds;
   private boolean expanded;
   private float maxWidthText;
   private final GetStartTimeHandler expandedAnimation = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);

   public ModeSetting getSetting() {
      return this.setting;
   }

   public MenuModeSetting(ModeSetting liii11li1iliiiii1l1li) {
      this.setting = liii11li1iliiiii1l1li;
      this.maxWidthText = -1.0F;
   }

   @Override
   public void render(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f18,
      float f19,
      float f,
      float f1,
      float f2,
      float f3,
      float f4,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill5,
      SetColorHandler_3 llliili1l1ii11i1lii1
   ) {
      if (this.maxWidthText == -1.0F) {
         this.maxWidthText = (float)this.setting
            .ll1lIIIIlII()
            .stream()
            .mapToDouble(
               liii11li1iliiiii1l1li$ii1il11l111ii11iil -> (double)Fonts.MEDIUM.getFont(6.0F).width(liii11li1iliiiii1l1li$ii1il11l111ii11iilx.getName())
            )
            .max()
            .orElse(0.0);
      }

      Font font = Fonts.MEDIUM.getFont(7.0F);
      Font font1 = Fonts.MEDIUM.getFont(6.0F);
      Font font2 = Fonts.ICONS.getFont(6.0F);
      float f5 = f + 18.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, this.setting.getName(), f5, f1 + (13.0F - font.height()) / 2.0F - 0.5F, il1iliilli1l1iill1);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font2, "K", f + 9.0F, f1 + (13.0F - font2.height()) / 2.0F - 1.0F, il1iliilli1l1iill);
      float f6 = f2 / 2.2F;
      float f7 = 13.0F + this.expandedAnimation.StringHolder_8(this.expanded ? 1.0F : 0.0F) * (float)this.setting.ll1lIIIIlII().size() * 13.0F;
      float f8 = f + f2 - f6 - 8.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f8, f1, f6, f7, floatHolder_5.StringHolder_30(3.0F), llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l().ZenithInternal039(f3)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f8,
         f1,
         f6,
         13.0F,
         this.expanded ? floatHolder_5.StringHolder_19(3.0F, 3.0F) : floatHolder_5.StringHolder_30(3.0F),
         llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1().ZenithInternal039(f3)
      );
      String s = this.setting.lII1I1l1IlIIl1I().getName();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font1, s, f8 + 6.0F, f1 + (13.0F - font1.height()) / 2.0F, il1iliilli1l1iill1);
      float f9 = 2.0F;
      float f10 = 4.0F;
      float f11 = 4.0F;
      float f12 = f8 + f6 - 8.0F - 4.0F;
      float f13 = f1 + 5.5F;
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1 = floatHolder_5.IlI11I1ll1lI1I11IlI1Il1;
      ByteBufferHolder il1iliilli1l1iill2 = llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III()
         .StringHolder_8(llliili1l1ii11i1lii1.I111llllll1ll1l1Il(), f4)
         .ZenithInternal039(f3);
      float f14 = -45.0F;
      float f15 = 45.0F;
      iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
      float f16 = f12 + font2.width("Q") / 2.0F - 1.0F;
      float f17 = f13 + font2.height() / 2.0F - 1.0F;
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f16, f17, 0.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().multiply(RotationAxis.POSITIVE_Z.rotationDegrees(180.0F * this.expandedAnimation.CloudFriendInfo()));
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(-f16, -f17, 0.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font2, "Q", (float)((int)f12), (float)((int)f13), il1iliilli1l1iill2);
      iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)f8 - 1, (int)f1, (int)(f8 + f6 + 1.0F), (int)(f1 + f7 + 1.0F));
      this.bounds = new HeightHandler(f8, f1, f6, f7);
      if (this.expandedAnimation.CloudFriendInfo() != 0.0F) {
         List list = this.setting.ll1lIIIIlII();
         ByteBufferHolder il1iliilli1l1iill3 = llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III()
            .StringHolder_8(llliili1l1ii11i1lii1.I111llllll1ll1l1Il(), f4)
            .ZenithInternal039(f3);
         ByteBufferHolder il1iliilli1l1iill4 = llliili1l1ii11i1lii1.I1llIl11Il()
            .StringHolder_8(llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(), f4)
            .ZenithInternal039(f3);
         f12 = f1 + 13.0F;

         for (ModeOption liii11li1iliiiii1l1li$ii1il11l111ii11iil : list) {
            HeightHandler li1il11i1iilii1iiili111li11 = new HeightHandler(f8, f12, f6, 13.0F);
            if (f12 > f1 + f7) {
               break;
            }

            if (liii11li1iliiiii1l1li$ii1il11l111ii11iil == this.setting.lII1I1l1IlIIl1I()) {
               iiii1ilili1l1l1lilli1liliii.StringHolder_8(
                  f8 + 1.0F,
                  f12,
                  f6 - 2.0F,
                  13.0F,
                  liii11li1iliiiii1l1li$ii1il11l111ii11iil == list.getLast()
                     ? floatHolder_5.ZenithInternal061(3.0F, 3.0F)
                     : floatHolder_5.StringHolder_30(0.0F),
                  il1iliilli1l1iill4.ZenithInternal039(this.expandedAnimation.CloudFriendInfo())
               );
               iiii1ilili1l1l1lilli1liliii.StringHolder_8(
                  font1,
                  liii11li1iliiiii1l1li$ii1il11l111ii11iil.getName(),
                  f8 + 6.0F,
                  f12 + (13.0F - font1.height()) / 2.0F,
                  il1iliilli1l1iill1.ZenithInternal039(this.expandedAnimation.CloudFriendInfo())
               );
            } else {
               iiii1ilili1l1l1lilli1liliii.StringHolder_8(
                  font1,
                  liii11li1iliiiii1l1li$ii1il11l111ii11iil.getName(),
                  f8 + 6.0F,
                  f12 + (13.0F - font1.height()) / 2.0F,
                  il1iliilli1l1iill3.ZenithInternal039(this.expandedAnimation.CloudFriendInfo())
               );
            }

            this.modeSettingOptionBounds.put(liii11li1iliiiii1l1li$ii1il11l111ii11iil, li1il11i1iilii1iiili111li11);
            f12 += 13.0F;
         }
      }

      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      floatHolder_8.EventTarget(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         f8,
         f1,
         f6,
         f7,
         0.2F,
         floatHolder_5.StringHolder_30(3.0F),
         llliili1l1ii11i1lii1.Il11Il111I11lIl1I1I().ZenithInternal039(f3)
      );
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.bounds != null && ill1iili11ii1l == ZenithInternal068.lII1lI1lII1l && this.bounds.byteHolder(d0, d1)) {
         this.expanded = !this.expanded;
         if (ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0 || ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 1) {
            ZenithClient.getInstance()
               .MinecraftClientHolder_5()
               .StringHolder_8(
                  ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0
                     ? ZenithClient.getInstance().MinecraftClientHolder_5().IIl1l1II1I11IllI1I111Ill1
                     : ZenithClient.getInstance().MinecraftClientHolder_5().l11l11lII11lIl1l
               );
         }
      } else {
         if (this.expanded && ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
            for (Entry entry : this.modeSettingOptionBounds.entrySet()) {
               if (((HeightHandler)entry.getValue()).byteHolder(d0, d1)) {
                  this.setting.StringHolder_8((ModeOption)entry.getKey());
                  if (ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0 || ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 1) {
                     ZenithClient.getInstance()
                        .MinecraftClientHolder_5()
                        .StringHolder_8(
                           ill1iili11ii1l.IlIllIlI1l1111IIlllIl11lIIIll() == 0
                              ? ZenithClient.getInstance().MinecraftClientHolder_5().IIl1l1II1I11IllI1I111Ill1
                              : ZenithClient.getInstance().MinecraftClientHolder_5().l11l11lII11lIl1l
                        );
                  }

                  return;
               }
            }
         }
      }
   }

   @Override
   public float getWidth() {
      return 0.0F;
   }

   @Override
   public float getHeight() {
      return 13.0F + this.expandedAnimation.CloudFriendInfo() * (float)this.setting.ll1lIIIIlII().size() * 13.0F;
   }

   @Override
   public boolean isVisible() {
      return this.setting.l1l1II1I1ll11l1IlI1lI11l1().get();
   }
}
