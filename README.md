# Java Conditional Logic and Decision Making

**Author:** Daniel Chung  
**Course:** CSCI 125 – Programming I  
**Section:** M01  
**Institution:** New York Institute of Technology  
**Language:** Java

## Overview

This collection contains five standalone Java programs developed for introductory programming coursework. Each program uses user input and conditional statements to make decisions and display a result.

The exercises explore number classification, age-based checks, floating-point comparison, letter grades, and character classification.

## Programs

| File | Program | Description |
|------|---------|-------------|
| `DanielChung_Prob1.java` | Number Classification | Determines whether an integer is positive, negative, or zero. |
| `DanielChung_Prob2.java` | Voting Age Check | Checks an entered age against an age threshold of 18 and rejects negative ages. |
| `DanielChung_Prob3.java` | Number Comparison | Compares two double values and reports which is greater or whether they are equal. |
| `DanielChung_Prob4.java` | Grade Classification | Converts an integer score into a letter-grade category. |
| `DanielChung_Prob5.java` | Character Classification | Identifies lowercase vowels, provides a special message for y and w, and otherwise reports a consonant. |

## Concepts Practiced

- Console input using `java.util.Scanner`
- Integer, double, and character data types
- `if`, `else if`, and `else` statements
- Comparison operators
- Logical AND (`&&`) and OR (`||`)
- Character comparisons
- String concatenation and console output

## Program Details

### 1. Number Classification

Reads an integer and checks its relationship to zero:

- Greater than zero: positive
- Less than zero: negative
- Equal to zero: zero

### 2. Voting Age Check

Uses the following age categories:

- Ages 0–17: below the program’s voting-age threshold
- Ages 18 and above: meets the program’s age threshold
- Negative ages: invalid input

This is an age-checking exercise, not a complete voting-eligibility determination. Its messages reference the 2024 U.S. election.

### 3. Number Comparison

Accepts two double values and determines whether:

- The first number is greater.
- The second number is greater.
- Both values compare as equal.

The program uses direct comparisons without a tolerance for small floating-point differences.

### 4. Grade Classification

Uses the following classification rules:

| Entered Score | Program Result |
|---------------|----------------|
| 90–100 | A |
| 80–89 | B |
| 70–79 | C |
| 60–69 | D |
| Below 60 | F |
| Above 100 | Special message awarding A |

Negative scores currently fall into the F category rather than being rejected.

### 5. Character Classification

Reads the first character of the entered text:

- `a`, `e`, `i`, `o`, and `u`: vowel
- `y` and `w`: special explanatory message
- All other characters: consonant

The program expects lowercase English letters. The special y/w branch displays a fixed message; it does not analyze words or pronunciation.

## How to Run

### Requirements

Install a Java Development Kit (JDK) with `javac` and `java` available in your terminal. No external libraries are required.

### Compile

Place the five files in one folder, open a terminal in that folder, and run:

```sh
javac DanielChung_Prob1.java DanielChung_Prob2.java DanielChung_Prob3.java DanielChung_Prob4.java DanielChung_Prob5.java
```

### Run

Each program has its own `main()` method and runs independently. Use the command for the program you want:

```sh
java DanielChung_Prob1
```

```sh
java DanielChung_Prob2
```

```sh
java DanielChung_Prob3
```

```sh
java DanielChung_Prob4
```

```sh
java DanielChung_Prob5
```

Follow the prompts to enter the required values.

## Example Results

The following table summarizes the program behavior rather than reproducing the exact console messages.

| Program | Example Input | Result |
|---------|---------------|--------|
| Number Classification | `-8` | Negative |
| Voting Age Check | `16` | Below the age threshold |
| Number Comparison | `4.5`, `7.2` | Second number is greater |
| Grade Classification | `85` | B |
| Character Classification | `a` | Vowel |

## Current Limitations

- Incorrect input types are not handled with exception handling.
- Programs do not repeatedly prompt users after invalid input.
- The grade program does not enforce a strict 0–100 range.
- The character program does not validate whether input is a letter.
- Uppercase vowels are not recognized as vowels.
- Only the first character of a text entry is checked.

## Learning Objective

Practice translating decision rules into Java conditional statements while working with different input types and clear console output.
