/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.util.BufferAllocator
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.util.math.Vec3d
 */
package oxxxde;

import java.awt.Color;
import java.util.List;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.modules.render.predicts.TrajectoryPrediction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.render.RainRenderLayers;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\r\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ?\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\"\u0010#J/\u0010&\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b&\u0010'J?\u0010)\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b)\u0010*JO\u0010/\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b/\u00100JG\u00103\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b8\u00107R\u0014\u00109\u001a\u0002058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010:\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010=\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010>\u001a\u00020\u001b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b>\u0010;R\u0014\u0010?\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bA\u0010@\u00a8\u0006B"}, d2={"Loxxxde/\u0637\u0631;", "", "<init>", "()V", "Loxxxde/\u0634\u062b;", "event", "Lnet/minecraft/class_243;", "cameraPos", "", "Loxxxde/\u0628\u062e;", "predictions", "", "lineWidth", "markerRadius", "opacity", "", "render", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_243;Ljava/util/List;FFF)V", "Lnet/minecraft/class_4588;", "buffer", "Lnet/minecraft/class_4587$class_4665;", "entry", "points", "Ljava/awt/Color;", "color", "drawPath", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;Ljava/util/List;Ljava/awt/Color;F)V", "", "remainingDistance", "fadeDistance", "endFadeAlpha", "(DD)F", "center", "radius", "drawSphere", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;Lnet/minecraft/class_243;DLjava/awt/Color;F)V", "latitude", "longitude", "spherePoint", "(Lnet/minecraft/class_243;DDD)Lnet/minecraft/class_243;", "position", "addSphereVertex", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;Lnet/minecraft/class_243;Ljava/awt/Color;DF)V", "start", "end", "startAlpha", "endAlpha", "emitLine", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;FFF)V", "normal", "alphaMultiplier", "addLineVertex", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Ljava/awt/Color;FF)V", "", "BUFFER_SIZE", "I", "SPHERE_LONGITUDE_SEGMENTS", "SPHERE_LATITUDE_SEGMENTS", "MIN_SEGMENT_LENGTH_SQ", "D", "END_FADE_MAX_DISTANCE", "END_FADE_PATH_PORTION", "END_FADE_SEGMENT_LENGTH", "hitColor", "Ljava/awt/Color;", "missColor", "rain-visuals"})
public final class \u0637\u0631 {
    @NotNull
    private static final Color hitColor;
    private static final double END_FADE_SEGMENT_LENGTH = 0.1;
    private static final int SPHERE_LATITUDE_SEGMENTS = 12;
    @NotNull
    public static final \u0637\u0631 INSTANCE;
    private static final double END_FADE_MAX_DISTANCE = 4.5;
    private static final double MIN_SEGMENT_LENGTH_SQ = 1.0E-8;
    private static final double END_FADE_PATH_PORTION = 0.3;
    private static final int BUFFER_SIZE = 0x100000;
    @NotNull
    private static final Color missColor;
    private static final int SPHERE_LONGITUDE_SEGMENTS = 24;

    private final Vec3d spherePoint(Vec3d center, double radius, double latitude, double longitude) {
        double horizontal = Math.cos(latitude) * radius;
        return new Vec3d(center.x + horizontal * Math.cos(longitude), center.y + Math.sin(latitude) * radius, center.z + horizontal * Math.sin(longitude));
    }

