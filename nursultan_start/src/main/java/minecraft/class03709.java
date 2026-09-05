/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.report.AbuseReportLimits
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class01962
 *  minecraft.class02043
 *  minecraft.class02071
 *  minecraft.class02073
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class03255
 *  minecraft.class03409
 *  minecraft.class03918
 *  minecraft.class03943
 *  minecraft.class04141
 *  minecraft.class04442
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05725
 *  minecraft.class06478
 *  minecraft.class06541
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.logging.LogUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class01962;
import minecraft.class02043;
import minecraft.class02071;
import minecraft.class02073;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class03255;
import minecraft.class03409;
import minecraft.class03727;
import minecraft.class03918;
import minecraft.class03943;
import minecraft.class04141;
import minecraft.class04442;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05725;
import minecraft.class06478;
import minecraft.class06541;
import org.slf4j.Logger;

public abstract class class03709<B extends class02073<?>>
extends class05096 {
    private static final class00392 m = class00392.L((String)"gui.abuseReport.report_sent_msg");
    private static final class00392 P = class00392.L((String)"gui.abuseReport.sending.title").N(class06541.field_1067);
    private static final class00392 s = class00392.L((String)"gui.abuseReport.sent.title").N(class06541.field_1067);
    private static final class00392 T = class00392.L((String)"gui.abuseReport.error.title").N(class06541.field_1067);
    private static final class00392 b = class00392.L((String)"gui.abuseReport.send.generic_error");
    protected static final class00392 N = class00392.L((String)"gui.abuseReport.send");
    protected static final class00392 y = class00392.L((String)"gui.abuseReport.observed_what");
    protected static final class00392 L = class00392.L((String)"gui.abuseReport.select_reason");
    private static final class00392 j = class00392.L((String)"gui.abuseReport.describe");
    protected static final class00392 u = class00392.L((String)"gui.abuseReport.more_comments");
    private static final class00392 v = class00392.L((String)"gui.abuseReport.comments");
    private static final class00392 n = class00392.L((String)"gui.abuseReport.attestation").y(-2039584);
    protected static final int i = 120;
    protected static final int R = 20;
    protected static final int M = 280;
    protected static final int B = 8;
    private static final Logger t = LogUtils.getLogger();
    protected final class05096 Z;
    protected final class03409 z;
    protected final class01885 U = class01885.u().N(8);
    protected B E;
    private class05725 G;
    protected class05362 W;

    protected void L() {
        this.U.N((class02102)new class02071(this.field_22785, this.field_22793));
    }

    protected class03709(class00392 class003922, class05096 class050962, class03409 class034092, B b) {
        super(class003922);
        this.Z = class050962;
        this.z = class034092;
        this.E = b;
    }

    void Z() {
        this.z.N(null);
    }

    protected void i() {
        this.E.N(this.z).ifLeft(class020442 -> {
            CompletableFuture var2 = this.z.N().N(class020442.N(), class020442.y(), class020442.L());
            this.field_22787.N((class05096)class03918.N((class00392)P, (class00392)class05220.i, () -> {
                this.field_22787.N((class05096)this);
                var2.cancel(true);
            }));
            var2.handleAsync((object, throwable) -> {
                if (throwable == null) {
                    this.z();
                } else {
                    if (throwable instanceof CancellationException) {
                        return null;
                    }
                    this.N((Throwable)throwable);
                }
                return null;
            }, (Executor)this.field_22787);
        }).ifRight(class020432 -> this.N(class020432.y()));
    }

    private void z() {
        this.Z();
        this.field_22787.N((class05096)class03918.N((class00392)s, (class00392)m, (class00392)class05220.u, () -> this.field_22787.N(null)));
    }

    protected void u() {
        this.G = (class05725)this.U.N((class02102)class05725.y((class00392)n, (class01590)this.field_22793).N(this.E.B()).N(280).N((class057252, bl) -> {
            this.E.N(bl);
            this.y();
        }).N());
        class01885 class018852 = (class01885)this.U.N((class02102)class01885.i().N(8));
        class018852.N((class02102)class05362.method_46430((class00392)class05220.U, class053622 -> this.method_25419()).N(120).N());
        this.W = (class05362)class018852.N((class02102)class05362.method_46430((class00392)N, class053622 -> this.i()).N(120).N());
    }

    protected void y() {
        class02043 class020432 = this.E.L();
        this.W.field_22763 = class020432 == null && this.G.y();
        this.W.method_47400((class04141)class01962.N((Object)class020432, class02043::N));
    }

    protected abstract void N();

    private void N(Throwable throwable) {
        t.error("Encountered error while sending abuse report", throwable);
        Throwable throwable2 = throwable.getCause();
        class00392 class003922 = throwable2 instanceof class04442 ? ((class04442)throwable2).N() : b;
        this.N(class003922);
    }

    private void N(class00392 class003922) {
        class05216 class052162 = class003922.L().N(class06541.field_1061);
        this.field_22787.N((class05096)class03918.N((class00392)T, (class00392)class052162, (class00392)class05220.U, () -> this.field_22787.N((class05096)this)));
    }

    protected class03943 N(int n, int n2, Consumer<String> consumer) {
        AbuseReportLimits abuseReportLimits = this.z.N().y();
        class03943 class039432 = class03943.L().N(j).N(this.field_22793, n, n2, v);
        class039432.N(this.E.M());
        class039432.N(abuseReportLimits.maxOpinionCommentsLength());
        class039432.N(consumer);
        return class039432;
    }

    public void method_25426() {
        this.U.L().y();
        this.L();
        this.N();
        this.u();
        this.y();
        this.U.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public void method_48640() {
        this.U.N();
        class02077.N((class02102)this.U, (class03255)this.method_48202());
    }

    public void method_25432() {
        this.R();
        super.method_25432();
    }

    public void method_25419() {
        if (this.E.y()) {
            this.field_22787.N((class05096)new class03727(this));
        } else {
            this.field_22787.N(this.Z);
        }
    }

    void R() {
        if (this.E.y()) {
            this.z.N(this.E.i().y());
        }
    }
}

