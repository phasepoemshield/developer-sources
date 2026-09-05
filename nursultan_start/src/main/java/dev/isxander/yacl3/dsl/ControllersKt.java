/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.BooleanControllerBuilder
 *  dev.isxander.yacl3.api.controller.ColorControllerBuilder
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 *  dev.isxander.yacl3.api.controller.CyclingListControllerBuilder
 *  dev.isxander.yacl3.api.controller.DoubleFieldControllerBuilder
 *  dev.isxander.yacl3.api.controller.DoubleSliderControllerBuilder
 *  dev.isxander.yacl3.api.controller.EnumControllerBuilder
 *  dev.isxander.yacl3.api.controller.EnumDropdownControllerBuilder
 *  dev.isxander.yacl3.api.controller.FloatFieldControllerBuilder
 *  dev.isxander.yacl3.api.controller.FloatSliderControllerBuilder
 *  dev.isxander.yacl3.api.controller.IntegerFieldControllerBuilder
 *  dev.isxander.yacl3.api.controller.IntegerSliderControllerBuilder
 *  dev.isxander.yacl3.api.controller.ItemControllerBuilder
 *  dev.isxander.yacl3.api.controller.LongFieldControllerBuilder
 *  dev.isxander.yacl3.api.controller.LongSliderControllerBuilder
 *  dev.isxander.yacl3.api.controller.StringControllerBuilder
 *  dev.isxander.yacl3.api.controller.TickBoxControllerBuilder
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.ranges.ClosedRange
 *  kotlin.ranges.IntRange
 *  kotlin.ranges.LongRange
 *  minecraft.class06581
 */
package dev.isxander.yacl3.dsl;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.BooleanControllerBuilder;
import dev.isxander.yacl3.api.controller.ColorControllerBuilder;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.api.controller.CyclingListControllerBuilder;
import dev.isxander.yacl3.api.controller.DoubleFieldControllerBuilder;
import dev.isxander.yacl3.api.controller.DoubleSliderControllerBuilder;
import dev.isxander.yacl3.api.controller.EnumControllerBuilder;
import dev.isxander.yacl3.api.controller.EnumDropdownControllerBuilder;
import dev.isxander.yacl3.api.controller.FloatFieldControllerBuilder;
import dev.isxander.yacl3.api.controller.FloatSliderControllerBuilder;
import dev.isxander.yacl3.api.controller.IntegerFieldControllerBuilder;
import dev.isxander.yacl3.api.controller.IntegerSliderControllerBuilder;
import dev.isxander.yacl3.api.controller.ItemControllerBuilder;
import dev.isxander.yacl3.api.controller.LongFieldControllerBuilder;
import dev.isxander.yacl3.api.controller.LongSliderControllerBuilder;
import dev.isxander.yacl3.api.controller.StringControllerBuilder;
import dev.isxander.yacl3.api.controller.TickBoxControllerBuilder;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import java.awt.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import minecraft.class06581;

