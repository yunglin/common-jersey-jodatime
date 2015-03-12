package tw.hyl.common.jersey.jodatime;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import javax.ws.rs.ext.ParamConverter;

public class LocalDateParamConverter implements ParamConverter<LocalDate> {

    final static DateTimeFormatter parser = ISODateTimeFormat.localDateOptionalTimeParser();

    final static DateTimeFormatter format = ISODateTimeFormat.dateTime();

    @Override
    public LocalDate fromString(String value) {
        return parser.parseLocalDate(value);
    }

    @Override
    public String toString(LocalDate value) {
        return format.print(value);
    }
}