/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.Hashtable;
import java.util.Optional;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import minecraft.class03420;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@FunctionalInterface
public interface class03452 {
    public static final Logger N = LogUtils.getLogger();
    public static final class03452 y = class034202 -> Optional.empty();

    private static void N(DirContext dirContext, class03420 class034202, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThan(LegacyProtocolVersion.r1_3_1tor1_3_2)) {
            callbackInfoReturnable.setReturnValue(Optional.empty());
        }
    }

    public static class03452 N() {
        InitialDirContext initialDirContext;
        try {
            String string = "com.sun.jndi.dns.DnsContextFactory";
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            Hashtable<String, String> hashtable = new Hashtable<String, String>();
            hashtable.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
            hashtable.put("java.naming.provider.url", "dns:");
            hashtable.put("com.sun.jndi.dns.timeout.retries", "1");
            initialDirContext = new InitialDirContext(hashtable);
        }
        catch (Throwable throwable) {
            N.error("Failed to initialize SRV redirect resolved, some servers might not work", throwable);
            return y;
        }
        return class034202 -> {
            CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
            class03452.N(initialDirContext, class034202, callbackInfoReturnable);
            if (callbackInfoReturnable.isCancelled()) {
                return (Optional)callbackInfoReturnable.getReturnValue();
            }
            if (class034202.y() == 25565) {
                try {
                    Attribute attribute = initialDirContext.getAttributes("_minecraft._tcp." + class034202.N(), new String[]{"SRV"}).get("srv");
                    if (attribute != null) {
                        String[] stringArray = attribute.get().toString().split(" ", 4);
                        return Optional.of(new class03420(stringArray[3], class03420.L(stringArray[2])));
                    }
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            return Optional.empty();
        };
    }

    public Optional<class03420> lookupRedirect(class03420 var1);
}

