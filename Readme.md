
Repro for the issue:
https://github.com/oracle/graal/issues/2826

Run:
```
sbt run
```

with Graal 20.1.0.r11-grl you get the expected result.
with Graal 20.2.0.r11-grl:
```
info] running (fork) Main 
[error] WARNING: Error processing trace entry: java.lang.IndexOutOfBoundsException: start 2, end 1, length 2: {caller_class=com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory, result=true, args=[[Z], function=newInstance, tracer=reflect, class=java.lang.reflect.Array}
[error] WARNING: Error processing trace entry: java.lang.IndexOutOfBoundsException: start 2, end 1, length 2: {caller_class=com.sun.jmx.mbeanserver.MXBeanMapping, result=true, args=[[Z], function=forName, tracer=reflect, class=java.lang.Class}
[error] WARNING: Error processing trace entry: java.lang.IndexOutOfBoundsException: start 2, end 1, length 2: {caller_class=com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory, result=true, args=[[B], function=newInstance, tracer=reflect, class=java.lang.reflect.Array}
[error] WARNING: Error processing trace entry: java.lang.IndexOutOfBoundsException: start 2, end 1, length 2: {caller_class=com.sun.jmx.mbeanserver.MXBeanMapping, result=true, args=[[B], function=forName, tracer=reflect, class=java.lang.Class}
[error] WARNING: Error processing trace entry: java.lang.IndexOutOfBoundsException: start 2, end 1, length 2: {caller_class=com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory, result=true, args=[[C], function=newInstance, tracer=reflect, class=java.lang.reflect.Array}
[error] WARNING: Error processing trace entry: java.lang.IndexOutOfBoundsException: start 2, end 1, length 2: {caller_class=com.sun.jmx.mbeanserver.MXBeanMapping, result=true, args=[[C], function=forName, tracer=reflect, class=java.lang.Class}
[error] WARNING: Error processing trace entry: java.lang.IndexOutOfBoundsException: start 2, end 1, length 2: {caller_class=com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory, result=true, args=[[D], function=newInstance, tracer=reflect, class=java.lang.reflect.Array}
[error] WARNING: Error processing trace entry: java.lang.IndexOutOfBoundsException: start 2, end 1, length 2: {caller_class=com.sun.jmx.mbeanserver.MXBeanMapping, result=true, args=[[D], function=forName, tracer=reflect, class=java.lang.Class}
[error] WARNING: Error processing trace entry: java.lang.IndexOutOfBoundsException: start 2, end 1, length 2: {caller_class=com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory, result=true, args=[[F], function=newInstance, tracer=reflect, class=java.lang.reflect.Array}
[error] WARNING: Error processing trace entry: java.lang.IndexOutOfBoundsException: start 2, end 1, length 2: {caller_class=com.sun.jmx.mbeanserver.MXBeanMapping, result=true, args=[[F], function=forName, tracer=reflect, class=java.lang.Class}
[error] WARNING: Error processing trace entry: java.lang.IndexOutOfBoundsException: start 2, end 1, length 2: {caller_class=com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory, result=true, args=[[I], function=newInstance, tracer=reflect, class=java.lang.reflect.Array}
[error] WARNING: Error processing trace entry: java.lang.IndexOutOfBoundsException: start 2, end 1, length 2: {caller_class=com.sun.jmx.mbeanserver.MXBeanMapping, result=true, args=[[I], function=forName, tracer=reflect, class=java.lang.Class}
[error] WARNING: Error processing trace entry: java.lang.IndexOutOfBoundsException: start 2, end 1, length 2: {caller_class=com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory, result=true, args=[[J], function=newInstance, tracer=reflect, class=java.lang.reflect.Array}
[error] WARNING: Error processing trace entry: java.lang.IndexOutOfBoundsException: start 2, end 1, length 2: {caller_class=com.sun.jmx.mbeanserver.MXBeanMapping, result=true, args=[[J], function=forName, tracer=reflect, class=java.lang.Class}
[error] WARNING: Error processing trace entry: java.lang.IndexOutOfBoundsException: start 2, end 1, length 2: {caller_class=com.sun.jmx.mbeanserver.DefaultMXBeanMappingFactory, result=true, args=[[S], function=newInstance, tracer=reflect, class=java.lang.reflect.Array}
[error] WARNING: Error processing trace entry: java.lang.IndexOutOfBoundsException: start 2, end 1, length 2: {caller_class=com.sun.jmx.mbeanserver.MXBeanMapping, result=true, args=[[S], function=forName, tracer=reflect, class=java.lang.Class}
[error] 2020-10-21 16:29:58.395+0100 error [foo] bar  - (Main.scala:7)
[success] Total time: 1 s, completed Oct 21, 2020, 4:29:58 PM
```

This is preventing to have the correct logging runtime behavior of the `native-image`.
