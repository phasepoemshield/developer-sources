/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  minecraft.class07001
 *  minecraft.class07023
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class07001;
import minecraft.class07023;
import minecraft.class07709;
import minecraft.class07741;
import minecraft.class07759;
import minecraft.class07773;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class class07793 {
    private final String y;
    private final Object2IntMap<class07773> L;
    private final class07773[] u;
    public static final Codec<class07793> N = Codec.STRING.comapFlatMap(string -> {
        try {
            Object object = new class07759().parse(new StringReader(string));
            return DataResult.success((Object)object);
        }
        catch (CommandSyntaxException commandSyntaxException) {
            return DataResult.error(() -> "Failed to parse path " + string + ": " + commandSyntaxException.getMessage());
        }
    }, class07793::a);

    public int L(class07709 class077092) {
        List<class07709> var2;
        List<class07709> list = Collections.singletonList(class077092);
        for (int i = 0; i < this.u.length - 1; ++i) {
            var2 = this.u[i].N(list);
        }
        class07773 class077732 = this.u[this.u.length - 1];
        return class07793.N(var2, class077732::N);
    }

    public class07793(String string, class07773[] class07773Array, Object2IntMap<class07773> object2IntMap) {
        this.y = string;
        this.u = class07773Array;
        this.L = object2IntMap;
    }

    public String toString() {
        return this.y;
    }

    private List<class07709> u(class07709 class077092) throws CommandSyntaxException {
        List<class07709> var2;
        List<class07709> list = Collections.singletonList(class077092);
        for (int i = 0; i < this.u.length - 1; ++i) {
            class07773 class077732 = this.u[i];
            int n = i + 1;
            var2 = class077732.N_84(list, this.u[n]::N);
            if (!var2.isEmpty()) continue;
            throw this.N(class077732);
        }
        return var2;
    }

    private int y() {
        return this.u.length;
    }

    public int y(class07709 class077092) {
        List<class07709> var2;
        List<class07709> list = Collections.singletonList(class077092);
        class07773[] class07773Array = this.u;
        int n = class07773Array.length;
        for (int i = 0; i < n; ++i) {
            var2 = class07773Array[i].N(list);
            if (!var2.isEmpty()) continue;
            return 0;
        }
        return var2.size();
    }

    public static class07793 N(String string) throws CommandSyntaxException {
        return new class07759().parse(new StringReader(string));
    }

    public String N() {
        return this.y;
    }

    public static boolean N(class07709 class077092, int n) {
        block4: {
            block3: {
                if (n >= 512) {
                    return true;
                }
                if (!(class077092 instanceof class07001)) break block3;
                for (class07709 class077093 : ((class07001)class077092).B()) {
                    if (!class07793.N(class077093, n + 1)) continue;
                    return true;
                }
                break block4;
            }
            if (!(class077092 instanceof class07741)) break block4;
            for (class07709 class077094 : (class07741)((Object)class077092)) {
                if (!class07793.N(class077094, n + 1)) continue;
                return true;
            }
        }
        return false;
    }

    private static int N(List<class07709> list, Function<class07709, Integer> function) {
        return list.stream().map(function).reduce(0, (n, n2) -> n + n2);
    }

    public List<class07709> N(class07709 class077092, Supplier<class07709> supplier) throws CommandSyntaxException {
        List<class07709> var3 = this.u(class077092);
        return this.u[this.u.length - 1].N_84(var3, supplier);
    }

    public List<class07709> N(class07709 class077092) throws CommandSyntaxException {
        List<class07709> var2;
        List<class07709> list = Collections.singletonList(class077092);
        for (class07773 class077732 : this.u) {
            var2 = class077732.N(list);
            if (!var2.isEmpty()) continue;
            throw this.N(class077732);
        }
        return var2;
    }

    public int N(class07709 class077092, class07709 class077094) throws CommandSyntaxException {
        if (class07793.N(class077094, this.y())) {
            throw class07759.y.create();
        }
        class07709 class077095 = class077094.N();
        List<class07709> var4 = this.u(class077092);
        if (var4.isEmpty()) {
            return 0;
        }
        class07773 class077732 = this.u[this.u.length - 1];
        MutableBoolean mutableBoolean = new MutableBoolean(false);
        return class07793.N(var4, (class07709 class077093) -> class077732.N((class07709)class077093, () -> {
            if (mutableBoolean.isFalse()) {
                mutableBoolean.setTrue();
                return class077095;
            }
            return class077095.N();
        }));
    }

    public int N(int n, class07001 class070012, List<class07709> list) throws CommandSyntaxException {
        ArrayList<class07709> arrayList = new ArrayList<class07709>(list.size());
        for (class07709 class077092 : list) {
            class07709 class077093 = class077092.N();
            arrayList.add(class077093);
            if (!class07793.N(class077093, this.y())) continue;
            throw class07759.y.create();
        }
        List<class07709> var5 = this.N((class07709)class070012, class07741::new);
        int n2 = 0;
        boolean bl = false;
        for (class07709 class077094 : var5) {
            if (!(class077094 instanceof class07023)) {
                throw class07759.u.create((Object)class077094);
            }
            class07023 class070232 = (class07023)class077094;
            boolean bl2 = false;
            int n3 = n < 0 ? class070232.size() + n + 1 : n;
            for (class07709 class077095 : arrayList) {
                try {
                    if (!class070232.y(n3, bl ? class077095.N() : class077095)) continue;
                    ++n3;
                    bl2 = true;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                    throw class07759.i.create((Object)n3);
                }
            }
            bl = true;
            n2 += bl2 ? 1 : 0;
        }
        return n2;
    }

    private CommandSyntaxException N(class07773 class077732) {
        int n = this.L.getInt((Object)class077732);
        return class07759.L.create((Object)this.y.substring(0, n));
    }

    public String a() {
        return this.y;
    }
}

