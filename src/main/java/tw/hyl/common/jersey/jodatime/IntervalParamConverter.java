package tw.hyl.common.jersey.jodatime;

import org.joda.time.Interval;

import javax.ws.rs.ext.ParamConverter;

public class IntervalParamConverter implements ParamConverter<Interval> {
    @Override
    public Interval fromString(String value) {
        return new Interval(value);
    }

    @Override
    public String toString(Interval value) {
        return value.toString();
    }
}