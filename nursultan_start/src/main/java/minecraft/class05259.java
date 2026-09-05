/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01042
 */
package minecraft;

import java.util.Properties;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class01042;
import minecraft.class05269;

public class class05259
implements Supplier {
    private final String y;
    private final Object L;
    private final Function u;
    final /* synthetic */ class05269 N;

    class05259(class05269 class052692, String string, Object object, Function function) {
        this.N = class052692;
        this.y = string;
        this.L = object;
        this.u = function;
    }

    public Object get() {
        return this.L;
    }

    public class05269 N(class01042 class010422, Object object) {
        Properties properties = this.N.N();
        properties.put(this.y, this.u.apply(object));
        return this.N.y(class010422, properties);
    }
}

