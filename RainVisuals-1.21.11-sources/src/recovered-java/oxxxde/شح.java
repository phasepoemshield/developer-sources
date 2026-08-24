/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.util.BufferAllocator
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.math.RotationAxis
 *  net.minecraft.util.math.Vec3d
 *  org.joml.Quaternionfc
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import kotakbaz.rain.event.events.JumpEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.JumpCircleModule;
import kotakbaz.rain.module.setting.ClientColorSetting;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RainRenderLayers;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionfc;
import oxxxde.\u062e\u064d;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001CB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\rH\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJG\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b\"\u0010 J'\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b.\u0010-R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b8\u00107R\u0014\u00109\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010:\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b:\u00107R\u0014\u0010;\u001a\u00020+8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b;\u0010-R$\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u00100<j\b\u0012\u0004\u0012\u00020\u0010`=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bB\u0010A\u00a8\u0006D"}, d2={"Loxxxde/\u0634\u062d;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u0632\u0634;", "event", "", "onJump", "(Lkotakbaz/rain/event/events/JumpEvent;)V", "Loxxxde/\u0633\u062d;", "onPlayerUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "onDisable", "Loxxxde/\u0634\u062b;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Loxxxde/\u062a\u0637;", "circle", "Lnet/minecraft/class_4587;", "matrices", "Lnet/minecraft/class_4597$class_4598;", "consumers", "Lnet/minecraft/class_1921;", "layer", "", "cameraX", "cameraY", "cameraZ", "renderCircle", "(Lkotakbaz/rain/module/modules/render/JumpCircleModule$Circle;Lnet/minecraft/class_4587;Lnet/minecraft/class_4597$class_4598;Lnet/minecraft/class_1921;DDD)V", "", "lifeTimeMillis", "()J", "spawnDurationMillis", "dieDurationMillis", "x", "y", "z", "spawnCircle", "(DDD)V", "Lnet/minecraft/class_2960;", "selectedTexture", "()Lnet/minecraft/class_2960;", "", "STYLE_GLOWING", "I", "STYLE_RAIN", "Loxxxde/\u0637\u0628;", "circleColor", "Loxxxde/\u0637\u0628;", "Loxxxde/\u0638\u064a;", "style", "Loxxxde/\u0638\u064a;", "Loxxxde/\u0637\u064f;", "size", "Loxxxde/\u0637\u064f;", "lifeTime", "spawnDuration", "dieDuration", "BUFFER_SIZE", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "circles", "Ljava/util/ArrayList;", "glowingTexture", "Lnet/minecraft/class_2960;", "rainTexture", "Circle", "rain-visuals"})
@RecompileFormat
public final class \u0634\u062d
extends Module {
    @NotNull
    private static final SliderSetting spawnDuration;
    @NotNull
    private static final SliderSetting lifeTime;
    @NotNull
    private static final SliderSetting dieDuration;
    @NotNull
    private static final ClientColorSetting circleColor;
    @NotNull
    private static final Identifier rainTexture;
    @NotNull
    private static final SliderSetting size;
    @NotNull
    private static final Identifier glowingTexture;
    @NotNull
    public static final \u0634\u062d INSTANCE;
    private static final int STYLE_GLOWING = 0;
    private static final int STYLE_RAIN = 1;
    @NotNull
    private static final ModeSetting style;
    @NotNull
    private static final ArrayList<JumpCircleModule.Circle> circles;
    private static final int BUFFER_SIZE = 262144;

    @Commando
    public final void onPlayerUpdate(@NotNull PlayerUpdateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (circles.isEmpty()) {
            return;
        }
        CollectionsKt.removeAll((List)circles, (Function1)\u062e\u064d.INSTANCE);
    }

    static {
        INSTANCE = new \u0634\u062d();
        circleColor = Module.clientColor$default(INSTANCE, "\u0426\u0432\u0435\u0442", new Color(255, 255, 255, 255), null, 4, null);
        String[] stringArray = new String[2];
        stringArray[0] = "\u0421\u0438\u044f\u044e\u0449\u0438\u0439";
        stringArray[1] = "\u0420\u044d\u0439\u043d";
        style = Module.mode$default(INSTANCE, "\u0421\u0442\u0438\u043b\u044c", CollectionsKt.listOf(stringArray), 0, null, 12, null);
        size = Module.slider$default(INSTANCE, "\u0420\u0430\u0437\u043c\u0435\u0440", 2.0f, 1.0f, 6.0f, 0.1f, null, 32, null);
        lifeTime = Module.slider$default(INSTANCE, "\u0412\u0440\u0435\u043c\u044f \u0436\u0438\u0437\u043d\u0438", 5.0f, 1.0f, 20.0f, 1.0f, null, 32, null);
        spawnDuration = Module.slider$default(INSTANCE, "\u0414\u043b\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u044c \u0441\u043f\u0430\u0432\u043d\u0430", 5.0f, 1.0f, 20.0f, 1.0f, null, 32, null);
        dieDuration = Module.slider$default(INSTANCE, "\u0414\u043b\u0438\u0442\u0435\u043b\u044c\u043d\u043e\u0441\u0442\u044c \u0443\u0445\u043e\u0434\u0430", 5.0f, 1.0f, 20.0f, 1.0f, null, 32, null);
        circles = new ArrayList();
        Identifier identifier = Identifier.of((String)"rain", (String)"textures/world/circle/jump.png");
        Intrinsics.checkNotNullExpressionValue(identifier, "fromNamespaceAndPath(...)");
        glowingTexture = identifier;
        Identifier identifier2 = Identifier.of((String)"rain", (String)"textures/world/circle/jump2.png");
        Intrinsics.checkNotNullExpressionValue(identifier2, "fromNamespaceAndPath(...)");
        rainTexture = identifier2;
    }

    @Override
    public void onDisable() {
        circles.clear();
    }

    private \u0634\u062d() {
        super("JumpCircle", \u0638\u0646.getRENDER(), "\u0412\u0438\u0437\u0443\u0430\u043b\u044c\u043d\u044b\u0435 \u0441\u043b\u0435\u0434\u044b \u043f\u0440\u0438 \u043f\u0440\u044b\u0436\u043a\u0435");
    }

    private final void spawnCircle(double x, double y, double z) {
        circles.add(new JumpCircleModule.Circle(x, y, z, ((Number)size.getValue()).floatValue(), this.lifeTimeMillis(), this.spawnDurationMillis(), this.dieDurationMillis()));
    }

    private final Identifier selectedTexture() {
        return switch (style.getSelectedIndex()) {
            case 1 -> rainTexture;
            case 0 -> glowingTexture;
            default -> glowingTexture;
        };
    }

    @Commando
    public final void onJump(@NotNull JumpEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ClientPlayerEntity player = \u0636\u0643.getMc().player;
        if (player != null) {
            this.spawnCircle(player.getX(), player.getY() + 0.125, player.getZ());
        }
    }

    private final long dieDurationMillis() {
        return (long)RangesKt.coerceAtLeast((int)((Number)dieDuration.getValue()).floatValue(), 1) * 50L;
    }

    private final long lifeTimeMillis() {
        return (long)RangesKt.coerceAtLeast((int)((Number)lifeTime.getValue()).floatValue(), 1) * 50L;
    }

    private final long spawnDurationMillis() {
        return (long)RangesKt.coerceAtLeast((int)((Number)spawnDuration.getValue()).floatValue(), 1) * 50L;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderCircle(JumpCircleModule.Circle circle, MatrixStack matrices, VertexConsumerProvider.Immediate consumers, RenderLayer layer, double cameraX, double cameraY, double cameraZ) {
        void var2_2;
        void var21_18;
        VertexConsumer buffer;
        circle.updateAnimations();
        float alphaProgress = circle.alpha();
        if (alphaProgress <= 0.0f) {
            return;
        }
        float sizeProgress = circle.scale();
        float animatedSize = circle.getSize() * sizeProgress;
        if (animatedSize <= 0.0f) {
            return;
        }
        float half = animatedSize * 0.5f;
        Color selectedColor = circleColor.getValue();
        int alpha = RangesKt.coerceIn((int)(alphaProgress * (float)selectedColor.getAlpha()), 0, 255);
        int red = selectedColor.getRed();
        int green = selectedColor.getGreen();
        int blue = selectedColor.getBlue();
        boolean flipHorizontally = style.getSelectedIndex() == 1;
        float leftU = flipHorizontally ? 1.0f : 0.0f;
        float rightU = flipHorizontally ? 0.0f : 1.0f;
        matrices.push();
        matrices.translate(circle.getX() - cameraX, circle.getY() - cameraY, circle.getZ() - cameraZ);
        matrices.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(90.0f));
        matrices.translate(-((double)half), -((double)half), 0.01);
        MatrixStack.Entry entry = matrices.peek();
        Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
        MatrixStack.Entry entry2 = entry;
        VertexConsumer vertexConsumer = consumers.getBuffer(layer);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
        VertexConsumer $this$vertex$iv = buffer = vertexConsumer;
        MatrixStack.Entry entry$iv = entry2;
        float x$iv = 0.0f;
        float y$iv = 0.0f;
        float z$iv = 0.0f;
        boolean $i$f$vertex = false;
        VertexConsumer vertexConsumer2 = $this$vertex$iv.vertex(entry$iv, x$iv, y$iv, z$iv);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer2, "addVertex(...)");
        VertexConsumer $this$color$iv = vertexConsumer2;
        int red$iv = red;
        int green$iv = green;
        int blue$iv = blue;
        int alpha$iv = alpha;
        boolean $i$f$color = false;
        VertexConsumer vertexConsumer3 = $this$color$iv.color(red$iv, green$iv, blue$iv, alpha$iv);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer3, "setColor(...)");
        VertexConsumer $this$texture$iv = vertexConsumer3;
        float u$iv = leftU;
        float v$iv = 1.0f;
        boolean $i$f$texture = false;
        Intrinsics.checkNotNullExpressionValue($this$texture$iv.texture(u$iv, v$iv), "setUv(...)");
        $this$vertex$iv = buffer;
        entry$iv = entry2;
        x$iv = animatedSize;
        y$iv = 0.0f;
        z$iv = 0.0f;
        $i$f$vertex = false;
        VertexConsumer vertexConsumer4 = $this$vertex$iv.vertex(entry$iv, x$iv, y$iv, z$iv);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer4, "addVertex(...)");
        $this$color$iv = vertexConsumer4;
        red$iv = red;
        green$iv = green;
        blue$iv = blue;
        alpha$iv = alpha;
        $i$f$color = false;
        VertexConsumer vertexConsumer5 = $this$color$iv.color((int)u$iv, (int)v$iv, $i$f$texture ? 1 : 0, alpha$iv);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer5, "setColor(...)");
        $this$texture$iv = vertexConsumer5;
        u$iv = rightU;
        v$iv = 1.0f;
        $i$f$texture = false;
        Intrinsics.checkNotNullExpressionValue($this$texture$iv.texture(u$iv, v$iv), "setUv(...)");
        $this$vertex$iv = buffer;
        entry$iv = entry2;
        x$iv = animatedSize;
        y$iv = animatedSize;
        z$iv = 0.0f;
        $i$f$vertex = false;
        VertexConsumer vertexConsumer6 = $this$vertex$iv.vertex(entry$iv, x$iv, y$iv, (float)alpha$iv);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer6, "addVertex(...)");
        $this$color$iv = vertexConsumer6;
        red$iv = red;
        green$iv = green;
        blue$iv = blue;
        alpha$iv = alpha;
        $i$f$color = false;
        VertexConsumer vertexConsumer7 = $this$texture$iv.color((int)u$iv, (int)v$iv, $i$f$texture ? 1 : 0, alpha$iv);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer7, "setColor(...)");
        $this$texture$iv = vertexConsumer7;
        u$iv = rightU;
        v$iv = 0.0f;
        $i$f$texture = false;
        Intrinsics.checkNotNullExpressionValue($this$texture$iv.texture((float)entry$iv, x$iv), "setUv(...)");
        $this$vertex$iv = buffer;
        entry$iv = entry2;
        x$iv = 0.0f;
        y$iv = animatedSize;
        z$iv = 0.0f;
        $i$f$vertex = false;
        VertexConsumer vertexConsumer8 = $this$vertex$iv.vertex((MatrixStack.Entry)red$iv, (float)green$iv, (float)blue$iv, (float)alpha$iv);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer8, "addVertex(...)");
        $this$color$iv = vertexConsumer8;
        red$iv = red;
        green$iv = green;
        blue$iv = blue;
        int n = alpha;
        boolean bl = false;
        VertexConsumer vertexConsumer9 = $this$texture$iv.color((int)u$iv, (int)v$iv, (int)$i$f$texture, n);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer9, "setColor(...)");
        VertexConsumer vertexConsumer10 = vertexConsumer9;
        void var26_34 = var21_18;
        float f = 0.0f;
        boolean bl2 = false;
        Intrinsics.checkNotNullExpressionValue(vertexConsumer10.texture((float)var26_34, f), "setUv(...)");
        var2_2.pop();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isEnabled()) {
            return;
        }
        if (circles.isEmpty()) {
            return;
        }
        BufferAllocator allocator = new BufferAllocator(262144);
        try {
            void var7_8;
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)allocator);
            Intrinsics.checkNotNullExpressionValue(immediate, "immediate(...)");
            VertexConsumerProvider.Immediate consumers = immediate;
            MatrixStack matrices = event.getMatrices();
            GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
            Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
            Vec3d cameraPos = \u0637\u062b.getPos(\u0637\u062b.getCamera(gameRenderer));
            RenderLayer layer = RainRenderLayers.getJumpCircle(this.selectedTexture());
            Iterable $this$forEach$iv = circles;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                JumpCircleModule.Circle circle = (JumpCircleModule.Circle)element$iv;
                boolean bl = false;
                Intrinsics.checkNotNull(layer);
                INSTANCE.renderCircle(circle, matrices, consumers, layer, cameraPos.x, cameraPos.y, cameraPos.z);
            }
            VertexConsumerProvider.Immediate $this$draw$iv = consumers;
            boolean $i$f$draw = false;
            var7_8.draw();
        }
        catch (Throwable throwable) {
            void var2_2;
            var2_2.close();
            throw throwable;
        }
        allocator.close();
    }
}

