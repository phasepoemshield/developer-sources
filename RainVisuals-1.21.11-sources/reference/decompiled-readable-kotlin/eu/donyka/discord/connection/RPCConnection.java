package eu.donyka.discord.connection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import eu.donyka.discord.DiscordRPC;
import eu.donyka.discord.enums.ErrorCode;
import eu.donyka.discord.enums.OpCode;
import eu.donyka.discord.enums.RPCState;
import eu.donyka.discord.exceptions.NoDiscordClientException;
import eu.donyka.discord.exceptions.PipeAccessDenied;
import eu.donyka.discord.exceptions.UnsupportedOsType;
import eu.donyka.discord.models.MessageFrame;
import eu.donyka.discord.models.User;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import lombok.Generated;

// $VF: Compiled from RPCConnection.java
public class RPCConnection {
   private RPCState state;
   private ErrorCode lastErrorCode;
   private final String appId;
   private static final Gson GSON = new GsonBuilder().serializeNulls().create();
   private final DiscordRPC rpcClient;
   private String lastErrorMessage;
   private Consumer<User> connectedCallback;
   private final BaseConnection baseConnection;
   private final Lock writeLock;
   private Consumer<RPCConnection.ErrorInfo> disconnectedCallback;

   public void open() throws PipeAccessDenied, NoDiscordClientException {
      if (this.state != RPCState.CONNECTED) {
         if (this.state != RPCState.DISCONNECTED || this.baseConnection.open()) {
            if (this.state != RPCState.SENT_HANDSHAKE) {
               MessageFrame var9 = new MessageFrame(OpCode.HANDSHAKE, this.writeHandshake());
               this.writeLock.lock();

               boolean var10;
               try {
                  var10 = this.baseConnection.write(var9.write().array());
               } finally {
                  this.writeLock.unlock();
               }

               if (var10) {
                  this.state = RPCState.SENT_HANDSHAKE;
               } else {
                  this.close();
               }
            } else {
               JsonObject data = new JsonObject();
               if (this.read(data)) {
                  String success = data.has("cmd") && !data.get("cmd").isJsonNull() ? data.get("cmd").getAsString() : null;
                  String evt = data.has("evt") && !data.get("evt").isJsonNull() ? data.get("evt").getAsString() : null;
                  if (success != null && evt != null && success.equals("DISPATCH") && evt.equals("READY")) {
                     this.state = RPCState.CONNECTED;
                     JsonObject userData = data.get("data").getAsJsonObject().get("user").getAsJsonObject();
                     User user = GSON.fromJson(userData, User.class);
                     if (this.connectedCallback != null) {
                        this.connectedCallback.accept(user);
                     }
                  }
               }
            }
         }
      }
   }

   private String writeHandshake() {
      JsonObject data = new JsonObject();
      data.add("v", new JsonPrimitive(1));
      data.add("client_id", new JsonPrimitive(this.appId));
      return data.toString();
   }

   @Generated
   public Lock getWriteLock() {
      return this.writeLock;
   }

   private RPCConnection(String rpc, DiscordRPC applicationId) throws UnsupportedOsType {
      this.baseConnection = BaseConnection.createConnection(rpc);
      this.state = RPCState.DISCONNECTED;
      this.rpcClient = rpc;
      this.connectedCallback = null;
      this.disconnectedCallback = null;
      this.appId = applicationId;
      this.lastErrorCode = ErrorCode.SUCCESS;
      this.lastErrorMessage = null;
      this.writeLock = new ReentrantLock();
   }

   @Generated
   public String getLastErrorMessage() {
      return this.lastErrorMessage;
   }

   @Generated
   public void setDisconnectedCallback(Consumer<RPCConnection.ErrorInfo> disconnectedCallback) {
      this.disconnectedCallback = disconnectedCallback;
   }

   @Generated
   public void setLastErrorMessage(String lastErrorMessage) {
      this.lastErrorMessage = lastErrorMessage;
   }

   @Generated
   public ErrorCode getLastErrorCode() {
      return this.lastErrorCode;
   }

   @Generated
   public Consumer<RPCConnection.ErrorInfo> getDisconnectedCallback() {
      return this.disconnectedCallback;
   }

   @Generated
   public RPCState getState() {
      return this.state;
   }

   @Generated
   public void setLastErrorCode(ErrorCode lastErrorCode) {
      this.lastErrorCode = lastErrorCode;
   }

   public boolean isOpen() {
      return this.state == RPCState.CONNECTED && this.baseConnection.isOpen();
   }

