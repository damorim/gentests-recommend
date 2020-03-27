This file provides instructions on how to ***interactively*** use
Randoop to create inputs.

Environment configuration:
------------------------------------------------------------------
 1. Download the following files and store in a common directory

   http://www.evosuite.org/files/SF110-20130704.zip
   http://www.evosuite.org/files/SF110-20130704-src.zip

 2. Extract those files in that directory

 3. Update variable SF110_DIR on bash script ./config to point to that
    directory
------------------------------------------------------------------    

The directory 1_tullibee on this repository stores scripts to run
Randoop on the the program with the same name (from the SF110
benchmark). Please, cd to that directory. Before you proceed with the
execution of Randoop, you need to know that the script "s" automates
the execution of the following tasks:

The script s...

  1. Compiles class TestValues [1] containing factory methods. These
  factory methods are used by Randoop to create input data that it
  could *not* produce by creating input sequences, i.e., invoking
  application methods. Look at directory additionalvalues.

  2. Generates tests with Randoop.

  3. Compiles the tests Randoop generated.

  4. Computes coverage for those tests.


Follow the instructions below to run Randoop on that project.


Instrucions (to use Randoop interactively):
------------------------------------------------------------------
  1. Run script "s"

  2. Check coverage reports produced on the html directory. Open
  index.html in a browser.

  3. Choose a program location that was **not** covered.

  4. Monitor the execution of tests to understand/diagnose why your
  program location was not covered.

  5. Update TestValues [1] by creating new inputs to help Randoop
  "unblock".

  4. Update the file targets.txt as you go.
------------------------------------------------------------------

[1] See additionalvalues/gentests_recom/TestValues.java

Enjoy,
Marcelo