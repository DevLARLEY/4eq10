# 4eq10
Have you ever heard of the App 4=10? If you have, here is a solver if your get stuck but dont want to use a hint.

# Requirements
JDK 14.0.2 (Not working on JDK 11, 17)
Please note that when compiling the source file, the same Java version must be used to run the program.

# Compiling 

```sh
javac 4eq10.java
```

# Running

```sh
java FourEQten ABCD [+-*/X]
```

#### Required

A B C D: The Numbers

#### Optional

```sh
+ - * / X
```

Use the given symbols to set whether given operators should be excluded from the calculation.
X stands for brackets. If more than one is used, each one has to be seperated using "::".
