# Salt Kata Series
# CSV Database

## Objective
In this lab, we will work with data manipulation. This is a handy skill to have when reading from and writing to CSV files.
You will take a string in a CSV format and parse it into an object structure. 

A string might look like this 
> "HeaderA,HeaderB,HeaderC\nrow1-valueA,row1-ValueB,row1-ValueC\nrow2-valueA,row2-ValueB,row2-ValueC".

Meaning it contains a _header_ row indicating what value it is, then a lot of data rows indicating the values for those rows, separated by  `\n` characters, indicatingn a new line.
Use the data in the header to figure out which property it maps to.

Finish the PlayerReader to make the tests pass.

Practice separating re-usable parts of the code into methods by refactoring.

 

#### TDD

Develop the code TDD style, i.e. follow the work flow **Red**, **Green**, **Refactor**.

---

Good luck and have fun!
