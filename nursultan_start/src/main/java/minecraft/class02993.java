/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10087
 *  com.google.common.base.Splitter
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10087;
import com.google.common.base.Splitter;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class02958;
import minecraft.class02960;
import minecraft.class02970;
import minecraft.class02973;
import minecraft.class02986;
import minecraft.class02991;
import minecraft.class02994;
import org.jspecify.annotations.Nullable;

public class class02993
extends FileSystem {
    private static final Set<String> y = Set.of("basic");
    public static final String N = "/";
    private static final Splitter L = Splitter.on((char)'/');
    private final FileStore u;
    private final FileSystemProvider i = new class02970();
    private final class02973 R;

    public static class02986 L() {
        return new class02986();
    }

    class02993(String string, class02991 class029912) {
        this.u = new class02958(string);
        this.R = class02993.N(class029912, this, "", null);
    }

    @Override
    public boolean isOpen() {
        return true;
    }

    @Override
    public FileSystemProvider provider() {
        return this.i;
    }

    @Override
    public void close() {
    }

    @Override
    public boolean isReadOnly() {
        return true;
    }

    @Override
    public Path getPath(String string, String ... stringArray) {
        String string2;
        Stream<String> stream = Stream.of(string);
        if (stringArray.length > 0) {
            stream = Stream.concat(stream, Stream.of(stringArray));
        }
        if ((string2 = stream.collect(Collectors.joining(N))).equals(N)) {
            return this.R;
        }
        if (string2.startsWith(N)) {
            class02973 class029732 = this.R;
            for (String string3 : L.split((CharSequence)string2.substring(1))) {
                if (string3.isEmpty()) {
                    throw new IllegalArgumentException("Empty paths not allowed");
                }
                class029732 = class029732.N(string3);
            }
            return class029732;
        }
        class02973 class029733 = null;
        for (String string4 : L.split((CharSequence)string2)) {
            if (string4.isEmpty()) {
                throw new IllegalArgumentException("Empty paths not allowed");
            }
            class029733 = new class02973(this, string4, class029733, class02960.y);
        }
        if (class029733 == null) {
            throw new IllegalArgumentException("Empty paths not allowed");
        }
        return class029733;
    }

    public class02973 y() {
        return this.R;
    }

    @Override
    public String getSeparator() {
        return N;
    }

    @Override
    public Set<String> supportedFileAttributeViews() {
        return y;
    }

    @Override
    public Iterable<Path> getRootDirectories() {
        return List.of(this.R);
    }

    @Override
    public Iterable<FileStore> getFileStores() {
        return List.of(this.u);
    }

    @Override
    public UserPrincipalLookupService getUserPrincipalLookupService() {
        throw new UnsupportedOperationException();
    }

    @Override
    public PathMatcher getPathMatcher(String string) {
        throw new UnsupportedOperationException();
    }

    @Override
    public WatchService newWatchService() {
        throw new UnsupportedOperationException();
    }

    public FileStore N() {
        return this.u;
    }

    private static class02973 N(class02991 class029913, class02993 class029932, String string2, @Nullable class02973 class029732) {
        Object2ObjectOpenHashMap object2ObjectOpenHashMap = new Object2ObjectOpenHashMap();
        class02973 class029733 = new class02973(class029932, string2, class029732, new class02994((Map<String, class02973>)object2ObjectOpenHashMap));
        class029913.y().forEach((string, path) -> object2ObjectOpenHashMap.put(string, (Object)new class02973(class029932, (String)string, class029733, (class02960)new class10087(path))));
        class029913.N().forEach((string, class029912) -> object2ObjectOpenHashMap.put(string, (Object)class02993.N(class029912, class029932, string, class029733)));
        object2ObjectOpenHashMap.trim();
        return class029733;
    }
}

