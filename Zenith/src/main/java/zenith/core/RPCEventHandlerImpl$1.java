package zenith;

import dev.firstdark.rpc.DiscordRpc;
import dev.firstdark.rpc.enums.ActivityType;
import dev.firstdark.rpc.enums.ErrorCode;
import dev.firstdark.rpc.handlers.RPCEventHandler;
import dev.firstdark.rpc.models.DiscordRichPresence;
import dev.firstdark.rpc.models.User;

class RPCEventHandlerImpl$1 extends RPCEventHandler {
   RPCEventHandlerImpl$1(DiscordRpc discordrpc) {
      this.Il1III1Il111IIl11IlIl111lI1l = discordrpc;
   }

   @Override
   public void ready(User user) {
      System.out.println("ready");
      DiscordRichPresence discordrichpresence = DiscordRichPresence.builder()
         .details("User: " + ZenithClient.getInstance().ListHolder_7().getUsername())
         .largeImageKey("https://s14.gifyu.com/images/bKm4m.jpg")
         .activityType(ActivityType.PLAYING)
         .button(DiscordRichPresence.RPCButton.setDefaultTitleFade("Site", "https://hvh.moscow"))
         .build();
      this.Il1III1Il111IIl11IlIl111lI1l.updatePresence(discordrichpresence);
   }

   @Override
   public void errored(ErrorCode errorcode, String s) {
      System.out.println("errored " + errorcode + " = " + s);
   }
}
