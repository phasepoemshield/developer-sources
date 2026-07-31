package zenith.zov.client.screens.override.button;

import zenith.hud.*;

import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.gui.screen.world.WorldIcon;
import net.minecraft.client.network.ServerInfo.GiantEntityRenderer3;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.ZenithInternal076;
import zenith.StringHolder_21;
import zenith.floatHolder_8;
import zenith.GetStartTimeHandler;
import zenith.SetColorHandler_3;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.override.server.MenuMultiPlayerScreen;

public class ServerButton extends ButtonScreen implements ZenithInternal076 {
   private final ServerInfo serverInfo;
   private final WorldIcon icon;
   private final GetStartTimeHandler hoverAnimation = new GetStartTimeHandler(250L, IReturn.ScreenImpl);
   private final MenuMultiPlayerScreen multiplayerScreen;
   private static final ThreadPoolExecutor PINGER_EXECUTOR = (ThreadPoolExecutor)Executors.newFixedThreadPool(5);
   private byte[] lastFavicon;
   private String pingText = "...";

   public ServerButton(MenuMultiPlayerScreen menumultiplayerscreen, ServerInfo ServerInfo, float f, float f1) {
      super(f, f1);
      this.multiplayerScreen = menumultiplayerscreen;
      this.serverInfo = ServerInfo;
      this.icon = WorldIcon.forServer(l11I1I1ll1Illll1I1l1111l1II.getTextureManager(), ServerInfo.address);
      this.pingServer();
   }

   public void pingServer() {
      this.serverInfo.setStatus(GiantEntityRenderer3.PINGING);
      PINGER_EXECUTOR.submit(() -> {
         try {
            this.multiplayerScreen.getServerListPinger().add(this.serverInfo, () -> {
               this.pingText = this.serverInfo.ping + "ms";
               this.updateFavicon();
            }, () -> {
            });
         } catch (Exception exception) {
            this.serverInfo.setStatus(GiantEntityRenderer3.UNREACHABLE);
            this.pingText = "Error";
         }
      });
   }

   private void updateFavicon() {
      byte[] abyte = this.serverInfo.getFavicon();
      if (!Arrays.equals(abyte, this.lastFavicon) && abyte != null) {
         try {
            this.icon.load(NativeImage.read(abyte));
            this.lastFavicon = abyte;
         } catch (Exception exception) {
         }
      }
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3) {
      super.render(iiii1ilili1l1l1lilli1liliii, f, f1, f2, f3);
      SetColorHandler_3 llliili1l1ii11i1lii1 = SetColorHandler_3.IIlllIlIIlIIIlllll1llII1III11I;
      this.hoverAnimation.ZenithInternal101(this.bounds.byteHolder((double)f, (double)f1));
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         f2,
         f3,
         this.getWidth(),
         this.getHeight(),
         floatHolder_5.StringHolder_30(6.0F),
         llliili1l1ii11i1lii1.IIlI1l1IllIIII1I1ll1l1l()
            .StringHolder_8(llliili1l1ii11i1lii1.lI1IlI1I1I11I11ll1II1(), this.hoverAnimation.CloudFriendInfo())
      );
      iiii1ilili1l1l1lilli1liliii.EventBus(
         f2, f3, this.getWidth(), this.getHeight(), -0.1F, floatHolder_5.StringHolder_30(4.0F), llliili1l1ii11i1lii1.Ill11II1Il1IIlI1Il()
      );
      this.updateFavicon();
      float f4 = 14.0F;
      float f5 = (this.getHeight() - f4) / 2.0F;
      Identifier Identifier = this.icon.getTextureId();
      floatHolder_8.StringHolder_8(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         Identifier,
         f2 + f5,
         f3 + f5,
         f4,
         f4,
         floatHolder_5.StringHolder_30(2.0F),
         ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      Font font = Fonts.MEDIUM.getFont(8.0F);
      Font font1 = Fonts.MEDIUM.getFont(7.0F);
      float f6 = f2 + f5 + f4 + 6.0F;
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, this.serverInfo.name, f6, f3 + f5 - 1.0F, ByteBufferHolder.ll1lIllll111I1lIIl1lIl);
      Text Text = StringHolder_21.Event(
         this.serverInfo.label != null ? this.serverInfo.label : Text.of(this.serverInfo.address)
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8((int)f6, 0, (int)(f6 + 170.0F), l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledHeight());
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1, Text, f6, f3 + f5 + f4 - font1.height(), llliili1l1ii11i1lii1.I111llllll1ll1l1Il().lllIlll1Ill111l111Il11II11lII()
      );
      iiii1ilili1l1l1lilli1liliii.llIIll1II1l1IIll();
      String s = this.serverInfo.playerCountLabel != null ? this.serverInfo.playerCountLabel.getString() : "0/0";
      float f7 = font1.width(this.pingText);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1, this.pingText, f2 + this.getWidth() - f7 - 5.0F, f3 + f5 - 1.0F, llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III()
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1, s, f2 + this.getWidth() - font1.width(s) - 5.0F, f3 + f5 + 10.0F, llliili1l1ii11i1lii1.III1Illl11III1II11IlIll1III()
      );
      floatHolder_8.StringHolder_8(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         f2,
         f3,
         this.getWidth(),
         this.getHeight(),
         0.1F,
         15.0F,
         ByteBufferHolder.lllIll11l1I11Il1II11II1I11
            .StringHolder_8(
               ZenithClient.getInstance().NotificationsHolder().IllIlIll11lIlI1().l1IllIl1l1llIlI11I11Il1l1l1lI1(),
               this.hoverAnimation.CloudFriendInfo()
            ),
         floatHolder_5.StringHolder_30(4.0F)
      );
   }

   @Override
   public void onClick(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (ill1iili11ii1l == ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl) {
         ServerAddress ServerAddress = ServerAddress.parse(this.serverInfo.address);
         ConnectScreen.connect(l11I1I1ll1Illll1I1l1111l1II.currentScreen, l11I1I1ll1Illll1I1l1111l1II, ServerAddress, this.serverInfo, false, null);
      }
   }

   public void close() {
      this.icon.close();
   }
}
