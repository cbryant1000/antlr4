# antlr4
Antlr v4 project - Investigate parsing Python data structures using the Antlr v4 tool.

Antlr Documentation Page: [https://theantlrguy.atlassian.net/wiki/display/ANTLR4/ANTLR+4+Documentation](https://theantlrguy.atlassian.net/wiki/display/ANTLR4/ANTLR+4+Documentation)  

### A First Example

#### In a temporary directory, put the following grammar inside file Hello.g4:

Hello.g4  
// Define a grammar called Hello  
grammar Hello;  
r  : 'hello' ID ;         // match keyword hello followed by an identifier  
ID : [a-z]+ ;             // match lower-case identifiers  
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines  

#### Then run ANTLR the tool on it:
$ cd /tmp  
$ antlr4 Hello.g4  
$ javac Hello*.java  

#### Now test it:
$ grun Hello r -tree  
hello parrt  
^D  
(r hello parrt)  

(That ^D means EOF on unix; it's ^Z in Windows.) The -tree option prints the parse tree in LISP notation.  

#### It's nicer to look at parse trees visually.

$ grun Hello r -gui  
hello parrt  
^D  

That pops up a dialog box showing that rule r matched keyword hello followed by identifier parrt.  
![](./hello-parrt.png)