package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.client.EventKey;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.connection.ProxyProcessManager;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BindSetting;
import fun.nexisdlc.modules.api.settings.impl.ButtonSetting;
import fun.nexisdlc.modules.api.settings.impl.StringSetting;
import fun.nexisdlc.ui.screen.unhook.UnHookDualScreen;
import net.minecraft.util.Formatting;
import org.lwjgl.glfw.GLFW;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@FunctionAdd(name = "ProxyServer", alias = "Proxy Server", category = Category.Utilities, needPremium = true, description = "Настройка проксисервера для проксирования на второй майнкрафт")
public class ProxyServer extends Function {
    private static final String DEFAULT_VERSION = "1.21.11";
    private static final String MIN_VERSION = "1.17.1";
    private static final String MAX_VERSION = "1.21.11";
    private static final Path DUAL_PREFS = Path.of(ClientContainer.getName(), "proxyserver", "dual_prefs.properties");

    public final BindSetting dualGuiBind = new BindSetting("Бинд меню", GLFW.GLFW_KEY_RIGHT_CONTROL);
    public final ButtonSetting openDualGui = new ButtonSetting("Открыть меню", () -> mc.setScreen(new UnHookDualScreen(this)));
    public final StringSetting localServerIp = new StringSetting("Локальный IP", "127.0.0.1");
    public final StringSetting localServerPort = new StringSetting("Локальный порт", "25565");
    public final StringSetting targetServerAddress = new StringSetting("Цель", "");
    public final StringSetting targetVersion = new StringSetting("Версия", DEFAULT_VERSION);

    private volatile long lastPositionPushMs;

    public ProxyServer() {
        loadDualPrefs();
        addSettings(openDualGui, dualGuiBind);
    }

    private static volatile boolean shutdownHookAdded;

    @Override
    public void onEnable() {
        super.onEnable();

        startPositionSync();

        if (!shutdownHookAdded) {
            shutdownHookAdded = true;
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                ProxyProcessManager.get().detach();
            }, "ProxyServer-shutdown-detach"));
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();
        stopPositionSync();
    }

    @EventHandler
    public void onKey(EventKey e) {
        if (ClientContainer.isHide()) return;
        if (!isState()) return;
        if (e.getAction() != 1) return;
        if (dualGuiBind.get() == -1) return;
        if (e.getConvertedKey() != dualGuiBind.get()) return;
        mc.setScreen(new UnHookDualScreen(this));
    }

    private void startPositionSync() {
        lastPositionPushMs = 0L;
    }

    private void stopPositionSync() {
        lastPositionPushMs = 0L;
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (!isState()) return;
        if (targetServerAddress.get().trim().isEmpty()) return;
        if (mc == null || mc.player == null || mc.world == null) return;

        long now = System.currentTimeMillis();
        if (now - lastPositionPushMs < 500L) return;
        lastPositionPushMs = now;

        ProxyProcessManager.get().pushMainPosition(
                mc.player.getX(),
                mc.player.getY(),
                mc.player.getZ(),
                mc.player.getYaw(),
                mc.player.getPitch()
        );
    }

    public String applyDualSettings(String localIp, String portRaw, String target, String version) {
        String ip = localIp == null || localIp.isBlank() ? "127.0.0.1" : localIp.trim();
        int port = parsePort(portRaw, -1);
        if (port < 1 || port > 65535) {
            return Formatting.RED + "Порт должен быть в диапазоне 1..65535";
        }

        String v = version == null ? DEFAULT_VERSION : version.trim();
        if (!isVersionInRange(v)) {
            return Formatting.RED + "Версия должна быть в диапазоне " + MIN_VERSION + " .. " + MAX_VERSION;
        }

        localServerIp.set(ip);
        localServerPort.set(String.valueOf(port));
        targetServerAddress.set(target == null ? "" : target.trim());
        targetVersion.set(v);
        saveDualPrefs();

        if (targetServerAddress.get().isEmpty()) {
            return Formatting.GREEN + "Сохранено. Цель пустая, прокси не запущен.";
        }

        return ProxyProcessManager.get().start(localServerIp.get(), port, targetServerAddress.get());
    }

    public String switchControlFromGui() {
        return switchControlTarget();
    }

    public String stopFromGui() {
        return stopProxy();
    }

    public List<String> statusLinesForGui() {
        return getDebugStatusLines();
    }

    public static String setTargetServer(String raw) {
        ProxyServer inst = Nexis.getFunctionManager().getProxyServer();
        if (inst == null) return Formatting.RED + "ProxyServer выключен";

        String target = raw == null ? "" : raw.trim();
        inst.targetServerAddress.set(target);
        if (target.isEmpty()) return Formatting.YELLOW + "Цель очищена.";

        int localPort = parsePort(inst.localServerPort.get(), 25565);
        return ProxyProcessManager.get().start(inst.localServerIp.get(), localPort, target);
    }

    public static String switchControlTarget() {
        return ProxyProcessManager.get().switchControl();
    }

    public static String stopProxy() {
        ProxyProcessManager.get().stop();
        return Formatting.GREEN + "Прокси остановлен.";
    }

    public static List<String> getDebugStatusLines() {
        return new ArrayList<>(ProxyProcessManager.get().getDebugStatusLines());
    }

    private void loadDualPrefs() {
        if (!Files.exists(DUAL_PREFS)) return;

        Properties p = new Properties();
        try (var in = Files.newInputStream(DUAL_PREFS)) {
            p.load(in);
            String port = p.getProperty("port", "").trim();
            if (!port.isEmpty() && parsePort(port, -1) > 0) {
                localServerPort.set(port);
            }
            String version = p.getProperty("version", "").trim();
            if (isVersionInRange(version)) {
                targetVersion.set(version);
            }
        } catch (Exception ignored) {
        }
    }

    private void saveDualPrefs() {
        try {
            Files.createDirectories(DUAL_PREFS.getParent());
            Properties p = new Properties();
            p.setProperty("port", localServerPort.get());
            p.setProperty("version", targetVersion.get());
            try (var out = Files.newOutputStream(DUAL_PREFS)) {
                p.store(out, "ProxyServer Dual GUI");
            }
        } catch (Exception ignored) {
        }
    }

    public static int parsePort(String raw, int fallback) {
        try {
            return Integer.parseInt(raw == null ? "" : raw.trim());
        } catch (Exception e) {
            return fallback;
        }
    }

    private static boolean isVersionInRange(String version) {
        if (version == null || version.isBlank()) return false;
        int[] v = parseVersion(version.trim());
        if (v == null) return false;
        int[] min = parseVersion(MIN_VERSION);
        int[] max = parseVersion(MAX_VERSION);
        return compareVersion(v, min) >= 0 && compareVersion(v, max) <= 0;
    }

    private static int[] parseVersion(String raw) {
        String[] parts = raw.split("\\.");
        if (parts.length != 3) return null;

        int[] out = new int[3];
        try {
            for (int i = 0; i < 3; i++) {
                out[i] = Integer.parseInt(parts[i]);
                if (out[i] < 0) return null;
            }
        } catch (NumberFormatException e) {
            return null;
        }
        return out;
    }

    private static int compareVersion(int[] a, int[] b) {
        for (int i = 0; i < 3; i++) {
            int c = Integer.compare(a[i], b[i]);
            if (c != 0) return c;
        }
        return 0;
    }
}
