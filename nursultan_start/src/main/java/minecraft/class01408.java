/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class05033
 *  minecraft.class08092
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import minecraft.class01400;
import minecraft.class01416;
import minecraft.class01428;
import minecraft.class05033;
import minecraft.class08092;

public class class01408 {
    private final ImmutableList.Builder<class01428> N = ImmutableList.builder();

    private class01408() {
    }

    public Optional<class01400> y() {
        return Optional.of(new class01400((List<class01428>)this.N.build()));
    }

    public class01408 N(class08092<Integer> class080922, int n) {
        return this.N(class080922, Integer.toString(n));
    }

    public <T extends Comparable<T> & class05033> class01408 N(class08092<T> class080922, T t) {
        return this.N(class080922, ((class05033)t).method_15434());
    }

    public class01408 N(class08092<Boolean> class080922, boolean bl) {
        return this.N(class080922, Boolean.toString(bl));
    }

    public static class01408 N() {
        return new class01408();
    }

    public class01408 N(class08092<?> class080922, String string) {
        this.N.add((Object)new class01428(class080922.R(), new class01416(string)));
        return this;
    }
}

