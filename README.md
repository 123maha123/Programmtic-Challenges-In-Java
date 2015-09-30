Problem Descriptions
---------------------

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

6. Java 1D Arrays
-----------------
Problem Statement :
Array is a very simple data structure which is used to store a collection of data, for example roll number of all the students in a class or name of all the countries in the world. To create an array of integer that can hold 10 values, you can write code like this:
int[] myList = new int[10];
This problem will test your knowledge on java array. 
You are given an array of n integers. A sub-array is "Negative" if sum of all the integers in that sub-array is negative. Count the number of "Negative sub-arrays" in the input array.

Note: Subarrays are contiguous chunks of the main array. For example if the array is {1,2,3,5} then some of the subarrays are {1}, {1,2,3}, {2,3,5}, {1,2,3,5} etc. But {1,2,5} is not an subarray as it is not contiguous.

Input Format :
The first line consists an integer n. The next line will contain n space seperated integers. Value of n will be at most 100. The numbers in the array will range between -10000 to 10000.

Output Format :
Print the answer to the problem.

Sample Input :
5
1 -2 4 -5 1

Sample Output :
9

Explanation :
These are the ranges of the 9 negative subarrays in this sample:
[0:1]
[0:3]
[0:4]
[1:1]
[1:3]
[1:4]
[2:3]
[3:3]
[3:4]
Assume that the index is 0 based.

7. Extra Long Factorial
------------------------
Problem Statement :
You are given an integer N. Print the factorial of this number.
N!=N×(N−1)×(N−2)×⋯×3×2×1
Note: Factorials of N>20 can't be stored even in a 64−bit long long variable. Big integers must be used for such calculations. Languages like Java, Python, Ruby etc. can handle big integers but we need to write additional code in C/C++ to handle such large values.

Input Format :
Input consists of a single integer N.

Constraints :
1≤N≤100

Output Format : 
Output the factorial of N.

Sample Input :
25

Sample Output :
15511210043330985984000000

8. Diagonal Difference
-----------------------
Problem Statement :
You are given a square matrix of size N×N. Calculate the absolute difference of the sums across the two main diagonals.

Input Format :
The first line contains a single integer N. The next N lines contain N integers (each) describing the matrix.

Constraints :
1≤N≤100 
−100≤A[i]≤100

Output Format :
Output a single integer equal to the absolute difference in the sums across the diagonals.

Sample Input :
3
11 2 4
4 5 6
10 8 -12

Sample Output :
15

Explanation :
The first diagonal of the matrix is:

    11
        5
            -12

Sum across the first diagonal = 11+5-12= 4

The second diagonal of the matrix is:

            4
        5
    10

Sum across the second diagonal = 4+5+10 = 19 
Difference: |4-19| =15