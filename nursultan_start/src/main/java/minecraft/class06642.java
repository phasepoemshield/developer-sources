/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00518
 *  minecraft.class00667
 *  minecraft.class01890
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07280
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import minecraft.class00381;
import minecraft.class00518;
import minecraft.class00667;
import minecraft.class01890;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07280;
import org.jspecify.annotations.Nullable;

public class class06642
implements class00381<class07280> {
    public static final class02362<class00667, class06642> N = class00381.N(class06642::N, class06642::new);
    private final class01890 y;
    private final String L;

    public class06642(class01890 class018902, @Nullable class00518 class005182) {
        this.y = class018902;
        this.L = class005182 == null ? "" : class005182.L();
    }

    private class06642(class00667 class006672) {
        this.y = (class01890)class006672.N(class01890.field_45176);
        this.L = class006672.s();
    }

    public @Nullable String y() {
        return Objects.equals(this.L, "") ? null : this.L;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class01890 N() {
        return this.y;
    }

    private void N(class00667 class006672) {
        class006672.N(class01890::N, (Object)this.y);
        class006672.N(this.L);
    }

    public class02897<class06642> method_65080() {
        return class04248.NK;
    }
}

