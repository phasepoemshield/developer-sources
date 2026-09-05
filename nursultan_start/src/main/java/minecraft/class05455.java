/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10976
 *  Nursultan.class11938
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10976;
import Nursultan.class11938;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public final class class05455
extends Enum<class05455> {
    public static final /* enum */ class05455 field_26664 = new class05455(true, false);
    public static final /* enum */ class05455 field_26665 = new class05455(false, false);
    public static final /* enum */ class05455 field_26666 = new class05455(false, true);
    private static final class05455[] field_26667;
    private final boolean field_26668;
    private final boolean field_26669;
    private static final /* synthetic */ class05455[] field_26670;

    public class05455 L() {
        return field_26667[(this.ordinal() + 1) % field_26667.length];
    }

    private class05455(boolean bl, boolean bl2) {
        this.field_26668 = bl;
        this.field_26669 = bl2;
    }

    public static class05455[] values() {
        return (class05455[])field_26670.clone();
    }

    public static class05455 valueOf(String string) {
        return Enum.valueOf(class05455.class, string);
    }

    private static /* synthetic */ class05455[] u() {
        return new class05455[]{field_26664, field_26665, field_26666};
    }

    private void y(CallbackInfoReturnable callbackInfoReturnable) {
        class10976 class109762 = class10976.N((boolean)this.field_26668, (boolean)this.field_26669);
        class11938.L().L((Object)class109762);
        callbackInfoReturnable.setReturnValue((Object)class109762.N());
    }

    public boolean y() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.y(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return this.field_26669;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        class10976 class109762 = class10976.N((boolean)this.field_26668, (boolean)this.field_26669);
        class11938.L().L((Object)class109762);
        callbackInfoReturnable.setReturnValue((Object)class109762.y());
    }

    public boolean N() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return this.field_26668;
    }

    static {
        field_26670 = class05455.u();
        field_26667 = class05455.values();
    }
}

