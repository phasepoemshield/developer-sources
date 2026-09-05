/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02579
 *  minecraft.class07536
 *  minecraft.class08743
 */
package minecraft;

import java.util.Arrays;
import java.util.Map;
import minecraft.class02579;
import minecraft.class07536;
import minecraft.class08743;

public class class03950
implements AutoCloseable {
    public static final int N = Arrays.stream(class08743.values()).mapToInt(class08743::y).sum();
    private final Map<class08743, class02579> y = class07536.N_74(class08743.class, class087432 -> new class02579(class087432.y()));

    @Override
    public void close() {
        this.y.values().forEach(class02579::close);
    }

    public void y() {
        this.y.values().forEach(class02579::L);
    }

    public class02579 N(class08743 class087432) {
        return this.y.get(class087432);
    }

    public void N() {
        this.y.values().forEach(class02579::y);
    }
}

