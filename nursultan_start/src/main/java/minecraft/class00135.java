/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00647
 *  minecraft.class00652
 *  minecraft.class02213
 *  minecraft.class05096
 *  minecraft.class08734
 *  minecraft.class08751
 *  minecraft.class08781
 *  minecraft.class09001
 *  minecraft.class09027
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00116;
import minecraft.class00647;
import minecraft.class00652;
import minecraft.class02213;
import minecraft.class05096;
import minecraft.class08734;
import minecraft.class08751;
import minecraft.class08781;
import minecraft.class09001;
import minecraft.class09027;
import org.jspecify.annotations.Nullable;

public class class00135
extends class00116<class09001> {
    public class00135(@Nullable class05096 class050962, class09001 class090012, class08781 class087812) {
        super(class050962, class090012, class087812);
    }

    @Override
    protected Stream<class08734> N(class09001 class090012, class08781 class087812) {
        return class087812.N().L().stream().map(class022132 -> class00135.N(class090012, class022132));
    }

    private static class08734 N(class09001 class090012, class02213 class022132) {
        return new class08734(new class09027(class022132.N(), class090012.i()), Optional.of(new class08751((class00647)new class00652(class022132.L()))));
    }
}

