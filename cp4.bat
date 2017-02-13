@echo off
@set cur_folder=%cd%

cd /d d:\Documents\JAVA\L01\ConsoleProject4\

@echo compile...
rem javac -d bin -cp lib\util.jar -sourcepath src src\by\epam\tr\main\Main.java
javac -d bin -cp lib\util.jar src\by\epam\tr\main\Main.java

@echo run...
java -cp bin;lib\util.jar by.epam.tr.main.Main

cd /d %cur_folder%