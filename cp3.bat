@echo off
@set cur_folder=%cd%

cd /d d:\Documents\JAVA\L01\ConsoleProject3\

@echo compile...
javac -d bin src\by\epam\tr\util\Util.java

cd bin

@echo create jar...
jar cf util.jar by\epam\tr\util\Util.class

cd /d %cur_folder%