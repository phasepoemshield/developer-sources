/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.MapMaker
 *  minecraft.class04206
 *  minecraft.class06584
 *  minecraft.class07482
 *  net.fabricmc.fabric.api.transfer.v1.item.base.SingleStackStorage
 */
package net.fabricmc.fabric.impl.transfer.item;

import com.google.common.collect.MapMaker;
import java.util.Map;
import minecraft.class04206;
import minecraft.class06584;
import minecraft.class07482;
import net.fabricmc.fabric.api.transfer.v1.item.base.SingleStackStorage;

public class CursorSlotWrapper
extends SingleStackStorage {
    private static final Map<class07482, CursorSlotWrapper> WRAPPERS = new MapMaker().weakValues().makeMap();
    private final class07482 screenHandler;

    public void setStack(class06584 class065842) {
        this.screenHandler.N(class065842);
    }

    private CursorSlotWrapper(class07482 class074822) {
        this.screenHandler = class074822;
    }

    public static CursorSlotWrapper get(class07482 class074822) {
        return WRAPPERS.computeIfAbsent(class074822, CursorSlotWrapper::new);
    }

    public String toString() {
        return "CursorSlotWrapper[" + String.valueOf(this.screenHandler) + "/" + String.valueOf(class04206.T.y((Object)this.screenHandler.N())) + "]";
    }

    public class06584 getStack() {
        return this.screenHandler.M();
    }
}

