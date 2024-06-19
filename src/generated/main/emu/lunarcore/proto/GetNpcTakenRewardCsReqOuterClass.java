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

public final class GetNpcTakenRewardCsReqOuterClass {
  /**
   * Protobuf type {@code GetNpcTakenRewardCsReq}
   */
  public static final class GetNpcTakenRewardCsReq extends ProtoMessage<GetNpcTakenRewardCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 npc_id = 14;</code>
     */
    private int npcId;

    private GetNpcTakenRewardCsReq() {
    }

    /**
     * @return a new empty instance of {@code GetNpcTakenRewardCsReq}
     */
    public static GetNpcTakenRewardCsReq newInstance() {
      return new GetNpcTakenRewardCsReq();
    }

    /**
     * <code>optional uint32 npc_id = 14;</code>
     * @return whether the npcId field is set
     */
    public boolean hasNpcId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 npc_id = 14;</code>
     * @return this
     */
    public GetNpcTakenRewardCsReq clearNpcId() {
      bitField0_ &= ~0x00000001;
      npcId = 0;
      return this;
    }

    /**
     * <code>optional uint32 npc_id = 14;</code>
     * @return the npcId
     */
    public int getNpcId() {
      return npcId;
    }

    /**
     * <code>optional uint32 npc_id = 14;</code>
     * @param value the npcId to set
     * @return this
     */
    public GetNpcTakenRewardCsReq setNpcId(final int value) {
      bitField0_ |= 0x00000001;
      npcId = value;
      return this;
    }

    @Override
    public GetNpcTakenRewardCsReq copyFrom(final GetNpcTakenRewardCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        npcId = other.npcId;
      }
      return this;
    }

    @Override
    public GetNpcTakenRewardCsReq mergeFrom(final GetNpcTakenRewardCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasNpcId()) {
        setNpcId(other.npcId);
      }
      return this;
    }

    @Override
    public GetNpcTakenRewardCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      npcId = 0;
      return this;
    }

    @Override
    public GetNpcTakenRewardCsReq clearQuick() {
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
      if (!(o instanceof GetNpcTakenRewardCsReq)) {
        return false;
      }
      GetNpcTakenRewardCsReq other = (GetNpcTakenRewardCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasNpcId() || npcId == other.npcId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(npcId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(npcId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetNpcTakenRewardCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 112: {
            // npcId
            npcId = input.readUInt32();
            bitField0_ |= 0x00000001;
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
        output.writeUInt32(FieldNames.npcId, npcId);
      }
      output.endObject();
    }

    @Override
    public GetNpcTakenRewardCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 105021404:
          case -1039282375: {
            if (input.isAtField(FieldNames.npcId)) {
              if (!input.trySkipNullValue()) {
                npcId = input.readUInt32();
                bitField0_ |= 0x00000001;
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
    public GetNpcTakenRewardCsReq clone() {
      return new GetNpcTakenRewardCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetNpcTakenRewardCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetNpcTakenRewardCsReq(), data).checkInitialized();
    }

    public static GetNpcTakenRewardCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetNpcTakenRewardCsReq(), input).checkInitialized();
    }

    public static GetNpcTakenRewardCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetNpcTakenRewardCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetNpcTakenRewardCsReq messages
     */
    public static MessageFactory<GetNpcTakenRewardCsReq> getFactory() {
      return GetNpcTakenRewardCsReqFactory.INSTANCE;
    }

    private enum GetNpcTakenRewardCsReqFactory implements MessageFactory<GetNpcTakenRewardCsReq> {
      INSTANCE;

      @Override
      public GetNpcTakenRewardCsReq create() {
        return GetNpcTakenRewardCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName npcId = FieldName.forField("npcId", "npc_id");
    }
  }
}
