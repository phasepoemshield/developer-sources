/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import minecraft.class04168;

public class class04151
extends Exception {
    private final Path N;
    private final List<class04168> y;

    public class04151(Path path, List<class04168> list) {
        this.N = path;
        this.y = list;
    }

    @Override
    public String getMessage() {
        return class04151.N(this.N, this.y);
    }

    public static String N(Path path, List<class04168> list) {
        return "Failed to validate '" + String.valueOf(path) + "'. Found forbidden symlinks: " + list.stream().map(class041682 -> String.valueOf(class041682.N()) + "->" + String.valueOf(class041682.y())).collect(Collectors.joining(", "));
    }
}

