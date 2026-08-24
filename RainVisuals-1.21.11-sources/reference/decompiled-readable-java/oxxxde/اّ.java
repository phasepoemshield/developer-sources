/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.util.BufferAllocator
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  org.joml.Quaternionfc
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.TrailsModule;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RainRenderLayers;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionfc;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u062b;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001ZB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0010J5\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u008f\u0001\u00101\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020!2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.H\u0002\u00a2\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020.H\u0002\u00a2\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020!H\u0002\u00a2\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020.2\u0006\u0010=\u001a\u00020<H\u0002\u00a2\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020<H\u0002\u00a2\u0006\u0004\b@\u0010AJ\u001f\u0010=\u001a\u00020<2\u0006\u0010C\u001a\u00020B2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b=\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010T\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bT\u0010SR<\u0010X\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00120V0Uj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00120V`W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bX\u0010Y\u00a8\u0006["}, d2={"Loxxxde/\u0627\u0651;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0634\u062b;", "event", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_1657;", "player", "", "lifetimeSeconds", "renderNewMode", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_1657;D)V", "renderLineMode", "Lnet/minecraft/class_243;", "cameraPos", "", "Loxxxde/\u062f\u0652;", "points", "renderRibbonFill", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_1657;Lnet/minecraft/class_243;Ljava/util/List;)V", "", "top", "renderRibbonLine", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_1657;Lnet/minecraft/class_243;Ljava/util/List;Z)V", "Lnet/minecraft/class_4588;", "buffer", "Lnet/minecraft/class_4587$class_4665;", "entry", "", "x1", "y1", "z1", "x2", "y2", "z2", "x3", "y3", "z3", "x4", "y4", "z4", "Ljava/awt/Color;", "startColor", "endColor", "addRibbonQuad", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFFFFFFFFFFLjava/awt/Color;Ljava/awt/Color;)V", "Lnet/minecraft/class_2960;", "resolveSpriteTexture", "()Lnet/minecraft/class_2960;", "selectedColor", "()Ljava/awt/Color;", "entity", "partialTicks", "getSmoothPos", "(Lnet/minecraft/class_1657;F)Lnet/minecraft/class_243;", "", "alpha", "tintedColor", "(I)Ljava/awt/Color;", "maxTrailPoints", "()I", "", "createdAt", "(JD)I", "Loxxxde/\u0638\u064a;", "mode", "Loxxxde/\u0638\u064a;", "Loxxxde/\u0637\u064f;", "length", "Loxxxde/\u0637\u064f;", "size", "Loxxxde/\u062e\u0630;", "useClientColor", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0631\u062a;", "trailColor", "Loxxxde/\u0631\u062a;", "glowTexture", "Lnet/minecraft/class_2960;", "pointTexture", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "Lkotlin/collections/ArrayList;", "trail", "Ljava/util/ArrayList;", "TrailPoint", "rain-visuals"})
@RecompileFormat
public final class \u0627\u0651
extends Module {
    @NotNull
    public static final \u0627\u0651 INSTANCE = new \u0627\u0651();
    @NotNull
    private static final BooleanSetting useClientColor;
    @NotNull
    private static final Identifier pointTexture;
    @NotNull
    private static final Identifier glowTexture;
    @NotNull
    private static final ArrayList<Pair<Long, Vec3d>> trail;
    @NotNull
    private static final ColorSetting trailColor;
    @NotNull
    private static final SliderSetting length;
    @NotNull
    private static final SliderSetting size;
    @NotNull
    private static final ModeSetting mode;

    @Override
    public void onDisable() {
        trail.clear();
    }

    /*
     * WARNING - void declaration
     */
    private final void renderLineMode(Render3DEvent event, PlayerEntity player, double lifetimeSeconds) {
        void var6_23;
        void var5_4;
        void var2_2;
        void var1_1;
        void var10_8;
        void $this$mapNotNullTo$iv$iv;
        if (trail.size() < 2) {
            return;
        }
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Vec3d cameraPos = \u0637\u062b.getPos(\u0637\u062b.getCamera(gameRenderer));
        Iterable $this$mapNotNull$iv = trail;
        boolean $i$f$mapNotNull = false;
        Iterable iterable = $this$mapNotNull$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$mapNotNullTo = false;
        void $this$forEach$iv$iv$iv = $this$mapNotNullTo$iv$iv;
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv$iv$iv.iterator();
        while (iterator2.hasNext()) {
            void var24_21;
            TrailsModule.TrailPoint it$iv$iv;
            void var23_20;
            void var22_19;
            Object element$iv$iv$iv;
            Object element$iv$iv = element$iv$iv$iv = iterator2.next();
            boolean bl = false;
            Pair pair = (Pair)element$iv$iv;
            boolean bl2 = false;
            long createdAt = ((Number)pair.component1()).longValue();
            Vec3d position = (Vec3d)pair.component2();
            int alphaValue = INSTANCE.alpha(createdAt, lifetimeSeconds);
            if ((alphaValue <= 0 ? null : new TrailsModule.TrailPoint((Vec3d)var22_19, (int)var23_20)) == null) continue;
            it$iv$iv = it$iv$iv;
            boolean bl3 = false;
            destination$iv$iv.add(var24_21);
        }
        List points = (List)var10_8;
        if (points.size() < 2) {
            return;
        }
        this.renderRibbonFill(event, player, cameraPos, points);
        this.renderRibbonLine(event, player, cameraPos, points, false);
        this.renderRibbonLine((Render3DEvent)var1_1, (PlayerEntity)var2_2, (Vec3d)var5_4, (List<TrailsModule.TrailPoint>)var6_23, true);
    }

    private static final boolean onRender3D$lambda$0(long $currentTime, long $lifetimeMillis, Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return $currentTime - ((Number)it.getFirst()).longValue() > $lifetimeMillis;
    }

    private final Color selectedColor() {
        return (Boolean)useClientColor.getValue() != false && \u0638\u062b.INSTANCE.isEnabled() ? \u0638\u062b.INSTANCE.getClientColor() : (Color)trailColor.getValue();
    }

    private final Identifier resolveSpriteTexture() {
        return mode.getSelectedIndex() == 1 ? glowTexture : pointTexture;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private final void renderRibbonFill(Render3DEvent event, PlayerEntity player, Vec3d cameraPos, List<TrailsModule.TrailPoint> points) {
        AutoCloseable autoCloseable = (AutoCloseable)new BufferAllocator(262144);
        Throwable throwable = null;
        try {
            void var17_21;
            void var16_19;
            BufferAllocator allocator = (BufferAllocator)autoCloseable;
            boolean bl = false;
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)allocator);
            Intrinsics.checkNotNullExpressionValue(immediate, "immediate(...)");
            VertexConsumerProvider.Immediate consumers = immediate;
            RenderLayer layer = RainRenderLayers.getHitBoxQuad(true);
            VertexConsumer vertexConsumer = consumers.getBuffer(layer);
            Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
            VertexConsumer buffer = vertexConsumer;
            Box box = player.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(box, "getBoundingBox(...)");
            float hitboxHeight = RangesKt.coerceAtLeast((float)\u0637\u062b.getLengthY(box), \u0637\u062b.getHeight((Entity)player));
            float bottomOffset = 0.02f;
            float topOffset = 0.02f;
            event.getMatrices().push();
            event.getMatrices().translate(-cameraPos.x, -cameraPos.y, -cameraPos.z);
            MatrixStack.Entry entry = event.getMatrices().peek();
            Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
            MatrixStack.Entry entry2 = entry;
            int n = CollectionsKt.getLastIndex(points);
            for (int index = 0; index < n; ++index) {
                void var21_26;
                void var20_25;
                TrailsModule.TrailPoint current = points.get(index);
                TrailsModule.TrailPoint next = points.get(index + 1);
                Color currentColor = INSTANCE.tintedColor(current.getAlpha());
                Color nextColor = INSTANCE.tintedColor(next.getAlpha());
                float bottomY = (float)current.getPosition().y + bottomOffset;
                float topY = (float)current.getPosition().y + hitboxHeight - topOffset;
                float nextBottomY = (float)next.getPosition().y + bottomOffset;
                float nextTopY = (float)next.getPosition().y + hitboxHeight - topOffset;
                INSTANCE.addRibbonQuad(buffer, entry2, (float)current.getPosition().x, bottomY, (float)current.getPosition().z, (float)current.getPosition().x, topY, (float)current.getPosition().z, (float)next.getPosition().x, nextTopY, (float)next.getPosition().z, (float)next.getPosition().x, nextBottomY, (float)next.getPosition().z, (Color)var20_25, (Color)var21_26);
            }
            event.getMatrices().pop();
            VertexConsumerProvider.Immediate $this$draw$iv = consumers;
            Intrinsics.checkNotNull(layer);
            RenderLayer layer$iv = layer;
            boolean bl2 = false;
            var16_19.draw((RenderLayer)var17_21);
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

    private final int maxTrailPoints() {
        return RangesKt.coerceAtLeast((int)(((Number)length.getValue()).floatValue() * 240.0f), 120);
    }

    @Override
    public void onEnable() {
        trail.clear();
    }

    private static final boolean onRender3D$lambda$1(Function1 $tmp0, Object p0) {
        return (Boolean)$tmp0.invoke(p0);
    }

    static {
        String[] stringArray = new String[2];
        stringArray[0] = "\u041b\u0438\u043d\u0438\u044f";
        stringArray[1] = "\u041d\u043e\u0432\u044b\u0439";
        mode = Module.mode$default(INSTANCE, "\u0421\u0442\u0438\u043b\u044c", CollectionsKt.listOf(stringArray), 0, null, 12, null);
        length = Module.slider$default(INSTANCE, "\u0414\u043b\u0438\u043d\u0430", 0.3f, 0.1f, 2.0f, 0.1f, null, 32, null);
        size = Module.slider$default(INSTANCE, "\u0420\u0430\u0437\u043c\u0435\u0440", 2.0f, 0.5f, 4.0f, 0.1f, null, 32, null).setVisible(\u0627\u0651::size$lambda$0);
        useClientColor = Module.boolean$default(INSTANCE, "\u0426\u0432\u0435\u0442 \u043a\u043b\u0438\u0435\u043d\u0442\u0430", false, null, 4, null);
        Module module = INSTANCE;
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        trailColor = Module.color$default(module, "\u0426\u0432\u0435\u0442", color, null, 4, null).setVisible(\u0627\u0651::trailColor$lambda$0);
        Identifier identifier = Identifier.of((String)"rain", (String)"images/particles/glow.png");
        Intrinsics.checkNotNullExpressionValue(identifier, "fromNamespaceAndPath(...)");
        glowTexture = identifier;
        Identifier identifier2 = Identifier.of((String)"rain", (String)"images/particles/point.png");
        Intrinsics.checkNotNullExpressionValue(identifier2, "fromNamespaceAndPath(...)");
        pointTexture = identifier2;
        trail = new ArrayList();
    }

    private \u0627\u0651() {
        super("Trails", \u0638\u0646.getRENDER(), "\u0412\u0438\u0437\u0443\u0430\u043b\u044c\u043d\u044b\u0439 \u0441\u043b\u0435\u0434 \u0437\u0430 \u0438\u0433\u0440\u043e\u043a\u043e\u043c");
    }

    private static final boolean trailColor$lambda$0() {
        return !((Boolean)useClientColor.getValue()).booleanValue();
    }

    private final Color tintedColor(int alpha) {
        Color baseColor = this.selectedColor();
        return new Color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), RangesKt.coerceIn(alpha, 0, 255));
    }

    private static final boolean size$lambda$0() {
        return mode.getSelectedIndex() == 1;
    }

    private final Vec3d getSmoothPos(PlayerEntity entity, float partialTicks) {
        Vec3d vec3d = entity.getLerpedPos(partialTicks);
        Intrinsics.checkNotNullExpressionValue(vec3d, "getPosition(...)");
        return vec3d;
    }

    private final void addRibbonQuad(VertexConsumer buffer, MatrixStack.Entry entry, float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4, Color startColor, Color endColor) {
        buffer.vertex(entry, x1, y1, z1).color(startColor.getRed(), startColor.getGreen(), startColor.getBlue(), startColor.getAlpha());
        buffer.vertex(entry, x2, y2, z2).color(startColor.getRed(), startColor.getGreen(), startColor.getBlue(), startColor.getAlpha());
        buffer.vertex(entry, x3, y3, z3).color(endColor.getRed(), endColor.getGreen(), endColor.getBlue(), endColor.getAlpha());
        buffer.vertex(entry, x4, y4, z4).color(endColor.getRed(), endColor.getGreen(), endColor.getBlue(), endColor.getAlpha());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private final void renderNewMode(Render3DEvent event, PlayerEntity player, double lifetimeSeconds) {
        if (trail.isEmpty()) {
            return;
        }
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Camera camera = \u0637\u062b.getCamera(gameRenderer);
        Vec3d cameraPos = \u0637\u062b.getPos(camera);
        RenderLayer layer = RainRenderLayers.getTrailSprite(this.resolveSpriteTexture());
        BufferAllocator allocator = new BufferAllocator(262144);
        try {
            void var9_8;
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)allocator);
            Intrinsics.checkNotNullExpressionValue(immediate, "immediate(...)");
            VertexConsumerProvider.Immediate consumers = immediate;
            VertexConsumer vertexConsumer = consumers.getBuffer(layer);
            Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
            VertexConsumer buffer = vertexConsumer;
            Color baseColor = this.selectedColor();
            Iterable $this$forEachIndexed$iv = trail;
            boolean $i$f$forEachIndexed = false;
            int index$iv = 0;
            for (Object item$iv : $this$forEachIndexed$iv) {
                MatrixStack.Entry entryMatrix;
                Vec3d renderPos;
                int n;
                if ((n = index$iv++) < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair entry = (Pair)item$iv;
                int index = n;
                boolean bl = false;
                Intrinsics.checkNotNullExpressionValue(((Vec3d)entry.getSecond()).subtract(cameraPos), "subtract(...)");
                int alpha = INSTANCE.alpha(((Number)entry.getFirst()).longValue(), lifetimeSeconds);
                if (alpha <= 0) continue;
                Color finalColor = new Color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), RangesKt.coerceIn(alpha, 0, 255));
                float scale = ((Number)size.getValue()).floatValue();
                event.getMatrices().push();
                event.getMatrices().translate(renderPos.x, renderPos.y + (double)\u0637\u062b.getHeight((Entity)player) * 0.5, renderPos.z);
                event.getMatrices().multiply((Quaternionfc)camera.getRotation());
                event.getMatrices().scale(0.1f, 0.1f, 0.1f);
                Intrinsics.checkNotNullExpressionValue(event.getMatrices().peek(), "last(...)");
                buffer.vertex(entryMatrix, -scale, scale, 0.0f).color(finalColor.getRed(), finalColor.getGreen(), finalColor.getBlue(), finalColor.getAlpha()).texture(0.0f, 0.0f);
                buffer.vertex(entryMatrix, scale, scale, 0.0f).color(finalColor.getRed(), finalColor.getGreen(), finalColor.getBlue(), finalColor.getAlpha()).texture(1.0f, 0.0f);
                buffer.vertex(entryMatrix, scale, -scale, 0.0f).color(finalColor.getRed(), finalColor.getGreen(), finalColor.getBlue(), finalColor.getAlpha()).texture(1.0f, 1.0f);
                buffer.vertex(entryMatrix, -scale, -scale, 0.0f).color(finalColor.getRed(), finalColor.getGreen(), finalColor.getBlue(), finalColor.getAlpha()).texture(0.0f, 1.0f);
                event.getMatrices().pop();
            }
            void var12_12 = var9_8;
            boolean bl = false;
            var12_12.draw();
        }
        catch (Throwable throwable) {
            void var8_7;
            var8_7.close();
            throw throwable;
        }
        allocator.close();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private final void renderRibbonLine(Render3DEvent event, PlayerEntity player, Vec3d cameraPos, List<TrailsModule.TrailPoint> points, boolean top) {
        AutoCloseable autoCloseable = (AutoCloseable)new BufferAllocator(262144);
        Throwable throwable = null;
        try {
            void var17_19;
            BufferAllocator allocator = (BufferAllocator)autoCloseable;
            boolean bl = false;
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)allocator);
            Intrinsics.checkNotNullExpressionValue(immediate, "immediate(...)");
            VertexConsumerProvider.Immediate consumers = immediate;
            RenderLayer layer = RainRenderLayers.getHitBoxLine(3.0);
            VertexConsumer vertexConsumer = consumers.getBuffer(layer);
            Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
            VertexConsumer buffer = vertexConsumer;
            Box box = player.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(box, "getBoundingBox(...)");
            float hitboxHeight = RangesKt.coerceAtLeast((float)\u0637\u062b.getLengthY(box), \u0637\u062b.getHeight((Entity)player));
            float bottomOffset = 0.02f;
            float topOffset = 0.02f;
            event.getMatrices().push();
            event.getMatrices().translate(-cameraPos.x, -cameraPos.y, -cameraPos.z);
            MatrixStack.Entry entry = event.getMatrices().peek();
            Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
            MatrixStack.Entry entry2 = entry;
            Iterable $this$forEach$iv = points;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                void $this$normal$iv;
                TrailsModule.TrailPoint point = (TrailsModule.TrailPoint)element$iv;
                boolean bl2 = false;
                Color color = INSTANCE.tintedColor(point.getAlpha());
                float y = top ? (float)point.getPosition().y + hitboxHeight - topOffset : (float)point.getPosition().y + bottomOffset;
                Intrinsics.checkNotNullExpressionValue(buffer.vertex(entry2, (float)point.getPosition().x, y, (float)point.getPosition().z).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()), "setColor(...)");
                MatrixStack.Entry entry$iv = entry2;
                float x$iv = 0.0f;
                float y$iv = 1.0f;
                float z$iv = 0.0f;
                boolean $i$f$normal = false;
                VertexConsumer vertexConsumer2 = $this$normal$iv.normal(entry$iv, x$iv, y$iv, z$iv);
                Intrinsics.checkNotNullExpressionValue(vertexConsumer2, "setNormal(...)");
                vertexConsumer2.lineWidth(3.0f);
            }
            event.getMatrices().pop();
            VertexConsumerProvider.Immediate $this$draw$iv = consumers;
            Intrinsics.checkNotNull(layer);
            RenderLayer renderLayer = layer;
            boolean bl3 = false;
            var17_19.draw(renderLayer);
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

    private final int alpha(long createdAt, double lifetimeSeconds) {
        long currentTime = System.currentTimeMillis();
        double timeLeft = lifetimeSeconds * 1000.0 - (double)(currentTime - createdAt);
        double lifetimeMillis = lifetimeSeconds * 1000.0;
        double progress = lifetimeMillis <= 0.0 ? 0.0 : timeLeft / lifetimeMillis;
        return MathHelper.clamp((int)((int)(150.0 * progress)), (int)0, (int)150);
    }

    /*
     * WARNING - void declaration
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        if (!this.isEnabled()) {
            return;
        }
        if (\u0636\u0643.getMc().world == null) {
            return;
        }
        double lifetimeSeconds = ((Number)length.getValue()).floatValue();
        long lifetimeMillis = RangesKt.coerceAtLeast((long)(lifetimeSeconds * 1000.0), 1L);
        long currentTime = System.currentTimeMillis();
        trail.removeIf(arg_0 -> \u0627\u0651.onRender3D$lambda$1(arg_0 -> \u0627\u0651.onRender3D$lambda$0(currentTime, lifetimeMillis, arg_0), arg_0));
        Vec3d smoothPos = this.getSmoothPos((PlayerEntity)player, event.getPartialTicks());
        Pair pair = (Pair)CollectionsKt.lastOrNull((List)trail);
        Vec3d lastTrailPos = pair != null ? (Vec3d)pair.getSecond() : null;
        if (lastTrailPos == null || lastTrailPos.squaredDistanceTo(smoothPos) > 1.0E-4) {
            trail.add(TuplesKt.to(currentTime, smoothPos));
            while (trail.size() > this.maxTrailPoints()) {
                trail.remove(0);
            }
        }
        GameOptions gameOptions = \u0636\u0643.getMc().options;
        Intrinsics.checkNotNullExpressionValue(gameOptions, "options");
        if (\u0637\u062b.getPerspective(gameOptions).isFirstPerson()) {
            return;
        }
        if (mode.getSelectedIndex() == 0) {
            this.renderLineMode(event, (PlayerEntity)player, lifetimeSeconds);
        } else {
            void var3_3;
            this.renderNewMode(event, (PlayerEntity)player, (double)var3_3);
        }
    }
}

