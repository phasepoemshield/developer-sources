/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02676
 *  minecraft.class06581
 */
package net.fabricmc.fabric.api.item.v1;

import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class02676;
import minecraft.class06581;

public interface DefaultItemComponentEvents$ModifyContext {
    public void modify(Predicate<class06581> var1, BiConsumer<class02676, class06581> var2);

    default public void modify(Collection<class06581> collection, BiConsumer<class02676, class06581> biConsumer) {
        this.modify(collection::contains, biConsumer);
    }

    default public void modify(class06581 class065813, Consumer<class02676> consumer) {
        this.modify(Predicate.isEqual(class065813), (class02676 class026762, class06581 class065812) -> consumer.accept((class02676)class026762));
    }
}

