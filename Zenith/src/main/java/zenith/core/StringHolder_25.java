package zenith;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket.GlUniform9;
import org.apache.commons.lang3.StringUtils;

public class StringHolder_25 implements ZenithInternal076 {
   private final longHolder l11I1I11llI = new longHolder();
   private String server = "Vanilla";
   private boolean llIIII1llIIIlll1;
   private int llII1I11ll1I1lI1IIIll1l1I1lI1;
   private boolean III1lII1lIllI1IlIIlIIIIIll;
   private boolean lIII11ll = false;
   private final ArrayDeque<Float> lII1l1I1IlIlll1ll1l1I = new ArrayDeque<>(20);
   private long I1lIIl1I1l11l1IlIIII11lIlIll1;
   private long Ill1I111II1I11I1lI1111lII1;
   private float IlI1I1IIIl111l1I11I;

   public StringHolder_25() {
      EventBus.StringHolder_8(this);
   }

   @EventTarget
   public void StringHolder_8(EventImpl_22 l11llilil1) {
      this.llII1I11ll1I1lI1IIIll1l1I1lI1 = this.lI1l11Il111IIllIII1l1();
      this.server = this.Ill1I1I11IlI11lI11l();
      this.III1lII1lIllI1IlIIlIIIIIll = this.l1lllI1lIIII1l();
      if (this.ll1Il11I1I1IlIl()) {
         this.l11I1I11llI.reset();
      }
   }

   public float l11l111lIlIl1llI1Il1I1Il() {
      return ConnectThread((double)this.IlI1I1IIIl111l1I11I);
   }

   public float l1l1Il111I1() {
      return ConnectThread((double)(20.0F * ((float)this.Ill1I111II1I11I1lI1111lII1 / 1000.0F)));
   }

   public float l1I11I1Il1IIll1IlllIllIl11l() {
      return (float)this.Ill1I111II1I11I1lI1111lII1 / 1000.0F;
   }

   public static float ConnectThread(double d0) {
      BigDecimal bigdecimal = new BigDecimal(d0);
      bigdecimal = bigdecimal.setScale(2, RoundingMode.HALF_UP);
      return bigdecimal.floatValue();
   }

