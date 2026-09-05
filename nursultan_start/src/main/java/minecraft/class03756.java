/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01140
 *  minecraft.class01631
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class02721
 *  minecraft.class03428
 *  minecraft.class04208
 *  minecraft.class04802
 *  minecraft.class04995
 *  minecraft.class05220
 *  minecraft.class06478
 *  minecraft.class06613
 *  minecraft.class09033
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Supplier;
import minecraft.class01054;
import minecraft.class01140;
import minecraft.class01631;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class02721;
import minecraft.class03428;
import minecraft.class04208;
import minecraft.class04802;
import minecraft.class04995;
import minecraft.class05220;
import minecraft.class06478;
import minecraft.class06613;
import minecraft.class09033;
import org.jspecify.annotations.Nullable;

public class class03756
extends class06478 {
    private static final float N = 2.125f;
    private static final float y = 0.97f;
    private static final float L = 2.5f;
    private static final float u = -5.0f;
    private static final float i = 30.0f;
    private static final float R = 50.0f;
    private final class02721 M;
    private final class02721 B;
    private final Supplier<class01631> Z;
    private float z = -5.0f;
    private float U = 30.0f;

    public class03756(int n, int n2, class01140 class011402, Supplier<class01631> supplier) {
        super(0, 0, n, n2, class05220.N);
        this.M = new class02721(class011402.N(class04802.Lg), false);
        this.B = new class02721(class011402.N(class04802.LK), true);
        this.Z = supplier;
    }

    public @Nullable class02106 method_48205(class02089 class020892) {
        return null;
    }

    protected void method_47399(class03428 class034282) {
    }

    protected void method_25349(class06613 class066132, double d, double d2) {
        this.z = class04995.N((float)(this.z - (float)d2 * 2.5f), (float)-50.0f, (float)50.0f);
        this.U += (float)d * 2.5f;
    }

    public void method_25354(class09033 class090332) {
    }

    protected void method_48579(class01054 class010542, int n, int n2, float f) {
        float f2 = 0.97f * (float)this.method_25364() / 2.125f;
        float f3 = -1.0625f;
        class01631 class016312 = this.Z.get();
        class02721 class027212 = class016312.u() == class04208.field_41122 ? this.B : this.M;
        class010542.N(class027212, class016312.N().y(), f2, this.z, this.U, -1.0625f, this.method_46426(), this.method_46427(), this.method_55442(), this.method_55443());
    }
}

