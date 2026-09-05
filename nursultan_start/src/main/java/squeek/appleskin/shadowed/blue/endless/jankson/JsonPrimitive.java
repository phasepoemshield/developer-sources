/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 */
package squeek.appleskin.shadowed.blue.endless.jankson;

import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import javax.annotation.Nonnull;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonElement;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonGrammar;
import squeek.appleskin.shadowed.blue.endless.jankson.api.Escaper;

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

    private JsonPrimitive() {
    }

    public JsonPrimitive(@Nonnull Object object) {
        if (object instanceof Character) {
            this.value = "" + (Character)object;
        } else if (object instanceof Long) {
            this.value = object;
        } else if (object instanceof Double) {
            this.value = object;
        } else if (object instanceof BigInteger) {
            this.value = ((BigInteger)object).toString(16);
        } else if (object instanceof Float) {
            this.value = (double)((Float)object).floatValue();
        } else if (object instanceof Number) {
            this.value = ((Number)object).longValue();
        } else if (object instanceof CharSequence) {
            this.value = object.toString();
        } else if (object instanceof Boolean) {
            this.value = object;
        } else {
            throw new IllegalArgumentException("Object of type '" + object.getClass().getCanonicalName() + "' not allowed as a JsonPrimitive");
        }
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
        JsonPrimitive jsonPrimitive = new JsonPrimitive();
        jsonPrimitive.value = this.value;
        return jsonPrimitive;
    }

    @Nonnull
    public Object getValue() {
        return this.value;
    }

    public static JsonPrimitive of(@Nonnull BigInteger bigInteger) {
        JsonPrimitive jsonPrimitive = new JsonPrimitive();
        jsonPrimitive.value = bigInteger.toString(16);
        return jsonPrimitive;
    }

    public static JsonPrimitive of(@Nonnull BigDecimal bigDecimal) {
        JsonPrimitive jsonPrimitive = new JsonPrimitive();
        jsonPrimitive.value = bigDecimal.toString();
        return jsonPrimitive;
    }

    public static JsonPrimitive of(@Nonnull Double d) {
        JsonPrimitive jsonPrimitive = new JsonPrimitive();
        jsonPrimitive.value = d;
        return jsonPrimitive;
    }

    public static JsonPrimitive of(@Nonnull String string) {
        JsonPrimitive jsonPrimitive = new JsonPrimitive();
        jsonPrimitive.value = string;
        return jsonPrimitive;
    }

    public static JsonPrimitive of(@Nonnull Boolean bl) {
        JsonPrimitive jsonPrimitive = new JsonPrimitive();
        jsonPrimitive.value = bl;
        return jsonPrimitive;
    }

    public static JsonPrimitive of(@Nonnull Long l) {
        JsonPrimitive jsonPrimitive = new JsonPrimitive();
        jsonPrimitive.value = l;
        return jsonPrimitive;
    }

    @Override
    public void toJson(Writer writer, JsonGrammar jsonGrammar, int n) throws IOException {
        if (this.value == null) {
            writer.write("null");
            return;
        }
        if (this.value instanceof Double && jsonGrammar.bareSpecialNumerics) {
            double d = (Double)this.value;
            if (Double.isNaN(d)) {
                writer.write("NaN");
                return;
            }
            if (Double.isInfinite(d)) {
                if (d < 0.0) {
                    writer.write("-Infinity");
                    return;
                }
                writer.write("Infinity");
                return;
            }
            writer.write(this.value.toString());
            return;
        }
        if (this.value instanceof Number) {
            writer.write(this.value.toString());
            return;
        }
        if (this.value instanceof Boolean) {
            writer.write(this.value.toString());
            return;
        }
        writer.write(34);
        writer.write(Escaper.escapeString(this.value.toString()));
        writer.write(34);
    }

    @Override
    public String toJson(boolean bl, boolean bl2, int n) {
        return this.toJson(JsonGrammar.builder().withComments(bl).printWhitespace(bl2).build(), n);
    }

    public BigInteger asBigInteger(BigInteger bigInteger) {
        if (this.value instanceof Number) {
            return BigInteger.valueOf(((Number)this.value).longValue());
        }
        if (this.value instanceof String) {
            return new BigInteger((String)this.value, 16);
        }
        return bigInteger;
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

    public BigDecimal asBigDecimal(BigDecimal bigDecimal) {
        if (this.value instanceof Number) {
            return BigDecimal.valueOf(((Number)this.value).doubleValue());
        }
        if (this.value instanceof String) {
            return new BigDecimal((String)this.value);
        }
        return bigDecimal;
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

