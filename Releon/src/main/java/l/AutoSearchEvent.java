package l;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;

public class AutoSearchEvent extends Helper242 {
   private static final long MESSAGE_PAIR_WINDOW_MS = 4000L;
   private final List<String> eventMessages = List.of("вулкан", "маяк убийца", "метеоридный дождь", "метеоритный дождь", "мистический сундук", "сундук смерти");
   private final String requiredText = "статус";
   private static final List<Integer> ANARCHIES = Arrays.asList(
      101,
      102,
      103,
      104,
      105,
      106,
      107,
      108,
      109,
      201,
      202,
      203,
      204,
      205,
      206,
      207,
      208,
      209,
      210,
      211,
      212,
      213,
      214,
      215,
      216,
      217,
      218,
      219,
      220,
      221,
      222,
      223,
      224,
      225,
      226,
      227,
      228,
      229,
      230,
      301,
      302,
      303,
      304,
      305,
      306,
      307,
      308,
      309,
      501,
      502,
      503,
      504,
      505,
      506,
      507,
      508,
      509,
      510,
      511,
      512,
      901,
      902,
      903,
      904
   );
   private int currentIndex = 0;
   private final int delayMS = 1000;
   private long nextActionAt = 0L;
   private boolean waitingEventDelay = false;
   private long lastEventNameAt = 0L;
   private long lastStatusAt = 0L;
   private String lastEventName = "";

   public AutoSearchEvent() {
      super("AutoSearchEvent", "AutoSearchEvent", Helper269.PLAYER);
   }

   @Override
   public void activate() {
      super.activate();
      this.currentIndex = 0;
      this.nextActionAt = 0L;
      this.waitingEventDelay = false;
      this.lastEventNameAt = 0L;
      this.lastStatusAt = 0L;
      this.lastEventName = "";
   }

   @Override
   public void deactivate() {
      this.waitingEventDelay = false;
      super.deactivate();
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.player.networkHandler != null) {
         long var2 = System.currentTimeMillis();
         if (var2 >= this.nextActionAt) {
            if (this.waitingEventDelay) {
               this.method1797("/event delay");
               this.waitingEventDelay = false;
               this.currentIndex++;
               this.nextActionAt = var2 + 1000L;
            } else if (this.currentIndex >= ANARCHIES.size()) {
               Notifications.method1666().method1668("Ивент не найден", 3000L);
               this.setState(false);
            } else {
               this.method1797("/an" + ANARCHIES.get(this.currentIndex));
               this.waitingEventDelay = true;
               this.nextActionAt = var2 + 1000L;
            }
         }
      }
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (mc.player != null && var1.method3896() == Helper385.RECEIVE) {
         if (var1.method3895() instanceof GameMessageS2CPacket var2) {
            String var8 = var2.content().getString().toLowerCase(Locale.ROOT);
            long var4 = System.currentTimeMillis();

            for (String var7 : this.eventMessages) {
               if (var8.contains(var7)) {
                  this.lastEventName = var7;
                  this.lastEventNameAt = var4;
                  break;
               }
            }

            if (var8.contains("статус")) {
               this.lastStatusAt = var4;
            }

            boolean var9 = this.lastEventNameAt > 0L && this.lastStatusAt > 0L && Math.abs(this.lastEventNameAt - this.lastStatusAt) <= 4000L;
            if (var9) {
               Notifications.method1666().method1668("Ивент найден: " + this.lastEventName, 3000L);
               this.setState(false);
            }
         }
      }
   }

   private void method1797(String var1) {
      if (var1.startsWith("/")) {
         var1 = var1.substring(1);
      }

      String var2 = var1;
      mc.execute(() -> {
         if (mc.player != null && mc.player.networkHandler != null) {
            mc.player.networkHandler.sendChatCommand(var2);
         }
      });
   }
}
