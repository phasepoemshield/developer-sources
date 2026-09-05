/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.entity.DiscordBuild
 *  fun.crashsystem.jdrpc.entity.User
 *  fun.crashsystem.jdrpc.error.ConnectionException
 *  fun.crashsystem.jdrpc.event.DiscordEventListener
 *  fun.crashsystem.jdrpc.event.EventDispatcher
 *  fun.crashsystem.jdrpc.event.EventType
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject
 *  fun.crashsystem.jdrpc.util.ProcessId
 */
package fun.crashsystem.jdrpc;

import fun.crashsystem.jdrpc.DiscordIPCConfig;
import fun.crashsystem.jdrpc.activity.Activity;
import fun.crashsystem.jdrpc.command.CommandExecutor;
import fun.crashsystem.jdrpc.connection.Connection;
import fun.crashsystem.jdrpc.connection.ConnectionManager;
import fun.crashsystem.jdrpc.connection.ConnectionState;
import fun.crashsystem.jdrpc.entity.DiscordBuild;
import fun.crashsystem.jdrpc.entity.User;
import fun.crashsystem.jdrpc.error.ConnectionException;
import fun.crashsystem.jdrpc.event.DiscordEventListener;
import fun.crashsystem.jdrpc.event.EventDispatcher;
import fun.crashsystem.jdrpc.event.EventType;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject;
import fun.crashsystem.jdrpc.util.ProcessId;
import java.io.Closeable;
import java.io.IOException;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.function.Supplier;

