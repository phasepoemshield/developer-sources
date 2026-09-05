/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public abstract class class01350
extends DataFix {
    protected DSL.TypeReference N;

    protected static Optional<Dynamic<?>> L(Dynamic<?> dynamic, String string, String string2) {
        String string3 = string + "Most";
        String string4 = string + "Least";
        return class01350.u(dynamic, string3, string4).map(dynamic2 -> dynamic.remove(string3).remove(string4).set(string2, dynamic2));
    }

    public class01350(Schema schema, DSL.TypeReference typeReference) {
        super(schema, false);
        this.N = typeReference;
    }

    protected static Optional<Dynamic<?>> u(Dynamic<?> dynamic, String string, String string2) {
        long l = dynamic.get(string).asLong(0L);
        long l2 = dynamic.get(string2).asLong(0L);
        if (l == 0L || l2 == 0L) {
            return Optional.empty();
        }
        return class01350.N(dynamic, l, l2);
    }

    protected static Optional<Dynamic<?>> y(Dynamic<?> dynamic, String string, String string2) {
        return dynamic.get(string).result().flatMap(class01350::N).map(dynamic2 -> dynamic.remove(string).set(string2, dynamic2));
    }

    protected static Optional<Dynamic<?>> N(Dynamic<?> dynamic, String string, String string2) {
        return class01350.N(dynamic, string).map(dynamic2 -> dynamic.remove(string).set(string2, dynamic2));
    }

    protected static Optional<Dynamic<?>> N(Dynamic<?> dynamic, String string) {
        return dynamic.get(string).result().flatMap(dynamic2 -> {
            String string = dynamic2.asString(null);
            if (string != null) {
                try {
                    UUID uUID = UUID.fromString(string);
                    return class01350.N(dynamic, uUID.getMostSignificantBits(), uUID.getLeastSignificantBits());
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    // empty catch block
                }
            }
            return Optional.empty();
        });
    }

    protected static Optional<Dynamic<?>> N(Dynamic<?> dynamic) {
        return class01350.u(dynamic, "M", "L");
    }

    protected Typed<?> N(Typed<?> typed2, String string, Function<Dynamic<?>, Dynamic<?>> function) {
        Type var4 = this.getInputSchema().getChoiceType(this.N, string);
        Type var5 = this.getOutputSchema().getChoiceType(this.N, string);
        return typed2.updateTyped(DSL.namedChoice((String)string, (Type)var4), var5, typed -> typed.update(DSL.remainderFinder(), function));
    }

    protected static Optional<Dynamic<?>> N(Dynamic<?> dynamic, long l, long l2) {
        return Optional.of(dynamic.createIntList(Arrays.stream(new int[]{(int)(l >> 32), (int)l, (int)(l2 >> 32), (int)l2})));
    }
}

