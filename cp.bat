@echo off
@set cur_folder=%cd%

cd /d d:\Documents\JAVA\L01\ConsoleProject\

@echo compile...
javac -d bin src\by\epam\tr\main\ConsoleApp.java

@echo run...
java -cp bin by.epam.tr.main.ConsoleApp

cd /d %cur_folder%