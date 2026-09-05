/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import minecraft.class00405;
import org.jspecify.annotations.Nullable;

public class class09360 {
    private boolean y;
    final /* synthetic */ StringBuilder N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class09360(class00405 class004052, StringBuilder stringBuilder) {
        this.N = stringBuilder;
    }

    public void N(String string, @Nullable Object object) {
        if (object != null) {
            this.N();
            this.N.append(string);
            this.N.append('=');
            this.N.append(object);
        }
    }

    public void N(String string, @Nullable Boolean bl) {
        if (bl != null) {
            this.N();
            if (!bl.booleanValue()) {
                this.N.append('!');
            }
            this.N.append(string);
        }
    }

    private void N() {
        if (this.y) {
            this.N.append(',');
        }
        this.y = true;
    }
}

