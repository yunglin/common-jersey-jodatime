## Jersey JodaTime Converter

This project enables the usage of jodatime instances as path and/or query parameters.

## Installation

To enable jodatime converters, you have to register ``JodaTimeParamConverterProvider`` with ``ResourceConfig``

```
  ResourceConfig ret = new ResourceConfig();
  ret.register(JodaTimeParamConverterProvider.class);
```

## License

Apache License 2.0
