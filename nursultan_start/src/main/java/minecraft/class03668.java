/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.List;
import minecraft.class03658;
import minecraft.class03680;
import minecraft.class03695;

class class03668 {
    private static final int N = 44;
    private final List<class03680> y;
    private final class03695 L;

    class03668(List<class03680> list, class03695 class036952) {
        this.y = list;
        this.L = class036952;
    }

    public void y() {
        this.y.forEach(class03680::N);
    }

    public class03695 N() {
        return this.L;
    }

    public static class03658 N(int n) {
        return new class03658(n);
    }
}

