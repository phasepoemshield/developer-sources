/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.ObjectParameterInfo;
import com.kenai.jffi.ObjectParameterType;

public abstract class ObjectParameterStrategy<T> {
    final int typeInfo;
    protected static final StrategyType HEAP;
    protected static final StrategyType DIRECT;
    private final boolean isDirect;

    public ObjectParameterStrategy(StrategyType type) {
        this(type, ObjectParameterType.INVALID);
    }

    public final boolean isDirect() {
        return this.isDirect;
    }

    public abstract Object object(T var1);

    /*
     * WARNING - void declaration
     */
    final int objectInfo(ObjectParameterInfo info) {
        void var2_2;
        int objectInfo = info.asObjectInfo();
        if (this.typeInfo != 0) {
            return objectInfo & 0xFFFFFF | this.typeInfo;
        }
        return (int)var2_2;
    }

    public ObjectParameterStrategy(boolean isDirect) {
        this(isDirect, ObjectParameterType.INVALID);
    }

    public abstract int length(T var1);

    public ObjectParameterStrategy(StrategyType strategyType, ObjectParameterType parameterType) {
        this.isDirect = strategyType == DIRECT;
        this.typeInfo = parameterType.typeInfo;
    }

    static {
        DIRECT = StrategyType.DIRECT;
        HEAP = StrategyType.HEAP;
    }

    public abstract int offset(T var1);

    public abstract long address(T var1);

    public ObjectParameterStrategy(boolean isDirect, ObjectParameterType type) {
        this.isDirect = isDirect;
        this.typeInfo = type.typeInfo;
    }

    protected static final class StrategyType
    extends Enum<StrategyType> {
        public static final /* enum */ StrategyType HEAP;
        public static final /* enum */ StrategyType DIRECT;
        private static final /* synthetic */ StrategyType[] $VALUES;

        public static StrategyType[] values() {
            return (StrategyType[])$VALUES.clone();
        }

        public static StrategyType valueOf(String name) {
            return Enum.valueOf(StrategyType.class, name);
        }

        private static /* synthetic */ StrategyType[] $values() {
            StrategyType[] strategyTypeArray = new StrategyType[2];
            strategyTypeArray[0] = DIRECT;
            strategyTypeArray[1] = HEAP;
            return strategyTypeArray;
        }

        static {
            DIRECT = new StrategyType();
            HEAP = new StrategyType();
            $VALUES = StrategyType.$values();
        }
    }
}

