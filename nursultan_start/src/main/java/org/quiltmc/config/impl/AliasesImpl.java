/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.metadata.Aliases
 */
package org.quiltmc.config.impl;

import java.security.InvalidParameterException;
import java.util.List;
import org.quiltmc.config.api.metadata.Aliases;
import org.quiltmc.config.impl.StringIterator;

public final class AliasesImpl
extends StringIterator
implements Aliases {
    public AliasesImpl(List object) {
        super((List)object);
        object = object.iterator();
        while (object.hasNext()) {
            if (!((String)object.next()).contains(" ")) continue;
            throw new InvalidParameterException("Cannot create an alias that contains a space!");
        }
    }
}

