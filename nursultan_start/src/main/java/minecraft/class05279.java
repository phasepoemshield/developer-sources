/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.nio.file.Path;
import java.util.function.UnaryOperator;
import minecraft.class05270;

public class class05279 {
    private final Path N;
    private class05270 y;

    public class05279(Path path) {
        this.N = path;
        this.y = class05270.N(path);
    }

    public void y() {
        this.y.L(this.N);
    }

    public class05270 N() {
        return this.y;
    }

    public class05279 N(UnaryOperator<class05270> unaryOperator) {
        this.y = (class05270)unaryOperator.apply(this.y);
        this.y.L(this.N);
        return this;
    }
}

