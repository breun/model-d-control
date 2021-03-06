package nl.breun.model_d.core.parameter

enum class GlobalParameter(val number: Int) {
    DEVICE_ID(0),
    MIDI_CHANNEL_IN(1),
    MIDI_CHANNEL_OUT(2),
    KEY_PRIORITY(3),
    MULTI_TRIGGER(4),
    BEND_SEMITONES(5),
    POLY_VOICE_NUMBER(6),
    POLY_VOICES_MAX(7),
    OUTPUT_MIDI_PITCH_BEND(8),
    OUTPUT_MIDI_PRESSURE(9),
    GATE_TRIGGER_SOURCES(10),
    TUNING_ERROR(11),
    TUNING_VARIANCE(12),
    TUNING_PROGRAM(13),
    VELOCITY_CURVE(14),
    MIDI_IN_TRANSPOSE(15),
    MIDI_OUT_TRANSPOSE(16),
    PRESSURE_CV_RANGE(17),
    MIDI_NOTE_ZERO_VOLTS(18),
    LOCAL_CONTROL(19)
}