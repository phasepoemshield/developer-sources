/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  com.google.common.hash.HashingOutputStream
 *  com.mojang.logging.LogUtils
 *  minecraft.class01996
 *  minecraft.class03172
 *  minecraft.class04476
 *  minecraft.class07001
 *  minecraft.class07135
 *  minecraft.class07536
 *  minecraft.class07717
 *  minecraft.class07726
 *  minecraft.class07742
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.mojang.logging.LogUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import minecraft.class01996;
import minecraft.class03172;
import minecraft.class04476;
import minecraft.class07001;
import minecraft.class07135;
import minecraft.class07536;
import minecraft.class07717;
import minecraft.class07726;
import minecraft.class07742;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06887
implements class07135 {
    private static final Logger N = LogUtils.getLogger();
    private final Iterable<Path> i;
    private final class01996 R;

    public class06887(class01996 class019962, Collection<Path> collection) {
        this.i = collection;
        this.R = class019962;
    }

    private static String N(Path path, Path path2) {
        String string = path.relativize(path2).toString().replaceAll("\\\\", "/");
        return string.substring(0, string.length() - ".nbt".length());
    }

    public static void N(class04476 class044762, Path path, String string) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HashingOutputStream hashingOutputStream = new HashingOutputStream(Hashing.sha1(), (OutputStream)byteArrayOutputStream);
        hashingOutputStream.write(string.getBytes(StandardCharsets.UTF_8));
        hashingOutputStream.write(10);
        class044762.method_43346(path, byteArrayOutputStream.toByteArray(), hashingOutputStream.hash());
    }

    /*
     * Enabled aggressive exception aggregation
     */
    public static @Nullable Path N(class04476 class044762, Path path, String string, Path path2) {
        try (InputStream inputStream = Files.newInputStream(path, new OpenOption[0]);){
            Path path3;
            try (class03172 class031722 = new class03172(inputStream);){
                Path path4 = path2.resolve(string + ".snbt");
                class06887.N(class044762, path4, class07717.N((class07001)class07742.N_82((InputStream)class031722, (class07726)class07726.L())));
                N.info("Converted {} from NBT to SNBT", (Object)string);
                path3 = path4;
            }
            return path3;
        }
        catch (IOException iOException) {
            N.error("Couldn't convert {} from NBT to SNBT at {}", new Object[]{string, path, iOException});
            return null;
        }
    }

    public String method_10321() {
        return "NBT -> SNBT";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        Path path = this.R.method_45971();
        ArrayList<CompletionStage> arrayList = new ArrayList<CompletionStage>();
        for (Path path2 : this.i) {
            arrayList.add(CompletableFuture.supplyAsync(() -> {
                CompletableFuture<Void> var4;
                block8: {
                    Stream<Path> var3 = Files.walk(path2, new FileVisitOption[0]);
                    try {
                        var4 = CompletableFuture.allOf((CompletableFuture[])var3.filter(path -> path.toString().endsWith(".nbt")).map(path3 -> CompletableFuture.runAsync(() -> class06887.N(class044762, path3, class06887.N(path2, path3), path), (Executor)class07536.Z())).toArray(CompletableFuture[]::new));
                        if (var3 == null) break block8;
                    }
                    catch (Throwable throwable) {
                        try {
                            if (var3 != null) {
                                try {
                                    var3.close();
                                }
                                catch (Throwable throwable2) {
                                    throwable.addSuppressed(throwable2);
                                }
                            }
                            throw throwable;
                        }
                        catch (IOException iOException) {
                            N.error("Failed to read structure input directory", (Throwable)iOException);
                            return CompletableFuture.completedFuture(null);
                        }
                    }
                    var3.close();
                }
                return var4;
            }, class07536.B().N("NbtToSnbt")).thenCompose(completableFuture -> completableFuture));
        }
        return CompletableFuture.allOf((CompletableFuture[])arrayList.toArray(CompletableFuture[]::new));
    }
}

