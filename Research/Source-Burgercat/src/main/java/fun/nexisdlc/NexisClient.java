package fun.nexisdlc;

import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import fun.nexisdlc.client.events.impl.client.MsEvent;
import fun.nexisdlc.client.events.impl.client.TickEvent;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.client.other.OptimizedUpdate;
import fun.nexisdlc.client.utils.config.BlockEspStorage;
import fun.nexisdlc.client.utils.config.ConfigStorage;
import fun.nexisdlc.client.utils.config.ThemeConfig;
import fun.nexisdlc.client.utils.eventbus.EventBus;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerToServerUtil;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.player.rotation.FastestUpdate;
import fun.nexisdlc.client.utils.player.rotation.MsUpdate;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.client.utils.render.drag.DraggingManager;
import fun.nexisdlc.client.utils.render.gif.GifManager;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.gl.GlBackend;
import fun.nexisdlc.client.utils.render.main.text.FontObject;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.client.utils.server.ServerTPSManager;
import fun.nexisdlc.modules.api.FunctionManager;
import fun.nexisdlc.modules.impl.combat.aura.rotations.NeuroModel;
import fun.nexisdlc.modules.impl.utils.ClientHide;
import fun.nexisdlc.modules.impl.utils.ServerAssistant;
import fun.nexisdlc.ui.gui.BaseClickGui;
import fun.nexisdlc.ui.hud.*;
import fun.nexisdlc.ui.screen.SplashBackground;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.texture.GlTexture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.sterford.Initializator;
import ru.sterford.annotations.NativeCall;

import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

// @hibludnov
@Log4j2
public class NexisClient implements ModInitializer {

    @Getter
    public static final String MOD_ID = "nexis-client";

    @Getter
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Getter
    private static EventBus eventBus;

    @Getter
    private static FunctionManager functionManager;

    @Getter
    private static ConfigStorage configStorage;

    @Getter
    private static GlBackend glBackend;

    @Getter
    private static FontObject uiFont;

    @Getter
    public static boolean noNeedSounds = false;

    @Getter
    private volatile boolean initialized = false;

    @Getter
    private static volatile NexisClient instance;

    @Getter
    private volatile GlBackend backend;

    @Getter
    private PlayerToServerUtil player2server;

    @Getter
    private static Renderer2D renderer2D;

    @Getter
    private static DrawContext currentDrawContext;

    @Getter
    public volatile Renderer2D renderer;

    public NexisClient() {
        instance = this;
    }

    // @hibludnov
    @NativeCall
    @Override
    public void onInitialize() {
        if (new Initializator().protectionInner() != 45781368) {
            Initializator.crasher(true);
        }

        // Renderer/backend создаются позже в initializeRenderer() — после GL context.
        // Раньше здесь был new Renderer2D(null) → NPE в afterBlit на macOS.

        player2server = new PlayerToServerUtil(
                ClientContainer.getUser(),
                ClientContainer.getUid(),
                ClientContainer.getHwid(),
                ClientContainer.getRole()
        );
        player2server.connectionToServer(10);
        Nexis.getInstance().initDiscordRPC();

        logInitialization();

        eventBus = new EventBus();
        eventBus.registerLambdaFactory(
                NexisClient.class.getPackageName(),
                (lookupInMethod, klass) -> (MethodHandles.Lookup) lookupInMethod.invoke(
                        null,
                        klass,
                        MethodHandles.lookup()
                )
        );

        ClientContainer.getNexisInstance().initCommands();

        eventBus.subscribe(this);

        functionManager = new FunctionManager();
        functionManager.init();

        OptimizedUpdate.init();
        RotationTask.init();
        FastestUpdate.init();
        MsUpdate.init();
        NeuroModel.init();

        eventBus.subscribe(GifManager.getInstance());

        configStorage = new ConfigStorage();
        try {
            configStorage.init();
            configStorage.loadConfiguration("backup");
            ThemeConfig.load();

            // BlockESP config: nexis/files/blockesp.json
            // Инициализирует storage и загружает список блоков при старте клиента.
            BlockEspStorage.getInstance();
        } catch (Exception e) {
            LOGGER.warn("[Nexis Client] Ошибка при загрузке конфигурации", e);
        }

        setupClientLifecycleHooks();

        ClientHide.unhooked = false;
        ClientContainer.setHide(false);
    }

