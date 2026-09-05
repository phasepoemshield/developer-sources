/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  de.florianreuth.classic4j.BetaCraftHandler
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.provider.ClassicMPPassProvider
 *  net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.provider.OldAuthProvider
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.provider.vialegacy;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.settings.impl.AuthenticationSettings;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import de.florianreuth.classic4j.BetaCraftHandler;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.provider.ClassicMPPassProvider;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.provider.OldAuthProvider;

public final class ViaFabricPlusClassicMPPassProvider
extends ClassicMPPassProvider {
    public static String classicubeMPPass;

    public String getMpPass(UserConnection userConnection) {
        if (classicubeMPPass != null) {
            String string2 = classicubeMPPass;
            classicubeMPPass = null;
            return string2;
        }
        if (((Boolean)AuthenticationSettings.INSTANCE.useBetaCraftAuthentication.getValue()).booleanValue()) {
            BetaCraftHandler.authenticate(string -> {
                try {
                    ((OldAuthProvider)Via.getManager().getProviders().get(OldAuthProvider.class)).sendAuthRequest(userConnection, string);
                }
                catch (Throwable throwable) {
                    ViaFabricPlusImpl.INSTANCE.getLogger().error("Error occurred while verifying session", throwable);
                }
            }, throwable -> ViaFabricPlusImpl.INSTANCE.getLogger().error("Error occurred while requesting the MP-Pass to verify session", throwable));
        }
        return super.getMpPass(userConnection);
    }
}

