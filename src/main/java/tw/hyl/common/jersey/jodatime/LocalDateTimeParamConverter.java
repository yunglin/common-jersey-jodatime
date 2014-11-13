package tw.hyl.common.jersey.jodatime;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import javax.ws.rs.ext.ParamConverter;

class LocalDateTimeParamConverter implements ParamConverter<LocalDateTime> {

    final static DateTimeFormatter parser = ISODateTimeFormat.localDateOptionalTimeParser();

    final static DateTimeFormatter format = ISODateTimeFormat.dateTime();

    @Override
    public LocalDateTime fromString(String value) {
        return parser.parseLocalDateTime(value);
    }

    @Override
    public String toString(LocalDateTime value) {
        return format.print(value);
    }
}