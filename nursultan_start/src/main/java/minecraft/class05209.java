/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 */
package minecraft;

import minecraft.class00405;
import minecraft.class05197;
import minecraft.class05228;

public class class05209
implements class05197 {
    private float y;
    private int L;
    final /* synthetic */ class05228 N;

    public class05209(class05228 class052282, float f) {
        this.N = class052282;
        this.y = f;
    }

    @Override
    public boolean accept(int n, class00405 class004052, int n2) {
        this.y -= this.N.N.getWidth(n2, class004052);
        if (this.y >= 0.0f) {
            this.L = n + Character.charCount(n2);
            return true;
        }
        return false;
    }

    public void y() {
        this.L = 0;
    }

    public int N() {
        return this.L;
    }
}

