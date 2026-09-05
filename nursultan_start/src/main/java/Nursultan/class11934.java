/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11887
 *  Nursultan.class11903
 *  Nursultan.class11905
 */
package Nursultan;

import Nursultan.class11887;
import Nursultan.class11903;
import Nursultan.class11905;
import java.time.Duration;

public class class11934 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object y_0;
    public Object y_1;
    public Object y_2;

    public boolean L() {
        return (Boolean)this.N_4 != false && this.j() < ((Duration)this.y_1).toNanos();
    }

    public boolean M() {
        return (Boolean)this.N_4;
    }

    public class11934(class11903 class119032) {
        this.v();
        this.y_1 = Duration.ZERO;
        this.N_1 = (class11887)class11905.N_5;
        this.N_3 = class119032;
        this.N_2 = class119032.L() ? 0.0 : 1.0;
        this.y_2 = (double)((Double)this.N_2);
        this.N_0 = (double)((Double)this.N_2);
    }

    public double B() {
        return (Double)this.y_2;
    }

    public class11903 Z() {
        return (class11903)this.N_3;
    }

    public class11887 i() {
        return (class11887)this.N_1;
    }

    private void v() {
        this.y_0 = 0L;
        this.N_0 = 0.0;
        this.y_2 = 0.0;
        this.N_4 = false;
        this.N_5 = false;
    }

    private long j() {
        return System.nanoTime() - (Long)this.y_0;
    }

    public boolean U() {
        return (Boolean)this.N_5;
    }

    public long z() {
        return (Long)this.y_0;
    }

    public void u() {
        this.N_5 = false;
        this.N_4 = false;
        this.N_2 = ((class11903)this.N_3).L() ? 0.0 : 1.0;
        this.y_2 = (double)((Double)this.N_2);
        this.N_0 = (double)((Double)this.N_2);
    }

    public Duration y() {
        return (Duration)this.y_1;
    }

    public Double E() {
        return (Double)this.N_2;
    }

    public void N(double d, Duration duration, class11887 class118872) {
        if (Double.compare((Double)this.N_0, d) == 0) {
            return;
        }
        this.y_2 = (double)((Double)this.N_2);
        this.N_0 = d;
        this.y_1 = duration;
        this.N_1 = class118872;
        if (d > (Double)this.y_2) {
            this.N_3 = class11903.FORWARDS;
        } else if (d < (Double)this.y_2) {
            this.N_3 = class11903.BACKWARDS;
        }
        this.N_5 = true;
        if (duration.isZero() || duration.isNegative()) {
            this.N_2 = d;
            this.N_4 = false;
            return;
        }
        this.y_0 = System.nanoTime();
        this.N_4 = true;
    }

    public boolean N(class11903 class119032) {
        return this.W() && (class11903)this.N_3 == class119032;
    }

    public void N() {
        if (!((Boolean)this.N_5).booleanValue() || !((Boolean)this.N_4).booleanValue()) {
            return;
        }
        double d = (double)this.j() / (double)((Duration)this.y_1).toNanos();
        if (d < 1.0) {
            this.N_2 = (Double)this.y_2 + ((Double)this.N_0 - (Double)this.y_2) * ((class11887)this.N_1).ease(d);
            return;
        }
        this.N_2 = (double)((Double)this.N_0);
        this.N_4 = false;
    }

    public boolean W() {
        return (Boolean)this.N_5 != false && (Boolean)this.N_4 == false;
    }

    public double R() {
        return (Double)this.N_0;
    }
}

