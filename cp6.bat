@echo off
@set cur_folder=%cd%

chcp 65001

cd /d d:\Documents\JAVA\L01\ConsoleProject6\

@echo compile...
rem javac -d bin src\by\epam\tr\main\Main.java src\by\epam\tr\util\Util.java
javac -d bin -sourcepath src src\by\epam\tr\main\Main.java 

@echo run...
java -cp bin by.epam.tr.main.Main

cd /d %cur_folder%