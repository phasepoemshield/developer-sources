/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12002
 *  java.lang.runtime.SwitchBootstraps
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.value.ArrayValue
 *  org.msgpack.value.Value
 */
package Nursultan;

import Nursultan.class11494;
import Nursultan.class11504;
import Nursultan.class11507;
import Nursultan.class11515;
import Nursultan.class11517;
import Nursultan.class11523;
import Nursultan.class11525;
import Nursultan.class11527;
import Nursultan.class11533;
import Nursultan.class11535;
import Nursultan.class11536;
import Nursultan.class12002;
import java.io.IOException;
import java.lang.runtime.SwitchBootstraps;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.value.ArrayValue;
import org.msgpack.value.Value;

public class class11530 {
    private static String[] L;

    private class11530() {
        throw new UnsupportedOperationException(L[0]);
    }

    static {
        class11530.N();
    }

    public static void N(MessageBufferPacker messageBufferPacker, class11536<?> class115362) throws IOException {
        class11536<?> class115363 = class115362;
        Objects.requireNonNull(class115363);
        class11536<?> class115364 = class115363;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class11507.class, class11504.class, class11533.class, class11527.class, class11515.class, class11525.class, class11517.class, class11523.class}, class115364, (int)n)) {
            case 0: {
                class11507 class115072 = (class11507)class115364;
                messageBufferPacker.packBoolean(((Boolean)class115072.W()).booleanValue());
                break;
            }
            case 1: {
                class11504 class115042 = (class11504)class115364;
                messageBufferPacker.packFloat(((Float)class115042.W()).floatValue());
                break;
            }
            case 2: {
                class11533 class115332 = (class11533)class115364;
                messageBufferPacker.packString((String)class115332.W());
                break;
            }
            case 3: {
                class11527 class115272 = (class11527)class115364;
                messageBufferPacker.packArrayHeader(2);
                messageBufferPacker.packInt(((class12002)class115272.W()).L());
                messageBufferPacker.packInt(class115272.L());
                break;
            }
            case 4: {
                class11515 class115152 = (class11515)class115364;
                messageBufferPacker.packInt(((Integer)class115152.W()).intValue());
                break;
            }
            case 5: {
                class11494 class114942 = (class11494)((class11525)class115364).W();
                messageBufferPacker.packArrayHeader(2);
                messageBufferPacker.packFloat(class114942.N());
                messageBufferPacker.packFloat(class114942.L());
                break;
            }
            case 6: {
                class11517 class115172 = (class11517)class115364;
                messageBufferPacker.packString(((class11535)class115172.W()).E().N());
                break;
            }
            case 7: {
                List list = (List)((class11523)class115364).W();
                messageBufferPacker.packArrayHeader(list.size());
                for (class11535 class115352 : list) {
                    messageBufferPacker.packString(class115352.E().N());
                }
                break;
            }
            default: {
                messageBufferPacker.packNil();
            }
        }
    }

    private static void N() {
        L = new String[1];
        class11530.L[0] = "This is a utility class and cannot be instantiated";
    }

    public static void N(class11536<?> class115362, Value value) {
        class11536<?> class115363 = class115362;
        Objects.requireNonNull(class115363);
        class11536<?> class115364 = class115363;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class11507.class, class11504.class, class11533.class, class11527.class, class11515.class, class11525.class, class11517.class, class11523.class}, class115364, (int)n)) {
            case 0: {
                ((class11507)class115364).N(value.asBooleanValue().getBoolean());
                break;
            }
            case 1: {
                ((class11504)class115364).N(Float.valueOf(value.asFloatValue().toFloat()));
                break;
            }
            case 2: {
                ((class11533)class115364).N(value.asStringValue().asString());
                break;
            }
            case 3: {
                class11527 class115272 = (class11527)class115364;
                if (value.isArrayValue()) {
                    ArrayValue arrayValue = value.asArrayValue();
                    class115272.N(class12002.y((int)arrayValue.get(0).asIntegerValue().asInt()), arrayValue.get(1).asIntegerValue().asInt());
                    break;
                }
                class115272.N(class12002.y((int)value.asIntegerValue().asInt()), 0);
                break;
            }
            case 4: {
                class11515 class115152 = (class11515)class115364;
                class115152.N(value.asIntegerValue().asInt());
                break;
            }
            case 5: {
                class11525 class115252 = (class11525)class115364;
                ArrayValue arrayValue = value.asArrayValue();
                float f = arrayValue.get(0).asFloatValue().toFloat();
                float f2 = arrayValue.get(1).asFloatValue().toFloat();
                class115252.N(new class11494(f, f2));
                break;
            }
            case 6: {
                class11517 class115172 = (class11517)class115364;
                String string = value.asStringValue().asString();
                class115172.L().stream().filter(class115352 -> class115352.E().N().equals(string)).findFirst().ifPresent(class115352 -> class115172.y((class11535)class115352));
                break;
            }
            case 7: {
                class11523 class115232 = (class11523)class115364;
                HashSet<String> hashSet = new HashSet<String>();
                for (Value value2 : value.asArrayValue()) {
                    hashSet.add(value2.asStringValue().asString());
                }
                class115232.L().forEach(class115352 -> class115232.N(class115352, hashSet.contains(class115352.E().N())));
                break;
            }
        }
    }
}

