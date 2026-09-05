/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.util.List;
import minecraft.class02991;
import minecraft.class02993;

public class class02986 {
    private final class02991 N = new class02991();

    public class02986 N(List<String> list, String string2, Path path) {
        class02991 class029912 = this.N;
        for (String string3 : list) {
            class029912 = class029912.N().computeIfAbsent(string3, string -> new class02991());
        }
        class029912.y().put(string2, path);
        return this;
    }

    public FileSystem N(String string) {
        return new class02993(string, this.N);
    }

    public class02986 N(List<String> list, Path path) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Path can't be empty");
        }
        int n = list.size() - 1;
        return this.N(list.subList(0, n), list.get(n), path);
    }
}

