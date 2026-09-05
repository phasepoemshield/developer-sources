/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import minecraft.class04170;
import org.slf4j.Logger;

public class class04153
implements PathMatcher {
    private static final Logger N = LogUtils.getLogger();
    private static final String y = "#";
    private final List<class04170> L;
    private final Map<String, PathMatcher> u = new ConcurrentHashMap<String, PathMatcher>();

    public class04153(List<class04170> list) {
        this.L = list;
    }

    @Override
    public boolean matches(Path path) {
        return this.N(path.getFileSystem()).matches(path);
    }

    public static class04153 N(BufferedReader bufferedReader) {
        return new class04153(bufferedReader.lines().flatMap(string -> class04170.N(string).stream()).toList());
    }

    public PathMatcher N(FileSystem fileSystem) {
        return this.u.computeIfAbsent(fileSystem.provider().getScheme(), string -> {
            List list;
            try {
                list = this.L.stream().map(class041702 -> class041702.N(fileSystem)).toList();
            }
            catch (Exception exception) {
                N.error("Failed to compile file pattern list", (Throwable)exception);
                return path -> false;
            }
            return switch (list.size()) {
                case 0 -> path -> false;
                case 1 -> (PathMatcher)list.get(0);
                default -> path -> {
                    Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        if (!((PathMatcher)iterator.next()).matches(path)) continue;
                        return true;
                    }
                    return false;
                };
            };
        });
    }
}

