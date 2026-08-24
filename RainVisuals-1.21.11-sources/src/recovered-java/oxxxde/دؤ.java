/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.tooltip.TooltipData
 */
package oxxxde;

import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipData;

public record \u062f\u0624(List<ItemStack> items) implements TooltipData
{
    public \u062f\u0624 {
        items = List.copyOf(items);
    }
}

