/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 *  minecraft.class05197
 *  minecraft.class05199
 *  minecraft.class05209
 *  minecraft.class05228
 *  minecraft.class05232
 *  minecraft.class05935
 *  minecraft.class05936
 */
package Nursultan;

import java.util.Optional;
import minecraft.class00405;
import minecraft.class05197;
import minecraft.class05199;
import minecraft.class05209;
import minecraft.class05228;
import minecraft.class05232;
import minecraft.class05935;
import minecraft.class05936;

public class class10501
implements class05935<class05936> {
    private final class05199 y = new class05199();
    final /* synthetic */ class05209 N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10501(class05228 class052282, class05209 class052092) {
        this.N = class052092;
    }

    public Optional<class05936> accept(class00405 class004052, String string) {
        this.N.y();
        if (!class05232.L((String)string, (class00405)class004052, (class05197)this.N)) {
            String string2 = string.substring(0, this.N.N());
            if (!string2.isEmpty()) {
                this.y.N(class05936.N((String)string2, (class00405)class004052));
            }
            return Optional.of(this.y.y());
        }
        if (!string.isEmpty()) {
            this.y.N(class05936.N((String)string, (class00405)class004052));
        }
        return Optional.empty();
    }
}

