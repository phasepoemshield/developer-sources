/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05623
 *  minecraft.class06984
 *  minecraft.class07086
 *  minecraft.class07282
 *  minecraft.class07381
 *  minecraft.class07403
 *  minecraft.class07932
 */
package minecraft;

import minecraft.class05623;
import minecraft.class06984;
import minecraft.class07086;
import minecraft.class07282;
import minecraft.class07381;
import minecraft.class07403;
import minecraft.class07932;

public class class00470
implements class07381 {
    private final class05623 N;
    private final class07932 y;

    public boolean L() {
        return this.N.C_();
    }

    public int L(int n, class07403 class074032) {
        this.y.N(class074032, "Update player idle timeout from {} minutes to {} minutes", new Object[]{this.M(), n});
        this.N.R(n);
        return this.M();
    }

    public boolean L(boolean bl, class07403 class074032) {
        this.y.N(class074032, "Update using allowlist from {} to {}", new Object[]{this.u(), bl});
        this.N.u(bl);
        this.N.yN();
        return this.u();
    }

    public int M(int n, class07403 class074032) {
        this.y.N(class074032, "Update status heartbeat interval from {} to {}", new Object[]{this.s(), n});
        this.N.M(n);
        return this.s();
    }

    public int M() {
        return this.N.C();
    }

    public boolean M(boolean bl, class07403 class074032) {
        this.y.N(class074032, "Update hides online players from {} to {}", new Object[]{this.b(), bl});
        this.N.M(bl);
        return this.b();
    }

    public boolean P() {
        return this.N.Nz();
    }

    public class06984 T() {
        return this.N.T();
    }

    public class00470(class05623 class056232, class07932 class079322) {
        this.N = class056232;
        this.y = class079322;
    }

    public boolean B(boolean bl, class07403 class074032) {
        this.y.N(class074032, "Update replies to status from {} to {}", new Object[]{this.j(), bl});
        this.N.R(bl);
        return this.j();
    }

    public int B(int n, class07403 class074032) {
        this.y.N(class074032, "Update entity broadcast range percentage from {}% to {}%", new Object[]{this.v(), n});
        this.N.B(n);
        return this.v();
    }

    public boolean B() {
        return this.N.q();
    }

    public int Z() {
        return this.N.F();
    }

    public boolean i(boolean bl, class07403 class074032) {
        this.y.N(class074032, "Update force game mode from {} to {}", new Object[]{this.U(), bl});
        this.N.B(bl);
        return this.U();
    }

    public int i() {
        return this.N.t();
    }

    public int i(int n, class07403 class074032) {
        this.y.N(class074032, "Update view distance from {} to {}", new Object[]{this.W(), n});
        this.N.y(n);
        return this.W();
    }

    public boolean b() {
        return this.N.f();
    }

    public int s() {
        return this.N.S();
    }

    public int m() {
        return this.N.e();
    }

    public int v() {
        return this.N.Ni();
    }

    public boolean j() {
        return this.N.A();
    }

    public boolean U() {
        return this.N.NR();
    }

    public String z() {
        return this.N.x();
    }

    public boolean u() {
        return this.N.D_();
    }

    public int u(int n, class07403 class074032) {
        this.y.N(class074032, "Update spawn protection radius from {} to {}", new Object[]{this.Z(), n});
        this.N.i(n);
        return this.Z();
    }

    public boolean u(boolean bl, class07403 class074032) {
        this.y.N(class074032, "Update allow flight from {} to {}", new Object[]{this.B(), bl});
        this.N.i(bl);
        return this.B();
    }

    public boolean y(boolean bl, class07403 class074032) {
        this.y.N(class074032, "Update enforce allowlist from {} to {}", new Object[]{this.L(), bl});
        this.N.L(bl);
        this.N.yN();
        return this.L();
    }

    public class07086 y() {
        return this.N.yn().s();
    }

    public int y(int n, class07403 class074032) {
        this.y.N(class074032, "Update pause when empty from {} seconds to {} seconds", new Object[]{this.R(), n});
        this.N.Z(n);
        return this.R();
    }

    public class07282 E() {
        return this.N.NM();
    }

    public boolean N(boolean bl, class07403 class074032) {
        this.y.N(class074032, "Update autosave from {} to {}", new Object[]{this.N(), bl});
        this.N.m(bl);
        return this.N();
    }

    public String N(String string, class07403 class074032) {
        this.y.N(class074032, "Update MOTD from '{}' to '{}'", new Object[]{this.z(), string});
        this.N.y(string);
        return this.z();
    }

    public int N(int n, class07403 class074032) {
        this.y.N(class074032, "Update max players from {} to {}", new Object[]{this.i(), n});
        this.N.u(n);
        return this.i();
    }

    public boolean N() {
        return this.N.yJ();
    }

    public class06984 N(class06984 class069842, class07403 class074032) {
        this.y.N(class074032, "Update operator user permission level from {} to {}", new Object[]{this.T(), class069842.N()});
        this.N.N(class069842);
        return this.T();
    }

    public class07086 N(class07086 class070862, class07403 class074032) {
        this.y.N(class074032, "Update difficulty from '{}' to '{}'", new Object[]{this.y(), class070862});
        this.N.N(class070862);
        return this.y();
    }

    public class07282 N(class07282 class072822, class07403 class074032) {
        this.y.N(class074032, "Update game mode from '{}' to '{}'", new Object[]{this.E(), class072822});
        this.N.y(class072822);
        return this.E();
    }

    public int W() {
        return this.N.V();
    }

    public int R() {
        return this.N.NE();
    }

    public int R(int n, class07403 class074032) {
        this.y.N(class074032, "Update simulation distance from {} to {}", new Object[]{this.m(), n});
        this.N.L(n);
        return this.m();
    }

    public boolean R(boolean bl, class07403 class074032) {
        this.y.N(class074032, "Update accepts transfers from {} to {}", new Object[]{this.P(), bl});
        this.N.Z(bl);
        return this.P();
    }
}

