@echo off
@set cur_folder=%cd%

cd /d d:\Documents\JAVA\L01\ConsoleProject5\

@echo compile...
rem javac -d bin src\by\epam\tr\main\Main.java src\by\epam\tr\util\Util.java

javac -d bin -sourcepath src src\by\epam\tr\main\Main.java 

cd bin

@echo create jar...
rem jar cfe bin\ca.jar by.epam.tr.main.Main *
jar cfe ca.jar by.epam.tr.main.Main by\epam\tr\*  

@echo run...
java -jar ca.jar

cd /d %cur_folder%