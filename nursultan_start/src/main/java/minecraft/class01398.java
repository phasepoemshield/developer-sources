/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04651
 */
package minecraft;

import java.util.Optional;
import minecraft.class01400;
import minecraft.class01415;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04651;

public class class01398 {
    private Optional<class03543<class04651>> N = Optional.empty();
    private Optional<class01400> y = Optional.empty();

    private class01398() {
    }

    public class01415 y() {
        return new class01415(this.N, this.y);
    }

    public class01398 N(class03543<class04651> class035432) {
        this.N = Optional.of(class035432);
        return this;
    }

    public class01398 N(class01400 class014002) {
        this.y = Optional.of(class014002);
        return this;
    }

    public static class01398 N() {
        return new class01398();
    }

    public class01398 N(class04651 class046512) {
        this.N = Optional.of(class03543.N((class03556[])new class03556[]{class046512.U()}));
        return this;
    }
}

