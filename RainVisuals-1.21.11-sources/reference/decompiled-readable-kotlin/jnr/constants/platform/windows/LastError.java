package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from LastError.java
public enum LastError implements Constant {
   WSAENETUNREACH(10051L),
   WSAEPROVIDERFAILEDINIT(10106L),
   ERROR_DIRECT_ACCESS_HANDLE(130L),
   ERROR_INVALID_STACKSEG(189L),
   ERROR_WAIT_NO_CHILDREN(128L),
   WSAEPROCLIM(10067L),
   WSAENOMORE(10102L),
   WSANO_RECOVERY(11003L),
   WSAEISCONN(10056L),
   WSAECONNREFUSED(10061L),
   WSASERVICE_NOT_FOUND(10108L),
   WSAVERNOTSUPPORTED(10092L),
   ERROR_NO_MORE_FILES(18L),
   WSAENOPROTOOPT(10042L),
   ERROR_CANNOT_MAKE(82L),
   WSAEMFILE(10024L),
   WSANOTINITIALISED(10093L),
   WSAEINVALIDPROCTABLE(10104L),
   ERROR_FILE_NOT_FOUND(2L),
   WSAEAFNOSUPPORT(10047L),
   ERROR_NO_PROC_SLOTS(89L),
   ERROR_RING2SEG_MUST_BE_MOVABLE(200L),
   ERROR_MOD_NOT_FOUND(126L),
   WSAEPROTOTYPE(10041L),
   WSAECONNABORTED(10053L),
   ERROR_INVALID_PARAMETER(87L),
   ERROR_MAX_THRDS_REACHED(164L),
   ERROR_NOT_ENOUGH_QUOTA(1816L),
   WSAETOOMANYREFS(10059L),
   ERROR_PIPE_LOCAL(229L),
   ERROR_BAD_EXE_FORMAT(193L),
   ERROR_INVALID_MINALLOCSIZE(195L),
   ERROR_AUTODATASEG_EXCEEDS_64k(199L),
   ERROR_IOPL_NOT_ENABLED(197L),
   ERROR_INVALID_TARGET_HANDLE(114L),
   WSAEDISCON(10101L),
   ERROR_ITERATED_DATA_EXCEEDS_64k(194L),
   WSAEFAULT(10014L),
   ERROR_WRITE_PROTECT(19L),
   ERROR_INVALID_HANDLE(6L),
   WSAEINPROGRESS(10036L),
   WSAEACCES(10013L),
   ERROR_EXE_MARKED_INVALID(192L),
   ERROR_ARENA_TRASHED(7L),
   ERROR_CURRENT_DIRECTORY(16L),
   ERROR_RELOC_CHAIN_XEEDS_SEGLIM(201L),
   ERROR_BAD_FORMAT(11L),
   ERROR_BAD_NETPATH(53L),
   WSAEHOSTUNREACH(10065L),
   WSATYPE_NOT_FOUND(10109L),
   ERROR_BAD_ENVIRONMENT(10L),
   WSAEHOSTDOWN(10064L),
   ERROR_PIPE_NOT_CONNECTED(233L),
   ERROR_INVALID_FUNCTION(1L),
   ERROR_SEEK_ON_DEVICE(132L),
   WSAEDQUOT(10069L),
   WSAECANCELLED(10103L),
   WSAEADDRINUSE(10048L),
   ERROR_NETWORK_ACCESS_DENIED(65L),
   ERROR_NESTING_NOT_ALLOWED(215L),
   ERROR_READ_FAULT(30L),
   ERROR_DISK_FULL(112L),
   ERROR_SECTOR_NOT_FOUND(27L),
   WSAECONNRESET(10054L),
   WSAENAMETOOLONG(10063L),
   WSAEPROTONOSUPPORT(10043L),
   WSAESOCKTNOSUPPORT(10044L),
   WSAEINVALIDPROVIDER(10105L),
   ERROR_FILENAME_EXCED_RANGE(206L),
   ERROR_INVALID_DRIVE(15L),
   ERROR_NOT_SAME_DEVICE(17L),
   ERROR_PATH_NOT_FOUND(3L),
   ERROR_INVALID_DATA(13L),
   ERROR_NOT_ENOUGH_MEMORY(8L),
   WSAEALREADY(10037L),
   ERROR_BAD_PATHNAME(161L),
   ERROR_NOT_READY(21L),
   ERROR_FILE_EXISTS(80L),
   WSAENOTSOCK(10038L),
   ERROR_OPERATION_ABORTED(995L),
   WSAETIMEDOUT(10060L),
   WSAEUSERS(10068L),
   WSASYSCALLFAILURE(10107L),
   WSAENETRESET(10052L),
   WSAEDESTADDRREQ(10039L),
   ERROR_DRIVE_LOCKED(108L),
   WSA_E_NO_MORE(10110L),
   ERROR_INVALID_EXE_SIGNATURE(191L),
   ERROR_SHARING_VIOLATION(32L),
   ERROR_GEN_FAILURE(31L),
   WSAEOPNOTSUPP(10045L),
   ERROR_FAIL_I24(83L),
   ERROR_INVALID_STARTING_CODESEG(188L),
   WSAENOTCONN(10057L),
   ERROR_BROKEN_PIPE(109L),
   WSAEINTR(10004L),
   ERROR_TOO_MANY_OPEN_FILES(4L),
   ERROR_BAD_COMMAND(22L),
   ERROR_SHARING_BUFFER_EXCEEDED(36L),
   WSAELOOP(10062L),
   ERROR_ALREADY_EXISTS(183L),
   ERROR_DIRECTORY(267L),
   ERROR_DIR_NOT_EMPTY(145L),
   ERROR_CRC(23L),
   ERROR_NOT_LOCKED(158L),
   ERROR_SEEK(25L),
   WSAEBADF(10009L),
   WSAENOBUFS(10055L),
   WSANO_DATA(11004L),
   ERROR_WRITE_FAULT(29L),
   WSAESTALE(10070L),
   ERROR_NOT_DOS_DISK(26L),
   WSAEPFNOSUPPORT(10046L),
   ERROR_INVALID_SEGDPL(198L),
   WSASYSNOTREADY(10091L),
   WSAEREFUSED(10112L),
   WSAEWOULDBLOCK(10035L),
   ERROR_NEGATIVE_SEEK(131L),
   ERROR_OUT_OF_PAPER(28L),
   WSAEINVAL(10022L),
   ERROR_LOCK_VIOLATION(33L),
   ERROR_NO_DATA(232L),
   ERROR_BAD_LENGTH(24L),
   ERROR_CHILD_NOT_COMPLETE(129L),
   ERROR_LOCK_FAILED(167L),
   WSAENETDOWN(10050L),
   WSAEMSGSIZE(10040L),
   ERROR_WRONG_DISK(34L),
   WSAESHUTDOWN(10058L),
   ERROR_INFLOOP_IN_RELOC_CHAIN(202L),
   WSAENOTEMPTY(10066L),
   ERROR_INVALID_MODULETYPE(190L),
   WSAEREMOTE(10071L),
   ERROR_BAD_UNIT(20L),
   ERROR_ACCESS_DENIED(5L),
   WSAHOST_NOT_FOUND(11001L),
   ERROR_BAD_PIPE(230L),
   WSAEADDRNOTAVAIL(10049L),
   ERROR_BAD_NET_NAME(67L),
   ERROR_INVALID_ACCESS(12L),
   ERROR_DYNLINK_FROM_INVALID_RING(196L),
   WSA_E_CANCELLED(10111L),
   WSATRY_AGAIN(11002L),
   ERROR_PIPE_BUSY(231L),
   ERROR_INVALID_BLOCK(9L);

