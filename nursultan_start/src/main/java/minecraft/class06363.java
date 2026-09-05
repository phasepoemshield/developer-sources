/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.function.BooleanSupplier;
import minecraft.class06367;
import minecraft.class06375;

public interface class06363<T> {
    public List<T> y();

    public static <T> class06363<T> N(BooleanSupplier booleanSupplier, List<T> list, List<T> list2) {
        ImmutableList immutableList = ImmutableList.copyOf(list);
        ImmutableList immutableList2 = ImmutableList.copyOf(list2);
        return new class06367(booleanSupplier, (List)immutableList2, (List)immutableList);
    }

    public static <T> class06363<T> N(Collection<T> collection) {
        ImmutableList immutableList = ImmutableList.copyOf(collection);
        return new class06375((List)immutableList);
    }

    public List<T> N();
}

