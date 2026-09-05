/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.chars.CharOpenHashSet
 *  it.unimi.dsi.fastutil.chars.CharSet
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.chars.CharOpenHashSet;
import it.unimi.dsi.fastutil.chars.CharSet;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import minecraft.class06646;
import minecraft.class06649;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class06684 {
    private final List<String[]> N = Lists.newArrayList();
    private final Map<Character, Predicate<@Nullable class06646>> y = Maps.newHashMap();
    private int L;
    private int u;
    private final CharSet i = new CharOpenHashSet();

    private Predicate<class06646>[][][] L() {
        if (!this.i.isEmpty()) {
            throw new IllegalStateException("Predicates for character(s) " + String.valueOf(this.i) + " are missing");
        }
        Predicate[][][] predicateArray = (Predicate[][][])Array.newInstance(Predicate.class, this.N.size(), this.L, this.u);
        for (int i = 0; i < this.N.size(); ++i) {
            for (int j = 0; j < this.L; ++j) {
                for (int k = 0; k < this.u; ++k) {
                    predicateArray[i][j][k] = this.y.get(Character.valueOf(this.N.get(i)[j].charAt(k)));
                }
            }
        }
        return predicateArray;
    }

    private class06684() {
        this.y.put(Character.valueOf(' '), class066462 -> true);
    }

    public class06649 y() {
        return new class06649(this.L());
    }

    public class06684 N(char c, Predicate<@Nullable class06646> predicate) {
        this.y.put(Character.valueOf(c), predicate);
        this.i.remove(c);
        return this;
    }

    public static class06684 N() {
        return new class06684();
    }

    public class06684 N(String ... stringArray) {
        if (ArrayUtils.isEmpty((Object[])stringArray) || StringUtils.isEmpty((CharSequence)stringArray[0])) {
            throw new IllegalArgumentException("Empty pattern for aisle");
        }
        if (this.N.isEmpty()) {
            this.L = stringArray.length;
            this.u = stringArray[0].length();
        }
        if (stringArray.length != this.L) {
            throw new IllegalArgumentException("Expected aisle with height of " + this.L + ", but was given one with a height of " + stringArray.length + ")");
        }
        for (String string : stringArray) {
            if (string.length() != this.u) {
                throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.u + ", found one with " + string.length() + ")");
            }
            for (char c : string.toCharArray()) {
                if (this.y.containsKey(Character.valueOf(c))) continue;
                this.i.add(c);
            }
        }
        this.N.add(stringArray);
        return this;
    }
}

