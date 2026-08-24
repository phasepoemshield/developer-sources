package oxxxde;

import eu.donyka.discord.RPCHandler;
import eu.donyka.discord.discord.RichPresence;
import eu.donyka.discord.discord.RichPresenceBuilder;

// $VF: Compiled from heavy
public final class جٍ {
   public static void shutdown() {
      RPCHandler.shutdown();
   }

   public static void startup() {
      RPCHandler.setOnReady(
         user -> {
            RichPresence presence = RichPresence.builder()
               .details("User: " + رغ.getUsername())
               .state("UID: " + رغ.getUid())
               .largeImageKey("https://r2.e-z.host/7d033548-c904-4c5c-b3b6-413d65aadf76/bw9sqryge6baxsz9uq.gif")
               .largeImageText("")
               .button(RichPresenceBuilder.RPCButton.of("Купить", "https://rainvisuals.pro"))
               .button(RichPresenceBuilder.RPCButton.of("Телеграм", "https://t.me/rainvisuals"))
               .build();
            RPCHandler.updatePresence(presence);
         }
      );
      RPCHandler.setOnDisconnected(error -> System.out.println("RPC Disconnected: " + error));
      RPCHandler.setOnErrored(error -> System.out.println("RPC Errored: " + error));
      RPCHandler.startup("1523103626338500718", false);
   }

   private جٍ() {
   }
}
