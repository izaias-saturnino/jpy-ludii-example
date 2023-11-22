# jpy-ludii-example
A git repository with instructions and an example on how to use jpy with Ludii.

1. Get base files for jpy.

Clone the following repository:

https://github.com/jpy-consortium/jpy

Depending on your operating system, use the tutorial at the following link in the "Build for Linux" and "Build for Windows" sections to create the necessary files through building the source code:

https://jpy.readthedocs.io/en/latest/install.html

There may be errors in the build, but they usually have to do with the lack of dependencies, which can be resolved by installing them.

After doing this tutorial, these files should be obtained in the case of the Linux system:

jpy.jar, jpy.cpython-linux-gnu.so
jdl.cpython-linux-gnu.so

And these in the case of the Windows system:

jpy.jar, jpy.cpython-linux-gnu.pyd
jdl.cpython-linux-gnu.pyd

2. Get Ludii.jar from the following link:

https://ludii.games/download.php

3. Create a Java library with Jpy.jar and Ludii.jar. Use an IDE with Java with Ant to ease the next steps.

4. Create a Java project.

    4.1. Create a Java project with existing sources.

        A project with existing sources makes development easier.
    
        Clone the code from this tutorial:
    
        https://github.com/Ludeme/LudiiPythonAI
    
        Use this project as an existing source for the new project with existing sources. New Project -> Java with Ant -> New java project with existing sources

    4.2. Create a new project in Java.

        When following this option, the Java code for calling the Python code will have to be developed from scratch.
    
        Project example:
    
        https://github.com/Ludeme/LudiiPythonAI

5. Add the previously created library to the project.

6. Configure the jpy library with VM options on Linux.

In the Linux distribution used to create this tutorial, the following Java virtual machine options (VM options) were used for the execution of the final project.

-Djpy.jpyLib="/some/dir/jpy/build/lib.linux-cpython-311/jpy.cpython-linux-gnu.so" // jdl.cpython.so file built by jpy

-Djpy.jdlLib="/some/dir/jpy/build/lib.linux-cpython-311/jdl.cpython-linux-gnu.so" // jdl.cpython.so file built by jpy

-cp "/some/dir/jpy/build/lib.linux-3.11/jpy-0.14.0.jar" // Jpy.jar file built by jpy or downloaded from the jpy repository

-Djpy.pythonLib="/lib/libpython3.11.so" // location of python.so on your Linux operating system

The name and location of the files may possibly change depending on the operating system.

7. Configure the jpy library with VM options on Windows.

-Djpy.jpyLib="some/dir/jpy/build/lib.win-cpython-311/jpy.cp311-win.pyd" // jdl.cpython.pyd file built by jpy

-Djpy.jdlLib="some/dir/jpy/build/lib.win-cpython-311/jdl.cp311-win.pyd" // jdl.cpython.pyd file built by jpy

-cp "/some/dir/jpy/build/lib.win-cpython-3.11/jpy-0.14.0.jar" // Jpy.jar file built by jpy or downloaded from the jpy repository

8. Compile the java code and place the python module in the same directory as the generated jar file. In the example given with LudiiPythonAI, this refers to the ludii_python directory.

To work with an IDE and use a project, you must place the python code in the directory where the jar was executed, which may vary depending on the IDE.

A suggestion on how to begin development is reading the code of LudiiPythonAI.java and LauchLudii.java classes along with the python module to better understand how the LudiiPythonAI example works.
