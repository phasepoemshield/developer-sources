package fun.nexisdlc.integration.baritone;

import fun.nexisdlc.Nexis;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Рефлексивный мост к Baritone API.
 * Позволяет выполнять команды Baritone, управлять настройками и чатом
 * без прямой зависимости от Baritone классов.
 *
 * Если Baritone не установлен — все методы возвращают false / null без ошибок.
 */
public final class BaritoneBridge {
    private static final long RESOLVE_RETRY_MS = 1_000L;
    private static final String BREAK_DENIED_SUBSTRING = "не можете сломать блок здесь";
    private static final String[] UNLOAD_CHAT_SETTINGS = {"chatControl", "chatControlAnyway", "prefixControl"};

    private static boolean available;
    private static boolean loggedAvailable;
    private static boolean loggedFailure;
    private static long nextResolveAt;
    private static Class<?> apiClass;

    private static Method getProviderMethod;
    private static Method getSettingsMethod;
    private static Method getPrimaryBaritoneMethod;
    private static Method getCommandManagerMethod;
    private static Method executeCommandMethod;
    private static Method getPathingBehaviorMethod;
    private static Method cancelEverythingMethod;
    private static Method secretInternalSegmentCancelMethod;

    private static Class<?> breakDenyTrackerClass;
    private static Method markLastAttemptDeniedMethod;
    private static Method clearDeniedBreaksMethod;

    private static final Map<String, Object> suppressedChatSettings = new HashMap<>();
    private static boolean chatSettingsSuppressed;

    private BaritoneBridge() {
    }

    public static boolean isAvailable() {
        return resolve();
    }

    public static boolean execute(String command) {
        if (command == null || command.isBlank() || !resolve()) {
            return false;
        }

        String normalized = command.trim();
        if (normalized.startsWith("#")) {
            normalized = normalized.substring(1).trim();
        }
        if (normalized.isEmpty()) {
            return false;
        }

        try {
            Object commandManager = getCommandManagerMethod.invoke(getPrimaryBaritone());
            executeCommandMethod.invoke(commandManager, normalized);
            return true;
        } catch (Throwable t) {
            Nexis.LOGGER.error("[BaritoneBridge] Failed to execute command: {}", normalized, t);
            return false;
        }
    }

    public static boolean pause() {
        return execute("pause");
    }

    public static boolean resume() {
        return execute("resume");
    }

    public static boolean cancelEverything() {
        if (!resolve()) {
            return false;
        }

        try {
            Object pathingBehavior = getPathingBehaviorMethod.invoke(getPrimaryBaritone());
            cancelEverythingMethod.invoke(pathingBehavior);
            return true;
        } catch (Throwable t) {
            Nexis.LOGGER.error("[BaritoneBridge] Failed to cancel Baritone pathing", t);
            return false;
        }
    }

    public static boolean setSettingValue(String settingName, Object value) {
        if (settingName == null || settingName.isBlank() || !resolve()) {
            return false;
        }

        try {
            Object settings = getSettingsMethod.invoke(null);
            Field settingField = settings.getClass().getField(settingName);
            Object setting = settingField.get(settings);
            Field valueField = setting.getClass().getField("value");
            valueField.set(setting, value);
            return true;
        } catch (Throwable t) {
            Nexis.LOGGER.error("[BaritoneBridge] Failed to set Baritone setting: {}", settingName, t);
            return false;
        }
    }

    public static boolean suppressChatControlForUnload() {
        if (!resolve()) {
            return false;
        }

        try {
            if (!chatSettingsSuppressed) {
                suppressedChatSettings.clear();
                for (String setting : UNLOAD_CHAT_SETTINGS) {
                    suppressedChatSettings.put(setting, getSettingValue(setting));
                }
                chatSettingsSuppressed = true;
            }
            boolean ok = true;
            for (String setting : UNLOAD_CHAT_SETTINGS) {
                ok &= setSettingValue(setting, false);
            }
            return ok;
        } catch (Throwable t) {
            Nexis.LOGGER.error("[BaritoneBridge] Failed to suppress Baritone chat control", t);
            return false;
        }
    }

    public static boolean restoreChatControlAfterUnload() {
        if (!chatSettingsSuppressed) {
            return true;
        }
        if (!resolve()) {
            return false;
        }

        try {
            boolean ok = true;
            for (Map.Entry<String, Object> entry : suppressedChatSettings.entrySet()) {
                ok &= setSettingValue(entry.getKey(), entry.getValue());
            }
            suppressedChatSettings.clear();
            chatSettingsSuppressed = false;
            return ok;
        } catch (Throwable t) {
            Nexis.LOGGER.error("[BaritoneBridge] Failed to restore Baritone chat control", t);
            return false;
        }
    }

    public static boolean handleServerChatMessage(String message) {
        if (message == null || !message.toLowerCase(Locale.ROOT).contains(BREAK_DENIED_SUBSTRING)) {
            return false;
        }
        return notifyBreakDenied();
    }

