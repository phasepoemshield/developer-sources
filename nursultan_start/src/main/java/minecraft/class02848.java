/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class03748
 *  minecraft.class04247
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06591
 *  minecraft.class07536
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class03748;
import minecraft.class04247;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06591;
import minecraft.class07536;

public final class class02848
extends Record
implements class02694 {
    private final List<class00392> lines;
    private final List<class00392> styledLines;
    public static final class02848 N = new class02848(List.of());
    public static final int y = 256;
    private static final class00405 M = class00405.N.N(class06541.field_1064).y(Boolean.valueOf(true));
    public static final Codec<class02848> L = class03748.N.sizeLimitedListOf(256).xmap(class02848::new, class02848::N);
    public static final class02362<class04247, class02848> u = class03748.y.N_33(class02389.L((int)256)).N_10(class02848::new, class02848::N);

    public class02848(List<class00392> list) {
        this(list, Lists.transform(list, class003922 -> class00390.N((class00392)class003922, (class00405)M)));
    }

    public class02848(List<class00392> list, List<class00392> list2) {
        if (list.size() > 256) {
            throw new IllegalArgumentException("Got " + list.size() + " lines, but maximum is 256");
        }
        this.lines = list;
        this.styledLines = list2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02848.class, "lines;styledLines", "lines", "styledLines"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02848.class, "lines;styledLines", "lines", "styledLines"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02848.class, "lines;styledLines", "lines", "styledLines"}, this);
    }

    public List<class00392> y() {
        return this.styledLines;
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        this.styledLines.forEach(consumer);
    }

    public List<class00392> N() {
        return this.lines;
    }

    public class02848 N(class00392 class003922) {
        return new class02848(class07536.N(this.lines, (Object)class003922));
    }
}

