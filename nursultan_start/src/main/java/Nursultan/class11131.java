/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.ItemRelease
 *  Nursultan.class11223
 *  Nursultan.class11798
 *  minecraft.class06202
 *  minecraft.class07050
 */
package Nursultan;

import Nursultan.ItemRelease;
import Nursultan.class11223;
import Nursultan.class11798;
import java.util.function.BiPredicate;
import java.util.function.Function;
import minecraft.class06202;
import minecraft.class07050;

public abstract class class11131
extends class11798<ItemRelease>
implements BiPredicate<class06202, class07050> {
    public class11131(ItemRelease itemRelease, String string, boolean bl) {
        super((Object)itemRelease, string, bl);
    }

    public abstract void y(class06202 var1, class07050 var2);

    public abstract boolean N(class06202 var1, class07050 var2, Function<class11223, Boolean> var3);
}

