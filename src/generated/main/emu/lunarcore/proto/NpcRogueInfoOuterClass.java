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
import us.hebi.quickbuf.RepeatedMessage;

public final class NpcRogueInfoOuterClass {
  /**
   * Protobuf type {@code NpcRogueInfo}
   */
  public static final class NpcRogueInfo extends ProtoMessage<NpcRogueInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 OENLKDCLEOA = 2;</code>
     */
    private int oENLKDCLEOA;

    /**
     * <code>optional uint32 event_unique_id = 4;</code>
     */
    private int eventUniqueId;

    /**
     * <code>optional uint32 event_id = 11;</code>
     */
    private int eventId;

    /**
     * <code>optional uint32 dialogue_id = 12;</code>
     */
    private int dialogueId;

    /**
     * <code>optional bool JFCBEHNMGNO = 1;</code>
     */
    private boolean jFCBEHNMGNO;

    /**
     * <code>optional bool JOFMIKFBGHP = 9;</code>
     */
    private boolean jOFMIKFBGHP;

    /**
     * <code>optional bool finish_dialogue = 15;</code>
     */
    private boolean finishDialogue;

    /**
     * <code>repeated .NpcDialogueEventParam dialogue_event_param_list = 5;</code>
     */
    private final RepeatedMessage<NpcDialogueEventParamOuterClass.NpcDialogueEventParam> dialogueEventParamList = RepeatedMessage.newEmptyInstance(NpcDialogueEventParamOuterClass.NpcDialogueEventParam.getFactory());

    /**
     * <code>repeated .NpcRogueInfo.FKDHDCGOIMFEntry FKDHDCGOIMF = 8;</code>
     */
    private final RepeatedMessage<FKDHDCGOIMFEntry> fKDHDCGOIMF = RepeatedMessage.newEmptyInstance(FKDHDCGOIMFEntry.getFactory());

    private NpcRogueInfo() {
    }

    /**
     * @return a new empty instance of {@code NpcRogueInfo}
     */
    public static NpcRogueInfo newInstance() {
      return new NpcRogueInfo();
    }

    /**
     * <code>optional uint32 OENLKDCLEOA = 2;</code>
     * @return whether the oENLKDCLEOA field is set
     */
    public boolean hasOENLKDCLEOA() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 OENLKDCLEOA = 2;</code>
     * @return this
     */
    public NpcRogueInfo clearOENLKDCLEOA() {
      bitField0_ &= ~0x00000001;
      oENLKDCLEOA = 0;
      return this;
    }

    /**
     * <code>optional uint32 OENLKDCLEOA = 2;</code>
     * @return the oENLKDCLEOA
     */
    public int getOENLKDCLEOA() {
      return oENLKDCLEOA;
    }

    /**
     * <code>optional uint32 OENLKDCLEOA = 2;</code>
     * @param value the oENLKDCLEOA to set
     * @return this
     */
    public NpcRogueInfo setOENLKDCLEOA(final int value) {
      bitField0_ |= 0x00000001;
      oENLKDCLEOA = value;
      return this;
    }

