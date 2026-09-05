/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.logging.LogUtils
 *  minecraft.class02253
 *  minecraft.class02510
 *  minecraft.class02672
 *  minecraft.class04530
 *  minecraft.class05678
 *  minecraft.class07536
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import minecraft.class02253;
import minecraft.class02510;
import minecraft.class02672;
import minecraft.class04530;
import minecraft.class05678;
import minecraft.class07536;
import minecraft.class08198;
import minecraft.class08199;
import org.slf4j.Logger;

public abstract class class08224<T extends Runnable>
implements class02510,
class08199<T>,
Runnable {
    private static final Logger N = LogUtils.getLogger();
    private final AtomicReference<class08198> y = new AtomicReference<class08198>(class08198.field_54074);
    private final class05678<T> L;
    private final Executor u;
    private final String i;

    public boolean L() {
        return this.U() && !this.L.y();
    }

    private boolean M() {
        if (!this.U()) {
            return false;
        }
        Runnable runnable = this.L.N();
        if (runnable == null) {
            return false;
        }
        class07536.N((Runnable)runnable, (String)this.i);
        return true;
    }

    public class08224(class05678<T> class056782, Executor executor, String string) {
        this.u = executor;
        this.L = class056782;
        this.i = string;
        class02672.N.N((class02510)this);
    }

    @Override
    public void run() {
        try {
            this.M();
        }
        finally {
            this.z();
            this.B();
        }
    }

    public String toString() {
        return this.i + " " + String.valueOf((Object)this.y.get()) + " " + this.L.y();
    }

    private void B() {
        if (this.R() && this.Z()) {
            try {
                this.u.execute(this);
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                try {
                    this.u.execute(this);
                }
                catch (RejectedExecutionException rejectedExecutionException2) {
                    N.error("Could not schedule ConsecutiveExecutor", (Throwable)rejectedExecutionException2);
                }
            }
        }
    }

    private boolean Z() {
        return this.y.compareAndSet(class08198.field_54074, class08198.field_54075);
    }

    private boolean U() {
        return this.y.get() == class08198.field_54075;
    }

    @Override
    public void close() {
        this.y.set(class08198.field_54076);
    }

    private void z() {
        this.y.compareAndSet(class08198.field_54075, class08198.field_54074);
    }

    public int y() {
        return this.L.L();
    }

    private boolean E() {
        return this.y.get() == class08198.field_54076;
    }

    public void N() {
        try {
            while (this.M()) {
            }
        }
        finally {
            this.z();
            this.B();
        }
    }

    @Override
    public void N(T t) {
        this.L.N(t);
        this.B();
    }

    private boolean R() {
        return !this.E() && !this.L.y();
    }

    @Override
    public String as_() {
        return this.i;
    }

    public List<class04530> at_() {
        return ImmutableList.of((Object)class04530.N((String)(this.i + "-queue-size"), (class02253)class02253.field_54068, this::y));
    }
}

