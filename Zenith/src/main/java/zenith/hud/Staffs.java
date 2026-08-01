package zenith.hud;

import com.mojang.authlib.GameProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.world.GameMode;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.client.network.PlayerListEntry;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class Staffs extends HudElement {
   private static final float l111I111IlII1 = 17.0F;
   private static final float IlIII1lII1Il111IlI11llllIl111 = 7.0F;
   private final GetStartTimeHandler IIII1lIllIIIIlI1l11lllIllI1lIl = new GetStartTimeHandler(200L, 100.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler Il1lIlll1ll1I1 = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler llI1I11I11IIIl11lIlll = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);
   private final Map<String, Staffs$EventBus> I11IIIII111IlI1lI1I1IIlll11 = new LinkedHashMap<>();
   private final Set<String> I1llI1II1II1Il1lIIl11IIlll111 = Set.of(
      "helper", "ᴀдмин", "moder", "staff", "admin", "curator", "стажёр", "сотрудник", "помощник", "админ", "модер"
   );
   private final Map<String, Identifier> l1lIIIIIIl1II11I1l11Il = new HashMap<>();
   private long IIl1lIl11Il1l1IIII1l1l1I11I = 0L;
   private long lllIIIIl1lI1l11llll1l1Il1I11 = 0L;
   private final Set<String> III11Ill11IlI11IlIllll11I = new HashSet<>();

   public Staffs(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      long i = System.currentTimeMillis();
      if (i - this.IIl1lIl11Il1l1IIII1l1l1I11I > 1000L && l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() != null) {
         this.l1l11l1llIIllIIII1lIl();
         this.IIl1lIl11Il1l1IIII1l1l1I11I = i;
      }

      if (i - this.lllIIIIl1lI1l11llll1l1Il1I11 > 30000L) {
         this.l1lIIIIIIl1II11I1l11Il.clear();
         this.lllIIIIl1lI1l11llll1l1Il1I11 = i;
      }

      this.I11IIIII111IlI1lI1I1IIlll11.entrySet().removeIf(entry1 -> entry1.getValue().IlIl11l11ll());
      if (this.I11IIIII111IlI1lI1I1IIlll11.isEmpty()) {
         this.Il1lIlll1ll1I1.StringHolder_8(0.0F);
      } else {
         Staffs$EventBus i1l1i1ii1ll1ll1111$l1i1illlili = this.I11IIIII111IlI1lI1I1IIlll11.values().iterator().next();
         this.Il1lIlll1ll1I1
            .StringHolder_8(this.I11IIIII111IlI1lI1I1IIlll11.size() == 1 && i1l1i1ii1ll1ll1111$l1i1illlili.lIlIIllI1I.HootBar() == 0.0F ? 0.0F : 1.0F);
      }

      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      Font font = Fonts.NEW_ICONS.getFont(5.5F);
      Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
      float f = this.x;
      float f1 = this.y;
      float f2 = (float)(
         (double)(17.0F + (float)GuiStyle.PADDING.intValue())
            + this.I11IIIII111IlI1lI1I1IIlll11
               .values()
               .stream()
               .mapToDouble(
                  i1l1i1ii1ll1ll1111$l1i1illlili2 -> (double)(
                        (i1l1i1ii1ll1ll1111$l1i1illlili2.getHeight() + (float)GuiStyle.PADDING.intValue())
                           * i1l1i1ii1ll1ll1111$l1i1illlili2.lIlIIllI1I.CloudFriendInfo()
                     )
               )
               .sum()
      );
      float f3 = (float)this.I11IIIII111IlI1lI1I1IIlll11
         .values()
         .stream()
         .mapToDouble(Staffs$EventBus::IIIlI1lI11l1111IlIl11)
         .max()
         .orElse(100.0);
      f3 = this.IIII1lIllIIIIlI1l11lllIllI1lIl.StringHolder_8(f3);
      this.width = f3;
      this.height = f2;
      float f4 = Interface.lIl111ll1l111lIIlIlI1I1();
      this.llI1I11I11IIIl11lIlll
         .ZenithInternal101(
            l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen
               || ZenithClient.getInstance().ZenithInternal141().isRenderHud()
               || !this.I11IIIII111IlI1lI1I1IIlll11.isEmpty()
         );
      lliii11l1lllil.lII1I1l1I11111l1llI1();
      lliii11l1lllil.getMatrices().translate(f + f3 / 2.0F, f1 + f2 / 2.0F, 0.0F);
      lliii11l1lllil.getMatrices().scale(this.llI1I11I11IIIl11lIlll.CloudFriendInfo(), this.llI1I11I11IIIl11lIlll.CloudFriendInfo(), 1.0F);
      lliii11l1lllil.getMatrices().translate(-(f + f3 / 2.0F), -(f1 + f2 / 2.0F), 0.0F);
      floatHolder_8.Event(
         lliii11l1lllil.getMatrices(), f, f1, f3, f2, 21.0F, floatHolder_5.StringHolder_30(f4), ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      lliii11l1lllil.StringHolder_8(
         f, f1, f3, f2, floatHolder_5.StringHolder_30(f4), zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         f, f1, f3, 17.0F, floatHolder_5.StringHolder_30(f4), zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         font, "P", f + 8.0F, f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         font, "m", f + f3 - 8.0F - font.width("m"), f1 + (17.0F - font.height()) / 2.0F, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         font1,
         "Staffs",
         f + 8.0F + font.width("P") + (float)GuiStyle.PADDING.intValue(),
         f1 + (17.0F - font1.height()) / 2.0F,
         zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      if (this.llI1I11I11IIIl11lIlll.CloudFriendInfo() == 1.0F) {
         float f5 = f1 + 17.0F + (float)GuiStyle.PADDING.intValue();
         lliii11l1lllil.StringHolder_8((int)f, (int)f1, (int)(f + f3), (int)(f1 + f2));

         for (Entry entry : this.I11IIIII111IlI1lI1I1IIlll11.entrySet()) {
            Staffs$EventBus i1l1i1ii1ll1ll1111$l1i1illlili1 = (Staffs$EventBus)entry.getValue();
            i1l1i1ii1ll1ll1111$l1i1illlili1.StringHolder_8(lliii11l1lllil, f, f5, f3, this.III11Ill11IlI11IlIllll11I.contains(entry.getKey()));
            f5 += (i1l1i1ii1ll1ll1111$l1i1illlili1.getHeight() + (float)GuiStyle.PADDING.intValue())
               * i1l1i1ii1ll1ll1111$l1i1illlili1.lIlIIllI1I.CloudFriendInfo();
         }

         lliii11l1lllil.llIIll1II1l1IIll();
      }

      lliii11l1lllil.IIlII1lII1();
   }

   private void l1l11l1llIIllIIII1lIl() {
      if (l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() != null) {
         this.III11Ill11IlI11IlIllll11I.clear();

         for (PlayerListEntry PlayerListEntry : l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().getPlayerList()) {
            GameProfile gameprofile = PlayerListEntry.getProfile();
            Text Textx = PlayerListEntry.getDisplayName();
            if (gameprofile != null) {
               String s = gameprofile.getName();
               boolean flag = ZenithClient.getInstance().floatHolder_11().EventImpl_33(s);
               if (Textx != null || flag) {
                  String s1 = Textx != null ? Textx.getString() : s;
                  String s2 = s1.replace(s, "").trim();
                  if (flag || this.EventImpl_4(s2) && s2.length() >= 2) {
                     Staffs$EventTarget i1l1i1ii1ll1ll1111$illi1l1l1 = PlayerListEntry.getGameMode() == GameMode.SPECTATOR
                        ? Staffs$EventTarget.lI1lII1lIl1I1I
                        : Staffs$EventTarget.I1I1lI111l1l1I;
                     if (Textx != null) {
                        Textx = Textx.getString().contains(gameprofile.getName())
                           ? StringHolder_21.StringHolder_8(Textx, gameprofile.getName(), false)
                           : StringHolder_21.StringHolder_8(Textx, false);
                     } else {
                        Textx = Text.of(s);
                     }

                     Text Textx = Textx;
                     this.I11IIIII111IlI1lI1I1IIlll11
                        .computeIfAbsent(s1, s5 -> new Staffs$EventBus(this, Text, s1, s, i1l1i1ii1ll1ll1111$illi1l1l1));
                     this.III11Ill11IlI11IlIllll11I.add(s1);
                  }
               }
            }
         }
      }
   }

   public boolean EventImpl_4(String s) {
      String s1 = s.toLowerCase(Locale.US);

      for (String s2 : this.I1llI1II1II1Il1lIIl11IIlll111) {
         if (s1.contains(s2)) {
            return true;
         }
      }

      return false;
   }

   private String byteHolder_2(long i) {
      long j = i / 60000L;
      long k = i % 60000L / 1000L;
      return String.format("%d:%02d", j, k);
   }
}