    public static boolean notifyBreakDenied() {
        if (!markLastAttemptDenied()) {
            return false;
        }
        return cancelCurrentSegmentForRepath();
    }

    public static Object getPrimaryBaritoneOrNull() {
        if (!resolve()) {
            return null;
        }

        try {
            return getPrimaryBaritone();
        } catch (Throwable t) {
            return null;
        }
    }

    public static Object getSettingsOrNull() {
        if (!resolve()) {
            return null;
        }

        try {
            return getSettingsMethod.invoke(null);
        } catch (Throwable t) {
            return null;
        }
    }

    public static boolean clearDeniedBreaks() {
        if (!resolveBreakDenyTracker()) {
            return false;
        }

        try {
            clearDeniedBreaksMethod.invoke(null);
            return true;
        } catch (Throwable t) {
            Nexis.LOGGER.error("[BaritoneBridge] Failed to clear denied Baritone breaks", t);
            return false;
        }
    }

    // ══════════════════════════════════════════════════════════════
    //  Внутренние методы
    // ══════════════════════════════════════════════════════════════

    private static Object getPrimaryBaritone() throws ReflectiveOperationException {
        Object provider = getProviderMethod.invoke(null);
        return getPrimaryBaritoneMethod.invoke(provider);
    }

    private static Object getSettingValue(String settingName) throws ReflectiveOperationException {
        Object settings = getSettingsMethod.invoke(null);
        Field settingField = settings.getClass().getField(settingName);
        Object setting = settingField.get(settings);
        Field valueField = setting.getClass().getField("value");
        return valueField.get(setting);
    }

    private static boolean markLastAttemptDenied() {
        if (!resolveBreakDenyTracker()) {
            return false;
        }

        try {
            return (Boolean) markLastAttemptDeniedMethod.invoke(null);
        } catch (Throwable t) {
            Nexis.LOGGER.error("[BaritoneBridge] Failed to mark denied Baritone break", t);
            return false;
        }
    }

    private static boolean cancelCurrentSegmentForRepath() {
        if (!resolve()) {
            return false;
        }

        try {
            Object pathingBehavior = getPathingBehaviorMethod.invoke(getPrimaryBaritone());
            secretInternalSegmentCancelMethod.invoke(pathingBehavior);
            return true;
        } catch (Throwable t) {
            Nexis.LOGGER.error("[BaritoneBridge] Failed to repath after denied Baritone break", t);
            return false;
        }
    }

    private static boolean resolveBreakDenyTracker() {
        if (markLastAttemptDeniedMethod != null) {
            return true;
        }

        try {
            breakDenyTrackerClass = Class.forName("baritone.utils.BreakDenyTracker");
            markLastAttemptDeniedMethod = breakDenyTrackerClass.getMethod("markLastAttemptDenied");
            clearDeniedBreaksMethod = breakDenyTrackerClass.getMethod("clear");
            return true;
        } catch (Throwable t) {
            return false;
        }
    }

    private static synchronized boolean resolve() {
        if (available) {
            return true;
        }

        long now = System.currentTimeMillis();
        if (now < nextResolveAt) {
            return false;
        }
        nextResolveAt = now + RESOLVE_RETRY_MS;

        try {
            apiClass = Class.forName("baritone.api.BaritoneAPI");
            getProviderMethod = apiClass.getMethod("getProvider");
            getSettingsMethod = apiClass.getMethod("getSettings");

            Object provider = getProviderMethod.invoke(null);
            getPrimaryBaritoneMethod = provider.getClass().getMethod("getPrimaryBaritone");

            Object primary = getPrimaryBaritoneMethod.invoke(provider);
            getCommandManagerMethod = primary.getClass().getMethod("getCommandManager");
            Object commandManager = getCommandManagerMethod.invoke(primary);
            executeCommandMethod = commandManager.getClass().getMethod("execute", String.class);

            getPathingBehaviorMethod = primary.getClass().getMethod("getPathingBehavior");
            Object pathingBehavior = getPathingBehaviorMethod.invoke(primary);
            cancelEverythingMethod = pathingBehavior.getClass().getMethod("cancelEverything");
            secretInternalSegmentCancelMethod = pathingBehavior.getClass().getMethod("secretInternalSegmentCancel");

            available = true;
            if (!loggedAvailable) {
                Nexis.LOGGER.info("[BaritoneBridge] Baritone API resolved");
                loggedAvailable = true;
            }
            return true;
        } catch (Throwable t) {
            apiClass = null;
            getProviderMethod = null;
            getSettingsMethod = null;
            getPrimaryBaritoneMethod = null;
            getCommandManagerMethod = null;
            executeCommandMethod = null;
            getPathingBehaviorMethod = null;
            cancelEverythingMethod = null;
            secretInternalSegmentCancelMethod = null;

            if (!loggedFailure) {
                Nexis.LOGGER.info("[BaritoneBridge] Baritone API is not available yet");
                loggedFailure = true;
            }
            return false;
        }
    }
}
