/*
 * Decompiled with CFR 0.152.
 */
package jnr.x86asm;

class RelocData {
    final Type type;
    final long destination;
    final int offset;
    final int size;

    public RelocData(Type type, int size, int offset, long destination) {
        this.type = type;
        this.size = size;
        this.offset = offset;
        this.destination = destination;
    }

    /*
     * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
     */
    static final class Type
    extends Enum<Type> {
        private static final /* synthetic */ Type[] $VALUES;
        public static final /* enum */ Type RELATIVE_TO_ABSOLUTE;
        public static final /* enum */ Type ABSOLUTE_TO_RELATIVE;
        public static final /* enum */ Type ABSOLUTE_TO_ABSOLUTE;
        public static final /* enum */ Type ABSOLUTE_TO_RELATIVE_TRAMPOLINE;

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

        public static Type valueOf(String name) {
            return Enum.valueOf(Type.class, name);
        }

        public static Type[] values() {
            return (Type[])$VALUES.clone();
        }
    }
}

