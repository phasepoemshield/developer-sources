package zenith.zov.client.screens.override.server;

import zenith.hud.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.client.util.Window;
import net.minecraft.text.Text;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.option.ServerList;
import net.minecraft.client.network.MultiplayerServerListPinger;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.ZenithInternal076;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.override.button.ServerButton;

public class MenuMultiPlayerScreen extends Screen implements ZenithInternal076 {
   private final Screen parent;
   private final MultiplayerServerListPinger serverListPinger = new MultiplayerServerListPinger();
   private final List<ServerButton> serverButtons = new CopyOnWriteArrayList<>();
   private ServerList serverList;
   private float scrollY = 0.0F;

   public MenuMultiPlayerScreen(Screen Screen) {
      super(Text.literal("Multiplayer"));
      this.parent = Screen;
   }

   protected void init() {
      ZenithClient.getInstance().ZenithInternal041().init();
      this.serverList = new ServerList(l11I1I1ll1Illll1I1l1111l1II);
      this.serverList.loadFile();
      this.clearButtons();
      float f = 260.0F;
      float f1 = 30.0F;

      for (int i = 0; i < this.serverList.size(); i++) {
         this.serverButtons.add(new ServerButton(this, this.serverList.get(i), f, f1));
      }
   }

   private void clearButtons() {
      for (ServerButton serverbutton : this.serverButtons) {
         serverbutton.close();
      }

      this.serverButtons.clear();
   }

   public void tick() {
      this.serverListPinger.tick();
   }

   public void render(DrawContext DrawContext, int i, int j, float f) {
      floatHolder_4 iiii1ilili1l1l1lilli1liliii = floatHolder_4.StringHolder_8(DrawContext, i, j, f);
      this.renderBackgroundAndParticles(iiii1ilili1l1l1lilli1liliii);
      this.renderServerList(iiii1ilili1l1l1lilli1liliii, (float)i, (float)j);
   }

   private void renderBackgroundAndParticles(floatHolder_4 iiii1ilili1l1l1lilli1liliii) {
      Window Window = l11I1I1ll1Illll1I1l1111l1II.getWindow();
      float f = (float)Window.getScaledWidth();
      float f1 = (float)Window.getScaledHeight();
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         ZenithClient.StringHolder_10("menu/background.png"), 0.0F, 0.0F, f, f1, ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      ZenithClient.getInstance().ZenithInternal041().renderParticles(iiii1ilili1l1l1lilli1liliii);
   }

   public void renderServerList(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1) {
      Window Window = l11I1I1ll1Illll1I1l1111l1II.getWindow();
      float f2 = (float)Window.getScaledWidth();
      float f3 = (float)Window.getScaledHeight();
      SetColorHandler_3 llliili1l1ii11i1lii1 = SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I;
      float f4 = 265.0F;
      float f5 = 209.0F;
      float f6 = (f2 - f4) / 2.0F;
      float f7 = (f3 - f5) / 2.0F;
      float f8 = 4.0F;
      float f9 = (float)this.serverButtons.size() * (30.0F + f8);
      float f10 = Math.max(0.0F, f9 - f5);
      if (this.scrollY > 0.0F) {
         this.scrollY = 0.0F;
      }

      if (this.scrollY < -f10) {
         this.scrollY = -f10;
      }

      float f11 = f7 + this.scrollY;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)f6, (int)f7, (int)(f6 + f4), (int)(f7 + f5));

      for (ServerButton serverbutton : this.serverButtons) {
         if (f11 + serverbutton.getHeight() > f7 && f11 < f7 + f5) {
            serverbutton.render(iiii1ilili1l1l1lilli1liliii, f, f1, f6 + (f4 - serverbutton.getWidth()) / 2.0F, f11);
         }

         f11 += serverbutton.getHeight() + f8;
      }

      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      if (f9 > f5) {
         float f15 = 1.0F;
         float f16 = f6 + f4 + 4.0F - f15 - 2.0F;
         float f12 = f5 * (f5 / f9);
         float f13 = f7 + -this.scrollY / f9 * f5;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f16, f7, f15, f5, floatHolder_5.IlI11I1ll1lI1I11IlI1Il1, llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l()
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f16, f13, f15, f12, floatHolder_5.IlI11I1ll1lI1I11IlI1Il1, llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
         );
      }

      Font font = Fonts.ICONS.getFont(20.0F);
      float f17 = font.height();
      String s = "J";
      float f18 = (f2 - font.width(s)) / 2.0F;
      float f14 = f7 - 32.0F - f17;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font,
         s,
         f18,
         f14,
         ZenithClient.getInstance().NotificationsHolder().lII111IIl1lI1I11lIIlIl1III1I().MusicInfo()
      );
   }

   public boolean mouseClicked(double d0, double d1, int i) {
      for (ServerButton serverbutton : this.serverButtons) {
         serverbutton.onMouseClicked(d0, d1, ZenithInternal068.StringHolder_24(i));
      }

      return super.mouseClicked(d0, d1, i);
   }

   public boolean mouseScrolled(double d0, double d1, double d2, double d3) {
      this.scrollY += (float)(d3 * 15.0);
      float f = (float)Math.max(0, this.serverButtons.size() * 30);
      if (this.scrollY > 0.0F) {
         this.scrollY = 0.0F;
      }

      if (this.scrollY < -f) {
         this.scrollY = -f;
      }

      return super.mouseScrolled(d0, d1, d2, d3);
   }

   public void close() {
      l11I1I1ll1Illll1I1l1111l1II.setScreen(this.parent);
   }

   public void removed() {
      this.clearButtons();
      this.serverListPinger.cancel();
   }

   public MultiplayerServerListPinger getServerListPinger() {
      return this.serverListPinger;
   }
}
