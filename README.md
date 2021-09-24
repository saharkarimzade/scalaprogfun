First you should have sbt and jvm 11
(You should change setting in Environment variable).
Also, You can download and run "coursier"


This project is based on scala 13 a
nd java 11
## sbt project compiled with Scala 3

### Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).


### Why do I change the structure?
I Created the project with sbt(Open Intellij=>select scala=>select sbt)
I Started working on scala in a ScalaWorkSheet as u see before... But It can't provide the Debugging situation and I see some strange bugs...It was not easy to creat classes in it... 
I Decided to change the structure...I had 2 choices:
1-Open Intellij=>select scala=>Select LightBendProjectstarter
2-Using seed template for scala: u can search this statement in google
 something like getter8 technology based on GitHub provide some templates for developers... the templates are so different...
I use this command in cmd in my folder:
`sbt new scala/scala3-seed.g8`
it is like cloning a git repository

(if in that command u remove 3 you can have a simple project of scala 2)

then I replaced everything in myProject except bsp(it is depended on compiler) and build.sbt(it is something like pom file of maven) and gitignore
