/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07050
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07050;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class06501 {
    private final @Nullable class08036 field_8942;
    private final class07050 field_19176;
    private final class06183 field_17543;
    private final class07299 field_8945;
    private final class06584 field_8941;

    public class06501(class08036 class080362, class07050 class070502, class06183 class061832) {
        this(class080362.method_73183(), class080362, class070502, class080362.method_5998(class070502), class061832);
    }

    public class06501(class07299 class072992, @Nullable class08036 class080362, class07050 class070502, class06584 class065842, class06183 class061832) {
        this.field_8942 = class080362;
        this.field_19176 = class070502;
        this.field_17543 = class061832;
        this.field_8941 = class065842;
        this.field_8945 = class072992;
    }

    public @Nullable class08036 method_8036() {
        return this.field_8942;
    }

    public class07209 method_8037() {
        return this.field_17543.u();
    }

    public class07299 method_8045() {
        return this.field_8945;
    }

    public class06584 method_8041() {
        return this.field_8941;
    }

    public class07050 method_20287() {
        return this.field_19176;
    }

    protected final class06183 method_30344() {
        return this.field_17543;
    }

    public float method_8044() {
        return this.field_8942 == null ? 0.0f : this.field_8942.method_36454();
    }

    public class07211 method_8038() {
        return this.field_17543.i();
    }

    public class06889 method_17698() {
        return this.field_17543.y();
    }

    public boolean method_17699() {
        return this.field_17543.R();
    }

    public class07211 method_8042() {
        return this.field_8942 == null ? class07211.field_11043 : this.field_8942.method_5735();
    }

    public boolean method_8046() {
        return this.field_8942 != null && this.field_8942.method_21823();
    }
}

