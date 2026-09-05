/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson;

import java.util.Objects;
import javax.annotation.Nonnull;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonElement;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonGrammar;

public class JsonPrimitive
extends JsonElement {
    public static JsonPrimitive TRUE = new JsonPrimitive(Boolean.TRUE);
    public static JsonPrimitive FALSE = new JsonPrimitive(Boolean.FALSE);
    @Nonnull
    private Object value;

    public double asDouble(double d) {
        if (this.value instanceof Number) {
            return ((Number)this.value).doubleValue();
        }
        return d;
    }

    public JsonPrimitive(@Nonnull Object object) {
        this.value = object;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof JsonPrimitive) {
            return Objects.equals(this.value, ((JsonPrimitive)object).value);
        }
        return false;
    }

    @Nonnull
    public String toString() {
        return this.toJson();
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override
    public JsonPrimitive clone() {
        return this;
    }

    @Nonnull
    public Object getValue() {
        return this.value;
    }

    public static String escape(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        block9: for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            switch (c) {
                case '\b': {
                    stringBuilder.append("\\b");
                    continue block9;
                }
                case '\f': {
                    stringBuilder.append("\\f");
                    continue block9;
                }
                case '\n': {
                    stringBuilder.append("\\n");
                    continue block9;
                }
                case '\r': {
                    stringBuilder.append("\\r");
                    continue block9;
                }
                case '\t': {
                    stringBuilder.append("\\t");
                    continue block9;
                }
                case '\"': {
                    stringBuilder.append("\\\"");
                    continue block9;
                }
                case '\\': {
                    stringBuilder.append("\\\\");
                    continue block9;
                }
                default: {
                    stringBuilder.append(c);
                }
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String toJson(JsonGrammar jsonGrammar, int n) {
        if (this.value == null) {
            return "null";
        }
        if (this.value instanceof Double && jsonGrammar.bareSpecialNumerics) {
            double d = (Double)this.value;
            if (Double.isNaN(d)) {
                return "NaN";
            }
            if (Double.isInfinite(d)) {
                if (d < 0.0) {
                    return "-Infinity";
                }
                return "Infinity";
            }
            return this.value.toString();
        }
        if (this.value instanceof Number) {
            return this.value.toString();
        }
        if (this.value instanceof Boolean) {
            return this.value.toString();
        }
        return '\"' + JsonPrimitive.escape(this.value.toString()) + '\"';
    }

    @Override
    public String toJson(boolean bl, boolean bl2, int n) {
        return this.toJson(JsonGrammar.builder().withComments(bl).printWhitespace(bl2).build(), n);
    }

    public int asInt(int n) {
        if (this.value instanceof Number) {
            return ((Number)this.value).intValue();
        }
        return n;
    }

    @Nonnull
    public String asString() {
        if (this.value == null) {
            return "null";
        }
        return this.value.toString();
    }

    public boolean asBoolean(boolean bl) {
        if (this.value instanceof Boolean) {
            return (Boolean)this.value;
        }
        return bl;
    }

    public long asLong(long l) {
        if (this.value instanceof Number) {
            return ((Number)this.value).longValue();
        }
        return l;
    }

    public short asShort(short s) {
        if (this.value instanceof Number) {
            return ((Number)this.value).shortValue();
        }
        return s;
    }

    public float asFloat(float f) {
        if (this.value instanceof Number) {
            return ((Number)this.value).floatValue();
        }
        return f;
    }

    public byte asByte(byte by) {
        if (this.value instanceof Number) {
            return ((Number)this.value).byteValue();
        }
        return by;
    }

    public char asChar(char c) {
        if (this.value instanceof Number) {
            return (char)((Number)this.value).intValue();
        }
        if (this.value instanceof Character) {
            return ((Character)this.value).charValue();
        }
        if (this.value instanceof String) {
            if (((String)this.value).length() == 1) {
                return ((String)this.value).charAt(0);
            }
            return c;
        }
        return c;
    }
}

