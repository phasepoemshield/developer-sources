package ru.pulse;

import java.awt.Desktop;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import lombok.Generated;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.session.Session;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pulse.auth.DeviceAuthClient;
import pulse.auth.TokenStorage;
import pulse.auth.UserInfo;
import pulse.config.LocalConfigManager;
import pulse.gui.core.ClickGuiKeyBinding;
import pulse.gui.core.PulseClickGuiScreen;
import pulse.hud.core.HudServiceRegistry;
import pulse.module.ModuleRegistry;
import pulse.player.PulsePlayerTracker;
import pulse.render.Renderer2D;
import pulse.render.Renderer2DImpl;
import pulse.render.icons.IconTextureRegistry;
import pulse.render.shader.ShaderLibrary;

public class Pulse implements Runnable, ThreadFactory, ModInitializer {
    public static final String CLIENT_VERSION = "2.0.1";
    private String backendUrl;
    private Renderer2D render;
    private Screen clickGui;
    private static final Pulse instance = new Pulse();
    private static UserInfo userInfo = null;
    private static String cachedBackendUrl = null;
    private static final String[] BACKEND_URLS = {"https://backend4.pulsevisuals.pro", "https://backend.pulsevisuals.pro", "https://backend1.pulsevisuals.pro", "https://backend2.pulsevisuals.pro", "https://backend3.pulsevisuals.pro"};
    private static final String[] API_URLS = {"https://api.pulsevisuals.pro/api", "https://euapi.pulsevisuals.pro/api"};
    private static final String[] MAIN_URLS = {"https://pulsevisuals.pro", "https://eu.pulsevisuals.pro"};
    public static final String CLIENT_NAME = "pulse";
    private static final Logger LOGGER = LogManager.getLogger(CLIENT_NAME);
    private static int currentBackendIndex = 0;
    private static boolean updateScreenShown = false;
    private String pendingTokenToSave = null;
    private boolean init = false;
    private final AtomicBoolean authInProgress = new AtomicBoolean(false);

    public void onInitialize() {
        PulsePlayerTracker.get().init();
        ClickGuiKeyBinding.register();
        ClientPlayConnectionEvents.DISCONNECT.register((ClientPlayNetworkHandlerVar, MinecraftClientVar) -> {
            LOGGER.info("[Pulse] Disconnect — saving config");
            LocalConfigManager.get().flushSaveNow("disconnect");
        });
        ClientLifecycleEvents.CLIENT_STOPPING.register(MinecraftClientVar2 -> {
            LOGGER.info("[Pulse] Client stop — saving config");
            LocalConfigManager.get().flushSaveNow("client-stop");
        });
        LOGGER.info("Pulse initialized without native protection");
    }

    @Override
    public void run() {
    }

    @Override
    public Thread newThread(Runnable runnable) {
        return null;
    }

    private static void unlockCryptoPolicy() {
    }

    public void init() {
        IconTextureRegistry.load();
        ShaderLibrary.loadDefaultShaders();
        this.render = new Renderer2DImpl();
        HudServiceRegistry.a();
        ModuleRegistry.init();
        LOGGER.info("[Pulse] Loading config (dir: {})", LocalConfigManager.get().configDirectory());
        try {
            LocalConfigManager.get().init();
            LOGGER.info("[Pulse] Config load finished");
        } catch (Exception e) {
            LOGGER.warn("[Pulse] Config load failed", e);
        }
        this.clickGui = new PulseClickGuiScreen();
        this.init = true;
        LOGGER.info("Pulse Java GUI initialized");
    }

    private String loadTokenFromAnySource() {
        String token = TokenStorage.c();
        if (token != null && !token.isEmpty()) {
            return token;
        }
        String jarToken = loadTokenFromJar();
        if (jarToken != null && !jarToken.isEmpty()) {
            return jarToken;
        }
        return null;
    }

    private String loadTokenFromJar() {
        return "";
    }

    public static void showMessage(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        LOGGER.info("[Pulse] {}", str);
        Runnable show = () -> {
            try {
                JOptionPane.showMessageDialog(null, str, "Pulse", JOptionPane.INFORMATION_MESSAGE);
            } catch (Throwable th) {
                LOGGER.warn("[Pulse] Failed to show message dialog", th);
            }
        };
        if (SwingUtilities.isEventDispatchThread()) {
            show.run();
        } else {
            SwingUtilities.invokeLater(show);
        }
    }

    public static void showAntivirusWarning() {
    }

    public static void showSystemMessage() {
    }

