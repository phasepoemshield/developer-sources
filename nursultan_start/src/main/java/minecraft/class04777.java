/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class01091
 *  minecraft.class01255
 *  minecraft.class01623
 *  minecraft.class01894
 *  minecraft.class01898
 *  minecraft.class01929
 *  minecraft.class03101
 *  minecraft.class03140
 *  minecraft.class03152
 *  minecraft.class03175
 *  minecraft.class03519
 *  minecraft.class03526
 *  minecraft.class03767
 *  minecraft.class03776
 *  minecraft.class03781
 *  minecraft.class03794
 *  minecraft.class03796
 *  minecraft.class04151
 *  minecraft.class04153
 *  minecraft.class04173
 *  minecraft.class04583
 *  minecraft.class04999
 *  minecraft.class05081
 *  minecraft.class05323
 *  minecraft.class05715
 *  minecraft.class05934
 *  minecraft.class05976
 *  minecraft.class06207
 *  minecraft.class06228
 *  minecraft.class06290
 *  minecraft.class06434
 *  minecraft.class06435
 *  minecraft.class06479
 *  minecraft.class07001
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07312
 *  minecraft.class07536
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07717
 *  minecraft.class07726
 *  minecraft.class07742
 *  minecraft.class07878
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.attribute.FileAttribute;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class01091;
import minecraft.class01255;
import minecraft.class01623;
import minecraft.class01894;
import minecraft.class01898;
import minecraft.class01929;
import minecraft.class03101;
import minecraft.class03140;
import minecraft.class03152;
import minecraft.class03175;
import minecraft.class03519;
import minecraft.class03526;
import minecraft.class03767;
import minecraft.class03776;
import minecraft.class03781;
import minecraft.class03794;
import minecraft.class03796;
import minecraft.class04151;
import minecraft.class04153;
import minecraft.class04173;
import minecraft.class04583;
import minecraft.class04749;
import minecraft.class04779;
import minecraft.class04785;
import minecraft.class04999;
import minecraft.class05081;
import minecraft.class05323;
import minecraft.class05715;
import minecraft.class05934;
import minecraft.class05976;
import minecraft.class06207;
import minecraft.class06228;
import minecraft.class06290;
import minecraft.class06434;
import minecraft.class06435;
import minecraft.class06479;
import minecraft.class07001;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07312;
import minecraft.class07536;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07717;
import minecraft.class07726;
import minecraft.class07742;
import minecraft.class07878;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04777 {
    public static final Logger N = LogUtils.getLogger();
    public static final String y = "Data";
    private static final PathMatcher i = path -> false;
    public static final String L = "allowed_symlinks.txt";
    private static final int R = 0x4000000;
    private final Path M;
    private final Path B;
    final DataFixer u;
    private final class04173 Z;

    public Path L(String string) {
        return this.M.resolve(string);
    }

    static class07001 L(Path path) throws IOException {
        return class07742.N((Path)path, (class07726)class07726.y());
    }

    public Path L() {
        return this.M;
    }

    public class04777(Path path, Path path2, class04173 class041732, DataFixer dataFixer) {
        this.u = dataFixer;
        try {
            class06290.L((Path)path);
        }
        catch (IOException iOException) {
            throw new UncheckedIOException(iOException);
        }
        this.M = path;
        this.B = path2;
        this.Z = class041732;
    }

    public class04785 i(String string) throws IOException {
        Path path = this.L(string);
        return new class04785(this, string, path);
    }

    public class04173 i() {
        return this.Z;
    }

    private static @Nullable class07709 i(Path path) throws IOException {
        class03526 class035262 = new class03526(new class03152[]{new class03152(y, class07001.y, "Player"), new class03152(y, class07001.y, "WorldGenSettings")});
        class07742.N((Path)path, (class03175)class035262, (class07726)class07726.y());
        return class035262.u();
    }

    public class04785 u(String string) throws IOException, class04151 {
        Path path = this.L(string);
        List var3 = this.Z.N(path, true);
        if (!var3.isEmpty()) {
            throw new class04151(path, var3);
        }
        return new class04785(this, string, path);
    }

    static @Nullable Instant u(Path path) {
        try {
            return Files.getLastModifiedTime(path, new LinkOption[0]).toInstant();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public Path u() {
        return this.B;
    }

    public boolean y(String string) {
        try {
            return Files.isDirectory(this.L(string), new LinkOption[0]);
        }
        catch (InvalidPathException invalidPathException) {
            return false;
        }
    }

    public class04749 y() throws class01091 {
        class04749 class047492;
        block9: {
            if (!Files.isDirectory(this.M, new LinkOption[0])) {
                throw new class01091((class00392)class00392.L((String)"selectWorld.load_folder_access"));
            }
            Stream<Path> var1 = Files.list(this.M);
            try {
                List list = var1.filter(path -> Files.isDirectory(path, new LinkOption[0])).map(class04779::new).filter(class047792 -> Files.isRegularFile(class047792.y(), new LinkOption[0]) || Files.isRegularFile(class047792.L(), new LinkOption[0])).toList();
                class047492 = new class04749(list);
                if (var1 == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if (var1 != null) {
                        try {
                            var1.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    throw new class01091((class00392)class00392.L((String)"selectWorld.load_folder_access"));
                }
            }
            var1.close();
        }
        return class047492;
    }

    private static class03767 y(Dynamic<?> dynamic2) {
        Set set = dynamic2.get("enabled_features").asStream().flatMap(dynamic -> dynamic.asString().result().map(class01894::L).stream()).collect(Collectors.toSet());
        return class03794.i.N(set, (T class018942) -> {});
    }

    public static class04777 y(Path path) {
        class04173 class041732 = class04777.N(path.resolve(L));
        return new class04777(path, path.resolve("../backups"), class041732, class04999.N());
    }

    public static class04173 N(Path path) {
        if (Files.exists(path, new LinkOption[0])) {
            class04173 class041732;
            block9: {
                BufferedReader bufferedReader = Files.newBufferedReader(path);
                try {
                    class041732 = new class04173((PathMatcher)class04153.N((BufferedReader)bufferedReader));
                    if (bufferedReader == null) break block9;
                }
                catch (Throwable throwable) {
                    try {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (Exception exception) {
                        N.error("Failed to parse {}, disallowing all symbolic links", (Object)L, (Object)exception);
                    }
                }
                bufferedReader.close();
            }
            return class041732;
        }
        return new class04173(i);
    }

    public boolean N(String string) {
        try {
            Path path = this.L(string);
            Files.createDirectory(path, new FileAttribute[0]);
            Files.deleteIfExists(path);
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static class03776 N(Dynamic<?> dynamic) {
        return class03776.L.parse(dynamic).resultOrPartial(arg_0 -> ((Logger)N).error(arg_0)).orElse(class03776.u);
    }

    class06434 N(Dynamic<?> dynamic, class04779 class047792, boolean bl) {
        class05976 class059762 = class05976.N(dynamic);
        int n = class059762.N();
        if (n == 19132 || n == 19133) {
            boolean bl2 = n != this.R();
            Path path = class047792.u();
            class03776 class037762 = class04777.N(dynamic);
            class07312 class073122 = class07312.N(dynamic, (class03776)class037762);
            boolean bl3 = class03794.N((class03767)class04777.y(dynamic));
            return new class06434(class073122, class059762, class047792.N(), bl2, bl, bl3, path);
        }
        throw new class03140("Unknown data version: " + Integer.toHexString(n));
    }

    private static long N(class04779 class047792) {
        Instant instant = class04777.u(class047792.y());
        if (instant == null) {
            instant = class04777.u(class047792.L());
        }
        return instant == null ? -1L : instant.toEpochMilli();
    }

    private class06434 N(class04779 class047792, boolean bl) {
        Path path = class047792.y();
        if (Files.exists(path, new LinkOption[0])) {
            try {
                List var4;
                if (Files.isSymbolicLink(path) && !(var4 = this.Z.N(path)).isEmpty()) {
                    N.warn("{}", (Object)class04151.N((Path)path, (List)var4));
                    return new class06479(class047792.N(), class047792.u());
                }
                class07709 class077092 = class04777.i(path);
                if (class077092 instanceof class07001) {
                    class07001 class070012 = ((class07001)class077092).m(y);
                    int n = class07717.R((class07001)class070012);
                    Dynamic dynamic = class05715.field_59995.N(this.u, new Dynamic((DynamicOps)class07713.N, (Object)class070012), n);
                    return this.N(dynamic, class047792, bl);
                }
                N.warn("Invalid root tag in {}", (Object)path);
            }
            catch (Exception exception) {
                N.error("Exception reading {}", (Object)path, (Object)exception);
            }
        }
        return new class06435(class047792.N(), class047792.u(), class04777.N(class047792));
    }

    static Dynamic<?> N(Path path, DataFixer dataFixer) throws IOException {
        class07001 class070012 = class04777.L(path).m(y);
        int n = class07717.R((class07001)class070012);
        Dynamic dynamic2 = class05715.field_19212.N(dataFixer, new Dynamic((DynamicOps)class07713.N, (Object)class070012), n);
        dynamic2 = dynamic2.update("Player", dynamic -> class05715.field_19213.N(dataFixer, dynamic, n));
        dynamic2 = dynamic2.update("WorldGenSettings", dynamic -> class05715.field_24640.N(dataFixer, dynamic, n));
        return dynamic2;
    }

    public CompletableFuture<List<class06434>> N(class04749 class047492) {
        ArrayList<CompletableFuture<class06434>> arrayList = new ArrayList<CompletableFuture<class06434>>(class047492.y().size());
        for (class04779 class047792 : class047492.y()) {
            arrayList.add(CompletableFuture.supplyAsync(() -> {
                boolean bl;
                try {
                    bl = class05323.y((Path)class047792.R());
                }
                catch (Exception exception) {
                    N.warn("Failed to read {} lock", (Object)class047792.R(), (Object)exception);
                    return null;
                }
                try {
                    return this.N(class047792, bl);
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    class04583.y();
                    String string = "Ran out of memory trying to read summary of world folder \"" + class047792.N() + "\"";
                    N.error(LogUtils.FATAL_MARKER, string);
                    OutOfMemoryError outOfMemoryError2 = new OutOfMemoryError("Ran out of memory reading level data");
                    outOfMemoryError2.initCause(outOfMemoryError);
                    class07080 class070802 = class07080.N((Throwable)outOfMemoryError2, (String)string);
                    class07074 class070742 = class070802.N("World details");
                    class070742.N("Folder Name", (Object)class047792.N());
                    try {
                        long l = Files.size(class047792.y());
                        class070742.N("level.dat size", (Object)l);
                    }
                    catch (IOException iOException) {
                        class070742.N("level.dat size", (Throwable)iOException);
                    }
                    throw new class07878(class070802);
                }
            }, class07536.B().N("loadLevelSummaries")));
        }
        return class07536.i(arrayList).thenApply(list -> list.stream().filter(Objects::nonNull).sorted().toList());
    }

    public static class01898 N(Dynamic<?> dynamic, class01623 class016232, boolean bl) {
        return new class01898(class016232, class04777.N(dynamic), bl, false);
    }

    public static class03101 N(Dynamic<?> dynamic, class03776 class037762, class00751<class01255> class007512, class01929 class019292) {
        Dynamic dynamic2 = class03519.N(dynamic, (class01929)class019292);
        Dynamic dynamic3 = dynamic2.get("WorldGenSettings").orElseEmptyMap();
        class03796 class037962 = (class03796)class03796.N.parse(dynamic3).getOrThrow();
        class07312 class073122 = class07312.N((Dynamic)dynamic2, (class03776)class037762);
        class03781 class037812 = class037962.y().N(class007512);
        Lifecycle lifecycle = class037812.N().add(class019292.u());
        class06207 class062072 = class06207.N((Dynamic)dynamic2, (class07312)class073122, (class06228)class037812.u(), (class05934)class037962.N(), (Lifecycle)lifecycle);
        return new class03101((class05081)class062072, class037812);
    }

    public String N() {
        return "Anvil";
    }

    private int R() {
        return 19133;
    }
}

