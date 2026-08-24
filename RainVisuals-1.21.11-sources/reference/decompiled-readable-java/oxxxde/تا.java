/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.component.ComponentChanges
 *  net.minecraft.component.ComponentType
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.item.ItemStack
 */
package oxxxde;

import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.component.ComponentChanges;
import net.minecraft.component.ComponentType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2={"Loxxxde/\u062a\u0627;", "", "<init>", "()V", "Lnet/minecraft/class_1799;", "actual", "expected", "", "matches", "(Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z", "stack", "", "identityName", "(Lnet/minecraft/class_1799;)Ljava/lang/String;", "Lnet/minecraft/class_9326;", "stableComponents", "(Lnet/minecraft/class_1799;)Lnet/minecraft/class_9326;", "STAR_MARKER", "Ljava/lang/String;", "", "Lnet/minecraft/class_9331;", "nonIdentityComponents", "Ljava/util/Set;", "Ljava/util/function/Predicate;", "forgetNonIdentity", "Ljava/util/function/Predicate;", "rain-visuals"})
public final class \u062a\u0627 {
    @NotNull
    private static final Predicate<ComponentType<?>> forgetNonIdentity;
    @NotNull
    public static final \u062a\u0627 INSTANCE;
    @NotNull
    private static final String STAR_MARKER = "[\u2605]";
    @NotNull
    private static final Set<ComponentType<?>> nonIdentityComponents;

    public final boolean matches(@NotNull ItemStack actual, @NotNull ItemStack expected) {
        block5: {
            block4: {
                Intrinsics.checkNotNullParameter(actual, "actual");
                Intrinsics.checkNotNullParameter(expected, "expected");
                if (actual.isEmpty()) break block4;
                if (expected.isEmpty()) break block4;
                if (actual.getItem() == expected.getItem()) break block5;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.identityName(actual), this.identityName(expected))) {
            return false;
        }
        return Intrinsics.areEqual(this.stableComponents(actual), this.stableComponents(expected));
    }

    private \u062a\u0627() {
    }

    static {
        INSTANCE = new \u062a\u0627();
        ComponentType[] componentTypeArray = new ComponentType[13];
        Intrinsics.checkNotNullExpressionValue(DataComponentTypes.CUSTOM_DATA, "CUSTOM_DATA");
        Intrinsics.checkNotNullExpressionValue(DataComponentTypes.DAMAGE, "DAMAGE");
        Intrinsics.checkNotNullExpressionValue(DataComponentTypes.REPAIR_COST, "REPAIR_COST");
        Intrinsics.checkNotNullExpressionValue(DataComponentTypes.CUSTOM_NAME, "CUSTOM_NAME");
        Intrinsics.checkNotNullExpressionValue(DataComponentTypes.ITEM_NAME, "ITEM_NAME");
        Intrinsics.checkNotNullExpressionValue(DataComponentTypes.LORE, "LORE");
        Intrinsics.checkNotNullExpressionValue(DataComponentTypes.TOOLTIP_DISPLAY, "TOOLTIP_DISPLAY");
        Intrinsics.checkNotNullExpressionValue(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, "ENCHANTMENT_GLINT_OVERRIDE");
        Intrinsics.checkNotNullExpressionValue(DataComponentTypes.BUNDLE_CONTENTS, "BUNDLE_CONTENTS");
        Intrinsics.checkNotNullExpressionValue(DataComponentTypes.CONTAINER, "CONTAINER");
        Intrinsics.checkNotNullExpressionValue(DataComponentTypes.BLOCK_ENTITY_DATA, "BLOCK_ENTITY_DATA");
        Intrinsics.checkNotNullExpressionValue(DataComponentTypes.CHARGED_PROJECTILES, "CHARGED_PROJECTILES");
        Intrinsics.checkNotNullExpressionValue(DataComponentTypes.BEES, "BEES");
        nonIdentityComponents = SetsKt.setOf(componentTypeArray);
        forgetNonIdentity = nonIdentityComponents::contains;
    }

    private final String identityName(ItemStack stack) {
        String string = stack.getName().getString();
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return ((Object)StringsKt.trim((CharSequence)StringsKt.replace$default(string, STAR_MARKER, "", false, 4, null))).toString();
    }

    private final ComponentChanges stableComponents(ItemStack stack) {
        ComponentChanges componentChanges = stack.getComponentChanges().withRemovedIf(forgetNonIdentity);
        Intrinsics.checkNotNullExpressionValue(componentChanges, "forget(...)");
        return componentChanges;
    }
}

