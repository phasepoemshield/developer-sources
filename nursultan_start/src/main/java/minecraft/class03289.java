/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class02131
 *  minecraft.class02273
 *  minecraft.class02300
 *  minecraft.class02998
 *  minecraft.class04016
 *  minecraft.class04383
 *  org.apache.commons.lang3.ObjectUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import minecraft.class02131;
import minecraft.class02273;
import minecraft.class02300;
import minecraft.class02998;
import minecraft.class04016;
import minecraft.class04383;
import org.apache.commons.lang3.ObjectUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03289 {
    private static final Logger y = LogUtils.getLogger();
    private static final int L = 254;
    static final class02300 N = new class02300();
    private final class02273 u;
    private final class04016<?>[] i;
    private boolean R;

    public @Nullable List<class02998<?>> L() {
        ArrayList<class02998> arrayList = null;
        for (class04016<?> var5 : this.i) {
            if (var5.u()) continue;
            if (arrayList == null) {
                arrayList = new ArrayList<class02998>();
            }
            arrayList.add(var5.i());
        }
        return arrayList;
    }

    class03289(class02273 class022732, class04016<?>[] class04016Array) {
        this.u = class022732;
        this.i = class04016Array;
    }

    private <T> class04016<T> y(class02131<T> class021312) {
        return this.i[class021312.N()];
    }

    public @Nullable List<class02998<?>> y() {
        if (!this.R) {
            return null;
        }
        this.R = false;
        ArrayList arrayList = new ArrayList();
        for (class04016<?> var5 : this.i) {
            if (!var5.L()) continue;
            var5.N(false);
            arrayList.add(var5.i());
        }
        return arrayList;
    }

    public static <T> class02131<T> N(Class<? extends class02273> clazz, class04383<T> class043832) {
        int n;
        if (y.isDebugEnabled()) {
            try {
                Class<?> var2 = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
                if (!var2.equals(clazz)) {
                    y.debug("defineId called for: {} from {}", new Object[]{clazz, var2, new RuntimeException()});
                }
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
        }
        if ((n = N.L(clazz)) > 254) {
            throw new IllegalArgumentException("Data value id is too big with " + n + "! (Max is 254)");
        }
        return class043832.N(n);
    }

    public void N(List<class02998<?>> list) {
        for (class02998<?> class029982 : list) {
            class04016<?> var4 = this.i[class029982.N()];
            this.N(var4, class029982);
            this.u.method_5674(var4.N());
        }
        this.u.method_48850(list);
    }

    public boolean N() {
        return this.R;
    }

    private <T> void N(class04016<T> class040162, class02998<?> class029982) {
        if (!Objects.equals(class029982.y(), class040162.N.y())) {
            throw new IllegalStateException(String.format(Locale.ROOT, "Invalid entity data item type for field %d on entity %s: old=%s(%s), new=%s(%s)", class040162.N.N(), this.u, class040162.y, class040162.y.getClass(), class029982.L(), class029982.L().getClass()));
        }
        class040162.N(class029982.L());
    }

    public <T> T N(class02131<T> class021312) {
        return (T)this.y(class021312).y();
    }

    public <T> void N(class02131<T> class021312, T t, boolean bl) {
        class04016<T> class040162 = this.y(class021312);
        if (bl || ObjectUtils.notEqual(t, (Object)class040162.y())) {
            class040162.N(t);
            this.u.method_5674(class021312);
            class040162.N(true);
            this.R = true;
        }
    }

    public <T> void N(class02131<T> class021312, T t) {
        this.N(class021312, t, false);
    }
}

