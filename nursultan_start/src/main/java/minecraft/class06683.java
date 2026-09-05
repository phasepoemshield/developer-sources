/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10640
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class00392
 *  minecraft.class00490
 *  minecraft.class00493
 *  minecraft.class00497
 *  minecraft.class00502
 *  minecraft.class00518
 *  minecraft.class01762
 *  minecraft.class01765
 *  minecraft.class01766
 *  minecraft.class01770
 *  minecraft.class01772
 *  minecraft.class01788
 *  minecraft.class01890
 *  minecraft.class07049
 *  minecraft.class08036
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10640;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00490;
import minecraft.class00493;
import minecraft.class00497;
import minecraft.class00502;
import minecraft.class00518;
import minecraft.class01762;
import minecraft.class01765;
import minecraft.class01766;
import minecraft.class01770;
import minecraft.class01772;
import minecraft.class01788;
import minecraft.class01890;
import minecraft.class06640;
import minecraft.class06675;
import minecraft.class06679;
import minecraft.class07049;
import minecraft.class08036;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06683 {
    public static final String N = "#";
    private static final Logger y = LogUtils.getLogger();
    private final Object2ObjectMap<String, class00518> L = new Object2ObjectOpenHashMap(16, 0.5f);
    private final Reference2ObjectMap<class06675, List<class00518>> u = new Reference2ObjectOpenHashMap();
    private final Map<String, class01770> i = new Object2ObjectOpenHashMap(16, 0.5f);
    private final Map<class01890, class00518> R = new EnumMap<class01890, class00518>(class01890.class);
    private final Object2ObjectMap<String, class00502> M = new Object2ObjectOpenHashMap();
    private final Object2ObjectMap<String, class00502> B = new Object2ObjectOpenHashMap();

    public void L(class01766 class017662) {
    }

    public Collection<class01766> L() {
        return this.i.keySet().stream().map(class01766::N).toList();
    }

    public class00502 L(String string) {
        class00502 class005022 = this.y(string);
        if (class005022 != null) {
            y.warn("Requested creation of existing team '{}'", (Object)string);
            return class005022;
        }
        class005022 = new class00502(this, string);
        this.M.put((Object)string, (Object)class005022);
        this.y(class005022);
        return class005022;
    }

    public void L(class01766 class017662, class00518 class005182) {
        class01770 class017702 = this.i.get(class017662.method_5820());
        if (class017702 != null) {
            boolean bl = class017702.y(class005182);
            if (!class017702.N()) {
                if (this.i.remove(class017662.method_5820()) != null) {
                    this.L(class017662);
                }
            } else if (bl) {
                this.i(class017662, class005182);
            }
        }
    }

    public void L(class00502 class005022) {
    }

    public void L(class00518 class005182) {
    }

    protected List<class00497> M() {
        return this.i().stream().map(class00502::N).toList();
    }

    protected List<class00493> B() {
        return this.N().stream().map(class00518::N).toList();
    }

    protected Map<class01890, String> Z() {
        EnumMap<class01890, String> enumMap = new EnumMap<class01890, String>(class01890.class);
        for (class01890 class018902 : class01890.values()) {
            class00518 class005182 = this.N(class018902);
            if (class005182 == null) continue;
            enumMap.put(class018902, class005182.L());
        }
        return enumMap;
    }

    public void i(class00518 class005182) {
    }

    public void i(class01766 class017662, class00518 class005182) {
    }

    public Collection<class00502> i() {
        return this.M.values();
    }

    public @Nullable class00502 i(String string) {
        return (class00502)this.B.get((Object)string);
    }

    public boolean u(String string) {
        class00502 class005022 = this.i(string);
        if (class005022 != null) {
            this.y(string, class005022);
            return true;
        }
        return false;
    }

    public Collection<String> u() {
        return this.M.keySet();
    }

    public void u(class00518 class005182) {
    }

    public void u(class01766 class017662, class00518 class005182) {
    }

    public void u(class00502 class005022) {
    }

    public @Nullable class00502 y(String string) {
        return (class00502)this.M.get((Object)string);
    }

    public void y(class00518 class005182) {
        this.L.remove((Object)class005182.L());
        for (class01890 class018902 : class01890.values()) {
            if (this.N(class018902) != class005182) continue;
            this.N(class018902, null);
        }
        List var2 = (List)this.u.get((Object)class005182.u());
        if (var2 != null) {
            var2.remove(class005182);
        }
        for (class01770 class017702 : this.i.values()) {
            class017702.y(class005182);
        }
        this.i(class005182);
    }

    public Object2IntMap<class00518> y(class01766 class017662) {
        class01770 class017702 = this.i.get(class017662.method_5820());
        return class017702 != null ? class017702.y() : Object2IntMaps.emptyMap();
    }

    public void y(class00502 class005022) {
    }

    public void y(String string, class00502 class005022) {
        if (this.i(string) != class005022) {
            throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + class005022.L() + "'.");
        }
        this.B.remove((Object)string);
        class005022.B().remove(string);
    }

    public Collection<String> y() {
        return this.L.keySet();
    }

    public @Nullable class01788 y(class01766 class017662, class00518 class005182) {
        class01770 class017702 = this.i.get(class017662.method_5820());
        if (class017702 != null) {
            return class017702.N(class005182);
        }
        return null;
    }

    public Collection<class00518> N() {
        return this.L.values();
    }

    protected void N(class00493 class004932) {
        this.N(class004932.N(), class004932.y(), class004932.L(), class004932.u(), class004932.i(), class004932.R().orElse(null));
    }

    public class00518 N(String string, class06675 class066752, class00392 class003922, class06640 class066402, boolean bl, @Nullable class01762 class017622) {
        if (this.L.containsKey((Object)string)) {
            throw new IllegalArgumentException("An objective with the name '" + string + "' already exists!");
        }
        class00518 class005182 = new class00518(this, string, class066752, class003922, class066402, bl, class017622);
        ((List)this.u.computeIfAbsent((Object)class066752, object -> Lists.newArrayList())).add(class005182);
        this.L.put((Object)string, (Object)class005182);
        this.L(class005182);
        return class005182;
    }

    public void N(class01766 class017662) {
        if (this.i.remove(class017662.method_5820()) != null) {
            this.L(class017662);
        }
    }

    protected void N(class00497 class004972) {
        class00502 class005022 = this.L(class004972.N());
        class004972.y().ifPresent(arg_0 -> ((class00502)class005022).N(arg_0));
        class004972.L().ifPresent(arg_0 -> ((class00502)class005022).N(arg_0));
        class005022.N(class004972.u());
        class005022.y(class004972.i());
        class005022.y(class004972.R());
        class005022.L(class004972.M());
        class005022.N(class004972.B());
        class005022.y(class004972.Z());
        class005022.N(class004972.z());
        for (String string : class004972.U()) {
            this.N(string, class005022);
        }
    }

    public @Nullable class00518 N(@Nullable String string) {
        return (class00518)this.L.get((Object)string);
    }

    public boolean N(String string, class00502 class005022) {
        if (this.i(string) != null) {
            this.u(string);
        }
        this.B.put((Object)string, (Object)class005022);
        return class005022.B().add(string);
    }

    public void N(class01766 class017662, class00518 class005182, class00490 class004902) {
    }

    public void N(class01890 class018902, @Nullable class00518 class005182) {
        this.R.put(class018902, class005182);
    }

    public @Nullable class00518 N(class01890 class018902) {
        return this.R.get(class018902);
    }

    public class01765 N(class01766 class017662, class00518 class005182) {
        return this.N(class017662, class005182, false);
    }

    public class01765 N(class01766 class017662, class00518 class005182, boolean bl) {
        boolean bl2 = bl || !class005182.u().L();
        class01770 class017702 = this.R(class017662.method_5820());
        MutableBoolean mutableBoolean = new MutableBoolean();
        class00490 class004903 = class017702.N(class005182, (T class004902) -> mutableBoolean.setTrue());
        return new class10640(this, class004903, bl2, mutableBoolean, class005182, class017662);
    }

    public void N(class00502 class005022) {
        this.M.remove((Object)class005022.L());
        for (String string : class005022.B()) {
            this.B.remove((Object)string);
        }
        this.u(class005022);
    }

    protected void N(class06679 class066792) {
        class00518 class005182 = this.N(class066792.y());
        if (class005182 == null) {
            y.error("Unknown objective {} for name {}, ignoring", (Object)class066792.y(), (Object)class066792.N());
            return;
        }
        this.R(class066792.N()).N(class005182, new class00490(class066792.L()));
    }

    public Collection<class01772> N(class00518 class005182) {
        ArrayList<class01772> arrayList = new ArrayList<class01772>();
        this.i.forEach((string, class017702) -> {
            class00490 class004902 = class017702.N(class005182);
            if (class004902 != null) {
                arrayList.add(new class01772(string, class004902.y(), class004902.u(), class004902.i()));
            }
        });
        return arrayList;
    }

    public final void N(class06675 class066752, class01766 class017662, Consumer<class01765> consumer) {
        ((List)this.u.getOrDefault((Object)class066752, Collections.emptyList())).forEach(class005182 -> consumer.accept(this.N(class017662, (class00518)class005182, true)));
    }

    public void N(class07049 class070492) {
        if (class070492 instanceof class08036 || class070492.method_5805()) {
            return;
        }
        this.N((class01766)class070492);
        this.u(class070492.method_5820());
    }

    private class01770 R(String string2) {
        return this.i.computeIfAbsent(string2, string -> new class01770());
    }

    protected List<class06679> R() {
        return this.i.entrySet().stream().flatMap(entry2 -> {
            String string = (String)entry2.getKey();
            return ((class01770)entry2.getValue()).L().entrySet().stream().map(entry -> new class06679(string, ((class00518)entry.getKey()).L(), ((class00490)entry.getValue()).N()));
        }).toList();
    }
}

