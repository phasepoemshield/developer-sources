/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  minecraft.class01894
 *  minecraft.class02267
 *  minecraft.class03652
 *  minecraft.class06290
 *  minecraft.class07529
 *  minecraft.class07536
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.Joiner;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Stream;
import minecraft.class01593;
import minecraft.class01598;
import minecraft.class01603;
import minecraft.class01894;
import minecraft.class02267;
import minecraft.class03652;
import minecraft.class06290;
import minecraft.class07529;
import minecraft.class07536;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01592
extends class01598 {
    private static final Logger N = LogUtils.getLogger();
    private static final Joiner u = Joiner.on((String)"/");
    private final Path i;

    public class01592(class02267 class022672, Path path) {
        super(class022672);
        this.i = path;
    }

    @Override
    public void close() {
    }

    private static @Nullable class03652<InputStream> y(Path path) {
        if (Files.exists(path, new LinkOption[0]) && class01592.N(path)) {
            return class03652.N((Path)path);
        }
        return null;
    }

    private static boolean N(Path path, BasicFileAttributes basicFileAttributes) {
        if (class07529.ND) {
            return basicFileAttributes.isRegularFile() && !StringUtils.equalsIgnoreCase((CharSequence)path.getFileName().toString(), (CharSequence)".ds_store");
        }
        return basicFileAttributes.isRegularFile();
    }

    public static boolean N(Path path) {
        if (!class07529.Ni) {
            return true;
        }
        if (path.getFileSystem() != FileSystems.getDefault()) {
            return true;
        }
        try {
            return path.toRealPath(new LinkOption[0]).endsWith(path);
        }
        catch (IOException iOException) {
            N.warn("Failed to resolve real path for {}", (Object)path, (Object)iOException);
            return false;
        }
    }

    public static void N(String string, Path path, List<String> list, class01593 class015932) {
        Path path3 = class06290.N((Path)path, list);
        try (Stream<Path> var5 = Files.find(path3, Integer.MAX_VALUE, class01592::N, new FileVisitOption[0]);){
            var5.forEach(path2 -> {
                String string2 = u.join((Iterable)path.relativize((Path)path2));
                class01894 class018942 = class01894.y((String)string, (String)string2);
                if (class018942 == null) {
                    class07536.y((String)String.format(Locale.ROOT, "Invalid path in pack: %s:%s, ignoring", string, string2));
                } else {
                    class015932.accept(class018942, class03652.N((Path)path2));
                }
            });
        }
        catch (NoSuchFileException | NotDirectoryException fileSystemException) {
        }
        catch (IOException iOException) {
            N.error("Failed to list path {}", (Object)path3, (Object)iOException);
        }
    }

    public static @Nullable class03652<InputStream> N(class01894 class018942, Path path) {
        return (class03652)class06290.i((String)class018942.N()).mapOrElse(list -> class01592.y(class06290.N((Path)path, (List)list)), error -> {
            N.error("Invalid path {}: {}", (Object)class018942, (Object)error.message());
            return null;
        });
    }

    @Override
    public @Nullable class03652<InputStream> method_14410(String ... stringArray) {
        class06290.N((String[])stringArray);
        Path path = class06290.N((Path)this.i, List.of(stringArray));
        if (Files.exists(path, new LinkOption[0])) {
            return class03652.N((Path)path);
        }
        return null;
    }

    @Override
    public Set<String> method_14406(class01603 class016032) {
        HashSet hashSet = Sets.newHashSet();
        Path path = this.i.resolve(class016032.N());
        try (DirectoryStream<Path> var4 = Files.newDirectoryStream(path);){
            for (Path path2 : var4) {
                String string = path2.getFileName().toString();
                if (class01894.z((String)string)) {
                    hashSet.add(string);
                    continue;
                }
                N.warn("Non [a-z0-9_.-] character in namespace {} in pack {}, ignoring", (Object)string, (Object)this.i);
            }
        }
        catch (NoSuchFileException | NotDirectoryException fileSystemException) {
        }
        catch (IOException iOException) {
            N.error("Failed to list path {}", (Object)path, (Object)iOException);
        }
        return hashSet;
    }

    @Override
    public @Nullable class03652<InputStream> method_14405(class01603 class016032, class01894 class018942) {
        Path path = this.i.resolve(class016032.N()).resolve(class018942.y());
        return class01592.N(class018942, path);
    }

    @Override
    public void method_14408(class01603 class016032, String string, String string2, class01593 class015932) {
        class06290.i((String)string2).ifSuccess(list -> {
            Path path = this.i.resolve(class016032.N()).resolve(string);
            class01592.N(string, path, list, class015932);
        }).ifError(error -> N.error("Invalid path {}: {}", (Object)string2, (Object)error.message()));
    }
}

