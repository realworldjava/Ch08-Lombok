# Chapter 8: Annotation Driven Code with Project Lombok

This repository contains the code from the book for Chapter 8, Annotation Driven Code with Project Lombok. See the [main book page](https://github.com/realworldjava) for the list of all chapter specific repositories.

# How this repository is organized

In this repository, all code is in the main branch. There are six folders: 
| Folder Name  | Contents |
| ------------- | ------------- |
|MavenExample| Full example from chapter|
|GradleGroovyExample|Subset of the code using Gradle instead of Maven|
|GradleKotlinExample|Subset of the code using Gradle instead of Maven|
|EclipseWithoutBuildTool|Importable Eclipse project with subset of code|
|IntelliJWithoutBuildTool|Importable IntelliJ project with subset of code|
|VsCodeWithoutBuildTool|Importable VsCode project with subset of code|

# How to use the examples in this chapter

Before trying any of the examples in this folder, please read the section about installing Lombok for your IDE.

Since we are programmers and subscribe to DRY (don't repeat yourself), only the MavenExample folder has all the code form the book. If you want to try the examples without Maven, please copy the "src" folder from MavenExample to any of Groovy/Eclipse/IntelliJ/VsCode samples.

Additionally, you'll notice that a lot of the examples in this chapter use the same class names as they build on each other and show various option for expressing code with Lombok. We've numbered the packages in the same order as the example appear in the book if you want to follow along.

# Maven

At the command line:
1. cd MavenExample
1. Run: mvn clean verify

Or import the folder into your IDE as a Maven project

# Gradle

At the command line:
1. cd GradleGroovyExample (or GradleKotlinExample)
1. Run: ./gradlew build

Or import the folder into your IDE as a Maven project

# IntelliJ without a build tool

1. Open the IntelliJWithoutBuildTool directory in IntelliJ
1. Choose File > Project Structure > Libraries > + > Java and
1. Choose where you downloaded lombok.jar. 
1. Click ok.

# Eclipse without a build tool

1. Import the EclipseWithoutBuildTool in Eclipse
1. Right click the project
1. Choose properties > Java Build Path > Libraries > add Jar 
1. Choose where you downloaded lombok.jar.

# VS Code without a build tool

1. Open the VsCodeWithoutBuildTool in VS Code
1. Note that the lombok.jar is automatically picked up since it is in a lib directory
1. The first time you use Lombok, you will get a prompt in the bottom right to enable it

# Clickable Links from the Further References Section

* [The complete guide to Lombok installation, features, and community](https://projectlombok.org)
