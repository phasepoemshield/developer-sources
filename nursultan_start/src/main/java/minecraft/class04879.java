/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09413
 *  Nursultan.class09415
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00913
 *  minecraft.class00949
 *  minecraft.class01621
 *  minecraft.class07913
 *  minecraft.class08985
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09413;
import Nursultan.class09415;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import minecraft.class00913;
import minecraft.class00949;
import minecraft.class01621;
import minecraft.class04846;
import minecraft.class04866;
import minecraft.class07913;
import minecraft.class08985;
import org.jspecify.annotations.Nullable;

class class04879
implements class01621,
AutoCloseable {
    private final boolean y;
    private volatile @Nullable class04846 L;
    private volatile @Nullable class07913 u;
    final /* synthetic */ class04866 N;

    class04879(class04866 class048662, boolean bl) {
        this.N = class048662;
        this.y = bl;
    }

    @Override
    public void close() {
        this.y();
    }

    private class08985 y(class00949 class009492) {
        class00949 class009493 = class009492;
        Objects.requireNonNull(class009493);
        class00949 class009494 = class009493;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00913.class, class09413.class, class09415.class}, (Object)class009494, (int)n)) {
            case 0 -> {
                class00913 var4_4 = (class00913)class009494;
                yield this.N.N(var4_4.N()).N(this.y);
            }
            case 1 -> {
                class09413 var5_5 = (class09413)class009494;
                yield this.N.N(var5_5);
            }
            case 2 -> {
                class09415 var6_6 = (class09415)class009494;
                yield this.N.i.N(var6_6);
            }
            default -> this.N.L.N(this.y);
        };
    }

    public void y() {
        this.L = null;
        this.u = null;
    }

    public class08985 N(class00949 class009492) {
        class04846 class048462 = this.L;
        if (class048462 != null && class009492.equals((Object)class048462.N())) {
            return class048462.y();
        }
        class08985 class089852 = this.y(class009492);
        this.L = new class04846(class009492, class089852);
        return class089852;
    }

    public class07913 N() {
        class07913 class079132 = this.u;
        if (class079132 == null) {
            this.u = class079132 = this.N.N(class00949.y.N()).N();
        }
        return class079132;
    }
}

