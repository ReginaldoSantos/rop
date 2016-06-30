# This Is a Fork of Rop

(Under Construction)

This is a Fork of Rop lib aiming to include discoverable or pluggable '@Command' implementations, so sub commands could be added on the fly just being available in the classpath.

Check original project (here)[https://github.com/ryenus/rop]

## Initial IDEA

Do something similar to spring-shell using component scan to load the commands.

Supose a call to:

```
$ git add .
```

Main class would initially parse the first command to be able of identifying the main command (@Command with name="git" level 1) and build an OptionParser with command plus its children (@Command with parent="git" level 2 or shall I go for @SubCommand?).
Well, once it first parse is done, the rest will be same.