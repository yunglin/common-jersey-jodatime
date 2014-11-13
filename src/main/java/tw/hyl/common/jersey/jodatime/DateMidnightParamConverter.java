package tw.hyl.common.jersey.jodatime;

import org.joda.time.DateMidnight;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import javax.ws.rs.ext.ParamConverter;

class DateMidnightParamConverter implements ParamConverter<DateMidnight> {

    final static DateTimeFormatter parser = ISODateTimeFormat.localDateParser();

    final static DateTimeFormatter format = ISODateTimeFormat.date();


    @Override
    public DateMidnight fromString(String value) {
            return parser.parseLocalDate(value).toDateMidnight();
    }

    @Override
    public String toString(DateMidnight value) {
        return format.print(value);
    }
}