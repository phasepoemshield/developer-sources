/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00549
 *  minecraft.class00891
 *  minecraft.class01296
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07092
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07310
 *  minecraft.class07475
 *  net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.LithiumMoveToBlockGoal
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.BiPredicate;
import minecraft.class00500;
import minecraft.class00549;
import minecraft.class00891;
import minecraft.class01296;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07092;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07310;
import minecraft.class07475;
import minecraft.class07969;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.LithiumMoveToBlockGoal;
import org.jspecify.annotations.Nullable;

public class class07973
extends class07969
implements LithiumMoveToBlockGoal {
    private final class00891 M;
    private final class07079 B;
    private int Z;
    private static final int z = 20;
    private static final BiPredicate U = class07973::N;

    @Override
    public void L() {
        super.L();
        this.Z = 0;
    }

    public class07973(class00891 class008912, class07475 class074752, double d, int n) {
        super(class074752, d, 24, n);
        this.M = class008912;
        this.B = class074752;
    }

    @Override
    public void i() {
        super.i();
        class07299 class072992 = this.B.method_73183();
        class07209 class072092 = this.B.method_24515();
        class07209 class072093 = this.N(class072092, (class07290)class072992);
        class06069 class060692 = this.B.method_59922();
        if (this.W() && class072093 != null) {
            double d;
            class06889 class068892;
            if (this.Z > 0) {
                class068892 = this.B.method_18798();
                this.B.method_18800(class068892.M, 0.3, class068892.Z);
                if (!class072992.method_8608()) {
                    d = 0.08;
                    ((class04782)class072992).method_65096((class07126)new class07092(class07107.S, new class06584((class07310)class06570.jO)), (double)class072093.method_10263() + 0.5, (double)class072093.method_10264() + 0.7, (double)class072093.method_10260() + 0.5, 3, ((double)class060692.z() - 0.5) * 0.08, ((double)class060692.z() - 0.5) * 0.08, ((double)class060692.z() - 0.5) * 0.08, (double)0.15f);
                }
            }
            if (this.Z % 2 == 0) {
                class068892 = this.B.method_18798();
                this.B.method_18800(class068892.M, -0.3, class068892.Z);
                if (this.Z % 6 == 0) {
                    this.N((class07284)class072992, this.i);
                }
            }
            if (this.Z > 60) {
                class072992.method_8650(class072093, false);
                if (!class072992.method_8608()) {
                    for (int i = 0; i < 20; ++i) {
                        d = class060692.E() * 0.02;
                        double d2 = class060692.E() * 0.02;
                        double d3 = class060692.E() * 0.02;
                        ((class04782)class072992).method_65096((class07126)class07107.NR, (double)class072093.method_10263() + 0.5, (double)class072093.method_10264(), (double)class072093.method_10260() + 0.5, 1, d, d2, d3, (double)0.15f);
                    }
                    this.N(class072992, class072093);
                }
            }
            ++this.Z;
        }
    }

    public void u() {
        super.u();
        this.B.field_6017 = 1.0;
    }

    protected boolean N(class07973 class079732) {
        return ((LithiumMoveToBlockGoal)class079732).lithium$findNearestBlock(this::N, U, false);
    }

    private boolean N(class00500 class005002) {
        return class005002.N(this.M);
    }

    private static boolean N(class08050 class080502, class07218 class072182) {
        return class080502.method_8320((class07209)class072182.y(0, 1, 0)).P() && class080502.method_8320((class07209)class072182.y(0, 1, 0)).P();
    }

    @Override
    protected boolean N(class05487 class054872, class07209 class072092) {
        class08050 class080502 = class054872.method_8402(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260()), class00549.m, false);
        if (class080502 != null) {
            return class080502.method_8320(class072092).N(this.M) && class080502.method_8320(class072092.method_10084()).P() && class080502.method_8320(class072092.method_10086(2)).P();
        }
        return false;
    }

    public void N(class07299 class072992, class07209 class072092) {
    }

    @Override
    public boolean N() {
        if (!((Boolean)class07973.N((class07049)this.B).method_64395().N(class07305.I)).booleanValue()) {
            return false;
        }
        if (this.L > 0) {
            --this.L;
            return false;
        }
        class07973 class079732 = this;
        if (this.N(class079732)) {
            this.L = class07973.y((int)20);
            return true;
        }
        this.L = this.N(this.N);
        return false;
    }

    private @Nullable class07209 N(class07209 class072092, class07290 class072902) {
        if (class072902.method_8320(class072092).N(this.M)) {
            return class072092;
        }
        for (class07209 class072093 : new class07209[]{class072092.method_10074(), class072092.method_10067(), class072092.method_10078(), class072092.method_10095(), class072092.method_10072(), class072092.method_10074().method_10074()}) {
            if (!class072902.method_8320(class072093).N(this.M)) continue;
            return class072093;
        }
        return null;
    }

    public void N(class07284 class072842, class07209 class072092) {
    }
}

