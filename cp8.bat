@echo off
@set cur_folder=%cd%

chcp 65001

cd /d d:\Documents\JAVA\L01\ConsoleProject8\

@echo compile...

javac -d bin -sourcepath src src\by\rdcentre\javatr\main\Inspector.java

@echo run...
java -cp bin by.rdcentre.javatr.main.Inspector

cd /d %cur_folder%