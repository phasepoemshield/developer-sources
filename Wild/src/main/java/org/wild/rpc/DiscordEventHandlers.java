package org.wild.rpc;

import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
import ru.metaculture.protection.O00000O0OO0OO;
import ru.metaculture.protection.O00000O0OO0OO0;
import ru.metaculture.protection.O00000O0OO0OOO;
import ru.metaculture.protection.O00000O0OOO;
import ru.metaculture.protection.O00000O0OOO0;
import ru.metaculture.protection.O00000O0OOO00;

public class DiscordEventHandlers extends Structure {
   public O00000O0OO0OO disconnected;
   public O00000O0OOO joinRequest;
   public O00000O0OOO00 spectateGame;
   public O00000O0OOO0 ready;
   public O00000O0OO0OO0 errored;
   public O00000O0OO0OOO joinGame;

   protected List<String> getFieldOrder() {
      return Arrays.asList("ready", "disconnected", "errored", "joinGame", "spectateGame", "joinRequest");
   }
}
