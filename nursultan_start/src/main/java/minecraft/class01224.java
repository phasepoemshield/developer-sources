/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09450
 *  Nursultan.class09453
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  minecraft.class00719
 *  minecraft.class00891
 *  minecraft.class01089
 *  minecraft.class01207
 *  minecraft.class01894
 *  minecraft.class02055
 *  minecraft.class03069
 *  minecraft.class03172
 *  minecraft.class04476
 *  minecraft.class04785
 *  minecraft.class05071
 *  minecraft.class05514
 *  minecraft.class05715
 *  minecraft.class06290
 *  minecraft.class06887
 *  minecraft.class07001
 *  minecraft.class07529
 *  minecraft.class07717
 *  minecraft.class07726
 *  minecraft.class07742
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09450;
import Nursultan.class09453;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class00719;
import minecraft.class00891;
import minecraft.class01089;
import minecraft.class01207;
import minecraft.class01894;
import minecraft.class02055;
import minecraft.class03069;
import minecraft.class03172;
import minecraft.class04476;
import minecraft.class04785;
import minecraft.class05071;
import minecraft.class05514;
import minecraft.class05715;
import minecraft.class06290;
import minecraft.class06887;
import minecraft.class07001;
import minecraft.class07529;
import minecraft.class07717;
import minecraft.class07726;
import minecraft.class07742;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class class01224 {
    private static final Logger y = LogUtils.getLogger();
    public static final String N = "structure";
    private static final String L = "structures";
    private static final String u = ".nbt";
    private static final String i = ".snbt";
    private final Map<class01894, Optional<class01207>> R = Maps.newConcurrentMap();
    private final DataFixer M;
    private class01089 B;
    private final Path Z;
    private final List<class09450> z;
    private final class02055<class00891> U;
    private static final class03069 E = new class03069("structure", ".nbt");

    public boolean L(class01894 class018942) {
        Optional<class01207> var2 = this.R.get(class018942);
        if (var2.isEmpty()) {
            return false;
        }
        class01207 class012072 = var2.get();
        Path path = this.N(class018942, class07529.V ? i : u);
        Path path2 = path.getParent();
        if (path2 == null) {
            return false;
        }
        try {
            Files.createDirectories(Files.exists(path2, new LinkOption[0]) ? path2.toRealPath(new LinkOption[0]) : path2, new FileAttribute[0]);
        }
        catch (IOException iOException) {
            y.error("Failed to create parent directory: {}", (Object)path2);
            return false;
        }
        class07001 class070012 = class012072.N(new class07001());
        if (class07529.V) {
            try {
                class06887.N((class04476)class04476.N, (Path)path, (String)class07717.N((class07001)class070012));
            }
            catch (Throwable throwable) {
                return false;
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(path.toFile());){
            class07742.N((class07001)class070012, (OutputStream)fileOutputStream);
        }
        catch (Throwable throwable) {
            return false;
        }
        return true;
    }

    private Stream<class01894> L() {
        if (!Files.isDirectory(class05514.L, new LinkOption[0])) {
            return Stream.empty();
        }
        ArrayList arrayList = new ArrayList();
        this.N(class05514.L, "minecraft", i, arrayList::add);
        return arrayList.stream();
    }

    private Optional<class01207> M(class01894 class018942) {
        return this.N(class018942, class05514.L);
    }

    public class01224(class01089 class010892, class04785 class047852, DataFixer dataFixer, class02055<class00891> class020552) {
        this.B = class010892;
        this.M = dataFixer;
        this.Z = class047852.N(class05071.Z).normalize();
        this.U = class020552;
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.add((Object)new class09450(this::B, this::u));
        if (class07529.ND) {
            builder.add((Object)new class09450(this::M, this::L));
        }
        builder.add((Object)new class09450(this::R, this::y));
        this.z = builder.build();
    }

    private Optional<class01207> B(class01894 class018942) {
        if (!Files.isDirectory(this.Z, new LinkOption[0])) {
            return Optional.empty();
        }
        Path path = this.N(class018942, u);
        return this.N(() -> new FileInputStream(path.toFile()), (Throwable throwable) -> y.error("Couldn't load structure from {}", (Object)path, throwable));
    }

    private Optional<class01207> i(class01894 class018942) {
        for (class09450 class094502 : this.z) {
            try {
                Optional var4 = (Optional)class094502.N().apply(class018942);
                if (!var4.isPresent()) continue;
                return var4;
            }
            catch (Exception exception) {
            }
        }
        return Optional.empty();
    }

    private Stream<class01894> u() {
        if (!Files.isDirectory(this.Z, new LinkOption[0])) {
            return Stream.empty();
        }
        try {
            ArrayList arrayList = new ArrayList();
            try (DirectoryStream<Path> var2 = Files.newDirectoryStream(this.Z, path -> Files.isDirectory(path, new LinkOption[0]));){
                for (Path path2 : var2) {
                    String string = path2.getFileName().toString();
                    Path path3 = path2.resolve(L);
                    this.N(path3, string, u, arrayList::add);
                }
            }
            return arrayList.stream();
        }
        catch (IOException iOException) {
            return Stream.empty();
        }
    }

    public void u(class01894 class018942) {
        this.R.remove(class018942);
    }

    public Optional<class01207> y(class01894 class018942) {
        return this.R.computeIfAbsent(class018942, this::i);
    }

    private Stream<class01894> y() {
        return E.N(this.B).keySet().stream().map(arg_0 -> ((class03069)E).y(arg_0));
    }

    private static /* synthetic */ String N(int n, String string) {
        return string.substring(0, string.length() - n);
    }

    /*
     * Enabled aggressive exception aggregation
     */
    private Optional<class01207> N(class09453 class094532, Consumer<Throwable> consumer) {
        try (InputStream inputStream = class094532.open();){
            Optional<class01207> optional;
            try (class03172 class031722 = new class03172(inputStream);){
                optional = Optional.of(this.N((InputStream)class031722));
            }
            return optional;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return Optional.empty();
        }
        catch (Throwable throwable) {
            consumer.accept(throwable);
            return Optional.empty();
        }
    }

    private Optional<class01207> N(class01894 class018942, Path path) {
        Optional<class01207> optional;
        block10: {
            if (!Files.isDirectory(path, new LinkOption[0])) {
                return Optional.empty();
            }
            Path path2 = class06290.y((Path)path, (String)class018942.N(), (String)i);
            BufferedReader bufferedReader = Files.newBufferedReader(path2);
            try {
                String string = IOUtils.toString((Reader)bufferedReader);
                optional = Optional.of(this.N(class07717.N((String)string)));
                if (bufferedReader == null) break block10;
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
                catch (NoSuchFileException noSuchFileException) {
                    return Optional.empty();
                }
                catch (CommandSyntaxException | IOException throwable3) {
                    y.error("Couldn't load structure from {}", (Object)path2, (Object)throwable3);
                    return Optional.empty();
                }
            }
            bufferedReader.close();
        }
        return optional;
    }

    private String N(Path path, Path path2) {
        return path.relativize(path2).toString().replace(File.separator, "/");
    }

    private void N(Path path3, String string, String string2, Consumer<class01894> consumer) {
        Function<String, String> function = arg_0 -> class01224.N(string2.length(), arg_0);
        try (Stream<Path> var7 = Files.find(path3, Integer.MAX_VALUE, (path, basicFileAttributes) -> basicFileAttributes.isRegularFile() && path.toString().endsWith(string2), new FileVisitOption[0]);){
            var7.forEach(path2 -> {
                try {
                    consumer.accept(class01894.N((String)string, (String)((String)function.apply(this.N(path3, (Path)path2)))));
                }
                catch (class00719 class007192) {
                    y.error("Invalid location while listing folder {} contents", (Object)path3, (Object)class007192);
                }
            });
        }
        catch (IOException iOException) {
            y.error("Failed to list folder {} contents", (Object)path3, (Object)iOException);
        }
    }

    public Stream<class01894> N() {
        return this.z.stream().flatMap(class094502 -> (Stream)class094502.y().get()).distinct();
    }

    public void N(class01089 class010892) {
        this.B = class010892;
        this.R.clear();
    }

    public Path N(class01894 class018942, String string) {
        if (class018942.N().contains("//")) {
            throw new class00719("Invalid resource path: " + String.valueOf(class018942));
        }
        try {
            Path path = this.Z.resolve(class018942.y());
            Path path2 = class06290.y((Path)path.resolve(L), (String)class018942.N(), (String)string);
            if (!(path2.startsWith(this.Z) && class06290.N((Path)path2) && class06290.y((Path)path2))) {
                throw new class00719("Invalid resource path: " + String.valueOf(path2));
            }
            return path2;
        }
        catch (InvalidPathException invalidPathException) {
            throw new class00719("Invalid resource path: " + String.valueOf(class018942), (Throwable)invalidPathException);
        }
    }

    public class01207 N(class01894 class018942) {
        Optional<class01207> var2 = this.y(class018942);
        if (var2.isPresent()) {
            return var2.get();
        }
        class01207 class012072 = new class01207();
        this.R.put(class018942, Optional.of(class012072));
        return class012072;
    }

    public class01207 N(class07001 class070012) {
        class01207 class012072 = new class01207();
        int n = class07717.y((class07001)class070012, (int)500);
        class012072.N(this.U, class05715.field_19217.N(this.M, class070012, n));
        return class012072;
    }

    private class01207 N(InputStream inputStream) throws IOException {
        class07001 class070012 = class07742.N_82((InputStream)inputStream, (class07726)class07726.L());
        return this.N(class070012);
    }

    private Optional<class01207> R(class01894 class018942) {
        class01894 class018943 = E.N(class018942);
        return this.N(() -> this.B.u(class018943), (Throwable throwable) -> y.error("Couldn't load structure {}", (Object)class018942, throwable));
    }
}

