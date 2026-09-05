/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class00471
 *  minecraft.class02928
 *  minecraft.class04111
 *  minecraft.class04129
 *  minecraft.class08122
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import minecraft.class00471;
import minecraft.class02928;
import minecraft.class04111;
import minecraft.class04129;
import minecraft.class07437;
import minecraft.class08122;

public class class07447
extends class00471<class07447> {
    private final ImmutableList.Builder<class04129> N = ImmutableList.builder();
    private final class02928<?> y;

    public class07447(class02928<?> class029282) {
        this.y = class029282;
    }

    public class08122 y() {
        return new class07437(this.R(), this.y, (List<class04129>)this.N.build());
    }

    protected class07447 L() {
        return this;
    }

    public class07447 N(class04111<?> class041112) {
        this.N.add((Object)class041112.y());
        return this;
    }
}

