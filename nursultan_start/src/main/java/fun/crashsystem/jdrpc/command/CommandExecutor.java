/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.error.CommandException
 *  fun.crashsystem.jdrpc.error.RpcErrorCode
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement
 *  fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject
 *  fun.crashsystem.jdrpc.protocol.Frame
 *  fun.crashsystem.jdrpc.protocol.OpCode
 *  fun.crashsystem.jdrpc.util.JsonUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package fun.crashsystem.jdrpc.command;

import fun.crashsystem.jdrpc.command.CommandExecutor;
import fun.crashsystem.jdrpc.connection.Connection;
import fun.crashsystem.jdrpc.error.CommandException;
import fun.crashsystem.jdrpc.error.RpcErrorCode;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonElement;
import fun.crashsystem.jdrpc.libs.com.google.gson.JsonObject;
import fun.crashsystem.jdrpc.protocol.Frame;
import fun.crashsystem.jdrpc.protocol.OpCode;
import fun.crashsystem.jdrpc.util.JsonUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class CommandExecutor {
    private static Logger log = LogManager.getLogger((String)"fun.crashsystem.jdrpc.command.CommandExecutor");
    private final ConcurrentHashMap<String, CompletableFuture<JsonObject>> pending = new ConcurrentHashMap();
    private final AtomicLong nonceCounter = new AtomicLong();
    private final AtomicBoolean transportAvailable = new AtomicBoolean(false);
    private final long commandTimeoutMs;
    private final TokenBucketRateLimiter rateLimiter;

    public void cancelAll(Throwable throwable) {
        this.transportAvailable.set(false);
        this.pending.forEach((arg_0, arg_1) -> this.lambda$cancelAll$0(throwable, arg_0, arg_1));
    }

    public CommandExecutor(long l, int n) {
        if (l <= 0L) {
            throw new IllegalArgumentException("commandTimeoutMs must be > 0");
        }
        if (n < 0) {
            throw new IllegalArgumentException("maxCommandsPerSecond must be >= 0");
        }
        this.commandTimeoutMs = l;
        this.rateLimiter = n > 0 ? new TokenBucketRateLimiter(n) : null;
    }

    public JsonObject execute(Connection connection, String string, JsonObject jsonObject, String string2) throws IOException {
        this.ensureTransportAvailable();
        String string3 = String.valueOf(this.nonceCounter.incrementAndGet());
        CompletableFuture<JsonObject> completableFuture = new CompletableFuture<JsonObject>();
        this.pending.put(string3, completableFuture);
        try {
            this.ensurePendingTransportAvailability(string3, completableFuture);
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("cmd", string);
            if (jsonObject != null) {
                jsonObject2.add("args", (JsonElement)jsonObject);
            }
            if (string2 != null) {
                jsonObject2.addProperty("evt", string2);
            }
            jsonObject2.addProperty("nonce", string3);
            log.debug("Sending command: {} (nonce: {})", (Object)string, (Object)string3);
            this.acquireRateLimit();
            this.ensurePendingTransportAvailability(string3, completableFuture);
            connection.write(new Frame(OpCode.FRAME, jsonObject2));
            JsonObject jsonObject3 = completableFuture.get(this.commandTimeoutMs, TimeUnit.MILLISECONDS);
            return jsonObject3;
        }
        catch (CommandException commandException) {
            throw commandException;
        }
        catch (ExecutionException executionException) {
            Throwable throwable = executionException.getCause();
            if (throwable instanceof CommandException) {
                CommandException commandException = (CommandException)throwable;
                throw commandException;
            }
            throw new IOException("Command failed", executionException.getCause());
        }
        catch (TimeoutException timeoutException) {
            throw new IOException("Command timed out after " + this.commandTimeoutMs + " ms", timeoutException);
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("Interrupted while waiting for command response");
        }
        catch (Exception exception) {
            throw new IOException("Command timeout or error", exception);
        }
        finally {
            this.pending.remove(string3, completableFuture);
        }
    }

    public boolean handleResponse(JsonObject jsonObject) {
        String string = JsonUtils.optString((JsonObject)jsonObject, (String)"nonce").orElse(null);
        if (string == null) {
            return false;
        }
        CompletableFuture<JsonObject> completableFuture = this.pending.remove(string);
        if (completableFuture == null) {
            return false;
        }
        String string2 = JsonUtils.optString((JsonObject)jsonObject, (String)"evt").orElse(null);
        JsonObject jsonObject2 = JsonUtils.optObject((JsonObject)jsonObject, (String)"data").orElse(null);
        if ("ERROR".equals(string2)) {
            int n = JsonUtils.getInt((JsonObject)jsonObject2, (String)"code", (int)1000);
            String string3 = JsonUtils.getString((JsonObject)jsonObject2, (String)"message", (String)"Unknown error");
            completableFuture.completeExceptionally(new CommandException(RpcErrorCode.fromCode((int)n), string3));
        } else {
            completableFuture.complete(jsonObject2 != null ? jsonObject2 : new JsonObject());
        }
        return true;
    }

    private void ensurePendingTransportAvailability(String string, CompletableFuture<JsonObject> completableFuture) throws IOException {
        if (this.transportAvailable.get()) {
            return;
        }
        this.pending.remove(string, completableFuture);
        throw new IOException("Connection is not available");
    }

    private void lambda$cancelAll$0(Throwable throwable, String string, CompletableFuture completableFuture) {
        if (this.pending.remove(string, completableFuture)) {
            log.debug("Cancelling pending command: {}", (Object)string);
            completableFuture.completeExceptionally(throwable);
        }
    }

    private void acquireRateLimit() throws IOException {
        if (this.rateLimiter == null) {
            return;
        }
        try {
            this.rateLimiter.acquire();
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("Interrupted while waiting for command rate limiter");
        }
    }

    public void markTransportAvailable() {
        this.transportAvailable.set(true);
    }

    public void markTransportUnavailable() {
        this.transportAvailable.set(false);
    }

    private void ensureTransportAvailable() throws IOException {
        if (!this.transportAvailable.get()) {
            throw new IOException("Connection is not available");
        }
    }
}

