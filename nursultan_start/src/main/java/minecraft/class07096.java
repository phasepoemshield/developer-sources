/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.hash.HashCode
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07104
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.hash.HashCode;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Map;
import minecraft.class07104;
import org.jspecify.annotations.Nullable;

final class class07096
extends Record {
    final String version;
    private final ImmutableMap<Path, HashCode> data;

    public ImmutableMap<Path, HashCode> L() {
        return this.data;
    }

    class07096(String string, ImmutableMap<Path, HashCode> immutableMap) {
        this.version = string;
        this.data = immutableMap;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07096.class, "version;data", "version", "data"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07096.class, "version;data", "version", "data"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07096.class, "version;data", "version", "data"}, this);
    }

    private static String y(String string) {
        return string.replace('\\', '/');
    }

    public String y() {
        return this.version;
    }

    private ImmutableSet N(ImmutableSet immutableSet) {
        return (ImmutableSet)immutableSet.stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(path -> class07096.y(path.toString())))).collect(ImmutableSet.toImmutableSet());
    }

    private String N(String string) {
        return class07096.y(string);
    }

    public static class07096 N(Path path, Path path2) throws IOException {
        try (BufferedReader bufferedReader = Files.newBufferedReader(path2, StandardCharsets.UTF_8);){
            String string2 = bufferedReader.readLine();
            if (!string2.startsWith("// ")) {
                throw new IllegalStateException("Missing cache file header");
            }
            String[] stringArray = string2.substring("// ".length()).split("\t", 2);
            String string3 = stringArray[0];
            ImmutableMap.Builder builder = ImmutableMap.builder();
            bufferedReader.lines().forEach(string -> {
                int n = string.indexOf(32);
                builder.put((Object)path.resolve(string.substring(n + 1)), (Object)HashCode.fromString((String)string.substring(0, n)));
            });
            class07096 class070962 = new class07096(string3, (ImmutableMap<Path, HashCode>)builder.build());
            return class070962;
        }
    }

    public void N(Path path, Path path2, String string) {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path2, StandardCharsets.UTF_8, new OpenOption[0]);){
            bufferedWriter.write("// ");
            bufferedWriter.write(this.version);
            bufferedWriter.write(9);
            bufferedWriter.write(string);
            bufferedWriter.newLine();
            for (Map.Entry entry : this.N(this.data.entrySet())) {
                bufferedWriter.write(((HashCode)entry.getValue()).toString());
                bufferedWriter.write(32);
                bufferedWriter.write(this.N(path.relativize((Path)entry.getKey()).toString()));
                bufferedWriter.newLine();
            }
        }
        catch (IOException iOException) {
            class07104.N.warn("Unable write cachefile {}: {}", (Object)path2, (Object)iOException);
        }
    }

    public int N() {
        return this.data.size();
    }

    public @Nullable HashCode N(Path path) {
        return (HashCode)this.data.get((Object)path);
    }
}

