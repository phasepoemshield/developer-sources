/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10463
 *  minecraft.class02253
 *  minecraft.class08694
 */
package minecraft;

import Nursultan.class10463;
import java.util.function.Supplier;
import minecraft.class02253;
import minecraft.class04687;
import minecraft.class08694;

public interface class04643 {
    public static final String y = "root";

    public void L();

    default public void L(String string) {
    }

    default public class08694 L(Supplier<String> supplier) {
        this.N(supplier);
        return new class08694(this);
    }

    default public class08694 i(String string) {
        this.N(string);
        return new class08694(this);
    }

    default public void u(Supplier<String> supplier) {
        this.N(supplier, 1);
    }

    public void y(Supplier<String> var1);

    public void y();

    public void y(String var1);

    public static class04643 N(class04643 class046432, class04643 class046433) {
        if (class046432 == class04687.N) {
            return class046433;
        }
        if (class046433 == class04687.N) {
            return class046432;
        }
        return new class10463(class046432, class046433);
    }

    public void N(class02253 var1);

    public void N(String var1, int var2);

    public void N(Supplier<String> var1, int var2);

    public void N();

    public void N(String var1);

    public void N(Supplier<String> var1);

    default public void N(long l) {
    }

    default public void N(int n) {
    }

    default public void R(String string) {
        this.N(string, 1);
    }
}

