/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class02415
 *  minecraft.class04838
 *  minecraft.class04839
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.UnaryOperator;
import minecraft.class02415;
import minecraft.class04838;
import minecraft.class04839;

public class class04792 {
    private final class04839 N;

    public class04792() {
        this(new class04839((List)ImmutableList.of(), class04838.N));
    }

    private class04792(class04839 class048392) {
        this.N = class048392;
    }

    public class04792 N_50(UnaryOperator<class04838> unaryOperator) {
        return new class04792(this.N.N(unaryOperator));
    }

    public class04792 N(class02415 class024152) {
        return class024152.apply(this);
    }

    public class04839 N() {
        return this.N;
    }
}

