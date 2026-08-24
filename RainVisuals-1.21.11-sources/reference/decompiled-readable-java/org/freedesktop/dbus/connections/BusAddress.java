/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.connections;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import org.freedesktop.dbus.exceptions.InvalidBusAddressException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BusAddress {
    private final Map<String, String> parameters = new LinkedHashMap<String, String>();
    private String type;
    private static final Logger LOGGER = LoggerFactory.getLogger(BusAddress.class);

    public String getParameterValue(String _parameter) {
        return this.parameters.get(_parameter);
    }

    public boolean isServer() {
        return this.isListeningSocket();
    }

    public final String toString() {
        return this.type + ":" + this.parameters.entrySet().stream().map(e -> (String)e.getKey() + "=" + (String)e.getValue()).collect(Collectors.joining(","));
    }

    public BusAddress removeParameter(String _parameter) {
        this.parameters.remove(_parameter);
        return this;
    }

    public boolean isBusType(String _type) {
        return this.type != null && this.type.equalsIgnoreCase(_type);
    }

    protected BusAddress(BusAddress _obj) {
        if (_obj != null) {
            this.parameters.putAll(_obj.parameters);
            this.type = _obj.type;
        }
    }

    public String getType() {
        return this.type;
    }

    public static BusAddress of(BusAddress _address) {
        return new BusAddress(_address);
    }

    /*
     * WARNING - void declaration
     */
    public static BusAddress of(String _address) {
        void var1_1;
        if (_address == null || _address.isEmpty()) {
            throw new InvalidBusAddressException("Bus address is blank");
        }
        BusAddress busAddress = new BusAddress(null);
        LOGGER.trace("Parsing bus address: {}", (Object)_address);
        String[] ss = _address.split(":", 2);
        if (ss.length < 2) {
            throw new InvalidBusAddressException("Bus address is invalid: " + _address);
        }
        busAddress.type = ss[0] != null ? ss[0].toLowerCase(Locale.US) : null;
        if (busAddress.type == null) {
            throw new InvalidBusAddressException("Unsupported transport type: " + ss[0]);
        }
        LOGGER.trace("Transport type: {}", (Object)busAddress.type);
        String[] ps = ss[1].split(",");
        String[] stringArray = ps;
        int n = stringArray.length;
        for (int i = 0; i < n; ++i) {
            String p = stringArray[i];
            String[] stringArray2 = p.split("=", 2);
            busAddress.addParameter(stringArray2[0], stringArray2[1]);
        }
        LOGGER.trace("Transport options: {}", (Object)var1_1.parameters);
        return var1_1;
    }

    public boolean isListeningSocket() {
        return this.parameters.containsKey("listen");
    }

    public String getParameterValue(String _parameter, String _default) {
        return this.parameters.getOrDefault(_parameter, _default);
    }

    public String getBusType() {
        return this.type == null ? null : this.type.toUpperCase(Locale.US);
    }

    public BusAddress addParameter(String _parameter, String _value) {
        this.parameters.put(_parameter, _value);
        return this;
    }

    public boolean hasParameter(String _parameter) {
        return this.parameters.containsKey(_parameter);
    }

    public BusAddress getListenerAddress() {
        if (!this.isListeningSocket()) {
            return new BusAddress(this).addParameter("listen", "true");
        }
        return this;
    }

    public String getGuid() {
        return this.parameters.get("guid");
    }
}

