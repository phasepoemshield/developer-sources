/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntLists
 *  minecraft.class01716
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntLists;
import java.util.List;
import minecraft.class01716;
import minecraft.class01887;
import minecraft.class01894;

class class01870<T>
implements class01887<T> {
    private final class01716<T> N;

    public class01870(class01716<T> class017162) {
        this.N = class017162;
    }

    @Override
    public IntList N() {
        return IntLists.emptyList();
    }

    @Override
    public class01716<T> N(List<String> list, CommandDispatcher<T> commandDispatcher, class01894 class018942) {
        return this.N;
    }
}

