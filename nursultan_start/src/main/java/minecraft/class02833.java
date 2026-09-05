/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10014
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.serialization.Codec
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class07085
 *  minecraft.class07463
 *  minecraft.class07468
 *  minecraft.class07471
 *  org.apache.commons.lang3.function.TriConsumer
 */
package minecraft;

import Nursultan.class10014;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02824;
import minecraft.class02831;
import minecraft.class02834;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class07085;
import minecraft.class07463;
import minecraft.class07468;
import minecraft.class07471;
import org.apache.commons.lang3.function.TriConsumer;

public final class class02833
extends Record {
    private final List<class02824> modifiers;
    public static final class02833 N = new class02833(List.of());
    public static final Codec<class02833> y = class02824.i.listOf().xmap(class02833::new, class02833::y);
    public static final class02362<class04247, class02833> L = class02362.N((class02362)class02824.R.N_33(class02389.N()), class02833::y, class02833::new);
    public static final DecimalFormat u = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.ROOT));

    public class02833(List<class02824> list) {
        this.modifiers = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02833.class, "modifiers", "modifiers"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02833.class, "modifiers", "modifiers"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02833.class, "modifiers", "modifiers"}, this);
    }

    public List<class02824> y() {
        return this.modifiers;
    }

    public double N(class03556<class07468> class035562, double d, class07085 class070852) {
        double d2 = d;
        for (class02824 class028242 : this.modifiers) {
            if (!class028242.L().y(class070852) || class028242.N() != class035562) continue;
            double d3 = class028242.y().y();
            d2 += (switch (class028242.y().L()) {
                default -> throw new MatchException(null, null);
                case class07463.field_6328 -> d3;
                case class07463.field_6330 -> d3 * d;
                case class07463.field_6331 -> d3 * d2;
            });
        }
        return d2;
    }

    public class02833 N(class03556<class07468> class035562, class07471 class074712, class02834 class028342) {
        ImmutableList.Builder builder = ImmutableList.builderWithExpectedSize((int)(this.modifiers.size() + 1));
        for (class02824 class028242 : this.modifiers) {
            if (class028242.N(class035562, class074712.N())) continue;
            builder.add((Object)class028242);
        }
        builder.add((Object)new class02824(class035562, class074712, class028342));
        return new class02833((List<class02824>)builder.build());
    }

    public void N(class02834 class028342, TriConsumer<class03556<class07468>, class07471, class02831> triConsumer) {
        for (class02824 class028242 : this.modifiers) {
            if (!class028242.L().equals(class028342)) continue;
            triConsumer.accept(class028242.N(), (Object)class028242.y(), (Object)class028242.u());
        }
    }

    public void N(class02834 class028342, BiConsumer<class03556<class07468>, class07471> biConsumer) {
        for (class02824 class028242 : this.modifiers) {
            if (!class028242.L().equals(class028342)) continue;
            biConsumer.accept(class028242.N(), class028242.y());
        }
    }

    public void N(class07085 class070852, BiConsumer<class03556<class07468>, class07471> biConsumer) {
        for (class02824 class028242 : this.modifiers) {
            if (!class028242.L().y(class070852)) continue;
            biConsumer.accept(class028242.N(), class028242.y());
        }
    }

    public static class10014 N() {
        return new class10014();
    }
}

