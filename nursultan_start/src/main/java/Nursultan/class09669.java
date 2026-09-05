/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01463
 *  minecraft.class06202
 *  minecraft.class06928
 *  minecraft.class06930
 *  minecraft.class06937
 *  minecraft.class07481
 *  minecraft.class07510
 */
package Nursultan;

import Nursultan.class09665;
import Nursultan.class09670;
import Nursultan.class09683;
import Nursultan.class09690;
import Nursultan.class09691;
import java.util.List;
import minecraft.class01463;
import minecraft.class06202;
import minecraft.class06928;
import minecraft.class06930;
import minecraft.class06937;
import minecraft.class07481;
import minecraft.class07510;

public class class09669
implements class09670 {
    class06202 N = class06202.Nq();
    private final class01463 y;
    private final class09665 L;

    @Override
    public List<class06937> L() {
        return this.y.E().T;
    }

    public class09669(class01463 class014632) {
        this.y = class014632;
        this.L = (class09665)class014632;
    }

    @Override
    public boolean u() {
        this.L.y(true);
        if (this.L.z() && this.L.U() == 1) {
            this.L.N(false);
            return true;
        }
        return false;
    }

    @Override
    public boolean y(class06937 class069372) {
        return false;
    }

    @Override
    public boolean y() {
        return this.y.getClass().isAnnotationPresent(class09691.class);
    }

    @Override
    public class06937 N(double d, double d2) {
        return this.L.N(d, d2);
    }

    @Override
    public boolean N(class06937 class069372) {
        return class069372 instanceof class06930 || class069372 instanceof class07481 || class069372 instanceof class06928;
    }

    @Override
    public void N(class06937 class069372, class09690 class096902, boolean bl) {
        this.L.y(class069372, class069372.u, class096902.N(), bl ? class07510.field_7794 : class07510.field_7790);
    }

    @Override
    public boolean N() {
        return this.y.getClass().isAnnotationPresent(class09683.class);
    }
}