    private final void addLineVertex(VertexConsumer buffer, MatrixStack.Entry entry, Vec3d position, Vec3d normal, Color color, float lineWidth, float alphaMultiplier) {
        int alpha = RangesKt.coerceIn((int)((float)color.getAlpha() * alphaMultiplier), 0, 255);
        buffer.vertex(entry, (float)position.x, (float)position.y, (float)position.z).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).normal(entry, (float)normal.x, (float)normal.y, (float)normal.z).lineWidth(lineWidth);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public final void render(@NotNull Render3DEvent event, @NotNull Vec3d cameraPos, @NotNull List<TrajectoryPrediction> predictions, float lineWidth, float markerRadius, float opacity) {
        block15: {
            block14: {
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(cameraPos, "cameraPos");
                Intrinsics.checkNotNullParameter(predictions, "predictions");
                if (predictions.isEmpty()) break block14;
                if (!(opacity <= 0.0f)) break block15;
            }
            return;
        }
        float clampedOpacity = RangesKt.coerceIn(opacity, 0.0f, 1.0f);
        AutoCloseable autoCloseable = (AutoCloseable)new BufferAllocator(0x100000);
        Throwable throwable = null;
        try {
            void var17_19;
            void var14_16;
            BufferAllocator sphereAllocator = (BufferAllocator)autoCloseable;
            boolean bl = false;
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)sphereAllocator);
            Intrinsics.checkNotNullExpressionValue(immediate, "immediate(...)");
            VertexConsumerProvider.Immediate sphereConsumers = immediate;
            RenderLayer lineLayer = RainRenderLayers.getHitBoxLine(lineWidth);
            RenderLayer sphereLayer = RainRenderLayers.getHitBoxQuad(true);
            VertexConsumer vertexConsumer = sphereConsumers.getBuffer(sphereLayer);
            Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
            VertexConsumer sphereBuffer = vertexConsumer;
            event.getMatrices().push();
            event.getMatrices().translate(-cameraPos.x, -cameraPos.y, -cameraPos.z);
            MatrixStack.Entry entry = event.getMatrices().peek();
            Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
            MatrixStack.Entry entry2 = entry;
            Iterable $this$forEach$iv = predictions;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                TrajectoryPrediction prediction = (TrajectoryPrediction)element$iv;
                boolean bl2 = false;
                AutoCloseable autoCloseable2 = (AutoCloseable)new BufferAllocator(0x100000);
                Throwable throwable2 = null;
                try {
                    void var30_36;
                    void var31_37;
                    VertexConsumer lineBuffer;
                    VertexConsumerProvider.Immediate lineConsumers;
                    BufferAllocator lineAllocator = (BufferAllocator)autoCloseable2;
                    boolean bl3 = false;
                    Intrinsics.checkNotNullExpressionValue(VertexConsumerProvider.immediate((BufferAllocator)lineAllocator), "immediate(...)");
                    Intrinsics.checkNotNullExpressionValue(lineConsumers.getBuffer(lineLayer), "getBuffer(...)");
                    Color baseColor = prediction.getHitsTarget() ? hitColor : missColor;
                    Color color = new Color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), RangesKt.coerceIn((int)((float)baseColor.getAlpha() * clampedOpacity), 0, 255));
                    INSTANCE.drawPath(lineBuffer, entry2, prediction.getPoints(), color, lineWidth);
                    VertexConsumerProvider.Immediate $this$draw$iv = lineConsumers;
                    Intrinsics.checkNotNull(lineLayer);
                    RenderLayer renderLayer = lineLayer;
                    boolean bl4 = false;
                    var31_37.draw(renderLayer);
                    INSTANCE.drawSphere(sphereBuffer, entry2, prediction.getImpact().getPosition(), markerRadius, (Color)var30_36, clampedOpacity);
                    Unit unit = Unit.INSTANCE;
                }
                catch (Throwable throwable3) {
                    throwable2 = throwable3;
                    throw throwable3;
                }
                finally {
                    AutoCloseableKt.closeFinally(autoCloseable2, throwable2);
                }
            }
            event.getMatrices().pop();
            VertexConsumerProvider.Immediate $this$draw$iv = sphereConsumers;
            Intrinsics.checkNotNull(sphereLayer);
            void var18_21 = var14_16;
            boolean bl5 = false;
            var17_19.draw((RenderLayer)var18_21);
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

    private final void addSphereVertex(VertexConsumer buffer, MatrixStack.Entry entry, Vec3d position, Color color, double latitude, float opacity) {
        double brightness = 0.72 + 0.28 * ((Math.sin(latitude) + 1.0) * 0.5);
        Color shadedColor = new Color(RangesKt.coerceIn((int)((double)color.getRed() * brightness), 0, 255), RangesKt.coerceIn((int)((double)color.getGreen() * brightness), 0, 255), RangesKt.coerceIn((int)((double)color.getBlue() * brightness), 0, 255), RangesKt.coerceIn((int)(255.0f * opacity), 0, 255));
        buffer.vertex(entry, (float)position.x, (float)position.y, (float)position.z).color(shadedColor.getRed(), shadedColor.getGreen(), shadedColor.getBlue(), shadedColor.getAlpha());
    }

    /*
     * WARNING - void declaration
     */
    private final void drawPath(VertexConsumer buffer, MatrixStack.Entry entry, List<? extends Vec3d> points, Color color, float lineWidth) {
        int n = 0;
        int n2 = CollectionsKt.getLastIndex(points);
        double[] dArray = new double[n2];
        while (n < n2) {
            int n3 = n++;
            dArray[n3] = points.get(n3).distanceTo(points.get(n3 + 1));
        }
        double[] segmentLengths = dArray;
        double totalLength = ArraysKt.sum(segmentLengths);
        if (totalLength <= 0.0) {
            return;
        }
        double fadeDistance = RangesKt.coerceAtLeast(Math.min(4.5, totalLength * 0.3), 0.001);
        double traveledDistance = 0.0;
        int index = 0;
        int n4 = CollectionsKt.getLastIndex(points);
        while (index < n4) {
            void var13_14;
            Vec3d start = points.get(index);
            Vec3d end = points.get(index + 1);
            Intrinsics.checkNotNullExpressionValue(end.subtract(start), "subtract(...)");
            double segmentLength = segmentLengths[index];
            if (!(segmentLength <= 0.0)) {
                void var18_19;
                boolean segmentEndsInsideFade = totalLength - (traveledDistance + segmentLength) < fadeDistance;
                int subdivisions = segmentEndsInsideFade ? RangesKt.coerceAtLeast((int)Math.ceil(segmentLength / 0.1), 1) : 1;
                int subdivision = 0;
                while (subdivision < subdivisions) {
                    void var22_22;
                    void var29_26;
                    Vec3d delta;
                    double progress0 = (double)subdivision / (double)subdivisions;
                    double progress1 = (double)(subdivision + 1) / (double)subdivisions;
                    double subStartDistance = traveledDistance + segmentLength * progress0;
                    double subEndDistance = traveledDistance + segmentLength * progress1;
                    Vec3d vec3d = start.add(delta.multiply(progress0));
                    Intrinsics.checkNotNullExpressionValue(vec3d, "add(...)");
                    Vec3d vec3d2 = start.add(delta.multiply(progress1));
                    Intrinsics.checkNotNullExpressionValue(vec3d2, "add(...)");
                    this.emitLine(buffer, entry, vec3d, vec3d2, color, lineWidth, this.endFadeAlpha(totalLength - subStartDistance, fadeDistance), this.endFadeAlpha(totalLength - var29_26, fadeDistance));
                    ++var22_22;
                }
                var11_13 += var18_19;
            }
            ++var13_14;
        }
    }

    private \u0637\u0631() {
    }

    static {
        INSTANCE = new \u0637\u0631();
        hitColor = new Color(70, 235, 105, 235);
        missColor = new Color(245, 70, 70, 235);
    }

    private final float endFadeAlpha(double remainingDistance, double fadeDistance) {
        float progress = (float)RangesKt.coerceIn(remainingDistance / fadeDistance, 0.0, 1.0);
        return progress * progress * (3.0f - 2.0f * progress);
    }

    /*
     * WARNING - void declaration
     */
    private final void drawSphere(VertexConsumer buffer, MatrixStack.Entry entry, Vec3d center, double radius, Color color, float opacity) {
        int latitudeIndex = 0;
        while (latitudeIndex < 12) {
            void var8_7;
            double latitude0 = -1.5707963267948966 + Math.PI * (double)latitudeIndex / (double)12;
            double latitude1 = -1.5707963267948966 + Math.PI * (double)(latitudeIndex + 1) / (double)12;
            int longitudeIndex = 0;
            while (longitudeIndex < 24) {
                void var13_10;
                double longitude0 = Math.PI * 2 * (double)longitudeIndex / (double)24;
                double longitude1 = Math.PI * 2 * (double)(longitudeIndex + 1) / (double)24;
                this.addSphereVertex(buffer, entry, this.spherePoint(center, radius, latitude0, longitude0), color, latitude0, opacity);
                this.addSphereVertex(buffer, entry, this.spherePoint(center, radius, latitude0, longitude1), color, latitude0, opacity);
                this.addSphereVertex(buffer, entry, this.spherePoint(center, radius, latitude1, longitude1), color, latitude1, opacity);
                this.addSphereVertex(buffer, entry, this.spherePoint(center, radius, latitude1, longitude0), color, latitude1, opacity);
                ++var13_10;
            }
            ++var8_7;
        }
    }

    private final void emitLine(VertexConsumer buffer, MatrixStack.Entry entry, Vec3d start, Vec3d end, Color color, float lineWidth, float startAlpha, float endAlpha) {
        Vec3d vec3d = end.subtract(start);
        Intrinsics.checkNotNullExpressionValue(vec3d, "subtract(...)");
        Vec3d delta = vec3d;
        if (delta.lengthSquared() <= 1.0E-8) {
            return;
        }
        Vec3d vec3d2 = delta.normalize();
        Intrinsics.checkNotNullExpressionValue(vec3d2, "normalize(...)");
        Vec3d normal = vec3d2;
        this.addLineVertex(buffer, entry, start, normal, color, lineWidth, startAlpha);
        this.addLineVertex(buffer, entry, end, normal, color, lineWidth, endAlpha);
    }
}

