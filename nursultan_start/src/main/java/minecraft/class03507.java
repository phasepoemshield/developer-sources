/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02903
 *  minecraft.class02919
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06941
 */
package minecraft;

import java.util.List;
import minecraft.class02903;
import minecraft.class02919;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06941;

public interface class03507
extends class06695,
class06941 {
    default public class02903 u() {
        return this.aD_().N();
    }

    public int y();

    public int N();

    default public class02919 aD_() {
        return class02903.y((int)this.y(), (int)this.N(), this.aC_());
    }

    public List<class06584> aC_();
}

