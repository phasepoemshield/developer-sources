/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 */
package kroppeb.stareval.parser;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Iterator;
import java.util.Map;
import kroppeb.stareval.parser.OpResolver;
import kroppeb.stareval.parser.OpResolver$DualChar;
import kroppeb.stareval.parser.OpResolver$SingleChar;
import kroppeb.stareval.parser.OpResolver$SingleDualChar;

class OpResolver$Builder<T> {
    private final Map<String, T> map = new Object2ObjectOpenHashMap();

    public OpResolver<T> build() {
        if (this.map.size() > 2) {
            throw new RuntimeException("unimplemented: Cannot currently build an optimized operator resolver tree when more than two operators start with the same character");
        }
        T t = this.map.get("");
        if (t != null) {
            if (this.map.size() == 1) {
                return new OpResolver$SingleChar<T>(t);
            }
            for (Map.Entry<String, T> entry : this.map.entrySet()) {
                if ("".equals(entry.getKey())) continue;
                if (entry.getKey().length() != 1) {
                    throw new RuntimeException("unimplemented: Optimized operator resolver trees can currently only be built of operators that contain one or two characters.");
                }
                return new OpResolver$SingleDualChar<T>(t, entry.getValue(), entry.getKey().charAt(0));
            }
        } else {
            if (this.map.size() > 1) {
                throw new RuntimeException("unimplemented: Optimized operator resolver trees can currently only handle two operators starting with the same character if one operator is a single character");
            }
            Iterator<Map.Entry<String, T>> iterator = this.map.entrySet().iterator();
            if (iterator.hasNext()) {
                Map.Entry<String, T> entry = iterator.next();
                if (entry.getKey().length() != 1) {
                    throw new RuntimeException("unimplemented: Optimized operator resolver trees can currently only be built of operators that contain one or two characters.");
                }
                return new OpResolver$DualChar<T>(entry.getValue(), entry.getKey().charAt(0));
            }
        }
        if (this.map.isEmpty()) {
            throw new RuntimeException("Tried to build an operator resolver tree that contains no operators.");
        }
        throw new RuntimeException("This shouldn't be reachable");
    }

    public void singleChar(T t) {
        this.multiChar("", t);
    }

    public void multiChar(String string, T t) {
        T t2 = this.map.put(string, t);
        if (t2 != null) {
            throw new RuntimeException("Tried to add multiple operators that map to the same string.");
        }
    }
}

