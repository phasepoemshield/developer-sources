/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class01593
 *  minecraft.class01603
 *  minecraft.class01622
 *  minecraft.class01894
 *  minecraft.class02267
 *  minecraft.class02968
 *  minecraft.class03652
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import minecraft.class01593;
import minecraft.class01603;
import minecraft.class01622;
import minecraft.class01894;
import minecraft.class02267;
import minecraft.class02968;
import minecraft.class03652;
import org.jspecify.annotations.Nullable;

public class class04154
implements class01622 {
    private final class01622 N;
    private final List<class01622> u;

    public class04154(class01622 class016222, List<class01622> list) {
        this.N = class016222;
        ArrayList<class01622> arrayList = new ArrayList<class01622>(list.size() + 1);
        arrayList.addAll(Lists.reverse(list));
        arrayList.add(class016222);
        this.u = List.copyOf(arrayList);
    }

    public void close() {
        this.u.forEach(class01622::close);
    }

    public @Nullable class03652<InputStream> method_14410(String ... stringArray) {
        return this.N.method_14410(stringArray);
    }

    public class02267 method_56926() {
        return this.N.method_56926();
    }

    public Set<String> method_14406(class01603 class016032) {
        HashSet<String> hashSet = new HashSet<String>();
        for (class01622 class016222 : this.u) {
            hashSet.addAll(class016222.method_14406(class016032));
        }
        return hashSet;
    }

    public @Nullable class03652<InputStream> method_14405(class01603 class016032, class01894 class018942) {
        Iterator<class01622> var3 = this.u.iterator();
        while (var3.hasNext()) {
            class03652 var5 = var3.next().method_14405(class016032, class018942);
            if (var5 == null) continue;
            return var5;
        }
        return null;
    }

    public void method_14408(class01603 class016032, String string, String string2, class01593 class015932) {
        HashMap hashMap = new HashMap();
        Iterator<class01622> var6 = this.u.iterator();
        while (var6.hasNext()) {
            var6.next().method_14408(class016032, string, string2, hashMap::putIfAbsent);
        }
        hashMap.forEach(class015932);
    }

    public <T> @Nullable T method_14407(class02968<T> class029682) throws IOException {
        return (T)this.N.method_14407(class029682);
    }
}

