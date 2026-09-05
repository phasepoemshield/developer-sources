/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class04141
 *  minecraft.class05341
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01875;
import minecraft.class01883;
import minecraft.class04141;
import minecraft.class05341;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public abstract class class01858
extends class05362 {
    protected final class01883 N;
    protected final int y;
    protected final int L;

    public class01858(int n, int n2, class00392 class003922, int n3, int n4, class01883 class018832, class05361 class053612, @Nullable class00392 class003923, @Nullable class05341 class053412) {
        super(0, 0, n, n2, class003922, class053612, class053412 == null ? field_40754 : class053412);
        if (class003923 != null) {
            this.method_47400(class04141.N((class00392)class003923));
        }
        this.y = n3;
        this.L = n4;
        this.N = class018832;
    }

    protected void N(class01054 class010542, int n, int n2) {
        class010542.N(class08394.Na, this.N.N(this.method_37303(), this.method_25367()), n, n2, this.y, this.L, this.field_22765);
    }

    public static class01875 N(class00392 class003922, class05361 class053612, boolean bl) {
        return new class01875(class003922, class053612, bl);
    }
}

