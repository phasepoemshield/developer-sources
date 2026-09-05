/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class00642
 *  minecraft.class03420
 *  minecraft.class04981
 *  minecraft.class05096
 *  minecraft.class05405
 *  minecraft.class06202
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00392;
import minecraft.class00642;
import minecraft.class03420;
import minecraft.class04981;
import minecraft.class05096;
import minecraft.class05405;
import minecraft.class06202;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05435 {
    static final Logger N = LogUtils.getLogger();
    final class05096 y;
    volatile boolean L;
    @Nullable class00642 u;

    public class05435(class05096 class050962) {
        this.y = class050962;
    }

    public void y() {
        if (this.u != null) {
            if (this.u.method_10758()) {
                this.u.method_10754();
            } else {
                this.u.method_10768();
            }
        }
    }

    public void N(class04981 class049812, class03420 class034202) {
        class06202 class062022 = class06202.Nq();
        class062022.No();
        class062022.NT().u((class00392)class00392.L((String)"mco.connect.success"));
        String string = class034202.N();
        int n = class034202.y();
        new class05405(this, "Realms-connect-task", string, n, class062022, class049812).start();
    }

    public void N() {
        this.L = true;
        if (this.u != null && this.u.method_10758()) {
            this.u.method_10747((class00392)class00392.L((String)"disconnect.genericReason"));
            this.u.method_10768();
        }
    }
}

