package zenith.zov.client.screens.menu.settings.impl;

import java.util.Objects;
import java.util.Optional;
import org.joml.Vector2f;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.GetHeightHandler;
import zenith.HeightHandler;
import zenith.Module;
import zenith.ContainerSetting;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.menu.settings.api.MenuSetting;
import zenith.zov.client.screens.menu.settings.impl.popup.MenuWindowPopupSetting;

public class MenuWindowSetting extends MenuSetting {
   private final ContainerSetting setting;
   private Optional<HeightHandler> bounds;
   private GetHeightHandler rectBounds;
   private final Module module;

   public MenuWindowSetting(Module ll111il1lliill11, ContainerSetting lliiii1iil1li) {
      this.setting = lliiii1iil1li;
      this.bounds = Optional.empty();
      this.rectBounds = new GetHeightHandler(0.0F, 0.0F, 78.0F, 96.0F);
      this.module = ll111il1lliill11;
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
      float f4,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill3,
      SetColorHandler_3 llliili1l1ii11i1lii1
   ) {
      float f5 = f + 8.0F;
      Font font = Fonts.MEDIUM.getFont(7.0F);
      float f6 = f1 + (8.0F - font.height()) / 2.0F - 0.5F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, this.setting.getName(), f + 8.0F + 10.0F, f6, il1iliilli1l1iill1);
      String s = "Открыть";
      float f7 = font.width(s) + 8.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(Fonts.ICONS.getFont(5.5F), "E", f5 + 1.2F, f6, il1iliilli1l1iill);
      float f8 = f5 + f2 - 16.0F - f7;
      ByteBufferHolder il1iliilli1l1iill2 = llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1()
         .StringHolder_8(llliili1l1ii11i1lii1.l1IllIl1l1llIlI11I11Il1l1l1lI1(), f4)
         .ZenithInternal039(f3);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(Fonts.ICONS.getFont(7.0F), "F", f5 + f2 - 23.0F, f6 - 0.5F, il1iliilli1l1iill);
      this.bounds = Optional.of(new HeightHandler(f8, f1, f7, 8.0F));
      this.rectBounds.setWidth(160.0F);
   }

   @Override
   public void onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (this.isVisible()) {
         this.bounds
            .ifPresent(
               li1il11i1iilii1iiili111li11 -> {
                  if (li1il11i1iilii1iiili111li11.byteHolder(d0, d1) && ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
                     ZenithClient.getInstance()
                        .TimerUtilHolder_2()
                        .addPopupMenuSetting(
                           new MenuWindowPopupSetting(
                              this.module,
                              new Vector2f(this.bounds.get().Il11lIlllI111I1l1111() + 15.0F, this.bounds.get().I1II11l1I11Illl11IIl1l1lIl1II()),
                              this.setting,
                              this.rectBounds
                           )
                        );
                  }
               }
            );
      }
   }

   @Override
   public float getWidth() {
      return 0.0F;
   }

   @Override
   public float getHeight() {
      return 8.0F;
   }

   @Override
   public boolean equals(Object object) {
      if (this == object) {
         return true;
      } else {
         return object instanceof MenuWindowSetting menuwindowsetting1 ? this.setting == menuwindowsetting1.setting : false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.setting);
   }

   @Override
   public boolean isVisible() {
      return this.setting.isVisible();
   }
}
