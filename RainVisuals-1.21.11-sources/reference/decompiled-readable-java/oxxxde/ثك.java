/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.util.BufferAllocator
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 */
package oxxxde;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotakbaz.rain.event.events.ItemUseEvent;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.player.FuntimeHelperModule;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RainRenderLayers;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627\u064f;
import oxxxde.\u062a\u062f;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0637\u063a;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001sB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\rH\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J?\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\b \u0010!J?\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\b\"\u0010!J7\u0010(\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0002\u00a2\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002\u00a2\u0006\u0004\b,\u0010-J'\u00102\u001a\u00020+2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020$H\u0002\u00a2\u0006\u0004\b2\u00103J-\u00104\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020$H\u0002\u00a2\u0006\u0004\b4\u00105J#\u00108\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$072\u0006\u00106\u001a\u00020&H\u0002\u00a2\u0006\u0004\b8\u00109J'\u0010?\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:2\u0006\u0010>\u001a\u00020=H\u0002\u00a2\u0006\u0004\b?\u0010@J\u001f\u0010E\u001a\u00020D2\u0006\u0010A\u001a\u00020:2\u0006\u0010C\u001a\u00020BH\u0002\u00a2\u0006\u0004\bE\u0010FJ-\u0010K\u001a\u00020\u00122\u0006\u0010G\u001a\u00020D2\u0006\u0010H\u001a\u00020D2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020D0IH\u0002\u00a2\u0006\u0004\bK\u0010LJ\u0011\u0010M\u001a\u0004\u0018\u00010\u001cH\u0002\u00a2\u0006\u0004\bM\u0010NJ\u001d\u0010P\u001a\u00020\u00122\f\u0010O\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002\u00a2\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\bT\u0010\u0003R\u0014\u0010U\u001a\u00020&8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020&8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bW\u0010VR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020&8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b[\u0010VR\u0014\u0010\\\u001a\u00020$8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020$8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b^\u0010]R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020D0I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b_\u0010`R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020D0I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\ba\u0010`R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020D0I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bb\u0010`R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020D0I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bc\u0010`R\u0014\u0010d\u001a\u00020B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bf\u0010eR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bj\u0010iR\u0014\u0010k\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bk\u0010iR\u0014\u0010l\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bl\u0010iR\u0014\u0010m\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bm\u0010iR\u0014\u0010n\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bn\u0010iR\u0014\u0010o\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bo\u0010iR\u0014\u0010p\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bp\u0010iR\u0014\u0010q\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bq\u0010iR\u0016\u0010r\u001a\u00020X8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\br\u0010Z\u00a8\u0006t"}, d2={"Loxxxde/\u062b\u0643;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u062c\u0645;", "event", "", "onItemUse", "(Lkotakbaz/rain/event/events/ItemUseEvent;)V", "Lnet/minecraft/class_332;", "context", "renderTrapTimer", "(Lnet/minecraft/class_332;)V", "Loxxxde/\u0634\u062b;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_4597$class_4598;", "consumers", "", "enderEye", "sugarDust", "fireTornado", "aura", "renderCircles", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4597$class_4598;ZZZZ)V", "Lnet/minecraft/class_4588;", "quadBuffer", "lineBuffer", "", "cameraX", "cameraY", "cameraZ", "renderTrapkaCube", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4588;Lnet/minecraft/class_4588;DDD)V", "renderPlastPreview", "radius", "", "segments", "", "lineWidth", "renderCircle", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4597$class_4598;DIF)V", "", "Lnet/minecraft/class_238;", "collectPlastPreviewBoxes", "()Ljava/util/List;", "Lnet/minecraft/class_2338;", "blockPos", "dirX", "dirZ", "createCardinalPlastBox", "(Lnet/minecraft/class_2338;II)Lnet/minecraft/class_238;", "createDiagonalPlastBoxes", "(Lnet/minecraft/class_2338;II)Ljava/util/List;", "yaw", "Lkotlin/Pair;", "directionFromYaw", "(F)Lkotlin/Pair;", "Lnet/minecraft/class_1799;", "mainHand", "offHand", "Lnet/minecraft/class_1792;", "item", "isHeld", "(Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;Lnet/minecraft/class_1792;)Z", "stack", "Loxxxde/\u062d\u0623;", "cache", "", "normalizedName", "(Lnet/minecraft/class_1799;Lkotakbaz/rain/module/modules/player/FuntimeHelperModule$HeldNameCache;)Ljava/lang/String;", "mainName", "offName", "", "keywords", "containsKeyword", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z", "remainingTrapSeconds", "()Ljava/lang/Double;", "boxes", "hasPlayerInBoxes", "(Ljava/util/List;)Z", "hasPlayerInRadius", "(D)Z", "onDisable", "PLAST_PITCH_THRESHOLD", "F", "PREVIEW_OUTLINE_WIDTH", "", "TRAP_TIMER_DURATION_MS", "J", "CIRCLE_LINE_WIDTH_MULTIPLIER", "LARGE_CIRCLE_SEGMENTS", "I", "SMALL_CIRCLE_SEGMENTS", "enderEyeKeywords", "[Ljava/lang/String;", "sugarDustKeywords", "fireTornadoKeywords", "godsAuraKeywords", "mainHandNameCache", "Loxxxde/\u062d\u0623;", "offHandNameCache", "Loxxxde/\u062e\u0630;", "trapka", "Loxxxde/\u062e\u0630;", "timeTrap", "dragonTrap", "plast", "greenInTarget", "enderEyeCircle", "sugarDustCircle", "fireTornadoCircle", "godsAura", "trapTimerStartedAt", "HeldNameCache", "rain-visuals"})
public final class \u062b\u0643
extends Module {
    private static long trapTimerStartedAt;
    @NotNull
    public static final \u062b\u0643 INSTANCE;
    @NotNull
    private static final BooleanSetting enderEyeCircle;
    private static final float PLAST_PITCH_THRESHOLD = 45.0f;
    @NotNull
    private static final BooleanSetting fireTornadoCircle;
    private static final int SMALL_CIRCLE_SEGMENTS = 64;
    @NotNull
    private static final BooleanSetting sugarDustCircle;
    @NotNull
    private static final BooleanSetting plast;
    @NotNull
    private static final FuntimeHelperModule.HeldNameCache offHandNameCache;
    @NotNull
    private static final BooleanSetting greenInTarget;
    private static final float PREVIEW_OUTLINE_WIDTH = 1.0f;
    @NotNull
    private static final String[] fireTornadoKeywords;
    @NotNull
    private static final BooleanSetting dragonTrap;
    private static final int LARGE_CIRCLE_SEGMENTS = 128;
    @NotNull
    private static final BooleanSetting trapka;
    private static final float CIRCLE_LINE_WIDTH_MULTIPLIER = 1.15f;
    private static final long TRAP_TIMER_DURATION_MS = 15000L;
    @NotNull
    private static final FuntimeHelperModule.HeldNameCache mainHandNameCache;
    @NotNull
    private static final String[] sugarDustKeywords;
    @NotNull
    private static final String[] godsAuraKeywords;
    @NotNull
    private static final String[] enderEyeKeywords;
    @NotNull
    private static final BooleanSetting timeTrap;
    @NotNull
    private static final BooleanSetting godsAura;

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean hasPlayerInBoxes(List<? extends Box> boxes) {
        boolean bl;
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return false;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return false;
        }
        ClientWorld world = clientWorld;
        List list = world.getPlayers();
        Intrinsics.checkNotNullExpressionValue(list, "players(...)");
        Iterable $this$any$iv = list;
        boolean $i$f$any = false;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            return false;
        }
        Iterator iterator2 = $this$any$iv.iterator();
        do {
            if (!iterator2.hasNext()) return false;
            Object element$iv = iterator2.next();
            AbstractClientPlayerEntity other = (AbstractClientPlayerEntity)element$iv;
            boolean bl2 = false;
            if (!Intrinsics.areEqual(other, player)) {
                boolean bl3;
                Iterable $this$any$iv2 = boxes;
                boolean $i$f$any2 = false;
                if ($this$any$iv2 instanceof Collection && ((Collection)$this$any$iv2).isEmpty()) {
                    bl3 = false;
                } else {
                    for (Object element$iv2 : $this$any$iv2) {
                        void var14_14;
                        Box box = (Box)element$iv2;
                        boolean bl4 = false;
                        if (!var14_14.intersects(other.getBoundingBox())) continue;
                        return true;
                    }
                    bl3 = false;
                }
                if (bl3) {
                    return true;
                }
            }
            bl = false;
        } while (!bl);
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderPlastPreview(Render3DEvent event, VertexConsumer quadBuffer, VertexConsumer lineBuffer, double cameraX, double cameraY, double cameraZ) {
        List<Box> previewBoxes = this.collectPlastPreviewBoxes();
        if (previewBoxes.isEmpty()) {
            return;
        }
        boolean danger = ((Boolean)greenInTarget.getValue()).booleanValue() && this.hasPlayerInBoxes(previewBoxes);
        Color outlineColor = danger ? new Color(0, 255, 0, 255) : new Color(255, 255, 255, 255);
        Color fillColor = new Color(outlineColor.getRed(), outlineColor.getGreen(), outlineColor.getBlue(), 38);
        Iterator<Box> iterator2 = previewBoxes.iterator();
        while (iterator2.hasNext()) {
            Box box;
            void y$iv;
            void x$iv;
            void $this$offset$iv;
            Box worldBox;
            Box box2 = worldBox = iterator2.next();
            double d = -cameraX;
            double d2 = -cameraY;
            double z$iv = -cameraZ;
            boolean $i$f$offset = false;
            Intrinsics.checkNotNullExpressionValue($this$offset$iv.offset((double)x$iv, (double)y$iv, z$iv), "move(...)");
            \u062a\u062f.draw$default(\u062a\u062f.INSTANCE, event, quadBuffer, null, box, fillColor, true, false, false, 0.0f, 0.0f, 0.0f, 1028, null);
            \u062a\u062f.draw$default(\u062a\u062f.INSTANCE, event, quadBuffer, lineBuffer, box, outlineColor, false, true, false, 1.0f, 0.0f, 0.0f, 1024, null);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final List<Box> createDiagonalPlastBoxes(BlockPos blockPos, int dirX, int dirZ) {
        void var12_12;
        void $this$mapTo$iv$iv;
        int centerX = blockPos.getX() + dirX * 2;
        int centerZ = blockPos.getZ() + dirZ * 2;
        int perpDirX = -dirZ;
        int perpDirZ = dirX;
        int baseY = blockPos.getY() + 1;
        Iterable $this$map$iv = new IntRange(-2, 2);
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        Iterator iterator2 = $this$mapTo$iv$iv.iterator();
        while (iterator2.hasNext()) {
            void var19_19;
            int item$iv$iv;
            int index = item$iv$iv = ((IntIterator)iterator2).nextInt();
            Collection collection = destination$iv$iv;
            boolean bl = false;
            int boxX = centerX + index * perpDirX;
            int boxZ = centerZ + index * perpDirZ;
            collection.add(new Box((double)boxX, (double)(baseY - 2), (double)boxZ, (double)(boxX + 1), (double)(baseY + 3), (double)(var19_19 + true)));
        }
        return (List)var12_12;
    }

    private static final boolean timeTrap$lambda$0() {
        return (Boolean)trapka.getValue();
    }

    @Override
    public void onDisable() {
        trapTimerStartedAt = 0L;
    }

    private final void renderCircles(Render3DEvent event, VertexConsumerProvider.Immediate consumers, boolean enderEye, boolean sugarDust, boolean fireTornado, boolean aura) {
        if (enderEye) {
            this.renderCircle(event, consumers, 10.0, 128, 2.0f);
        }
        if (sugarDust) {
            this.renderCircle(event, consumers, 10.0, 128, 2.0f);
        }
        if (fireTornado) {
            this.renderCircle(event, consumers, 10.0, 128, 2.0f);
        }
        if (aura) {
            this.renderCircle(event, consumers, 2.0, 64, 3.0f);
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void renderTrapTimer(@NotNull DrawContext context) {
        void $this$getWidth$iv;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!(this.isEnabled() && ((Boolean)trapka.getValue()).booleanValue() && ((Boolean)timeTrap.getValue()).booleanValue())) {
            return;
        }
        Double d = this.remainingTrapSeconds();
        if (d == null) {
            return;
        }
        double remaining = d;
        Locale locale = Locale.US;
        String string = "%.1f";
        Object[] objectArray = new Object[1];
        objectArray[0] = remaining;
        String string2 = String.format(locale, string, Arrays.copyOf(objectArray, objectArray.length));
        Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
        String text = "\u0422\u0440\u0430\u043f\u043a\u0430 \u0438\u0441\u0447\u0435\u0437\u043d\u0435\u0442 \u0447\u0435\u0440\u0435\u0437: " + string2;
        int n = context.getScaledWindowWidth();
        TextRenderer textRenderer = \u0636\u0643.getMc().textRenderer;
        Intrinsics.checkNotNullExpressionValue(textRenderer, "font");
        locale = textRenderer;
        String text$iv = text;
        boolean $i$f$getWidth = false;
        int x = (n - $this$getWidth$iv.getWidth(text$iv)) / 2;
        int y = context.getScaledWindowHeight() - MathKt.roundToInt(\u0637\u063a.INSTANCE.scaled(68.0f));
        int color = remaining <= 3.0 ? -43691 : -1250064;
        context.drawTextWithShadow(\u0636\u0643.getMc().textRenderer, text, x, y, color);
    }

    private final boolean containsKeyword(String mainName, String offName, String[] keywords) {
        int n = keywords.length;
        for (int i = 0; i < n; ++i) {
            String keyword = keywords[i];
            if (!StringsKt.contains$default((CharSequence)mainName, keyword, false, 2, null)) {
                if (!StringsKt.contains$default((CharSequence)offName, keyword, false, 2, null)) continue;
            }
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private final List<Box> collectPlastPreviewBoxes() {
        List<Box> list;
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return CollectionsKt.emptyList();
        }
        ClientPlayerEntity player = clientPlayerEntity;
        BlockPos blockPos = BlockPos.ofFloored((double)player.getX(), (double)player.getY(), (double)player.getZ());
        Intrinsics.checkNotNullExpressionValue(blockPos, "containing(...)");
        BlockPos blockPos2 = blockPos;
        float pitch = \u0637\u062b.getPitch((Entity)player);
        if (Math.abs(pitch) > 45.0f) {
            double yOffset = pitch > 0.0f ? -3.0 : 2.0;
            return CollectionsKt.listOf(new Box((double)blockPos2.getX() - 2.0, (double)blockPos2.getY() + yOffset, (double)blockPos2.getZ() - 2.0, (double)blockPos2.getX() + 3.0, (double)blockPos2.getY() + yOffset + 2.0, (double)blockPos2.getZ() + 3.0));
        }
        Pair<Integer, Integer> pair = this.directionFromYaw(\u0637\u062b.getYaw((Entity)player));
        int dirX = ((Number)pair.component1()).intValue();
        int dirZ = ((Number)pair.component2()).intValue();
        if (dirX != 0 && dirZ != 0) {
            void var6_7;
            void var5_6;
            void var2_2;
            list = this.createDiagonalPlastBoxes((BlockPos)var2_2, (int)var5_6, (int)var6_7);
            return list;
        }
        list = CollectionsKt.listOf(this.createCardinalPlastBox(blockPos2, dirX, dirZ));
        return list;
    }

    /*
     * WARNING - void declaration
     */
    @Commando
    public final void onItemUse(@NotNull ItemUseEvent event) {
        void $this$getStackInHand$iv;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(this.isEnabled() && ((Boolean)trapka.getValue()).booleanValue() && ((Boolean)timeTrap.getValue()).booleanValue())) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        if (event.getPlayer() != player) {
            return;
        }
        if (Intrinsics.areEqual(event.getActionResult(), ActionResult.FAIL)) {
            return;
        }
        LivingEntity livingEntity = (LivingEntity)event.getPlayer();
        Hand hand$iv = event.getHand();
        boolean $i$f$getStackInHand = false;
        ItemStack itemStack = $this$getStackInHand$iv.getStackInHand(hand$iv);
        Intrinsics.checkNotNullExpressionValue(itemStack, "getItemInHand(...)");
        ItemStack stack = itemStack;
        if (!stack.isOf(Items.NETHERITE_SCRAP)) {
            return;
        }
        trapTimerStartedAt = System.currentTimeMillis();
    }

    /*
     * WARNING - void declaration
     */
    private final void renderTrapkaCube(Render3DEvent event, VertexConsumer quadBuffer, VertexConsumer lineBuffer, double cameraX, double cameraY, double cameraZ) {
        void var29_18;
        void var31_25;
        void var3_3;
        void x$iv;
        void $this$offset$iv;
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        BlockPos blockPos = BlockPos.ofFloored((double)player.getX(), (double)player.getY(), (double)player.getZ());
        Intrinsics.checkNotNullExpressionValue(blockPos, "containing(...)");
        BlockPos blockPos2 = blockPos;
        double dragonExpand = ((Boolean)dragonTrap.getValue()).booleanValue() ? 2.0 : 0.0;
        double dragonOffset = ((Boolean)dragonTrap.getValue()).booleanValue() ? 1.0 : 0.0;
        double x0 = (double)blockPos2.getX() - 2.0 - dragonOffset;
        double y0 = (double)blockPos2.getY() - 2.0 + 2.01;
        double z0 = (double)blockPos2.getZ() - 2.0 - dragonOffset;
        double x1 = x0 + 5.01 + dragonExpand;
        double y1 = y0 + 4.01 + dragonExpand;
        double z1 = z0 + 5.0 + dragonExpand;
        boolean danger = ((Boolean)greenInTarget.getValue()).booleanValue() && this.hasPlayerInRadius(3.1);
        Color outlineColor = danger ? new Color(0, 255, 0, 255) : new Color(255, 255, 255, 255);
        Color fillColor = new Color(outlineColor.getRed(), outlineColor.getGreen(), outlineColor.getBlue(), 38);
        Box box = new Box(x0, y0, z0, x1, y1, z1);
        double d = -cameraX;
        double y$iv = -cameraY;
        double z$iv = -cameraZ;
        boolean $i$f$offset = false;
        Box box2 = $this$offset$iv.offset((double)x$iv, y$iv, z$iv);
        Intrinsics.checkNotNullExpressionValue(box2, "move(...)");
        Box box3 = box2;
        \u062a\u062f.draw$default(\u062a\u062f.INSTANCE, event, quadBuffer, null, box3, fillColor, true, false, false, 0.0f, 0.0f, 0.0f, 1028, null);
        \u062a\u062f.draw$default(\u062a\u062f.INSTANCE, event, quadBuffer, (VertexConsumer)var3_3, (Box)var31_25, (Color)var29_18, false, true, false, 1.0f, 0.0f, 0.0f, 1024, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean hasPlayerInRadius(double radius) {
        boolean bl;
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return false;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return false;
        }
        ClientWorld world = clientWorld;
        float maxDistance = (float)radius;
        List list = world.getPlayers();
        Intrinsics.checkNotNullExpressionValue(list, "players(...)");
        Iterable $this$any$iv = list;
        boolean $i$f$any = false;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            return false;
        }
        Iterator iterator2 = $this$any$iv.iterator();
        do {
            if (!iterator2.hasNext()) return false;
            Object element$iv = iterator2.next();
            AbstractClientPlayerEntity other = (AbstractClientPlayerEntity)element$iv;
            boolean bl2 = false;
            if (!Intrinsics.areEqual(other, player)) {
                if (other.distanceTo((Entity)player) <= maxDistance) {
                    return true;
                }
            }
            bl = false;
        } while (!bl);
        return true;
    }

    private final Double remainingTrapSeconds() {
        if (trapTimerStartedAt <= 0L) {
            return null;
        }
        long elapsed = System.currentTimeMillis() - trapTimerStartedAt;
        long remainingMs = 15000L - elapsed;
        if (remainingMs <= 0L) {
            trapTimerStartedAt = 0L;
            return null;
        }
        return (double)remainingMs / 1000.0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isHeld(ItemStack mainHand, ItemStack offHand, Item item) {
        if (mainHand.isOf(item)) return true;
        if (!offHand.isOf(item)) return false;
        return true;
    }

    static {
        INSTANCE = new \u062b\u0643();
        String[] stringArray = new String[4];
        stringArray[0] = "\u0434\u0435\u0437\u043e\u0440";
        stringArray[1] = "\u043e\u043a\u043e \u0434\u0435\u0437\u043e\u0440\u0438\u0435\u043d\u0442\u0430\u0446\u0438\u0438";
        stringArray[2] = "disorientation eye";
        stringArray[3] = "eye of disorientation";
        enderEyeKeywords = stringArray;
        stringArray = new String[4];
        stringArray[0] = "\u044f\u0432\u043d\u0430\u044f";
        stringArray[1] = "\u043f\u044b\u043b\u044c";
        stringArray[2] = "\u0441\u0430\u0445\u0430\u0440";
        stringArray[3] = "sugar";
        sugarDustKeywords = stringArray;
        stringArray = new String[4];
        stringArray[0] = "\u043e\u0433\u043d";
        stringArray[1] = "\u0441\u043c\u0435\u0440\u0447";
        stringArray[2] = "fire";
        stringArray[3] = "tornado";
        fireTornadoKeywords = stringArray;
        stringArray = new String[4];
        stringArray[0] = "\u0431\u043e\u0436";
        stringArray[1] = "\u0430\u0443\u0440";
        stringArray[2] = "god";
        stringArray[3] = "aura";
        godsAuraKeywords = stringArray;
        mainHandNameCache = new FuntimeHelperModule.HeldNameCache();
        offHandNameCache = new FuntimeHelperModule.HeldNameCache();
        trapka = Module.boolean$default(INSTANCE, "\u0422\u0440\u0430\u043f\u043a\u0430", true, null, 4, null);
        timeTrap = Module.boolean$default(INSTANCE, "\u0422\u0430\u0439\u043c\u0435\u0440 \u0442\u0440\u0430\u043f\u043a\u0438", true, null, 4, null).setVisible(\u062b\u0643::timeTrap$lambda$0);
        dragonTrap = Module.boolean$default(INSTANCE, "\u0414\u0440\u0430\u043a\u043e\u043d\u044c\u044f \u0442\u0440\u0430\u043f\u043a\u0430", true, null, 4, null).setVisible(\u062b\u0643::dragonTrap$lambda$0);
        plast = Module.boolean$default(INSTANCE, "\u041f\u043b\u0430\u0441\u0442", true, null, 4, null);
        greenInTarget = Module.boolean$default(INSTANCE, "\u0418\u0437\u043c\u0435\u043d\u044f\u0442\u044c \u0446\u0432\u0435\u0442 \u043f\u0440\u0438 \u0438\u0433\u0440\u043e\u043a\u0435", true, null, 4, null).setVisible(\u062b\u0643::greenInTarget$lambda$0);
        enderEyeCircle = Module.boolean$default(INSTANCE, "\u0414\u0435\u0437\u043e\u0440\u0435\u0438\u043d\u0442\u0430\u0446\u0438\u044f", true, null, 4, null);
        sugarDustCircle = Module.boolean$default(INSTANCE, "\u042f\u0432\u043d\u0430\u044f \u043f\u044b\u043b\u044c", true, null, 4, null);
        fireTornadoCircle = Module.boolean$default(INSTANCE, "\u041e\u0433\u043d\u0435\u043d\u043d\u044b\u0439 \u0441\u043c\u0435\u0440\u0447", true, null, 4, null);
        godsAura = Module.boolean$default(INSTANCE, "\u0411\u043e\u0436\u044c\u044f \u0430\u0443\u0440\u0430", true, null, 4, null);
        \u0627\u064f.moduleOnFuntime$default(\u0627\u064f.INSTANCE, INSTANCE, null, 2, null);
    }

    private static final boolean greenInTarget$lambda$0() {
        return ((Boolean)trapka.getValue()).booleanValue() || ((Boolean)plast.getValue()).booleanValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    private final Pair<Integer, Integer> directionFromYaw(float yaw) {
        Pair<Integer, Integer> pair;
        float normalizedYaw;
        block10: {
            block9: {
                normalizedYaw = (yaw % 360.0f + 360.0f) % 360.0f;
                if (normalizedYaw >= 337.5f) break block9;
                if (!(normalizedYaw < 22.5f)) break block10;
            }
            pair = TuplesKt.to(0, 1);
            return pair;
        }
        if (normalizedYaw < 67.5f) {
            pair = TuplesKt.to(-1, 1);
            return pair;
        }
        if (normalizedYaw < 112.5f) {
            pair = TuplesKt.to(-1, 0);
            return pair;
        }
        if (normalizedYaw < 157.5f) {
            pair = TuplesKt.to(-1, -1);
            return pair;
        }
        if (normalizedYaw < 202.5f) {
            pair = TuplesKt.to(0, -1);
            return pair;
        }
        if (normalizedYaw < 247.5f) {
            pair = TuplesKt.to(1, -1);
            return pair;
        }
        if (normalizedYaw < 292.5f) {
            pair = TuplesKt.to(1, 0);
            return pair;
        }
        pair = TuplesKt.to(1, 1);
        return pair;
    }

    /*
     * WARNING - void declaration
     */
    private final void renderCircle(Render3DEvent event, VertexConsumerProvider.Immediate consumers, double radius, int segments, float lineWidth) {
        void var26_23;
        void var25_21;
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Vec3d cameraPos = \u0637\u062b.getPos(\u0637\u062b.getCamera(gameRenderer));
        Vec3d vec3d = player.getLerpedPos(event.getPartialTicks());
        Intrinsics.checkNotNullExpressionValue(vec3d, "getPosition(...)");
        Vec3d playerPos = vec3d;
        double centerX = playerPos.x - cameraPos.x;
        double centerY = playerPos.y - cameraPos.y + 1.2;
        double centerZ = playerPos.z - cameraPos.z;
        double distance = Math.sqrt(centerX * centerX + centerY * centerY + centerZ * centerZ);
        float scaledLineWidth = lineWidth * 1.15f;
        float adjustedLineWidth = RangesKt.coerceIn((float)((double)scaledLineWidth / Math.max(1.0, distance / 20.0)), 1.0f, scaledLineWidth);
        RenderLayer layer = RainRenderLayers.getDebugLineStrip(adjustedLineWidth);
        VertexConsumer vertexConsumer = consumers.getBuffer(layer);
        Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
        VertexConsumer buffer = vertexConsumer;
        boolean danger = this.hasPlayerInRadius(radius);
        Color color = danger ? new Color(0, 255, 0, 230) : new Color(255, 255, 255, 255);
        MatrixStack.Entry entry = event.getMatrices().peek();
        Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
        MatrixStack.Entry entry2 = entry;
        int index = 0;
        if (index <= segments) {
            while (true) {
                void entry$iv;
                void $this$normal$iv;
                double angle = Math.PI * 2 * (double)index / (double)segments;
                double x = centerX + Math.cos(angle) * radius;
                double z = centerZ + Math.sin(angle) * radius;
                Intrinsics.checkNotNullExpressionValue(buffer.vertex(entry2, (float)x, (float)centerY, (float)z).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()), "setColor(...)");
                MatrixStack.Entry entry3 = entry2;
                float x$iv = 0.0f;
                float y$iv = 1.0f;
                float z$iv = 0.0f;
                boolean $i$f$normal = false;
                VertexConsumer vertexConsumer2 = $this$normal$iv.normal((MatrixStack.Entry)entry$iv, x$iv, y$iv, z$iv);
                Intrinsics.checkNotNullExpressionValue(vertexConsumer2, "setNormal(...)");
                vertexConsumer2.lineWidth(adjustedLineWidth);
                if (index == segments) break;
                ++index;
            }
        }
        VertexConsumerProvider.Immediate $this$draw$iv = consumers;
        Intrinsics.checkNotNull(layer);
        RenderLayer layer$iv = layer;
        boolean bl = false;
        var25_21.draw((RenderLayer)var26_23);
    }

    private \u062b\u0643() {
        super("FuntimeHelper", \u0638\u0646.getPLAYER(), "\u041f\u043e\u043b\u0435\u0437\u043d\u044b\u0435 \u0443\u0442\u0438\u043b\u0438\u0442\u044b \u0434\u043b\u044f \u0441\u0435\u0440\u0432\u0435\u0440\u0430 FunTime");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isEnabled()) {
            return;
        }
        v0 = \u0636\u0643.getMc().player;
        if (v0 == null) {
            return;
        }
        player = v0;
        v1 = player.getMainHandStack();
        Intrinsics.checkNotNullExpressionValue(v1, "getMainHandItem(...)");
        mainHand = v1;
        v2 = player.getOffHandStack();
        Intrinsics.checkNotNullExpressionValue(v2, "getOffhandItem(...)");
        offHand = v2;
        if (!((Boolean)\u062b\u0643.trapka.getValue()).booleanValue()) ** GOTO lbl-1000
        v3 = Items.NETHERITE_SCRAP;
        Intrinsics.checkNotNullExpressionValue(v3, "NETHERITE_SCRAP");
        if (this.isHeld(mainHand, offHand, v3)) {
            v4 = true;
        } else lbl-1000:
        // 2 sources

        {
            v4 = false;
        }
        shouldRenderTrapka = v4;
        if (!((Boolean)\u062b\u0643.plast.getValue()).booleanValue()) ** GOTO lbl-1000
        v5 = Items.DRIED_KELP;
        Intrinsics.checkNotNullExpressionValue(v5, "DRIED_KELP");
        if (this.isHeld(mainHand, offHand, v5)) {
            v6 = true;
        } else lbl-1000:
        // 2 sources

        {
            v6 = false;
        }
        shouldRenderPlast = v6;
        v7 = Items.ENDER_EYE;
        Intrinsics.checkNotNullExpressionValue(v7, "ENDER_EYE");
        directEnderEye = this.isHeld(mainHand, offHand, v7);
        v8 = Items.SUGAR;
        Intrinsics.checkNotNullExpressionValue(v8, "SUGAR");
        directSugarDust = this.isHeld(mainHand, offHand, v8);
        v9 = Items.FIRE_CHARGE;
        Intrinsics.checkNotNullExpressionValue(v9, "FIRE_CHARGE");
        directFireTornado = this.isHeld(mainHand, offHand, v9);
        v10 = Items.PHANTOM_MEMBRANE;
        Intrinsics.checkNotNullExpressionValue(v10, "PHANTOM_MEMBRANE");
        directGodsAura = this.isHeld(mainHand, offHand, v10);
        needsNameFallback = (Boolean)\u062b\u0643.enderEyeCircle.getValue() != false && directEnderEye == false || (Boolean)\u062b\u0643.sugarDustCircle.getValue() != false && directSugarDust == false || (Boolean)\u062b\u0643.fireTornadoCircle.getValue() != false && directFireTornado == false || ((Boolean)\u062b\u0643.godsAura.getValue()).booleanValue() && !directGodsAura;
        mainName = needsNameFallback ? this.normalizedName(mainHand, \u062b\u0643.mainHandNameCache) : "";
        v11 = offName = needsNameFallback != false ? this.normalizedName(offHand, \u062b\u0643.offHandNameCache) : "";
        shouldRenderEnderEye = ((Boolean)\u062b\u0643.enderEyeCircle.getValue()).booleanValue() && (directEnderEye || this.containsKeyword(mainName, offName, \u062b\u0643.enderEyeKeywords));
        shouldRenderSugarDust = ((Boolean)\u062b\u0643.sugarDustCircle.getValue()).booleanValue() && (directSugarDust || this.containsKeyword(mainName, offName, \u062b\u0643.sugarDustKeywords));
        shouldRenderFireTornado = ((Boolean)\u062b\u0643.fireTornadoCircle.getValue()).booleanValue() && (directFireTornado || this.containsKeyword(mainName, offName, \u062b\u0643.fireTornadoKeywords));
        shouldRenderGodsAura = ((Boolean)\u062b\u0643.godsAura.getValue()).booleanValue() && (directGodsAura || this.containsKeyword(mainName, offName, \u062b\u0643.godsAuraKeywords));
        if (!(shouldRenderTrapka || shouldRenderPlast || shouldRenderEnderEye || shouldRenderSugarDust || shouldRenderFireTornado || shouldRenderGodsAura)) {
            return;
        }
        v12 = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(v12, "gameRenderer");
        cameraPos = \u0637\u062b.getPos(\u0637\u062b.getCamera(v12));
        var19_19 = (AutoCloseable)new BufferAllocator(262144);
        var20_20 = null;
        try {
            block20: {
                block19: {
                    allocator = (BufferAllocator)var19_19;
                    $i$a$-use-FuntimeHelperModule$onRender3D$1 = false;
                    v13 = VertexConsumerProvider.immediate((BufferAllocator)allocator);
                    Intrinsics.checkNotNullExpressionValue(v13, "immediate(...)");
                    consumers = v13;
                    v14 = consumers.getBuffer(RainRenderLayers.getHitBoxQuad(true));
                    Intrinsics.checkNotNullExpressionValue(v14, "getBuffer(...)");
                    quadBuffer = v14;
                    if (!shouldRenderTrapka && !shouldRenderPlast) break block19;
                    var25_27 = (AutoCloseable)new BufferAllocator(262144);
                    var26_29 = null;
                    try {
                        lineAllocator = (BufferAllocator)var25_27;
                        $i$a$-use-FuntimeHelperModule$onRender3D$1$1 = false;
                        v15 = VertexConsumerProvider.immediate((BufferAllocator)lineAllocator);
                        Intrinsics.checkNotNullExpressionValue(v15, "immediate(...)");
                        lineConsumers = v15;
                        v16 = lineConsumers.getBuffer(RainRenderLayers.getHitBoxLine(1.0));
                        Intrinsics.checkNotNullExpressionValue(v16, "getBuffer(...)");
                        lineBuffer = v16;
                        if (shouldRenderTrapka) {
                            \u062b\u0643.INSTANCE.renderTrapkaCube(event, quadBuffer, lineBuffer, cameraPos.x, cameraPos.y, cameraPos.z);
                        }
                        if (shouldRenderPlast) {
                            \u062b\u0643.INSTANCE.renderPlastPreview(event, quadBuffer, lineBuffer, cameraPos.x, cameraPos.y, cameraPos.z);
                        }
                        \u062b\u0643.INSTANCE.renderCircles(event, consumers, shouldRenderEnderEye, shouldRenderSugarDust, shouldRenderFireTornado, shouldRenderGodsAura);
                        var31_37 = consumers;
                        var32_38 = false;
                        var31_37.draw();
                        var31_37 = var29_35;
                        var32_38 = false;
                        var31_37.draw();
                        var27_31 = Unit.INSTANCE;
                    }
                    catch (Throwable var28_33) {
                        try {
                            var26_29 = var28_33;
                            throw var28_33;
                        }
                        catch (Throwable var28_34) {
                            AutoCloseableKt.closeFinally((AutoCloseable)$this$draw$iv, (Throwable)$i$f$draw);
                            throw var28_34;
                        }
                    }
                    AutoCloseableKt.closeFinally(var25_27, var26_29);
                    break block20;
                }
                \u062b\u0643.INSTANCE.renderCircles(event, (VertexConsumerProvider.Immediate)var23_25, shouldRenderEnderEye, shouldRenderSugarDust, shouldRenderFireTornado, shouldRenderGodsAura);
                var25_28 = var23_25;
                var26_30 = false;
                var25_28.draw();
            }
            var21_21 = Unit.INSTANCE;
        }
        catch (Throwable var22_23) {
            var20_20 = var22_23;
            throw var22_23;
        }
        finally {
            AutoCloseableKt.closeFinally(var19_19, var20_20);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final String normalizedName(ItemStack stack, FuntimeHelperModule.HeldNameCache cache) {
        void var2_2;
        block5: {
            int componentsHash;
            block4: {
                if (stack.isEmpty()) {
                    return "";
                }
                componentsHash = stack.getComponentChanges().hashCode();
                if (cache.getStack() != stack) break block4;
                if (cache.getComponentsHash() == componentsHash) break block5;
            }
            cache.setStack(stack);
            cache.setComponentsHash(componentsHash);
            String string = \u0637\u062b.getName(stack).getString();
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = string;
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
            String string3 = string2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(string3, "toLowerCase(...)");
            cache.setName(string3);
        }
        return var2_2.getName();
    }

    private static final boolean dragonTrap$lambda$0() {
        return (Boolean)trapka.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private final Box createCardinalPlastBox(BlockPos blockPos, int dirX, int dirZ) {
        void var8_6;
        double x = blockPos.getX();
        double y = blockPos.getY();
        double z = blockPos.getZ();
        return dirZ == 1 ? new Box(x - 2.0, y - 1.0, z + 2.0, x + 3.0, y + 4.0, z + 4.0) : (dirZ == -1 ? new Box(x - 2.0, y - 1.0, z - 3.0, x + 3.0, y + 4.0, z - 1.0) : (dirX == 1 ? new Box(x + 2.0, y - 1.0, z - 2.0, x + 4.0, y + 4.0, z + 3.0) : new Box(x - 3.0, y - 1.0, z - 2.0, x - 1.0, y + 4.0, (double)(var8_6 + 3.0))));
    }
}

