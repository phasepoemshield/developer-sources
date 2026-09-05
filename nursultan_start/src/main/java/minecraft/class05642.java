/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class05677
 *  minecraft.class07709
 *  minecraft.class07793
 */
package minecraft;

import com.google.common.collect.Iterables;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import minecraft.class05677;
import minecraft.class07709;
import minecraft.class07793;

final class class05642
extends class05677 {
    class05642(String string, int n, String string2) {
        super(string, n, string2);
    }

    public void N(class07709 class077092, class07793 class077932, List<class07709> list) throws CommandSyntaxException {
        class077932.N(class077092, (class07709)Iterables.getLast(list));
    }
}

