/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00780
 *  minecraft.class01042
 *  minecraft.class01837
 *  minecraft.class03028
 *  minecraft.class03556
 *  minecraft.class04084
 *  minecraft.class04865
 *  minecraft.class05474
 *  minecraft.class07209
 *  minecraft.class08050
 *  minecraft.class08088
 */
package minecraft;

import java.util.Optional;
import java.util.function.Function;
import minecraft.class00500;
import minecraft.class00780;
import minecraft.class01042;
import minecraft.class01837;
import minecraft.class03028;
import minecraft.class03556;
import minecraft.class04084;
import minecraft.class04865;
import minecraft.class05474;
import minecraft.class06057;
import minecraft.class07209;
import minecraft.class08050;
import minecraft.class08088;

public class class06080
extends class06057 {
    private final class01042 N;
    private final class01837 y;
    private final class04084 L;
    private final class03028 u;

    public class06080(class04865 class048652, class01042 class010422, class05474 class054742, class01837 class018372, class04084 class040842, class03028 class030282) {
        super((class08088)class048652, class054742);
        this.N = class010422;
        this.y = class018372;
        this.L = class040842;
        this.u = class030282;
    }

    public class04084 y() {
        return this.L;
    }

    @Deprecated
    public Optional<class00500> N(Function<class07209, class03556<class00780>> function, class08050 class080502, class07209 class072092, boolean bl) {
        return this.L.L().N(this.u, this, function, class080502, this.y, class072092, bl);
    }

    @Deprecated
    public class01042 N() {
        return this.N;
    }
}

