/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00753
 *  minecraft.class04995
 *  minecraft.class06993
 */
package minecraft;

import minecraft.class00753;
import minecraft.class04995;
import minecraft.class06993;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07214;

public class class07218
extends class07209 {
    public class07218 method_20788(int n) {
        super.method_20788(n);
        return this;
    }

    @Override
    public class07209 method_10062() {
        return new class07209(this);
    }

    public class07218() {
        this(0, 0, 0);
    }

    public class07218(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    public class07218(double d, double d2, double d3) {
        this(class04995.N((double)d), class04995.N((double)d2), class04995.N((double)d3));
    }

    public class07218 y(int n, int n2, int n3) {
        return this.N(this.method_10263() + n, this.method_10264() + n2, this.method_10260() + n3);
    }

    public class07218 method_10099(int n) {
        super.method_10099(n);
        return this;
    }

    public class07218 y(class00753 class007532) {
        return this.N(this.method_10263() + class007532.method_10263(), this.method_10264() + class007532.method_10264(), this.method_10260() + class007532.method_10260());
    }

    public class07218 N(class00753 class007532, class00753 class007533) {
        return this.N(class007532.method_10263() + class007533.method_10263(), class007532.method_10264() + class007533.method_10264(), class007532.method_10260() + class007533.method_10260());
    }

    public class07218 N(class07211 class072112) {
        return this.N(class072112, 1);
    }

    public class07218 N(class07211 class072112, int n) {
        return this.N(this.method_10263() + class072112.P() * n, this.method_10264() + class072112.s() * n, this.method_10260() + class072112.T() * n);
    }

    public class07218 N(class07185 class071852, int n, int n2) {
        return switch (class071852) {
            default -> throw new MatchException(null, null);
            case class07185.field_11048 -> this.N(class04995.N((int)this.method_10263(), (int)n, (int)n2), this.method_10264(), this.method_10260());
            case class07185.field_11052 -> this.N(this.method_10263(), class04995.N((int)this.method_10264(), (int)n, (int)n2), this.method_10260());
            case class07185.field_11051 -> this.N(this.method_10263(), this.method_10264(), class04995.N((int)this.method_10260(), (int)n, (int)n2));
        };
    }

    public class07218 method_20787(int n) {
        super.method_20787(n);
        return this;
    }

    public class07218 N(class00753 class007532, int n, int n2, int n3) {
        return this.N(class007532.method_10263() + n, class007532.method_10264() + n2, class007532.method_10260() + n3);
    }

    public class07218 N(class00753 class007532) {
        return this.N(class007532.method_10263(), class007532.method_10264(), class007532.method_10260());
    }

    public class07218 N(double d, double d2, double d3) {
        return this.N(class04995.N((double)d), class04995.N((double)d2), class04995.N((double)d3));
    }

    public class07218 N(long l) {
        return this.N(class07218.method_10061(l), class07218.method_10071(l), class07218.method_10083(l));
    }

    public class07218 N(class07214 class072142, int n, int n2, int n3) {
        return this.N(class072142.N(n, n2, n3, class07185.field_11048), class072142.N(n, n2, n3, class07185.field_11052), class072142.N(n, n2, n3, class07185.field_11051));
    }

    public class07218 N(class00753 class007532, class07211 class072112) {
        return this.N(class007532.method_10263() + class072112.P(), class007532.method_10264() + class072112.s(), class007532.method_10260() + class072112.T());
    }

    public class07218 N(int n, int n2, int n3) {
        this.method_20787(n);
        this.method_10099(n2);
        this.method_20788(n3);
        return this;
    }

    @Override
    public /* synthetic */ class00753 method_35850(class07185 class071852, int n) {
        return this.method_30513(class071852, n);
    }

    @Override
    public /* synthetic */ class00753 method_23227(int n) {
        return super.method_10087(n);
    }

    @Override
    public /* synthetic */ class00753 method_35852(class00753 class007532) {
        return super.method_10059(class007532);
    }

    @Override
    public /* synthetic */ class00753 method_35851(class07211 class072112) {
        return super.method_10093(class072112);
    }

    @Override
    public /* synthetic */ class00753 method_35862(int n) {
        return this.method_35830(n);
    }

    @Override
    public /* synthetic */ class00753 method_35856(int n) {
        return super.method_10088(n);
    }

    @Override
    public /* synthetic */ class00753 method_35859() {
        return super.method_10072();
    }

    @Override
    public /* synthetic */ class00753 method_10259(class00753 class007532) {
        return super.method_10075(class007532);
    }

    @Override
    public /* synthetic */ class00753 method_23226(class07211 class072112, int n) {
        return this.method_10079(class072112, n);
    }

    @Override
    public /* synthetic */ class00753 method_34592(int n, int n2, int n3) {
        return this.method_10069(n, n2, n3);
    }

    @Override
    public /* synthetic */ class00753 method_35855() {
        return super.method_10078();
    }

    @Override
    public /* synthetic */ class00753 method_35857() {
        return super.method_10067();
    }

    @Override
    public /* synthetic */ class00753 method_35858(int n) {
        return super.method_10077(n);
    }

    @Override
    public /* synthetic */ class00753 method_35854(int n) {
        return super.method_10089(n);
    }

    @Override
    public /* synthetic */ class00753 method_30931() {
        return super.method_10084();
    }

    @Override
    public /* synthetic */ class00753 method_23228() {
        return super.method_10074();
    }

    @Override
    public /* synthetic */ class00753 method_35853(class00753 class007532) {
        return super.method_10081(class007532);
    }

    @Override
    public /* synthetic */ class00753 method_35860(int n) {
        return super.method_10076(n);
    }

    @Override
    public /* synthetic */ class00753 method_35861() {
        return super.method_10095();
    }

    @Override
    public /* synthetic */ class00753 method_30930(int n) {
        return super.method_10086(n);
    }

    @Override
    public class07209 method_10079(class07211 class072112, int n) {
        return super.method_10079(class072112, n).method_10062();
    }

    @Override
    public class07209 method_35830(int n) {
        return super.method_35830(n).method_10062();
    }

    @Override
    public class07209 method_10069(int n, int n2, int n3) {
        return super.method_10069(n, n2, n3).method_10062();
    }

    @Override
    public class07209 method_30513(class07185 class071852, int n) {
        return super.method_30513(class071852, n).method_10062();
    }

    @Override
    public class07209 method_10070(class06993 class069932) {
        return super.method_10070(class069932).method_10062();
    }
}

