/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.ChargedProjectilesComponent
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.CrossbowItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.math.Vec3d
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.PredictsModule;
import kotakbaz.rain.module.modules.render.predicts.PredictedProjectile;
import kotakbaz.rain.module.modules.render.predicts.ProjectileLaunch;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ChargedProjectilesComponent;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u062d\u0648;
import oxxxde.\u0635\u0630;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0637\u0631;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001>B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b%\u0010\u0003R\u0014\u0010&\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b,\u0010'R\u0014\u0010-\u001a\u00020)8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010.\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b.\u0010'R\u0014\u0010/\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b/\u0010'R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b4\u00102R\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b5\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b=\u0010<\u00a8\u0006?"}, d2={"Loxxxde/\u062c\u0642;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0634\u062b;", "event", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_1657;", "player", "Loxxxde/\u062d\u0647;", "findHeldWeapon", "(Lnet/minecraft/class_1657;)Lkotakbaz/rain/module/modules/render/PredictsModule$HeldWeapon;", "Lnet/minecraft/class_1799;", "stack", "resolveWeapon", "(Lnet/minecraft/class_1799;)Lkotakbaz/rain/module/modules/render/PredictsModule$HeldWeapon;", "weapon", "", "partialTicks", "previewAlpha", "(Lnet/minecraft/class_1657;Lkotakbaz/rain/module/modules/render/PredictsModule$HeldWeapon;F)F", "Lnet/minecraft/class_243;", "cameraPos", "", "Loxxxde/\u0638\u0631;", "createLaunches", "(Lnet/minecraft/class_1657;Lkotakbaz/rain/module/modules/render/PredictsModule$HeldWeapon;Lnet/minecraft/class_243;F)Ljava/util/List;", "bowPower", "(Lnet/minecraft/class_1657;F)F", "smoothShooterMovement", "(Lnet/minecraft/class_1657;F)Lnet/minecraft/class_243;", "sampleShooterMovement", "(Lnet/minecraft/class_1657;)Lnet/minecraft/class_243;", "resetMotionSmoothing", "TRIDENT_CHARGE_TICKS", "F", "BOW_CHARGE_TICKS", "", "BOW_MAX_SPEED", "D", "MIN_BOW_POWER", "CROSSHAIR_START_DISTANCE", "LINE_WIDTH", "MARKER_SIZE", "Loxxxde/\u062e\u0630;", "crossbow", "Loxxxde/\u062e\u0630;", "bow", "enderPearl", "trident", "trackedMotionPlayer", "Lnet/minecraft/class_1657;", "", "lastMotionTick", "I", "previousMovement", "Lnet/minecraft/class_243;", "currentMovement", "HeldWeapon", "rain-visuals"})
public final class \u062c\u0642
extends Module {
    @NotNull
    private static final BooleanSetting crossbow;
    @NotNull
    private static final BooleanSetting enderPearl;
    private static final double CROSSHAIR_START_DISTANCE = 0.15;
    private static final float TRIDENT_CHARGE_TICKS = 10.0f;
    @NotNull
    public static final \u062c\u0642 INSTANCE;
    private static final float MIN_BOW_POWER = 0.1f;
    @NotNull
    private static Vec3d currentMovement;
    @NotNull
    private static Vec3d previousMovement;
    @Nullable
    private static PlayerEntity trackedMotionPlayer;
    private static final double BOW_MAX_SPEED = 3.0;
    @NotNull
    private static final BooleanSetting trident;
    private static int lastMotionTick;
    private static final float LINE_WIDTH = 2.0f;
    @NotNull
    private static final BooleanSetting bow;
    private static final float BOW_CHARGE_TICKS = 20.0f;
    private static final float MARKER_SIZE = 0.25f;

    @Override
    public void onDisable() {
        this.resetMotionSmoothing();
    }

    private \u062c\u0642() {
        super("Predicts", \u0638\u0646.getRENDER(), "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u0435 \u0442\u0440\u0430\u0435\u043a\u0442\u043e\u0440\u0438\u0438 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432");
    }

    /*
     * WARNING - void declaration
     */
    private final PredictsModule.HeldWeapon findHeldWeapon(PlayerEntity player) {
        PredictsModule.HeldWeapon mainHand;
        if (player.isUsingItem()) {
            ItemStack itemStack = player.getActiveItem();
            Intrinsics.checkNotNullExpressionValue(itemStack, "getUseItem(...)");
            PredictsModule.HeldWeapon heldWeapon = this.resolveWeapon(itemStack);
            if (heldWeapon != null) {
                void var3_3;
                PredictsModule.HeldWeapon it = heldWeapon;
                boolean bl = false;
                return var3_3;
            }
        }
        ItemStack itemStack = player.getMainHandStack();
        Intrinsics.checkNotNullExpressionValue(itemStack, "getMainHandItem(...)");
        PredictsModule.HeldWeapon heldWeapon = mainHand = this.resolveWeapon(itemStack);
        if (heldWeapon != null) {
            return heldWeapon;
        }
        ItemStack itemStack2 = player.getOffHandStack();
        Intrinsics.checkNotNullExpressionValue(itemStack2, "getOffhandItem(...)");
        return this.resolveWeapon(itemStack2);
    }

    private final float bowPower(PlayerEntity player, float partialTicks) {
        float charge = player.getItemUseTime(partialTicks) / 20.0f;
        return RangesKt.coerceIn((charge * charge + charge * 2.0f) / 3.0f, 0.0f, 1.0f);
    }

    private final PredictsModule.HeldWeapon resolveWeapon(ItemStack stack) {
        return ((Boolean)crossbow.getValue()).booleanValue() && stack.isOf(Items.CROSSBOW) ? new PredictsModule.HeldWeapon(stack, PredictedProjectile.CROSSBOW_ARROW) : (((Boolean)bow.getValue()).booleanValue() && stack.isOf(Items.BOW) ? new PredictsModule.HeldWeapon(stack, PredictedProjectile.BOW_ARROW) : (((Boolean)enderPearl.getValue()).booleanValue() && stack.isOf(Items.ENDER_PEARL) ? new PredictsModule.HeldWeapon(stack, PredictedProjectile.ENDER_PEARL) : (((Boolean)trident.getValue()).booleanValue() && stack.isOf(Items.TRIDENT) ? new PredictsModule.HeldWeapon(stack, PredictedProjectile.TRIDENT) : null)));
    }

    static {
        INSTANCE = new \u062c\u0642();
        crossbow = Module.boolean$default(INSTANCE, "\u0410\u0440\u0431\u0430\u043b\u0435\u0442", true, null, 4, null);
        bow = Module.boolean$default(INSTANCE, "\u041b\u0443\u043a", true, null, 4, null);
        enderPearl = Module.boolean$default(INSTANCE, "\u042d\u043d\u0434\u0435\u0440-\u043f\u0435\u0440\u043b", true, null, 4, null);
        trident = Module.boolean$default(INSTANCE, "\u0422\u0440\u0435\u0437\u0443\u0431\u0435\u0446", true, null, 4, null);
        lastMotionTick = -1;
        Vec3d vec3d = Vec3d.ZERO;
        Intrinsics.checkNotNullExpressionValue(vec3d, "ZERO");
        previousMovement = vec3d;
        Vec3d vec3d2 = Vec3d.ZERO;
        Intrinsics.checkNotNullExpressionValue(vec3d2, "ZERO");
        currentMovement = vec3d2;
    }

    /*
     * WARNING - void declaration
     */
    private final List<ProjectileLaunch> createLaunches(PlayerEntity player, PredictsModule.HeldWeapon weapon, Vec3d cameraPos, float partialTicks) {
        void var2_2;
        void var5_5;
        void var6_6;
        boolean bl;
        block15: {
            Vec3d origin;
            Vec3d viewDirection;
            block17: {
                block16: {
                    if (weapon.getProjectile() == PredictedProjectile.TRIDENT) {
                        if (EnchantmentHelper.getTridentSpinAttackStrength((ItemStack)weapon.getStack(), (LivingEntity)((LivingEntity)player)) > 0.0f) {
                            return CollectionsKt.emptyList();
                        }
                    }
                    Vec3d vec3d = player.getRotationVec(partialTicks).normalize();
                    Intrinsics.checkNotNullExpressionValue(vec3d, "normalize(...)");
                    viewDirection = vec3d;
                    Vec3d vec3d2 = cameraPos.add(viewDirection.multiply(0.15));
                    Intrinsics.checkNotNullExpressionValue(vec3d2, "add(...)");
                    origin = vec3d2;
                    if (weapon.getProjectile() == PredictedProjectile.TRIDENT) break block16;
                    if (weapon.getProjectile() != PredictedProjectile.ENDER_PEARL) break block17;
                }
                return CollectionsKt.listOf(new ProjectileLaunch(origin, viewDirection, weapon.getProjectile(), 0.0, this.smoothShooterMovement(player, partialTicks), 8, null));
            }
            if (weapon.getProjectile() == PredictedProjectile.BOW_ARROW) {
                if (!player.isUsingItem() || !player.getActiveItem().isOf(Items.BOW)) {
                    return CollectionsKt.emptyList();
                }
                float power = this.bowPower(player, partialTicks);
                if (power < 0.1f) {
                    return CollectionsKt.emptyList();
                }
                return CollectionsKt.listOf(new ProjectileLaunch(origin, viewDirection, weapon.getProjectile(), 3.0 * (double)power, this.smoothShooterMovement(player, partialTicks)));
            }
            if (!CrossbowItem.isCharged((ItemStack)weapon.getStack())) {
                return CollectionsKt.emptyList();
            }
            Object object = weapon.getStack().getOrDefault(DataComponentTypes.CHARGED_PROJECTILES, (Object)ChargedProjectilesComponent.DEFAULT);
            Intrinsics.checkNotNullExpressionValue(object, "getOrDefault(...)");
            ChargedProjectilesComponent charged = (ChargedProjectilesComponent)object;
            if (charged.contains(Items.FIREWORK_ROCKET)) {
                return CollectionsKt.emptyList();
            }
            List list = charged.getProjectiles();
            Intrinsics.checkNotNullExpressionValue(list, "getItems(...)");
            Iterable $this$none$iv = list;
            boolean $i$f$none = false;
            if ($this$none$iv instanceof Collection && ((Collection)$this$none$iv).isEmpty()) {
                bl = true;
            } else {
                for (Object element$iv : $this$none$iv) {
                    void var12_13;
                    ItemStack it = (ItemStack)element$iv;
                    boolean bl2 = false;
                    boolean bl3 = !var12_13.isEmpty();
                    if (!bl3) continue;
                    bl = false;
                    break block15;
                }
                bl = true;
            }
        }
        if (bl) {
            return CollectionsKt.emptyList();
        }
        return CollectionsKt.listOf(new ProjectileLaunch((Vec3d)var6_6, (Vec3d)var5_5, var2_2.getProjectile(), 0.0, null, 24, null));
    }

    private final void resetMotionSmoothing() {
        trackedMotionPlayer = null;
        lastMotionTick = -1;
        Vec3d vec3d = Vec3d.ZERO;
        Intrinsics.checkNotNullExpressionValue(vec3d, "ZERO");
        previousMovement = vec3d;
        Vec3d vec3d2 = Vec3d.ZERO;
        Intrinsics.checkNotNullExpressionValue(vec3d2, "ZERO");
        currentMovement = vec3d2;
    }

    private final Vec3d smoothShooterMovement(PlayerEntity player, float partialTicks) {
        int ticksPassed;
        int tick;
        Vec3d sampledMovement;
        block5: {
            block4: {
                sampledMovement = this.sampleShooterMovement(player);
                tick = player.age;
                ticksPassed = tick - lastMotionTick;
                if (trackedMotionPlayer != player || lastMotionTick < 0) break block4;
                if (0 <= ticksPassed ? ticksPassed < 2 : false) break block5;
            }
            trackedMotionPlayer = player;
            lastMotionTick = tick;
            previousMovement = sampledMovement;
            currentMovement = sampledMovement;
            return sampledMovement;
        }
        if (ticksPassed == 1) {
            previousMovement = currentMovement;
            currentMovement = sampledMovement;
            lastMotionTick = tick;
        }
        double progress = RangesKt.coerceIn(partialTicks, 0.0f, 1.0f);
        Vec3d vec3d = previousMovement.add(currentMovement.subtract(previousMovement).multiply(progress));
        Intrinsics.checkNotNullExpressionValue(vec3d, "add(...)");
        return vec3d;
    }

    /*
     * WARNING - void declaration
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        void var5_5;
        void var12_11;
        void $this$mapTo$iv$iv;
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isEnabled()) {
            return;
        }
        GameOptions gameOptions = \u0636\u0643.getMc().options;
        Intrinsics.checkNotNullExpressionValue(gameOptions, "options");
        if (!\u0637\u062b.getPerspective(gameOptions).isFirstPerson()) {
            return;
        }
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return;
        }
        ClientWorld world = clientWorld;
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        PredictsModule.HeldWeapon heldWeapon = this.findHeldWeapon((PlayerEntity)player);
        if (heldWeapon == null) {
            return;
        }
        PredictsModule.HeldWeapon heldWeapon2 = heldWeapon;
        float previewAlpha = this.previewAlpha((PlayerEntity)player, heldWeapon2, event.getPartialTicks());
        if (previewAlpha <= 0.0f) {
            return;
        }
        Vec3d vec3d = \u0636\u0643.getMc().gameRenderer.getCamera().getCameraPos();
        Intrinsics.checkNotNullExpressionValue(vec3d, "position(...)");
        Vec3d cameraPos = vec3d;
        List<ProjectileLaunch> launches = this.createLaunches((PlayerEntity)player, heldWeapon2, cameraPos, event.getPartialTicks());
        if (launches.isEmpty()) {
            return;
        }
        Iterable $this$map$iv = launches;
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            void var16_15;
            ProjectileLaunch launch = (ProjectileLaunch)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            collection.add(\u062d\u0648.INSTANCE.predict(world, (PlayerEntity)player, (ProjectileLaunch)var16_15));
        }
        List predictions = (List)var12_11;
        \u0637\u0631.INSTANCE.render(event, cameraPos, predictions, 2.0f, 0.25f, (float)var5_5);
    }

    @Override
    public void onEnable() {
        this.resetMotionSmoothing();
    }

    private final Vec3d sampleShooterMovement(PlayerEntity player) {
        Vec3d vec3d = player.getMovement();
        Intrinsics.checkNotNullExpressionValue(vec3d, "getKnownMovement(...)");
        Vec3d movement = vec3d;
        return new Vec3d(movement.x, player.isOnGround() ? 0.0 : movement.y, movement.z);
    }

    private final float previewAlpha(PlayerEntity player, PredictsModule.HeldWeapon weapon, float partialTicks) {
        float f;
        switch (\u0635\u0630.$EnumSwitchMapping$0[weapon.getProjectile().ordinal()]) {
            case 1: {
                if (!player.isUsingItem() || !player.getActiveItem().isOf(Items.TRIDENT)) {
                    return 0.0f;
                }
                float progress = RangesKt.coerceIn(player.getItemUseTime(partialTicks) / 10.0f, 0.0f, 1.0f);
                f = progress * progress * (3.0f - 2.0f * progress);
                break;
            }
            case 2: {
                if (!player.isUsingItem() || !player.getActiveItem().isOf(Items.BOW)) {
                    return 0.0f;
                }
                if (this.bowPower(player, partialTicks) >= 0.1f) {
                    f = 1.0f;
                    break;
                }
                f = 0.0f;
                break;
            }
            default: {
                f = 1.0f;
            }
        }
        return f;
    }
}

