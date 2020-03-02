
package ru.bukreev.cryptoprototype.model.poloniex;

import org.codehaus.jackson.annotate.*;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.HashMap;
import java.util.Map;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "id",
    "last",
    "lowestAsk",
    "highestBid",
    "percentChange",
    "baseVolume",
    "quoteVolume",
    "isFrozen",
    "high24hr",
    "low24hr"
})
public class USDCBCHABC {

    @JsonProperty("id")
    private long id;
    @JsonProperty("last")
    private String last;
    @JsonProperty("lowestAsk")
    private String lowestAsk;
    @JsonProperty("highestBid")
    private String highestBid;
    @JsonProperty("percentChange")
    private String percentChange;
    @JsonProperty("baseVolume")
    private String baseVolume;
    @JsonProperty("quoteVolume")
    private String quoteVolume;
    @JsonProperty("isFrozen")
    private String isFrozen;
    @JsonProperty("high24hr")
    private String high24hr;
    @JsonProperty("low24hr")
    private String low24hr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty("last")
    public String getLast() {
        return last;
    }

    @JsonProperty("last")
    public void setLast(String last) {
        this.last = last;
    }

    @JsonProperty("lowestAsk")
    public String getLowestAsk() {
        return lowestAsk;
    }

    @JsonProperty("lowestAsk")
    public void setLowestAsk(String lowestAsk) {
        this.lowestAsk = lowestAsk;
    }

    @JsonProperty("highestBid")
    public String getHighestBid() {
        return highestBid;
    }

    @JsonProperty("highestBid")
    public void setHighestBid(String highestBid) {
        this.highestBid = highestBid;
    }

    @JsonProperty("percentChange")
    public String getPercentChange() {
        return percentChange;
    }

    @JsonProperty("percentChange")
    public void setPercentChange(String percentChange) {
        this.percentChange = percentChange;
    }

    @JsonProperty("baseVolume")
    public String getBaseVolume() {
        return baseVolume;
    }

    @JsonProperty("baseVolume")
    public void setBaseVolume(String baseVolume) {
        this.baseVolume = baseVolume;
    }

    @JsonProperty("quoteVolume")
    public String getQuoteVolume() {
        return quoteVolume;
    }

    @JsonProperty("quoteVolume")
    public void setQuoteVolume(String quoteVolume) {
        this.quoteVolume = quoteVolume;
    }

    @JsonProperty("isFrozen")
    public String getIsFrozen() {
        return isFrozen;
    }

    @JsonProperty("isFrozen")
    public void setIsFrozen(String isFrozen) {
        this.isFrozen = isFrozen;
    }

    @JsonProperty("high24hr")
    public String getHigh24hr() {
        return high24hr;
    }

    @JsonProperty("high24hr")
    public void setHigh24hr(String high24hr) {
        this.high24hr = high24hr;
    }

    @JsonProperty("low24hr")
    public String getLow24hr() {
        return low24hr;
    }

    @JsonProperty("low24hr")
    public void setLow24hr(String low24hr) {
        this.low24hr = low24hr;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
