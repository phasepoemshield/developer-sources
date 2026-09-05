/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09516
 *  com.google.common.collect.Queues
 *  com.mojang.brigadier.context.ContextChain
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class03099
 *  minecraft.class03102
 *  minecraft.class03115
 *  minecraft.class04643
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09516;
import com.google.common.collect.Queues;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Deque;
import java.util.List;
import minecraft.class01704;
import minecraft.class01711;
import minecraft.class01714;
import minecraft.class01724;
import minecraft.class01747;
import minecraft.class03099;
import minecraft.class03102;
import minecraft.class03115;
import minecraft.class04643;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01752<T>
implements AutoCloseable {
    private static final int N = 10000000;
    private static final Logger y = LogUtils.getLogger();
    private final int L;
    private final int u;
    private final class04643 i;
    private @Nullable class01704 R;
    private int M;
    private boolean B;
    private final Deque<class01714<T>> Z = Queues.newArrayDeque();
    private final List<class01714<T>> z = new ObjectArrayList();
    private int U;

    public class04643 L() {
        return this.i;
    }

    private void M() {
        for (int i = this.z.size() - 1; i >= 0; --i) {
            this.Z.addFirst(this.z.get(i));
        }
        this.z.clear();
    }

    public class01752(int n, int n2, class04643 class046432) {
        this.L = n;
        this.u = n2;
        this.i = class046432;
        this.M = n;
    }

    public void i() {
        --this.M;
    }

    @Override
    public void close() {
        if (this.R != null) {
            this.R.close();
        }
    }

    public int u() {
        return this.u;
    }

    public @Nullable class01704 y() {
        return this.R;
    }

    public class03115 y(int n) {
        return () -> this.N(n);
    }

    public static <T extends class01711<T>> void N(class01752<T> class017522, String string, ContextChain<T> contextChain, T t, class03102 class031022) {
        class017522.N(new class01714(class01752.N(class017522, class031022), new class09516(string, contextChain, t)));
    }

    public void N(int n) {
        while (!this.Z.isEmpty() && this.Z.peek().N().L() >= n) {
            this.Z.removeFirst();
        }
    }

    public void N(class01714<T> class017142) {
        if (this.z.size() + this.Z.size() > 10000000) {
            this.R();
        }
        if (!this.B) {
            this.z.add(class017142);
        }
    }

    private static <T extends class01711<T>> class03099 N(class01752<T> class017522, class03102 class031022) {
        if (class017522.U == 0) {
            return new class03099(0, class031022, class017522.Z::clear);
        }
        int n = class017522.U + 1;
        return new class03099(n, class031022, class017522.y(n));
    }

    public void N(@Nullable class01704 class017042) {
        this.R = class017042;
    }

    public void N() {
        this.M();
        while (true) {
            if (this.M <= 0) {
                y.info("Command execution stopped due to limit (executed {} commands)", (Object)this.L);
                break;
            }
            class01714<T> class017142 = this.Z.pollFirst();
            if (class017142 == null) {
                return;
            }
            this.U = class017142.N().L();
            class017142.N(this);
            if (this.B) {
                y.error("Command execution stopped due to command queue overflow (max {})", (Object)10000000);
                break;
            }
            this.M();
        }
        this.U = 0;
    }

    public static <T extends class01711<T>> void N(class01752<T> class017522, class01747<T> class017472, T t, class03102 class031022) {
        class017522.N(new class01714<T>(class01752.N(class017522, class031022), new class01724<T>(class017472, t.T(), false).N(t)));
    }

    private void R() {
        this.B = true;
        this.z.clear();
        this.Z.clear();
    }
}

