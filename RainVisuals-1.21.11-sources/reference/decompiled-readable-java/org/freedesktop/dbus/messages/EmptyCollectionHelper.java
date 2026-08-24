/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.messages;

import java.util.Arrays;

final class EmptyCollectionHelper {
    private EmptyCollectionHelper() {
    }

    private static int determineSignatureOffsetStruct(byte[] _sigb, int _currentOffset) {
        return EmptyCollectionHelper.determineEndOfBracketStructure(_sigb, _currentOffset, '(', ')');
    }

    private static int determineEndOfBracketStructure(byte[] _sigb, int _currentOffset, char _openChar, char _closeChar) {
        String sigSubString = EmptyCollectionHelper.determineSubSignature(_sigb, _currentOffset);
        if (sigSubString.isEmpty()) {
            return _currentOffset;
        }
        int i = 0;
        int depth = 0;
        char[] cArray = sigSubString.toCharArray();
        int n = cArray.length;
        for (int j = 0; j < n; ++j) {
            char chr = cArray[j];
            if (chr == _openChar) {
                ++depth;
            } else if (chr == _closeChar) {
                --depth;
            }
            if (depth == 0) {
                return _currentOffset + i;
            }
            ++i;
        }
        throw new IllegalStateException("Unable to parse signature for empty collection");
    }

    private static String determineSubSignature(byte[] _sigb, int _currentOffset) {
        byte[] restSigbytes = Arrays.copyOfRange(_sigb, _currentOffset, _sigb.length);
        return new String(restSigbytes);
    }

    static int determineSignatureOffsetArray(byte[] _sigb, int _currentOffset) {
        String sigSubString = EmptyCollectionHelper.determineSubSignature(_sigb, _currentOffset);
        if (sigSubString.isEmpty()) {
            return _currentOffset;
        }
        ECollectionSubType newtype = EmptyCollectionHelper.determineCollectionSubType((char)_sigb[_currentOffset]);
        return switch (newtype.ordinal()) {
            case 2 -> EmptyCollectionHelper.determineSignatureOffsetArray(_sigb, _currentOffset + 1);
            case 1 -> EmptyCollectionHelper.determineSignatureOffsetDict(_sigb, _currentOffset);
            case 0 -> EmptyCollectionHelper.determineSignatureOffsetStruct(_sigb, _currentOffset);
            case 3 -> _currentOffset;
            default -> throw new IllegalStateException("Unable to parse signature for empty collection");
        };
    }

    private static ECollectionSubType determineCollectionSubType(char _sig) {
        return switch (_sig) {
            case '(' -> ECollectionSubType.STRUCT;
            case '{' -> ECollectionSubType.DICT;
            case 'a' -> ECollectionSubType.ARRAY;
            default -> ECollectionSubType.PRIMITIVE;
        };
    }

    static int determineSignatureOffsetDict(byte[] _sigb, int _currentOffset) {
        return EmptyCollectionHelper.determineEndOfBracketStructure(_sigb, _currentOffset, '{', '}');
    }

    static final class ECollectionSubType
    extends Enum<ECollectionSubType> {
        public static final /* enum */ ECollectionSubType ARRAY;
        public static final /* enum */ ECollectionSubType STRUCT;
        private static final /* synthetic */ ECollectionSubType[] $VALUES;
        public static final /* enum */ ECollectionSubType DICT;
        public static final /* enum */ ECollectionSubType PRIMITIVE;

        public static ECollectionSubType[] values() {
            return (ECollectionSubType[])$VALUES.clone();
        }

        static {
            STRUCT = new ECollectionSubType();
            DICT = new ECollectionSubType();
            ARRAY = new ECollectionSubType();
            PRIMITIVE = new ECollectionSubType();
            $VALUES = ECollectionSubType.$values();
        }

        private static /* synthetic */ ECollectionSubType[] $values() {
            ECollectionSubType[] eCollectionSubTypeArray = new ECollectionSubType[4];
            eCollectionSubTypeArray[0] = STRUCT;
            eCollectionSubTypeArray[1] = DICT;
            eCollectionSubTypeArray[2] = ARRAY;
            eCollectionSubTypeArray[3] = PRIMITIVE;
            return eCollectionSubTypeArray;
        }

        public static ECollectionSubType valueOf(String name) {
            return Enum.valueOf(ECollectionSubType.class, name);
        }
    }
}

