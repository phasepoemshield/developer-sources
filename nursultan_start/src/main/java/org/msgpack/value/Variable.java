/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.core.MessageFormat
 *  org.msgpack.core.MessageIntegerOverflowException
 *  org.msgpack.core.MessagePack
 *  org.msgpack.core.MessagePacker
 *  org.msgpack.core.MessageStringCodingException
 *  org.msgpack.core.MessageTypeCastException
 *  org.msgpack.value.ArrayValue
 *  org.msgpack.value.BinaryValue
 *  org.msgpack.value.BooleanValue
 *  org.msgpack.value.ExtensionValue
 *  org.msgpack.value.FloatValue
 *  org.msgpack.value.ImmutableArrayValue
 *  org.msgpack.value.ImmutableBinaryValue
 *  org.msgpack.value.ImmutableBooleanValue
 *  org.msgpack.value.ImmutableExtensionValue
 *  org.msgpack.value.ImmutableFloatValue
 *  org.msgpack.value.ImmutableIntegerValue
 *  org.msgpack.value.ImmutableMapValue
 *  org.msgpack.value.ImmutableNilValue
 *  org.msgpack.value.ImmutableStringValue
 *  org.msgpack.value.ImmutableTimestampValue
 *  org.msgpack.value.ImmutableValue
 *  org.msgpack.value.IntegerValue
 *  org.msgpack.value.MapValue
 *  org.msgpack.value.NilValue
 */
package org.msgpack.value;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.MessageTypeCastException;
import org.msgpack.value.ArrayValue;
import org.msgpack.value.BinaryValue;
import org.msgpack.value.BooleanValue;
import org.msgpack.value.ExtensionValue;
import org.msgpack.value.FloatValue;
import org.msgpack.value.ImmutableArrayValue;
import org.msgpack.value.ImmutableBinaryValue;
import org.msgpack.value.ImmutableBooleanValue;
import org.msgpack.value.ImmutableExtensionValue;
import org.msgpack.value.ImmutableFloatValue;
import org.msgpack.value.ImmutableIntegerValue;
import org.msgpack.value.ImmutableMapValue;
import org.msgpack.value.ImmutableNilValue;
import org.msgpack.value.ImmutableStringValue;
import org.msgpack.value.ImmutableTimestampValue;
import org.msgpack.value.ImmutableValue;
import org.msgpack.value.IntegerValue;
import org.msgpack.value.MapValue;
import org.msgpack.value.NilValue;
import org.msgpack.value.NumberValue;
import org.msgpack.value.RawValue;
import org.msgpack.value.StringValue;
import org.msgpack.value.TimestampValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueFactory;
import org.msgpack.value.ValueType;
import org.msgpack.value.impl.ImmutableBigIntegerValueImpl;

