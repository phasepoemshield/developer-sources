/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexRendering
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.util.shape.VoxelShapes
 */
package oxxxde;

import java.awt.Color;
import kotakbaz.rain.event.events.Render3DEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexRendering;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Box;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003Jk\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J_\u0010\"\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\"\u0010#Jg\u0010$\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b$\u0010%Jg\u0010&\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b&\u0010%J_\u0010'\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b'\u0010#JW\u0010(\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b(\u0010)J\u0087\u0001\u00100\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b5\u00103\u00a8\u00066"}, d2={"Loxxxde/\u062a\u062f;", "", "<init>", "()V", "Loxxxde/\u0634\u062b;", "event", "Lnet/minecraft/class_4588;", "buffer", "lineBuffer", "Lnet/minecraft/class_238;", "box", "Ljava/awt/Color;", "color", "", "filled", "outlined", "striped", "", "lineWidth", "gapDistance", "fillAlphaScale", "", "draw", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4588;Lnet/minecraft/class_4588;Lnet/minecraft/class_238;Ljava/awt/Color;ZZZFFF)V", "drawLineBox", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4588;Lnet/minecraft/class_238;Ljava/awt/Color;F)V", "Lnet/minecraft/class_4587$class_4665;", "entry", "x1", "y1", "z1", "x2", "y2", "z2", "emitOutline", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFFFFLjava/awt/Color;F)V", "emitStriped", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFFFFLjava/awt/Color;FF)V", "emitStripedLine", "emitLine", "emitSolidBox", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFFFFLjava/awt/Color;)V", "x3", "y3", "z3", "x4", "y4", "z4", "vertexQuad", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFFFFFFFFFFLjava/awt/Color;)V", "MIN_SEGMENT_LENGTH", "F", "MIN_THICKNESS", "THICKNESS_SCALE", "rain-visuals"})
public final class \u062a\u062f {
    private static final float MIN_THICKNESS = 0.002f;
    private static final float THICKNESS_SCALE = 0.005f;
    private static final float MIN_SEGMENT_LENGTH = 0.001f;
    @NotNull
    public static final \u062a\u062f INSTANCE = new \u062a\u062f();

