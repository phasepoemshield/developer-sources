/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09942
 *  net.caffeinemc.mods.lithium.common.services.PlatformMappingInformation
 *  net.fabricmc.loader.api.FabricLoader
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package net.caffeinemc.mods.lithium.fabric;

import Nursultan.class09942;
import net.caffeinemc.mods.lithium.common.services.PlatformMappingInformation;
import net.fabricmc.loader.api.FabricLoader;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class FabricMappingInformation
implements PlatformMappingInformation {
    public String mapMethodName(String string, String string2, String string3, String string4, String string5) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$cek000$ntf-patcher$inlineReflectionUse(string, string2, string3, string4, string5, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (String)callbackInfoReturnable.getReturnValue();
        }
        return FabricLoader.getInstance().getMappingResolver().mapMethodName(string, string2, string3, string4);
    }

    public void handler$cek000$ntf-patcher$inlineReflectionUse(String string, String string2, String string3, String string4, String string5, CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)((class09942)class09942.y_0).N(string, string2, string3, string4, string5));
    }
}

