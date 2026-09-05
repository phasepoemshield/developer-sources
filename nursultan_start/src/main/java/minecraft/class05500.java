/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04265
 *  minecraft.class04270
 *  minecraft.class04782
 */
package minecraft;

import java.util.Collection;
import minecraft.class04265;
import minecraft.class04270;
import minecraft.class04782;
import minecraft.class05492;
import minecraft.class05498;
import minecraft.class05513;
import minecraft.class05516;
import minecraft.class05520;
import minecraft.class05531;

public class class05500 {
    private final class04782 N;
    private final class05492 y = class05492.N;
    private class05498 L = class04265.N();
    private class05516 u = class05516.N;
    private class05516 i = class05516.y;
    private final Collection<class05531> R;
    private boolean M = false;
    private boolean B = false;

    public class05520 L() {
        return new class05520(this.L, this.R, this.N, this.y, this.u, this.i, this.M, this.B);
    }

    private class05500(Collection<class05531> collection, class04782 class047822) {
        this.R = collection;
        this.N = class047822;
    }

    public class05500 y() {
        this.B = true;
        return this;
    }

    public static class05500 y(Collection<class05513> collection, class04782 class047822) {
        return class05500.N(class04265.N().batch(collection), class047822);
    }

    public class05500 N(class04270 class042702) {
        this.u = class042702;
        return this;
    }

    public class05500 N(class05516 class055162) {
        this.i = class055162;
        return this;
    }

    public class05500 N(class05498 class054982) {
        this.L = class054982;
        return this;
    }

    public static class05500 N(Collection<class05531> collection, class04782 class047822) {
        return new class05500(collection, class047822);
    }

    public class05500 N() {
        this.M = true;
        return this;
    }
}