    /**
     * <code>optional uint32 event_unique_id = 4;</code>
     * @return whether the eventUniqueId field is set
     */
    public boolean hasEventUniqueId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 event_unique_id = 4;</code>
     * @return this
     */
    public NpcRogueInfo clearEventUniqueId() {
      bitField0_ &= ~0x00000002;
      eventUniqueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 event_unique_id = 4;</code>
     * @return the eventUniqueId
     */
    public int getEventUniqueId() {
      return eventUniqueId;
    }

    /**
     * <code>optional uint32 event_unique_id = 4;</code>
     * @param value the eventUniqueId to set
     * @return this
     */
    public NpcRogueInfo setEventUniqueId(final int value) {
      bitField0_ |= 0x00000002;
      eventUniqueId = value;
      return this;
    }

    /**
     * <code>optional uint32 event_id = 11;</code>
     * @return whether the eventId field is set
     */
    public boolean hasEventId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 event_id = 11;</code>
     * @return this
     */
    public NpcRogueInfo clearEventId() {
      bitField0_ &= ~0x00000004;
      eventId = 0;
      return this;
    }

    /**
     * <code>optional uint32 event_id = 11;</code>
     * @return the eventId
     */
    public int getEventId() {
      return eventId;
    }

    /**
     * <code>optional uint32 event_id = 11;</code>
     * @param value the eventId to set
     * @return this
     */
    public NpcRogueInfo setEventId(final int value) {
      bitField0_ |= 0x00000004;
      eventId = value;
      return this;
    }

    /**
     * <code>optional uint32 dialogue_id = 12;</code>
     * @return whether the dialogueId field is set
     */
    public boolean hasDialogueId() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 dialogue_id = 12;</code>
     * @return this
     */
    public NpcRogueInfo clearDialogueId() {
      bitField0_ &= ~0x00000008;
      dialogueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 dialogue_id = 12;</code>
     * @return the dialogueId
     */
    public int getDialogueId() {
      return dialogueId;
    }

    /**
     * <code>optional uint32 dialogue_id = 12;</code>
     * @param value the dialogueId to set
     * @return this
     */
    public NpcRogueInfo setDialogueId(final int value) {
      bitField0_ |= 0x00000008;
      dialogueId = value;
      return this;
    }

    /**
     * <code>optional bool JFCBEHNMGNO = 1;</code>
     * @return whether the jFCBEHNMGNO field is set
     */
    public boolean hasJFCBEHNMGNO() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional bool JFCBEHNMGNO = 1;</code>
     * @return this
     */
    public NpcRogueInfo clearJFCBEHNMGNO() {
      bitField0_ &= ~0x00000010;
      jFCBEHNMGNO = false;
      return this;
    }

    /**
     * <code>optional bool JFCBEHNMGNO = 1;</code>
     * @return the jFCBEHNMGNO
     */
    public boolean getJFCBEHNMGNO() {
      return jFCBEHNMGNO;
    }

    /**
     * <code>optional bool JFCBEHNMGNO = 1;</code>
     * @param value the jFCBEHNMGNO to set
     * @return this
     */
    public NpcRogueInfo setJFCBEHNMGNO(final boolean value) {
      bitField0_ |= 0x00000010;
      jFCBEHNMGNO = value;
      return this;
    }

    /**
     * <code>optional bool JOFMIKFBGHP = 9;</code>
     * @return whether the jOFMIKFBGHP field is set
     */
    public boolean hasJOFMIKFBGHP() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional bool JOFMIKFBGHP = 9;</code>
     * @return this
     */
    public NpcRogueInfo clearJOFMIKFBGHP() {
      bitField0_ &= ~0x00000020;
      jOFMIKFBGHP = false;
      return this;
    }

    /**
     * <code>optional bool JOFMIKFBGHP = 9;</code>
     * @return the jOFMIKFBGHP
     */
    public boolean getJOFMIKFBGHP() {
      return jOFMIKFBGHP;
    }

    /**
     * <code>optional bool JOFMIKFBGHP = 9;</code>
     * @param value the jOFMIKFBGHP to set
     * @return this
     */
    public NpcRogueInfo setJOFMIKFBGHP(final boolean value) {
      bitField0_ |= 0x00000020;
      jOFMIKFBGHP = value;
      return this;
    }

    /**
     * <code>optional bool finish_dialogue = 15;</code>
     * @return whether the finishDialogue field is set
     */
    public boolean hasFinishDialogue() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional bool finish_dialogue = 15;</code>
     * @return this
     */
    public NpcRogueInfo clearFinishDialogue() {
      bitField0_ &= ~0x00000040;
      finishDialogue = false;
      return this;
    }

    /**
     * <code>optional bool finish_dialogue = 15;</code>
     * @return the finishDialogue
     */
    public boolean getFinishDialogue() {
      return finishDialogue;
    }

    /**
     * <code>optional bool finish_dialogue = 15;</code>
     * @param value the finishDialogue to set
     * @return this
     */
    public NpcRogueInfo setFinishDialogue(final boolean value) {
      bitField0_ |= 0x00000040;
      finishDialogue = value;
      return this;
    }

    /**
     * <code>repeated .NpcDialogueEventParam dialogue_event_param_list = 5;</code>
     * @return whether the dialogueEventParamList field is set
     */
    public boolean hasDialogueEventParamList() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>repeated .NpcDialogueEventParam dialogue_event_param_list = 5;</code>
     * @return this
     */
    public NpcRogueInfo clearDialogueEventParamList() {
      bitField0_ &= ~0x00000080;
      dialogueEventParamList.clear();
      return this;
    }

    /**
     * <code>repeated .NpcDialogueEventParam dialogue_event_param_list = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDialogueEventParamList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<NpcDialogueEventParamOuterClass.NpcDialogueEventParam> getDialogueEventParamList(
        ) {
      return dialogueEventParamList;
    }

    /**
     * <code>repeated .NpcDialogueEventParam dialogue_event_param_list = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<NpcDialogueEventParamOuterClass.NpcDialogueEventParam> getMutableDialogueEventParamList(
        ) {
      bitField0_ |= 0x00000080;
      return dialogueEventParamList;
    }

    /**
     * <code>repeated .NpcDialogueEventParam dialogue_event_param_list = 5;</code>
     * @param value the dialogueEventParamList to add
     * @return this
     */
    public NpcRogueInfo addDialogueEventParamList(
        final NpcDialogueEventParamOuterClass.NpcDialogueEventParam value) {
      bitField0_ |= 0x00000080;
      dialogueEventParamList.add(value);
      return this;
    }

    /**
     * <code>repeated .NpcDialogueEventParam dialogue_event_param_list = 5;</code>
     * @param values the dialogueEventParamList to add
     * @return this
     */
    public NpcRogueInfo addAllDialogueEventParamList(
        final NpcDialogueEventParamOuterClass.NpcDialogueEventParam... values) {
      bitField0_ |= 0x00000080;
      dialogueEventParamList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .NpcRogueInfo.FKDHDCGOIMFEntry FKDHDCGOIMF = 8;</code>
     * @return whether the fKDHDCGOIMF field is set
     */
    public boolean hasFKDHDCGOIMF() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <code>repeated .NpcRogueInfo.FKDHDCGOIMFEntry FKDHDCGOIMF = 8;</code>
     * @return this
     */
    public NpcRogueInfo clearFKDHDCGOIMF() {
      bitField0_ &= ~0x00000100;
      fKDHDCGOIMF.clear();
      return this;
    }

    /**
     * <code>repeated .NpcRogueInfo.FKDHDCGOIMFEntry FKDHDCGOIMF = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableFKDHDCGOIMF()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<FKDHDCGOIMFEntry> getFKDHDCGOIMF() {
      return fKDHDCGOIMF;
    }

    /**
     * <code>repeated .NpcRogueInfo.FKDHDCGOIMFEntry FKDHDCGOIMF = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<FKDHDCGOIMFEntry> getMutableFKDHDCGOIMF() {
      bitField0_ |= 0x00000100;
      return fKDHDCGOIMF;
    }

    /**
     * <code>repeated .NpcRogueInfo.FKDHDCGOIMFEntry FKDHDCGOIMF = 8;</code>
     * @param value the fKDHDCGOIMF to add
     * @return this
     */
    public NpcRogueInfo addFKDHDCGOIMF(final FKDHDCGOIMFEntry value) {
      bitField0_ |= 0x00000100;
      fKDHDCGOIMF.add(value);
      return this;
    }

    /**
     * <code>repeated .NpcRogueInfo.FKDHDCGOIMFEntry FKDHDCGOIMF = 8;</code>
     * @param values the fKDHDCGOIMF to add
     * @return this
     */
    public NpcRogueInfo addAllFKDHDCGOIMF(final FKDHDCGOIMFEntry... values) {
      bitField0_ |= 0x00000100;
      fKDHDCGOIMF.addAll(values);
      return this;
    }

    @Override
    public NpcRogueInfo copyFrom(final NpcRogueInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        oENLKDCLEOA = other.oENLKDCLEOA;
        eventUniqueId = other.eventUniqueId;
        eventId = other.eventId;
        dialogueId = other.dialogueId;
        jFCBEHNMGNO = other.jFCBEHNMGNO;
        jOFMIKFBGHP = other.jOFMIKFBGHP;
        finishDialogue = other.finishDialogue;
        dialogueEventParamList.copyFrom(other.dialogueEventParamList);
        fKDHDCGOIMF.copyFrom(other.fKDHDCGOIMF);
      }
      return this;
    }

    @Override
    public NpcRogueInfo mergeFrom(final NpcRogueInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasOENLKDCLEOA()) {
        setOENLKDCLEOA(other.oENLKDCLEOA);
      }
      if (other.hasEventUniqueId()) {
        setEventUniqueId(other.eventUniqueId);
      }
      if (other.hasEventId()) {
        setEventId(other.eventId);
      }
      if (other.hasDialogueId()) {
        setDialogueId(other.dialogueId);
      }
      if (other.hasJFCBEHNMGNO()) {
        setJFCBEHNMGNO(other.jFCBEHNMGNO);
      }
      if (other.hasJOFMIKFBGHP()) {
        setJOFMIKFBGHP(other.jOFMIKFBGHP);
      }
      if (other.hasFinishDialogue()) {
        setFinishDialogue(other.finishDialogue);
      }
      if (other.hasDialogueEventParamList()) {
        getMutableDialogueEventParamList().addAll(other.dialogueEventParamList);
      }
      if (other.hasFKDHDCGOIMF()) {
        getMutableFKDHDCGOIMF().addAll(other.fKDHDCGOIMF);
      }
      return this;
    }

    @Override
    public NpcRogueInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      oENLKDCLEOA = 0;
      eventUniqueId = 0;
      eventId = 0;
      dialogueId = 0;
      jFCBEHNMGNO = false;
      jOFMIKFBGHP = false;
      finishDialogue = false;
      dialogueEventParamList.clear();
      fKDHDCGOIMF.clear();
      return this;
    }

