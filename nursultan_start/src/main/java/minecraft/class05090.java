/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04948
 */
package minecraft;

import java.util.List;
import minecraft.class04948;
import minecraft.class05091;
import minecraft.class05094;
import minecraft.class05097;
import minecraft.class05111;

class class05090
extends Thread {
    final /* synthetic */ class05094 N;

    class05090(class05094 class050942, String string) {
        this.N = class050942;
        super(string);
    }

    @Override
    public void run() {
        class05111 class051112 = class05111.N();
        try {
            List var2 = class051112.u(this.N.z.y).N();
            class05094.N(this.N).execute(() -> {
                this.N.R = var2;
                this.N.U = this.N.R.isEmpty();
                if (!this.N.U && this.N.Z != null) {
                    this.N.Z.field_22763 = true;
                }
                if (this.N.M != null) {
                    this.N.M.method_25314(this.N.R.stream().map(class049482 -> new class05091(this.N, (class04948)class049482)).toList());
                }
            });
        }
        catch (class05097 class050972) {
            class05094.N.error("Couldn't request backups", (Throwable)class050972);
        }
    }
}

