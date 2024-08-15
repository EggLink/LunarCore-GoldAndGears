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

public final class NpcDialogueEventParamOuterClass {
  /**
   * Protobuf type {@code NpcDialogueEventParam}
   */
  public static final class NpcDialogueEventParam extends ProtoMessage<NpcDialogueEventParam> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 rogue_dialogue_event_id = 12;</code>
     */
    private int rogueDialogueEventId;

    /**
     * <code>optional uint32 arg_id = 13;</code>
     */
    private int argId;

    private NpcDialogueEventParam() {
    }

    /**
     * @return a new empty instance of {@code NpcDialogueEventParam}
     */
    public static NpcDialogueEventParam newInstance() {
      return new NpcDialogueEventParam();
    }

    /**
     * <code>optional uint32 rogue_dialogue_event_id = 12;</code>
     * @return whether the rogueDialogueEventId field is set
     */
    public boolean hasRogueDialogueEventId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 rogue_dialogue_event_id = 12;</code>
     * @return this
     */
    public NpcDialogueEventParam clearRogueDialogueEventId() {
      bitField0_ &= ~0x00000001;
      rogueDialogueEventId = 0;
      return this;
    }

    /**
     * <code>optional uint32 rogue_dialogue_event_id = 12;</code>
     * @return the rogueDialogueEventId
     */
    public int getRogueDialogueEventId() {
      return rogueDialogueEventId;
    }

    /**
     * <code>optional uint32 rogue_dialogue_event_id = 12;</code>
     * @param value the rogueDialogueEventId to set
     * @return this
     */
    public NpcDialogueEventParam setRogueDialogueEventId(final int value) {
      bitField0_ |= 0x00000001;
      rogueDialogueEventId = value;
      return this;
    }

    /**
     * <code>optional uint32 arg_id = 13;</code>
     * @return whether the argId field is set
     */
    public boolean hasArgId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 arg_id = 13;</code>
     * @return this
     */
    public NpcDialogueEventParam clearArgId() {
      bitField0_ &= ~0x00000002;
      argId = 0;
      return this;
    }

    /**
     * <code>optional uint32 arg_id = 13;</code>
     * @return the argId
     */
    public int getArgId() {
      return argId;
    }

    /**
     * <code>optional uint32 arg_id = 13;</code>
     * @param value the argId to set
     * @return this
     */
    public NpcDialogueEventParam setArgId(final int value) {
      bitField0_ |= 0x00000002;
      argId = value;
      return this;
    }

    @Override
    public NpcDialogueEventParam copyFrom(final NpcDialogueEventParam other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rogueDialogueEventId = other.rogueDialogueEventId;
        argId = other.argId;
      }
      return this;
    }

    @Override
    public NpcDialogueEventParam mergeFrom(final NpcDialogueEventParam other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRogueDialogueEventId()) {
        setRogueDialogueEventId(other.rogueDialogueEventId);
      }
      if (other.hasArgId()) {
        setArgId(other.argId);
      }
      return this;
    }

    @Override
    public NpcDialogueEventParam clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rogueDialogueEventId = 0;
      argId = 0;
      return this;
    }

    @Override
    public NpcDialogueEventParam clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof NpcDialogueEventParam)) {
        return false;
      }
      NpcDialogueEventParam other = (NpcDialogueEventParam) o;
      return bitField0_ == other.bitField0_
        && (!hasRogueDialogueEventId() || rogueDialogueEventId == other.rogueDialogueEventId)
        && (!hasArgId() || argId == other.argId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(rogueDialogueEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(argId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rogueDialogueEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(argId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public NpcDialogueEventParam mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 96: {
            // rogueDialogueEventId
            rogueDialogueEventId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // argId
            argId = input.readUInt32();
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.rogueDialogueEventId, rogueDialogueEventId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.argId, argId);
      }
      output.endObject();
    }

    @Override
    public NpcDialogueEventParam mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 262816547:
          case -963375038: {
            if (input.isAtField(FieldNames.rogueDialogueEventId)) {
              if (!input.trySkipNullValue()) {
                rogueDialogueEventId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 93079057:
          case -1409495132: {
            if (input.isAtField(FieldNames.argId)) {
              if (!input.trySkipNullValue()) {
                argId = input.readUInt32();
                bitField0_ |= 0x00000002;
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
    public NpcDialogueEventParam clone() {
      return new NpcDialogueEventParam().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static NpcDialogueEventParam parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new NpcDialogueEventParam(), data).checkInitialized();
    }

    public static NpcDialogueEventParam parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new NpcDialogueEventParam(), input).checkInitialized();
    }

    public static NpcDialogueEventParam parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new NpcDialogueEventParam(), input).checkInitialized();
    }

    /**
     * @return factory for creating NpcDialogueEventParam messages
     */
    public static MessageFactory<NpcDialogueEventParam> getFactory() {
      return NpcDialogueEventParamFactory.INSTANCE;
    }

    private enum NpcDialogueEventParamFactory implements MessageFactory<NpcDialogueEventParam> {
      INSTANCE;

      @Override
      public NpcDialogueEventParam create() {
        return NpcDialogueEventParam.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rogueDialogueEventId = FieldName.forField("rogueDialogueEventId", "rogue_dialogue_event_id");

      static final FieldName argId = FieldName.forField("argId", "arg_id");
    }
  }
}