public class Variable
implements Value {
    private final NilValueAccessor nilAccessor = new NilValueAccessor();
    private final BooleanValueAccessor booleanAccessor = new BooleanValueAccessor();
    private final IntegerValueAccessor integerAccessor = new IntegerValueAccessor();
    private final FloatValueAccessor floatAccessor = new FloatValueAccessor();
    private final BinaryValueAccessor binaryAccessor = new BinaryValueAccessor();
    private final StringValueAccessor stringAccessor = new StringValueAccessor();
    private final ArrayValueAccessor arrayAccessor = new ArrayValueAccessor();
    private final MapValueAccessor mapAccessor = new MapValueAccessor();
    private final ExtensionValueAccessor extensionAccessor = new ExtensionValueAccessor();
    private final TimestampValueAccessor timestampAccessor = new TimestampValueAccessor();
    private Type type;
    private long longValue;
    private double doubleValue;
    private Object objectValue;
    private AbstractValueAccessor accessor;
    private static final BigInteger LONG_MIN = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);
    private static final long BYTE_MIN = -128L;
    private static final long BYTE_MAX = 127L;
    private static final long SHORT_MIN = -32768L;
    private static final long SHORT_MAX = 32767L;
    private static final long INT_MIN = Integer.MIN_VALUE;
    private static final long INT_MAX = Integer.MAX_VALUE;

    public Variable() {
        this.setNilValue();
    }

    public Variable setNilValue() {
        this.type = Type.NULL;
        this.accessor = this.nilAccessor;
        return this;
    }

    public Variable setBooleanValue(boolean bl) {
        this.type = Type.BOOLEAN;
        this.accessor = this.booleanAccessor;
        this.longValue = bl ? 1L : 0L;
        return this;
    }

    public Variable setIntegerValue(long l) {
        this.type = Type.LONG;
        this.accessor = this.integerAccessor;
        this.longValue = l;
        return this;
    }

    public Variable setIntegerValue(BigInteger bigInteger) {
        if (0 <= bigInteger.compareTo(LONG_MIN) && bigInteger.compareTo(LONG_MAX) <= 0) {
            this.type = Type.LONG;
            this.accessor = this.integerAccessor;
            this.longValue = bigInteger.longValue();
        } else {
            this.type = Type.BIG_INTEGER;
            this.accessor = this.integerAccessor;
            this.objectValue = bigInteger;
        }
        return this;
    }

    public Variable setFloatValue(double d) {
        this.type = Type.DOUBLE;
        this.accessor = this.floatAccessor;
        this.doubleValue = d;
        this.longValue = (long)d;
        return this;
    }

    public Variable setFloatValue(float f) {
        this.type = Type.DOUBLE;
        this.accessor = this.floatAccessor;
        this.longValue = (long)f;
        return this;
    }

    public Variable setBinaryValue(byte[] byArray) {
        this.type = Type.BYTE_ARRAY;
        this.accessor = this.binaryAccessor;
        this.objectValue = byArray;
        return this;
    }

    public Variable setStringValue(String string) {
        return this.setStringValue(string.getBytes(MessagePack.UTF8));
    }

    public Variable setStringValue(byte[] byArray) {
        this.type = Type.RAW_STRING;
        this.accessor = this.stringAccessor;
        this.objectValue = byArray;
        return this;
    }

    public Variable setArrayValue(List<Value> list) {
        this.type = Type.LIST;
        this.accessor = this.arrayAccessor;
        this.objectValue = list.toArray(new Value[list.size()]);
        return this;
    }

    public Variable setArrayValue(Value[] valueArray) {
        this.type = Type.LIST;
        this.accessor = this.arrayAccessor;
        this.objectValue = valueArray;
        return this;
    }

    public Variable setMapValue(Map<Value, Value> map) {
        this.type = Type.MAP;
        this.accessor = this.mapAccessor;
        Value[] valueArray = new Value[map.size() * 2];
        Iterator<Map.Entry<Value, Value>> iterator = map.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            Map.Entry<Value, Value> entry = iterator.next();
            valueArray[n] = entry.getKey();
            valueArray[++n] = entry.getValue();
            ++n;
        }
        this.objectValue = valueArray;
        return this;
    }

    public Variable setMapValue(Value[] valueArray) {
        this.type = Type.MAP;
        this.accessor = this.mapAccessor;
        this.objectValue = valueArray;
        return this;
    }

    public Variable setExtensionValue(byte by, byte[] byArray) {
        this.type = Type.EXTENSION;
        this.accessor = this.extensionAccessor;
        this.objectValue = ValueFactory.newExtension(by, byArray);
        return this;
    }

    public Variable setTimestampValue(Instant instant) {
        this.type = Type.TIMESTAMP;
        this.accessor = this.timestampAccessor;
        this.objectValue = ValueFactory.newTimestamp(instant);
        return this;
    }

    @Override
    public ImmutableValue immutableValue() {
        return this.accessor.immutableValue();
    }

    @Override
    public void writeTo(MessagePacker messagePacker) throws IOException {
        this.accessor.writeTo(messagePacker);
    }

    public int hashCode() {
        return this.immutableValue().hashCode();
    }

    @Override
    public boolean equals(Object object) {
        return this.immutableValue().equals(object);
    }

    @Override
    public String toJson() {
        return this.immutableValue().toJson();
    }

    public String toString() {
        return this.immutableValue().toString();
    }

    @Override
    public ValueType getValueType() {
        return this.type.getValueType();
    }

    @Override
    public boolean isNilValue() {
        return this.getValueType().isNilType();
    }

    @Override
    public boolean isBooleanValue() {
        return this.getValueType().isBooleanType();
    }

    @Override
    public boolean isNumberValue() {
        return this.getValueType().isNumberType();
    }

    @Override
    public boolean isIntegerValue() {
        return this.getValueType().isIntegerType();
    }

    @Override
    public boolean isFloatValue() {
        return this.getValueType().isFloatType();
    }

    @Override
    public boolean isRawValue() {
        return this.getValueType().isRawType();
    }

    @Override
    public boolean isBinaryValue() {
        return this.getValueType().isBinaryType();
    }

    @Override
    public boolean isStringValue() {
        return this.getValueType().isStringType();
    }

    @Override
    public boolean isArrayValue() {
        return this.getValueType().isArrayType();
    }

    @Override
    public boolean isMapValue() {
        return this.getValueType().isMapType();
    }

    @Override
    public boolean isExtensionValue() {
        return this.getValueType().isExtensionType();
    }

    @Override
    public boolean isTimestampValue() {
        return this.type == Type.TIMESTAMP;
    }

    @Override
    public NilValue asNilValue() {
        if (!this.isNilValue()) {
            throw new MessageTypeCastException();
        }
        return (NilValue)this.accessor;
    }

    @Override
    public BooleanValue asBooleanValue() {
        if (!this.isBooleanValue()) {
            throw new MessageTypeCastException();
        }
        return (BooleanValue)this.accessor;
    }

    @Override
    public NumberValue asNumberValue() {
        if (!this.isNumberValue()) {
            throw new MessageTypeCastException();
        }
        return (NumberValue)((Object)this.accessor);
    }

    @Override
    public IntegerValue asIntegerValue() {
        if (!this.isIntegerValue()) {
            throw new MessageTypeCastException();
        }
        return (IntegerValue)this.accessor;
    }

    @Override
    public FloatValue asFloatValue() {
        if (!this.isFloatValue()) {
            throw new MessageTypeCastException();
        }
        return (FloatValue)this.accessor;
    }

    @Override
    public RawValue asRawValue() {
        if (!this.isRawValue()) {
            throw new MessageTypeCastException();
        }
        return (RawValue)((Object)this.accessor);
    }

    @Override
    public BinaryValue asBinaryValue() {
        if (!this.isBinaryValue()) {
            throw new MessageTypeCastException();
        }
        return (BinaryValue)this.accessor;
    }

    @Override
    public StringValue asStringValue() {
        if (!this.isStringValue()) {
            throw new MessageTypeCastException();
        }
        return (StringValue)((Object)this.accessor);
    }

    @Override
    public ArrayValue asArrayValue() {
        if (!this.isArrayValue()) {
            throw new MessageTypeCastException();
        }
        return (ArrayValue)this.accessor;
    }

    @Override
    public MapValue asMapValue() {
        if (!this.isMapValue()) {
            throw new MessageTypeCastException();
        }
        return (MapValue)this.accessor;
    }

    @Override
    public ExtensionValue asExtensionValue() {
        if (!this.isExtensionValue()) {
            throw new MessageTypeCastException();
        }
        return (ExtensionValue)this.accessor;
    }

    @Override
    public TimestampValue asTimestampValue() {
        if (!this.isTimestampValue()) {
            throw new MessageTypeCastException();
        }
        return (TimestampValue)((Object)this.accessor);
    }

    private class TimestampValueAccessor
    extends AbstractValueAccessor
    implements TimestampValue {
        private TimestampValueAccessor() {
        }

        @Override
        public boolean isTimestampValue() {
            return true;
        }

        @Override
        public ValueType getValueType() {
            return ValueType.EXTENSION;
        }

        @Override
        public TimestampValue asTimestampValue() {
            return this;
        }

        public ImmutableTimestampValue immutableValue() {
            return (ImmutableTimestampValue)Variable.this.objectValue;
        }

        public byte getType() {
            return ((ImmutableTimestampValue)Variable.this.objectValue).getType();
        }

        public byte[] getData() {
            return ((ImmutableTimestampValue)Variable.this.objectValue).getData();
        }

        @Override
        public void writeTo(MessagePacker messagePacker) throws IOException {
            ((ImmutableTimestampValue)Variable.this.objectValue).writeTo(messagePacker);
        }

        @Override
        public long getEpochSecond() {
            return ((ImmutableTimestampValue)Variable.this.objectValue).getEpochSecond();
        }

        @Override
        public int getNano() {
            return ((ImmutableTimestampValue)Variable.this.objectValue).getNano();
        }

        @Override
        public long toEpochMillis() {
            return ((ImmutableTimestampValue)Variable.this.objectValue).toEpochMillis();
        }

        @Override
        public Instant toInstant() {
            return ((ImmutableTimestampValue)Variable.this.objectValue).toInstant();
        }
    }

    private class ExtensionValueAccessor
    extends AbstractValueAccessor
    implements ExtensionValue {
        private ExtensionValueAccessor() {
        }

        @Override
        public ValueType getValueType() {
            return ValueType.EXTENSION;
        }

        @Override
        public ExtensionValue asExtensionValue() {
            return this;
        }

        public ImmutableExtensionValue immutableValue() {
            return (ImmutableExtensionValue)Variable.this.objectValue;
        }

        public byte getType() {
            return ((ImmutableExtensionValue)Variable.this.objectValue).getType();
        }

        public byte[] getData() {
            return ((ImmutableExtensionValue)Variable.this.objectValue).getData();
        }

        @Override
        public void writeTo(MessagePacker messagePacker) throws IOException {
            ((ImmutableExtensionValue)Variable.this.objectValue).writeTo(messagePacker);
        }
    }

    private class MapValueAccessor
    extends AbstractValueAccessor
    implements MapValue {
        private MapValueAccessor() {
        }

        @Override
        public ValueType getValueType() {
            return ValueType.MAP;
        }

        @Override
        public MapValue asMapValue() {
            return this;
        }

        public ImmutableMapValue immutableValue() {
            return ValueFactory.newMap(this.getKeyValueArray());
        }

        public int size() {
            return this.getKeyValueArray().length / 2;
        }

        public Set<Value> keySet() {
            return this.immutableValue().keySet();
        }

        public Set<Map.Entry<Value, Value>> entrySet() {
            return this.immutableValue().entrySet();
        }

        public Collection<Value> values() {
            return this.immutableValue().values();
        }

        public Value[] getKeyValueArray() {
            return (Value[])Variable.this.objectValue;
        }

        public Map<Value, Value> map() {
            return this.immutableValue().map();
        }

        @Override
        public void writeTo(MessagePacker messagePacker) throws IOException {
            this.immutableValue().writeTo(messagePacker);
        }
    }

    private class ArrayValueAccessor
    extends AbstractValueAccessor
    implements ArrayValue {
        private ArrayValueAccessor() {
        }

        @Override
        public ValueType getValueType() {
            return ValueType.ARRAY;
        }

        @Override
        public ArrayValue asArrayValue() {
            return this;
        }

        public ImmutableArrayValue immutableValue() {
            return ValueFactory.newArray(this.array());
        }

        public int size() {
            return this.array().length;
        }

        public Value get(int n) {
            return this.array()[n];
        }

        public Value getOrNilValue(int n) {
            Value[] valueArray = this.array();
            if (valueArray.length < n && n >= 0) {
                return ValueFactory.newNil();
            }
            return valueArray[n];
        }

        public Iterator<Value> iterator() {
            return this.list().iterator();
        }

        public List<Value> list() {
            return Arrays.asList(this.array());
        }

        public Value[] array() {
            return (Value[])Variable.this.objectValue;
        }

        @Override
        public void writeTo(MessagePacker messagePacker) throws IOException {
            this.immutableValue().writeTo(messagePacker);
        }
    }

    private class StringValueAccessor
    extends AbstractRawValueAccessor
    implements StringValue {
        private StringValueAccessor() {
        }

        @Override
        public ValueType getValueType() {
            return ValueType.STRING;
        }

        @Override
        public StringValue asStringValue() {
            return this;
        }

        public ImmutableStringValue immutableValue() {
            return ValueFactory.newString((byte[])Variable.this.objectValue);
        }

        @Override
        public void writeTo(MessagePacker messagePacker) throws IOException {
            byte[] byArray = (byte[])Variable.this.objectValue;
            messagePacker.packRawStringHeader(byArray.length);
            messagePacker.writePayload(byArray);
        }
    }

    private class BinaryValueAccessor
    extends AbstractRawValueAccessor
    implements BinaryValue {
        private BinaryValueAccessor() {
        }

        @Override
        public ValueType getValueType() {
            return ValueType.BINARY;
        }

        @Override
        public BinaryValue asBinaryValue() {
            return this;
        }

        public ImmutableBinaryValue immutableValue() {
            return ValueFactory.newBinary(this.asByteArray());
        }

        @Override
        public void writeTo(MessagePacker messagePacker) throws IOException {
            byte[] byArray = (byte[])Variable.this.objectValue;
            messagePacker.packBinaryHeader(byArray.length);
            messagePacker.writePayload(byArray);
        }
    }

    private abstract class AbstractRawValueAccessor
    extends AbstractValueAccessor
    implements RawValue {
        private AbstractRawValueAccessor() {
        }

        @Override
        public RawValue asRawValue() {
            return this;
        }

        @Override
        public byte[] asByteArray() {
            return (byte[])Variable.this.objectValue;
        }

        @Override
        public ByteBuffer asByteBuffer() {
            return ByteBuffer.wrap(this.asByteArray());
        }

        @Override
        public String asString() {
            byte[] byArray = (byte[])Variable.this.objectValue;
            try {
                CharsetDecoder charsetDecoder = MessagePack.UTF8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
                return charsetDecoder.decode(ByteBuffer.wrap(byArray)).toString();
            }
            catch (CharacterCodingException characterCodingException) {
                throw new MessageStringCodingException(characterCodingException);
            }
        }

        @Override
        public String toString() {
            byte[] byArray = (byte[])Variable.this.objectValue;
            try {
                CharsetDecoder charsetDecoder = MessagePack.UTF8.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
                return charsetDecoder.decode(ByteBuffer.wrap(byArray)).toString();
            }
            catch (CharacterCodingException characterCodingException) {
                throw new MessageStringCodingException(characterCodingException);
            }
        }
    }

    private class FloatValueAccessor
    extends AbstractNumberValueAccessor
    implements FloatValue {
        private FloatValueAccessor() {
        }

        @Override
        public FloatValue asFloatValue() {
            return this;
        }

        public ImmutableFloatValue immutableValue() {
            return ValueFactory.newFloat(Variable.this.doubleValue);
        }

        @Override
        public ValueType getValueType() {
            return ValueType.FLOAT;
        }

        @Override
        public void writeTo(MessagePacker messagePacker) throws IOException {
            messagePacker.packDouble(Variable.this.doubleValue);
        }
    }

    private class IntegerValueAccessor
    extends AbstractNumberValueAccessor
    implements IntegerValue {
        private IntegerValueAccessor() {
        }

        @Override
        public ValueType getValueType() {
            return ValueType.INTEGER;
        }

        @Override
        public IntegerValue asIntegerValue() {
            return this;
        }

        public ImmutableIntegerValue immutableValue() {
            if (Variable.this.type == Type.BIG_INTEGER) {
                return ValueFactory.newInteger((BigInteger)Variable.this.objectValue);
            }
            return ValueFactory.newInteger(Variable.this.longValue);
        }

        public boolean isInByteRange() {
            if (Variable.this.type == Type.BIG_INTEGER) {
                return false;
            }
            return -128L <= Variable.this.longValue && Variable.this.longValue <= 127L;
        }

        public boolean isInShortRange() {
            if (Variable.this.type == Type.BIG_INTEGER) {
                return false;
            }
            return -32768L <= Variable.this.longValue && Variable.this.longValue <= 32767L;
        }

        public boolean isInIntRange() {
            if (Variable.this.type == Type.BIG_INTEGER) {
                return false;
            }
            return Integer.MIN_VALUE <= Variable.this.longValue && Variable.this.longValue <= Integer.MAX_VALUE;
        }

        public boolean isInLongRange() {
            return Variable.this.type != Type.BIG_INTEGER;
        }

        public MessageFormat mostSuccinctMessageFormat() {
            return ImmutableBigIntegerValueImpl.mostSuccinctMessageFormat(this);
        }

        public byte asByte() {
            if (!this.isInByteRange()) {
                throw new MessageIntegerOverflowException(Variable.this.longValue);
            }
            return (byte)Variable.this.longValue;
        }

        public short asShort() {
            if (!this.isInByteRange()) {
                throw new MessageIntegerOverflowException(Variable.this.longValue);
            }
            return (short)Variable.this.longValue;
        }

        public int asInt() {
            if (!this.isInIntRange()) {
                throw new MessageIntegerOverflowException(Variable.this.longValue);
            }
            return (int)Variable.this.longValue;
        }

        public long asLong() {
            if (!this.isInLongRange()) {
                throw new MessageIntegerOverflowException(Variable.this.longValue);
            }
            return Variable.this.longValue;
        }

        public BigInteger asBigInteger() {
            if (Variable.this.type == Type.BIG_INTEGER) {
                return (BigInteger)Variable.this.objectValue;
            }
            return BigInteger.valueOf(Variable.this.longValue);
        }

        @Override
        public void writeTo(MessagePacker messagePacker) throws IOException {
            if (Variable.this.type == Type.BIG_INTEGER) {
                messagePacker.packBigInteger((BigInteger)Variable.this.objectValue);
            } else {
                messagePacker.packLong(Variable.this.longValue);
            }
        }
    }

    private abstract class AbstractNumberValueAccessor
    extends AbstractValueAccessor
    implements NumberValue {
        private AbstractNumberValueAccessor() {
        }

        @Override
        public NumberValue asNumberValue() {
            return this;
        }

        @Override
        public byte toByte() {
            if (Variable.this.type == Type.BIG_INTEGER) {
                return ((BigInteger)Variable.this.objectValue).byteValue();
            }
            return (byte)Variable.this.longValue;
        }

        @Override
        public short toShort() {
            if (Variable.this.type == Type.BIG_INTEGER) {
                return ((BigInteger)Variable.this.objectValue).shortValue();
            }
            return (short)Variable.this.longValue;
        }

        @Override
        public int toInt() {
            if (Variable.this.type == Type.BIG_INTEGER) {
                return ((BigInteger)Variable.this.objectValue).intValue();
            }
            return (int)Variable.this.longValue;
        }

        @Override
        public long toLong() {
            if (Variable.this.type == Type.BIG_INTEGER) {
                return ((BigInteger)Variable.this.objectValue).longValue();
            }
            return Variable.this.longValue;
        }

        @Override
        public BigInteger toBigInteger() {
            if (Variable.this.type == Type.BIG_INTEGER) {
                return (BigInteger)Variable.this.objectValue;
            }
            if (Variable.this.type == Type.DOUBLE) {
                return new BigDecimal(Variable.this.doubleValue).toBigInteger();
            }
            return BigInteger.valueOf(Variable.this.longValue);
        }

        @Override
        public float toFloat() {
            if (Variable.this.type == Type.BIG_INTEGER) {
                return ((BigInteger)Variable.this.objectValue).floatValue();
            }
            if (Variable.this.type == Type.DOUBLE) {
                return (float)Variable.this.doubleValue;
            }
            return Variable.this.longValue;
        }

        @Override
        public double toDouble() {
            if (Variable.this.type == Type.BIG_INTEGER) {
                return ((BigInteger)Variable.this.objectValue).doubleValue();
            }
            if (Variable.this.type == Type.DOUBLE) {
                return Variable.this.doubleValue;
            }
            return Variable.this.longValue;
        }
    }

    private class BooleanValueAccessor
    extends AbstractValueAccessor
    implements BooleanValue {
        private BooleanValueAccessor() {
        }

        @Override
        public ValueType getValueType() {
            return ValueType.BOOLEAN;
        }

        @Override
        public BooleanValue asBooleanValue() {
            return this;
        }

        public ImmutableBooleanValue immutableValue() {
            return ValueFactory.newBoolean(this.getBoolean());
        }

        public boolean getBoolean() {
            return Variable.this.longValue == 1L;
        }

        @Override
        public void writeTo(MessagePacker messagePacker) throws IOException {
            messagePacker.packBoolean(Variable.this.longValue == 1L);
        }
    }

    private class NilValueAccessor
    extends AbstractValueAccessor
    implements NilValue {
        private NilValueAccessor() {
        }

        @Override
        public ValueType getValueType() {
            return ValueType.NIL;
        }

        @Override
        public NilValue asNilValue() {
            return this;
        }

        public ImmutableNilValue immutableValue() {
            return ValueFactory.newNil();
        }

        @Override
        public void writeTo(MessagePacker messagePacker) throws IOException {
            messagePacker.packNil();
        }
    }

    public static enum Type {
        NULL(ValueType.NIL),
        BOOLEAN(ValueType.BOOLEAN),
        LONG(ValueType.INTEGER),
        BIG_INTEGER(ValueType.INTEGER),
        DOUBLE(ValueType.FLOAT),
        BYTE_ARRAY(ValueType.BINARY),
        RAW_STRING(ValueType.STRING),
        LIST(ValueType.ARRAY),
        MAP(ValueType.MAP),
        EXTENSION(ValueType.EXTENSION),
        TIMESTAMP(ValueType.EXTENSION);

        private final ValueType valueType;

        private Type(ValueType valueType) {
            this.valueType = valueType;
        }

        public ValueType getValueType() {
            return this.valueType;
        }
    }

    private abstract class AbstractValueAccessor
    implements Value {
        private AbstractValueAccessor() {
        }

        @Override
        public boolean isNilValue() {
            return this.getValueType().isNilType();
        }

        @Override
        public boolean isBooleanValue() {
            return this.getValueType().isBooleanType();
        }

        @Override
        public boolean isNumberValue() {
            return this.getValueType().isNumberType();
        }

        @Override
        public boolean isIntegerValue() {
            return this.getValueType().isIntegerType();
        }

        @Override
        public boolean isFloatValue() {
            return this.getValueType().isFloatType();
        }

        @Override
        public boolean isRawValue() {
            return this.getValueType().isRawType();
        }

        @Override
        public boolean isBinaryValue() {
            return this.getValueType().isBinaryType();
        }

        @Override
        public boolean isStringValue() {
            return this.getValueType().isStringType();
        }

        @Override
        public boolean isArrayValue() {
            return this.getValueType().isArrayType();
        }

        @Override
        public boolean isMapValue() {
            return this.getValueType().isMapType();
        }

        @Override
        public boolean isExtensionValue() {
            return this.getValueType().isExtensionType();
        }

        @Override
        public boolean isTimestampValue() {
            return false;
        }

        @Override
        public NilValue asNilValue() {
            throw new MessageTypeCastException();
        }

        @Override
        public BooleanValue asBooleanValue() {
            throw new MessageTypeCastException();
        }

        @Override
        public NumberValue asNumberValue() {
            throw new MessageTypeCastException();
        }

        @Override
        public IntegerValue asIntegerValue() {
            throw new MessageTypeCastException();
        }

        @Override
        public FloatValue asFloatValue() {
            throw new MessageTypeCastException();
        }

        @Override
        public RawValue asRawValue() {
            throw new MessageTypeCastException();
        }

        @Override
        public BinaryValue asBinaryValue() {
            throw new MessageTypeCastException();
        }

        @Override
        public StringValue asStringValue() {
            throw new MessageTypeCastException();
        }

        @Override
        public ArrayValue asArrayValue() {
            throw new MessageTypeCastException();
        }

        @Override
        public MapValue asMapValue() {
            throw new MessageTypeCastException();
        }

        @Override
        public ExtensionValue asExtensionValue() {
            throw new MessageTypeCastException();
        }

        @Override
        public TimestampValue asTimestampValue() {
            throw new MessageTypeCastException();
        }

        @Override
        public boolean equals(Object object) {
            return Variable.this.equals(object);
        }

        public int hashCode() {
            return Variable.this.hashCode();
        }

        @Override
        public String toJson() {
            return Variable.this.toJson();
        }

        public String toString() {
            return Variable.this.toString();
        }
    }
}

