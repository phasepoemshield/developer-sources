/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  minecraft.class00405
 *  minecraft.class01590
 *  minecraft.class04995
 *  minecraft.class05018
 *  minecraft.class06197
 *  minecraft.class06202
 *  minecraft.class06601
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00405;
import minecraft.class01590;
import minecraft.class03917;
import minecraft.class03964;
import minecraft.class04995;
import minecraft.class05018;
import minecraft.class06197;
import minecraft.class06202;
import minecraft.class06601;
import org.slf4j.Logger;

public class class03915 {
    private static final Logger y = LogUtils.getLogger();
    public static final int N = Integer.MAX_VALUE;
    private static final int L = 2;
    private final class01590 u;
    private final List<class03917> i = Lists.newArrayList();
    private String R;
    private int M;
    private int B;
    private boolean Z;
    private int z = Integer.MAX_VALUE;
    private int U = Integer.MAX_VALUE;
    private final int E;
    private Consumer<String> W = string -> {};
    private Runnable m = () -> {};

    public boolean L() {
        return this.U != Integer.MAX_VALUE;
    }

    private String L(String string) {
        if (this.y()) {
            return class05018.N((String)string, (int)this.z, (boolean)false);
        }
        return string;
    }

    public void L(int n) {
        if (!this.U()) {
            this.B = class04995.N((int)(this.M + n), (int)0, (int)this.R.length());
        }
        this.y("");
    }

    private int M(int n) {
        int n2;
        for (n2 = n; n2 < this.R.length() && !Character.isWhitespace(this.R.charAt(n2)); ++n2) {
        }
        return n2;
    }

    public int M() {
        return this.i.size();
    }

    private class03917 P() {
        return this.R(0);
    }

    private void T() {
        this.i.clear();
        if (this.R.isEmpty()) {
            this.i.add(class03917.L);
            return;
        }
        this.u.y().N(this.R, this.E, class00405.N, false, (class004052, n, n2) -> this.i.add(new class03917(n, n2)));
        if (this.R.charAt(this.R.length() - 1) == '\n') {
            this.i.add(new class03917(this.R.length(), this.R.length()));
        }
    }

    public class03915(class01590 class015902, int n) {
        this.u = class015902;
        this.E = n;
        this.N("");
    }

    public int B() {
        for (int i = 0; i < this.i.size(); ++i) {
            class03917 class039172 = this.i.get(i);
            if (this.M < class039172.N() || this.M > class039172.y()) continue;
            return i;
        }
        return -1;
    }

    public void Z() {
        class03917 class039172 = this.W();
        this.N(class03964.field_39535, class039172.N());
        this.N(true);
        this.N(class03964.field_39535, class039172.y());
    }

    public void i(int n) {
        if (n == 0) {
            return;
        }
        int n2 = this.u.y(this.R.substring(this.P().N(), this.M)) + 2;
        class03917 class039172 = this.R(n);
        int n3 = this.u.N(this.R.substring(class039172.N(), class039172.y()), n2).length();
        this.N(class03964.field_39535, class039172.N() + n3);
    }

    public int i() {
        return this.M;
    }

    private boolean i(String string) {
        return this.L() && this.u.y().i(string, this.E, class00405.N).size() + (class05018.u((String)string) ? 1 : 0) > this.U;
    }

    private void s() {
        this.T();
        this.W.accept(this.R);
        this.m.run();
    }

    public class03917 m() {
        int n;
        if (this.R.isEmpty()) {
            return class03917.L;
        }
        for (n = class04995.N((int)this.M, (int)0, (int)(this.R.length() - 1)); n < this.R.length() && !Character.isWhitespace(this.R.charAt(n)); ++n) {
        }
        while (n < this.R.length() && Character.isWhitespace(this.R.charAt(n))) {
            ++n;
        }
        return new class03917(n, this.M(n));
    }

    public boolean U() {
        return this.B != this.M;
    }

    public Iterable<class03917> z() {
        return this.i;
    }

    public class03917 u(int n) {
        return this.i.get(class04995.N((int)n, (int)0, (int)(this.i.size() - 1)));
    }

    private String u(String string) {
        String string2 = string;
        if (this.y()) {
            int n = this.z - this.R.length();
            string2 = class05018.N((String)string, (int)n, (boolean)false);
        }
        return string2;
    }

    public String u() {
        return this.R;
    }

    public boolean y() {
        return this.z != Integer.MAX_VALUE;
    }

