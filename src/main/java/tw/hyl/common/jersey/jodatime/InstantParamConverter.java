package tw.hyl.common.jersey.jodatime;

import org.joda.time.Instant;

import javax.ws.rs.ext.ParamConverter;

public class InstantParamConverter implements ParamConverter<Instant> {
    @Override
    public Instant fromString(String value) {
        return new Instant(value);
    }

    @Override
    public String toString(Instant value) {
        return value.toString();
    }
}