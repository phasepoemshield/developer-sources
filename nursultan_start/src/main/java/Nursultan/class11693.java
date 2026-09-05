/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonParseException
 */
package Nursultan;

import Nursultan.class11675;
import Nursultan.class11709;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class class11693 {
    public Object N_0;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;

    private void L() {
    }

    public class11693(Path path) {
        this.L();
        this.N_0 = path;
    }

    static {
        class11693.u();
        class11693.i();
        y_0 = new GsonBuilder().setPrettyPrinting().create();
        y_1 = new class11709().getType();
        y_2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    private Map<String, List<class11675>> B() throws IOException {
        try {
            Map map = (Map)((Gson)y_0).fromJson(Files.readString((Path)this.N_0, StandardCharsets.UTF_8), (Type)y_1);
            return map == null ? new LinkedHashMap() : map;
        }
        catch (JsonParseException jsonParseException) {
            return new LinkedHashMap<String, List<class11675>>();
        }
    }

    private static void i() {
        y_0 = null;
        y_1 = null;
        y_2 = null;
        y_3 = "{}";
    }

    private static void u() {
    }

    public void N(String string2, String string3, String string4) throws IOException {
        this.N();
        Map<String, List<class11675>> var4 = this.B();
        List var5 = var4.computeIfAbsent(string2, string -> new ArrayList());
        class11675 class116752 = new class11675(string3, string4, LocalDateTime.now().format((DateTimeFormatter)y_2));
        int n = class11693.N(var5, string3);
        if (n >= 0) {
            var5.set(n, class116752);
        } else {
            var5.add(class116752);
        }
        Files.writeString((Path)this.N_0, (CharSequence)((Gson)y_0).toJson(var4, (Type)y_1), StandardCharsets.UTF_8, new OpenOption[0]);
    }

    private static int N(List<class11675> list, String string) {
        for (int i = 0; i < list.size(); ++i) {
            if (!string.equals(list.get(i).L())) continue;
            return i;
        }
        return -1;
    }

    public Path N() throws IOException {
        Path path = ((Path)this.N_0).getParent();
        if (path != null) {
            if (Files.notExists(path, new LinkOption[0])) {
                Files.createDirectories(path, new FileAttribute[0]);
            } else if (!Files.isDirectory(path, new LinkOption[0])) {
                Files.deleteIfExists(path);
                Files.createDirectories(path, new FileAttribute[0]);
            }
        }
        if (Files.notExists((Path)this.N_0, new LinkOption[0])) {
            Files.writeString((Path)this.N_0, (CharSequence)"{}", StandardCharsets.UTF_8, new OpenOption[0]);
        }
        return (Path)this.N_0;
    }

    public Optional<class11675> N(String string, String string2) {
        if (Files.notExists((Path)this.N_0, new LinkOption[0])) {
            return Optional.empty();
        }
        try {
            List<class11675> var3 = this.B().get(string);
            if (var3 == null) {
                return Optional.empty();
            }
            return var3.stream().filter(class116752 -> string2.equals(class116752.L())).findFirst();
        }
        catch (IOException iOException) {
            return Optional.empty();
        }
    }
}

