/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10545
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  it.unimi.dsi.fastutil.floats.FloatComparators
 *  minecraft.class01054
 *  minecraft.class01202
 *  minecraft.class01285
 *  minecraft.class01380
 *  minecraft.class01894
 *  minecraft.class04589
 *  minecraft.class05484
 *  minecraft.class06134
 *  minecraft.class06202
 *  minecraft.class06318
 *  minecraft.class08944
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.DebugOptionsComparator
 */
package minecraft;

import Nursultan.class10545;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import it.unimi.dsi.fastutil.floats.FloatComparators;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class01285;
import minecraft.class01380;
import minecraft.class01894;
import minecraft.class04589;
import minecraft.class05484;
import minecraft.class06134;
import minecraft.class06202;
import minecraft.class06318;
import minecraft.class08944;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.DebugOptionsComparator;

@Environment(value=EnvType.CLIENT)
public class class05980
extends class06318<class05484> {
    private static final Comparator<Map.Entry<class01894, class01285>> y = (entry, entry2) -> {
        int n = FloatComparators.NATURAL_COMPARATOR.compare(((class01285)entry.getValue()).method_72759().y(), ((class01285)entry2.getValue()).method_72759().y());
        if (n != 0) {
            return n;
        }
        return class05980.N((class01894)entry.getKey(), (class01894)entry2.getKey());
    };
    private static final int L = 20;
    final /* synthetic */ class04589 N;

    private void L() {
        this.method_65506();
        this.N.method_37064(true);
    }

    public class05980(class04589 class045892) {
        this.N = class045892;
        super(class06202.Nq(), class045892.field_22789, class045892.i.u(), class045892.i.L(), 20);
        this.N("");
    }

    public void y() {
        this.method_25396().forEach(class05484::N);
    }

    private boolean N(String string, CharSequence charSequence, Operation operation, Map.Entry entry) {
        String string2 = ((class01894)entry.getKey()).y();
        return (Boolean)operation.call(new Object[]{string, charSequence}) != false || !"minecraft".equals(string2) && string2.contains(charSequence);
    }

    private static int N(class01894 class018942, class01894 class018943) {
        return DebugOptionsComparator.INSTANCE.compare(class018942, class018943);
    }

    private boolean N(String string, CharSequence charSequence, Operation operation, LocalRef localRef) {
        return this.N(string, charSequence, operation, (Map.Entry)localRef.get());
    }

    public void N(String string) {
        this.method_25339();
        ArrayList arrayList = new ArrayList(class06134.N().entrySet());
        arrayList.sort(y);
        class08944 class089442 = null;
        for (Map.Entry entry : arrayList) {
            String string2 = string;
            String string3 = ((class01894)entry.getKey()).N();
            Operation operation = objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.lang.String, java.lang.CharSequence]");
                return ((String)objectArray[0]).contains((CharSequence)objectArray[1]);
            };
            LocalRefImpl localRefImpl = new LocalRefImpl();
            localRefImpl.init((Object)entry);
            Map.Entry entry2 = (Map.Entry)localRefImpl.dispose();
            if (!this.N(string3, (CharSequence)string2, operation, (LocalRef)localRefImpl)) continue;
            class08944 class089443 = ((class01285)entry2.getValue()).method_72759();
            if (!class089443.equals(class089442)) {
                this.method_25321((class01202)new class01380(this.N, class089443.N()));
                class089442 = class089443;
            }
            this.method_25321((class01202)new class10545(this.N, (class01894)entry2.getKey()));
        }
        this.L();
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        super.method_48579(class010542, n, n2, f);
    }

    public int method_25322() {
        return 350;
    }
}

