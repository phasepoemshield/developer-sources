package fun.nexisdlc.mixins.client;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.client.TickEvent;
import fun.nexisdlc.client.utils.DWMApi;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.ui.gui.BaseClickGui;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.util.Window;
import net.minecraft.resource.Resource;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {

    @Shadow
    private Window window;

    private static final Identifier WINDOW_ICON_ID = Identifier.of("nexis", "icon.png");

    @Unique
    private Boolean nexis$lastWindowDark = null;

    @Unique
    private boolean nexis$customWindowIconShown = false;

    @Unique
    private ByteBuffer nexis$cachedIconPixels = null;

    @Unique
    private int nexis$cachedIconW = -1;

    @Unique
    private int nexis$cachedIconH = -1;

    @Unique
    private static boolean rightShiftWasDown = false;

    @Unique
    private static ScheduledExecutorService logCopyExecutor;

    @Unique
    private boolean nexis$wasInWorld = false;

    @Unique
    private boolean nexis$windowInitialized = false;

    @Unique
    private String nexis$cachedWindowTitle = "";

    @Unique
    private boolean nexis$lastUnhookedState = false;

    @Unique
    private void nexis$applyWindowFrameTheme() {
        if (window == null) {
            return;
        }

        boolean shouldUseDark = !ClientContainer.isHide();

        if (nexis$lastWindowDark != null && shouldUseDark == nexis$lastWindowDark) {
            return;
        }

        nexis$lastWindowDark = shouldUseDark;

        long handle = window.getHandle();
        if (handle == 0L) {
            return;
        }

        if (shouldUseDark) {
            DWMApi.setDarkMode(handle);
        } else {
            DWMApi.setLightMode(handle);
        }
    }

    @Inject(method = "<init>", at = @At("TAIL"))
    public void onInit(CallbackInfo ci) {
        nexis$applyWindowFrameTheme();
        nexis$windowInitialized = true;
        nexis$updateWindowIcon();
        nexis$updateLogCopying();
    }

    @Inject(method = "updateWindowTitle", at = @At("HEAD"), cancellable = true)
    private void onUpdateWindowTitle(CallbackInfo ci) {
        if (!nexis$windowInitialized) {
            nexis$windowInitialized = true;
        }

        if (window != null) {
            nexis$updateWindowTitle();
            nexis$updateWindowIcon();
            ci.cancel();
        }
    }

    @Unique
    private void nexis$updateWindowTitle() {
        if (window == null) return;

        String newTitle;

        if (ClientContainer.isHide()) {
            newTitle = "Minecraft 1.21.11 - In server";
        } else {
            newTitle = String.format("%s • %s", "Nexis Recode", "Билд от " + ClientContainer.getBuildDate());
        }

        if (!newTitle.equals(nexis$cachedWindowTitle)) {
            nexis$cachedWindowTitle = newTitle;

            try {
                GLFW.glfwSetWindowTitle(window.getHandle(), newTitle);
            } catch (Exception ignored) {
            }
        }
    }

    @Unique
    private void nexis$updateWindowIcon() {
        if (window == null) return;

        long handle = window.getHandle();
        if (handle == 0L) return;

        boolean hidden = ClientContainer.isHide();

        if (hidden) {
            if (nexis$customWindowIconShown) {
                nexis$restoreVanillaWindowIcon(handle);
                nexis$customWindowIconShown = false;
            }

            return;
        }

        if (nexis$customWindowIconShown) {
            return;
        }

        nexis$setWindowIcon(handle);
        nexis$customWindowIconShown = true;
    }

    @Unique
    private void nexis$restoreVanillaWindowIcon(long windowHandle) {
        try {
            GLFW.glfwSetWindowIcon(windowHandle, (GLFWImage.Buffer) null);
        } catch (Exception e) {
            Nexis.LOGGER.warn("Failed to restore vanilla window icon", e);
        }
    }

    @Unique
    private void nexis$ensureIconCached() {
        if (nexis$cachedIconPixels != null) return;

        try (MemoryStack stack = MemoryStack.stackPush()) {
            IntBuffer width = stack.mallocInt(1);
            IntBuffer height = stack.mallocInt(1);
            IntBuffer channels = stack.mallocInt(1);

            ByteBuffer imageBuffer = nexis$loadIconResource(WINDOW_ICON_ID);
            if (imageBuffer == null) return;

            ByteBuffer icon = STBImage.stbi_load_from_memory(imageBuffer, width, height, channels, 4);

            if (icon != null) {
                nexis$cachedIconPixels = icon;
                nexis$cachedIconW = width.get(0);
                nexis$cachedIconH = height.get(0);
            }
        } catch (Exception e) {
            Nexis.LOGGER.warn("Failed to cache window icon", e);
        }
    }

    @Unique
    private void nexis$setWindowIcon(long windowHandle) {
        nexis$ensureIconCached();

        if (nexis$cachedIconPixels == null) return;

        try (GLFWImage.Buffer icons = GLFWImage.malloc(1)) {
            icons.position(0)
                    .width(nexis$cachedIconW)
                    .height(nexis$cachedIconH)
                    .pixels(nexis$cachedIconPixels);

            GLFW.glfwSetWindowIcon(windowHandle, icons);
        } catch (Exception e) {
            Nexis.LOGGER.warn("Failed to set window icon", e);
        }
    }

    @Unique
    private ByteBuffer nexis$loadIconResource(Identifier iconPath) {
        try {
            try (InputStream stream = nexis$openIconStream(iconPath)) {
                return nexis$readFully(stream);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Unique
    private static InputStream nexis$openIconStream(Identifier iconPath) throws IOException {
        MinecraftClient client = MinecraftClient.getInstance();
        ResourceManager manager = client != null ? client.getResourceManager() : null;

        if (manager != null) {
            Optional<Resource> resource = manager.getResource(iconPath);

            if (resource.isPresent()) {
                return resource.get().getInputStream();
            }
        }

        InputStream fallback = MinecraftClientMixin.class.getResourceAsStream(
                "/assets/" + iconPath.getNamespace() + "/" + iconPath.getPath()
        );

        if (fallback != null) {
            return fallback;
        }

        throw new IOException("Icon resource not found: " + iconPath);
    }

    @Unique
    private static ByteBuffer nexis$readFully(InputStream stream) throws IOException {
        int available = stream.available();

        if (available <= 0) {
            available = 64 * 1024;
        }

        ByteBuffer buffer = ByteBuffer.allocateDirect(available);
        byte[] temp = new byte[8192];

        int bytesRead;

        while ((bytesRead = stream.read(temp)) != -1) {
            if (buffer.remaining() < bytesRead) {
                ByteBuffer newBuffer = ByteBuffer.allocateDirect(buffer.capacity() * 2);
                buffer.flip();
                newBuffer.put(buffer);
                buffer = newBuffer;
            }

            buffer.put(temp, 0, bytesRead);
        }

        buffer.flip();
        return buffer;
    }

    @Unique
    private static void nexis$updateLogCopying() {
        if (logCopyExecutor != null && !logCopyExecutor.isShutdown()) {
            logCopyExecutor.shutdownNow();
        }

        if (!ClientContainer.isHide()) {
            return;
        }

        var clientHide = Nexis.getFunctionManager() != null
                ? Nexis.getFunctionManager().getClientHide()
                : null;

        if (clientHide == null) {
            return;
        }

        String customLogDir = clientHide.pathToMinecraft.get() + "/logs";

        File logDir = new File(customLogDir);
        File sourceLog = new File(MinecraftClient.getInstance().runDirectory, "logs/latest.log");
        File targetLog = new File(logDir, "latest.log");

        if (!logDir.exists() || !logDir.isDirectory()) {
            return;
        }

        nexis$clearNexisLogs();

        logCopyExecutor = Executors.newSingleThreadScheduledExecutor();

        logCopyExecutor.scheduleAtFixedRate(() -> {
            try {
                if (!sourceLog.exists()) {
                    return;
                }

                String filteredContent = Files.readString(sourceLog.toPath(), StandardCharsets.UTF_8)
                        .lines()
                        .filter(line -> !line.toLowerCase().contains("nexis"))
                        .reduce((left, right) -> left + System.lineSeparator() + right)
                        .orElse("");

                try (FileWriter writer = new FileWriter(targetLog, true)) {
                    writer.write(filteredContent);
                }
            } catch (Exception e) {
                Nexis.LOGGER.warn("Failed to mirror latest.log", e);
            }
        }, 0, 1, TimeUnit.SECONDS);
    }

    @Unique
    private static void nexis$clearNexisLogs() {
        try {
            Path gameDir = MinecraftClient.getInstance().runDirectory.toPath();
            Path rotationLogsDir = gameDir.resolve("nexis_rotation_logs");

            if (Files.exists(rotationLogsDir)) {
                try (DirectoryStream<Path> stream = Files.newDirectoryStream(rotationLogsDir)) {
                    for (Path entry : stream) {
                        try {
                            if (Files.isDirectory(entry)) {
                                try (DirectoryStream<Path> subStream = Files.newDirectoryStream(entry)) {
                                    for (Path subEntry : subStream) {
                                        Files.deleteIfExists(subEntry);
                                    }
                                }

                                Files.deleteIfExists(entry);
                            } else {
                                Files.deleteIfExists(entry);
                            }
                        } catch (IOException ignored) {
                        }
                    }
                }
            }
        } catch (Exception ignored) {
        }
    }

    @Inject(method = "tick", at = @At("HEAD"))
    private void onTick(CallbackInfo ci) {
        MinecraftClient mc = MinecraftClient.getInstance();

        boolean currentState = ClientContainer.isHide();

        if (currentState != nexis$lastUnhookedState) {
            nexis$lastUnhookedState = currentState;

            nexis$applyWindowFrameTheme();
            nexis$updateLogCopying();

            if (window != null) {
                nexis$cachedWindowTitle = "";
                nexis$updateWindowTitle();
                nexis$updateWindowIcon();
            }
        }

        boolean inWorld = mc != null && mc.world != null && mc.player != null;

        if (inWorld) {
            NexisClient.getEventBus().post(new TickEvent());
        } else if (nexis$wasInWorld) {
            PlayerUtils.resetControlledKeys();
        }

        nexis$wasInWorld = inWorld;

        if (mc.currentScreen == null && mc.getWindow() != null && !ClientContainer.isHide()) {
            long handle = mc.getWindow().getHandle();
            boolean rightShiftDown = GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_RIGHT_SHIFT) == GLFW.GLFW_PRESS;

            if (rightShiftDown && !rightShiftWasDown) {
                BaseClickGui.open();
            }

            rightShiftWasDown = rightShiftDown;
        } else if (mc.getWindow() != null) {
            long handle = mc.getWindow().getHandle();
            rightShiftWasDown = GLFW.glfwGetKey(handle, GLFW.GLFW_KEY_RIGHT_SHIFT) == GLFW.GLFW_PRESS;
        }
    }

    @Inject(
            method = "render",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gl/Framebuffer;blitToScreen()V",
                    shift = At.Shift.AFTER
            )
    )
    private void afterBlit(boolean tick, CallbackInfo ci) {
        if (!NexisClient.ensureRendererInitialized()) return;

        var instance = NexisClient.getInstance();
        if (instance == null || instance.renderer == null) return;

        MinecraftClient mc = MinecraftClient.getInstance();
        Framebuffer framebuffer = mc.getFramebuffer();

        if (framebuffer == null) return;

        int width = mc.getWindow().getFramebufferWidth();
        int height = mc.getWindow().getFramebufferHeight();

        if (width <= 0 || height <= 0) return;

        int sourceTexture = 0;
        var colorAttachment = framebuffer.getColorAttachment();

        if (colorAttachment instanceof GlTexture glTexture) {
            sourceTexture = glTexture.getGlId();
        }

        if (sourceTexture == 0) return;

        var renderer = instance.renderer;

        renderer.setLazyBlurSource(sourceTexture, width, height, 8f);
        renderer.begin(width, height);

        try {
            NexisClient.renderOverlayEvents(renderer, NexisClient.getUiFont(), width, height);
        } finally {
            renderer.end();
        }
    }
}