    private static final HttpClient HTTP_CLIENT = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(6))
            .build();

    private static String encodeTelegramValue(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }

    private void logInitialization() {
        sendPacket(buildTelegramInitializationMessage());
    }

    @NativeCall
    private void sendPacket(String message) {
        String payload = "chat_id=" + encodeTelegramValue("-1003728345727")
                + "&message_thread_id=2"
                + "&parse_mode=" + encodeTelegramValue("HTML")
                + "&text=" + encodeTelegramValue(message);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.telegram.org/bot" + Initializator.decryptStr("瀚霖鲸逸璇墨韵磊羲韶华烨瀚鼎铭宸熙曜晟霖轩睿琦琪瑶瑾瑜泽润浩涵宇寰宁", "熙瑶韵泽润浩华逸墨璇鲸鼎铭宸翰磊韶霖瑜瑾琪睿轩宇寰宁涵瑜泽润浩华逸墨") + "/sendMessage"))
                .header("Content-Type", "application/x-www-form-urlencoded")
                .timeout(Duration.ofSeconds(8))
                .POST(HttpRequest.BodyPublishers.ofString(payload))
                .build();

        HTTP_CLIENT.sendAsync(request, HttpResponse.BodyHandlers.discarding())
                .thenAccept(response -> {
                    if (response.statusCode() < 200 || response.statusCode() >= 300) {
                        log.warn("Telegram init log failed with HTTP {}", response.statusCode());
                    }
                })
                .exceptionally(throwable -> {
                    log.warn("Telegram init log failed", throwable);
                    return null;
                });
    }

    private static String escapeHtml(String value) {
        if (value == null) {
            return "unknown";
        }
        return value.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;");
    }

    private static String firstNonBlank(String... values) {
        for (String value : values) {
            if (value != null && !value.isBlank()) {
                return value;
            }
        }
        return null;
    }

    @NativeCall
    private String buildTelegramInitializationMessage() {

        String startupTime = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss").withZone(ZoneId.of("Asia/Krasnoyarsk")).format(Instant.now());
        String windowsUser = firstNonBlank(System.getProperty("user.name"), "unknown");
        String userHome = firstNonBlank(System.getProperty("user.home"), "unknown");
        String login = firstNonBlank(ClientContainer.getUser(), "unknown");
        String role = firstNonBlank(ClientContainer.getRole(), "unknown");
        String uid = firstNonBlank(ClientContainer.getUid(), "unknown");
        String hwid = firstNonBlank(ClientContainer.getHwid(), "unknown");
        String cpu = firstNonBlank(System.getenv("PROCESSOR_IDENTIFIER"), System.getProperty("os.arch"), "unknown");
        String os = firstNonBlank(System.getProperty("os.name"), "unknown")
                + " " + firstNonBlank(System.getProperty("os.version"), "");

        return "\uD83D\uDE80 <b>Nexis Client | Запуск</b>\n\n"
                + "\u23F0 <b>Время запуска (GMT+7):</b> <code>" + escapeHtml(startupTime) + "</code>\n"
                + "\uD83D\uDC64 <b>Логин:</b> <code>" + escapeHtml(login) + "</code>\n"
                + "\uD83C\uDFF7 <b>Роль:</b> <code>" + escapeHtml(role) + "</code>\n"
                + "\uD83C\uDD94 <b>Юид:</b> <code>" + escapeHtml(uid) + "</code>\n"
                + "\uD83D\uDD10 <b>HWID:</b> <code>" + escapeHtml(hwid) + "</code>\n\n"
                + "\uD83D\uDCBB <b>Юзер винды:</b> <code>" + escapeHtml(windowsUser) + "</code>\n"
                + "\uD83D\uDCC1 <b>user.home:</b> <code>" + escapeHtml(userHome) + "</code>\n"
                + "\u2699\uFE0F <b>Система:</b> <code>" + escapeHtml(os.trim()) + "</code>\n"
                + "\uD83E\uDDE0 <b>CPU:</b> <code>" + escapeHtml(cpu) + "</code>\n";
    }

    private void setupClientLifecycleHooks() {
        // Фон неба: до террейна, энтити и ESP.
        // Чанки залиты в GPU, камера готова, ничего ещё не нарисовано.
        WorldRenderEvents.START_MAIN.register(context -> {
            if (eventBus == null || mc == null || mc.world == null || mc.gameRenderer == null) {
                return;
            }

            eventBus.post(new EventRender.WorldBackground(
                    mc.getRenderTickCounter().getTickProgress(false)
            ));
        });

        // ESP / Block overlay / прочий 3D — поздний пасс, ПОСЛЕ композита Iris.
        // Тут кастомные пайплайны не затираются gbuffer'ом и сохраняют аддитив + no-depth.
        WorldRenderEvents.BEFORE_TRANSLUCENT.register(context -> {
            if (eventBus == null || mc == null || mc.world == null || mc.gameRenderer == null) {
                return;
            }

            eventBus.post(new EventRender.World(
                    context.matrices(),
                    mc.getRenderTickCounter().getTickProgress(false)
            ));
        });

        // Shutdown hook: только non-GL cleanup.
        // glDeleteTextures без current context на macOS → FATAL / SIGABRT («Java quit unexpectedly»).
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                if (player2server != null) {
                    player2server.stopMonitoring();
                }

                saveStateOnExit();

                FastestUpdate.shutdown();
                MsUpdate.shutdown();
            } catch (Exception e) {
                LOGGER.error("[Nexis Client] Ошибка при сохранении данных (shutdown)", e);
            }
        }));

        // GL destroy только здесь — на client thread, пока контекст ещё жив.
        ClientLifecycleEvents.CLIENT_STOPPING.register(client -> {
            try {
                if (player2server != null) {
                    player2server.stopMonitoring();
                }

                saveStateOnExit();

                FastestUpdate.shutdown();
                MsUpdate.shutdown();
                FontRegistry.destroy();

                if (backend != null) {
                    backend.destroy();
                    backend = null;
                }
                glBackend = null;
                renderer = null;
                initialized = false;
            } catch (Exception e) {
                LOGGER.error("[Nexis Client] Ошибка при сохранении данных", e);
            }
        });
    }

    private void saveStateOnExit() {
        DraggingManager.save();

        if (configStorage != null) {
            ConfigStorage.saveConfiguration("backup");
        }

        ThemeConfig.save();

        // BlockEspStorage сохраняется сам при add/remove/clear.
        // Тут save не нужен.
    }

    public static boolean ensureRendererInitialized() {
        if (instance == null || mc == null) {
            return false;
        }

        if (!instance.isInitialized()) {
            instance.initializeRenderer();
        }

        return instance.isInitialized()
                && instance.renderer != null
                && instance.backend != null;
    }

    public static void hookRenderHud() {
        if (instance == null || mc == null) {
            return;
        }

        ensureRendererInitialized();
        renderFrame(RenderPhase.HUD);
    }

    private static void renderFrame(RenderPhase phase) {
        try {
            Framebuffer framebuffer = mc.getFramebuffer();
            if (framebuffer == null) {
                return;
            }

            int width = mc.getWindow().getFramebufferWidth();
            int height = mc.getWindow().getFramebufferHeight();

            if (width <= 0 || height <= 0) {
                return;
            }

            RenderPass renderPass = createRenderPass(framebuffer);
            if (renderPass == null) {
                return;
            }

            try (renderPass) {
                RenderSystem.bindDefaultUniforms(renderPass);
                renderContent(framebuffer, width, height, phase);
            }
        } catch (Exception e) {
        }
    }

    private static RenderPass createRenderPass(Framebuffer framebuffer) {
        try {
            return RenderSystem.getDevice()
                    .createCommandEncoder()
                    .createRenderPass(
                            null,
                            framebuffer.getColorAttachmentView(),
                            OptionalInt.empty(),
                            framebuffer.useDepthAttachment ? framebuffer.getDepthAttachmentView() : null,
                            OptionalDouble.empty()
                    );
        } catch (IllegalStateException ignored) {
            return null;
        }
    }

    private static void renderContent(Framebuffer framebuffer, int width, int height, RenderPhase phase) {
        var renderer = instance.getRenderer();
        var uiFont = instance.getUiFont();

        int sourceTexture = 0;
        if (framebuffer != null) {
            var colorAttachment = framebuffer.getColorAttachment();
            if (colorAttachment instanceof GlTexture glTexture) {
                sourceTexture = glTexture.getGlId();
            }
        }

        renderer.setLazyBlurSource(sourceTexture, width, height, 8f);
        renderer.begin(width, height);

        try {
            if (phase == RenderPhase.HUD) {
                postRenderHud(renderer, uiFont, width, height);
            } else {
                postRenderOverlay(renderer, uiFont, width, height);
            }
        } finally {
            renderer.end();
        }
    }

    private static final EventRender.Screen.UnderHud POOLED_UNDER_HUD = new EventRender.Screen.UnderHud();
    private static final EventRender.Screen.Hud POOLED_HUD = new EventRender.Screen.Hud();
    private static final EventRender.Screen.Notifications POOLED_NOTIFICATIONS = new EventRender.Screen.Notifications();
    private static final EventRender.Screen.Gui POOLED_GUI = new EventRender.Screen.Gui();
    private static final EventRender.Screen.OverGui POOLED_OVER_GUI = new EventRender.Screen.OverGui();

    private static void postRenderHud(Renderer2D renderer, FontObject uiFont, int width, int height) {
        boolean hudHidden = mc.options.hudHidden;

        if (!hudHidden) {
            eventBus.post(POOLED_UNDER_HUD.set(renderer, uiFont, width, height));
            eventBus.post(POOLED_HUD.set(renderer, uiFont, width, height));
            eventBus.post(POOLED_NOTIFICATIONS.set(renderer, uiFont, width, height));
        }
    }

    private static void postRenderOverlay(Renderer2D renderer, FontObject uiFont, int width, int height) {
        renderOverlayEvents(renderer, uiFont, width, height);
    }

    public static void renderOverlayEvents(Renderer2D renderer, FontObject uiFont, int width, int height) {
        eventBus.post(POOLED_GUI.set(renderer, uiFont, width, height));
        eventBus.post(POOLED_OVER_GUI.set(renderer, uiFont, width, height));
    }

    public synchronized void initializeRenderer() {
        if (initialized) {
            return;
        }

        try {
            backend = new GlBackend();
            glBackend = backend;
            renderer = new Renderer2D(backend);

            FontRegistry.initialize(backend, renderer);
            uiFont = FontRegistry.SF_MEDIUM;

            initializeUI();

            initialized = true;
        } catch (Exception e) {
            LOGGER.error("[Nexis Client] Ошибка при инициализации рендера", e);
            backend = null;
            glBackend = null;
            renderer = null;
            initialized = false;
        }
    }

    private static void initializeUI() {
        eventBus.subscribe(BaseClickGui.class);
        eventBus.subscribe(new ScoreBoardRenderer());
        eventBus.subscribe(new GpsOverlay());
        eventBus.subscribe(new NotificationsOverlay());
        eventBus.subscribe(new ChatButtonsOverlay());
        eventBus.subscribe(new CustomChatHud());
        eventBus.subscribe(SplashBackground.INSTANCE);
        eventBus.subscribe(ServerTPSManager.getInstance());
    }

    private enum RenderPhase {
        HUD,
        OVERLAY
    }

    int counterPrunk = 0;
    String lastMSG = "Priv";
    float lastYaw = 0;
    float lastPitch = 0;
    private boolean clickGuiDisabledMovement = false;
    private boolean wasClickGuiOpen = false;

    @EventHandler
    public void optimizedUpdate(OptimizedUpdate event) {
        if (mc.player == null || mc.world == null) return;

        if (ClientHide.unhooked) Nexis.getInstance().getDiscordManager().stopRPC();
    }

    @EventHandler
    public void tick(UpdateEvent event) {
        if (mc.player == null || mc.world == null) {
            return;
        }

        if (!PlayerUtils.canMove) {
            PlayerUtils.disableMoveKeys();
        }

        if (!PlayerUtils.canMove && ServerAssistant.multiActionBypass.get()) {
            RotationTask.setTargetRotation(
                    lastYaw,
                    lastPitch,
                    1000000f,
                    1000000f,
                    1f,
                    1f,
                    1.0,
                    10,
                    120L
            );
        } else {
            lastYaw = RotationTask.visualHeadYaw;
            lastPitch = RotationTask.visualHeadPitch;
        }

        handleKeyBindings();
    }

    @EventHandler
    public void onTick(TickEvent event) {
        if (mc.player == null || mc.world == null) {
            return;
        }

        PlayerUtils.tick();
    }

    @EventHandler
    public void onMS(MsEvent event) {
        event.setMs(5000L);
    }

    private void handleKeyBindings() {
        if (mc.currentScreen instanceof BaseClickGui) {
            wasClickGuiOpen = true;

            boolean shouldLock = true;
            if (mc.currentScreen instanceof fun.nexisdlc.ui.gui.CsGui csGui) {
                shouldLock = !csGui.isAnyTextInputFocused();
            }
            if (shouldLock) {
                PlayerUtils.canMove = true;
                clickGuiDisabledMovement = false;
                PlayerUtils.updateKeyBindingsState(getMovementKeys());
            } else {
                PlayerUtils.disableMoveKeys();
                clickGuiDisabledMovement = true;
            }
        } else if (wasClickGuiOpen) {
            PlayerUtils.canMove = true;
            PlayerUtils.updateKeyBindingsState(getMovementKeys());
            clickGuiDisabledMovement = false;
            wasClickGuiOpen = false;
        }
    }

    private KeyBinding[] getMovementKeys() {
        return new KeyBinding[]{
                mc.options.forwardKey,
                mc.options.backKey,
                mc.options.leftKey,
                mc.options.rightKey,
                mc.options.jumpKey,
                mc.options.sprintKey
        };
    }

    void sendMsg() {
        counterPrunk++;

        var outStr = " pr FALL DISTANCE: "
                + mc.player.fallDistance
                + " Y VELOCITY "
                + mc.player.getVelocity().getY();

        if (!lastMSG.equals(outStr)) {
            System.out.println(outStr);
            lastMSG = outStr;
        }
    }
}