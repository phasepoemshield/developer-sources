/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.injection.access.base.IExtensionProtocolMetadataStorage
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.data.ClassicProtocolExtension
 */
package net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.storage;

import com.viaversion.viafabricplus.injection.access.base.IExtensionProtocolMetadataStorage;
import com.viaversion.viaversion.api.connection.StorableObject;
import java.util.EnumMap;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.data.ClassicProtocolExtension;

public class ExtensionProtocolMetadataStorage
implements IExtensionProtocolMetadataStorage,
StorableObject {
    private String serverSoftwareName = "classic";
    private short extensionCount = (short)-1;
    private short receivedExtensions = 0;
    private final EnumMap<ClassicProtocolExtension, Integer> serverExtensions = new EnumMap(ClassicProtocolExtension.class);

    public void incrementReceivedExtensions() {
        this.receivedExtensions = (short)(this.receivedExtensions + 1);
    }

    public void setExtensionCount(short s) {
        this.extensionCount = s;
    }

    public short getExtensionCount() {
        return this.extensionCount;
    }

    public boolean hasServerExtension(ClassicProtocolExtension classicProtocolExtension, int ... nArray) {
        Integer n = this.serverExtensions.get(classicProtocolExtension);
        if (n == null) {
            return false;
        }
        if (nArray.length == 0) {
            return true;
        }
        for (int n2 : nArray) {
            if (n2 != n) continue;
            return true;
        }
        return false;
    }

    public void addServerExtension(ClassicProtocolExtension classicProtocolExtension, int n) {
        this.serverExtensions.put(classicProtocolExtension, n);
    }

    public EnumMap viaFabricPlus$getServerExtensions() {
        return this.serverExtensions;
    }

    public void setServerSoftwareName(String string) {
        if (string.isEmpty()) {
            return;
        }
        this.serverSoftwareName = string;
    }

    public String getServerSoftwareName() {
        return this.serverSoftwareName;
    }

    public short getReceivedExtensions() {
        return this.receivedExtensions;
    }
}

