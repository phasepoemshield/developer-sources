package org.freedesktop.dbus.connections;

import com.sun.security.auth.module.UnixSystem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.NetworkChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.PosixFilePermission;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import org.freedesktop.dbus.connections.config.SaslConfig;
import org.freedesktop.dbus.connections.transports.AbstractTransport;
import org.freedesktop.dbus.connections.transports.AbstractUnixTransport;
import org.freedesktop.dbus.exceptions.AuthenticationException;
import org.freedesktop.dbus.exceptions.SocketClosedException;
import org.freedesktop.dbus.messages.Message;
import org.freedesktop.dbus.utils.Hexdump;
import org.freedesktop.dbus.utils.LoggingHelper;
import org.freedesktop.dbus.utils.TimeMeasure;
import org.freedesktop.dbus.utils.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from SASL.java
public class SASL {
   public static final int AUTH_EXTERNAL = 1;
   public static final int AUTH_ANON = 4;
   private static final String SYSPROP_USER_HOME = System.getProperty("user.home");
   private String cookie;
   public static final int LOCK_TIMEOUT = 1000;
   private static final int MAX_READ_BYTES = 1048576;
   public static final String COOKIE_CONTEXT = "org_freedesktop_java";
   private static final Collator COL = Collator.getInstance();
   private String challenge = "";
   private static final String AUTH_TYPE_EXTERNAL = "EXTERNAL";
   private static final Random RANDOM = new Random();
   private static final String AUTH_TYPE_ANONYMOUS = "ANONYMOUS";
   public static final int AUTH_NONE = 0;
   public static final int MAX_TIME_TRAVEL_SECONDS = 300;
   private static final File DBUS_KEYRINGS_DIR = new File(SYSPROP_USER_HOME, ".dbus-keyrings");
   private static final String DBUS_TEST_HOME_DIR = System.getProperty("DBUS_TEST_HOMEDIR");
   private static final String AUTH_TYPE_DBUS_COOKIE_SHA1 = "DBUS_COOKIE_SHA1";
   private boolean fileDescriptorSupported;
   public static final int NEW_KEY_TIMEOUT_SECONDS = 300;
   public static final int AUTH_SHA = 2;
   private static final Set<PosixFilePermission> BAD_FILE_PERMISSIONS = Set.of(
      PosixFilePermission.GROUP_EXECUTE,
      PosixFilePermission.GROUP_READ,
      PosixFilePermission.GROUP_WRITE,
      PosixFilePermission.OTHERS_EXECUTE,
      PosixFilePermission.OTHERS_READ,
      PosixFilePermission.OTHERS_WRITE
   );
   private final Logger logger;
   public static final int COOKIE_TIMEOUT = 240;
   public static final int EXPIRE_KEYS_TIMEOUT_SECONDS = 420;
   private final SaslConfig saslConfig;
   private static final String INVALID_CMD_ERR = "Got invalid command";

   public boolean isFileDescriptorSupported() {
      return this.fileDescriptorSupported;
   }

   private long getUserId() {
      return !Util.isWindows() ? new UnixSystem().getUid() : 0L;
   }

   private byte getNibble(char _c) {
      return switch (_c) {
         case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> (byte)(_c - '0');
         default -> 0;
         case 'A', 'B', 'C', 'D', 'E', 'F' -> (byte)(_c - 'A' + 10);
         case 'a', 'b', 'c', 'd', 'e', 'f' -> (byte)(_c - 'a' + 10);
      };
   }

   public SASL(SaslConfig _saslConfig) {
      this.cookie = "";
      this.logger = LoggerFactory.getLogger(this.getClass());
      this.saslConfig = Objects.requireNonNull(_saslConfig, "Sasl Configuration required");
   }

   private String stupidlyDecode(String _data) {
      char[] cs = new char[_data.length()];
      char[] res = new char[cs.length / 2];
      _data.getChars(0, _data.length(), cs, 0);
      int i = 0;

      for (int j = 0; j < res.length; j++) {
         int b = 0;
         b |= this.getNibble(cs[i]) << 4;
         b |= this.getNibble(cs[i + 1]);
         res[j] = (char)b;
         i += 2;
      }

      return new String(res);
   }

