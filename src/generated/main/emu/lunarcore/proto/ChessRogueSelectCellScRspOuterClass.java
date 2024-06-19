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

public final class ChessRogueSelectCellScRspOuterClass {
  /**
   * Protobuf type {@code ChessRogueSelectCellScRsp}
   */
  public static final class ChessRogueSelectCellScRsp extends ProtoMessage<ChessRogueSelectCellScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 4;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 cell_id = 14;</code>
     */
    private int cellId;

    private ChessRogueSelectCellScRsp() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueSelectCellScRsp}
     */
    public static ChessRogueSelectCellScRsp newInstance() {
      return new ChessRogueSelectCellScRsp();
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return this
     */
    public ChessRogueSelectCellScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @param value the retcode to set
     * @return this
     */
    public ChessRogueSelectCellScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 cell_id = 14;</code>
     * @return whether the cellId field is set
     */
    public boolean hasCellId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 cell_id = 14;</code>
     * @return this
     */
    public ChessRogueSelectCellScRsp clearCellId() {
      bitField0_ &= ~0x00000002;
      cellId = 0;
      return this;
    }

    /**
     * <code>optional uint32 cell_id = 14;</code>
     * @return the cellId
     */
    public int getCellId() {
      return cellId;
    }

    /**
     * <code>optional uint32 cell_id = 14;</code>
     * @param value the cellId to set
     * @return this
     */
    public ChessRogueSelectCellScRsp setCellId(final int value) {
      bitField0_ |= 0x00000002;
      cellId = value;
      return this;
    }

    @Override
    public ChessRogueSelectCellScRsp copyFrom(final ChessRogueSelectCellScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        cellId = other.cellId;
      }
      return this;
    }

    @Override
    public ChessRogueSelectCellScRsp mergeFrom(final ChessRogueSelectCellScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasCellId()) {
        setCellId(other.cellId);
      }
      return this;
    }

    @Override
    public ChessRogueSelectCellScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      cellId = 0;
      return this;
    }

    @Override
    public ChessRogueSelectCellScRsp clearQuick() {
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
      if (!(o instanceof ChessRogueSelectCellScRsp)) {
        return false;
      }
      ChessRogueSelectCellScRsp other = (ChessRogueSelectCellScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasCellId() || cellId == other.cellId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(cellId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(cellId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueSelectCellScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // cellId
            cellId = input.readUInt32();
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.cellId, cellId);
      }
      output.endObject();
    }

    @Override
    public ChessRogueSelectCellScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1364082147:
          case 663147800: {
            if (input.isAtField(FieldNames.cellId)) {
              if (!input.trySkipNullValue()) {
                cellId = input.readUInt32();
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
    public ChessRogueSelectCellScRsp clone() {
      return new ChessRogueSelectCellScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueSelectCellScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueSelectCellScRsp(), data).checkInitialized();
    }

    public static ChessRogueSelectCellScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueSelectCellScRsp(), input).checkInitialized();
    }

    public static ChessRogueSelectCellScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueSelectCellScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueSelectCellScRsp messages
     */
    public static MessageFactory<ChessRogueSelectCellScRsp> getFactory() {
      return ChessRogueSelectCellScRspFactory.INSTANCE;
    }

    private enum ChessRogueSelectCellScRspFactory implements MessageFactory<ChessRogueSelectCellScRsp> {
      INSTANCE;

      @Override
      public ChessRogueSelectCellScRsp create() {
        return ChessRogueSelectCellScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName cellId = FieldName.forField("cellId", "cell_id");
    }
  }
}