public final class DiscordIPC
implements Closeable {
    private final CommandExecutor commandExecutor;
    private final EventDispatcher eventDispatcher;
    private final ConnectionManager connectionManager;
    private final ExecutorService asyncExecutor;

    public static DiscordIPC create(DiscordIPCConfig config) {
        return new DiscordIPC(config);
    }

    public static DiscordIPC create(long clientId) {
        return new DiscordIPC(DiscordIPCConfig.builder().clientId(clientId).build());
    }

    public void removeListener(DiscordEventListener listener) {
        this.eventDispatcher.removeListener(listener);
    }

    public void addListener(DiscordEventListener listener) {
        this.eventDispatcher.addListener(listener);
    }

    private DiscordIPC(DiscordIPCConfig config) {
        this(new CommandExecutor(config.commandTimeoutMs(), config.maxCommandsPerSecond()), new EventDispatcher(), DiscordIPC.createAsyncExecutor(), config);
    }

    DiscordIPC(CommandExecutor commandExecutor, EventDispatcher eventDispatcher, ConnectionManager connectionManager, ExecutorService asyncExecutor) {
        this.commandExecutor = commandExecutor;
        this.eventDispatcher = eventDispatcher;
        this.connectionManager = connectionManager;
        this.asyncExecutor = asyncExecutor;
    }

    private DiscordIPC(CommandExecutor commandExecutor, EventDispatcher eventDispatcher, ExecutorService asyncExecutor, DiscordIPCConfig config) {
        this(commandExecutor, eventDispatcher, new ConnectionManager(config, commandExecutor, eventDispatcher), asyncExecutor);
    }

    public ConnectionState status() {
        return this.connectionManager.state();
    }

    public void connect() {
        this.connectionManager.connect();
    }

    @Override
    public void close() {
        this.connectionManager.shutdown();
        this.asyncExecutor.shutdownNow();
    }

    public boolean isConnected() {
        return this.connectionManager.state() instanceof ConnectionState.Connected;
    }

    public JsonObject unsubscribe(EventType eventType) throws IOException {
        if (!eventType.subscribable()) {
            throw new IllegalArgumentException(eventType.name() + " is not subscribable");
        }
        Connection conn = this.requireConnection();
        return this.commandExecutor.execute(conn, "UNSUBSCRIBE", null, eventType.value());
    }

    public JsonObject subscribe(EventType eventType) throws IOException {
        if (!eventType.subscribable()) {
            throw new IllegalArgumentException(eventType.name() + " is not subscribable");
        }
        Connection conn = this.requireConnection();
        return this.commandExecutor.execute(conn, "SUBSCRIBE", null, eventType.value());
    }

    private <T> CompletableFuture<T> supplyAsync(IOSupplier<T> supplier) {
        return CompletableFuture.supplyAsync(() -> DiscordIPC.lambda$supplyAsync$3(supplier), this.asyncExecutor);
    }

    public CompletableFuture<Void> connectAsync() {
        return CompletableFuture.runAsync(this::connect, this.asyncExecutor);
    }

    public void disconnect() {
        this.connectionManager.disconnect();
    }

    public Optional<User> currentUser() {
        return Optional.ofNullable(this.connectionManager.currentUser());
    }

    private Connection requireConnection() {
        return Optional.ofNullable(this.connectionManager.connection()).orElseThrow(DiscordIPC::lambda$requireConnection$1);
    }

    public JsonObject clearActivity() throws IOException {
        Connection conn = this.requireConnection();
        JsonObject args = new JsonObject();
        args.addProperty("pid", (Number)ProcessId.current());
        return this.commandExecutor.execute(conn, "SET_ACTIVITY", args, null);
    }

    public CompletableFuture<JsonObject> clearActivityAsync() {
        return this.supplyAsync(this::clearActivity);
    }

    public CompletableFuture<JsonObject> setActivityAsync(Activity activity) {
        return this.supplyAsync(() -> this.lambda$setActivityAsync$0(activity));
    }

    public Optional<DiscordBuild> connectedBuild() {
        return Optional.ofNullable(this.connectionManager.currentBuild());
    }

    public JsonObject setActivity(Activity activity) throws IOException {
        Connection conn = this.requireConnection();
        JsonObject args = new JsonObject();
        args.addProperty("pid", (Number)ProcessId.current());
        args.add("activity", (JsonElement)activity.toJson());
        return this.commandExecutor.execute(conn, "SET_ACTIVITY", args, null);
    }

    public static Thread lambda$createAsyncExecutor$2(Runnable r) {
        Thread t = new Thread(r, "jDRPC-async");
        t.setDaemon(true);
        return t;
    }

    public static Object lambda$supplyAsync$3(IOSupplier supplier) {
        try {
            return supplier.get();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static ExecutorService createAsyncExecutor() {
        return Executors.newSingleThreadExecutor(DiscordIPC::lambda$createAsyncExecutor$2);
    }

    public static ConnectionException lambda$requireConnection$1() {
        return new ConnectionException("Not connected");
    }

    public JsonObject lambda$setActivityAsync$0(Activity activity) throws IOException {
        return this.setActivity(activity);
    }

    public JsonObject sendActivityJoinInvite(String userId) throws IOException {
        Connection conn = this.requireConnection();
        JsonObject args = new JsonObject();
        args.addProperty("user_id", userId);
        return this.commandExecutor.execute(conn, "SEND_ACTIVITY_JOIN_INVITE", args, null);
    }

    public JsonObject closeActivityRequest(String userId) throws IOException {
        Connection conn = this.requireConnection();
        JsonObject args = new JsonObject();
        args.addProperty("user_id", userId);
        return this.commandExecutor.execute(conn, "CLOSE_ACTIVITY_JOIN_REQUEST", args, null);
    }

    @FunctionalInterface
    interface IOSupplier<T> {
        public T get() throws IOException;
    }

    final class Lambda0
    implements ThreadFactory {
        private Lambda0() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            return DiscordIPC.lambda$createAsyncExecutor$2(runnable);
        }
    }

    final class Lambda1
    implements Runnable {
        private final DiscordIPC arg$1;

        private Lambda1(DiscordIPC discordIPC) {
            this.arg$1 = discordIPC;
        }

        @Override
        public void run() {
            this.arg$1.connect();
        }
    }

    final class Lambda2
    implements IOSupplier {
        private final DiscordIPC arg$1;
        private final Activity arg$2;

        private Lambda2(DiscordIPC discordIPC, Activity activity) {
            this.arg$1 = discordIPC;
            this.arg$2 = activity;
        }

        public Object get() {
            return this.arg$1.lambda$setActivityAsync$0(this.arg$2);
        }
    }

    final class Lambda3
    implements Supplier {
        private final IOSupplier arg$1;

        private Lambda3(IOSupplier iOSupplier) {
            this.arg$1 = iOSupplier;
        }

        public Object get() {
            return DiscordIPC.lambda$supplyAsync$3(this.arg$1);
        }
    }

    final class Lambda4
    implements Supplier {
        private Lambda4() {
        }

        public Object get() {
            return DiscordIPC.lambda$requireConnection$1();
        }
    }
}

