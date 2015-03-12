package tw.hyl.common.jersey.jodatime;

import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import javax.ws.rs.ext.ParamConverter;

public class LocalTimeParamConverter implements ParamConverter<LocalTime> {

    final static DateTimeFormatter parser = ISODateTimeFormat.localDateOptionalTimeParser();

    final static DateTimeFormatter format = ISODateTimeFormat.dateTime();

    @Override
    public LocalTime fromString(String value) {
        return parser.parseLocalTime(value);
    }

    @Override
    public String toString(LocalTime value) {
        return format.print(value);
    }
}