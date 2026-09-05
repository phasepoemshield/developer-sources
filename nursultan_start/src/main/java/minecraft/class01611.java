/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class01079
 *  minecraft.class01894
 *  minecraft.class02267
 *  minecraft.class02857
 *  minecraft.class02955
 *  minecraft.class02968
 *  minecraft.class03652
 *  minecraft.class06290
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import minecraft.class01079;
import minecraft.class01592;
import minecraft.class01593;
import minecraft.class01598;
import minecraft.class01603;
import minecraft.class01622;
import minecraft.class01894;
import minecraft.class02267;
import minecraft.class02857;
import minecraft.class02955;
import minecraft.class02968;
import minecraft.class03652;
import minecraft.class06290;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01611
implements class01622 {
    private static final Logger N = LogUtils.getLogger();
    private final class02267 u;
    private final class02955 i;
    private final Set<String> R;
    private final List<Path> M;
    private final Map<class01603, List<Path>> B;

    class01611(class02267 class022672, class02955 class029552, Set<String> set, List<Path> list, Map<class01603, List<Path>> map) {
        this.u = class022672;
        this.i = class029552;
        this.R = set;
        this.M = list;
        this.B = map;
    }

    @Override
    public void close() {
    }

    public class02857 y() {
        return class018942 -> Optional.ofNullable(this.method_14405(class01603.field_14188, class018942)).map(class036522 -> new class01079((class01622)this, class036522));
    }

    public void N(class01603 class016032, class01894 class018942, Consumer<Path> consumer) {
        class06290.i((String)class018942.N()).ifSuccess(list -> {
            String string = class018942.y();
            Iterator<Path> iterator = this.B.get((Object)class016032).iterator();
            while (iterator.hasNext()) {
                Path path = iterator.next().resolve(string);
                consumer.accept(class06290.N((Path)path, (List)list));
            }
        }).ifError(error -> N.error("Invalid path {}: {}", (Object)class018942, (Object)error.message()));
    }

    private static void N(class01593 class015932, String string, Path path, List<String> list) {
        Path path2 = path.resolve(string);
        class01592.N(string, path2, list, class015932);
    }

    @Override
    public @Nullable class03652<InputStream> method_14410(String ... stringArray) {
        class06290.N((String[])stringArray);
        List<String> list = List.of(stringArray);
        Iterator<Path> iterator = this.M.iterator();
        while (iterator.hasNext()) {
            Path path = class06290.N((Path)iterator.next(), list);
            if (!Files.exists(path, new LinkOption[0]) || !class01592.N(path)) continue;
            return class03652.N((Path)path);
        }
        return null;
    }

    @Override
    public class02267 method_56926() {
        return this.u;
    }

    @Override
    public Set<String> method_14406(class01603 class016032) {
        return this.R;
    }

    @Override
    public @Nullable class03652<InputStream> method_14405(class01603 class016032, class01894 class018942) {
        return (class03652)class06290.i((String)class018942.N()).mapOrElse(list -> {
            String string = class018942.y();
            Iterator<Path> iterator = this.B.get((Object)class016032).iterator();
            while (iterator.hasNext()) {
                Path path = class06290.N((Path)iterator.next().resolve(string), (List)list);
                if (!Files.exists(path, new LinkOption[0]) || !class01592.N(path)) continue;
                return class03652.N((Path)path);
            }
            return null;
        }, error -> {
            N.error("Invalid path {}: {}", (Object)class018942, (Object)error.message());
            return null;
        });
    }

    @Override
    public void method_14408(class01603 class016032, String string, String string2, class01593 class015932) {
        class06290.i((String)string2).ifSuccess(list -> {
            List<Path> list2 = this.B.get((Object)class016032);
            int n = list2.size();
            if (n == 1) {
                class01611.N(class015932, string, list2.get(0), list);
            } else if (n > 1) {
                HashMap<class01894, class03652<InputStream>> hashMap = new HashMap<class01894, class03652<InputStream>>();
                for (int i = 0; i < n - 1; ++i) {
                    class01611.N(hashMap::putIfAbsent, string, list2.get(i), list);
                }
                Path path = list2.get(n - 1);
                if (hashMap.isEmpty()) {
                    class01611.N(class015932, string, path, list);
                } else {
                    class01611.N(hashMap::putIfAbsent, string, path, list);
                    hashMap.forEach(class015932);
                }
            }
        }).ifError(error -> N.error("Invalid path {}: {}", (Object)string2, (Object)error.message()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public <T> @Nullable T method_14407(class02968<T> class029682) {
        class03652<InputStream> class036522 = this.method_14410("pack.mcmeta");
        if (class036522 == null) return (T)this.i.N(class029682);
        try (InputStream inputStream = (InputStream)class036522.get();){
            T t2 = class01598.method_14392(class029682, inputStream, this.u);
            if (t2 == null) return (T)this.i.N(class029682);
            T t = t2;
            return t;
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return (T)this.i.N(class029682);
    }
}

