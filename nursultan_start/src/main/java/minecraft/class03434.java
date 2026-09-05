/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03256
 */
package minecraft;

import java.util.Collection;
import java.util.List;
import minecraft.class03256;
import minecraft.class03432;
import minecraft.class03439;

public interface class03434
extends class03256,
class03439 {
    public class03432 method_37018();

    default public boolean method_37303() {
        return true;
    }

    default public Collection<? extends class03434> e_() {
        return List.of(this);
    }
}

