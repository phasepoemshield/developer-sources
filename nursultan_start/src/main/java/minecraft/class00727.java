/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class00751
 *  minecraft.class00752
 *  minecraft.class01921
 *  minecraft.class05946
 *  net.fabricmc.fabric.impl.tag.SimpleRegistryExtension
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import minecraft.class00720;
import minecraft.class00731;
import minecraft.class00751;
import minecraft.class00752;
import minecraft.class01921;
import minecraft.class05946;
import net.fabricmc.fabric.impl.tag.SimpleRegistryExtension;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

class class00727<T>
implements class00720<T> {
    final /* synthetic */ Map N;
    final /* synthetic */ class01921 y;
    final /* synthetic */ ImmutableMap L;
    final /* synthetic */ class00731 u;

    @Override
    public class01921<T> L() {
        return this.y;
    }

    class00727(class00731 class007312, Map map, class01921 class019212, ImmutableMap immutableMap) {
        this.u = class007312;
        this.N = map;
        this.y = class019212;
        this.L = immutableMap;
    }

    @Override
    public void u() {
        this.L.forEach((class035302, class035522) -> {
            List list = this.N.getOrDefault(class035302, List.of());
            class035522.y(list);
        });
        this.u.L = class00752.N((Map)this.L);
        this.N(null);
        this.u.m();
    }

    @Override
    public int y() {
        return this.N.size();
    }

    @Override
    public class05946<? extends class00751<? extends T>> N() {
        return this.u.i();
    }

    private void N(CallbackInfo callbackInfo) {
        ((SimpleRegistryExtension)this.u).fabric_applyPendingTagAliases();
    }
}

