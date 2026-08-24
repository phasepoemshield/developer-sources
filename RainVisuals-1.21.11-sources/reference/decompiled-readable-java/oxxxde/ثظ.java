/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.textures.GpuTexture
 *  net.minecraft.client.gl.Framebuffer
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.texture.AbstractTexture
 *  net.minecraft.client.texture.GlTexture
 *  net.minecraft.client.texture.NativeImageBackedTexture
 *  net.minecraft.client.util.BufferAllocator
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.math.Vec3d
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3fc
 *  org.lwjgl.opengl.GL11
 */
package oxxxde;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.GpuTexture;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.Menu3DModule;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotakbaz.rain.ui.menu.MenuScreen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RainRenderLayers;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3fc;
import org.lwjgl.opengl.GL11;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oxxxde.\u0635\u0635;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002?@B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u0003J\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b!\u0010\u0003J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b4\u00103R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b5\u00106R\u001c\u00109\u001a\n 8*\u0004\u0018\u000107078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b;\u00103R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b=\u0010>\u00a8\u0006A"}, d2={"Loxxxde/\u062b\u0638;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onMenuOpened", "", "requestCloseSnapshot", "()Z", "capturePendingFrame", "Loxxxde/\u0634\u062b;", "event", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "onDisable", "Loxxxde/\u0627\u0628;", "createPlacement", "()Lkotakbaz/rain/module/modules/render/Menu3DModule$Placement;", "Lnet/minecraft/class_276;", "target", "copyMenuPanel", "(Lnet/minecraft/class_276;)Z", "", "width", "height", "Lnet/minecraft/class_1043;", "prepareSnapshotTexture", "(II)Lnet/minecraft/class_1043;", "placement", "", "alpha", "renderGhost", "(Lkotakbaz/rain/event/events/Render3DEvent;Lkotakbaz/rain/module/modules/render/Menu3DModule$Placement;F)V", "releaseResources", "seconds", "", "secondsToNanos", "(F)J", "Loxxxde/\u0637\u064f;", "holdTime", "Loxxxde/\u0637\u064f;", "fadeTime", "distance", "pendingPlacement", "Loxxxde/\u0627\u0628;", "Loxxxde/\u062c\u064f;", "ghost", "Loxxxde/\u062c\u064f;", "snapshotTexture", "Lnet/minecraft/class_1043;", "snapshotWidth", "I", "snapshotHeight", "completingClose", "Z", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "logger", "Lorg/slf4j/Logger;", "BUFFER_SIZE", "Lnet/minecraft/class_2960;", "SNAPSHOT_TEXTURE_ID", "Lnet/minecraft/class_2960;", "Placement", "Ghost", "rain-visuals"})
public final class \u062b\u0638
extends Module {
    private static boolean completingClose;
    private static final Logger logger;
    @Nullable
    private static NativeImageBackedTexture snapshotTexture;
    @NotNull
    private static final SliderSetting holdTime;
    private static int snapshotWidth;
    private static final int BUFFER_SIZE = 262144;
    @NotNull
    private static final Identifier SNAPSHOT_TEXTURE_ID;
    @Nullable
    private static Menu3DModule.Ghost ghost;
    private static int snapshotHeight;
    @NotNull
    private static final SliderSetting distance;
    @Nullable
    private static Menu3DModule.Placement pendingPlacement;
    @NotNull
    public static final \u062b\u0638 INSTANCE;
    @NotNull
    private static final SliderSetting fadeTime;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void renderGhost(Render3DEvent event, Menu3DModule.Placement placement, float alpha) {
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Vec3d cameraPos = \u0637\u062b.getPos(\u0637\u062b.getCamera(gameRenderer));
        float halfWidth = placement.getWidth() * 0.5f;
        float halfHeight = placement.getHeight() * 0.5f;
        int colorAlpha = RangesKt.coerceIn(MathKt.roundToInt(alpha * 255.0f), 0, 255);
        RenderLayer layer = RainRenderLayers.getMenu3D(SNAPSHOT_TEXTURE_ID);
        AutoCloseable autoCloseable = (AutoCloseable)new BufferAllocator(262144);
        Throwable throwable = null;
        try {
            BufferAllocator allocator = (BufferAllocator)autoCloseable;
            boolean bl = false;
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)allocator);
            Intrinsics.checkNotNullExpressionValue(immediate, "immediate(...)");
            VertexConsumerProvider.Immediate consumers = immediate;
            VertexConsumer vertexConsumer = consumers.getBuffer(layer);
            Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
            VertexConsumer buffer = vertexConsumer;
            event.getMatrices().push();
            event.getMatrices().translate(placement.getCenter().x - cameraPos.x, placement.getCenter().y - cameraPos.y, placement.getCenter().z - cameraPos.z);
            event.getMatrices().multiply((Quaternionfc)placement.getRotation());
            MatrixStack.Entry entry = event.getMatrices().peek();
            Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
            MatrixStack.Entry pose = entry;
            buffer.vertex(pose, -halfWidth, halfHeight, 0.0f).color(255, 255, 255, colorAlpha).texture(0.0f, 1.0f);
            buffer.vertex(pose, halfWidth, halfHeight, 0.0f).color(255, 255, 255, colorAlpha).texture(1.0f, 1.0f);
            buffer.vertex(pose, halfWidth, -halfHeight, 0.0f).color(255, 255, 255, colorAlpha).texture(1.0f, 0.0f);
            buffer.vertex(pose, -halfWidth, -halfHeight, 0.0f).color(255, 255, 255, colorAlpha).texture(0.0f, 0.0f);
            event.getMatrices().pop();
            VertexConsumerProvider.Immediate immediate2 = consumers;
            Intrinsics.checkNotNull(layer);
            RenderLayer renderLayer = layer;
            boolean bl2 = false;
            immediate2.draw(renderLayer);
            Unit unit = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            AutoCloseableKt.closeFinally(autoCloseable, throwable);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        void var3_3;
        Menu3DModule.Ghost currentGhost;
        block6: {
            block5: {
                Intrinsics.checkNotNullParameter(event, "event");
                Menu3DModule.Ghost ghost = \u062b\u0638.ghost;
                if (ghost == null) {
                    return;
                }
                currentGhost = ghost;
                if (\u0636\u0643.getMc().world != currentGhost.getPlacement().getLevel()) break block5;
                if (snapshotTexture != null) break block6;
            }
            ghost = null;
            return;
        }
        float alpha = currentGhost.alpha(System.nanoTime());
        if (alpha <= 0.0f) {
            ghost = null;
            return;
        }
        this.renderGhost(event, currentGhost.getPlacement(), (float)var3_3);
    }

    private final void releaseResources() {
        NativeImageBackedTexture nativeImageBackedTexture = snapshotTexture;
        if (nativeImageBackedTexture != null) {
            NativeImageBackedTexture it = nativeImageBackedTexture;
            boolean bl = false;
            \u0636\u0643.getMc().getTextureManager().destroyTexture(SNAPSHOT_TEXTURE_ID);
        }
        snapshotTexture = null;
        snapshotWidth = 0;
        snapshotHeight = 0;
    }

    private final long secondsToNanos(float seconds) {
        return RangesKt.coerceAtLeast((long)(RangesKt.coerceAtLeast(seconds, 0.0f) * (float)1000000000L), 1L);
    }

    public final void onMenuOpened() {
        pendingPlacement = null;
        ghost = null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void capturePendingFrame() {
        Menu3DModule.Placement placement;
        block21: {
            block20: {
                Menu3DModule.Placement placement2 = pendingPlacement;
                if (placement2 == null) {
                    return;
                }
                placement = placement2;
                if (!this.isEnabled()) break block20;
                if (\u0635\u0635.INSTANCE.getCustomScreen() == MenuScreen.INSTANCE) break block21;
            }
            pendingPlacement = null;
            return;
        }
        ChromaRenderer.FramebufferState framebufferState = ChromaRenderer.captureFramebufferState();
        boolean captured = false;
        try {
            ChromaRenderer.bindMainFramebuffer();
            Framebuffer framebuffer = \u0636\u0643.getMc().getFramebuffer();
            Intrinsics.checkNotNullExpressionValue(framebuffer, "getMainRenderTarget(...)");
            captured = this.copyMenuPanel(framebuffer);
        }
        catch (Exception error) {
            void var4_5;
            logger.error("Unable to capture 3D menu snapshot", (Throwable)var4_5);
            return;
        }
        ChromaRenderer.restoreFramebufferState(framebufferState);
        pendingPlacement = null;
        if (captured) {
            ghost = new Menu3DModule.Ghost(placement, System.nanoTime(), this.secondsToNanos(((Number)holdTime.getValue()).floatValue()), this.secondsToNanos(((Number)fadeTime.getValue()).floatValue()));
        }
        completingClose = true;
        try {
            MenuScreen.INSTANCE.close();
            if (captured && \u0635\u0635.INSTANCE.getCustomScreen() == MenuScreen.INSTANCE) {
                \u0635\u0635.INSTANCE.setCustomScreen(null);
            }
        }
        catch (Throwable throwable) {
            completingClose = false;
            throw error;
        }
        completingClose = false;
        return;
        finally {
            ChromaRenderer.restoreFramebufferState(framebufferState);
            pendingPlacement = null;
            completingClose = true;
            try {
                MenuScreen.INSTANCE.close();
            }
            finally {
                completingClose = false;
            }
        }
    }

    static {
        INSTANCE = new \u062b\u0638();
        holdTime = Module.slider$default(INSTANCE, "\u0412\u0440\u0435\u043c\u044f \u043f\u043e\u043a\u0430\u0437\u0430", 2.5f, 0.5f, 5.0f, 0.1f, null, 32, null);
        fadeTime = Module.slider$default(INSTANCE, "\u0412\u0440\u0435\u043c\u044f \u0437\u0430\u0442\u0443\u0445\u0430\u043d\u0438\u044f", 1.0f, 0.25f, 3.0f, 0.05f, null, 32, null);
        distance = Module.slider$default(INSTANCE, "\u0414\u0438\u0441\u0442\u0430\u043d\u0446\u0438\u044f", 2.0f, 1.0f, 4.0f, 0.1f, null, 32, null);
        logger = LoggerFactory.getLogger("Rain 3D Menu");
        Identifier identifier = Identifier.of((String)"rain", (String)"menu_3d_snapshot");
        Intrinsics.checkNotNullExpressionValue(identifier, "fromNamespaceAndPath(...)");
        SNAPSHOT_TEXTURE_ID = identifier;
    }

    /*
     * WARNING - void declaration
     */
    private final NativeImageBackedTexture prepareSnapshotTexture(int width, int height) {
        void var2_2;
        NativeImageBackedTexture nativeImageBackedTexture;
        NativeImageBackedTexture current = snapshotTexture;
        if (current != null && snapshotWidth == width) {
            if (snapshotHeight == height) {
                return current;
            }
        }
        if (current != null) {
            \u0636\u0643.getMc().getTextureManager().destroyTexture(SNAPSHOT_TEXTURE_ID);
        }
        NativeImageBackedTexture texture = nativeImageBackedTexture = new NativeImageBackedTexture("rain_menu_3d_snapshot", width, height, false);
        boolean bl = false;
        \u0636\u0643.getMc().getTextureManager().registerTexture(SNAPSHOT_TEXTURE_ID, (AbstractTexture)texture);
        snapshotTexture = texture;
        snapshotWidth = width;
        snapshotHeight = var2_2;
        return nativeImageBackedTexture;
    }

    /*
     * WARNING - void declaration
     */
    private final Menu3DModule.Placement createPlacement() {
        void var12_10;
        void var13_11;
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return null;
        }
        ClientWorld level = clientWorld;
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Camera camera = \u0637\u062b.getCamera(gameRenderer);
        if (!camera.isReady()) {
            return null;
        }
        double planeDistance = ((Number)distance.getValue()).floatValue();
        Vector3fc vector3fc = camera.getHorizontalPlane();
        Intrinsics.checkNotNullExpressionValue(vector3fc, "forwardVector(...)");
        Vector3fc forward = vector3fc;
        Vec3d vec3d = \u0637\u062b.getPos(camera).add((double)forward.x() * planeDistance, (double)forward.y() * planeDistance, (double)forward.z() * planeDistance);
        Intrinsics.checkNotNullExpressionValue(vec3d, "add(...)");
        Vec3d center = vec3d;
        float fov = RangesKt.coerceIn(\u0636\u0643.getMc().gameRenderer.getFov(camera, 1.0f, true), 20.0f, 150.0f);
        float viewportHeight = RangesKt.coerceAtLeast((float)\u0636\u0643.getMc().getWindow().getScaledHeight(), 1.0f);
        double visibleWorldHeight = 2.0 * planeDistance * Math.tan(Math.toRadians((double)fov * 0.5));
        float renderedScale = MenuScreen.INSTANCE.renderedScale();
        float menuHeight = (float)(visibleWorldHeight * (double)(MenuScreen.INSTANCE.getHeight() * renderedScale / viewportHeight));
        float menuWidth = menuHeight * (MenuScreen.INSTANCE.getWidth() / MenuScreen.INSTANCE.getHeight());
        return new Menu3DModule.Placement(level, center, new Quaternionf((Quaternionfc)camera.getRotation()), (float)var13_11, (float)var12_10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final boolean copyMenuPanel(Framebuffer target) {
        int sourceY;
        int height;
        int width;
        int sourceX;
        block9: {
            block8: {
                float scale = \u0636\u0643.getMc().getWindow().getScaleFactor();
                float renderedScale = MenuScreen.INSTANCE.renderedScale();
                float renderedWidth = MenuScreen.INSTANCE.getWidth() * renderedScale;
                float renderedHeight = MenuScreen.INSTANCE.getHeight() * renderedScale;
                float renderedX = (float)\u0636\u0643.getMc().getWindow().getScaledWidth() * 0.5f - renderedWidth * 0.5f;
                float renderedY = (float)\u0636\u0643.getMc().getWindow().getScaledHeight() * 0.5f - renderedHeight * 0.5f;
                sourceX = MathKt.roundToInt(renderedX * scale);
                int sourceTop = MathKt.roundToInt(renderedY * scale);
                width = RangesKt.coerceAtLeast(MathKt.roundToInt(renderedWidth * scale), 1);
                height = RangesKt.coerceAtLeast(MathKt.roundToInt(renderedHeight * scale), 1);
                sourceY = target.textureHeight - sourceTop - height;
                if (sourceX < 0 || sourceY < 0 || sourceX + width > target.textureWidth) break block8;
                if (sourceY + height <= target.textureHeight) break block9;
            }
            return false;
        }
        NativeImageBackedTexture texture = this.prepareSnapshotTexture(width, height);
        GpuTexture gpuTexture = texture.getGlTexture();
        GlTexture glTexture = gpuTexture instanceof GlTexture ? (GlTexture)gpuTexture : null;
        if (glTexture == null) {
            return false;
        }
        GlTexture glTexture2 = glTexture;
        int previousTexture = GL11.glGetInteger((int)32873);
        int previousReadBuffer = GL11.glGetInteger((int)3074);
        try {
            GL11.glReadBuffer((int)36064);
            GlStateManager._bindTexture((int)glTexture2.getGlId());
            GL11.glTexParameteri((int)3553, (int)36421, (int)1);
            GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)sourceX, (int)sourceY, (int)width, (int)height);
        }
        finally {
            GlStateManager._bindTexture((int)previousTexture);
            GL11.glReadBuffer((int)previousReadBuffer);
        }
        return true;
    }

    @Override
    public void onDisable() {
        pendingPlacement = null;
        ghost = null;
        this.releaseResources();
    }

    private \u062b\u0638() {
        super("3DMenu", \u0638\u0646.getRENDER(), "\u041e\u0441\u0442\u0430\u0432\u043b\u044f\u0435\u0442 \u0437\u0430\u043a\u0440\u044b\u0442\u043e\u0435 \u043c\u0435\u043d\u044e \u0432 \u043c\u0438\u0440\u0435 \u0438 \u043f\u043b\u0430\u0432\u043d\u043e \u0441\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u0435\u0433\u043e");
    }

    public final boolean requestCloseSnapshot() {
        block6: {
            block5: {
                if (!this.isEnabled() || completingClose || \u0636\u0643.getMc().world == null) break block5;
                if (\u0636\u0643.getMc().player != null) break block6;
            }
            return false;
        }
        if (pendingPlacement != null) {
            return true;
        }
        Menu3DModule.Placement placement = this.createPlacement();
        if (placement == null) {
            return false;
        }
        pendingPlacement = placement;
        return true;
    }
}

