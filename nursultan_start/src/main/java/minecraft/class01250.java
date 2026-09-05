/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01055
 *  minecraft.class01614
 *  minecraft.class01894
 *  minecraft.class04370
 *  minecraft.class05630
 *  minecraft.class06202
 */
package minecraft;

import java.util.List;
import minecraft.class00392;
import minecraft.class01055;
import minecraft.class01257;
import minecraft.class01272;
import minecraft.class01283;
import minecraft.class01614;
import minecraft.class01894;
import minecraft.class04370;
import minecraft.class05630;
import minecraft.class06202;

public abstract class class01250
implements class01272 {
    private final class01055 y;
    final /* synthetic */ class01257 N;

    @Override
    public String L() {
        return this.y.M();
    }

    @Override
    public boolean T() {
        List<class01055> var1 = this.j();
        int n = var1.indexOf(this.y);
        return n > 0 && !var1.get(n - 1).z();
    }

    public class01250(class01257 class012572, class01055 class010552) {
        this.N = class012572;
        this.y = class010552;
    }

    @Override
    public boolean B() {
        return this.y.z();
    }

    @Override
    public boolean Z() {
        return this.y.Z();
    }

    @Override
    public class00392 i() {
        return this.y.L();
    }

    @Override
    public boolean b() {
        List<class01055> var1 = this.j();
        int n = var1.indexOf(this.y);
        return n >= 0 && n < var1.size() - 1 && !var1.get(n + 1).z();
    }

    protected void n() {
        this.j().remove(this.y);
        this.y.U().N(this.v(), (Object)this.y, class01055::B, true);
        this.N.u.accept(this);
        this.N.L();
        this.t();
    }

    private void t() {
        if (this.y.M().equals("high_contrast")) {
            class04370 var1;
            var1.method_41748((Object)((Boolean)(var1 = ((class05630)class06202.Nq().i_7).k()).method_41753() == false ? 1 : 0));
        }
    }

    protected abstract List<class01055> v();

    protected abstract List<class01055> j();

    @Override
    public class00392 u() {
        return this.y.y();
    }

    @Override
    public class01614 y() {
        return this.y.u();
    }

    @Override
    public void E() {
        this.N(-1);
    }

    @Override
    public class01894 N() {
        return this.N.L.apply(this.y);
    }

    protected void N(int n) {
        List<class01055> var2 = this.j();
        int n2 = var2.indexOf(this.y);
        var2.remove(n2);
        var2.add(n2 + n, this.y);
        this.N.u.accept(this);
    }

    @Override
    public void W() {
        this.N(1);
    }

    @Override
    public class01283 R() {
        return this.y.E();
    }
}

