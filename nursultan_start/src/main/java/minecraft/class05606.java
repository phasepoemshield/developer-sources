/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class01055
 *  minecraft.class01623
 *  minecraft.class04370
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.resource.pack.FabricPack
 */
package minecraft;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import minecraft.class01055;
import minecraft.class01623;
import minecraft.class04370;
import minecraft.class05603;
import minecraft.class05630;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.resource.pack.FabricPack;

@Environment(value=EnvType.CLIENT)
class class05606
implements class05603 {
    final /* synthetic */ PrintWriter N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class05606(class05630 class056302, PrintWriter printWriter) {
        this.N = printWriter;
    }

    @Override
    public <T> T N(String string, T t, Function<String, T> function, Function<T, String> function2) {
        this.N(string);
        T t2 = t;
        this.N.println(function2.apply(this.N(t2, string)));
        return t;
    }

    @Override
    public float N(String string, float f) {
        this.N(string);
        this.N.println(f);
        return f;
    }

    private static List N(List list) {
        ArrayList<String> arrayList = new ArrayList<String>(list.size());
        class01623 class016232 = class06202.Nq().t();
        for (String string : list) {
            class01055 class010552 = class016232.L(string);
            if (class010552 != null && ((FabricPack)class010552).fabric$isHidden()) continue;
            arrayList.add(string);
        }
        return arrayList;
    }

    private Object N(Object object, String string) {
        if ("resourcePacks".equals(string) && object instanceof List) {
            return class05606.N((List)object);
        }
        return object;
    }

    public void N(String string) {
        this.N.print(string);
        this.N.print(':');
    }

    @Override
    public <T> void N(String string, class04370<T> class043702) {
        class043702.method_42404().encodeStart((DynamicOps)JsonOps.INSTANCE, class043702.method_41753()).ifError(error -> class05630.N.error("Error saving option {}: {}", (Object)class043702, (Object)error.message())).ifSuccess(jsonElement -> {
            this.N(string);
            this.N.println(class05630.y.toJson(jsonElement));
        });
    }

    @Override
    public int N(String string, int n) {
        this.N(string);
        this.N.println(n);
        return n;
    }

    @Override
    public boolean N(String string, boolean bl) {
        this.N(string);
        this.N.println(bl);
        return bl;
    }

    @Override
    public String N(String string, String string2) {
        this.N(string);
        this.N.println(string2);
        return string2;
    }
}

