# Homework 1:

### Problem 1:

- This function is supposed to create a list of all the duplicated entries in a list of text.
- For the solution, I created 2 hash tables. One to contain a list of unique entries, which i used (during the loop) to do a check. if the check detected a duplicate then it'd slide create a new key-value pair within the second map.
- ![](https://github.com/KAwuah93/Week1Daily2/blob/master/assets/images/prob1.PNG?raw=true)

### Problem 2:

- The purpose of this exercise is to be able to check for a palindrome with the given 2 perimeters.
- For this problem, I used a relatively simple solution to allow for a 1 pass check. I'd take I (standard iterative variable) and i'd check both the index in the cycle as well as the mirrored position across the length of the word.
- ![](https://raw.githubusercontent.com/KAwuah93/Week1Daily2/master/assets/images/prob2.PNG)

### Problem 3:

- Standard Fizz buzz problem. If the number passed is divisible by 3, return fizz. If it is divisible by 5 return buzz. And if it is divisiible by both return fizzbuzz.
- For this i just started the solution with an empty string. If it is divisible by 3, I concatenate fizz. Similar check for 5 and then concatenate buzz. if it passed both the checks it gets "fizz" + "buzz"
- ![](https://raw.githubusercontent.com/KAwuah93/Week1Daily2/master/assets/images/prob3.PNG)

### Problem 4:

- In this situation, we would check if 2 passed strings are anagrams of one another.
- Here I first checked the length of the words to see if i can get a quick failure condition. After that point: I broke the strings into character Arrays and then ordered them. The failure condition was if the strings at any index (of the ordered char array) didn't match the other one.
- ![](https://raw.githubusercontent.com/KAwuah93/Week1Daily2/master/assets/images/prob4.PNG)

### Problem 5:

- Printing out a multiplication table with a nested array.
- The solution to this problem came the most natural for me. It was a simple nested loop with the length set at default for '10' but I created another verson that would allow a custom perimeter.
- ![](https://raw.githubusercontent.com/KAwuah93/Week1Daily2/master/assets/images/prob5.PNG)
