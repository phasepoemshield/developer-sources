/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class01285
 *  minecraft.class01894
 *  minecraft.class05335
 *  minecraft.class06134
 *  minecraft.class06202
 *  minecraft.class06276
 *  minecraft.class08326
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation
 *  org.apache.commons.io.FileUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.File;
import java.io.IOException;
import java.lang.runtime.SwitchBootstraps;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import minecraft.class01285;
import minecraft.class01894;
import minecraft.class05335;
import minecraft.class05679;
import minecraft.class05715;
import minecraft.class06134;
import minecraft.class06202;
import minecraft.class06276;
import minecraft.class08326;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation;
import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05731 {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 4649;
    private Map<class01894, class06276> L;
    private final List<class01894> u = new ArrayList<class01894>();
    private boolean i = false;
    private @Nullable class05679 R;
    private final File M;
    private long B;
    private final Codec<class05335> Z;

    public void L() {
        this.N(!this.i);
    }

    public boolean L(class01894 class018942) {
        class06276 class062762 = this.L.get(class018942);
        int n = 0;
        switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"ALWAYS_ON", "IN_OVERLAY", "NEVER"}, (class06276)class062762, (int)n)) {
            case 0: {
                this.N(class018942, class06276.field_61595);
                return false;
            }
            case 1: {
                if (this.i) {
                    this.N(class018942, class06276.field_61595);
                    return false;
                }
                this.N(class018942, class06276.field_61593);
                return true;
            }
            case 2: {
                if (this.i) {
                    this.N(class018942, class06276.field_61594);
                } else {
                    this.N(class018942, class06276.field_61593);
                }
                return true;
            }
        }
        this.N(class018942, class06276.field_61593);
        return true;
    }

    private void L(CallbackInfo callbackInfo) {
        class01894 class018942;
        class01894 class018943 = class018942 = PlatformRuntimeInformation.getInstance().isDevelopmentEnvironment() ? SodiumClientMod.SODIUM_DEBUG_ENTRY_FULL : SodiumClientMod.SODIUM_DEBUG_ENTRY_REDUCED;
        if (!this.L.containsKey(class018942)) {
            this.L.put(class018942, class06276.field_61594);
        }
        if (!this.L.containsKey(SodiumClientMod.SODIUM_FPS_PERCENTILES)) {
            this.L.put(SodiumClientMod.SODIUM_FPS_PERCENTILES, class06276.field_61594);
        }
    }

    public void M() {
        class05335 class053352 = new class05335(Optional.ofNullable(this.R), this.R == null ? Optional.of(this.L) : Optional.empty());
        try {
            FileUtils.writeStringToFile((File)this.M, (String)((JsonElement)this.Z.encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)class053352).getOrThrow()).toString(), (Charset)StandardCharsets.UTF_8);
        }
        catch (IOException iOException) {
            N.error("Failed to save debug profile file {}", (Object)this.M, (Object)iOException);
        }
    }

    public class05731(File file) {
        this.M = new File(file, "debug-profile.json");
        this.Z = class05715.field_63266.N(class05335.N, class06202.Nq().Nh(), 4649);
        this.N();
    }

    private void B() {
        this.R = class05679.field_61599;
        this.L = new HashMap<class01894, class06276>((Map)class06134.c.get((Object)class05679.field_61599));
        this.y((CallbackInfo)null);
    }

    private void Z() {
        this.L.put(class06134.Z, class06276.field_61594);
        this.L.put(class06134.U, class06276.field_61594);
        this.L.put(class06134.E, class06276.field_61594);
        this.L.put(class06134.u, class06276.field_61594);
        this.L.put(class06134.i, class06276.field_61594);
        this.L.put(SodiumClientMod.SODIUM_FPS_PERCENTILES, class06276.field_61594);
    }

    public void i() {
        this.N((CallbackInfo)null);
        this.L((CallbackInfo)null);
        this.u.clear();
        boolean bl = class06202.Nq().h();
        for (Map.Entry<class01894, class06276> entry : this.L.entrySet()) {
            class01285 class012852;
            if (entry.getValue() != class06276.field_61593 && (!this.i || entry.getValue() != class06276.field_61594) || (class012852 = class06134.N((class01894)entry.getKey())) == null || !class012852.method_72753(bl)) continue;
            this.u.add(entry.getKey());
        }
        this.u.sort(class01894::compareTo);
        ++this.B;
    }

    private void z() {
        this.L.put(class06134.Z, class06276.field_61594);
        this.L.put(SodiumClientMod.SODIUM_FPS_PERCENTILES, class06276.field_61594);
    }

    public boolean u() {
        return this.i;
    }

    private void y(CallbackInfo callbackInfo) {
        this.Z();
    }

    public boolean y(class01894 class018942) {
        return this.u.contains(class018942);
    }

    public boolean y(class05679 class056792) {
        return this.R == class056792;
    }

    public Collection<class01894> y() {
        return this.u;
    }

    private void N(CallbackInfo callbackInfo) {
        if (!this.L.containsKey(class01894.N((String)"iris", (String)"iris"))) {
            this.L.put(class01894.N((String)"iris", (String)"iris"), class06276.field_61594);
        }
        if (PlatformRuntimeInformation.getInstance().isDevelopmentEnvironment() && !this.L.containsKey(class01894.N((String)"iris", (String)"debug"))) {
            this.L.put(class01894.N((String)"iris", (String)"debug"), class06276.field_61594);
        }
    }

    public void N(class01894 class018942, class06276 class062762) {
        this.R = null;
        this.L.put(class018942, class062762);
        this.i();
        this.M();
    }

    private void N(class05679 class056792, CallbackInfo callbackInfo) {
        if (class056792 == class05679.field_61600 && !PlatformRuntimeInformation.getInstance().isDevelopmentEnvironment()) {
            this.z();
        } else {
            this.Z();
        }
    }

    public class06276 N(class01894 class018942) {
        class06276 class062762 = this.L.get(class018942);
        if (class062762 == null) {
            return class06276.field_61595;
        }
        return class062762;
    }

    public void N(boolean bl) {
        if (this.i != bl) {
            this.i = bl;
            this.i();
        }
    }

    public void N() {
        try {
            if (!this.M.isFile()) {
                this.B();
                this.i();
                return;
            }
            Dynamic dynamic = new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)class08326.N((String)FileUtils.readFileToString((File)this.M, (Charset)StandardCharsets.UTF_8)));
            class05335 class053352 = (class05335)this.Z.parse(dynamic).getOrThrow(string -> new IOException("Could not parse debug profile JSON: " + string));
            if (class053352.N().isPresent()) {
                this.N((class05679)((Object)class053352.N().get()));
            } else {
                this.L = new HashMap<class01894, class06276>();
                if (class053352.y().isPresent()) {
                    this.L.putAll((Map)class053352.y().get());
                }
                this.R = null;
            }
        }
        catch (JsonSyntaxException | IOException throwable) {
            N.error("Couldn't read debug profile file {}, resetting to default", (Object)this.M, (Object)throwable);
            this.B();
            this.M();
        }
        this.i();
    }

    public void N(class05679 class056792) {
        this.R = class056792;
        Map var2 = (Map)class06134.c.get((Object)class056792);
        this.L = new HashMap<class01894, class06276>(var2);
        this.N(class056792, null);
        this.i();
    }

    public long R() {
        return this.B;
    }
}

