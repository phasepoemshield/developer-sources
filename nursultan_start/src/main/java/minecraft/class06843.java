/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class04803
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Objects;
import minecraft.class04803;
import minecraft.class06838;
import org.jspecify.annotations.Nullable;

public interface class06843 {
    public @Nullable class04803 method_32318(int var1);

    default public class06838 N_66(IntList intList) {
        return class06838.N(intList.intStream().mapToObj(this::method_32318).filter(Objects::nonNull).toList());
    }
}

