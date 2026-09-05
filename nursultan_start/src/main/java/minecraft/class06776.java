/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 *  minecraft.class00667
 *  minecraft.class04348
 */
package minecraft;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class00667;
import minecraft.class04348;
import minecraft.class06799;
import minecraft.class06807;

public class class06776
implements class06799 {
    private final class06807 N;

    private class06776(Function function) {
        this.N = new class06807(this, function);
    }

    public class06807 N(ArgumentType argumentType) {
        return this.N;
    }

    public static class06776 N_14(Supplier supplier) {
        return new class06776(arg_0 -> class06776.N((Supplier)supplier, arg_0));
    }

    private static /* synthetic */ ArgumentType N(Supplier supplier, class04348 class043482) {
        return (ArgumentType)supplier.get();
    }

    public void N(class06807 class068072, class00667 class006672) {
    }

    public void N(class06807 class068072, JsonObject jsonObject) {
    }

    public class06807 y(class00667 class006672) {
        return this.N;
    }

    public static class06776 N_62(Function function) {
        return new class06776(function);
    }
}

