package zenith.hud;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaInfo;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.minecraft.util.Identifier;
import net.minecraft.client.util.math.Vector2f;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class MusicInfo extends HudElement {
   private static final float l1IllII11IlIlI1I1l1IIl1I1ll1 = 109.0F;
   private static final float IlIlll1lIlllI = 25.0F;
   private static final float IlIllll11l1l1llIll = 15.0F;
   private final ExecutorService Il1I1lll1Il11IIl1 = Executors.newSingleThreadExecutor();
   private MediaInfo I1Il1l1IIIlllI1 = new MediaInfo("Track Name", "Artist", new byte[0], 43L, 150L, false);
   private final Identifier IlllIl1l1I1II1ll11II = ZenithClient.StringHolder_10("icons/avatarmusic.png");
   private final longHolder I1IlI1I11I1 = new longHolder();
   private volatile IMediaSession II1II111lII11IlIl111IIII1II;
   private final GetStartTimeHandler l11I1I11lI1IIl1lll = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler IIll111ll11llI11Il11lII1lIl = new GetStartTimeHandler(220L, IReturn.doubleHolder_4);
   private final GetStartTimeHandler l1IIllI11l111IlI1II11lIl11II = new GetStartTimeHandler(200L, IReturn.doubleHolder_4);
   private HeightHandler l1I111I1IIIlI;
   private HeightHandler l11IlI1lI1llIll;
   private HeightHandler III1llIII1IIllI11Ill1llll1;

   public MusicInfo(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
   }

   @Override
   public void tick() {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
         if (l11I1I1ll1Illll1I1l1111l1II.player.age % 5 == 0) {
            this.Il1I1lll1Il11IIl1
               .execute(
                  () -> {
                     IMediaSession imediasession;
                     try {
                        imediasession = MediaPlayerInfo.Instance
                           .getMediaSessions()
                           .stream()
                           .max(Comparator.comparing(imediasession2 -> imediasession2.getMedia().getPlaying()))
                           .orElse(null);
                     } catch (Throwable throwable) {
                        imediasession = null;
                     }

                     if (imediasession != null) {
                        MediaInfo mediainfo = imediasession.getMedia();
                        if (!mediainfo.getTitle().isEmpty() || !mediainfo.getArtist().isEmpty()) {
                           byte[] abyte = mediainfo.getArtworkPng();
                           IMediaSession imediasession1 = imediasession;
                           l11I1I1ll1Illll1I1l1111l1II.execute(() -> {
                              if (this.I1Il1l1IIIlllI1.getTitle().equals("Track Name") || !Arrays.equals(this.I1Il1l1IIIlllI1.getArtworkPng(), abyte)) {
                                 HashMapHolder.StringHolder_8(new ZenithInternal116(this.IlllIl1l1I1II1ll11II), abyte);
                              }

                              this.II1II111lII11IlIl111IIII1II = imediasession1;
                              this.I1Il1l1IIIlllI1 = mediainfo;
                              this.I1IlI1I11I1.reset();
                           });
                           return;
                        }
                     }

                     this.II1II111lII11IlIl111IIII1II = null;
                  }
               );
         }
      }
   }

   @Override
   public boolean StringHolder_8(EventImpl_38 lllll1l1iliiiiiiililii11) {
      if (lllll1l1iliiiiiiililii11.Elytrafly() == 1 && lllll1l1iliiiiiiililii11.Elytratarget() == 0) {
         Vector2f Vector2f = this.II1IIll1IlI1llII1lIlI1I1();
         double d0 = (double)Vector2f.getX();
         double d1 = (double)Vector2f.getY();
         if (this.l1I111I1IIIlI != null && this.l1I111I1IIIlI.byteHolder(d0, d1)) {
            this.StringHolder_8(MusicInfo$II1Il11l111II11IIl.llI1l1I1IIlIII);
            return true;
         } else if (this.l11IlI1lI1llIll != null && this.l11IlI1lI1llIll.byteHolder(d0, d1)) {
            this.StringHolder_8(MusicInfo$II1Il11l111II11IIl.lIIllllIllIIl11IlIlI);
            return true;
         } else if (this.III1llIII1IIllI11Ill1llll1 != null && this.III1llIII1IIllI11Ill1llll1.byteHolder(d0, d1)) {
            this.StringHolder_8(MusicInfo$II1Il11l111II11IIl.lI1lIIIlII1I);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      try {
         this.l11I1I11lI1IIl1lll
            .ZenithInternal101(
               !this.I1IlI1I11I1.HostnameVerifierImpl(2000L)
                  || l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen
                  || ZenithClient.getInstance().ZenithInternal141().isRenderHud()
            );
         if (this.l11I1I11lI1IIl1lll.CloudFriendInfo() == 0.0F) {
            return;
         }

         Vector2f Vector2f = this.II1IIll1IlI1llII1lIlI1I1();
         this.IIll111ll11llI11Il11lII1lIl.ZenithInternal101(this.StringHolder_8((double)Vector2f.getX(), (double)Vector2f.getY()));
         float f = this.IIll111ll11llI11Il11lII1lIl.CloudFriendInfo();
         Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
         Font font1 = Fonts.REGULAR.getFont(5.5F);
         Font font2 = Fonts.NEW_MEDIUM.getFont(5.0F);
         float f1 = 17.0F;
         float f2 = f1 + (float)GuiStyle.PADDING.intValue() * 2.0F;
         float f3 = (float)GuiStyle.PADDING.intValue();
         float f4 = Interface.lIl111ll1l111lIIlIlI1I1();
         ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
         ByteBufferHolder il1iliilli1l1iill = zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
         ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
         ByteBufferHolder il1iliilli1l1iill2 = zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1();
         ByteBufferHolder il1iliilli1l1iill3 = zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1();
         ByteBufferHolder il1iliilli1l1iill4 = zenithstyle.getFieldBorder().l1IllIl1l1llIlI11I11Il1l1l1lI1();
         ByteBufferHolder il1iliilli1l1iill5 = zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1();
         this.width = 109.0F;
         this.height = 25.0F + IlIllll11l1l1llIll * f;
         lliii11l1lllil.lII1I1l1I11111l1llI1();
         float f5 = this.x + this.width / 2.0F;
         float f6 = this.y + this.height / 2.0F;
         lliii11l1lllil.getMatrices().translate(f5, f6, 0.0F);
         lliii11l1lllil.getMatrices().scale(this.l11I1I11lI1IIl1lll.CloudFriendInfo(), this.l11I1I11lI1IIl1lll.CloudFriendInfo(), 1.0F);
         lliii11l1lllil.getMatrices().translate(-f5, -f6, 1.0F);
         floatHolder_8.Event(
            lliii11l1lllil.getMatrices(),
            this.x,
            this.y,
            this.width,
            this.height,
            21.0F,
            floatHolder_5.StringHolder_30(f4),
            ByteBufferHolder.ll1lIllll111I1lIIl1lIl
         );
         lliii11l1lllil.StringHolder_8(this.x, this.y, this.width, this.height, floatHolder_5.StringHolder_30(f4), il1iliilli1l1iill);
         lliii11l1lllil.StringHolder_8(this.x, this.y, f2, 25.0F, floatHolder_5.StringHolder_30(f4), il1iliilli1l1iill1);
         floatHolder_8.StringHolder_8(
            lliii11l1lllil.getMatrices(), this.IlllIl1l1I1II1ll11II, this.x + f3, this.y + f3, f1, f1, floatHolder_5.StringHolder_30(2.0F)
         );
         float f7 = this.x + f2 + f3;
         float f8 = this.x + this.width - f3 - f1;
         float f9 = this.y + (25.0F - f1) / 2.0F;
         float f10 = this.I1Il1l1IIIlllI1.getDuration() > 0L ? (float)this.I1Il1l1IIIlllI1.getPosition() / (float)this.I1Il1l1IIIlllI1.getDuration() : 0.0F;
         this.l1IIllI11l111IlI1II11lIl11II.StringHolder_8(f10);
         float f11 = this.l1IIllI11l111IlI1II11lIl11II.CloudFriendInfo();
         float f12 = this.y + f3 + f3 / 2.0F;
         float f13 = f12 + font.height() + 0.5F;
         String s = this.byteHolder_2(this.I1Il1l1IIIlllI1.getPosition());
         float f14 = f8 + (f1 - font2.width(s)) / 2.0F;
         float f15 = Math.max(0.0F, f8 - f7 - (float)GuiStyle.PADDING.intValue());
         this.StringHolder_8(lliii11l1lllil, font, this.I1Il1l1IIIlllI1.getTitle(), f7, f12, il1iliilli1l1iill2, f15);
         if (!this.I1Il1l1IIIlllI1.getArtist().isEmpty()) {
            this.StringHolder_8(lliii11l1lllil, font1, this.I1Il1l1IIIlllI1.getArtist(), f7, f13 + 1.5F, il1iliilli1l1iill3, f15);
         }

         lliii11l1lllil.StringHolder_8(font2, s, f14, f9 + (f1 - font2.height()) / 2.0F, il1iliilli1l1iill2);
         float f16 = Math.max(0.0F, Math.min(f11, 1.0F));
         floatHolder_8.StringHolder_8(lliii11l1lllil.getMatrices(), f8, f9, f1, f1, 1.0F, 360.0F, 0.5F, il1iliilli1l1iill4);
         floatHolder_8.StringHolder_8(lliii11l1lllil.getMatrices(), f8, f9, f1, f1, 1.0F, 360.0F * f16, 0.5F, il1iliilli1l1iill5);
         this.StringHolder_8(lliii11l1lllil, zenithstyle, Vector2f, f);
         lliii11l1lllil.IIlII1lII1();
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   private void StringHolder_8(DrawContextImpl lliii11l1lllil, ZenithStyle zenithstyle, Vector2f Vector2f, float f) {
      if (f <= 0.001F) {
         this.l1I111I1IIIlI = null;
         this.l11IlI1lI1llIll = null;
         this.III1llIII1IIllI11Ill1llll1 = null;
      } else {
         Font font = Fonts.NEW_ICONS.getFont(5.0F);
         float f1 = (float)GuiStyle.PADDING.intValue();
         float f2 = (float)(GuiStyle.PADDING * 2);
         float f3 = this.width - f2 * 2.0F;
         float f4 = (f3 - f1 * 2.0F) / 3.0F;
         float f5 = font.height() + f1;
         float f6 = this.y + 25.0F + (IlIllll11l1l1llIll - f5) / 2.0F - (1.0F - f) * 4.0F;
         float f7 = this.x + f2;
         this.l1I111I1IIIlI = new HeightHandler(f7, f6, f4, f5);
         this.l11IlI1lI1llIll = new HeightHandler(f7 + f4 + f1, f6, f4, f5);
         this.III1llIII1IIllI11Ill1llll1 = new HeightHandler(f7 + (f4 + f1) * 2.0F, f6, f4, f5);
         boolean flag = this.l1I111I1IIIlI.byteHolder((double)Vector2f.getX(), (double)Vector2f.getY());
         boolean flag1 = this.l11IlI1lI1llIll.byteHolder((double)Vector2f.getX(), (double)Vector2f.getY());
         boolean flag2 = this.III1llIII1IIllI11Ill1llll1.byteHolder((double)Vector2f.getX(), (double)Vector2f.getY());
         ByteBufferHolder il1iliilli1l1iill = zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f);
         ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getHeaderHudBackground()
            .l1IllIl1l1llIlI11I11Il1l1l1lI1()
            .StringHolder_24(0.06F)
            .ZenithInternal039(f);
         ByteBufferHolder il1iliilli1l1iill2 = zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f);
         this.StringHolder_8(lliii11l1lllil, font, "y", this.l1I111I1IIIlI, flag, il1iliilli1l1iill1, il1iliilli1l1iill2, il1iliilli1l1iill);
         this.StringHolder_8(lliii11l1lllil, font, "z", this.III1llIII1IIllI11Ill1llll1, flag2, il1iliilli1l1iill1, il1iliilli1l1iill2, il1iliilli1l1iill);
         this.StringHolder_8(
            lliii11l1lllil,
            Fonts.NEW_ICONS.getFont(5.5F),
            this.I1Il1l1IIIlllI1.getPlaying() ? "|" : "}",
            this.l11IlI1lI1llIll,
            flag1,
            il1iliilli1l1iill1,
            il1iliilli1l1iill2,
            il1iliilli1l1iill
         );
      }
   }

   private void StringHolder_8(
      DrawContextImpl lliii11l1lllil,
      Font font,
      String s,
      HeightHandler li1il11i1iilii1iiili111li11,
      boolean flag,
      ByteBufferHolder il1iliilli1l1iill2,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1
   ) {
      float f = li1il11i1iilii1iiili111li11.Il11lIlllI111I1l1111() + (li1il11i1iilii1iiili111li11.width() - font.width(s)) / 2.0F;
      float f1 = li1il11i1iilii1iiili111li11.I1II11l1I11Illl11IIl1l1lIl1II() + (li1il11i1iilii1iiili111li11.height() - font.height()) / 2.0F;
      lliii11l1lllil.StringHolder_8(font, s, f, f1, flag ? il1iliilli1l1iill : il1iliilli1l1iill1);
   }

   private boolean StringHolder_8(double d0, double d1) {
      return this.StringHolder_8(d0, d1, this.x, this.y, this.width, 25.0F)
         ? true
         : this.IIll111ll11llI11Il11lII1lIl.CloudFriendInfo() > 0.01F
            && this.StringHolder_8(d0, d1, this.x, this.y, this.width, 25.0F + IlIllll11l1l1llIll);
   }

   private boolean StringHolder_8(double d0, double d1, float f, float f1, float f2, float f3) {
      return d0 >= (double)f && d0 <= (double)(f + f2) && d1 >= (double)f1 && d1 <= (double)(f1 + f3);
   }

   private void StringHolder_8(MusicInfo$II1Il11l111II11IIl lil1iili1i1l1111i11$ii1il11l111ii11iil) {
      IMediaSession imediasession = this.II1II111lII11IlIl111IIII1II;
      if (imediasession != null) {
         this.Il1I1lll1Il11IIl1.execute(() -> {
            try {
               switch (lil1iili1i1l1111i11$ii1il11l111ii11iil) {
                  case llI1l1I1IIlIII:
                     imediasession.previous();
                     break;
                  case lIIllllIllIIl11IlIlI:
                     imediasession.playPause();
                     break;
                  case lI1lIIIlII1I:
                     imediasession.next();
               }

               this.I1IlI1I11I1.reset();
            } catch (Throwable throwable) {
            }
         });
      }
   }

   private void StringHolder_8(DrawContextImpl lliii11l1lllil, Font font, String s, float f, float f1, ByteBufferHolder il1iliilli1l1iill, float f2) {
      float f3 = font.width(s);
      float f4 = 0.0F;
      if (f3 > f2) {
         float f5 = f3 - f2;
         if (f5 < 0.0F) {
            f5 = 0.0F;
         }

         float f6 = 1000.0F;
         float f7 = 4000.0F;
         float f8 = f6 + f7 + f6 + f7;
         long i = System.currentTimeMillis();
         float f9 = (float)(i % (long)f8);
         if (f9 < f6) {
            f4 = 0.0F;
         } else if (f9 < f6 + f7) {
            float f10 = (f9 - f6) / f7;
            f4 = f10 * f5;
         } else if (f9 < f6 + f7 + f6) {
            f4 = f5;
         } else {
            float f11 = (f9 - f6 - f7 - f6) / f7;
            f4 = f5 * (1.0F - f11);
         }
      }

      lliii11l1lllil.StringHolder_8(
         (int)Math.ceil((double)(f - 1.0F)),
         (int)Math.ceil((double)(f1 - 1.0F)),
         (int)Math.ceil((double)(f - 1.0F + f2 + 2.0F)),
         (int)Math.ceil((double)(f1 - 1.0F + font.height() + 5.0F))
      );
      lliii11l1lllil.StringHolder_8(font, s.toLowerCase(), f - f4, f1, il1iliilli1l1iill);
      lliii11l1lllil.llIIll1II1l1IIll();
   }

   private String byteHolder_2(long i) {
      long j = i / 60L;
      long k = i % 60L;
      return String.format("%d:%02d", j, k);
   }
}
