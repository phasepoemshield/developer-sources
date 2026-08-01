package l;

import fat.releon.mixins.client.IMinecraftClient;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.client.gui.screen.ConfirmScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket;
import net.minecraft.text.Text;

public class PvPSafe extends Helper242 {
   private final Setting3 hubConfirm = new Setting3("Подтверждать /hub", "Требовать повторный ввод /hub при активном PvP-боссбаре").method2201(true);
   private final Setting3 exitConfirm = new Setting3("Подтверждать выход", "Показывать подтверждение при выходе с сервера во время PvP").method2201(true);
   private final Setting2 confirmWindowMs = new Setting2("Окно подтверждения", "Сколько времени дается на повторный ввод /hub")
      .method2086(3000.0F)
      .method2078(500.0F, 10000.0F)
      .method2081(this.hubConfirm::method2200);
   static boolean allowDisconnectOnce;
   private long lastHubAttemptMs;
   private boolean confirmScreenOpen;

   public PvPSafe() {
      super("PvPSafe", "PvP Safe", Helper269.MISC);
      this.setup(new Helper264[]{this.hubConfirm, this.exitConfirm, this.confirmWindowMs});
   }

   public static PvPSafe method3728() {
      return Helper222.method1979(PvPSafe.class);
   }

   @Override
   public void deactivate() {
      this.lastHubAttemptMs = 0L;
      this.confirmScreenOpen = false;
      allowDisconnectOnce = false;
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (var1.method3894() && this.hubConfirm.method2200() && this.method3730()) {
         if (this.method3732(var1.method3895())) {
            long var2 = System.currentTimeMillis();
            if (var2 - this.lastHubAttemptMs <= (long)this.confirmWindowMs.method2082()) {
               this.lastHubAttemptMs = 0L;
               Notifications.method1666().method1668("[PvPSafe] /hub confirmed.", 1500L);
            } else {
               this.lastHubAttemptMs = var2;
               var1.method582();
               Notifications.method1666().method1668("[PvPSafe] PvP boss bar active. Repeat /hub to confirm.", 2500L);
            }
         }
      }
   }

   public boolean method3729(Screen var1, boolean var2) {
      if (!this.exitConfirm.method2200() || !this.method3730() || allowDisconnectOnce) {
         return false;
      } else if (this.confirmScreenOpen) {
         return true;
      } else {
         this.confirmScreenOpen = true;
         Screen var3 = mc.currentScreen;
         mc.setScreen(new ConfirmScreen(var4 -> {
            this.confirmScreenOpen = false;
            if (var4) {
               allowDisconnectOnce = true;

               try {
                  ((IMinecraftClient)mc).invokeDisconnect(var1, var2);
               } finally {
                  allowDisconnectOnce = false;
               }
            } else {
               if (var3 != null) {
                  mc.setScreen(var3);
               } else {
                  mc.setScreen(var1);
               }
            }
         }, Text.of("PvPSafe"), Text.of("PvP boss bar is active. Do you really want to leave the server?")));
         return true;
      }
   }

   private boolean method3730() {
      return this.state && mc.player != null && mc.world != null && mc.inGameHud != null && this.method3731();
   }

   private boolean method3731() {
      Map<java.util.UUID, net.minecraft.client.gui.hud.ClientBossBar> var1 = mc.inGameHud.getBossBarHud().bossBars;

      for (ClientBossBar var3 : var1.values()) {
         String var4 = this.method3736(var3.getName().getString());
         if (var4.contains("pvp") || var4.contains("пвп")) {
            return true;
         }
      }

      return false;
   }

   private boolean method3732(Packet<?> var1) {
      return var1 instanceof ChatMessageC2SPacket var2 ? this.method3734(this.method3735(var2)) : this.method3733(var1, this.method3735(var1));
   }

   private boolean method3733(Packet<?> var1, String var2) {
      if (var2 != null && !var2.isBlank()) {
         String var3 = var1.getClass().getSimpleName().toLowerCase(Locale.ROOT);
         if (!var3.contains("command")) {
            return false;
         } else {
            String var4 = this.method3736(var2);
            return var4.equals("hub") || var4.startsWith("hub ");
         }
      } else {
         return false;
      }
   }

   private boolean method3734(String var1) {
      if (var1 != null && !var1.isBlank()) {
         String var2 = this.method3736(var1);
         return var2.equals("/hub") || var2.startsWith("/hub ");
      } else {
         return false;
      }
   }

   private String method3735(Object var1) {
      for (String var5 : new String[]{"chatMessage", "message", "command", "commandString"}) {
         try {
            Method var6 = var1.getClass().getMethod(var5);
            if (var6.invoke(var1) instanceof String var8) {
               return var8;
            }
         } catch (Exception var9) {
         }
      }

      return null;
   }

   private String method3736(String var1) {
      return var1 == null ? "" : var1.trim().toLowerCase(Locale.ROOT);
   }
}