    @Override
    public NpcRogueInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      dialogueEventParamList.clearQuick();
      fKDHDCGOIMF.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof NpcRogueInfo)) {
        return false;
      }
      NpcRogueInfo other = (NpcRogueInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasOENLKDCLEOA() || oENLKDCLEOA == other.oENLKDCLEOA)
        && (!hasEventUniqueId() || eventUniqueId == other.eventUniqueId)
        && (!hasEventId() || eventId == other.eventId)
        && (!hasDialogueId() || dialogueId == other.dialogueId)
        && (!hasJFCBEHNMGNO() || jFCBEHNMGNO == other.jFCBEHNMGNO)
        && (!hasJOFMIKFBGHP() || jOFMIKFBGHP == other.jOFMIKFBGHP)
        && (!hasFinishDialogue() || finishDialogue == other.finishDialogue)
        && (!hasDialogueEventParamList() || dialogueEventParamList.equals(other.dialogueEventParamList))
        && (!hasFKDHDCGOIMF() || fKDHDCGOIMF.equals(other.fKDHDCGOIMF));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(oENLKDCLEOA);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(eventUniqueId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(eventId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(dialogueId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 8);
        output.writeBoolNoTag(jFCBEHNMGNO);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 72);
        output.writeBoolNoTag(jOFMIKFBGHP);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 120);
        output.writeBoolNoTag(finishDialogue);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        for (int i = 0; i < dialogueEventParamList.length(); i++) {
          output.writeRawByte((byte) 42);
          output.writeMessageNoTag(dialogueEventParamList.get(i));
        }
      }
      if ((bitField0_ & 0x00000100) != 0) {
        for (int i = 0; i < fKDHDCGOIMF.length(); i++) {
          output.writeRawByte((byte) 66);
          output.writeMessageNoTag(fKDHDCGOIMF.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(oENLKDCLEOA);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(eventUniqueId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(eventId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(dialogueId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += (1 * dialogueEventParamList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(dialogueEventParamList);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += (1 * fKDHDCGOIMF.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(fKDHDCGOIMF);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public NpcRogueInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // oENLKDCLEOA
            oENLKDCLEOA = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // eventUniqueId
            eventUniqueId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // eventId
            eventId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // dialogueId
            dialogueId = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 8) {
              break;
            }
          }
          case 8: {
            // jFCBEHNMGNO
            jFCBEHNMGNO = input.readBool();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // jOFMIKFBGHP
            jOFMIKFBGHP = input.readBool();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // finishDialogue
            finishDialogue = input.readBool();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // dialogueEventParamList
            tag = input.readRepeatedMessage(dialogueEventParamList, tag);
            bitField0_ |= 0x00000080;
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // fKDHDCGOIMF
            tag = input.readRepeatedMessage(fKDHDCGOIMF, tag);
            bitField0_ |= 0x00000100;
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
        output.writeUInt32(FieldNames.oENLKDCLEOA, oENLKDCLEOA);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.eventUniqueId, eventUniqueId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.eventId, eventId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.dialogueId, dialogueId);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeBool(FieldNames.jFCBEHNMGNO, jFCBEHNMGNO);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeBool(FieldNames.jOFMIKFBGHP, jOFMIKFBGHP);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeBool(FieldNames.finishDialogue, finishDialogue);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRepeatedMessage(FieldNames.dialogueEventParamList, dialogueEventParamList);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRepeatedMessage(FieldNames.fKDHDCGOIMF, fKDHDCGOIMF);
      }
      output.endObject();
    }

    @Override
    public NpcRogueInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -983404159: {
            if (input.isAtField(FieldNames.oENLKDCLEOA)) {
              if (!input.trySkipNullValue()) {
                oENLKDCLEOA = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2091680134:
          case -157385500: {
            if (input.isAtField(FieldNames.eventUniqueId)) {
              if (!input.trySkipNullValue()) {
                eventUniqueId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1376502443:
          case 278118624: {
            if (input.isAtField(FieldNames.eventId)) {
              if (!input.trySkipNullValue()) {
                eventId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1384067821:
          case 43591906: {
            if (input.isAtField(FieldNames.dialogueId)) {
              if (!input.trySkipNullValue()) {
                dialogueId = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 763452523: {
            if (input.isAtField(FieldNames.jFCBEHNMGNO)) {
              if (!input.trySkipNullValue()) {
                jFCBEHNMGNO = input.readBool();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -808301787: {
            if (input.isAtField(FieldNames.jOFMIKFBGHP)) {
              if (!input.trySkipNullValue()) {
                jOFMIKFBGHP = input.readBool();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 552830859:
          case 764736516: {
            if (input.isAtField(FieldNames.finishDialogue)) {
              if (!input.trySkipNullValue()) {
                finishDialogue = input.readBool();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -340413111:
          case -612945060: {
            if (input.isAtField(FieldNames.dialogueEventParamList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(dialogueEventParamList);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1696143474: {
            if (input.isAtField(FieldNames.fKDHDCGOIMF)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(fKDHDCGOIMF);
                bitField0_ |= 0x00000100;
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
    public NpcRogueInfo clone() {
      return new NpcRogueInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static NpcRogueInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new NpcRogueInfo(), data).checkInitialized();
    }

    public static NpcRogueInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new NpcRogueInfo(), input).checkInitialized();
    }

    public static NpcRogueInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new NpcRogueInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating NpcRogueInfo messages
     */
    public static MessageFactory<NpcRogueInfo> getFactory() {
      return NpcRogueInfoFactory.INSTANCE;
    }

    /**
     * Protobuf type {@code FKDHDCGOIMFEntry}
     */
    public static final class FKDHDCGOIMFEntry extends ProtoMessage<FKDHDCGOIMFEntry> implements Cloneable {
      private static final long serialVersionUID = 0L;

      /**
       * <code>optional uint32 key = 1;</code>
       */
      private int key;

      /**
       * <code>optional uint32 value = 2;</code>
       */
      private int value_;

      private FKDHDCGOIMFEntry() {
      }

      /**
       * @return a new empty instance of {@code FKDHDCGOIMFEntry}
       */
      public static FKDHDCGOIMFEntry newInstance() {
        return new FKDHDCGOIMFEntry();
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return whether the key field is set
       */
      public boolean hasKey() {
        return (bitField0_ & 0x00000001) != 0;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return this
       */
      public FKDHDCGOIMFEntry clearKey() {
        bitField0_ &= ~0x00000001;
        key = 0;
        return this;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return the key
       */
      public int getKey() {
        return key;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @param value the key to set
       * @return this
       */
      public FKDHDCGOIMFEntry setKey(final int value) {
        bitField0_ |= 0x00000001;
        key = value;
        return this;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return whether the value_ field is set
       */
      public boolean hasValue() {
        return (bitField0_ & 0x00000002) != 0;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return this
       */
      public FKDHDCGOIMFEntry clearValue() {
        bitField0_ &= ~0x00000002;
        value_ = 0;
        return this;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return the value_
       */
      public int getValue() {
        return value_;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @param value the value_ to set
       * @return this
       */
      public FKDHDCGOIMFEntry setValue(final int value) {
        bitField0_ |= 0x00000002;
        value_ = value;
        return this;
      }

      @Override
      public FKDHDCGOIMFEntry copyFrom(final FKDHDCGOIMFEntry other) {
        cachedSize = other.cachedSize;
        if ((bitField0_ | other.bitField0_) != 0) {
          bitField0_ = other.bitField0_;
          key = other.key;
          value_ = other.value_;
        }
        return this;
      }

      @Override
      public FKDHDCGOIMFEntry mergeFrom(final FKDHDCGOIMFEntry other) {
        if (other.isEmpty()) {
          return this;
        }
        cachedSize = -1;
        if (other.hasKey()) {
          setKey(other.key);
        }
        if (other.hasValue()) {
          setValue(other.value_);
        }
        return this;
      }

      @Override
      public FKDHDCGOIMFEntry clear() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        key = 0;
        value_ = 0;
        return this;
      }

      @Override
      public FKDHDCGOIMFEntry clearQuick() {
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
        if (!(o instanceof FKDHDCGOIMFEntry)) {
          return false;
        }
        FKDHDCGOIMFEntry other = (FKDHDCGOIMFEntry) o;
        return bitField0_ == other.bitField0_
          && (!hasKey() || key == other.key)
          && (!hasValue() || value_ == other.value_);
      }

      @Override
      public void writeTo(final ProtoSink output) throws IOException {
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeRawByte((byte) 8);
          output.writeUInt32NoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeRawByte((byte) 16);
          output.writeUInt32NoTag(value_);
        }
      }

      @Override
      protected int computeSerializedSize() {
        int size = 0;
        if ((bitField0_ & 0x00000001) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(value_);
        }
        return size;
      }

      @Override
      @SuppressWarnings("fallthrough")
      public FKDHDCGOIMFEntry mergeFrom(final ProtoSource input) throws IOException {
        // Enabled Fall-Through Optimization (QuickBuffers)
        int tag = input.readTag();
        while (true) {
          switch (tag) {
            case 8: {
              // key
              key = input.readUInt32();
              bitField0_ |= 0x00000001;
              tag = input.readTag();
              if (tag != 16) {
                break;
              }
            }
            case 16: {
              // value_
              value_ = input.readUInt32();
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
          output.writeUInt32(FieldNames.key, key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeUInt32(FieldNames.value_, value_);
        }
        output.endObject();
      }

      @Override
      public FKDHDCGOIMFEntry mergeFrom(final JsonSource input) throws IOException {
        if (!input.beginObject()) {
          return this;
        }
        while (!input.isAtEnd()) {
          switch (input.readFieldHash()) {
            case 106079: {
              if (input.isAtField(FieldNames.key)) {
                if (!input.trySkipNullValue()) {
                  key = input.readUInt32();
                  bitField0_ |= 0x00000001;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 111972721: {
              if (input.isAtField(FieldNames.value_)) {
                if (!input.trySkipNullValue()) {
                  value_ = input.readUInt32();
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
      public FKDHDCGOIMFEntry clone() {
        return new FKDHDCGOIMFEntry().copyFrom(this);
      }

      @Override
      public boolean isEmpty() {
        return ((bitField0_) == 0);
      }

      public static FKDHDCGOIMFEntry parseFrom(final byte[] data) throws
          InvalidProtocolBufferException {
        return ProtoMessage.mergeFrom(new FKDHDCGOIMFEntry(), data).checkInitialized();
      }

      public static FKDHDCGOIMFEntry parseFrom(final ProtoSource input) throws IOException {
        return ProtoMessage.mergeFrom(new FKDHDCGOIMFEntry(), input).checkInitialized();
      }

      public static FKDHDCGOIMFEntry parseFrom(final JsonSource input) throws IOException {
        return ProtoMessage.mergeFrom(new FKDHDCGOIMFEntry(), input).checkInitialized();
      }

      /**
       * @return factory for creating FKDHDCGOIMFEntry messages
       */
      public static MessageFactory<FKDHDCGOIMFEntry> getFactory() {
        return FKDHDCGOIMFEntryFactory.INSTANCE;
      }

      private enum FKDHDCGOIMFEntryFactory implements MessageFactory<FKDHDCGOIMFEntry> {
        INSTANCE;

        @Override
        public FKDHDCGOIMFEntry create() {
          return FKDHDCGOIMFEntry.newInstance();
        }
      }

      /**
       * Contains name constants used for serializing JSON
       */
      static class FieldNames {
        static final FieldName key = FieldName.forField("key");

        static final FieldName value_ = FieldName.forField("value");
      }
    }

    private enum NpcRogueInfoFactory implements MessageFactory<NpcRogueInfo> {
      INSTANCE;

      @Override
      public NpcRogueInfo create() {
        return NpcRogueInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName oENLKDCLEOA = FieldName.forField("OENLKDCLEOA");

      static final FieldName eventUniqueId = FieldName.forField("eventUniqueId", "event_unique_id");

      static final FieldName eventId = FieldName.forField("eventId", "event_id");

      static final FieldName dialogueId = FieldName.forField("dialogueId", "dialogue_id");

      static final FieldName jFCBEHNMGNO = FieldName.forField("JFCBEHNMGNO");

      static final FieldName jOFMIKFBGHP = FieldName.forField("JOFMIKFBGHP");

      static final FieldName finishDialogue = FieldName.forField("finishDialogue", "finish_dialogue");

      static final FieldName dialogueEventParamList = FieldName.forField("dialogueEventParamList", "dialogue_event_param_list");

      static final FieldName fKDHDCGOIMF = FieldName.forField("FKDHDCGOIMF");
    }
  }
}
