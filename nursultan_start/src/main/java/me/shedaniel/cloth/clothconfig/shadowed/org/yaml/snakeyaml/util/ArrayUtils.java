/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util;

import java.util.Collections;
import java.util.List;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util.ArrayUtils$CompositeUnmodifiableArrayList;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util.ArrayUtils$UnmodifiableArrayList;

public class ArrayUtils {
    private ArrayUtils() {
    }

    public static <E> List<E> toUnmodifiableList(E[] EArray) {
        return EArray.length == 0 ? Collections.emptyList() : new ArrayUtils$UnmodifiableArrayList<E>(EArray);
    }

    public static <E> List<E> toUnmodifiableCompositeList(E[] EArray, E[] EArray2) {
        List<E> list = EArray.length == 0 ? ArrayUtils.toUnmodifiableList(EArray2) : (EArray2.length == 0 ? ArrayUtils.toUnmodifiableList(EArray) : new ArrayUtils$CompositeUnmodifiableArrayList<E>(EArray, EArray2));
        return list;
    }
}

