package org.freedesktop.dbus.connections.base;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import org.freedesktop.dbus.connections.BusAddress;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.IllegalThreadPoolStateException;
import org.freedesktop.dbus.interfaces.FatalException;
import org.freedesktop.dbus.messages.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from IncomingMessageThread.java
public class IncomingMessageThread extends Thread {
   private final ConnectionMessageHandler connection;
   private volatile boolean terminate;
   private final Logger logger = LoggerFactory.getLogger(this.getClass());

   @Override
   public void run() {
      while (!this.terminate) {
         Message msg = null;

         try {
            msg = this.connection.readIncoming();
            if (msg != null) {
               this.logger.trace("Read message from {}: {}", this.connection.getTransport(), msg);
               this.connection.handleMessage(msg);
            }
         } catch (DBusException | RejectedExecutionException | IllegalThreadPoolStateException var5) {
            if (var5 instanceof FatalException) {
               if (this.terminate) {
                  return;
               }

               this.logger.error("FatalException in connection thread", var5);
               if (this.connection.isConnected()) {
                  this.terminate = true;
                  if (var5.getCause() instanceof IOException ioe) {
                     this.connection.internalDisconnect(ioe);
                  } else {
                     this.connection.internalDisconnect(null);
                  }
               }

               return;
            }

            if (!this.terminate) {
               this.logger.error("Exception in connection thread", var5);
            }
         }
      }
   }

   public void terminate() {
      this.terminate = true;
      this.interrupt();
   }

   public IncomingMessageThread(ConnectionMessageHandler _connection, BusAddress _busAddress) {
      this.connection = Objects.requireNonNull(_connection);
      this.setName("DBusConnection [listener=" + _busAddress.isListeningSocket() + "]");
      this.setDaemon(true);
   }
}
