/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class01042
 *  minecraft.class03767
 *  minecraft.class03776
 *  minecraft.class05212
 *  minecraft.class05934
 *  minecraft.class07001
 *  minecraft.class07074
 *  minecraft.class07086
 *  minecraft.class07282
 *  minecraft.class07305
 *  minecraft.class07312
 *  minecraft.class07826
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import minecraft.class01042;
import minecraft.class03767;
import minecraft.class03776;
import minecraft.class05212;
import minecraft.class05934;
import minecraft.class07001;
import minecraft.class07074;
import minecraft.class07086;
import minecraft.class07282;
import minecraft.class07305;
import minecraft.class07312;
import minecraft.class07826;
import org.jspecify.annotations.Nullable;

public interface class05081 {
    public static final int u = 19133;
    public static final int i = 19132;

    public boolean w();

    default public class03767 K() {
        return this.Q().y();
    }

    public boolean T();

    public class03776 Q();

    public Set<String> I();

    public Set<String> J();

    public class07086 s();

    public class05934 l();

    public boolean d();

    public class07305 m();

    public class05212 o();

    public Lifecycle k();

    public @Nullable class07001 t();

    public boolean g();

    public class07312 q();

    public boolean U();

    public class07282 z();

    public void u(boolean var1);

    public String u();

    public boolean E();

    public void N(class07282 var1);

    public void N(String var1, boolean var2);

    public class07001 N(class01042 var1, @Nullable class07001 var2);

    public void N(@Nullable class07001 var1);

    public void N(class03776 var1);

    public void N(class07086 var1);

    default public void N(class07074 class070742) {
        class070742.N("Known server brands", () -> String.join((CharSequence)", ", this.I()));
        class070742.N("Removed feature flags", () -> String.join((CharSequence)", ", this.J()));
        class070742.N("Level was modded", () -> Boolean.toString(this.g()));
        class070742.N("Level storage version", () -> {
            int n = this.G();
            return String.format(Locale.ROOT, "0x%05X - %s", n, this.R(n));
        });
    }

    public void N(class07826 var1);

    default public String R(int n) {
        switch (n) {
            case 19133: {
                return "Anvil";
            }
            case 19132: {
                return "McRegion";
            }
        }
        return "Unknown?";
    }

    public @Nullable class07001 O();

    public int G();

    public class07826 Y();
}

