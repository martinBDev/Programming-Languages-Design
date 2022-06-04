<!-- Table of contents -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
     <a href="#👷-built-with">Built With</a>
    </li>
    <li>
      <a href="#✍️-about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#🏎️-getting-started">Getting Started</a>
    </li>
    
  </ol>
</details>

## 👷 Built With

<p float="left">

<img src="https://user-images.githubusercontent.com/78870498/171994610-3ce67593-9939-4ad0-935b-c252f70ceb92.png" height="100">
<img src="https://user-images.githubusercontent.com/78870498/171994574-78afeebd-7ab3-49e7-826c-ee503811d63d.png" height="100">
<img src="https://user-images.githubusercontent.com/78870498/171994669-bd7b19f3-2597-430f-b3a8-943336a85ba0.png" height="100">
  
</p>

- [ANTLR](https://www.antlr.org/)
- [Java 17](https://www.java.com/)
- [MAPL](https://usermanual.wiki/Document/Manual20MAPL.712223551/html)

### ANTLR
ANTLR (ANother Tool for Language Recognition) is a powerful parser generator for reading, processing, executing, or translating structured text or binary files. 
It's widely used to build languages, tools, and frameworks. From a grammar, ANTLR generates a parser that can build and walk parse trees.

### JAVA
Language used to develop the compiler for my own programming language.

### MAPL 
Visual IDE for the MAPL virtual machine. Academic tool to asist in the implementation of programming languages. 
Implemented by Raul Izquierdo (raul@uniovi.es), professor at University of Ovieddo.


## ✍️ About The Project
During several weeks, as a project for the subject Programming Langage Designing, i developed this Python-like programming language. 
It allows the programmer to write statements, expressions, variable and function definitions, built-in and composite types.
In the following subsections, i will display different nodes accepted in the AST and an example of each one:

### Statements
- Assignment: a = 3;
- Print: print 'a';
- Input: input a;
- While: while (3>=2) { print a; }
- Return: return 5.6;
- If: if (5.6 >= a) : { input a; } else { print a} 

### Expressions
- Arithmetic: 4*6.7
- DoubleLiteral: .9
- FunctionInvocation: f(8, 9,  otherFunc() );
- IntLiteral: 3
- Variable: b
- UnaryMinus: -a
- Logical: && , ||
- ArrayAccess: a[8]
- Comparison: <= , < , == , > , >=
- UnaryNot: !true
- Cast: (int)5.6
- FieldAccess: struct.field

### Definitions
- VariableDefinition: a : int; (Currently i'm developing an extension to allow asignment of a variable when its defined: a : int = 3;)
- FunctionDefinition: def func(a:boolean) : int { ..... }

### Type
- Array
- Integer
- Double
- Char
- Struct
- FunctionType: every function is of type FunctionType, that inside contains the return type of the function and the parameters defined.
- Void
- ErrorType: type used mainly in Semantic Checking

## 🏎️ Getting Started
Import the project to your favourite IDE, choose one from the several examples programs i give in the /programs folder, or create one on your own.
Pass two arguments when executing the Main class: the input file route, followed by the file where you want to write the output MAPL machine code. 
If there are syntax or semantic errors, they will be reported in the console, and the low-level code will not be generated. 
All given programs are expected to run without any error.
