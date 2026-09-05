/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.connection.WindowsConnection
 *  fun.crashsystem.jdrpc.entity.DiscordBuild
 *  fun.crashsystem.jdrpc.entity.User
 *  fun.crashsystem.jdrpc.error.ConnectionException
 *  fun.crashsystem.jdrpc.error.NoDiscordClientException
 *  fun.crashsystem.jdrpc.event.EventDispatcher
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject
 *  fun.crashsystem.jdrpc.protocol.Frame
 *  fun.crashsystem.jdrpc.protocol.OpCode
 *  fun.crashsystem.jdrpc.util.JsonUtils
 *  fun.crashsystem.jdrpc.util.Platform
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package fun.crashsystem.jdrpc.connection;

import fun.crashsystem.jdrpc.DiscordIPCConfig;
import fun.crashsystem.jdrpc.command.CommandExecutor;
import fun.crashsystem.jdrpc.connection.Connection;
import fun.crashsystem.jdrpc.connection.ConnectionFactory;
import fun.crashsystem.jdrpc.connection.ConnectionState;
import fun.crashsystem.jdrpc.connection.FailureInfo;
import fun.crashsystem.jdrpc.connection.PipeLocator;
import fun.crashsystem.jdrpc.connection.PipePathProvider;
import fun.crashsystem.jdrpc.connection.UnixConnection;
import fun.crashsystem.jdrpc.connection.WindowsConnection;
import fun.crashsystem.jdrpc.entity.DiscordBuild;
import fun.crashsystem.jdrpc.entity.User;
import fun.crashsystem.jdrpc.error.ConnectionException;
import fun.crashsystem.jdrpc.error.NoDiscordClientException;
import fun.crashsystem.jdrpc.event.EventDispatcher;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject;
import fun.crashsystem.jdrpc.protocol.Frame;
import fun.crashsystem.jdrpc.protocol.OpCode;
import fun.crashsystem.jdrpc.util.JsonUtils;
import fun.crashsystem.jdrpc.util.Platform;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ConnectionManager {
    private static Logger log = LogManager.getLogger((String)"fun.crashsystem.jdrpc.connection.ConnectionManager");
    private final AtomicReference<ConnectionState> stateRef = new AtomicReference<ConnectionState.Disconnected>(new ConnectionState.Disconnected());
    private final AtomicLong reconnectGeneration = new AtomicLong(-1L);
    private final AtomicLong generation = new AtomicLong();
    private final ExecutorService executor = Executors.newSingleThreadExecutor(ConnectionManager::lambda$new$0);
    private final DiscordIPCConfig config;
    private final CommandExecutor commandExecutor;
    private final EventDispatcher eventDispatcher;
    private final PipePathProvider pipePathProvider;
    private final ConnectionFactory connectionFactory;
    private volatile Connection connection;
    private volatile User currentUser;
    private volatile DiscordBuild currentBuild;
    private volatile Future<?> readFuture;
    private Consumer<ConnectionState> stateListener;

    public AtomicLong generation() {
        return this.generation;
    }

    public Connection connection() {
        return this.connection;
    }

    private void closeQuietly(Connection connection, String string) {
        if (connection == null) {
            return;
        }
        try {
            connection.close();
        }
        catch (Exception exception) {
            log.warn("Failed to close connection ({})", (Object)string, (Object)exception);
        }
    }

    public ConnectionManager(DiscordIPCConfig discordIPCConfig, CommandExecutor commandExecutor, EventDispatcher eventDispatcher) {
        this(discordIPCConfig, commandExecutor, eventDispatcher, PipeLocator::locateAll, ConnectionManager::lambda$new$1);
    }

    ConnectionManager(DiscordIPCConfig discordIPCConfig, CommandExecutor commandExecutor, EventDispatcher eventDispatcher, PipePathProvider pipePathProvider, ConnectionFactory connectionFactory) {
        this.config = discordIPCConfig;
        this.commandExecutor = commandExecutor;
        this.eventDispatcher = eventDispatcher;
        this.pipePathProvider = pipePathProvider;
        this.connectionFactory = connectionFactory;
    }

    public void shutdown() {
        this.generation.incrementAndGet();
        this.reconnectGeneration.set(-1L);
        this.cancelBackgroundTasks();
        Connection connection = this.connection;
        this.clearConnectionState();
        if (connection != null) {
            this.closeQuietly(connection, "shutdown");
        }
        this.executor.shutdownNow();
        this.commandExecutor.markTransportUnavailable();
        this.commandExecutor.cancelAll(new ConnectionException("Shutdown"));
        this.setState(new ConnectionState.Closed());
        this.eventDispatcher.dispatchClose();
        log.info("Shut down Discord IPC");
    }

    public void connect() {
        ConnectionState connectionState = this.stateRef.get();
        if (connectionState instanceof ConnectionState.Connected || connectionState instanceof ConnectionState.Connecting || connectionState instanceof ConnectionState.Reconnecting) {
            log.debug("Ignoring connect() in state {}", (Object)connectionState);
            return;
        }
        long l = this.generation.incrementAndGet();
        this.reconnectGeneration.set(-1L);
        this.cancelBackgroundTasks();
        this.commandExecutor.markTransportUnavailable();
        this.setState(new ConnectionState.Connecting());
        try {
            HandshakeResult handshakeResult = this.openAndHandshake();
            this.activateConnection(l, handshakeResult, false);
        }
        catch (Exception exception) {
            if (!this.isGenerationActive(l)) {
                log.debug("Discarding stale connect failure for generation {}", (Object)l, (Object)exception);
                return;
            }
            this.clearConnectionState();
            this.commandExecutor.markTransportUnavailable();
            this.setState(new ConnectionState.Failed(FailureInfo.from(exception)));
            if (exception instanceof NoDiscordClientException) {
                throw (NoDiscordClientException)exception;
            }
            throw new ConnectionException("Failed to connect", (Throwable)exception);
        }
    }

    public ConnectionState state() {
        return this.stateRef.get();
    }

    private void setState(ConnectionState connectionState) {
        this.stateRef.set(connectionState);
        Optional.ofNullable(this.stateListener).ifPresent(arg_0 -> ConnectionManager.lambda$setState$2(connectionState, arg_0));
    }

    public DiscordIPCConfig config() {
        return this.config;
    }

    public static Thread lambda$new$0(Runnable runnable) {
        Thread thread = new Thread(runnable, "jDRPC-worker");
        thread.setDaemon(true);
        return thread;
    }

    public ExecutorService executor() {
        return this.executor;
    }

    HandshakeResult handshake(Connection connection) throws IOException {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("v", (Number)1);
        jsonObject.addProperty("client_id", String.valueOf(this.config.clientId()));
        connection.write(new Frame(OpCode.HANDSHAKE, jsonObject));
        Frame frame = connection.read();
        if (frame.op() == OpCode.CLOSE) {
            throw new ConnectionException("Discord rejected handshake");
        }
        if (frame.op() != OpCode.FRAME) {
            throw new ConnectionException("Unexpected opcode in handshake response: " + String.valueOf(frame.op()));
        }
        JsonObject jsonObject2 = frame.data();
        if (jsonObject2 == null || jsonObject2.entrySet().isEmpty()) {
            throw new ConnectionException("Empty handshake response");
        }
        JsonUtils.optString((JsonObject)jsonObject2, (String)"cmd").filter(ConnectionManager::lambda$handshake$5).ifPresent(ConnectionManager::lambda$handshake$6);
        JsonUtils.optString((JsonObject)jsonObject2, (String)"evt").filter(ConnectionManager::lambda$handshake$7).ifPresent(ConnectionManager::lambda$handshake$8);
        JsonObject jsonObject3 = JsonUtils.optObject((JsonObject)jsonObject2, (String)"data").filter(ConnectionManager::lambda$handshake$9).orElseThrow(ConnectionManager::lambda$handshake$10);
        JsonObject jsonObject4 = JsonUtils.optObject((JsonObject)jsonObject3, (String)"user").filter(ConnectionManager::lambda$handshake$11).orElseThrow(ConnectionManager::lambda$handshake$12);
        User user = this.validateHandshakeUser(jsonObject4);
        String string = JsonUtils.optObject((JsonObject)jsonObject3, (String)"config").flatMap(ConnectionManager::lambda$handshake$13).orElse(null);
        DiscordBuild discordBuild = DiscordBuild.fromEndpoint((String)string);
        return new HandshakeResult(connection, user, discordBuild);
    }

    public static Connection lambda$new$1(String string) throws IOException {
        return switch (Platform.CURRENT) {
            default -> throw new IncompatibleClassChangeError();
            case Platform.WINDOWS -> new WindowsConnection(string);
            case Platform.MACOS, Platform.LINUX -> new UnixConnection(string);
        };
    }

    public void disconnect() {
        long l = this.generation.incrementAndGet();
        this.reconnectGeneration.set(-1L);
        this.cancelBackgroundTasks();
        this.commandExecutor.markTransportUnavailable();
        Connection connection = this.connection;
        this.clearConnectionState();
        if (connection != null) {
            try {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("code", (Number)1000);
                jsonObject.addProperty("message", "Client disconnecting");
                connection.write(new Frame(OpCode.CLOSE, jsonObject));
            }
            catch (Exception exception) {
                log.debug("Failed to send CLOSE frame during disconnect for generation {}", (Object)l, (Object)exception);
            }
            this.closeQuietly(connection, "disconnect");
        }
        this.commandExecutor.cancelAll(new ConnectionException("Disconnected"));
        this.setState(new ConnectionState.Closed());
        this.eventDispatcher.dispatchClose();
        log.info("Disconnected from Discord");
    }

    private void handleDisconnect(int n, String string, Throwable throwable, long l) {
        if (!this.generation.compareAndSet(l, l + 1L)) {
            log.debug("Ignoring stale disconnect for generation {}", (Object)l);
            return;
        }
        long l2 = l + 1L;
        this.cancelBackgroundTasks();
        Connection connection = this.connection;
        this.clearConnectionState();
        this.closeQuietly(connection, "disconnect");
        this.commandExecutor.markTransportUnavailable();
        this.commandExecutor.cancelAll(new ConnectionException("Disconnected", throwable));
        this.eventDispatcher.dispatchDisconnect(n, string != null ? string : (throwable != null ? throwable.getMessage() : "Unknown"));
        if (!this.config.reconnect()) {
            this.reconnectGeneration.set(-1L);
            this.setState(new ConnectionState.Failed(FailureInfo.from(throwable)));
            return;
        }
        this.scheduleReconnect(throwable, l2);
    }

    public Consumer<ConnectionState> stateListener() {
        return this.stateListener;
    }

    public EventDispatcher eventDispatcher() {
        return this.eventDispatcher;
    }

    public User currentUser() {
        return this.currentUser;
    }

    public CommandExecutor commandExecutor() {
        return this.commandExecutor;
    }

    public DiscordBuild currentBuild() {
        return this.currentBuild;
    }

    private void reconnect(Throwable throwable, long l) {
        int n;
        int n2 = this.config.maxReconnectAttempts();
        long l2 = this.config.reconnectBaseDelayMs();
        long l3 = this.config.reconnectMaxDelayMs();
        Throwable throwable2 = throwable;
        for (n = 1; !Thread.currentThread().isInterrupted() && this.isGenerationActive(l) && (n2 == 0 || n <= n2); ++n) {
            this.setState(new ConnectionState.Reconnecting(n, FailureInfo.from(throwable2)));
            log.debug("Reconnecting (attempt {})...", (Object)n);
            try {
                Thread.sleep(l2);
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                this.reconnectGeneration.compareAndSet(l, -1L);
                return;
            }
            if (!this.isGenerationActive(l)) {
                this.reconnectGeneration.compareAndSet(l, -1L);
                return;
            }
            try {
                HandshakeResult handshakeResult = this.openAndHandshake();
                if (this.activateConnection(l, handshakeResult, true)) {
                    return;
                }
            }
            catch (Exception exception) {
                throwable2 = exception;
                log.debug("Reconnect attempt {} failed: {}", (Object)n, (Object)exception.getMessage(), (Object)exception);
            }
            l2 = Math.min(l2 * 2L, l3);
        }
        this.reconnectGeneration.compareAndSet(l, -1L);
        if (this.isGenerationActive(l)) {
            this.setState(new ConnectionState.Failed(FailureInfo.from(throwable2)));
            log.error("Failed to reconnect after {} attempts", (Object)(n - 1));
        }
    }

    public Future<?> readFuture() {
        return this.readFuture;
    }

    public AtomicReference<ConnectionState> stateRef() {
        return this.stateRef;
    }

    private void lambda$handleIncomingFrame$4(JsonObject jsonObject, String string) {
        JsonObject jsonObject2 = JsonUtils.optObject((JsonObject)jsonObject, (String)"data").orElse(null);
        this.eventDispatcher.dispatch(string, jsonObject2);
    }

    private void lambda$scheduleReconnect$14(Throwable throwable, long l) {
        this.reconnect(throwable, l);
    }

    public static void lambda$handshake$6(String string) {
        throw new ConnectionException("Unexpected handshake command: " + string);
    }

    private boolean activateConnection(long l, HandshakeResult handshakeResult, boolean bl) {
        if (!this.isGenerationActive(l)) {
            this.closeQuietly(handshakeResult.connection(), "stale activation for generation " + l);
            return false;
        }
        this.connection = handshakeResult.connection();
        this.currentUser = handshakeResult.user();
        this.currentBuild = handshakeResult.build();
        this.commandExecutor.markTransportAvailable();
        this.reconnectGeneration.compareAndSet(l, -1L);
        this.setState(new ConnectionState.Connected(handshakeResult.user(), handshakeResult.build()));
        this.eventDispatcher.dispatchReady(handshakeResult.user());
        this.startReadLoop(l, handshakeResult.connection());
        return true;
    }

    public static boolean lambda$handshake$9(JsonObject jsonObject) {
        return !jsonObject.entrySet().isEmpty();
    }

    private void startReadLoop(long l, Connection connection) {
        this.readFuture = this.executor.submit(() -> this.lambda$startReadLoop$3(l, connection));
    }

    private void scheduleReconnect(Throwable throwable, long l) {
        if (!this.reconnectGeneration.compareAndSet(-1L, l)) {
            log.debug("Reconnect already scheduled for generation {}", (Object)this.reconnectGeneration.get());
            return;
        }
        try {
            this.executor.submit(() -> this.lambda$scheduleReconnect$14(throwable, l));
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            this.reconnectGeneration.compareAndSet(l, -1L);
            if (this.isGenerationActive(l)) {
                this.setState(new ConnectionState.Failed(FailureInfo.from(throwable)));
            }
            log.warn("Failed to schedule reconnect", (Throwable)rejectedExecutionException);
        }
    }

    public void setStateListener(Consumer<ConnectionState> consumer) {
        this.stateListener = consumer;
    }

    public PipePathProvider pipePathProvider() {
        return this.pipePathProvider;
    }

    private boolean isGenerationActive(long l) {
        return this.generation.get() == l;
    }

    public static boolean lambda$handshake$5(String string) {
        return !"DISPATCH".equals(string);
    }

    public static boolean lambda$handshake$7(String string) {
        return !"READY".equals(string);
    }

    public static void lambda$setState$2(ConnectionState connectionState, Consumer consumer) {
        try {
            consumer.accept(connectionState);
        }
        catch (Exception exception) {
            log.warn("State listener failed for {}", (Object)connectionState, (Object)exception);
        }
    }

    public static void lambda$handshake$8(String string) {
        throw new ConnectionException("Unexpected handshake event: " + string);
    }

    HandshakeResult openAndHandshake() {
        List<String> list = this.pipePathProvider.locateAll();
        boolean bl = this.config.preferredBuilds().contains(DiscordBuild.ANY);
        for (String string : list) {
            try {
                HandshakeResult handshakeResult = this.tryOpenAndHandshake(string);
                if (bl || this.config.preferredBuilds().contains(handshakeResult.build())) {
                    return handshakeResult;
                }
                this.closeQuietly(handshakeResult.connection(), "skipping non-preferred build from " + string);
            }
            catch (Exception exception) {
                log.debug("Pipe {} unavailable: {}", (Object)string, (Object)exception.getMessage(), (Object)exception);
            }
        }
        for (String string : list) {
            try {
                return this.tryOpenAndHandshake(string);
            }
            catch (Exception exception) {
                log.debug("Pipe {} failed during second pass: {}", (Object)string, (Object)exception.getMessage(), (Object)exception);
            }
        }
        throw new NoDiscordClientException();
    }

    public ConnectionFactory connectionFactory() {
        return this.connectionFactory;
    }

    private void handleIncomingFrame(JsonObject jsonObject) {
        if (jsonObject == null) {
            return;
        }
        String string = JsonUtils.optString((JsonObject)jsonObject, (String)"evt").orElse(null);
        if ("ERROR".equals(string) && JsonUtils.optString((JsonObject)jsonObject, (String)"nonce").isPresent()) {
            JsonObject jsonObject2 = JsonUtils.optObject((JsonObject)jsonObject, (String)"data").orElse(null);
            int n = JsonUtils.getInt((JsonObject)jsonObject2, (String)"code", (int)1000);
            String string2 = JsonUtils.getString((JsonObject)jsonObject2, (String)"message", (String)"Unknown error");
            this.eventDispatcher.dispatchError(n, string2);
        }
        boolean bl = this.commandExecutor.handleResponse(jsonObject);
        log.debug("Frame handled by command executor: {}", (Object)bl);
        if (bl) {
            return;
        }
        String string3 = JsonUtils.getString((JsonObject)jsonObject, (String)"cmd", (String)"");
        if (!"DISPATCH".equals(string3)) {
            return;
        }
        JsonUtils.optString((JsonObject)jsonObject, (String)"evt").ifPresent(arg_0 -> this.lambda$handleIncomingFrame$4(jsonObject, arg_0));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    HandshakeResult tryOpenAndHandshake(String string) throws IOException {
        Connection connection = null;
        boolean bl = false;
        try {
            connection = this.connectionFactory.create(string);
            HandshakeResult handshakeResult = this.handshake(connection);
            bl = true;
            HandshakeResult handshakeResult2 = handshakeResult;
            return handshakeResult2;
        }
        finally {
            if (!bl) {
                this.closeQuietly(connection, "failed handshake on " + string);
            }
        }
    }

    private void cancelBackgroundTasks() {
        Future<?> future = this.readFuture;
        if (future != null) {
            future.cancel(true);
            this.readFuture = null;
        }
    }

    public static ConnectionException lambda$handshake$10() {
        return new ConnectionException("Malformed handshake response: missing data object");
    }

    public static boolean lambda$handshake$11(JsonObject jsonObject) {
        return !jsonObject.entrySet().isEmpty();
    }

    private void clearConnectionState() {
        this.connection = null;
        this.currentUser = null;
        this.currentBuild = null;
    }

    public static ConnectionException lambda$handshake$12() {
        return new ConnectionException("No user in handshake response");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void lambda$startReadLoop$3(long l, Connection connection) {
        block12: {
            log.debug("Read loop started for generation {}", (Object)l);
            try {
                block8: while (this.isGenerationActive(l) && connection.isOpen() && !Thread.currentThread().isInterrupted()) {
                    Frame frame = connection.read();
                    if (!this.isGenerationActive(l)) {
                        return;
                    }
                    if (log.isDebugEnabled()) {
                        Object object;
                        Object object2 = object = frame.data() != null ? frame.data().toString() : "null";
                        if (((String)object).length() > 200) {
                            object = ((String)object).substring(0, 200) + "...";
                        }
                        log.debug("Received frame: op={}, data={}", (Object)frame.op(), object);
                    }
                    switch (frame.op()) {
                        case HANDSHAKE: {
                            int n = JsonUtils.getInt((JsonObject)frame.data(), (String)"code", (int)0);
                            String string = JsonUtils.getString((JsonObject)frame.data(), (String)"message", (String)"Discord closed connection");
                            log.info("Received CLOSE frame from Discord: code={}, message={}", (Object)n, (Object)string);
                            this.handleDisconnect(n, string, new ConnectionException(string), l);
                            return;
                        }
                        case FRAME: {
                            connection.write(new Frame(OpCode.PONG, frame.data()));
                            continue block8;
                        }
                        case CLOSE: {
                            log.debug("Received PONG");
                            continue block8;
                        }
                        case PING: {
                            this.handleIncomingFrame(frame.data());
                            continue block8;
                        }
                    }
                    log.warn("Unexpected opcode in read loop: {}", (Object)frame.op());
                }
            }
            catch (Exception exception) {
                if (Thread.currentThread().isInterrupted() || !this.isGenerationActive(l)) break block12;
                log.warn("Read loop error: {}", (Object)exception.getMessage(), (Object)exception);
                this.handleDisconnect(0, exception.getMessage(), exception, l);
            }
        }
        log.debug("Read loop ended for generation {}", (Object)l);
    }

    private User validateHandshakeUser(JsonObject jsonObject) {
        try {
            User user = User.fromJson((JsonObject)jsonObject);
            if (user.id() == null || user.id().isBlank()) {
                throw new ConnectionException("Handshake user is missing id");
            }
            if (user.username() == null || user.username().isBlank()) {
                throw new ConnectionException("Handshake user is missing username");
            }
            user.idLong();
            return user;
        }
        catch (ConnectionException connectionException) {
            throw connectionException;
        }
        catch (RuntimeException runtimeException) {
            throw new ConnectionException("Invalid user in handshake response", (Throwable)runtimeException);
        }
    }

    public static Optional lambda$handshake$13(JsonObject jsonObject) {
        return JsonUtils.optString((JsonObject)jsonObject, (String)"api_endpoint");
    }

    public AtomicLong reconnectGeneration() {
        return this.reconnectGeneration;
    }

    final class HandshakeResult
    extends Record {
        public final Connection connection;
        public final User user;
        public final DiscordBuild build;

        HandshakeResult(Connection connection, User user, DiscordBuild build) {
            this.connection = connection;
            this.user = user;
            this.build = build;
        }

        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{HandshakeResult.class, "connection;user;build", "connection", "user", "build"}, this);
        }

        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{HandshakeResult.class, "connection;user;build", "connection", "user", "build"}, this);
        }

        public final boolean equals(Object o) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{HandshakeResult.class, "connection;user;build", "connection", "user", "build"}, this, o);
        }

        public Connection connection() {
            return this.connection;
        }

        public User user() {
            return this.user;
        }

        public DiscordBuild build() {
            return this.build;
        }
    }

    final class Lambda0
    implements Supplier {
        private Lambda0() {
        }

        public Object get() {
            return ConnectionManager.lambda$handshake$10();
        }
    }

    final class Lambda1
    implements PipePathProvider {
        private Lambda1() {
        }

        public List locateAll() {
            return PipeLocator.locateAll();
        }
    }

    final class Lambda10
    implements Supplier {
        private Lambda10() {
        }

        public Object get() {
            return ConnectionManager.lambda$handshake$10();
        }
    }

    final class Lambda11
    implements Predicate {
        private Lambda11() {
        }

        public boolean test(Object object) {
            return ConnectionManager.lambda$handshake$11((JsonObject)object);
        }
    }

    final class Lambda12
    implements Supplier {
        private Lambda12() {
        }

        public Object get() {
            return ConnectionManager.lambda$handshake$12();
        }
    }

    final class Lambda13
    implements Function {
        private Lambda13() {
        }

        public Object apply(Object object) {
            return ConnectionManager.lambda$handshake$13((JsonObject)object);
        }
    }

    final class Lambda14
    implements Runnable {
        private final ConnectionManager arg$1;
        private final long arg$2;
        private final Connection arg$3;

        private Lambda14(ConnectionManager connectionManager, long l, Connection connection) {
            this.arg$1 = connectionManager;
            this.arg$2 = l;
            this.arg$3 = connection;
        }

        @Override
        public void run() {
            this.arg$1.lambda$startReadLoop$3(this.arg$2, this.arg$3);
        }
    }

    final class Lambda2
    implements ConnectionFactory {
        @Override
        public Connection create(String string) {
            return ConnectionManager.lambda$new$1(string);
        }

        private Lambda2() {
        }
    }

    final class Lambda3
    implements ThreadFactory {
        private Lambda3() {
        }

        @Override
        public Thread newThread(Runnable runnable) {
            return ConnectionManager.lambda$new$0(runnable);
        }
    }

    final class Lambda4
    implements Consumer {
        private final ConnectionState arg$1;

        private Lambda4(ConnectionState connectionState) {
            this.arg$1 = connectionState;
        }

        public void accept(Object object) {
            ConnectionManager.lambda$setState$2(this.arg$1, (Consumer)object);
        }
    }

    final class Lambda5
    implements Predicate {
        private Lambda5() {
        }

        public boolean test(Object object) {
            return ConnectionManager.lambda$handshake$5((String)object);
        }
    }

    final class Lambda6
    implements Consumer {
        private Lambda6() {
        }

        public void accept(Object object) {
            ConnectionManager.lambda$handshake$6((String)object);
        }
    }

    final class Lambda7
    implements Predicate {
        private Lambda7() {
        }

        public boolean test(Object object) {
            return ConnectionManager.lambda$handshake$7((String)object);
        }
    }

    final class Lambda8
    implements Consumer {
        private Lambda8() {
        }

        public void accept(Object object) {
            ConnectionManager.lambda$handshake$8((String)object);
        }
    }

    final class Lambda9
    implements Predicate {
        private Lambda9() {
        }

        public boolean test(Object object) {
            return ConnectionManager.lambda$handshake$9((JsonObject)object);
        }
    }
}

