/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.LoreComponent
 *  net.minecraft.component.type.NbtComponent
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.item.ItemStack
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.registry.tag.ItemTags
 *  net.minecraft.text.Text
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Direction$Axis
 */
package oxxxde;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.text.Text;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627\u064f;
import oxxxde.\u0628\u0639;
import oxxxde.\u0633\u062a;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\b\"\u0010#J/\u0010(\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020!H\u0002\u00a2\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b*\u0010\u0003R\u0014\u0010+\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b1\u00102R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b5\u0010,R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b7\u00108\u00a8\u00069"}, d2={"Loxxxde/\u0630\u0636;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0634\u062b;", "event", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "", "Lnet/minecraft/class_238;", "currentPreview", "()Ljava/util/List;", "Lnet/minecraft/class_2338;", "center", "Lnet/minecraft/class_2350$class_2351;", "axis", "", "first", "second", "offsetInFacePlane", "(Lnet/minecraft/class_2338;Lnet/minecraft/class_2350$class_2351;II)Lnet/minecraft/class_2338;", "Lnet/minecraft/class_1799;", "stack", "bulldozerLevel", "(Lnet/minecraft/class_1799;)I", "", "text", "fallback", "parseBulldozerLevel", "(Ljava/lang/String;I)Ljava/lang/Integer;", "", "frameDeltaSeconds", "()F", "current", "target", "speed", "deltaSeconds", "approach", "(FFFF)F", "resetAnimation", "FADE_SPEED", "F", "", "BOX_EXPANSION", "D", "Lkotlin/text/Regex;", "bulldozerRegex", "Lkotlin/text/Regex;", "previewBoxes", "Ljava/util/List;", "alpha", "", "lastFrameNanos", "J", "rain-visuals"})
public final class \u0630\u0636
extends Module {
    private static final float FADE_SPEED = 9.5f;
    private static final double BOX_EXPANSION = 0.002;
    @NotNull
    public static final \u0630\u0636 INSTANCE = new \u0630\u0636();
    @NotNull
    private static final Regex bulldozerRegex = new Regex("(?:\u0431\u0443\u043b\u044c\u0434\u043e\u0437\u0435\u0440|bulldozer)[^\\p{L}\\p{N}]{0,6}(ii|2|i|1)?", SetsKt.setOf(RegexOption.IGNORE_CASE));
    @NotNull
    private static List<? extends Box> previewBoxes = CollectionsKt.emptyList();
    private static float alpha;
    private static long lastFrameNanos;

    private \u0630\u0636() {
        super("BurHelper", \u0638\u0646.getPLAYER(), "\u041f\u043e\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 \u0437\u043e\u043d\u0443 \u043a\u043e\u043f\u0430\u043d\u0438\u044f \u0431\u0443\u043b\u044c\u0434\u043e\u0437\u0435\u0440\u043e\u043c");
    }

    @Override
    public void onEnable() {
        this.resetAnimation();
    }

    private final float approach(float current, float target, float speed, float deltaSeconds) {
        float factor = (float)(1.0 - Math.exp(-speed * deltaSeconds));
        return current + (target - current) * RangesKt.coerceIn(factor, 0.0f, 1.0f);
    }

    private final void resetAnimation() {
        previewBoxes = CollectionsKt.emptyList();
        alpha = 0.0f;
        lastFrameNanos = 0L;
    }

    static /* synthetic */ Integer parseBulldozerLevel$default(\u0630\u0636 \u0630\u06362, String string, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 1;
        }
        return \u0630\u06362.parseBulldozerLevel(string, n);
    }

    /*
     * WARNING - void declaration
     */
    private final List<Box> currentPreview() {
        ArrayList arrayList;
        BlockHitResult hit;
        int level;
        ClientWorld world;
        block12: {
            block11: {
                ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
                if (clientPlayerEntity == null) {
                    return null;
                }
                ClientPlayerEntity player = clientPlayerEntity;
                ClientWorld clientWorld = \u0636\u0643.getMc().world;
                if (clientWorld == null) {
                    return null;
                }
                world = clientWorld;
                ItemStack itemStack = player.getMainHandStack();
                Intrinsics.checkNotNullExpressionValue(itemStack, "getMainHandItem(...)");
                level = this.bulldozerLevel(itemStack);
                if (level <= 0) {
                    return null;
                }
                HitResult hitResult = \u0636\u0643.getMc().crosshairTarget;
                BlockHitResult blockHitResult = hitResult instanceof BlockHitResult ? (BlockHitResult)hitResult : null;
                if (blockHitResult == null) {
                    return null;
                }
                hit = blockHitResult;
                if (hit.getType() != HitResult.Type.BLOCK) break block11;
                if (!hit.isAgainstWorldBorder()) break block12;
            }
            return null;
        }
        BlockPos blockPos = hit.getBlockPos();
        Intrinsics.checkNotNullExpressionValue(blockPos, "getBlockPos(...)");
        BlockPos origin = blockPos;
        Direction direction = hit.getSide();
        Intrinsics.checkNotNullExpressionValue(direction, "getDirection(...)");
        Direction direction2 = direction;
        ArrayList boxes = new ArrayList(9 * level);
        for (int i = 0; i < level; ++i) {
            int depth = i;
            boolean bl = false;
            Intrinsics.checkNotNullExpressionValue(origin.offset(direction2.getOpposite(), depth), "relative(...)");
            int first = -1;
            while (first < 2) {
                void var12_14;
                int second = -1;
                while (second < 2) {
                    void var13_15;
                    BlockPos layerCenter;
                    Direction.Axis axis = direction2.getAxis();
                    Intrinsics.checkNotNullExpressionValue(axis, "getAxis(...)");
                    BlockPos pos = INSTANCE.offsetInFacePlane(layerCenter, axis, first, second);
                    if (world.isInBuildLimit(pos)) {
                        ((Collection)boxes).add(new Box(pos).expand(0.002));
                    }
                    ++var13_15;
                }
                ++var12_14;
            }
        }
        ArrayList it = arrayList = boxes;
        boolean bl = false;
        return !((Collection)it).isEmpty() ? arrayList : null;
    }

    /*
     * WARNING - void declaration
     */
    private final float frameDeltaSeconds() {
        void var3_2;
        long now = System.nanoTime();
        if (lastFrameNanos == 0L) {
            lastFrameNanos = now;
            return 0.016666668f;
        }
        float delta = (float)RangesKt.coerceAtMost((double)RangesKt.coerceAtLeast(now - lastFrameNanos, 0L) / 1.0E9, 0.1);
        lastFrameNanos = now;
        return (float)var3_2;
    }

    private final BlockPos offsetInFacePlane(BlockPos center, Direction.Axis axis, int first, int second) {
        BlockPos blockPos;
        switch (\u0633\u062a.$EnumSwitchMapping$0[axis.ordinal()]) {
            case 1: {
                BlockPos blockPos2 = center.add(0, first, second);
                blockPos = blockPos2;
                Intrinsics.checkNotNullExpressionValue(blockPos2, "offset(...)");
                break;
            }
            case 2: {
                BlockPos blockPos3 = center.add(first, 0, second);
                blockPos = blockPos3;
                Intrinsics.checkNotNullExpressionValue(blockPos3, "offset(...)");
                break;
            }
            case 3: {
                BlockPos blockPos4 = center.add(first, second, 0);
                blockPos = blockPos4;
                Intrinsics.checkNotNullExpressionValue(blockPos4, "offset(...)");
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return blockPos;
    }

    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        float deltaSeconds = this.frameDeltaSeconds();
        List<Box> target = this.currentPreview();
        if (target != null) {
            previewBoxes = target;
        }
        float targetAlpha = target != null ? 1.0f : 0.0f;
        alpha = this.approach(alpha, targetAlpha, 9.5f, deltaSeconds);
        if (alpha <= 0.003f) {
            if (target == null) {
                previewBoxes = CollectionsKt.emptyList();
            }
            return;
        }
        int renderAlpha = MathKt.roundToInt(RangesKt.coerceIn(alpha, 0.0f, 1.0f) * 255.0f);
        \u0628\u0639.render$default(\u0628\u0639.INSTANCE, event, previewBoxes, null, new Color(255, 255, 255, renderAlpha), 1.5f, false, 0.0f, 100, null);
    }

    static {
        \u0627\u064f.moduleOnFuntime$default(\u0627\u064f.INSTANCE, INSTANCE, null, 2, null);
    }

    /*
     * Unable to fully structure code
     */
    private final Integer parseBulldozerLevel(String text, int fallback) {
        v0 = Regex.find$default(\u0630\u0636.bulldozerRegex, text, 0, 2, null);
        if (v0 == null) {
            return null;
        }
        match = v0;
        v1 = CollectionsKt.getOrNull(match.getGroupValues(), 1);
        if (v1 != null) {
            v2 = v1.toLowerCase(Locale.ROOT);
            v3 = v2;
            Intrinsics.checkNotNullExpressionValue(v2, "toLowerCase(...)");
        } else {
            v3 = var5_4 = null;
        }
        if (var5_4 == null) ** GOTO lbl-1000
        tmp = -1;
        switch (var5_4.hashCode()) {
            case 3360: {
                if (var5_4.equals("ii")) {
                    tmp = 1;
                }
                break;
            }
            case 49: {
                if (var5_4.equals("1")) {
                    tmp = 2;
                }
                break;
            }
            case 50: {
                if (var5_4.equals("2")) {
                    tmp = 1;
                }
                break;
            }
            case 105: {
                if (var5_4.equals("i")) {
                    tmp = 2;
                }
                break;
            }
        }
        switch (tmp) {
            case 1: {
                v4 = 2;
                break;
            }
            case 2: {
                v4 = 1;
                break;
            }
            default: lbl-1000:
            // 2 sources

            {
                v4 = fallback;
            }
        }
        parsed = v4;
        return RangesKt.coerceIn(parsed, 1, 2);
    }

    @Override
    public void onDisable() {
        this.resetAnimation();
    }

    private final int bulldozerLevel(ItemStack stack) {
        NbtComponent customData;
        block11: {
            block10: {
                if (stack.isEmpty()) break block10;
                if (stack.isIn(ItemTags.PICKAXES)) break block11;
            }
            return 0;
        }
        Set set = stack.getEnchantments().getEnchantmentEntries();
        Intrinsics.checkNotNullExpressionValue(set, "entrySet(...)");
        Object $this$forEach$iv = set;
        boolean $i$f$forEach = false;
        Iterator iterator2 = $this$forEach$iv.iterator();
        while (iterator2.hasNext()) {
            StringBuilder stringBuilder;
            Object element$iv = iterator2.next();
            Object2IntMap.Entry entry = (Object2IntMap.Entry)element$iv;
            boolean bl = false;
            StringBuilder $this$bulldozerLevel_u24lambda_u240_u240 = stringBuilder = new StringBuilder();
            boolean bl2 = false;
            $this$bulldozerLevel_u24lambda_u240_u240.append(Enchantment.getName((RegistryEntry)((RegistryEntry)entry.getKey()), (int)entry.getIntValue()).getString());
            $this$bulldozerLevel_u24lambda_u240_u240.append(' ');
            $this$bulldozerLevel_u24lambda_u240_u240.append(((RegistryEntry)entry.getKey()).getIdAsString());
            String description = stringBuilder.toString();
            Integer n = INSTANCE.parseBulldozerLevel(description, entry.getIntValue());
            if (n == null) continue;
            int it = ((Number)n).intValue();
            boolean bl3 = false;
            return it;
        }
        String string = stack.getName().getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        $this$forEach$iv = \u0630\u0636.parseBulldozerLevel$default(this, string, 0, 2, null);
        if ($this$forEach$iv != null) {
            int it = ((Number)$this$forEach$iv).intValue();
            boolean bl = false;
            return it;
        }
        Object object = (LoreComponent)stack.get(DataComponentTypes.LORE);
        if (object != null && (object = object.lines()) != null) {
            Iterable $this$forEach$iv2 = (Iterable)object;
            boolean $i$f$forEach2 = false;
            for (Object element$iv : $this$forEach$iv2) {
                Text line = (Text)element$iv;
                boolean bl = false;
                String string2 = line.getString();
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Integer n = \u0630\u0636.parseBulldozerLevel$default(INSTANCE, string2, 0, 2, null);
                if (n == null) continue;
                int n2 = ((Number)n).intValue();
                boolean bl4 = false;
                return n2;
            }
        }
        NbtComponent nbtComponent = customData = (NbtComponent)stack.get(DataComponentTypes.CUSTOM_DATA);
        NbtComponent nbtComponent2 = nbtComponent;
        String string3 = nbtComponent != null && (nbtComponent2 = nbtComponent2.copyNbt()) != null ? nbtComponent2.toString() : null;
        String string4 = string3;
        if (string3 == null) {
            string4 = "";
        }
        Integer n = \u0630\u0636.parseBulldozerLevel$default(this, string4, 0, 2, null);
        if (n != null) {
            int n3 = ((Number)n).intValue();
            boolean bl = false;
            return n3;
        }
        return 0;
    }
}

