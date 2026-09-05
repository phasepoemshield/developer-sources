/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04655
 *  minecraft.class06202
 *  minecraft.class06604
 *  minecraft.class08844
 */
package me.shedaniel.clothconfig2.api;

import java.util.Objects;
import minecraft.class04655;
import minecraft.class06202;
import minecraft.class06604;
import minecraft.class08844;

public class Modifier {
    private final short value;

    private Modifier(short s) {
        this.value = s;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof Modifier)) {
            return false;
        }
        return this.value == ((Modifier)object).value;
    }

    public int hashCode() {
        return Objects.hash(this.value);
    }

    public short getValue() {
        return this.value;
    }

    public boolean isEmpty() {
        return this.value == 0;
    }

    public static Modifier of(boolean bl, boolean bl2, boolean bl3) {
        short s = Modifier.setFlag((short)0, (short)1, bl);
        s = Modifier.setFlag(s, (short)2, bl2);
        s = Modifier.setFlag(s, (short)4, bl3);
        return Modifier.of(s);
    }

    public static Modifier of(short s) {
        return new Modifier(s);
    }

    /*
     * Unable to fully structure code
     */
    public static Modifier current() {
        block9: {
            block8: {
                var0 = class06202.Nq().Nt();
                if (class04655.N((class08844)var0, (int)342)) ** GOTO lbl-1000
                if (class04655.N((class08844)var0, (int)346)) lbl-1000:
                // 2 sources

                {
                    v0 = true;
                } else {
                    v0 = var1_1 = false;
                }
                if (!class06604.N) break block8;
                if (class04655.N((class08844)var0, (int)343)) ** GOTO lbl-1000
                if (class04655.N((class08844)var0, (int)347)) lbl-1000:
                // 2 sources

                {
                    v1 = true;
                } else {
                    v1 = false;
                }
                break block9;
            }
            if (class04655.N((class08844)var0, (int)341)) ** GOTO lbl-1000
            if (class04655.N((class08844)var0, (int)345)) lbl-1000:
            // 2 sources

            {
                v1 = true;
            } else {
                v1 = false;
            }
        }
        var2_2 = v1;
        if (class04655.N((class08844)var0, (int)340)) ** GOTO lbl-1000
        if (class04655.N((class08844)var0, (int)344)) lbl-1000:
        // 2 sources

        {
            v2 = true;
        } else {
            v2 = false;
        }
        var3_3 = v2;
        return Modifier.of(var1_1, var2_2, var3_3);
    }

    private static short removeFlag(short s, short s2) {
        return (short)(s & ~s2);
    }

    public static Modifier none() {
        return Modifier.of((short)0);
    }

    private static short setFlag(short s, short s2, boolean bl) {
        return bl ? Modifier.setFlag(s, s2) : Modifier.removeFlag(s, s2);
    }

    private static short setFlag(short s, short s2) {
        return (short)(s | s2);
    }

    public boolean hasShift() {
        return Modifier.getFlag(this.value, (short)4);
    }

    public boolean hasAlt() {
        return Modifier.getFlag(this.value, (short)1);
    }

    public boolean hasControl() {
        return Modifier.getFlag(this.value, (short)2);
    }

    public boolean matchesCurrent() {
        return this.equals(Modifier.current());
    }

    private static boolean getFlag(short s, short s2) {
        return (s & s2) != 0;
    }
}