@Metadata(mv={2, 3, 0}, k=2, xi=48, d1={"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0005\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0000j\b\u0012\u0004\u0012\u00020\u0002`\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\t\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0000j\b\u0012\u0004\u0012\u00020\u0002`\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u00a2\u0006\u0004\b\t\u0010\n\u001aS\u0010\u000f\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u0000j\b\u0012\u0004\u0012\u00020\r`\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001aS\u0010\u000f\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00030\u0000j\b\u0012\u0004\u0012\u00020\u0012`\u00042\u0006\u0010\f\u001a\u00020\u00112\b\b\u0002\u0010\u000e\u001a\u00020\u00122\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0013\u001aY\u0010\u000f\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00030\u0000j\b\u0012\u0004\u0012\u00020\u0015`\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u000e\u001a\u00020\u00152\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0016\u001aY\u0010\u000f\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00030\u0000j\b\u0012\u0004\u0012\u00020\u0017`\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\b\b\u0002\u0010\u000e\u001a\u00020\u00172\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0018\u001a/\u0010\u001a\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00030\u0000j\b\u0012\u0004\u0012\u00020\u0019`\u0004\u00a2\u0006\u0004\b\u001a\u0010\u0006\u001aY\u0010\u001d\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u0000j\b\u0012\u0004\u0012\u00020\r`\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007\u00a2\u0006\u0004\b\u001d\u0010\u001e\u001aY\u0010\u001d\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00030\u0000j\b\u0012\u0004\u0012\u00020\u0012`\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007\u00a2\u0006\u0004\b\u001d\u0010\u001f\u001aY\u0010\u001d\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00030\u0000j\b\u0012\u0004\u0012\u00020\u0015`\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0007\u00a2\u0006\u0004\b\u001d\u0010 \u001aY\u0010\u001d\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00030\u0000j\b\u0012\u0004\u0012\u00020\u0017`\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0007\u00a2\u0006\u0004\b\u001d\u0010!\u001a9\u0010$\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00030\u0000j\b\u0012\u0004\u0012\u00020#`\u00042\b\b\u0002\u0010\"\u001a\u00020\u0002\u00a2\u0006\u0004\b$\u0010%\u001aU\u0010)\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u0004\"\u0004\b\u0000\u0010&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u00a2\u0006\u0004\b)\u0010*\u001a_\u0010.\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u0004\"\u000e\b\u0000\u0010&*\b\u0012\u0004\u0012\u00028\u00000+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u00a2\u0006\u0004\b.\u0010/\u001aV\u0010.\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u0004\"\u0010\b\u0000\u0010&\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000+2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007H\u0086\b\u00a2\u0006\u0004\b.\u0010\n\u001aQ\u00100\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u0004\"\u000e\b\u0000\u0010&*\b\u0012\u0004\u0012\u00028\u00000+2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u00a2\u0006\u0004\b0\u0010\n\u001a/\u00102\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00030\u0000j\b\u0012\u0004\u0012\u000201`\u0004\u00a2\u0006\u0004\b2\u0010\u0006*@\u00103\u001a\u0004\b\u0000\u0010&\"\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0000\u00a8\u00064"}, d2={"Lkotlin/Function1;", "Ldev/isxander/yacl3/api/Option;", "", "Ldev/isxander/yacl3/api/controller/ControllerBuilder;", "Ldev/isxander/yacl3/dsl/ControllerBuilderFactory;", "tickBox", "()Lkotlin/jvm/functions/Function1;", "Ldev/isxander/yacl3/api/controller/ValueFormatter;", "formatter", "textSwitch", "(Ldev/isxander/yacl3/api/controller/ValueFormatter;)Lkotlin/jvm/functions/Function1;", "Lkotlin/ranges/IntRange;", "range", "", "step", "slider", "(Lkotlin/ranges/IntRange;ILdev/isxander/yacl3/api/controller/ValueFormatter;)Lkotlin/jvm/functions/Function1;", "Lkotlin/ranges/LongRange;", "", "(Lkotlin/ranges/LongRange;JLdev/isxander/yacl3/api/controller/ValueFormatter;)Lkotlin/jvm/functions/Function1;", "Lkotlin/ranges/ClosedRange;", "", "(Lkotlin/ranges/ClosedRange;FLdev/isxander/yacl3/api/controller/ValueFormatter;)Lkotlin/jvm/functions/Function1;", "", "(Lkotlin/ranges/ClosedRange;DLdev/isxander/yacl3/api/controller/ValueFormatter;)Lkotlin/jvm/functions/Function1;", "", "stringField", "min", "max", "numberField", "(Ljava/lang/Integer;Ljava/lang/Integer;Ldev/isxander/yacl3/api/controller/ValueFormatter;)Lkotlin/jvm/functions/Function1;", "(Ljava/lang/Long;Ljava/lang/Long;Ldev/isxander/yacl3/api/controller/ValueFormatter;)Lkotlin/jvm/functions/Function1;", "(Ljava/lang/Float;Ljava/lang/Float;Ldev/isxander/yacl3/api/controller/ValueFormatter;)Lkotlin/jvm/functions/Function1;", "(Ljava/lang/Double;Ljava/lang/Double;Ldev/isxander/yacl3/api/controller/ValueFormatter;)Lkotlin/jvm/functions/Function1;", "allowAlpha", "Ljava/awt/Color;", "colorPicker", "(Z)Lkotlin/jvm/functions/Function1;", "T", "", "values", "cyclingList", "(Ljava/lang/Iterable;Ldev/isxander/yacl3/api/controller/ValueFormatter;)Lkotlin/jvm/functions/Function1;", "", "Ljava/lang/Class;", "enumClass", "enumSwitch", "(Ljava/lang/Class;Ldev/isxander/yacl3/api/controller/ValueFormatter;)Lkotlin/jvm/functions/Function1;", "enumDropdown", "Lnet/minecraft/class_1792;", "minecraftItem", "ControllerBuilderFactory", "yet_another_config_lib_v3"})
public final class ControllersKt {
    private static final ControllerBuilder stringField$lambda$0(Option option) {
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        StringControllerBuilder stringControllerBuilder = StringControllerBuilder.create((Option)option);
        Intrinsics.checkNotNullExpressionValue((Object)stringControllerBuilder, (String)"");
        return (ControllerBuilder)stringControllerBuilder;
    }

