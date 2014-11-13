package tw.hyl.common.jersey.jodatime;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Period;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

@Provider
public class JodaTimeParamConverterProvider implements ParamConverterProvider {

    @Override
    public ParamConverter getConverter(Class type, Type genericType, Annotation[] annotations) {
        if (type.equals(DateMidnight.class)) {
            return new DateMidnightParamConverter();
        } else if (type.equals(DateTime.class)) {
            return new DateTimeParamConverter();
        } else if (type.equals(Duration.class)) {
            return new DurationParamConverter();
        } else if (type.equals(Instant.class)) {
            return new InstantParamConverter();
        } else if (type.equals(Interval.class)) {
            return new IntervalParamConverter();
        } else if (type.equals(LocalDate.class)) {
            return new LocalDateParamConverter();
        } else if (type.equals(LocalDateTime.class)) {
            return new LocalDateTimeParamConverter();
        } else if (type.equals(LocalTime.class)) {
            return new LocalTimeParamConverter();
        } else if (type.equals(Period.class)) {
            return new PeriodParamConverter();
        } else {
            return null;
        }
    }


}