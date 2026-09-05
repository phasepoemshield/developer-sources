/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.api;

import eu.pb4.placeholders.api.ParserContext$Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

public final class ParserContext {
    private Map<ParserContext$Key<?>, Object> map;
    private boolean copyOnWrite;
    private boolean hasNodeContext;

    private ParserContext(Map<ParserContext$Key<?>, Object> map, boolean bl, boolean bl2) {
        this.map = map;
        this.copyOnWrite = bl;
        this.hasNodeContext = bl2;
    }

    public <T> T get(ParserContext$Key<T> parserContext$Key) {
        return (T)this.map.get(parserContext$Key);
    }

    public static ParserContext of() {
        return new ParserContext(new HashMap(), false, false);
    }

    public static <T> ParserContext of(ParserContext$Key<T> parserContext$Key, T t) {
        return ParserContext.of().with(parserContext$Key, t);
    }

    public boolean contains(ParserContext$Key<?> parserContext$Key) {
        return this.map.containsKey(parserContext$Key);
    }

    public <T> ParserContext with(ParserContext$Key<T> parserContext$Key, T t) {
        if (this.copyOnWrite) {
            this.map = new HashMap(this.map);
            this.copyOnWrite = false;
        }
        this.map.put(parserContext$Key, t);
        this.hasNodeContext |= parserContext$Key.nodeContext();
        return this;
    }

    public ParserContext copy() {
        this.copyOnWrite = true;
        return new ParserContext(this.map, true, this.hasNodeContext);
    }

    public <T> T getOrThrow(ParserContext$Key<T> parserContext$Key) {
        return (T)Objects.requireNonNull(this.map.get(parserContext$Key));
    }

    public ParserContext copyWithoutNodeContext() {
        if (this.hasNodeContext) {
            HashMap hashMap = new HashMap();
            for (ParserContext$Key<?> parserContext$Key : this.map.keySet()) {
                if (parserContext$Key.nodeContext()) continue;
                hashMap.put(parserContext$Key, this.map.get(parserContext$Key));
            }
            return new ParserContext(hashMap, false, false);
        }
        return this.copy();
    }

    public <T> T getOrElse(ParserContext$Key<T> parserContext$Key, Supplier<T> supplier) {
        Object object = this.map.get(parserContext$Key);
        if (object == null) {
            return supplier.get();
        }
        return (T)object;
    }

    public <T> T getOrElse(ParserContext$Key<T> parserContext$Key, T t) {
        return (T)this.map.getOrDefault(parserContext$Key, t);
    }
}