    private final void emitStripedLine(VertexConsumer buffer, MatrixStack.Entry entry, float x1, float y1, float z1, float x2, float y2, float z2, Color color, float lineWidth, float gapDistance) {
        if (gapDistance <= 0.0f) {
            this.emitLine(buffer, entry, x1, y1, z1, x2, y2, z2, color, lineWidth);
            return;
        }
        float dx = x2 - x1;
        float dy = y2 - y1;
        float dz = z2 - z1;
        float totalLength = (float)Math.sqrt(dx * dx + dy * dy + dz * dz);
        if (totalLength < 0.001f) {
            return;
        }
        float dashLength = RangesKt.coerceAtLeast(gapDistance, 0.01f);
        if (totalLength <= dashLength * 2.0f) {
            this.emitLine(buffer, entry, x1, y1, z1, x2, y2, z2, color, lineWidth);
            return;
        }
        int n = 2;
        int n2 = (int)((totalLength + dashLength) / (dashLength * 2.0f));
        int dashCount = Math.max(n, n2);
        float gapLength = (totalLength - dashLength * (float)dashCount) / (float)(dashCount - 1);
        float distanceStep = dashLength + gapLength;
        for (int i = 0; i < dashCount; ++i) {
            int index = i;
            boolean bl = false;
            float startDistance = distanceStep * (float)index;
            float endDistance = index == dashCount - 1 ? totalLength : startDistance + dashLength;
            float start = startDistance / totalLength;
            float end = endDistance / totalLength;
            INSTANCE.emitLine(buffer, entry, x1 + dx * start, y1 + dy * start, z1 + dz * start, x1 + dx * end, y1 + dy * end, z1 + dz * end, color, lineWidth);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final void emitLine(VertexConsumer buffer, MatrixStack.Entry entry, float x1, float y1, float z1, float x2, float y2, float z2, Color color, float lineWidth) {
        void var9_9;
        if (lineWidth <= 0.0f) {
            return;
        }
        float dx = Math.abs(x2 - x1);
        float dy = Math.abs(y2 - y1);
        float dz = Math.abs(z2 - z1);
        if (dx <= 0.001f && dy <= 0.001f && dz <= 0.001f) {
            return;
        }
        float half = Math.max(lineWidth * 0.005f, 0.002f);
        this.emitSolidBox(buffer, entry, Math.min(x1, x2) - (dx <= 0.001f ? half : 0.0f), Math.min(y1, y2) - (dy <= 0.001f ? half : 0.0f), Math.min(z1, z2) - (dz <= 0.001f ? half : 0.0f), Math.max(x1, x2) + (dx <= 0.001f ? half : 0.0f), Math.max(y1, y2) + (dy <= 0.001f ? half : 0.0f), Math.max(z1, z2) + (dz <= 0.001f ? half : 0.0f), (Color)var9_9);
    }

    /*
     * WARNING - void declaration
     */
    private final void emitOutline(VertexConsumer buffer, MatrixStack.Entry entry, float x1, float y1, float z1, float x2, float y2, float z2, Color color, float lineWidth) {
        void var10_10;
        void var9_9;
        void var8_8;
        void var7_7;
        this.emitLine(buffer, entry, x1, y1, z1, x2, y1, z1, color, lineWidth);
        this.emitLine(buffer, entry, x2, y1, z1, x2, y1, z2, color, lineWidth);
        this.emitLine(buffer, entry, x2, y1, z2, x1, y1, z2, color, lineWidth);
        this.emitLine(buffer, entry, x1, y1, z2, x1, y1, z1, color, lineWidth);
        this.emitLine(buffer, entry, x1, y2, z1, x2, y2, z1, color, lineWidth);
        this.emitLine(buffer, entry, x2, y2, z1, x2, y2, z2, color, lineWidth);
        this.emitLine(buffer, entry, x2, y2, z2, x1, y2, z2, color, lineWidth);
        this.emitLine(buffer, entry, x1, y2, z2, x1, y2, z1, color, lineWidth);
        this.emitLine(buffer, entry, x1, y1, z1, x1, y2, z1, color, lineWidth);
        this.emitLine(buffer, entry, x2, y1, z1, x2, y2, z1, color, lineWidth);
        this.emitLine(buffer, entry, x1, y1, z2, x1, y2, z2, color, lineWidth);
        this.emitLine(buffer, entry, x2, y1, z2, x2, (float)var7_7, (float)var8_8, (Color)var9_9, (float)var10_10);
    }

    private final void drawLineBox(Render3DEvent event, VertexConsumer buffer, Box box, Color color, float lineWidth) {
        VertexRendering.drawOutline((MatrixStack)event.getMatrices(), (VertexConsumer)buffer, (VoxelShape)VoxelShapes.cuboid((Box)box), (double)0.0, (double)0.0, (double)0.0, (int)color.getRGB(), (float)RangesKt.coerceAtLeast(lineWidth, 1.0f));
    }

    /*
     * WARNING - void declaration
     */
    private final void emitSolidBox(VertexConsumer buffer, MatrixStack.Entry entry, float x1, float y1, float z1, float x2, float y2, float z2, Color color) {
        void var9_9;
        this.vertexQuad(buffer, entry, x1, y1, z1, x2, y1, z1, x2, y2, z1, x1, y2, z1, color);
        this.vertexQuad(buffer, entry, x1, y1, z2, x2, y1, z2, x2, y2, z2, x1, y2, z2, color);
        this.vertexQuad(buffer, entry, x1, y1, z1, x1, y1, z2, x1, y2, z2, x1, y2, z1, color);
        this.vertexQuad(buffer, entry, x2, y1, z1, x2, y1, z2, x2, y2, z2, x2, y2, z1, color);
        this.vertexQuad(buffer, entry, x1, y1, z1, x2, y1, z1, x2, y1, z2, x1, y1, z2, color);
        this.vertexQuad(buffer, entry, x1, y2, z1, x2, y2, z1, x2, y2, z2, x1, y2, z2, (Color)var9_9);
    }

    private final void vertexQuad(VertexConsumer buffer, MatrixStack.Entry entry, float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4, Color color) {
        buffer.vertex(entry, x1, y1, z1).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        buffer.vertex(entry, x2, y2, z2).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        buffer.vertex(entry, x3, y3, z3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        buffer.vertex(entry, x4, y4, z4).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    public static /* synthetic */ void draw$default(\u062a\u062f \u062a\u062f2, Render3DEvent render3DEvent, VertexConsumer vertexConsumer, VertexConsumer vertexConsumer2, Box box, Color color, boolean bl, boolean bl2, boolean bl3, float f, float f2, float f3, int n, Object object) {
        if ((n & 4) != 0) {
            vertexConsumer2 = null;
        }
        if ((n & 0x400) != 0) {
            f3 = 0.25f;
        }
        \u062a\u062f2.draw(render3DEvent, vertexConsumer, vertexConsumer2, box, color, bl, bl2, bl3, f, f2, f3);
    }

    /*
     * WARNING - void declaration
     */
    public final void draw(@NotNull Render3DEvent event, @NotNull VertexConsumer buffer, @Nullable VertexConsumer lineBuffer, @NotNull Box box, @NotNull Color color, boolean filled, boolean outlined, boolean striped, float lineWidth, float gapDistance, float fillAlphaScale) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(box, "box");
        Intrinsics.checkNotNullParameter(color, "color");
        if (color.getAlpha() <= 0) {
            return;
        }
        MatrixStack.Entry entry = event.getMatrices().peek();
        Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
        MatrixStack.Entry entry2 = entry;
        float x1 = (float)box.minX;
        float y1 = (float)box.minY;
        float z1 = (float)box.minZ;
        float x2 = (float)box.maxX;
        float y2 = (float)box.maxY;
        float z2 = (float)box.maxZ;
        if (filled) {
            int fillAlpha = RangesKt.coerceIn(MathKt.roundToInt((float)color.getAlpha() * fillAlphaScale), color.getAlpha() > 0 ? 1 : 0, 255);
            this.emitSolidBox(buffer, entry2, x1, y1, z1, x2, y2, z2, new Color(color.getRed(), color.getGreen(), color.getBlue(), fillAlpha));
        }
        if (outlined) {
            VertexConsumer vertexConsumer = lineBuffer;
            if (vertexConsumer != null) {
                VertexConsumer it = vertexConsumer;
                boolean bl = false;
                INSTANCE.drawLineBox(event, it, box, color, lineWidth);
            } else {
                this.emitOutline(buffer, entry2, x1, y1, z1, x2, y2, z2, color, lineWidth);
            }
        }
        if (striped) {
            void var10_10;
            void var9_9;
            this.emitStriped(buffer, entry2, x1, y1, z1, x2, y2, z2, color, (float)var9_9, (float)var10_10);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final void emitStriped(VertexConsumer buffer, MatrixStack.Entry entry, float x1, float y1, float z1, float x2, float y2, float z2, Color color, float lineWidth, float gapDistance) {
        void var11_11;
        void var10_10;
        void var9_9;
        void var8_8;
        this.emitStripedLine(buffer, entry, x1, y1, z1, x2, y1, z1, color, lineWidth, gapDistance);
        this.emitStripedLine(buffer, entry, x2, y1, z1, x2, y1, z2, color, lineWidth, gapDistance);
        this.emitStripedLine(buffer, entry, x2, y1, z2, x1, y1, z2, color, lineWidth, gapDistance);
        this.emitStripedLine(buffer, entry, x1, y1, z2, x1, y1, z1, color, lineWidth, gapDistance);
        this.emitStripedLine(buffer, entry, x1, y2, z1, x2, y2, z1, color, lineWidth, gapDistance);
        this.emitStripedLine(buffer, entry, x2, y2, z1, x2, y2, z2, color, lineWidth, gapDistance);
        this.emitStripedLine(buffer, entry, x2, y2, z2, x1, y2, z2, color, lineWidth, gapDistance);
        this.emitStripedLine(buffer, entry, x1, y2, z2, x1, y2, z1, color, lineWidth, gapDistance);
        this.emitStripedLine(buffer, entry, x1, y1, z1, x1, y2, z1, color, lineWidth, gapDistance);
        this.emitStripedLine(buffer, entry, x2, y1, z1, x2, y2, z1, color, lineWidth, gapDistance);
        this.emitStripedLine(buffer, entry, x1, y1, z2, x1, y2, z2, color, lineWidth, gapDistance);
        this.emitStripedLine(buffer, entry, x2, y1, z2, x2, y2, (float)var8_8, (Color)var9_9, (float)var10_10, (float)var11_11);
    }

    private \u062a\u062f() {
    }
}

