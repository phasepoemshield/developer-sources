/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  ru.ocz.protection.annotation.Compile
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import java.awt.Color;
import java.util.UUID;
import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.event.events.TotemPopEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.hud.NotifyModule;
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Link;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0627\u0625;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u0646;
import oxxxde.\u0638\u064b;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0007\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u001f\u0010\u0003R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010'\u00a8\u0006)"}, d2={"Loxxxde/\u0632\u0628;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u0633\u062d;", "event", "", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Loxxxde/\u0630\u0645;", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Loxxxde/\u0631\u0643;", "onTotemPop", "(Lkotakbaz/rain/event/events/TotemPopEvent;)V", "onEnable", "onDisable", "syncCachedTargetState", "Lnet/minecraft/class_1657;", "target", "cacheTarget", "(Lnet/minecraft/class_1657;)V", "activeTarget", "()Lnet/minecraft/class_1657;", "Lnet/minecraft/class_1799;", "heldTotem", "(Lnet/minecraft/class_1657;)Lnet/minecraft/class_1799;", "player", "", "isUsableTarget", "(Lnet/minecraft/class_1657;)Z", "resetCache", "Ljava/util/UUID;", "cachedTargetId", "Ljava/util/UUID;", "cachedTotemEnchanted", "Ljava/lang/Boolean;", "Ljava/awt/Color;", "enchantedColor", "Ljava/awt/Color;", "regularColor", "rain-visuals"})
@RecompileFormat
public final class \u0632\u0628
extends Module {
    @Nullable
    private static UUID cachedTargetId;
    @NotNull
    private static final Color regularColor;
    @NotNull
    private static final Color enchantedColor;
    @NotNull
    public static final \u0632\u0628 INSTANCE;
    @Nullable
    private static Boolean cachedTotemEnchanted;

    @Override
    public void onDisable() {
        this.resetCache();
    }

    private final ItemStack heldTotem(PlayerEntity $this$heldTotem) {
        if (\u0637\u062b.getMainHandStack((LivingEntity)$this$heldTotem).isOf(Items.TOTEM_OF_UNDYING)) {
            return \u0637\u062b.getMainHandStack((LivingEntity)$this$heldTotem);
        }
        if (\u0637\u062b.getOffHandStack((LivingEntity)$this$heldTotem).isOf(Items.TOTEM_OF_UNDYING)) {
            return \u0637\u062b.getOffHandStack((LivingEntity)$this$heldTotem);
        }
        return null;
    }

    @Commando
    @Compile
    public final void onUpdate(@NotNull PlayerUpdateEvent playerUpdateEvent) {
        Intrinsics.checkNotNullParameter(playerUpdateEvent, "event");
        \u0638\u064b.INSTANCE.update();
        this.syncCachedTargetState();
    }

    @Commando
    @Compile
    public final void onAttack(@NotNull AttackEvent attackEvent) {
        Intrinsics.checkNotNullParameter(attackEvent, "event");
        Entity entity = attackEvent.getEntity();
        if (!(entity instanceof PlayerEntity)) {
            return;
        }
        if (this.isUsableTarget((PlayerEntity)entity)) {
            \u0638\u064b.INSTANCE.track((PlayerEntity)entity);
            this.cacheTarget((PlayerEntity)entity);
        }
    }

    private final void cacheTarget(PlayerEntity target) {
        block1: {
            if (!Intrinsics.areEqual(cachedTargetId, target.getUuid())) {
                cachedTargetId = target.getUuid();
                cachedTotemEnchanted = null;
            }
            ItemStack itemStack = this.heldTotem(target);
            if (itemStack == null) break block1;
            ItemStack stack = itemStack;
            boolean bl = false;
            cachedTotemEnchanted = stack.hasGlint();
        }
    }

    private final void resetCache() {
        cachedTargetId = null;
        cachedTotemEnchanted = null;
    }

    @Commando
    public final void onTotemPop(@NotNull TotemPopEvent event) {
        boolean bl;
        Intrinsics.checkNotNullParameter(event, "event");
        \u0638\u064b.INSTANCE.update();
        this.syncCachedTargetState();
        PlayerEntity playerEntity = this.activeTarget();
        if (playerEntity == null) {
            return;
        }
        PlayerEntity activeTarget = playerEntity;
        PlayerEntity poppedPlayer = event.getPlayer();
        if (!Intrinsics.areEqual(poppedPlayer.getUuid(), activeTarget.getUuid())) {
            return;
        }
        Boolean bl2 = cachedTotemEnchanted;
        if (bl2 != null) {
            bl = bl2;
        } else {
            ItemStack itemStack = this.heldTotem(poppedPlayer);
            Boolean bl3 = itemStack != null ? Boolean.valueOf(itemStack.hasGlint()) : null;
            bl = bl3 != null ? bl3 : false;
        }
        boolean enchanted = bl;
        NotifyModule.MessageSegment[] messageSegmentArray = new NotifyModule.MessageSegment[3];
        messageSegmentArray[0] = new NotifyModule.MessageSegment("\u0412\u044b \u0441\u043d\u0435\u0441\u043b\u0438 ", null, false, 6, null);
        messageSegmentArray[1] = new NotifyModule.MessageSegment(enchanted ? "\u0437\u0430\u0447\u0430\u0440\u043e\u0432\u0430\u043d\u044b\u0439" : "\u043e\u0431\u044b\u0447\u043d\u044b\u0439", enchanted ? enchantedColor : regularColor, false, 4, null);
        messageSegmentArray[2] = new NotifyModule.MessageSegment(" \u0442\u043e\u0442\u0435\u043c \u0438\u0433\u0440\u043e\u043a\u0443 " + poppedPlayer.getGameProfile().name() + "!", null, false, 6, null);
        RainMainMenuScreen$Link.INSTANCE.showMessage(this, "q", CollectionsKt.listOf(messageSegmentArray));
    }

    private final void syncCachedTargetState() {
        PlayerEntity target = this.activeTarget();
        if (target == null) {
            this.resetCache();
            return;
        }
        this.cacheTarget(target);
    }

    private \u0632\u0628() {
        super("TotemTracker", \u0638\u0646.getPLAYER(), "\u0418\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044f \u043e \u0441\u043d\u043e\u0441\u0435 \u0442\u043e\u0442\u0435\u043c\u0430 \u043f\u0440\u043e\u0442\u0438\u0432\u043d\u0438\u043a\u0443");
    }

    private final boolean isUsableTarget(PlayerEntity player) {
        return !(Intrinsics.areEqual(player, \u0636\u0643.getMc().player) || player.isRemoved() || !player.isAlive() || player.isInvisible() || \u0627\u0625.INSTANCE.isFakePlayer((Entity)player));
    }

    static {
        INSTANCE = new \u0632\u0628();
        enchantedColor = new Color(85, 255, 85);
        regularColor = new Color(255, 85, 85);
    }

    /*
     * WARNING - void declaration
     */
    private final PlayerEntity activeTarget() {
        void var3_3;
        PlayerEntity target;
        PlayerEntity playerEntity = \u0638\u064b.INSTANCE.currentTarget();
        if (playerEntity == null) {
            return null;
        }
        PlayerEntity playerEntity2 = target = playerEntity;
        PlayerEntity p0 = playerEntity2;
        boolean bl = false;
        return this.isUsableTarget((PlayerEntity)var3_3) ? playerEntity2 : null;
    }

    @Override
    public void onEnable() {
        this.resetCache();
    }
}

