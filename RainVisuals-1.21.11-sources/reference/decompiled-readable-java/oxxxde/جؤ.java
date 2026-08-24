/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.DyedColorComponent
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemConvertible
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 */
package oxxxde;

import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.DyedColorComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0628\u0635;
import oxxxde.\u0634\u063a;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2={"Loxxxde/\u062c\u0624;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "playerName", "", "invisible", "shouldReplaceArmor", "(Ljava/lang/String;Z)Z", "Lnet/minecraft/class_1304;", "slot", "Lnet/minecraft/class_1799;", "createReplacementArmor", "(Lnet/minecraft/class_1304;)Lnet/minecraft/class_1799;", "Lnet/minecraft/class_1792;", "item", "createColoredArmor", "(Lnet/minecraft/class_1792;)Lnet/minecraft/class_1799;", "", "FRIEND_ARMOR_COLOR", "I", "rain-visuals"})
public final class \u062c\u0624
extends Module {
    @NotNull
    public static final \u062c\u0624 INSTANCE = new \u062c\u0624();
    private static final int FRIEND_ARMOR_COLOR = 65280;

    private \u062c\u0624() {
        super("FriendsColor", \u0638\u0646.getPLAYER(), "\u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u0442 \u0434\u0440\u0443\u0437\u0435\u0439 \u0432 \u0437\u0435\u043b\u0451\u043d\u043e\u0439 \u0431\u0440\u043e\u043d\u0435");
    }

    private final ItemStack createColoredArmor(Item item) {
        ItemStack itemStack = new ItemStack((ItemConvertible)item);
        ItemStack $this$createColoredArmor_u24lambda_u240 = itemStack;
        boolean bl = false;
        $this$createColoredArmor_u24lambda_u240.set(DataComponentTypes.DYED_COLOR, (Object)new DyedColorComponent(65280));
        return itemStack;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean shouldReplaceArmor(@Nullable String playerName, boolean invisible) {
        if (!this.isEnabled()) return false;
        if (invisible) return false;
        if (!\u0634\u063a.INSTANCE.isFriend(playerName)) return false;
        return true;
    }

    @Nullable
    public final ItemStack createReplacementArmor(@Nullable EquipmentSlot slot) {
        EquipmentSlot equipmentSlot = slot;
        Item item = switch (equipmentSlot == null ? -1 : \u0628\u0635.$EnumSwitchMapping$0[equipmentSlot.ordinal()]) {
            case 1 -> Items.LEATHER_HELMET;
            case 2 -> Items.LEATHER_CHESTPLATE;
            case 3 -> Items.LEATHER_LEGGINGS;
            case 4 -> Items.LEATHER_BOOTS;
            default -> null;
        };
        if (item == null) {
            return null;
        }
        Item item2 = item;
        return this.createColoredArmor(item2);
    }
}

