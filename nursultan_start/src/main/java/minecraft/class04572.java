/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10452
 */
package minecraft;

import Nursultan.class10452;
import java.util.Optional;

public class class04572 {
    public final String N;
    public final Optional<class10452> y;

    public class04572(String string, Optional<class10452> optional) {
        this.N = string;
        this.y = optional;
    }

    public String toString() {
        return this.y.map(class104522 -> this.N + ":" + String.valueOf(class104522)).orElse(this.N);
    }
}

