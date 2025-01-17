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

public final class SyncRogueCommonDialogueOptionFinishScNotifyOuterClass {
  /**
   * Protobuf type {@code SyncRogueCommonDialogueOptionFinishScNotify}
   */
  public static final class SyncRogueCommonDialogueOptionFinishScNotify extends ProtoMessage<SyncRogueCommonDialogueOptionFinishScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 event_unique_id = 3;</code>
     */
    private int eventUniqueId;

    /**
     * <code>optional uint32 option_id = 7;</code>
     */
    private int optionId;

    /**
     * <code>optional .RogueCommonDialogueOptionInfo result_option_info = 2;</code>
     */
    private final RogueCommonDialogueOptionInfoOuterClass.RogueCommonDialogueOptionInfo resultOptionInfo = RogueCommonDialogueOptionInfoOuterClass.RogueCommonDialogueOptionInfo.newInstance();

    /**
     * <code>optional .RogueCommonDialogueDataInfo dialogue_data = 12;</code>
     */
    private final RogueCommonDialogueDataInfoOuterClass.RogueCommonDialogueDataInfo dialogueData = RogueCommonDialogueDataInfoOuterClass.RogueCommonDialogueDataInfo.newInstance();

    private SyncRogueCommonDialogueOptionFinishScNotify() {
    }

    /**
     * @return a new empty instance of {@code SyncRogueCommonDialogueOptionFinishScNotify}
     */
    public static SyncRogueCommonDialogueOptionFinishScNotify newInstance() {
      return new SyncRogueCommonDialogueOptionFinishScNotify();
    }

    /**
     * <code>optional uint32 event_unique_id = 3;</code>
     * @return whether the eventUniqueId field is set
     */
    public boolean hasEventUniqueId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 event_unique_id = 3;</code>
     * @return this
     */
    public SyncRogueCommonDialogueOptionFinishScNotify clearEventUniqueId() {
      bitField0_ &= ~0x00000001;
      eventUniqueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 event_unique_id = 3;</code>
     * @return the eventUniqueId
     */
    public int getEventUniqueId() {
      return eventUniqueId;
    }

    /**
     * <code>optional uint32 event_unique_id = 3;</code>
     * @param value the eventUniqueId to set
     * @return this
     */
    public SyncRogueCommonDialogueOptionFinishScNotify setEventUniqueId(final int value) {
      bitField0_ |= 0x00000001;
      eventUniqueId = value;
      return this;
    }

    /**
     * <code>optional uint32 option_id = 7;</code>
     * @return whether the optionId field is set
     */
    public boolean hasOptionId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 option_id = 7;</code>
     * @return this
     */
    public SyncRogueCommonDialogueOptionFinishScNotify clearOptionId() {
      bitField0_ &= ~0x00000002;
      optionId = 0;
      return this;
    }

    /**
     * <code>optional uint32 option_id = 7;</code>
     * @return the optionId
     */
    public int getOptionId() {
      return optionId;
    }

    /**
     * <code>optional uint32 option_id = 7;</code>
     * @param value the optionId to set
     * @return this
     */
    public SyncRogueCommonDialogueOptionFinishScNotify setOptionId(final int value) {
      bitField0_ |= 0x00000002;
      optionId = value;
      return this;
    }

    /**
     * <code>optional .RogueCommonDialogueOptionInfo result_option_info = 2;</code>
     * @return whether the resultOptionInfo field is set
     */
    public boolean hasResultOptionInfo() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .RogueCommonDialogueOptionInfo result_option_info = 2;</code>
     * @return this
     */
    public SyncRogueCommonDialogueOptionFinishScNotify clearResultOptionInfo() {
      bitField0_ &= ~0x00000004;
      resultOptionInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueCommonDialogueOptionInfo result_option_info = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableResultOptionInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCommonDialogueOptionInfoOuterClass.RogueCommonDialogueOptionInfo getResultOptionInfo(
        ) {
      return resultOptionInfo;
    }

    /**
     * <code>optional .RogueCommonDialogueOptionInfo result_option_info = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCommonDialogueOptionInfoOuterClass.RogueCommonDialogueOptionInfo getMutableResultOptionInfo(
        ) {
      bitField0_ |= 0x00000004;
      return resultOptionInfo;
    }

    /**
     * <code>optional .RogueCommonDialogueOptionInfo result_option_info = 2;</code>
     * @param value the resultOptionInfo to set
     * @return this
     */
    public SyncRogueCommonDialogueOptionFinishScNotify setResultOptionInfo(
        final RogueCommonDialogueOptionInfoOuterClass.RogueCommonDialogueOptionInfo value) {
      bitField0_ |= 0x00000004;
      resultOptionInfo.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .RogueCommonDialogueDataInfo dialogue_data = 12;</code>
     * @return whether the dialogueData field is set
     */
    public boolean hasDialogueData() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .RogueCommonDialogueDataInfo dialogue_data = 12;</code>
     * @return this
     */
    public SyncRogueCommonDialogueOptionFinishScNotify clearDialogueData() {
      bitField0_ &= ~0x00000008;
      dialogueData.clear();
      return this;
    }

    /**
     * <code>optional .RogueCommonDialogueDataInfo dialogue_data = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDialogueData()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueCommonDialogueDataInfoOuterClass.RogueCommonDialogueDataInfo getDialogueData() {
      return dialogueData;
    }

    /**
     * <code>optional .RogueCommonDialogueDataInfo dialogue_data = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueCommonDialogueDataInfoOuterClass.RogueCommonDialogueDataInfo getMutableDialogueData(
        ) {
      bitField0_ |= 0x00000008;
      return dialogueData;
    }

    /**
     * <code>optional .RogueCommonDialogueDataInfo dialogue_data = 12;</code>
     * @param value the dialogueData to set
     * @return this
     */
    public SyncRogueCommonDialogueOptionFinishScNotify setDialogueData(
        final RogueCommonDialogueDataInfoOuterClass.RogueCommonDialogueDataInfo value) {
      bitField0_ |= 0x00000008;
      dialogueData.copyFrom(value);
      return this;
    }

    @Override
    public SyncRogueCommonDialogueOptionFinishScNotify copyFrom(
        final SyncRogueCommonDialogueOptionFinishScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        eventUniqueId = other.eventUniqueId;
        optionId = other.optionId;
        resultOptionInfo.copyFrom(other.resultOptionInfo);
        dialogueData.copyFrom(other.dialogueData);
      }
      return this;
    }

    @Override
    public SyncRogueCommonDialogueOptionFinishScNotify mergeFrom(
        final SyncRogueCommonDialogueOptionFinishScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasEventUniqueId()) {
        setEventUniqueId(other.eventUniqueId);
      }
      if (other.hasOptionId()) {
        setOptionId(other.optionId);
      }
      if (other.hasResultOptionInfo()) {
        getMutableResultOptionInfo().mergeFrom(other.resultOptionInfo);
      }
      if (other.hasDialogueData()) {
        getMutableDialogueData().mergeFrom(other.dialogueData);
      }
      return this;
    }

    @Override
    public SyncRogueCommonDialogueOptionFinishScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      eventUniqueId = 0;
      optionId = 0;
      resultOptionInfo.clear();
      dialogueData.clear();
      return this;
    }

