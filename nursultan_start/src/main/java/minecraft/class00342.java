/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class03448
 *  minecraft.class05033
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class08961
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00332;
import minecraft.class00354;
import minecraft.class00378;
import minecraft.class03448;
import minecraft.class05033;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class08961;

public abstract class class00342
extends Enum<class00342>
implements class05033 {
    public static final /* enum */ class00342 field_55557 = new class00332("RANDOM", 0, "random");
    public static final /* enum */ class00342 field_55558 = new class00354("DAYTIME", 1, "daytime");
    public static final /* enum */ class00342 field_55559 = new class00378("MOON_PHASE", 2, "moon_phase");
    public static final Codec<class00342> field_55560;
    private final String field_55561;
    private static final /* synthetic */ class00342[] field_55562;

    class00342(String string2) {
        this.field_55561 = string2;
    }

    public static class00342[] values() {
        return (class00342[])field_55562.clone();
    }

    public static class00342 valueOf(String string) {
        return Enum.valueOf(class00342.class, string);
    }

    private static /* synthetic */ class00342[] N() {
        return new class00342[]{field_55557, field_55558, field_55559};
    }

    abstract float N(class03448 var1, class06584 var2, class08961 var3, class06069 var4);

    public String method_15434() {
        return this.field_55561;
    }

    static {
        field_55562 = class00342.N();
        field_55560 = class05033.N(class00342::values);
    }
}

