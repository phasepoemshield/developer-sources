package fun.nexisdlc.client.utils.globals;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.client.ILogger;
import fun.nexisdlc.client.utils.client.other.Log;
import fun.nexisdlc.client.utils.irc.URLEncode;
import fun.nexisdlc.modules.impl.render.ItemReplacer;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.sterford.annotations.NativeCall;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class GlobalsManager {
    private static final String WS_BASE = "wss://api.nexisdlc.fun/ws/globals/";
    private static final OkHttpClient WS_CLIENT = new OkHttpClient.Builder()
            .pingInterval(20, TimeUnit.SECONDS)
            .build();

    @Getter
    private static final GlobalsManager instance = new GlobalsManager();

    private final AtomicBoolean running = new AtomicBoolean(false);
    private final AtomicBoolean connected = new AtomicBoolean(false);
    private volatile WebSocket webSocket;

    @Getter
    @Setter
    private String token = "";

    @Getter
    private volatile GlobalsParty party;

    @Getter
    private final List<GlobalsPoint> points = new CopyOnWriteArrayList<>();

    private volatile boolean customTextureSyncEnabled;
    private volatile String customTexture = "";

    private GlobalsManager() {
    }

    public void connect() {
        if (running.get()) return;
        if (token == null || token.isBlank()) {
            Log.log("[Globals] JWT-токен не найден");
            return;
        }
        running.set(true);
        connected.set(false);
        Request request = new Request.Builder()
                .url(WS_BASE + "?token=" + URLEncode.encode(token))
                .build();
        webSocket = WS_CLIENT.newWebSocket(request, new SocketListener());
    }

    public void disconnect() {
        running.set(false);
        connected.set(false);
        WebSocket socket = webSocket;
        webSocket = null;
        if (socket != null) {
            socket.send("{\"type\":\"globals.disconnect\"}");
            socket.close(1000, "disconnect");
        }
    }

    public boolean isConnected() {
        return running.get() && connected.get() && webSocket != null;
    }

    public void heartbeat() {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (!isConnected() || mc.player == null || mc.world == null) return;
        String server = mc.getCurrentServerEntry() == null ? "" : mc.getCurrentServerEntry().address;
        String world = mc.world.getRegistryKey().getValue().toString();
        customTexture = customTextureSyncEnabled ? ItemReplacer.getSelectedModelName() : "";
        JsonObject payload = new JsonObject();
        payload.addProperty("type", "globals.heartbeat");
        payload.addProperty("minecraft_uuid", mc.player.getUuidAsString());
        payload.addProperty("minecraft_name", mc.player.getName().getString());
        payload.addProperty("server_address", server);
        payload.addProperty("world_key", world);
        payload.addProperty("health", mc.player.getHealth() + mc.player.getAbsorptionAmount());
        payload.addProperty("x", mc.player.getX());
        payload.addProperty("y", mc.player.getY());
        payload.addProperty("z", mc.player.getZ());
        payload.addProperty("custom_texture", customTexture);
        payload.addProperty("last_seen_ms", System.currentTimeMillis());
        send(payload.toString());
    }

    public void syncInventory() {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (!isConnected() || mc.player == null || mc.world == null) return;

        JsonObject payload = new JsonObject();
        payload.addProperty("type", "globals.inventory.update");
        payload.addProperty("minecraft_uuid", mc.player.getUuidAsString());
        payload.addProperty("minecraft_name", mc.player.getName().getString());
        payload.addProperty("last_inventory_ms", System.currentTimeMillis());
        payload.add("inventory", GlobalsInventoryCodec.toJson(collectInventorySnapshot(mc)));
        send(payload.toString());
    }

    public void setCustomTextureSyncEnabled(boolean enabled) {
        customTextureSyncEnabled = enabled;
        if (!enabled) {
            customTexture = "";
        }
    }

    public boolean isCustomTextureSyncEnabled() {
        return customTextureSyncEnabled;
    }

    public String getPartyCustomTexture(String minecraftName) {
        GlobalsParty current = party;
        if (minecraftName == null || current == null || !customTextureSyncEnabled) return "";
        for (GlobalsMember member : current.members()) {
            if (member.minecraftName() != null && member.minecraftName().equalsIgnoreCase(minecraftName)) {
                return member.customTexture() == null ? "" : member.customTexture();
            }
        }
        return "";
    }

    public void createParty() {
        send("{\"type\":\"globals.party.create\"}");
    }

    public void joinParty(String code) {
        JsonObject payload = new JsonObject();
        payload.addProperty("type", "globals.party.join");
        payload.addProperty("code", code.toUpperCase(Locale.US));
        send(payload.toString());
    }

    public void disbandParty() {
        send("{\"type\":\"globals.party.disband\"}");
    }

    public void requestList() {
        send("{\"type\":\"globals.party.list\"}");
    }

    public void accept(int userId) {
        JsonObject payload = new JsonObject();
        payload.addProperty("type", "globals.party.accept");
        payload.addProperty("user_id", userId);
        send(payload.toString());
    }

    public void reject(int userId) {
        JsonObject payload = new JsonObject();
        payload.addProperty("type", "globals.party.reject");
        payload.addProperty("user_id", userId);
        send(payload.toString());
    }

    public void createPoint() {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc.player == null || mc.world == null) return;
        String server = mc.getCurrentServerEntry() == null ? "" : mc.getCurrentServerEntry().address;
        String world = mc.world.getRegistryKey().getValue().toString();
        JsonObject payload = new JsonObject();
        payload.addProperty("type", "globals.point.create");
        payload.addProperty("x", mc.player.getX());
        payload.addProperty("y", mc.player.getY());
        payload.addProperty("z", mc.player.getZ());
        payload.addProperty("world_key", world);
        payload.addProperty("server_address", server);
        send(payload.toString());
    }

    public boolean isPartyFriend(String minecraftName) {
        GlobalsParty current = party;
        if (minecraftName == null || current == null) return false;
        for (GlobalsMember member : current.members()) {
            if (member.minecraftName() != null && member.minecraftName().equalsIgnoreCase(minecraftName)) {
                return true;
            }
        }
        return false;
    }

    public String getSiteLoginByMinecraftName(String minecraftName) {
        GlobalsParty current = party;
        if (minecraftName == null || current == null) return null;
        for (GlobalsMember member : current.members()) {
            if (member.minecraftName() != null && member.minecraftName().equalsIgnoreCase(minecraftName)) {
                return member.username();
            }
        }
        return null;
    }

    private void send(String payload) {
        WebSocket socket = webSocket;
        if (socket != null) socket.send(payload);
    }

    @NativeCall
    private void handleSocketMessage(String text) {
        JsonObject json = JsonParser.parseString(text).getAsJsonObject();
        String type = getString(json, "type");
        switch (type) {
            case "globals.bootstrap", "globals.party.update", "globals.party.created", "globals.party.joined", "globals.party.list" -> {
                if (json.has("party") && json.get("party").isJsonObject()) {
                    party = parseParty(json.getAsJsonObject("party"));
                    syncFriends();
                    if ("globals.party.created".equals(type)) {
                        chat(Formatting.GREEN + "Globals: код группы " + Formatting.AQUA + party.code());
                    }
                }
            }
            case "globals.party.disbanded" -> {
                party = null;
                chat(Formatting.RED + "Globals: группа расформирована");
            }
            case "globals.party.join_requested" -> showJoinRequest(json);
            case "globals.party.accepted" -> {
                if (json.has("party")) party = parseParty(json.getAsJsonObject("party"));
                syncFriends();
                chat(Formatting.GREEN + "Globals: заявка принята");
            }
            case "globals.party.rejected" -> chat(Formatting.RED + "Globals: заявка отклонена");
            case "globals.inventory.update" -> applyInventoryUpdate(json);
            case "globals.point" -> addPoint(json);
            case "globals.error" -> chat(Formatting.RED + "Globals: " + translateError(getString(json, "error")));
        }
    }

    private void showJoinRequest(JsonObject json) {
        int userId = getInt(json, "user_id");
        String username = getString(json, "username");
        MutableText message = Text.empty()
                .append(ILogger.getPrefix())
                .append(Text.literal(" "))
                .append(Text.literal("Пользователь ").formatted(Formatting.WHITE))
                .append(Text.literal(username).formatted(Formatting.GRAY))
                .append(Text.literal(" хочет вступить в Вашу группу ").formatted(Formatting.WHITE))
                .append(button("[Принять]", "#2ecc71", ".globals accept " + userId))
                .append(Text.literal(" "))
                .append(button("[Отклонить]", "#ff4f7b", ".globals reject " + userId));
        addChat(message);
    }

    private Text button(String text, String color, String command) {
        return Text.literal(text).setStyle(Style.EMPTY
                .withColor("#2ecc71".equals(color) ? net.minecraft.text.TextColor.fromRgb(0x2ecc71) : net.minecraft.text.TextColor.fromRgb(0xff4f7b))
                .withClickEvent(new ClickEvent.RunCommand(command))
                .withHoverEvent(new HoverEvent.ShowText(Text.literal(command))));
    }

    private void addPoint(JsonObject json) {
        GlobalsPoint point = new GlobalsPoint(
                getInt(json, "user_id"),
                getString(json, "username"),
                getString(json, "world_key"),
                getString(json, "server_address"),
                getDouble(json, "x"),
                getDouble(json, "y"),
                getDouble(json, "z"),
                getLong(json, "created_at_ms")
        );
        points.removeIf(old -> old.userId() == point.userId());
        points.add(point);
        long now = System.currentTimeMillis();
        for (Iterator<GlobalsPoint> it = points.iterator(); it.hasNext();) {
            GlobalsPoint old = it.next();
            if (now - old.createdAtMs() > TimeUnit.MINUTES.toMillis(10)) {
                points.remove(old);
            }
        }
    }

    private GlobalsParty parseParty(JsonObject json) {
        List<GlobalsMember> members = new ArrayList<>();
        JsonArray array = json.has("members") && json.get("members").isJsonArray() ? json.getAsJsonArray("members") : new JsonArray();
        for (JsonElement element : array) {
            if (!element.isJsonObject()) continue;
            JsonObject item = element.getAsJsonObject();
            members.add(new GlobalsMember(
                    getInt(item, "user_id"),
                    getString(item, "username"),
                    getString(item, "minecraft_name"),
                    getString(item, "world_key"),
                    getString(item, "server_address"),
                    item.has("online") && item.get("online").getAsBoolean(),
                    (float) getDouble(item, "health"),
                    getDouble(item, "x"),
                    getDouble(item, "y"),
                    getDouble(item, "z"),
                    getString(item, "custom_texture"),
                    parseInventory(item)
            ));
        }
        return new GlobalsParty(getString(json, "code"), getInt(json, "owner_id"), getString(json, "owner_username"), members);
    }

    private void applyInventoryUpdate(JsonObject json) {
        GlobalsParty current = party;
        if (current == null) return;
        int userId = getInt(json, "user_id");
        String minecraftName = getString(json, "minecraft_name");
        String username = getString(json, "username");
        if (userId <= 0 && minecraftName.isBlank() && username.isBlank()) return;
        List<GlobalsInventoryItem> inventory = parseInventory(json);
        List<GlobalsMember> members = new ArrayList<>();
        boolean changed = false;
        for (GlobalsMember member : current.members()) {
            if (matchesInventoryOwner(member, userId, minecraftName, username)) {
                members.add(withInventory(member, inventory));
                changed = true;
            } else {
                members.add(member);
            }
        }
        if (changed) {
            party = new GlobalsParty(current.code(), current.ownerId(), current.ownerUsername(), members);
        }
    }

    private boolean matchesInventoryOwner(GlobalsMember member, int userId, String minecraftName, String username) {
        if (member == null) {
            return false;
        }
        if (userId > 0 && member.userId() == userId) {
            return true;
        }
        if (minecraftName != null && !minecraftName.isBlank()
                && member.minecraftName() != null && member.minecraftName().equalsIgnoreCase(minecraftName)) {
            return true;
        }
        return username != null && !username.isBlank()
                && member.username() != null && member.username().equalsIgnoreCase(username);
    }

    private GlobalsMember withInventory(GlobalsMember member, List<GlobalsInventoryItem> inventory) {
        return new GlobalsMember(
                member.userId(),
                member.username(),
                member.minecraftName(),
                member.worldKey(),
                member.serverAddress(),
                member.online(),
                member.health(),
                member.x(),
                member.y(),
                member.z(),
                member.customTexture(),
                inventory
        );
    }

    private List<GlobalsInventoryItem> parseInventory(JsonObject json) {
        if (json == null) {
            return List.of();
        }
        if (json.has("inventory")) {
            return GlobalsInventoryCodec.parseInventory(json.get("inventory"));
        }
        if (json.has("items")) {
            return GlobalsInventoryCodec.parseInventory(json.get("items"));
        }
        return List.of();
    }

    private List<GlobalsInventoryItem> collectInventorySnapshot(MinecraftClient mc) {
        List<GlobalsInventoryItem> items = new ArrayList<>();
        ItemCooldownManager cooldownManager = mc.player.getItemCooldownManager();
        for (int slot = GlobalsInventoryCodec.MIN_SLOT; slot <= GlobalsInventoryCodec.MAX_SLOT; slot++) {
            ItemStack stack = mc.player.getInventory().getStack(slot);
            addInventoryItem(items, slot, stack, cooldownManager);
        }
        return items;
    }

    private void addInventoryItem(List<GlobalsInventoryItem> items, int slot, ItemStack stack, ItemCooldownManager cooldownManager) {
        if (stack == null || stack.isEmpty() || stack.isOf(Items.AIR)) {
            return;
        }
        Identifier itemId = Registries.ITEM.getId(stack.getItem());
        if (itemId == null) {
            return;
        }
        items.add(new GlobalsInventoryItem(slot, itemId.toString(), cooldownSeconds(stack, cooldownManager)));
    }

    private float cooldownSeconds(ItemStack stack, ItemCooldownManager cooldownManager) {
        if (stack == null || cooldownManager == null || !cooldownManager.isCoolingDown(stack)) {
            return 0f;
        }
        Identifier group = cooldownManager.getGroup(stack);
        ItemCooldownManager.Entry cooldown = cooldownManager.entries.get(group);
        if (cooldown == null) {
            return 0f;
        }
        return Math.max(0f, (cooldown.endTick - cooldownManager.tick) / 20f);
    }

    private void syncFriends() {
        GlobalsParty current = party;
        if (current == null) return;
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null) return;
        client.execute(() -> {
            for (GlobalsMember member : current.members()) {
                String minecraftName = member.minecraftName();
                if (minecraftName == null || minecraftName.isBlank()) {
                    continue;
                }

                if (!Nexis.getInstance().getFriendStorage().exists(minecraftName)) {
                    Nexis.getInstance().getFriendStorage().add(minecraftName);
                }
            }
        });
    }

    private static void chat(String message) {
        addChatPrefixed(Text.literal(message));
    }

    private static void addChatPrefixed(Text text) {
        MutableText component = Text.empty()
                .append(ILogger.getPrefix())
                .append(Text.literal(" "))
                .append(text);
        addChat(component);
    }

    private static void addChat(Text text) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null) return;
        client.execute(() -> {
            if (client.inGameHud != null) client.inGameHud.getChatHud().addMessage(text);
        });
    }

    private static String translateError(String error) {
        return switch (error) {
            case "party not found" -> "группа не найдена";
            case "join blocked after 3 rejects" -> "вступление заблокировано после 3 отказов";
            case "request not found" -> "заявка не найдена";
            case "minecraft_uuid and minecraft_name are required" -> "не удалось определить Minecraft-профиль";
            default -> error == null || error.isBlank() ? "неизвестная ошибка" : error;
        };
    }

    private static String getString(JsonObject json, String key) {
        return json.has(key) && !json.get(key).isJsonNull() ? json.get(key).getAsString() : "";
    }

    private static int getInt(JsonObject json, String key) {
        return json.has(key) && !json.get(key).isJsonNull() ? json.get(key).getAsInt() : 0;
    }

    private static long getLong(JsonObject json, String key) {
        return json.has(key) && !json.get(key).isJsonNull() ? json.get(key).getAsLong() : 0L;
    }

    private static double getDouble(JsonObject json, String key) {
        return json.has(key) && !json.get(key).isJsonNull() ? json.get(key).getAsDouble() : 0.0;
    }

    private final class SocketListener extends WebSocketListener {
        @Override
        public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
            connected.set(true);
            response.close();
        }

        @Override
        public void onMessage(@NotNull WebSocket webSocket, @NotNull String text) {
            handleSocketMessage(text);
        }

        @Override
        public void onClosed(@NotNull WebSocket webSocket, int code, @NotNull String reason) {
            connected.set(false);
            GlobalsManager.this.webSocket = null;
        }

        @Override
        public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable t, @Nullable Response response) {
            connected.set(false);
            running.set(false);
            GlobalsManager.this.webSocket = null;
            if (response != null) response.close();
            Log.log("[Globals] WebSocket failure: " + (t.getMessage() == null ? "unknown" : t.getMessage()));
        }
    }
}
