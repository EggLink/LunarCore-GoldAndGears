// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class HandleFriendScRspOuterClass {
  /**
   * Protobuf type {@code HandleFriendScRsp}
   */
  public static final class HandleFriendScRsp extends ProtoMessage<HandleFriendScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 uid = 5;</code>
     */
    private int uid;

    /**
     * <code>optional uint32 retcode = 15;</code>
     */
    private int retcode;

    /**
     * <code>optional bool handle_result = 2;</code>
     */
    private boolean handleResult;

    /**
     * <code>optional .FriendListInfo handle_friend_info = 10;</code>
     */
    private final FriendListInfoOuterClass.FriendListInfo handleFriendInfo = FriendListInfoOuterClass.FriendListInfo.newInstance();

    private HandleFriendScRsp() {
    }

    /**
     * @return a new empty instance of {@code HandleFriendScRsp}
     */
    public static HandleFriendScRsp newInstance() {
      return new HandleFriendScRsp();
    }

    /**
     * <code>optional uint32 uid = 5;</code>
     * @return whether the uid field is set
     */
    public boolean hasUid() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 uid = 5;</code>
     * @return this
     */
    public HandleFriendScRsp clearUid() {
      bitField0_ &= ~0x00000001;
      uid = 0;
      return this;
    }

    /**
     * <code>optional uint32 uid = 5;</code>
     * @return the uid
     */
    public int getUid() {
      return uid;
    }

    /**
     * <code>optional uint32 uid = 5;</code>
     * @param value the uid to set
     * @return this
     */
    public HandleFriendScRsp setUid(final int value) {
      bitField0_ |= 0x00000001;
      uid = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return this
     */
    public HandleFriendScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 15;</code>
     * @param value the retcode to set
     * @return this
     */
    public HandleFriendScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>optional bool handle_result = 2;</code>
     * @return whether the handleResult field is set
     */
    public boolean hasHandleResult() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional bool handle_result = 2;</code>
     * @return this
     */
    public HandleFriendScRsp clearHandleResult() {
      bitField0_ &= ~0x00000004;
      handleResult = false;
      return this;
    }

    /**
     * <code>optional bool handle_result = 2;</code>
     * @return the handleResult
     */
    public boolean getHandleResult() {
      return handleResult;
    }

    /**
     * <code>optional bool handle_result = 2;</code>
     * @param value the handleResult to set
     * @return this
     */
    public HandleFriendScRsp setHandleResult(final boolean value) {
      bitField0_ |= 0x00000004;
      handleResult = value;
      return this;
    }

    /**
     * <code>optional .FriendListInfo handle_friend_info = 10;</code>
     * @return whether the handleFriendInfo field is set
     */
    public boolean hasHandleFriendInfo() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .FriendListInfo handle_friend_info = 10;</code>
     * @return this
     */
    public HandleFriendScRsp clearHandleFriendInfo() {
      bitField0_ &= ~0x00000008;
      handleFriendInfo.clear();
      return this;
    }

    /**
     * <code>optional .FriendListInfo handle_friend_info = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableHandleFriendInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public FriendListInfoOuterClass.FriendListInfo getHandleFriendInfo() {
      return handleFriendInfo;
    }

    /**
     * <code>optional .FriendListInfo handle_friend_info = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public FriendListInfoOuterClass.FriendListInfo getMutableHandleFriendInfo() {
      bitField0_ |= 0x00000008;
      return handleFriendInfo;
    }

    /**
     * <code>optional .FriendListInfo handle_friend_info = 10;</code>
     * @param value the handleFriendInfo to set
     * @return this
     */
    public HandleFriendScRsp setHandleFriendInfo(
        final FriendListInfoOuterClass.FriendListInfo value) {
      bitField0_ |= 0x00000008;
      handleFriendInfo.copyFrom(value);
      return this;
    }

    @Override
    public HandleFriendScRsp copyFrom(final HandleFriendScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        uid = other.uid;
        retcode = other.retcode;
        handleResult = other.handleResult;
        handleFriendInfo.copyFrom(other.handleFriendInfo);
      }
      return this;
    }

    @Override
    public HandleFriendScRsp mergeFrom(final HandleFriendScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasUid()) {
        setUid(other.uid);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasHandleResult()) {
        setHandleResult(other.handleResult);
      }
      if (other.hasHandleFriendInfo()) {
        getMutableHandleFriendInfo().mergeFrom(other.handleFriendInfo);
      }
      return this;
    }

    @Override
    public HandleFriendScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      uid = 0;
      retcode = 0;
      handleResult = false;
      handleFriendInfo.clear();
      return this;
    }

    @Override
    public HandleFriendScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      handleFriendInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof HandleFriendScRsp)) {
        return false;
      }
      HandleFriendScRsp other = (HandleFriendScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasUid() || uid == other.uid)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasHandleResult() || handleResult == other.handleResult)
        && (!hasHandleFriendInfo() || handleFriendInfo.equals(other.handleFriendInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 16);
        output.writeBoolNoTag(handleResult);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 82);
        output.writeMessageNoTag(handleFriendInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(handleFriendInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public HandleFriendScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // uid
            uid = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // handleResult
            handleResult = input.readBool();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // handleFriendInfo
            input.readMessage(handleFriendInfo);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.uid, uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeBool(FieldNames.handleResult, handleResult);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.handleFriendInfo, handleFriendInfo);
      }
      output.endObject();
    }

    @Override
    public HandleFriendScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 115792: {
            if (input.isAtField(FieldNames.uid)) {
              if (!input.trySkipNullValue()) {
                uid = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1331436443:
          case 686987796: {
            if (input.isAtField(FieldNames.handleResult)) {
              if (!input.trySkipNullValue()) {
                handleResult = input.readBool();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -215671628:
          case 49075736: {
            if (input.isAtField(FieldNames.handleFriendInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(handleFriendInfo);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public HandleFriendScRsp clone() {
      return new HandleFriendScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static HandleFriendScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new HandleFriendScRsp(), data).checkInitialized();
    }

    public static HandleFriendScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new HandleFriendScRsp(), input).checkInitialized();
    }

    public static HandleFriendScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new HandleFriendScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating HandleFriendScRsp messages
     */
    public static MessageFactory<HandleFriendScRsp> getFactory() {
      return HandleFriendScRspFactory.INSTANCE;
    }

    private enum HandleFriendScRspFactory implements MessageFactory<HandleFriendScRsp> {
      INSTANCE;

      @Override
      public HandleFriendScRsp create() {
        return HandleFriendScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName uid = FieldName.forField("uid");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName handleResult = FieldName.forField("handleResult", "handle_result");

      static final FieldName handleFriendInfo = FieldName.forField("handleFriendInfo", "handle_friend_info");
    }
  }
}
