package fun.nexisdlc.client.utils.irc;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fun.nexisdlc.client.utils.client.other.Log;
import fun.nexisdlc.client.utils.render.color.gradient.GradientUtil;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Formatting;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.sterford.annotations.NativeCall;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class IRCManager {
    private static final String WS_BASE = "wss://api.nexisdlc.fun/ws/irc/";
    private static final OkHttpClient WS_CLIENT = new OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .pingInterval(20, TimeUnit.SECONDS)
            .build();

    @Getter
    private static final IRCManager instance = new IRCManager();

    private final ExecutorService executor = Executors.newFixedThreadPool(2);
    private final AtomicBoolean running = new AtomicBoolean(false);
    private final AtomicBoolean connected = new AtomicBoolean(false);

    @Getter
    @Setter
    private String token = "";

    @Getter
    @Setter
    private String username = "";

    @Getter
    private final List<IRCMessage> messages = new ArrayList<>();
    private final Set<String> recentFingerprints = new HashSet<>();

    private volatile String lastTimestamp = null;
    private volatile WebSocket webSocket;

    @Getter
    private long lastMessageTime = 0L;
    private static final long MESSAGE_COOLDOWN_MS = 3000L;

    @Setter
    private OnMessageListener onMessageListener;

    @Setter
    private OnConnectionListener onConnectionListener;

    public interface OnMessageListener {
        void onMessage(IRCMessage message);
    }

    public interface OnConnectionListener {
        void onConnected();
        void onDisconnected();
        void onError(String error);
    }

    private IRCManager() {
    }

    public void connect() {
        if (running.get()) {
            Log.log("[IRC] Уже подключено!");
            return;
        }

        if (token == null || token.isBlank()) {
            Log.log("[IRC] Токен не установлен!");
            notifyError("Токен не установлен");
            return;
        }

        synchronized (messages) {
            messages.clear();
            recentFingerprints.clear();
        }
        lastTimestamp = null;
        running.set(true);
        connected.set(false);

        Request request = new Request.Builder()
                .url(WS_BASE + "?token=" + URLEncode.encode(token))
                .build();
        webSocket = WS_CLIENT.newWebSocket(request, new SocketListener());
        Log.log("[IRC] Подключение к websocket IRC...");
    }

    public void disconnect() {
        if (!running.getAndSet(false)) {
            return;
        }
        connected.set(false);

        WebSocket socket = webSocket;
        webSocket = null;
        if (socket != null) {
            socket.close(1000, "disconnect");
        }

        synchronized (messages) {
            messages.clear();
            recentFingerprints.clear();
        }
        lastTimestamp = null;

        Log.log("[IRC] Отключено от сервера");
        if (onConnectionListener != null) {
            runOnClientThread(() -> onConnectionListener.onDisconnected());
        }
    }

    public void sendMessage(String message) {
        if (!running.get() || token == null || token.isBlank()) {
            Log.log("[IRC] Не подключено к серверу!");
            return;
        }

        if (message == null || message.trim().isEmpty()) {
            return;
        }

        long currentTime = System.currentTimeMillis();
        if (currentTime - lastMessageTime < MESSAGE_COOLDOWN_MS) {
            long remaining = MESSAGE_COOLDOWN_MS - (currentTime - lastMessageTime);
            addChatMessage(GradientUtil.formatMessage("[IRC Chat]", "Подождите " + Formatting.GOLD + (remaining / 1000.0) + Formatting.RESET + " сек. перед отправкой!"));
            Log.log(Formatting.RED + "[IRC] Подождите " + (remaining / 1000.0) + " сек. перед отправкой!");
            return;
        }
        lastMessageTime = currentTime;

        executor.submit(() -> {
            WebSocket socket = webSocket;
            if (socket == null) {
                Log.log(Formatting.RED + "[IRC] Нет websocket-соединения!");
                return;
            }

            boolean sent = socket.send("{\"type\":\"irc.send\",\"message\":\"" + escapeJson(message) + "\"}");
            if (!sent) {
                Log.log(Formatting.RED + "[IRC] Не удалось отправить сообщение");
            }
        });
    }

    public void checkMuteStatus() {
        Log.log("[IRC] mute status sync идет через websocket bootstrap");
    }

    public List<IRCMessage> getRecentMessages(int limit) {
        synchronized (messages) {
            int size = messages.size();
            int from = Math.max(0, size - limit);
            return new ArrayList<>(messages.subList(from, size));
        }
    }

    public void clearMessages() {
        synchronized (messages) {
            messages.clear();
            recentFingerprints.clear();
        }
    }

    public boolean isConnected() {
        return running.get() && connected.get() && webSocket != null;
    }
    @NativeCall
    private void handleSocketMessage(String text) {
        JsonObject json = JsonParser.parseString(text).getAsJsonObject();
        String type = json.has("type") ? json.get("type").getAsString() : "";

        if ("irc.bootstrap".equals(type)) {
            if (json.has("messages")) {
                JsonArray array = json.getAsJsonArray("messages");
                for (JsonElement element : array) {
                    if (element.isJsonObject()) {
                        handleIncomingMessage(IRCMessage.fromJson(element.getAsJsonObject()));
                    }
                }
            }

            if (json.has("is_muted") && json.get("is_muted").getAsBoolean()) {
                String reason = json.has("mute_reason") && !json.get("mute_reason").isJsonNull()
                        ? json.get("mute_reason").getAsString()
                        : "Причина не указана";

                showMuteMessage(reason);
            }
            return;
        }

        if ("irc.muted".equals(type)) {
            String reason = json.has("reason") ? json.get("reason").getAsString() : "Причина не указана";
            int duration = json.has("duration_minutes") ? json.get("duration_minutes").getAsInt() : 0;
            String mutedBy = json.has("muted_by") ? json.get("muted_by").getAsString() : "Admin";

            String message = String.format("Вас замутил %s!§r\nПричина: §6%s§r",
                    mutedBy, reason);
            if (duration > 0) {
                message += String.format("\nДлительность: §6%d минут(ы)§r", duration);
            }

            addChatMessage(GradientUtil.formatMessage("[IRC Chat]", message));
            return;
        }

        if ("irc.error".equals(type)) {
            String error = json.has("error") ? json.get("error").getAsString() : "unknown error";
            String code = json.has("code") ? json.get("code").getAsString() : "";

            if ("MUTED".equals(code)) {
                String reason = json.has("reason") && !json.get("reason").isJsonNull()
                        ? json.get("reason").getAsString()
                        : "Причина не указана";

                Log.log(Formatting.RED + "[IRC] Вы замучены! Причина: " + reason);

                addChatMessage(GradientUtil.formatMessage("[IRC Chat]",
                        "Вы замучены в IRC-чате! Причина: " + Formatting.GOLD + reason));
            } else {
                notifyError(error);
            }
            return;
        }

        handleIncomingMessage(IRCMessage.fromJson(json));
    }

    private void showMuteMessage(String reason) {
        addChatMessage(GradientUtil.formatMessage("[IRC Chat]",
                "Вы замучены в IRC-чате! Причина: " + Formatting.GOLD + reason));
        Log.log(Formatting.RED + "[IRC] Вы замучены! Причина: " + reason);
    }
    private void handleIncomingMessage(IRCMessage message) {
        if (message == null) {
            return;
        }

        String fingerprint = buildFingerprint(message);
        if (lastTimestamp != null && message.getTimestamp().compareTo(lastTimestamp) <= 0) {
            synchronized (messages) {
                if (fingerprint != null && recentFingerprints.contains(fingerprint)) {
                    return;
                }
            }
        }

        synchronized (messages) {
            if (fingerprint != null && recentFingerprints.contains(fingerprint)) {
                return;
            }
            messages.add(message);
            if (fingerprint != null) {
                recentFingerprints.add(fingerprint);
            }
            trimRecentFingerprints();
        }
        lastTimestamp = message.getTimestamp();

        if (onMessageListener != null) {
            runOnClientThread(() -> onMessageListener.onMessage(message));
        }
    }

    private static String buildFingerprint(IRCMessage message) {
        if (message == null) {
            return null;
        }

        return String.valueOf(message.getType()) + '\n'
                + String.valueOf(message.getUserId()) + '\n'
                + String.valueOf(message.getUsername()) + '\n'
                + String.valueOf(message.getRole()) + '\n'
                + String.valueOf(message.getMessage()) + '\n'
                + String.valueOf(message.getTimestamp());
    }

    private void trimRecentFingerprints() {
        int overflow = messages.size() - 256;
        if (overflow <= 0) {
            return;
        }

        int removeCount = Math.min(overflow, messages.size());
        for (int i = 0; i < removeCount; i++) {
            IRCMessage old = messages.get(i);
            recentFingerprints.remove(buildFingerprint(old));
        }
    }

    private void scheduleReconnect() {
        executor.submit(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            if (!running.get()) return;
            running.set(false);
            connect();
        });
    }

    private void notifyError(String error) {
        if (onConnectionListener != null) {
            runOnClientThread(() -> onConnectionListener.onError(error));
        }
    }

    private static void addChatMessage(net.minecraft.text.Text text) {
        runOnClientThread(() -> {
            MinecraftClient client = MinecraftClient.getInstance();
            if (client.inGameHud != null) {
                client.inGameHud.getChatHud().addMessage(text);
            }
        });
    }

    private static void runOnClientThread(Runnable runnable) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null || runnable == null) {
            return;
        }
        if (client.isOnThread()) {
            runnable.run();
        } else {
            client.execute(runnable);
        }
    }

    private static String escapeJson(String value) {
        if (value == null) {
            return "";
        }
        return value.replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }

    private final class SocketListener extends WebSocketListener {
        @Override
        public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
            try {
                connected.set(true);
                if (onConnectionListener != null) {
                    runOnClientThread(() -> onConnectionListener.onConnected());
                }
            } finally {
                response.close();
            }
        }

        @Override
        public void onMessage(@NotNull WebSocket webSocket, @NotNull String text) {
            try {
                handleSocketMessage(text);
            } catch (Exception exception) {
                notifyError(exception.getMessage() == null ? "Bad IRC payload" : exception.getMessage());
            }
        }

        @Override
        public void onClosed(@NotNull WebSocket webSocket, int code, @NotNull String reason) {
            IRCManager.this.webSocket = null;
            connected.set(false);
            if (running.get() && onConnectionListener != null) {
                runOnClientThread(() -> onConnectionListener.onDisconnected());
            }
            scheduleReconnect();
        }

        @Override
        public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable t, @Nullable Response response) {
            try {
                IRCManager.this.webSocket = null;
                connected.set(false);
                String message = t.getMessage() == null ? "IRC websocket failure" : t.getMessage();
                if (response != null) {
                    message = message + " [HTTP " + response.code() + "]";
                }
                Log.log("[IRC] " + Formatting.RED + "WebSocket failure: " + message);
                notifyError(message);
            } finally {
                if (response != null) {
                    response.close();
                }
            }
            scheduleReconnect();
        }
    }
}
