/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04714
 *  minecraft.class04717
 *  minecraft.class04979
 */
package minecraft;

import minecraft.class04714;
import minecraft.class04717;
import minecraft.class04979;

public class class03398 {
    private final class04714 N;
    private boolean y;
    private String L;

    public class03398(class04714 class047142) {
        this.N = class047142;
        class04717 class047172 = class047142.N();
        this.y = class047172.y;
        this.L = class047172.N;
    }

    private class04717 y(class04979 class049792) {
        class04717 class047172 = this.N.N();
        if (class049792.N() == null || class049792.N().equals(class047172.N)) {
            return class047172;
        }
        class04717 class047173 = new class04717();
        class047173.N = class049792.N();
        class047173.y = true;
        this.N.N(class047173);
        return class047173;
    }

    public String y() {
        return this.L;
    }

    public void N(class04979 class049792) {
        class04717 class047172 = this.y(class049792);
        this.y = class047172.y;
        this.L = class047172.N;
    }

    public boolean N() {
        return this.y;
    }
}

