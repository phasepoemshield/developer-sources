/*
 * Decompiled with CFR 0.152.
 */
package eu.donyka.discord;

import com.google.gson.JsonObject;
import eu.donyka.discord.connection.RPCConnection;
import eu.donyka.discord.discord.RichPresence;
import eu.donyka.discord.enums.ErrorCode;
import eu.donyka.discord.exceptions.NoDiscordClientException;
import eu.donyka.discord.exceptions.PipeAccessDenied;
import eu.donyka.discord.exceptions.UnsupportedOsType;
import eu.donyka.discord.models.User;
import java.lang.invoke.LambdaMetafactory;
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
    private Consumer<ErrorInfo> onErrored;
    private final boolean disableIoThread;
    private final AtomicReference<User> connectedUser;
    private ErrorCode lastErrorCode;
    private Consumer<ErrorInfo> onDisconnected;
    private final AtomicBoolean gotErrorMessage;
    private final Lock waitForIoMutex;
    private boolean isDebugMode = false;
    private Consumer<User> onReady;
    private final Queue<byte[]> presenceQueue;
    private final AtomicBoolean wasJustDisconnected;
    private long nonce;
    private Thread ioThread;

    /*
     * Unable to fully structure code
     */
    public void init(String applicationId, boolean autoRegister, String optionalSteamId) throws UnsupportedOsType, PipeAccessDenied {
        block6: {
            if (this.rpcConnection != null) {
                return;
            }
            this.pid = this.getProcessId();
            this.rpcConnection = RPCConnection.create(applicationId, this);
            if (!autoRegister) break block6;
            if (optionalSteamId == null) ** GOTO lbl-1000
            if (!optionalSteamId.isEmpty()) {
                this.rpcConnection.getBaseConnection().registerSteamGame(applicationId, optionalSteamId);
            } else lbl-1000:
            // 2 sources

            {
                this.rpcConnection.getBaseConnection().register(applicationId, null);
            }
        }
        this.rpcConnection.setConnectedCallback((Consumer<User>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$init$0(eu.donyka.discord.models.User ), (Leu/donyka/discord/models/User;)V)((DiscordRPC)this));
        this.rpcConnection.setDisconnectedCallback((Consumer<RPCConnection.ErrorInfo>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$init$1(eu.donyka.discord.connection.RPCConnection$ErrorInfo ), (Leu/donyka/discord/connection/RPCConnection$ErrorInfo;)V)((DiscordRPC)this));
        if (!this.disableIoThread) {
            this.keepRunning.set(true);
            this.ioThread = new Thread((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$init$2(), ()V)((DiscordRPC)this));
            this.ioThread.setDaemon(true);
            this.ioThread.start();
        }
    }

    public void updatePresence(RichPresence richPresence) {
        if (richPresence == null) {
            richPresence = RichPresence.builder().build();
        }
        long l = this.nonce;
        this.nonce = l + 1L;
        JsonObject data = richPresence.toJson(this.pid, l);
        this.presenceQueue.offer(data.toString().getBytes(StandardCharsets.UTF_8));
        this.signalIoActivity();
    }

    public void setOnErrored(Consumer<ErrorInfo> onErrored) {
        this.onErrored = onErrored;
    }

    private /* synthetic */ void lambda$init$2() {
        try {
            this.discordRpcIo();
        }
        catch (NoDiscordClientException | PipeAccessDenied exception) {
            // empty catch block
        }
    }

    private void discordRpcIo() throws PipeAccessDenied, NoDiscordClientException {
        while (this.keepRunning.get()) {
            try {
                this.updateConnection();
            }
            catch (NoDiscordClientException | PipeAccessDenied exception) {
                // empty catch block
            }
            this.runCallbacks();
            this.waitForIoMutex.lock();
            try {
                this.waitForIOActivity.await(500L, TimeUnit.MILLISECONDS);
            }
            catch (InterruptedException interruptedException) {}
            continue;
            finally {
                this.waitForIoMutex.unlock();
            }
        }
    }

    public boolean isDebugMode() {
        return this.isDebugMode;
    }

    private void signalIoActivity() {
        this.waitForIoMutex.lock();
        try {
            this.waitForIOActivity.signalAll();
        }
        catch (Exception exception) {
        }
        finally {
            this.waitForIoMutex.unlock();
        }
    }

    public void init(String applicationId, boolean autoRegister) throws PipeAccessDenied, UnsupportedOsType {
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
        this.connectedUser = new AtomicReference();
        this.wasJustDisconnected = new AtomicBoolean(false);
        this.gotErrorMessage = new AtomicBoolean(false);
        this.sendQueue = new ConcurrentLinkedQueue<byte[]>();
        this.presenceQueue = new ConcurrentLinkedQueue<byte[]>();
        this.keepRunning = new AtomicBoolean(true);
        this.waitForIoMutex = new ReentrantLock(true);
        this.waitForIOActivity = this.waitForIoMutex.newCondition();
        this.ioThread = null;
    }

    public void setOnReady(Consumer<User> onReady) {
        this.onReady = onReady;
    }

    private /* synthetic */ void lambda$init$1(RPCConnection.ErrorInfo errorInfo) {
        this.lastDisconnectErrorCode = errorInfo.getErrorCode();
        this.lastDisconnectErrorMessage = errorInfo.getMessage();
        this.wasJustDisconnected.set(true);
    }

    public void setOnDisconnected(Consumer<ErrorInfo> onDisconnected) {
        this.onDisconnected = onDisconnected;
    }

    public void setDebugMode(boolean debugMode) {
        this.isDebugMode = debugMode;
    }

    /*
     * WARNING - void declaration
     */
    public void updateConnection() throws NoDiscordClientException, PipeAccessDenied {
        if (this.rpcConnection == null) {
            return;
        }
        if (!this.rpcConnection.isOpen()) {
            this.rpcConnection.open();
        } else {
            byte[] bytes;
            JsonObject message = new JsonObject();
            while (this.rpcConnection.read(message)) {
                String evtName = message.has("evt") && !message.get("evt").isJsonNull() ? message.get("evt").getAsString() : null;
                String nonce = message.has("nonce") && !message.get("nonce").isJsonNull() ? message.get("nonce").getAsString() : null;
                if (nonce == null) continue;
                if (evtName == null) continue;
                if (!evtName.equals("ERROR")) continue;
                JsonObject data = message.get("data").getAsJsonObject();
                int error = data.get("code").getAsInt();
                this.lastErrorCode = error >= ErrorCode.values().length ? ErrorCode.UNKNOWN : ErrorCode.values()[error];
                this.lastErrorMessage = data.has("message") ? data.get("message").getAsString() : "";
                this.gotErrorMessage.set(true);
            }
            if (!this.presenceQueue.isEmpty()) {
                while ((bytes = this.presenceQueue.peek()) != null) {
                    if (!this.rpcConnection.write(bytes)) break;
                    this.presenceQueue.poll();
                }
            }
            if (!this.sendQueue.isEmpty()) {
                while ((bytes = this.sendQueue.poll()) != null) {
                    void var2_2;
                    this.rpcConnection.write((byte[])var2_2);
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
        }
        catch (NumberFormatException numberFormatException) {
            return -1L;
        }
    }

    public void runCallbacks() {
        if (this.rpcConnection == null) {
            return;
        }
        boolean wasDisconnected = this.wasJustDisconnected.getAndSet(false);
        boolean isConnected = this.rpcConnection.isOpen();
        if (isConnected && wasDisconnected && this.onDisconnected != null) {
            this.onDisconnected.accept(new ErrorInfo(this.lastDisconnectErrorCode, this.lastDisconnectErrorMessage));
        }
        if (this.wasJustConnected.getAndSet(false) && this.onReady != null) {
            this.onReady.accept(this.connectedUser.get());
        }
        if (this.gotErrorMessage.getAndSet(false) && this.onErrored != null) {
            this.onErrored.accept(new ErrorInfo(this.lastErrorCode, this.lastErrorMessage));
        }
        if (!isConnected && wasDisconnected && this.onDisconnected != null) {
            this.onDisconnected.accept(new ErrorInfo(this.lastDisconnectErrorCode, this.lastDisconnectErrorMessage));
        }
    }

    private /* synthetic */ void lambda$init$0(User user) {
        this.wasJustConnected.set(true);
        this.connectedUser.set(user);
        if (this.onReady != null) {
            this.onReady.accept(user);
        }
    }

    public DiscordRPC() {
        this(false);
    }

    public void shutdown() {
        if (this.rpcConnection == null) {
            return;
        }
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
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        RPCConnection.destroy(this.rpcConnection);
        this.rpcConnection = null;
    }

    public static class ErrorInfo {
        private final String message;
        private final ErrorCode errorCode;

        public String toString() {
            return "ErrorCode: " + (Object)((Object)this.errorCode) + " - " + this.message;
        }

        public ErrorInfo(ErrorCode errorCode, String message) {
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