   @EventTarget
   public void ConnectThread(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.longHolder_8() && ii1l11il1i1i.Swinganimation() instanceof WorldTimeUpdateS2CPacket) {
         if (this.I1lIIl1I1l11l1IlIIII11lIlIll1 != 0L) {
            this.Ill1I111II1I11I1lI1111lII1 = System.currentTimeMillis() - this.I1lIIl1I1l11l1IlIIII11lIlIll1;
            if (this.lII1l1I1IlIlll1ll1l1I.size() > 20) {
               this.lII1l1I1IlIlll1ll1l1I.poll();
            }

            this.lII1l1I1IlIlll1ll1l1I.add(20.0F * (1000.0F / (float)this.Ill1I111II1I11I1lI1111lII1));
            float f = 0.0F;

            for (Float f1 : this.lII1l1I1IlIlll1ll1l1I) {
               f += MathHelper.clamp(f1, 0.0F, 20.0F);
            }

            this.IlI1I1IIIl111l1I11I = f / (float)this.lII1l1I1IlIlll1ll1l1I.size();
         }

         this.I1lIIl1I1l11l1IlIIII11lIlIll1 = System.currentTimeMillis();
      }
   }

   @EventTarget
   public void StringHolder_8(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.Swinganimation() instanceof ClientCommandC2SPacket ClientCommandC2SPacket) {
         if (ClientCommandC2SPacket.getMode().equals(GlUniform9.START_SPRINTING)) {
            this.llIIII1llIIIlll1 = true;
         } else if (ClientCommandC2SPacket.getMode().equals(GlUniform9.STOP_SPRINTING)) {
            this.llIIII1llIIIlll1 = false;
         }
      }
   }

   private String Ill1I1I11IlI11lI11l() {
      if (!ZenithInternal066.lII1IlIll11()
         && l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() != null
         && l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().getServerInfo() != null
         && l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().getBrand() != null) {
         String s = l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().getServerInfo().address.toLowerCase();
         String s1 = l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().getBrand().toLowerCase();
         if (s1.contains("botfilter")) {
            return "FunTime";
         } else if (s.contains("funtime") || s.contains("skytime") || s.contains("space-times") || s.contains("funsky")) {
            return "CopyTime";
         } else if (s1.contains("holyworld") || s1.contains("holywоrld") || s1.contains("leaf") || s1.contains("vk.com/idwok")) {
            return "HolyWorld";
         } else {
            return s.contains("reallyworld") ? "ReallyWorld" : "Vanilla";
         }
      } else {
         return "Vanilla";
      }
   }

   private int lI1l11Il111IIllIII1l1() {
      net.minecraft.scoreboard.Scoreboard Scoreboard = l11I1I1ll1Illll1I1l1111l1II.world.getScoreboard();
      net.minecraft.scoreboard.ScoreboardObjective ScoreboardObjective = Scoreboard.getObjectiveForSlot(ScoreboardDisplaySlot.SIDEBAR);
      String s = this.server;
      switch (s) {
         case "FunTime":
            if (ScoreboardObjective != null) {
               String[] astring = ScoreboardObjective.getDisplayName().getString().split("-");
               if (astring.length > 1) {
                  return Integer.parseInt(astring[1]);
               }
            }
            break;
         case "HolyWorld":
            for (ScoreboardEntry ScoreboardEntry : Scoreboard.getScoreboardEntries(ScoreboardObjective)) {
               String s1 = net.minecraft.scoreboard.Team.decorateName(Scoreboard.getScoreHolderTeam(ScoreboardEntry.owner()), ScoreboardEntry.name()).getString();
               if (!s1.isEmpty()) {
                  String s2 = StringUtils.substringBetween(s1, "#", " -◆-");
                  if (s2 != null && !s2.isEmpty()) {
                     return Integer.parseInt(s2);
                  }
               }
            }
      }

      return -1;
   }

   public boolean I1l1Illl1l11() {
      return !this.l11I1I11llI.HostnameVerifierImpl(250L);
   }

   private boolean ll1Il11I1I1IlIl() {
      return l11I1I1ll1Illll1I1l1111l1II.inGameHud
         .getBossBarHud()
         .bossBars
         .values()
         .stream()
         .map(ClientBossBar -> ClientBossBar.getName().getString().toLowerCase())
         .anyMatch(s -> s.contains("pvp") || s.contains("пвп"));
   }

   private boolean l1lllI1lIIII1l() {
      return l11I1I1ll1Illll1I1l1111l1II.inGameHud
         .getBossBarHud()
         .bossBars
         .values()
         .stream()
         .map(ClientBossBar -> ClientBossBar.getName().getString().toLowerCase())
         .anyMatch(s -> (s.contains("pvp") || s.contains("пвп")) && (s.contains("0") || s.contains("1")));
   }

   public String I1lllI1I1II11I() {
      return l11I1I1ll1Illll1I1l1111l1II.world.getRegistryKey().getValue().getPath();
   }

   public boolean Ill1I11IIIlllIIllII1lIl() {
      return this.server.equals("CopyTime") || this.server.equals("SpookyTime") || this.server.equals("FunTime");
   }

   public boolean l1I1111ll11lI1lllI1() {
      return this.server.equals("FunTime");
   }

   public boolean lI11IIIl111lI1IIII1lIIII() {
      return this.server.equals("ReallyWorld");
   }

   public boolean III11I1lI1I() {
      return this.server.equals("HolyWorld");
   }

   public boolean II1ll1I11l1lIl11111IlII() {
      return this.server.equals("Vanilla");
   }

   public longHolder II1I1I1lIIl1l1IllI1111l1lII() {
      return this.l11I1I11llI;
   }

   public String getServer() {
      return this.server;
   }

   public boolean I11I1llll11IIl1IIl1I1ll1I1I1l1() {
      return this.llIIII1llIIIlll1;
   }

   public int lIl1l1l11ll1lI1I1I() {
      return this.llII1I11ll1I1lI1IIIll1l1I1lI1;
   }

   public boolean l1IlI1llIllIIII11III11I1llI1I() {
      return this.III1lII1lIllI1IlIIlIIIIIll;
   }

   public boolean IlIl1I1lII1IllllllIIlIIIll11() {
      return this.lIII11ll;
   }

   public ArrayDeque<Float> lll1I1lIlIlIl1I1lllllII11lI() {
      return this.lII1l1I1IlIlll1ll1l1I;
   }

   public long I1lll1IlllI1l1IlIl11ll11() {
      return this.I1lIIl1I1l11l1IlIIII11lIlIll1;
   }

   public long l1IlI1Ill1IlIIl1l1111l1lII1111() {
      return this.Ill1I111II1I11I1lI1111lII1;
   }
}