   public static final long MIN_VALUE = 1L;
   private final long value;
   public static final long MAX_VALUE = 11004L;

   LastError(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return LastError.StringTable.descriptions.get(this);
   }

   // $VF: Compiled from LastError.java
   static final class StringTable {
      public static final Map<LastError, String> descriptions = generateTable();

      public static final Map<LastError, String> generateTable() {
         Map<LastError, String> map = new EnumMap<>(LastError.class);
         map.put(LastError.ERROR_INVALID_FUNCTION, "Incorrect function");
         map.put(LastError.ERROR_FILE_NOT_FOUND, "The system cannot find the file specified");
         map.put(LastError.ERROR_PATH_NOT_FOUND, "The system cannot find the path specified");
         map.put(LastError.ERROR_TOO_MANY_OPEN_FILES, "The system cannot open the file");
         map.put(LastError.ERROR_ACCESS_DENIED, "Access is denied");
         map.put(LastError.ERROR_INVALID_HANDLE, "The handle is invalid");
         map.put(LastError.ERROR_ARENA_TRASHED, "The storage control blocks were destroyed");
         map.put(LastError.ERROR_NOT_ENOUGH_MEMORY, "Not enough memory resources are available to process this command");
         map.put(LastError.ERROR_INVALID_BLOCK, "The storage control block address is invalid");
         map.put(LastError.ERROR_BAD_ENVIRONMENT, "The environment is incorrect");
         map.put(LastError.ERROR_BAD_FORMAT, "An attempt was made to load a program with an incorrect format");
         map.put(LastError.ERROR_INVALID_ACCESS, "The access code is invalid");
         map.put(LastError.ERROR_INVALID_DATA, "The data is invalid");
         map.put(LastError.ERROR_INVALID_DRIVE, "The system cannot find the drive specified");
         map.put(LastError.ERROR_CURRENT_DIRECTORY, "The directory cannot be removed");
         map.put(LastError.ERROR_NOT_SAME_DEVICE, "The system cannot move the file to a different disk drive");
         map.put(LastError.ERROR_NO_MORE_FILES, "There are no more files");
         map.put(LastError.ERROR_WRITE_PROTECT, "The media is write protected");
         map.put(LastError.ERROR_BAD_UNIT, "The system cannot find the device specified");
         map.put(LastError.ERROR_NOT_READY, "The device is not ready");
         map.put(LastError.ERROR_BAD_COMMAND, "The device does not recognize the command");
         map.put(LastError.ERROR_CRC, "Data error (cyclic redundancy check)");
         map.put(LastError.ERROR_BAD_LENGTH, "The program issued a command but the command length is incorrect");
         map.put(LastError.ERROR_SEEK, "The drive cannot locate a specific area or track on the disk");
         map.put(LastError.ERROR_NOT_DOS_DISK, "The specified disk or diskette cannot be accessed");
         map.put(LastError.ERROR_SECTOR_NOT_FOUND, "The drive cannot find the sector requested");
         map.put(LastError.ERROR_OUT_OF_PAPER, "The printer is out of paper");
         map.put(LastError.ERROR_WRITE_FAULT, "The system cannot write to the specified device");
         map.put(LastError.ERROR_READ_FAULT, "The system cannot read from the specified device");
         map.put(LastError.ERROR_GEN_FAILURE, "A device attached to the system is not functioning");
         map.put(LastError.ERROR_LOCK_VIOLATION, "The process cannot access the file because another process has locked a portion of the file");
         map.put(LastError.ERROR_SHARING_VIOLATION, "The process cannot access the file because it is being used by another process");
         map.put(LastError.ERROR_WRONG_DISK, "ERROR_WRONG_DISK");
         map.put(LastError.ERROR_SHARING_BUFFER_EXCEEDED, "Too many files opened for sharing");
         map.put(LastError.ERROR_BAD_NETPATH, "The network path was not found");
         map.put(LastError.ERROR_NETWORK_ACCESS_DENIED, "Network access is denied");
         map.put(LastError.ERROR_BAD_NET_NAME, "The network name cannot be found");
         map.put(LastError.ERROR_FILE_EXISTS, "The file exists");
         map.put(LastError.ERROR_CANNOT_MAKE, "The directory or file cannot be created");
         map.put(LastError.ERROR_FAIL_I24, "Fail on INT 24");
         map.put(LastError.ERROR_INVALID_PARAMETER, "The parameter is incorrect");
         map.put(LastError.ERROR_NO_PROC_SLOTS, "The system cannot start another process at this time");
         map.put(LastError.ERROR_DRIVE_LOCKED, "The disk is in use or locked by another process");
         map.put(LastError.ERROR_BROKEN_PIPE, "The pipe has been ended");
         map.put(LastError.ERROR_DISK_FULL, "There is not enough space on the disk");
         map.put(LastError.ERROR_INVALID_TARGET_HANDLE, "The target internal file identifier is incorrect");
         map.put(LastError.ERROR_WAIT_NO_CHILDREN, "There are no child processes to wait for");
         map.put(LastError.ERROR_CHILD_NOT_COMPLETE, "ERROR_CHILD_NOT_COMPLETE");
         map.put(LastError.ERROR_DIRECT_ACCESS_HANDLE, "Attempt to use a file handle to an open disk partition for an operation other than raw disk I/O");
         map.put(LastError.ERROR_NEGATIVE_SEEK, "An attempt was made to move the file pointer before the beginning of the file");
         map.put(LastError.ERROR_SEEK_ON_DEVICE, "The file pointer cannot be set on the specified device or file");
         map.put(LastError.ERROR_DIR_NOT_EMPTY, "The directory is not empty");
         map.put(LastError.ERROR_DIRECTORY, "The directory name is invalid");
         map.put(LastError.ERROR_NOT_LOCKED, "The segment is already unlocked");
         map.put(LastError.ERROR_BAD_PATHNAME, "The specified path is invalid");
         map.put(LastError.ERROR_MAX_THRDS_REACHED, "No more threads can be created in the system");
         map.put(LastError.ERROR_LOCK_FAILED, "Unable to lock a region of a file");
         map.put(LastError.ERROR_ALREADY_EXISTS, "Cannot create a file when that file already exists");
         map.put(LastError.ERROR_INVALID_STARTING_CODESEG, "ERROR_INVALID_STARTING_CODESEG");
         map.put(LastError.ERROR_INVALID_STACKSEG, "ERROR_INVALID_STACKSEG");
         map.put(LastError.ERROR_INVALID_MODULETYPE, "ERROR_INVALID_MODULETYPE");
         map.put(LastError.ERROR_INVALID_EXE_SIGNATURE, "ERROR_INVALID_EXE_SIGNATURE");
         map.put(LastError.ERROR_EXE_MARKED_INVALID, "ERROR_EXE_MARKED_INVALID");
         map.put(LastError.ERROR_BAD_EXE_FORMAT, "ERROR_BAD_EXE_FORMAT");
         map.put(LastError.ERROR_ITERATED_DATA_EXCEEDS_64k, "ERROR_ITERATED_DATA_EXCEEDS_64k");
         map.put(LastError.ERROR_INVALID_MINALLOCSIZE, "ERROR_INVALID_MINALLOCSIZE");
         map.put(LastError.ERROR_DYNLINK_FROM_INVALID_RING, "The operating system cannot run this application program");
         map.put(LastError.ERROR_IOPL_NOT_ENABLED, "The operating system is not presently configured to run this application");
         map.put(LastError.ERROR_INVALID_SEGDPL, "ERROR_INVALID_SEGDPL");
         map.put(LastError.ERROR_AUTODATASEG_EXCEEDS_64k, "The operating system cannot run this application program");
         map.put(LastError.ERROR_RING2SEG_MUST_BE_MOVABLE, "The code segment cannot be greater than or equal to 64K");
         map.put(LastError.ERROR_RELOC_CHAIN_XEEDS_SEGLIM, "ERROR_RELOC_CHAIN_XEEDS_SEGLIM");
         map.put(LastError.ERROR_INFLOOP_IN_RELOC_CHAIN, "ERROR_INFLOOP_IN_RELOC_CHAIN");
         map.put(LastError.ERROR_FILENAME_EXCED_RANGE, "The filename or extension is too long");
         map.put(LastError.ERROR_NESTING_NOT_ALLOWED, "Cannot nest calls to LoadModule");
         map.put(LastError.ERROR_PIPE_LOCAL, "The pipe is local");
         map.put(LastError.ERROR_BAD_PIPE, "The pipe state is invalid");
         map.put(LastError.ERROR_PIPE_BUSY, "All pipe instances are busy");
         map.put(LastError.ERROR_NO_DATA, "The pipe is being closed");
         map.put(LastError.ERROR_PIPE_NOT_CONNECTED, "No process is on the other end of the pipe");
         map.put(LastError.ERROR_OPERATION_ABORTED, "The I/O operation has been aborted because of either a thread exit or an application request");
         map.put(LastError.ERROR_NOT_ENOUGH_QUOTA, "Not enough quota is available to process this command");
         map.put(LastError.ERROR_MOD_NOT_FOUND, "The specified module could not be found");
         map.put(LastError.WSAEINTR, "A blocking operation was interrupted by a call to WSACancelBlockingCall");
         map.put(LastError.WSAEBADF, "The file handle supplied is not valid");
         map.put(LastError.WSAEACCES, "An attempt was made to access a socket in a way forbidden by its access permissions");
         map.put(LastError.WSAEFAULT, "The system detected an invalid pointer address in attempting to use a pointer argument in a call");
         map.put(LastError.WSAEINVAL, "An invalid argument was supplied");
         map.put(LastError.WSAEMFILE, "Too many open sockets");
         map.put(LastError.WSAEWOULDBLOCK, "A non-blocking socket operation could not be completed immediately");
         map.put(LastError.WSAEINPROGRESS, "A blocking operation is currently executing");
         map.put(LastError.WSAEALREADY, "An operation was attempted on a non-blocking socket that already had an operation in progress");
         map.put(LastError.WSAENOTSOCK, "An operation was attempted on something that is not a socket");
         map.put(LastError.WSAEDESTADDRREQ, "A required address was omitted from an operation on a socket");
         map.put(
            LastError.WSAEMSGSIZE,
            "A message sent on a datagram socket was larger than the internal message buffer or some other network limit, or the buffer used to receive a datagram into was smaller than the datagram itself"
         );
         map.put(
            LastError.WSAEPROTOTYPE, "A protocol was specified in the socket function call that does not support the semantics of the socket type requested"
         );
         map.put(LastError.WSAENOPROTOOPT, "An unknown, invalid, or unsupported option or level was specified in a getsockopt or setsockopt call");
         map.put(LastError.WSAEPROTONOSUPPORT, "The requested protocol has not been configured into the system, or no implementation for it exists");
         map.put(LastError.WSAESOCKTNOSUPPORT, "The support for the specified socket type does not exist in this address family");
         map.put(LastError.WSAEOPNOTSUPP, "The attempted operation is not supported for the type of object referenced");
         map.put(LastError.WSAEPFNOSUPPORT, "The protocol family has not been configured into the system or no implementation for it exists");
         map.put(LastError.WSAEAFNOSUPPORT, "An address incompatible with the requested protocol was used");
         map.put(LastError.WSAEADDRINUSE, "Only one usage of each socket address (protocol/network address/port) is normally permitted");
         map.put(LastError.WSAEADDRNOTAVAIL, "The requested address is not valid in its context");
         map.put(LastError.WSAENETDOWN, "A socket operation encountered a dead network");
         map.put(LastError.WSAENETUNREACH, "A socket operation was attempted to an unreachable network");
         map.put(LastError.WSAENETRESET, "The connection has been broken due to keep-alive activity detecting a failure while the operation was in progress");
         map.put(LastError.WSAECONNABORTED, "An established connection was aborted by the software in your host machine");
         map.put(LastError.WSAECONNRESET, "An existing connection was forcibly closed by the remote host");
         map.put(
            LastError.WSAENOBUFS,
            "An operation on a socket could not be performed because the system lacked sufficient buffer space or because a queue was full"
         );
         map.put(LastError.WSAEISCONN, "A connect request was made on an already connected socket");
         map.put(
            LastError.WSAENOTCONN,
            "A request to send or receive data was disallowed because the socket is not connected and (when sending on a datagram socket using a sendto call) no address was supplied"
         );
         map.put(
            LastError.WSAESHUTDOWN,
            "A request to send or receive data was disallowed because the socket had already been shut down in that direction with a previous shutdown call"
         );
         map.put(LastError.WSAETOOMANYREFS, "Too many references to some kernel object");
         map.put(
            LastError.WSAETIMEDOUT,
            "A connection attempt failed because the connected party did not properly respond after a period of time, or established connection failed because connected host has failed to respond"
         );
         map.put(LastError.WSAECONNREFUSED, "No connection could be made because the target machine actively refused it");
         map.put(LastError.WSAELOOP, "Cannot translate name");
         map.put(LastError.WSAENAMETOOLONG, "Name component or name was too long");
         map.put(LastError.WSAEHOSTDOWN, "A socket operation failed because the destination host was down");
         map.put(LastError.WSAEHOSTUNREACH, "A socket operation was attempted to an unreachable host");
         map.put(LastError.WSAENOTEMPTY, "Cannot remove a directory that is not empty");
         map.put(LastError.WSAEPROCLIM, "A Windows Sockets implementation may have a limit on the number of applications that may use it simultaneously");
         map.put(LastError.WSAEUSERS, "Ran out of quota");
         map.put(LastError.WSAEDQUOT, "Ran out of disk quota");
         map.put(LastError.WSAESTALE, "File handle reference is no longer available");
         map.put(LastError.WSAEREMOTE, "Item is not available locally");
         map.put(
            LastError.WSASYSNOTREADY,
            "WSAStartup cannot function at this time because the underlying system it uses to provide network services is currently unavailable"
         );
         map.put(LastError.WSAVERNOTSUPPORTED, "The Windows Sockets version requested is not supported");
         map.put(LastError.WSANOTINITIALISED, "Either the application has not called WSAStartup, or WSAStartup failed");
         map.put(LastError.WSAEDISCON, "Returned by WSARecv or WSARecvFrom to indicate the remote party has initiated a graceful shutdown sequence");
         map.put(LastError.WSAENOMORE, "No more results can be returned by WSALookupServiceNext");
         map.put(LastError.WSAECANCELLED, "A call to WSALookupServiceEnd was made while this call was still processing. The call has been canceled");
         map.put(LastError.WSAEINVALIDPROCTABLE, "The procedure call table is invalid");
         map.put(LastError.WSAEINVALIDPROVIDER, "The requested service provider is invalid");
         map.put(LastError.WSAEPROVIDERFAILEDINIT, "The requested service provider could not be loaded or initialized");
         map.put(LastError.WSASYSCALLFAILURE, "A system call has failed");
         map.put(LastError.WSASERVICE_NOT_FOUND, "No such service is known. The service cannot be found in the specified name space");
         map.put(LastError.WSATYPE_NOT_FOUND, "The specified class was not found");
         map.put(LastError.WSA_E_NO_MORE, "No more results can be returned by WSALookupServiceNext");
         map.put(LastError.WSA_E_CANCELLED, "A call to WSALookupServiceEnd was made while this call was still processing. The call has been canceled");
         map.put(LastError.WSAEREFUSED, "A database query failed because it was actively refused");
         map.put(LastError.WSAHOST_NOT_FOUND, "No such host is known");
         map.put(
            LastError.WSATRY_AGAIN,
            "This is usually a temporary error during hostname resolution and means that the local server did not receive a response from an authoritative server"
         );
         map.put(LastError.WSANO_RECOVERY, "A non-recoverable error occurred during a database lookup");
         map.put(LastError.WSANO_DATA, "The requested name is valid, but no data of the requested type was found");
         return map;
      }
   }
}
