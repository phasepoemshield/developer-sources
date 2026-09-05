/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02676
 *  minecraft.class02695
 *  minecraft.class04206
 *  minecraft.class06581
 *  net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents$ModifyContext
 *  net.fabricmc.fabric.mixin.item.ItemAccessor
 */
package net.fabricmc.fabric.impl.item;

import java.util.function.BiConsumer;
import java.util.function.Predicate;
import minecraft.class02676;
import minecraft.class02695;
import minecraft.class04206;
import minecraft.class06581;
import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.fabricmc.fabric.mixin.item.ItemAccessor;

class DefaultItemComponentImpl$ModifyContextImpl
implements DefaultItemComponentEvents.ModifyContext {
    static final DefaultItemComponentImpl$ModifyContextImpl INSTANCE = new DefaultItemComponentImpl$ModifyContextImpl();

    private DefaultItemComponentImpl$ModifyContextImpl() {
    }

    public void modify(Predicate<class06581> predicate, BiConsumer<class02676, class06581> biConsumer) {
        for (class06581 class065812 : class04206.B) {
            if (!predicate.test(class065812)) continue;
            class02676 class026762 = class02695.N().N(class065812.R());
            biConsumer.accept(class026762, class065812);
            ((ItemAccessor)class065812).setComponents(class026762.N());
        }
    }
}

