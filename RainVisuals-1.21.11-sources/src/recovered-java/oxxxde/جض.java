/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.util.BufferAllocator
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.mob.MobEntity
 *  net.minecraft.entity.passive.AnimalEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 */
package oxxxde;

import java.awt.Color;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.ModuleCustomHitBox;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RainRenderLayers;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0628\u062d;
import oxxxde.\u062a\u062f;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u062b;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001:B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010&R\u0014\u0010-\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b-\u0010&R\u0014\u0010.\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b.\u0010&R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b2\u00101R0\u00106\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020403j\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u000204`58\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b8\u00109\u00a8\u0006;"}, d2={"Loxxxde/\u062c\u0636;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0634\u062b;", "event", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_1309;", "entity", "", "shouldRender", "(Lnet/minecraft/class_1309;)Z", "Ljava/awt/Color;", "selectedColor", "()Ljava/awt/Color;", "baseColor", "resolveRenderColor", "(Lnet/minecraft/class_1309;Ljava/awt/Color;)Ljava/awt/Color;", "", "updateDamageAnimation", "(Lnet/minecraft/class_1309;)F", "Lnet/minecraft/class_638;", "world", "clearState", "(Lnet/minecraft/class_638;)V", "", "BUFFER_SIZE", "I", "DAMAGE_FADE_IN_SPEED", "F", "DAMAGE_FADE_OUT_SPEED", "DAMAGE_TINT_STRENGTH", "Loxxxde/\u062e\u0630;", "useClientColor", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0631\u062a;", "boxColor", "Loxxxde/\u0631\u062a;", "onlyPlayers", "damageEffect", "filled", "outlined", "striped", "Loxxxde/\u0637\u064f;", "lineWidth", "Loxxxde/\u0637\u064f;", "stripedGap", "Ljava/util/HashMap;", "Loxxxde/\u062d\u064c;", "Lkotlin/collections/HashMap;", "damageAnimations", "Ljava/util/HashMap;", "trackedWorld", "Lnet/minecraft/class_638;", "DamageAnimation", "rain-visuals"})
public final class \u062c\u0636
extends Module {
    @NotNull
    private static final ColorSetting boxColor;
    @NotNull
    public static final \u062c\u0636 INSTANCE;
    @NotNull
    private static final BooleanSetting striped;
    @NotNull
    private static final BooleanSetting damageEffect;
    @NotNull
    private static final BooleanSetting useClientColor;
    private static final float DAMAGE_TINT_STRENGTH = 0.78f;
    @Nullable
    private static ClientWorld trackedWorld;
    @NotNull
    private static final BooleanSetting filled;
    @NotNull
    private static final HashMap<Integer, ModuleCustomHitBox.DamageAnimation> damageAnimations;
    private static final float DAMAGE_FADE_IN_SPEED = 14.0f;
    @NotNull
    private static final BooleanSetting onlyPlayers;
    @NotNull
    private static final BooleanSetting outlined;
    @NotNull
    private static final SliderSetting stripedGap;
    private static final float DAMAGE_FADE_OUT_SPEED = 11.0f;
    private static final int BUFFER_SIZE = 0x100000;
    @NotNull
    private static final SliderSetting lineWidth;

    private static final boolean stripedGap$lambda$0() {
        return (Boolean)striped.getValue();
    }

    private final void clearState(ClientWorld world) {
        damageAnimations.clear();
        trackedWorld = world;
    }

    @Override
    public void onDisable() {
        this.clearState(null);
    }

    static {
        INSTANCE = new \u062c\u0636();
        useClientColor = Module.boolean$default(INSTANCE, "\u0426\u0432\u0435\u0442 \u043a\u043b\u0438\u0435\u043d\u0442\u0430", false, null, 4, null).setVisible(\u062c\u0636::useClientColor$lambda$0);
        Module module = INSTANCE;
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        boxColor = Module.color$default(module, "\u0426\u0432\u0435\u0442", color, null, 4, null).setVisible(\u062c\u0636::boxColor$lambda$0);
        onlyPlayers = Module.boolean$default(INSTANCE, "\u0422\u043e\u043b\u044c\u043a\u043e \u0438\u0433\u0440\u043e\u043a\u0438", true, null, 4, null);
        damageEffect = Module.boolean$default(INSTANCE, "\u042d\u0444\u0444\u0435\u043a\u0442 \u0443\u0440\u043e\u043d\u0430", false, null, 4, null);
        filled = Module.boolean$default(INSTANCE, "\u0417\u0430\u043f\u043e\u043b\u043d\u0438\u0442\u044c", false, null, 4, null);
        outlined = Module.boolean$default(INSTANCE, "\u041e\u0431\u0432\u043e\u0434\u043a\u0430", true, null, 4, null);
        striped = Module.boolean$default(INSTANCE, "\u041f\u0443\u043d\u043a\u0442\u0438\u0440\u043d\u0430\u044f \u043e\u0431\u0432\u043e\u0434\u043a\u0430", false, null, 4, null);
        lineWidth = Module.slider$default(INSTANCE, "\u0422\u043e\u043b\u0449\u0438\u043d\u0430", 1.0f, 1.0f, 3.5f, 0.1f, null, 32, null).setVisible(\u062c\u0636::lineWidth$lambda$0);
        stripedGap = Module.slider$default(INSTANCE, "\u0420\u0430\u0437\u0440\u044b\u0432", 0.2f, 0.1f, 0.35f, 0.01f, null, 32, null).setVisible(\u062c\u0636::stripedGap$lambda$0);
        damageAnimations = new HashMap();
        outlined.onChange(\u062c\u0636::_init_$lambda$0);
        striped.onChange(\u062c\u0636::_init_$lambda$1);
    }

    /*
     * WARNING - void declaration
     */
    private final float updateDamageAnimation(LivingEntity entity) {
        void var9_12;
        Object v;
        void $this$getOrPut$iv;
        long now = System.currentTimeMillis();
        Map map = damageAnimations;
        Integer key$iv = entity.getId();
        boolean $i$f$getOrPut = false;
        Object value$iv = $this$getOrPut$iv.get(key$iv);
        if (value$iv == null) {
            void var10_13;
            boolean bl = false;
            ModuleCustomHitBox.DamageAnimation answer$iv = new ModuleCustomHitBox.DamageAnimation(0.0f, now, 1, null);
            $this$getOrPut$iv.put(key$iv, answer$iv);
            v = var10_13;
        } else {
            v = value$iv;
        }
        ModuleCustomHitBox.DamageAnimation state = (ModuleCustomHitBox.DamageAnimation)v;
        float deltaSeconds = (float)RangesKt.coerceAtLeast(now - state.getLastUpdateAt(), 0L) / 1000.0f;
        state.setLastUpdateAt(now);
        float target = entity.hurtTime > 0 || entity.deathTime > 0 ? 1.0f : 0.0f;
        float speed = target > state.getProgress() ? 14.0f : 11.0f;
        float factor = RangesKt.coerceIn(deltaSeconds * speed, 0.0f, 1.0f);
        state.setProgress(state.getProgress() + (target - state.getProgress()) * factor);
        float progress = RangesKt.coerceIn(state.getProgress(), 0.0f, 1.0f);
        if (progress <= 0.001f) {
            if (target <= 0.0f) {
                damageAnimations.remove(entity.getId());
                return 0.0f;
            }
        }
        return (float)var9_12;
    }

    private final boolean shouldRender(LivingEntity entity) {
        block6: {
            block5: {
                if (!entity.isAlive() || entity.isRemoved()) break block5;
                if (!entity.isInvisible()) break block6;
            }
            return false;
        }
        ClientPlayerEntity localPlayer = \u0636\u0643.getMc().player;
        if (Intrinsics.areEqual(entity, localPlayer)) {
            GameOptions gameOptions = \u0636\u0643.getMc().options;
            Intrinsics.checkNotNullExpressionValue(gameOptions, "options");
            return !\u0637\u062b.getPerspective(gameOptions).isFirstPerson();
        }
        if (((Boolean)onlyPlayers.getValue()).booleanValue()) {
            return entity instanceof PlayerEntity && !((PlayerEntity)entity).isSpectator();
        }
        LivingEntity livingEntity = entity;
        return livingEntity instanceof PlayerEntity ? !((PlayerEntity)entity).isSpectator() : (livingEntity instanceof AnimalEntity ? true : livingEntity instanceof MobEntity);
    }

    static /* synthetic */ void clearState$default(\u062c\u0636 \u062c\u06362, ClientWorld clientWorld, int n, Object object) {
        if ((n & 1) != 0) {
            clientWorld = \u0636\u0643.getMc().world;
        }
        \u062c\u06362.clearState(clientWorld);
    }

    private static final void onRender3D$renderBoxes(ClientWorld world, HashSet<Integer> activeEntityIds, Render3DEvent $event, Vec3d cameraPos, Color baseColor, VertexConsumer quadBuffer, VertexConsumer lineBuffer) {
        Iterable iterable = world.getEntities();
        Intrinsics.checkNotNullExpressionValue(iterable, "entitiesForRendering(...)");
        Iterable $this$forEach$iv = iterable;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            Box renderBox;
            double y$iv;
            double x$iv;
            Box $this$offset$iv;
            Vec3d lerpedPos;
            LivingEntity living;
            Entity entity = (Entity)element$iv;
            boolean bl = false;
            LivingEntity livingEntity = entity instanceof LivingEntity ? (LivingEntity)entity : null;
            if (livingEntity == null || !INSTANCE.shouldRender(living = livingEntity)) continue;
            ((Collection)activeEntityIds).add(living.getId());
            Intrinsics.checkNotNullExpressionValue(living.getLerpedPos($event.getPartialTicks()), "getPosition(...)");
            Intrinsics.checkNotNullExpressionValue(living.getBoundingBox(), "getBoundingBox(...)");
            double d = lerpedPos.x - living.getX();
            double d2 = lerpedPos.y - living.getY();
            double z$iv = lerpedPos.z - living.getZ();
            boolean $i$f$offset = false;
            Intrinsics.checkNotNullExpressionValue($this$offset$iv.offset(x$iv, y$iv, z$iv), "move(...)");
            x$iv = -cameraPos.x;
            y$iv = -cameraPos.y;
            z$iv = -cameraPos.z;
            $i$f$offset = false;
            Intrinsics.checkNotNullExpressionValue($this$offset$iv.offset(x$iv, y$iv, z$iv), "move(...)");
            \u062a\u062f.draw$default(\u062a\u062f.INSTANCE, $event, quadBuffer, lineBuffer, renderBox, INSTANCE.resolveRenderColor(living, baseColor), (Boolean)filled.getValue(), (Boolean)outlined.getValue(), (Boolean)striped.getValue(), ((Number)lineWidth.getValue()).floatValue(), ((Number)stripedGap.getValue()).floatValue(), 0.0f, 1024, null);
        }
    }

    private static final boolean useClientColor$lambda$0() {
        return \u0638\u062b.INSTANCE.isEnabled();
    }

    private static final boolean boxColor$lambda$0() {
        return !((Boolean)useClientColor.getValue()).booleanValue() || !\u0638\u062b.INSTANCE.isEnabled();
    }

    private \u062c\u0636() {
        super("CustomHitBox", \u0638\u0646.getRENDER(), "\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u0432\u0438\u0437\u0443\u0430\u043b\u0430 \u0445\u0438\u0442\u0431\u043e\u043a\u0441\u0430");
    }

    private static final Unit _init_$lambda$0(boolean enabled) {
        if (enabled && ((Boolean)striped.getValue()).booleanValue()) {
            striped.set(false);
        }
        return Unit.INSTANCE;
    }

    private final Color selectedColor() {
        return (Boolean)useClientColor.getValue() != false && \u0638\u062b.INSTANCE.isEnabled() ? \u0638\u062b.INSTANCE.getClientColor() : (Color)boxColor.getValue();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        void var6_6;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isEnabled()) {
            return;
        }
        if (!(((Boolean)filled.getValue()).booleanValue() || ((Boolean)outlined.getValue()).booleanValue() || ((Boolean)striped.getValue()).booleanValue())) {
            return;
        }
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return;
        }
        ClientWorld world = clientWorld;
        if (trackedWorld != world) {
            this.clearState(world);
        }
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Vec3d cameraPos = \u0637\u062b.getPos(\u0637\u062b.getCamera(gameRenderer));
        BufferAllocator allocator = new BufferAllocator(0x100000);
        Color baseColor = this.selectedColor();
        HashSet<Integer> activeEntityIds = new HashSet<Integer>();
        AutoCloseable autoCloseable = (AutoCloseable)allocator;
        Throwable throwable = null;
        try {
            BufferAllocator allocator2 = (BufferAllocator)autoCloseable;
            boolean bl = false;
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)allocator2);
            Intrinsics.checkNotNullExpressionValue(immediate, "immediate(...)");
            VertexConsumerProvider.Immediate quadConsumers = immediate;
            VertexConsumer vertexConsumer = quadConsumers.getBuffer(RainRenderLayers.getHitBoxQuad(true));
            Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
            VertexConsumer quadBuffer = vertexConsumer;
            if (((Boolean)outlined.getValue()).booleanValue()) {
                AutoCloseable autoCloseable2 = (AutoCloseable)new BufferAllocator(0x100000);
                Throwable throwable2 = null;
                try {
                    BufferAllocator lineAllocator = (BufferAllocator)autoCloseable2;
                    boolean bl2 = false;
                    VertexConsumerProvider.Immediate immediate2 = VertexConsumerProvider.immediate((BufferAllocator)lineAllocator);
                    Intrinsics.checkNotNullExpressionValue(immediate2, "immediate(...)");
                    VertexConsumerProvider.Immediate lineConsumers = immediate2;
                    VertexConsumer vertexConsumer2 = lineConsumers.getBuffer(RainRenderLayers.getHitBoxLine(((Number)lineWidth.getValue()).floatValue()));
                    Intrinsics.checkNotNullExpressionValue(vertexConsumer2, "getBuffer(...)");
                    VertexConsumer lineBuffer = vertexConsumer2;
                    \u062c\u0636.onRender3D$renderBoxes(world, activeEntityIds, event, cameraPos, baseColor, quadBuffer, lineBuffer);
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
                void var11_13;
                \u062c\u0636.onRender3D$renderBoxes(world, activeEntityIds, event, cameraPos, baseColor, quadBuffer, null);
                void var13_16 = var11_13;
                boolean bl4 = false;
                var13_16.draw();
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
        damageAnimations.keySet().retainAll((Collection)var6_6);
    }

    private static final Unit _init_$lambda$1(boolean enabled) {
        if (enabled && ((Boolean)outlined.getValue()).booleanValue()) {
            outlined.set(false);
        }
        return Unit.INSTANCE;
    }

    private static final boolean lineWidth$lambda$0() {
        return ((Boolean)outlined.getValue()).booleanValue() || ((Boolean)striped.getValue()).booleanValue();
    }

    /*
     * WARNING - void declaration
     */
    private final Color resolveRenderColor(LivingEntity entity, Color baseColor) {
        void var3_3;
        void var4_4;
        if (!((Boolean)damageEffect.getValue()).booleanValue()) {
            return baseColor;
        }
        float progress = this.updateDamageAnimation(entity) * 0.78f;
        if (progress <= 0.0f) {
            return baseColor;
        }
        Color damageColor = new Color(255, 0, 0, baseColor.getAlpha());
        return \u0628\u062d.INSTANCE.interpolateColor(baseColor, (Color)var4_4, (float)var3_3);
    }

    @Override
    public void onEnable() {
        \u062c\u0636.clearState$default(this, null, 1, null);
    }
}