   private void close() {
      if (this.disconnectedCallback != null && (this.state == RPCState.CONNECTED || this.state == RPCState.SENT_HANDSHAKE)) {
         this.disconnectedCallback.accept(new RPCConnection.ErrorInfo(this.lastErrorCode, this.lastErrorMessage));
      }

      BaseConnection.destroyConnection(this.baseConnection);
      this.state = RPCState.DISCONNECTED;
   }

   @Generated
   public String getAppId() {
      return this.appId;
   }

   @Generated
   public DiscordRPC getRpcClient() {
      return this.rpcClient;
   }

   public static void destroy(RPCConnection connection) {
      connection.close();
   }

   public static RPCConnection create(String rpc, DiscordRPC applicationId) throws UnsupportedOsType {
      return new RPCConnection(applicationId, rpc);
   }

   @Generated
   public BaseConnection getBaseConnection() {
      return this.baseConnection;
   }

   @Generated
   public Consumer<User> getConnectedCallback() {
      return this.connectedCallback;
   }

   public boolean write(byte[] bytes) {
      MessageFrame messageFrame = new MessageFrame(OpCode.FRAME, new String(bytes, StandardCharsets.UTF_8));
      this.writeLock.lock();

      boolean success;
      try {
         success = this.baseConnection.write(messageFrame.write().array());
      } finally {
         this.writeLock.unlock();
      }

      if (!success) {
         this.close();
         return false;
      } else {
         return true;
      }
   }

   @Generated
   public void setConnectedCallback(Consumer<User> connectedCallback) {
      this.connectedCallback = connectedCallback;
   }

   @Generated
   public void setState(RPCState state) {
      this.state = state;
   }

   public boolean read(JsonObject jsonObject) {
      if (this.state != RPCState.CONNECTED && this.state != RPCState.SENT_HANDSHAKE) {
         return false;
      }

      MessageFrame messageFrame = new MessageFrame();

      while (true) {
         boolean didRead = this.baseConnection.read(messageFrame.getHeaderBuffer(), messageFrame.getHeaderBuffer().length);
         if (!didRead || !messageFrame.parseHeader()) {
            if (!this.baseConnection.isOpen()) {
               this.lastErrorCode = ErrorCode.PIPE_CLOSED;
               this.lastErrorMessage = "Pipe Closed";
               this.close();
            }

            return false;
         }

         if (messageFrame.getLength() > 0) {
            didRead = this.baseConnection.read(messageFrame.getMessageBuffer(), messageFrame.getLength());
            if (!didRead || !messageFrame.parseMessage()) {
               this.lastErrorCode = ErrorCode.READ_CORRUPT;
               this.lastErrorMessage = "Partial data in frame";
               this.close();
               return false;
            }
         }

         JsonObject object = GSON.fromJson(messageFrame.getMessage(), JsonObject.class);
         switch (messageFrame.getOpCode()) {
            case CLOSE:
               object.entrySet().forEach(entry -> jsonObject.add(entry.getKey(), entry.getValue()));
               int error = object.has("code") && !object.get("code").isJsonNull() ? object.get("code").getAsInt() : 0;
               if (error == 1000) {
                  error = 4;
               }

               this.lastErrorCode = error >= ErrorCode.values().length ? ErrorCode.UNKNOWN : ErrorCode.values()[error];
               this.lastErrorMessage = object.has("message") && !object.get("message").isJsonNull() ? object.get("message").getAsString() : "";
               this.close();
               return false;
            case FRAME:
               object.entrySet().forEach(entry -> jsonObject.add(entry.getKey(), entry.getValue()));
               return true;
            case PING:
               messageFrame.setOpCode(OpCode.PONG);
               this.writeLock.lock();

               boolean success;
               try {
                  success = this.baseConnection.write(messageFrame.write().array());
               } finally {
                  this.writeLock.unlock();
               }

               if (!success) {
                  this.close();
               }
            case PONG:
               break;
            case HANDSHAKE:
            default:
               this.lastErrorCode = ErrorCode.READ_CORRUPT;
               this.lastErrorMessage = "Bad IPC Frame";
               this.close();
               return false;
         }
      }
   }

   // $VF: Compiled from RPCConnection.java
   public static class ErrorInfo {
      private final String message;
      private final ErrorCode errorCode;

      @Override
      public String toString() {
         return "ErrorCode: " + this.errorCode + " - " + this.message;
      }

      public ErrorInfo(ErrorCode message, String errorCode) {
         this.errorCode = errorCode;
         this.message = message;
      }

      @Generated
      public ErrorCode getErrorCode() {
         return this.errorCode;
      }

      @Generated
      public String getMessage() {
         return this.message;
      }
   }
}
