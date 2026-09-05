/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.parsing;

import java.util.Stack;
import net.irisshaders.iris.shaderpack.parsing.BooleanParser$Operation$1;
import net.irisshaders.iris.shaderpack.parsing.BooleanParser$Operation$2;
import net.irisshaders.iris.shaderpack.parsing.BooleanParser$Operation$3;

sealed class BooleanParser$Operation
extends Enum<BooleanParser$Operation>
permits BooleanParser$Operation$1, BooleanParser$Operation$2, BooleanParser$Operation$3 {
    public static final /* enum */ BooleanParser$Operation AND = new BooleanParser$Operation$1();
    public static final /* enum */ BooleanParser$Operation OR = new BooleanParser$Operation$2();
    public static final /* enum */ BooleanParser$Operation NOT = new BooleanParser$Operation$3();
    public static final /* enum */ BooleanParser$Operation OPEN = new BooleanParser$Operation();
    private static final /* synthetic */ BooleanParser$Operation[] $VALUES;

    static {
        $VALUES = BooleanParser$Operation.$values();
    }

    public static BooleanParser$Operation[] values() {
        return (BooleanParser$Operation[])$VALUES.clone();
    }

    public static BooleanParser$Operation valueOf(String string) {
        return Enum.valueOf(BooleanParser$Operation.class, string);
    }

    boolean compute(boolean bl, Stack<Boolean> stack) {
        return bl;
    }

    private static /* synthetic */ BooleanParser$Operation[] $values() {
        return new BooleanParser$Operation[]{AND, OR, NOT, OPEN};
    }
}

