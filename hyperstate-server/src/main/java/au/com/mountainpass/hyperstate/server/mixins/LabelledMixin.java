package au.com.mountainpass.hyperstate.server.mixins;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import au.com.mountainpass.hyperstate.server.serialization.MessageSourceAwareSerializer;

public abstract class LabelledMixin {

    @JsonSerialize(using = MessageSourceAwareSerializer.class)
    @JsonProperty("title")
    public abstract String getLabel();

}
