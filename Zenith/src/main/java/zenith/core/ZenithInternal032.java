package zenith;

import dev.firstdark.rpc.DiscordRpc;
import dev.firstdark.rpc.exceptions.UnsupportedOsType;

public final class ZenithInternal032 {
   public static void start() {
      DiscordRpc discordrpc = new DiscordRpc();
      RPCEventHandlerImpl$1 ii1iiii1il11l1ilii1i1ili$1 = new RPCEventHandlerImpl$1(discordrpc);

      try {
         discordrpc.init("1413965657464242418", ii1iiii1il11l1ilii1i1ili$1, false);
      } catch (UnsupportedOsType unsupportedostype) {
         throw new RuntimeException(unsupportedostype.getMessage());
      }
   }

   private ZenithInternal032() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
