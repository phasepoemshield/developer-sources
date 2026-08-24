/*
 * Decompiled with CFR 0.152.
 */
package jnr.a64asm;

class RelocData {
    final int offset;
    final long destination;
    final int size;
    final Type type;

    public RelocData(Type type, int size, int offset, long destination) {
        this.type = type;
        this.size = size;
        this.offset = offset;
        this.destination = destination;
    }

    static final class Type
    extends Enum<Type> {
        public static final /* enum */ Type RELATIVE_TO_ABSOLUTE;
        public static final /* enum */ Type ABSOLUTE_TO_RELATIVE_TRAMPOLINE;
        public static final /* enum */ Type ABSOLUTE_TO_ABSOLUTE;
        private static final /* synthetic */ Type[] $VALUES;
        public static final /* enum */ Type ABSOLUTE_TO_RELATIVE;

        public static Type valueOf(String name) {
            return Enum.valueOf(Type.class, name);
        }

        static {
            ABSOLUTE_TO_ABSOLUTE = new Type();
            RELATIVE_TO_ABSOLUTE = new Type();
            ABSOLUTE_TO_RELATIVE = new Type();
            ABSOLUTE_TO_RELATIVE_TRAMPOLINE = new Type();
            Type[] typeArray = new Type[4];
            typeArray[0] = ABSOLUTE_TO_ABSOLUTE;
            typeArray[1] = RELATIVE_TO_ABSOLUTE;
            typeArray[2] = ABSOLUTE_TO_RELATIVE;
            typeArray[3] = ABSOLUTE_TO_RELATIVE_TRAMPOLINE;
            $VALUES = typeArray;
        }

        public static Type[] values() {
            return (Type[])$VALUES.clone();
        }
    }
}

