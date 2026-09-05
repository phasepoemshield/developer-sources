/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10502
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Maps
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class00392
 *  minecraft.class05706
 *  minecraft.class05936
 *  minecraft.class06541
 *  minecraft.class06839
 *  minecraft.class08392
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.gamerule.v1.FabricGameRuleVisitor
 *  net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions
 *  net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType
 *  net.fabricmc.fabric.impl.gamerule.widget.DoubleRuleWidget
 *  net.fabricmc.fabric.impl.gamerule.widget.EnumRuleWidget
 */
package minecraft;

import Nursultan.class10502;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import minecraft.class00392;
import minecraft.class05191;
import minecraft.class05203;
import minecraft.class05206;
import minecraft.class05216;
import minecraft.class05218;
import minecraft.class05706;
import minecraft.class05936;
import minecraft.class06541;
import minecraft.class06839;
import minecraft.class08392;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.gamerule.v1.FabricGameRuleVisitor;
import net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions;
import net.fabricmc.fabric.impl.gamerule.rpc.FabricGameRuleType;
import net.fabricmc.fabric.impl.gamerule.widget.DoubleRuleWidget;
import net.fabricmc.fabric.impl.gamerule.widget.EnumRuleWidget;

@Environment(value=EnvType.CLIENT)
class class05229
implements class05706,
FabricGameRuleVisitor {
    final /* synthetic */ class05191 N;
    final /* synthetic */ Map y;
    final /* synthetic */ class05218 L;

    public void L(class06839<Integer> class068393) {
        this.N(class068393, (class003922, list, string, class068392) -> new class05203(this.L.N, class003922, list, string, class068392));
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class05229(class05218 class052182, class05191 class051912, Map map) {
        this.L = class052182;
        this.N = class051912;
        this.y = map;
    }

    public void y(class06839<Boolean> class068393) {
        this.N(class068393, (class003922, list, string, class068392) -> new class05206(this.L.N, class003922, list, string, class068392));
    }

    private String N(class06839 class068392, Object object, Operation operation) {
        String string = (String)operation.call(new Object[]{class068392, object});
        if (((RuleTypeExtensions)class068392).fabric_getType() != FabricGameRuleType.ENUM) {
            return string;
        }
        String string2 = class068392.L() + "." + string.toLowerCase(Locale.ROOT);
        if (class08392.N((String)string2)) {
            return class08392.N((String)string2, (Object[])new Object[0]);
        }
        return string;
    }

    private <T> void N(class06839<T> class068392, class10502<T> class105022) {
        Object object;
        ImmutableList immutableList;
        class05216 class052162 = class00392.L((String)class068392.L());
        class05216 class052163 = class00392.y((String)class068392.N()).N(class06541.field_1054);
        Object[] objectArray2 = new Object[1];
        Object object2 = class068392.Z();
        class06839<T> class068393 = class068392;
        objectArray2[0] = class00392.y((String)this.N(class068393, object2, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_12279, java.lang.Object]");
            return ((class06839)objectArray[0]).N(objectArray[1]);
        }));
        class05216 class052164 = class00392.N((String)"editGamerule.default", (Object[])objectArray2).N(class06541.field_1080);
        String string = class068392.L() + ".description";
        if (class08392.N((String)string)) {
            ImmutableList.Builder builder = ImmutableList.builder().add((Object)class052163.method_30937());
            class05216 class052165 = class00392.L((String)string);
            class05191.M(this.L.N).L((class05936)class052165, 150).forEach(arg_0 -> ((ImmutableList.Builder)builder).add(arg_0));
            immutableList = builder.add((Object)class052164.method_30937()).build();
            object = class052165.getString() + "\n" + class052164.getString();
        } else {
            immutableList = ImmutableList.of((Object)class052163.method_30937(), (Object)class052164.method_30937());
            object = class052164.getString();
        }
        this.y.computeIfAbsent(class068392.i(), class050862 -> Maps.newHashMap()).put(class068392, class105022.create((class00392)class052162, (List)immutableList, (String)object, class068392));
    }

    public void visitEnum(class06839 class068392) {
        this.N(class068392, (class003922, list, string, class068393) -> new EnumRuleWidget(this.N, class003922, list, string, class068393, class068392.L()));
    }

    public void visitDouble(class06839 class068393) {
        this.N(class068393, (class003922, list, string, class068392) -> new DoubleRuleWidget(this.N, class003922, list, string, class068392));
    }
}

