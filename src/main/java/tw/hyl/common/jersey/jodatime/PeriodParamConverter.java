package tw.hyl.common.jersey.jodatime;

import org.joda.time.Period;

import javax.ws.rs.ext.ParamConverter;

public class PeriodParamConverter implements ParamConverter<Period> {
    @Override
    public Period fromString(String value) {
        return new Period(value);
    }

    @Override
    public String toString(Period value) {
        return value.toString();
    }
}