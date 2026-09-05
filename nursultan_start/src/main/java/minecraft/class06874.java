/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10683
 *  com.google.common.collect.Lists
 *  com.google.common.hash.HashCode
 *  com.google.common.hash.Hashing
 *  com.google.common.hash.HashingOutputStream
 *  com.mojang.logging.LogUtils
 *  minecraft.class01996
 *  minecraft.class04476
 *  minecraft.class06860
 *  minecraft.class07001
 *  minecraft.class07135
 *  minecraft.class07536
 *  minecraft.class07717
 *  minecraft.class07742
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10683;
import com.google.common.collect.Lists;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import minecraft.class01996;
import minecraft.class04476;
import minecraft.class06860;
import minecraft.class06904;
import minecraft.class07001;
import minecraft.class07135;
import minecraft.class07536;
import minecraft.class07717;
import minecraft.class07742;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class class06874
implements class07135 {
    private static final Logger N = LogUtils.getLogger();
    private final class01996 i;
    private final Iterable<Path> R;
    private final List<class06904> M = Lists.newArrayList();

    public class06874(class01996 class019962, Iterable<Path> iterable) {
        this.i = class019962;
        this.R = iterable;
    }

    private void N(class04476 class044762, class06860 class068602, Path path) {
        Path path2 = path.resolve(class068602.N() + ".nbt");
        try {
            class044762.method_43346(path2, class068602.y(), class068602.L());
        }
        catch (IOException iOException) {
            N.error("Couldn't write structure {} at {}", new Object[]{class068602.N(), path2, iOException});
        }
    }

    private class07001 N(String string, class07001 class070012) {
        class07001 class070013 = class070012;
        Iterator<class06904> var4 = this.M.iterator();
        while (var4.hasNext()) {
            class070013 = var4.next().N(string, class070013);
        }
        return class070013;
    }

    private String N(Path path, Path path2) {
        String string = path.relativize(path2).toString().replaceAll("\\\\", "/");
        return string.substring(0, string.length() - ".snbt".length());
    }

    private class06860 N(Path path, String string) {
        class06860 class068602;
        block8: {
            BufferedReader bufferedReader = Files.newBufferedReader(path);
            try {
                String string2 = IOUtils.toString((Reader)bufferedReader);
                class07001 class070012 = this.N(string, class07717.N((String)string2));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                HashingOutputStream hashingOutputStream = new HashingOutputStream(Hashing.sha1(), (OutputStream)byteArrayOutputStream);
                class07742.N((class07001)class070012, (OutputStream)hashingOutputStream);
                byte[] byArray = byteArrayOutputStream.toByteArray();
                HashCode hashCode = hashingOutputStream.hash();
                class068602 = new class06860(string, byArray, hashCode);
                if (bufferedReader == null) break block8;
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
                catch (Throwable throwable3) {
                    throw new class10683(path, throwable3);
                }
            }
            bufferedReader.close();
        }
        return class068602;
    }

    public class06874 N(class06904 class069042) {
        this.M.add(class069042);
        return this;
    }

    public String method_10321() {
        return "SNBT -> NBT";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        Path path = this.i.method_45971();
        ArrayList arrayList = Lists.newArrayList();
        for (Path path2 : this.R) {
            arrayList.add(CompletableFuture.supplyAsync(() -> {
                CompletableFuture<Void> var5;
                block8: {
                    Stream<Path> var4 = Files.walk(path2, new FileVisitOption[0]);
                    try {
                        var5 = CompletableFuture.allOf((CompletableFuture[])var4.filter(path -> path.toString().endsWith(".snbt")).map(path3 -> CompletableFuture.runAsync(() -> {
                            class06860 class068602 = this.N((Path)path3, this.N(path2, (Path)path3));
                            this.N(class044762, class068602, path);
                        }, class07536.B().N("SnbtToNbt"))).toArray(CompletableFuture[]::new));
                        if (var4 == null) break block8;
                    }
                    catch (Throwable throwable) {
                        try {
                            if (var4 != null) {
                                try {
                                    var4.close();
                                }
                                catch (Throwable throwable2) {
                                    throwable.addSuppressed(throwable2);
                                }
                            }
                            throw throwable;
                        }
                        catch (Exception exception) {
                            throw new RuntimeException("Failed to read structure input directory, aborting", exception);
                        }
                    }
                    var4.close();
                }
                return var5;
            }, class07536.B().N("SnbtToNbt")).thenCompose(completableFuture -> completableFuture));
        }
        return class07536.u((List)arrayList);
    }
}

