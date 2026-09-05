/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03063
 *  minecraft.class06202
 *  minecraft.class08066
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Supplier;
import minecraft.class03063;
import minecraft.class06202;
import minecraft.class08066;
import org.jspecify.annotations.Nullable;

public class class06856 {
    private final String i;
    private final Supplier<@Nullable class08066> R;
    public static final class06856 N = new class06856("main_target", () -> class06202.Nq().e());
    public static final class06856 y = new class06856("outline_target", () -> ((class03063)class06202.Nq().B_2).m());
    public static final class06856 L = new class06856("weather_target", () -> ((class03063)class06202.Nq().B_2).b());
    public static final class06856 u = new class06856("item_entity_target", () -> ((class03063)class06202.Nq().B_2).s());

    public class06856(String string, Supplier<@Nullable class08066> supplier) {
        this.i = string;
        this.R = supplier;
    }

    public String toString() {
        return "OutputTarget[" + this.i + "]";
    }

    public class08066 N() {
        class08066 class080662 = this.R.get();
        return class080662 != null ? class080662 : class06202.Nq().e();
    }
}

