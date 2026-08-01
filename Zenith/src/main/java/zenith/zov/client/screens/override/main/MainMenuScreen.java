package zenith.zov.client.screens.override.main;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.util.Window;
import net.minecraft.text.Text;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import zenith.zov.client.screens.override.server.MenuMultiPlayerScreen;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.EventTarget;
import zenith.ZenithInternal076;
import zenith.EventImpl_37;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.override.button.DefaultButton;

public class MainMenuScreen extends Screen implements ZenithInternal076 {
   private final List<DefaultButton> buttons = new ArrayList<>();

   public MainMenuScreen() {
      super(Text.literal("MainMenu"));
      this.buttons.add(new DefaultButton("Singleplayer", "K", 126.0F, 23.0F, () -> l11I1I1ll1Illll1I1l1111l1II.setScreen(new SelectWorldScreen(this))));
      this.buttons.add(new DefaultButton("Multiplayer", "J", 126.0F, 23.0F, () -> {
         l11I1I1ll1Illll1I1l1111l1II.setScreen(new MenuMultiPlayerScreen(this));
      }));
      this.buttons.add(new DefaultButton("Mods", "Z", 126.0F, 23.0F, () -> ModsListScreen.open(this)));
      this.buttons
         .add(
            new DefaultButton(
               "Settings", "F", 126.0F, 23.0F, () -> l11I1I1ll1Illll1I1l1111l1II.setScreen(new OptionsScreen(this, l11I1I1ll1Illll1I1l1111l1II.options))
            )
         );
      this.buttons.add(new DefaultButton("AltManager", "a", 126.0F, 23.0F, () -> {
         l11I1I1ll1Illll1I1l1111l1II.setScreen(new AltManagerScreen(this));
      }));
      this.buttons.add(new DefaultButton("Exit", "b", 126.0F, 23.0F, l11I1I1ll1Illll1I1l1111l1II::scheduleStop));
   }

   protected void init() {
      ZenithClient.getInstance().ZenithInternal041().init();
      super.init();
   }

   public void render(DrawContext DrawContext, int i, int j, float f) {
      floatHolder_4 iiii1ilili1l1l1lilli1liliii = floatHolder_4.StringHolder_8(DrawContext, i, j, f);
      this.renderTop(iiii1ilili1l1l1lilli1liliii, (float)iiii1ilili1l1l1lilli1liliii.l111IIlIl1l1(), (float)iiii1ilili1l1l1lilli1liliii.Ill1lI1III1());
   }

   @EventTarget
   public void render2d(EventImpl_37 llllii1liii1i1ll1liiil) {
   }

   public void renderTop(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1) {
      Window Window = l11I1I1ll1Illll1I1l1111l1II.getWindow();
      float f2 = (float)Window.getScaledWidth();
      float f3 = (float)Window.getScaledHeight();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         ZenithClient.StringHolder_10("menu/background.png"), 0.0F, 0.0F, f2, f3, ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      ZenithClient.getInstance().ZenithInternal041().renderParticles(iiii1ilili1l1l1lilli1liliii);
      Font font = Fonts.ICONS.getFont(20.0F);
      float f4 = font.height();
      String s = "5";
      float f5 = 256.0F;
      float f6 = 77.0F;
      float f7 = (f2 - f5) / 2.0F;
      float f8 = (f3 - 144.0F) / 2.0F + 32.0F + f4;
      float f9 = (f2 - font.width(s)) / 2.0F;
      float f10 = f8 - 32.0F - f4;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font,
         s,
         f9,
         f10,
         ZenithClient.getInstance().NotificationsHolder().lII111IIl1lI1I11lIIlIl1III1I().MusicInfo()
      );
      float f11 = 126.0F;
      float f12 = 23.0F;
      float f13 = 4.0F;
      byte b0 = 2;
      float f14 = 3.0F * f12 + 2.0F * f13;
      float f15 = f8 + (f6 - f14) / 2.0F;

      for (int i = 0; i < this.buttons.size(); i++) {
         float f16 = f7 + (float)(i % b0) * (f11 + f13);
         float f17 = f15 + (float)(i / b0) * (f12 + f13);
         this.buttons.get(i).render(iiii1ilili1l1l1lilli1liliii, f, f1, f16, f17);
      }
   }

   public void renderBackground(DrawContext DrawContext, int i, int j, float f) {
   }

   public void renderInGameBackground(DrawContext DrawContext) {
   }

   public boolean mouseClicked(double d0, double d1, int i) {
      for (DefaultButton defaultbutton : this.buttons) {
         defaultbutton.onMouseClicked(d0, d1, ZenithInternal068.StringHolder_24(i));
      }

      return super.mouseClicked(d0, d1, i);
   }
}
