package tw.hyl.common.jersey.jodatime;

import org.joda.time.Duration;

import javax.ws.rs.ext.ParamConverter;

public class DurationParamConverter implements ParamConverter<Duration> {
    @Override
    public Duration fromString(String value) {
        return new Duration(value);
    }

    @Override
    public String toString(Duration value) {
        return value.toString();
    }
}