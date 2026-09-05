/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00851
 *  minecraft.class00891
 *  minecraft.class01400
 *  minecraft.class01408
 *  minecraft.class03556
 *  minecraft.class05952
 *  minecraft.class05957
 */
package minecraft;

import java.util.Optional;
import minecraft.class00851;
import minecraft.class00891;
import minecraft.class01400;
import minecraft.class01408;
import minecraft.class03556;
import minecraft.class05952;
import minecraft.class05957;

public class class07670
implements class05952 {
    private final class03556<class00891> N;
    private Optional<class01400> y = Optional.empty();

    public class07670(class00891 class008912) {
        this.N = class008912.s();
    }

    public class05957 build() {
        return new class00851(this.N, this.y);
    }

    public class07670 N(class01408 class014082) {
        this.y = class014082.y();
        return this;
    }
}

