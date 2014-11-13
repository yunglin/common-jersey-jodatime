package tw.hyl.common.jersey.jodatime;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

import javax.ws.rs.ext.ParamConverter;

class DateTimeParamConverter implements ParamConverter<DateTime> {
    @Override
    public DateTime fromString(String value) {
        try {
            return ISODateTimeFormat.dateTimeNoMillis().parseDateTime(value);
        } catch (IllegalArgumentException e) {
            return ISODateTimeFormat.dateTime().parseDateTime(value);
        }
    }

    @Override
    public String toString(DateTime value) {
        return value.toString();
    }
}