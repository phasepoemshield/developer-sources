/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class00737;
import minecraft.class00753;
import minecraft.class05779;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07438;

public class class05744
implements class05779 {
    private final class07209 N;
    private final class06889 y;

    public class05744(class07209 class072092) {
        this.N = class072092.method_10062();
        this.y = class06889.y((class00753)class072092);
    }

    public class05744(class06889 class068892) {
        this.N = class07209.method_49638((class00737)class068892);
        this.y = class068892;
    }

    public String toString() {
        return "BlockPosTracker{blockPos=" + String.valueOf(this.N) + ", centerPosition=" + String.valueOf(this.y) + "}";
    }

    @Override
    public class07209 y() {
        return this.N;
    }

    @Override
    public boolean N(class07438 class074382) {
        return true;
    }

    @Override
    public class06889 N() {
        return this.y;
    }
}