    private static final ControllerBuilder textSwitch$lambda$0(ValueFormatter valueFormatter, Option option) {
        BooleanControllerBuilder booleanControllerBuilder;
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        BooleanControllerBuilder booleanControllerBuilder2 = booleanControllerBuilder = BooleanControllerBuilder.create((Option)option);
        boolean bl = false;
        ValueFormatter valueFormatter2 = valueFormatter;
        if (valueFormatter2 != null) {
            ValueFormatter valueFormatter3 = valueFormatter2;
            boolean bl2 = false;
            booleanControllerBuilder2.formatValue(valueFormatter3);
        }
        BooleanControllerBuilder booleanControllerBuilder3 = booleanControllerBuilder;
        Intrinsics.checkNotNullExpressionValue((Object)booleanControllerBuilder3, (String)"");
        return (ControllerBuilder)booleanControllerBuilder3;
    }

    private static final ControllerBuilder numberField$lambda$0(Integer n, Integer n2, ValueFormatter valueFormatter, Option option) {
        boolean bl;
        int n3;
        IntegerFieldControllerBuilder integerFieldControllerBuilder;
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        IntegerFieldControllerBuilder integerFieldControllerBuilder2 = integerFieldControllerBuilder = IntegerFieldControllerBuilder.create((Option)option);
        boolean bl2 = false;
        Integer n4 = n;
        if (n4 != null) {
            n3 = ((Number)n4).intValue();
            bl = false;
            IntegerFieldControllerBuilder cfr_ignored_0 = (IntegerFieldControllerBuilder)integerFieldControllerBuilder2.min((Number)n3);
        }
        Integer n5 = n2;
        if (n5 != null) {
            n3 = ((Number)n5).intValue();
            bl = false;
            IntegerFieldControllerBuilder cfr_ignored_1 = (IntegerFieldControllerBuilder)integerFieldControllerBuilder2.max((Number)n3);
        }
        ValueFormatter valueFormatter2 = valueFormatter;
        if (valueFormatter2 != null) {
            ValueFormatter valueFormatter3 = valueFormatter2;
            bl = false;
            integerFieldControllerBuilder2.formatValue(valueFormatter3);
        }
        IntegerFieldControllerBuilder integerFieldControllerBuilder3 = integerFieldControllerBuilder;
        Intrinsics.checkNotNullExpressionValue((Object)integerFieldControllerBuilder3, (String)"");
        return (ControllerBuilder)integerFieldControllerBuilder3;
    }

    public static /* synthetic */ Function1 numberField$default(Long l, Long l2, ValueFormatter valueFormatter, int n, Object object) {
        if ((n & 1) != 0) {
            l = null;
        }
        if ((n & 2) != 0) {
            l2 = null;
        }
        if ((n & 4) != 0) {
            valueFormatter = null;
        }
        return ControllersKt.numberField(l, l2, (ValueFormatter<Long>)valueFormatter);
    }

    public static /* synthetic */ Function1 numberField$default(Double d, Double d2, ValueFormatter valueFormatter, int n, Object object) {
        if ((n & 1) != 0) {
            d = null;
        }
        if ((n & 2) != 0) {
            d2 = null;
        }
        if ((n & 4) != 0) {
            valueFormatter = null;
        }
        return ControllersKt.numberField(d, d2, (ValueFormatter<Double>)valueFormatter);
    }

    public static /* synthetic */ Function1 numberField$default(Float f, Float f2, ValueFormatter valueFormatter, int n, Object object) {
        if ((n & 1) != 0) {
            f = null;
        }
        if ((n & 2) != 0) {
            f2 = null;
        }
        if ((n & 4) != 0) {
            valueFormatter = null;
        }
        return ControllersKt.numberField(f, f2, (ValueFormatter<Float>)valueFormatter);
    }

