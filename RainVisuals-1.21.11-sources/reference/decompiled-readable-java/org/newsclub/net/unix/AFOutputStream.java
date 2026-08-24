/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
 */
package org.newsclub.net.unix;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.newsclub.net.unix.FileDescriptorAccess;

@IgnoreJRERequirement
public abstract class AFOutputStream
extends OutputStream
implements FileDescriptorAccess {
    AFOutputStream() {
    }

    public long transferFrom(InputStream in) throws IOException {
        return in.transferTo(this);
    }
}