    @Override
    public SyncRogueCommonDialogueOptionFinishScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      resultOptionInfo.clearQuick();
      dialogueData.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SyncRogueCommonDialogueOptionFinishScNotify)) {
        return false;
      }
      SyncRogueCommonDialogueOptionFinishScNotify other = (SyncRogueCommonDialogueOptionFinishScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasEventUniqueId() || eventUniqueId == other.eventUniqueId)
        && (!hasOptionId() || optionId == other.optionId)
        && (!hasResultOptionInfo() || resultOptionInfo.equals(other.resultOptionInfo))
        && (!hasDialogueData() || dialogueData.equals(other.dialogueData));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(eventUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(optionId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 18);
        output.writeMessageNoTag(resultOptionInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(dialogueData);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(eventUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(optionId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(resultOptionInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(dialogueData);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SyncRogueCommonDialogueOptionFinishScNotify mergeFrom(final ProtoSource input) throws
        IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // eventUniqueId
            eventUniqueId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // optionId
            optionId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // resultOptionInfo
            input.readMessage(resultOptionInfo);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // dialogueData
            input.readMessage(dialogueData);
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
        output.writeUInt32(FieldNames.eventUniqueId, eventUniqueId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.optionId, optionId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeMessage(FieldNames.resultOptionInfo, resultOptionInfo);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.dialogueData, dialogueData);
      }
      output.endObject();
    }

    @Override
    public SyncRogueCommonDialogueOptionFinishScNotify mergeFrom(final JsonSource input) throws
        IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 2091680134:
          case -157385500: {
            if (input.isAtField(FieldNames.eventUniqueId)) {
              if (!input.trySkipNullValue()) {
                eventUniqueId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -79017872:
          case 1845434661: {
            if (input.isAtField(FieldNames.optionId)) {
              if (!input.trySkipNullValue()) {
                optionId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -565706048:
          case -465340138: {
            if (input.isAtField(FieldNames.resultOptionInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(resultOptionInfo);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1350537634:
          case -1057999439: {
            if (input.isAtField(FieldNames.dialogueData)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(dialogueData);
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
    public SyncRogueCommonDialogueOptionFinishScNotify clone() {
      return new SyncRogueCommonDialogueOptionFinishScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SyncRogueCommonDialogueOptionFinishScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SyncRogueCommonDialogueOptionFinishScNotify(), data).checkInitialized();
    }

    public static SyncRogueCommonDialogueOptionFinishScNotify parseFrom(final ProtoSource input)
        throws IOException {
      return ProtoMessage.mergeFrom(new SyncRogueCommonDialogueOptionFinishScNotify(), input).checkInitialized();
    }

    public static SyncRogueCommonDialogueOptionFinishScNotify parseFrom(final JsonSource input)
        throws IOException {
      return ProtoMessage.mergeFrom(new SyncRogueCommonDialogueOptionFinishScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating SyncRogueCommonDialogueOptionFinishScNotify messages
     */
    public static MessageFactory<SyncRogueCommonDialogueOptionFinishScNotify> getFactory() {
      return SyncRogueCommonDialogueOptionFinishScNotifyFactory.INSTANCE;
    }

    private enum SyncRogueCommonDialogueOptionFinishScNotifyFactory implements MessageFactory<SyncRogueCommonDialogueOptionFinishScNotify> {
      INSTANCE;

      @Override
      public SyncRogueCommonDialogueOptionFinishScNotify create() {
        return SyncRogueCommonDialogueOptionFinishScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName eventUniqueId = FieldName.forField("eventUniqueId", "event_unique_id");

      static final FieldName optionId = FieldName.forField("optionId", "option_id");

      static final FieldName resultOptionInfo = FieldName.forField("resultOptionInfo", "result_option_info");

      static final FieldName dialogueData = FieldName.forField("dialogueData", "dialogue_data");
    }
  }
}
