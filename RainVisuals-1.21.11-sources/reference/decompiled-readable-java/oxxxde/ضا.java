/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.ContainerComponent
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.registry.tag.ItemTags
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.collection.DefaultedList
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ContainerComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062f\u0624;
import oxxxde.\u0638\u0646;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2={"Loxxxde/\u0636\u0627;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Lnet/minecraft/class_332;", "graphics", "Lnet/minecraft/class_1799;", "stack", "", "mouseX", "mouseY", "", "scheduleTooltip", "(Lnet/minecraft/class_332;Lnet/minecraft/class_1799;II)Z", "Lnet/minecraft/class_2371;", "contents", "(Lnet/minecraft/class_1799;)Lnet/minecraft/class_2371;", "isShulker", "(Lnet/minecraft/class_1799;)Z", "SHULKER_SLOTS", "I", "Loxxxde/\u062e\u0630;", "showContents", "Loxxxde/\u062e\u0630;", "rain-visuals"})
public final class \u0636\u0627
extends Module {
    private static final int SHULKER_SLOTS = 27;
    @NotNull
    public static final \u0636\u0627 INSTANCE = new \u0636\u0627();
    @NotNull
    private static final BooleanSetting showContents = Module.boolean$default(INSTANCE, "\u041f\u0440\u0435\u0434\u043e\u0441\u043c\u043e\u0442\u0440 \u0441\u043e\u0434\u0435\u0440\u0436\u0438\u043c\u043e\u0433\u043e", true, null, 4, null);

    /*
     * WARNING - void declaration
     */
    public final boolean scheduleTooltip(@NotNull DrawContext graphics, @NotNull ItemStack stack, int mouseX, int mouseY) {
        void var11_10;
        void $this$mapTo$iv$iv;
        block4: {
            block3: {
                Intrinsics.checkNotNullParameter(graphics, "graphics");
                Intrinsics.checkNotNullParameter(stack, "stack");
                if (!this.isEnabled() || !((Boolean)showContents.getValue()).booleanValue()) break block3;
                if (this.isShulker(stack)) break block4;
            }
            return false;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        Intrinsics.checkNotNullExpressionValue(minecraftClient, "getInstance(...)");
        MinecraftClient minecraft = minecraftClient;
        ItemStack itemStack = stack.copy();
        Intrinsics.checkNotNullExpressionValue(itemStack, "copy(...)");
        ItemStack textStack = itemStack;
        textStack.remove(DataComponentTypes.CONTAINER);
        Iterable $this$map$iv = (Iterable)this.contents(stack);
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            void var15_14;
            ItemStack p0 = (ItemStack)item$iv$iv;
            Collection collection = destination$iv$iv;
            boolean bl = false;
            collection.add(var15_14.copy());
        }
        List list = (List)var11_10;
        \u062f\u0624 preview = new \u062f\u0624(list);
        graphics.drawTooltip(minecraft.textRenderer, Screen.getTooltipFromItem((MinecraftClient)minecraft, (ItemStack)textStack), Optional.of(preview), mouseX, mouseY, (Identifier)stack.get(DataComponentTypes.TOOLTIP_STYLE));
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final DefaultedList<ItemStack> contents(ItemStack stack) {
        void var2_2;
        block0: {
            DefaultedList defaultedList = DefaultedList.ofSize((int)27, (Object)ItemStack.EMPTY);
            Intrinsics.checkNotNullExpressionValue(defaultedList, "withSize(...)");
            DefaultedList items = defaultedList;
            ContainerComponent containerComponent = (ContainerComponent)stack.get(DataComponentTypes.CONTAINER);
            if (containerComponent == null) break block0;
            containerComponent.copyTo(items);
        }
        return var2_2;
    }

    private final boolean isShulker(ItemStack stack) {
        if (stack.isIn(ItemTags.SHULKER_BOXES)) {
            return true;
        }
        Item item = stack.getItem();
        BlockItem blockItem = item instanceof BlockItem ? (BlockItem)item : null;
        if (blockItem == null) {
            return false;
        }
        BlockItem blockItem2 = blockItem;
        return blockItem2.getBlock() instanceof ShulkerBoxBlock;
    }

    private \u0636\u0627() {
        super("ShulkerHelper", \u0638\u0646.getPLAYER(), "\u0420\u0430\u0437\u043d\u044b\u0435 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0438 \u0448\u0430\u043b\u043a\u0435\u0440\u0430");
    }
}

