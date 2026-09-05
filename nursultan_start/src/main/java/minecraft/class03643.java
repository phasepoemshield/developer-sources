/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10082
 *  Nursultan.class10219
 *  com.google.gson.JsonObject
 *  minecraft.class02968
 *  minecraft.class05001
 */
package minecraft;

import Nursultan.class10082;
import Nursultan.class10219;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import minecraft.class02968;
import minecraft.class03634;
import minecraft.class03652;
import minecraft.class05001;

public interface class03643 {
    public static final class03643 N = new class03634();
    public static final class03652<class03643> y = () -> N;

    default public <T> Optional<class10082<T>> y(class02968<T> class029682) {
        return this.N(class029682).map(arg_0 -> class029682.N(arg_0));
    }

    public static class03643 N(InputStream inputStream) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));){
            JsonObject jsonObject = class05001.N((Reader)bufferedReader);
            class10219 class102192 = new class10219(jsonObject);
            return class102192;
        }
    }

    default public List<class10082<?>> N(Collection<class02968<?>> collection) {
        return collection.stream().map(this::y).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
    }

    public <T> Optional<T> N(class02968<T> var1);
}

