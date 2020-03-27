The script "s" automates the execution of the following tasks:

  1. Compile class TestValues [1] containing factory methods. These
  factory methods are used by Randoop to create input data that it
  could *not* produce by creating input sequences, i.e., invoking
  application methods. Look at directory additionalvalues.

  2. Generate tests with Randoop.

  3. Compile the tests Randoop generated.

  4. Compute coverage for those tests.

Proceed as follow to play with Randoop:

  1. Run script "s"

  2. Check coverage reports produced on the html directory. Open
  index.html in a browser.

  3. Choose a program location that was **not** covered.

  4. Monitor the execution of tests to understand/diagnose why your
  program location was not covered.

  5. Update TestValues [1] by creating new inputs to help Randoop
  "unblock".

  4. Update the file targets.txt as you go.

[1] See additionalvalues/gentests_recom/TestValues.java

Enjoy,
Marcelo