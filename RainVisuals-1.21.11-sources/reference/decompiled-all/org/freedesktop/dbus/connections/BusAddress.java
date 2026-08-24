package org.freedesktop.dbus.connections;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import org.freedesktop.dbus.exceptions.InvalidBusAddressException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from BusAddress.java
public class BusAddress {
   private final Map<String, String> parameters = new LinkedHashMap<>();
   private String type;
   private static final Logger LOGGER = LoggerFactory.getLogger(BusAddress.class);

   public String getParameterValue(String _parameter) {
      return this.parameters.get(_parameter);
   }

   public boolean isServer() {
      return this.isListeningSocket();
   }

   @Override
   public final String toString() {
      return this.type + ":" + this.parameters.entrySet().stream().map(e -> e.getKey() + "=" + e.getValue()).collect(Collectors.joining(","));
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

   public static BusAddress of(String _address) {
      if (_address != null && !_address.isEmpty()) {
         BusAddress busAddress = new BusAddress((BusAddress)null);
         LOGGER.trace("Parsing bus address: {}", _address);
         String[] ss = _address.split(":", 2);
         if (ss.length < 2) {
            throw new InvalidBusAddressException("Bus address is invalid: " + _address);
         }

         busAddress.type = ss[0] != null ? ss[0].toLowerCase(Locale.US) : null;
         if (busAddress.type == null) {
            throw new InvalidBusAddressException("Unsupported transport type: " + ss[0]);
         }

         LOGGER.trace("Transport type: {}", busAddress.type);
         String[] ps = ss[1].split(",");

         for (String p : ps) {
            String[] kv = p.split("=", 2);
            busAddress.addParameter(kv[0], kv[1]);
         }

         LOGGER.trace("Transport options: {}", busAddress.parameters);
         return busAddress;
      } else {
         throw new InvalidBusAddressException("Bus address is blank");
      }
   }

   public boolean isListeningSocket() {
      return this.parameters.containsKey("listen");
   }

   public String getParameterValue(String _default, String _parameter) {
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
      return !this.isListeningSocket() ? new BusAddress(this).addParameter("listen", "true") : this;
   }

   public String getGuid() {
      return this.parameters.get("guid");
   }
}
