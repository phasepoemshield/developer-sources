/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06202
 */
package Nursultan;

import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class06202;

public interface class12040
extends Consumer<class06202>,
Predicate<class06202> {
    @Override
    public void accept(class06202 var1);

    @Override
    default public boolean test(class06202 class062022) {
        return true;
    }
}

