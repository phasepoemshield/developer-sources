/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus;

import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MethodTuple {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final String name;
    private final String sig;

    public String getName() {
        return this.name;
    }

    public MethodTuple(String _name, String _sig) {
        this.name = _name;
        this.sig = null != _sig ? _sig : "";
        this.logger.trace("new MethodTuple({}, {})", (Object)this.name, (Object)this.sig);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object _obj) {
        if (this == _obj) {
            return true;
        }
        if (!(_obj instanceof MethodTuple)) {
            return false;
        }
        MethodTuple other = (MethodTuple)_obj;
        if (!Objects.equals(this.name, other.name)) return false;
        if (!Objects.equals(this.sig, other.sig)) return false;
        return true;
    }

    public String getSig() {
        return this.sig;
    }

    public int hashCode() {
        Object[] objectArray = new Object[2];
        objectArray[0] = this.name;
        objectArray[1] = this.sig;
        return Objects.hash(objectArray);
    }

    public Logger getLogger() {
        return this.logger;
    }
}

