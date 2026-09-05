/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  minecraft.class07393
 *  minecraft.class07403
 *  minecraft.class07929
 *  minecraft.class07931
 *  minecraft.class07936
 *  minecraft.class07938
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonElement;
import java.util.function.Function;
import minecraft.class07393;
import minecraft.class07403;
import minecraft.class07929;
import minecraft.class07931;
import minecraft.class07936;
import minecraft.class07938;
import minecraft.class07946;
import org.jspecify.annotations.Nullable;

public interface class07945<Params, Result> {
    public class07946 y();

    public static <Result> class07938<Void, Result> N(class07936<Result> class079362) {
        return new class07938(class079362);
    }

    public static <Params, Result> class07938<Params, Result> N(class07929<Params, Result> class079292) {
        return new class07938(class079292);
    }

    public static <Result> class07938<Void, Result> N(Function<class07393, Result> function) {
        return new class07938(function);
    }

    public JsonElement N(class07393 var1, @Nullable JsonElement var2, class07403 var3);

    public class07931<Params, Result> N();
}

