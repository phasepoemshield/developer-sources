/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class06497
 *  minecraft.class06584
 *  minecraft.class06591
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.client.item.v1;

import java.util.List;
import minecraft.class00392;
import minecraft.class06497;
import minecraft.class06584;
import minecraft.class06591;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public interface ItemTooltipCallback {
    public static final Event<ItemTooltipCallback> EVENT = EventFactory.createArrayBacked(ItemTooltipCallback.class, itemTooltipCallbackArray -> (class065842, class065912, class064972, list) -> {
        for (ItemTooltipCallback itemTooltipCallback : itemTooltipCallbackArray) {
            itemTooltipCallback.getTooltip(class065842, class065912, class064972, list);
        }
    });

    public void getTooltip(class06584 var1, class06591 var2, class06497 var3, List<class00392> var4);
}

