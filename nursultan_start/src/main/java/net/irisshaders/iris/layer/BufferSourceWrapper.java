/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  minecraft.class01407
 *  minecraft.class07311
 */
package net.irisshaders.iris.layer;

import java.util.function.Function;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class07311;

public class BufferSourceWrapper
implements class01407 {
    private final class01407 bufferSource;
    private final Function<class07311, class07311> typeChanger;

    public BufferSourceWrapper(class01407 class014072, Function<class07311, class07311> function) {
        this.bufferSource = class014072;
        this.typeChanger = function;
    }

    public class01391 method_73477(class07311 class073112) {
        return this.bufferSource.method_73477(this.typeChanger.apply(class073112));
    }

    public class01407 getOriginal() {
        return this.bufferSource;
    }
}

