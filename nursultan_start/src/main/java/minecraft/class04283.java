/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00201
 *  minecraft.class00211
 *  minecraft.class00226
 *  minecraft.class03529
 *  minecraft.class07209
 *  minecraft.class07701
 */
package minecraft;

import java.util.stream.Stream;
import minecraft.class00201;
import minecraft.class00211;
import minecraft.class00226;
import minecraft.class03529;
import minecraft.class04249;
import minecraft.class07209;
import minecraft.class07701;

public class class04283
implements class00211,
class00226 {
    static final class00211 N = Stream::empty;
    static final class00226 y = Stream::empty;
    private final class00211 L;
    private final class00226 u;
    private final class07701 i;

    class04283(class07701 class077012, class00211 class002112, class00226 class002262) {
        this.i = class077012;
        this.L = class002112;
        this.u = class002262;
    }

    public class07701 y() {
        return this.i;
    }

    public static class04249 N() {
        return new class04249();
    }

    public Stream<class07209> findTestPos() {
        return this.u.findTestPos();
    }

    public Stream<class03529<class00201>> findTests() {
        return this.L.findTests();
    }
}

