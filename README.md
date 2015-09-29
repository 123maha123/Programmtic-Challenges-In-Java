1. Big Decimal
---------------

Problem Statement :
Java BigDecimal class can handle arbitrary-precision signed decimal numbers. Lets test your knowledge on them!
You are given n real numbers, sort them in descending order! Read data from System.in.
Note: To make the problem easier, we provided you the input/output part in the editor. Print the numbers as they appeared in the input, don't change anything. If two numbers represent numerically equivalent values, the output must list them in original order of the input.

Input Format :
The first line will consist an integer n, each of the next n lines will contain a real number. n will be at most 200. The numbers can have at most 300 digits!

Output Format :
Print the numbers in descending orders, one number in each line.

Sample Input :
9
-100
50
0
56.6
90
0.12
.12
02.34
000.000

Sample Output :
90
56.6
50
02.34
0.12
.12
0
000.000
-100


2. BigInteger
--------------

Problem Statement :
In this problem you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like long integer.
Use the power of Java's BigInteger class and solve this problem.

Input Format :
There will be two lines containing two numbers, a and b. The numbers are non-negative and can have maximum 200 digits.

Output Format :
Output two lines. The first line should contain a+b, and the second line should contain a×b. Don't print any leading zeros.

Sample Input :
1234
20

Sample Output :
1254
24680

Explanation :
1234+20=1254
1234*20=24680

3. Anagrams
------------
Problem Statement :
Two strings A and B are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of CAT are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA.
Given two strings, print "Anagrams" if they are anagrams, print "Not Anagrams" if they are not. The strings may consist at most 50 english characters, the comparision should NOT be case sensitive.
This exercise will verify that you are able to sort the characters of a string, or compare frequencies of characters.

Sample Input 1 : 
anagram
margana

Sample Output 1 :
Anagrams

Sample Input 2 :
anagramm
marganaa

Sample Output 2:
Not Anagrams

4. Palindrome
--------------
Problem Statement :
Given a string A, print "Yes" if it is a palindrome, print "No" otherwise. The strings will consist lower case english letters only. The strings will have at most 50 characters.
Some examples of palindromes are "madam", "anna", "reviver".

Sample Input :
madam 

Sample Output :
Yes

5. StringToken
--------------
Problem Statement :
Given a string, find number of words in that string. For this problem a word is defined by a string of one or more english alphabets.
There are multiple ways to tokenize a string in java, learn how to tokenize a string in java and demonstrate your skill by solving this problem!

Input Format :
A string not more than 400000 characters long. The string can be defined by following regular expression: [A-Za-z !,?.\_'@]+
That means the string will only contain english alphabets, blank spaces and this characters: "!,?._'@".

Output Format :
In the first line, print number of words n in the string. The words don't need to be unique. In the next n lines, print all the words you found in the order they appeared in the input.

Sample Input :
He is a very very good boy, isn't he?

Sample Output :
10
He
is
a
very
very
good
boy
isn
t
he