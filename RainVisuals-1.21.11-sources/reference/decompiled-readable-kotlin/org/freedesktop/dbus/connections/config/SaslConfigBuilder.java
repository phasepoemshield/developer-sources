package org.freedesktop.dbus.connections.config;

import java.util.OptionalLong;
import org.freedesktop.dbus.connections.transports.TransportBuilder;

// $VF: Compiled from SaslConfigBuilder.java
public final class SaslConfigBuilder<R> {
   private final TransportConfigBuilder<?, R> transportBuilder;
   private SaslConfig saslConfig = new SaslConfig();

   public TransportConfigBuilder<?, R> back() {
      return this.transportBuilder;
   }

   SaslConfigBuilder(TransportConfigBuilder<?, R> _transportBuilder) {
      this.transportBuilder = _transportBuilder;
   }

   public SaslConfigBuilder<R> withStrictCookiePermissions(boolean _strictCookiePermissions) {
      this.saslConfig.setStrictCookiePermissions(_strictCookiePermissions);
      return this;
   }

   public SaslConfig build() {
      return this.saslConfig;
   }

   public SaslConfigBuilder<R> withSaslUid(Long _saslUid) {
      this.saslConfig.setSaslUid(OptionalLong.of(_saslUid));
      return this;
   }

   SaslConfigBuilder<R> withConfig(SaslConfig _cfg) {
      if (_cfg != null) {
         this.saslConfig = _cfg;
      }

      return this;
   }

   public SaslConfigBuilder<R> withAuthMode(TransportBuilder.SaslAuthMode _types) {
      if (_types != null) {
         this.saslConfig.setAuthMode(_types.getAuthMode());
      }

      return this;
   }
}
