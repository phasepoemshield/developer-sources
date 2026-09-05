/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10855
 *  Nursultan.class10856
 *  Nursultan.class10857
 *  com.google.gson.JsonElement
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10855;
import Nursultan.class10856;
import Nursultan.class10857;
import com.google.gson.JsonElement;
import minecraft.class07912;
import minecraft.class07924;
import minecraft.class07930;
import minecraft.class07931;
import org.jspecify.annotations.Nullable;

public interface class07940<Params, Result> {
    public static final String N = "notification/";

    public static class07930<Void, Void> L() {
        return new class07930<Void, Void>(class10857::new);
    }

    public static <Result> class07930<Void, Result> i() {
        return new class07930(class10855::new);
    }

    public static <Params> class07930<Params, Void> u() {
        return new class07930(class10856::new);
    }

    public class07924 y();

    public class07931<Params, Result> N();

    default public @Nullable Result N(JsonElement jsonElement) {
        return null;
    }

    default public @Nullable JsonElement N(Params Params) {
        return null;
    }

    public static <Params, Result> class07930<Params, Result> R() {
        return new class07930(class07912::new);
    }
}

