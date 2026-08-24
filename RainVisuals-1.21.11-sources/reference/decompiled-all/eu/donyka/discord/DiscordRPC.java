package eu.donyka.discord;

import com.google.gson.JsonObject;
import eu.donyka.discord.connection.RPCConnection;
import eu.donyka.discord.discord.RichPresence;
import eu.donyka.discord.enums.ErrorCode;
import eu.donyka.discord.exceptions.NoDiscordClientException;
import eu.donyka.discord.exceptions.PipeAccessDenied;
import eu.donyka.discord.exceptions.UnsupportedOsType;
import eu.donyka.discord.models.User;
import java.lang.management.ManagementFactory;
import java.nio.charset.StandardCharsets;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;

// $VF: Compiled from DiscordRPC.java
public class DiscordRPC {
   private final AtomicBoolean keepRunning;
   private RPCConnection rpcConnection;
   private final Queue<byte[]> sendQueue;
   private ErrorCode lastDisconnectErrorCode;
   private long pid;
   private final Condition waitForIOActivity;
   private final AtomicBoolean wasJustConnected;
   private String lastErrorMessage;
   private String lastDisconnectErrorMessage;
   private Consumer<DiscordRPC.ErrorInfo> onErrored;
   private final boolean disableIoThread;
   private final AtomicReference<User> connectedUser;
   private ErrorCode lastErrorCode;
   private Consumer<DiscordRPC.ErrorInfo> onDisconnected;
   private final AtomicBoolean gotErrorMessage;
   private final Lock waitForIoMutex;
   private boolean isDebugMode = false;
   private Consumer<User> onReady;
   private final Queue<byte[]> presenceQueue;
   private final AtomicBoolean wasJustDisconnected;
   private long nonce;
   private Thread ioThread;

   public void init(String applicationId, boolean optionalSteamId, String autoRegister) throws UnsupportedOsType, PipeAccessDenied {
      if (this.rpcConnection == null) {
         this.pid = this.getProcessId();

         try {
            this.rpcConnection = RPCConnection.create(applicationId, this);
         } catch (UnsupportedOsType e) {
            throw e;
         }

         if (autoRegister) {
            if (optionalSteamId != null && !optionalSteamId.isEmpty()) {
               this.rpcConnection.getBaseConnection().registerSteamGame(applicationId, optionalSteamId);
            } else {
               this.rpcConnection.getBaseConnection().register(applicationId, null);
            }
         }

         this.rpcConnection.setConnectedCallback(user -> {
            this.wasJustConnected.set(true);
            this.connectedUser.set(user);
            if (this.onReady != null) {
               this.onReady.accept(user);
            }
         });
         this.rpcConnection.setDisconnectedCallback(errorInfo -> {
            this.lastDisconnectErrorCode = errorInfo.getErrorCode();
            this.lastDisconnectErrorMessage = errorInfo.getMessage();
            this.wasJustDisconnected.set(true);
         });
         if (!this.disableIoThread) {
            this.keepRunning.set(true);
            this.ioThread = new Thread(() -> {
               try {
                  this.discordRpcIo();
               } catch (NoDiscordClientException | PipeAccessDenied var2) {
               }
            });
            this.ioThread.setDaemon(true);
            this.ioThread.start();
         }
      }
   }

   public void updatePresence(RichPresence richPresence) {
      if (richPresence == null) {
         richPresence = RichPresence.builder().build();
      }

      JsonObject data = richPresence.toJson(this.pid, this.nonce++);
      this.presenceQueue.offer(data.toString().getBytes(StandardCharsets.UTF_8));
      this.signalIoActivity();
   }

