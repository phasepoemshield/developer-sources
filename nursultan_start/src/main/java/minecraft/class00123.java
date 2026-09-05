/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00626
 *  minecraft.class00647
 *  minecraft.class03556
 *  minecraft.class05096
 *  minecraft.class08734
 *  minecraft.class08751
 *  minecraft.class08781
 *  minecraft.class09027
 *  minecraft.class09037
 *  minecraft.class09040
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00116;
import minecraft.class00626;
import minecraft.class00647;
import minecraft.class03556;
import minecraft.class05096;
import minecraft.class08734;
import minecraft.class08751;
import minecraft.class08781;
import minecraft.class09027;
import minecraft.class09037;
import minecraft.class09040;
import org.jspecify.annotations.Nullable;

public class class00123
extends class00116<class09040> {
    public class00123(@Nullable class05096 class050962, class09040 class090402, class08781 class087812) {
        super(class050962, class090402, class087812);
    }

    @Override
    protected Stream<class08734> N(class09040 class090402, class08781 class087812) {
        return class090402.i().N().map(class035562 -> class00123.N(class090402, (class03556<class09037>)class035562));
    }

    private static class08734 N(class09040 class090402, class03556<class09037> class035562) {
        return new class08734(new class09027(((class09037)class035562.N()).H_().N(), class090402.R()), Optional.of(new class08751((class00647)new class00626(class035562))));
    }
}

