package org.wild.rpc;

import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
import ru.metaculture.protection.NvNNVNN;
import ru.metaculture.protection.UVUVuvnUVv;
import ru.metaculture.protection.UnVvunvVNVuu;
import ru.metaculture.protection.nnNVUNnuv;
import ru.metaculture.protection.nvnuvUUuvUN;
import ru.metaculture.protection.vvvvUNVuu;

public class DiscordEventHandlers extends Structure {
   public nnNVUNnuv disconnected;
   public nvnuvUUuvUN joinRequest;
   public vvvvUNVuu spectateGame;
   public UnVvunvVNVuu ready;
   public NvNNVNN errored;
   public UVUVuvnUVv joinGame;

   protected List<String> getFieldOrder() {
      return Arrays.asList("ready", "disconnected", "errored", "joinGame", "spectateGame", "joinRequest");
   }
}
