
package ru.bukreev.cryptoprototype.model.poloniex;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class BTCSTRAT {

    private long id;
    private String last;
    private String lowestAsk;
    private String highestBid;
    private String percentChange;
    private String baseVolume;
    private String quoteVolume;
    private String isFrozen;
    private String high24hr;
    private String low24hr;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getLowestAsk() {
        return lowestAsk;
    }

    public void setLowestAsk(String lowestAsk) {
        this.lowestAsk = lowestAsk;
    }

    public String getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(String highestBid) {
        this.highestBid = highestBid;
    }

    public String getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(String percentChange) {
        this.percentChange = percentChange;
    }

    public String getBaseVolume() {
        return baseVolume;
    }

    public void setBaseVolume(String baseVolume) {
        this.baseVolume = baseVolume;
    }

    public String getQuoteVolume() {
        return quoteVolume;
    }

    public void setQuoteVolume(String quoteVolume) {
        this.quoteVolume = quoteVolume;
    }

    public String getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(String isFrozen) {
        this.isFrozen = isFrozen;
    }

    public String getHigh24hr() {
        return high24hr;
    }

    public void setHigh24hr(String high24hr) {
        this.high24hr = high24hr;
    }

    public String getLow24hr() {
        return low24hr;
    }

    public void setLow24hr(String low24hr) {
        this.low24hr = low24hr;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("last", last).append("lowestAsk", lowestAsk).append("highestBid", highestBid).append("percentChange", percentChange).append("baseVolume", baseVolume).append("quoteVolume", quoteVolume).append("isFrozen", isFrozen).append("high24hr", high24hr).append("low24hr", low24hr).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(percentChange).append(high24hr).append(last).append(highestBid).append(id).append(quoteVolume).append(additionalProperties).append(baseVolume).append(isFrozen).append(lowestAsk).append(low24hr).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BTCSTRAT) == false) {
            return false;
        }
        BTCSTRAT rhs = ((BTCSTRAT) other);
        return new EqualsBuilder().append(percentChange, rhs.percentChange).append(high24hr, rhs.high24hr).append(last, rhs.last).append(highestBid, rhs.highestBid).append(id, rhs.id).append(quoteVolume, rhs.quoteVolume).append(additionalProperties, rhs.additionalProperties).append(baseVolume, rhs.baseVolume).append(isFrozen, rhs.isFrozen).append(lowestAsk, rhs.lowestAsk).append(low24hr, rhs.low24hr).isEquals();
    }

}
