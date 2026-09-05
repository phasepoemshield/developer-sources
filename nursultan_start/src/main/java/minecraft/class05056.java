/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01281
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01281;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class07536;

public final class class05056
extends Record {
    final int firstOctave;
    final DoubleList amplitudes;
    public static final Codec<class05056> L = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("firstOctave").forGetter(class05056::N), (App)Codec.DOUBLE.listOf().fieldOf("amplitudes").forGetter(class05056::y)).apply(instance, class05056::new));
    public static final Codec<class03556<class05056>> u = class01281.N((class05946)class04227.yW, L);

    public class05056(int n, DoubleList doubleList) {
        this.firstOctave = n;
        this.amplitudes = doubleList;
    }

    public class05056(int n, double d, double ... dArray) {
        this(n, (DoubleList)class07536.N((Object)new DoubleArrayList(dArray), (T doubleArrayList) -> doubleArrayList.add(0, d)));
    }

    public class05056(int n, List<Double> list) {
        this(n, (DoubleList)new DoubleArrayList(list));
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05056.class, "firstOctave;amplitudes", "firstOctave", "amplitudes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05056.class, "firstOctave;amplitudes", "firstOctave", "amplitudes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05056.class, "firstOctave;amplitudes", "firstOctave", "amplitudes"}, this);
    }

    public DoubleList y() {
        return this.amplitudes;
    }

    public int N() {
        return this.firstOctave;
    }
}

