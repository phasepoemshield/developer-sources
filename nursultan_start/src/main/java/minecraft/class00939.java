/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class05982
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class07685
 *  minecraft.class07688
 *  minecraft.class08612
 *  minecraft.class08800
 *  minecraft.class08981
 *  org.joml.Quaternionfc
 */
package minecraft;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class05982;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class07685;
import minecraft.class07688;
import minecraft.class08612;
import minecraft.class08800;
import minecraft.class08981;
import org.joml.Quaternionfc;

public class class00939<S extends class08800, M extends class06078<S>>
extends class06249<S, M> {
    private final Function<S, Optional<class00500>> N;
    private final Consumer<class01421> y;

    public class00939(class06252<S, M> class062522, Function<S, Optional<class00500>> function, Consumer<class01421> consumer) {
        super(class062522);
        this.N = function;
        this.y = consumer;
    }

    public void N(class01421 class014212, class01237 class012372, int n, S s, float f, float f2) {
        Optional<class00500> optional = this.N.apply(s);
        if (optional.isEmpty()) {
            return;
        }
        class00500 class005002 = optional.get();
        class00891 class008912 = class005002.i();
        boolean bl = class008912 instanceof class08981;
        class014212.N();
        this.y.accept(class014212);
        if (!bl) {
            class014212.N((Quaternionfc)class02058.R.N(180.0f));
        }
        if (bl || class008912 instanceof class07688 || class008912 instanceof class07685 || class008912 instanceof class05982) {
            class014212.N((Quaternionfc)class02058.u.N(180.0f));
        }
        if (class008912 instanceof class08612) {
            class014212.N(-0.25, -1.5, -0.25);
        } else if (!bl) {
            class014212.N(-0.5, -1.5, -0.5);
        } else {
            class014212.N(-0.5, 0.0, -0.5);
        }
        class012372.N(class014212, class005002, n, class01384.u, ((class08800)s).l);
        class014212.y();
    }
}

