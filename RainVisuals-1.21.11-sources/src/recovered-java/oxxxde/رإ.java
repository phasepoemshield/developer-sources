/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.render.OverlayTexture
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.HitColorModule;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u062b;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u00013B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010#R0\u0010/\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020-`.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b1\u00102\u00a8\u00064"}, d2={"Loxxxde/\u0631\u0625;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Ljava/awt/Color;", "getColor", "()Ljava/awt/Color;", "", "shouldColorArmor", "()Z", "isSmoothEnabled", "", "entityId", "originalOverlay", "resolveOverlay", "(II)I", "", "damageProgress", "(I)F", "Lnet/minecraft/class_1309;", "entity", "updateDamageAnimation", "(Lnet/minecraft/class_1309;)F", "Lnet/minecraft/class_638;", "world", "clearState", "(Lnet/minecraft/class_638;)V", "DAMAGE_FADE_IN_SPEED", "F", "DAMAGE_FADE_OUT_SPEED", "Loxxxde/\u062e\u0630;", "armor", "Loxxxde/\u062e\u0630;", "useClientColor", "Loxxxde/\u0631\u062a;", "hitColor", "Loxxxde/\u0631\u062a;", "Loxxxde/\u0637\u064f;", "alpha", "Loxxxde/\u0637\u064f;", "smooth", "Ljava/util/HashMap;", "Loxxxde/\u062b\u062e;", "Lkotlin/collections/HashMap;", "damageAnimations", "Ljava/util/HashMap;", "trackedWorld", "Lnet/minecraft/class_638;", "DamageAnimation", "rain-visuals"})
@RecompileFormat
public final class \u0631\u0625
extends Module {
    @NotNull
    private static final BooleanSetting smooth;
    private static final float DAMAGE_FADE_IN_SPEED = 15.0f;
    @NotNull
    private static final BooleanSetting armor;
    private static final float DAMAGE_FADE_OUT_SPEED = 8.0f;
    @Nullable
    private static ClientWorld trackedWorld;
    @NotNull
    public static final \u0631\u0625 INSTANCE;
    @NotNull
    private static final ColorSetting hitColor;
    @NotNull
    private static final BooleanSetting useClientColor;
    @NotNull
    private static final HashMap<Integer, HitColorModule.DamageAnimation> damageAnimations;
    @NotNull
    private static final SliderSetting alpha;

    public final int resolveOverlay(int entityId, int originalOverlay) {
        block3: {
            block2: {
                if (!this.isEnabled()) break block2;
                if (((Boolean)smooth.getValue()).booleanValue()) break block3;
            }
            return originalOverlay;
        }
        float progress = this.damageProgress(entityId);
        return progress <= 0.001f ? OverlayTexture.DEFAULT_UV : OverlayTexture.getUv((float)progress, (boolean)true);
    }

    @Override
    public void onDisable() {
        this.clearState(null);
    }

    @Override
    public void onEnable() {
        \u0631\u0625.clearState$default(this, null, 1, null);
    }

    private final float damageProgress(int entityId) {
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            \u0631\u0625 $this$damageProgress_u24lambda_u240 = this;
            boolean bl = false;
            $this$damageProgress_u24lambda_u240.clearState(null);
            return 0.0f;
        }
        ClientWorld world = clientWorld;
        if (trackedWorld != world) {
            this.clearState(world);
        }
        ClientWorld $this$getEntityById$iv = world;
        int id$iv = entityId;
        boolean $i$f$getEntityById = false;
        Entity entity = $this$getEntityById$iv.getEntityById(id$iv);
        LivingEntity livingEntity = entity instanceof LivingEntity ? (LivingEntity)entity : null;
        if (livingEntity == null) {
            \u0631\u0625 $this$damageProgress_u24lambda_u241 = this;
            boolean bl = false;
            damageAnimations.remove(entityId);
            return 0.0f;
        }
        LivingEntity livingEntity2 = livingEntity;
        return this.updateDamageAnimation(livingEntity2);
    }

    private static final boolean hitColor$lambda$0() {
        return !((Boolean)useClientColor.getValue()).booleanValue() || !\u0638\u062b.INSTANCE.isEnabled();
    }

    public final boolean isSmoothEnabled() {
        return (Boolean)smooth.getValue();
    }

    static {
        INSTANCE = new \u0631\u0625();
        armor = Module.boolean$default(INSTANCE, "\u041d\u0430\u043b\u043e\u0436\u0438\u0442\u044c \u043d\u0430 \u0431\u0440\u043e\u043d\u044e", true, null, 4, null);
        useClientColor = Module.boolean$default(INSTANCE, "\u0426\u0432\u0435\u0442 \u043a\u043b\u0438\u0435\u043d\u0442\u0430", false, null, 4, null).setVisible(\u0631\u0625::useClientColor$lambda$0);
        Module module = INSTANCE;
        Color color = Color.RED;
        Intrinsics.checkNotNullExpressionValue(color, "RED");
        hitColor = Module.color$default(module, "\u0426\u0432\u0435\u0442", color, null, 4, null).setVisible(\u0631\u0625::hitColor$lambda$0);
        alpha = Module.slider$default(INSTANCE, "\u041f\u0440\u043e\u0437\u0440\u0430\u0447\u043d\u043e\u0441\u0442\u044c", 255.0f, 0.0f, 255.0f, 1.0f, null, 32, null);
        smooth = Module.boolean$default(INSTANCE, "\u041f\u043b\u0430\u0432\u043d\u043e\u0441\u0442\u044c", false, null, 4, null);
        damageAnimations = new HashMap();
    }

    private \u0631\u0625() {
        super("HitColor", \u0638\u0646.getRENDER(), "\u0418\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u0435 \u0446\u0432\u0435\u0442\u0430 \u044d\u0444\u0444\u0435\u043a\u0442\u0430 \u0443\u0440\u043e\u043d\u0430");
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
            HitColorModule.DamageAnimation answer$iv = new HitColorModule.DamageAnimation(0.0f, now, 1, null);
            $this$getOrPut$iv.put(key$iv, answer$iv);
            v = var10_13;
        } else {
            v = value$iv;
        }
        HitColorModule.DamageAnimation state = (HitColorModule.DamageAnimation)v;
        float deltaSeconds = (float)RangesKt.coerceAtLeast(now - state.getLastUpdateAt(), 0L) / 1000.0f;
        state.setLastUpdateAt(now);
        float target = entity.hurtTime > 0 || entity.deathTime > 0 ? 1.0f : 0.0f;
        float speed = target > state.getProgress() ? 15.0f : 8.0f;
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

    private static final boolean useClientColor$lambda$0() {
        return \u0638\u062b.INSTANCE.isEnabled();
    }

    public final boolean shouldColorArmor() {
        return (Boolean)armor.getValue();
    }

    static /* synthetic */ void clearState$default(\u0631\u0625 \u0631\u06252, ClientWorld clientWorld, int n, Object object) {
        if ((n & 1) != 0) {
            clientWorld = \u0636\u0643.getMc().world;
        }
        \u0631\u06252.clearState(clientWorld);
    }

    private final void clearState(ClientWorld world) {
        damageAnimations.clear();
        trackedWorld = world;
    }

    @NotNull
    public final Color getColor() {
        Color color = (Boolean)useClientColor.getValue() != false && \u0638\u062b.INSTANCE.isEnabled() ? \u0638\u062b.INSTANCE.getClientColor() : (Color)hitColor.getValue();
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)((Number)alpha.getValue()).floatValue());
    }
}

