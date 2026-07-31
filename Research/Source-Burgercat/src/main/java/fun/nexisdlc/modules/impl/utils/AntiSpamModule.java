package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;

import java.util.HashMap;
import java.util.Map;

@FunctionAdd(
        name = "AntiSpam",
        alias = "Anti Spam",
        category = Category.Utilities,
        description = "Объединяет одинаковые сообщения в чате"
)
public class AntiSpamModule extends Function {
    private static final long RESET_AFTER_MS = 60_000L;
    private static final Map<String, SpamState> repeats = new HashMap<>();
    private static String serverContext = null;

    public AntiSpamModule() {
        setState(true);
    }

    public static void resetState() {
        repeats.clear();
    }

    public static void ensureServerContext(String currentServerContext) {
        String normalized = currentServerContext == null ? "unknown" : currentServerContext;
        if (!normalized.equals(serverContext)) {
            serverContext = normalized;
            resetState();
        }
    }

    public static int nextCountFor(String messageKey) {
        if (messageKey == null || messageKey.isEmpty()) return 1;

        long now = System.currentTimeMillis();
        SpamState state = repeats.get(messageKey);
        if (state == null || (now - state.lastSeenMs) >= RESET_AFTER_MS) {
            repeats.put(messageKey, new SpamState(1, now));
            return 1;
        }

        int next = state.count + 1;
        repeats.put(messageKey, new SpamState(next, now));
        return next;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        serverContext = null;
        resetState();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        serverContext = null;
        resetState();
    }

    private record SpamState(int count, long lastSeenMs) {}
}