    public static /* synthetic */ Function1 numberField$default(Integer n, Integer n2, ValueFormatter valueFormatter, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = null;
        }
        if ((n3 & 2) != 0) {
            n2 = null;
        }
        if ((n3 & 4) != 0) {
            valueFormatter = null;
        }
        return ControllersKt.numberField(n, n2, (ValueFormatter<Integer>)valueFormatter);
    }

    private static final ControllerBuilder numberField$lambda$1(Long l, Long l2, ValueFormatter valueFormatter, Option option) {
        boolean bl;
        long l3;
        LongFieldControllerBuilder longFieldControllerBuilder;
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        LongFieldControllerBuilder longFieldControllerBuilder2 = longFieldControllerBuilder = LongFieldControllerBuilder.create((Option)option);
        boolean bl2 = false;
        Long l4 = l;
        if (l4 != null) {
            l3 = ((Number)l4).longValue();
            bl = false;
            LongFieldControllerBuilder cfr_ignored_0 = (LongFieldControllerBuilder)longFieldControllerBuilder2.min((Number)l3);
        }
        Long l5 = l2;
        if (l5 != null) {
            l3 = ((Number)l5).longValue();
            bl = false;
            LongFieldControllerBuilder cfr_ignored_1 = (LongFieldControllerBuilder)longFieldControllerBuilder2.max((Number)l3);
        }
        ValueFormatter valueFormatter2 = valueFormatter;
        if (valueFormatter2 != null) {
            ValueFormatter valueFormatter3 = valueFormatter2;
            boolean bl3 = false;
            longFieldControllerBuilder2.formatValue(valueFormatter3);
        }
        LongFieldControllerBuilder longFieldControllerBuilder3 = longFieldControllerBuilder;
        Intrinsics.checkNotNullExpressionValue((Object)longFieldControllerBuilder3, (String)"");
        return (ControllerBuilder)longFieldControllerBuilder3;
    }

    private static final ControllerBuilder numberField$lambda$2(Float f, Float f2, ValueFormatter valueFormatter, Option option) {
        boolean bl;
        float f3;
        FloatFieldControllerBuilder floatFieldControllerBuilder;
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        FloatFieldControllerBuilder floatFieldControllerBuilder2 = floatFieldControllerBuilder = FloatFieldControllerBuilder.create((Option)option);
        boolean bl2 = false;
        Float f4 = f;
        if (f4 != null) {
            f3 = ((Number)f4).floatValue();
            bl = false;
            FloatFieldControllerBuilder cfr_ignored_0 = (FloatFieldControllerBuilder)floatFieldControllerBuilder2.min((Number)Float.valueOf(f3));
        }
        Float f5 = f2;
        if (f5 != null) {
            f3 = ((Number)f5).floatValue();
            bl = false;
            FloatFieldControllerBuilder cfr_ignored_1 = (FloatFieldControllerBuilder)floatFieldControllerBuilder2.max((Number)Float.valueOf(f3));
        }
        ValueFormatter valueFormatter2 = valueFormatter;
        if (valueFormatter2 != null) {
            ValueFormatter valueFormatter3 = valueFormatter2;
            bl = false;
            floatFieldControllerBuilder2.formatValue(valueFormatter3);
        }
        FloatFieldControllerBuilder floatFieldControllerBuilder3 = floatFieldControllerBuilder;
        Intrinsics.checkNotNullExpressionValue((Object)floatFieldControllerBuilder3, (String)"");
        return (ControllerBuilder)floatFieldControllerBuilder3;
    }

    private static final ControllerBuilder numberField$lambda$3(Double d, Double d2, ValueFormatter valueFormatter, Option option) {
        boolean bl;
        double d3;
        DoubleFieldControllerBuilder doubleFieldControllerBuilder;
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        DoubleFieldControllerBuilder doubleFieldControllerBuilder2 = doubleFieldControllerBuilder = DoubleFieldControllerBuilder.create((Option)option);
        boolean bl2 = false;
        Double d4 = d;
        if (d4 != null) {
            d3 = ((Number)d4).doubleValue();
            bl = false;
            DoubleFieldControllerBuilder cfr_ignored_0 = (DoubleFieldControllerBuilder)doubleFieldControllerBuilder2.min((Number)d3);
        }
        Double d5 = d2;
        if (d5 != null) {
            d3 = ((Number)d5).doubleValue();
            bl = false;
            DoubleFieldControllerBuilder cfr_ignored_1 = (DoubleFieldControllerBuilder)doubleFieldControllerBuilder2.max((Number)d3);
        }
        ValueFormatter valueFormatter2 = valueFormatter;
        if (valueFormatter2 != null) {
            ValueFormatter valueFormatter3 = valueFormatter2;
            boolean bl3 = false;
            doubleFieldControllerBuilder2.formatValue(valueFormatter3);
        }
        DoubleFieldControllerBuilder doubleFieldControllerBuilder3 = doubleFieldControllerBuilder;
        Intrinsics.checkNotNullExpressionValue((Object)doubleFieldControllerBuilder3, (String)"");
        return (ControllerBuilder)doubleFieldControllerBuilder3;
    }

    private static final ControllerBuilder colorPicker$lambda$0(boolean bl, Option option) {
        ColorControllerBuilder colorControllerBuilder;
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        ColorControllerBuilder colorControllerBuilder2 = colorControllerBuilder = ColorControllerBuilder.create((Option)option);
        boolean bl2 = false;
        colorControllerBuilder2.allowAlpha(bl);
        ColorControllerBuilder colorControllerBuilder3 = colorControllerBuilder;
        Intrinsics.checkNotNullExpressionValue((Object)colorControllerBuilder3, (String)"");
        return (ControllerBuilder)colorControllerBuilder3;
    }

    private static final ControllerBuilder cyclingList$lambda$0(Iterable iterable, ValueFormatter valueFormatter, Option option) {
        CyclingListControllerBuilder cyclingListControllerBuilder;
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        CyclingListControllerBuilder cyclingListControllerBuilder2 = cyclingListControllerBuilder = CyclingListControllerBuilder.create((Option)option);
        boolean bl = false;
        cyclingListControllerBuilder2.values(iterable);
        ValueFormatter valueFormatter2 = valueFormatter;
        if (valueFormatter2 != null) {
            ValueFormatter valueFormatter3 = valueFormatter2;
            boolean bl2 = false;
            cyclingListControllerBuilder2.formatValue(valueFormatter3);
        }
        CyclingListControllerBuilder cyclingListControllerBuilder3 = cyclingListControllerBuilder;
        Intrinsics.checkNotNullExpressionValue((Object)cyclingListControllerBuilder3, (String)"");
        return (ControllerBuilder)cyclingListControllerBuilder3;
    }

    public static /* synthetic */ Function1 cyclingList$default(Iterable iterable, ValueFormatter valueFormatter, int n, Object object) {
        if ((n & 2) != 0) {
            valueFormatter = null;
        }
        return ControllersKt.cyclingList(iterable, valueFormatter);
    }

    private static final ControllerBuilder enumDropdown$lambda$0(ValueFormatter valueFormatter, Option option) {
        EnumDropdownControllerBuilder enumDropdownControllerBuilder;
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        EnumDropdownControllerBuilder enumDropdownControllerBuilder2 = enumDropdownControllerBuilder = EnumDropdownControllerBuilder.create((Option)option);
        boolean bl = false;
        ValueFormatter valueFormatter2 = valueFormatter;
        if (valueFormatter2 != null) {
            ValueFormatter valueFormatter3 = valueFormatter2;
            boolean bl2 = false;
            enumDropdownControllerBuilder2.formatValue(valueFormatter3);
        }
        EnumDropdownControllerBuilder enumDropdownControllerBuilder3 = enumDropdownControllerBuilder;
        Intrinsics.checkNotNullExpressionValue((Object)enumDropdownControllerBuilder3, (String)"");
        return (ControllerBuilder)enumDropdownControllerBuilder3;
    }

    private static final ControllerBuilder minecraftItem$lambda$0(Option option) {
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        ItemControllerBuilder itemControllerBuilder = ItemControllerBuilder.create((Option)option);
        Intrinsics.checkNotNullExpressionValue((Object)itemControllerBuilder, (String)"");
        return (ControllerBuilder)itemControllerBuilder;
    }

    public static /* synthetic */ Function1 colorPicker$default(boolean bl, int n, Object object) {
        if ((n & 1) != 0) {
            bl = false;
        }
        return ControllersKt.colorPicker(bl);
    }

    private static final ControllerBuilder enumSwitch$lambda$0(Class clazz, ValueFormatter valueFormatter, Option option) {
        EnumControllerBuilder enumControllerBuilder;
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        EnumControllerBuilder enumControllerBuilder2 = enumControllerBuilder = EnumControllerBuilder.create((Option)option);
        boolean bl = false;
        enumControllerBuilder2.enumClass(clazz);
        ValueFormatter valueFormatter2 = valueFormatter;
        if (valueFormatter2 != null) {
            ValueFormatter valueFormatter3 = valueFormatter2;
            boolean bl2 = false;
            enumControllerBuilder2.formatValue(valueFormatter3);
        }
        EnumControllerBuilder enumControllerBuilder3 = enumControllerBuilder;
        Intrinsics.checkNotNullExpressionValue((Object)enumControllerBuilder3, (String)"");
        return (ControllerBuilder)enumControllerBuilder3;
    }

    public static /* synthetic */ Function1 enumDropdown$default(ValueFormatter valueFormatter, int n, Object object) {
        if ((n & 1) != 0) {
            valueFormatter = null;
        }
        return ControllersKt.enumDropdown(valueFormatter);
    }

    public static final Function1<Option<Boolean>, ControllerBuilder<Boolean>> textSwitch(ValueFormatter<Boolean> valueFormatter) {
        return arg_0 -> ControllersKt.textSwitch$lambda$0(valueFormatter, arg_0);
    }

    public static final Function1<Option<Boolean>, ControllerBuilder<Boolean>> tickBox() {
        return ControllersKt::tickBox$lambda$0;
    }

    public static final Function1<Option<Float>, ControllerBuilder<Float>> slider(ClosedRange<Float> closedRange, float f, ValueFormatter<Float> valueFormatter) {
        Intrinsics.checkNotNullParameter(closedRange, (String)"");
        return arg_0 -> ControllersKt.slider$lambda$2(closedRange, f, valueFormatter, arg_0);
    }

    public static final Function1<Option<Double>, ControllerBuilder<Double>> slider(ClosedRange<Double> closedRange, double d, ValueFormatter<Double> valueFormatter) {
        Intrinsics.checkNotNullParameter(closedRange, (String)"");
        return arg_0 -> ControllersKt.slider$lambda$3(closedRange, d, valueFormatter, arg_0);
    }

    public static final Function1<Option<Long>, ControllerBuilder<Long>> slider(LongRange longRange, long l, ValueFormatter<Long> valueFormatter) {
        Intrinsics.checkNotNullParameter((Object)longRange, (String)"");
        return arg_0 -> ControllersKt.slider$lambda$1(longRange, l, valueFormatter, arg_0);
    }

    public static final Function1<Option<Integer>, ControllerBuilder<Integer>> slider(IntRange intRange, int n, ValueFormatter<Integer> valueFormatter) {
        Intrinsics.checkNotNullParameter((Object)intRange, (String)"");
        return arg_0 -> ControllersKt.slider$lambda$0(intRange, n, valueFormatter, arg_0);
    }

    public static final /* synthetic */ <T extends Enum<T>> Function1<Option<T>, ControllerBuilder<T>> enumSwitch(ValueFormatter<T> valueFormatter) {
        boolean bl = false;
        Intrinsics.reifiedOperationMarker((int)4, (String)"T");
        return ControllersKt.enumSwitch(Enum.class, valueFormatter);
    }

    public static final <T extends Enum<T>> Function1<Option<T>, ControllerBuilder<T>> enumSwitch(Class<T> clazz, ValueFormatter<T> valueFormatter) {
        Intrinsics.checkNotNullParameter(clazz, (String)"");
        return arg_0 -> ControllersKt.enumSwitch$lambda$0(clazz, valueFormatter, arg_0);
    }

    public static final Function1<Option<class06581>, ControllerBuilder<class06581>> minecraftItem() {
        return ControllersKt::minecraftItem$lambda$0;
    }

    public static /* synthetic */ Function1 textSwitch$default(ValueFormatter valueFormatter, int n, Object object) {
        if ((n & 1) != 0) {
            valueFormatter = null;
        }
        return ControllersKt.textSwitch((ValueFormatter<Boolean>)valueFormatter);
    }

    private static final ControllerBuilder slider$lambda$0(IntRange intRange, int n, ValueFormatter valueFormatter, Option option) {
        IntegerSliderControllerBuilder integerSliderControllerBuilder;
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        IntegerSliderControllerBuilder integerSliderControllerBuilder2 = integerSliderControllerBuilder = IntegerSliderControllerBuilder.create((Option)option);
        boolean bl = false;
        integerSliderControllerBuilder2.range((Number)intRange.getFirst(), (Number)intRange.getLast());
        integerSliderControllerBuilder2.step((Number)n);
        ValueFormatter valueFormatter2 = valueFormatter;
        if (valueFormatter2 != null) {
            ValueFormatter valueFormatter3 = valueFormatter2;
            boolean bl2 = false;
            integerSliderControllerBuilder2.formatValue(valueFormatter3);
        }
        IntegerSliderControllerBuilder integerSliderControllerBuilder3 = integerSliderControllerBuilder;
        Intrinsics.checkNotNullExpressionValue((Object)integerSliderControllerBuilder3, (String)"");
        return (ControllerBuilder)integerSliderControllerBuilder3;
    }

    private static final ControllerBuilder tickBox$lambda$0(Option option) {
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        TickBoxControllerBuilder tickBoxControllerBuilder = TickBoxControllerBuilder.create((Option)option);
        Intrinsics.checkNotNullExpressionValue((Object)tickBoxControllerBuilder, (String)"");
        return (ControllerBuilder)tickBoxControllerBuilder;
    }

    public static /* synthetic */ Function1 slider$default(ClosedRange closedRange, double d, ValueFormatter valueFormatter, int n, Object object) {
        if ((n & 2) != 0) {
            d = 1.0;
        }
        if ((n & 4) != 0) {
            valueFormatter = null;
        }
        return ControllersKt.slider((ClosedRange<Double>)closedRange, d, (ValueFormatter<Double>)valueFormatter);
    }

    public static /* synthetic */ Function1 slider$default(ClosedRange closedRange, float f, ValueFormatter valueFormatter, int n, Object object) {
        if ((n & 2) != 0) {
            f = 1.0f;
        }
        if ((n & 4) != 0) {
            valueFormatter = null;
        }
        return ControllersKt.slider((ClosedRange<Float>)closedRange, f, (ValueFormatter<Float>)valueFormatter);
    }

    public static /* synthetic */ Function1 slider$default(IntRange intRange, int n, ValueFormatter valueFormatter, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 1;
        }
        if ((n2 & 4) != 0) {
            valueFormatter = null;
        }
        return ControllersKt.slider(intRange, n, (ValueFormatter<Integer>)valueFormatter);
    }

    public static /* synthetic */ Function1 slider$default(LongRange longRange, long l, ValueFormatter valueFormatter, int n, Object object) {
        if ((n & 2) != 0) {
            l = 1L;
        }
        if ((n & 4) != 0) {
            valueFormatter = null;
        }
        return ControllersKt.slider(longRange, l, (ValueFormatter<Long>)valueFormatter);
    }

    private static final ControllerBuilder slider$lambda$1(LongRange longRange, long l, ValueFormatter valueFormatter, Option option) {
        LongSliderControllerBuilder longSliderControllerBuilder;
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        LongSliderControllerBuilder longSliderControllerBuilder2 = longSliderControllerBuilder = LongSliderControllerBuilder.create((Option)option);
        boolean bl = false;
        longSliderControllerBuilder2.range((Number)longRange.getFirst(), (Number)longRange.getLast());
        longSliderControllerBuilder2.step((Number)l);
        ValueFormatter valueFormatter2 = valueFormatter;
        if (valueFormatter2 != null) {
            ValueFormatter valueFormatter3 = valueFormatter2;
            boolean bl2 = false;
            longSliderControllerBuilder2.formatValue(valueFormatter3);
        }
        LongSliderControllerBuilder longSliderControllerBuilder3 = longSliderControllerBuilder;
        Intrinsics.checkNotNullExpressionValue((Object)longSliderControllerBuilder3, (String)"");
        return (ControllerBuilder)longSliderControllerBuilder3;
    }

    private static final ControllerBuilder slider$lambda$2(ClosedRange closedRange, float f, ValueFormatter valueFormatter, Option option) {
        FloatSliderControllerBuilder floatSliderControllerBuilder;
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        FloatSliderControllerBuilder floatSliderControllerBuilder2 = floatSliderControllerBuilder = FloatSliderControllerBuilder.create((Option)option);
        boolean bl = false;
        floatSliderControllerBuilder2.range((Number)((Object)closedRange.getStart()), (Number)((Object)closedRange.getEndInclusive()));
        floatSliderControllerBuilder2.step((Number)Float.valueOf(f));
        ValueFormatter valueFormatter2 = valueFormatter;
        if (valueFormatter2 != null) {
            ValueFormatter valueFormatter3 = valueFormatter2;
            boolean bl2 = false;
            floatSliderControllerBuilder2.formatValue(valueFormatter3);
        }
        FloatSliderControllerBuilder floatSliderControllerBuilder3 = floatSliderControllerBuilder;
        Intrinsics.checkNotNullExpressionValue((Object)floatSliderControllerBuilder3, (String)"");
        return (ControllerBuilder)floatSliderControllerBuilder3;
    }

    public static final Function1<Option<Long>, ControllerBuilder<Long>> numberField(Long l, Long l2, ValueFormatter<Long> valueFormatter) {
        return arg_0 -> ControllersKt.numberField$lambda$1(l, l2, valueFormatter, arg_0);
    }

    public static final Function1<Option<Float>, ControllerBuilder<Float>> numberField(Float f, Float f2, ValueFormatter<Float> valueFormatter) {
        return arg_0 -> ControllersKt.numberField$lambda$2(f, f2, valueFormatter, arg_0);
    }

    public static final Function1<Option<Integer>, ControllerBuilder<Integer>> numberField(Integer n, Integer n2, ValueFormatter<Integer> valueFormatter) {
        return arg_0 -> ControllersKt.numberField$lambda$0(n, n2, valueFormatter, arg_0);
    }

    public static final Function1<Option<Double>, ControllerBuilder<Double>> numberField(Double d, Double d2, ValueFormatter<Double> valueFormatter) {
        return arg_0 -> ControllersKt.numberField$lambda$3(d, d2, valueFormatter, arg_0);
    }

    public static final <T extends Enum<T>> Function1<Option<T>, ControllerBuilder<T>> enumDropdown(ValueFormatter<T> valueFormatter) {
        return arg_0 -> ControllersKt.enumDropdown$lambda$0(valueFormatter, arg_0);
    }

    public static final <T> Function1<Option<T>, ControllerBuilder<T>> cyclingList(Iterable<? extends T> iterable, ValueFormatter<T> valueFormatter) {
        Intrinsics.checkNotNullParameter(iterable, (String)"");
        return arg_0 -> ControllersKt.cyclingList$lambda$0(iterable, valueFormatter, arg_0);
    }

    public static /* synthetic */ Function1 enumSwitch$default(ValueFormatter valueFormatter, int n, Object object) {
        if ((n & 1) != 0) {
            valueFormatter = null;
        }
        n = 0;
        Intrinsics.reifiedOperationMarker((int)4, (String)"T");
        return ControllersKt.enumSwitch(Enum.class, valueFormatter);
    }

    public static /* synthetic */ Function1 enumSwitch$default(Class clazz, ValueFormatter valueFormatter, int n, Object object) {
        if ((n & 2) != 0) {
            valueFormatter = null;
        }
        return ControllersKt.enumSwitch(clazz, valueFormatter);
    }

    public static final Function1<Option<String>, ControllerBuilder<String>> stringField() {
        return ControllersKt::stringField$lambda$0;
    }

    public static final Function1<Option<Color>, ControllerBuilder<Color>> colorPicker(boolean bl) {
        return arg_0 -> ControllersKt.colorPicker$lambda$0(bl, arg_0);
    }

    private static final ControllerBuilder slider$lambda$3(ClosedRange closedRange, double d, ValueFormatter valueFormatter, Option option) {
        DoubleSliderControllerBuilder doubleSliderControllerBuilder;
        Intrinsics.checkNotNullParameter((Object)option, (String)"");
        DoubleSliderControllerBuilder doubleSliderControllerBuilder2 = doubleSliderControllerBuilder = DoubleSliderControllerBuilder.create((Option)option);
        boolean bl = false;
        doubleSliderControllerBuilder2.range((Number)((Object)closedRange.getStart()), (Number)((Object)closedRange.getEndInclusive()));
        doubleSliderControllerBuilder2.step((Number)d);
        ValueFormatter valueFormatter2 = valueFormatter;
        if (valueFormatter2 != null) {
            ValueFormatter valueFormatter3 = valueFormatter2;
            boolean bl2 = false;
            doubleSliderControllerBuilder2.formatValue(valueFormatter3);
        }
        DoubleSliderControllerBuilder doubleSliderControllerBuilder3 = doubleSliderControllerBuilder;
        Intrinsics.checkNotNullExpressionValue((Object)doubleSliderControllerBuilder3, (String)"");
        return (ControllerBuilder)doubleSliderControllerBuilder3;
    }
}

