/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10716
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.hash.Hashing
 *  com.mojang.logging.LogUtils
 *  minecraft.class04476
 *  minecraft.class04551
 *  minecraft.class07096
 *  minecraft.class07102
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10716;
import com.google.common.collect.ImmutableMap;
import com.google.common.hash.Hashing;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import minecraft.class04476;
import minecraft.class04551;
import minecraft.class07096;
import minecraft.class07102;
import minecraft.class07120;
import minecraft.class07129;
import org.apache.commons.lang3.mutable.MutableInt;
import org.slf4j.Logger;

public class class07104 {
    static final Logger N = LogUtils.getLogger();
    private static final String L = "// ";
    private final Path u;
    private final Path i;
    private final String R;
    private final Map<String, class07096> M;
    private final Set<String> B = new HashSet<String>();
    final Set<Path> y = new HashSet<Path>();
    private final int Z;
    private int z;

    public class07104(Path path, Collection<String> collection, class04551 class045512) throws IOException {
        this.R = class045512.comp_4024();
        this.u = path;
        this.i = path.resolve(".cache");
        Files.createDirectories(this.i, new FileAttribute[0]);
        HashMap<String, class07096> hashMap = new HashMap<String, class07096>();
        int n = 0;
        for (String string : collection) {
            Path path2 = this.y(string);
            this.y.add(path2);
            class07096 class070962 = class07104.N(path, path2);
            hashMap.put(string, class070962);
            n += class070962.N();
        }
        this.M = hashMap;
        this.Z = n;
    }

    private ZonedDateTime y() {
        return ZonedDateTime.of(LocalDateTime.MIN, ZoneOffset.UTC);
    }

    private Path y(String string) {
        return this.i.resolve(Hashing.sha1().hashString((CharSequence)string, StandardCharsets.UTF_8).toString());
    }

    public void N(class07129 class071292) {
        this.M.put(class071292.N(), class071292.y());
        this.B.add(class071292.N());
        this.z += class071292.L();
    }

    public boolean N(String string) {
        class07096 class070962 = this.M.get(string);
        return class070962 == null || !class070962.y().equals(this.R);
    }

    public CompletableFuture<class07129> N(String string, class10716 class107162) {
        class07096 class070962 = this.M.get(string);
        if (class070962 == null) {
            throw new IllegalStateException("Provider not registered: " + string);
        }
        class07120 class071202 = new class07120(string, this.R, class070962);
        return class107162.update((class04476)class071202).thenApply(object -> class071202.N());
    }

    private static class07096 N(Path path, Path path2) {
        if (Files.isReadable(path2)) {
            try {
                return class07096.N((Path)path, (Path)path2);
            }
            catch (Exception exception) {
                N.warn("Failed to parse cache {}, discarding", (Object)path2, (Object)exception);
            }
        }
        return new class07096("unknown", ImmutableMap.of());
    }

    public void N() throws IOException {
        HashSet<Path> hashSet = new HashSet<Path>();
        this.M.forEach((string, class070962) -> {
            if (this.B.contains(string)) {
                Path path = this.y((String)string);
                class070962.N(this.u, path, DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(this.y()) + "\t" + string);
            }
            hashSet.addAll((Collection<Path>)class070962.L().keySet());
        });
        hashSet.add(this.u.resolve("version.json"));
        MutableInt mutableInt = new MutableInt();
        MutableInt mutableInt2 = new MutableInt();
        Files.walkFileTree(this.u, (FileVisitor<? super Path>)new class07102(this, mutableInt, hashSet, mutableInt2));
        N.info("Caching: total files: {}, old count: {}, new count: {}, removed stale: {}, written: {}", new Object[]{mutableInt, this.Z, hashSet.size(), mutableInt2, this.z});
    }
}

