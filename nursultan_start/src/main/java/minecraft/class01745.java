/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class01859
 *  minecraft.class01862
 *  minecraft.class01870
 *  minecraft.class01887
 *  minecraft.class01894
 *  minecraft.class07684
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import minecraft.class01711;
import minecraft.class01716;
import minecraft.class01728;
import minecraft.class01737;
import minecraft.class01859;
import minecraft.class01862;
import minecraft.class01870;
import minecraft.class01887;
import minecraft.class01894;
import minecraft.class07684;
import org.jspecify.annotations.Nullable;

class class01745<T extends class01711<T>> {
    private @Nullable List<class01716<T>> N = new ArrayList<class01716<T>>();
    private @Nullable List<class01887<T>> y;
    private final List<String> L = new ArrayList<String>();

    class01745() {
    }

    private IntList N(List<String> list) {
        IntArrayList intArrayList = new IntArrayList(list.size());
        for (String string : list) {
            intArrayList.add(this.N(string));
        }
        return intArrayList;
    }

    public void N(String string, int n, T t) {
        class01737 class017372;
        try {
            class017372 = class01737.N(string);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException("Can't parse function line " + n + ": '" + string + "'", exception);
        }
        if (this.N != null) {
            this.y = new ArrayList<class01887<T>>(this.N.size() + 1);
            for (class01716<T> class017162 : this.N) {
                this.y.add((class01887<T>)new class01870(class017162));
            }
            this.N = null;
        }
        this.y.add((class01887<T>)new class01862(class017372, this.N(class017372.y()), t));
    }

    public class07684<T> N(class01894 class018942) {
        if (this.y != null) {
            return new class01859(class018942, this.y, this.L);
        }
        return new class01728<T>(class018942, this.N);
    }

    private int N(String string) {
        int n = this.L.indexOf(string);
        if (n == -1) {
            n = this.L.size();
            this.L.add(string);
        }
        return n;
    }

    public void N(class01716<T> class017162) {
        if (this.y != null) {
            this.y.add((class01887<T>)new class01870(class017162));
        } else {
            this.N.add(class017162);
        }
    }
}