    public static void openYouTube() {
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/@pulsevisuals"));
            }
        } catch (Exception e) {
            LOGGER.warn("[Pulse] Failed to open YouTube", e);
        }
    }

    public static void checkAndShowUpdate(Screen ScreenVar) {
        if (updateScreenShown) {
            return;
        }
        updateScreenShown = true;
        instance.startSessionFromTitleScreen();
    }

    private void startSessionFromTitleScreen() {
        String token = loadTokenFromAnySource();
        if (token != null && !token.isEmpty()) {
            LOGGER.info("[Pulse] Token loaded from storage");
            applyLocalSession(token);
            flushPendingToken();
            return;
        }
        if (!this.authInProgress.compareAndSet(false, true)) {
            return;
        }
        Thread authThread = new Thread(() -> {
            try {
                LOGGER.info("[Pulse] No token found — starting device auth");
                DeviceAuthClient deviceAuthClient = new DeviceAuthClient();
                String newToken = deviceAuthClient.a();
                if (newToken == null || newToken.isEmpty()) {
                    LOGGER.warn("[Pulse] Device auth did not return a token");
                    applyLocalSession("offline");
                    return;
                }
                this.pendingTokenToSave = newToken;
                try {
                    TokenStorage.a(newToken);
                    this.pendingTokenToSave = null;
                    LOGGER.info("[Pulse] Token saved after device auth");
                } catch (Exception e) {
                    LOGGER.error("[Pulse] Failed to save token", e);
                }
                applyLocalSession(newToken);
            } catch (Exception e) {
                LOGGER.error("[Pulse] Device auth failed", e);
                applyLocalSession("offline");
            } finally {
                this.authInProgress.set(false);
            }
        }, "pulse-device-auth");
        authThread.setDaemon(true);
        authThread.start();
    }

    private void flushPendingToken() {
        if (this.pendingTokenToSave == null || this.pendingTokenToSave.isEmpty()) {
            return;
        }
        try {
            TokenStorage.a(this.pendingTokenToSave);
            LOGGER.info("[Pulse] Pending token saved");
            this.pendingTokenToSave = null;
        } catch (Exception e) {
            LOGGER.error("[Pulse] Failed to save pending token", e);
        }
    }

    private static void applyLocalSession(String token) {
        if (getUserInfo() != null) {
            return;
        }
        String username = "Local";
        try {
            MinecraftClient client = MinecraftClient.getInstance();
            if (client != null) {
                Session session = client.getSession();
                if (session != null && session.getUsername() != null && !session.getUsername().isEmpty()) {
                    username = session.getUsername();
                }
            }
        } catch (Throwable th) {
            // Minecraft may not be fully ready; keep Local
        }
        int userId = token == null ? 0 : Math.floorMod(token.hashCode(), 1_000_000_000);
        String sessionId = token == null || token.isEmpty() || "offline".equals(token)
            ? "local"
            : (token.length() > 32 ? token.substring(0, 32) : token);
        setUserInfo(new UserInfo(userId, username, sessionId, "user"));
        LOGGER.info("[Pulse] Local session ready: {}", getUserInfo());
    }

    public static void runtimeBrandingTick() {
    }

    public static String getMainUrl() {
        for (String str : MAIN_URLS) {
            if (isUrlAccessible(str)) {
                return str;
            }
        }
        return MAIN_URLS[0];
    }

    public static String getBackendUrl() {
        return cachedBackendUrl != null ? cachedBackendUrl : BACKEND_URLS[currentBackendIndex];
    }

    public static String getDirectApiUrl() {
        for (String str : API_URLS) {
            if (isUrlAccessible(str + "/auth/device/poll?state=test")) {
                return str;
            }
        }
        return API_URLS[0];
    }

    private static boolean isUrlAccessible(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) new URL(str).openConnection();
            connection.setInstanceFollowRedirects(true);
            connection.setConnectTimeout(3000);
            connection.setReadTimeout(3000);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Pulse/" + CLIENT_VERSION);
            int code = connection.getResponseCode();
            return code >= 200 && code < 500;
        } catch (Exception e) {
            return false;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    public Renderer2D getRender() {
        return this.render;
    }

    public Screen getClickGui() {
        return this.clickGui;
    }

    @Generated
    public static Pulse getInstance() {
        return instance;
    }

    @Generated
    public static Logger getLOGGER() {
        return LOGGER;
    }

    @Generated
    public static UserInfo getUserInfo() {
        return userInfo;
    }

    @Generated
    public static void setUserInfo(UserInfo userInfo2) {
        userInfo = userInfo2;
    }

    public static String decrypt(String str, String str2, int i, int i2, int i3, int i4) {
        return null;
    }

}
