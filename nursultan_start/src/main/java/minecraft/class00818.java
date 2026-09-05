/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01382
 *  minecraft.class01392
 *  minecraft.class01393
 *  minecraft.class01398
 *  minecraft.class01415
 *  minecraft.class01427
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04748
 *  minecraft.class05946
 *  minecraft.class07299
 */
package minecraft;

import java.util.Optional;
import minecraft.class00780;
import minecraft.class00816;
import minecraft.class00817;
import minecraft.class00848;
import minecraft.class01382;
import minecraft.class01392;
import minecraft.class01393;
import minecraft.class01398;
import minecraft.class01415;
import minecraft.class01427;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04748;
import minecraft.class05946;
import minecraft.class07299;

public class class00818 {
    private class00816 N = class00816.L;
    private class00816 y = class00816.L;
    private class00816 L = class00816.L;
    private Optional<class03543<class00780>> u = Optional.empty();
    private Optional<class03543<class04748>> i = Optional.empty();
    private Optional<class05946<class07299>> R = Optional.empty();
    private Optional<Boolean> M = Optional.empty();
    private Optional<class01393> B = Optional.empty();
    private Optional<class01392> Z = Optional.empty();
    private Optional<class01415> z = Optional.empty();
    private Optional<Boolean> U = Optional.empty();

    public class00818 L(class00816 class008162) {
        this.y = class008162;
        return this;
    }

    public class00818 u(class00816 class008162) {
        this.L = class008162;
        return this;
    }

    public class00818 y(class03543<class04748> class035432) {
        this.i = Optional.of(class035432);
        return this;
    }

    public class00817 y() {
        Optional<class00848> var1 = class00848.N(this.N, this.y, this.L);
        return new class00817(var1, this.u, this.i, this.R, this.M, this.B, this.Z, this.z, this.U);
    }

    public class00818 y(boolean bl) {
        this.U = Optional.of(bl);
        return this;
    }

    public class00818 y(class05946<class07299> class059462) {
        this.R = Optional.of(class059462);
        return this;
    }

    public static class00818 y(class03556<class04748> class035562) {
        return class00818.N().y((class03543<class04748>)class03543.N((class03556[])new class03556[]{class035562}));
    }

    public class00818 y(class00816 class008162) {
        this.N = class008162;
        return this;
    }

    public class00818 N(boolean bl) {
        this.M = Optional.of(bl);
        return this;
    }

    public class00818 N(class01398 class013982) {
        this.z = Optional.of(class013982.y());
        return this;
    }

    public class00818 N(class01427 class014272) {
        this.Z = Optional.of(class014272.y());
        return this;
    }

    public static class00818 N() {
        return new class00818();
    }

    public class00818 N(class03543<class00780> class035432) {
        this.u = Optional.of(class035432);
        return this;
    }

    public static class00818 N(class00816 class008162) {
        return class00818.N().L(class008162);
    }

    public static class00818 N(class05946<class07299> class059462) {
        return class00818.N().y(class059462);
    }

    public static class00818 N(class03556<class00780> class035562) {
        return class00818.N().N((class03543<class00780>)class03543.N((class03556[])new class03556[]{class035562}));
    }

    public class00818 N(class01382 class013822) {
        this.B = Optional.of(class013822.y());
        return this;
    }
}

