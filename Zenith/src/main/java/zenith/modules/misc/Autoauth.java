// Module: AutoAuth
// Category: misc
// Original class: Autoauth
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;

@ModuleInfo(
   name = "AutoAuth",
   category = Category.MISC,
   description = "Авто регистрация"
)
public final class Autoauth extends Module {
   public static final Autoauth I1lIIl1111l = new Autoauth();
   private final StringSetting IIIIl11111I1I11I = new StringSetting(
      "autoauth.passSetting.command", "autoauth.passSetting.command.desc", "BogdanSuperCoder", "Default password"
   );
   private final BooleanSetting I11lIIlllIl = new BooleanSetting(
      "autoauth.loginSetting.login", "autoauth.loginSetting.description", true
   );
   private final File IIlllIl1l1 = new File("autoauth_accounts.txt");
   private final BooleanSetting I1IIlIIlI111IIll = new BooleanSetting(
      "autoauth.randomPass", "autoauth.randomPass.description", true
   );
   private final ButtonSetting l1IIl11I1l11l1I1lI111I1IIII = new ButtonSetting("autoauth.openFile", "K", () -> {
      try {
         String s = this.IIlllIl1l1.getAbsolutePath();
         new ProcessBuilder("cmd", "/c", "start", "", "\"" + s + "\"").start();
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   });
   private final Map<String, String> Il1ll11l1Il1IIl11II1I1 = new HashMap<>();

   private Autoauth() {
      this.IlIlIIIIIl1ll111();
   }

   private void IlIlIIIIIl1ll111() {
      try {
         if (!this.IIlllIl1l1.exists()) {
            this.IIlllIl1l1.createNewFile();
            return;
         }

         for (String s : Files.readAllLines(this.IIlllIl1l1.toPath())) {
            if (s.contains(":")) {
               String[] astring = s.split(":", 3);
               if (astring.length >= 3) {
                  String s1 = astring[0].trim().toLowerCase();
                  String s2 = astring[1].trim();
                  String s3 = astring[2].trim();
                  String s4 = s1 + ":" + s2.toLowerCase();
                  this.Il1ll11l1Il1IIl11II1I1.put(s4, s3);
               }
            }
         }
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   private void IllIIll11lIIll1lIl111() {
      try {
         StringBuilder stringbuilder = new StringBuilder();

         for (Entry entry : this.Il1ll11l1Il1IIl11II1I1.entrySet()) {
            String s = (String)entry.getKey();
            String s1 = (String)entry.getValue();
            String[] astring = s.split(":", 2);
            String s2 = astring[0];
            String s3 = astring[1];
            stringbuilder.append(s2).append(" : ").append(s3).append(" : ").append(s1).append("\n");
         }

         Files.writeString(this.IIlllIl1l1.toPath(), stringbuilder.toString(), StandardOpenOption.TRUNCATE_EXISTING);
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   private String Il1l11I1I1Il1lIl1lI1l() {
      String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";
      Random random = new Random();
      StringBuilder stringbuilder = new StringBuilder();

      for (int i = 0; i < 12; i++) {
         stringbuilder.append(s.charAt(random.nextInt(s.length())));
      }

      return stringbuilder.toString();
   }

   private String EventImpl_9(String s) {
      if (s != null && !s.isEmpty()) {
         String[] astring = s.split("\\.");
         return astring.length >= 2 ? astring[astring.length - 2] : s;
      } else {
         return "unknown";
      }
   }

   @EventTarget
   public void ZenithInternal028(PacketHolder ii1l11il1i1i) {
      if (ii1l11il1i1i.longHolder_8()) {
         if (ii1l11il1i1i.Swinganimation() instanceof GameMessageS2CPacket GameMessageS2CPacket) {
            if (l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler() != null) {
               String s5 = GameMessageS2CPacket.content().getString().toLowerCase();
               String s = l11I1I1ll1Illll1I1l1111l1II.getCurrentServerEntry() != null ? l11I1I1ll1Illll1I1l1111l1II.getCurrentServerEntry().address : "";
               String s1 = this.EventImpl_9(s).toLowerCase();
               String s2 = l11I1I1ll1Illll1I1l1111l1II.getSession().getUsername().toLowerCase();
               String s3 = s1 + ":" + s2;
               String s4 = this.Il1ll11l1Il1IIl11II1I1.getOrDefault(s3, null);
               if (!s5.contains("/register") && !s5.contains("зарегистрируйтесь")) {
                  if (this.I11lIIlllIl.Spider() && s5.contains("/login")) {
                     if (s4 == null) {
                        s4 = this.IIIIl11111I1I11I.getValue();
                        this.Il1ll11l1Il1IIl11II1I1.put(s3, s4);
                        this.IllIIll11lIIll1lIl111();
                     }

                     l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendChatCommand("login " + s4);
                  }
               } else {
                  if (s4 == null) {
                     s4 = this.I1IIlIIlI111IIll.Spider() ? this.Il1l11I1I1Il1lIl1lI1l() : this.IIIIl11111I1I11I.getValue();
                  }

                  this.Il1ll11l1Il1IIl11II1I1.put(s3, s4);
                  this.IllIIll11lIIll1lIl111();
                  l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendChatCommand("register %s %s".formatted(s4, s4));
               }
            }
         }
      }
   }
}
