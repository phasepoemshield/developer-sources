/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class06995
 *  minecraft.class06997
 *  minecraft.class07001
 *  minecraft.class07009
 *  minecraft.class07019
 *  minecraft.class07029
 *  minecraft.class07037
 *  minecraft.class07707
 *  minecraft.class07709
 *  minecraft.class07720
 *  minecraft.class07729
 *  minecraft.class07730
 *  minecraft.class07737
 *  minecraft.class07741
 *  minecraft.class07757
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;
import minecraft.class00392;
import minecraft.class04836;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class06995;
import minecraft.class06997;
import minecraft.class07001;
import minecraft.class07009;
import minecraft.class07019;
import minecraft.class07029;
import minecraft.class07037;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class07720;
import minecraft.class07729;
import minecraft.class07730;
import minecraft.class07737;
import minecraft.class07741;
import minecraft.class07757;
import org.slf4j.Logger;

public class class04824
implements class04836 {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 8;
    private static final int L = 64;
    private static final int u = 128;
    private static final class06541 i = class06541.field_1075;
    private static final class06541 R = class06541.field_1060;
    private static final class06541 M = class06541.field_1065;
    private static final class06541 B = class06541.field_1061;
    private static final Pattern Z = Pattern.compile("[A-Za-z0-9._+-]+");
    private static final String z = "[";
    private static final String U = "]";
    private static final String E = ";";
    private static final String W = " ";
    private static final String m = "{";
    private static final String P = "}";
    private static final String s = "\n";
    private static final String T = ": ";
    private static final String b = String.valueOf(',');
    private static final String j = b + "\n";
    private static final String v = b + " ";
    private static final class00392 n = class00392.y((String)"<...>").N(class06541.field_1080);
    private static final class00392 t = class00392.y((String)"b").N(B);
    private static final class00392 G = class00392.y((String)"s").N(B);
    private static final class00392 l = class00392.y((String)"I").N(B);
    private static final class00392 d = class00392.y((String)"L").N(B);
    private static final class00392 w = class00392.y((String)"f").N(B);
    private static final class00392 k = class00392.y((String)"d").N(B);
    private static final class00392 Y = class00392.y((String)"B").N(B);
    private final String Q;
    private int O;
    private int g;
    private final class05216 I = class00392.i();

    public class04824(String string) {
        this.Q = string;
    }

    private static boolean y(class07741 class077412) {
        if (class077412.size() >= 8) {
            return false;
        }
        Iterator var1 = class077412.iterator();
        while (var1.hasNext()) {
            if ((class07709)var1.next() instanceof class07737) continue;
            return true;
        }
        return false;
    }

    @Override
    public void N(class07001 class070012) {
        ArrayList arrayList;
        Object object;
        if (class070012.z()) {
            this.I.i("{}");
            return;
        }
        if (this.g >= 64) {
            this.I.i(m).y(n).i(P);
            return;
        }
        this.I.i(m);
        Set var2 = class070012.i();
        if (N.isDebugEnabled()) {
            object = Lists.newArrayList((Iterable)class070012.i());
            Collections.sort(object);
            arrayList = object;
        }
        if (!this.Q.isEmpty()) {
            this.I.i(s);
        }
        object = Strings.repeat((String)this.Q, (int)(this.O + 1));
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            this.I.i((String)object).y(class04824.N(string)).i(T);
            this.N(class070012.N(string), true);
            if (!iterator.hasNext()) continue;
            this.I.i(this.Q.isEmpty() ? v : j);
        }
        if (!this.Q.isEmpty()) {
            this.I.i(s + Strings.repeat((String)this.Q, (int)this.O));
        }
        this.I.i(P);
    }

    @Override
    public void N(class07741 class077412) {
        if (class077412.isEmpty()) {
            this.I.i("[]");
            return;
        }
        if (this.g >= 64) {
            this.I.i(z).y(n).i(U);
            return;
        }
        if (!class04824.y(class077412)) {
            this.I.i(z);
            for (int i = 0; i < class077412.size(); ++i) {
                if (i != 0) {
                    this.I.i(v);
                }
                this.N(class077412.get(i), false);
            }
            this.I.i(U);
            return;
        }
        this.I.i(z);
        if (!this.Q.isEmpty()) {
            this.I.i(s);
        }
        String string = Strings.repeat((String)this.Q, (int)(this.O + 1));
        for (int i = 0; i < class077412.size() && i < 128; ++i) {
            this.I.i(string);
            this.N(class077412.get(i), true);
            if (i == class077412.size() - 1) continue;
            this.I.i(this.Q.isEmpty() ? v : j);
        }
        if (class077412.size() > 128) {
            this.I.i(string).y(n);
        }
        if (!this.Q.isEmpty()) {
            this.I.i(s + Strings.repeat((String)this.Q, (int)this.O));
        }
        this.I.i(U);
    }

    @Override
    public void N(class06995 class069952) {
        this.I.i(z).y(l).i(E);
        int[] nArray = class069952.M();
        for (int i = 0; i < nArray.length && i < 128; ++i) {
            this.I.i(W).y((class00392)class00392.y((String)String.valueOf(nArray[i])).N(M));
            if (i == nArray.length - 1) continue;
            this.I.i(b);
        }
        if (nArray.length > 128) {
            this.I.y(n);
        }
        this.I.i(U);
    }

    @Override
    public void N(class07757 class077572) {
        this.I.i(z).y(d).i(E);
        long[] lArray = class077572.M();
        for (int i = 0; i < lArray.length && i < 128; ++i) {
            class05216 class052162 = class00392.y((String)String.valueOf(lArray[i])).N(M);
            this.I.i(W).y((class00392)class052162).y(d);
            if (i == lArray.length - 1) continue;
            this.I.i(b);
        }
        if (lArray.length > 128) {
            this.I.y(n);
        }
        this.I.i(U);
    }

    @Override
    public void N(class07029 class070292) {
        this.I.i(z).y(Y).i(E);
        byte[] byArray = class070292.i();
        for (int i = 0; i < byArray.length && i < 128; ++i) {
            class05216 class052162 = class00392.y((String)String.valueOf(byArray[i])).N(M);
            this.I.i(W).y((class00392)class052162).y(Y);
            if (i == byArray.length - 1) continue;
            this.I.i(b);
        }
        if (byArray.length > 128) {
            this.I.y(n);
        }
        this.I.i(U);
    }

    @Override
    public void N(class06997 class069972) {
    }

    protected static class00392 N(String string) {
        if (Z.matcher(string).matches()) {
            return class00392.y((String)string).N(i);
        }
        String string2 = class07707.y((String)string);
        String string3 = string2.substring(0, 1);
        class05216 class052162 = class00392.y((String)string2.substring(1, string2.length() - 1)).N(i);
        return class00392.y((String)string3).y((class00392)class052162).i(string3);
    }

    private void N(class07709 class077092, boolean bl) {
        if (bl) {
            ++this.O;
        }
        ++this.g;
        try {
            class077092.N((class04836)this);
        }
        finally {
            if (bl) {
                --this.O;
            }
            --this.g;
        }
    }

    @Override
    public void N(class07720 class077202) {
        this.I.y((class00392)class00392.y((String)String.valueOf(class077202.m())).N(M));
    }

    @Override
    public void N(class07730 class077302) {
        this.I.y((class00392)class00392.y((String)String.valueOf(class077302.m())).N(M)).y(G);
    }

    @Override
    public void N(class07037 class070372) {
        this.I.y((class00392)class00392.y((String)String.valueOf(class070372.m())).N(M)).y(t);
    }

    @Override
    public void N(class07707 class077072) {
        String string = class07707.y((String)class077072.U());
        String string2 = string.substring(0, 1);
        class05216 class052162 = class00392.y((String)string.substring(1, string.length() - 1)).N(R);
        this.I.i(string2).y((class00392)class052162).i(string2);
    }

    public class00392 N(class07709 class077092) {
        class077092.N((class04836)this);
        return this.I;
    }

    @Override
    public void N(class07019 class070192) {
        this.I.y((class00392)class00392.y((String)String.valueOf(class070192.m())).N(M)).y(k);
    }

    @Override
    public void N(class07009 class070092) {
        this.I.y((class00392)class00392.y((String)String.valueOf(class070092.m())).N(M)).y(w);
    }

    @Override
    public void N(class07729 class077292) {
        this.I.y((class00392)class00392.y((String)String.valueOf(class077292.m())).N(M)).y(d);
    }
}