    public void y(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Character limit cannot be negative");
        }
        this.U = n;
    }

    public void y(String string) {
        if (string.isEmpty() && !this.U()) {
            return;
        }
        String string2 = this.u(class05018.N((String)string, (boolean)true));
        class03917 class039172 = this.R();
        String string3 = new StringBuilder(this.R).replace(class039172.N(), class039172.y(), string2).toString();
        if (this.i(string3)) {
            return;
        }
        this.R = string3;
        this.B = this.M = class039172.N() + string2.length();
        this.s();
    }

    public String E() {
        class03917 class039172 = this.R();
        return this.R.substring(class039172.N(), class039172.y());
    }

    public void N(boolean bl) {
        this.Z = bl;
    }

    public void N(String string) {
        this.N(string, false);
    }

    public int N() {
        return this.z;
    }

    public void N(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Character limit cannot be negative");
        }
        this.z = n;
    }

    public void N(Runnable runnable) {
        this.m = runnable;
    }

    public void N(double d, double d2) {
        int n = class04995.N((double)d);
        Objects.requireNonNull(this.u);
        int n2 = class04995.N((double)(d2 / 9.0));
        class03917 class039172 = this.i.get(class04995.N((int)n2, (int)0, (int)(this.i.size() - 1)));
        int n3 = this.u.N(this.R.substring(class039172.N(), class039172.y()), n).length();
        this.N(class03964.field_39535, class039172.N() + n3);
    }

    public void N(Consumer<String> consumer) {
        this.W = consumer;
    }

    public void N(class03964 class039642, int n) {
        switch (class039642) {
            case field_39535: {
                this.M = n;
                break;
            }
            case field_39536: {
                this.M += n;
                break;
            }
            case field_39537: {
                this.M = this.R.length() + n;
            }
        }
        this.M = class04995.N((int)this.M, (int)0, (int)this.R.length());
        this.m.run();
        if (!this.Z) {
            this.B = this.M;
        }
    }

    public void N(String string, boolean bl) {
        String string2 = this.L(string);
        if (!bl && this.i(string2)) {
            return;
        }
        this.R = string2;
        this.B = this.M = this.R.length();
        this.s();
    }

    public boolean N(class06601 class066012) {
        this.Z = class066012.W();
        if (class066012.s()) {
            this.M = this.R.length();
            this.B = 0;
            return true;
        }
        if (class066012.T()) {
            ((class06197)class06202.Nq().L_3).N(this.E());
            return true;
        }
        if (class066012.b()) {
            this.y(((class06197)class06202.Nq().L_3).N());
            return true;
        }
        if (class066012.j()) {
            ((class06197)class06202.Nq().L_3).N(this.E());
            this.y("");
            return true;
        }
        switch (class066012.v()) {
            case 263: {
                if (class066012.P()) {
                    class03917 class039172 = this.W();
                    this.N(class03964.field_39535, class039172.N());
                } else {
                    this.N(class03964.field_39536, -1);
                }
                return true;
            }
            case 262: {
                if (class066012.P()) {
                    class03917 class039173 = this.m();
                    this.N(class03964.field_39535, class039173.N());
                } else {
                    this.N(class03964.field_39536, 1);
                }
                return true;
            }
            case 265: {
                if (!class066012.P()) {
                    this.i(-1);
                }
                return true;
            }
            case 264: {
                if (!class066012.P()) {
                    this.i(1);
                }
                return true;
            }
            case 266: {
                this.N(class03964.field_39535, 0);
                return true;
            }
            case 267: {
                this.N(class03964.field_39537, 0);
                return true;
            }
            case 268: {
                if (class066012.P()) {
                    this.N(class03964.field_39535, 0);
                } else {
                    this.N(class03964.field_39535, this.P().N());
                }
                return true;
            }
            case 269: {
                if (class066012.P()) {
                    this.N(class03964.field_39537, 0);
                } else {
                    this.N(class03964.field_39535, this.P().y());
                }
                return true;
            }
            case 259: {
                if (class066012.P()) {
                    class03917 class039174 = this.W();
                    this.L(class039174.N() - this.M);
                } else {
                    this.L(-1);
                }
                return true;
            }
            case 261: {
                if (class066012.P()) {
                    class03917 class039175 = this.m();
                    this.L(class039175.N() - this.M);
                } else {
                    this.L(1);
                }
                return true;
            }
            case 257: 
            case 335: {
                this.y("\n");
                return true;
            }
        }
        return false;
    }

    public class03917 W() {
        int n;
        if (this.R.isEmpty()) {
            return class03917.L;
        }
        for (n = class04995.N((int)this.M, (int)0, (int)(this.R.length() - 1)); n > 0 && Character.isWhitespace(this.R.charAt(n - 1)); --n) {
        }
        while (n > 0 && !Character.isWhitespace(this.R.charAt(n - 1))) {
            --n;
        }
        return new class03917(n, this.M(n));
    }

    private class03917 R(int n) {
        int n2 = this.B();
        if (n2 < 0) {
            y.error("Cursor is not within text (cursor = {}, length = {})", (Object)this.M, (Object)this.R.length());
            return (class03917)((Object)this.i.getLast());
        }
        return this.i.get(class04995.N((int)(n2 + n), (int)0, (int)(this.i.size() - 1)));
    }

    public class03917 R() {
        return new class03917(Math.min(this.B, this.M), Math.max(this.B, this.M));
    }
}

