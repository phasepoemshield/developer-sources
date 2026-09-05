/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  java.lang.MatchException
 *  minecraft.class04370
 *  minecraft.class07001
 *  minecraft.class07707
 *  minecraft.class07709
 *  minecraft.class08314
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.MoreObjects;
import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.util.function.Function;
import minecraft.class04370;
import minecraft.class05603;
import minecraft.class05630;
import minecraft.class07001;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class08314;
import org.jspecify.annotations.Nullable;

class class05590
implements class05603 {
    final /* synthetic */ class07001 N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class05590(class05630 class056302, class07001 class070012) {
        this.N = class070012;
    }

    @Override
    public String N(String string, String string2) {
        return (String)MoreObjects.firstNonNull((Object)this.N(string), (Object)string2);
    }

    @Override
    public float N(String string, float f) {
        String string2 = this.N(string);
        if (string2 != null) {
            if (class05630.N(string2)) {
                return 1.0f;
            }
            if (class05630.y(string2)) {
                return 0.0f;
            }
            try {
                return Float.parseFloat(string2);
            }
            catch (NumberFormatException numberFormatException) {
                class05630.N.warn("Invalid floating point value for option {} = {}", new Object[]{string, string2, numberFormatException});
            }
        }
        return f;
    }

    @Override
    public <T> T N(String string, T t, Function<String, T> function, Function<T, String> function2) {
        String string2 = this.N(string);
        return string2 == null ? t : function.apply(string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private @Nullable String N(String string) {
        class07709 class077092 = this.N.N(string);
        if (class077092 == null) {
            return null;
        }
        if (!(class077092 instanceof class07707)) throw new IllegalStateException("Cannot read field of wrong type, expected string: " + String.valueOf(class077092));
        class07707 class077072 = (class07707)class077092;
        try {
            return class077072.U();
        }
        catch (Throwable throwable) {
            throw new MatchException(throwable.toString(), throwable);
        }
    }

    @Override
    public <T> void N(String string, class04370<T> class043702) {
        String string2 = this.N(string);
        if (string2 != null) {
            JsonElement jsonElement = class08314.N((String)(string2.isEmpty() ? "\"\"" : string2));
            class043702.method_42404().parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement).ifError(error -> class05630.N.error("Error parsing option value {} for option {}: {}", new Object[]{string2, class043702, error.message()})).ifSuccess(arg_0 -> class043702.method_41748(arg_0));
        }
    }

    @Override
    public int N(String string, int n) {
        String string2 = this.N(string);
        if (string2 != null) {
            try {
                return Integer.parseInt(string2);
            }
            catch (NumberFormatException numberFormatException) {
                class05630.N.warn("Invalid integer value for option {} = {}", new Object[]{string, string2, numberFormatException});
            }
        }
        return n;
    }

    @Override
    public boolean N(String string, boolean bl) {
        String string2 = this.N(string);
        return string2 != null ? class05630.N(string2) : bl;
    }
}

