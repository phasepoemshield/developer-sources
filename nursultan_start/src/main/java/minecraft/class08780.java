/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04548
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class04548;
import minecraft.class08735;
import org.jspecify.annotations.Nullable;

public final class class08780
extends Record {
    private final Optional<class08735> min;
    private final Optional<class08735> max;
    private final Optional<Integer> format;
    private final Optional<class04548<Integer>> supported;
    static final MapCodec<class08780> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class08735.N.optionalFieldOf("min_format").forGetter(class08780::y), (App)class08735.y.optionalFieldOf("max_format").forGetter(class08780::L), (App)Codec.INT.optionalFieldOf("pack_format").forGetter(class08780::u), (App)class04548.N((Codec)Codec.INT).optionalFieldOf("supported_formats").forGetter(class08780::i)).apply(instance, class08780::new));
    public static final MapCodec<class08780> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class08735.N.optionalFieldOf("min_format").forGetter(class08780::y), (App)class08735.y.optionalFieldOf("max_format").forGetter(class08780::L), (App)class04548.N((Codec)Codec.INT).optionalFieldOf("formats").forGetter(class08780::i)).apply(instance, (optional, optional2, optional3) -> new class08780((Optional<class08735>)optional, (Optional<class08735>)optional2, optional.map(class08735::y), (Optional<class04548<Integer>>)optional3)));

    public Optional<class08735> L() {
        return this.max;
    }

    public class08780(Optional<class08735> optional, Optional<class08735> optional2, Optional<Integer> optional3, Optional<class04548<Integer>> optional4) {
        this.min = optional;
        this.max = optional2;
        this.format = optional3;
        this.supported = optional4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08780.class, "min;max;format;supported", "min", "max", "format", "supported"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08780.class, "min;max;format;supported", "min", "max", "format", "supported"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08780.class, "min;max;format;supported", "min", "max", "format", "supported"}, this);
    }

    public Optional<class04548<Integer>> i() {
        return this.supported;
    }

    public Optional<Integer> u() {
        return this.format;
    }

    private DataResult<class04548<class08735>> y(int n, boolean bl, boolean bl2, String string, String string2) {
        int n2 = this.min.get().y();
        int n3 = this.max.get().y();
        if (this.min.get().compareTo(this.max.get()) > 0) {
            return DataResult.error(() -> string + " min_format (" + String.valueOf(this.min.get()) + ") is greater than max_format (" + String.valueOf(this.max.get()) + ")");
        }
        if (n2 > n && !bl2) {
            String string3;
            if (this.supported.isPresent()) {
                return DataResult.error(() -> string + " key " + string2 + " is deprecated starting from pack format " + (n + 1) + ". Remove " + string2 + " from your pack.mcmeta.");
            }
            if (bl && this.format.isPresent() && (string3 = this.N(n2, n3)) != null) {
                return DataResult.error(() -> string3);
            }
        } else {
            Object object;
            if (this.supported.isPresent()) {
                object = this.supported.get();
                if ((Integer)object.N() != n2) {
                    return DataResult.error(() -> string + " version declaration mismatch between " + string2 + " (from " + String.valueOf(object.N()) + ") and min_format (" + String.valueOf(this.min.get()) + ")");
                }
                if ((Integer)object.y() != n3 && (Integer)object.y() != n) {
                    return DataResult.error(() -> string + " version declaration mismatch between " + string2 + " (up to " + String.valueOf(object.y()) + ") and max_format (" + String.valueOf(this.max.get()) + ")");
                }
            } else {
                return DataResult.error(() -> string + " declares support for format " + n2 + ", but game versions supporting formats 17 to " + n + " require a " + string2 + " field. Add \"" + string2 + "\": [" + n2 + ", " + n + "] or require a version greater or equal to " + (n + 1) + ".0.");
            }
            if (bl) {
                if (this.format.isPresent()) {
                    object = this.N(n2, n3);
                    if (object != null) {
                        return DataResult.error(() -> object);
                    }
                } else {
                    return DataResult.error(() -> string + " declares support for formats up to " + n + ", but game versions supporting formats 17 to " + n + " require a pack_format field. Add \"pack_format\": " + n2 + " or require a version greater or equal to " + (n + 1) + ".0.");
                }
            }
        }
        return DataResult.success((Object)new class04548((Comparable)this.min.get(), (Comparable)this.max.get()));
    }

    public Optional<class08735> y() {
        return this.min;
    }

    private DataResult<class04548<class08735>> N(int n, boolean bl, String string, String string2) {
        class04548<Integer> class045482 = this.supported.get();
        int n2 = (Integer)class045482.N();
        int n3 = (Integer)class045482.y();
        if (n3 > n) {
            return DataResult.error(() -> string + " declares support for version newer than " + n + ", but is missing mandatory fields min_format and max_format");
        }
        if (bl) {
            if (this.format.isPresent()) {
                String string3 = this.N(n2, n3);
                if (string3 != null) {
                    return DataResult.error(() -> string3);
                }
            } else {
                return DataResult.error(() -> string + " declares support for formats up to " + n + ", but game versions supporting formats 17 to " + n + " require a pack_format field. Add \"pack_format\": " + n2 + " or require a version greater or equal to " + (n + 1) + ".0.");
            }
        }
        return DataResult.success((Object)new class04548((Comparable)Integer.valueOf(n2), (Comparable)Integer.valueOf(n3)).N(class08735::N));
    }

    private @Nullable String N(int n, int n2) {
        int n3 = this.format.get();
        if (n3 < n || n3 > n2) {
            return "Pack declared support for versions " + n + " to " + n2 + " but declared main format is " + n3;
        }
        if (n3 < 15) {
            return "Multi-version packs cannot support minimum version of less than 15, since this will leave versions in range unable to load pack.";
        }
        return null;
    }

    public int N() {
        if (this.min.isPresent()) {
            if (this.supported.isPresent()) {
                return Math.min(this.min.get().y(), (Integer)this.supported.get().N());
            }
            return this.min.get().y();
        }
        if (this.supported.isPresent()) {
            return (Integer)this.supported.get().N();
        }
        return Integer.MAX_VALUE;
    }

    public DataResult<class04548<class08735>> N(int n, boolean bl, boolean bl2, String string, String string2) {
        if (this.min.isPresent() != this.max.isPresent()) {
            return DataResult.error(() -> string + " missing field, must declare both min_format and max_format");
        }
        if (bl2 && this.supported.isEmpty()) {
            return DataResult.error(() -> string + " missing required field " + string2 + ", must be present in all overlays for any overlays to work across game versions");
        }
        if (this.min.isPresent()) {
            return this.y(n, bl, bl2, string, string2);
        }
        if (this.supported.isPresent()) {
            return this.N(n, bl, string, string2);
        }
        if (bl && this.format.isPresent()) {
            int n2 = this.format.get();
            if (n2 > n) {
                return DataResult.error(() -> string + " declares support for version newer than " + n + ", but is missing mandatory fields min_format and max_format");
            }
            return DataResult.success((Object)new class04548((Comparable)class08735.N(n2)));
        }
        return DataResult.error(() -> string + " could not be parsed, missing format version information");
    }

    public static class08780 N(class04548<class08735> class045482, int n) {
        class04548 class045483 = class045482.N(class08735::y);
        return new class08780(Optional.of((class08735)class045482.N()), Optional.of((class08735)class045482.y()), class045483.N((Comparable)Integer.valueOf(n)) ? Optional.of((Integer)class045483.N()) : Optional.empty(), class045483.N((Comparable)Integer.valueOf(n)) ? Optional.of(new class04548((Comparable)((Integer)class045483.N()), (Comparable)((Integer)class045483.y()))) : Optional.empty());
    }
}

