package com.couchbase.v2.couchbaseclusterspec.cluster.autocompaction;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"abortCompactionOutsideWindow","end","start"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class TimeWindow implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AbortCompactionOutsideWindow stops compaction processes when the process moves outside the window.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("abortCompactionOutsideWindow")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AbortCompactionOutsideWindow stops compaction processes when the process moves outside the window.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean abortCompactionOutsideWindow = false;

    public Boolean getAbortCompactionOutsideWindow() {
        return abortCompactionOutsideWindow;
    }

    public void setAbortCompactionOutsideWindow(Boolean abortCompactionOutsideWindow) {
        this.abortCompactionOutsideWindow = abortCompactionOutsideWindow;
    }

    /**
     * End is a wallclock time, in the form HH:MM, when a compaction should stop.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("end")
    @io.fabric8.generator.annotation.Pattern("^(2[0-3]|[01]?[0-9]):([0-5]?[0-9])$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("End is a wallclock time, in the form HH:MM, when a compaction should stop.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String end;

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * Start is a wallclock time, in the form HH:MM, when a compaction is permitted to start.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("start")
    @io.fabric8.generator.annotation.Pattern("^(2[0-3]|[01]?[0-9]):([0-5]?[0-9])$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Start is a wallclock time, in the form HH:MM, when a compaction is permitted to start.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String start;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }
}

