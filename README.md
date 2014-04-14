COSC485_Project1_
==========================
Description: DFA/NFA
Name: Jon
Revision date: 4/13/2014


Limitations: In order to run as intended this program only accepts 

DFA/NFA and Strins text file using the same template as the examples 

given. Avoid using characters besides letters or numbers as your 

variables. 



Description: This program is designed to read a text file containing 

either a DFA/NFA input,Strings input, and the location of an output 

file. These locations will be entered using command line arguments 

being; DFA/NFA=args[0], Strings=args[1], and Answers=args[2]. The 

program will then create the states and there associated connections. In 

the case of NFA, these states will be converted to DFA in order to make 

proper string comparissions. Then the strings will run through a 

validation check to see if they are accepter by the DFA/NFA. If they are 

not excepted the string will have "is rejected" added to it, and if they 

are accepted the string will have "is accepted" added to it. Final the 

program will create an Aswers.txt file containing the output strings; if 

the file alread exists, it will be deleted and replaced with the new 

file. 
