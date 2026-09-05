/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02546
 *  minecraft.class02548
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class05033
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07438
 *  minecraft.class07463
 *  minecraft.class07468
 *  minecraft.class07471
 */
package minecraft;

import com.google.common.collect.HashMultimap;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class02525;
import minecraft.class02546;
import minecraft.class02548;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class05033;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07438;
import minecraft.class07463;
import minecraft.class07468;
import minecraft.class07471;

public final class class02541
extends Record
implements class02548 {
    private final class01894 id;
    private final class03556<class07468> attribute;
    private final class02546 amount;
    private final class07463 operation;
    public static final MapCodec<class02541> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("id").forGetter(class02541::y), (App)class07468.N.fieldOf("attribute").forGetter(class02541::L), (App)class02546.y.fieldOf("amount").forGetter(class02541::u), (App)class07463.field_45742.fieldOf("operation").forGetter(class02541::i)).apply(instance, class02541::new));

    public class03556<class07468> L() {
        return this.attribute;
    }

    public class02541(class01894 class018942, class03556<class07468> class035562, class02546 class025462, class07463 class074632) {
        this.id = class018942;
        this.attribute = class035562;
        this.amount = class025462;
        this.operation = class074632;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02541.class, "id;attribute;amount;operation", "id", "attribute", "amount", "operation"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02541.class, "id;attribute;amount;operation", "id", "attribute", "amount", "operation"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02541.class, "id;attribute;amount;operation", "id", "attribute", "amount", "operation"}, this);
    }

    public class07463 i() {
        return this.operation;
    }

    public class02546 u() {
        return this.amount;
    }

    public class01894 y() {
        return this.id;
    }

    private class01894 N(class05033 class050332) {
        return this.id.M("/" + class050332.method_15434());
    }

    public void N(class04782 class047822, int n, class02525 class025252, class07049 class070492, class06889 class068892, boolean bl) {
        if (bl && class070492 instanceof class07438) {
            ((class07438)class070492).method_6127().N(this.N(n, class025252.y()));
        }
    }

    public MapCodec<class02541> N() {
        return N;
    }

    private HashMultimap<class03556<class07468>, class07471> N(int n, class07085 class070852) {
        HashMultimap hashMultimap = HashMultimap.create();
        hashMultimap.put(this.attribute, (Object)this.N(n, (class05033)class070852));
        return hashMultimap;
    }

    public class07471 N(int n, class05033 class050332) {
        return new class07471(this.N(class050332), (double)this.u().N(n), this.i());
    }

    public void N(class02525 class025252, class07049 class070492, class06889 class068892, int n) {
        if (class070492 instanceof class07438) {
            ((class07438)class070492).method_6127().y(this.N(n, class025252.y()));
        }
    }
}

