/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  minecraft.class05001
 *  minecraft.class06633
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import minecraft.class05001;
import minecraft.class05151;
import minecraft.class06633;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class05182<K, V extends class05151<K>> {
    private static final Logger y = LogUtils.getLogger();
    private static final Gson L = new GsonBuilder().setPrettyPrinting().create();
    private final File u;
    private final Map<String, V> i = Maps.newHashMap();
    protected final class06633 N;

    public File L() {
        return this.u;
    }

    public @Nullable V L(K k) {
        this.B();
        return (V)((class05151)this.i.get(this.y(k)));
    }

    public void M() throws IOException {
        if (!this.u.exists()) {
            return;
        }
        try (BufferedReader bufferedReader = Files.newReader((File)this.u, (Charset)StandardCharsets.UTF_8);){
            this.i.clear();
            JsonArray jsonArray = (JsonArray)L.fromJson((Reader)bufferedReader, JsonArray.class);
            if (jsonArray == null) {
                return;
            }
            Iterator var3 = jsonArray.iterator();
            while (var3.hasNext()) {
                JsonObject jsonObject = class05001.W((JsonElement)((JsonElement)var3.next()), (String)"entry");
                class05151<K> class051512 = this.N(jsonObject);
                if (class051512.B() == null) continue;
                this.i.put(this.y(class051512.B()), class051512);
            }
        }
    }

    public class05182(File file, class06633 class066332) {
        this.u = file;
        this.N = class066332;
    }

    private void B() {
        ArrayList arrayList = Lists.newArrayList();
        for (Object object : this.i.values()) {
            if (!((class05151)object).M()) continue;
            arrayList.add(((class05151)object).B());
        }
        for (Object object : arrayList) {
            this.i.remove(this.y(object));
        }
    }

    public Collection<V> i() {
        return this.i.values();
    }

    protected boolean u(K k) {
        return this.i.containsKey(this.y(k));
    }

    public boolean u() {
        return this.i.isEmpty();
    }

    protected String y(K k) {
        return k.toString();
    }

    public String[] y() {
        return this.i.keySet().toArray(new String[0]);
    }

    public boolean y(class05151<K> class051512) {
        return this.N((V)Objects.requireNonNull(class051512.B()));
    }

    public boolean N(K k) {
        if ((class05151)this.i.remove(this.y(k)) == null) {
            return false;
        }
        try {
            this.R();
        }
        catch (IOException iOException) {
            y.warn("Could not save the list after removing a user.", (Throwable)iOException);
        }
        return true;
    }

    public boolean N(V v) {
        String string = this.y(((class05151)v).B());
        class05151 class051512 = (class05151)this.i.get(string);
        if (v.equals(class051512)) {
            return false;
        }
        this.i.put(string, v);
        try {
            this.R();
        }
        catch (IOException iOException) {
            y.warn("Could not save the list after adding a user.", (Throwable)iOException);
        }
        return true;
    }

    public void N() {
        this.i.clear();
        try {
            this.R();
        }
        catch (IOException iOException) {
            y.warn("Could not save the list after removing a user.", (Throwable)iOException);
        }
    }

    protected abstract class05151<K> N(JsonObject var1);

    public void R() throws IOException {
        JsonArray jsonArray = new JsonArray();
        this.i.values().stream().map(class051512 -> (JsonObject)class07536.N((Object)new JsonObject(), class051512::N)).forEach(arg_0 -> ((JsonArray)jsonArray).add(arg_0));
        try (BufferedWriter bufferedWriter = Files.newWriter((File)this.u, (Charset)StandardCharsets.UTF_8);){
            L.toJson((JsonElement)jsonArray, L.newJsonWriter((Writer)bufferedWriter));
        }
    }
}

