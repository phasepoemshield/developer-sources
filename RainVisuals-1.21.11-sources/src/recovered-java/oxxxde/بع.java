/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.util.BufferAllocator
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 */
package oxxxde;

import java.awt.Color;
import java.util.List;
import kotakbaz.rain.event.events.Render3DEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RainRenderLayers;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062a\u062f;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2={"Loxxxde/\u0628\u0639;", "", "<init>", "()V", "Loxxxde/\u0634\u062b;", "event", "", "Lnet/minecraft/class_238;", "boxes", "Ljava/awt/Color;", "fillColor", "outlineColor", "", "lineWidth", "", "dashed", "dashLength", "", "render", "(Lkotakbaz/rain/event/events/Render3DEvent;Ljava/lang/Iterable;Ljava/awt/Color;Ljava/awt/Color;FZF)V", "", "BUFFER_SIZE", "I", "rain-visuals"})
public final class \u0628\u0639 {
    @NotNull
    public static final \u0628\u0639 INSTANCE = new \u0628\u0639();
    private static final int BUFFER_SIZE = 0x100000;

    /*
     * WARNING - void declaration
     */
    private static final void render$lambda$0$drawBoxes(List<? extends Box> boxList, Vec3d cameraPos, Color $fillColor, Color $outlineColor, Render3DEvent $event, VertexConsumer quadBuffer, boolean $dashed, float $lineWidth, float $dashLength, VertexConsumer lineBuffer) {
        Iterable $this$forEach$iv = boxList;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            void var8_8;
            void var7_7;
            Box renderBox;
            Color color;
            Color it;
            Color color2;
            Box worldBox = (Box)element$iv;
            boolean bl = false;
            Intrinsics.checkNotNullExpressionValue(worldBox.offset(-cameraPos.x, -cameraPos.y, -cameraPos.z), "move(...)");
            Color color3 = $fillColor;
            Color color4 = color3;
            if (color3 != null) {
                it = color2 = color4;
                boolean bl2 = false;
                Color color5 = it.getAlpha() > 0 ? color2 : null;
                color4 = color5;
                if (color5 != null) {
                    color = color4;
                    boolean bl3 = false;
                    \u062a\u062f.draw$default(\u062a\u062f.INSTANCE, $event, quadBuffer, null, renderBox, color, true, false, false, 0.0f, 0.0f, 1.0f, 4, null);
                }
            }
            Color color6 = $outlineColor;
            Color color7 = color6;
            if (color6 == null) continue;
            it = color2 = color7;
            boolean bl4 = false;
            Color color8 = it.getAlpha() > 0 ? color2 : null;
            color7 = color8;
            if (color8 == null) continue;
            color = color7;
            boolean bl5 = false;
            \u062a\u062f.draw$default(\u062a\u062f.INSTANCE, $event, quadBuffer, lineBuffer, renderBox, color, false, !$dashed, $dashed, (float)var7_7, (float)var8_8, 0.0f, 1024, null);
        }
    }

    private \u0628\u0639() {
    }

    public static /* synthetic */ void render$default(\u0628\u0639 \u0628\u06392, Render3DEvent render3DEvent, Iterable iterable, Color color, Color color2, float f, boolean bl, float f2, int n, Object object) {
        if ((n & 4) != 0) {
            color = null;
        }
        if ((n & 8) != 0) {
            color2 = null;
        }
        if ((n & 0x10) != 0) {
            f = 1.0f;
        }
        if ((n & 0x20) != 0) {
            bl = false;
        }
        if ((n & 0x40) != 0) {
            f2 = 0.18f;
        }
        \u0628\u06392.render(render3DEvent, iterable, color, color2, f, bl, f2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public final void render(@NotNull Render3DEvent event, @NotNull Iterable<? extends Box> boxes, @Nullable Color fillColor, @Nullable Color outlineColor, float lineWidth, boolean dashed, float dashLength) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(boxes, "boxes");
        List<? extends Box> boxList = CollectionsKt.toList(boxes);
        if (boxList.isEmpty()) {
            return;
        }
        Color color = fillColor;
        if ((color != null ? color.getAlpha() : 0) <= 0) {
            Color color2 = outlineColor;
            if ((color2 != null ? color2.getAlpha() : 0) <= 0) {
                return;
            }
        }
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Vec3d cameraPos = \u0637\u062b.getPos(\u0637\u062b.getCamera(gameRenderer));
        AutoCloseable autoCloseable = (AutoCloseable)new BufferAllocator(0x100000);
        Throwable throwable = null;
        try {
            BufferAllocator quadAllocator = (BufferAllocator)autoCloseable;
            boolean bl = false;
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)quadAllocator);
            Intrinsics.checkNotNullExpressionValue(immediate, "immediate(...)");
            VertexConsumerProvider.Immediate quadConsumers = immediate;
            VertexConsumer vertexConsumer = quadConsumers.getBuffer(RainRenderLayers.getHitBoxQuad(true));
            Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
            VertexConsumer quadBuffer = vertexConsumer;
            if (outlineColor != null && outlineColor.getAlpha() > 0 && !dashed) {
                AutoCloseable autoCloseable2 = (AutoCloseable)new BufferAllocator(0x100000);
                Throwable throwable2 = null;
                try {
                    BufferAllocator lineAllocator = (BufferAllocator)autoCloseable2;
                    boolean bl2 = false;
                    VertexConsumerProvider.Immediate immediate2 = VertexConsumerProvider.immediate((BufferAllocator)lineAllocator);
                    Intrinsics.checkNotNullExpressionValue(immediate2, "immediate(...)");
                    VertexConsumerProvider.Immediate lineConsumers = immediate2;
                    VertexConsumer vertexConsumer2 = lineConsumers.getBuffer(RainRenderLayers.getHitBoxLine(lineWidth));
                    Intrinsics.checkNotNullExpressionValue(vertexConsumer2, "getBuffer(...)");
                    VertexConsumer lineBuffer = vertexConsumer2;
                    \u0628\u0639.render$lambda$0$drawBoxes(boxList, cameraPos, fillColor, outlineColor, event, quadBuffer, dashed, lineWidth, dashLength, lineBuffer);
                    VertexConsumerProvider.Immediate $this$draw$iv = quadConsumers;
                    boolean $i$f$draw = false;
                    $this$draw$iv.draw();
                    VertexConsumerProvider.Immediate immediate3 = lineConsumers;
                    boolean bl3 = false;
                    immediate3.draw();
                    Unit unit = Unit.INSTANCE;
                }
                catch (Throwable throwable3) {
                    throwable2 = throwable3;
                    throw throwable3;
                }
                finally {
                    AutoCloseableKt.closeFinally(autoCloseable2, throwable2);
                }
            } else {
                void var14_16;
                \u0628\u0639.render$lambda$0$drawBoxes(boxList, cameraPos, fillColor, outlineColor, event, quadBuffer, dashed, lineWidth, dashLength, null);
                void var16_19 = var14_16;
                boolean bl4 = false;
                var16_19.draw();
            }
            Unit unit = Unit.INSTANCE;
        }
        catch (Throwable throwable4) {
            throwable = throwable4;
            throw throwable4;
        }
        finally {
            AutoCloseableKt.closeFinally(autoCloseable, throwable);
        }
    }
}