   public void send(SocketChannel _command, SASL.SaslCommand _sock, String... _data) throws IOException {
      StringBuilder sb = new StringBuilder();
      sb.append(_command.name());

      for (String s : _data) {
         sb.append(' ');
         sb.append(s);
      }

      sb.append('\r');
      sb.append('\n');
      this.logger.trace("sending: {}", sb);
      _sock.write(ByteBuffer.wrap(sb.toString().getBytes()));
   }

   SASL.SaslResult doChallenge(int _c, SASL.Command _auth) throws IOException {
      switch (_auth) {
         case 2:
            String[] reply = this.stupidlyDecode(_c.getData()).split(" ");
            LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> this.logger.trace("Auth data: {}", Arrays.toString(reply)));
            if (3 != reply.length) {
               this.logger.debug("Reply is not length 3");
               return SASL.SaslResult.ERROR;
            } else {
               String context = reply[0];
               String id = reply[1];
               String serverchallenge = reply[2];
               MessageDigest md = null;

               try {
                  md = MessageDigest.getInstance("SHA");
               } catch (NoSuchAlgorithmException _ex) {
                  this.logger.debug("Could not find SHA algorithm", _ex);
                  return SASL.SaslResult.ERROR;
               }

               byte[] buf = new byte[8];
               long seed = Optional.of(System.nanoTime()).map(t -> t < 0L ? t * -1L : t).get();
               Message.marshallintBig(seed, buf, 0, 8);
               String clientchallenge = this.stupidlyEncode(md.digest(buf));
               md.reset();
               TimeMeasure tm = new TimeMeasure();
               String lCookie = null;

               while (lCookie == null && tm.getElapsed() < 1000L) {
                  lCookie = this.findCookie(context, id);
               }

               if (lCookie == null) {
                  this.logger.debug("Did not find a cookie in context {}  with ID {}", context, id);
                  return SASL.SaslResult.ERROR;
               } else {
                  String response = serverchallenge + ":" + clientchallenge + ":" + lCookie;
                  buf = md.digest(response.getBytes());
                  if (this.logger.isTraceEnabled()) {
                     this.logger.trace("Response: {} hash: {}", response, Hexdump.format(buf));
                  }

                  response = this.stupidlyEncode(buf);
                  _c.setResponse(this.stupidlyEncode(clientchallenge + " " + response));
                  return SASL.SaslResult.OK;
               }
            }
         case 4:
            _c.setResponse(_c.getData() == null ? "" : _c.getData());
            return SASL.SaslResult.OK;
         default:
            this.logger.debug("Not DBUS_COOKIE_SHA1 authtype.");
            return SASL.SaslResult.ERROR;
      }
   }

   public boolean auth(SocketChannel _transport, AbstractTransport _sock) throws IOException {
      String luid = null;
      String kernelUid = null;
      long uid = this.saslConfig.getSaslUid().orElse(this.getUserId());
      luid = this.stupidlyEncode(uid + "");
      int failed = 0;
      int current = 0;
      SASL.SaslAuthState state = SASL.SaslAuthState.INITIAL_STATE;

      while (state != SASL.SaslAuthState.FINISHED && state != SASL.SaslAuthState.FAILED) {
         this.logger.trace("Mode: {} AUTH state: {}", this.saslConfig.getMode(), state);
         switch (this.saslConfig.getMode()) {
            case CLIENT:
               switch (state) {
                  case WAIT_REJECT:
                     ByteBuffer buf = ByteBuffer.allocate(1);
                     if (_sock instanceof NetworkChannel) {
                        _sock.read(buf);
                        state = SASL.SaslAuthState.WAIT_AUTH;
                     } else {
                        try {
                           int kuid = -1;
                           if (_transport instanceof AbstractUnixTransport aut) {
                              kuid = aut.getUid(_sock);
                           }

                           if (kuid >= 0) {
                              kernelUid = this.stupidlyEncode(kuid + "");
                           }

                           state = SASL.SaslAuthState.WAIT_AUTH;
                        } catch (SocketException _ex) {
                           state = SASL.SaslAuthState.FAILED;
                        }
                     }
                     continue;
                  case INITIAL_STATE:
                     SASL.Command c = this.receive(_sock);
                     switch (c.getCommand()) {
                        case REJECTED:
                           switch (this.doResponse(current, luid, kernelUid, c)) {
                              case CONTINUE:
                                 this.send(_sock, SASL.SaslCommand.OK, this.saslConfig.getGuid());
                                 state = SASL.SaslAuthState.WAIT_BEGIN;
                                 current = 0;
                                 continue;
                              case OK:
                                 this.send(_sock, SASL.SaslCommand.DATA, c.getResponse());
                                 state = SASL.SaslAuthState.WAIT_DATA;
                                 continue;
                              case ERROR:
                              case REJECT:
                              default:
                                 this.send(_sock, SASL.SaslCommand.REJECTED, this.convertAuthTypes(this.saslConfig.getAuthMode()));
                                 current = 0;
                                 continue;
                           }
                        case NEGOTIATE_UNIX_FD:
                        case BEGIN:
                        default:
                           this.send(_sock, SASL.SaslCommand.ERROR, "Got invalid command");
                           continue;
                        case AGREE_UNIX_FD:
                           state = SASL.SaslAuthState.FAILED;
                           continue;
                        case CANCEL:
                        case AUTH:
                           this.send(_sock, SASL.SaslCommand.REJECTED, this.convertAuthTypes(this.saslConfig.getAuthMode()));
                           state = SASL.SaslAuthState.WAIT_AUTH;
                           continue;
                     }
                  case WAIT_BEGIN:
                  case WAIT_AUTH:
                  default:
                     state = SASL.SaslAuthState.FAILED;
                     continue;
                  case FAILED:
                     SASL.Command c = this.receive(_sock);
                     switch (c.getCommand()) {
                        case ERROR:
                           switch (this.doResponse(current, luid, kernelUid, c)) {
                              case CONTINUE:
                                 this.send(_sock, SASL.SaslCommand.OK, this.saslConfig.getGuid());
                                 state = SASL.SaslAuthState.WAIT_BEGIN;
                                 current = 0;
                                 continue;
                              case OK:
                                 this.send(_sock, SASL.SaslCommand.DATA, c.getResponse());
                                 current = c.getMechs();
                                 state = SASL.SaslAuthState.WAIT_DATA;
                                 continue;
                              case ERROR:
                              case REJECT:
                              default:
                                 this.send(_sock, SASL.SaslCommand.REJECTED, this.convertAuthTypes(this.saslConfig.getAuthMode()));
                                 current = 0;
                                 continue;
                           }
                        case AGREE_UNIX_FD:
                           state = SASL.SaslAuthState.FAILED;
                           continue;
                        case AUTH:
                           this.send(_sock, SASL.SaslCommand.REJECTED, this.convertAuthTypes(this.saslConfig.getAuthMode()));
                           continue;
                        default:
                           this.send(_sock, SASL.SaslCommand.ERROR, "Got invalid command");
                           continue;
                     }
                  case FINISHED:
                     SASL.Command c = this.receive(_sock);
                     switch (c.getCommand()) {
                        case AGREE_UNIX_FD:
                           state = SASL.SaslAuthState.FINISHED;
                           continue;
                        case CANCEL:
                        case AUTH:
                           this.send(_sock, SASL.SaslCommand.REJECTED, this.convertAuthTypes(this.saslConfig.getAuthMode()));
                           state = SASL.SaslAuthState.WAIT_AUTH;
                           continue;
                        case OK:
                           this.logger.debug("File descriptor negotiation requested");
                           if (!this.saslConfig.isFileDescriptorSupport()) {
                              this.send(_sock, SASL.SaslCommand.ERROR);
                           } else {
                              this.send(_sock, SASL.SaslCommand.AGREE_UNIX_FD);
                           }
                           continue;
                        default:
                           this.send(_sock, SASL.SaslCommand.ERROR, "Got invalid command");
                           continue;
                     }
               }
            case SERVER:
               switch (state) {
                  case WAIT_REJECT:
                     _sock.write(ByteBuffer.wrap(new byte[]{0}));
                     this.send(_sock, SASL.SaslCommand.AUTH);
                     state = SASL.SaslAuthState.WAIT_DATA;
                     continue;
                  case INITIAL_STATE:
                     SASL.Command cx = this.receive(_sock);
                     switch (cx.getCommand()) {
                        case REJECTED:
                           switch (this.doChallenge(current, cx)) {
                              case CONTINUE:
                                 this.send(_sock, SASL.SaslCommand.DATA, cx.getResponse());
                                 state = SASL.SaslAuthState.WAIT_OK;
                                 continue;
                              case OK:
                                 this.send(_sock, SASL.SaslCommand.DATA, cx.getResponse());
                                 continue;
                              case ERROR:
                              default:
                                 this.send(_sock, SASL.SaslCommand.ERROR, cx.getResponse());
                                 continue;
                           }
                        case NEGOTIATE_UNIX_FD:
                           failed |= current;
                           int available = cx.getMechs() & ~failed;
                           int retVal = this.handleReject(available, luid, _sock);
                           if (retVal == -1) {
                              state = SASL.SaslAuthState.FAILED;
                           } else {
                              current = retVal;
                           }
                           continue;
                        case BEGIN:
                           this.logger.trace("Authenticated");
                           if (this.saslConfig.isFileDescriptorSupport()) {
                              state = SASL.SaslAuthState.WAIT_DATA;
                              this.logger.trace("Asking for file descriptor support");
                              this.send(_sock, SASL.SaslCommand.NEGOTIATE_UNIX_FD);
                           } else {
                              state = SASL.SaslAuthState.FINISHED;
                              this.send(_sock, SASL.SaslCommand.BEGIN);
                           }
                           continue;
                        case AGREE_UNIX_FD:
                        case CANCEL:
                        case OK:
                        default:
                           this.send(_sock, SASL.SaslCommand.ERROR, "Got invalid command");
                           continue;
                        case AUTH:
                           if (state == SASL.SaslAuthState.NEGOTIATE_UNIX_FD) {
                              state = SASL.SaslAuthState.FINISHED;
                              this.logger.trace("File descriptors NOT supported by server");
                              this.fileDescriptorSupported = false;
                              this.send(_sock, SASL.SaslCommand.BEGIN);
                           } else {
                              this.send(_sock, SASL.SaslCommand.CANCEL);
                              state = SASL.SaslAuthState.WAIT_REJECT;
                           }
                           continue;
                        case DATA:
                           if (this.saslConfig.isFileDescriptorSupport()) {
                              state = SASL.SaslAuthState.FINISHED;
                              this.logger.trace("File descriptors supported by server");
                              this.fileDescriptorSupported = true;
                              this.send(_sock, SASL.SaslCommand.BEGIN);
                           }
                           continue;
                     }
                  case WAIT_BEGIN:
                     SASL.Command cx = this.receive(_sock);
                     switch (cx.getCommand()) {
                        case REJECTED:
                        case AUTH:
                           this.send(_sock, SASL.SaslCommand.CANCEL);
                           state = SASL.SaslAuthState.WAIT_REJECT;
                           continue;
                        case NEGOTIATE_UNIX_FD:
                           failed |= current;
                           int available = cx.getMechs() & ~failed;
                           state = SASL.SaslAuthState.WAIT_DATA;
                           if (0 != (available & 1)) {
                              this.send(_sock, SASL.SaslCommand.AUTH, "EXTERNAL", luid);
                              current = 1;
                           } else if (0 != (available & 2)) {
                              this.send(_sock, SASL.SaslCommand.AUTH, "DBUS_COOKIE_SHA1", luid);
                              current = 2;
                           } else if (0 != (available & 4)) {
                              this.send(_sock, SASL.SaslCommand.AUTH, "ANONYMOUS");
                              current = 4;
                           } else {
                              state = SASL.SaslAuthState.FAILED;
                           }
                           continue;
                        case BEGIN:
                           this.send(_sock, SASL.SaslCommand.BEGIN);
                           state = SASL.SaslAuthState.FINISHED;
                           continue;
                        case AGREE_UNIX_FD:
                        case CANCEL:
                        default:
                           this.send(_sock, SASL.SaslCommand.ERROR, "Got invalid command");
                           continue;
                     }
                  case WAIT_AUTH:
                     SASL.Command c = this.receive(_sock);
                     if (c.getCommand() == SASL.SaslCommand.REJECTED) {
                        failed |= current;
                        int available = c.getMechs() & ~failed;
                        int retVal = this.handleReject(available, luid, _sock);
                        if (retVal == -1) {
                           state = SASL.SaslAuthState.FAILED;
                        } else {
                           current = retVal;
                        }
                     } else {
                        state = SASL.SaslAuthState.FAILED;
                     }
                     continue;
                  default:
                     state = SASL.SaslAuthState.FAILED;
                     continue;
               }
            default:
               return false;
         }
      }

      return state == SASL.SaslAuthState.FINISHED;
   }

   SASL.SaslResult doResponse(int _kernelUid, String _uid, String _c, SASL.Command _auth) {
      MessageDigest md = null;

      try {
         md = MessageDigest.getInstance("SHA");
      } catch (NoSuchAlgorithmException _ex) {
         this.logger.error("SHA hash algorithm not available", _ex);
         return SASL.SaslResult.ERROR;
      }

      switch (_auth) {
         case 0:
            switch (_c.getMechs()) {
               case 1:
                  if (0 != COL.compare(_uid, _c.getData()) || null != _kernelUid && 0 != COL.compare(_uid, _kernelUid)) {
                     return SASL.SaslResult.REJECT;
                  }

                  return SASL.SaslResult.OK;
               case 2:
                  String context = "org_freedesktop_java";
                  long id = System.currentTimeMillis();
                  byte[] buf = new byte[8];
                  Message.marshallintBig(id, buf, 0, 8);
                  this.challenge = this.stupidlyEncode(md.digest(buf));
                  RANDOM.nextBytes(buf);
                  this.cookie = this.stupidlyEncode(md.digest(buf));

                  try {
                     this.addCookie(context, id + "", id / 1000L, this.cookie);
                  } catch (IOException _ex) {
                     this.logger.error("Error authenticating using cookie", _ex);
                     return SASL.SaslResult.ERROR;
                  }

                  this.logger.debug("Sending challenge: {} {} {}", context, id, this.challenge);
                  _c.setResponse(this.stupidlyEncode(context + " " + id + " " + this.challenge));
                  return SASL.SaslResult.CONTINUE;
               case 3:
               default:
                  return SASL.SaslResult.ERROR;
               case 4:
                  return SASL.SaslResult.OK;
            }
         case 2:
            String[] response = this.stupidlyDecode(_c.getData()).split(" ");
            if (response.length < 2) {
               return SASL.SaslResult.ERROR;
            } else {
               String cchal = response[0];
               String hash = response[1];
               String prehash = this.challenge + ":" + cchal + ":" + this.cookie;
               byte[] buf = md.digest(prehash.getBytes());
               String posthash = this.stupidlyEncode(buf);
               this.logger.debug("Authenticating Hash; data={} remote-hash={} local-hash={}", prehash, hash, posthash);
               if (0 == COL.compare(posthash, hash)) {
                  return SASL.SaslResult.OK;
               }

               return SASL.SaslResult.ERROR;
            }
         default:
            return SASL.SaslResult.ERROR;
      }
   }

   private String stupidlyEncode(byte[] _data) {
      return Hexdump.toHex(_data, false);
   }

   public String[] convertAuthTypes(int _types) {
      return switch (_types) {
         case 1 -> new String[]{"EXTERNAL"};
         case 2 -> new String[]{"DBUS_COOKIE_SHA1"};
         case 3 -> new String[]{"EXTERNAL", "DBUS_COOKIE_SHA1"};
         case 4 -> new String[]{"ANONYMOUS"};
         case 5 -> new String[]{"ANONYMOUS", "EXTERNAL"};
         case 6 -> new String[]{"ANONYMOUS", "DBUS_COOKIE_SHA1"};
         case 7 -> new String[]{"ANONYMOUS", "EXTERNAL", "DBUS_COOKIE_SHA1"};
         default -> new String[0];
      };
   }

   public SASL.Command receive(SocketChannel _sock) throws IOException {
      StringBuilder sb = new StringBuilder();
      ByteBuffer buf = ByteBuffer.allocate(1);
      boolean runLoop = true;
      int bytesRead = 0;

      label46:
      while (runLoop) {
         int _ex = _sock.read(buf);
         bytesRead += _ex;
         buf.position(0);
         if (_ex == -1) {
            throw new SocketClosedException("Stream unexpectedly short (broken pipe)");
         }

         for (int i = buf.position(); i < _ex; i++) {
            byte c = buf.get();
            if (c != 0 && c != 13) {
               if (c == 10) {
                  runLoop = false;
                  buf.clear();
                  if (bytesRead > 1048576) {
                     break label46;
                  }
                  continue label46;
               }

               sb.append((char)c);
            }
         }
         break;
      }

      this.logger.trace("received: {}", sb);

      try {
         return new SASL.Command(sb.toString());
      } catch (Exception var9) {
         this.logger.error("Cannot create command.", var9);
         throw new AuthenticationException("Failed to authenticate.", var9);
      }
   }

   private void addCookie(String _id, String _context, long _cookie, String _timestamp) throws IOException {
      File keyringDir = DBUS_KEYRINGS_DIR;
      if (!Util.isBlank(DBUS_TEST_HOME_DIR)) {
         keyringDir = new File(DBUS_TEST_HOME_DIR);
      }

      File cookiefile = new File(keyringDir, _context);
      File lock = new File(keyringDir, _context + ".lock");
      File temp = new File(keyringDir, _context + ".temp");
      if (!keyringDir.exists()) {
         if (!keyringDir.mkdirs()) {
            throw new AuthenticationException("Unable to create keyring directory " + keyringDir);
         }

         if (!Util.isWindows()) {
            Util.setFilePermissions(
               keyringDir.toPath(), null, null, Set.of(PosixFilePermission.OWNER_READ, PosixFilePermission.OWNER_WRITE, PosixFilePermission.OWNER_EXECUTE)
            );
         }
      } else if (!Util.isWindows()) {
         Set<PosixFilePermission> lines = Files.getPosixFilePermissions(keyringDir.toPath(), LinkOption.NOFOLLOW_LINKS);
         if (Util.collectionContainsAny(lines, BAD_FILE_PERMISSIONS)) {
            if (this.saslConfig.isStrictCookiePermissions()) {
               throw new AuthenticationException("Cannot authenticate using cookies: Permissions of directory " + lock + " should be 0700");
            }

            this.logger.warn("DBus keyring directory {} should have permissions 0700", lock);
         }
      }

      Util.waitFor("Lock file " + lock, lock::createNewFile, 1000L, 50L);
      List<String> var18 = new ArrayList();
      if (cookiefile.exists()) {
         try (BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(cookiefile)))) {
            String s = null;

            while (null != (s = r.readLine())) {
               String[] line = s.split(" ");
               long time = Long.parseLong(line[1]);
               if (_timestamp - time < 240L) {
                  var18.add(s);
               }
            }
         }
      }

      var18.add(_id + " " + _timestamp + " " + _cookie);
      Files.writeString(
         temp.toPath(),
         String.join(System.lineSeparator(), var18),
         Charset.defaultCharset(),
         StandardOpenOption.CREATE,
         StandardOpenOption.WRITE,
         StandardOpenOption.TRUNCATE_EXISTING
      );
      if (!temp.renameTo(cookiefile)) {
         if (!cookiefile.delete()) {
            this.logger.warn("Unable to delete cookie file {}", cookiefile);
         } else if (!temp.renameTo(cookiefile)) {
            this.logger.warn("Unable to rename cookie file {} to {}", temp, cookiefile);
         }
      }

      if (!lock.delete()) {
         this.logger.error("Cannot delete lock file {}", lock);
      }
   }

   private String stupidlyEncode(String _data) {
      return Hexdump.toHex(_data.getBytes(), false);
   }

   static {
      COL.setDecomposition(2);
      COL.setStrength(0);
   }

   private String findCookie(String _context, String _id) throws IOException {
      File keyringDir = DBUS_KEYRINGS_DIR;
      if (!Util.isBlank(DBUS_TEST_HOME_DIR)) {
         keyringDir = new File(DBUS_TEST_HOME_DIR);
      }

      File f = new File(keyringDir, _context);
      long currentTime = System.currentTimeMillis() / 1000L;

      try (BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(f)))) {
         String s = null;
         String lCookie = null;

         while (null != (s = r.readLine())) {
            String[] line = s.split(" ");
            if (line.length == 3) {
               long timestamp;
               try {
                  timestamp = Long.parseLong(line[1]);
               } catch (NumberFormatException var15) {
                  continue;
               }

               if (line[0].equals(_id) && timestamp >= 0L && currentTime >= timestamp - 300L && currentTime < timestamp + 420L) {
                  lCookie = line[2];
                  break;
               }
            }
         }

         return lCookie;
      }
   }

   private int handleReject(int _sock, String _available, SocketChannel _luid) throws IOException {
      int current = -1;
      if (0 != (_available & 1)) {
         this.send(_sock, SASL.SaslCommand.AUTH, "EXTERNAL", _luid);
         current = 1;
      } else if (0 != (_available & 2)) {
         this.send(_sock, SASL.SaslCommand.AUTH, "DBUS_COOKIE_SHA1", _luid);
         current = 2;
      } else if (0 != (_available & 4)) {
         this.send(_sock, SASL.SaslCommand.AUTH, "ANONYMOUS");
         current = 4;
      }

      return current;
   }

   // $VF: Compiled from SASL.java
   public static class Command {
      private int mechs;
      private final Logger logger = LoggerFactory.getLogger(this.getClass());
      private SASL.SaslCommand command;
      private String data;
      private String response;

      public String getData() {
         return this.data;
      }

      public void setResponse(String _s) {
         this.response = _s;
      }

      public SASL.SaslCommand getCommand() {
         return this.command;
      }

      @Override
      public String toString() {
         return "Command(" + this.command + ", " + this.mechs + ", " + this.data + ")";
      }

      public String getResponse() {
         return this.response;
      }

      public Command() {
      }

      public Command(String _s) throws IOException {
         String[] ss = _s.split(" ");
         LoggingHelper.logIf(this.logger.isTraceEnabled(), () -> this.logger.trace("Creating command from: {}", Arrays.toString(ss)));
         if (0 == SASL.COL.compare(ss[0], "OK")) {
            this.command = SASL.SaslCommand.OK;
            this.data = ss[1];
         } else if (0 == SASL.COL.compare(ss[0], "AUTH")) {
            this.command = SASL.SaslCommand.AUTH;
            if (ss.length > 1) {
               if (0 == SASL.COL.compare(ss[1], "EXTERNAL")) {
                  this.mechs = 1;
               } else if (0 == SASL.COL.compare(ss[1], "DBUS_COOKIE_SHA1")) {
                  this.mechs = 2;
               } else if (0 == SASL.COL.compare(ss[1], "ANONYMOUS")) {
                  this.mechs = 4;
               }
            }

            if (ss.length > 2) {
               this.data = ss[2];
            }
         } else if (0 == SASL.COL.compare(ss[0], "DATA")) {
            this.command = SASL.SaslCommand.DATA;
            this.data = ss.length < 2 ? null : ss[1];
         } else if (0 == SASL.COL.compare(ss[0], "REJECTED")) {
            this.command = SASL.SaslCommand.REJECTED;

            for (int i = 1; i < ss.length; i++) {
               if (0 == SASL.COL.compare(ss[i], "EXTERNAL")) {
                  this.mechs |= 1;
               } else if (0 == SASL.COL.compare(ss[i], "DBUS_COOKIE_SHA1")) {
                  this.mechs |= 2;
               } else if (0 == SASL.COL.compare(ss[i], "ANONYMOUS")) {
                  this.mechs |= 4;
               }
            }
         } else if (0 == SASL.COL.compare(ss[0], "BEGIN")) {
            this.command = SASL.SaslCommand.BEGIN;
         } else if (0 == SASL.COL.compare(ss[0], "CANCEL")) {
            this.command = SASL.SaslCommand.CANCEL;
         } else if (0 == SASL.COL.compare(ss[0], "ERROR")) {
            this.command = SASL.SaslCommand.ERROR;
            this.data = ss[1];
         } else if (0 == SASL.COL.compare(ss[0], "NEGOTIATE_UNIX_FD")) {
            this.command = SASL.SaslCommand.NEGOTIATE_UNIX_FD;
         } else {
            if (0 != SASL.COL.compare(ss[0], "AGREE_UNIX_FD")) {
               throw new IOException("Invalid Command " + ss[0]);
            }

            this.command = SASL.SaslCommand.AGREE_UNIX_FD;
         }

         this.logger.trace("Created command: {}", this);
      }

      public int getMechs() {
         return this.mechs;
      }
   }

   // $VF: Compiled from SASL.java
   enum SaslAuthState {
      WAIT_REJECT,
      INITIAL_STATE,
      WAIT_BEGIN,
      WAIT_AUTH,
      FAILED,
      FINISHED,
      WAIT_OK,
      WAIT_DATA,
      NEGOTIATE_UNIX_FD;
   }

   // $VF: Compiled from SASL.java
   public enum SaslCommand {
      ERROR,
      REJECTED,
      NEGOTIATE_UNIX_FD,
      BEGIN,
      AGREE_UNIX_FD,
      CANCEL,
      AUTH,
      OK,
      DATA;
   }

   // $VF: Compiled from SASL.java
   public enum SaslMode {
      CLIENT,
      SERVER;
   }

   // $VF: Compiled from SASL.java
   public enum SaslResult {
      CONTINUE,
      OK,
      ERROR,
      REJECT;
   }
}