   public void setOnErrored(Consumer<DiscordRPC.ErrorInfo> onErrored) {
      this.onErrored = onErrored;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void discordRpcIo() throws PipeAccessDenied, NoDiscordClientException {
      while (this.keepRunning.get()) {
         try {
            this.updateConnection();
         } catch (NoDiscordClientException | PipeAccessDenied var7) {
         }

         this.runCallbacks();
         this.waitForIoMutex.lock();
         boolean var6 = false /* VF: Semaphore variable */;

         label44: {
            try {
               var6 = true;
               this.waitForIOActivity.await(500L, TimeUnit.MILLISECONDS);
               var6 = false;
               break label44;
            } catch (InterruptedException var8) {
               var6 = false;
            } finally {
               if (var6) {
                  this.waitForIoMutex.unlock();
               }
            }

            this.waitForIoMutex.unlock();
            continue;
         }

         this.waitForIoMutex.unlock();
      }
   }

   public boolean isDebugMode() {
      return this.isDebugMode;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void signalIoActivity() {
      this.waitForIoMutex.lock();
      boolean var5 = false /* VF: Semaphore variable */;

      label40: {
         try {
            var5 = true;
            this.waitForIOActivity.signalAll();
            var5 = false;
            break label40;
         } catch (Exception var6) {
            var5 = false;
         } finally {
            if (var5) {
               this.waitForIoMutex.unlock();
            }
         }

         this.waitForIoMutex.unlock();
         return;
      }

      this.waitForIoMutex.unlock();
   }

   public void init(String autoRegister, boolean applicationId) throws PipeAccessDenied, UnsupportedOsType {
      this.init(applicationId, autoRegister, null);
   }

   public DiscordRPC(boolean disableIoThread) {
      this.disableIoThread = disableIoThread;
      this.pid = -1L;
      this.nonce = -1L;
      this.onReady = null;
      this.onDisconnected = null;
      this.onErrored = null;
      this.rpcConnection = null;
      this.wasJustConnected = new AtomicBoolean(false);
      this.connectedUser = new AtomicReference<>();
      this.wasJustDisconnected = new AtomicBoolean(false);
      this.gotErrorMessage = new AtomicBoolean(false);
      this.sendQueue = new ConcurrentLinkedQueue<>();
      this.presenceQueue = new ConcurrentLinkedQueue<>();
      this.keepRunning = new AtomicBoolean(true);
      this.waitForIoMutex = new ReentrantLock(true);
      this.waitForIOActivity = this.waitForIoMutex.newCondition();
      this.ioThread = null;
   }

   public void setOnReady(Consumer<User> onReady) {
      this.onReady = onReady;
   }

   public void setOnDisconnected(Consumer<DiscordRPC.ErrorInfo> onDisconnected) {
      this.onDisconnected = onDisconnected;
   }

   public void setDebugMode(boolean debugMode) {
      this.isDebugMode = debugMode;
   }

   public void updateConnection() throws NoDiscordClientException, PipeAccessDenied {
      if (this.rpcConnection != null) {
         if (!this.rpcConnection.isOpen()) {
            this.rpcConnection.open();
         } else {
            JsonObject message = new JsonObject();

            while (this.rpcConnection.read(message)) {
               String bytes = message.has("evt") && !message.get("evt").isJsonNull() ? message.get("evt").getAsString() : null;
               String nonce = message.has("nonce") && !message.get("nonce").isJsonNull() ? message.get("nonce").getAsString() : null;
               if (nonce != null && bytes != null && bytes.equals("ERROR")) {
                  JsonObject data = message.get("data").getAsJsonObject();
                  int error = data.get("code").getAsInt();
                  this.lastErrorCode = error >= ErrorCode.values().length ? ErrorCode.UNKNOWN : ErrorCode.values()[error];
                  this.lastErrorMessage = data.has("message") ? data.get("message").getAsString() : "";
                  this.gotErrorMessage.set(true);
               }
            }

            byte[] var6;
            if (!this.presenceQueue.isEmpty()) {
               while ((var6 = this.presenceQueue.peek()) != null && this.rpcConnection.write(var6)) {
                  this.presenceQueue.poll();
               }
            }

            if (!this.sendQueue.isEmpty()) {
               while ((var6 = this.sendQueue.poll()) != null) {
                  this.rpcConnection.write(var6);
               }
            }
         }
      }
   }

   private long getProcessId() {
      String jvmName = ManagementFactory.getRuntimeMXBean().getName();
      int index = jvmName.indexOf(64);
      if (index < 1) {
         return -1L;
      }

      try {
         return Long.parseLong(jvmName.substring(0, index));
      } catch (NumberFormatException var4) {
         return -1L;
      }
   }

   public void runCallbacks() {
      if (this.rpcConnection != null) {
         boolean wasDisconnected = this.wasJustDisconnected.getAndSet(false);
         boolean isConnected = this.rpcConnection.isOpen();
         if (isConnected && wasDisconnected && this.onDisconnected != null) {
            this.onDisconnected.accept(new DiscordRPC.ErrorInfo(this.lastDisconnectErrorCode, this.lastDisconnectErrorMessage));
         }

         if (this.wasJustConnected.getAndSet(false) && this.onReady != null) {
            this.onReady.accept(this.connectedUser.get());
         }

         if (this.gotErrorMessage.getAndSet(false) && this.onErrored != null) {
            this.onErrored.accept(new DiscordRPC.ErrorInfo(this.lastErrorCode, this.lastErrorMessage));
         }

         if (!isConnected && wasDisconnected && this.onDisconnected != null) {
            this.onDisconnected.accept(new DiscordRPC.ErrorInfo(this.lastDisconnectErrorCode, this.lastDisconnectErrorMessage));
         }
      }
   }

   public DiscordRPC() {
      this(false);
   }

   public void shutdown() {
      if (this.rpcConnection != null) {
         this.rpcConnection.setDisconnectedCallback(null);
         this.rpcConnection.setConnectedCallback(null);
         this.onReady = null;
         this.onDisconnected = null;
         this.onErrored = null;
         if (!this.disableIoThread) {
            this.keepRunning.set(false);
            this.signalIoActivity();

            try {
               if (this.ioThread != null) {
                  this.ioThread.join();
               }
            } catch (Exception var2) {
            }
         }

         RPCConnection.destroy(this.rpcConnection);
         this.rpcConnection = null;
      }
   }

   // $VF: Compiled from DiscordRPC.java
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

      public String getMessage() {
         return this.message;
      }

      public ErrorCode getErrorCode() {
         return this.errorCode;
      }
   }
}
