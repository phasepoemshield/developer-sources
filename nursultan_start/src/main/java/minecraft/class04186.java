/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;

@FunctionalInterface
public interface class04186 {
    public static final class04186 N = FileSystem::getPathMatcher;
    public static final class04186 y = (fileSystem, string) -> path -> path.toString().startsWith(string);

    public PathMatcher compile(FileSystem var1, String var2);
}

