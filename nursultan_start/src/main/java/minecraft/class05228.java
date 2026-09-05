/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10497
 *  Nursultan.class10501
 *  com.google.common.collect.Lists
 *  minecraft.class00405
 *  minecraft.class01028
 *  minecraft.class05935
 *  minecraft.class05936
 *  org.apache.commons.lang3.mutable.MutableFloat
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10497;
import Nursultan.class10501;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class05197;
import minecraft.class05198;
import minecraft.class05201;
import minecraft.class05204;
import minecraft.class05209;
import minecraft.class05232;
import minecraft.class05233;
import minecraft.class05935;
import minecraft.class05936;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableInt;
import org.jspecify.annotations.Nullable;

public class class05228 {
    final class05233 N;

    public String L(String string, int n, class00405 class004053) {
        MutableFloat mutableFloat = new MutableFloat();
        MutableInt mutableInt = new MutableInt(string.length());
        class05232.y(string, class004053, (n2, class004052, n3) -> {
            if (mutableFloat.addAndGet(this.N.getWidth(n3, class004052)) > (float)n) {
                return false;
            }
            mutableInt.setValue(n2);
            return true;
        });
        return string.substring(mutableInt.intValue());
    }

    public class05228(class05233 class052332) {
        this.N = class052332;
    }

    public List<class05936> i(String string, int n3, class00405 class004053) {
        ArrayList arrayList = Lists.newArrayList();
        this.N(string, n3, class004053, false, (class004052, n, n2) -> arrayList.add(class05936.N((String)string.substring(n, n2), (class00405)class004052)));
        return arrayList;
    }

    public int u(String string, int n, class00405 class004052) {
        class05198 class051982 = new class05198(this, n);
        class05232.L(string, class004052, class051982);
        return class051982.N();
    }

    public List<class05936> y(class05936 class059363, int n, class00405 class004052) {
        ArrayList arrayList = Lists.newArrayList();
        this.N(class059363, n, class004052, (class059362, bl) -> arrayList.add(class059362));
        return arrayList;
    }

    public String y(String string, int n, class00405 class004052) {
        return string.substring(0, this.N(string, n, class004052));
    }

    public void N(String string, int n, class00405 class004052, boolean bl, class10497 class104972) {
        int n2 = 0;
        int n3 = string.length();
        class00405 class004053 = class004052;
        while (n2 < n3) {
            class05198 class051982 = new class05198(this, n);
            if (class05232.N(string, n2, class004053, class004052, class051982)) {
                class104972.accept(class004053, n2, n3);
                break;
            }
            int n4 = class051982.N();
            char c = string.charAt(n4);
            int n5 = c == '\n' || c == ' ' ? n4 + 1 : n4;
            class104972.accept(class004053, n2, bl ? n5 : n4);
            n2 = n5;
            class004053 = class051982.y();
        }
    }

    public static int N(String string, int n, int n2, boolean bl) {
        int n3 = n2;
        boolean bl2 = n < 0;
        int n4 = Math.abs(n);
        for (int i = 0; i < n4; ++i) {
            if (bl2) {
                while (bl && n3 > 0 && (string.charAt(n3 - 1) == ' ' || string.charAt(n3 - 1) == '\n')) {
                    --n3;
                }
                while (n3 > 0 && string.charAt(n3 - 1) != ' ' && string.charAt(n3 - 1) != '\n') {
                    --n3;
                }
                continue;
            }
            int n5 = string.length();
            int n6 = string.indexOf(32, n3);
            int n7 = string.indexOf(10, n3);
            n3 = n6 == -1 && n7 == -1 ? -1 : (n6 != -1 && n7 != -1 ? Math.min(n6, n7) : (n6 != -1 ? n6 : n7));
            if (n3 == -1) {
                n3 = n5;
                continue;
            }
            while (bl && n3 < n5 && (string.charAt(n3) == ' ' || string.charAt(n3) == '\n')) {
                ++n3;
            }
        }
        return n3;
    }

    public class05936 N(class05936 class059362, int n, class00405 class004052) {
        class05209 class052092 = new class05209(this, n);
        return class059362.N((class05935)new class10501(this, class052092), class004052).orElse(class059362);
    }

    public float N(class05936 class059362) {
        MutableFloat mutableFloat = new MutableFloat();
        class05232.N(class059362, class00405.N, (int n, class00405 class004052, int n2) -> {
            mutableFloat.add(this.N.getWidth(n2, class004052));
            return true;
        });
        return mutableFloat.floatValue();
    }

    public int N(String string, int n, class00405 class004052) {
        class05209 class052092 = new class05209(this, n);
        class05232.N(string, class004052, (class05197)class052092);
        return class052092.N();
    }

    public float N(@Nullable String string) {
        if (string == null) {
            return 0.0f;
        }
        MutableFloat mutableFloat = new MutableFloat();
        class05232.L(string, class00405.N, (n, class004052, n2) -> {
            mutableFloat.add(this.N.getWidth(n2, class004052));
            return true;
        });
        return mutableFloat.floatValue();
    }

    public float N(class01028 class010282) {
        MutableFloat mutableFloat = new MutableFloat();
        class010282.accept((n, class004052, n2) -> {
            mutableFloat.add(this.N.getWidth(n2, class004052));
            return true;
        });
        return mutableFloat.floatValue();
    }

    public void N(class05936 class059362, int n, class00405 class004053, BiConsumer<class05936, Boolean> biConsumer) {
        Object object;
        ArrayList arrayList = Lists.newArrayList();
        class059362.N((class004052, string) -> {
            if (!string.isEmpty()) {
                arrayList.add(new class05204(string, class004052));
            }
            return Optional.empty();
        }, class004053);
        class05201 class052012 = new class05201(arrayList);
        boolean bl = true;
        boolean bl2 = false;
        boolean bl3 = false;
        block0: while (bl) {
            bl = false;
            object = new class05198(this, n);
            for (class05204 class052042 : class052012.N) {
                if (!class05232.N(class052042.N, 0, class052042.y, class004053, (class05197)object)) {
                    int n2 = ((class05198)object).N();
                    class00405 class004054 = ((class05198)object).y();
                    char c = class052012.N(n2);
                    boolean bl4 = c == '\n';
                    boolean bl5 = bl4 || c == ' ';
                    bl2 = bl4;
                    class05936 class059363 = class052012.N(n2, bl5 ? 1 : 0, class004054);
                    biConsumer.accept(class059363, bl3);
                    bl3 = !bl4;
                    bl = true;
                    continue block0;
                }
                ((class05198)object).N(class052042.N.length());
            }
        }
        object = class052012.N();
        if (object != null) {
            biConsumer.accept((class05936)object, bl3);
        } else if (bl2) {
            biConsumer.accept(class05936.u, false);
        }
    }
}

