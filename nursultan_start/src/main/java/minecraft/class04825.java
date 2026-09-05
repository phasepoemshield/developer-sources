/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  minecraft.class06995
 *  minecraft.class06997
 *  minecraft.class07001
 *  minecraft.class07009
 *  minecraft.class07019
 *  minecraft.class07029
 *  minecraft.class07037
 *  minecraft.class07536
 *  minecraft.class07707
 *  minecraft.class07709
 *  minecraft.class07720
 *  minecraft.class07729
 *  minecraft.class07730
 *  minecraft.class07741
 *  minecraft.class07757
 */
package minecraft;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import minecraft.class04836;
import minecraft.class06995;
import minecraft.class06997;
import minecraft.class07001;
import minecraft.class07009;
import minecraft.class07019;
import minecraft.class07029;
import minecraft.class07037;
import minecraft.class07536;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class07720;
import minecraft.class07729;
import minecraft.class07730;
import minecraft.class07741;
import minecraft.class07757;

public class class04825
implements class04836 {
    private static final Map<String, List<String>> N = (Map)class07536.N((Object)Maps.newHashMap(), hashMap -> {
        hashMap.put("{}", Lists.newArrayList((Object[])new String[]{"DataVersion", "author", "size", "data", "entities", "palette", "palettes"}));
        hashMap.put("{}.data.[].{}", Lists.newArrayList((Object[])new String[]{"pos", "state", "nbt"}));
        hashMap.put("{}.entities.[].{}", Lists.newArrayList((Object[])new String[]{"blockPos", "pos"}));
    });
    private static final Set<String> y = Sets.newHashSet((Object[])new String[]{"{}.size.[]", "{}.data.[].{}", "{}.palette.[].{}", "{}.entities.[].{}"});
    private static final Pattern L = Pattern.compile("[A-Za-z0-9._+-]+");
    private static final String u = String.valueOf(':');
    private static final String i = String.valueOf(',');
    private static final String R = "[";
    private static final String M = "]";
    private static final String B = ";";
    private static final String Z = " ";
    private static final String z = "{";
    private static final String U = "}";
    private static final String E = "\n";
    private final String W;
    private final int m;
    private final List<String> P;
    private String s = "";

    public class04825() {
        this("    ", 0, Lists.newArrayList());
    }

    public class04825(String string, int n, List<String> list) {
        this.W = string;
        this.m = n;
        this.P = list;
    }

    private void y(String string) {
        this.P.add(string);
    }

    private void y() {
        this.P.remove(this.P.size() - 1);
    }

    protected List<String> y(class07001 class070012) {
        HashSet hashSet = Sets.newHashSet((Iterable)class070012.i());
        ArrayList arrayList = Lists.newArrayList();
        List<String> var4 = N.get(this.N());
        if (var4 != null) {
            for (String string : var4) {
                if (!hashSet.remove(string)) continue;
                arrayList.add(string);
            }
            if (!hashSet.isEmpty()) {
                hashSet.stream().sorted().forEach(arrayList::add);
            }
        } else {
            arrayList.addAll(hashSet);
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override
    public void N(class06995 class069952) {
        StringBuilder stringBuilder = new StringBuilder(R).append("I").append(B);
        int[] nArray = class069952.M();
        for (int i = 0; i < nArray.length; ++i) {
            stringBuilder.append(Z).append(nArray[i]);
            if (i == nArray.length - 1) continue;
            stringBuilder.append(class04825.i);
        }
        stringBuilder.append(M);
        this.s = stringBuilder.toString();
    }

    @Override
    public void N(class07001 class070012) {
        String string;
        if (class070012.z()) {
            this.s = "{}";
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(z);
        this.y("{}");
        String string2 = string = y.contains(this.N()) ? "" : this.W;
        if (!string.isEmpty()) {
            stringBuilder.append(E);
        }
        Iterator var5 = this.y(class070012).iterator();
        while (var5.hasNext()) {
            String string3 = (String)var5.next();
            class07709 class077092 = class070012.N(string3);
            this.y(string3);
            stringBuilder.append(Strings.repeat((String)string, (int)(this.m + 1))).append(class04825.N(string3)).append(u).append(Z).append(new class04825(string, this.m + 1, this.P).N(class077092));
            this.y();
            if (!var5.hasNext()) continue;
            stringBuilder.append(i).append(string.isEmpty() ? Z : E);
        }
        if (!string.isEmpty()) {
            stringBuilder.append(E).append(Strings.repeat((String)string, (int)this.m));
        }
        stringBuilder.append(U);
        this.s = stringBuilder.toString();
        this.y();
    }

    @Override
    public void N(class07741 class077412) {
        String string;
        if (class077412.isEmpty()) {
            this.s = "[]";
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(R);
        this.y("[]");
        String string2 = string = y.contains(this.N()) ? "" : this.W;
        if (!string.isEmpty()) {
            stringBuilder.append(E);
        }
        for (int i = 0; i < class077412.size(); ++i) {
            stringBuilder.append(Strings.repeat((String)string, (int)(this.m + 1)));
            stringBuilder.append(new class04825(string, this.m + 1, this.P).N(class077412.get(i)));
            if (i == class077412.size() - 1) continue;
            stringBuilder.append(class04825.i).append(string.isEmpty() ? Z : E);
        }
        if (!string.isEmpty()) {
            stringBuilder.append(E).append(Strings.repeat((String)string, (int)this.m));
        }
        stringBuilder.append(M);
        this.s = stringBuilder.toString();
        this.y();
    }

    @Override
    public void N(class06997 class069972) {
    }

    protected static String N(String string) {
        if (L.matcher(string).matches()) {
            return string;
        }
        return class07707.y((String)string);
    }

    public String N() {
        return String.join((CharSequence)".", this.P);
    }

    @Override
    public void N(class07729 class077292) {
        this.s = class077292.m() + "L";
    }

    @Override
    public void N(class07720 class077202) {
        this.s = String.valueOf(class077202.m());
    }

    @Override
    public void N(class07730 class077302) {
        this.s = class077302.m() + "s";
    }

    @Override
    public void N(class07037 class070372) {
        this.s = class070372.m() + "b";
    }

    @Override
    public void N(class07707 class077072) {
        this.s = class07707.y((String)class077072.U());
    }

    @Override
    public void N(class07757 class077572) {
        String string = "L";
        StringBuilder stringBuilder = new StringBuilder(R).append("L").append(B);
        long[] lArray = class077572.M();
        for (int i = 0; i < lArray.length; ++i) {
            stringBuilder.append(Z).append(lArray[i]).append("L");
            if (i == lArray.length - 1) continue;
            stringBuilder.append(class04825.i);
        }
        stringBuilder.append(M);
        this.s = stringBuilder.toString();
    }

    public String N(class07709 class077092) {
        class077092.N((class04836)this);
        return this.s;
    }

    @Override
    public void N(class07029 class070292) {
        StringBuilder stringBuilder = new StringBuilder(R).append("B").append(B);
        byte[] byArray = class070292.i();
        for (int i = 0; i < byArray.length; ++i) {
            stringBuilder.append(Z).append(byArray[i]).append("B");
            if (i == byArray.length - 1) continue;
            stringBuilder.append(class04825.i);
        }
        stringBuilder.append(M);
        this.s = stringBuilder.toString();
    }

    @Override
    public void N(class07019 class070192) {
        this.s = class070192.m() + "d";
    }

    @Override
    public void N(class07009 class070092) {
        this.s = class070092.m() + "f";
    }
}

